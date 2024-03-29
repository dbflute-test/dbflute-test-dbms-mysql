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

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_PERROTTA_OVER_PRODUCT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverProduct extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {PK, NotNull, INT(10), FK to WHITE_PERROTTA_OVER_TRACE} */
    protected Integer _productId;

    /** PRODUCT_NAME: {NotNull, VARCHAR(50)} */
    protected String _productName;

    /** PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} */
    protected String _productNestedCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_perrotta_over_product";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_PERROTTA_OVER_PRODUCT_NESTED by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'. */
    protected OptionalEntity<WhitePerrottaOverProductNested> _whitePerrottaOverProductNested;

    /**
     * [get] WHITE_PERROTTA_OVER_PRODUCT_NESTED by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePerrottaOverProductNested'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePerrottaOverProductNested> getWhitePerrottaOverProductNested() {
        if (_whitePerrottaOverProductNested == null) { _whitePerrottaOverProductNested = OptionalEntity.relationEmpty(this, "whitePerrottaOverProductNested"); }
        return _whitePerrottaOverProductNested;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_PRODUCT_NESTED by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @param whitePerrottaOverProductNested The entity of foreign property 'whitePerrottaOverProductNested'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductNested(OptionalEntity<WhitePerrottaOverProductNested> whitePerrottaOverProductNested) {
        _whitePerrottaOverProductNested = whitePerrottaOverProductNested;
    }

    /** WHITE_PERROTTA_OVER_TRACE by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'. */
    protected OptionalEntity<WhitePerrottaOverTrace> _whitePerrottaOverTraceAsPerrotta;

    /**
     * [get] WHITE_PERROTTA_OVER_TRACE by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePerrottaOverTraceAsPerrotta'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePerrottaOverTrace> getWhitePerrottaOverTraceAsPerrotta() {
        if (_whitePerrottaOverTraceAsPerrotta == null) { _whitePerrottaOverTraceAsPerrotta = OptionalEntity.relationEmpty(this, "whitePerrottaOverTraceAsPerrotta"); }
        return _whitePerrottaOverTraceAsPerrotta;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_TRACE by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
     * @param whitePerrottaOverTraceAsPerrotta The entity of foreign property 'whitePerrottaOverTraceAsPerrotta'. (NullAllowed)
     */
    public void setWhitePerrottaOverTraceAsPerrotta(OptionalEntity<WhitePerrottaOverTrace> whitePerrottaOverTraceAsPerrotta) {
        _whitePerrottaOverTraceAsPerrotta = whitePerrottaOverTraceAsPerrotta;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_PERROTTA_OVER_MEMBER by PRODUCT_ID, named 'whitePerrottaOverMemberList'. */
    protected List<WhitePerrottaOverMember> _whitePerrottaOverMemberList;

    /**
     * [get] WHITE_PERROTTA_OVER_MEMBER by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * @return The entity list of referrer property 'whitePerrottaOverMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverMember> getWhitePerrottaOverMemberList() {
        if (_whitePerrottaOverMemberList == null) { _whitePerrottaOverMemberList = newReferrerList(); }
        return _whitePerrottaOverMemberList;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_MEMBER by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * @param whitePerrottaOverMemberList The entity list of referrer property 'whitePerrottaOverMemberList'. (NullAllowed)
     */
    public void setWhitePerrottaOverMemberList(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        _whitePerrottaOverMemberList = whitePerrottaOverMemberList;
    }

    /** WHITE_PERROTTA_OVER_TRACE by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'. */
    protected List<WhitePerrottaOverTrace> _whitePerrottaOverTraceByNextProductIdList;

    /**
     * [get] WHITE_PERROTTA_OVER_TRACE by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * @return The entity list of referrer property 'whitePerrottaOverTraceByNextProductIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverTrace> getWhitePerrottaOverTraceByNextProductIdList() {
        if (_whitePerrottaOverTraceByNextProductIdList == null) { _whitePerrottaOverTraceByNextProductIdList = newReferrerList(); }
        return _whitePerrottaOverTraceByNextProductIdList;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_TRACE by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * @param whitePerrottaOverTraceByNextProductIdList The entity list of referrer property 'whitePerrottaOverTraceByNextProductIdList'. (NullAllowed)
     */
    public void setWhitePerrottaOverTraceByNextProductIdList(List<WhitePerrottaOverTrace> whitePerrottaOverTraceByNextProductIdList) {
        _whitePerrottaOverTraceByNextProductIdList = whitePerrottaOverTraceByNextProductIdList;
    }

    /** WHITE_PERROTTA_OVER_TRACE by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'. */
    protected List<WhitePerrottaOverTrace> _whitePerrottaOverTraceByPreviousProductIdList;

    /**
     * [get] WHITE_PERROTTA_OVER_TRACE by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * @return The entity list of referrer property 'whitePerrottaOverTraceByPreviousProductIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverTrace> getWhitePerrottaOverTraceByPreviousProductIdList() {
        if (_whitePerrottaOverTraceByPreviousProductIdList == null) { _whitePerrottaOverTraceByPreviousProductIdList = newReferrerList(); }
        return _whitePerrottaOverTraceByPreviousProductIdList;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_TRACE by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * @param whitePerrottaOverTraceByPreviousProductIdList The entity list of referrer property 'whitePerrottaOverTraceByPreviousProductIdList'. (NullAllowed)
     */
    public void setWhitePerrottaOverTraceByPreviousProductIdList(List<WhitePerrottaOverTrace> whitePerrottaOverTraceByPreviousProductIdList) {
        _whitePerrottaOverTraceByPreviousProductIdList = whitePerrottaOverTraceByPreviousProductIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhitePerrottaOverProduct) {
            BsWhitePerrottaOverProduct other = (BsWhitePerrottaOverProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductNested != null && _whitePerrottaOverProductNested.isPresent())
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductNested, "whitePerrottaOverProductNested")); }
        if (_whitePerrottaOverTraceAsPerrotta != null && _whitePerrottaOverTraceAsPerrotta.isPresent())
        { sb.append(li).append(xbRDS(_whitePerrottaOverTraceAsPerrotta, "whitePerrottaOverTraceAsPerrotta")); }
        if (_whitePerrottaOverMemberList != null) { for (WhitePerrottaOverMember et : _whitePerrottaOverMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverMemberList")); } } }
        if (_whitePerrottaOverTraceByNextProductIdList != null) { for (WhitePerrottaOverTrace et : _whitePerrottaOverTraceByNextProductIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverTraceByNextProductIdList")); } } }
        if (_whitePerrottaOverTraceByPreviousProductIdList != null) { for (WhitePerrottaOverTrace et : _whitePerrottaOverTraceByPreviousProductIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverTraceByPreviousProductIdList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productNestedCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductNested != null && _whitePerrottaOverProductNested.isPresent())
        { sb.append(dm).append("whitePerrottaOverProductNested"); }
        if (_whitePerrottaOverTraceAsPerrotta != null && _whitePerrottaOverTraceAsPerrotta.isPresent())
        { sb.append(dm).append("whitePerrottaOverTraceAsPerrotta"); }
        if (_whitePerrottaOverMemberList != null && !_whitePerrottaOverMemberList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverMemberList"); }
        if (_whitePerrottaOverTraceByNextProductIdList != null && !_whitePerrottaOverTraceByNextProductIdList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverTraceByNextProductIdList"); }
        if (_whitePerrottaOverTraceByPreviousProductIdList != null && !_whitePerrottaOverTraceByPreviousProductIdList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverTraceByPreviousProductIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverProduct clone() {
        return (WhitePerrottaOverProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, NotNull, INT(10), FK to WHITE_PERROTTA_OVER_TRACE} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, NotNull, INT(10), FK to WHITE_PERROTTA_OVER_TRACE} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {NotNull, VARCHAR(50)} <br>
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br>
     * @return The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedCode() {
        checkSpecifiedProperty("productNestedCode");
        return _productNestedCode;
    }

    /**
     * [set] PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br>
     * @param productNestedCode The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedCode(String productNestedCode) {
        registerModifiedProperty("productNestedCode");
        _productNestedCode = productNestedCode;
    }
}
