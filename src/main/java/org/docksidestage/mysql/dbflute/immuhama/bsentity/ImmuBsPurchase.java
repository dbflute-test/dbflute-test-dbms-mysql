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
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuEntityDefinedCommonColumn;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuDBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The entity of (購入)PURCHASE as TABLE. <br>
 * 一つの商品に対する購入を表現する(購入履歴とも言える)。<br>
 * 実業務であれば購入詳細というテーブルを作り、「購入という行為」と「その中身（詳細）」を違う粒度のデータとしてそれぞれ管理するのが一般的と言えるでしょう。というか、注文とか請求とかそういうことを考え始めたらもっと複雑になるはずですが、ExampleDBということで割り切っています。
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_DETAIL_ID, PRODUCT_PRICE_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER, PRODUCT_DETAIL, PRODUCT_PRICE, PURCHASE_STATUS(AsOne)
 *
 * [referrer table]
 *     PURCHASE_PAYMENT, PURCHASE_STATUS
 *
 * [foreign property]
 *     member, productDetail, productPrice, purchaseStatusAsOne
 *
 * [referrer property]
 *     purchasePaymentList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Long productDetailId = entity.getProductDetailId();
 * Long productPriceId = entity.getProductPriceId();
 * java.time.LocalDateTime purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductDetailId(productDetailId);
 * entity.setProductPriceId(productPriceId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsPurchase extends AbstractEntity implements DomainEntity, ImmuEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _purchaseId;

    /** (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** (商品詳細ID)PRODUCT_DETAIL_ID: {IX, NotNull, BIGINT(19), FK to product_detail} */
    protected Long _productDetailId;

    /** (商品価格ID)PRODUCT_PRICE_ID: {IX, NotNull, BIGINT(19), FK to product_price} */
    protected Long _productPriceId;

    /** (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _purchaseDatetime;

    /** (購入数量)PURCHASE_COUNT: {NotNull, INT(10)} */
    protected Integer _purchaseCount;

    /** (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)} */
    protected Integer _purchasePrice;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ImmuDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "purchase";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchaseId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX+, NotNull, INT(10), FK to member. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, DATETIME(19). (NotNull)
     */
    public void uniqueBy(Integer memberId, java.time.LocalDateTime purchaseDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("purchaseDatetime");
        setMemberId(memberId);setPurchaseDatetime(purchaseDatetime);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<ImmuMember> _member;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuMember> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<ImmuMember> member) {
        _member = member;
    }

    /** (商品詳細)PRODUCT_DETAIL by my PRODUCT_DETAIL_ID, named 'productDetail'. */
    protected OptionalEntity<ImmuProductDetail> _productDetail;

    /**
     * [get] (商品詳細)PRODUCT_DETAIL by my PRODUCT_DETAIL_ID, named 'productDetail'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'productDetail'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuProductDetail> getProductDetail() {
        if (_productDetail == null) { _productDetail = OptionalEntity.relationEmpty(this, "productDetail"); }
        return _productDetail;
    }

    /**
     * [set] (商品詳細)PRODUCT_DETAIL by my PRODUCT_DETAIL_ID, named 'productDetail'.
     * @param productDetail The entity of foreign property 'productDetail'. (NullAllowed)
     */
    public void setProductDetail(OptionalEntity<ImmuProductDetail> productDetail) {
        _productDetail = productDetail;
    }

    /** (商品価格)PRODUCT_PRICE by my PRODUCT_PRICE_ID, named 'productPrice'. */
    protected OptionalEntity<ImmuProductPrice> _productPrice;

    /**
     * [get] (商品価格)PRODUCT_PRICE by my PRODUCT_PRICE_ID, named 'productPrice'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'productPrice'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuProductPrice> getProductPrice() {
        if (_productPrice == null) { _productPrice = OptionalEntity.relationEmpty(this, "productPrice"); }
        return _productPrice;
    }

    /**
     * [set] (商品価格)PRODUCT_PRICE by my PRODUCT_PRICE_ID, named 'productPrice'.
     * @param productPrice The entity of foreign property 'productPrice'. (NullAllowed)
     */
    public void setProductPrice(OptionalEntity<ImmuProductPrice> productPrice) {
        _productPrice = productPrice;
    }

    /** (購入ステータス)purchase_status by PURCHASE_ID, named 'purchaseStatusAsOne'. */
    protected OptionalEntity<ImmuPurchaseStatus> _purchaseStatusAsOne;

    /**
     * [get] (購入ステータス)purchase_status by PURCHASE_ID, named 'purchaseStatusAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'purchaseStatusAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<ImmuPurchaseStatus> getPurchaseStatusAsOne() {
        if (_purchaseStatusAsOne == null) { _purchaseStatusAsOne = OptionalEntity.relationEmpty(this, "purchaseStatusAsOne"); }
        return _purchaseStatusAsOne;
    }

    /**
     * [set] (購入ステータス)purchase_status by PURCHASE_ID, named 'purchaseStatusAsOne'.
     * @param purchaseStatusAsOne The entity of foreign property(referrer-as-one) 'purchaseStatusAsOne'. (NullAllowed)
     */
    public void setPurchaseStatusAsOne(OptionalEntity<ImmuPurchaseStatus> purchaseStatusAsOne) {
        _purchaseStatusAsOne = purchaseStatusAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'. */
    protected List<ImmuPurchasePayment> _purchasePaymentList;

    /**
     * [get] (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The entity list of referrer property 'purchasePaymentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ImmuPurchasePayment> getPurchasePaymentList() {
        if (_purchasePaymentList == null) { _purchasePaymentList = newReferrerList(); }
        return _purchasePaymentList;
    }

    /**
     * [set] (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @param purchasePaymentList The entity list of referrer property 'purchasePaymentList'. (NullAllowed)
     */
    public void setPurchasePaymentList(List<ImmuPurchasePayment> purchasePaymentList) {
        _purchasePaymentList = purchasePaymentList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof ImmuBsPurchase) {
            ImmuBsPurchase other = (ImmuBsPurchase)obj;
            if (!xSV(_purchaseId, other._purchaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _purchaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_productDetail != null && _productDetail.isPresent())
        { sb.append(li).append(xbRDS(_productDetail, "productDetail")); }
        if (_productPrice != null && _productPrice.isPresent())
        { sb.append(li).append(xbRDS(_productPrice, "productPrice")); }
        if (_purchaseStatusAsOne != null && _purchaseStatusAsOne.isPresent())
        { sb.append(li).append(xbRDS(_purchaseStatusAsOne, "purchaseStatusAsOne")); }
        if (_purchasePaymentList != null) { for (ImmuPurchasePayment et : _purchasePaymentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchasePaymentList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_productDetailId));
        sb.append(dm).append(xfND(_productPriceId));
        sb.append(dm).append(xfND(_purchaseDatetime));
        sb.append(dm).append(xfND(_purchaseCount));
        sb.append(dm).append(xfND(_purchasePrice));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_productDetail != null && _productDetail.isPresent())
        { sb.append(dm).append("productDetail"); }
        if (_productPrice != null && _productPrice.isPresent())
        { sb.append(dm).append("productPrice"); }
        if (_purchaseStatusAsOne != null && _purchaseStatusAsOne.isPresent())
        { sb.append(dm).append("purchaseStatusAsOne"); }
        if (_purchasePaymentList != null && !_purchasePaymentList.isEmpty())
        { sb.append(dm).append("purchasePaymentList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ImmuPurchase clone() {
        return (ImmuPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 連番
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 連番
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} <br>
     * 会員を参照するID。<br>
     * 購入を識別する自然キー(複合ユニーク制約)の筆頭要素。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} <br>
     * 会員を参照するID。<br>
     * 購入を識別する自然キー(複合ユニーク制約)の筆頭要素。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (商品詳細ID)PRODUCT_DETAIL_ID: {IX, NotNull, BIGINT(19), FK to product_detail} <br>
     * @return The value of the column 'PRODUCT_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductDetailId() {
        checkSpecifiedProperty("productDetailId");
        return _productDetailId;
    }

    /**
     * [set] (商品詳細ID)PRODUCT_DETAIL_ID: {IX, NotNull, BIGINT(19), FK to product_detail} <br>
     * @param productDetailId The value of the column 'PRODUCT_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductDetailId(Long productDetailId) {
        registerModifiedProperty("productDetailId");
        _productDetailId = productDetailId;
    }

    /**
     * [get] (商品価格ID)PRODUCT_PRICE_ID: {IX, NotNull, BIGINT(19), FK to product_price} <br>
     * @return The value of the column 'PRODUCT_PRICE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductPriceId() {
        checkSpecifiedProperty("productPriceId");
        return _productPriceId;
    }

    /**
     * [set] (商品価格ID)PRODUCT_PRICE_ID: {IX, NotNull, BIGINT(19), FK to product_price} <br>
     * @param productPriceId The value of the column 'PRODUCT_PRICE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductPriceId(Long productPriceId) {
        registerModifiedProperty("productPriceId");
        _productPriceId = productPriceId;
    }

    /**
     * [get] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)} <br>
     * 購入した瞬間の日時。
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPurchaseDatetime() {
        checkSpecifiedProperty("purchaseDatetime");
        return _purchaseDatetime;
    }

    /**
     * [set] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)} <br>
     * 購入した瞬間の日時。
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.time.LocalDateTime purchaseDatetime) {
        registerModifiedProperty("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] (購入数量)PURCHASE_COUNT: {NotNull, INT(10)} <br>
     * 購入した商品の一回の購入における数量。
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        checkSpecifiedProperty("purchaseCount");
        return _purchaseCount;
    }

    /**
     * [set] (購入数量)PURCHASE_COUNT: {NotNull, INT(10)} <br>
     * 購入した商品の一回の購入における数量。
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        registerModifiedProperty("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)} <br>
     * 購入によって実際に会員が支払った（支払う予定の）価格。<br>
     * 基本は商品の定価に購入数量を掛けたものになるが、ポイント利用や割引があったりと必ずしもそうはならない。
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        checkSpecifiedProperty("purchasePrice");
        return _purchasePrice;
    }

    /**
     * [set] (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)} <br>
     * 購入によって実際に会員が支払った（支払う予定の）価格。<br>
     * 基本は商品の定価に購入数量を掛けたものになるが、ポイント利用や割引があったりと必ずしもそうはならない。
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        registerModifiedProperty("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }
}
