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
 * The abstract condition-query of white_table_except_gen_head.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteTableExceptGenHeadCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTableExceptGenHeadCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_table_except_gen_head";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenHeadId_Equal(Long genHeadId) {
        doSetGenHeadId_Equal(genHeadId);
    }

    protected void doSetGenHeadId_Equal(Long genHeadId) {
        regGenHeadId(CK_EQ, genHeadId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenHeadId_NotEqual(Long genHeadId) {
        doSetGenHeadId_NotEqual(genHeadId);
    }

    protected void doSetGenHeadId_NotEqual(Long genHeadId) {
        regGenHeadId(CK_NES, genHeadId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenHeadId_GreaterThan(Long genHeadId) {
        regGenHeadId(CK_GT, genHeadId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenHeadId_LessThan(Long genHeadId) {
        regGenHeadId(CK_LT, genHeadId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenHeadId_GreaterEqual(Long genHeadId) {
        regGenHeadId(CK_GE, genHeadId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadId The value of genHeadId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenHeadId_LessEqual(Long genHeadId) {
        regGenHeadId(CK_LE, genHeadId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of genHeadId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genHeadId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenHeadId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenHeadId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of genHeadId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genHeadId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGenHeadId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenHeadId(), "GEN_HEAD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadIdList The collection of genHeadId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenHeadId_InScope(Collection<Long> genHeadIdList) {
        doSetGenHeadId_InScope(genHeadIdList);
    }

    protected void doSetGenHeadId_InScope(Collection<Long> genHeadIdList) {
        regINS(CK_INS, cTL(genHeadIdList), xgetCValueGenHeadId(), "GEN_HEAD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     * @param genHeadIdList The collection of genHeadId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenHeadId_NotInScope(Collection<Long> genHeadIdList) {
        doSetGenHeadId_NotInScope(genHeadIdList);
    }

    protected void doSetGenHeadId_NotInScope(Collection<Long> genHeadIdList) {
        regINS(CK_NINS, cTL(genHeadIdList), xgetCValueGenHeadId(), "GEN_HEAD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenHeadId_IsNull() { regGenHeadId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenHeadId_IsNotNull() { regGenHeadId(CK_ISNN, DOBJ); }

    protected void regGenHeadId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenHeadId(), "GEN_HEAD_ID"); }
    protected abstract ConditionValue xgetCValueGenHeadId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenHeadName_Equal(String genHeadName) {
        doSetGenHeadName_Equal(fRES(genHeadName));
    }

    protected void doSetGenHeadName_Equal(String genHeadName) {
        regGenHeadName(CK_EQ, genHeadName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenHeadName_NotEqual(String genHeadName) {
        doSetGenHeadName_NotEqual(fRES(genHeadName));
    }

    protected void doSetGenHeadName_NotEqual(String genHeadName) {
        regGenHeadName(CK_NES, genHeadName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadNameList The collection of genHeadName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenHeadName_InScope(Collection<String> genHeadNameList) {
        doSetGenHeadName_InScope(genHeadNameList);
    }

    protected void doSetGenHeadName_InScope(Collection<String> genHeadNameList) {
        regINS(CK_INS, cTL(genHeadNameList), xgetCValueGenHeadName(), "GEN_HEAD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadNameList The collection of genHeadName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenHeadName_NotInScope(Collection<String> genHeadNameList) {
        doSetGenHeadName_NotInScope(genHeadNameList);
    }

    protected void doSetGenHeadName_NotInScope(Collection<String> genHeadNameList) {
        regINS(CK_NINS, cTL(genHeadNameList), xgetCValueGenHeadName(), "GEN_HEAD_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setGenHeadName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param genHeadName The value of genHeadName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenHeadName_LikeSearch(String genHeadName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenHeadName_LikeSearch(genHeadName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setGenHeadName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genHeadName The value of genHeadName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenHeadName_LikeSearch(String genHeadName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genHeadName), xgetCValueGenHeadName(), "GEN_HEAD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenHeadName_NotLikeSearch(String genHeadName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenHeadName_NotLikeSearch(genHeadName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_HEAD_NAME: {NotNull, VARCHAR(200)}
     * @param genHeadName The value of genHeadName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenHeadName_NotLikeSearch(String genHeadName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genHeadName), xgetCValueGenHeadName(), "GEN_HEAD_NAME", likeSearchOption);
    }

    protected void regGenHeadName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenHeadName(), "GEN_HEAD_NAME"); }
    protected abstract ConditionValue xgetCValueGenHeadName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNometaId_Equal(Long nometaId) {
        doSetNometaId_Equal(nometaId);
    }

    protected void doSetNometaId_Equal(Long nometaId) {
        regNometaId(CK_EQ, nometaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNometaId_NotEqual(Long nometaId) {
        doSetNometaId_NotEqual(nometaId);
    }

    protected void doSetNometaId_NotEqual(Long nometaId) {
        regNometaId(CK_NES, nometaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNometaId_GreaterThan(Long nometaId) {
        regNometaId(CK_GT, nometaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNometaId_LessThan(Long nometaId) {
        regNometaId(CK_LT, nometaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNometaId_GreaterEqual(Long nometaId) {
        regNometaId(CK_GE, nometaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaId The value of nometaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNometaId_LessEqual(Long nometaId) {
        regNometaId(CK_LE, nometaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param minNumber The min number of nometaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nometaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNometaId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNometaId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param minNumber The min number of nometaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nometaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNometaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNometaId(), "NOMETA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaIdList The collection of nometaId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNometaId_InScope(Collection<Long> nometaIdList) {
        doSetNometaId_InScope(nometaIdList);
    }

    protected void doSetNometaId_InScope(Collection<Long> nometaIdList) {
        regINS(CK_INS, cTL(nometaIdList), xgetCValueNometaId(), "NOMETA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     * @param nometaIdList The collection of nometaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNometaId_NotInScope(Collection<Long> nometaIdList) {
        doSetNometaId_NotInScope(nometaIdList);
    }

    protected void doSetNometaId_NotInScope(Collection<Long> nometaIdList) {
        regINS(CK_NINS, cTL(nometaIdList), xgetCValueNometaId(), "NOMETA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     */
    public void setNometaId_IsNull() { regNometaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOMETA_ID: {IX, DECIMAL(16)}
     */
    public void setNometaId_IsNotNull() { regNometaId(CK_ISNN, DOBJ); }

    protected void regNometaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNometaId(), "NOMETA_ID"); }
    protected abstract ConditionValue xgetCValueNometaId();

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
    public HpSLCFunction<WhiteTableExceptGenHeadCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteTableExceptGenHeadCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenHeadCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteTableExceptGenHeadCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenHeadCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteTableExceptGenHeadCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenHeadCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteTableExceptGenHeadCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenHeadCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteTableExceptGenHeadCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void query(WhiteTableExceptGenHeadCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTableExceptGenHeadCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteTableExceptGenHeadCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenHeadCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteTableExceptGenHeadCQ sq);

    protected WhiteTableExceptGenHeadCB xcreateScalarConditionCB() {
        WhiteTableExceptGenHeadCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTableExceptGenHeadCB xcreateScalarConditionPartitionByCB() {
        WhiteTableExceptGenHeadCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTableExceptGenHeadCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GEN_HEAD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTableExceptGenHeadCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTableExceptGenHeadCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTableExceptGenHeadCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GEN_HEAD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTableExceptGenHeadCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTableExceptGenHeadCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTableExceptGenHeadCQ sq);

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
    protected WhiteTableExceptGenHeadCB newMyCB() {
        return new WhiteTableExceptGenHeadCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteTableExceptGenHeadCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
