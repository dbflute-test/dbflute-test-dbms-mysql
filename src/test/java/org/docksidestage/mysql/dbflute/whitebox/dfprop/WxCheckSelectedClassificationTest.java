package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.exception.UndefinedClassificationCodeException;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.7 (2010/04/01 Thursday)
 */
public class WxCheckSelectedClassificationTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_select_correct_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        purchaseBhv.selectByPK(3L).alwaysPresent(actual -> {
            /* ## Assert ## */
            assertNotNull(actual.getPaymentCompleteFlg());
            assertTrue(actual.isPaymentCompleteFlgTrue());
        });
    }

    public void test_select_correct_classification_relation() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member();
        cb.query().setPurchaseId_Equal(3L);

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
        assertNotNull(actual.getMember().get().getMemberStatusCode());
        assertNotNull(actual.getMember().get().getMemberStatusCodeAsMemberStatus());
    }

    public void test_select_illegal_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.xznocheckSetPaymentCompleteFlg(99999);
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        try {
            purchaseBhv.selectByPK(3L);

            // ## Assert ##
            fail();
        } catch (UndefinedClassificationCodeException e) {
            // OK
            log(e.getMessage());
        }
    }
}
