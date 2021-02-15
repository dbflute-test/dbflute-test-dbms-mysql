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
 * The base condition-query of member.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsMemberCQ extends ImmuAbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuMemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuMemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuMemberCIQ xcreateCIQ() {
        ImmuMemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuMemberCIQ xnewCIQ() {
        return new ImmuMemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuMemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuMemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    public Map<String, ImmuMemberAddressCQ> xdfgetMemberId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_ExistsReferrer_MemberAddressList"); }
    public String keepMemberId_ExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList() { return xgetSQueMap("memberId_ExistsReferrer_MemberFollowingByMyMemberIdList"); }
    public String keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberFollowingByMyMemberIdList", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList() { return xgetSQueMap("memberId_ExistsReferrer_MemberFollowingByYourMemberIdList"); }
    public String keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberFollowingByYourMemberIdList", sq); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberId_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_ExistsReferrer_MemberLoginList"); }
    public String keepMemberId_ExistsReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetMemberId_ExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_ExistsReferrer_PurchaseList"); }
    public String keepMemberId_ExistsReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("memberId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, ImmuMemberAddressCQ> xdfgetMemberId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberAddressList"); }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberFollowingByMyMemberIdList"); }
    public String keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberFollowingByMyMemberIdList", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberFollowingByYourMemberIdList"); }
    public String keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberFollowingByYourMemberIdList", sq); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberId_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetMemberId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_NotExistsReferrer_PurchaseList"); }
    public String keepMemberId_NotExistsReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, ImmuMemberAddressCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList", sq); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList", sq); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetMemberId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, ImmuMemberAddressCQ> xdfgetMemberId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberAddressList", pm); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList", pm); }

    public Map<String, ImmuMemberFollowingCQ> xdfgetMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList", pm); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberId_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberLoginList", pm); }

    public Map<String, ImmuPurchaseCQ> xdfgetMemberId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_PurchaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue xdfgetMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue xgetCValueMemberName() { return xdfgetMemberName(); }

    /**
     * Add order-by as ascend. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue xdfgetMemberAccount()
    { if (_memberAccount == null) { _memberAccount = nCV(); }
      return _memberAccount; }
    protected ConditionValue xgetCValueMemberAccount() { return xdfgetMemberAccount(); }

    /**
     * Add order-by as ascend. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue xdfgetFormalizedDatetime()
    { if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
      return _formalizedDatetime; }
    protected ConditionValue xgetCValueFormalizedDatetime() { return xdfgetFormalizedDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue xdfgetBirthdate()
    { if (_birthdate == null) { _birthdate = nCV(); }
      return _birthdate; }
    protected ConditionValue xgetCValueBirthdate() { return xdfgetBirthdate(); }

    /**
     * Add order-by as ascend. <br>
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

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
    public ImmuBsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public ImmuBsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public ImmuBsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public ImmuBsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuMemberCQ bq = (ImmuMemberCQ)bqs;
        ImmuMemberCQ uq = (ImmuMemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberSecurityAsOne()) {
            uq.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(bq.queryMemberSecurityAsOne(), uq.queryMemberSecurityAsOne());
        }
        if (bq.hasConditionQueryMemberServiceAsOne()) {
            uq.queryMemberServiceAsOne().reflectRelationOnUnionQuery(bq.queryMemberServiceAsOne(), uq.queryMemberServiceAsOne());
        }
        if (bq.hasConditionQueryMemberWithdrawalAsOne()) {
            uq.queryMemberWithdrawalAsOne().reflectRelationOnUnionQuery(bq.queryMemberWithdrawalAsOne(), uq.queryMemberWithdrawalAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberStatusCQ queryMemberStatus() {
        return xdfgetConditionQueryMemberStatus();
    }
    public ImmuMemberStatusCQ xdfgetConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("member", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberSecurityCQ queryMemberSecurityAsOne() { return xdfgetConditionQueryMemberSecurityAsOne(); }
    public ImmuMemberSecurityCQ xdfgetConditionQueryMemberSecurityAsOne() {
        String prop = "memberSecurityAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberSecurityAsOne()); xsetupOuterJoinMemberSecurityAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = xresolveNRP("member", "memberSecurityAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberSecurityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberSecurityAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() { xregOutJo("memberSecurityAsOne"); }
    public boolean hasConditionQueryMemberSecurityAsOne() { return xhasQueRlMap("memberSecurityAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberServiceCQ queryMemberServiceAsOne() { return xdfgetConditionQueryMemberServiceAsOne(); }
    public ImmuMemberServiceCQ xdfgetConditionQueryMemberServiceAsOne() {
        String prop = "memberServiceAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberServiceAsOne()); xsetupOuterJoinMemberServiceAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberServiceCQ xcreateQueryMemberServiceAsOne() {
        String nrp = xresolveNRP("member", "memberServiceAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberServiceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberServiceAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberServiceAsOne() { xregOutJo("memberServiceAsOne"); }
    public boolean hasConditionQueryMemberServiceAsOne() { return xhasQueRlMap("memberServiceAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberWithdrawalCQ queryMemberWithdrawalAsOne() { return xdfgetConditionQueryMemberWithdrawalAsOne(); }
    public ImmuMemberWithdrawalCQ xdfgetConditionQueryMemberWithdrawalAsOne() {
        String prop = "memberWithdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberWithdrawalAsOne()); xsetupOuterJoinMemberWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberWithdrawalCQ xcreateQueryMemberWithdrawalAsOne() {
        String nrp = xresolveNRP("member", "memberWithdrawalAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberWithdrawalAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberWithdrawalAsOne() { xregOutJo("memberWithdrawalAsOne"); }
    public boolean hasConditionQueryMemberWithdrawalAsOne() { return xhasQueRlMap("memberWithdrawalAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuMemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuMemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuMemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuMemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuMemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuMemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuMemberCQ> _myselfExistsMap;
    public Map<String, ImmuMemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuMemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuMemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuMemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuMemberCB.class.getName(); }
    protected String xCQ() { return ImmuMemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}