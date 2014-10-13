package org.docksidestage.mysql.dbflute.whitebox;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.WhiteOnlyOneToOneFromCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteOnlyOneToOneFromBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteOnlyOneToOneToBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteOnlyOneToOneFrom;
import org.docksidestage.mysql.dbflute.exentity.WhiteOnlyOneToOneTo;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5G (2014/05/18 Tuesday)
 */
public class WxOnlyOneToOneTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteOnlyOneToOneFromBhv whiteOnlyOneToOneFromBhv;
    private WhiteOnlyOneToOneToBhv whiteOnlyOneToOneToBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_basic() throws Exception {
        // ## Arrange ##
        registerTestData();
        WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
        cb.setupSelect_WhiteOnlyOneToOneToAsOne();

        // ## Act ##
        ListResultBean<WhiteOnlyOneToOneFrom> fromList = whiteOnlyOneToOneFromBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(fromList);
        for (WhiteOnlyOneToOneFrom from : fromList) {
            log(from);
        }
    }

    protected void registerTestData() {
        WhiteOnlyOneToOneFrom from = new WhiteOnlyOneToOneFrom();
        from.setFromName("basic from");
        whiteOnlyOneToOneFromBhv.insert(from);
        WhiteOnlyOneToOneTo to = new WhiteOnlyOneToOneTo();
        to.setFromId(from.getFromId());
        to.setToName("basic to");
        whiteOnlyOneToOneToBhv.insert(to);
    }
}
