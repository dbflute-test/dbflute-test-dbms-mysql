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
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_DELIMITER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDelimiter extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _delimiterId;

    /** NUMBER_NULLABLE: {INT(10)} */
    protected Integer _numberNullable;

    /** STRING_CONVERTED: {VARCHAR(200)} */
    protected String _stringConverted;

    /** STRING_NON_CONVERTED: {VARCHAR(200)} */
    protected String _stringNonConverted;

    /** DATE_DEFAULT: {NotNull, DATE(10)} */
    protected java.time.LocalDate _dateDefault;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_delimiter";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_delimiterId == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteDelimiter) {
            BsWhiteDelimiter other = (BsWhiteDelimiter)obj;
            if (!xSV(_delimiterId, other._delimiterId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _delimiterId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_delimiterId));
        sb.append(dm).append(xfND(_numberNullable));
        sb.append(dm).append(xfND(_stringConverted));
        sb.append(dm).append(xfND(_stringNonConverted));
        sb.append(dm).append(xfND(_dateDefault));
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
    public WhiteDelimiter clone() {
        return (WhiteDelimiter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'DELIMITER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDelimiterId() {
        checkSpecifiedProperty("delimiterId");
        return _delimiterId;
    }

    /**
     * [set] DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param delimiterId The value of the column 'DELIMITER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDelimiterId(Long delimiterId) {
        registerModifiedProperty("delimiterId");
        _delimiterId = delimiterId;
    }

    /**
     * [get] NUMBER_NULLABLE: {INT(10)} <br>
     * @return The value of the column 'NUMBER_NULLABLE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNumberNullable() {
        checkSpecifiedProperty("numberNullable");
        return _numberNullable;
    }

    /**
     * [set] NUMBER_NULLABLE: {INT(10)} <br>
     * @param numberNullable The value of the column 'NUMBER_NULLABLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberNullable(Integer numberNullable) {
        registerModifiedProperty("numberNullable");
        _numberNullable = numberNullable;
    }

    /**
     * [get] STRING_CONVERTED: {VARCHAR(200)} <br>
     * @return The value of the column 'STRING_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        checkSpecifiedProperty("stringConverted");
        return _stringConverted;
    }

    /**
     * [set] STRING_CONVERTED: {VARCHAR(200)} <br>
     * @param stringConverted The value of the column 'STRING_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        registerModifiedProperty("stringConverted");
        _stringConverted = stringConverted;
    }

    /**
     * [get] STRING_NON_CONVERTED: {VARCHAR(200)} <br>
     * @return The value of the column 'STRING_NON_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringNonConverted() {
        checkSpecifiedProperty("stringNonConverted");
        return _stringNonConverted;
    }

    /**
     * [set] STRING_NON_CONVERTED: {VARCHAR(200)} <br>
     * @param stringNonConverted The value of the column 'STRING_NON_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringNonConverted(String stringNonConverted) {
        registerModifiedProperty("stringNonConverted");
        _stringNonConverted = stringNonConverted;
    }

    /**
     * [get] DATE_DEFAULT: {NotNull, DATE(10)} <br>
     * @return The value of the column 'DATE_DEFAULT'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDateDefault() {
        checkSpecifiedProperty("dateDefault");
        return _dateDefault;
    }

    /**
     * [set] DATE_DEFAULT: {NotNull, DATE(10)} <br>
     * @param dateDefault The value of the column 'DATE_DEFAULT'. (basically NotNull if update: for the constraint)
     */
    public void setDateDefault(java.time.LocalDate dateDefault) {
        registerModifiedProperty("dateDefault");
        _dateDefault = dateDefault;
    }
}
