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
 * The base condition-bean of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteVariantRelationReferrerCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteVariantRelationReferrerCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteVariantRelationReferrerCB() {
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
        return "white_variant_relation_referrer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param referrerId : PK, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteVariantRelationReferrerCB acceptPK(Long referrerId) {
        assertObjectNotNull("referrerId", referrerId);
        BsWhiteVariantRelationReferrerCB cb = this;
        cb.query().setReferrerId_Equal(referrerId);
        return (WhiteVariantRelationReferrerCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReferrerId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReferrerId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
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
    public WhiteVariantRelationReferrerCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public WhiteVariantRelationReferrerCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteVariantRelationReferrerCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteVariantRelationReferrerCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteVariantRelationReferrerCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteVariantRelationReferrerCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteVariantRelationReferrerCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteVariantRelationReferrerCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteVariantRelationReferrerCB> unionCBLambda) {
        final WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteVariantRelationReferrerCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteVariantRelationReferrerCB> unionCBLambda) {
        final WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteVariantRelationReferrerCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteVariantRelationMasterFooNss _nssWhiteVariantRelationMasterFooAsVariant;
    public WhiteVariantRelationMasterFooNss xdfgetNssWhiteVariantRelationMasterFooAsVariant() {
        if (_nssWhiteVariantRelationMasterFooAsVariant == null) { _nssWhiteVariantRelationMasterFooAsVariant = new WhiteVariantRelationMasterFooNss(null); }
        return _nssWhiteVariantRelationMasterFooAsVariant;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteVariantRelationMasterFooAsVariant()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteVariantRelationReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.<span style="color: #CC4747">getWhiteVariantRelationMasterFooAsVariant()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterFooNss setupSelect_WhiteVariantRelationMasterFooAsVariant() {
        assertSetupSelectPurpose("whiteVariantRelationMasterFooAsVariant");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterFooAsVariant(); } });
        if (_nssWhiteVariantRelationMasterFooAsVariant == null || !_nssWhiteVariantRelationMasterFooAsVariant.hasConditionQuery())
        { _nssWhiteVariantRelationMasterFooAsVariant = new WhiteVariantRelationMasterFooNss(query().queryWhiteVariantRelationMasterFooAsVariant()); }
        return _nssWhiteVariantRelationMasterFooAsVariant;
    }

    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteVariantRelationMasterBarAsVariant()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteVariantRelationReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.<span style="color: #CC4747">getWhiteVariantRelationMasterBarAsVariant()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteVariantRelationMasterBarAsVariant() {
        assertSetupSelectPurpose("whiteVariantRelationMasterBarAsVariant");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterBarAsVariant(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteVariantRelationMasterQuxAsVariantByQue()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteVariantRelationReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.<span style="color: #CC4747">getWhiteVariantRelationMasterQuxAsVariantByQue()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteVariantRelationMasterQuxAsVariantByQue() {
        assertSetupSelectPurpose("whiteVariantRelationMasterQuxAsVariantByQue");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterQuxAsVariantByQue(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteVariantRelationReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.<span style="color: #CC4747">getWhiteVariantRelationMasterCorgeAsVariantByQuxType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
     */
    public void setupSelect_WhiteVariantRelationMasterCorgeAsVariantByQuxType(final org.docksidestage.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
        assertSetupSelectPurpose("whiteVariantRelationMasterCorgeAsVariantByQuxType");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnVariantMasterId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); } });
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
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
            , new HpSpQyCall<WhiteVariantRelationReferrerCQ>() {
                public boolean has() { return true; }
                public WhiteVariantRelationReferrerCQ qy() { return xdfgetConditionQuery(); }
            }
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<WhiteVariantRelationReferrerCQ> {
        protected WhiteVariantRelationMasterFooCB.HpSpecification _whiteVariantRelationMasterFooAsVariant;
        protected WhiteVariantRelationMasterBarCB.HpSpecification _whiteVariantRelationMasterBarAsVariant;
        protected WhiteVariantRelationMasterQuxCB.HpSpecification _whiteVariantRelationMasterQuxAsVariantByQue;
        protected WhiteVariantRelationMasterCorgeCB.HpSpecification _whiteVariantRelationMasterCorgeAsVariantByQuxType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteVariantRelationReferrerCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * REFERRER_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReferrerId() { return doColumn("REFERRER_ID"); }
        /**
         * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVariantMasterId() { return doColumn("VARIANT_MASTER_ID"); }
        /**
         * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMasterTypeCode() { return doColumn("MASTER_TYPE_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnReferrerId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterFooAsVariant()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterFooCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterBarAsVariant()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterBarCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterQuxCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteVariantRelationMasterCorgeCQ) {
                columnVariantMasterId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_variant_relation_referrer"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterFooCB.HpSpecification specifyWhiteVariantRelationMasterFooAsVariant() {
            assertRelation("whiteVariantRelationMasterFooAsVariant");
            if (_whiteVariantRelationMasterFooAsVariant == null) {
                _whiteVariantRelationMasterFooAsVariant = new WhiteVariantRelationMasterFooCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterFooCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterFooAsVariant(); }
                    public WhiteVariantRelationMasterFooCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterFooAsVariant(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterFooAsVariant.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterFooCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterFooAsVariant(); }
                        public WhiteVariantRelationMasterFooCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterFooAsVariant(); }
                    });
                }
            }
            return _whiteVariantRelationMasterFooAsVariant;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterBarCB.HpSpecification specifyWhiteVariantRelationMasterBarAsVariant() {
            assertRelation("whiteVariantRelationMasterBarAsVariant");
            if (_whiteVariantRelationMasterBarAsVariant == null) {
                _whiteVariantRelationMasterBarAsVariant = new WhiteVariantRelationMasterBarCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterBarCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterBarAsVariant(); }
                    public WhiteVariantRelationMasterBarCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterBarAsVariant(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterBarAsVariant.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterBarCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterBarAsVariant(); }
                        public WhiteVariantRelationMasterBarCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterBarAsVariant(); }
                    });
                }
            }
            return _whiteVariantRelationMasterBarAsVariant;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterQuxCB.HpSpecification specifyWhiteVariantRelationMasterQuxAsVariantByQue() {
            assertRelation("whiteVariantRelationMasterQuxAsVariantByQue");
            if (_whiteVariantRelationMasterQuxAsVariantByQue == null) {
                _whiteVariantRelationMasterQuxAsVariantByQue = new WhiteVariantRelationMasterQuxCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterQuxCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue(); }
                    public WhiteVariantRelationMasterQuxCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterQuxAsVariantByQue(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterQuxAsVariantByQue.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterQuxCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterQuxAsVariantByQue(); }
                        public WhiteVariantRelationMasterQuxCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterQuxAsVariantByQue(); }
                    });
                }
            }
            return _whiteVariantRelationMasterQuxAsVariantByQue;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
         * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterCorgeCB.HpSpecification specifyWhiteVariantRelationMasterCorgeAsVariantByQuxType(final org.docksidestage.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
            assertRelation("whiteVariantRelationMasterCorgeAsVariantByQuxType");
            if (_whiteVariantRelationMasterCorgeAsVariantByQuxType == null) {
                _whiteVariantRelationMasterCorgeAsVariantByQuxType = new WhiteVariantRelationMasterCorgeCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                    public WhiteVariantRelationMasterCorgeCQ qy() { return _qyCall.qy().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterCorgeAsVariantByQuxType.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                        public WhiteVariantRelationMasterCorgeCQ qy() { return xsyncQyCall().qy().queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType); }
                    });
                }
            }
            return _whiteVariantRelationMasterCorgeAsVariantByQuxType;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteVariantRelationMasterCorgeCB.HpSpecification specifyWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
            assertRelation("whiteVariantRelationMasterCorgeAsVariantByQuxType");
            if (_whiteVariantRelationMasterCorgeAsVariantByQuxType == null) {
                _whiteVariantRelationMasterCorgeAsVariantByQuxType = new WhiteVariantRelationMasterCorgeCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                    public WhiteVariantRelationMasterCorgeCQ qy() { return _qyCall.qy().xdfgetConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteVariantRelationMasterCorgeAsVariantByQuxType.xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationMasterCorgeCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                        public WhiteVariantRelationMasterCorgeCQ qy() { return xsyncQyCall().qy().xdfgetConditionQueryWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
                    });
                }
            }
            return _whiteVariantRelationMasterCorgeAsVariantByQuxType;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_variant_relation_referrer_ref where ...) as FOO_MAX} <br />
         * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     refCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     refCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhiteVariantRelationReferrerRef.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerCQ> derivedWhiteVariantRelationReferrerRefList() {
            assertDerived("whiteVariantRelationReferrerRefList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerCQ>() {
                public void setup(String fn, SubQuery<WhiteVariantRelationReferrerRefCB> sq, WhiteVariantRelationReferrerCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteVariantRelationReferrerRefList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrerCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrerCQ>() {
                public void setup(String fn, SubQuery<WhiteVariantRelationReferrerCB> sq, WhiteVariantRelationReferrerCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
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
     * cb.<span style="color: #CC4747">columnQuery</span>(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhiteVariantRelationReferrerCB> columnQuery(final SpecifyQuery<WhiteVariantRelationReferrerCB> colCBLambda) {
        return xcreateColQyOperandMySql(new HpColQyHandler<WhiteVariantRelationReferrerCB>() {
            public ColumnCalculator handle(SpecifyQuery<WhiteVariantRelationReferrerCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
            }
        });
    }

    protected WhiteVariantRelationReferrerCB xcreateColumnQueryCB() {
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.xsetupForColumnQuery((WhiteVariantRelationReferrerCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public WhiteVariantRelationReferrerCB dreamCruiseCB() {
        WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
        cb.xsetupForDreamCruise((WhiteVariantRelationReferrerCB) this);
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
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteVariantRelationReferrerCB> orCBLambda) {
        xorSQ((WhiteVariantRelationReferrerCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void query(WhiteVariantRelationReferrerCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #CC4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *             public void query(WhiteVariantRelationReferrerCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteVariantRelationReferrerCB> andCBLambda) {
        xorSQAP((WhiteVariantRelationReferrerCB)this, andCBLambda);
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
        final WhiteVariantRelationReferrerCB cb;
        if (mainCB != null) {
            cb = (WhiteVariantRelationReferrerCB)mainCB;
        } else {
            cb = new WhiteVariantRelationReferrerCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteVariantRelationReferrerCQ>() {
            public boolean has() { return true; }
            public WhiteVariantRelationReferrerCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteVariantRelationReferrerCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteVariantRelationReferrerCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
