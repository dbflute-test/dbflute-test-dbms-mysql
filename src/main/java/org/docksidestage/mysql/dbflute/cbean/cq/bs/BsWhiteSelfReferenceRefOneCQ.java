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
 * The base condition-query of white_self_reference_ref_one.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReferenceRefOneCQ extends AbstractBsWhiteSelfReferenceRefOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceRefOneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceRefOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_self_reference_ref_one) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSelfReferenceRefOneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSelfReferenceRefOneCIQ xcreateCIQ() {
        WhiteSelfReferenceRefOneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSelfReferenceRefOneCIQ xnewCIQ() {
        return new WhiteSelfReferenceRefOneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_self_reference_ref_one on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSelfReferenceRefOneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSelfReferenceRefOneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _selfReferenceId;
    public ConditionValue xdfgetSelfReferenceId()
    { if (_selfReferenceId == null) { _selfReferenceId = nCV(); }
      return _selfReferenceId; }
    protected ConditionValue xgetCValueSelfReferenceId() { return xdfgetSelfReferenceId(); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceId_Asc() { regOBA("SELF_REFERENCE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceId_Desc() { regOBD("SELF_REFERENCE_ID"); return this; }

    protected ConditionValue _selfReferenceRefOneName;
    public ConditionValue xdfgetSelfReferenceRefOneName()
    { if (_selfReferenceRefOneName == null) { _selfReferenceRefOneName = nCV(); }
      return _selfReferenceRefOneName; }
    protected ConditionValue xgetCValueSelfReferenceRefOneName() { return xdfgetSelfReferenceRefOneName(); }

    /** 
     * Add order-by as ascend. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceRefOneName_Asc() { regOBA("SELF_REFERENCE_REF_ONE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceRefOneCQ addOrderBy_SelfReferenceRefOneName_Desc() { regOBD("SELF_REFERENCE_REF_ONE_NAME"); return this; }

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
    public BsWhiteSelfReferenceRefOneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSelfReferenceRefOneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSelfReferenceRefOneCQ bq = (WhiteSelfReferenceRefOneCQ)bqs;
        WhiteSelfReferenceRefOneCQ uq = (WhiteSelfReferenceRefOneCQ)uqs;
        if (bq.hasConditionQueryWhiteSelfReference()) {
            uq.queryWhiteSelfReference().reflectRelationOnUnionQuery(bq.queryWhiteSelfReference(), uq.queryWhiteSelfReference());
        }
        if (bq.hasConditionQueryWhiteSelfReferenceAsDirectParent()) {
            uq.queryWhiteSelfReferenceAsDirectParent().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceAsDirectParent(), uq.queryWhiteSelfReferenceAsDirectParent());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReference() {
        return xdfgetConditionQueryWhiteSelfReference();
    }
    public WhiteSelfReferenceCQ xdfgetConditionQueryWhiteSelfReference() {
        String prop = "whiteSelfReference";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSelfReference()); xsetupOuterJoinWhiteSelfReference(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReference() {
        String nrp = xresolveNRP("white_self_reference_ref_one", "whiteSelfReference"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSelfReference", nrp);
    }
    protected void xsetupOuterJoinWhiteSelfReference() { xregOutJo("whiteSelfReference"); }
    public boolean hasConditionQueryWhiteSelfReference() { return xhasQueRlMap("whiteSelfReference"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReferenceAsDirectParent() {
        return xdfgetConditionQueryWhiteSelfReferenceAsDirectParent();
    }
    public WhiteSelfReferenceCQ xdfgetConditionQueryWhiteSelfReferenceAsDirectParent() {
        String prop = "whiteSelfReferenceAsDirectParent";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSelfReferenceAsDirectParent()); xsetupOuterJoinWhiteSelfReferenceAsDirectParent(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReferenceAsDirectParent() {
        String nrp = xresolveNRP("white_self_reference_ref_one", "whiteSelfReferenceAsDirectParent"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSelfReferenceAsDirectParent", nrp);
    }
    protected void xsetupOuterJoinWhiteSelfReferenceAsDirectParent() { xregOutJo("whiteSelfReferenceAsDirectParent"); }
    public boolean hasConditionQueryWhiteSelfReferenceAsDirectParent() { return xhasQueRlMap("whiteSelfReferenceAsDirectParent"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteSelfReferenceRefOneCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSelfReferenceRefOneCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSelfReferenceRefOneCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceRefOneCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSelfReferenceRefOneCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSelfReferenceRefOneCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSelfReferenceRefOneCQ> _myselfExistsMap;
    public Map<String, WhiteSelfReferenceRefOneCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSelfReferenceRefOneCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSelfReferenceRefOneCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSelfReferenceRefOneCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSelfReferenceRefOneCB.class.getName(); }
    protected String xCQ() { return WhiteSelfReferenceRefOneCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
