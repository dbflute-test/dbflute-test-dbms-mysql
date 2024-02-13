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
 * The abstract condition-query of white_variant_relation_master_foo.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterFooCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterFooCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_foo";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooId The value of masterFooId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterFooId_Equal(Long masterFooId) {
        doSetMasterFooId_Equal(masterFooId);
    }

    protected void doSetMasterFooId_Equal(Long masterFooId) {
        regMasterFooId(CK_EQ, masterFooId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooId The value of masterFooId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterFooId_NotEqual(Long masterFooId) {
        doSetMasterFooId_NotEqual(masterFooId);
    }

    protected void doSetMasterFooId_NotEqual(Long masterFooId) {
        regMasterFooId(CK_NES, masterFooId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooId The value of masterFooId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterFooId_GreaterThan(Long masterFooId) {
        regMasterFooId(CK_GT, masterFooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooId The value of masterFooId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterFooId_LessThan(Long masterFooId) {
        regMasterFooId(CK_LT, masterFooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooId The value of masterFooId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterFooId_GreaterEqual(Long masterFooId) {
        regMasterFooId(CK_GE, masterFooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooId The value of masterFooId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterFooId_LessEqual(Long masterFooId) {
        regMasterFooId(CK_LE, masterFooId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param minNumber The min number of masterFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of masterFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMasterFooId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMasterFooId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param minNumber The min number of masterFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of masterFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterFooId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMasterFooId(), "MASTER_FOO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooIdList The collection of masterFooId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterFooId_InScope(Collection<Long> masterFooIdList) {
        doSetMasterFooId_InScope(masterFooIdList);
    }

    protected void doSetMasterFooId_InScope(Collection<Long> masterFooIdList) {
        regINS(CK_INS, cTL(masterFooIdList), xgetCValueMasterFooId(), "MASTER_FOO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     * @param masterFooIdList The collection of masterFooId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterFooId_NotInScope(Collection<Long> masterFooIdList) {
        doSetMasterFooId_NotInScope(masterFooIdList);
    }

    protected void doSetMasterFooId_NotInScope(Collection<Long> masterFooIdList) {
        regINS(CK_NINS, cTL(masterFooIdList), xgetCValueMasterFooId(), "MASTER_FOO_ID");
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query());
        registerExistsReferrer(cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterFooId_ExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select VARIANT_MASTER_ID from white_variant_relation_referrer where ...)} <br>
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteVariantRelationReferrerAsVariant</span>(referrerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referrerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteVariantRelationReferrerAsVariant(SubQuery<WhiteVariantRelationReferrerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query());
        registerNotExistsReferrer(cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList");
    }
    public abstract String keepMasterFooId_NotExistsReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

    public void xsderiveWhiteVariantRelationReferrerAsVariantList(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", pp, "whiteVariantRelationReferrerAsVariantList", al, op);
    }
    public abstract String keepMasterFooId_SpecifyDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);

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
        lockCall(() -> sq.query(cb)); String sqpp = keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(cb.query()); String prpp = keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MASTER_FOO_ID", "VARIANT_MASTER_ID", sqpp, "whiteVariantRelationReferrerAsVariantList", rd, vl, prpp, op);
    }
    public abstract String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationReferrerCQ sq);
    public abstract String keepMasterFooId_QueryDerivedReferrer_WhiteVariantRelationReferrerAsVariantListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     */
    public void setMasterFooId_IsNull() { regMasterFooId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER}
     */
    public void setMasterFooId_IsNotNull() { regMasterFooId(CK_ISNN, DOBJ); }

    protected void regMasterFooId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterFooId(), "MASTER_FOO_ID"); }
    protected abstract ConditionValue xgetCValueMasterFooId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterFooName_Equal(String masterFooName) {
        doSetMasterFooName_Equal(fRES(masterFooName));
    }

    protected void doSetMasterFooName_Equal(String masterFooName) {
        regMasterFooName(CK_EQ, masterFooName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterFooName_NotEqual(String masterFooName) {
        doSetMasterFooName_NotEqual(fRES(masterFooName));
    }

    protected void doSetMasterFooName_NotEqual(String masterFooName) {
        regMasterFooName(CK_NES, masterFooName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooNameList The collection of masterFooName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterFooName_InScope(Collection<String> masterFooNameList) {
        doSetMasterFooName_InScope(masterFooNameList);
    }

    protected void doSetMasterFooName_InScope(Collection<String> masterFooNameList) {
        regINS(CK_INS, cTL(masterFooNameList), xgetCValueMasterFooName(), "MASTER_FOO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooNameList The collection of masterFooName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterFooName_NotInScope(Collection<String> masterFooNameList) {
        doSetMasterFooName_NotInScope(masterFooNameList);
    }

    protected void doSetMasterFooName_NotInScope(Collection<String> masterFooNameList) {
        regINS(CK_NINS, cTL(masterFooNameList), xgetCValueMasterFooName(), "MASTER_FOO_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterFooName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param masterFooName The value of masterFooName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterFooName_LikeSearch(String masterFooName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterFooName_LikeSearch(masterFooName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterFooName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterFooName The value of masterFooName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterFooName_LikeSearch(String masterFooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterFooName), xgetCValueMasterFooName(), "MASTER_FOO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterFooName_NotLikeSearch(String masterFooName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterFooName_NotLikeSearch(masterFooName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_FOO_NAME: {NotNull, VARCHAR(200)}
     * @param masterFooName The value of masterFooName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterFooName_NotLikeSearch(String masterFooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterFooName), xgetCValueMasterFooName(), "MASTER_FOO_NAME", likeSearchOption);
    }

    protected void regMasterFooName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterFooName(), "MASTER_FOO_NAME"); }
    protected abstract ConditionValue xgetCValueMasterFooName();

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
    public HpSLCFunction<WhiteVariantRelationMasterFooCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteVariantRelationMasterFooCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterFooCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteVariantRelationMasterFooCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterFooCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteVariantRelationMasterFooCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterFooCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteVariantRelationMasterFooCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterFooCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteVariantRelationMasterFooCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void query(WhiteVariantRelationMasterFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteVariantRelationMasterFooCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteVariantRelationMasterFooCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterFooCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterFooCQ sq);

    protected WhiteVariantRelationMasterFooCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterFooCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationMasterFooCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterFooCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterFooCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MASTER_FOO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterFooCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterFooCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationMasterFooCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MASTER_FOO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterFooCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterFooCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterFooCQ sq);

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
    protected WhiteVariantRelationMasterFooCB newMyCB() {
        return new WhiteVariantRelationMasterFooCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationMasterFooCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
