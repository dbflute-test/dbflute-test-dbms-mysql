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
package org.docksidestage.mysql.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.allcommon.ImplementedInvokerAssistant;
import org.docksidestage.mysql.dbflute.allcommon.ImplementedSqlClauseCreator;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;
import org.docksidestage.mysql.dbflute.cbean.nss.*;

/**
 * The base condition-bean of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "purchase";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param purchaseId (購入ID): PK, ID, NotNull, BIGINT(19), FK to PURCHASE. (NotNull)
     * @return this. (NotNull)
     */
    public PurchaseCB acceptPK(Long purchaseId) {
        assertObjectNotNull("purchaseId", purchaseId);
        BsPurchaseCB cb = this;
        cb.query().setPurchaseId_Equal(purchaseId);
        return (PurchaseCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberId (会員ID): UQ+, IX+, NotNull, INT(10), FK to member. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, INT(10), FK to product. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, DATETIME(19). (NotNull)
     * @return this. (NotNull)
     */
    public PurchaseCB acceptUniqueOf(Integer memberId, Integer productId, java.time.LocalDateTime purchaseDatetime) {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("productId", productId);assertObjectNotNull("purchaseDatetime", purchaseDatetime);
        BsPurchaseCB cb = this;
        cb.query().setMemberId_Equal(memberId);cb.query().setProductId_Equal(productId);cb.query().setPurchaseDatetime_Equal(purchaseDatetime);
        return (PurchaseCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_PurchaseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_PurchaseId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public PurchaseCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public PurchaseCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected PurchaseCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected PurchaseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected PurchaseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        PurchaseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected PurchaseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new PurchaseCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<PurchaseCB> unionCBLambda) {
        final PurchaseCB cb = new PurchaseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PurchaseCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<PurchaseCB> unionCBLambda) {
        final PurchaseCB cb = new PurchaseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PurchaseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberNss _nssMember;
    public MemberNss xdfgetNssMember() {
        if (_nssMember == null) { _nssMember = new MemberNss(null); }
        return _nssMember;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Member()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_Member() {
        assertSetupSelectPurpose("member");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMemberId();
        }
        doSetupSelect(() -> query().queryMember());
        if (_nssMember == null || !_nssMember.hasConditionQuery())
        { _nssMember = new MemberNss(query().queryMember()); }
        return _nssMember;
    }

    protected ProductNss _nssProduct;
    public ProductNss xdfgetNssProduct() {
        if (_nssProduct == null) { _nssProduct = new ProductNss(null); }
        return _nssProduct;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Product()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public ProductNss setupSelect_Product() {
        assertSetupSelectPurpose("product");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductId();
        }
        doSetupSelect(() -> query().queryProduct());
        if (_nssProduct == null || !_nssProduct.hasConditionQuery())
        { _nssProduct = new ProductNss(query().queryProduct()); }
        return _nssProduct;
    }

    protected SummaryProductNss _nssSummaryProduct;
    public SummaryProductNss xdfgetNssSummaryProduct() {
        if (_nssSummaryProduct == null) { _nssSummaryProduct = new SummaryProductNss(null); }
        return _nssSummaryProduct;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (VIEW)SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_SummaryProduct()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getSummaryProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SummaryProductNss setupSelect_SummaryProduct() {
        assertSetupSelectPurpose("summaryProduct");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductId();
        }
        doSetupSelect(() -> query().querySummaryProduct());
        if (_nssSummaryProduct == null || !_nssSummaryProduct.hasConditionQuery())
        { _nssSummaryProduct = new SummaryProductNss(query().querySummaryProduct()); }
        return _nssSummaryProduct;
    }

    /**
     * Set up relation columns to select clause. <br>
     * (VIEW)SUMMARY_WITHDRAWAL by my MEMBER_ID, named 'summaryWithdrawal'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_SummaryWithdrawal()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getSummaryWithdrawal()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_SummaryWithdrawal() {
        assertSetupSelectPurpose("summaryWithdrawal");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMemberId();
        }
        doSetupSelect(() -> query().querySummaryWithdrawal());
    }

    /**
     * Set up relation columns to select clause. <br>
     * (VIEW)WHITE_NO_PK_RELATION by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteNoPkRelation()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getWhiteNoPkRelation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteNoPkRelation() {
        assertSetupSelectPurpose("whiteNoPkRelation");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductId();
        }
        doSetupSelect(() -> query().queryWhiteNoPkRelation());
    }

    protected PurchaseNss _nssPurchaseSelf;
    public PurchaseNss xdfgetNssPurchaseSelf() {
        if (_nssPurchaseSelf == null) { _nssPurchaseSelf = new PurchaseNss(null); }
        return _nssPurchaseSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchaseSelf'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PurchaseSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getPurchaseSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PurchaseNss setupSelect_PurchaseSelf() {
        assertSetupSelectPurpose("purchaseSelf");
        doSetupSelect(() -> query().queryPurchaseSelf());
        if (_nssPurchaseSelf == null || !_nssPurchaseSelf.hasConditionQuery())
        { _nssPurchaseSelf = new PurchaseNss(query().queryPurchaseSelf()); }
        return _nssPurchaseSelf;
    }

    protected MemberAddressNss _nssMemberAddressAsSkipRelation;
    public MemberAddressNss xdfgetNssMemberAddressAsSkipRelation() {
        if (_nssMemberAddressAsSkipRelation == null) { _nssMemberAddressAsSkipRelation = new MemberAddressNss(null); }
        return _nssMemberAddressAsSkipRelation;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsSkipRelation(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getMemberAddressAsSkipRelation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsSkipRelation(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsSkipRelation");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMemberId();
        }
        doSetupSelect(() -> query().queryMemberAddressAsSkipRelation(targetDate));
        if (_nssMemberAddressAsSkipRelation == null || !_nssMemberAddressAsSkipRelation.hasConditionQuery())
        { _nssMemberAddressAsSkipRelation = new MemberAddressNss(query().queryMemberAddressAsSkipRelation(targetDate)); }
        return _nssMemberAddressAsSkipRelation;
    }

    protected WhitePurchaseReferrerNss _nssWhitePurchaseReferrerAsOne;
    public WhitePurchaseReferrerNss xdfgetNssWhitePurchaseReferrerAsOne() {
        if (_nssWhitePurchaseReferrerAsOne == null) { _nssWhitePurchaseReferrerAsOne = new WhitePurchaseReferrerNss(null); }
        return _nssWhitePurchaseReferrerAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhitePurchaseReferrerAsOne(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getWhitePurchaseReferrerAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePurchaseReferrerNss setupSelect_WhitePurchaseReferrerAsOne() {
        assertSetupSelectPurpose("whitePurchaseReferrerAsOne");
        doSetupSelect(() -> query().queryWhitePurchaseReferrerAsOne());
        if (_nssWhitePurchaseReferrerAsOne == null || !_nssWhitePurchaseReferrerAsOne.hasConditionQuery())
        { _nssWhitePurchaseReferrerAsOne = new WhitePurchaseReferrerNss(query().queryWhitePurchaseReferrerAsOne()); }
        return _nssWhitePurchaseReferrerAsOne;
    }

    protected PurchaseNss _nssPurchaseSelfAsOne;
    public PurchaseNss xdfgetNssPurchaseSelfAsOne() {
        if (_nssPurchaseSelfAsOne == null) { _nssPurchaseSelfAsOne = new PurchaseNss(null); }
        return _nssPurchaseSelfAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PurchaseSelfAsOne(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">purchase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getPurchaseSelfAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PurchaseNss setupSelect_PurchaseSelfAsOne() {
        assertSetupSelectPurpose("purchaseSelfAsOne");
        doSetupSelect(() -> query().queryPurchaseSelfAsOne());
        if (_nssPurchaseSelfAsOne == null || !_nssPurchaseSelfAsOne.hasConditionQuery())
        { _nssPurchaseSelfAsOne = new PurchaseNss(query().queryPurchaseSelfAsOne()); }
        return _nssPurchaseSelfAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<PurchaseCQ> {
        protected MemberCB.HpSpecification _member;
        protected ProductCB.HpSpecification _product;
        protected SummaryProductCB.HpSpecification _summaryProduct;
        protected SummaryWithdrawalCB.HpSpecification _summaryWithdrawal;
        protected WhiteNoPkRelationCB.HpSpecification _whiteNoPkRelation;
        protected PurchaseCB.HpSpecification _purchaseSelf;
        protected MemberAddressCB.HpSpecification _memberAddressAsSkipRelation;
        protected WhitePurchaseReferrerCB.HpSpecification _whitePurchaseReferrerAsOne;
        protected PurchaseCB.HpSpecification _purchaseSelfAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<PurchaseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPurchaseId() { return doColumn("PURCHASE_ID"); }
        /**
         * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPurchaseDatetime() { return doColumn("PURCHASE_DATETIME"); }
        /**
         * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPurchaseCount() { return doColumn("PURCHASE_COUNT"); }
        /**
         * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPurchasePrice() { return doColumn("PURCHASE_PRICE"); }
        /**
         * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentCompleteFlg() { return doColumn("PAYMENT_COMPLETE_FLG"); }
        /**
         * REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnPurchaseId(); // PK
            if (qyCall().qy().hasConditionQueryMember()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof ProductCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQuerySummaryProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof SummaryProductCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQuerySummaryWithdrawal()
                    || qyCall().qy().xgetReferrerQuery() instanceof SummaryWithdrawalCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteNoPkRelation()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteNoPkRelationCQ) {
                columnProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMemberAddressAsSkipRelation()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberAddressCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "purchase"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員)MEMBER by my MEMBER_ID, named 'member'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMember() {
            assertRelation("member");
            if (_member == null) {
                _member = new MemberCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMember()
                                    , () -> _qyCall.qy().queryMember())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _member.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMember()
                      , () -> xsyncQyCall().qy().queryMember()));
                }
            }
            return _member;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ProductCB.HpSpecification specifyProduct() {
            assertRelation("product");
            if (_product == null) {
                _product = new ProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryProduct()
                                    , () -> _qyCall.qy().queryProduct())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _product.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProduct()
                      , () -> xsyncQyCall().qy().queryProduct()));
                }
            }
            return _product;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (VIEW)SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SummaryProductCB.HpSpecification specifySummaryProduct() {
            assertRelation("summaryProduct");
            if (_summaryProduct == null) {
                _summaryProduct = new SummaryProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQuerySummaryProduct()
                                    , () -> _qyCall.qy().querySummaryProduct())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _summaryProduct.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySummaryProduct()
                      , () -> xsyncQyCall().qy().querySummaryProduct()));
                }
            }
            return _summaryProduct;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (VIEW)SUMMARY_WITHDRAWAL by my MEMBER_ID, named 'summaryWithdrawal'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SummaryWithdrawalCB.HpSpecification specifySummaryWithdrawal() {
            assertRelation("summaryWithdrawal");
            if (_summaryWithdrawal == null) {
                _summaryWithdrawal = new SummaryWithdrawalCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQuerySummaryWithdrawal()
                                    , () -> _qyCall.qy().querySummaryWithdrawal())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _summaryWithdrawal.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySummaryWithdrawal()
                      , () -> xsyncQyCall().qy().querySummaryWithdrawal()));
                }
            }
            return _summaryWithdrawal;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (VIEW)WHITE_NO_PK_RELATION by my PRODUCT_ID, named 'whiteNoPkRelation'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteNoPkRelationCB.HpSpecification specifyWhiteNoPkRelation() {
            assertRelation("whiteNoPkRelation");
            if (_whiteNoPkRelation == null) {
                _whiteNoPkRelation = new WhiteNoPkRelationCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteNoPkRelation()
                                    , () -> _qyCall.qy().queryWhiteNoPkRelation())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteNoPkRelation.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteNoPkRelation()
                      , () -> xsyncQyCall().qy().queryWhiteNoPkRelation()));
                }
            }
            return _whiteNoPkRelation;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (購入)PURCHASE by my PURCHASE_ID, named 'purchaseSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PurchaseCB.HpSpecification specifyPurchaseSelf() {
            assertRelation("purchaseSelf");
            if (_purchaseSelf == null) {
                _purchaseSelf = new PurchaseCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPurchaseSelf()
                                    , () -> _qyCall.qy().queryPurchaseSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _purchaseSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPurchaseSelf()
                      , () -> xsyncQyCall().qy().queryPurchaseSelf()));
                }
            }
            return _purchaseSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsSkipRelation(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsSkipRelation");
            if (_memberAddressAsSkipRelation == null) {
                _memberAddressAsSkipRelation = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsSkipRelation()
                                    , () -> _qyCall.qy().queryMemberAddressAsSkipRelation(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsSkipRelation.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsSkipRelation()
                      , () -> xsyncQyCall().qy().queryMemberAddressAsSkipRelation(targetDate)));
                }
            }
            return _memberAddressAsSkipRelation;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsSkipRelation() {
            assertRelation("memberAddressAsSkipRelation");
            if (_memberAddressAsSkipRelation == null) {
                _memberAddressAsSkipRelation = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsSkipRelation()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsSkipRelation())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsSkipRelation.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsSkipRelation()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsSkipRelation()));
                }
            }
            return _memberAddressAsSkipRelation;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePurchaseReferrerCB.HpSpecification specifyWhitePurchaseReferrerAsOne() {
            assertRelation("whitePurchaseReferrerAsOne");
            if (_whitePurchaseReferrerAsOne == null) {
                _whitePurchaseReferrerAsOne = new WhitePurchaseReferrerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePurchaseReferrerAsOne()
                                    , () -> _qyCall.qy().queryWhitePurchaseReferrerAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whitePurchaseReferrerAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePurchaseReferrerAsOne()
                      , () -> xsyncQyCall().qy().queryWhitePurchaseReferrerAsOne()));
                }
            }
            return _whitePurchaseReferrerAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PurchaseCB.HpSpecification specifyPurchaseSelfAsOne() {
            assertRelation("purchaseSelfAsOne");
            if (_purchaseSelfAsOne == null) {
                _purchaseSelfAsOne = new PurchaseCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPurchaseSelfAsOne()
                                    , () -> _qyCall.qy().queryPurchaseSelfAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _purchaseSelfAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPurchaseSelfAsOne()
                      , () -> xsyncQyCall().qy().queryPurchaseSelfAsOne()));
                }
            }
            return _purchaseSelfAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from purchase_payment where ...) as FOO_MAX} <br>
         * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(paymentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     paymentCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     paymentCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, PurchasePayment.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<PurchasePaymentCB, PurchaseCQ> derivedPurchasePayment() {
            assertDerived("purchasePaymentList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PurchasePaymentCB> sq, PurchaseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderivePurchasePaymentList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<PurchaseCB, PurchaseCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PurchaseCB> sq, PurchaseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    @Override
    protected <LOCAL_CQ extends ConditionQuery, REFERRER_CB extends ConditionBean> HpSDRFunction<REFERRER_CB, LOCAL_CQ> newSDFFunction(
            ConditionBean baseCB, LOCAL_CQ localCQ
            , HpSDRSetupper<REFERRER_CB, LOCAL_CQ> querySetupper
            , DBMetaProvider dbmetaProvider, DerivedReferrerOptionFactory optionFactory) {
        return new org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<REFERRER_CB, LOCAL_CQ>(baseCB, localCQ, querySetupper, dbmetaProvider, optionFactory);
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public PurchaseCB dreamCruiseCB() {
        PurchaseCB cb = new PurchaseCB();
        cb.xsetupForDreamCruise((PurchaseCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<PurchaseCB> columnQuery(final SpecifyQuery<PurchaseCB> colCBLambda) {
        return xcreateColQyOperandMySql((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected PurchaseCB xcreateColumnQueryCB() {
        PurchaseCB cb = new PurchaseCB();
        cb.xsetupForColumnQuery((PurchaseCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<PurchaseCB> orCBLambda) {
        xorSQ((PurchaseCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<PurchaseCB> andCBLambda) {
        xorSQAP((PurchaseCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final PurchaseCB cb;
        if (mainCB != null) {
            cb = (PurchaseCB)mainCB;
        } else {
            cb = new PurchaseCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return PurchaseCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return PurchaseCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
