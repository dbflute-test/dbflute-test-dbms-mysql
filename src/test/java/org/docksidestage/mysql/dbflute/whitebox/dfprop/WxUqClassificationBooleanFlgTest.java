package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.exception.InvalidQueryRegisteredException;
import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.mysql.dbflute.allcommon.CDef.BooleanFlg;
import org.docksidestage.mysql.dbflute.cbean.WhiteUqClassificationFlgBitCB;
import org.docksidestage.mysql.dbflute.exentity.WhiteUqClassificationFlgBit;

/**
 * @author jflute
 */
public class WxUqClassificationBooleanFlgTest extends PlainTestCase {

    public void test_entity() throws Exception {
        WhiteUqClassificationFlgBit bit = new WhiteUqClassificationFlgBit();
        assertNull(bit.getUqClsBitFlg());
        bit.setUqClsBitFlgAsBooleanFlg(BooleanFlg.True);
        assertTrue(bit.isUqClsBitFlgTrue());
        bit.setUqClsBitFlg_False();
        assertFalse(bit.isUqClsBitFlgTrue());
        bit.setUqClsBitFlgAsBooleanFlg(null);
    }

    public void test_conditionBean() throws Exception {
        {
            WhiteUqClassificationFlgBitCB cb = new WhiteUqClassificationFlgBitCB();
            assertNotContains(cb.toDisplaySql(), "UQ_CLS_BIT_FLG =");
        }
        {
            WhiteUqClassificationFlgBitCB cb = new WhiteUqClassificationFlgBitCB();
            cb.query().setUqClsBitFlg_Equal_False();
            assertContains(cb.toDisplaySql(), "UQ_CLS_BIT_FLG = false");
        }
        {
            WhiteUqClassificationFlgBitCB cb = new WhiteUqClassificationFlgBitCB();
            cb.query().setUqClsBitFlg_Equal_True();
            assertContains(cb.toDisplaySql(), "UQ_CLS_BIT_FLG = true");
        }
        {
            WhiteUqClassificationFlgBitCB cb = new WhiteUqClassificationFlgBitCB();
            cb.query().setUqClsBitFlg_Equal_AsBooleanFlg(BooleanFlg.True);
            assertContains(cb.toDisplaySql(), "UQ_CLS_BIT_FLG = true");
        }
        {
            WhiteUqClassificationFlgBitCB cb = new WhiteUqClassificationFlgBitCB();
            try {
                cb.query().setUqClsBitFlg_Equal_AsBooleanFlg(null);
                fail();
            } catch (InvalidQueryRegisteredException e) {
                log(e.getMessage());
            }
        }
        {
            WhiteUqClassificationFlgBitCB cb = new WhiteUqClassificationFlgBitCB();
            cb.acceptUniqueOf("sea", BooleanFlg.True);
            assertContains(cb.toDisplaySql(), "UQ_CLS_BIT_FLG = true");
        }
    }
}
