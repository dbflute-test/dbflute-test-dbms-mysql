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
 * The base condition-query of member_withdrawal.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsMemberWithdrawalCQ extends ImmuAbstractBsMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuMemberWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsMemberWithdrawalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_withdrawal) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuMemberWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuMemberWithdrawalCIQ xcreateCIQ() {
        ImmuMemberWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuMemberWithdrawalCIQ xnewCIQ() {
        return new ImmuMemberWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_withdrawal on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuMemberWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuMemberWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue xdfgetWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return xdfgetWithdrawalReasonCode(); }

    /**
     * Add order-by as ascend. <br>
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, NotNull, CHAR(3), FK to cdef_withdrawal_reason, classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, NotNull, CHAR(3), FK to cdef_withdrawal_reason, classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue xdfgetWithdrawalReasonInputText()
    { if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
      return _withdrawalReasonInputText; }
    protected ConditionValue xgetCValueWithdrawalReasonInputText() { return xdfgetWithdrawalReasonInputText(); }

    /**
     * Add order-by as ascend. <br>
     * (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue xdfgetWithdrawalDatetime()
    { if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
      return _withdrawalDatetime; }
    protected ConditionValue xgetCValueWithdrawalDatetime() { return xdfgetWithdrawalDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (退会日時)WITHDRAWAL_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("WITHDRAWAL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会日時)WITHDRAWAL_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("WITHDRAWAL_DATETIME"); return this; }

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
    public ImmuBsMemberWithdrawalCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public ImmuBsMemberWithdrawalCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public ImmuBsMemberWithdrawalCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public ImmuBsMemberWithdrawalCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberWithdrawalCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public ImmuBsMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuMemberWithdrawalCQ bq = (ImmuMemberWithdrawalCQ)bqs;
        ImmuMemberWithdrawalCQ uq = (ImmuMemberWithdrawalCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryCdefWithdrawalReason()) {
            uq.queryCdefWithdrawalReason().reflectRelationOnUnionQuery(bq.queryCdefWithdrawalReason(), uq.queryCdefWithdrawalReason());
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
        String nrp = xresolveNRP("member_withdrawal", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]退会理由)CDEF_WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'cdefWithdrawalReason'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuCdefWithdrawalReasonCQ queryCdefWithdrawalReason() {
        return xdfgetConditionQueryCdefWithdrawalReason();
    }
    public ImmuCdefWithdrawalReasonCQ xdfgetConditionQueryCdefWithdrawalReason() {
        String prop = "cdefWithdrawalReason";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCdefWithdrawalReason()); xsetupOuterJoinCdefWithdrawalReason(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuCdefWithdrawalReasonCQ xcreateQueryCdefWithdrawalReason() {
        String nrp = xresolveNRP("member_withdrawal", "cdefWithdrawalReason"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuCdefWithdrawalReasonCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cdefWithdrawalReason", nrp);
    }
    protected void xsetupOuterJoinCdefWithdrawalReason() { xregOutJo("cdefWithdrawalReason"); }
    public boolean hasConditionQueryCdefWithdrawalReason() { return xhasQueRlMap("cdefWithdrawalReason"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuMemberWithdrawalCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuMemberWithdrawalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuMemberWithdrawalCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuMemberWithdrawalCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuMemberWithdrawalCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuMemberWithdrawalCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuMemberWithdrawalCQ> _myselfExistsMap;
    public Map<String, ImmuMemberWithdrawalCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuMemberWithdrawalCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuMemberWithdrawalCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuMemberWithdrawalCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuMemberWithdrawalCB.class.getName(); }
    protected String xCQ() { return ImmuMemberWithdrawalCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
