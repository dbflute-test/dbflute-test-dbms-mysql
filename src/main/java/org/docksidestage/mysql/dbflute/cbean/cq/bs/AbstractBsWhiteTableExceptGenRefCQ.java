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
 * The abstract condition-query of white_table_except_gen_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteTableExceptGenRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTableExceptGenRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_table_except_gen_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefId The value of genRefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenRefId_Equal(Long genRefId) {
        doSetGenRefId_Equal(genRefId);
    }

    protected void doSetGenRefId_Equal(Long genRefId) {
        regGenRefId(CK_EQ, genRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefId The value of genRefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenRefId_GreaterThan(Long genRefId) {
        regGenRefId(CK_GT, genRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefId The value of genRefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenRefId_LessThan(Long genRefId) {
        regGenRefId(CK_LT, genRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefId The value of genRefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenRefId_GreaterEqual(Long genRefId) {
        regGenRefId(CK_GE, genRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefId The value of genRefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenRefId_LessEqual(Long genRefId) {
        regGenRefId(CK_LE, genRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of genRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of genRefId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of genRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of genRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGenRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenRefId(), "GEN_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefIdList The collection of genRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenRefId_InScope(Collection<Long> genRefIdList) {
        doSetGenRefId_InScope(genRefIdList);
    }

    protected void doSetGenRefId_InScope(Collection<Long> genRefIdList) {
        regINS(CK_INS, cTL(genRefIdList), xgetCValueGenRefId(), "GEN_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param genRefIdList The collection of genRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenRefId_NotInScope(Collection<Long> genRefIdList) {
        doSetGenRefId_NotInScope(genRefIdList);
    }

    protected void doSetGenRefId_NotInScope(Collection<Long> genRefIdList) {
        regINS(CK_NINS, cTL(genRefIdList), xgetCValueGenRefId(), "GEN_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenRefId_IsNull() { regGenRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GEN_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenRefId_IsNotNull() { regGenRefId(CK_ISNN, DOBJ); }

    protected void regGenRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenRefId(), "GEN_REF_ID"); }
    protected abstract ConditionValue xgetCValueGenRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @param genRefName The value of genRefName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenRefName_Equal(String genRefName) {
        doSetGenRefName_Equal(fRES(genRefName));
    }

    protected void doSetGenRefName_Equal(String genRefName) {
        regGenRefName(CK_EQ, genRefName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @param genRefName The value of genRefName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenRefName_NotEqual(String genRefName) {
        doSetGenRefName_NotEqual(fRES(genRefName));
    }

    protected void doSetGenRefName_NotEqual(String genRefName) {
        regGenRefName(CK_NES, genRefName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @param genRefNameList The collection of genRefName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenRefName_InScope(Collection<String> genRefNameList) {
        doSetGenRefName_InScope(genRefNameList);
    }

    protected void doSetGenRefName_InScope(Collection<String> genRefNameList) {
        regINS(CK_INS, cTL(genRefNameList), xgetCValueGenRefName(), "GEN_REF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @param genRefNameList The collection of genRefName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenRefName_NotInScope(Collection<String> genRefNameList) {
        doSetGenRefName_NotInScope(genRefNameList);
    }

    protected void doSetGenRefName_NotInScope(Collection<String> genRefNameList) {
        regINS(CK_NINS, cTL(genRefNameList), xgetCValueGenRefName(), "GEN_REF_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setGenRefName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param genRefName The value of genRefName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenRefName_LikeSearch(String genRefName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenRefName_LikeSearch(genRefName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setGenRefName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genRefName The value of genRefName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenRefName_LikeSearch(String genRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genRefName), xgetCValueGenRefName(), "GEN_REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @param genRefName The value of genRefName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenRefName_NotLikeSearch(String genRefName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenRefName_NotLikeSearch(genRefName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GEN_REF_NAME: {NotNull, VARCHAR(200)}
     * @param genRefName The value of genRefName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenRefName_NotLikeSearch(String genRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genRefName), xgetCValueGenRefName(), "GEN_REF_NAME", likeSearchOption);
    }

    protected void regGenRefName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenRefName(), "GEN_REF_NAME"); }
    protected abstract ConditionValue xgetCValueGenRefName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenOnlyId_Equal(Long genOnlyId) {
        doSetGenOnlyId_Equal(genOnlyId);
    }

    protected void doSetGenOnlyId_Equal(Long genOnlyId) {
        regGenOnlyId(CK_EQ, genOnlyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenOnlyId_GreaterThan(Long genOnlyId) {
        regGenOnlyId(CK_GT, genOnlyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenOnlyId_LessThan(Long genOnlyId) {
        regGenOnlyId(CK_LT, genOnlyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenOnlyId_GreaterEqual(Long genOnlyId) {
        regGenOnlyId(CK_GE, genOnlyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyId The value of genOnlyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenOnlyId_LessEqual(Long genOnlyId) {
        regGenOnlyId(CK_LE, genOnlyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param minNumber The min number of genOnlyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of genOnlyId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenOnlyId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenOnlyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param minNumber The min number of genOnlyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of genOnlyId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGenOnlyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenOnlyId(), "GEN_ONLY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyIdList The collection of genOnlyId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyId_InScope(Collection<Long> genOnlyIdList) {
        doSetGenOnlyId_InScope(genOnlyIdList);
    }

    protected void doSetGenOnlyId_InScope(Collection<Long> genOnlyIdList) {
        regINS(CK_INS, cTL(genOnlyIdList), xgetCValueGenOnlyId(), "GEN_ONLY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     * @param genOnlyIdList The collection of genOnlyId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenOnlyId_NotInScope(Collection<Long> genOnlyIdList) {
        doSetGenOnlyId_NotInScope(genOnlyIdList);
    }

    protected void doSetGenOnlyId_NotInScope(Collection<Long> genOnlyIdList) {
        regINS(CK_NINS, cTL(genOnlyIdList), xgetCValueGenOnlyId(), "GEN_ONLY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     */
    public void setGenOnlyId_IsNull() { regGenOnlyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GEN_ONLY_ID: {IX, DECIMAL(16)}
     */
    public void setGenOnlyId_IsNotNull() { regGenOnlyId(CK_ISNN, DOBJ); }

    protected void regGenOnlyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenOnlyId(), "GEN_ONLY_ID"); }
    protected abstract ConditionValue xgetCValueGenOnlyId();

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
    public HpSLCFunction<WhiteTableExceptGenRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteTableExceptGenRefCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteTableExceptGenRefCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteTableExceptGenRefCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteTableExceptGenRefCB.class);
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
    public HpSLCFunction<WhiteTableExceptGenRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteTableExceptGenRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTableExceptGenRefCB&gt;() {
     *     public void query(WhiteTableExceptGenRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTableExceptGenRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteTableExceptGenRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteTableExceptGenRefCQ sq);

    protected WhiteTableExceptGenRefCB xcreateScalarConditionCB() {
        WhiteTableExceptGenRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTableExceptGenRefCB xcreateScalarConditionPartitionByCB() {
        WhiteTableExceptGenRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTableExceptGenRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GEN_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTableExceptGenRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTableExceptGenRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTableExceptGenRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GEN_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTableExceptGenRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTableExceptGenRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTableExceptGenRefCQ sq);

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
    protected WhiteTableExceptGenRefCB newMyCB() {
        return new WhiteTableExceptGenRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteTableExceptGenRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
