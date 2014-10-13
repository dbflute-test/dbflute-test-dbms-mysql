package org.docksidestage.mysql.dbflute.whitebox.runtime;

import org.dbflute.exception.SQLFailureException;
import org.docksidestage.mysql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.1 (2012/12/18 Tuesday)
 */
public class WxSQLFailureExceptionProcedureTest extends UnitContainerTestCase {

    private VendorCheckBhv vendorCheckBhv;

    public void test_Procedure_basic() {
        // ## Arrange ##
        SpInOutParameterPmb pmb = new SpInOutParameterPmb();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("0123456789");
        }
        pmb.setVInVarchar(sb.toString());

        try {
            // ## Act ##
            vendorCheckBhv.outsideSql().call(pmb);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            String msg = e.getMessage();
            log(msg);
            assertTrue(msg.contains("Failed to execute the procedure."));
            assertTrue(msg.contains("VendorCheckBhv.outsideSql().call()"));
            assertTrue(msg.contains("Display SQL"));
            assertTrue(msg.contains("{call SP_"));
        }
    }
}
