package org.docksidestage.mysql.dbflute.whitebox;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import org.docksidestage.mysql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.3F (2012/04/05 Thursday)
 */
public class WxCursorSelectMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        xclearCachedContainer();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setCursorSelectFetchSize(Integer.MIN_VALUE);
        super.setUp();
        memberBhv.getFetchSizeMap().clear();
        memberBhv.getRowDataClassMap().clear();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setCursorSelectFetchSize(null);
        DBFluteConfig.getInstance().lock();
    }

    @Override
    protected boolean isDestroyContainerAtTearDown() {
        return true;
    }

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_cursorSelectFetchSize_basic() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
        assertEquals(Integer.MIN_VALUE, DBFluteConfig.getInstance().getCursorSelectFetchSize());

        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                log("ResultSet   = " + rs.getClass());
                rs.next(); // select first row
                com.mysql.jdbc.ResultSetImpl rsImpl = (com.mysql.jdbc.ResultSetImpl) rs;
                com.mysql.jdbc.RowData rowData = extractRowDataOnResutSet(rsImpl);
                log("rowData     = " + rowData.getClass());
                assertTrue(rowData instanceof com.mysql.jdbc.RowDataDynamic);
                assertDbAccess();
                return null;
            }
        };

        // ## Act ##
        memberBhv.outsideSql().selectCursor(pmb, handler);
    }

    public void test_cursorSelectFetchSize_default() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setCursorSelectFetchSize(null);
        assertNull(DBFluteConfig.getInstance().getCursorSelectFetchSize());

        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                log("ResultSet   = " + rs.getClass());
                rs.next(); // select first row
                com.mysql.jdbc.ResultSetImpl rsImpl = (com.mysql.jdbc.ResultSetImpl) rs;
                com.mysql.jdbc.RowData rowData = extractRowDataOnResutSet(rsImpl);
                log("rowData     = " + rowData.getClass());
                assertTrue(rowData instanceof com.mysql.jdbc.RowDataStatic);
                memberBhv.selectCount(new MemberCB()); // you can select
                return null;
            }
        };

        // ## Act ##
        memberBhv.outsideSql().selectCursor(pmb, handler);
    }

    protected void assertDbAccess() {
        try {
            memberBhv.selectCount(new MemberCB());
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_cursorSelectFetchSize_configure() {
        // ## Arrange ##
        assertEquals(Integer.MIN_VALUE, DBFluteConfig.getInstance().getCursorSelectFetchSize());
        final int countAll = memberBhv.selectCount(new MemberCB());
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();

        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                log("ResultSet   = " + rs.getClass());
                rs.next(); // select first row
                com.mysql.jdbc.ResultSetImpl rsImpl = (com.mysql.jdbc.ResultSetImpl) rs;
                com.mysql.jdbc.RowData rowData = extractRowDataOnResutSet(rsImpl);
                log("rowData     = " + rowData.getClass());
                List<?> rows = extractRowsOnRowData(rowData);
                log("rows.size() = " + rows.size());
                assertEquals(countAll, rows.size());
                memberBhv.selectCount(new MemberCB()); // no exception
                memberBhv.selectList(new MemberCB()); // no exception
                assertEquals(0, memberBhv.getFetchSizeMap().get("selectList"));
                assertEquals(com.mysql.jdbc.RowDataStatic.class, memberBhv.getRowDataClassMap().get("selectList"));
                return null;
            }
        };

        // ## Act ##
        memberBhv.outsideSql().configure(conf -> conf.fetchSize(1)).selectCursor(pmb, handler);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    public void test_cursorSelectFetchSize_selectList_success() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        int countAll = memberBhv.selectCount(cb);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        assertEquals(countAll, memberList.size());
        assertEquals(0, memberBhv.getFetchSizeMap().get("selectList"));
        assertEquals(com.mysql.jdbc.RowDataStatic.class, memberBhv.getRowDataClassMap().get("selectList"));
    }

    // ===================================================================================
    //                                                                   Reflection Helper
    //                                                                   =================
    protected com.mysql.jdbc.RowData extractRowDataOnResutSet(com.mysql.jdbc.ResultSetImpl rsImpl) {
        Field rowDataField = DfReflectionUtil.getWholeField(com.mysql.jdbc.ResultSetImpl.class, "rowData");
        return (com.mysql.jdbc.RowData) DfReflectionUtil.getValueForcedly(rowDataField, rsImpl);
    }

    protected List<?> extractRowsOnRowData(com.mysql.jdbc.RowData rowData) {
        Field rowsField = DfReflectionUtil.getWholeField(com.mysql.jdbc.RowDataStatic.class, "rows");
        return (List<?>) DfReflectionUtil.getValueForcedly(rowsField, rowData);
    }
}
