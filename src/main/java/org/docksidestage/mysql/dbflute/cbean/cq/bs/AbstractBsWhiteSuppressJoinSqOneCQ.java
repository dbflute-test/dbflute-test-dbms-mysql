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
 * The abstract condition-query of white_suppress_join_sq_one.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqOneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_suppress_join_sq_one";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneId The value of oneId as equal. (NullAllowed: if null, no condition)
     */
    public void setOneId_Equal(Integer oneId) {
        doSetOneId_Equal(oneId);
    }

    protected void doSetOneId_Equal(Integer oneId) {
        regOneId(CK_EQ, oneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneId The value of oneId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setOneId_GreaterThan(Integer oneId) {
        regOneId(CK_GT, oneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneId The value of oneId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setOneId_LessThan(Integer oneId) {
        regOneId(CK_LT, oneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneId The value of oneId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setOneId_GreaterEqual(Integer oneId) {
        regOneId(CK_GE, oneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneId The value of oneId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setOneId_LessEqual(Integer oneId) {
        regOneId(CK_LE, oneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of oneId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of oneId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOneId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOneId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of oneId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of oneId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOneId(), "ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneIdList The collection of oneId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneId_InScope(Collection<Integer> oneIdList) {
        doSetOneId_InScope(oneIdList);
    }

    protected void doSetOneId_InScope(Collection<Integer> oneIdList) {
        regINS(CK_INS, cTL(oneIdList), xgetCValueOneId(), "ONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     * @param oneIdList The collection of oneId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneId_NotInScope(Collection<Integer> oneIdList) {
        doSetOneId_NotInScope(oneIdList);
    }

    protected void doSetOneId_NotInScope(Collection<Integer> oneIdList) {
        regINS(CK_NINS, cTL(oneIdList), xgetCValueOneId(), "ONE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setOneId_IsNull() { regOneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setOneId_IsNotNull() { regOneId(CK_ISNN, DOBJ); }

    protected void regOneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOneId(), "ONE_ID"); }
    protected abstract ConditionValue xgetCValueOneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @param oneName The value of oneName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneName_Equal(String oneName) {
        doSetOneName_Equal(fRES(oneName));
    }

    protected void doSetOneName_Equal(String oneName) {
        regOneName(CK_EQ, oneName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @param oneName The value of oneName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneName_NotEqual(String oneName) {
        doSetOneName_NotEqual(fRES(oneName));
    }

    protected void doSetOneName_NotEqual(String oneName) {
        regOneName(CK_NES, oneName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @param oneNameList The collection of oneName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneName_InScope(Collection<String> oneNameList) {
        doSetOneName_InScope(oneNameList);
    }

    protected void doSetOneName_InScope(Collection<String> oneNameList) {
        regINS(CK_INS, cTL(oneNameList), xgetCValueOneName(), "ONE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @param oneNameList The collection of oneName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneName_NotInScope(Collection<String> oneNameList) {
        doSetOneName_NotInScope(oneNameList);
    }

    protected void doSetOneName_NotInScope(Collection<String> oneNameList) {
        regINS(CK_NINS, cTL(oneNameList), xgetCValueOneName(), "ONE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setOneName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param oneName The value of oneName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOneName_LikeSearch(String oneName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOneName_LikeSearch(oneName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setOneName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oneName The value of oneName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOneName_LikeSearch(String oneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oneName), xgetCValueOneName(), "ONE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @param oneName The value of oneName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOneName_NotLikeSearch(String oneName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOneName_NotLikeSearch(oneName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @param oneName The value of oneName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOneName_NotLikeSearch(String oneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oneName), xgetCValueOneName(), "ONE_NAME", likeSearchOption);
    }

    protected void regOneName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOneName(), "ONE_NAME"); }
    protected abstract ConditionValue xgetCValueOneName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as equal. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_Equal(Integer suppressJoinSqId) {
        doSetSuppressJoinSqId_Equal(suppressJoinSqId);
    }

    protected void doSetSuppressJoinSqId_Equal(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_EQ, suppressJoinSqId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_GreaterThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GT, suppressJoinSqId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_LessThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LT, suppressJoinSqId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_GreaterEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GE, suppressJoinSqId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSuppressJoinSqId_LessEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LE, suppressJoinSqId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param minNumber The min number of suppressJoinSqId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of suppressJoinSqId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSuppressJoinSqId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSuppressJoinSqId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param minNumber The min number of suppressJoinSqId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of suppressJoinSqId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSuppressJoinSqId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqId_InScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_InScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_InScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_INS, cTL(suppressJoinSqIdList), xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_NotInScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_NINS, cTL(suppressJoinSqIdList), xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    protected void regSuppressJoinSqId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID"); }
    protected abstract ConditionValue xgetCValueSuppressJoinSqId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiId The value of oneAddiId as equal. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_Equal(Integer oneAddiId) {
        doSetOneAddiId_Equal(oneAddiId);
    }

    protected void doSetOneAddiId_Equal(Integer oneAddiId) {
        regOneAddiId(CK_EQ, oneAddiId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiId The value of oneAddiId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_GreaterThan(Integer oneAddiId) {
        regOneAddiId(CK_GT, oneAddiId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiId The value of oneAddiId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_LessThan(Integer oneAddiId) {
        regOneAddiId(CK_LT, oneAddiId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiId The value of oneAddiId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_GreaterEqual(Integer oneAddiId) {
        regOneAddiId(CK_GE, oneAddiId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiId The value of oneAddiId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_LessEqual(Integer oneAddiId) {
        regOneAddiId(CK_LE, oneAddiId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param minNumber The min number of oneAddiId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of oneAddiId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOneAddiId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOneAddiId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param minNumber The min number of oneAddiId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of oneAddiId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOneAddiId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOneAddiId(), "ONE_ADDI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiIdList The collection of oneAddiId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiId_InScope(Collection<Integer> oneAddiIdList) {
        doSetOneAddiId_InScope(oneAddiIdList);
    }

    protected void doSetOneAddiId_InScope(Collection<Integer> oneAddiIdList) {
        regINS(CK_INS, cTL(oneAddiIdList), xgetCValueOneAddiId(), "ONE_ADDI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @param oneAddiIdList The collection of oneAddiId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiId_NotInScope(Collection<Integer> oneAddiIdList) {
        doSetOneAddiId_NotInScope(oneAddiIdList);
    }

    protected void doSetOneAddiId_NotInScope(Collection<Integer> oneAddiIdList) {
        regINS(CK_NINS, cTL(oneAddiIdList), xgetCValueOneAddiId(), "ONE_ADDI_ID");
    }

    protected void regOneAddiId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOneAddiId(), "ONE_ADDI_ID"); }
    protected abstract ConditionValue xgetCValueOneAddiId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSuppressJoinSqOneCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSuppressJoinSqOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSuppressJoinSqOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSuppressJoinSqOneCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSuppressJoinSqOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSuppressJoinSqOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqOneCQ sq);

    protected WhiteSuppressJoinSqOneCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqOneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqOneCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqOneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqOneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ONE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqOneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqOneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqOneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ONE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqOneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqOneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqOneCQ sq);

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
    protected WhiteSuppressJoinSqOneCB newMyCB() {
        return new WhiteSuppressJoinSqOneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSuppressJoinSqOneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
