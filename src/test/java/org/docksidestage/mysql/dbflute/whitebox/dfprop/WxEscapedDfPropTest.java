package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.util.Map;
import java.util.stream.Collectors;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.cbean.WhiteEscapedDfpropCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteEscapedDfpropBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteEscapedDfprop;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4A (2013/03/27 Wednesday)
 */
public class WxEscapedDfPropTest extends UnitContainerTestCase {

    private WhiteEscapedDfpropBhv whiteEscapedDfpropBhv;

    public void test_LoadData_basic() {
        // ## Arrange ##
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
        cb.query().addOrderBy_EscapedDfpropCode_Asc();

        // ## Act ##
        ListResultBean<WhiteEscapedDfprop> dfpropList = whiteEscapedDfpropBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(dfpropList);
        for (WhiteEscapedDfprop dfprop : dfpropList) {
            log(dfprop.getEscapedDfpropCode(), dfprop.getEscapedDfpropName());
        }
        Map<String, WhiteEscapedDfprop> resultMap =
                dfpropList.stream().collect(Collectors.toMap(bean -> bean.getEscapedDfpropCode(), bean -> bean));

        assertEquals("ab=cd", resultMap.get(";@\\").getEscapedDfpropName());
        assertEquals("}}{", resultMap.get("\\};").getEscapedDfpropName());
        assertEquals(";\\\\", resultMap.get("{=}").getEscapedDfpropName());
    }

    public void test_dfprop_hardcode() throws Exception {
        // confirm topComment by your eyes
        assertEquals(";@\\", CDef.EscapedDfpropCls.First.code());
        assertEquals("\\};", CDef.EscapedDfpropCls.Second.code());
        assertEquals("{=}", CDef.EscapedDfpropCls.Third.code());
    }

    public void test_dfprop_NumberInitial_basic() throws Exception {
        assertEquals("1FO", CDef.EscapedNumberInitialCls.N1Foo.code());
        assertEquals("3BA", CDef.EscapedNumberInitialCls.N3Bar.code());
        assertEquals("7QU", CDef.EscapedNumberInitialCls.N7Qux.code());
        assertEquals("CO9", CDef.EscapedNumberInitialCls.Corge9.code());
    }
}
