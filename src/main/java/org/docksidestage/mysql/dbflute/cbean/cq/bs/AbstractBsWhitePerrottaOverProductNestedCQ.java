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
 * The abstract condition-query of white_perrotta_over_product_nested.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverProductNestedCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverProductNestedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_perrotta_over_product_nested";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCode The value of productNestedCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedCode_Equal(String productNestedCode) {
        doSetProductNestedCode_Equal(fRES(productNestedCode));
    }

    protected void doSetProductNestedCode_Equal(String productNestedCode) {
        regProductNestedCode(CK_EQ, productNestedCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCode The value of productNestedCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedCode_NotEqual(String productNestedCode) {
        doSetProductNestedCode_NotEqual(fRES(productNestedCode));
    }

    protected void doSetProductNestedCode_NotEqual(String productNestedCode) {
        regProductNestedCode(CK_NES, productNestedCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCodeList The collection of productNestedCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedCode_InScope(Collection<String> productNestedCodeList) {
        doSetProductNestedCode_InScope(productNestedCodeList);
    }

    protected void doSetProductNestedCode_InScope(Collection<String> productNestedCodeList) {
        regINS(CK_INS, cTL(productNestedCodeList), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCodeList The collection of productNestedCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedCode_NotInScope(Collection<String> productNestedCodeList) {
        doSetProductNestedCode_NotInScope(productNestedCodeList);
    }

    protected void doSetProductNestedCode_NotInScope(Collection<String> productNestedCodeList) {
        regINS(CK_NINS, cTL(productNestedCodeList), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setProductNestedCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productNestedCode The value of productNestedCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductNestedCode_LikeSearch(String productNestedCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductNestedCode_LikeSearch(productNestedCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setProductNestedCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNestedCode The value of productNestedCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNestedCode_LikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNestedCode), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCode The value of productNestedCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductNestedCode_NotLikeSearch(String productNestedCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductNestedCode_NotLikeSearch(productNestedCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @param productNestedCode The value of productNestedCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNestedCode_NotLikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNestedCode), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_NESTED_CODE from white_perrotta_over_product where ...)} <br>
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhitePerrottaOverProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhitePerrottaOverProductList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverProduct(SubQuery<WhitePerrottaOverProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductNestedCode_ExistsReferrer_WhitePerrottaOverProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList");
    }
    public abstract String keepProductNestedCode_ExistsReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_NESTED_CODE from white_perrotta_over_product where ...)} <br>
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhitePerrottaOverProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverProduct(SubQuery<WhitePerrottaOverProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList");
    }
    public abstract String keepProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    public void xsderiveWhitePerrottaOverProductList(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", pp, "whitePerrottaOverProductList", al, op);
    }
    public abstract String keepProductNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_product where ...)} <br>
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhitePerrottaOverProduct()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverProductCB> derivedWhitePerrottaOverProduct() {
        return xcreateQDRFunctionWhitePerrottaOverProductList();
    }
    protected HpQDRFunction<WhitePerrottaOverProductCB> xcreateQDRFunctionWhitePerrottaOverProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhitePerrottaOverProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhitePerrottaOverProductList(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList(cb.query()); String prpp = keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", sqpp, "whitePerrottaOverProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq);
    public abstract String keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductNestedCode_IsNull() { regProductNestedCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductNestedCode_IsNotNull() { regProductNestedCode(CK_ISNN, DOBJ); }

    protected void regProductNestedCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE"); }
    protected abstract ConditionValue xgetCValueProductNestedCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)}
     * @param productNestedName The value of productNestedName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedName_Equal(String productNestedName) {
        doSetProductNestedName_Equal(fRES(productNestedName));
    }

    protected void doSetProductNestedName_Equal(String productNestedName) {
        regProductNestedName(CK_EQ, productNestedName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)}
     * @param productNestedName The value of productNestedName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedName_NotEqual(String productNestedName) {
        doSetProductNestedName_NotEqual(fRES(productNestedName));
    }

    protected void doSetProductNestedName_NotEqual(String productNestedName) {
        regProductNestedName(CK_NES, productNestedName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)}
     * @param productNestedNameList The collection of productNestedName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedName_InScope(Collection<String> productNestedNameList) {
        doSetProductNestedName_InScope(productNestedNameList);
    }

    protected void doSetProductNestedName_InScope(Collection<String> productNestedNameList) {
        regINS(CK_INS, cTL(productNestedNameList), xgetCValueProductNestedName(), "PRODUCT_NESTED_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)}
     * @param productNestedNameList The collection of productNestedName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNestedName_NotInScope(Collection<String> productNestedNameList) {
        doSetProductNestedName_NotInScope(productNestedNameList);
    }

    protected void doSetProductNestedName_NotInScope(Collection<String> productNestedNameList) {
        regINS(CK_NINS, cTL(productNestedNameList), xgetCValueProductNestedName(), "PRODUCT_NESTED_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setProductNestedName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productNestedName The value of productNestedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductNestedName_LikeSearch(String productNestedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductNestedName_LikeSearch(productNestedName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setProductNestedName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNestedName The value of productNestedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNestedName_LikeSearch(String productNestedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNestedName), xgetCValueProductNestedName(), "PRODUCT_NESTED_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)}
     * @param productNestedName The value of productNestedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductNestedName_NotLikeSearch(String productNestedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductNestedName_NotLikeSearch(productNestedName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(50)}
     * @param productNestedName The value of productNestedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNestedName_NotLikeSearch(String productNestedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNestedName), xgetCValueProductNestedName(), "PRODUCT_NESTED_NAME", likeSearchOption);
    }

    protected void regProductNestedName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNestedName(), "PRODUCT_NESTED_NAME"); }
    protected abstract ConditionValue xgetCValueProductNestedName();

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
    public HpSLCFunction<WhitePerrottaOverProductNestedCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhitePerrottaOverProductNestedCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductNestedCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhitePerrottaOverProductNestedCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductNestedCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhitePerrottaOverProductNestedCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductNestedCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhitePerrottaOverProductNestedCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductNestedCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhitePerrottaOverProductNestedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void query(WhitePerrottaOverProductNestedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePerrottaOverProductNestedCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhitePerrottaOverProductNestedCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductNestedCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverProductNestedCQ sq);

    protected WhitePerrottaOverProductNestedCB xcreateScalarConditionCB() {
        WhitePerrottaOverProductNestedCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverProductNestedCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverProductNestedCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverProductNestedCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_NESTED_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverProductNestedCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverProductNestedCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverProductNestedCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_NESTED_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverProductNestedCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverProductNestedCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverProductNestedCQ sq);

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
    protected WhitePerrottaOverProductNestedCB newMyCB() {
        return new WhitePerrottaOverProductNestedCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverProductNestedCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
