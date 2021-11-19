package org.docksidestage.mysql.dbflute.howto;

import javax.annotation.Resource;

import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * <pre>
 * [Varying Update]
 * test_varyingUpdate_SelfCalculation_increment()
 * </pre>
 * @author jflute
 * @since 1.1.0 (2014/11/01 Saturday)
 */
public class SpecialtyUpdateTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // The behavior provides DB access methods. (defined as DI component)
    @Resource
    protected MemberBhv memberBhv;
    @Resource
    protected MemberServiceBhv memberServiceBhv;
    @Resource
    protected MemberWithdrawalBhv memberWithdrawalBhv;
    @Resource
    protected PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    public void test_varyingUpdate_SelfCalculation_increment() throws Exception {
        // ## Arrange ##
        Purchase before = purchaseBhv.selectByPK(3L).get();

        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();
        purchase.setVersionNo(before.getVersionNo());

        // ## Act ##
        purchaseBhv.varyingUpdate(purchase, op -> {
            op.self(cb -> cb.specify().columnPurchaseCount()).plus(1);
        });

        // ## Assert ##
        Purchase actual = purchaseBhv.selectByPK(3L).get();
        assertEquals(Integer.valueOf(before.getPurchaseCount() + 1), actual.getPurchaseCount());
        assertEquals(purchase.getVersionNo(), actual.getVersionNo());
        assertEquals(before.getRegisterDatetime(), actual.getRegisterDatetime());
        assertNotSame(before.getUpdateDatetime(), actual.getUpdateDatetime());

        // [SQL]
        // update PURCHASE set PURCHASE_COUNT = PURCHASE_COUNT + 1, PAYMENT_COMPLETE_FLG = 1, 
    }
}
