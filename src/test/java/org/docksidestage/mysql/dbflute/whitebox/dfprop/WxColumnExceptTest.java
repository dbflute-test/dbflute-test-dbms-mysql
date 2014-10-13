package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.exception.DBMetaNotFoundException;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorCheckDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteColumnExceptDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteColumnExceptGenOnlyDbm;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.4 (2009/08/31 Monday)
 */
public class WxColumnExceptTest extends UnitContainerTestCase {

    public void test_exceptColumn_notExists() {
        // ## Arrange ##
        String exceptColumn = WhiteColumnExceptDbm.getInstance().columnColumnExceptTest().getColumnDbName();

        // ## Act ##
        boolean actual = VendorCheckDbm.getInstance().hasColumn(exceptColumn);

        // ## Assert ##
        assertFalse(actual);
    }

    public void test_exceptColumn_genOnly() {
        // ## Arrange ##
        WhiteColumnExceptGenOnlyDbm dbm = WhiteColumnExceptGenOnlyDbm.getInstance();

        // ## Act ##
        try {
            dbm.findColumnInfo("THIS_IS_GEN_ONLY");

            // ## Assert ##
            fail();
        } catch (DBMetaNotFoundException e) {
            // OK
            log(e.getMessage());
        }
    }
}
