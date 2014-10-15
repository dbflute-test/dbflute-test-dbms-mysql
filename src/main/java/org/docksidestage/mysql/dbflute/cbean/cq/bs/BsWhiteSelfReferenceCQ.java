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
 * The base condition-query of white_self_reference.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReferenceCQ extends AbstractBsWhiteSelfReferenceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_self_reference) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSelfReferenceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSelfReferenceCIQ xcreateCIQ() {
        WhiteSelfReferenceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSelfReferenceCIQ xnewCIQ() {
        return new WhiteSelfReferenceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_self_reference on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSelfReferenceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSelfReferenceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _selfReferenceId;
    public ConditionValue getSelfReferenceId()
    { if (_selfReferenceId == null) { _selfReferenceId = nCV(); }
      return _selfReferenceId; }
    protected ConditionValue getCValueSelfReferenceId() { return getSelfReferenceId(); }

    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList", sq); }

    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList", sq); }

    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList", sq); }

    public Map<String, WhiteSelfReferenceCQ> getSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList", sq); }
    public Map<String, Object> getSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter() { return xgetSQuePmMap("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(Object pm) { return xkeepSQuePm("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceId_Asc() { regOBA("SELF_REFERENCE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceId_Desc() { regOBD("SELF_REFERENCE_ID"); return this; }

    protected ConditionValue _selfReferenceName;
    public ConditionValue getSelfReferenceName()
    { if (_selfReferenceName == null) { _selfReferenceName = nCV(); }
      return _selfReferenceName; }
    protected ConditionValue getCValueSelfReferenceName() { return getSelfReferenceName(); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceName_Asc() { regOBA("SELF_REFERENCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceName_Desc() { regOBD("SELF_REFERENCE_NAME"); return this; }

    protected ConditionValue _parentId;
    public ConditionValue getParentId()
    { if (_parentId == null) { _parentId = nCV(); }
      return _parentId; }
    protected ConditionValue getCValueParentId() { return getParentId(); }

    /** 
     * Add order-by as ascend. <br />
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_ParentId_Asc() { regOBA("PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_ParentId_Desc() { regOBD("PARENT_ID"); return this; }

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
    public BsWhiteSelfReferenceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSelfReferenceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSelfReferenceCQ bq = (WhiteSelfReferenceCQ)bqs;
        WhiteSelfReferenceCQ uq = (WhiteSelfReferenceCQ)uqs;
        if (bq.hasConditionQueryWhiteSelfReferenceSelf()) {
            uq.queryWhiteSelfReferenceSelf().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceSelf(), uq.queryWhiteSelfReferenceSelf());
        }
        if (bq.hasConditionQueryWhiteSelfReferenceRefOneAsOne()) {
            uq.queryWhiteSelfReferenceRefOneAsOne().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceRefOneAsOne(), uq.queryWhiteSelfReferenceRefOneAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReferenceSelf() {
        return getConditionQueryWhiteSelfReferenceSelf();
    }
    public WhiteSelfReferenceCQ getConditionQueryWhiteSelfReferenceSelf() {
        String prop = "whiteSelfReferenceSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSelfReferenceSelf()); xsetupOuterJoinWhiteSelfReferenceSelf(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReferenceSelf() {
        String nrp = xresolveNRP("white_self_reference", "whiteSelfReferenceSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSelfReferenceSelf", nrp);
    }
    protected void xsetupOuterJoinWhiteSelfReferenceSelf() { xregOutJo("whiteSelfReferenceSelf"); }
    public boolean hasConditionQueryWhiteSelfReferenceSelf() { return xhasQueRlMap("whiteSelfReferenceSelf"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceRefOneCQ queryWhiteSelfReferenceRefOneAsOne() { return getConditionQueryWhiteSelfReferenceRefOneAsOne(); }
    public WhiteSelfReferenceRefOneCQ getConditionQueryWhiteSelfReferenceRefOneAsOne() {
        String prop = "whiteSelfReferenceRefOneAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSelfReferenceRefOneAsOne()); xsetupOuterJoinWhiteSelfReferenceRefOneAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSelfReferenceRefOneCQ xcreateQueryWhiteSelfReferenceRefOneAsOne() {
        String nrp = xresolveNRP("white_self_reference", "whiteSelfReferenceRefOneAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSelfReferenceRefOneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSelfReferenceRefOneAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteSelfReferenceRefOneAsOne() { xregOutJo("whiteSelfReferenceRefOneAsOne"); }
    public boolean hasConditionQueryWhiteSelfReferenceRefOneAsOne() { return xhasQueRlMap("whiteSelfReferenceRefOneAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteSelfReferenceCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSelfReferenceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSelfReferenceCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSelfReferenceCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSelfReferenceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSelfReferenceCQ> _myselfExistsMap;
    public Map<String, WhiteSelfReferenceCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSelfReferenceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSelfReferenceCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSelfReferenceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSelfReferenceCB.class.getName(); }
    protected String xCQ() { return WhiteSelfReferenceCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
