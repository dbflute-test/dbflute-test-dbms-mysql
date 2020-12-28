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
    }

    @Override
    public void tearDown() throws Exception {
        memberBhv.getFetchSizeMap().clear();
        memberBhv.getRowDataClassMap().clear();
        super.tearDown();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setCursorSelectFetchSize(null);
        DBFluteConfig.getInstance().lock();
    }

    @Override
    protected boolean isUseOneTimeContainer() {
        return true;
    }

    @Override
    protected boolean isDestroyContainerAtTearDown() {
        return true;
    }

    // ===================================================================================
    //                                                                          Fetch Size
    //                                                                          ==========
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
                com.mysql.cj.jdbc.result.ResultSetImpl rsImpl = (com.mysql.cj.jdbc.result.ResultSetImpl) rs;
                com.mysql.cj.protocol.ResultsetRows rowData = extractRowDataOnResutSet(rsImpl);
                log("rowData     = " + rowData.getClass());
                assertTrue(rowData instanceof com.mysql.cj.protocol.a.result.ResultsetRowsStreaming);
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
                com.mysql.cj.jdbc.result.ResultSetImpl rsImpl = (com.mysql.cj.jdbc.result.ResultSetImpl) rs;
                com.mysql.cj.protocol.ResultsetRows rowData = extractRowDataOnResutSet(rsImpl);
                log("rowData     = " + rowData.getClass());
                assertTrue(rowData instanceof com.mysql.cj.protocol.a.result.ResultsetRowsStatic);
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
                com.mysql.cj.jdbc.result.ResultSetImpl rsImpl = (com.mysql.cj.jdbc.result.ResultSetImpl) rs;
                com.mysql.cj.protocol.ResultsetRows rowData = extractRowDataOnResutSet(rsImpl);
                log("rowData     = " + rowData.getClass());
                List<?> rows = extractRowsOnRowData(rowData);
                log("rows.size() = " + rows.size());
                assertEquals(countAll, rows.size());
                memberBhv.selectCount(new MemberCB()); // no exception
                memberBhv.selectList(new MemberCB()); // no exception
                assertEquals(0, memberBhv.getFetchSizeMap().get("selectList"));
                assertEquals(com.mysql.cj.protocol.a.result.ResultsetRowsStatic.class, memberBhv.getRowDataClassMap().get("selectList"));
                return null;
            }
        };

        // ## Act ##
        memberBhv.outsideSql().configure(conf -> conf.fetchSize(1)).selectCursor(pmb, handler);
    }

    public void test_cursorSelectFetchSize_selectList_static() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        int countAll = memberBhv.selectCount(cb);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        assertEquals(countAll, memberList.size());
        assertEquals(0, memberBhv.getFetchSizeMap().get("selectList"));
        assertEquals(com.mysql.cj.protocol.a.result.ResultsetRowsStatic.class, memberBhv.getRowDataClassMap().get("selectList"));
    }

    // ===================================================================================
    //                                                                   Reflection Helper
    //                                                                   =================
    protected com.mysql.cj.protocol.ResultsetRows extractRowDataOnResutSet(com.mysql.cj.jdbc.result.ResultSetImpl rsImpl) {
        Field rowDataField = DfReflectionUtil.getWholeField(com.mysql.cj.jdbc.result.ResultSetImpl.class, "rowData");
        return (com.mysql.cj.protocol.ResultsetRows) DfReflectionUtil.getValueForcedly(rowDataField, rsImpl);
    }

    protected List<?> extractRowsOnRowData(com.mysql.cj.protocol.ResultsetRows rowData) {
        Field rowsField = DfReflectionUtil.getWholeField(com.mysql.cj.protocol.a.result.ResultsetRowsStatic.class, "rows");
        return (List<?>) DfReflectionUtil.getValueForcedly(rowsField, rowData);
    }
}
