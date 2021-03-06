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
package org.docksidestage.mysql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.mysql.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpVariousTypeParameter. <br>
 * This is related to "<span style="color: #AD4747">SP_VARIOUS_TYPE_PARAMETER</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpVariousTypeParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VOutChar_PROCEDURE_PARAMETER = "out, 2";
    public static final String VInText_PROCEDURE_PARAMETER = "in, 3";
    public static final String VOutText_PROCEDURE_PARAMETER = "out, 4";
    public static final String vvInNumericInteger_PROCEDURE_PARAMETER = "in, 5";
    public static final String vvInNumericBigint_PROCEDURE_PARAMETER = "in, 6";
    public static final String vvInNumericDecimal_PROCEDURE_PARAMETER = "in, 7";
    public static final String vvOutDecimal_PROCEDURE_PARAMETER = "out, 8";
    public static final String vvOutInteger_PROCEDURE_PARAMETER = "out, 9";
    public static final String vvInoutInteger_PROCEDURE_PARAMETER = "inout, 10";
    public static final String vvOutBigint_PROCEDURE_PARAMETER = "out, 11";
    public static final String vvInoutBigint_PROCEDURE_PARAMETER = "inout, 12";
    public static final String vvvInDate_PROCEDURE_PARAMETER = "in, 13";
    public static final String vvvOutDatetime_PROCEDURE_PARAMETER = "out, 14";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarchar: {VARCHAR(32) as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutVarchar: {VARCHAR(32) as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VOutChar: {CHAR(3) as Out}. */
    protected String _vOutChar;

    /** The parameter of VInText: {TEXT(65535) as In}. */
    protected String _vInText;

    /** The parameter of VOutText: {TEXT(65535) as Out}. */
    protected String _vOutText;

    /** The parameter of vvInNumericInteger: {NUMERIC(5) as In}. */
    protected Integer _vvInNumericInteger;

    /** The parameter of vvInNumericBigint: {NUMERIC(12) as In}. */
    protected Long _vvInNumericBigint;

    /** The parameter of vvInNumericDecimal: {NUMERIC(5, 3) as In}. */
    protected java.math.BigDecimal _vvInNumericDecimal;

    /** The parameter of vvOutDecimal: {DECIMAL(12) as Out}. */
    protected Long _vvOutDecimal;

    /** The parameter of vvOutInteger: {INTEGER(10) as Out}. */
    protected Integer _vvOutInteger;

    /** The parameter of vvInoutInteger: {INTEGER(10) as InOut}. */
    protected Integer _vvInoutInteger;

    /** The parameter of vvOutBigint: {BIGINT(19) as Out}. */
    protected Long _vvOutBigint;

    /** The parameter of vvInoutBigint: {BIGINT(19) as InOut}. */
    protected Long _vvInoutBigint;

    /** The parameter of vvvInDate: {DATE(10) as In}. */
    protected java.time.LocalDate _vvvInDate;

    /** The parameter of vvvOutDatetime: {DATETIME(19) as Out}. */
    protected java.time.LocalDateTime _vvvOutDatetime;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpVariousTypeParameter. <br>
     * This is related to "<span style="color: #AD4747">SP_VARIOUS_TYPE_PARAMETER</span>".
     */
    public BsSpVariousTypeParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "SP_VARIOUS_TYPE_PARAMETER"; }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() { return true; } // as default

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() { return false; } // resolved by generator

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_vInVarchar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vOutChar);
        sb.append(dm).append(_vInText);
        sb.append(dm).append(_vOutText);
        sb.append(dm).append(_vvInNumericInteger);
        sb.append(dm).append(_vvInNumericBigint);
        sb.append(dm).append(_vvInNumericDecimal);
        sb.append(dm).append(_vvOutDecimal);
        sb.append(dm).append(_vvOutInteger);
        sb.append(dm).append(_vvInoutInteger);
        sb.append(dm).append(_vvOutBigint);
        sb.append(dm).append(_vvInoutBigint);
        sb.append(dm).append(_vvvInDate);
        sb.append(dm).append(_vvvOutDatetime);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarchar: {VARCHAR(32) as In} <br>
     * @return The value of VInVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {VARCHAR(32) as In} <br>
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutVarchar: {VARCHAR(32) as Out} <br>
     * @return The value of VOutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {VARCHAR(32) as Out} <br>
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VOutChar: {CHAR(3) as Out} <br>
     * @return The value of VOutChar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutChar() {
        return filterStringParameter(_vOutChar);
    }

    /**
     * [set] VOutChar: {CHAR(3) as Out} <br>
     * @param vOutChar The value of VOutChar. (NullAllowed)
     */
    public void setVOutChar(String vOutChar) {
        _vOutChar = vOutChar;
    }

    /**
     * [get] VInText: {TEXT(65535) as In} <br>
     * @return The value of VInText. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInText() {
        return filterStringParameter(_vInText);
    }

    /**
     * [set] VInText: {TEXT(65535) as In} <br>
     * @param vInText The value of VInText. (NullAllowed)
     */
    public void setVInText(String vInText) {
        _vInText = vInText;
    }

    /**
     * [get] VOutText: {TEXT(65535) as Out} <br>
     * @return The value of VOutText. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutText() {
        return filterStringParameter(_vOutText);
    }

    /**
     * [set] VOutText: {TEXT(65535) as Out} <br>
     * @param vOutText The value of VOutText. (NullAllowed)
     */
    public void setVOutText(String vOutText) {
        _vOutText = vOutText;
    }

    /**
     * [get] vvInNumericInteger: {NUMERIC(5) as In} <br>
     * @return The value of vvInNumericInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInNumericInteger() {
        return _vvInNumericInteger;
    }

    /**
     * [set] vvInNumericInteger: {NUMERIC(5) as In} <br>
     * @param vvInNumericInteger The value of vvInNumericInteger. (NullAllowed)
     */
    public void setVvInNumericInteger(Integer vvInNumericInteger) {
        _vvInNumericInteger = vvInNumericInteger;
    }

    /**
     * [get] vvInNumericBigint: {NUMERIC(12) as In} <br>
     * @return The value of vvInNumericBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvInNumericBigint() {
        return _vvInNumericBigint;
    }

    /**
     * [set] vvInNumericBigint: {NUMERIC(12) as In} <br>
     * @param vvInNumericBigint The value of vvInNumericBigint. (NullAllowed)
     */
    public void setVvInNumericBigint(Long vvInNumericBigint) {
        _vvInNumericBigint = vvInNumericBigint;
    }

    /**
     * [get] vvInNumericDecimal: {NUMERIC(5, 3) as In} <br>
     * @return The value of vvInNumericDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumericDecimal() {
        return _vvInNumericDecimal;
    }

    /**
     * [set] vvInNumericDecimal: {NUMERIC(5, 3) as In} <br>
     * @param vvInNumericDecimal The value of vvInNumericDecimal. (NullAllowed)
     */
    public void setVvInNumericDecimal(java.math.BigDecimal vvInNumericDecimal) {
        _vvInNumericDecimal = vvInNumericDecimal;
    }

    /**
     * [get] vvOutDecimal: {DECIMAL(12) as Out} <br>
     * @return The value of vvOutDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvOutDecimal() {
        return _vvOutDecimal;
    }

    /**
     * [set] vvOutDecimal: {DECIMAL(12) as Out} <br>
     * @param vvOutDecimal The value of vvOutDecimal. (NullAllowed)
     */
    public void setVvOutDecimal(Long vvOutDecimal) {
        _vvOutDecimal = vvOutDecimal;
    }

    /**
     * [get] vvOutInteger: {INTEGER(10) as Out} <br>
     * @return The value of vvOutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvOutInteger() {
        return _vvOutInteger;
    }

    /**
     * [set] vvOutInteger: {INTEGER(10) as Out} <br>
     * @param vvOutInteger The value of vvOutInteger. (NullAllowed)
     */
    public void setVvOutInteger(Integer vvOutInteger) {
        _vvOutInteger = vvOutInteger;
    }

    /**
     * [get] vvInoutInteger: {INTEGER(10) as InOut} <br>
     * @return The value of vvInoutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInoutInteger() {
        return _vvInoutInteger;
    }

    /**
     * [set] vvInoutInteger: {INTEGER(10) as InOut} <br>
     * @param vvInoutInteger The value of vvInoutInteger. (NullAllowed)
     */
    public void setVvInoutInteger(Integer vvInoutInteger) {
        _vvInoutInteger = vvInoutInteger;
    }

    /**
     * [get] vvOutBigint: {BIGINT(19) as Out} <br>
     * @return The value of vvOutBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvOutBigint() {
        return _vvOutBigint;
    }

    /**
     * [set] vvOutBigint: {BIGINT(19) as Out} <br>
     * @param vvOutBigint The value of vvOutBigint. (NullAllowed)
     */
    public void setVvOutBigint(Long vvOutBigint) {
        _vvOutBigint = vvOutBigint;
    }

    /**
     * [get] vvInoutBigint: {BIGINT(19) as InOut} <br>
     * @return The value of vvInoutBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvInoutBigint() {
        return _vvInoutBigint;
    }

    /**
     * [set] vvInoutBigint: {BIGINT(19) as InOut} <br>
     * @param vvInoutBigint The value of vvInoutBigint. (NullAllowed)
     */
    public void setVvInoutBigint(Long vvInoutBigint) {
        _vvInoutBigint = vvInoutBigint;
    }

    /**
     * [get] vvvInDate: {DATE(10) as In} <br>
     * @return The value of vvvInDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getVvvInDate() {
        return _vvvInDate;
    }

    /**
     * [set] vvvInDate: {DATE(10) as In} <br>
     * @param vvvInDate The value of vvvInDate. (NullAllowed)
     */
    public void setVvvInDate(java.time.LocalDate vvvInDate) {
        _vvvInDate = vvvInDate;
    }

    /**
     * [get] vvvOutDatetime: {DATETIME(19) as Out} <br>
     * @return The value of vvvOutDatetime. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getVvvOutDatetime() {
        return _vvvOutDatetime;
    }

    /**
     * [set] vvvOutDatetime: {DATETIME(19) as Out} <br>
     * @param vvvOutDatetime The value of vvvOutDatetime. (NullAllowed)
     */
    public void setVvvOutDatetime(java.time.LocalDateTime vvvOutDatetime) {
        _vvvOutDatetime = vvvOutDatetime;
    }
}
