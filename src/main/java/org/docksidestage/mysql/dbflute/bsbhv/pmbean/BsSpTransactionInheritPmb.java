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
import org.dbflute.outsidesql.PmbCustodial.ShortCharHandlingMode;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.mysql.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpTransactionInherit. <br />
 * This is related to "<span style="color: #AD4747">SP_TRANSACTION_INHERIT</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpTransactionInheritPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpTransactionInherit. <br />
     * This is related to "<span style="color: #AD4747">SP_TRANSACTION_INHERIT</span>".
     */
    public BsSpTransactionInheritPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_TRANSACTION_INHERIT";
    }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() {
         return true; // as default
     }

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() {
         return false; // resolved by generator
     }

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
    protected String filterStringParameter(String value) {
        return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return PmbCustodial.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = chooseShortCharHandlingMode(propertyName, value, size);
        return PmbCustodial.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.NONE;
    }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) {
        return PmbCustodial.toUtilDate(date, _timeZone);
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd";
        return PmbCustodial.formatUtilDate(date, pattern, _timeZone);
    }

    protected TimeZone chooseRealTimeZone() {
        return PmbCustodial.chooseRealTimeZone(_timeZone);
    }

    /**
     * Set time-zone, basically for LocalDate conversion. <br />
     * Normally you don't need to set this, you can adjust other ways. <br />
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) {
        _timeZone = timeZone;
    }

    // -----------------------------------------------------
    //                                               Various
    //                                               -------
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { // might be called by option handling
        return PmbCustodial.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return PmbCustodial.toBoolean(obj);
    }

    protected String formatByteArray(byte[] bytes) {
        return PmbCustodial.formatByteArray(bytes);
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { // might be called by option handling
        return PmbCustodial.newArrayList(elements);
    }

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
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

}
