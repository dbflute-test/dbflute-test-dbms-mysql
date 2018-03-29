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
 * The base condition-bean of white_perrotta_over_trace.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverTraceCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverTraceCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverTraceCB() {
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
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
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
        return "white_perrotta_over_trace";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param traceId : PK, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public WhitePerrottaOverTraceCB acceptPK(Long traceId) {
        assertObjectNotNull("traceId", traceId);
        BsWhitePerrottaOverTraceCB cb = this;
        cb.query().setTraceId_Equal(traceId);
        return (WhitePerrottaOverTraceCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param previousProductId : UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @param nextProductId : +UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @return this. (NotNull)
     */
    public WhitePerrottaOverTraceCB acceptUniqueOf(Long previousProductId, Long nextProductId) {
        assertObjectNotNull("previousProductId", previousProductId);assertObjectNotNull("nextProductId", nextProductId);
        BsWhitePerrottaOverTraceCB cb = this;
        cb.query().setPreviousProductId_Equal(previousProductId);cb.query().setNextProductId_Equal(nextProductId);
        return (WhitePerrottaOverTraceCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TraceId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TraceId_Desc();
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
    public WhitePerrottaOverTraceCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public WhitePerrottaOverTraceCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhitePerrottaOverTraceCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhitePerrottaOverTraceCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhitePerrottaOverTraceCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhitePerrottaOverTraceCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhitePerrottaOverTraceCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhitePerrottaOverTraceCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<WhitePerrottaOverTraceCB> unionCBLambda) {
        final WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhitePerrottaOverTraceCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<WhitePerrottaOverTraceCB> unionCBLambda) {
        final WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhitePerrottaOverTraceCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhitePerrottaOverProductNss _nssWhitePerrottaOverProductByNextProductId;
    public WhitePerrottaOverProductNss xdfgetNssWhitePerrottaOverProductByNextProductId() {
        if (_nssWhitePerrottaOverProductByNextProductId == null) { _nssWhitePerrottaOverProductByNextProductId = new WhitePerrottaOverProductNss(null); }
        return _nssWhitePerrottaOverProductByNextProductId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhitePerrottaOverProductByNextProductId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whitePerrottaOverTrace</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whitePerrottaOverTrace</span>.<span style="color: #CC4747">getWhitePerrottaOverProductByNextProductId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePerrottaOverProductNss setupSelect_WhitePerrottaOverProductByNextProductId() {
        assertSetupSelectPurpose("whitePerrottaOverProductByNextProductId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnNextProductId();
        }
        doSetupSelect(() -> query().queryWhitePerrottaOverProductByNextProductId());
        if (_nssWhitePerrottaOverProductByNextProductId == null || !_nssWhitePerrottaOverProductByNextProductId.hasConditionQuery())
        { _nssWhitePerrottaOverProductByNextProductId = new WhitePerrottaOverProductNss(query().queryWhitePerrottaOverProductByNextProductId()); }
        return _nssWhitePerrottaOverProductByNextProductId;
    }

    protected WhitePerrottaOverProductNss _nssWhitePerrottaOverProductByPreviousProductId;
    public WhitePerrottaOverProductNss xdfgetNssWhitePerrottaOverProductByPreviousProductId() {
        if (_nssWhitePerrottaOverProductByPreviousProductId == null) { _nssWhitePerrottaOverProductByPreviousProductId = new WhitePerrottaOverProductNss(null); }
        return _nssWhitePerrottaOverProductByPreviousProductId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhitePerrottaOverProductByPreviousProductId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whitePerrottaOverTrace</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whitePerrottaOverTrace</span>.<span style="color: #CC4747">getWhitePerrottaOverProductByPreviousProductId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhitePerrottaOverProductNss setupSelect_WhitePerrottaOverProductByPreviousProductId() {
        assertSetupSelectPurpose("whitePerrottaOverProductByPreviousProductId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPreviousProductId();
        }
        doSetupSelect(() -> query().queryWhitePerrottaOverProductByPreviousProductId());
        if (_nssWhitePerrottaOverProductByPreviousProductId == null || !_nssWhitePerrottaOverProductByPreviousProductId.hasConditionQuery())
        { _nssWhitePerrottaOverProductByPreviousProductId = new WhitePerrottaOverProductNss(query().queryWhitePerrottaOverProductByPreviousProductId()); }
        return _nssWhitePerrottaOverProductByPreviousProductId;
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

    public static class HpSpecification extends HpAbstractSpecification<WhitePerrottaOverTraceCQ> {
        protected WhitePerrottaOverProductCB.HpSpecification _whitePerrottaOverProductByNextProductId;
        protected WhitePerrottaOverProductCB.HpSpecification _whitePerrottaOverProductByPreviousProductId;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhitePerrottaOverTraceCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TRACE_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTraceId() { return doColumn("TRACE_ID"); }
        /**
         * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPreviousProductId() { return doColumn("PREVIOUS_PRODUCT_ID"); }
        /**
         * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNextProductId() { return doColumn("NEXT_PRODUCT_ID"); }
        /**
         * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTraceTypeCode() { return doColumn("TRACE_TYPE_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnTraceId(); // PK
            if (qyCall().qy().hasConditionQueryWhitePerrottaOverProductByNextProductId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhitePerrottaOverProductCQ) {
                columnNextProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhitePerrottaOverProductByPreviousProductId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhitePerrottaOverProductCQ) {
                columnPreviousProductId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_perrotta_over_trace"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePerrottaOverProductCB.HpSpecification specifyWhitePerrottaOverProductByNextProductId() {
            assertRelation("whitePerrottaOverProductByNextProductId");
            if (_whitePerrottaOverProductByNextProductId == null) {
                _whitePerrottaOverProductByNextProductId = new WhitePerrottaOverProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePerrottaOverProductByNextProductId()
                                    , () -> _qyCall.qy().queryWhitePerrottaOverProductByNextProductId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whitePerrottaOverProductByNextProductId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePerrottaOverProductByNextProductId()
                      , () -> xsyncQyCall().qy().queryWhitePerrottaOverProductByNextProductId()));
                }
            }
            return _whitePerrottaOverProductByNextProductId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhitePerrottaOverProductCB.HpSpecification specifyWhitePerrottaOverProductByPreviousProductId() {
            assertRelation("whitePerrottaOverProductByPreviousProductId");
            if (_whitePerrottaOverProductByPreviousProductId == null) {
                _whitePerrottaOverProductByPreviousProductId = new WhitePerrottaOverProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhitePerrottaOverProductByPreviousProductId()
                                    , () -> _qyCall.qy().queryWhitePerrottaOverProductByPreviousProductId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whitePerrottaOverProductByPreviousProductId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhitePerrottaOverProductByPreviousProductId()
                      , () -> xsyncQyCall().qy().queryWhitePerrottaOverProductByPreviousProductId()));
                }
            }
            return _whitePerrottaOverProductByPreviousProductId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhitePerrottaOverTraceCB, WhitePerrottaOverTraceCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhitePerrottaOverTraceCB> sq, WhitePerrottaOverTraceCQ cq, String al, DerivedReferrerOption op)
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
    public WhitePerrottaOverTraceCB dreamCruiseCB() {
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
        cb.xsetupForDreamCruise((WhitePerrottaOverTraceCB) this);
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
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhitePerrottaOverTraceCB> columnQuery(final SpecifyQuery<WhitePerrottaOverTraceCB> colCBLambda) {
        return xcreateColQyOperandMySql((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected WhitePerrottaOverTraceCB xcreateColumnQueryCB() {
        WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
        cb.xsetupForColumnQuery((WhitePerrottaOverTraceCB)this);
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
    public void orScopeQuery(OrQuery<WhitePerrottaOverTraceCB> orCBLambda) {
        xorSQ((WhitePerrottaOverTraceCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<WhitePerrottaOverTraceCB> andCBLambda) {
        xorSQAP((WhitePerrottaOverTraceCB)this, andCBLambda);
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
        final WhitePerrottaOverTraceCB cb;
        if (mainCB != null) {
            cb = (WhitePerrottaOverTraceCB)mainCB;
        } else {
            cb = new WhitePerrottaOverTraceCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhitePerrottaOverTraceCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhitePerrottaOverTraceCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
