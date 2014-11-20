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
 * The base condition-bean of member.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCB() {
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
        return "member";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberId (会員ID): PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS. (NotNull)
     * @return this. (NotNull)
     */
    public MemberCB acceptPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        BsMemberCB cb = this;
        cb.query().setMemberId_Equal(memberId);
        return (MemberCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return this. (NotNull)
     */
    public MemberCB acceptUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        BsMemberCB cb = this;
        cb.query().setMemberAccount_Equal(memberAccount);
        return (MemberCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
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
    public MemberCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public MemberCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MemberCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MemberCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MemberCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MemberCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MemberCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MemberCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MemberCB> unionCBLambda) {
        final MemberCB cb = new MemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MemberCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MemberCB> unionCBLambda) {
        final MemberCB cb = new MemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MemberCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_MemberStatus() {
        assertSetupSelectPurpose("memberStatus");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberStatusCode();
        }
        doSetupSelect(() -> query().queryMemberStatus());
    }

    protected MemberAddressNss _nssMemberAddressAsValid;
    public MemberAddressNss xdfgetNssMemberAddressAsValid() {
        if (_nssMemberAddressAsValid == null) { _nssMemberAddressAsValid = new MemberAddressNss(null); }
        return _nssMemberAddressAsValid;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsValid(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsValid()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsValid(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsValid");
        doSetupSelect(() -> query().queryMemberAddressAsValid(targetDate));
        if (_nssMemberAddressAsValid == null || !_nssMemberAddressAsValid.hasConditionQuery())
        { _nssMemberAddressAsValid = new MemberAddressNss(query().queryMemberAddressAsValid(targetDate)); }
        return _nssMemberAddressAsValid;
    }

    protected MemberAddressNss _nssMemberAddressAsValidBefore;
    public MemberAddressNss xdfgetNssMemberAddressAsValidBefore() {
        if (_nssMemberAddressAsValidBefore == null) { _nssMemberAddressAsValidBefore = new MemberAddressNss(null); }
        return _nssMemberAddressAsValidBefore;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsValidBefore(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsValidBefore()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsValidBefore(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsValidBefore");
        doSetupSelect(() -> query().queryMemberAddressAsValidBefore(targetDate));
        if (_nssMemberAddressAsValidBefore == null || !_nssMemberAddressAsValidBefore.hasConditionQuery())
        { _nssMemberAddressAsValidBefore = new MemberAddressNss(query().queryMemberAddressAsValidBefore(targetDate)); }
        return _nssMemberAddressAsValidBefore;
    }

    protected MemberLoginNss _nssMemberLoginAsLoginStatus;
    public MemberLoginNss xdfgetNssMemberLoginAsLoginStatus() {
        if (_nssMemberLoginAsLoginStatus == null) { _nssMemberLoginAsLoginStatus = new MemberLoginNss(null); }
        return _nssMemberLoginAsLoginStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsLoginStatus(statusCode)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsLoginStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLoginStatus(final org.docksidestage.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
        assertSetupSelectPurpose("memberLoginAsLoginStatus");
        doSetupSelect(() -> query().queryMemberLoginAsLoginStatus(statusCode));
        if (_nssMemberLoginAsLoginStatus == null || !_nssMemberLoginAsLoginStatus.hasConditionQuery())
        { _nssMemberLoginAsLoginStatus = new MemberLoginNss(query().queryMemberLoginAsLoginStatus(statusCode)); }
        return _nssMemberLoginAsLoginStatus;
    }

    protected MemberAddressNss _nssMemberAddressAsIfComment;
    public MemberAddressNss xdfgetNssMemberAddressAsIfComment() {
        if (_nssMemberAddressAsIfComment == null) { _nssMemberAddressAsIfComment = new MemberAddressNss(null); }
        return _nssMemberAddressAsIfComment;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsIfComment(targetDate, region)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsIfComment()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
     * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsIfComment(final java.time.LocalDate targetDate, final org.docksidestage.mysql.dbflute.allcommon.CDef.Region region) {
        assertSetupSelectPurpose("memberAddressAsIfComment");
        doSetupSelect(() -> query().queryMemberAddressAsIfComment(targetDate, region));
        if (_nssMemberAddressAsIfComment == null || !_nssMemberAddressAsIfComment.hasConditionQuery())
        { _nssMemberAddressAsIfComment = new MemberAddressNss(query().queryMemberAddressAsIfComment(targetDate, region)); }
        return _nssMemberAddressAsIfComment;
    }

    protected MemberAddressNss _nssMemberAddressAsOnlyOneDate;
    public MemberAddressNss xdfgetNssMemberAddressAsOnlyOneDate() {
        if (_nssMemberAddressAsOnlyOneDate == null) { _nssMemberAddressAsOnlyOneDate = new MemberAddressNss(null); }
        return _nssMemberAddressAsOnlyOneDate;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsOnlyOneDate(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsOnlyOneDate()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsOnlyOneDate(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsOnlyOneDate");
        doSetupSelect(() -> query().queryMemberAddressAsOnlyOneDate(targetDate));
        if (_nssMemberAddressAsOnlyOneDate == null || !_nssMemberAddressAsOnlyOneDate.hasConditionQuery())
        { _nssMemberAddressAsOnlyOneDate = new MemberAddressNss(query().queryMemberAddressAsOnlyOneDate(targetDate)); }
        return _nssMemberAddressAsOnlyOneDate;
    }

    protected MemberLoginNss _nssMemberLoginAsLocalBindOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsLocalBindOverTest() {
        if (_nssMemberLoginAsLocalBindOverTest == null) { _nssMemberLoginAsLocalBindOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsLocalBindOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsLocalBindOverTest(displayOrder)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsLocalBindOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     * @deprecated the test of dep
     */
    public MemberLoginNss setupSelect_MemberLoginAsLocalBindOverTest(final Integer displayOrder) {
        assertSetupSelectPurpose("memberLoginAsLocalBindOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsLocalBindOverTest(displayOrder));
        if (_nssMemberLoginAsLocalBindOverTest == null || !_nssMemberLoginAsLocalBindOverTest.hasConditionQuery())
        { _nssMemberLoginAsLocalBindOverTest = new MemberLoginNss(query().queryMemberLoginAsLocalBindOverTest(displayOrder)); }
        return _nssMemberLoginAsLocalBindOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsLocalForeignOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsLocalForeignOverTest() {
        if (_nssMemberLoginAsLocalForeignOverTest == null) { _nssMemberLoginAsLocalForeignOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsLocalForeignOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsLocalForeignOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsLocalForeignOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLocalForeignOverTest() {
        assertSetupSelectPurpose("memberLoginAsLocalForeignOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsLocalForeignOverTest());
        if (_nssMemberLoginAsLocalForeignOverTest == null || !_nssMemberLoginAsLocalForeignOverTest.hasConditionQuery())
        { _nssMemberLoginAsLocalForeignOverTest = new MemberLoginNss(query().queryMemberLoginAsLocalForeignOverTest()); }
        return _nssMemberLoginAsLocalForeignOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignBindOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignBindOverTest() {
        if (_nssMemberLoginAsForeignForeignBindOverTest == null) { _nssMemberLoginAsForeignForeignBindOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignBindOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignBindOverTest(displayOrder)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignBindOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignBindOverTest(final Integer displayOrder) {
        assertSetupSelectPurpose("memberLoginAsForeignForeignBindOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignBindOverTest(displayOrder));
        if (_nssMemberLoginAsForeignForeignBindOverTest == null || !_nssMemberLoginAsForeignForeignBindOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignBindOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignBindOverTest(displayOrder)); }
        return _nssMemberLoginAsForeignForeignBindOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignEachOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignEachOverTest() {
        if (_nssMemberLoginAsForeignForeignEachOverTest == null) { _nssMemberLoginAsForeignForeignEachOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignEachOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignEachOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignEachOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignEachOverTest() {
        assertSetupSelectPurpose("memberLoginAsForeignForeignEachOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignEachOverTest());
        if (_nssMemberLoginAsForeignForeignEachOverTest == null || !_nssMemberLoginAsForeignForeignEachOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignEachOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignEachOverTest()); }
        return _nssMemberLoginAsForeignForeignEachOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedBasicOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedBasicOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedBasicOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedBasicOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignOptimizedBasicOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignOptimizedBasicOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedBasicOverTest() {
        assertSetupSelectPurpose("memberLoginAsForeignForeignOptimizedBasicOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignOptimizedBasicOverTest());
        if (_nssMemberLoginAsForeignForeignOptimizedBasicOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedBasicOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedBasicOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedBasicOverTest()); }
        return _nssMemberLoginAsForeignForeignOptimizedBasicOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedMarkOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedMarkOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedMarkOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedMarkOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignOptimizedMarkOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignOptimizedMarkOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedMarkOverTest() {
        assertSetupSelectPurpose("memberLoginAsForeignForeignOptimizedMarkOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignOptimizedMarkOverTest());
        if (_nssMemberLoginAsForeignForeignOptimizedMarkOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedMarkOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedMarkOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedMarkOverTest()); }
        return _nssMemberLoginAsForeignForeignOptimizedMarkOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedPartOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedPartOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedPartOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignOptimizedPartOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedPartOverTest(final Integer displayOrder, final String memberName) {
        assertSetupSelectPurpose("memberLoginAsForeignForeignOptimizedPartOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName));
        if (_nssMemberLoginAsForeignForeignOptimizedPartOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedPartOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName)); }
        return _nssMemberLoginAsForeignForeignOptimizedPartOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignOptimizedWholeOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        if (_nssMemberLoginAsForeignForeignOptimizedWholeOverTest == null) { _nssMemberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignOptimizedWholeOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignOptimizedWholeOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignOptimizedWholeOverTest(final Integer displayOrder) {
        assertSetupSelectPurpose("memberLoginAsForeignForeignOptimizedWholeOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder));
        if (_nssMemberLoginAsForeignForeignOptimizedWholeOverTest == null || !_nssMemberLoginAsForeignForeignOptimizedWholeOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder)); }
        return _nssMemberLoginAsForeignForeignOptimizedWholeOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignParameterOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignParameterOverTest() {
        if (_nssMemberLoginAsForeignForeignParameterOverTest == null) { _nssMemberLoginAsForeignForeignParameterOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignParameterOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignParameterOverTest(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignParameterOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignParameterOverTest(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberLoginAsForeignForeignParameterOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignParameterOverTest(targetDate));
        if (_nssMemberLoginAsForeignForeignParameterOverTest == null || !_nssMemberLoginAsForeignForeignParameterOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignParameterOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignParameterOverTest(targetDate)); }
        return _nssMemberLoginAsForeignForeignParameterOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsForeignForeignVariousOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsForeignForeignVariousOverTest() {
        if (_nssMemberLoginAsForeignForeignVariousOverTest == null) { _nssMemberLoginAsForeignForeignVariousOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsForeignForeignVariousOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsForeignForeignVariousOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsForeignForeignVariousOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsForeignForeignVariousOverTest() {
        assertSetupSelectPurpose("memberLoginAsForeignForeignVariousOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsForeignForeignVariousOverTest());
        if (_nssMemberLoginAsForeignForeignVariousOverTest == null || !_nssMemberLoginAsForeignForeignVariousOverTest.hasConditionQuery())
        { _nssMemberLoginAsForeignForeignVariousOverTest = new MemberLoginNss(query().queryMemberLoginAsForeignForeignVariousOverTest()); }
        return _nssMemberLoginAsForeignForeignVariousOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsReferrerOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsReferrerOverTest() {
        if (_nssMemberLoginAsReferrerOverTest == null) { _nssMemberLoginAsReferrerOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsReferrerOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsReferrerOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsReferrerOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsReferrerOverTest() {
        assertSetupSelectPurpose("memberLoginAsReferrerOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsReferrerOverTest());
        if (_nssMemberLoginAsReferrerOverTest == null || !_nssMemberLoginAsReferrerOverTest.hasConditionQuery())
        { _nssMemberLoginAsReferrerOverTest = new MemberLoginNss(query().queryMemberLoginAsReferrerOverTest()); }
        return _nssMemberLoginAsReferrerOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsReferrerForeignOverTest;
    public MemberLoginNss xdfgetNssMemberLoginAsReferrerForeignOverTest() {
        if (_nssMemberLoginAsReferrerForeignOverTest == null) { _nssMemberLoginAsReferrerForeignOverTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsReferrerForeignOverTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsReferrerForeignOverTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsReferrerForeignOverTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsReferrerForeignOverTest() {
        assertSetupSelectPurpose("memberLoginAsReferrerForeignOverTest");
        doSetupSelect(() -> query().queryMemberLoginAsReferrerForeignOverTest());
        if (_nssMemberLoginAsReferrerForeignOverTest == null || !_nssMemberLoginAsReferrerForeignOverTest.hasConditionQuery())
        { _nssMemberLoginAsReferrerForeignOverTest = new MemberLoginNss(query().queryMemberLoginAsReferrerForeignOverTest()); }
        return _nssMemberLoginAsReferrerForeignOverTest;
    }

    protected MemberLoginNss _nssMemberLoginAsLatest;
    public MemberLoginNss xdfgetNssMemberLoginAsLatest() {
        if (_nssMemberLoginAsLatest == null) { _nssMemberLoginAsLatest = new MemberLoginNss(null); }
        return _nssMemberLoginAsLatest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLatest() {
        assertSetupSelectPurpose("memberLoginAsLatest");
        doSetupSelect(() -> query().queryMemberLoginAsLatest());
        if (_nssMemberLoginAsLatest == null || !_nssMemberLoginAsLatest.hasConditionQuery())
        { _nssMemberLoginAsLatest = new MemberLoginNss(query().queryMemberLoginAsLatest()); }
        return _nssMemberLoginAsLatest;
    }

    protected MemberLoginNss _nssMemberLoginAsOldest;
    public MemberLoginNss xdfgetNssMemberLoginAsOldest() {
        if (_nssMemberLoginAsOldest == null) { _nssMemberLoginAsOldest = new MemberLoginNss(null); }
        return _nssMemberLoginAsOldest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsOldest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsOldest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsOldest() {
        assertSetupSelectPurpose("memberLoginAsOldest");
        doSetupSelect(() -> query().queryMemberLoginAsOldest());
        if (_nssMemberLoginAsOldest == null || !_nssMemberLoginAsOldest.hasConditionQuery())
        { _nssMemberLoginAsOldest = new MemberLoginNss(query().queryMemberLoginAsOldest()); }
        return _nssMemberLoginAsOldest;
    }

    protected MemberAddressNss _nssMemberAddressAsFormattedBasic;
    public MemberAddressNss xdfgetNssMemberAddressAsFormattedBasic() {
        if (_nssMemberAddressAsFormattedBasic == null) { _nssMemberAddressAsFormattedBasic = new MemberAddressNss(null); }
        return _nssMemberAddressAsFormattedBasic;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsFormattedBasic(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsFormattedBasic()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsFormattedBasic(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsFormattedBasic");
        doSetupSelect(() -> query().queryMemberAddressAsFormattedBasic(targetDate));
        if (_nssMemberAddressAsFormattedBasic == null || !_nssMemberAddressAsFormattedBasic.hasConditionQuery())
        { _nssMemberAddressAsFormattedBasic = new MemberAddressNss(query().queryMemberAddressAsFormattedBasic(targetDate)); }
        return _nssMemberAddressAsFormattedBasic;
    }

    protected MemberAddressNss _nssMemberAddressAsFormattedLong;
    public MemberAddressNss xdfgetNssMemberAddressAsFormattedLong() {
        if (_nssMemberAddressAsFormattedLong == null) { _nssMemberAddressAsFormattedLong = new MemberAddressNss(null); }
        return _nssMemberAddressAsFormattedLong;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsFormattedLong(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsFormattedLong()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsFormattedLong(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsFormattedLong");
        doSetupSelect(() -> query().queryMemberAddressAsFormattedLong(targetDate));
        if (_nssMemberAddressAsFormattedLong == null || !_nssMemberAddressAsFormattedLong.hasConditionQuery())
        { _nssMemberAddressAsFormattedLong = new MemberAddressNss(query().queryMemberAddressAsFormattedLong(targetDate)); }
        return _nssMemberAddressAsFormattedLong;
    }

    protected MemberLoginNss _nssMemberLoginAsFormattedMany;
    public MemberLoginNss xdfgetNssMemberLoginAsFormattedMany() {
        if (_nssMemberLoginAsFormattedMany == null) { _nssMemberLoginAsFormattedMany = new MemberLoginNss(null); }
        return _nssMemberLoginAsFormattedMany;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsFormattedMany()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsFormattedMany()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsFormattedMany() {
        assertSetupSelectPurpose("memberLoginAsFormattedMany");
        doSetupSelect(() -> query().queryMemberLoginAsFormattedMany());
        if (_nssMemberLoginAsFormattedMany == null || !_nssMemberLoginAsFormattedMany.hasConditionQuery())
        { _nssMemberLoginAsFormattedMany = new MemberLoginNss(query().queryMemberLoginAsFormattedMany()); }
        return _nssMemberLoginAsFormattedMany;
    }

    protected MemberLoginNss _nssMemberLoginAsEmbeddedCommentClassificationTest;
    public MemberLoginNss xdfgetNssMemberLoginAsEmbeddedCommentClassificationTest() {
        if (_nssMemberLoginAsEmbeddedCommentClassificationTest == null) { _nssMemberLoginAsEmbeddedCommentClassificationTest = new MemberLoginNss(null); }
        return _nssMemberLoginAsEmbeddedCommentClassificationTest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsEmbeddedCommentClassificationTest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsEmbeddedCommentClassificationTest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsEmbeddedCommentClassificationTest() {
        assertSetupSelectPurpose("memberLoginAsEmbeddedCommentClassificationTest");
        doSetupSelect(() -> query().queryMemberLoginAsEmbeddedCommentClassificationTest());
        if (_nssMemberLoginAsEmbeddedCommentClassificationTest == null || !_nssMemberLoginAsEmbeddedCommentClassificationTest.hasConditionQuery())
        { _nssMemberLoginAsEmbeddedCommentClassificationTest = new MemberLoginNss(query().queryMemberLoginAsEmbeddedCommentClassificationTest()); }
        return _nssMemberLoginAsEmbeddedCommentClassificationTest;
    }

    protected MemberSecurityNss _nssMemberSecurityAsOne;
    public MemberSecurityNss xdfgetNssMemberSecurityAsOne() {
        if (_nssMemberSecurityAsOne == null) { _nssMemberSecurityAsOne = new MemberSecurityNss(null); }
        return _nssMemberSecurityAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberSecurityNss setupSelect_MemberSecurityAsOne() {
        assertSetupSelectPurpose("memberSecurityAsOne");
        doSetupSelect(() -> query().queryMemberSecurityAsOne());
        if (_nssMemberSecurityAsOne == null || !_nssMemberSecurityAsOne.hasConditionQuery()) { _nssMemberSecurityAsOne = new MemberSecurityNss(query().queryMemberSecurityAsOne()); }
        return _nssMemberSecurityAsOne;
    }

    protected MemberServiceNss _nssMemberServiceAsOne;
    public MemberServiceNss xdfgetNssMemberServiceAsOne() {
        if (_nssMemberServiceAsOne == null) { _nssMemberServiceAsOne = new MemberServiceNss(null); }
        return _nssMemberServiceAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberServiceAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberServiceAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberServiceNss setupSelect_MemberServiceAsOne() {
        assertSetupSelectPurpose("memberServiceAsOne");
        doSetupSelect(() -> query().queryMemberServiceAsOne());
        if (_nssMemberServiceAsOne == null || !_nssMemberServiceAsOne.hasConditionQuery()) { _nssMemberServiceAsOne = new MemberServiceNss(query().queryMemberServiceAsOne()); }
        return _nssMemberServiceAsOne;
    }

    protected MemberWithdrawalNss _nssMemberWithdrawalAsOne;
    public MemberWithdrawalNss xdfgetNssMemberWithdrawalAsOne() {
        if (_nssMemberWithdrawalAsOne == null) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(null); }
        return _nssMemberWithdrawalAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberWithdrawalNss setupSelect_MemberWithdrawalAsOne() {
        assertSetupSelectPurpose("memberWithdrawalAsOne");
        doSetupSelect(() -> query().queryMemberWithdrawalAsOne());
        if (_nssMemberWithdrawalAsOne == null || !_nssMemberWithdrawalAsOne.hasConditionQuery()) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(query().queryMemberWithdrawalAsOne()); }
        return _nssMemberWithdrawalAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<MemberCQ> {
        protected MemberStatusCB.HpSpecification _memberStatus;
        protected MemberAddressCB.HpSpecification _memberAddressAsValid;
        protected MemberAddressCB.HpSpecification _memberAddressAsValidBefore;
        protected MemberLoginCB.HpSpecification _memberLoginAsLoginStatus;
        protected MemberAddressCB.HpSpecification _memberAddressAsIfComment;
        protected MemberAddressCB.HpSpecification _memberAddressAsOnlyOneDate;
        protected MemberLoginCB.HpSpecification _memberLoginAsLocalBindOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsLocalForeignOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignBindOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignEachOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedBasicOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedMarkOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedPartOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignOptimizedWholeOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignParameterOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsForeignForeignVariousOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsReferrerOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsReferrerForeignOverTest;
        protected MemberLoginCB.HpSpecification _memberLoginAsLatest;
        protected MemberLoginCB.HpSpecification _memberLoginAsOldest;
        protected MemberAddressCB.HpSpecification _memberAddressAsFormattedBasic;
        protected MemberAddressCB.HpSpecification _memberAddressAsFormattedLong;
        protected MemberLoginCB.HpSpecification _memberLoginAsFormattedMany;
        protected MemberLoginCB.HpSpecification _memberLoginAsEmbeddedCommentClassificationTest;
        protected MemberSecurityCB.HpSpecification _memberSecurityAsOne;
        protected MemberServiceCB.HpSpecification _memberServiceAsOne;
        protected MemberWithdrawalCB.HpSpecification _memberWithdrawalAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MemberCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberName() { return doColumn("MEMBER_NAME"); }
        /**
         * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberAccount() { return doColumn("MEMBER_ACCOUNT"); }
        /**
         * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberStatusCode() { return doColumn("MEMBER_STATUS_CODE"); }
        /**
         * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFormalizedDatetime() { return doColumn("FORMALIZED_DATETIME"); }
        /**
         * (生年月日)BIRTHDATE: {DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBirthdate() { return doColumn("BIRTHDATE"); }
        /**
         * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberStatusCQ) {
                columnMemberStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "member"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberStatusCB.HpSpecification specifyMemberStatus() {
            assertRelation("memberStatus");
            if (_memberStatus == null) {
                _memberStatus = new MemberStatusCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberStatus()
                                    , () -> _qyCall.qy().queryMemberStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberStatus()
                      , () -> xsyncQyCall().qy().queryMemberStatus()));
                }
            }
            return _memberStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValid(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsValid");
            if (_memberAddressAsValid == null) {
                _memberAddressAsValid = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValid()
                                    , () -> _qyCall.qy().queryMemberAddressAsValid(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValid.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValid(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsValid(targetDate); }
                    });
                }
            }
            return _memberAddressAsValid;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValid() {
            assertRelation("memberAddressAsValid");
            if (_memberAddressAsValid == null) {
                _memberAddressAsValid = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValid()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsValid())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValid.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValid()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsValid()));
                }
            }
            return _memberAddressAsValid;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValidBefore(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsValidBefore");
            if (_memberAddressAsValidBefore == null) {
                _memberAddressAsValidBefore = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValidBefore()
                                    , () -> _qyCall.qy().queryMemberAddressAsValidBefore(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValidBefore.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValidBefore(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsValidBefore(targetDate); }
                    });
                }
            }
            return _memberAddressAsValidBefore;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValidBefore() {
            assertRelation("memberAddressAsValidBefore");
            if (_memberAddressAsValidBefore == null) {
                _memberAddressAsValidBefore = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValidBefore()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsValidBefore())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValidBefore.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValidBefore()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsValidBefore()));
                }
            }
            return _memberAddressAsValidBefore;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
         * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLoginStatus(final org.docksidestage.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
            assertRelation("memberLoginAsLoginStatus");
            if (_memberLoginAsLoginStatus == null) {
                _memberLoginAsLoginStatus = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLoginStatus()
                                    , () -> _qyCall.qy().queryMemberLoginAsLoginStatus(statusCode))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLoginStatus.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLoginStatus(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsLoginStatus(statusCode); }
                    });
                }
            }
            return _memberLoginAsLoginStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLoginStatus() {
            assertRelation("memberLoginAsLoginStatus");
            if (_memberLoginAsLoginStatus == null) {
                _memberLoginAsLoginStatus = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLoginStatus()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberLoginAsLoginStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLoginStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLoginStatus()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberLoginAsLoginStatus()));
                }
            }
            return _memberLoginAsLoginStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
         * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsIfComment(final java.time.LocalDate targetDate, final org.docksidestage.mysql.dbflute.allcommon.CDef.Region region) {
            assertRelation("memberAddressAsIfComment");
            if (_memberAddressAsIfComment == null) {
                _memberAddressAsIfComment = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsIfComment()
                                    , () -> _qyCall.qy().queryMemberAddressAsIfComment(targetDate, region))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsIfComment.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsIfComment(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsIfComment(targetDate, region); }
                    });
                }
            }
            return _memberAddressAsIfComment;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsIfComment() {
            assertRelation("memberAddressAsIfComment");
            if (_memberAddressAsIfComment == null) {
                _memberAddressAsIfComment = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsIfComment()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsIfComment())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsIfComment.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsIfComment()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsIfComment()));
                }
            }
            return _memberAddressAsIfComment;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsOnlyOneDate(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsOnlyOneDate");
            if (_memberAddressAsOnlyOneDate == null) {
                _memberAddressAsOnlyOneDate = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsOnlyOneDate()
                                    , () -> _qyCall.qy().queryMemberAddressAsOnlyOneDate(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsOnlyOneDate.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsOnlyOneDate(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsOnlyOneDate(targetDate); }
                    });
                }
            }
            return _memberAddressAsOnlyOneDate;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsOnlyOneDate() {
            assertRelation("memberAddressAsOnlyOneDate");
            if (_memberAddressAsOnlyOneDate == null) {
                _memberAddressAsOnlyOneDate = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsOnlyOneDate()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsOnlyOneDate())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsOnlyOneDate.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsOnlyOneDate()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsOnlyOneDate()));
                }
            }
            return _memberAddressAsOnlyOneDate;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
         * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         * @deprecated the test of dep
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLocalBindOverTest(final Integer displayOrder) {
            assertRelation("memberLoginAsLocalBindOverTest");
            if (_memberLoginAsLocalBindOverTest == null) {
                _memberLoginAsLocalBindOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLocalBindOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsLocalBindOverTest(displayOrder))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLocalBindOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLocalBindOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsLocalBindOverTest(displayOrder); }
                    });
                }
            }
            return _memberLoginAsLocalBindOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLocalBindOverTest() {
            assertRelation("memberLoginAsLocalBindOverTest");
            if (_memberLoginAsLocalBindOverTest == null) {
                _memberLoginAsLocalBindOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLocalBindOverTest()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberLoginAsLocalBindOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLocalBindOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLocalBindOverTest()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberLoginAsLocalBindOverTest()));
                }
            }
            return _memberLoginAsLocalBindOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLocalForeignOverTest() {
            assertRelation("memberLoginAsLocalForeignOverTest");
            if (_memberLoginAsLocalForeignOverTest == null) {
                _memberLoginAsLocalForeignOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLocalForeignOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsLocalForeignOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLocalForeignOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLocalForeignOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsLocalForeignOverTest()));
                }
            }
            return _memberLoginAsLocalForeignOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
         * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignBindOverTest(final Integer displayOrder) {
            assertRelation("memberLoginAsForeignForeignBindOverTest");
            if (_memberLoginAsForeignForeignBindOverTest == null) {
                _memberLoginAsForeignForeignBindOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignBindOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignBindOverTest(displayOrder))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignBindOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignBindOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignBindOverTest(displayOrder); }
                    });
                }
            }
            return _memberLoginAsForeignForeignBindOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignBindOverTest() {
            assertRelation("memberLoginAsForeignForeignBindOverTest");
            if (_memberLoginAsForeignForeignBindOverTest == null) {
                _memberLoginAsForeignForeignBindOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignBindOverTest()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignBindOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignBindOverTest()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest()));
                }
            }
            return _memberLoginAsForeignForeignBindOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignEachOverTest() {
            assertRelation("memberLoginAsForeignForeignEachOverTest");
            if (_memberLoginAsForeignForeignEachOverTest == null) {
                _memberLoginAsForeignForeignEachOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignEachOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignEachOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignEachOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignEachOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsForeignForeignEachOverTest()));
                }
            }
            return _memberLoginAsForeignForeignEachOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedBasicOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedBasicOverTest");
            if (_memberLoginAsForeignForeignOptimizedBasicOverTest == null) {
                _memberLoginAsForeignForeignOptimizedBasicOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedBasicOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedBasicOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedBasicOverTest()));
                }
            }
            return _memberLoginAsForeignForeignOptimizedBasicOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedMarkOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedMarkOverTest");
            if (_memberLoginAsForeignForeignOptimizedMarkOverTest == null) {
                _memberLoginAsForeignForeignOptimizedMarkOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedMarkOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedMarkOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedMarkOverTest()));
                }
            }
            return _memberLoginAsForeignForeignOptimizedMarkOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
         * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
         * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedPartOverTest(final Integer displayOrder, final String memberName) {
            assertRelation("memberLoginAsForeignForeignOptimizedPartOverTest");
            if (_memberLoginAsForeignForeignOptimizedPartOverTest == null) {
                _memberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedPartOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedPartOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedPartOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedPartOverTest");
            if (_memberLoginAsForeignForeignOptimizedPartOverTest == null) {
                _memberLoginAsForeignForeignOptimizedPartOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedPartOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest()));
                }
            }
            return _memberLoginAsForeignForeignOptimizedPartOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
         * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedWholeOverTest(final Integer displayOrder) {
            assertRelation("memberLoginAsForeignForeignOptimizedWholeOverTest");
            if (_memberLoginAsForeignForeignOptimizedWholeOverTest == null) {
                _memberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedWholeOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder); }
                    });
                }
            }
            return _memberLoginAsForeignForeignOptimizedWholeOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignOptimizedWholeOverTest() {
            assertRelation("memberLoginAsForeignForeignOptimizedWholeOverTest");
            if (_memberLoginAsForeignForeignOptimizedWholeOverTest == null) {
                _memberLoginAsForeignForeignOptimizedWholeOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignOptimizedWholeOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()));
                }
            }
            return _memberLoginAsForeignForeignOptimizedWholeOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignParameterOverTest(final java.time.LocalDate targetDate) {
            assertRelation("memberLoginAsForeignForeignParameterOverTest");
            if (_memberLoginAsForeignForeignParameterOverTest == null) {
                _memberLoginAsForeignForeignParameterOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignParameterOverTest(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignParameterOverTest.xsetSyncQyCall(new HpSpQyCall<MemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest(); }
                        public MemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsForeignForeignParameterOverTest(targetDate); }
                    });
                }
            }
            return _memberLoginAsForeignForeignParameterOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignParameterOverTest() {
            assertRelation("memberLoginAsForeignForeignParameterOverTest");
            if (_memberLoginAsForeignForeignParameterOverTest == null) {
                _memberLoginAsForeignForeignParameterOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignParameterOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignParameterOverTest()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest()));
                }
            }
            return _memberLoginAsForeignForeignParameterOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsForeignForeignVariousOverTest() {
            assertRelation("memberLoginAsForeignForeignVariousOverTest");
            if (_memberLoginAsForeignForeignVariousOverTest == null) {
                _memberLoginAsForeignForeignVariousOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsForeignForeignVariousOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsForeignForeignVariousOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsForeignForeignVariousOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsForeignForeignVariousOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsForeignForeignVariousOverTest()));
                }
            }
            return _memberLoginAsForeignForeignVariousOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsReferrerOverTest() {
            assertRelation("memberLoginAsReferrerOverTest");
            if (_memberLoginAsReferrerOverTest == null) {
                _memberLoginAsReferrerOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsReferrerOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsReferrerOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsReferrerOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsReferrerOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsReferrerOverTest()));
                }
            }
            return _memberLoginAsReferrerOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsReferrerForeignOverTest() {
            assertRelation("memberLoginAsReferrerForeignOverTest");
            if (_memberLoginAsReferrerForeignOverTest == null) {
                _memberLoginAsReferrerForeignOverTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsReferrerForeignOverTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsReferrerForeignOverTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsReferrerForeignOverTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsReferrerForeignOverTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsReferrerForeignOverTest()));
                }
            }
            return _memberLoginAsReferrerForeignOverTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLatest() {
            assertRelation("memberLoginAsLatest");
            if (_memberLoginAsLatest == null) {
                _memberLoginAsLatest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLatest()
                                    , () -> _qyCall.qy().queryMemberLoginAsLatest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLatest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLatest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsLatest()));
                }
            }
            return _memberLoginAsLatest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsOldest() {
            assertRelation("memberLoginAsOldest");
            if (_memberLoginAsOldest == null) {
                _memberLoginAsOldest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsOldest()
                                    , () -> _qyCall.qy().queryMemberLoginAsOldest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsOldest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsOldest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsOldest()));
                }
            }
            return _memberLoginAsOldest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedBasic(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsFormattedBasic");
            if (_memberAddressAsFormattedBasic == null) {
                _memberAddressAsFormattedBasic = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedBasic()
                                    , () -> _qyCall.qy().queryMemberAddressAsFormattedBasic(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedBasic.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedBasic(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsFormattedBasic(targetDate); }
                    });
                }
            }
            return _memberAddressAsFormattedBasic;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedBasic() {
            assertRelation("memberAddressAsFormattedBasic");
            if (_memberAddressAsFormattedBasic == null) {
                _memberAddressAsFormattedBasic = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedBasic()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsFormattedBasic())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedBasic.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedBasic()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsFormattedBasic()));
                }
            }
            return _memberAddressAsFormattedBasic;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedLong(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsFormattedLong");
            if (_memberAddressAsFormattedLong == null) {
                _memberAddressAsFormattedLong = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedLong()
                                    , () -> _qyCall.qy().queryMemberAddressAsFormattedLong(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedLong.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedLong(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsFormattedLong(targetDate); }
                    });
                }
            }
            return _memberAddressAsFormattedLong;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsFormattedLong() {
            assertRelation("memberAddressAsFormattedLong");
            if (_memberAddressAsFormattedLong == null) {
                _memberAddressAsFormattedLong = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsFormattedLong()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsFormattedLong())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsFormattedLong.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsFormattedLong()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsFormattedLong()));
                }
            }
            return _memberAddressAsFormattedLong;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsFormattedMany() {
            assertRelation("memberLoginAsFormattedMany");
            if (_memberLoginAsFormattedMany == null) {
                _memberLoginAsFormattedMany = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsFormattedMany()
                                    , () -> _qyCall.qy().queryMemberLoginAsFormattedMany())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsFormattedMany.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsFormattedMany()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsFormattedMany()));
                }
            }
            return _memberLoginAsFormattedMany;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsEmbeddedCommentClassificationTest() {
            assertRelation("memberLoginAsEmbeddedCommentClassificationTest");
            if (_memberLoginAsEmbeddedCommentClassificationTest == null) {
                _memberLoginAsEmbeddedCommentClassificationTest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsEmbeddedCommentClassificationTest()
                                    , () -> _qyCall.qy().queryMemberLoginAsEmbeddedCommentClassificationTest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsEmbeddedCommentClassificationTest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsEmbeddedCommentClassificationTest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsEmbeddedCommentClassificationTest()));
                }
            }
            return _memberLoginAsEmbeddedCommentClassificationTest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberSecurityCB.HpSpecification specifyMemberSecurityAsOne() {
            assertRelation("memberSecurityAsOne");
            if (_memberSecurityAsOne == null) {
                _memberSecurityAsOne = new MemberSecurityCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberSecurityAsOne()
                                    , () -> _qyCall.qy().queryMemberSecurityAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberSecurityAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberSecurityAsOne()
                      , () -> xsyncQyCall().qy().queryMemberSecurityAsOne()));
                }
            }
            return _memberSecurityAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberServiceCB.HpSpecification specifyMemberServiceAsOne() {
            assertRelation("memberServiceAsOne");
            if (_memberServiceAsOne == null) {
                _memberServiceAsOne = new MemberServiceCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberServiceAsOne()
                                    , () -> _qyCall.qy().queryMemberServiceAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberServiceAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberServiceAsOne()
                      , () -> xsyncQyCall().qy().queryMemberServiceAsOne()));
                }
            }
            return _memberServiceAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberWithdrawalCB.HpSpecification specifyMemberWithdrawalAsOne() {
            assertRelation("memberWithdrawalAsOne");
            if (_memberWithdrawalAsOne == null) {
                _memberWithdrawalAsOne = new MemberWithdrawalCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberWithdrawalAsOne()
                                    , () -> _qyCall.qy().queryMemberWithdrawalAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberWithdrawalAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberWithdrawalAsOne()
                      , () -> xsyncQyCall().qy().queryMemberWithdrawalAsOne()));
                }
            }
            return _memberWithdrawalAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from member_address where ...) as FOO_MAX} <br>
         * (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     addressCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     addressCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MemberAddress.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<MemberAddressCB, MemberCQ> derivedMemberAddress() {
            assertDerived("memberAddressList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MemberAddressCB> sq, MemberCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMemberAddressList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from member_login where ...) as FOO_MAX} <br>
         * (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loginCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loginCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MemberLogin.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<MemberLoginCB, MemberCQ> derivedMemberLogin() {
            assertDerived("memberLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MemberLoginCB> sq, MemberCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMemberLoginList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from purchase where ...) as FOO_MAX} <br>
         * (購入)purchase by MEMBER_ID, named 'purchaseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     purchaseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, Purchase.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<PurchaseCB, MemberCQ> derivedPurchase() {
            assertDerived("purchaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PurchaseCB> sq, MemberCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderivePurchaseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public org.dbflute.cbean.chelper.dbms.HpSDRFunctionMySql<MemberCB, MemberCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MemberCB> sq, MemberCQ cq, String al, DerivedReferrerOption op)
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
    public MemberCB dreamCruiseCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForDreamCruise((MemberCB) this);
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
    public HpColQyOperand.HpExtendedColQyOperandMySql<MemberCB> columnQuery(final SpecifyQuery<MemberCB> colCBLambda) {
        return xcreateColQyOperandMySql((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MemberCB xcreateColumnQueryCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForColumnQuery((MemberCB)this);
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
    public void orScopeQuery(OrQuery<MemberCB> orCBLambda) {
        xorSQ((MemberCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MemberCB> andCBLambda) {
        xorSQAP((MemberCB)this, andCBLambda);
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
        final MemberCB cb;
        if (mainCB != null) {
            cb = (MemberCB)mainCB;
        } else {
            cb = new MemberCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MemberCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MemberCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
