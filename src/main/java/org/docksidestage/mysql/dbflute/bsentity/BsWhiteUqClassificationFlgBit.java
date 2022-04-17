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
 * The entity of WHITE_UQ_CLASSIFICATION_FLG_BIT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     UQ_CLS_ID
 *
 * [column]
 *     UQ_CLS_ID, UQ_CLS_NAME, UQ_CLS_BIT_FLG
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqClsId = entity.getUqClsId();
 * String uqClsName = entity.getUqClsName();
 * Boolean uqClsBitFlg = entity.getUqClsBitFlg();
 * entity.setUqClsId(uqClsId);
 * entity.setUqClsName(uqClsName);
 * entity.setUqClsBitFlg(uqClsBitFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqClassificationFlgBit extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** UQ_CLS_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqClsId;

    /** UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)} */
    protected String _uqClsName;

    /** UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg} */
    protected Boolean _uqClsBitFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_uq_classification_flg_bit";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_uqClsId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uqClsName : UQ+, NotNull, VARCHAR(30). (NotNull)
     * @param uqClsBitFlg : +UQ, NotNull, BIT(1), classification=BooleanFlg. (NotNull)
     */
    public void uniqueBy(String uqClsName, CDef.BooleanFlg uqClsBitFlg) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uqClsName");
        __uniqueDrivenProperties.addPropertyName("uqClsBitFlg");
        setUqClsName(uqClsName);setUqClsBitFlgAsBooleanFlg(uqClsBitFlg);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of uqClsBitFlg as the classification of BooleanFlg. <br>
     * UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg} <br>
     * boolean classification for boolean column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BooleanFlg getUqClsBitFlgAsBooleanFlg() {
        return CDef.BooleanFlg.of(getUqClsBitFlg()).orElse(null);
    }

    /**
     * Set the value of uqClsBitFlg as the classification of BooleanFlg. <br>
     * UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg} <br>
     * boolean classification for boolean column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUqClsBitFlgAsBooleanFlg(CDef.BooleanFlg cdef) {
        setUqClsBitFlg(cdef != null ? toBoolean(cdef.code()) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of uqClsBitFlg as True (true). <br>
     * Checked: means yes
     */
    public void setUqClsBitFlg_True() {
        setUqClsBitFlgAsBooleanFlg(CDef.BooleanFlg.True);
    }

    /**
     * Set the value of uqClsBitFlg as False (false). <br>
     * Unchecked: means no
     */
    public void setUqClsBitFlg_False() {
        setUqClsBitFlgAsBooleanFlg(CDef.BooleanFlg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of uqClsBitFlg True? <br>
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUqClsBitFlgTrue() {
        CDef.BooleanFlg cdef = getUqClsBitFlgAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.True) : false;
    }

    /**
     * Is the value of uqClsBitFlg False? <br>
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUqClsBitFlgFalse() {
        CDef.BooleanFlg cdef = getUqClsBitFlgAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'uqClsBitFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getUqClsBitFlgAlias() {
        CDef.BooleanFlg cdef = getUqClsBitFlgAsBooleanFlg();
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
        if (obj instanceof BsWhiteUqClassificationFlgBit) {
            BsWhiteUqClassificationFlgBit other = (BsWhiteUqClassificationFlgBit)obj;
            if (!xSV(_uqClsId, other._uqClsId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _uqClsId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqClsId));
        sb.append(dm).append(xfND(_uqClsName));
        sb.append(dm).append(xfND(_uqClsBitFlg));
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
    public WhiteUqClassificationFlgBit clone() {
        return (WhiteUqClassificationFlgBit)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_CLS_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'UQ_CLS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqClsId() {
        checkSpecifiedProperty("uqClsId");
        return _uqClsId;
    }

    /**
     * [set] UQ_CLS_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param uqClsId The value of the column 'UQ_CLS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqClsId(Long uqClsId) {
        registerModifiedProperty("uqClsId");
        _uqClsId = uqClsId;
    }

    /**
     * [get] UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)} <br>
     * @return The value of the column 'UQ_CLS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUqClsName() {
        checkSpecifiedProperty("uqClsName");
        return _uqClsName;
    }

    /**
     * [set] UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)} <br>
     * @param uqClsName The value of the column 'UQ_CLS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUqClsName(String uqClsName) {
        registerModifiedProperty("uqClsName");
        _uqClsName = uqClsName;
    }

    /**
     * [get] UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg} <br>
     * @return The value of the column 'UQ_CLS_BIT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getUqClsBitFlg() {
        checkSpecifiedProperty("uqClsBitFlg");
        return _uqClsBitFlg;
    }

    /**
     * [set] UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg} <br>
     * @param uqClsBitFlg The value of the column 'UQ_CLS_BIT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setUqClsBitFlg(Boolean uqClsBitFlg) {
        registerModifiedProperty("uqClsBitFlg");
        _uqClsBitFlg = uqClsBitFlg;
    }
}
