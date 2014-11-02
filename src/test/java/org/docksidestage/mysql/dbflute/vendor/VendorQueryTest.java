package org.docksidestage.mysql.dbflute.vendor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.sqlclause.SqlClauseMySql.CollateUTF8MB4UnicodeArranger;
import org.dbflute.cbean.sqlclause.query.QueryClauseArranger;
import org.dbflute.dbway.DBWay;
import org.dbflute.helper.HandyDate;
import org.docksidestage.mysql.dbflute.allcommon.DBCurrent;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.cbean.MemberWithdrawalCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteMyselfCheckCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteMyselfCheckBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberWithdrawal;
import org.docksidestage.mysql.dbflute.exentity.customize.SimpleMember;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorQueryTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;
    private WhiteMyselfCheckBhv myselfCheckBhv;

    // ===================================================================================
    //                                                                 LikeSearch WildCard
    //                                                                 ===================
    public void test_LikeSearch_WildCard_DoubleByte_select() {
        // ## Arrange ##
        String keyword = "100％ジュース|和歌山＿テ";
        String expectedMemberName = "果汁" + keyword + "スト";
        String dummyMemberName = "果汁100パーセントジュース|和歌山Aテスト";

        // escape処理の必要な会員がいなかったので、ここで一時的に登録
        Member escapeMember = new Member();
        escapeMember.setMemberName(expectedMemberName);
        escapeMember.setMemberAccount("temporaryAccount");
        escapeMember.setMemberStatusCode_Formalized();
        memberBhv.insert(escapeMember);

        // escape処理をしない場合にHITする会員も登録
        Member nonEscapeOnlyMember = new Member();
        nonEscapeOnlyMember.setMemberName(dummyMemberName);
        nonEscapeOnlyMember.setMemberAccount("temporaryAccount2");
        nonEscapeOnlyMember.setMemberStatusCode_Formalized();
        memberBhv.insert(nonEscapeOnlyMember);

        // 一時的に登録した会員が想定しているものかどうかをチェック
        MemberCB checkCB = new MemberCB();

        // Check!
        checkCB.query().setMemberName_LikeSearch(keyword, new LikeSearchOption().likeContain().notEscape());
        assertEquals("escapeなしでも1件だけHITすること", 1, memberBhv.selectList(checkCB).size());

        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        MemberCB cb = new MemberCB();
        LikeSearchOption option = new LikeSearchOption().likeContain(); // *Point!
        cb.query().setMemberName_LikeSearch(keyword, option);
        // - - - - - - - - - -/

        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("100％ジュース||和歌山＿テ"));

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertEquals(1, memberList.size()); // escapeしてもHITすること
        Member actualMember = memberList.get(0);
        log(actualMember);
        assertEquals(expectedMemberName, actualMember.getMemberName());
    }

    public void test_LikeSearch_WildCard_variousChar_selectByCB() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("fo[v]％c%o");
        memberBhv.updateNonstrict(member);
        member.setMemberId(4);
        member.setMemberName("fo[v]％barc%o");
        memberBhv.updateNonstrict(member);
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_LikeSearch("[v]％c", new LikeSearchOption().likeContain());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        assertEquals(1, memberList.size());
        assertEquals("fo[v]％c%o", memberList.get(0).getMemberName());
        // unused escape char should be ignored
    }

    public void test_LikeSearch_WildCard_variousChar_selectByPmb() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("[v]％c%o");
        memberBhv.updateNonstrict(member);
        member.setMemberId(4);
        member.setMemberName("[v]％barc%o");
        memberBhv.updateNonstrict(member);
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("[v]％c%");

        // ## Act ##
        ListResultBean<SimpleMember> memberList = memberBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        assertEquals(1, memberList.size());
        assertEquals("[v]％c%o", memberList.get(0).getMemberName());
        // unused escape char should be ignored
    }

    public void test_LikeSearch_WildCard_variousChar_whiteOption() {
        // ## Arrange ##
        LikeSearchOption option = new LikeSearchOption();
        option.escapeByPipeLine();

        // ## Act & Assert ##
        assertEquals("ABC％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC＿C[]B|_A", option.generateRealValue("ABC＿C[]B_A"));

        // ## Arrange ##
        DBWay dbway = DBCurrent.getInstance().currentDBDef().dbway();
        option.acceptOriginalWildCardList(dbway.getOriginalWildCardList());

        // ## Act & Assert ##
        assertEquals("ABC％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC＿C[]B|_A", option.generateRealValue("ABC＿C[]B_A"));
    }

    // ===================================================================================
    //                                                                  LikeSearch Collate
    //                                                                  ==================
    public void test_LikeSearch_collate_utf8_unicode_ci() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("あ");
        memberBhv.updateNonstrict(member);
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setMemberName_LikeSearch("ア", new LikeSearchOption().likeContain());
            assertFalse(memberBhv.selectEntity(cb).isPresent());
        }

        MemberCB cb = new MemberCB();
        LikeSearchOption option = new LikeSearchOption() {
            @Override
            public QueryClauseArranger getWhereClauseArranger() {
                return new CollateUTF8MB4UnicodeArranger();
            }
        };
        cb.query().setMemberId_Equal(3);
        cb.query().setMemberName_LikeSearch("ア", option.likeContain());

        // ## Act ##
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("あ", actual.getMemberName());
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("utf8mb4_unicode_520_ci"));
    }

    // ===================================================================================
    //                                                                        InScopeQuery
    //                                                                        ============
    public void test_query_InScope_SeveralRegistered() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Integer> memberIdList = new ArrayList<Integer>();
        for (int i = 0; i < 3123; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_InScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" in ("));
        assertFalse(displaySql.contains(") or "));
    }

    // ===================================================================================
    //                                                              (Query)DerivedReferrer
    //                                                              ======================
    public void test_query_derivedReferrer_between_Integer() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().sum(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_loginCount); // rental
        Integer fromCount = 6;
        Integer toCount = 7;
        cb.query().derivedPurchase().sum(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }).rangeOf(fromCount, toCount, op -> {});

        // ## Act ##
        // Expect no exception
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            Integer loginCount = member.getLoginCount();
            log(member.getMemberName() + ", " + loginCount);
            assertTrue(fromCount <= loginCount);
            assertTrue(toCount >= loginCount);
        }
    }

    public void test_query_derivedReferrer_between_Date() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime); // rental
        LocalDate currentDate = currentLocalDate();
        LocalDate fromDate = toLocalDate(new HandyDate(currentDate).addMonth(-6));
        LocalDate toDate = toLocalDate(currentDate);
        cb.query().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }).fromTo(fromDate, toDate, op -> {});

        // ## Act ##
        // Expect no exception
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            LocalDateTime latestDate = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + toString(member.getLatestLoginDatetime()));
            assertTrue(fromDate.equals(latestDate) || fromDate.isBefore(latestDate.toLocalDate()));
            assertTrue(toDate.equals(latestDate) || toDate.isAfter(latestDate.toLocalDate()));
        }
    }

    // ===================================================================================
    //                                                             Myself InScope SubQuery
    //                                                             =======================
    public void test_InScopeSelfSubQuery() {
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB();
        cb.query().myselfExists(new SubQuery<WhiteMyselfCheckCB>() {
            public void query(WhiteMyselfCheckCB subCB) {
                subCB.useInScopeSubQuery();
            }
        });
        myselfCheckBhv.selectList(cb); // expect no exception
    }

    // ===================================================================================
    //                                                                              IsNull
    //                                                                              ======
    public void test_IsNull_EmptyString() throws Exception {
        // ## Arrange ##
        MemberWithdrawal updated;
        {
            MemberWithdrawalCB cb = new MemberWithdrawalCB();
            cb.fetchFirst(1);
            updated = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
            updated.setWithdrawalReasonInputText("");
            memberWithdrawalBhv.update(updated);
        }
        {
            MemberWithdrawalCB cb = new MemberWithdrawalCB();
            cb.query().setMemberId_Equal(updated.getMemberId());
            cb.enableEmptyStringQuery(() -> {
                cb.query().setWithdrawalReasonInputText_Equal("");
            });
            memberWithdrawalBhv.selectEntityWithDeletedCheck(cb); // check no exception
        }

        // ## Act ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.query().setMemberId_Equal(updated.getMemberId());
        cb.query().setWithdrawalReasonInputText_IsNull();
        MemberWithdrawal withdrawal = memberWithdrawalBhv.selectEntity(cb).orElse(null);

        // ## Assert ##
        assertNull(withdrawal);
    }
}
