/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.exentity;

import org.dbflute.jdbc.ClassificationMeta;
import org.docksidestage.mysql.dbflute.bsentity.BsMemberStatus;

/**
 * The entity of member_status.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberStatus extends BsMemberStatus {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_maxPurchasePrice = "MAX_PURCHASE_PRICE";

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _maxPurchasePrice;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMaxPurchasePrice() {
        return _maxPurchasePrice;
    }

    public void setMaxPurchasePrice(Integer maxPurchasePrice) {
        this._maxPurchasePrice = maxPurchasePrice;
    }

    // ===================================================================================
    //                                                            for test: Classification
    //                                                            ========================
    protected boolean _nocheckClassification;

    public MemberStatus xznocheckClassification() {
        _nocheckClassification = true;
        return this;
    }

    @Override
    protected void checkClassificationCode(String columnDbName, ClassificationMeta meta, Object value) {
        if (!_nocheckClassification) {
            super.checkClassificationCode(columnDbName, meta, value);
        }
    }
}
