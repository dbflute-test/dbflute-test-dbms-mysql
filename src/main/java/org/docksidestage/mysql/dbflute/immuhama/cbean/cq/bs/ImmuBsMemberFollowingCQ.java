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
package org.docksidestage.mysql.dbflute.immuhama.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.ciq.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.*;

/**
 * The base condition-query of member_following.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsMemberFollowingCQ extends ImmuAbstractBsMemberFollowingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuMemberFollowingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsMemberFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_following) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuMemberFollowingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuMemberFollowingCIQ xcreateCIQ() {
        ImmuMemberFollowingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuMemberFollowingCIQ xnewCIQ() {
        return new ImmuMemberFollowingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_following on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuMemberFollowingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuMemberFollowingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberFollowingId;
    public ConditionValue xdfgetMemberFollowingId()
    { if (_memberFollowingId == null) { _memberFollowingId = nCV(); }
      return _memberFollowingId; }
    protected ConditionValue xgetCValueMemberFollowingId() { return xdfgetMemberFollowingId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_MemberFollowingId_Asc() { regOBA("MEMBER_FOLLOWING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_MemberFollowingId_Desc() { regOBD("MEMBER_FOLLOWING_ID"); return this; }

    protected ConditionValue _myMemberId;
    public ConditionValue xdfgetMyMemberId()
    { if (_myMemberId == null) { _myMemberId = nCV(); }
      return _myMemberId; }
    protected ConditionValue xgetCValueMyMemberId() { return xdfgetMyMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_MyMemberId_Asc() { regOBA("MY_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_MyMemberId_Desc() { regOBD("MY_MEMBER_ID"); return this; }

    protected ConditionValue _yourMemberId;
    public ConditionValue xdfgetYourMemberId()
    { if (_yourMemberId == null) { _yourMemberId = nCV(); }
      return _yourMemberId; }
    protected ConditionValue xgetCValueYourMemberId() { return xdfgetYourMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_YourMemberId_Asc() { regOBA("YOUR_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_YourMemberId_Desc() { regOBD("YOUR_MEMBER_ID"); return this; }

    protected ConditionValue _followDatetime;
    public ConditionValue xdfgetFollowDatetime()
    { if (_followDatetime == null) { _followDatetime = nCV(); }
      return _followDatetime; }
    protected ConditionValue xgetCValueFollowDatetime() { return xdfgetFollowDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_FollowDatetime_Asc() { regOBA("FOLLOW_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addOrderBy_FollowDatetime_Desc() { regOBD("FOLLOW_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public ImmuBsMemberFollowingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuMemberFollowingCQ bq = (ImmuMemberFollowingCQ)bqs;
        ImmuMemberFollowingCQ uq = (ImmuMemberFollowingCQ)uqs;
        if (bq.hasConditionQueryMemberByMyMemberId()) {
            uq.queryMemberByMyMemberId().reflectRelationOnUnionQuery(bq.queryMemberByMyMemberId(), uq.queryMemberByMyMemberId());
        }
        if (bq.hasConditionQueryMemberByYourMemberId()) {
            uq.queryMemberByYourMemberId().reflectRelationOnUnionQuery(bq.queryMemberByYourMemberId(), uq.queryMemberByYourMemberId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberCQ queryMemberByMyMemberId() {
        return xdfgetConditionQueryMemberByMyMemberId();
    }
    public ImmuMemberCQ xdfgetConditionQueryMemberByMyMemberId() {
        String prop = "memberByMyMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByMyMemberId()); xsetupOuterJoinMemberByMyMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberCQ xcreateQueryMemberByMyMemberId() {
        String nrp = xresolveNRP("member_following", "memberByMyMemberId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByMyMemberId", nrp);
    }
    protected void xsetupOuterJoinMemberByMyMemberId() { xregOutJo("memberByMyMemberId"); }
    public boolean hasConditionQueryMemberByMyMemberId() { return xhasQueRlMap("memberByMyMemberId"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberCQ queryMemberByYourMemberId() {
        return xdfgetConditionQueryMemberByYourMemberId();
    }
    public ImmuMemberCQ xdfgetConditionQueryMemberByYourMemberId() {
        String prop = "memberByYourMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByYourMemberId()); xsetupOuterJoinMemberByYourMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberCQ xcreateQueryMemberByYourMemberId() {
        String nrp = xresolveNRP("member_following", "memberByYourMemberId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByYourMemberId", nrp);
    }
    protected void xsetupOuterJoinMemberByYourMemberId() { xregOutJo("memberByYourMemberId"); }
    public boolean hasConditionQueryMemberByYourMemberId() { return xhasQueRlMap("memberByYourMemberId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuMemberFollowingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuMemberFollowingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuMemberFollowingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuMemberFollowingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuMemberFollowingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuMemberFollowingCQ> _myselfExistsMap;
    public Map<String, ImmuMemberFollowingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuMemberFollowingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuMemberFollowingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuMemberFollowingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuMemberFollowingCB.class.getName(); }
    protected String xCQ() { return ImmuMemberFollowingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
