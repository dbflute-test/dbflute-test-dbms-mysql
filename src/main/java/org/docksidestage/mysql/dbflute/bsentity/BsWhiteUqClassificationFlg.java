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
 * The entity of WHITE_UQ_CLASSIFICATION_FLG as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqClassificationFlg extends AbstractEntity implements DomainEntity {

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

    /** UQ_CLS_FLG: {UQ, NotNull, INT(10), classification=Flg} */
    protected Integer _uqClsFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_uq_classification_flg";
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
     * @param uqClsFlg : UQ, NotNull, INT(10), classification=Flg. (NotNull)
     */
    public void uniqueBy(CDef.Flg uqClsFlg) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uqClsFlg");
        setUqClsFlgAsFlg(uqClsFlg);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of uqClsFlg as the classification of Flg. <br>
     * UQ_CLS_FLG: {UQ, NotNull, INT(10), classification=Flg} <br>
     * フラグを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getUqClsFlgAsFlg() {
        return CDef.Flg.of(getUqClsFlg()).orElse(null);
    }

    /**
     * Set the value of uqClsFlg as the classification of Flg. <br>
     * UQ_CLS_FLG: {UQ, NotNull, INT(10), classification=Flg} <br>
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUqClsFlgAsFlg(CDef.Flg cdef) {
        setUqClsFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of uqClsFlg as True (1). <br>
     * はい: 有効を示す
     */
    public void setUqClsFlg_True() {
        setUqClsFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of uqClsFlg as False (0). <br>
     * いいえ: 無効を示す
     */
    public void setUqClsFlg_False() {
        setUqClsFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of uqClsFlg True? <br>
     * はい: 有効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUqClsFlgTrue() {
        CDef.Flg cdef = getUqClsFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of uqClsFlg False? <br>
     * いいえ: 無効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUqClsFlgFalse() {
        CDef.Flg cdef = getUqClsFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'uqClsFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUqClsFlgName() {
        CDef.Flg cdef = getUqClsFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'uqClsFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getUqClsFlgAlias() {
        CDef.Flg cdef = getUqClsFlgAsFlg();
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
        if (obj instanceof BsWhiteUqClassificationFlg) {
            BsWhiteUqClassificationFlg other = (BsWhiteUqClassificationFlg)obj;
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
        sb.append(dm).append(xfND(_uqClsFlg));
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
    public WhiteUqClassificationFlg clone() {
        return (WhiteUqClassificationFlg)super.clone();
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
     * [get] UQ_CLS_FLG: {UQ, NotNull, INT(10), classification=Flg} <br>
     * @return The value of the column 'UQ_CLS_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUqClsFlg() {
        checkSpecifiedProperty("uqClsFlg");
        return _uqClsFlg;
    }

    /**
     * [set] UQ_CLS_FLG: {UQ, NotNull, INT(10), classification=Flg} <br>
     * @param uqClsFlg The value of the column 'UQ_CLS_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setUqClsFlg(Integer uqClsFlg) {
        checkClassificationCode("UQ_CLS_FLG", CDef.DefMeta.Flg, uqClsFlg);
        registerModifiedProperty("uqClsFlg");
        _uqClsFlg = uqClsFlg;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param uqClsFlg The value of the column 'UQ_CLS_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingUqClsFlg(Integer uqClsFlg) {
        setUqClsFlg(uqClsFlg);
    }
}
