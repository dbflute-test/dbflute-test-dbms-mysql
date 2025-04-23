package org.docksidestage.mysql.dbflute.whitebox.outsidesql;

import org.docksidestage.mysql.dbflute.exbhv.pmbean.FnNoParameterPmb;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.9 (2025/04/23 Wednesday at ichihara)
 */
public class WxProcedureTypeMappingTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                            Function
    //                                                                            ========
    public void test_function_returnValueName() { // expects compile-safe
        FnNoParameterPmb pmb = new FnNoParameterPmb();
        Integer returnValue = pmb.getReturnValue(); // named as returnValue
        log(returnValue);
    }
}
