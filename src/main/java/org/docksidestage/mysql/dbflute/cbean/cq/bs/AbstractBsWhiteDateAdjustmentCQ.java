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
package org.docksidestage.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_date_adjustment.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDateAdjustmentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDateAdjustmentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "white_date_adjustment";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_Equal(Long dateAdjustmentId) {
        doSetDateAdjustmentId_Equal(dateAdjustmentId);
    }

    protected void doSetDateAdjustmentId_Equal(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_EQ, dateAdjustmentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_NotEqual(Long dateAdjustmentId) {
        doSetDateAdjustmentId_NotEqual(dateAdjustmentId);
    }

    protected void doSetDateAdjustmentId_NotEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_NES, dateAdjustmentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_GreaterThan(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_GT, dateAdjustmentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_LessThan(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_LT, dateAdjustmentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_GreaterEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_GE, dateAdjustmentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_LessEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_LE, dateAdjustmentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDateAdjustmentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDateAdjustmentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDateAdjustmentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentIdList The collection of dateAdjustmentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_InScope(Collection<Long> dateAdjustmentIdList) {
        doSetDateAdjustmentId_InScope(dateAdjustmentIdList);
    }

    protected void doSetDateAdjustmentId_InScope(Collection<Long> dateAdjustmentIdList) {
        regINS(CK_INS, cTL(dateAdjustmentIdList), xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentIdList The collection of dateAdjustmentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_NotInScope(Collection<Long> dateAdjustmentIdList) {
        doSetDateAdjustmentId_NotInScope(dateAdjustmentIdList);
    }

    protected void doSetDateAdjustmentId_NotInScope(Collection<Long> dateAdjustmentIdList) {
        regINS(CK_NINS, cTL(dateAdjustmentIdList), xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDateAdjustmentId_IsNull() { regDateAdjustmentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDateAdjustmentId_IsNotNull() { regDateAdjustmentId(CK_ISNN, DOBJ); }

    protected void regDateAdjustmentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID"); }
    protected abstract ConditionValue xgetCValueDateAdjustmentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_Equal(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_EQ,  adjustedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_GreaterThan(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_GT,  adjustedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_LessThan(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_LT,  adjustedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_GreaterEqual(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_GE,  adjustedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_LessEqual(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_LE, adjustedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * <pre>e.g. setAdjustedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * <pre>e.g. setAdjustedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAdjustedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     */
    public void setAdjustedDate_IsNull() { regAdjustedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     */
    public void setAdjustedDate_IsNotNull() { regAdjustedDate(CK_ISNN, DOBJ); }

    protected void regAdjustedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDate(), "ADJUSTED_DATE"); }
    protected abstract ConditionValue xgetCValueAdjustedDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_Equal(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_EQ,  adjustedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_GreaterThan(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_GT,  adjustedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_LessThan(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_LT,  adjustedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_GreaterEqual(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_GE,  adjustedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @param adjustedDatetime The value of adjustedDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_LessEqual(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_LE, adjustedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * <pre>e.g. setAdjustedDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * <pre>e.g. setAdjustedDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAdjustedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     */
    public void setAdjustedDatetime_IsNull() { regAdjustedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     */
    public void setAdjustedDatetime_IsNotNull() { regAdjustedDatetime(CK_ISNN, DOBJ); }

    protected void regAdjustedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDatetime(), "ADJUSTED_DATETIME"); }
    protected abstract ConditionValue xgetCValueAdjustedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_Equal(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_EQ,  adjustedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_GreaterThan(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_GT,  adjustedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_LessThan(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_LT,  adjustedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_GreaterEqual(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_GE,  adjustedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_LessEqual(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_LE, adjustedTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     */
    public void setAdjustedTime_IsNull() { regAdjustedTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     */
    public void setAdjustedTime_IsNotNull() { regAdjustedTime(CK_ISNN, DOBJ); }

    protected void regAdjustedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedTime(), "ADJUSTED_TIME"); }
    protected abstract ConditionValue xgetCValueAdjustedTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_Equal(Integer adjustedInteger) {
        doSetAdjustedInteger_Equal(adjustedInteger);
    }

    protected void doSetAdjustedInteger_Equal(Integer adjustedInteger) {
        regAdjustedInteger(CK_EQ, adjustedInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_NotEqual(Integer adjustedInteger) {
        doSetAdjustedInteger_NotEqual(adjustedInteger);
    }

    protected void doSetAdjustedInteger_NotEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_NES, adjustedInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_GreaterThan(Integer adjustedInteger) {
        regAdjustedInteger(CK_GT, adjustedInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_LessThan(Integer adjustedInteger) {
        regAdjustedInteger(CK_LT, adjustedInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_GreaterEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_GE, adjustedInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedInteger The value of adjustedInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_LessEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_LE, adjustedInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param minNumber The min number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param minNumber The min number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedIntegerList The collection of adjustedInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedInteger_InScope(Collection<Integer> adjustedIntegerList) {
        doSetAdjustedInteger_InScope(adjustedIntegerList);
    }

    protected void doSetAdjustedInteger_InScope(Collection<Integer> adjustedIntegerList) {
        regINS(CK_INS, cTL(adjustedIntegerList), xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @param adjustedIntegerList The collection of adjustedInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedInteger_NotInScope(Collection<Integer> adjustedIntegerList) {
        doSetAdjustedInteger_NotInScope(adjustedIntegerList);
    }

    protected void doSetAdjustedInteger_NotInScope(Collection<Integer> adjustedIntegerList) {
        regINS(CK_NINS, cTL(adjustedIntegerList), xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     */
    public void setAdjustedInteger_IsNull() { regAdjustedInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     */
    public void setAdjustedInteger_IsNotNull() { regAdjustedInteger(CK_ISNN, DOBJ); }

    protected void regAdjustedInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER"); }
    protected abstract ConditionValue xgetCValueAdjustedInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_Equal(Long adjustedNamedStringLong) {
        doSetAdjustedNamedStringLong_Equal(adjustedNamedStringLong);
    }

    protected void doSetAdjustedNamedStringLong_Equal(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_EQ, adjustedNamedStringLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_NotEqual(Long adjustedNamedStringLong) {
        doSetAdjustedNamedStringLong_NotEqual(adjustedNamedStringLong);
    }

    protected void doSetAdjustedNamedStringLong_NotEqual(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_NES, adjustedNamedStringLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_GreaterThan(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_GT, adjustedNamedStringLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_LessThan(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_LT, adjustedNamedStringLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_GreaterEqual(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_GE, adjustedNamedStringLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLong The value of adjustedNamedStringLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_LessEqual(Long adjustedNamedStringLong) {
        regAdjustedNamedStringLong(CK_LE, adjustedNamedStringLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedNamedStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedNamedStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedNamedStringLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedNamedStringLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedNamedStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedNamedStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedNamedStringLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLongList The collection of adjustedNamedStringLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_InScope(Collection<Long> adjustedNamedStringLongList) {
        doSetAdjustedNamedStringLong_InScope(adjustedNamedStringLongList);
    }

    protected void doSetAdjustedNamedStringLong_InScope(Collection<Long> adjustedNamedStringLongList) {
        regINS(CK_INS, cTL(adjustedNamedStringLongList), xgetCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @param adjustedNamedStringLongList The collection of adjustedNamedStringLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedNamedStringLong_NotInScope(Collection<Long> adjustedNamedStringLongList) {
        doSetAdjustedNamedStringLong_NotInScope(adjustedNamedStringLongList);
    }

    protected void doSetAdjustedNamedStringLong_NotInScope(Collection<Long> adjustedNamedStringLongList) {
        regINS(CK_NINS, cTL(adjustedNamedStringLongList), xgetCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedStringLong_IsNull() { regAdjustedNamedStringLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedStringLong_IsNotNull() { regAdjustedNamedStringLong(CK_ISNN, DOBJ); }

    protected void regAdjustedNamedStringLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedNamedStringLong(), "ADJUSTED_NAMED_STRING_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedNamedStringLong();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_Equal(Long adjustedNamedTypedLong) {
        doSetAdjustedNamedTypedLong_Equal(adjustedNamedTypedLong);
    }

    protected void doSetAdjustedNamedTypedLong_Equal(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_EQ, adjustedNamedTypedLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_NotEqual(Long adjustedNamedTypedLong) {
        doSetAdjustedNamedTypedLong_NotEqual(adjustedNamedTypedLong);
    }

    protected void doSetAdjustedNamedTypedLong_NotEqual(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_NES, adjustedNamedTypedLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_GreaterThan(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_GT, adjustedNamedTypedLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_LessThan(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_LT, adjustedNamedTypedLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_GreaterEqual(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_GE, adjustedNamedTypedLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLong The value of adjustedNamedTypedLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_LessEqual(Long adjustedNamedTypedLong) {
        regAdjustedNamedTypedLong(CK_LE, adjustedNamedTypedLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedNamedTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedNamedTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedNamedTypedLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedNamedTypedLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedNamedTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedNamedTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedNamedTypedLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLongList The collection of adjustedNamedTypedLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_InScope(Collection<Long> adjustedNamedTypedLongList) {
        doSetAdjustedNamedTypedLong_InScope(adjustedNamedTypedLongList);
    }

    protected void doSetAdjustedNamedTypedLong_InScope(Collection<Long> adjustedNamedTypedLongList) {
        regINS(CK_INS, cTL(adjustedNamedTypedLongList), xgetCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @param adjustedNamedTypedLongList The collection of adjustedNamedTypedLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedNamedTypedLong_NotInScope(Collection<Long> adjustedNamedTypedLongList) {
        doSetAdjustedNamedTypedLong_NotInScope(adjustedNamedTypedLongList);
    }

    protected void doSetAdjustedNamedTypedLong_NotInScope(Collection<Long> adjustedNamedTypedLongList) {
        regINS(CK_NINS, cTL(adjustedNamedTypedLongList), xgetCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedTypedLong_IsNull() { regAdjustedNamedTypedLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedNamedTypedLong_IsNotNull() { regAdjustedNamedTypedLong(CK_ISNN, DOBJ); }

    protected void regAdjustedNamedTypedLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedNamedTypedLong(), "ADJUSTED_NAMED_TYPED_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedNamedTypedLong();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_Equal(Long adjustedPinpointStringLong) {
        doSetAdjustedPinpointStringLong_Equal(adjustedPinpointStringLong);
    }

    protected void doSetAdjustedPinpointStringLong_Equal(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_EQ, adjustedPinpointStringLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_NotEqual(Long adjustedPinpointStringLong) {
        doSetAdjustedPinpointStringLong_NotEqual(adjustedPinpointStringLong);
    }

    protected void doSetAdjustedPinpointStringLong_NotEqual(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_NES, adjustedPinpointStringLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_GreaterThan(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_GT, adjustedPinpointStringLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_LessThan(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_LT, adjustedPinpointStringLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_GreaterEqual(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_GE, adjustedPinpointStringLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLong The value of adjustedPinpointStringLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_LessEqual(Long adjustedPinpointStringLong) {
        regAdjustedPinpointStringLong(CK_LE, adjustedPinpointStringLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPinpointStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPinpointStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedPinpointStringLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedPinpointStringLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPinpointStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPinpointStringLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedPinpointStringLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLongList The collection of adjustedPinpointStringLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_InScope(Collection<Long> adjustedPinpointStringLongList) {
        doSetAdjustedPinpointStringLong_InScope(adjustedPinpointStringLongList);
    }

    protected void doSetAdjustedPinpointStringLong_InScope(Collection<Long> adjustedPinpointStringLongList) {
        regINS(CK_INS, cTL(adjustedPinpointStringLongList), xgetCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @param adjustedPinpointStringLongList The collection of adjustedPinpointStringLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPinpointStringLong_NotInScope(Collection<Long> adjustedPinpointStringLongList) {
        doSetAdjustedPinpointStringLong_NotInScope(adjustedPinpointStringLongList);
    }

    protected void doSetAdjustedPinpointStringLong_NotInScope(Collection<Long> adjustedPinpointStringLongList) {
        regINS(CK_NINS, cTL(adjustedPinpointStringLongList), xgetCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointStringLong_IsNull() { regAdjustedPinpointStringLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointStringLong_IsNotNull() { regAdjustedPinpointStringLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPinpointStringLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedPinpointStringLong(), "ADJUSTED_PINPOINT_STRING_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedPinpointStringLong();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_Equal(Long adjustedPinpointTypedLong) {
        doSetAdjustedPinpointTypedLong_Equal(adjustedPinpointTypedLong);
    }

    protected void doSetAdjustedPinpointTypedLong_Equal(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_EQ, adjustedPinpointTypedLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_NotEqual(Long adjustedPinpointTypedLong) {
        doSetAdjustedPinpointTypedLong_NotEqual(adjustedPinpointTypedLong);
    }

    protected void doSetAdjustedPinpointTypedLong_NotEqual(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_NES, adjustedPinpointTypedLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_GreaterThan(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_GT, adjustedPinpointTypedLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_LessThan(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_LT, adjustedPinpointTypedLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_GreaterEqual(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_GE, adjustedPinpointTypedLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLong The value of adjustedPinpointTypedLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_LessEqual(Long adjustedPinpointTypedLong) {
        regAdjustedPinpointTypedLong(CK_LE, adjustedPinpointTypedLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPinpointTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPinpointTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedPinpointTypedLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedPinpointTypedLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPinpointTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPinpointTypedLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedPinpointTypedLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLongList The collection of adjustedPinpointTypedLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_InScope(Collection<Long> adjustedPinpointTypedLongList) {
        doSetAdjustedPinpointTypedLong_InScope(adjustedPinpointTypedLongList);
    }

    protected void doSetAdjustedPinpointTypedLong_InScope(Collection<Long> adjustedPinpointTypedLongList) {
        regINS(CK_INS, cTL(adjustedPinpointTypedLongList), xgetCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @param adjustedPinpointTypedLongList The collection of adjustedPinpointTypedLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPinpointTypedLong_NotInScope(Collection<Long> adjustedPinpointTypedLongList) {
        doSetAdjustedPinpointTypedLong_NotInScope(adjustedPinpointTypedLongList);
    }

    protected void doSetAdjustedPinpointTypedLong_NotInScope(Collection<Long> adjustedPinpointTypedLongList) {
        regINS(CK_NINS, cTL(adjustedPinpointTypedLongList), xgetCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointTypedLong_IsNull() { regAdjustedPinpointTypedLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     */
    public void setAdjustedPinpointTypedLong_IsNotNull() { regAdjustedPinpointTypedLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPinpointTypedLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedPinpointTypedLong(), "ADJUSTED_PINPOINT_TYPED_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedPinpointTypedLong();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_Equal(Long adjustedPlainLong) {
        doSetAdjustedPlainLong_Equal(adjustedPlainLong);
    }

    protected void doSetAdjustedPlainLong_Equal(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_EQ, adjustedPlainLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_NotEqual(Long adjustedPlainLong) {
        doSetAdjustedPlainLong_NotEqual(adjustedPlainLong);
    }

    protected void doSetAdjustedPlainLong_NotEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_NES, adjustedPlainLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_GreaterThan(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_GT, adjustedPlainLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_LessThan(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_LT, adjustedPlainLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_GreaterEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_GE, adjustedPlainLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_LessEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_LE, adjustedPlainLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedPlainLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedPlainLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedPlainLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLongList The collection of adjustedPlainLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_InScope(Collection<Long> adjustedPlainLongList) {
        doSetAdjustedPlainLong_InScope(adjustedPlainLongList);
    }

    protected void doSetAdjustedPlainLong_InScope(Collection<Long> adjustedPlainLongList) {
        regINS(CK_INS, cTL(adjustedPlainLongList), xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLongList The collection of adjustedPlainLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_NotInScope(Collection<Long> adjustedPlainLongList) {
        doSetAdjustedPlainLong_NotInScope(adjustedPlainLongList);
    }

    protected void doSetAdjustedPlainLong_NotInScope(Collection<Long> adjustedPlainLongList) {
        regINS(CK_NINS, cTL(adjustedPlainLongList), xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     */
    public void setAdjustedPlainLong_IsNull() { regAdjustedPlainLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     */
    public void setAdjustedPlainLong_IsNotNull() { regAdjustedPlainLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPlainLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedPlainLong();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedString_Equal(String adjustedString) {
        doSetAdjustedString_Equal(fRES(adjustedString));
    }

    protected void doSetAdjustedString_Equal(String adjustedString) {
        regAdjustedString(CK_EQ, adjustedString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedString_NotEqual(String adjustedString) {
        doSetAdjustedString_NotEqual(fRES(adjustedString));
    }

    protected void doSetAdjustedString_NotEqual(String adjustedString) {
        regAdjustedString(CK_NES, adjustedString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedStringList The collection of adjustedString as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedString_InScope(Collection<String> adjustedStringList) {
        doSetAdjustedString_InScope(adjustedStringList);
    }

    protected void doSetAdjustedString_InScope(Collection<String> adjustedStringList) {
        regINS(CK_INS, cTL(adjustedStringList), xgetCValueAdjustedString(), "ADJUSTED_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedStringList The collection of adjustedString as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedString_NotInScope(Collection<String> adjustedStringList) {
        doSetAdjustedString_NotInScope(adjustedStringList);
    }

    protected void doSetAdjustedString_NotInScope(Collection<String> adjustedStringList) {
        regINS(CK_NINS, cTL(adjustedStringList), xgetCValueAdjustedString(), "ADJUSTED_STRING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)} <br>
     * <pre>e.g. setAdjustedString_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param adjustedString The value of adjustedString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAdjustedString_LikeSearch(String adjustedString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAdjustedString_LikeSearch(adjustedString, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)} <br>
     * <pre>e.g. setAdjustedString_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adjustedString The value of adjustedString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdjustedString_LikeSearch(String adjustedString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adjustedString), xgetCValueAdjustedString(), "ADJUSTED_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAdjustedString_NotLikeSearch(String adjustedString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAdjustedString_NotLikeSearch(adjustedString, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @param adjustedString The value of adjustedString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdjustedString_NotLikeSearch(String adjustedString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adjustedString), xgetCValueAdjustedString(), "ADJUSTED_STRING", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     */
    public void setAdjustedString_IsNull() { regAdjustedString(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     */
    public void setAdjustedString_IsNullOrEmpty() { regAdjustedString(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     */
    public void setAdjustedString_IsNotNull() { regAdjustedString(CK_ISNN, DOBJ); }

    protected void regAdjustedString(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedString(), "ADJUSTED_STRING"); }
    protected abstract ConditionValue xgetCValueAdjustedString();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDateAdjustmentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDateAdjustmentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDateAdjustmentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDateAdjustmentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDateAdjustmentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void query(WhiteDateAdjustmentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDateAdjustmentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDateAdjustmentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateAdjustmentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDateAdjustmentCQ sq);

    protected WhiteDateAdjustmentCB xcreateScalarConditionCB() {
        WhiteDateAdjustmentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDateAdjustmentCB xcreateScalarConditionPartitionByCB() {
        WhiteDateAdjustmentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDateAdjustmentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DATE_ADJUSTMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDateAdjustmentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDateAdjustmentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDateAdjustmentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATE_ADJUSTMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDateAdjustmentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDateAdjustmentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDateAdjustmentCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br>
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteDateAdjustmentCB newMyCB() {
        return new WhiteDateAdjustmentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDateAdjustmentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
