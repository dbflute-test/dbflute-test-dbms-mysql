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

/**
 * The base condition-bean of white_split_multiple_fk_base.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSplitMultipleFkBaseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSplitMultipleFkBaseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSplitMultipleFkBaseCB() {
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
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_split_multiple_fk_base";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param baseId : PK, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteSplitMultipleFkBaseCB acceptPK(Long baseId) {
        assertObjectNotNull("baseId", baseId);
        BsWhiteSplitMultipleFkBaseCB cb = this;
        cb.query().setBaseId_Equal(baseId);
        return (WhiteSplitMultipleFkBaseCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BaseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BaseId_Desc();
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
    public WhiteSplitMultipleFkBaseCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public WhiteSplitMultipleFkBaseCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteSplitMultipleFkBaseCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteSplitMultipleFkBaseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteSplitMultipleFkBaseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteSplitMultipleFkBaseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteSplitMultipleFkBaseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteSplitMultipleFkBaseCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<WhiteSplitMultipleFkBaseCB> unionCBLambda) {
        final WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteSplitMultipleFkBaseCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<WhiteSplitMultipleFkBaseCB> unionCBLambda) {
        final WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteSplitMultipleFkBaseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteSplitMultipleFkNext()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteSplitMultipleFkBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteSplitMultipleFkBase</span>.<span style="color: #CC4747">getWhiteSplitMultipleFkNext()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteSplitMultipleFkNext() {
        assertSetupSelectPurpose("whiteSplitMultipleFkNext");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnNextId();
        }
        doSetupSelect(() -> query().queryWhiteSplitMultipleFkNext());
    }

    /**
     * Set up relation columns to select clause. <br>
     * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteSplitMultipleFkRefAsSplitMultipleFkTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteSplitMultipleFkBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteSplitMultipleFkBase</span>.<span style="color: #CC4747">getWhiteSplitMultipleFkRefAsSplitMultipleFkTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        assertSetupSelectPurpose("whiteSplitMultipleFkRefAsSplitMultipleFkTest");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnFirstId();
        }
        doSetupSelect(() -> query().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest());
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

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<WhiteSplitMultipleFkBaseCQ> {
        protected WhiteSplitMultipleFkNextCB.HpSpecification _whiteSplitMultipleFkNext;
        protected WhiteSplitMultipleFkRefCB.HpSpecification _whiteSplitMultipleFkRefAsSplitMultipleFkTest;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteSplitMultipleFkBaseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * BASE_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBaseId() { return doColumn("BASE_ID"); }
        /**
         * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFirstId() { return doColumn("FIRST_ID"); }
        /**
         * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNextId() { return doColumn("NEXT_ID"); }
        /**
         * SPLIT_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSplitName() { return doColumn("SPLIT_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnBaseId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteSplitMultipleFkNext()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSplitMultipleFkNextCQ) {
                columnNextId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteSplitMultipleFkRefCQ) {
                columnFirstId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_split_multiple_fk_base"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSplitMultipleFkNextCB.HpSpecification specifyWhiteSplitMultipleFkNext() {
            assertRelation("whiteSplitMultipleFkNext");
            if (_whiteSplitMultipleFkNext == null) {
                _whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNextCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSplitMultipleFkNext()
                                    , () -> _qyCall.qy().queryWhiteSplitMultipleFkNext())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSplitMultipleFkNext.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSplitMultipleFkNext()
                      , () -> xsyncQyCall().qy().queryWhiteSplitMultipleFkNext()));
                }
            }
            return _whiteSplitMultipleFkNext;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteSplitMultipleFkRefCB.HpSpecification specifyWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
            assertRelation("whiteSplitMultipleFkRefAsSplitMultipleFkTest");
            if (_whiteSplitMultipleFkRefAsSplitMultipleFkTest == null) {
                _whiteSplitMultipleFkRefAsSplitMultipleFkTest = new WhiteSplitMultipleFkRefCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()
                                    , () -> _qyCall.qy().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteSplitMultipleFkRefAsSplitMultipleFkTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()
                      , () -> xsyncQyCall().qy().queryWhiteSplitMultipleFkRefAsSplitMultipleFkTest()));
                }
            }
            return _whiteSplitMultipleFkRefAsSplitMultipleFkTest;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from white_split_multiple_fk_child where ...) as FOO_MAX} <br>
         * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(childCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     childCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     childCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhiteSplitMultipleFkChild.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkBaseCQ> derivedWhiteSplitMultipleFkChildList() {
            assertDerived("whiteSplitMultipleFkChildList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsderiveWhiteSplitMultipleFkChildList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBaseCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    @Override
    protected <LOCAL_CQ extends ConditionQuery, REFERRER_CB extends ConditionBean> HpSDRFunction<REFERRER_CB, LOCAL_CQ> newSDFFunction(
            ConditionBean baseCB, LOCAL_CQ localCQ
            , HpSDRSetupper<REFERRER_CB, LOCAL_CQ> querySetupper
            , DBMetaProvider dbmetaProvider, DerivedReferrerOptionFactory optionFactory) {
        return new org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<REFERRER_CB, LOCAL_CQ>(baseCB, localCQ, querySetupper, dbmetaProvider, optionFactory);
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhiteSplitMultipleFkBaseCB> columnQuery(final SpecifyQuery<WhiteSplitMultipleFkBaseCB> colCBLambda) {
        return xcreateColQyOperandMySql((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected WhiteSplitMultipleFkBaseCB xcreateColumnQueryCB() {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForColumnQuery((WhiteSplitMultipleFkBaseCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public WhiteSplitMultipleFkBaseCB dreamCruiseCB() {
        WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
        cb.xsetupForDreamCruise((WhiteSplitMultipleFkBaseCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
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
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteSplitMultipleFkBaseCB> orCBLambda) {
        xorSQ((WhiteSplitMultipleFkBaseCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void query(WhiteSplitMultipleFkBaseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #CC4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *             public void query(WhiteSplitMultipleFkBaseCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteSplitMultipleFkBaseCB> andCBLambda) {
        xorSQAP((WhiteSplitMultipleFkBaseCB)this, andCBLambda);
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
        final WhiteSplitMultipleFkBaseCB cb;
        if (mainCB != null) {
            cb = (WhiteSplitMultipleFkBaseCB)mainCB;
        } else {
            cb = new WhiteSplitMultipleFkBaseCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteSplitMultipleFkBaseCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteSplitMultipleFkBaseCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
