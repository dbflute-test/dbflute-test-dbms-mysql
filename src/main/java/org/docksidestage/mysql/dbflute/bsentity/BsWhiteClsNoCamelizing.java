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
 * The entity of WHITE_CLS_NO_CAMELIZING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     NO_CAMELIZING_CODE
 *
 * [column]
 *     NO_CAMELIZING_CODE, NO_CAMELIZING_NAME
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
 * String noCamelizingCode = entity.getNoCamelizingCode();
 * String noCamelizingName = entity.getNoCamelizingName();
 * entity.setNoCamelizingCode(noCamelizingCode);
 * entity.setNoCamelizingName(noCamelizingName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteClsNoCamelizing extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} */
    protected String _noCamelizingCode;

    /** NO_CAMELIZING_NAME: {VARCHAR(20)} */
    protected String _noCamelizingName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_cls_no_camelizing";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_noCamelizingCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of noCamelizingCode as the classification of NamingDefaultCamelizingType. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * no camelizing classification
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.NamingDefaultCamelizingType getNoCamelizingCodeAsNamingDefaultCamelizingType() {
        return CDef.NamingDefaultCamelizingType.codeOf(getNoCamelizingCode());
    }

    /**
     * Set the value of noCamelizingCode as the classification of NamingDefaultCamelizingType. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * no camelizing classification
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNoCamelizingCodeAsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType cdef) {
        setNoCamelizingCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of noCamelizingCode as Bonvo (BONVO). <br>
     * Bonvo
     */
    public void setNoCamelizingCode_Bonvo() {
        setNoCamelizingCodeAsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Bonvo);
    }

    /**
     * Set the value of noCamelizingCode as Dstore (DSTORE). <br>
     * dstore
     */
    public void setNoCamelizingCode_Dstore() {
        setNoCamelizingCodeAsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Dstore);
    }

    /**
     * Set the value of noCamelizingCode as LAND陸oneman (LAND). <br>
     * LAND陸oneman
     */
    public void setNoCamelizingCode_LAND陸oneman() {
        setNoCamelizingCodeAsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.LAND陸oneman);
    }

    /**
     * Set the value of noCamelizingCode as PiArI (PIARI). <br>
     * PI AR-I
     */
    public void setNoCamelizingCode_PiArI() {
        setNoCamelizingCodeAsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.PiArI);
    }

    /**
     * Set the value of noCamelizingCode as Sea海mystic (SEA). <br>
     * SEA海MYSTIC
     */
    public void setNoCamelizingCode_Sea海mystic() {
        setNoCamelizingCodeAsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Sea海mystic);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of noCamelizingCode Bonvo? <br>
     * Bonvo
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoCamelizingCodeBonvo() {
        CDef.NamingDefaultCamelizingType cdef = getNoCamelizingCodeAsNamingDefaultCamelizingType();
        return cdef != null ? cdef.equals(CDef.NamingDefaultCamelizingType.Bonvo) : false;
    }

    /**
     * Is the value of noCamelizingCode Dstore? <br>
     * dstore
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoCamelizingCodeDstore() {
        CDef.NamingDefaultCamelizingType cdef = getNoCamelizingCodeAsNamingDefaultCamelizingType();
        return cdef != null ? cdef.equals(CDef.NamingDefaultCamelizingType.Dstore) : false;
    }

    /**
     * Is the value of noCamelizingCode LAND陸oneman? <br>
     * LAND陸oneman
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoCamelizingCodeLAND陸oneman() {
        CDef.NamingDefaultCamelizingType cdef = getNoCamelizingCodeAsNamingDefaultCamelizingType();
        return cdef != null ? cdef.equals(CDef.NamingDefaultCamelizingType.LAND陸oneman) : false;
    }

    /**
     * Is the value of noCamelizingCode PiArI? <br>
     * PI AR-I
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoCamelizingCodePiArI() {
        CDef.NamingDefaultCamelizingType cdef = getNoCamelizingCodeAsNamingDefaultCamelizingType();
        return cdef != null ? cdef.equals(CDef.NamingDefaultCamelizingType.PiArI) : false;
    }

    /**
     * Is the value of noCamelizingCode Sea海mystic? <br>
     * SEA海MYSTIC
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNoCamelizingCodeSea海mystic() {
        CDef.NamingDefaultCamelizingType cdef = getNoCamelizingCodeAsNamingDefaultCamelizingType();
        return cdef != null ? cdef.equals(CDef.NamingDefaultCamelizingType.Sea海mystic) : false;
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
        if (obj instanceof BsWhiteClsNoCamelizing) {
            BsWhiteClsNoCamelizing other = (BsWhiteClsNoCamelizing)obj;
            if (!xSV(_noCamelizingCode, other._noCamelizingCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _noCamelizingCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_noCamelizingCode));
        sb.append(dm).append(xfND(_noCamelizingName));
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
    public WhiteClsNoCamelizing clone() {
        return (WhiteClsNoCamelizing)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * @return The value of the column 'NO_CAMELIZING_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNoCamelizingCode() {
        checkSpecifiedProperty("noCamelizingCode");
        return _noCamelizingCode;
    }

    /**
     * [set] NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * @param noCamelizingCode The value of the column 'NO_CAMELIZING_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setNoCamelizingCode(String noCamelizingCode) {
        checkClassificationCode("NO_CAMELIZING_CODE", CDef.DefMeta.NamingDefaultCamelizingType, noCamelizingCode);
        registerModifiedProperty("noCamelizingCode");
        _noCamelizingCode = noCamelizingCode;
    }

    /**
     * [get] NO_CAMELIZING_NAME: {VARCHAR(20)} <br>
     * @return The value of the column 'NO_CAMELIZING_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoCamelizingName() {
        checkSpecifiedProperty("noCamelizingName");
        return _noCamelizingName;
    }

    /**
     * [set] NO_CAMELIZING_NAME: {VARCHAR(20)} <br>
     * @param noCamelizingName The value of the column 'NO_CAMELIZING_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoCamelizingName(String noCamelizingName) {
        registerModifiedProperty("noCamelizingName");
        _noCamelizingName = noCamelizingName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param noCamelizingCode The value of the column 'NO_CAMELIZING_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingNoCamelizingCode(String noCamelizingCode) {
        setNoCamelizingCode(noCamelizingCode);
    }
}
