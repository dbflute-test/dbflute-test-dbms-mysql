package org.docksidestage.mysql.dbflute.whitebox;

import org.dbflute.outsidesql.typed.TypedParameterBean;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.WrongPackageBqpPmb;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxWrongPackageBqpTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    //private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_select_update_binary() {
        // ## Arrange ##
        WrongPackageBqpPmb pmb = new WrongPackageBqpPmb();

        // ## Act ##
        // should be compile error
        //memberBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertFalse(pmb instanceof TypedParameterBean<?>);
    }
}
