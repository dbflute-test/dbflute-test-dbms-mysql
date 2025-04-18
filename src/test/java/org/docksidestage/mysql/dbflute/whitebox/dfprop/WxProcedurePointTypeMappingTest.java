package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.docksidestage.mysql.dbflute.exbhv.WhitePointTypeMappingBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SpPointTypeMappingPmb;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.9 (2025/04/18 Friday at ichihara)
 */
public class WxProcedurePointTypeMappingTest extends UnitContainerTestCase {

    private WhitePointTypeMappingBhv whitePointTypeMappingBhv;

    public void test_procedureParameter_pointTypeMapping() throws Exception { // expects compile-safe
        // ## Arrange ##
        SpPointTypeMappingPmb pmb = new SpPointTypeMappingPmb();
        pmb.setVInVarchar("sea");
        pmb.setVInoutVarchar("land");

        // ## Act ##
        whitePointTypeMappingBhv.outsideSql().call(pmb);

        // ## Assert ##
        String vInVarchar = pmb.getVInVarchar();
        String vOutVarchar = pmb.getVOutVarchar();
        String vInoutVarchar = pmb.getVInoutVarchar();
        log(vInVarchar, vOutVarchar, vInoutVarchar);
    }
}
