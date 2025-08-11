package org.docksidestage.mysql.dbflute.whitebox.dbmeta;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSummaryBasicProductDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSummaryComplexProductDbm;

/**
 * created by this issue:
 * https://github.com/dbflute/dbflute-core/issues/200
 * @author jflute
 * @since 1.2.8 (2024/02/13 Tuesday)
 */
public class WxDBMetaViewMySQLTest extends PlainTestCase {

    // ===================================================================================
    //                                                                  NotNull Constraint
    //                                                                  ==================
    public void test_dbmeta_view_notnull_confirmation() {
        doTest_dbmeta_view_notnull_confirmation_basicPattern();
        doTest_dbmeta_view_notnull_confirmation_complexPattern();
    }

    private void doTest_dbmeta_view_notnull_confirmation_basicPattern() {
        WhiteSummaryBasicProductDbm basicDbm = WhiteSummaryBasicProductDbm.getInstance();
        assertTrue(basicDbm.columnProductName().isNotNull());
        assertTrue(basicDbm.columnProductHandleCode().isNotNull());
    }

    private void doTest_dbmeta_view_notnull_confirmation_complexPattern() {
        WhiteSummaryComplexProductDbm complexDbm = WhiteSummaryComplexProductDbm.getInstance();

        // changed since MySQL-8.0.x?
        //assertTrue(complexDbm.columnProductName().isNotNull());
        assertFalse(complexDbm.columnProductName().isNotNull());

        // me too
        //assertTrue(complexDbm.columnProductName().isNotNull());
        assertFalse(complexDbm.columnProductHandleCode().isNotNull());

        assertFalse(complexDbm.columnLatestPurchaseDatetime().isNotNull());
    }
}
