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
 * The base condition-bean of white_perrotta_over_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverProductCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverProductCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
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
        return "white_perrotta_over_product";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param productId : PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE. (NotNull)
     * @return this. (NotNull)
     */
    public WhitePerrottaOverProductCB acceptPK(Long productId) {
        assertObjectNotNull("productId", productId);
        BsWhitePerrottaOverProductCB cb = this;
        cb.query().setProductId_Equal(productId);
        return (WhitePerrottaOverProductCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ProductId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ProductId_Desc();
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
    public WhitePerrottaOverProductCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public WhitePerrottaOverProductCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhitePerrottaOverProductCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhitePerrottaOverProductCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhitePerrottaOverProductCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhitePerrottaOverProductCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhitePerrottaOverProductCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhitePerrottaOverProductCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<WhitePerrottaOverProductCB> unionCBLambda) {
        final WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhitePerrottaOverProductCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<WhitePerrottaOverProductCB> unionCBLambda) {
        final WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhitePerrottaOverProductCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhitePerrottaOverProductNested()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whitePerrottaOverProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whitePerrottaOverProduct</span>.<span style="color: #CC4747">getWhitePerrottaOverProductNested()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhitePerrottaOverProductNested() {
        assertSetupSelectPurpose("whitePerrottaOverProductNested");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductNestedCode();
        }
        doSetupSelect(() -> query().queryWhitePerrottaOverProductNested());
    }

    protected WhitePerrottaOverTraceNss _nssWhitePerrottaOverTraceAsPerrotta;
    public WhitePerrottaOverTraceNss xdfgetNssWhitePerrottaOverTraceAsPerrotta() {
        if (_nssWhitePerrottaOverTraceAsPerrotta == null) { _nssWhitePerrottaOverTraceAsPerrotta = new WhitePerrottaOverTraceNss(null); }
        return _nssWhitePerrottaOverTraceAsPerrotta;
    }
    /**
     * Set up relation columns to select clause. <br>
     * white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhitePerrottaOverTraceAsPerrotta()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whitePerrottaOverProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whitePerrottaOverProduct</span>.<span style="color: #CC4747">getWhitePerrottaOverTraceAsPerrotta()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePerrottaOverTraceNss setupSelect_WhitePerrottaOverTraceAsPerrotta() {
        assertSetupSelectPurpose("whitePerrottaOverTraceAsPerrotta");
        doSetupSelect(() -> query().queryWhitePerrottaOverTraceAsPerrotta());
        if (_nssWhitePerrottaOverTraceAsPerrotta == null || !_nssWhitePerrottaOverTraceAsPerrotta.hasConditionQuery())
        { _nssWhitePerrottaOverTraceAsPerrotta = new WhitePerrottaOverTraceNss(query().queryWhitePerrottaOverTraceAsPerrotta()); }
        return _nssWhitePerrottaOverTraceAsPerrotta;
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

    public static class HpSpecification extends HpAbstractSpecification<WhitePerrottaOverProductCQ> {
        protected WhitePerrottaOverProductNestedCB.HpSpecification _whitePerrottaOverProductNested;
        protected WhitePerrottaOverTraceCB.HpSpecification _whitePerrottaOverTraceAsPerrotta;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhitePerrottaOverProductCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * PRODUCT_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductName() { return doColumn("PRODUCT_NAME"); }
        /**
         * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductNestedCode() { return doColumn("PRODUCT_NESTED_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnProductId(); // PK
            if (qyCall().qy().hasConditionQueryWhitePerrottaOverProductNested()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhitePerrottaOverProductNestedCQ) {
                columnProductNestedCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_perrotta_over_product"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePerrottaOverProductNestedCB.HpSpecification specifyWhitePerrottaOverProductNested() {
            assertRelation("whitePerrottaOverProductNested");
            if (_whitePerrottaOverProductNested == null) {
                _whitePerrottaOverProductNested = new WhitePerrottaOverProductNestedCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePerrottaOverProductNested()
                                    , () -> _qyCall.qy().queryWhitePerrottaOverProductNested())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whitePerrottaOverProductNested.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePerrottaOverProductNested()
                      , () -> xsyncQyCall().qy().queryWhitePerrottaOverProductNested()));
                }
            }
            return _whitePerrottaOverProductNested;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePerrottaOverTraceCB.HpSpecification specifyWhitePerrottaOverTraceAsPerrotta() {
            assertRelation("whitePerrottaOverTraceAsPerrotta");
            if (_whitePerrottaOverTraceAsPerrotta == null) {
                _whitePerrottaOverTraceAsPerrotta = new WhitePerrottaOverTraceCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePerrottaOverTraceAsPerrotta()
                                    , () -> _qyCall.qy().queryWhitePerrottaOverTraceAsPerrotta())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whitePerrottaOverTraceAsPerrotta.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePerrottaOverTraceAsPerrotta()
                      , () -> xsyncQyCall().qy().queryWhitePerrottaOverTraceAsPerrotta()));
                }
            }
            return _whitePerrottaOverTraceAsPerrotta;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from white_perrotta_over_member where ...) as FOO_MAX} <br>
         * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     memberCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     memberCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhitePerrottaOverMember.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhitePerrottaOverMemberCB, WhitePerrottaOverProductCQ> derivedWhitePerrottaOverMember() {
            assertDerived("whitePerrottaOverMemberList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhitePerrottaOverMemberCB> sq, WhitePerrottaOverProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWhitePerrottaOverMemberList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from white_perrotta_over_trace where ...) as FOO_MAX} <br>
         * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     traceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     traceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhitePerrottaOverTrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhitePerrottaOverTraceCB, WhitePerrottaOverProductCQ> derivedWhitePerrottaOverTraceByNextProductId() {
            assertDerived("whitePerrottaOverTraceByNextProductIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhitePerrottaOverTraceCB> sq, WhitePerrottaOverProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWhitePerrottaOverTraceByNextProductIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from white_perrotta_over_trace where ...) as FOO_MAX} <br>
         * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(traceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     traceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     traceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhitePerrottaOverTrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhitePerrottaOverTraceCB, WhitePerrottaOverProductCQ> derivedWhitePerrottaOverTraceByPreviousProductId() {
            assertDerived("whitePerrottaOverTraceByPreviousProductIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhitePerrottaOverTraceCB> sq, WhitePerrottaOverProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWhitePerrottaOverTraceByPreviousProductIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhitePerrottaOverProductCB, WhitePerrottaOverProductCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhitePerrottaOverProductCB> sq, WhitePerrottaOverProductCQ cq, String al, DerivedReferrerOption op)
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
    public WhitePerrottaOverProductCB dreamCruiseCB() {
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
        cb.xsetupForDreamCruise((WhitePerrottaOverProductCB) this);
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
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhitePerrottaOverProductCB> columnQuery(final SpecifyQuery<WhitePerrottaOverProductCB> colCBLambda) {
        return xcreateColQyOperandMySql((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected WhitePerrottaOverProductCB xcreateColumnQueryCB() {
        WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
        cb.xsetupForColumnQuery((WhitePerrottaOverProductCB)this);
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
    public void orScopeQuery(OrQuery<WhitePerrottaOverProductCB> orCBLambda) {
        xorSQ((WhitePerrottaOverProductCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<WhitePerrottaOverProductCB> andCBLambda) {
        xorSQAP((WhitePerrottaOverProductCB)this, andCBLambda);
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
        final WhitePerrottaOverProductCB cb;
        if (mainCB != null) {
            cb = (WhitePerrottaOverProductCB)mainCB;
        } else {
            cb = new WhitePerrottaOverProductCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhitePerrottaOverProductCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhitePerrottaOverProductCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
