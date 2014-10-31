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
package org.docksidestage.mysql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.mysql.dbflute.cbean.cq.ciq.*;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of member.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
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
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    public Map<String, MemberAddressCQ> xdfgetMemberId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_ExistsReferrer_MemberAddressList"); }
    public String keepMemberId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> xdfgetMemberId_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_ExistsReferrer_MemberLoginList"); }
    public String keepMemberId_ExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, PurchaseCQ> xdfgetMemberId_ExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_ExistsReferrer_PurchaseList"); }
    public String keepMemberId_ExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> xdfgetMemberId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberAddressList"); }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> xdfgetMemberId_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberId_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, PurchaseCQ> xdfgetMemberId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("memberId_NotExistsReferrer_PurchaseList"); }
    public String keepMemberId_NotExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, MemberLoginCQ> xdfgetMemberId_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, PurchaseCQ> xdfgetMemberId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, MemberAddressCQ> xdfgetMemberId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberAddressList", pm); }

    public Map<String, MemberLoginCQ> xdfgetMemberId_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_MemberLoginList", pm); }

    public Map<String, PurchaseCQ> xdfgetMemberId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_PurchaseList"); }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_PurchaseList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

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
    public BsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

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
    public BsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

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
    public BsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

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
    public BsMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

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
    public BsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberCQ bq = (MemberCQ)bqs;
        MemberCQ uq = (MemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberAddressAsValid()) {
            uq.xsetParameterMapMemberAddressAsValid(bq.xdfgetParameterMapMemberAddressAsValid());
            uq.xdfgetConditionQueryMemberAddressAsValid().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsValid(), uq.xdfgetConditionQueryMemberAddressAsValid());
        }
        if (bq.hasConditionQueryMemberAddressAsValidBefore()) {
            uq.xsetParameterMapMemberAddressAsValidBefore(bq.xdfgetParameterMapMemberAddressAsValidBefore());
            uq.xdfgetConditionQueryMemberAddressAsValidBefore().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsValidBefore(), uq.xdfgetConditionQueryMemberAddressAsValidBefore());
        }
        if (bq.hasConditionQueryMemberLoginAsLoginStatus()) {
            uq.xsetParameterMapMemberLoginAsLoginStatus(bq.xdfgetParameterMapMemberLoginAsLoginStatus());
            uq.xdfgetConditionQueryMemberLoginAsLoginStatus().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberLoginAsLoginStatus(), uq.xdfgetConditionQueryMemberLoginAsLoginStatus());
        }
        if (bq.hasConditionQueryMemberAddressAsIfComment()) {
            uq.xsetParameterMapMemberAddressAsIfComment(bq.xdfgetParameterMapMemberAddressAsIfComment());
            uq.xdfgetConditionQueryMemberAddressAsIfComment().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsIfComment(), uq.xdfgetConditionQueryMemberAddressAsIfComment());
        }
        if (bq.hasConditionQueryMemberAddressAsOnlyOneDate()) {
            uq.xsetParameterMapMemberAddressAsOnlyOneDate(bq.xdfgetParameterMapMemberAddressAsOnlyOneDate());
            uq.xdfgetConditionQueryMemberAddressAsOnlyOneDate().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsOnlyOneDate(), uq.xdfgetConditionQueryMemberAddressAsOnlyOneDate());
        }
        if (bq.hasConditionQueryMemberLoginAsLocalBindOverTest()) {
            uq.xsetParameterMapMemberLoginAsLocalBindOverTest(bq.xdfgetParameterMapMemberLoginAsLocalBindOverTest());
            uq.xdfgetConditionQueryMemberLoginAsLocalBindOverTest().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberLoginAsLocalBindOverTest(), uq.xdfgetConditionQueryMemberLoginAsLocalBindOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsLocalForeignOverTest()) {
            uq.queryMemberLoginAsLocalForeignOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsLocalForeignOverTest(), uq.queryMemberLoginAsLocalForeignOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignBindOverTest()) {
            uq.xsetParameterMapMemberLoginAsForeignForeignBindOverTest(bq.xdfgetParameterMapMemberLoginAsForeignForeignBindOverTest());
            uq.xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest(), uq.xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignEachOverTest()) {
            uq.queryMemberLoginAsForeignForeignEachOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsForeignForeignEachOverTest(), uq.queryMemberLoginAsForeignForeignEachOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest()) {
            uq.queryMemberLoginAsForeignForeignOptimizedBasicOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsForeignForeignOptimizedBasicOverTest(), uq.queryMemberLoginAsForeignForeignOptimizedBasicOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest()) {
            uq.queryMemberLoginAsForeignForeignOptimizedMarkOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsForeignForeignOptimizedMarkOverTest(), uq.queryMemberLoginAsForeignForeignOptimizedMarkOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest()) {
            uq.xsetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest(bq.xdfgetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest());
            uq.xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(), uq.xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()) {
            uq.xsetParameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest(bq.xdfgetParameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest());
            uq.xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest(), uq.xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignParameterOverTest()) {
            uq.xsetParameterMapMemberLoginAsForeignForeignParameterOverTest(bq.xdfgetParameterMapMemberLoginAsForeignForeignParameterOverTest());
            uq.xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest(), uq.xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsForeignForeignVariousOverTest()) {
            uq.queryMemberLoginAsForeignForeignVariousOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsForeignForeignVariousOverTest(), uq.queryMemberLoginAsForeignForeignVariousOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsReferrerOverTest()) {
            uq.queryMemberLoginAsReferrerOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsReferrerOverTest(), uq.queryMemberLoginAsReferrerOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsReferrerForeignOverTest()) {
            uq.queryMemberLoginAsReferrerForeignOverTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsReferrerForeignOverTest(), uq.queryMemberLoginAsReferrerForeignOverTest());
        }
        if (bq.hasConditionQueryMemberLoginAsLatest()) {
            uq.queryMemberLoginAsLatest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsLatest(), uq.queryMemberLoginAsLatest());
        }
        if (bq.hasConditionQueryMemberLoginAsOldest()) {
            uq.queryMemberLoginAsOldest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsOldest(), uq.queryMemberLoginAsOldest());
        }
        if (bq.hasConditionQueryMemberAddressAsFormattedBasic()) {
            uq.xsetParameterMapMemberAddressAsFormattedBasic(bq.xdfgetParameterMapMemberAddressAsFormattedBasic());
            uq.xdfgetConditionQueryMemberAddressAsFormattedBasic().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsFormattedBasic(), uq.xdfgetConditionQueryMemberAddressAsFormattedBasic());
        }
        if (bq.hasConditionQueryMemberAddressAsFormattedLong()) {
            uq.xsetParameterMapMemberAddressAsFormattedLong(bq.xdfgetParameterMapMemberAddressAsFormattedLong());
            uq.xdfgetConditionQueryMemberAddressAsFormattedLong().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMemberAddressAsFormattedLong(), uq.xdfgetConditionQueryMemberAddressAsFormattedLong());
        }
        if (bq.hasConditionQueryMemberLoginAsFormattedMany()) {
            uq.queryMemberLoginAsFormattedMany().reflectRelationOnUnionQuery(bq.queryMemberLoginAsFormattedMany(), uq.queryMemberLoginAsFormattedMany());
        }
        if (bq.hasConditionQueryMemberLoginAsEmbeddedCommentClassificationTest()) {
            uq.queryMemberLoginAsEmbeddedCommentClassificationTest().reflectRelationOnUnionQuery(bq.queryMemberLoginAsEmbeddedCommentClassificationTest(), uq.queryMemberLoginAsEmbeddedCommentClassificationTest());
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
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return xdfgetConditionQueryMemberStatus();
    }
    public MemberStatusCQ xdfgetConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("member", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsValid(java.util.Date targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsValid();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberAddressAsValid", parameterMap);
        return xdfgetConditionQueryMemberAddressAsValid();
    }
    public MemberAddressCQ xdfgetConditionQueryMemberAddressAsValid() {
        String prop = "memberAddressAsValid";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsValid()); xsetupOuterJoinMemberAddressAsValid(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsValid;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsValid()
    { if (_parameterMapMemberAddressAsValid == null) { _parameterMapMemberAddressAsValid = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsValid; }
    public void xsetParameterMapMemberAddressAsValid(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsValid = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsValid() {
        String nrp = xresolveNRP("member", "memberAddressAsValid"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsValid", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsValid() { xregOutJo("memberAddressAsValid"); }
    public boolean hasConditionQueryMemberAddressAsValid() { return xhasQueRlMap("memberAddressAsValid"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsValidBefore(java.util.Date targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsValidBefore();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberAddressAsValidBefore", parameterMap);
        return xdfgetConditionQueryMemberAddressAsValidBefore();
    }
    public MemberAddressCQ xdfgetConditionQueryMemberAddressAsValidBefore() {
        String prop = "memberAddressAsValidBefore";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsValidBefore()); xsetupOuterJoinMemberAddressAsValidBefore(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsValidBefore;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsValidBefore()
    { if (_parameterMapMemberAddressAsValidBefore == null) { _parameterMapMemberAddressAsValidBefore = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsValidBefore; }
    public void xsetParameterMapMemberAddressAsValidBefore(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsValidBefore = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsValidBefore() {
        String nrp = xresolveNRP("member", "memberAddressAsValidBefore"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsValidBefore", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsValidBefore() { xregOutJo("memberAddressAsValidBefore"); }
    public boolean hasConditionQueryMemberAddressAsValidBefore() { return xhasQueRlMap("memberAddressAsValidBefore"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLoginStatus(org.docksidestage.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberLoginAsLoginStatus();
        parameterMap.put("statusCode", statusCode);
        xassertFCDP("memberLoginAsLoginStatus", parameterMap);
        return xdfgetConditionQueryMemberLoginAsLoginStatus();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsLoginStatus() {
        String prop = "memberLoginAsLoginStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsLoginStatus()); xsetupOuterJoinMemberLoginAsLoginStatus(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberLoginAsLoginStatus;
    public Map<String, Object> xdfgetParameterMapMemberLoginAsLoginStatus()
    { if (_parameterMapMemberLoginAsLoginStatus == null) { _parameterMapMemberLoginAsLoginStatus = newLinkedHashMapSized(4); }
      return _parameterMapMemberLoginAsLoginStatus; }
    public void xsetParameterMapMemberLoginAsLoginStatus(Map<String, Object> parameterMap)
    { _parameterMapMemberLoginAsLoginStatus = parameterMap; } // for UnionQuery
    protected MemberLoginCQ xcreateQueryMemberLoginAsLoginStatus() {
        String nrp = xresolveNRP("member", "memberLoginAsLoginStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsLoginStatus", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsLoginStatus() { xregOutJo("memberLoginAsLoginStatus"); }
    public boolean hasConditionQueryMemberLoginAsLoginStatus() { return xhasQueRlMap("memberLoginAsLoginStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
     * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsIfComment(java.util.Date targetDate, org.docksidestage.mysql.dbflute.allcommon.CDef.Region region) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsIfComment();
        parameterMap.put("targetDate", fCTPD(targetDate));parameterMap.put("region", region);
        xassertFCDP("memberAddressAsIfComment", parameterMap);
        return xdfgetConditionQueryMemberAddressAsIfComment();
    }
    public MemberAddressCQ xdfgetConditionQueryMemberAddressAsIfComment() {
        String prop = "memberAddressAsIfComment";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsIfComment()); xsetupOuterJoinMemberAddressAsIfComment(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsIfComment;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsIfComment()
    { if (_parameterMapMemberAddressAsIfComment == null) { _parameterMapMemberAddressAsIfComment = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsIfComment; }
    public void xsetParameterMapMemberAddressAsIfComment(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsIfComment = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsIfComment() {
        String nrp = xresolveNRP("member", "memberAddressAsIfComment"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsIfComment", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsIfComment() { xregOutJo("memberAddressAsIfComment"); }
    public boolean hasConditionQueryMemberAddressAsIfComment() { return xhasQueRlMap("memberAddressAsIfComment"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsOnlyOneDate(java.util.Date targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsOnlyOneDate();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberAddressAsOnlyOneDate", parameterMap);
        return xdfgetConditionQueryMemberAddressAsOnlyOneDate();
    }
    public MemberAddressCQ xdfgetConditionQueryMemberAddressAsOnlyOneDate() {
        String prop = "memberAddressAsOnlyOneDate";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsOnlyOneDate()); xsetupOuterJoinMemberAddressAsOnlyOneDate(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsOnlyOneDate;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsOnlyOneDate()
    { if (_parameterMapMemberAddressAsOnlyOneDate == null) { _parameterMapMemberAddressAsOnlyOneDate = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsOnlyOneDate; }
    public void xsetParameterMapMemberAddressAsOnlyOneDate(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsOnlyOneDate = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsOnlyOneDate() {
        String nrp = xresolveNRP("member", "memberAddressAsOnlyOneDate"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsOnlyOneDate", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsOnlyOneDate() { xregOutJo("memberAddressAsOnlyOneDate"); }
    public boolean hasConditionQueryMemberAddressAsOnlyOneDate() { return xhasQueRlMap("memberAddressAsOnlyOneDate"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The instance of condition-query. (NotNull)
     * @deprecated the test of dep
     */
    public MemberLoginCQ queryMemberLoginAsLocalBindOverTest(Integer displayOrder) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberLoginAsLocalBindOverTest();
        parameterMap.put("displayOrder", displayOrder);
        xassertFCDP("memberLoginAsLocalBindOverTest", parameterMap);
        return xdfgetConditionQueryMemberLoginAsLocalBindOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsLocalBindOverTest() {
        String prop = "memberLoginAsLocalBindOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsLocalBindOverTest()); xsetupOuterJoinMemberLoginAsLocalBindOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberLoginAsLocalBindOverTest;
    public Map<String, Object> xdfgetParameterMapMemberLoginAsLocalBindOverTest()
    { if (_parameterMapMemberLoginAsLocalBindOverTest == null) { _parameterMapMemberLoginAsLocalBindOverTest = newLinkedHashMapSized(4); }
      return _parameterMapMemberLoginAsLocalBindOverTest; }
    public void xsetParameterMapMemberLoginAsLocalBindOverTest(Map<String, Object> parameterMap)
    { _parameterMapMemberLoginAsLocalBindOverTest = parameterMap; } // for UnionQuery
    protected MemberLoginCQ xcreateQueryMemberLoginAsLocalBindOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsLocalBindOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsLocalBindOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsLocalBindOverTest() { xregOutJo("memberLoginAsLocalBindOverTest"); }
    public boolean hasConditionQueryMemberLoginAsLocalBindOverTest() { return xhasQueRlMap("memberLoginAsLocalBindOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLocalForeignOverTest() {
        return xdfgetConditionQueryMemberLoginAsLocalForeignOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsLocalForeignOverTest() {
        String prop = "memberLoginAsLocalForeignOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsLocalForeignOverTest()); xsetupOuterJoinMemberLoginAsLocalForeignOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsLocalForeignOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsLocalForeignOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsLocalForeignOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsLocalForeignOverTest() { xregOutJo("memberLoginAsLocalForeignOverTest"); }
    public boolean hasConditionQueryMemberLoginAsLocalForeignOverTest() { return xhasQueRlMap("memberLoginAsLocalForeignOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignBindOverTest(Integer displayOrder) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberLoginAsForeignForeignBindOverTest();
        parameterMap.put("displayOrder", displayOrder);
        xassertFCDP("memberLoginAsForeignForeignBindOverTest", parameterMap);
        return xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignBindOverTest() {
        String prop = "memberLoginAsForeignForeignBindOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignBindOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignBindOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberLoginAsForeignForeignBindOverTest;
    public Map<String, Object> xdfgetParameterMapMemberLoginAsForeignForeignBindOverTest()
    { if (_parameterMapMemberLoginAsForeignForeignBindOverTest == null) { _parameterMapMemberLoginAsForeignForeignBindOverTest = newLinkedHashMapSized(4); }
      return _parameterMapMemberLoginAsForeignForeignBindOverTest; }
    public void xsetParameterMapMemberLoginAsForeignForeignBindOverTest(Map<String, Object> parameterMap)
    { _parameterMapMemberLoginAsForeignForeignBindOverTest = parameterMap; } // for UnionQuery
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignBindOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignBindOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignBindOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignBindOverTest() { xregOutJo("memberLoginAsForeignForeignBindOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignBindOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignBindOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignEachOverTest() {
        return xdfgetConditionQueryMemberLoginAsForeignForeignEachOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignEachOverTest() {
        String prop = "memberLoginAsForeignForeignEachOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignEachOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignEachOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignEachOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignEachOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignEachOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignEachOverTest() { xregOutJo("memberLoginAsForeignForeignEachOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignEachOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignEachOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        return xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        String prop = "memberLoginAsForeignForeignOptimizedBasicOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignOptimizedBasicOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignOptimizedBasicOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignOptimizedBasicOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignOptimizedBasicOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedBasicOverTest() { xregOutJo("memberLoginAsForeignForeignOptimizedBasicOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignOptimizedBasicOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        return xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        String prop = "memberLoginAsForeignForeignOptimizedMarkOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignOptimizedMarkOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignOptimizedMarkOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignOptimizedMarkOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignOptimizedMarkOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedMarkOverTest() { xregOutJo("memberLoginAsForeignForeignOptimizedMarkOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignOptimizedMarkOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedPartOverTest(Integer displayOrder, String memberName) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest();
        parameterMap.put("displayOrder", displayOrder);parameterMap.put("memberName", memberName);
        xassertFCDP("memberLoginAsForeignForeignOptimizedPartOverTest", parameterMap);
        return xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest() {
        String prop = "memberLoginAsForeignForeignOptimizedPartOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignOptimizedPartOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignOptimizedPartOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest;
    public Map<String, Object> xdfgetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest()
    { if (_parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest == null) { _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest = newLinkedHashMapSized(4); }
      return _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest; }
    public void xsetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest(Map<String, Object> parameterMap)
    { _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest = parameterMap; } // for UnionQuery
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedPartOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignOptimizedPartOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignOptimizedPartOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedPartOverTest() { xregOutJo("memberLoginAsForeignForeignOptimizedPartOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignOptimizedPartOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedWholeOverTest(Integer displayOrder) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest();
        parameterMap.put("displayOrder", displayOrder);
        xassertFCDP("memberLoginAsForeignForeignOptimizedWholeOverTest", parameterMap);
        return xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        String prop = "memberLoginAsForeignForeignOptimizedWholeOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignOptimizedWholeOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest;
    public Map<String, Object> xdfgetParameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest()
    { if (_parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest == null) { _parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest = newLinkedHashMapSized(4); }
      return _parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest; }
    public void xsetParameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest(Map<String, Object> parameterMap)
    { _parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest = parameterMap; } // for UnionQuery
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignOptimizedWholeOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignOptimizedWholeOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedWholeOverTest() { xregOutJo("memberLoginAsForeignForeignOptimizedWholeOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignOptimizedWholeOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignParameterOverTest(java.util.Date targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberLoginAsForeignForeignParameterOverTest();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberLoginAsForeignForeignParameterOverTest", parameterMap);
        return xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignParameterOverTest() {
        String prop = "memberLoginAsForeignForeignParameterOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignParameterOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignParameterOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberLoginAsForeignForeignParameterOverTest;
    public Map<String, Object> xdfgetParameterMapMemberLoginAsForeignForeignParameterOverTest()
    { if (_parameterMapMemberLoginAsForeignForeignParameterOverTest == null) { _parameterMapMemberLoginAsForeignForeignParameterOverTest = newLinkedHashMapSized(4); }
      return _parameterMapMemberLoginAsForeignForeignParameterOverTest; }
    public void xsetParameterMapMemberLoginAsForeignForeignParameterOverTest(Map<String, Object> parameterMap)
    { _parameterMapMemberLoginAsForeignForeignParameterOverTest = parameterMap; } // for UnionQuery
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignParameterOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignParameterOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignParameterOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignParameterOverTest() { xregOutJo("memberLoginAsForeignForeignParameterOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignParameterOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignParameterOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignVariousOverTest() {
        return xdfgetConditionQueryMemberLoginAsForeignForeignVariousOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsForeignForeignVariousOverTest() {
        String prop = "memberLoginAsForeignForeignVariousOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsForeignForeignVariousOverTest()); xsetupOuterJoinMemberLoginAsForeignForeignVariousOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignVariousOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsForeignForeignVariousOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsForeignForeignVariousOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignVariousOverTest() { xregOutJo("memberLoginAsForeignForeignVariousOverTest"); }
    public boolean hasConditionQueryMemberLoginAsForeignForeignVariousOverTest() { return xhasQueRlMap("memberLoginAsForeignForeignVariousOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsReferrerOverTest() {
        return xdfgetConditionQueryMemberLoginAsReferrerOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsReferrerOverTest() {
        String prop = "memberLoginAsReferrerOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsReferrerOverTest()); xsetupOuterJoinMemberLoginAsReferrerOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsReferrerOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsReferrerOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsReferrerOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsReferrerOverTest() { xregOutJo("memberLoginAsReferrerOverTest"); }
    public boolean hasConditionQueryMemberLoginAsReferrerOverTest() { return xhasQueRlMap("memberLoginAsReferrerOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsReferrerForeignOverTest() {
        return xdfgetConditionQueryMemberLoginAsReferrerForeignOverTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsReferrerForeignOverTest() {
        String prop = "memberLoginAsReferrerForeignOverTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsReferrerForeignOverTest()); xsetupOuterJoinMemberLoginAsReferrerForeignOverTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsReferrerForeignOverTest() {
        String nrp = xresolveNRP("member", "memberLoginAsReferrerForeignOverTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsReferrerForeignOverTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsReferrerForeignOverTest() { xregOutJo("memberLoginAsReferrerForeignOverTest"); }
    public boolean hasConditionQueryMemberLoginAsReferrerForeignOverTest() { return xhasQueRlMap("memberLoginAsReferrerForeignOverTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLatest() {
        return xdfgetConditionQueryMemberLoginAsLatest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsLatest() {
        String prop = "memberLoginAsLatest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsLatest()); xsetupOuterJoinMemberLoginAsLatest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsLatest() {
        String nrp = xresolveNRP("member", "memberLoginAsLatest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsLatest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsLatest() { xregOutJo("memberLoginAsLatest"); }
    public boolean hasConditionQueryMemberLoginAsLatest() { return xhasQueRlMap("memberLoginAsLatest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsOldest() {
        return xdfgetConditionQueryMemberLoginAsOldest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsOldest() {
        String prop = "memberLoginAsOldest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsOldest()); xsetupOuterJoinMemberLoginAsOldest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsOldest() {
        String nrp = xresolveNRP("member", "memberLoginAsOldest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsOldest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsOldest() { xregOutJo("memberLoginAsOldest"); }
    public boolean hasConditionQueryMemberLoginAsOldest() { return xhasQueRlMap("memberLoginAsOldest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsFormattedBasic(java.util.Date targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsFormattedBasic();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberAddressAsFormattedBasic", parameterMap);
        return xdfgetConditionQueryMemberAddressAsFormattedBasic();
    }
    public MemberAddressCQ xdfgetConditionQueryMemberAddressAsFormattedBasic() {
        String prop = "memberAddressAsFormattedBasic";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsFormattedBasic()); xsetupOuterJoinMemberAddressAsFormattedBasic(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsFormattedBasic;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsFormattedBasic()
    { if (_parameterMapMemberAddressAsFormattedBasic == null) { _parameterMapMemberAddressAsFormattedBasic = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsFormattedBasic; }
    public void xsetParameterMapMemberAddressAsFormattedBasic(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsFormattedBasic = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsFormattedBasic() {
        String nrp = xresolveNRP("member", "memberAddressAsFormattedBasic"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsFormattedBasic", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsFormattedBasic() { xregOutJo("memberAddressAsFormattedBasic"); }
    public boolean hasConditionQueryMemberAddressAsFormattedBasic() { return xhasQueRlMap("memberAddressAsFormattedBasic"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsFormattedLong(java.util.Date targetDate) {
        Map<String, Object> parameterMap = xdfgetParameterMapMemberAddressAsFormattedLong();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberAddressAsFormattedLong", parameterMap);
        return xdfgetConditionQueryMemberAddressAsFormattedLong();
    }
    public MemberAddressCQ xdfgetConditionQueryMemberAddressAsFormattedLong() {
        String prop = "memberAddressAsFormattedLong";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsFormattedLong()); xsetupOuterJoinMemberAddressAsFormattedLong(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsFormattedLong;
    public Map<String, Object> xdfgetParameterMapMemberAddressAsFormattedLong()
    { if (_parameterMapMemberAddressAsFormattedLong == null) { _parameterMapMemberAddressAsFormattedLong = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsFormattedLong; }
    public void xsetParameterMapMemberAddressAsFormattedLong(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsFormattedLong = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsFormattedLong() {
        String nrp = xresolveNRP("member", "memberAddressAsFormattedLong"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsFormattedLong", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsFormattedLong() { xregOutJo("memberAddressAsFormattedLong"); }
    public boolean hasConditionQueryMemberAddressAsFormattedLong() { return xhasQueRlMap("memberAddressAsFormattedLong"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsFormattedMany() {
        return xdfgetConditionQueryMemberLoginAsFormattedMany();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsFormattedMany() {
        String prop = "memberLoginAsFormattedMany";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsFormattedMany()); xsetupOuterJoinMemberLoginAsFormattedMany(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsFormattedMany() {
        String nrp = xresolveNRP("member", "memberLoginAsFormattedMany"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsFormattedMany", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsFormattedMany() { xregOutJo("memberLoginAsFormattedMany"); }
    public boolean hasConditionQueryMemberLoginAsFormattedMany() { return xhasQueRlMap("memberLoginAsFormattedMany"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsEmbeddedCommentClassificationTest() {
        return xdfgetConditionQueryMemberLoginAsEmbeddedCommentClassificationTest();
    }
    public MemberLoginCQ xdfgetConditionQueryMemberLoginAsEmbeddedCommentClassificationTest() {
        String prop = "memberLoginAsEmbeddedCommentClassificationTest";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberLoginAsEmbeddedCommentClassificationTest()); xsetupOuterJoinMemberLoginAsEmbeddedCommentClassificationTest(); }
        return xgetQueRlMap(prop);
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsEmbeddedCommentClassificationTest() {
        String nrp = xresolveNRP("member", "memberLoginAsEmbeddedCommentClassificationTest"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberLoginAsEmbeddedCommentClassificationTest", nrp);
    }
    protected void xsetupOuterJoinMemberLoginAsEmbeddedCommentClassificationTest() { xregOutJo("memberLoginAsEmbeddedCommentClassificationTest"); }
    public boolean hasConditionQueryMemberLoginAsEmbeddedCommentClassificationTest() { return xhasQueRlMap("memberLoginAsEmbeddedCommentClassificationTest"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberSecurityCQ queryMemberSecurityAsOne() { return xdfgetConditionQueryMemberSecurityAsOne(); }
    public MemberSecurityCQ xdfgetConditionQueryMemberSecurityAsOne() {
        String prop = "memberSecurityAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberSecurityAsOne()); xsetupOuterJoinMemberSecurityAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = xresolveNRP("member", "memberSecurityAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberSecurityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberSecurityAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() { xregOutJo("memberSecurityAsOne"); }
    public boolean hasConditionQueryMemberSecurityAsOne() { return xhasQueRlMap("memberSecurityAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberServiceCQ queryMemberServiceAsOne() { return xdfgetConditionQueryMemberServiceAsOne(); }
    public MemberServiceCQ xdfgetConditionQueryMemberServiceAsOne() {
        String prop = "memberServiceAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberServiceAsOne()); xsetupOuterJoinMemberServiceAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberServiceCQ xcreateQueryMemberServiceAsOne() {
        String nrp = xresolveNRP("member", "memberServiceAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberServiceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberServiceAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberServiceAsOne() { xregOutJo("memberServiceAsOne"); }
    public boolean hasConditionQueryMemberServiceAsOne() { return xhasQueRlMap("memberServiceAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberWithdrawalCQ queryMemberWithdrawalAsOne() { return xdfgetConditionQueryMemberWithdrawalAsOne(); }
    public MemberWithdrawalCQ xdfgetConditionQueryMemberWithdrawalAsOne() {
        String prop = "memberWithdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberWithdrawalAsOne()); xsetupOuterJoinMemberWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberWithdrawalCQ xcreateQueryMemberWithdrawalAsOne() {
        String nrp = xresolveNRP("member", "memberWithdrawalAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberWithdrawalAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberWithdrawalAsOne() { xregOutJo("memberWithdrawalAsOne"); }
    public boolean hasConditionQueryMemberWithdrawalAsOne() { return xhasQueRlMap("memberWithdrawalAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("memberAddressAsValid".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsValid; }
        if ("memberAddressAsValidBefore".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsValidBefore; }
        if ("memberLoginAsLoginStatus".equalsIgnoreCase(property)) { return _parameterMapMemberLoginAsLoginStatus; }
        if ("memberAddressAsIfComment".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsIfComment; }
        if ("memberAddressAsOnlyOneDate".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsOnlyOneDate; }
        if ("memberLoginAsLocalBindOverTest".equalsIgnoreCase(property)) { return _parameterMapMemberLoginAsLocalBindOverTest; }
        if ("memberLoginAsForeignForeignBindOverTest".equalsIgnoreCase(property)) { return _parameterMapMemberLoginAsForeignForeignBindOverTest; }
        if ("memberLoginAsForeignForeignOptimizedPartOverTest".equalsIgnoreCase(property)) { return _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest; }
        if ("memberLoginAsForeignForeignOptimizedWholeOverTest".equalsIgnoreCase(property)) { return _parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest; }
        if ("memberLoginAsForeignForeignParameterOverTest".equalsIgnoreCase(property)) { return _parameterMapMemberLoginAsForeignForeignParameterOverTest; }
        if ("memberAddressAsFormattedBasic".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsFormattedBasic; }
        if ("memberAddressAsFormattedLong".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsFormattedLong; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
