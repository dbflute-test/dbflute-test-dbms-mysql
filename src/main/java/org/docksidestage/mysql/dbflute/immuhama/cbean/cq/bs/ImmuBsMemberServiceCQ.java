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
 * The base condition-query of member_service.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsMemberServiceCQ extends ImmuAbstractBsMemberServiceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuMemberServiceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsMemberServiceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_service) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuMemberServiceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuMemberServiceCIQ xcreateCIQ() {
        ImmuMemberServiceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuMemberServiceCIQ xnewCIQ() {
        return new ImmuMemberServiceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_service on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuMemberServiceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuMemberServiceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberServiceId;
    public ConditionValue xdfgetMemberServiceId()
    { if (_memberServiceId == null) { _memberServiceId = nCV(); }
      return _memberServiceId; }
    protected ConditionValue xgetCValueMemberServiceId() { return xdfgetMemberServiceId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_MemberServiceId_Asc() { regOBA("MEMBER_SERVICE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_MemberServiceId_Desc() { regOBD("MEMBER_SERVICE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _servicePointCount;
    public ConditionValue xdfgetServicePointCount()
    { if (_servicePointCount == null) { _servicePointCount = nCV(); }
      return _servicePointCount; }
    protected ConditionValue xgetCValueServicePointCount() { return xdfgetServicePointCount(); }

    /**
     * Add order-by as ascend. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_ServicePointCount_Asc() { regOBA("SERVICE_POINT_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_ServicePointCount_Desc() { regOBD("SERVICE_POINT_COUNT"); return this; }

    protected ConditionValue _serviceRankCode;
    public ConditionValue xdfgetServiceRankCode()
    { if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
      return _serviceRankCode; }
    protected ConditionValue xgetCValueServiceRankCode() { return xdfgetServiceRankCode(); }

    /**
     * Add order-by as ascend. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to cdef_service_rank}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_ServiceRankCode_Asc() { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to cdef_service_rank}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_ServiceRankCode_Desc() { regOBD("SERVICE_RANK_CODE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberServiceCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public ImmuBsMemberServiceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsMemberServiceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuMemberServiceCQ bq = (ImmuMemberServiceCQ)bqs;
        ImmuMemberServiceCQ uq = (ImmuMemberServiceCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryCdefServiceRank()) {
            uq.queryCdefServiceRank().reflectRelationOnUnionQuery(bq.queryCdefServiceRank(), uq.queryCdefServiceRank());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public ImmuMemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("member_service", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]サービスランク)CDEF_SERVICE_RANK by my SERVICE_RANK_CODE, named 'cdefServiceRank'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuCdefServiceRankCQ queryCdefServiceRank() {
        return xdfgetConditionQueryCdefServiceRank();
    }
    public ImmuCdefServiceRankCQ xdfgetConditionQueryCdefServiceRank() {
        String prop = "cdefServiceRank";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCdefServiceRank()); xsetupOuterJoinCdefServiceRank(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuCdefServiceRankCQ xcreateQueryCdefServiceRank() {
        String nrp = xresolveNRP("member_service", "cdefServiceRank"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuCdefServiceRankCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cdefServiceRank", nrp);
    }
    protected void xsetupOuterJoinCdefServiceRank() { xregOutJo("cdefServiceRank"); }
    public boolean hasConditionQueryCdefServiceRank() { return xhasQueRlMap("cdefServiceRank"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuMemberServiceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuMemberServiceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuMemberServiceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuMemberServiceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuMemberServiceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuMemberServiceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuMemberServiceCQ> _myselfExistsMap;
    public Map<String, ImmuMemberServiceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuMemberServiceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuMemberServiceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuMemberServiceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuMemberServiceCB.class.getName(); }
    protected String xCQ() { return ImmuMemberServiceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
