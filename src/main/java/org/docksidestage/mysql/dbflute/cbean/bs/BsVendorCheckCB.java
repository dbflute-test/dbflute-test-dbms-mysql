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
 * The base condition-bean of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCB() {
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
        if (DBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
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
        return "vendor_check";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param vendorCheckId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return this. (NotNull)
     */
    public VendorCheckCB acceptPK(Long vendorCheckId) {
        assertObjectNotNull("vendorCheckId", vendorCheckId);
        BsVendorCheckCB cb = this;
        cb.query().setVendorCheckId_Equal(vendorCheckId);
        return (VendorCheckCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_VendorCheckId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_VendorCheckId_Desc();
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
    public VendorCheckCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public VendorCheckCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected VendorCheckCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected VendorCheckCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected VendorCheckCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        VendorCheckCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected VendorCheckCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<VendorCheckCB> unionCBLambda) {
        final VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorCheckCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<VendorCheckCB> unionCBLambda) {
        final VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorCheckCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
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

    public static class HpSpecification extends HpAbstractSpecification<VendorCheckCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<VendorCheckCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVendorCheckId() { return doColumn("VENDOR_CHECK_ID"); }
        /**
         * TYPE_OF_CHAR: {CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfChar() { return doColumn("TYPE_OF_CHAR"); }
        /**
         * TYPE_OF_VARCHAR: {VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfVarchar() { return doColumn("TYPE_OF_VARCHAR"); }
        /**
         * TYPE_OF_TEXT: {TEXT(65535)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfText() { return doColumn("TYPE_OF_TEXT"); }
        /**
         * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfTinytext() { return doColumn("TYPE_OF_TINYTEXT"); }
        /**
         * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfMediumtext() { return doColumn("TYPE_OF_MEDIUMTEXT"); }
        /**
         * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfLongtext() { return doColumn("TYPE_OF_LONGTEXT"); }
        /**
         * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumericDecimal() { return doColumn("TYPE_OF_NUMERIC_DECIMAL"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumericInteger() { return doColumn("TYPE_OF_NUMERIC_INTEGER"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumericBigint() { return doColumn("TYPE_OF_NUMERIC_BIGINT"); }
        /**
         * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDecimalDecimal() { return doColumn("TYPE_OF_DECIMAL_DECIMAL"); }
        /**
         * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDecimalInteger() { return doColumn("TYPE_OF_DECIMAL_INTEGER"); }
        /**
         * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDecimalBigint() { return doColumn("TYPE_OF_DECIMAL_BIGINT"); }
        /**
         * TYPE_OF_INTEGER: {INT(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfInteger() { return doColumn("TYPE_OF_INTEGER"); }
        /**
         * TYPE_OF_BIGINT: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBigint() { return doColumn("TYPE_OF_BIGINT"); }
        /**
         * TYPE_OF_FLOAT: {FLOAT(12)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfFloat() { return doColumn("TYPE_OF_FLOAT"); }
        /**
         * TYPE_OF_DOUBLE: {DOUBLE(22)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDouble() { return doColumn("TYPE_OF_DOUBLE"); }
        /**
         * TYPE_OF_DATE: {DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDate() { return doColumn("TYPE_OF_DATE"); }
        /**
         * TYPE_OF_DATETIME: {DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDatetime() { return doColumn("TYPE_OF_DATETIME"); }
        /**
         * TYPE_OF_DATETIME_3_MILLIS: {DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDatetime3Millis() { return doColumn("TYPE_OF_DATETIME_3_MILLIS"); }
        /**
         * TYPE_OF_DATETIME_6_MICROS: {DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDatetime6Micros() { return doColumn("TYPE_OF_DATETIME_6_MICROS"); }
        /**
         * TYPE_OF_TIMESTAMP: {TIMESTAMP(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfTimestamp() { return doColumn("TYPE_OF_TIMESTAMP"); }
        /**
         * TYPE_OF_TIME: {TIME(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfTime() { return doColumn("TYPE_OF_TIME"); }
        /**
         * TYPE_OF_YEAR: {YEAR}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfYear() { return doColumn("TYPE_OF_YEAR"); }
        /**
         * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBoolean() { return doColumn("TYPE_OF_BOOLEAN"); }
        /**
         * TYPE_OF_BLOB: {BLOB(65535)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBlob() { return doColumn("TYPE_OF_BLOB"); }
        /**
         * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfTinyblob() { return doColumn("TYPE_OF_TINYBLOB"); }
        /**
         * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfMediumblob() { return doColumn("TYPE_OF_MEDIUMBLOB"); }
        /**
         * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfLongblob() { return doColumn("TYPE_OF_LONGBLOB"); }
        /**
         * TYPE_OF_BINARY: {BINARY(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBinary() { return doColumn("TYPE_OF_BINARY"); }
        /**
         * TYPE_OF_VARBINARY: {VARBINARY(1000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfVarbinary() { return doColumn("TYPE_OF_VARBINARY"); }
        /**
         * TYPE_OF_ENUM: {ENUM(6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfEnum() { return doColumn("TYPE_OF_ENUM"); }
        /**
         * TYPE_OF_ENUM_INT: {ENUM(2)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfEnumInt() { return doColumn("TYPE_OF_ENUM_INT"); }
        /**
         * TYPE_OF_SET: {SET(15)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfSet() { return doColumn("TYPE_OF_SET"); }
        /**
         * TYPE_OF_JSON: {JSON}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfJson() { return doColumn("TYPE_OF_JSON"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnVendorCheckId(); // PK
        }
        @Override
        protected String getTableDbName() { return "vendor_check"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<VendorCheckCB, VendorCheckCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<VendorCheckCB> sq, VendorCheckCQ cq, String al, DerivedReferrerOption op)
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
    public VendorCheckCB dreamCruiseCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForDreamCruise((VendorCheckCB) this);
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
    public HpColQyOperand.HpExtendedColQyOperandMySql<VendorCheckCB> columnQuery(final SpecifyQuery<VendorCheckCB> colCBLambda) {
        return xcreateColQyOperandMySql((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected VendorCheckCB xcreateColumnQueryCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForColumnQuery((VendorCheckCB)this);
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
    public void orScopeQuery(OrQuery<VendorCheckCB> orCBLambda) {
        xorSQ((VendorCheckCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<VendorCheckCB> andCBLambda) {
        xorSQAP((VendorCheckCB)this, andCBLambda);
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
        final VendorCheckCB cb;
        if (mainCB != null) {
            cb = (VendorCheckCB)mainCB;
        } else {
            cb = new VendorCheckCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return VendorCheckCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return VendorCheckCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
