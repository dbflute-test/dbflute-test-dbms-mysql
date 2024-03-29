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
 * The abstract condition-query of white_split_multiple_fk_next.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkNextCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkNextCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_split_multiple_fk_next";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextId_Equal(Long nextId) {
        doSetNextId_Equal(nextId);
    }

    protected void doSetNextId_Equal(Long nextId) {
        regNextId(CK_EQ, nextId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextId_NotEqual(Long nextId) {
        doSetNextId_NotEqual(nextId);
    }

    protected void doSetNextId_NotEqual(Long nextId) {
        regNextId(CK_NES, nextId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextId_GreaterThan(Long nextId) {
        regNextId(CK_GT, nextId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextId_LessThan(Long nextId) {
        regNextId(CK_LT, nextId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextId_GreaterEqual(Long nextId) {
        regNextId(CK_GE, nextId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextId The value of nextId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextId_LessEqual(Long nextId) {
        regNextId(CK_LE, nextId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of nextId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nextId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNextId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNextId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of nextId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nextId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNextId(), "NEXT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextIdList The collection of nextId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNextId_InScope(Collection<Long> nextIdList) {
        doSetNextId_InScope(nextIdList);
    }

    protected void doSetNextId_InScope(Collection<Long> nextIdList) {
        regINS(CK_INS, cTL(nextIdList), xgetCValueNextId(), "NEXT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     * @param nextIdList The collection of nextId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNextId_NotInScope(Collection<Long> nextIdList) {
        doSetNextId_NotInScope(nextIdList);
    }

    protected void doSetNextId_NotInScope(Collection<Long> nextIdList) {
        regINS(CK_NINS, cTL(nextIdList), xgetCValueNextId(), "NEXT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NEXT_ID from white_split_multiple_fk_base where ...)} <br>
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteSplitMultipleFkBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteSplitMultipleFkBaseList for 'exists'. (NotNull)
     */
    public void existsWhiteSplitMultipleFkBase(SubQuery<WhiteSplitMultipleFkBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(cb.query());
        registerExistsReferrer(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList");
    }
    public abstract String keepNextId_ExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NEXT_ID from white_split_multiple_fk_base where ...)} <br>
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteSplitMultipleFkBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of NextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSplitMultipleFkBase(SubQuery<WhiteSplitMultipleFkBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList");
    }
    public abstract String keepNextId_NotExistsReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    public void xsderiveWhiteSplitMultipleFkBaseList(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NEXT_ID", "NEXT_ID", pp, "whiteSplitMultipleFkBaseList", al, op);
    }
    public abstract String keepNextId_SpecifyDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_split_multiple_fk_base where ...)} <br>
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteSplitMultipleFkBase()</span>.<span style="color: #CC4747">max</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     baseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkBaseCB> derivedWhiteSplitMultipleFkBase() {
        return xcreateQDRFunctionWhiteSplitMultipleFkBaseList();
    }
    protected HpQDRFunction<WhiteSplitMultipleFkBaseCB> xcreateQDRFunctionWhiteSplitMultipleFkBaseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteSplitMultipleFkBaseList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteSplitMultipleFkBaseList(String fn, SubQuery<WhiteSplitMultipleFkBaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(cb.query()); String prpp = keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NEXT_ID", "NEXT_ID", sqpp, "whiteSplitMultipleFkBaseList", rd, vl, prpp, op);
    }
    public abstract String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkBaseCQ sq);
    public abstract String keepNextId_QueryDerivedReferrer_WhiteSplitMultipleFkBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setNextId_IsNull() { regNextId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NEXT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setNextId_IsNotNull() { regNextId(CK_ISNN, DOBJ); }

    protected void regNextId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextId(), "NEXT_ID"); }
    protected abstract ConditionValue xgetCValueNextId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_Equal(String secondCode) {
        doSetSecondCode_Equal(fRES(secondCode));
    }

    protected void doSetSecondCode_Equal(String secondCode) {
        regSecondCode(CK_EQ, secondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_NotEqual(String secondCode) {
        doSetSecondCode_NotEqual(fRES(secondCode));
    }

    protected void doSetSecondCode_NotEqual(String secondCode) {
        regSecondCode(CK_NES, secondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_InScope(Collection<String> secondCodeList) {
        doSetSecondCode_InScope(secondCodeList);
    }

    protected void doSetSecondCode_InScope(Collection<String> secondCodeList) {
        regINS(CK_INS, cTL(secondCodeList), xgetCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_NotInScope(Collection<String> secondCodeList) {
        doSetSecondCode_NotInScope(secondCodeList);
    }

    protected void doSetSecondCode_NotInScope(Collection<String> secondCodeList) {
        regINS(CK_NINS, cTL(secondCodeList), xgetCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)} <br>
     * <pre>e.g. setSecondCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param secondCode The value of secondCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecondCode_LikeSearch(String secondCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecondCode_LikeSearch(secondCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)} <br>
     * <pre>e.g. setSecondCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secondCode The value of secondCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecondCode_LikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secondCode), xgetCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecondCode_NotLikeSearch(String secondCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecondCode_NotLikeSearch(secondCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecondCode_NotLikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secondCode), xgetCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    protected void regSecondCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecondCode(), "SECOND_CODE"); }
    protected abstract ConditionValue xgetCValueSecondCode();

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
    public HpSLCFunction<WhiteSplitMultipleFkNextCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSplitMultipleFkNextCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkNextCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSplitMultipleFkNextCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkNextCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSplitMultipleFkNextCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkNextCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSplitMultipleFkNextCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkNextCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSplitMultipleFkNextCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void query(WhiteSplitMultipleFkNextCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSplitMultipleFkNextCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSplitMultipleFkNextCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkNextCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkNextCQ sq);

    protected WhiteSplitMultipleFkNextCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkNextCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSplitMultipleFkNextCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkNextCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSplitMultipleFkNextCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NEXT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSplitMultipleFkNextCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkNextCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSplitMultipleFkNextCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NEXT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSplitMultipleFkNextCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSplitMultipleFkNextCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSplitMultipleFkNextCQ sq);

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
    protected WhiteSplitMultipleFkNextCB newMyCB() {
        return new WhiteSplitMultipleFkNextCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSplitMultipleFkNextCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
