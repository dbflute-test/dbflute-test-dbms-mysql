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
 * The entity of VENDOR_CHECK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_TEXT, TYPE_OF_TINYTEXT, TYPE_OF_MEDIUMTEXT, TYPE_OF_LONGTEXT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_FLOAT, TYPE_OF_DOUBLE, TYPE_OF_DATE, TYPE_OF_DATETIME, TYPE_OF_DATETIME_3_MILLIS, TYPE_OF_DATETIME_6_MICROS, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_YEAR, TYPE_OF_BOOLEAN, TYPE_OF_BLOB, TYPE_OF_TINYBLOB, TYPE_OF_MEDIUMBLOB, TYPE_OF_LONGBLOB, TYPE_OF_BINARY, TYPE_OF_VARBINARY, TYPE_OF_ENUM, TYPE_OF_ENUM_INT, TYPE_OF_SET
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfChar = entity.getTypeOfChar();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * String typeOfText = entity.getTypeOfText();
 * String typeOfTinytext = entity.getTypeOfTinytext();
 * String typeOfMediumtext = entity.getTypeOfMediumtext();
 * String typeOfLongtext = entity.getTypeOfLongtext();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * java.math.BigDecimal typeOfDecimalDecimal = entity.getTypeOfDecimalDecimal();
 * Integer typeOfDecimalInteger = entity.getTypeOfDecimalInteger();
 * Long typeOfDecimalBigint = entity.getTypeOfDecimalBigint();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * java.math.BigDecimal typeOfFloat = entity.getTypeOfFloat();
 * java.math.BigDecimal typeOfDouble = entity.getTypeOfDouble();
 * java.time.LocalDate typeOfDate = entity.getTypeOfDate();
 * java.time.LocalDateTime typeOfDatetime = entity.getTypeOfDatetime();
 * java.time.LocalDateTime typeOfDatetime3Millis = entity.getTypeOfDatetime3Millis();
 * java.time.LocalDateTime typeOfDatetime6Micros = entity.getTypeOfDatetime6Micros();
 * java.time.LocalDateTime typeOfTimestamp = entity.getTypeOfTimestamp();
 * java.time.LocalTime typeOfTime = entity.getTypeOfTime();
 * java.time.LocalDate typeOfYear = entity.getTypeOfYear();
 * Boolean typeOfBoolean = entity.getTypeOfBoolean();
 * byte[] typeOfBlob = entity.getTypeOfBlob();
 * byte[] typeOfTinyblob = entity.getTypeOfTinyblob();
 * byte[] typeOfMediumblob = entity.getTypeOfMediumblob();
 * byte[] typeOfLongblob = entity.getTypeOfLongblob();
 * byte[] typeOfBinary = entity.getTypeOfBinary();
 * byte[] typeOfVarbinary = entity.getTypeOfVarbinary();
 * String typeOfEnum = entity.getTypeOfEnum();
 * String typeOfEnumInt = entity.getTypeOfEnumInt();
 * String typeOfSet = entity.getTypeOfSet();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfTinytext(typeOfTinytext);
 * entity.setTypeOfMediumtext(typeOfMediumtext);
 * entity.setTypeOfLongtext(typeOfLongtext);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfDecimalDecimal(typeOfDecimalDecimal);
 * entity.setTypeOfDecimalInteger(typeOfDecimalInteger);
 * entity.setTypeOfDecimalBigint(typeOfDecimalBigint);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfFloat(typeOfFloat);
 * entity.setTypeOfDouble(typeOfDouble);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfDatetime(typeOfDatetime);
 * entity.setTypeOfDatetime3Millis(typeOfDatetime3Millis);
 * entity.setTypeOfDatetime6Micros(typeOfDatetime6Micros);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfTime(typeOfTime);
 * entity.setTypeOfYear(typeOfYear);
 * entity.setTypeOfBoolean(typeOfBoolean);
 * entity.setTypeOfBlob(typeOfBlob);
 * entity.setTypeOfTinyblob(typeOfTinyblob);
 * entity.setTypeOfMediumblob(typeOfMediumblob);
 * entity.setTypeOfLongblob(typeOfLongblob);
 * entity.setTypeOfBinary(typeOfBinary);
 * entity.setTypeOfVarbinary(typeOfVarbinary);
 * entity.setTypeOfEnum(typeOfEnum);
 * entity.setTypeOfEnumInt(typeOfEnumInt);
 * entity.setTypeOfSet(typeOfSet);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheck extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_CHAR: {CHAR(3)} */
    protected String _typeOfChar;

    /** TYPE_OF_VARCHAR: {VARCHAR(200)} */
    protected String _typeOfVarchar;

    /** TYPE_OF_TEXT: {TEXT(65535)} */
    protected String _typeOfText;

    /** TYPE_OF_TINYTEXT: {TINYTEXT(255)} */
    protected String _typeOfTinytext;

    /** TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} */
    protected String _typeOfMediumtext;

    /** TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} */
    protected String _typeOfLongtext;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} */
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} */
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfDecimalDecimal;

    /** TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} */
    protected Integer _typeOfDecimalInteger;

    /** TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} */
    protected Long _typeOfDecimalBigint;

    /** TYPE_OF_INTEGER: {INT(10)} */
    protected Integer _typeOfInteger;

    /** TYPE_OF_BIGINT: {BIGINT(19)} */
    protected Long _typeOfBigint;

    /** TYPE_OF_FLOAT: {FLOAT(12)} */
    protected java.math.BigDecimal _typeOfFloat;

    /** TYPE_OF_DOUBLE: {DOUBLE(22)} */
    protected java.math.BigDecimal _typeOfDouble;

    /** TYPE_OF_DATE: {DATE(10)} */
    protected java.time.LocalDate _typeOfDate;

    /** TYPE_OF_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _typeOfDatetime;

    /** TYPE_OF_DATETIME_3_MILLIS: {DATETIME(19)} */
    protected java.time.LocalDateTime _typeOfDatetime3Millis;

    /** TYPE_OF_DATETIME_6_MICROS: {DATETIME(19)} */
    protected java.time.LocalDateTime _typeOfDatetime6Micros;

    /** TYPE_OF_TIMESTAMP: {TIMESTAMP(19)} */
    protected java.time.LocalDateTime _typeOfTimestamp;

    /** TYPE_OF_TIME: {TIME(8)} */
    protected java.time.LocalTime _typeOfTime;

    /** TYPE_OF_YEAR: {YEAR} */
    protected java.time.LocalDate _typeOfYear;

    /** TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} */
    protected Boolean _typeOfBoolean;

    /** TYPE_OF_BLOB: {BLOB(65535)} */
    protected byte[] _typeOfBlob;

    /** TYPE_OF_TINYBLOB: {TINYBLOB(255)} */
    protected byte[] _typeOfTinyblob;

    /** TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} */
    protected byte[] _typeOfMediumblob;

    /** TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} */
    protected byte[] _typeOfLongblob;

    /** TYPE_OF_BINARY: {BINARY(1)} */
    protected byte[] _typeOfBinary;

    /** TYPE_OF_VARBINARY: {VARBINARY(1000)} */
    protected byte[] _typeOfVarbinary;

    /** TYPE_OF_ENUM: {ENUM(6)} */
    protected String _typeOfEnum;

    /** TYPE_OF_ENUM_INT: {ENUM(2)} */
    protected String _typeOfEnumInt;

    /** TYPE_OF_SET: {SET(15)} */
    protected String _typeOfSet;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_check";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_vendorCheckId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of typeOfBoolean as the classification of BooleanFlg. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br>
     * boolean classification for boolean column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BooleanFlg getTypeOfBooleanAsBooleanFlg() {
        return CDef.BooleanFlg.codeOf(getTypeOfBoolean());
    }

    /**
     * Set the value of typeOfBoolean as the classification of BooleanFlg. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br>
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
        if (obj instanceof BsVendorCheck) {
            BsVendorCheck other = (BsVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
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
        sb.append(dm).append(xfND(_typeOfChar));
        sb.append(dm).append(xfND(_typeOfVarchar));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfTinytext));
        sb.append(dm).append(xfND(_typeOfMediumtext));
        sb.append(dm).append(xfND(_typeOfLongtext));
        sb.append(dm).append(xfND(_typeOfNumericDecimal));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
        sb.append(dm).append(xfND(_typeOfNumericBigint));
        sb.append(dm).append(xfND(_typeOfDecimalDecimal));
        sb.append(dm).append(xfND(_typeOfDecimalInteger));
        sb.append(dm).append(xfND(_typeOfDecimalBigint));
        sb.append(dm).append(xfND(_typeOfInteger));
        sb.append(dm).append(xfND(_typeOfBigint));
        sb.append(dm).append(xfND(_typeOfFloat));
        sb.append(dm).append(xfND(_typeOfDouble));
        sb.append(dm).append(xfND(_typeOfDate));
        sb.append(dm).append(xfND(_typeOfDatetime));
        sb.append(dm).append(xfND(_typeOfDatetime3Millis));
        sb.append(dm).append(xfND(_typeOfDatetime6Micros));
        sb.append(dm).append(xfND(_typeOfTimestamp));
        sb.append(dm).append(xfND(_typeOfTime));
        sb.append(dm).append(xfND(_typeOfYear));
        sb.append(dm).append(xfND(_typeOfBoolean));
        sb.append(dm).append(xfBA(_typeOfBlob));
        sb.append(dm).append(xfBA(_typeOfTinyblob));
        sb.append(dm).append(xfBA(_typeOfMediumblob));
        sb.append(dm).append(xfBA(_typeOfLongblob));
        sb.append(dm).append(xfBA(_typeOfBinary));
        sb.append(dm).append(xfBA(_typeOfVarbinary));
        sb.append(dm).append(xfND(_typeOfEnum));
        sb.append(dm).append(xfND(_typeOfEnumInt));
        sb.append(dm).append(xfND(_typeOfSet));
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
    public VendorCheck clone() {
        return (VendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br>
     * @return The value of the column 'TYPE_OF_CHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        checkSpecifiedProperty("typeOfChar");
        return _typeOfChar;
    }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br>
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        registerModifiedProperty("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(200)} <br>
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(200)} <br>
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_TEXT: {TEXT(65535)} <br>
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {TEXT(65535)} <br>
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br>
     * @return The value of the column 'TYPE_OF_TINYTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfTinytext() {
        checkSpecifiedProperty("typeOfTinytext");
        return _typeOfTinytext;
    }

    /**
     * [set] TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br>
     * @param typeOfTinytext The value of the column 'TYPE_OF_TINYTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTinytext(String typeOfTinytext) {
        registerModifiedProperty("typeOfTinytext");
        _typeOfTinytext = typeOfTinytext;
    }

    /**
     * [get] TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br>
     * @return The value of the column 'TYPE_OF_MEDIUMTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfMediumtext() {
        checkSpecifiedProperty("typeOfMediumtext");
        return _typeOfMediumtext;
    }

    /**
     * [set] TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br>
     * @param typeOfMediumtext The value of the column 'TYPE_OF_MEDIUMTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMediumtext(String typeOfMediumtext) {
        registerModifiedProperty("typeOfMediumtext");
        _typeOfMediumtext = typeOfMediumtext;
    }

    /**
     * [get] TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br>
     * @return The value of the column 'TYPE_OF_LONGTEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLongtext() {
        checkSpecifiedProperty("typeOfLongtext");
        return _typeOfLongtext;
    }

    /**
     * [set] TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br>
     * @param typeOfLongtext The value of the column 'TYPE_OF_LONGTEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongtext(String typeOfLongtext) {
        registerModifiedProperty("typeOfLongtext");
        _typeOfLongtext = typeOfLongtext;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br>
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br>
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br>
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br>
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br>
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br>
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br>
     * @return The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimalDecimal() {
        checkSpecifiedProperty("typeOfDecimalDecimal");
        return _typeOfDecimalDecimal;
    }

    /**
     * [set] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br>
     * @param typeOfDecimalDecimal The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalDecimal(java.math.BigDecimal typeOfDecimalDecimal) {
        registerModifiedProperty("typeOfDecimalDecimal");
        _typeOfDecimalDecimal = typeOfDecimalDecimal;
    }

    /**
     * [get] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br>
     * @return The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfDecimalInteger() {
        checkSpecifiedProperty("typeOfDecimalInteger");
        return _typeOfDecimalInteger;
    }

    /**
     * [set] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br>
     * @param typeOfDecimalInteger The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalInteger(Integer typeOfDecimalInteger) {
        registerModifiedProperty("typeOfDecimalInteger");
        _typeOfDecimalInteger = typeOfDecimalInteger;
    }

    /**
     * [get] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br>
     * @return The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfDecimalBigint() {
        checkSpecifiedProperty("typeOfDecimalBigint");
        return _typeOfDecimalBigint;
    }

    /**
     * [set] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br>
     * @param typeOfDecimalBigint The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalBigint(Long typeOfDecimalBigint) {
        registerModifiedProperty("typeOfDecimalBigint");
        _typeOfDecimalBigint = typeOfDecimalBigint;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INT(10)} <br>
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        checkSpecifiedProperty("typeOfInteger");
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INT(10)} <br>
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        registerModifiedProperty("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br>
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        checkSpecifiedProperty("typeOfBigint");
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br>
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        registerModifiedProperty("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_FLOAT: {FLOAT(12)} <br>
     * @return The value of the column 'TYPE_OF_FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        checkSpecifiedProperty("typeOfFloat");
        return _typeOfFloat;
    }

    /**
     * [set] TYPE_OF_FLOAT: {FLOAT(12)} <br>
     * @param typeOfFloat The value of the column 'TYPE_OF_FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        registerModifiedProperty("typeOfFloat");
        _typeOfFloat = typeOfFloat;
    }

    /**
     * [get] TYPE_OF_DOUBLE: {DOUBLE(22)} <br>
     * @return The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDouble() {
        checkSpecifiedProperty("typeOfDouble");
        return _typeOfDouble;
    }

    /**
     * [set] TYPE_OF_DOUBLE: {DOUBLE(22)} <br>
     * @param typeOfDouble The value of the column 'TYPE_OF_DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDouble(java.math.BigDecimal typeOfDouble) {
        registerModifiedProperty("typeOfDouble");
        _typeOfDouble = typeOfDouble;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(10)} <br>
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getTypeOfDate() {
        checkSpecifiedProperty("typeOfDate");
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(10)} <br>
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.time.LocalDate typeOfDate) {
        registerModifiedProperty("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_DATETIME: {DATETIME(19)} <br>
     * @return The value of the column 'TYPE_OF_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTypeOfDatetime() {
        checkSpecifiedProperty("typeOfDatetime");
        return _typeOfDatetime;
    }

    /**
     * [set] TYPE_OF_DATETIME: {DATETIME(19)} <br>
     * @param typeOfDatetime The value of the column 'TYPE_OF_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime(java.time.LocalDateTime typeOfDatetime) {
        registerModifiedProperty("typeOfDatetime");
        _typeOfDatetime = typeOfDatetime;
    }

    /**
     * [get] TYPE_OF_DATETIME_3_MILLIS: {DATETIME(19)} <br>
     * @return The value of the column 'TYPE_OF_DATETIME_3_MILLIS'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTypeOfDatetime3Millis() {
        checkSpecifiedProperty("typeOfDatetime3Millis");
        return _typeOfDatetime3Millis;
    }

    /**
     * [set] TYPE_OF_DATETIME_3_MILLIS: {DATETIME(19)} <br>
     * @param typeOfDatetime3Millis The value of the column 'TYPE_OF_DATETIME_3_MILLIS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime3Millis(java.time.LocalDateTime typeOfDatetime3Millis) {
        registerModifiedProperty("typeOfDatetime3Millis");
        _typeOfDatetime3Millis = typeOfDatetime3Millis;
    }

    /**
     * [get] TYPE_OF_DATETIME_6_MICROS: {DATETIME(19)} <br>
     * @return The value of the column 'TYPE_OF_DATETIME_6_MICROS'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTypeOfDatetime6Micros() {
        checkSpecifiedProperty("typeOfDatetime6Micros");
        return _typeOfDatetime6Micros;
    }

    /**
     * [set] TYPE_OF_DATETIME_6_MICROS: {DATETIME(19)} <br>
     * @param typeOfDatetime6Micros The value of the column 'TYPE_OF_DATETIME_6_MICROS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime6Micros(java.time.LocalDateTime typeOfDatetime6Micros) {
        registerModifiedProperty("typeOfDatetime6Micros");
        _typeOfDatetime6Micros = typeOfDatetime6Micros;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(19)} <br>
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTypeOfTimestamp() {
        checkSpecifiedProperty("typeOfTimestamp");
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(19)} <br>
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.time.LocalDateTime typeOfTimestamp) {
        registerModifiedProperty("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_TIME: {TIME(8)} <br>
     * @return The value of the column 'TYPE_OF_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getTypeOfTime() {
        checkSpecifiedProperty("typeOfTime");
        return _typeOfTime;
    }

    /**
     * [set] TYPE_OF_TIME: {TIME(8)} <br>
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.time.LocalTime typeOfTime) {
        registerModifiedProperty("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] TYPE_OF_YEAR: {YEAR} <br>
     * @return The value of the column 'TYPE_OF_YEAR'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getTypeOfYear() {
        checkSpecifiedProperty("typeOfYear");
        return _typeOfYear;
    }

    /**
     * [set] TYPE_OF_YEAR: {YEAR} <br>
     * @param typeOfYear The value of the column 'TYPE_OF_YEAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfYear(java.time.LocalDate typeOfYear) {
        registerModifiedProperty("typeOfYear");
        _typeOfYear = typeOfYear;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br>
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBoolean() {
        checkSpecifiedProperty("typeOfBoolean");
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br>
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBoolean(Boolean typeOfBoolean) {
        registerModifiedProperty("typeOfBoolean");
        _typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(65535)} <br>
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        checkSpecifiedProperty("typeOfBlob");
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(65535)} <br>
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        registerModifiedProperty("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_TINYBLOB: {TINYBLOB(255)} <br>
     * @return The value of the column 'TYPE_OF_TINYBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfTinyblob() {
        checkSpecifiedProperty("typeOfTinyblob");
        return _typeOfTinyblob;
    }

    /**
     * [set] TYPE_OF_TINYBLOB: {TINYBLOB(255)} <br>
     * @param typeOfTinyblob The value of the column 'TYPE_OF_TINYBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTinyblob(byte[] typeOfTinyblob) {
        registerModifiedProperty("typeOfTinyblob");
        _typeOfTinyblob = typeOfTinyblob;
    }

    /**
     * [get] TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} <br>
     * @return The value of the column 'TYPE_OF_MEDIUMBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfMediumblob() {
        checkSpecifiedProperty("typeOfMediumblob");
        return _typeOfMediumblob;
    }

    /**
     * [set] TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)} <br>
     * @param typeOfMediumblob The value of the column 'TYPE_OF_MEDIUMBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMediumblob(byte[] typeOfMediumblob) {
        registerModifiedProperty("typeOfMediumblob");
        _typeOfMediumblob = typeOfMediumblob;
    }

    /**
     * [get] TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} <br>
     * @return The value of the column 'TYPE_OF_LONGBLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfLongblob() {
        checkSpecifiedProperty("typeOfLongblob");
        return _typeOfLongblob;
    }

    /**
     * [set] TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)} <br>
     * @param typeOfLongblob The value of the column 'TYPE_OF_LONGBLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongblob(byte[] typeOfLongblob) {
        registerModifiedProperty("typeOfLongblob");
        _typeOfLongblob = typeOfLongblob;
    }

    /**
     * [get] TYPE_OF_BINARY: {BINARY(1)} <br>
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBinary() {
        checkSpecifiedProperty("typeOfBinary");
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {BINARY(1)} <br>
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBinary(byte[] typeOfBinary) {
        registerModifiedProperty("typeOfBinary");
        _typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_VARBINARY: {VARBINARY(1000)} <br>
     * @return The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfVarbinary() {
        checkSpecifiedProperty("typeOfVarbinary");
        return _typeOfVarbinary;
    }

    /**
     * [set] TYPE_OF_VARBINARY: {VARBINARY(1000)} <br>
     * @param typeOfVarbinary The value of the column 'TYPE_OF_VARBINARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarbinary(byte[] typeOfVarbinary) {
        registerModifiedProperty("typeOfVarbinary");
        _typeOfVarbinary = typeOfVarbinary;
    }

    /**
     * [get] TYPE_OF_ENUM: {ENUM(6)} <br>
     * @return The value of the column 'TYPE_OF_ENUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfEnum() {
        checkSpecifiedProperty("typeOfEnum");
        return _typeOfEnum;
    }

    /**
     * [set] TYPE_OF_ENUM: {ENUM(6)} <br>
     * @param typeOfEnum The value of the column 'TYPE_OF_ENUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfEnum(String typeOfEnum) {
        registerModifiedProperty("typeOfEnum");
        _typeOfEnum = typeOfEnum;
    }

    /**
     * [get] TYPE_OF_ENUM_INT: {ENUM(2)} <br>
     * @return The value of the column 'TYPE_OF_ENUM_INT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfEnumInt() {
        checkSpecifiedProperty("typeOfEnumInt");
        return _typeOfEnumInt;
    }

    /**
     * [set] TYPE_OF_ENUM_INT: {ENUM(2)} <br>
     * @param typeOfEnumInt The value of the column 'TYPE_OF_ENUM_INT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfEnumInt(String typeOfEnumInt) {
        registerModifiedProperty("typeOfEnumInt");
        _typeOfEnumInt = typeOfEnumInt;
    }

    /**
     * [get] TYPE_OF_SET: {SET(15)} <br>
     * @return The value of the column 'TYPE_OF_SET'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfSet() {
        checkSpecifiedProperty("typeOfSet");
        return _typeOfSet;
    }

    /**
     * [set] TYPE_OF_SET: {SET(15)} <br>
     * @param typeOfSet The value of the column 'TYPE_OF_SET'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSet(String typeOfSet) {
        registerModifiedProperty("typeOfSet");
        _typeOfSet = typeOfSet;
    }
}
