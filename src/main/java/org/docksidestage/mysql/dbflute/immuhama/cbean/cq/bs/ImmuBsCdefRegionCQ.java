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
 * The base condition-query of cdef_region.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsCdefRegionCQ extends ImmuAbstractBsCdefRegionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuCdefRegionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsCdefRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from cdef_region) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuCdefRegionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuCdefRegionCIQ xcreateCIQ() {
        ImmuCdefRegionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuCdefRegionCIQ xnewCIQ() {
        return new ImmuCdefRegionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join cdef_region on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuCdefRegionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuCdefRegionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _regionId;
    public ConditionValue xdfgetRegionId()
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected ConditionValue xgetCValueRegionId() { return xdfgetRegionId(); }

    public Map<String, ImmuMemberAddressCQ> xdfgetRegionId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_ExistsReferrer_MemberAddressList"); }
    public String keepRegionId_ExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("regionId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, ImmuMemberAddressCQ> xdfgetRegionId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_NotExistsReferrer_MemberAddressList"); }
    public String keepRegionId_NotExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("regionId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, ImmuMemberAddressCQ> xdfgetRegionId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("regionId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, ImmuMemberAddressCQ> xdfgetRegionId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq) { return xkeepSQue("regionId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> xdfgetRegionId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("regionId_QueryDerivedReferrer_MemberAddressList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @return this. (NotNull)
     */
    public ImmuBsCdefRegionCQ addOrderBy_RegionId_Asc() { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @return this. (NotNull)
     */
    public ImmuBsCdefRegionCQ addOrderBy_RegionId_Desc() { regOBD("REGION_ID"); return this; }

    protected ConditionValue _regionName;
    public ConditionValue xdfgetRegionName()
    { if (_regionName == null) { _regionName = nCV(); }
      return _regionName; }
    protected ConditionValue xgetCValueRegionName() { return xdfgetRegionName(); }

    /**
     * Add order-by as ascend. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefRegionCQ addOrderBy_RegionName_Asc() { regOBA("REGION_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefRegionCQ addOrderBy_RegionName_Desc() { regOBD("REGION_NAME"); return this; }

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
    public ImmuBsCdefRegionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsCdefRegionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ImmuCdefRegionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuCdefRegionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuCdefRegionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuCdefRegionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuCdefRegionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuCdefRegionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuCdefRegionCQ> _myselfExistsMap;
    public Map<String, ImmuCdefRegionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuCdefRegionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuCdefRegionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuCdefRegionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuCdefRegionCB.class.getName(); }
    protected String xCQ() { return ImmuCdefRegionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
