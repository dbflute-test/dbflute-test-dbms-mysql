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
 * The entity of WHITE_VARIANT_RELATION_MASTER_CORGE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterCorge extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _masterCorgeId;

    /** MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterCorgeName;

    /** CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} */
    protected String _corgeTypeCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_variant_relation_master_corge";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_masterCorgeId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of corgeTypeCode as the classification of VariantRelationQuxType. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.VariantRelationQuxType getCorgeTypeCodeAsVariantRelationQuxType() {
        return CDef.VariantRelationQuxType.of(getCorgeTypeCode()).orElse(null);
    }

    /**
     * Set the value of corgeTypeCode as the classification of VariantRelationQuxType. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        setCorgeTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of corgeTypeCode as Qua (Qua). <br>
     * Qua
     */
    public void setCorgeTypeCode_Qua() {
        setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Set the value of corgeTypeCode as Que (Que). <br>
     * Que
     */
    public void setCorgeTypeCode_Que() {
        setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Set the value of corgeTypeCode as Quo (Quo). <br>
     * Quo
     */
    public void setCorgeTypeCode_Quo() {
        setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of corgeTypeCode Qua? <br>
     * Qua
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorgeTypeCodeQua() {
        CDef.VariantRelationQuxType cdef = getCorgeTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Qua) : false;
    }

    /**
     * Is the value of corgeTypeCode Que? <br>
     * Que
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorgeTypeCodeQue() {
        CDef.VariantRelationQuxType cdef = getCorgeTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Que) : false;
    }

    /**
     * Is the value of corgeTypeCode Quo? <br>
     * Quo
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorgeTypeCodeQuo() {
        CDef.VariantRelationQuxType cdef = getCorgeTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Quo) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
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
        if (obj instanceof BsWhiteVariantRelationMasterCorge) {
            BsWhiteVariantRelationMasterCorge other = (BsWhiteVariantRelationMasterCorge)obj;
            if (!xSV(_masterCorgeId, other._masterCorgeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _masterCorgeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_masterCorgeId));
        sb.append(dm).append(xfND(_masterCorgeName));
        sb.append(dm).append(xfND(_corgeTypeCode));
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
    public WhiteVariantRelationMasterCorge clone() {
        return (WhiteVariantRelationMasterCorge)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'MASTER_CORGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterCorgeId() {
        checkSpecifiedProperty("masterCorgeId");
        return _masterCorgeId;
    }

    /**
     * [set] MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param masterCorgeId The value of the column 'MASTER_CORGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterCorgeId(Long masterCorgeId) {
        registerModifiedProperty("masterCorgeId");
        _masterCorgeId = masterCorgeId;
    }

    /**
     * [get] MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MASTER_CORGE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterCorgeName() {
        checkSpecifiedProperty("masterCorgeName");
        return _masterCorgeName;
    }

    /**
     * [set] MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param masterCorgeName The value of the column 'MASTER_CORGE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterCorgeName(String masterCorgeName) {
        registerModifiedProperty("masterCorgeName");
        _masterCorgeName = masterCorgeName;
    }

    /**
     * [get] CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * @return The value of the column 'CORGE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCorgeTypeCode() {
        checkSpecifiedProperty("corgeTypeCode");
        return _corgeTypeCode;
    }

    /**
     * [set] CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * @param corgeTypeCode The value of the column 'CORGE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setCorgeTypeCode(String corgeTypeCode) {
        checkClassificationCode("CORGE_TYPE_CODE", CDef.DefMeta.VariantRelationQuxType, corgeTypeCode);
        registerModifiedProperty("corgeTypeCode");
        _corgeTypeCode = corgeTypeCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param corgeTypeCode The value of the column 'CORGE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingCorgeTypeCode(String corgeTypeCode) {
        setCorgeTypeCode(corgeTypeCode);
    }
}
