package org.docksidestage.mysql.dbflute.vendor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dbflute.bhv.writable.QueryInsertSetupper;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.helper.HandyDate;
import org.dbflute.hook.AccessContext;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.cbean.MemberLoginCB;
import org.docksidestage.mysql.dbflute.cbean.MemberWithdrawalCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberSecurity;
import org.docksidestage.mysql.dbflute.exentity.MemberWithdrawal;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.9 (2011/01/09 Sunday)
 */
public class VendorGrammerTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;

    // ===================================================================================
    //                                                                           InnerJoin
    //                                                                           =========
    public void test_innerJoin_nested_basic() {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_Withdrawal();
            cb.query().queryMemberWithdrawalAsOne().setWithdrawalReasonCode_IsNotNull();
            countAll = memberBhv.selectCount(cb);
        }

        MemberCB cb = new MemberCB();
        cb.query().queryMemberWithdrawalAsOne().queryWithdrawalReason().innerJoin();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("inner join"));
        assertTrue(cb.toDisplaySql().contains("left outer join"));
        assertFalse(memberList.isEmpty());
        assertEquals(countAll, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
        }
    }

    public void test_innerJoin_nested_branch() {
        // ## Arrange ##
        int countAll;
        {
            PurchaseCB cb = new PurchaseCB();
            cb.query().queryMember().queryMemberWithdrawalAsOne().setWithdrawalReasonCode_IsNotNull();
            countAll = purchaseBhv.selectCount(cb);
        }

        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberSecurityAsOne();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withWithdrawalReason();
        cb.query().queryMember().queryMemberSecurityAsOne().inline().setMemberId_LessThan(10);
        cb.query().queryMember().queryMemberWithdrawalAsOne().queryWithdrawalReason().innerJoin();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("inner join"));
        assertTrue(cb.toDisplaySql().contains("left outer join"));
        assertFalse(purchaseList.isEmpty());
        assertEquals(countAll, purchaseList.size());
        boolean existsSecurity = false;
        boolean notExistsSecurity = false;
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember().get();
            log(purchase.getPurchaseId() + ", " + member.getMemberId() + ", " + member.getMemberName() + ", "
                    + member.getMemberSecurityAsOne());
            MemberSecurity security = member.getMemberSecurityAsOne().orElse(null);
            if (security != null) {
                assertTrue(member.getMemberId() < 10);
                existsSecurity = true;
            } else {
                assertTrue(member.getMemberId() >= 10);
                notExistsSecurity = true;
            }
        }
        assertTrue(existsSecurity);
        assertTrue(notExistsSecurity);
    }

    // ===================================================================================
    //                                                                         QueryInsert
    //                                                                         ===========
    public void test_queryInsert_basic() { // and fixed value, common column, exclusive control column
        // ## Arrange ##
        int countAll = memberWithdrawalBhv.selectCount(new MemberWithdrawalCB());
        Map<Integer, Member> formalizedMemberMap = new LinkedHashMap<Integer, Member>();
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_Formalized();
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            for (Member member : memberList) {
                formalizedMemberMap.put(member.getMemberId(), member);
            }
        }
        final String firstReason;
        {
            MemberWithdrawalCB cb = new MemberWithdrawalCB();
            cb.query().setWithdrawalReasonCode_IsNotNull();
            cb.fetchFirst(1);
            firstReason = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb).getWithdrawalReasonCode();
        }

        // ## Act ##
        int inserted = memberWithdrawalBhv.queryInsert(new QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB>() {
            public ConditionBean setup(MemberWithdrawal entity, MemberWithdrawalCB intoCB) {
                entity.setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason.codeOf(firstReason));
                MemberCB cb = new MemberCB();

                intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnMemberId());
                intoCB.specify().columnWithdrawalDatetime().mappedFrom(cb.specify().columnFormalizedDatetime());
                intoCB.specify().columnWithdrawalReasonInputText().mappedFrom(cb.specify().columnMemberName());

                cb.query().setMemberStatusCode_Equal_Formalized();
                return cb;
            }
        });

        // ## Assert ##
        assertNotSame(0, inserted);
        int actualCountAll = memberWithdrawalBhv.selectCount(new MemberWithdrawalCB());
        assertNotSame(countAll, actualCountAll);
        assertTrue(countAll < actualCountAll);
        assertEquals(actualCountAll - countAll, inserted);

        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        List<Integer> memberIdList = DfCollectionUtil.newArrayList();
        for (Member member : formalizedMemberMap.values()) {
            memberIdList.add(member.getMemberId());
        }
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<MemberWithdrawal> actualList = memberWithdrawalBhv.selectList(cb);
        assertNotSame(0, actualList.size());
        assertEquals(memberIdList.size(), actualList.size());
        String fmt = "yyyy-MM-dd HH:mm:ss";
        for (MemberWithdrawal actual : actualList) {
            String withdrawalReasonCode = actual.getWithdrawalReasonCode();
            assertNotNull(withdrawalReasonCode);
            assertEquals(firstReason, withdrawalReasonCode);
            Member member = formalizedMemberMap.get(actual.getMemberId());
            assertEquals(member.getMemberName(), actual.getWithdrawalReasonInputText());

            // common columns
            AccessContext accessContext = AccessContext.getAccessContextOnThread();
            String registerTimestamp = DfTypeUtil.toString(accessContext.getAccessTimestamp(), fmt);

            assertNearlyEqualDatetime(registerTimestamp, actual.getRegisterDatetime(), fmt);
            assertEquals(accessContext.getAccessUser(), actual.getRegisterUser());
            assertNearlyEqualDatetime(registerTimestamp, actual.getUpdateDatetime(), fmt);
            assertEquals(accessContext.getAccessUser(), actual.getUpdateUser());
        }
    }

    protected void assertNearlyEqualDatetime(String expectedTimestamp, LocalDateTime actualDatetime, String fmt) {
        // because of millisecond round problem
        if (!expectedTimestamp.equals(DfTypeUtil.toString(actualDatetime, fmt))) {
            LocalDateTime addedDatetime = new HandyDate(actualDatetime).addSecond(-1).getLocalDateTime();
            if (!expectedTimestamp.equals(toString(addedDatetime, fmt))) {
                fail(expectedTimestamp + " : " + actualDatetime);
            }
        }
    }

    public void test_queryInsert_with_DerivedReferrer() { // and relation, order-by, no specified
        // ## Arrange ##
        Map<Integer, Member> formalizedMemberMap = new LinkedHashMap<Integer, Member>();
        {
            MemberCB cb = new MemberCB();
            cb.setupSelect_MemberStatus();
            cb.specify().derivedMemberLogin().max(new SubQuery<MemberLoginCB>() {
                public void query(MemberLoginCB subCB) {
                    subCB.specify().columnLoginDatetime();
                    subCB.query().setMobileLoginFlg_Equal_True();
                }
            }, Member.ALIAS_latestLoginDatetime);
            cb.query().setMemberStatusCode_Equal_Formalized();
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            for (Member member : memberList) {
                formalizedMemberMap.put(member.getMemberId(), member);
            }
        }
        final LocalDateTime coalesce = toLocalDateTime("1234-10-24 12:34:56.147");

        // ## Act ##
        memberWithdrawalBhv.queryInsert(new QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB>() {
            public ConditionBean setup(MemberWithdrawal entity, MemberWithdrawalCB intoCB) {
                MemberCB cb = new MemberCB();
                cb.setupSelect_MemberStatus();
                cb.specify().derivedMemberLogin().max(new SubQuery<MemberLoginCB>() {
                    public void query(MemberLoginCB subCB) {
                        subCB.specify().columnLoginDatetime();
                        subCB.query().setMobileLoginFlg_Equal_True();
                    }
                }, Member.ALIAS_latestLoginDatetime, op -> op.coalesce(coalesce));

                intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnMemberId());
                intoCB.specify().columnWithdrawalDatetime().mappedFromDerived(Member.ALIAS_latestLoginDatetime);
                intoCB.specify().columnWithdrawalReasonInputText().mappedFrom(cb.specify().specifyMemberStatus().columnMemberStatusName());

                cb.query().setMemberStatusCode_Equal_Formalized();
                cb.query().addOrderBy_Birthdate_Desc().withNullsLast();
                cb.query().addOrderBy_MemberId_Asc();
                return cb;
            }
        });

        // ## Assert ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        List<Integer> memberIdList = DfCollectionUtil.newArrayList();
        for (Member member : formalizedMemberMap.values()) {
            memberIdList.add(member.getMemberId());
        }
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<MemberWithdrawal> actualList = memberWithdrawalBhv.selectList(cb);
        assertNotSame(0, actualList.size());
        String fmt = "yyyy-MM-dd HH:mm:ss";
        Set<String> existsSet = new HashSet<String>();
        for (MemberWithdrawal actual : actualList) {
            String withdrawalDatetime = DfTypeUtil.toString(actual.getWithdrawalDatetime(), fmt);
            String coalesceDatetime = DfTypeUtil.toString(coalesce, fmt);
            Member member = formalizedMemberMap.get(actual.getMemberId());
            assertNotNull(member);
            if (withdrawalDatetime.equals(coalesceDatetime)) {
                assertNull(member.getLatestLoginDatetime());
                existsSet.add("coalesce");
            } else {
                String latestLoginDatetime = DfTypeUtil.toString(member.getLatestLoginDatetime(), fmt);
                assertNotNull(latestLoginDatetime);
                assertEquals(latestLoginDatetime, withdrawalDatetime);
                existsSet.add("latest");
            }
            assertNull(actual.getWithdrawalReasonCode());
            assertEquals(member.getMemberStatus().get().getMemberStatusName(), actual.getWithdrawalReasonInputText());
        }
        assertEquals(2, existsSet.size());
    }

    // ===================================================================================
    //                                                                     OrderBy Binding
    //                                                                     ===============
    public void test_SwitchOrder_binding() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(op -> {
            op.when_Equal(CDef.MemberStatus.Formalized).then(3);
            op.when_Equal(CDef.MemberStatus.Provisional).then(4);
            op.elseEnd(2);
        });

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
}
