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
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The entity of ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY as TABLE. <br>
 * 商品のカテゴリを表現するマスタ。自己参照FKの階層になっている。
 * <pre>
 * [primary-key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CDEF_PRODUCT_CATEGORY
 *
 * [referrer table]
 *     CDEF_PRODUCT_CATEGORY, PRODUCT_DETAIL
 *
 * [foreign property]
 *     cdefProductCategorySelf
 *
 * [referrer property]
 *     cdefProductCategorySelfList, productDetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productCategoryName = entity.getProductCategoryName();
 * String parentCategoryCode = entity.getParentCategoryCode();
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductCategoryName(productCategoryName);
 * entity.setParentCategoryCode(parentCategoryCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsCdefProductCategory extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productCategoryCode;

    /** (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} */
    protected String _productCategoryName;

    /** (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to cdef_product_category} */
    protected String _parentCategoryCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ImmuDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "cdef_product_category";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productCategoryCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'cdefProductCategorySelf'. */
    protected OptionalEntity<ImmuCdefProductCategory> _cdefProductCategorySelf;

    /**
     * [get] ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'cdefProductCategorySelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cdefProductCategorySelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuCdefProductCategory> getCdefProductCategorySelf() {
        if (_cdefProductCategorySelf == null) { _cdefProductCategorySelf = OptionalEntity.relationEmpty(this, "cdefProductCategorySelf"); }
        return _cdefProductCategorySelf;
    }

    /**
     * [set] ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'cdefProductCategorySelf'.
     * @param cdefProductCategorySelf The entity of foreign property 'cdefProductCategorySelf'. (NullAllowed)
     */
    public void setCdefProductCategorySelf(OptionalEntity<ImmuCdefProductCategory> cdefProductCategorySelf) {
        _cdefProductCategorySelf = cdefProductCategorySelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'. */
    protected List<ImmuCdefProductCategory> _cdefProductCategorySelfList;

    /**
     * [get] ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'.
     * @return The entity list of referrer property 'cdefProductCategorySelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ImmuCdefProductCategory> getCdefProductCategorySelfList() {
        if (_cdefProductCategorySelfList == null) { _cdefProductCategorySelfList = newReferrerList(); }
        return _cdefProductCategorySelfList;
    }

    /**
     * [set] ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'.
     * @param cdefProductCategorySelfList The entity list of referrer property 'cdefProductCategorySelfList'. (NullAllowed)
     */
    public void setCdefProductCategorySelfList(List<ImmuCdefProductCategory> cdefProductCategorySelfList) {
        _cdefProductCategorySelfList = cdefProductCategorySelfList;
    }

    /** (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'. */
    protected List<ImmuProductDetail> _productDetailList;

    /**
     * [get] (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'.
     * @return The entity list of referrer property 'productDetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ImmuProductDetail> getProductDetailList() {
        if (_productDetailList == null) { _productDetailList = newReferrerList(); }
        return _productDetailList;
    }

    /**
     * [set] (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'.
     * @param productDetailList The entity list of referrer property 'productDetailList'. (NullAllowed)
     */
    public void setProductDetailList(List<ImmuProductDetail> productDetailList) {
        _productDetailList = productDetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof ImmuBsCdefProductCategory) {
            ImmuBsCdefProductCategory other = (ImmuBsCdefProductCategory)obj;
            if (!xSV(_productCategoryCode, other._productCategoryCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productCategoryCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cdefProductCategorySelf != null && _cdefProductCategorySelf.isPresent())
        { sb.append(li).append(xbRDS(_cdefProductCategorySelf, "cdefProductCategorySelf")); }
        if (_cdefProductCategorySelfList != null) { for (ImmuCdefProductCategory et : _cdefProductCategorySelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "cdefProductCategorySelfList")); } } }
        if (_productDetailList != null) { for (ImmuProductDetail et : _productDetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "productDetailList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productCategoryCode));
        sb.append(dm).append(xfND(_productCategoryName));
        sb.append(dm).append(xfND(_parentCategoryCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_cdefProductCategorySelf != null && _cdefProductCategorySelf.isPresent())
        { sb.append(dm).append("cdefProductCategorySelf"); }
        if (_cdefProductCategorySelfList != null && !_cdefProductCategorySelfList.isEmpty())
        { sb.append(dm).append("cdefProductCategorySelfList"); }
        if (_productDetailList != null && !_productDetailList.isEmpty())
        { sb.append(dm).append("productDetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ImmuCdefProductCategory clone() {
        return (ImmuCdefProductCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br>
     * 自分のテーブルの別のレコードからも参照される。
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        checkSpecifiedProperty("productCategoryCode");
        return _productCategoryCode;
    }

    /**
     * [set] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br>
     * 自分のテーブルの別のレコードからも参照される。
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        registerModifiedProperty("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryName() {
        checkSpecifiedProperty("productCategoryName");
        return _productCategoryName;
    }

    /**
     * [set] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br>
     * @param productCategoryName The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryName(String productCategoryName) {
        registerModifiedProperty("productCategoryName");
        _productCategoryName = productCategoryName;
    }

    /**
     * [get] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to cdef_product_category} <br>
     * 最上位の場合はデータなし。まさひく自己参照FKカラム！
     * @return The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentCategoryCode() {
        checkSpecifiedProperty("parentCategoryCode");
        return _parentCategoryCode;
    }

    /**
     * [set] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to cdef_product_category} <br>
     * 最上位の場合はデータなし。まさひく自己参照FKカラム！
     * @param parentCategoryCode The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentCategoryCode(String parentCategoryCode) {
        registerModifiedProperty("parentCategoryCode");
        _parentCategoryCode = parentCategoryCode;
    }
}
