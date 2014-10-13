package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.exception.IllegalBehaviorStateException;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WithdrawalReasonDbm;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5G (2014/06/01 Sunday)
 */
public class WxSuppressDBAccessClassTest extends UnitContainerTestCase {

    private BehaviorSelector selector;

    public void test_suppressed() throws Exception {
        // ## Arrange ##
        String tableDbName = WithdrawalReasonDbm.getInstance().getTableDbName();

        // ## Act ##
        try {
            selector.byName(tableDbName);
            // ## Assert ##
            fail();
        } catch (IllegalBehaviorStateException e) {
            log(e.getMessage());
        }
    }
}
