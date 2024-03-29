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
 * The entity of WHITE_DATE_ADJUSTMENT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDateAdjustment extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _dateAdjustmentId;

    /** (adjusted)ADJUSTED_DATE: {DATE(10)} */
    protected java.time.LocalDate _adjustedDate;

    /** ADJUSTED_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _adjustedDatetime;

    /** ADJUSTED_TIME: {TIME(8)} */
    protected java.time.LocalTime _adjustedTime;

    /** ADJUSTED_INTEGER: {INT(10)} */
    protected Integer _adjustedInteger;

    /** (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)} */
    protected Long _adjustedNamedStringLong;

    /** (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)} */
    protected Long _adjustedNamedTypedLong;

    /** (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)} */
    protected Long _adjustedPinpointStringLong;

    /** (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)} */
    protected Long _adjustedPinpointTypedLong;

    /** ADJUSTED_PLAIN_LONG: {BIGINT(19)} */
    protected Long _adjustedPlainLong;

    /** ADJUSTED_STRING: {VARCHAR(32)} */
    protected String _adjustedString;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_date_adjustment";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dateAdjustmentId == null) { return false; }
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
        if (obj instanceof BsWhiteDateAdjustment) {
            BsWhiteDateAdjustment other = (BsWhiteDateAdjustment)obj;
            if (!xSV(_dateAdjustmentId, other._dateAdjustmentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dateAdjustmentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dateAdjustmentId));
        sb.append(dm).append(xfND(_adjustedDate));
        sb.append(dm).append(xfND(_adjustedDatetime));
        sb.append(dm).append(xfND(_adjustedTime));
        sb.append(dm).append(xfND(_adjustedInteger));
        sb.append(dm).append(xfND(_adjustedNamedStringLong));
        sb.append(dm).append(xfND(_adjustedNamedTypedLong));
        sb.append(dm).append(xfND(_adjustedPinpointStringLong));
        sb.append(dm).append(xfND(_adjustedPinpointTypedLong));
        sb.append(dm).append(xfND(_adjustedPlainLong));
        sb.append(dm).append(xfND(_adjustedString));
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
    public WhiteDateAdjustment clone() {
        return (WhiteDateAdjustment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'DATE_ADJUSTMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDateAdjustmentId() {
        checkSpecifiedProperty("dateAdjustmentId");
        return _dateAdjustmentId;
    }

    /**
     * [set] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param dateAdjustmentId The value of the column 'DATE_ADJUSTMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDateAdjustmentId(Long dateAdjustmentId) {
        registerModifiedProperty("dateAdjustmentId");
        _dateAdjustmentId = dateAdjustmentId;
    }

    /**
     * [get] (adjusted)ADJUSTED_DATE: {DATE(10)} <br>
     * @return The value of the column 'ADJUSTED_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getAdjustedDate() {
        checkSpecifiedProperty("adjustedDate");
        return _adjustedDate;
    }

    /**
     * [set] (adjusted)ADJUSTED_DATE: {DATE(10)} <br>
     * @param adjustedDate The value of the column 'ADJUSTED_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedDate(java.time.LocalDate adjustedDate) {
        registerModifiedProperty("adjustedDate");
        _adjustedDate = adjustedDate;
    }

    /**
     * [get] ADJUSTED_DATETIME: {DATETIME(19)} <br>
     * @return The value of the column 'ADJUSTED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getAdjustedDatetime() {
        checkSpecifiedProperty("adjustedDatetime");
        return _adjustedDatetime;
    }

    /**
     * [set] ADJUSTED_DATETIME: {DATETIME(19)} <br>
     * @param adjustedDatetime The value of the column 'ADJUSTED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedDatetime(java.time.LocalDateTime adjustedDatetime) {
        registerModifiedProperty("adjustedDatetime");
        _adjustedDatetime = adjustedDatetime;
    }

    /**
     * [get] ADJUSTED_TIME: {TIME(8)} <br>
     * @return The value of the column 'ADJUSTED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getAdjustedTime() {
        checkSpecifiedProperty("adjustedTime");
        return _adjustedTime;
    }

    /**
     * [set] ADJUSTED_TIME: {TIME(8)} <br>
     * @param adjustedTime The value of the column 'ADJUSTED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedTime(java.time.LocalTime adjustedTime) {
        registerModifiedProperty("adjustedTime");
        _adjustedTime = adjustedTime;
    }

    /**
     * [get] ADJUSTED_INTEGER: {INT(10)} <br>
     * @return The value of the column 'ADJUSTED_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAdjustedInteger() {
        checkSpecifiedProperty("adjustedInteger");
        return _adjustedInteger;
    }

    /**
     * [set] ADJUSTED_INTEGER: {INT(10)} <br>
     * @param adjustedInteger The value of the column 'ADJUSTED_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedInteger(Integer adjustedInteger) {
        registerModifiedProperty("adjustedInteger");
        _adjustedInteger = adjustedInteger;
    }

    /**
     * [get] (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_NAMED_STRING_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedNamedStringLong() {
        checkSpecifiedProperty("adjustedNamedStringLong");
        return _adjustedNamedStringLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)} <br>
     * @param adjustedNamedStringLong The value of the column 'ADJUSTED_NAMED_STRING_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedNamedStringLong(Long adjustedNamedStringLong) {
        registerModifiedProperty("adjustedNamedStringLong");
        _adjustedNamedStringLong = adjustedNamedStringLong;
    }

    /**
     * [get] (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_NAMED_TYPED_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedNamedTypedLong() {
        checkSpecifiedProperty("adjustedNamedTypedLong");
        return _adjustedNamedTypedLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)} <br>
     * @param adjustedNamedTypedLong The value of the column 'ADJUSTED_NAMED_TYPED_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedNamedTypedLong(Long adjustedNamedTypedLong) {
        registerModifiedProperty("adjustedNamedTypedLong");
        _adjustedNamedTypedLong = adjustedNamedTypedLong;
    }

    /**
     * [get] (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_PINPOINT_STRING_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPinpointStringLong() {
        checkSpecifiedProperty("adjustedPinpointStringLong");
        return _adjustedPinpointStringLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)} <br>
     * @param adjustedPinpointStringLong The value of the column 'ADJUSTED_PINPOINT_STRING_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPinpointStringLong(Long adjustedPinpointStringLong) {
        registerModifiedProperty("adjustedPinpointStringLong");
        _adjustedPinpointStringLong = adjustedPinpointStringLong;
    }

    /**
     * [get] (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_PINPOINT_TYPED_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPinpointTypedLong() {
        checkSpecifiedProperty("adjustedPinpointTypedLong");
        return _adjustedPinpointTypedLong;
    }

    /**
     * [set] (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)} <br>
     * @param adjustedPinpointTypedLong The value of the column 'ADJUSTED_PINPOINT_TYPED_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPinpointTypedLong(Long adjustedPinpointTypedLong) {
        registerModifiedProperty("adjustedPinpointTypedLong");
        _adjustedPinpointTypedLong = adjustedPinpointTypedLong;
    }

    /**
     * [get] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPlainLong() {
        checkSpecifiedProperty("adjustedPlainLong");
        return _adjustedPlainLong;
    }

    /**
     * [set] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br>
     * @param adjustedPlainLong The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPlainLong(Long adjustedPlainLong) {
        registerModifiedProperty("adjustedPlainLong");
        _adjustedPlainLong = adjustedPlainLong;
    }

    /**
     * [get] ADJUSTED_STRING: {VARCHAR(32)} <br>
     * @return The value of the column 'ADJUSTED_STRING'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdjustedString() {
        checkSpecifiedProperty("adjustedString");
        return _adjustedString;
    }

    /**
     * [set] ADJUSTED_STRING: {VARCHAR(32)} <br>
     * @param adjustedString The value of the column 'ADJUSTED_STRING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedString(String adjustedString) {
        registerModifiedProperty("adjustedString");
        _adjustedString = adjustedString;
    }
}
