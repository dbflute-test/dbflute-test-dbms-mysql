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
 * The base condition-query of cdef_member_status.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsCdefMemberStatusCQ extends ImmuAbstractBsCdefMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuCdefMemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsCdefMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from cdef_member_status) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuCdefMemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuCdefMemberStatusCIQ xcreateCIQ() {
        ImmuCdefMemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuCdefMemberStatusCIQ xnewCIQ() {
        return new ImmuCdefMemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join cdef_member_status on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuCdefMemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuCdefMemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, ImmuMemberStatusCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberStatusList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberStatusList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberStatusList(ImmuMemberStatusCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberStatusList", sq); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, ImmuMemberStatusCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberStatusList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberStatusList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberStatusList(ImmuMemberStatusCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberStatusList", sq); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, ImmuMemberStatusCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberStatusList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberStatusList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberStatusList(ImmuMemberStatusCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberStatusList", sq); }

    public Map<String, ImmuMemberLoginCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(ImmuMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberLoginList", pm); }

    public Map<String, ImmuMemberStatusCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberStatusList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberStatusList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberStatusList(ImmuMemberStatusCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberStatusList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberStatusListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberStatusList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberStatusListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberStatusList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue xdfgetMemberStatusName()
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected ConditionValue xgetCValueMemberStatusName() { return xdfgetMemberStatusName(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /**
     * Add order-by as ascend. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public ImmuBsCdefMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsCdefMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuCdefMemberStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuCdefMemberStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuCdefMemberStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuCdefMemberStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuCdefMemberStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuCdefMemberStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuCdefMemberStatusCQ> _myselfExistsMap;
    public Map<String, ImmuCdefMemberStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuCdefMemberStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuCdefMemberStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuCdefMemberStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuCdefMemberStatusCB.class.getName(); }
    protected String xCQ() { return ImmuCdefMemberStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
