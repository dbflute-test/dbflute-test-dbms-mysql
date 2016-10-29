package org.docksidestage.mysql.dbflute.vendor;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.helper.HandyDate;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballDragon;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballProjectA;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.utflute.core.transaction.TransactionResource;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchasePaymentBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberLogin;
import org.docksidestage.mysql.dbflute.exentity.MemberStatus;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.dbflute.exentity.PurchasePayment;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5B (2014/02/18 Tuesday)
 */
public class VendorLockInsertTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private MemberLoginBhv memberLoginBhv;
    private PurchaseBhv purchaseBhv;
    private PurchasePaymentBhv purchasePaymentBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isSuppressTestCaseTransaction() {
        return true;
    }

    // ===================================================================================
    //                                                                  UniqueKey DeadLock
    //                                                                  ==================
    public void test_insert_UniqueKeyDeadlock_basic() throws Exception {
        final LocalDateTime purchaseDatetime = new HandyDate(currentLocalDate()).moveToDayJust().getLocalDateTime();
        String expected = "Deadlock found"; // why?
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Purchase purchase = purchaseBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(3L));
                purchase.setMemberId(1);
                purchase.setProductId(1);
                purchase.setPurchaseDatetime(purchaseDatetime);
                purchaseBhv.insert(purchase);
            }
        }, new CannonballOption().threadCount(3).repeatCount(5).expectExceptionAny(expected));

        /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        Failed to execute the SQL for insert.

        [Advice]
        Read the SQLException message.

        [SQLState]
        40001

        [ErrorCode]
        1213

        [SQLException]
        org.seasar.framework.exception.SSQLException
        [ESSR0072]SQL...(SQL=[insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
         values (?, ?, ?, ?, (? + 13), ?, ?, ?, ?, ?, ?)], Message=[1213], ErrorCode=40001, SQLState={3})...

        [NextException]
        com.mysql.jdbc.exceptions.jdbc4.MySQLTransactionRollbackException
        Deadlock found when trying to get lock; try restarting transaction

        [Behavior]
        PurchaseBhv.insert()

        [Display SQL]
        insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
         values (9, 9, '2014-02-18 16:57:52.032', 1, (1787 + 13), 1, '2014-02-18 16:57:51.999', 'pool-44-thread-15', '2014-02-18 16:57:51.999', 'pool-44-thread-15', 0)
        * * * * * * * * * */
    }

    // ===================================================================================
    //                                                                      UniqueKey Wait
    //                                                                      ==============
    public void test_insert_UniqueKeyWait_basic() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberName("lock1");
                        member.setMemberAccount("foo");
                        member.setMemberStatusCode_Formalized();
                        memberBhv.insert(member);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.releaseIfOvertime(500);
                        dragon.expectOvertime(); // insert waits for index lock
                        Member member = new Member();
                        member.setMemberName("lock2");
                        member.setMemberAccount("foo");
                        member.setMemberStatusCode_Formalized();
                        memberBhv.insert(member);
                    }
                }, 2);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.releaseIfOvertime(500);
                        dragon.expectOvertime();
                        Member member = new Member();
                        member.setMemberName("lock3");
                        member.setMemberAccount("foo");
                        member.setMemberStatusCode_Formalized();
                        memberBhv.insert(member);
                    }
                }, 3);
            }
        }, new CannonballOption().threadCount(3).expectExceptionAny("Deadlock found"));
    }

    // ===================================================================================
    //                                                                     ForeignKey Wait
    //                                                                     ===============
    public void test_insert_ForeignKeyWait_basic() throws Exception {
        final int memberId = 7;
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberId(memberId);
                        member.setMemberName("lock1");
                        memberBhv.updateNonstrict(member);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectOvertime(); // insert waits for update lock
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    public void test_insert_ForeignKeyWait_moreForeign() throws Exception {
        final int memberId = 7;
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(memberId);
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);
        final String statusCode = member.getMemberStatusCode();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        MemberStatus status = new MemberStatus();
                        status.setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.codeOf(statusCode));
                        status.setDisplayOrder(99999);
                        memberStatusBhv.update(status);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectNormallyDone(); // no wait for parent of parent
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    public void test_insert_ForeignKeyWait_reverse() throws Exception {
        final int memberId = 7;
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectOvertime(); // update waits for insert lock
                        Member member = new Member();
                        member.setMemberId(memberId);
                        member.setMemberName("lock1");
                        memberBhv.updateNonstrict(member); // wait
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    public void test_insert_ForeignKeyWait_branch_NoWait() throws Exception {
        final int memberId = 7;
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectNormallyDone();
                        MemberLogin login = new MemberLogin();
                        login.setMemberId(3);
                        login.setLoginMemberStatusCode_正式会員();
                        login.setMobileLoginFlg_True();
                        login.setLoginDatetime(currentLocalDateTime());
                        memberLoginBhv.insert(login);
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    public void test_insert_ForeignKeyWait_differentRecord_noWait() throws Exception {
        final int memberId1 = 7;
        final int memberId2 = 8;
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberId(memberId1);
                        member.setMemberAccount("lock1"); // unique key
                        memberBhv.updateNonstrict(member);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberId(memberId2);
                        member.setMemberAccount("lock2"); // unique key
                        memberBhv.updateNonstrict(member);
                    }
                }, 2);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId1);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId2);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    public void test_insert_ForeignKeyWait_differentRecord() throws Exception {
        cannonball(new CannonballRun() {
            Integer firstMemberId;
            Integer secondMemberId;

            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = memberBhv.selectByPK(1).get();
                        member.setMemberAccount("dummy1"); // unique key
                        memberBhv.insert(member);
                        member.setMemberAccount("lock1"); // unique key
                        memberBhv.updateNonstrict(member);
                        firstMemberId = member.getMemberId();
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = memberBhv.selectByPK(1).get();
                        member.setMemberAccount("dummy2"); // unique key
                        memberBhv.insert(member);
                        member.setMemberAccount("lock2"); // unique key
                        memberBhv.updateNonstrict(member);
                        secondMemberId = member.getMemberId();
                    }
                }, 2);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(firstMemberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(secondMemberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    // ===================================================================================
    //                                                                 ForeignKey Deadlock
    //                                                                 ===================
    // -----------------------------------------------------
    //                                   Child before Parent
    //                                   -------------------
    public void test_insert_ForeignKeyDeadlock_childBeforeParent() throws Exception {
        final int memberId = 7;
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId);
                        purchase.setProductId(1);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 2);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(memberId);
                        purchase.setProductId(2);
                        purchase.setPurchaseDatetime(currentLocalDateTime());
                        purchase.setPurchasePrice(123);
                        purchase.setPurchaseCount(9);
                        purchase.setPaymentCompleteFlg_True();
                        purchaseBhv.insert(purchase); // wait
                    }
                }, 2);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberId(memberId);
                        member.setBirthdate(currentLocalDate());
                        memberBhv.updateNonstrict(member); // wait
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberId(memberId);
                        member.setBirthdate(currentLocalDate());
                        memberBhv.updateNonstrict(member); // wait
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2).expectExceptionAny("Deadlock found"));
    }

    // ===================================================================================
    //                                                                NextKeyLock Deadlock
    //                                                                ====================
    public void test_insert_NextKeyLockDeadlock_for_FK() {
        ListResultBean<PurchasePayment> removedPaymentList = purchasePaymentBhv.selectList(cb -> {});
        purchasePaymentBhv.varyingQueryDelete(op -> {}, op -> op.allowNonQueryDelete());
        // {3, 6, 7} no deadlock (if no data since first, deadlock)
        // if unique index removed, {3, 6, 9} no deadlock but {3, 3} deadlock
        final Map<Integer, Integer> parameterMap = new HashMap<Integer, Integer>();
        parameterMap.put(1, 3);
        parameterMap.put(2, 7);
        parameterMap.put(3, 9);
        String msg = "Deadlock found";
        final List<Purchase> removedPurchaseList = removePurchaseList(parameterMap.values());
        final Purchase source = purchaseBhv.selectByPK(1L).get();
        CannonballOption option =
                new CannonballOption().threadCount(parameterMap.size()).commitTx().expectExceptionAny(msg).finalizer(() -> {
                    restoreDeletedPurchase(removedPaymentList, removedPurchaseList);
                });
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Integer memberId = parameterMap.get(entryNumber);

                // empty delete (update, for update) locks new record
                // (if it deletes existing records, second threads waits here)
                purchaseBhv.queryDelete(cb -> {
                    cb.query().setMemberId_Equal(memberId);
                    cb.disableQueryUpdateCountPreCheck();
                });

                Purchase inserted = source.clone();
                inserted.setMemberId(memberId);
                long currentTime = currentDate().getTime();
                long randomMillis = currentTime + (entryNumber * 10000);
                inserted.setPurchaseDatetime(toLocalDateTime(randomMillis));

                purchaseBhv.insert(inserted);
                purchaseBhv.delete(inserted); // to revert
            }
        }, option);
    }

    protected void restoreDeletedPurchase(ListResultBean<PurchasePayment> removedPaymentList, final List<Purchase> removedPurchaseList) {
        purchaseBhv.varyingBatchInsert(removedPurchaseList, op -> op.disablePrimaryKeyIdentity().disableCommonColumnAutoSetup());
        purchasePaymentBhv.varyingBatchInsert(removedPaymentList, op -> op.disablePrimaryKeyIdentity().disableCommonColumnAutoSetup());
    }

    protected List<Purchase> removePurchaseList(Collection<Integer> parameters) {
        TransactionResource tx = beginNewTransaction();
        try {
            List<Purchase> resultList = newArrayList();
            for (Object object : parameters) {
                Integer memberId = (Integer) object;
                ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb -> {
                    cb.query().setMemberId_Equal(memberId);
                });
                purchaseBhv.batchDeleteNonstrict(purchaseList);
                resultList.addAll(purchaseList);
            }
            return resultList;
        } finally {
            tx.commit();
        }
    }

    public void test_insert_NextKeyLockDeadlock_for_PK() {
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        final Set<Integer> insertedIdSet = DfCollectionUtil.newHashSet();
        final Member source = memberBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(3));
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();

                // empty delete (update, for update) locks new record
                // (if it deletes existing records, second waits)
                MemberCB cb = new MemberCB();
                cb.query().setMemberId_Equal(99999);
                cb.disableQueryUpdateCountPreCheck();
                memberBhv.queryDelete(cb);

                car.restart();

                Member inserted = source.clone();
                inserted.setMemberAccount(entryNumber + ":" + inserted.getMemberId());
                memberBhv.insert(inserted);
                markSet.add("success: " + entryNumber);
                insertedIdSet.add(inserted.getMemberId());
            }
        }, new CannonballOption().commitTx().expectExceptionAny("Deadlock found"));
        log(markSet);
        if (!insertedIdSet.isEmpty()) {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_InScope(insertedIdSet);
            memberBhv.queryDelete(cb);
        }
    }
}
