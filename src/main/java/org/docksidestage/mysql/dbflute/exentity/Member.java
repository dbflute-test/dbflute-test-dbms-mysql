/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.exentity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.dbflute.jdbc.ClassificationMeta;

/**
 * The entity of member. <br>
 * You can implement your original methods here. <br>
 * This class is NOT overrided when re-generating. <br>
 * @author DBFlute(AutoGenerator)
 */
public class Member extends org.docksidestage.mysql.dbflute.bsentity.BsMember {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_highestPurchasePrice = "HIGHEST_PURCHASE_PRICE";
    public static final String ALIAS_latestLoginDatetime = "LATEST_LOGIN_DATETIME";
    public static final String ALIAS_loginCount = "LOGIN_COUNT";
    public static final String ALIAS_productKindCount = "PRODUCT_KIND_COUNT";
    public static final String ALIAS_groupExpression = "GROUP_EXPRESSION";

    /** AVERAGE_PURCHASE_PRICE: Derived Referrer Alias. */
    public static final String ALIAS_averagePurchasePrice = "AVERAGE_PURCHASE_PRICE";

    /** FIRST: Derived Referrer Alias. */
    public static final String ALIAS_first = "FIRST";

    /** SECOND: Derived Referrer Alias. */
    public static final String ALIAS_second = "SECOND";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _highestPurchasePrice;
    protected LocalDateTime _latestLoginDatetime;
    protected Integer _loginCount;
    protected Integer _productKindCount;
    protected String _groupExpression;

    /** AVERAGE_PURCHASE_PRICE: (Derived Referrer) */
    protected BigDecimal _averagePurchasePrice;

    /** FIRST: (Derived Referrer) */
    protected Integer _first;

    /** SECOND: (Derived Referrer) */
    protected Integer _second;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getHighestPurchasePrice() {
        return _highestPurchasePrice;
    }

    public void setHighestPurchasePrice(Integer highestPurchasePrice) {
        this._highestPurchasePrice = highestPurchasePrice;
    }

    public LocalDateTime getLatestLoginDatetime() {
        return _latestLoginDatetime;
    }

    public void setLatestLoginDatetime(LocalDateTime latestLoginDatetime) {
        _latestLoginDatetime = latestLoginDatetime;
    }

    public Integer getLoginCount() {
        return _loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this._loginCount = loginCount;
    }

    public Integer getProductKindCount() {
        return _productKindCount;
    }

    public void setProductKindCount(Integer productKindCount) {
        this._productKindCount = productKindCount;
    }

    public String getGroupExpression() {
        return _groupExpression;
    }

    public void setGroupExpression(String groupExpression) {
        this._groupExpression = groupExpression;
    }

    /**
     * [get] FIRST: (Derived Referrer)
     * @return The value of the column 'FIRST'. (NullAllowed)
     */
    public Integer getFirst() {
        return _first;
    }

    /**
     * [set] FIRST: (Derived Referrer)
     * @param first The value of the column 'FIRST'. (NullAllowed)
     */
    public void setFirst(Integer first) {
        _first = first;
    }

    /**
     * [get] SECOND: (Derived Referrer)
     * @return The value of the column 'SECOND'. (NullAllowed)
     */
    public Integer getSecond() {
        return _second;
    }

    /**
     * [set] SECOND: (Derived Referrer)
     * @param second The value of the column 'SECOND'. (NullAllowed)
     */
    public void setSecond(Integer second) {
        _second = second;
    }

    // ===================================================================================
    //                                                            for test: Classification
    //                                                            ========================
    protected boolean _nocheckClassification;

    public Member xznocheckClassification() {
        _nocheckClassification = true;
        return this;
    }

    @Override
    protected void checkClassificationCode(String columnDbName, ClassificationMeta meta, Object value) {
        if (!_nocheckClassification) {
            super.checkClassificationCode(columnDbName, meta, value);
        }
    }

    /**
     * [get] AVERAGE_PURCHASE_PRICE: (Derived Referrer)
     * @return The value of the column 'AVERAGE_PURCHASE_PRICE'. (NullAllowed)
     */
    public BigDecimal getAveragePurchasePrice() {
        return _averagePurchasePrice;
    }

    /**
     * [set] AVERAGE_PURCHASE_PRICE: (Derived Referrer)
     * @param averagePurchasePrice The value of the column 'AVERAGE_PURCHASE_PRICE'. (NullAllowed)
     */
    public void setAveragePurchasePrice(BigDecimal averagePurchasePrice) {
        _averagePurchasePrice = averagePurchasePrice;
    }
}
