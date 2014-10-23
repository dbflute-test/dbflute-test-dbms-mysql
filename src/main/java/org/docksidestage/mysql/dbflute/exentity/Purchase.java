/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.exentity;

import org.docksidestage.mysql.dbflute.bsentity.BsPurchase;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.PurchaseDbm;

/**
 * The entity of purchase.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Purchase extends BsPurchase {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                            for test: Classification
    //                                                            ========================
    public void xznocheckSetPaymentCompleteFlg(Integer flg) {
        registerModifiedProperty(PurchaseDbm.getInstance().columnPaymentCompleteFlg().getPropertyName());
        _paymentCompleteFlg = flg;
    }
}
