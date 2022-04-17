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
 * The entity of (商品詳細)PRODUCT_DETAIL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_DETAIL_ID
 *
 * [column]
 *     PRODUCT_DETAIL_ID, PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_DETAIL_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CDEF_PRODUCT_CATEGORY, PRODUCT, CDEF_PRODUCT_STATUS
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     cdefProductCategory, product, cdefProductStatus
 *
 * [referrer property]
 *     purchaseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long productDetailId = entity.getProductDetailId();
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productHandleCode = entity.getProductHandleCode();
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productStatusCode = entity.getProductStatusCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setProductDetailId(productDetailId);
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductHandleCode(productHandleCode);
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsProductDetail extends AbstractEntity implements DomainEntity, ImmuEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (商品詳細ID)PRODUCT_DETAIL_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _productDetailId;

    /** (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product} */
    protected Integer _productId;

    /** (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} */
    protected String _productName;

    /** (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} */
    protected String _productHandleCode;

    /** (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_category} */
    protected String _productCategoryCode;

    /** (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_status} */
    protected String _productStatusCode;

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
        return "product_detail";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productDetailId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String productHandleCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productHandleCode");
        setProductHandleCode(productHandleCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'cdefProductCategory'. */
    protected OptionalEntity<ImmuCdefProductCategory> _cdefProductCategory;

    /**
     * [get] ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'cdefProductCategory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cdefProductCategory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuCdefProductCategory> getCdefProductCategory() {
        if (_cdefProductCategory == null) { _cdefProductCategory = OptionalEntity.relationEmpty(this, "cdefProductCategory"); }
        return _cdefProductCategory;
    }

    /**
     * [set] ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'cdefProductCategory'.
     * @param cdefProductCategory The entity of foreign property 'cdefProductCategory'. (NullAllowed)
     */
    public void setCdefProductCategory(OptionalEntity<ImmuCdefProductCategory> cdefProductCategory) {
        _cdefProductCategory = cdefProductCategory;
    }

    /** (商品)PRODUCT by my PRODUCT_ID, named 'product'. */
    protected OptionalEntity<ImmuProduct> _product;

    /**
     * [get] (商品)PRODUCT by my PRODUCT_ID, named 'product'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'product'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuProduct> getProduct() {
        if (_product == null) { _product = OptionalEntity.relationEmpty(this, "product"); }
        return _product;
    }

    /**
     * [set] (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(OptionalEntity<ImmuProduct> product) {
        _product = product;
    }

    /** ([区分値]商品ステータス)CDEF_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'cdefProductStatus'. */
    protected OptionalEntity<ImmuCdefProductStatus> _cdefProductStatus;

    /**
     * [get] ([区分値]商品ステータス)CDEF_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'cdefProductStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cdefProductStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuCdefProductStatus> getCdefProductStatus() {
        if (_cdefProductStatus == null) { _cdefProductStatus = OptionalEntity.relationEmpty(this, "cdefProductStatus"); }
        return _cdefProductStatus;
    }

    /**
     * [set] ([区分値]商品ステータス)CDEF_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'cdefProductStatus'.
     * @param cdefProductStatus The entity of foreign property 'cdefProductStatus'. (NullAllowed)
     */
    public void setCdefProductStatus(OptionalEntity<ImmuCdefProductStatus> cdefProductStatus) {
        _cdefProductStatus = cdefProductStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入)PURCHASE by PRODUCT_DETAIL_ID, named 'purchaseList'. */
    protected List<ImmuPurchase> _purchaseList;

    /**
     * [get] (購入)PURCHASE by PRODUCT_DETAIL_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ImmuPurchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)PURCHASE by PRODUCT_DETAIL_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<ImmuPurchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof ImmuBsProductDetail) {
            ImmuBsProductDetail other = (ImmuBsProductDetail)obj;
            if (!xSV(_productDetailId, other._productDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cdefProductCategory != null && _cdefProductCategory.isPresent())
        { sb.append(li).append(xbRDS(_cdefProductCategory, "cdefProductCategory")); }
        if (_product != null && _product.isPresent())
        { sb.append(li).append(xbRDS(_product, "product")); }
        if (_cdefProductStatus != null && _cdefProductStatus.isPresent())
        { sb.append(li).append(xbRDS(_cdefProductStatus, "cdefProductStatus")); }
        if (_purchaseList != null) { for (ImmuPurchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productDetailId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productHandleCode));
        sb.append(dm).append(xfND(_productCategoryCode));
        sb.append(dm).append(xfND(_productStatusCode));
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
        if (_cdefProductCategory != null && _cdefProductCategory.isPresent())
        { sb.append(dm).append("cdefProductCategory"); }
        if (_product != null && _product.isPresent())
        { sb.append(dm).append("product"); }
        if (_cdefProductStatus != null && _cdefProductStatus.isPresent())
        { sb.append(dm).append("cdefProductStatus"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ImmuProductDetail clone() {
        return (ImmuProductDetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品詳細ID)PRODUCT_DETAIL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'PRODUCT_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductDetailId() {
        checkSpecifiedProperty("productDetailId");
        return _productDetailId;
    }

    /**
     * [set] (商品詳細ID)PRODUCT_DETAIL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param productDetailId The value of the column 'PRODUCT_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductDetailId(Long productDetailId) {
        registerModifiedProperty("productDetailId");
        _productDetailId = productDetailId;
    }

    /**
     * [get] (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br>
     * ExampleDBとして、コメントの少ないケースを表現するため、あえてコメントを控えている。<br>
     * 実業務ではしっかりとコメントを入れることが強く強く推奨される。「よりによってこのテーブルでやらないでよ！」あわわ、何も聞こえません〜
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br>
     * ExampleDBとして、コメントの少ないケースを表現するため、あえてコメントを控えている。<br>
     * 実業務ではしっかりとコメントを入れることが強く強く推奨される。「よりによってこのテーブルでやらないでよ！」あわわ、何も聞こえません〜
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br>
     * これだけは書いておこう、商品を識別する業務上のコード。よく品番とか言うかもしれませんねぇ...
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductHandleCode() {
        checkSpecifiedProperty("productHandleCode");
        return _productHandleCode;
    }

    /**
     * [set] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br>
     * これだけは書いておこう、商品を識別する業務上のコード。よく品番とか言うかもしれませんねぇ...
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductHandleCode(String productHandleCode) {
        registerModifiedProperty("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_category} <br>
     * 自分のテーブルの別のレコードからも参照される。
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        checkSpecifiedProperty("productCategoryCode");
        return _productCategoryCode;
    }

    /**
     * [set] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_category} <br>
     * 自分のテーブルの別のレコードからも参照される。
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        registerModifiedProperty("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_status} <br>
     * 商品ステータスを識別するコード。
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_status} <br>
     * 商品ステータスを識別するコード。
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
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
