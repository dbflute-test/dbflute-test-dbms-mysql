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
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_VARIANT_RELATION_REFERRER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrer extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REFERRER_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _referrerId;

    /** VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} */
    protected Long _variantMasterId;

    /** MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} */
    protected String _masterTypeCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_variant_relation_referrer";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_referrerId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of masterTypeCode as the classification of VariantRelationMasterType. <br>
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br>
     * master type of variant relation (biz-many-to-one)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.VariantRelationMasterType getMasterTypeCodeAsVariantRelationMasterType() {
        return CDef.VariantRelationMasterType.of(getMasterTypeCode()).orElse(null);
    }

    /**
     * Set the value of masterTypeCode as the classification of VariantRelationMasterType. <br>
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br>
     * master type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType cdef) {
        setMasterTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of masterTypeCode as FooCls (FOO). <br>
     * FooCls
     */
    public void setMasterTypeCode_FooCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.FooCls);
    }

    /**
     * Set the value of masterTypeCode as BarCls (BAR). <br>
     * BarCls
     */
    public void setMasterTypeCode_BarCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.BarCls);
    }

    /**
     * Set the value of masterTypeCode as QuxCls (QUX). <br>
     * QuxCls
     */
    public void setMasterTypeCode_QuxCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.QuxCls);
    }

    /**
     * Set the value of masterTypeCode as CorgeCls (CORGE). <br>
     * CorgeCls
     */
    public void setMasterTypeCode_CorgeCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.CorgeCls);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of masterTypeCode FooCls? <br>
     * FooCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeFooCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.FooCls) : false;
    }

    /**
     * Is the value of masterTypeCode BarCls? <br>
     * BarCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeBarCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.BarCls) : false;
    }

    /**
     * Is the value of masterTypeCode QuxCls? <br>
     * QuxCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeQuxCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.QuxCls) : false;
    }

    /**
     * Is the value of masterTypeCode CorgeCls? <br>
     * CorgeCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeCorgeCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.CorgeCls) : false;
    }

    /**
     * Foo or Bar or Qux <br>
     * The group elements:[FooCls, BarCls, QuxCls]
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCode_FooBarQux() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null && cdef.isFooBarQux();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'masterTypeCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMasterTypeCodeName() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_VARIANT_RELATION_MASTER_FOO by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'. */
    protected OptionalEntity<WhiteVariantRelationMasterFoo> _whiteVariantRelationMasterFooAsVariant;

    /**
     * [get] WHITE_VARIANT_RELATION_MASTER_FOO by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationMasterFooAsVariant'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationMasterFoo> getWhiteVariantRelationMasterFooAsVariant() {
        if (_whiteVariantRelationMasterFooAsVariant == null) { _whiteVariantRelationMasterFooAsVariant = OptionalEntity.relationEmpty(this, "whiteVariantRelationMasterFooAsVariant"); }
        return _whiteVariantRelationMasterFooAsVariant;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_MASTER_FOO by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @param whiteVariantRelationMasterFooAsVariant The entity of foreign property 'whiteVariantRelationMasterFooAsVariant'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterFooAsVariant(OptionalEntity<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooAsVariant) {
        _whiteVariantRelationMasterFooAsVariant = whiteVariantRelationMasterFooAsVariant;
    }

    /** WHITE_VARIANT_RELATION_MASTER_BAR by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'. */
    protected OptionalEntity<WhiteVariantRelationMasterBar> _whiteVariantRelationMasterBarAsVariant;

    /**
     * [get] WHITE_VARIANT_RELATION_MASTER_BAR by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationMasterBarAsVariant'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationMasterBar> getWhiteVariantRelationMasterBarAsVariant() {
        if (_whiteVariantRelationMasterBarAsVariant == null) { _whiteVariantRelationMasterBarAsVariant = OptionalEntity.relationEmpty(this, "whiteVariantRelationMasterBarAsVariant"); }
        return _whiteVariantRelationMasterBarAsVariant;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_MASTER_BAR by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * @param whiteVariantRelationMasterBarAsVariant The entity of foreign property 'whiteVariantRelationMasterBarAsVariant'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterBarAsVariant(OptionalEntity<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarAsVariant) {
        _whiteVariantRelationMasterBarAsVariant = whiteVariantRelationMasterBarAsVariant;
    }

    /** WHITE_VARIANT_RELATION_MASTER_QUX by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'. */
    protected OptionalEntity<WhiteVariantRelationMasterQux> _whiteVariantRelationMasterQuxAsVariantByQue;

    /**
     * [get] WHITE_VARIANT_RELATION_MASTER_QUX by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationMasterQuxAsVariantByQue'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationMasterQux> getWhiteVariantRelationMasterQuxAsVariantByQue() {
        if (_whiteVariantRelationMasterQuxAsVariantByQue == null) { _whiteVariantRelationMasterQuxAsVariantByQue = OptionalEntity.relationEmpty(this, "whiteVariantRelationMasterQuxAsVariantByQue"); }
        return _whiteVariantRelationMasterQuxAsVariantByQue;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_MASTER_QUX by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * @param whiteVariantRelationMasterQuxAsVariantByQue The entity of foreign property 'whiteVariantRelationMasterQuxAsVariantByQue'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterQuxAsVariantByQue(OptionalEntity<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxAsVariantByQue) {
        _whiteVariantRelationMasterQuxAsVariantByQue = whiteVariantRelationMasterQuxAsVariantByQue;
    }

    /** WHITE_VARIANT_RELATION_MASTER_CORGE by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. */
    protected OptionalEntity<WhiteVariantRelationMasterCorge> _whiteVariantRelationMasterCorgeAsVariantByQuxType;

    /**
     * [get] WHITE_VARIANT_RELATION_MASTER_CORGE by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationMasterCorge> getWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        if (_whiteVariantRelationMasterCorgeAsVariantByQuxType == null) { _whiteVariantRelationMasterCorgeAsVariantByQuxType = OptionalEntity.relationEmpty(this, "whiteVariantRelationMasterCorgeAsVariantByQuxType"); }
        return _whiteVariantRelationMasterCorgeAsVariantByQuxType;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_MASTER_CORGE by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @param whiteVariantRelationMasterCorgeAsVariantByQuxType The entity of foreign property 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterCorgeAsVariantByQuxType(OptionalEntity<WhiteVariantRelationMasterCorge> whiteVariantRelationMasterCorgeAsVariantByQuxType) {
        _whiteVariantRelationMasterCorgeAsVariantByQuxType = whiteVariantRelationMasterCorgeAsVariantByQuxType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_VARIANT_RELATION_REFERRER_REF by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'. */
    protected List<WhiteVariantRelationReferrerRef> _whiteVariantRelationReferrerRefList;

    /**
     * [get] WHITE_VARIANT_RELATION_REFERRER_REF by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * @return The entity list of referrer property 'whiteVariantRelationReferrerRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteVariantRelationReferrerRef> getWhiteVariantRelationReferrerRefList() {
        if (_whiteVariantRelationReferrerRefList == null) { _whiteVariantRelationReferrerRefList = newReferrerList(); }
        return _whiteVariantRelationReferrerRefList;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_REFERRER_REF by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * @param whiteVariantRelationReferrerRefList The entity list of referrer property 'whiteVariantRelationReferrerRefList'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList) {
        _whiteVariantRelationReferrerRefList = whiteVariantRelationReferrerRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteVariantRelationReferrer) {
            BsWhiteVariantRelationReferrer other = (BsWhiteVariantRelationReferrer)obj;
            if (!xSV(_referrerId, other._referrerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _referrerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationMasterFooAsVariant != null && _whiteVariantRelationMasterFooAsVariant.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterFooAsVariant, "whiteVariantRelationMasterFooAsVariant")); }
        if (_whiteVariantRelationMasterBarAsVariant != null && _whiteVariantRelationMasterBarAsVariant.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterBarAsVariant, "whiteVariantRelationMasterBarAsVariant")); }
        if (_whiteVariantRelationMasterQuxAsVariantByQue != null && _whiteVariantRelationMasterQuxAsVariantByQue.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterQuxAsVariantByQue, "whiteVariantRelationMasterQuxAsVariantByQue")); }
        if (_whiteVariantRelationMasterCorgeAsVariantByQuxType != null && _whiteVariantRelationMasterCorgeAsVariantByQuxType.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterCorgeAsVariantByQuxType, "whiteVariantRelationMasterCorgeAsVariantByQuxType")); }
        if (_whiteVariantRelationReferrerRefList != null) { for (WhiteVariantRelationReferrerRef et : _whiteVariantRelationReferrerRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteVariantRelationReferrerRefList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_referrerId));
        sb.append(dm).append(xfND(_variantMasterId));
        sb.append(dm).append(xfND(_masterTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationMasterFooAsVariant != null && _whiteVariantRelationMasterFooAsVariant.isPresent())
        { sb.append(dm).append("whiteVariantRelationMasterFooAsVariant"); }
        if (_whiteVariantRelationMasterBarAsVariant != null && _whiteVariantRelationMasterBarAsVariant.isPresent())
        { sb.append(dm).append("whiteVariantRelationMasterBarAsVariant"); }
        if (_whiteVariantRelationMasterQuxAsVariantByQue != null && _whiteVariantRelationMasterQuxAsVariantByQue.isPresent())
        { sb.append(dm).append("whiteVariantRelationMasterQuxAsVariantByQue"); }
        if (_whiteVariantRelationMasterCorgeAsVariantByQuxType != null && _whiteVariantRelationMasterCorgeAsVariantByQuxType.isPresent())
        { sb.append(dm).append("whiteVariantRelationMasterCorgeAsVariantByQuxType"); }
        if (_whiteVariantRelationReferrerRefList != null && !_whiteVariantRelationReferrerRefList.isEmpty())
        { sb.append(dm).append("whiteVariantRelationReferrerRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationReferrer clone() {
        return (WhiteVariantRelationReferrer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REFERRER_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'REFERRER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReferrerId() {
        checkSpecifiedProperty("referrerId");
        return _referrerId;
    }

    /**
     * [set] REFERRER_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param referrerId The value of the column 'REFERRER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferrerId(Long referrerId) {
        registerModifiedProperty("referrerId");
        _referrerId = referrerId;
    }

    /**
     * [get] VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br>
     * @return The value of the column 'VARIANT_MASTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVariantMasterId() {
        checkSpecifiedProperty("variantMasterId");
        return _variantMasterId;
    }

    /**
     * [set] VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br>
     * @param variantMasterId The value of the column 'VARIANT_MASTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVariantMasterId(Long variantMasterId) {
        registerModifiedProperty("variantMasterId");
        _variantMasterId = variantMasterId;
    }

    /**
     * [get] MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br>
     * @return The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterTypeCode() {
        checkSpecifiedProperty("masterTypeCode");
        return _masterTypeCode;
    }

    /**
     * [set] MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br>
     * @param masterTypeCode The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setMasterTypeCode(String masterTypeCode) {
        checkClassificationCode("MASTER_TYPE_CODE", CDef.DefMeta.VariantRelationMasterType, masterTypeCode);
        registerModifiedProperty("masterTypeCode");
        _masterTypeCode = masterTypeCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param masterTypeCode The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMasterTypeCode(String masterTypeCode) {
        setMasterTypeCode(masterTypeCode);
    }
}
