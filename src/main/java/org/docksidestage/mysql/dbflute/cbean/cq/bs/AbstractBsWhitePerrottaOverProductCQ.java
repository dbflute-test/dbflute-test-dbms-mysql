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
 * The abstract condition-query of white_perrotta_over_product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_perrotta_over_product";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from white_perrotta_over_member where ...)} <br>
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhitePerrottaOverMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhitePerrottaOverMemberList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverMember(SubQuery<WhitePerrottaOverMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepProductId_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NEXT_PRODUCT_ID from white_perrotta_over_trace where ...)} <br>
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhitePerrottaOverTraceByNextProductId</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     traceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhitePerrottaOverTraceByNextProductIdList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverTraceByNextProductId(SubQuery<WhitePerrottaOverTraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList");
    }
    public abstract String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PREVIOUS_PRODUCT_ID from white_perrotta_over_trace where ...)} <br>
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhitePerrottaOverTraceByPreviousProductId</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     traceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhitePerrottaOverTraceByPreviousProductIdList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverTraceByPreviousProductId(SubQuery<WhitePerrottaOverTraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList");
    }
    public abstract String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from white_perrotta_over_member where ...)} <br>
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhitePerrottaOverMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WhitePerrottaOverMemberList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverMember(SubQuery<WhitePerrottaOverMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NEXT_PRODUCT_ID from white_perrotta_over_trace where ...)} <br>
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhitePerrottaOverTraceByNextProductId</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     traceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverTraceByNextProductId(SubQuery<WhitePerrottaOverTraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PREVIOUS_PRODUCT_ID from white_perrotta_over_trace where ...)} <br>
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhitePerrottaOverTraceByPreviousProductId</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     traceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverTraceByPreviousProductId(SubQuery<WhitePerrottaOverTraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList");
    }
    public abstract String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    public void xsderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "whitePerrottaOverMemberList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    public void xsderiveWhitePerrottaOverTraceByNextProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", pp, "whitePerrottaOverTraceByNextProductIdList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);

    public void xsderiveWhitePerrottaOverTraceByPreviousProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", pp, "whitePerrottaOverTraceByPreviousProductIdList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_member where ...)} <br>
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhitePerrottaOverMember()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     memberCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverMemberCB> derivedWhitePerrottaOverMember() {
        return xcreateQDRFunctionWhitePerrottaOverMemberList();
    }
    protected HpQDRFunction<WhitePerrottaOverMemberCB> xcreateQDRFunctionWhitePerrottaOverMemberList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhitePerrottaOverMemberList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "whitePerrottaOverMemberList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_trace where ...)} <br>
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhitePerrottaOverTraceByNextProductId()</span>.<span style="color: #CC4747">max</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     traceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     traceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverTraceCB> derivedWhitePerrottaOverTraceByNextProductId() {
        return xcreateQDRFunctionWhitePerrottaOverTraceByNextProductIdList();
    }
    protected HpQDRFunction<WhitePerrottaOverTraceCB> xcreateQDRFunctionWhitePerrottaOverTraceByNextProductIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhitePerrottaOverTraceByNextProductIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhitePerrottaOverTraceByNextProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "NEXT_PRODUCT_ID", sqpp, "whitePerrottaOverTraceByNextProductIdList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_trace where ...)} <br>
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhitePerrottaOverTraceByPreviousProductId()</span>.<span style="color: #CC4747">max</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     traceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     traceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverTraceCB> derivedWhitePerrottaOverTraceByPreviousProductId() {
        return xcreateQDRFunctionWhitePerrottaOverTraceByPreviousProductIdList();
    }
    protected HpQDRFunction<WhitePerrottaOverTraceCB> xcreateQDRFunctionWhitePerrottaOverTraceByPreviousProductIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhitePerrottaOverTraceByPreviousProductIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhitePerrottaOverTraceByPreviousProductIdList(String fn, SubQuery<WhitePerrottaOverTraceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PREVIOUS_PRODUCT_ID", sqpp, "whitePerrottaOverTraceByPreviousProductIdList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_Equal(String productName) {
        doSetProductName_Equal(fRES(productName));
    }

    protected void doSetProductName_Equal(String productName) {
        regProductName(CK_EQ, productName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotEqual(String productName) {
        doSetProductName_NotEqual(fRES(productName));
    }

    protected void doSetProductName_NotEqual(String productName) {
        regProductName(CK_NES, productName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productNameList The collection of productName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_InScope(Collection<String> productNameList) {
        doSetProductName_InScope(productNameList);
    }

    protected void doSetProductName_InScope(Collection<String> productNameList) {
        regINS(CK_INS, cTL(productNameList), xgetCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productNameList The collection of productName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotInScope(Collection<String> productNameList) {
        doSetProductName_NotInScope(productNameList);
    }

    protected void doSetProductName_NotInScope(Collection<String> productNameList) {
        regINS(CK_NINS, cTL(productNameList), xgetCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setProductName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productName The value of productName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductName_LikeSearch(productName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setProductName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productName The value of productName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productName), xgetCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductName_NotLikeSearch(productName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), xgetCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    protected void regProductName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductName(), "PRODUCT_NAME"); }
    protected abstract ConditionValue xgetCValueProductName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_Equal(String productNestedCode) {
        doSetProductNestedCode_Equal(fRES(productNestedCode));
    }

    protected void doSetProductNestedCode_Equal(String productNestedCode) {
        regProductNestedCode(CK_EQ, productNestedCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_NotEqual(String productNestedCode) {
        doSetProductNestedCode_NotEqual(fRES(productNestedCode));
    }

    protected void doSetProductNestedCode_NotEqual(String productNestedCode) {
        regProductNestedCode(CK_NES, productNestedCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCodeList The collection of productNestedCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_InScope(Collection<String> productNestedCodeList) {
        doSetProductNestedCode_InScope(productNestedCodeList);
    }

    protected void doSetProductNestedCode_InScope(Collection<String> productNestedCodeList) {
        regINS(CK_INS, cTL(productNestedCodeList), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCodeList The collection of productNestedCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductNestedCode_NotInScope(Collection<String> productNestedCodeList) {
        doSetProductNestedCode_NotInScope(productNestedCodeList);
    }

    protected void doSetProductNestedCode_NotInScope(Collection<String> productNestedCodeList) {
        regINS(CK_NINS, cTL(productNestedCodeList), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br>
     * <pre>e.g. setProductNestedCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productNestedCode The value of productNestedCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductNestedCode_LikeSearch(String productNestedCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductNestedCode_LikeSearch(productNestedCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br>
     * <pre>e.g. setProductNestedCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNestedCode The value of productNestedCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNestedCode_LikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNestedCode), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductNestedCode_NotLikeSearch(String productNestedCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductNestedCode_NotLikeSearch(productNestedCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @param productNestedCode The value of productNestedCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNestedCode_NotLikeSearch(String productNestedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNestedCode), xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE", likeSearchOption);
    }

    protected void regProductNestedCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNestedCode(), "PRODUCT_NESTED_CODE"); }
    protected abstract ConditionValue xgetCValueProductNestedCode();

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
    public HpSLCFunction<WhitePerrottaOverProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhitePerrottaOverProductCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhitePerrottaOverProductCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhitePerrottaOverProductCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhitePerrottaOverProductCB.class);
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
    public HpSLCFunction<WhitePerrottaOverProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhitePerrottaOverProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void query(WhitePerrottaOverProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePerrottaOverProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhitePerrottaOverProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverProductCQ sq);

    protected WhitePerrottaOverProductCB xcreateScalarConditionCB() {
        WhitePerrottaOverProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverProductCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverProductCQ sq);

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
    protected WhitePerrottaOverProductCB newMyCB() {
        return new WhitePerrottaOverProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
