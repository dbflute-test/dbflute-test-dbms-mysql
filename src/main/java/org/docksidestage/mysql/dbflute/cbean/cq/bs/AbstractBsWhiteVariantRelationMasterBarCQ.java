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
 * The abstract condition-query of white_variant_relation_master_bar.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterBarCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterBarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_bar";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterBarId_Equal(Long masterBarId) {
        doSetMasterBarId_Equal(masterBarId);
    }

    protected void doSetMasterBarId_Equal(Long masterBarId) {
        regMasterBarId(CK_EQ, masterBarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterBarId_GreaterThan(Long masterBarId) {
        regMasterBarId(CK_GT, masterBarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterBarId_LessThan(Long masterBarId) {
        regMasterBarId(CK_LT, masterBarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterBarId_GreaterEqual(Long masterBarId) {
        regMasterBarId(CK_GE, masterBarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarId The value of masterBarId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterBarId_LessEqual(Long masterBarId) {
        regMasterBarId(CK_LE, masterBarId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterBarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of masterBarId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMasterBarId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMasterBarId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterBarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of masterBarId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterBarId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMasterBarId(), "MASTER_BAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarIdList The collection of masterBarId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarId_InScope(Collection<Long> masterBarIdList) {
        doSetMasterBarId_InScope(masterBarIdList);
    }

    protected void doSetMasterBarId_InScope(Collection<Long> masterBarIdList) {
        regINS(CK_INS, cTL(masterBarIdList), xgetCValueMasterBarId(), "MASTER_BAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     * @param masterBarIdList The collection of masterBarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarId_NotInScope(Collection<Long> masterBarIdList) {
        doSetMasterBarId_NotInScope(masterBarIdList);
    }

    protected void doSetMasterBarId_NotInScope(Collection<Long> masterBarIdList) {
        regINS(CK_NINS, cTL(masterBarIdList), xgetCValueMasterBarId(), "MASTER_BAR_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br>
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteVariantRelationReferrerAsVariant</span>(referrerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referrerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteVariantRelationReferrerAsVariantList for 'exists'. (NotNull)
     */
    public void existsWhiteVariantRelationReferrerAsVariant(SubQuery<WhiteVariantRelationReferrerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query());
        registerExistsReferrer(cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterBarId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br>
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteVariantRelationReferrerAsVariant</span>(referrerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referrerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteVariantRelationReferrerAsVariant(SubQuery<WhiteVariantRelationReferrerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query());
        registerNotExistsReferrer(cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterBarId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    public void xsderiveWhiteVariantRelationReferrerAsVariantList(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList", al, op);
    }
    public abstract String keepMasterBarId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_variant_relation_referrer where ...)} <br>
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteVariantRelationReferrerAsVariant()</span>.<span style="color: #CC4747">max</span>(referrerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referrerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     referrerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationReferrerCB> derivedWhiteVariantRelationReferrerAsVariant() {
        return xcreateQDRFunctionWhiteVariantRelationReferrerAsVariantList();
    }
    protected HpQDRFunction<WhiteVariantRelationReferrerCB> xcreateQDRFunctionWhiteVariantRelationReferrerAsVariantList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteVariantRelationReferrerAsVariantList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteVariantRelationReferrerAsVariantList(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); String prpp = keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MASTER_BAR_ID", "VARIANT_MASTER_ID", sqpp, "whiteVariantRelationReferrerAsVariantList", rd, vl, prpp, op);
    }
    public abstract String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);
    public abstract String keepMasterBarId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterBarId_IsNull() { regMasterBarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MASTER_BAR_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterBarId_IsNotNull() { regMasterBarId(CK_ISNN, DOBJ); }

    protected void regMasterBarId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterBarId(), "MASTER_BAR_ID"); }
    protected abstract ConditionValue xgetCValueMasterBarId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_Equal(String masterBarName) {
        doSetMasterBarName_Equal(fRES(masterBarName));
    }

    protected void doSetMasterBarName_Equal(String masterBarName) {
        regMasterBarName(CK_EQ, masterBarName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_NotEqual(String masterBarName) {
        doSetMasterBarName_NotEqual(fRES(masterBarName));
    }

    protected void doSetMasterBarName_NotEqual(String masterBarName) {
        regMasterBarName(CK_NES, masterBarName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarNameList The collection of masterBarName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_InScope(Collection<String> masterBarNameList) {
        doSetMasterBarName_InScope(masterBarNameList);
    }

    protected void doSetMasterBarName_InScope(Collection<String> masterBarNameList) {
        regINS(CK_INS, cTL(masterBarNameList), xgetCValueMasterBarName(), "MASTER_BAR_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarNameList The collection of masterBarName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMasterBarName_NotInScope(Collection<String> masterBarNameList) {
        doSetMasterBarName_NotInScope(masterBarNameList);
    }

    protected void doSetMasterBarName_NotInScope(Collection<String> masterBarNameList) {
        regINS(CK_NINS, cTL(masterBarNameList), xgetCValueMasterBarName(), "MASTER_BAR_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterBarName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param masterBarName The value of masterBarName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterBarName_LikeSearch(String masterBarName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterBarName_LikeSearch(masterBarName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterBarName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterBarName The value of masterBarName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterBarName_LikeSearch(String masterBarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterBarName), xgetCValueMasterBarName(), "MASTER_BAR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterBarName_NotLikeSearch(String masterBarName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterBarName_NotLikeSearch(masterBarName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_BAR_NAME: {NotNull, VARCHAR(200)}
     * @param masterBarName The value of masterBarName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterBarName_NotLikeSearch(String masterBarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterBarName), xgetCValueMasterBarName(), "MASTER_BAR_NAME", likeSearchOption);
    }

    protected void regMasterBarName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterBarName(), "MASTER_BAR_NAME"); }
    protected abstract ConditionValue xgetCValueMasterBarName();

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
    public HpSLCFunction<WhiteVariantRelationMasterBarCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteVariantRelationMasterBarCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterBarCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteVariantRelationMasterBarCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteVariantRelationMasterBarCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteVariantRelationMasterBarCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteVariantRelationMasterBarCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteVariantRelationMasterBarCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterBarCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteVariantRelationMasterBarCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void query(WhiteVariantRelationMasterBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteVariantRelationMasterBarCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteVariantRelationMasterBarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterBarCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterBarCQ sq);

    protected WhiteVariantRelationMasterBarCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterBarCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationMasterBarCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterBarCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterBarCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MASTER_BAR_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterBarCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterBarCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationMasterBarCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MASTER_BAR_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterBarCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterBarCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterBarCQ sq);

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
    protected WhiteVariantRelationMasterBarCB newMyCB() {
        return new WhiteVariantRelationMasterBarCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationMasterBarCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
