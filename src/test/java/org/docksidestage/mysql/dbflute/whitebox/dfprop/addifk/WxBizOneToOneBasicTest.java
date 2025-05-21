package org.docksidestage.mysql.dbflute.whitebox.dfprop.addifk;

import java.util.HashSet;
import java.util.Set;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.dbflute.util.DfTypeUtil;
import org.dbflute.util.Srl;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberAddress;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneBasicTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                     Second Relation
    //                                                                     ===============
    public void test_secondRelation_same() {
        // ## Arrange ##
        int countAll = memberBhv.selectCount(new MemberCB());
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsValid(toLocalDate("2009/12/12"));
        cb.setupSelect_MemberAddressAsValidBefore(toLocalDate("2009/12/12"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            member.getMemberAddressAsValid().ifPresent(address -> {
                log(member.getMemberName() + ", " + address);
                MemberAddress addressBefore = member.getMemberAddressAsValidBefore().get();
                assertEquals(address, addressBefore);
                markHere("exists");
            });
        }
        assertEquals(countAll, memberList.size());
        assertMarked("exists");
    }

    public void test_secondRelation_diff() {
        // ## Arrange ##
        int countAll = memberBhv.selectCount(new MemberCB());
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsValid(DfTypeUtil.toLocalDate("2009/12/12"));
        cb.setupSelect_MemberAddressAsValidBefore(DfTypeUtil.toLocalDate("2001/04/28"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean exists = false;
        for (Member member : memberList) {
            MemberAddress addressAsValid = member.getMemberAddressAsValid().orElse(null);
            MemberAddress addressAsValidBefore = member.getMemberAddressAsValidBefore().orElse(null);
            if (addressAsValid != null) {
                if (!addressAsValid.equals(addressAsValidBefore)) {
                    log(member.getMemberName() + ", " + addressAsValid.getAddress() + ", "
                            + (addressAsValidBefore != null ? addressAsValidBefore.getAddress() : "null"));
                    exists = true;
                }
            }
        }
        assertTrue(exists);
        assertEquals(countAll, memberList.size());
    }

    // ===================================================================================
    //                                                                        CDef Binding
    //                                                                        ============
    public void test_CDefBinding() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsLoginStatus(CDef.MemberStatus.Formalized);
        cb.query().setMemberAccount_Equal("noexist");
        final HashSet<String> markSet = new HashSet<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                // ## Assert ##
                markSet.add("handle");
                assertTrue(info.getDisplaySql().contains("LOGIN_MEMBER_STATUS_CODE = 'FML'"));
            }
        });

        try {
            // ## Act ##
            ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

            // ## Assert ##
            assertHasZeroElement(memberList);
            assertTrue(markSet.contains("handle"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                Fixed Classification
    //                                                                ====================
    public void test_FixedCls_basic() throws Exception {
        // ## Arrange ##
        final Set<String> displaySqlSet = new HashSet<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlSet.add(info.getDisplaySql());
            }
        });

        // ## Act ##
        try {
            memberBhv.selectList(cb -> {
                cb.setupSelect_MemberLoginAsLoginStatusFixedCls();
            });

            // ## Assert ##
            String sql = displaySqlSet.iterator().next();
            assertContains(sql, ".LOGIN_MEMBER_STATUS_CODE = 'SEA'");
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_FixedCls_grouping() throws Exception {
        // ## Arrange ##
        final Set<String> displaySqlSet = new HashSet<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlSet.add(info.getDisplaySql());
            }
        });

        // ## Act ##
        try {
            memberBhv.selectList(cb -> {
                cb.setupSelect_MemberLoginAsLoginStatusFixedClsGrouping();
            });

            // ## Assert ##
            String sql = displaySqlSet.iterator().next();
            assertContains(sql, ".LOGIN_MEMBER_STATUS_CODE in ('LND', 'SEA')");
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                           IfComment
    //                                                                           =========
    public void test_IfComment_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsIfComment(currentLocalDate(), CDef.Region.千葉).withRegion();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        boolean exists = false;
        for (Member member : memberList) {
            MemberAddress address = member.getMemberAddressAsIfComment().orElse(null);
            if (address != null) {
                log(address + ", " + address.getRegion().get().getRegionName());
                assertTrue(address.isRegionId千葉());
                exists = true;
            }
        }
        assertTrue(exists);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsIgnoreCase(sql, "REGION_ID = '" + CDef.Region.千葉.code() + "'"));
    }

    public void test_IfComment_false() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsIfComment(currentLocalDate(), null).withRegion();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        boolean exists = false;
        boolean existsMainRegion = false;
        boolean existsOtherRegion = false;
        for (Member member : memberList) {
            MemberAddress address = member.getMemberAddressAsIfComment().orElse(null);
            if (address != null) {
                log(address + ", " + address.getRegion().get().getRegionName());
                if (address.isRegionId千葉()) {
                    existsMainRegion = true;
                } else {
                    existsOtherRegion = true;
                }
                exists = true;
            }
        }
        assertTrue(exists);
        assertTrue(existsMainRegion);
        assertTrue(existsOtherRegion);
        String sql = cb.toDisplaySql();
        assertFalse(Srl.containsIgnoreCase(sql, "REGION_ID = '" + CDef.Region.千葉.code() + "'"));
    }
}