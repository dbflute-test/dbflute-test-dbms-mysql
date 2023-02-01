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
 * The entity of WHITE_PERROTTA_OVER_MEMBER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverMember extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {PK, NotNull, INT(10)} */
    protected Integer _memberId;

    /** MEMBER_NAME: {NotNull, VARCHAR(180)} */
    protected String _memberName;

    /** PRODUCT_ID: {IX, NotNull, INT(10), FK to white_perrotta_over_product} */
    protected Integer _productId;

    /** TRACE_TYPE_CODE: {NotNull, CHAR(3)} */
    protected String _traceTypeCode;

    /** MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho} */
    protected String _machoCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_perrotta_over_member";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_PERROTTA_OVER_MEMBER_MACHO by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'. */
    protected OptionalEntity<WhitePerrottaOverMemberMacho> _whitePerrottaOverMemberMacho;

    /**
     * [get] WHITE_PERROTTA_OVER_MEMBER_MACHO by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePerrottaOverMemberMacho'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePerrottaOverMemberMacho> getWhitePerrottaOverMemberMacho() {
        if (_whitePerrottaOverMemberMacho == null) { _whitePerrottaOverMemberMacho = OptionalEntity.relationEmpty(this, "whitePerrottaOverMemberMacho"); }
        return _whitePerrottaOverMemberMacho;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_MEMBER_MACHO by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'.
     * @param whitePerrottaOverMemberMacho The entity of foreign property 'whitePerrottaOverMemberMacho'. (NullAllowed)
     */
    public void setWhitePerrottaOverMemberMacho(OptionalEntity<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMacho) {
        _whitePerrottaOverMemberMacho = whitePerrottaOverMemberMacho;
    }

    /** WHITE_PERROTTA_OVER_PRODUCT by my PRODUCT_ID, named 'whitePerrottaOverProduct'. */
    protected OptionalEntity<WhitePerrottaOverProduct> _whitePerrottaOverProduct;

    /**
     * [get] WHITE_PERROTTA_OVER_PRODUCT by my PRODUCT_ID, named 'whitePerrottaOverProduct'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePerrottaOverProduct'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePerrottaOverProduct> getWhitePerrottaOverProduct() {
        if (_whitePerrottaOverProduct == null) { _whitePerrottaOverProduct = OptionalEntity.relationEmpty(this, "whitePerrottaOverProduct"); }
        return _whitePerrottaOverProduct;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_PRODUCT by my PRODUCT_ID, named 'whitePerrottaOverProduct'.
     * @param whitePerrottaOverProduct The entity of foreign property 'whitePerrottaOverProduct'. (NullAllowed)
     */
    public void setWhitePerrottaOverProduct(OptionalEntity<WhitePerrottaOverProduct> whitePerrottaOverProduct) {
        _whitePerrottaOverProduct = whitePerrottaOverProduct;
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
        if (obj instanceof BsWhitePerrottaOverMember) {
            BsWhitePerrottaOverMember other = (BsWhitePerrottaOverMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverMemberMacho != null && _whitePerrottaOverMemberMacho.isPresent())
        { sb.append(li).append(xbRDS(_whitePerrottaOverMemberMacho, "whitePerrottaOverMemberMacho")); }
        if (_whitePerrottaOverProduct != null && _whitePerrottaOverProduct.isPresent())
        { sb.append(li).append(xbRDS(_whitePerrottaOverProduct, "whitePerrottaOverProduct")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_traceTypeCode));
        sb.append(dm).append(xfND(_machoCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverMemberMacho != null && _whitePerrottaOverMemberMacho.isPresent())
        { sb.append(dm).append("whitePerrottaOverMemberMacho"); }
        if (_whitePerrottaOverProduct != null && _whitePerrottaOverProduct.isPresent())
        { sb.append(dm).append("whitePerrottaOverProduct"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverMember clone() {
        return (WhitePerrottaOverMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, NotNull, INT(10)} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {NotNull, VARCHAR(180)} <br>
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {NotNull, VARCHAR(180)} <br>
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, INT(10), FK to white_perrotta_over_product} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, INT(10), FK to white_perrotta_over_product} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * @return The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getTraceTypeCode() {
        checkSpecifiedProperty("traceTypeCode");
        return _traceTypeCode;
    }

    /**
     * [set] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * @param traceTypeCode The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setTraceTypeCode(String traceTypeCode) {
        registerModifiedProperty("traceTypeCode");
        _traceTypeCode = traceTypeCode;
    }

    /**
     * [get] MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho} <br>
     * @return The value of the column 'MACHO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMachoCode() {
        checkSpecifiedProperty("machoCode");
        return _machoCode;
    }

    /**
     * [set] MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho} <br>
     * @param machoCode The value of the column 'MACHO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMachoCode(String machoCode) {
        registerModifiedProperty("machoCode");
        _machoCode = machoCode;
    }
}
