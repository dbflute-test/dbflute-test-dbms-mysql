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
 * The abstract condition-query of white_xls_man.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteXlsManCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteXlsManCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_xls_man";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setXlsManId_Equal(Long xlsManId) {
        doSetXlsManId_Equal(xlsManId);
    }

    protected void doSetXlsManId_Equal(Long xlsManId) {
        regXlsManId(CK_EQ, xlsManId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXlsManId_NotEqual(Long xlsManId) {
        doSetXlsManId_NotEqual(xlsManId);
    }

    protected void doSetXlsManId_NotEqual(Long xlsManId) {
        regXlsManId(CK_NES, xlsManId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXlsManId_GreaterThan(Long xlsManId) {
        regXlsManId(CK_GT, xlsManId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setXlsManId_LessThan(Long xlsManId) {
        regXlsManId(CK_LT, xlsManId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXlsManId_GreaterEqual(Long xlsManId) {
        regXlsManId(CK_GE, xlsManId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManId The value of xlsManId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setXlsManId_LessEqual(Long xlsManId) {
        regXlsManId(CK_LE, xlsManId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of xlsManId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of xlsManId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setXlsManId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setXlsManId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of xlsManId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of xlsManId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setXlsManId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueXlsManId(), "XLS_MAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManIdList The collection of xlsManId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXlsManId_InScope(Collection<Long> xlsManIdList) {
        doSetXlsManId_InScope(xlsManIdList);
    }

    protected void doSetXlsManId_InScope(Collection<Long> xlsManIdList) {
        regINS(CK_INS, cTL(xlsManIdList), xgetCValueXlsManId(), "XLS_MAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param xlsManIdList The collection of xlsManId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setXlsManId_NotInScope(Collection<Long> xlsManIdList) {
        doSetXlsManId_NotInScope(xlsManIdList);
    }

    protected void doSetXlsManId_NotInScope(Collection<Long> xlsManIdList) {
        regINS(CK_NINS, cTL(xlsManIdList), xgetCValueXlsManId(), "XLS_MAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setXlsManId_IsNull() { regXlsManId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setXlsManId_IsNotNull() { regXlsManId(CK_ISNN, DOBJ); }

    protected void regXlsManId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueXlsManId(), "XLS_MAN_ID"); }
    protected abstract ConditionValue xgetCValueXlsManId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_Equal(String stringConverted) {
        doSetStringConverted_Equal(fRES(stringConverted));
    }

    protected void doSetStringConverted_Equal(String stringConverted) {
        regStringConverted(CK_EQ, stringConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_NotEqual(String stringConverted) {
        doSetStringConverted_NotEqual(fRES(stringConverted));
    }

    protected void doSetStringConverted_NotEqual(String stringConverted) {
        regStringConverted(CK_NES, stringConverted);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_InScope(Collection<String> stringConvertedList) {
        doSetStringConverted_InScope(stringConvertedList);
    }

    protected void doSetStringConverted_InScope(Collection<String> stringConvertedList) {
        regINS(CK_INS, cTL(stringConvertedList), xgetCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_NotInScope(Collection<String> stringConvertedList) {
        doSetStringConverted_NotInScope(stringConvertedList);
    }

    protected void doSetStringConverted_NotInScope(Collection<String> stringConvertedList) {
        regINS(CK_NINS, cTL(stringConvertedList), xgetCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)} <br>
     * <pre>e.g. setStringConverted_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringConverted_LikeSearch(stringConverted, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)} <br>
     * <pre>e.g. setStringConverted_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringConverted), xgetCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringConverted_NotLikeSearch(stringConverted, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringConverted), xgetCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNull() { regStringConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNullOrEmpty() { regStringConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNotNull() { regStringConverted(CK_ISNN, DOBJ); }

    protected void regStringConverted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringConverted(), "STRING_CONVERTED"); }
    protected abstract ConditionValue xgetCValueStringConverted();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimestampConverted_Equal(java.time.LocalDateTime timestampConverted) {
        regTimestampConverted(CK_EQ,  timestampConverted);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimestampConverted_GreaterThan(java.time.LocalDateTime timestampConverted) {
        regTimestampConverted(CK_GT,  timestampConverted);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimestampConverted_LessThan(java.time.LocalDateTime timestampConverted) {
        regTimestampConverted(CK_LT,  timestampConverted);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimestampConverted_GreaterEqual(java.time.LocalDateTime timestampConverted) {
        regTimestampConverted(CK_GE,  timestampConverted);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * @param timestampConverted The value of timestampConverted as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimestampConverted_LessEqual(java.time.LocalDateTime timestampConverted) {
        regTimestampConverted(CK_LE, timestampConverted);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * <pre>e.g. setTimestampConverted_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampConverted. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampConverted. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTimestampConverted_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTimestampConverted_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     * <pre>e.g. setTimestampConverted_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampConverted. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampConverted. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTimestampConverted_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "TIMESTAMP_CONVERTED"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTimestampConverted(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     */
    public void setTimestampConverted_IsNull() { regTimestampConverted(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIMESTAMP_CONVERTED: {DATETIME(19)}
     */
    public void setTimestampConverted_IsNotNull() { regTimestampConverted(CK_ISNN, DOBJ); }

    protected void regTimestampConverted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimestampConverted(), "TIMESTAMP_CONVERTED"); }
    protected abstract ConditionValue xgetCValueTimestampConverted();

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
    public HpSLCFunction<WhiteXlsManCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteXlsManCB.class);
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
    public HpSLCFunction<WhiteXlsManCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteXlsManCB.class);
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
    public HpSLCFunction<WhiteXlsManCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteXlsManCB.class);
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
    public HpSLCFunction<WhiteXlsManCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteXlsManCB.class);
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
    public HpSLCFunction<WhiteXlsManCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteXlsManCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteXlsManCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteXlsManCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteXlsManCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteXlsManCQ sq);

    protected WhiteXlsManCB xcreateScalarConditionCB() {
        WhiteXlsManCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteXlsManCB xcreateScalarConditionPartitionByCB() {
        WhiteXlsManCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteXlsManCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "XLS_MAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteXlsManCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteXlsManCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteXlsManCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "XLS_MAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteXlsManCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteXlsManCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteXlsManCQ sq);

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
    protected WhiteXlsManCB newMyCB() {
        return new WhiteXlsManCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteXlsManCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
