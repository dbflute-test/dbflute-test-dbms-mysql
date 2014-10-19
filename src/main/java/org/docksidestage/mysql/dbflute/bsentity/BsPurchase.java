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
package org.docksidestage.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.docksidestage.mysql.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of (購入)PURCHASE as TABLE. <br />
 * 一つの商品に対する一回の購入を表現する。<br />
 * 一回の購入で一つの商品を複数個買うこともある。
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 * 
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     member, product, SUMMARY_PRODUCT, SUMMARY_WITHDRAWAL, WHITE_NO_PK_RELATION, PURCHASE, MEMBER_ADDRESS(AsSkipRelation), white_purchase_referrer(AsOne), purchase(AsOne)
 * 
 * [referrer table]
 *     purchase_payment, white_purchase_referrer, purchase
 * 
 * [foreign property]
 *     member, product, summaryProduct, summaryWithdrawal, whiteNoPkRelation, purchaseSelf, memberAddressAsSkipRelation, whitePurchaseReferrerAsOne, purchaseSelfAsOne
 * 
 * [referrer property]
 *     purchasePaymentList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Integer productId = entity.getProductId();
 * java.sql.Timestamp purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * Integer paymentCompleteFlg = entity.getPaymentCompleteFlg();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductId(productId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setPaymentCompleteFlg(paymentCompleteFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchase extends AbstractEntity implements EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE} */
    protected Long _purchaseId;

    /** (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product} */
    protected Integer _productId;

    /** (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _purchaseDatetime;

    /** (購入数量)PURCHASE_COUNT: {NotNull, INT(10)} */
    protected Integer _purchaseCount;

    /** (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)} */
    protected Integer _purchasePrice;

    /** (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} */
    protected Integer _paymentCompleteFlg;

    /** REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;


    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "purchase";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "purchase";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchaseId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX+, NotNull, INT(10), FK to member. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, INT(10), FK to product. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, DATETIME(19). (NotNull)
     */
    public void uniqueBy(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("purchaseDatetime");
        setMemberId(memberId);setProductId(productId);setPurchaseDatetime(purchaseDatetime);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * フラグを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getPaymentCompleteFlgAsFlg() {
        return CDef.Flg.codeOf(getPaymentCompleteFlg());
    }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentCompleteFlgAsFlg(CDef.Flg cdef) {
        setPaymentCompleteFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True (1). <br />
     * はい: 有効を示す
     */
    public void setPaymentCompleteFlg_True() {
        setPaymentCompleteFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of paymentCompleteFlg as False (0). <br />
     * いいえ: 無効を示す
     */
    public void setPaymentCompleteFlg_False() {
        setPaymentCompleteFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br />
     * はい: 有効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgTrue() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of paymentCompleteFlg False? <br />
     * いいえ: 無効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgFalse() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentCompleteFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgName() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'paymentCompleteFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgAlias() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)member by my MEMBER_ID, named 'member'. */
    protected Member _member;

    /**
     * [get] (会員)member by my MEMBER_ID, named 'member'. <br />
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] (会員)member by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    /** (商品)product by my PRODUCT_ID, named 'product'. */
    protected Product _product;

    /**
     * [get] (商品)product by my PRODUCT_ID, named 'product'. <br />
     * @return The entity of foreign property 'product'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Product getProduct() {
        return _product;
    }

    /**
     * [set] (商品)product by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(Product product) {
        _product = product;
    }

    /** (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'. */
    protected SummaryProduct _summaryProduct;

    /**
     * [get] (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'. <br />
     * @return The entity of foreign property 'summaryProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public SummaryProduct getSummaryProduct() {
        return _summaryProduct;
    }

    /**
     * [set] (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
     * @param summaryProduct The entity of foreign property 'summaryProduct'. (NullAllowed)
     */
    public void setSummaryProduct(SummaryProduct summaryProduct) {
        _summaryProduct = summaryProduct;
    }

    /** (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'. */
    protected SummaryWithdrawal _summaryWithdrawal;

    /**
     * [get] (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'. <br />
     * @return The entity of foreign property 'summaryWithdrawal'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public SummaryWithdrawal getSummaryWithdrawal() {
        return _summaryWithdrawal;
    }

    /**
     * [set] (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
     * @param summaryWithdrawal The entity of foreign property 'summaryWithdrawal'. (NullAllowed)
     */
    public void setSummaryWithdrawal(SummaryWithdrawal summaryWithdrawal) {
        _summaryWithdrawal = summaryWithdrawal;
    }

    /** (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'. */
    protected WhiteNoPkRelation _whiteNoPkRelation;

    /**
     * [get] (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'. <br />
     * @return The entity of foreign property 'whiteNoPkRelation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteNoPkRelation getWhiteNoPkRelation() {
        return _whiteNoPkRelation;
    }

    /**
     * [set] (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * @param whiteNoPkRelation The entity of foreign property 'whiteNoPkRelation'. (NullAllowed)
     */
    public void setWhiteNoPkRelation(WhiteNoPkRelation whiteNoPkRelation) {
        _whiteNoPkRelation = whiteNoPkRelation;
    }

    /** (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'. */
    protected Purchase _purchaseSelf;

    /**
     * [get] (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'. <br />
     * @return The entity of foreign property 'purchaseSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Purchase getPurchaseSelf() {
        return _purchaseSelf;
    }

    /**
     * [set] (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @param purchaseSelf The entity of foreign property 'purchaseSelf'. (NullAllowed)
     */
    public void setPurchaseSelf(Purchase purchaseSelf) {
        _purchaseSelf = purchaseSelf;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'. */
    protected MemberAddress _memberAddressAsSkipRelation;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'. <br />
     * @return The entity of foreign property 'memberAddressAsSkipRelation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsSkipRelation() {
        return _memberAddressAsSkipRelation;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * @param memberAddressAsSkipRelation The entity of foreign property 'memberAddressAsSkipRelation'. (NullAllowed)
     */
    public void setMemberAddressAsSkipRelation(MemberAddress memberAddressAsSkipRelation) {
        _memberAddressAsSkipRelation = memberAddressAsSkipRelation;
    }

    /** white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'. */
    protected WhitePurchaseReferrer _whitePurchaseReferrerAsOne;

    /**
     * [get] white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'whitePurchaseReferrerAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public WhitePurchaseReferrer getWhitePurchaseReferrerAsOne() {
        return _whitePurchaseReferrerAsOne;
    }

    /**
     * [set] white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @param whitePurchaseReferrerAsOne The entity of foreign property(referrer-as-one) 'whitePurchaseReferrerAsOne'. (NullAllowed)
     */
    public void setWhitePurchaseReferrerAsOne(WhitePurchaseReferrer whitePurchaseReferrerAsOne) {
        _whitePurchaseReferrerAsOne = whitePurchaseReferrerAsOne;
    }

    /** (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'. */
    protected Purchase _purchaseSelfAsOne;

    /**
     * [get] (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'purchaseSelfAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public Purchase getPurchaseSelfAsOne() {
        return _purchaseSelfAsOne;
    }

    /**
     * [set] (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @param purchaseSelfAsOne The entity of foreign property(referrer-as-one) 'purchaseSelfAsOne'. (NullAllowed)
     */
    public void setPurchaseSelfAsOne(Purchase purchaseSelfAsOne) {
        _purchaseSelfAsOne = purchaseSelfAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入支払)purchase_payment by PURCHASE_ID, named 'purchasePaymentList'. */
    protected List<PurchasePayment> _purchasePaymentList;

    /**
     * [get] (購入支払)purchase_payment by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The entity list of referrer property 'purchasePaymentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PurchasePayment> getPurchasePaymentList() {
        if (_purchasePaymentList == null) { _purchasePaymentList = newReferrerList(); }
        return _purchasePaymentList;
    }

    /**
     * [set] (購入支払)purchase_payment by PURCHASE_ID, named 'purchasePaymentList'.
     * @param purchasePaymentList The entity list of referrer property 'purchasePaymentList'. (NullAllowed)
     */
    public void setPurchasePaymentList(List<PurchasePayment> purchasePaymentList) {
        _purchasePaymentList = purchasePaymentList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPurchase) {
            BsPurchase other = (BsPurchase)obj;
            if (!xSV(_purchaseId, other._purchaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _purchaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_product != null)
        { sb.append(li).append(xbRDS(_product, "product")); }
        if (_summaryProduct != null)
        { sb.append(li).append(xbRDS(_summaryProduct, "summaryProduct")); }
        if (_summaryWithdrawal != null)
        { sb.append(li).append(xbRDS(_summaryWithdrawal, "summaryWithdrawal")); }
        if (_whiteNoPkRelation != null)
        { sb.append(li).append(xbRDS(_whiteNoPkRelation, "whiteNoPkRelation")); }
        if (_purchaseSelf != null)
        { sb.append(li).append(xbRDS(_purchaseSelf, "purchaseSelf")); }
        if (_memberAddressAsSkipRelation != null)
        { sb.append(li).append(xbRDS(_memberAddressAsSkipRelation, "memberAddressAsSkipRelation")); }
        if (_whitePurchaseReferrerAsOne != null)
        { sb.append(li).append(xbRDS(_whitePurchaseReferrerAsOne, "whitePurchaseReferrerAsOne")); }
        if (_purchaseSelfAsOne != null)
        { sb.append(li).append(xbRDS(_purchaseSelfAsOne, "purchaseSelfAsOne")); }
        if (_purchasePaymentList != null) { for (PurchasePayment et : _purchasePaymentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchasePaymentList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_purchaseId);
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_productId);
        sb.append(dm).append(_purchaseDatetime);
        sb.append(dm).append(_purchaseCount);
        sb.append(dm).append(_purchasePrice);
        sb.append(dm).append(_paymentCompleteFlg);
        sb.append(dm).append(_registerDatetime);
        sb.append(dm).append(_registerUser);
        sb.append(dm).append(_updateDatetime);
        sb.append(dm).append(_updateUser);
        sb.append(dm).append(_versionNo);
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null) { sb.append(dm).append("member"); }
        if (_product != null) { sb.append(dm).append("product"); }
        if (_summaryProduct != null) { sb.append(dm).append("summaryProduct"); }
        if (_summaryWithdrawal != null) { sb.append(dm).append("summaryWithdrawal"); }
        if (_whiteNoPkRelation != null) { sb.append(dm).append("whiteNoPkRelation"); }
        if (_purchaseSelf != null) { sb.append(dm).append("purchaseSelf"); }
        if (_memberAddressAsSkipRelation != null) { sb.append(dm).append("memberAddressAsSkipRelation"); }
        if (_whitePurchaseReferrerAsOne != null) { sb.append(dm).append("whitePurchaseReferrerAsOne"); }
        if (_purchaseSelfAsOne != null) { sb.append(dm).append("purchaseSelfAsOne"); }
        if (_purchasePaymentList != null && !_purchasePaymentList.isEmpty())
        { sb.append(dm).append("purchasePaymentList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Purchase clone() {
        return (Purchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * 連番
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        return _purchaseId;
    }

    /**
     * [set] (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * 連番
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        __modifiedProperties.addPropertyName("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 購入を識別する自然キー（複合ユニーク制約）の筆頭要素。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 購入を識別する自然キー（複合ユニーク制約）の筆頭要素。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product} <br />
     * 商品を参照するID。
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * [set] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product} <br />
     * 商品を参照するID。
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)} <br />
     * 購入した瞬間の日時。
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPurchaseDatetime() {
        return _purchaseDatetime;
    }

    /**
     * [set] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)} <br />
     * 購入した瞬間の日時。
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.sql.Timestamp purchaseDatetime) {
        __modifiedProperties.addPropertyName("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] (購入数量)PURCHASE_COUNT: {NotNull, INT(10)} <br />
     * 購入した商品の（一回の購入における）数量。
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        return _purchaseCount;
    }

    /**
     * [set] (購入数量)PURCHASE_COUNT: {NotNull, INT(10)} <br />
     * 購入した商品の（一回の購入における）数量。
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        __modifiedProperties.addPropertyName("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)} <br />
     * 購入によって実際に会員が支払った（支払う予定の）価格。<br />
     * 基本は商品の定価に購入数量を掛けたものになるが、<br />
     * ポイント利用や割引があったりと必ずしもそうはならない。
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        return _purchasePrice;
    }

    /**
     * [set] (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)} <br />
     * 購入によって実際に会員が支払った（支払う予定の）価格。<br />
     * 基本は商品の定価に購入数量を掛けたものになるが、<br />
     * ポイント利用や割引があったりと必ずしもそうはならない。
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        __modifiedProperties.addPropertyName("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * この購入に関しての支払いが完了しているか否か。
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPaymentCompleteFlg() {
        return _paymentCompleteFlg;
    }

    /**
     * [set] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * この購入に関しての支払いが完了しているか否か。
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        checkClassificationCode("PAYMENT_COMPLETE_FLG", CDef.DefMeta.Flg, paymentCompleteFlg);
        __modifiedProperties.addPropertyName("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingPaymentCompleteFlg(Integer paymentCompleteFlg) {
        setPaymentCompleteFlg(paymentCompleteFlg);
    }
}
