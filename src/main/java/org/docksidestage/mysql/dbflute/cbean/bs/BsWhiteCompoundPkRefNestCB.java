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
 * The base condition-bean of white_compound_pk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefNestCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefNestCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefNestCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
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
        return "white_compound_pk_ref_nest";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param compoundPkRefNestId : PK, NotNull, INT(10). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteCompoundPkRefNestCB acceptPK(Integer compoundPkRefNestId) {
        assertObjectNotNull("compoundPkRefNestId", compoundPkRefNestId);
        BsWhiteCompoundPkRefNestCB cb = this;
        cb.query().setCompoundPkRefNestId_Equal(compoundPkRefNestId);
        return (WhiteCompoundPkRefNestCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CompoundPkRefNestId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CompoundPkRefNestId_Desc();
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
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
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
    public WhiteCompoundPkRefNestCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public WhiteCompoundPkRefNestCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteCompoundPkRefNestCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteCompoundPkRefNestCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteCompoundPkRefNestCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteCompoundPkRefNestCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteCompoundPkRefNestCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteCompoundPkRefNestCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #CC4747">union</span>(new UnionQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteCompoundPkRefNestCB> unionQuery) {
        final WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteCompoundPkRefNestCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(new UnionQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteCompoundPkRefNestCB> unionQuery) {
        final WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteCompoundPkRefNestCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected WhiteCompoundPkRefNss _nssWhiteCompoundPkRefByQuxMultipleId;
    public WhiteCompoundPkRefNss xdfgetNssWhiteCompoundPkRefByQuxMultipleId() {
        if (_nssWhiteCompoundPkRefByQuxMultipleId == null) { _nssWhiteCompoundPkRefByQuxMultipleId = new WhiteCompoundPkRefNss(null); }
        return _nssWhiteCompoundPkRefByQuxMultipleId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * <pre>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.<span style="color: #CC4747">setupSelect_WhiteCompoundPkRefByQuxMultipleId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = whiteCompoundPkRefNestBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPkRefNest.<span style="color: #CC4747">getWhiteCompoundPkRefByQuxMultipleId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteCompoundPkRefNss setupSelect_WhiteCompoundPkRefByQuxMultipleId() {
        assertSetupSelectPurpose("whiteCompoundPkRefByQuxMultipleId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnBarMultipleId();
            specify().columnQuxMultipleId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundPkRefByQuxMultipleId(); } });
        if (_nssWhiteCompoundPkRefByQuxMultipleId == null || !_nssWhiteCompoundPkRefByQuxMultipleId.hasConditionQuery())
        { _nssWhiteCompoundPkRefByQuxMultipleId = new WhiteCompoundPkRefNss(query().queryWhiteCompoundPkRefByQuxMultipleId()); }
        return _nssWhiteCompoundPkRefByQuxMultipleId;
    }

    protected WhiteCompoundPkRefNss _nssWhiteCompoundPkRefByFooMultipleId;
    public WhiteCompoundPkRefNss xdfgetNssWhiteCompoundPkRefByFooMultipleId() {
        if (_nssWhiteCompoundPkRefByFooMultipleId == null) { _nssWhiteCompoundPkRefByFooMultipleId = new WhiteCompoundPkRefNss(null); }
        return _nssWhiteCompoundPkRefByFooMultipleId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * <pre>
     * WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
     * cb.<span style="color: #CC4747">setupSelect_WhiteCompoundPkRefByFooMultipleId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefNest whiteCompoundPkRefNest = whiteCompoundPkRefNestBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteCompoundPkRefNest.<span style="color: #CC4747">getWhiteCompoundPkRefByFooMultipleId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteCompoundPkRefNss setupSelect_WhiteCompoundPkRefByFooMultipleId() {
        assertSetupSelectPurpose("whiteCompoundPkRefByFooMultipleId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnFooMultipleId();
            specify().columnBarMultipleId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteCompoundPkRefByFooMultipleId(); } });
        if (_nssWhiteCompoundPkRefByFooMultipleId == null || !_nssWhiteCompoundPkRefByFooMultipleId.hasConditionQuery())
        { _nssWhiteCompoundPkRefByFooMultipleId = new WhiteCompoundPkRefNss(query().queryWhiteCompoundPkRefByFooMultipleId()); }
        return _nssWhiteCompoundPkRefByFooMultipleId;
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
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<WhiteCompoundPkRefNestCQ>() {
                public boolean has() { return true; }
                public WhiteCompoundPkRefNestCQ qy() { return xdfgetConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteCompoundPkRefNestCQ> {
        protected WhiteCompoundPkRefCB.HpSpecification _whiteCompoundPkRefByQuxMultipleId;
        protected WhiteCompoundPkRefCB.HpSpecification _whiteCompoundPkRefByFooMultipleId;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteCompoundPkRefNestCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompoundPkRefNestId() { return doColumn("COMPOUND_PK_REF_NEST_ID"); }
        /**
         * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFooMultipleId() { return doColumn("FOO_MULTIPLE_ID"); }
        /**
         * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBarMultipleId() { return doColumn("BAR_MULTIPLE_ID"); }
        /**
         * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQuxMultipleId() { return doColumn("QUX_MULTIPLE_ID"); }
        /**
         * NEST_NAME: {NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNestName() { return doColumn("NEST_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnCompoundPkRefNestId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteCompoundPkRefByQuxMultipleId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteCompoundPkRefCQ) {
                columnBarMultipleId(); // FK or one-to-one referrer
                columnQuxMultipleId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteCompoundPkRefByFooMultipleId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteCompoundPkRefCQ) {
                columnFooMultipleId(); // FK or one-to-one referrer
                columnBarMultipleId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_compound_pk_ref_nest"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundPkRefCB.HpSpecification specifyWhiteCompoundPkRefByQuxMultipleId() {
            assertRelation("whiteCompoundPkRefByQuxMultipleId");
            if (_whiteCompoundPkRefByQuxMultipleId == null) {
                _whiteCompoundPkRefByQuxMultipleId = new WhiteCompoundPkRefCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundPkRefCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundPkRefByQuxMultipleId(); }
                    public WhiteCompoundPkRefCQ qy() { return _qyCall.qy().queryWhiteCompoundPkRefByQuxMultipleId(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundPkRefByQuxMultipleId.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkRefCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundPkRefByQuxMultipleId(); }
                        public WhiteCompoundPkRefCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundPkRefByQuxMultipleId(); }
                    });
                }
            }
            return _whiteCompoundPkRefByQuxMultipleId;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteCompoundPkRefCB.HpSpecification specifyWhiteCompoundPkRefByFooMultipleId() {
            assertRelation("whiteCompoundPkRefByFooMultipleId");
            if (_whiteCompoundPkRefByFooMultipleId == null) {
                _whiteCompoundPkRefByFooMultipleId = new WhiteCompoundPkRefCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteCompoundPkRefCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteCompoundPkRefByFooMultipleId(); }
                    public WhiteCompoundPkRefCQ qy() { return _qyCall.qy().queryWhiteCompoundPkRefByFooMultipleId(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteCompoundPkRefByFooMultipleId.xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkRefCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteCompoundPkRefByFooMultipleId(); }
                        public WhiteCompoundPkRefCQ qy() { return xsyncQyCall().qy().queryWhiteCompoundPkRefByFooMultipleId(); }
                    });
                }
            }
            return _whiteCompoundPkRefByFooMultipleId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNestCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNestCQ>() {
                public void setup(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, WhiteCompoundPkRefNestCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #CC4747">columnQuery</span>(new SpecifyQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhiteCompoundPkRefNestCB> columnQuery(final SpecifyQuery<WhiteCompoundPkRefNestCB> colCBLambda) {
        return xcreateColQyOperandMySql(new HpColQyHandler<WhiteCompoundPkRefNestCB>() {
            public ColumnCalculator handle(SpecifyQuery<WhiteCompoundPkRefNestCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
            }
        });
    }

    protected WhiteCompoundPkRefNestCB xcreateColumnQueryCB() {
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
        cb.xsetupForColumnQuery((WhiteCompoundPkRefNestCB)this);
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
    public WhiteCompoundPkRefNestCB dreamCruiseCB() {
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB();
        cb.xsetupForDreamCruise((WhiteCompoundPkRefNestCB) this);
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
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteCompoundPkRefNestCB> orCBLambda) {
        xorSQ((WhiteCompoundPkRefNestCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #CC4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *             public void query(WhiteCompoundPkRefNestCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteCompoundPkRefNestCB> andCBLambda) {
        xorSQAP((WhiteCompoundPkRefNestCB)this, andCBLambda);
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
        final WhiteCompoundPkRefNestCB cb;
        if (mainCB != null) {
            cb = (WhiteCompoundPkRefNestCB)mainCB;
        } else {
            cb = new WhiteCompoundPkRefNestCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteCompoundPkRefNestCQ>() {
            public boolean has() { return true; }
            public WhiteCompoundPkRefNestCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteCompoundPkRefNestCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteCompoundPkRefNestCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
