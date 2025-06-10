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
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of (VIEW)WHITE_NO_PK_RELATION as VIEW.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNoPkRelation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (商品ID)PRODUCT_ID: {INT(10), default=[0]} */
    protected Integer _productId;

    /** (商品名称)PRODUCT_NAME: {VARCHAR(50)} */
    protected String _productName;

    /** (商品ハンドルコード)PRODUCT_HANDLE_CODE: {VARCHAR(100)} */
    protected String _productHandleCode;

    /** PRODUCT_STATUS_CODE: {CHAR(3), classification=ProductStatus} */
    protected String _productStatusCode;

    /** LATEST_PURCHASE_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _latestPurchaseDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_no_pk_relation";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br>
     * PRODUCT_STATUS_CODE: {CHAR(3), classification=ProductStatus} <br>
     * 商品ステータス: 商品の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductStatus getProductStatusCodeAsProductStatus() {
        return CDef.ProductStatus.of(getProductStatusCode()).orElse(null);
    }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br>
     * PRODUCT_STATUS_CODE: {CHAR(3), classification=ProductStatus} <br>
     * 商品ステータス: 商品の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductStatusCodeAsProductStatus(CDef.ProductStatus cdef) {
        setProductStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of productStatusCode as OnSale (ONS). <br>
     * 生産販売可能
     */
    public void setProductStatusCode_OnSale() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.OnSale);
    }

    /**
     * Set the value of productStatusCode as ProductStop (PST). <br>
     * 生産中止
     */
    public void setProductStatusCode_ProductStop() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.ProductStop);
    }

    /**
     * Set the value of productStatusCode as SaleStop (SST). <br>
     * 販売中止
     */
    public void setProductStatusCode_SaleStop() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.SaleStop);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode OnSale? <br>
     * 生産販売可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCodeOnSale() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.OnSale) : false;
    }

    /**
     * Is the value of productStatusCode ProductStop? <br>
     * 生産中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCodeProductStop() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.ProductStop) : false;
    }

    /**
     * Is the value of productStatusCode SaleStop? <br>
     * 販売中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCodeSaleStop() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.SaleStop) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'productStatusCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProductStatusCodeName() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'productStatusCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getProductStatusCodeAlias() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsWhiteNoPkRelation) {
            BsWhiteNoPkRelation other = (BsWhiteNoPkRelation)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_productName, other._productName)) { return false; }
            if (!xSV(_productHandleCode, other._productHandleCode)) { return false; }
            if (!xSV(_productStatusCode, other._productStatusCode)) { return false; }
            if (!xSV(_latestPurchaseDatetime, other._latestPurchaseDatetime)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        hs = xCH(hs, _productName);
        hs = xCH(hs, _productHandleCode);
        hs = xCH(hs, _productStatusCode);
        hs = xCH(hs, _latestPurchaseDatetime);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productHandleCode));
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_latestPurchaseDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteNoPkRelation clone() {
        return (WhiteNoPkRelation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品ID)PRODUCT_ID: {INT(10), default=[0]} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] (商品ID)PRODUCT_ID: {INT(10), default=[0]} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] (商品名称)PRODUCT_NAME: {VARCHAR(50)} <br>
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] (商品名称)PRODUCT_NAME: {VARCHAR(50)} <br>
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br>
     * 商品を識別する業務上のコード。
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductHandleCode() {
        checkSpecifiedProperty("productHandleCode");
        return _productHandleCode;
    }

    /**
     * [set] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br>
     * 商品を識別する業務上のコード。
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductHandleCode(String productHandleCode) {
        registerModifiedProperty("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {CHAR(3), classification=ProductStatus} <br>
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {CHAR(3), classification=ProductStatus} <br>
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setProductStatusCode(String productStatusCode) {
        checkClassificationCode("PRODUCT_STATUS_CODE", CDef.DefMeta.ProductStatus, productStatusCode);
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {DATETIME(19)} <br>
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getLatestPurchaseDatetime() {
        checkSpecifiedProperty("latestPurchaseDatetime");
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {DATETIME(19)} <br>
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPurchaseDatetime(java.time.LocalDateTime latestPurchaseDatetime) {
        registerModifiedProperty("latestPurchaseDatetime");
        _latestPurchaseDatetime = latestPurchaseDatetime;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingProductStatusCode(String productStatusCode) {
        setProductStatusCode(productStatusCode);
    }
}
