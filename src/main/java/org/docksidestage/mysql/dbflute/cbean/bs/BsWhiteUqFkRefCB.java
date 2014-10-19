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
 * The base condition-bean of white_uq_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqFkRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefCB() {
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
        return "white_uq_fk_ref";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param uqFkRefId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteUqFkRefCB acceptPK(Long uqFkRefId) {
        assertObjectNotNull("uqFkRefId", uqFkRefId);
        BsWhiteUqFkRefCB cb = this;
        cb.query().setUqFkRefId_Equal(uqFkRefId);
        return (WhiteUqFkRefCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param compoundUqFirstCode : UQ+, NotNull, CHAR(3). (NotNull)
     * @param compoundUqSecondCode : +UQ, NotNull, CHAR(3). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteUqFkRefCB acceptUniqueOf(String compoundUqFirstCode, String compoundUqSecondCode) {
        assertObjectNotNull("compoundUqFirstCode", compoundUqFirstCode);assertObjectNotNull("compoundUqSecondCode", compoundUqSecondCode);
        BsWhiteUqFkRefCB cb = this;
        cb.query().setCompoundUqFirstCode_Equal(compoundUqFirstCode);cb.query().setCompoundUqSecondCode_Equal(compoundUqSecondCode);
        return (WhiteUqFkRefCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_UqFkRefId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_UqFkRefId_Desc();
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
    public WhiteUqFkRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public WhiteUqFkRefCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteUqFkRefCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteUqFkRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteUqFkRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteUqFkRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteUqFkRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteUqFkRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #CC4747">union</span>(new UnionQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteUqFkRefCB> unionQuery) {
        final WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteUqFkRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(new UnionQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteUqFkRefCB> unionQuery) {
        final WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteUqFkRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br />
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.<span style="color: #CC4747">setupSelect_WhiteUqFkByFkToPkId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteUqFkRef whiteUqFkRef = whiteUqFkRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteUqFkRef.<span style="color: #CC4747">getWhiteUqFkByFkToPkId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_WhiteUqFkByFkToPkId() {
        assertSetupSelectPurpose("whiteUqFkByFkToPkId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnFkToPkId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteUqFkByFkToPkId(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.<span style="color: #CC4747">setupSelect_WhiteUqFkByFkToUqCode()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * WhiteUqFkRef whiteUqFkRef = whiteUqFkRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = whiteUqFkRef.<span style="color: #CC4747">getWhiteUqFkByFkToUqCode()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_WhiteUqFkByFkToUqCode() {
        assertSetupSelectPurpose("whiteUqFkByFkToUqCode");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnFkToUqCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWhiteUqFkByFkToUqCode(); } });
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
            , new HpSpQyCall<WhiteUqFkRefCQ>() {
                public boolean has() { return true; }
                public WhiteUqFkRefCQ qy() { return xdfgetConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteUqFkRefCQ> {
        protected WhiteUqFkCB.HpSpecification _whiteUqFkByFkToPkId;
        protected WhiteUqFkCB.HpSpecification _whiteUqFkByFkToUqCode;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteUqFkRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUqFkRefId() { return doColumn("UQ_FK_REF_ID"); }
        /**
         * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFkToPkId() { return doColumn("FK_TO_PK_ID"); }
        /**
         * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFkToUqCode() { return doColumn("FK_TO_UQ_CODE"); }
        /**
         * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompoundUqFirstCode() { return doColumn("COMPOUND_UQ_FIRST_CODE"); }
        /**
         * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompoundUqSecondCode() { return doColumn("COMPOUND_UQ_SECOND_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnUqFkRefId(); // PK
            if (qyCall().qy().xgetReferrerQuery() instanceof WhiteUqFkRefNestCQ) {
                columnCompoundUqFirstCode(); // non PK but referred column (and referrer also non PK)
                columnCompoundUqSecondCode(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().hasConditionQueryWhiteUqFkByFkToPkId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteUqFkCQ) {
                columnFkToPkId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteUqFkByFkToUqCode()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteUqFkCQ) {
                columnFkToUqCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "white_uq_fk_ref"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteUqFkCB.HpSpecification specifyWhiteUqFkByFkToPkId() {
            assertRelation("whiteUqFkByFkToPkId");
            if (_whiteUqFkByFkToPkId == null) {
                _whiteUqFkByFkToPkId = new WhiteUqFkCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteUqFkCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteUqFkByFkToPkId(); }
                    public WhiteUqFkCQ qy() { return _qyCall.qy().queryWhiteUqFkByFkToPkId(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteUqFkByFkToPkId.xsetSyncQyCall(new HpSpQyCall<WhiteUqFkCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteUqFkByFkToPkId(); }
                        public WhiteUqFkCQ qy() { return xsyncQyCall().qy().queryWhiteUqFkByFkToPkId(); }
                    });
                }
            }
            return _whiteUqFkByFkToPkId;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteUqFkCB.HpSpecification specifyWhiteUqFkByFkToUqCode() {
            assertRelation("whiteUqFkByFkToUqCode");
            if (_whiteUqFkByFkToUqCode == null) {
                _whiteUqFkByFkToUqCode = new WhiteUqFkCB.HpSpecification(_baseCB, new HpSpQyCall<WhiteUqFkCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteUqFkByFkToUqCode(); }
                    public WhiteUqFkCQ qy() { return _qyCall.qy().queryWhiteUqFkByFkToUqCode(); } }
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteUqFkByFkToUqCode.xsetSyncQyCall(new HpSpQyCall<WhiteUqFkCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteUqFkByFkToUqCode(); }
                        public WhiteUqFkCQ qy() { return xsyncQyCall().qy().queryWhiteUqFkByFkToUqCode(); }
                    });
                }
            }
            return _whiteUqFkByFkToUqCode;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from white_uq_fk_ref_nest where ...) as FOO_MAX} <br />
         * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(nestCB -&gt; {
         *     nestCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     nestCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhiteUqFkRefNest.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteUqFkRefNestCB, WhiteUqFkRefCQ> derivedWhiteUqFkRefNestList() {
            assertDerived("whiteUqFkRefNestList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteUqFkRefNestCB, WhiteUqFkRefCQ>() {
                public void setup(String fn, SubQuery<WhiteUqFkRefNestCB> sq, WhiteUqFkRefCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveWhiteUqFkRefNestList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<WhiteUqFkRefCB, WhiteUqFkRefCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), new HpSDRSetupper<WhiteUqFkRefCB, WhiteUqFkRefCQ>() {
                public void setup(String fn, SubQuery<WhiteUqFkRefCB> sq, WhiteUqFkRefCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #CC4747">columnQuery</span>(new SpecifyQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand.HpExtendedColQyOperandMySql<WhiteUqFkRefCB> columnQuery(final SpecifyQuery<WhiteUqFkRefCB> colCBLambda) {
        return xcreateColQyOperandMySql(new HpColQyHandler<WhiteUqFkRefCB>() {
            public ColumnCalculator handle(SpecifyQuery<WhiteUqFkRefCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
            }
        });
    }

    protected WhiteUqFkRefCB xcreateColumnQueryCB() {
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.xsetupForColumnQuery((WhiteUqFkRefCB)this);
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
    public WhiteUqFkRefCB dreamCruiseCB() {
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.xsetupForDreamCruise((WhiteUqFkRefCB) this);
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
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteUqFkRefCB> orCBLambda) {
        xorSQ((WhiteUqFkRefCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #CC4747">orScopeQueryAndPart</span>(new AndQuery&lt;WhiteUqFkRefCB&gt;() {
     *             public void query(WhiteUqFkRefCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteUqFkRefCB> andCBLambda) {
        xorSQAP((WhiteUqFkRefCB)this, andCBLambda);
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
        final WhiteUqFkRefCB cb;
        if (mainCB != null) {
            cb = (WhiteUqFkRefCB)mainCB;
        } else {
            cb = new WhiteUqFkRefCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<WhiteUqFkRefCQ>() {
            public boolean has() { return true; }
            public WhiteUqFkRefCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteUqFkRefCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
