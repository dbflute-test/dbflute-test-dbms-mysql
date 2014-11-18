package org.docksidestage.mysql.dbflute.thematic;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.helper.HandyDate;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballFinalizer;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.dbflute.exentity.customize.SimpleMember;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/20 Saturday)
 */
public class ThreadSafeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    @Override
    protected boolean isSuppressTestCaseTransaction() {
        return true;
    }

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_ThreadSafe_ConditionBean_entity_sameExecution() {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                // ## Arrange ##
                MemberCB cb = new MemberCB();
                cb.setupSelect_MemberStatus();
                cb.query().setMemberId_Equal(1);

                // ## Act ##
                Member member = memberBhv.selectEntity(cb).get();

                // ## Assert ##
                assertEquals(1, member.getMemberId());
                car.goal(member);
            }
        }, new CannonballOption().expectSameResult());
    }

    public void test_ThreadSafe_ConditionBean_list_sameExecution() {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                // ## Arrange ##
                MemberCB cb = new MemberCB();
                cb.setupSelect_MemberStatus();
                cb.query().setMemberName_LikeSearch("S", op -> op.likePrefix());
                cb.query().addOrderBy_Birthdate_Desc().addOrderBy_MemberId_Asc();

                // ## Act ##
                ListResultBean<Member> memberList = memberBhv.selectList(cb);

                // ## Assert ##
                assertHasAnyElement(memberList);
                for (Member member : memberList) {
                    assertTrue(member.getMemberName().startsWith("S"));
                }
                car.goal(memberList);
            }
        }, new CannonballOption().expectSameResult());
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    public void test_ThreadSafe_OutsideSql_sameExecution() {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                // ## Arrange ##
                String path = MemberBhv.PATH_selectSimpleMember;

                SimpleMemberPmb pmb = new SimpleMemberPmb();
                pmb.setMemberName_PrefixSearch("S");

                Class<SimpleMember> entityType = SimpleMember.class;

                // ## Act ##
                List<SimpleMember> memberList = memberBhv.outsideSql().traditionalStyle().selectList(path, pmb, entityType);

                // ## Assert ##
                assertNotSame(0, memberList.size());
                log("{SimpleMember}");
                for (SimpleMember entity : memberList) {
                    Integer memberId = entity.getMemberId();
                    String memberName = entity.getMemberName();
                    String memberStatusName = entity.getMemberStatusName();
                    log("    " + memberId + ", " + memberName + ", " + memberStatusName);
                    assertNotNull(memberId);
                    assertNotNull(memberName);
                    assertNotNull(memberStatusName);
                    assertTrue(memberName.startsWith("S"));
                }
                car.goal(memberList);
            }
        }, new CannonballOption().expectSameResult());
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_ThreadSafe_insert_sameExecution() {
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        final Set<Integer> insertedIdSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Member member = new Member();
                member.setMemberName("name" + entryNumber);
                member.setMemberAccount("account" + entryNumber);
                member.setMemberStatusCode_Formalized();
                memberBhv.insert(member);
                markSet.add("success: " + entryNumber);
                insertedIdSet.add(member.getMemberId());
            }
        }, new CannonballOption().commitTx().expectSameResult().finalizer(new CannonballFinalizer() {
            public void run() {
                if (!insertedIdSet.isEmpty()) {
                    MemberCB cb = new MemberCB();
                    cb.query().setMemberId_InScope(insertedIdSet);
                    memberBhv.queryDelete(cb);
                }
            }
        }));
        log(markSet);
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_ThreadSafe_update_before_insert_sameExecution_alreadyUpdated() {
        final int memberId = 3;
        final Member before = memberBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(memberId));
        final Long versionNo = before.getVersionNo();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                final int entryNumber = car.getEntryNumber();
                for (int i = 0; i < 30; i++) {
                    Purchase purchase = new Purchase();
                    purchase.setMemberId(memberId);
                    purchase.setProductId((int) (entryNumber % 10) + 1);
                    long currentMillis = currentTimestamp().getTime();
                    long keyMillis = currentMillis - (entryNumber * 10000) - (i * 10000);
                    HandyDate handyDate = new HandyDate(new Timestamp(keyMillis));
                    purchase.setPurchaseDatetime(handyDate.addDay(entryNumber).getLocalDateTime());
                    purchase.setPurchaseCount(1234 + i);
                    purchase.setPurchasePrice(1234 + i);
                    purchase.setPaymentCompleteFlg_True();
                    purchaseBhv.insert(purchase);
                }
                markHere("success");
            }
        }, new CannonballOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        assertMarked("success");
    }

    public void test_ThreadSafe_update_after_insert_sameExecution_mayBeDeadlock() {
        final Purchase source = purchaseBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(1L));
        source.setPurchaseId(null);
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Purchase purchase = source.clone();
                purchase.setMemberId(entryNumber % 2 == 1 ? 3 : 4);
                purchase.setProductId(entryNumber % 3 == 1 ? 3 : (entryNumber % 3 == 2 ? 4 : 5));
                long keyMillis = currentTimestamp().getTime() - (entryNumber * 1000);
                purchase.setPurchaseDatetime(toLocalDateTime(new Timestamp(keyMillis)));
                purchaseBhv.insert(purchase);

                // deadlock if update is executed after insert including updateNonstrict()
                // ShareLock and ExclusiveLock are points
                Member member = new Member();
                member.setMemberId(3);
                memberBhv.updateNonstrict(member);
                markHere("success");
            }
        }, new CannonballOption().commitTx().expectExceptionAny("Deadlock found"));
        assertMarked("success");
    }
}
