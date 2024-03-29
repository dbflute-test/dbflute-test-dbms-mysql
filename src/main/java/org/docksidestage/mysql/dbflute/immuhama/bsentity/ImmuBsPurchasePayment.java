/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.mysql.dbflute.immuhama.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuDBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuCDef;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The entity of (購入支払)PURCHASE_PAYMENT as TABLE. <br>
 * 購入に対する支払。<br>
 * 分割払いもできるのでmanyとなり、会員からの孫テーブルのテストができてうれしい。
 * <pre>
 * [primary-key]
 *     PURCHASE_PAYMENT_ID
 *
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_PAYMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PURCHASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchasePaymentId = entity.getPurchasePaymentId();
 * Long purchaseId = entity.getPurchaseId();
 * java.math.BigDecimal paymentAmount = entity.getPaymentAmount();
 * java.time.LocalDateTime paymentDatetime = entity.getPaymentDatetime();
 * String paymentMethodCode = entity.getPaymentMethodCode();
 * entity.setPurchasePaymentId(purchasePaymentId);
 * entity.setPurchaseId(purchaseId);
 * entity.setPaymentAmount(paymentAmount);
 * entity.setPaymentDatetime(paymentDatetime);
 * entity.setPaymentMethodCode(paymentMethodCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsPurchasePayment extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _purchasePaymentId;

    /** (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} */
    protected Long _purchaseId;

    /** (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} */
    protected java.math.BigDecimal _paymentAmount;

    /** (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _paymentDatetime;

    /** (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} */
    protected String _paymentMethodCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ImmuDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "purchase_payment";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchasePaymentId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentMethodCode as the classification of PaymentMethod. <br>
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br>
     * 支払方法
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public ImmuCDef.PaymentMethod getPaymentMethodCodeAsPaymentMethod() {
        return ImmuCDef.PaymentMethod.of(getPaymentMethodCode()).orElse(null);
    }

    /**
     * Set the value of paymentMethodCode as the classification of PaymentMethod. <br>
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br>
     * 支払方法
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentMethodCodeAsPaymentMethod(ImmuCDef.PaymentMethod cdef) {
        setPaymentMethodCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentMethodCode as ByHand (HAN). <br>
     * 手渡し: Face-to-Faceの手渡しで商品と交換
     */
    public void setPaymentMethodCode_ByHand() {
        setPaymentMethodCodeAsPaymentMethod(ImmuCDef.PaymentMethod.ByHand);
    }

    /**
     * Set the value of paymentMethodCode as BankTransfer (BAK). <br>
     * 銀行振込: 銀行振込で確認してから商品発送
     */
    public void setPaymentMethodCode_BankTransfer() {
        setPaymentMethodCodeAsPaymentMethod(ImmuCDef.PaymentMethod.BankTransfer);
    }

    /**
     * Set the value of paymentMethodCode as CreditCard (CRC). <br>
     * クレジットカード: クレジットカードの番号を教えてもらう
     */
    public void setPaymentMethodCode_CreditCard() {
        setPaymentMethodCodeAsPaymentMethod(ImmuCDef.PaymentMethod.CreditCard);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentMethodCode ByHand? <br>
     * 手渡し: Face-to-Faceの手渡しで商品と交換
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeByHand() {
        ImmuCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(ImmuCDef.PaymentMethod.ByHand) : false;
    }

    /**
     * Is the value of paymentMethodCode BankTransfer? <br>
     * 銀行振込: 銀行振込で確認してから商品発送
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeBankTransfer() {
        ImmuCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(ImmuCDef.PaymentMethod.BankTransfer) : false;
    }

    /**
     * Is the value of paymentMethodCode CreditCard? <br>
     * クレジットカード: クレジットカードの番号を教えてもらう
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeCreditCard() {
        ImmuCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(ImmuCDef.PaymentMethod.CreditCard) : false;
    }

    /**
     * 最も推奨されている方法 <br>
     * The group elements:[ByHand]
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCode_Recommended() {
        ImmuCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null && cdef.isRecommended();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentMethodCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentMethodCodeName() {
        ImmuCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'paymentMethodCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getPaymentMethodCodeAlias() {
        ImmuCDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (購入)PURCHASE by my PURCHASE_ID, named 'purchase'. */
    protected OptionalEntity<ImmuPurchase> _purchase;

    /**
     * [get] (購入)PURCHASE by my PURCHASE_ID, named 'purchase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'purchase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuPurchase> getPurchase() {
        if (_purchase == null) { _purchase = OptionalEntity.relationEmpty(this, "purchase"); }
        return _purchase;
    }

    /**
     * [set] (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (NullAllowed)
     */
    public void setPurchase(OptionalEntity<ImmuPurchase> purchase) {
        _purchase = purchase;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof ImmuBsPurchasePayment) {
            ImmuBsPurchasePayment other = (ImmuBsPurchasePayment)obj;
            if (!xSV(_purchasePaymentId, other._purchasePaymentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _purchasePaymentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null && _purchase.isPresent())
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchasePaymentId));
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_paymentAmount));
        sb.append(dm).append(xfND(_paymentDatetime));
        sb.append(dm).append(xfND(_paymentMethodCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null && _purchase.isPresent())
        { sb.append(dm).append("purchase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ImmuPurchasePayment clone() {
        return (ImmuPurchasePayment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 連番
     * @return The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchasePaymentId() {
        checkSpecifiedProperty("purchasePaymentId");
        return _purchasePaymentId;
    }

    /**
     * [set] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 連番
     * @param purchasePaymentId The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePaymentId(Long purchasePaymentId) {
        registerModifiedProperty("purchasePaymentId");
        _purchasePaymentId = purchasePaymentId;
    }

    /**
     * [get] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br>
     * 支払い対象の購入へのID
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br>
     * 支払い対象の購入へのID
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br>
     * 支払った金額。さて、小数点なのはなぜでしょう？
     * @return The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPaymentAmount() {
        checkSpecifiedProperty("paymentAmount");
        return _paymentAmount;
    }

    /**
     * [set] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br>
     * 支払った金額。さて、小数点なのはなぜでしょう？
     * @param paymentAmount The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        registerModifiedProperty("paymentAmount");
        _paymentAmount = paymentAmount;
    }

    /**
     * [get] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)} <br>
     * 支払ったときの日時
     * @return The value of the column 'PAYMENT_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPaymentDatetime() {
        checkSpecifiedProperty("paymentDatetime");
        return _paymentDatetime;
    }

    /**
     * [set] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)} <br>
     * 支払ったときの日時
     * @param paymentDatetime The value of the column 'PAYMENT_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentDatetime(java.time.LocalDateTime paymentDatetime) {
        registerModifiedProperty("paymentDatetime");
        _paymentDatetime = paymentDatetime;
    }

    /**
     * [get] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br>
     * 手渡しや銀行振込など
     * @return The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getPaymentMethodCode() {
        checkSpecifiedProperty("paymentMethodCode");
        return _paymentMethodCode;
    }

    /**
     * [set] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br>
     * 手渡しや銀行振込など
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setPaymentMethodCode(String paymentMethodCode) {
        checkClassificationCode("PAYMENT_METHOD_CODE", ImmuCDef.DefMeta.PaymentMethod, paymentMethodCode);
        registerModifiedProperty("paymentMethodCode");
        _paymentMethodCode = paymentMethodCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingPaymentMethodCode(String paymentMethodCode) {
        setPaymentMethodCode(paymentMethodCode);
    }
}
