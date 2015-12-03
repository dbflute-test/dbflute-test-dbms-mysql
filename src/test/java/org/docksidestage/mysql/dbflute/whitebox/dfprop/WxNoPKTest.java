package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.bhv.BehaviorReadable;
import org.dbflute.bhv.BehaviorWritable;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteNoPkCommonColumnDbm;
import org.docksidestage.mysql.dbflute.exbhv.WhiteNoPkCommonColumnBhv;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxNoPKTest extends UnitContainerTestCase {

    private WhiteNoPkCommonColumnBhv whiteNoPkCommonColumnBhv;

    public void test_commonColumn_basic() throws Exception {
        assertTrue(WhiteNoPkCommonColumnDbm.getInstance().hasCommonColumn());
        assertTrue(whiteNoPkCommonColumnBhv instanceof BehaviorReadable);
        assertFalse(whiteNoPkCommonColumnBhv instanceof BehaviorWritable);
        whiteNoPkCommonColumnBhv.selectList(cb -> {
            cb.query().addOrderBy_NoPkId_Desc();
        }); // expects no exception
    }
}
