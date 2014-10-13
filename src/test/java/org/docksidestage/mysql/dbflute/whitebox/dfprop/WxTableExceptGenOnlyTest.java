package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.exception.DBMetaNotFoundException;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.8.2 (2011/04/07 Thursday)
 */
public class WxTableExceptGenOnlyTest extends UnitContainerTestCase {

    public void test_except_generateOnly() {
        // ## Arrange ##
        final String tableName = "white_table_except_gen_only";

        // ## Act ##
        try {
            DBMetaInstanceHandler.findDBMeta(tableName);

            // ## Assert ##
            fail("The table should be generate-only excepted: " + tableName);
        } catch (DBMetaNotFoundException e) {
            // OK
            log(e.getMessage());
        }
    }
}
