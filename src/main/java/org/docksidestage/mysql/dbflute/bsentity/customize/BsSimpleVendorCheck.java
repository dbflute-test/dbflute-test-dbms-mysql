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
package org.docksidestage.mysql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.customize.*;

/**
 * The entity of SimpleVendorCheck.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSimpleVendorCheck extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** VENDOR_CHECK_ID: {DECIMAL(16), refers to vendor_check.VENDOR_CHECK_ID} */
    protected Long _vendorCheckId;

    /** TYPE_OF_TEXT: {VARCHAR(16383), refers to vendor_check.TYPE_OF_TEXT} */
    protected String _typeOfText;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3), refers to vendor_check.TYPE_OF_NUMERIC_DECIMAL} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5), refers to vendor_check.TYPE_OF_NUMERIC_INTEGER} */
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12), refers to vendor_check.TYPE_OF_NUMERIC_BIGINT} */
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_BOOLEAN: {TINYINT(1), refers to vendor_check.TYPE_OF_BOOLEAN, classification=BooleanFlg} */
    protected Boolean _typeOfBoolean;

    /** TYPE_OF_BLOB: {BLOB(65535), refers to vendor_check.TYPE_OF_BLOB} */
    protected byte[] _typeOfBlob;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.mysql.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SimpleVendorCheck";
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
     * Get the value of typeOfBoolean as the classification of BooleanFlg. <br>
     * TYPE_OF_BOOLEAN: {TINYINT(1), refers to vendor_check.TYPE_OF_BOOLEAN, classification=BooleanFlg} <br>
     * boolean classification for boolean column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BooleanFlg getTypeOfBooleanAsBooleanFlg() {
        return CDef.BooleanFlg.of(getTypeOfBoolean()).orElse(null);
    }

    /**
     * Set the value of typeOfBoolean as the classification of BooleanFlg. <br>
     * TYPE_OF_BOOLEAN: {TINYINT(1), refers to vendor_check.TYPE_OF_BOOLEAN, classification=BooleanFlg} <br>
     * boolean classification for boolean column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg cdef) {
        setTypeOfBoolean(cdef != null ? toBoolean(cdef.code()) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of typeOfBoolean as True (true). <br>
     * Checked: means yes
     */
    public void setTypeOfBoolean_True() {
        setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg.True);
    }

    /**
     * Set the value of typeOfBoolean as False (false). <br>
     * Unchecked: means no
     */
    public void setTypeOfBoolean_False() {
        setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of typeOfBoolean True? <br>
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBooleanTrue() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.True) : false;
    }

    /**
     * Is the value of typeOfBoolean False? <br>
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBooleanFalse() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'typeOfBoolean' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getTypeOfBooleanAlias() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
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
        if (obj instanceof BsSimpleVendorCheck) {
            BsSimpleVendorCheck other = (BsSimpleVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_typeOfText, other._typeOfText)) { return false; }
            if (!xSV(_typeOfNumericDecimal, other._typeOfNumericDecimal)) { return false; }
            if (!xSV(_typeOfNumericInteger, other._typeOfNumericInteger)) { return false; }
            if (!xSV(_typeOfNumericBigint, other._typeOfNumericBigint)) { return false; }
            if (!xSV(_typeOfBoolean, other._typeOfBoolean)) { return false; }
            if (!xSV(_typeOfBlob, other._typeOfBlob)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _vendorCheckId);
        hs = xCH(hs, _typeOfText);
        hs = xCH(hs, _typeOfNumericDecimal);
        hs = xCH(hs, _typeOfNumericInteger);
        hs = xCH(hs, _typeOfNumericBigint);
        hs = xCH(hs, _typeOfBoolean);
        hs = xCH(hs, _typeOfBlob);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorCheckId));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfNumericDecimal));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
        sb.append(dm).append(xfND(_typeOfNumericBigint));
        sb.append(dm).append(xfND(_typeOfBoolean));
        sb.append(dm).append(xfBA(_typeOfBlob));
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
    public SimpleVendorCheck clone() {
        return (SimpleVendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {DECIMAL(16), refers to vendor_check.VENDOR_CHECK_ID} <br>
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {DECIMAL(16), refers to vendor_check.VENDOR_CHECK_ID} <br>
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_TEXT: {VARCHAR(16383), refers to vendor_check.TYPE_OF_TEXT} <br>
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {VARCHAR(16383), refers to vendor_check.TYPE_OF_TEXT} <br>
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3), refers to vendor_check.TYPE_OF_NUMERIC_DECIMAL} <br>
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3), refers to vendor_check.TYPE_OF_NUMERIC_DECIMAL} <br>
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5), refers to vendor_check.TYPE_OF_NUMERIC_INTEGER} <br>
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5), refers to vendor_check.TYPE_OF_NUMERIC_INTEGER} <br>
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12), refers to vendor_check.TYPE_OF_NUMERIC_BIGINT} <br>
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12), refers to vendor_check.TYPE_OF_NUMERIC_BIGINT} <br>
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {TINYINT(1), refers to vendor_check.TYPE_OF_BOOLEAN, classification=BooleanFlg} <br>
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBoolean() {
        checkSpecifiedProperty("typeOfBoolean");
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {TINYINT(1), refers to vendor_check.TYPE_OF_BOOLEAN, classification=BooleanFlg} <br>
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBoolean(Boolean typeOfBoolean) {
        registerModifiedProperty("typeOfBoolean");
        _typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(65535), refers to vendor_check.TYPE_OF_BLOB} <br>
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        checkSpecifiedProperty("typeOfBlob");
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(65535), refers to vendor_check.TYPE_OF_BLOB} <br>
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        registerModifiedProperty("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }
}
