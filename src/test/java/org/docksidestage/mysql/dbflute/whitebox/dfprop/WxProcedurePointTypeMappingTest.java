package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.time.LocalDate;
import java.util.List;

import org.docksidestage.mysql.dbflute.exbhv.WhitePointTypeMappingBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SpPointTypeMappingPmb;
import org.docksidestage.mysql.dbflute.exentity.customize.SpPointTypeMappingNotParamResult1;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.9 (2025/04/18 Friday at ichihara)
 */
public class WxProcedurePointTypeMappingTest extends UnitContainerTestCase {

    private WhitePointTypeMappingBhv whitePointTypeMappingBhv;

    public void test_procedureParameter_pointTypeMapping() throws Exception { // expects compile-safe
        // ## Arrange ##
        LocalDate inDate = LocalDate.of(2025, 4, 18);
        SpPointTypeMappingPmb pmb = new SpPointTypeMappingPmb();
        pmb.setVInVarchar(inDate);
        pmb.setVInoutVarchar("land");

        // ## Act ##
        whitePointTypeMappingBhv.outsideSql().call(pmb);

        // ## Assert ##
        LocalDate vInVarchar = pmb.getVInVarchar();
        String vOutVarchar = pmb.getVOutVarchar();
        String vInoutVarchar = pmb.getVInoutVarchar();
        log(vInVarchar, vOutVarchar, vInoutVarchar);
        assertEquals(inDate, vInVarchar);
        assertEquals("land", vOutVarchar);
        assertEquals(inDate.toString(), vInoutVarchar);

        List<SpPointTypeMappingNotParamResult1> result1List = pmb.getNotParamResult1();
        for (SpPointTypeMappingNotParamResult1 result1 : result1List) {
            LocalDate memberName = result1.getMemberName(); // changed by typeMapping
            log(memberName);
        }
    }
}
