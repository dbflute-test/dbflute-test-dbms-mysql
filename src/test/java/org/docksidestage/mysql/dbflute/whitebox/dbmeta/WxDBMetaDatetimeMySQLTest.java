package org.docksidestage.mysql.dbflute.whitebox.dbmeta;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorCheckDbm;

/**
 * @author jflute
 * @since 1.3.1 (2026/01/14 Wednesday at ichihara)
 */
public class WxDBMetaDatetimeMySQLTest extends PlainTestCase {

    // ===================================================================================
    //                                                                  NotNull Constraint
    //                                                                  ==================
    public void test_dbmeta_view_notnull_confirmation() {
        VendorCheckDbm dbm = VendorCheckDbm.getInstance();
        assertNull(dbm.columnTypeOfDatetime().getDatetimePrecision());
        assertEquals(1, dbm.columnTypeOfDatetime1Millis().getDatetimePrecision());
        assertEquals(2, dbm.columnTypeOfDatetime2Millis().getDatetimePrecision());
        assertEquals(3, dbm.columnTypeOfDatetime3Millis().getDatetimePrecision());
        assertEquals(4, dbm.columnTypeOfDatetime4Micros().getDatetimePrecision());
        assertEquals(5, dbm.columnTypeOfDatetime5Micros().getDatetimePrecision());
        assertEquals(6, dbm.columnTypeOfDatetime6Micros().getDatetimePrecision());
    }
}
