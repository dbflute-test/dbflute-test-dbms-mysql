package org.docksidestage.mysql.dbflute.whitebox;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.dbflute.cbean.ordering.ManualOrderOption;
import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.allcommon.CDef.MemberStatus;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.8 (2012/09/07 Friday)
 */
public class WxCBManualOrderSwitchOrderMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    public void test_SwitchOrder_DreamCruise() {
        // ## Arrange ##
        adjustMemberStatusCount();
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberSecurityAsOne();
        cb.setupSelect_MemberServiceAsOne();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().addOrderBy_MemberStatusCode_Asc();
        ManualOrderOption mob = new ManualOrderOption();
        mob.when_Equal(CDef.MemberStatus.Formalized).then(dreamCruiseCB.specify().columnMemberId());
        mob.when_Equal(CDef.MemberStatus.Provisional).then(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
        mob.elseEnd(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnReminderUseCount());
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        List<Member> fmlList = newArrayList();
        List<Member> prvList = newArrayList();
        List<Member> wdlList = newArrayList();
        String previousStatus = null;
        Set<String> statusSet = newHashSet();
        for (Member member : memberList) {
            log(member.getMemberStatusCode(), member.getMemberId(), member.getMemberServiceAsOne().get().getServicePointCount(), member
                    .getMemberSecurityAsOne().get().getReminderUseCount());
            if (member.isMemberStatusCodeFormalized()) {
                fmlList.add(member);
            } else if (member.isMemberStatusCodeProvisional()) {
                prvList.add(member);
            } else if (member.isMemberStatusCodeWithdrawal()) {
                wdlList.add(member);
            } else { // no way
                fail();
            }
            String currentStatus = member.getMemberStatusCode();
            if (previousStatus != null && !previousStatus.equals(currentStatus)) {
                assertFalse(statusSet.contains(currentStatus));
            }
            previousStatus = currentStatus;
            statusSet.add(currentStatus);
        }
        {
            Integer previousId = null;
            assertHasPluralElement(fmlList);
            for (Member member : fmlList) {
                Integer memberId = member.getMemberId();
                assertNotNull(memberId);
                assertTrue(previousId == null || previousId < memberId);
                previousId = memberId;
            }
            assertNotNull(previousId);
        }
        {
            Integer previousPoint = null;
            assertHasPluralElement(prvList);
            for (Member member : prvList) {
                Integer point = member.getMemberServiceAsOne().get().getServicePointCount();
                assertNotNull(point);
                assertTrue(previousPoint == null || previousPoint < point);
                previousPoint = point;
            }
            assertNotNull(previousPoint);
        }
        {
            Integer previousCount = null;
            assertHasPluralElement(wdlList);
            for (Member member : wdlList) {
                Integer count = member.getMemberSecurityAsOne().get().getReminderUseCount();
                assertNotNull(count);
                assertTrue(previousCount == null || previousCount < count);
                previousCount = count;
            }
            assertNotNull(previousCount);
        }
    }

    // ===================================================================================
    //                                                                             Binding
    //                                                                             =======
    public void test_SwitchOrder_binding_Number() {
        // ## Arrange ##
        adjustMemberStatusCount();
        MemberCB cb = new MemberCB();
        ManualOrderOption mob = new ManualOrderOption();
        mob.when_Equal(CDef.MemberStatus.Formalized).then(3);
        mob.when_Equal(CDef.MemberStatus.Provisional).then(4);
        mob.elseEnd(2);
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        List<CDef.MemberStatus> expectedList =
                newArrayList(CDef.MemberStatus.Withdrawal, CDef.MemberStatus.Formalized, CDef.MemberStatus.Provisional);
        Set<CDef.MemberStatus> actualSet = newLinkedHashSet();
        for (Member member : memberList) {
            actualSet.add(member.getMemberStatusCodeAsMemberStatus());
        }
        Iterator<CDef.MemberStatus> expectedIte = expectedList.iterator();
        Iterator<CDef.MemberStatus> actualIte = actualSet.iterator();
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
    }

    public void test_SwitchOrder_binding_Date() {
        // ## Arrange ##
        adjustMemberStatusCount();
        MemberCB cb = new MemberCB();
        ManualOrderOption mob = new ManualOrderOption();
        mob.when_Equal(CDef.MemberStatus.Formalized).then(toLocalDate("2012/10/31"));
        mob.when_Equal(CDef.MemberStatus.Provisional).then(toLocalDate("2001/10/31"));
        mob.elseEnd(toLocalDate("2007/10/31"));
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        List<CDef.MemberStatus> expectedList =
                newArrayList(CDef.MemberStatus.Provisional, CDef.MemberStatus.Withdrawal, CDef.MemberStatus.Formalized);
        Set<CDef.MemberStatus> actualSet = newLinkedHashSet();
        for (Member member : memberList) {
            actualSet.add(member.getMemberStatusCodeAsMemberStatus());
        }
        Iterator<MemberStatus> expectedIte = expectedList.iterator();
        Iterator<MemberStatus> actualIte = actualSet.iterator();
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
    }

    public void test_SwitchOrder_binding_CDef() {
        // ## Arrange ##
        adjustMemberStatusCount();
        MemberCB cb = new MemberCB();
        ManualOrderOption mob = new ManualOrderOption();
        mob.when_Equal(CDef.MemberStatus.Formalized).then(CDef.MemberStatus.Withdrawal);
        mob.when_Equal(CDef.MemberStatus.Provisional).then(CDef.MemberStatus.Formalized);
        mob.elseEnd(CDef.MemberStatus.Provisional);
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        List<CDef.MemberStatus> expectedList =
                newArrayList(CDef.MemberStatus.Provisional, CDef.MemberStatus.Withdrawal, CDef.MemberStatus.Formalized);
        Set<CDef.MemberStatus> actualSet = newLinkedHashSet();
        for (Member member : memberList) {
            actualSet.add(member.getMemberStatusCodeAsMemberStatus());
        }
        Iterator<MemberStatus> expectedIte = expectedList.iterator();
        Iterator<MemberStatus> actualIte = actualSet.iterator();
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void adjustMemberStatusCount() {
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_Formalized();
            cb.fetchFirst(3);
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            for (Member member : memberList) {
                member.setMemberStatusCode_Provisional();
            }
            memberBhv.batchUpdate(memberList);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_Formalized();
            cb.fetchFirst(3);
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            for (Member member : memberList) {
                member.setMemberStatusCode_Withdrawal();
            }
            memberBhv.batchUpdate(memberList);
        }
    }
}
