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
 * The abstract condition-query of white_perrotta_over_trace.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverTraceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverTraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_perrotta_over_trace";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceId The value of traceId as equal. (NullAllowed: if null, no condition)
     */
    public void setTraceId_Equal(Long traceId) {
        doSetTraceId_Equal(traceId);
    }

    protected void doSetTraceId_Equal(Long traceId) {
        regTraceId(CK_EQ, traceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceId The value of traceId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTraceId_GreaterThan(Long traceId) {
        regTraceId(CK_GT, traceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceId The value of traceId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTraceId_LessThan(Long traceId) {
        regTraceId(CK_LT, traceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceId The value of traceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTraceId_GreaterEqual(Long traceId) {
        regTraceId(CK_GE, traceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceId The value of traceId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTraceId_LessEqual(Long traceId) {
        regTraceId(CK_LE, traceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of traceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of traceId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTraceId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTraceId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of traceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of traceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTraceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTraceId(), "TRACE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceIdList The collection of traceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTraceId_InScope(Collection<Long> traceIdList) {
        doSetTraceId_InScope(traceIdList);
    }

    protected void doSetTraceId_InScope(Collection<Long> traceIdList) {
        regINS(CK_INS, cTL(traceIdList), xgetCValueTraceId(), "TRACE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @param traceIdList The collection of traceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTraceId_NotInScope(Collection<Long> traceIdList) {
        doSetTraceId_NotInScope(traceIdList);
    }

    protected void doSetTraceId_NotInScope(Collection<Long> traceIdList) {
        regINS(CK_NINS, cTL(traceIdList), xgetCValueTraceId(), "TRACE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTraceId_IsNull() { regTraceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTraceId_IsNotNull() { regTraceId(CK_ISNN, DOBJ); }

    protected void regTraceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTraceId(), "TRACE_ID"); }
    protected abstract ConditionValue xgetCValueTraceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductId The value of previousProductId as equal. (NullAllowed: if null, no condition)
     */
    public void setPreviousProductId_Equal(Long previousProductId) {
        doSetPreviousProductId_Equal(previousProductId);
    }

    protected void doSetPreviousProductId_Equal(Long previousProductId) {
        regPreviousProductId(CK_EQ, previousProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductId The value of previousProductId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPreviousProductId_GreaterThan(Long previousProductId) {
        regPreviousProductId(CK_GT, previousProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductId The value of previousProductId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPreviousProductId_LessThan(Long previousProductId) {
        regPreviousProductId(CK_LT, previousProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductId The value of previousProductId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPreviousProductId_GreaterEqual(Long previousProductId) {
        regPreviousProductId(CK_GE, previousProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductId The value of previousProductId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPreviousProductId_LessEqual(Long previousProductId) {
        regPreviousProductId(CK_LE, previousProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param minNumber The min number of previousProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of previousProductId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPreviousProductId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPreviousProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param minNumber The min number of previousProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of previousProductId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPreviousProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePreviousProductId(), "PREVIOUS_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductIdList The collection of previousProductId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPreviousProductId_InScope(Collection<Long> previousProductIdList) {
        doSetPreviousProductId_InScope(previousProductIdList);
    }

    protected void doSetPreviousProductId_InScope(Collection<Long> previousProductIdList) {
        regINS(CK_INS, cTL(previousProductIdList), xgetCValuePreviousProductId(), "PREVIOUS_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param previousProductIdList The collection of previousProductId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPreviousProductId_NotInScope(Collection<Long> previousProductIdList) {
        doSetPreviousProductId_NotInScope(previousProductIdList);
    }

    protected void doSetPreviousProductId_NotInScope(Collection<Long> previousProductIdList) {
        regINS(CK_NINS, cTL(previousProductIdList), xgetCValuePreviousProductId(), "PREVIOUS_PRODUCT_ID");
    }

    protected void regPreviousProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePreviousProductId(), "PREVIOUS_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValuePreviousProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductId The value of nextProductId as equal. (NullAllowed: if null, no condition)
     */
    public void setNextProductId_Equal(Long nextProductId) {
        doSetNextProductId_Equal(nextProductId);
    }

    protected void doSetNextProductId_Equal(Long nextProductId) {
        regNextProductId(CK_EQ, nextProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductId The value of nextProductId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextProductId_GreaterThan(Long nextProductId) {
        regNextProductId(CK_GT, nextProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductId The value of nextProductId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextProductId_LessThan(Long nextProductId) {
        regNextProductId(CK_LT, nextProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductId The value of nextProductId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextProductId_GreaterEqual(Long nextProductId) {
        regNextProductId(CK_GE, nextProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductId The value of nextProductId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextProductId_LessEqual(Long nextProductId) {
        regNextProductId(CK_LE, nextProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param minNumber The min number of nextProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextProductId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNextProductId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNextProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param minNumber The min number of nextProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextProductId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNextProductId(), "NEXT_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductIdList The collection of nextProductId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextProductId_InScope(Collection<Long> nextProductIdList) {
        doSetNextProductId_InScope(nextProductIdList);
    }

    protected void doSetNextProductId_InScope(Collection<Long> nextProductIdList) {
        regINS(CK_INS, cTL(nextProductIdList), xgetCValueNextProductId(), "NEXT_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
     * @param nextProductIdList The collection of nextProductId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextProductId_NotInScope(Collection<Long> nextProductIdList) {
        doSetNextProductId_NotInScope(nextProductIdList);
    }

    protected void doSetNextProductId_NotInScope(Collection<Long> nextProductIdList) {
        regINS(CK_NINS, cTL(nextProductIdList), xgetCValueNextProductId(), "NEXT_PRODUCT_ID");
    }

    protected void regNextProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextProductId(), "NEXT_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueNextProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @param traceTypeCode The value of traceTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTraceTypeCode_Equal(String traceTypeCode) {
        doSetTraceTypeCode_Equal(fRES(traceTypeCode));
    }

    protected void doSetTraceTypeCode_Equal(String traceTypeCode) {
        regTraceTypeCode(CK_EQ, traceTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @param traceTypeCode The value of traceTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTraceTypeCode_NotEqual(String traceTypeCode) {
        doSetTraceTypeCode_NotEqual(fRES(traceTypeCode));
    }

    protected void doSetTraceTypeCode_NotEqual(String traceTypeCode) {
        regTraceTypeCode(CK_NES, traceTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @param traceTypeCodeList The collection of traceTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTraceTypeCode_InScope(Collection<String> traceTypeCodeList) {
        doSetTraceTypeCode_InScope(traceTypeCodeList);
    }

    protected void doSetTraceTypeCode_InScope(Collection<String> traceTypeCodeList) {
        regINS(CK_INS, cTL(traceTypeCodeList), xgetCValueTraceTypeCode(), "TRACE_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @param traceTypeCodeList The collection of traceTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTraceTypeCode_NotInScope(Collection<String> traceTypeCodeList) {
        doSetTraceTypeCode_NotInScope(traceTypeCodeList);
    }

    protected void doSetTraceTypeCode_NotInScope(Collection<String> traceTypeCodeList) {
        regINS(CK_NINS, cTL(traceTypeCodeList), xgetCValueTraceTypeCode(), "TRACE_TYPE_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * <pre>e.g. setTraceTypeCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param traceTypeCode The value of traceTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTraceTypeCode_LikeSearch(String traceTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTraceTypeCode_LikeSearch(traceTypeCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * <pre>e.g. setTraceTypeCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param traceTypeCode The value of traceTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTraceTypeCode_LikeSearch(String traceTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(traceTypeCode), xgetCValueTraceTypeCode(), "TRACE_TYPE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @param traceTypeCode The value of traceTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTraceTypeCode_NotLikeSearch(String traceTypeCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTraceTypeCode_NotLikeSearch(traceTypeCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @param traceTypeCode The value of traceTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTraceTypeCode_NotLikeSearch(String traceTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(traceTypeCode), xgetCValueTraceTypeCode(), "TRACE_TYPE_CODE", likeSearchOption);
    }

    protected void regTraceTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTraceTypeCode(), "TRACE_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueTraceTypeCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverTraceCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhitePerrottaOverTraceCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverTraceCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhitePerrottaOverTraceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverTraceCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhitePerrottaOverTraceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverTraceCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhitePerrottaOverTraceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverTraceCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhitePerrottaOverTraceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void query(WhitePerrottaOverTraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhitePerrottaOverTraceCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhitePerrottaOverTraceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverTraceCQ sq);

    protected WhitePerrottaOverTraceCB xcreateScalarConditionCB() {
        WhitePerrottaOverTraceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverTraceCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverTraceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRACE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverTraceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverTraceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverTraceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRACE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverTraceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverTraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverTraceCQ sq);

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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected WhitePerrottaOverTraceCB newMyCB() {
        return new WhitePerrottaOverTraceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverTraceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
