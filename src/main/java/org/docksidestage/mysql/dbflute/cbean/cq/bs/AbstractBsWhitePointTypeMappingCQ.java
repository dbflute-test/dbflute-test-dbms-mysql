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
 * The abstract condition-query of white_point_type_mapping.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePointTypeMappingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePointTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_point_type_mapping";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_Equal(Long pointTypeMappingId) {
        doSetPointTypeMappingId_Equal(pointTypeMappingId);
    }

    protected void doSetPointTypeMappingId_Equal(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_EQ, pointTypeMappingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_NotEqual(Long pointTypeMappingId) {
        doSetPointTypeMappingId_NotEqual(pointTypeMappingId);
    }

    protected void doSetPointTypeMappingId_NotEqual(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_NES, pointTypeMappingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_GreaterThan(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_GT, pointTypeMappingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_LessThan(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_LT, pointTypeMappingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_GreaterEqual(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_GE, pointTypeMappingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingId The value of pointTypeMappingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_LessEqual(Long pointTypeMappingId) {
        regPointTypeMappingId(CK_LE, pointTypeMappingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pointTypeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointTypeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPointTypeMappingId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPointTypeMappingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pointTypeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointTypeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPointTypeMappingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingIdList The collection of pointTypeMappingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_InScope(Collection<Long> pointTypeMappingIdList) {
        doSetPointTypeMappingId_InScope(pointTypeMappingIdList);
    }

    protected void doSetPointTypeMappingId_InScope(Collection<Long> pointTypeMappingIdList) {
        regINS(CK_INS, cTL(pointTypeMappingIdList), xgetCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param pointTypeMappingIdList The collection of pointTypeMappingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointTypeMappingId_NotInScope(Collection<Long> pointTypeMappingIdList) {
        doSetPointTypeMappingId_NotInScope(pointTypeMappingIdList);
    }

    protected void doSetPointTypeMappingId_NotInScope(Collection<Long> pointTypeMappingIdList) {
        regINS(CK_NINS, cTL(pointTypeMappingIdList), xgetCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPointTypeMappingId_IsNull() { regPointTypeMappingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPointTypeMappingId_IsNotNull() { regPointTypeMappingId(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointTypeMappingId(), "POINT_TYPE_MAPPING_ID"); }
    protected abstract ConditionValue xgetCValuePointTypeMappingId();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     */
    public void setPointTypeMappingMemberName_IsNull() { regPointTypeMappingMemberName(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     */
    public void setPointTypeMappingMemberName_IsNotNull() { regPointTypeMappingMemberName(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointTypeMappingMemberName(), "POINT_TYPE_MAPPING_MEMBER_NAME"); }
    protected abstract ConditionValue xgetCValuePointTypeMappingMemberName();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     */
    public void setPointTypeMappingPriceCount_IsNull() { regPointTypeMappingPriceCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     */
    public void setPointTypeMappingPriceCount_IsNotNull() { regPointTypeMappingPriceCount(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingPriceCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointTypeMappingPriceCount(), "POINT_TYPE_MAPPING_PRICE_COUNT"); }
    protected abstract ConditionValue xgetCValuePointTypeMappingPriceCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingSaleDate_Equal(org.docksidestage.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_EQ,  pointTypeMappingSaleDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingSaleDate_GreaterThan(org.docksidestage.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_GT,  pointTypeMappingSaleDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingSaleDate_LessThan(org.docksidestage.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_LT,  pointTypeMappingSaleDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingSaleDate_GreaterEqual(org.docksidestage.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_GE,  pointTypeMappingSaleDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @param pointTypeMappingSaleDate The value of pointTypeMappingSaleDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingSaleDate_LessEqual(org.docksidestage.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        regPointTypeMappingSaleDate(CK_LE, pointTypeMappingSaleDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * <pre>e.g. setPointTypeMappingSaleDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingSaleDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingSaleDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPointTypeMappingSaleDate_FromTo(org.docksidestage.mysql.mytype.MySaleDate fromDatetime, org.docksidestage.mysql.mytype.MySaleDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPointTypeMappingSaleDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * <pre>e.g. setPointTypeMappingSaleDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingSaleDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingSaleDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPointTypeMappingSaleDate_FromTo(org.docksidestage.mysql.mytype.MySaleDate fromDatetime, org.docksidestage.mysql.mytype.MySaleDate toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new org.docksidestage.mysql.mytype.MySaleDate(fromDatetime.getTime()) : null), (toDatetime != null ? new org.docksidestage.mysql.mytype.MySaleDate(toDatetime.getTime()) : null), xgetCValuePointTypeMappingSaleDate(), "POINT_TYPE_MAPPING_SALE_DATE", fromToOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     */
    public void setPointTypeMappingSaleDate_IsNull() { regPointTypeMappingSaleDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     */
    public void setPointTypeMappingSaleDate_IsNotNull() { regPointTypeMappingSaleDate(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingSaleDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointTypeMappingSaleDate(), "POINT_TYPE_MAPPING_SALE_DATE"); }
    protected abstract ConditionValue xgetCValuePointTypeMappingSaleDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingWantedDatetime_Equal(java.time.LocalDate pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_EQ,  pointTypeMappingWantedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingWantedDatetime_GreaterThan(java.time.LocalDate pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_GT,  pointTypeMappingWantedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingWantedDatetime_LessThan(java.time.LocalDate pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_LT,  pointTypeMappingWantedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingWantedDatetime_GreaterEqual(java.time.LocalDate pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_GE,  pointTypeMappingWantedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @param pointTypeMappingWantedDatetime The value of pointTypeMappingWantedDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointTypeMappingWantedDatetime_LessEqual(java.time.LocalDate pointTypeMappingWantedDatetime) {
        regPointTypeMappingWantedDatetime(CK_LE, pointTypeMappingWantedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * <pre>e.g. setPointTypeMappingWantedDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingWantedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingWantedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPointTypeMappingWantedDatetime_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPointTypeMappingWantedDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * <pre>e.g. setPointTypeMappingWantedDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingWantedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointTypeMappingWantedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPointTypeMappingWantedDatetime_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "POINT_TYPE_MAPPING_WANTED_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePointTypeMappingWantedDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     */
    public void setPointTypeMappingWantedDatetime_IsNull() { regPointTypeMappingWantedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     */
    public void setPointTypeMappingWantedDatetime_IsNotNull() { regPointTypeMappingWantedDatetime(CK_ISNN, DOBJ); }

    protected void regPointTypeMappingWantedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointTypeMappingWantedDatetime(), "POINT_TYPE_MAPPING_WANTED_DATETIME"); }
    protected abstract ConditionValue xgetCValuePointTypeMappingWantedDatetime();

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
    public HpSLCFunction<WhitePointTypeMappingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhitePointTypeMappingCB.class);
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
    public HpSLCFunction<WhitePointTypeMappingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhitePointTypeMappingCB.class);
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
    public HpSLCFunction<WhitePointTypeMappingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhitePointTypeMappingCB.class);
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
    public HpSLCFunction<WhitePointTypeMappingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhitePointTypeMappingCB.class);
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
    public HpSLCFunction<WhitePointTypeMappingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhitePointTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void query(WhitePointTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePointTypeMappingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhitePointTypeMappingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePointTypeMappingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhitePointTypeMappingCQ sq);

    protected WhitePointTypeMappingCB xcreateScalarConditionCB() {
        WhitePointTypeMappingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePointTypeMappingCB xcreateScalarConditionPartitionByCB() {
        WhitePointTypeMappingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePointTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "POINT_TYPE_MAPPING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePointTypeMappingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePointTypeMappingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePointTypeMappingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "POINT_TYPE_MAPPING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePointTypeMappingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePointTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePointTypeMappingCQ sq);

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
    protected WhitePointTypeMappingCB newMyCB() {
        return new WhitePointTypeMappingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePointTypeMappingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
