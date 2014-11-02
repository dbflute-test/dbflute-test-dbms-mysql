package org.docksidestage.mysql.dbflute.vendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.dbflute.bhv.core.context.ConditionBeanContext;
import org.dbflute.bhv.core.context.ContextStack;
import org.dbflute.bhv.readable.EntityRowHandler;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseMySql;
import org.dbflute.outsidesql.OutsideSqlContext;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.cbean.MemberStatusCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.cbean.VendorCheckCB;
import org.docksidestage.mysql.dbflute.cbean.cq.VendorCheckCQ;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberStatus;
import org.docksidestage.mysql.dbflute.exentity.VendorCheck;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorWeatheryTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private PurchaseBhv purchaseBhv;
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                       Repeat Select
    //                                                                       =============
    public void test_repeat_select_after_select_and_update() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(3));
        Long versionNo = beforeMember.getVersionNo();

        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("testName");
        member.setVersionNo(versionNo);

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        // Repeat the member as same local table
        {
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(3));
            log("local actual=" + actual);
            assertEquals("testName", actual.getMemberName());
        }
        // Repeat the member as joined table
        {
            PurchaseCB purchaseCB = new PurchaseCB();
            purchaseCB.setupSelect_Member();
            purchaseCB.query().setMemberId_Equal(3);
            Member actual = purchaseBhv.selectList(purchaseCB).get(0).getMember().get();
            log("joined actual=" + actual);
            assertEquals("testName", actual.getMemberName());
        }
    }

    public void test_repeat_select_after_update() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("testName");

        // ## Act ##
        memberBhv.updateNonstrict(member);

        // ## Assert ##
        // Repeat the member as same local table
        {
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(3));
            log("local actual=" + actual);
            assertEquals("testName", actual.getMemberName());
        }
        // Repeat the member as joined table
        {
            PurchaseCB purchaseCB = new PurchaseCB();
            purchaseCB.setupSelect_Member();
            purchaseCB.query().setMemberId_Equal(3);
            Member actual = purchaseBhv.selectList(purchaseCB).get(0).getMember().get();
            log("joined actual=" + actual);
            assertEquals("testName", actual.getMemberName());
        }
    }

    public void test_repeat_select_after_update_by_JDBC() throws Exception {
        // ## Arrange ##
        DataSource ds = getDataSource();
        Connection conn = ds.getConnection();

        // ## Act ##
        {
            String sql = "update MEMBER set MEMBER_NAME = ? where MEMBER_ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "testName");
            ps.setInt(2, 3);
            ps.executeUpdate();
        }

        // ## Assert ##
        // Repeat the member as same local table
        {
            String sql = "select * from MEMBER where MEMBER_ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 3);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String actual = rs.getString("MEMBER_NAME");
            log("local actual=" + actual);
            assertEquals("testName", actual);
        }
        // Repeat the member as joined table
        {
            String select = "select PURCHASE.PURCHASE_ID, MEMBER.MEMBER_NAME";
            String from = " from PURCHASE left outer join MEMBER on PURCHASE.MEMBER_ID = MEMBER.MEMBER_ID";
            String where = " where PURCHASE.MEMBER_ID = ?";
            PreparedStatement ps = conn.prepareStatement(select + from + where);
            ps.setInt(1, 3);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String actual = rs.getString("MEMBER_NAME");
            log("joined actual=" + actual);
            assertEquals("testName", actual);
        }
    }

    // ===================================================================================
    //                                                                    Insert in Cursor
    //                                                                    ================
    public void test_insert_in_selectCursor_of_conditionBean_sameTable() throws Exception {
        // ## Arrange ##
        final List<Integer> memberIdList = new ArrayList<Integer>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                Member member = new Member();
                member.setMemberName(memberName + count);
                member.setMemberAccount(memberName + count);
                member.setMemberStatusCode_Formalized();
                memberBhv.insert(member);
                memberIdList.add(member.getMemberId());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        cb.query().setMemberId_InScope(memberIdList);
        assertNotSame(0, memberBhv.selectCount(cb));
    }

    public void test_insert_in_selectCursor_of_conditionBean_diffTable() throws Exception {
        // ## Arrange ##
        final List<String> codeList = new ArrayList<String>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                MemberStatus status = new MemberStatus().xznocheckClassification();
                String statusCode;
                if (count >= 100) {
                    statusCode = String.valueOf(count);
                } else if (count >= 10) {
                    statusCode = "0" + count;
                } else {
                    statusCode = "00" + count;
                }
                status.mynativeMappingMemberStatusCode(statusCode);
                status.setMemberStatusName(memberName + count);
                status.setDescription("foo");
                status.setDisplayOrder(99999 + count);
                memberStatusBhv.insert(status);
                codeList.add(status.getMemberStatusCode());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        MemberStatusCB statusCB = new MemberStatusCB();
        statusCB.query().setMemberStatusCode_InScope(codeList);
        assertNotSame(0, memberStatusBhv.selectCount(statusCB));
    }

    // ===================================================================================
    //                                                                      Paging Binding
    //                                                                      ==============
    public void test_paging_binding_basic() {
        doTest_paging_binding(false);
    }

    public void test_paging_binding_suppress() {
        doTest_paging_binding(true);
    }

    public void doTest_paging_binding(boolean suppress) {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        if (suppress) {
            ((SqlClauseMySql) cb.getSqlClause()).suppressPagingBinding();
        }
        cb.query().addOrderBy_MemberId_Asc();
        cb.paging(4, 3);
        assertEquals(3, cb.getFetchPageNumber());

        // ## Act ##
        PagingResultBean<Member> page = memberBhv.selectPage(cb); // re-select

        // ## Assert ##
        assertEquals(4, page.size());
        log("PagingResultBean.toString():" + ln() + " " + page);
        assertEquals(3, page.getCurrentPageNumber());
        assertEquals(20, page.getAllRecordCount());
        assertEquals(5, page.getAllPageCount());
        assertEquals(Integer.valueOf(9), page.get(0).getMemberId());

        String clause = cb.getSqlClause().getClause();
        log(ln() + clause);
        if (suppress) {
            assertTrue(clause.contains("limit 8, 4"));
        } else {
            assertTrue(clause.contains("limit /*pmb.sqlClause.pagingBindingOffset*/0, /*pmb.sqlClause.pagingBindingLimit*/0"));
        }
    }

    // ===================================================================================
    //                                                                          Short Char
    //                                                                          ==========
    public void test_shortChar_inout_trimmed_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code + " ");

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code, actual.getTypeOfChar()); // DB trims it
    }

    public void test_shortChar_inout_filled_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code.trim(), actual.getTypeOfChar()); // DB trims it
    }

    public void test_shortChar_condition() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB() {
            // internal manipulation (Don't mimic it)
            @Override
            protected VendorCheckCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
                return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel) {
                    @Override
                    protected String hSC(String propertyName, String value, Integer size, String modeCode) {
                        return value; // do nothing for not depending on shortCharHandlingMode
                    }
                };
            }
        };
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code.trim());
        assertTrue(cb.toDisplaySql().contains("'AB'"));

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code.trim(), actual.getTypeOfChar());
    }
}
