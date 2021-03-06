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
 * The base condition-query of white_perrotta_over_trace.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverTraceCQ extends AbstractBsWhitePerrottaOverTraceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverTraceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverTraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_perrotta_over_trace) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePerrottaOverTraceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePerrottaOverTraceCIQ xcreateCIQ() {
        WhitePerrottaOverTraceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePerrottaOverTraceCIQ xnewCIQ() {
        return new WhitePerrottaOverTraceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_perrotta_over_trace on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePerrottaOverTraceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePerrottaOverTraceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _traceId;
    public ConditionValue xdfgetTraceId()
    { if (_traceId == null) { _traceId = nCV(); }
      return _traceId; }
    protected ConditionValue xgetCValueTraceId() { return xdfgetTraceId(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_TraceId_Asc() { regOBA("TRACE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_TraceId_Desc() { regOBD("TRACE_ID"); return this; }

    protected ConditionValue _previousProductId;
    public ConditionValue xdfgetPreviousProductId()
    { if (_previousProductId == null) { _previousProductId = nCV(); }
      return _previousProductId; }
    protected ConditionValue xgetCValuePreviousProductId() { return xdfgetPreviousProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_PreviousProductId_Asc() { regOBA("PREVIOUS_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_PreviousProductId_Desc() { regOBD("PREVIOUS_PRODUCT_ID"); return this; }

    protected ConditionValue _nextProductId;
    public ConditionValue xdfgetNextProductId()
    { if (_nextProductId == null) { _nextProductId = nCV(); }
      return _nextProductId; }
    protected ConditionValue xgetCValueNextProductId() { return xdfgetNextProductId(); }

    /**
     * Add order-by as ascend. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_NextProductId_Asc() { regOBA("NEXT_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_NextProductId_Desc() { regOBD("NEXT_PRODUCT_ID"); return this; }

    protected ConditionValue _traceTypeCode;
    public ConditionValue xdfgetTraceTypeCode()
    { if (_traceTypeCode == null) { _traceTypeCode = nCV(); }
      return _traceTypeCode; }
    protected ConditionValue xgetCValueTraceTypeCode() { return xdfgetTraceTypeCode(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_TraceTypeCode_Asc() { regOBA("TRACE_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverTraceCQ addOrderBy_TraceTypeCode_Desc() { regOBD("TRACE_TYPE_CODE"); return this; }

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
    public BsWhitePerrottaOverTraceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePerrottaOverTraceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhitePerrottaOverTraceCQ bq = (WhitePerrottaOverTraceCQ)bqs;
        WhitePerrottaOverTraceCQ uq = (WhitePerrottaOverTraceCQ)uqs;
        if (bq.hasConditionQueryWhitePerrottaOverProductByNextProductId()) {
            uq.queryWhitePerrottaOverProductByNextProductId().reflectRelationOnUnionQuery(bq.queryWhitePerrottaOverProductByNextProductId(), uq.queryWhitePerrottaOverProductByNextProductId());
        }
        if (bq.hasConditionQueryWhitePerrottaOverProductByPreviousProductId()) {
            uq.queryWhitePerrottaOverProductByPreviousProductId().reflectRelationOnUnionQuery(bq.queryWhitePerrottaOverProductByPreviousProductId(), uq.queryWhitePerrottaOverProductByPreviousProductId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePerrottaOverProductCQ queryWhitePerrottaOverProductByNextProductId() {
        return xdfgetConditionQueryWhitePerrottaOverProductByNextProductId();
    }
    public WhitePerrottaOverProductCQ xdfgetConditionQueryWhitePerrottaOverProductByNextProductId() {
        String prop = "whitePerrottaOverProductByNextProductId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePerrottaOverProductByNextProductId()); xsetupOuterJoinWhitePerrottaOverProductByNextProductId(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePerrottaOverProductCQ xcreateQueryWhitePerrottaOverProductByNextProductId() {
        String nrp = xresolveNRP("white_perrotta_over_trace", "whitePerrottaOverProductByNextProductId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePerrottaOverProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePerrottaOverProductByNextProductId", nrp);
    }
    protected void xsetupOuterJoinWhitePerrottaOverProductByNextProductId() { xregOutJo("whitePerrottaOverProductByNextProductId"); }
    public boolean hasConditionQueryWhitePerrottaOverProductByNextProductId() { return xhasQueRlMap("whitePerrottaOverProductByNextProductId"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePerrottaOverProductCQ queryWhitePerrottaOverProductByPreviousProductId() {
        return xdfgetConditionQueryWhitePerrottaOverProductByPreviousProductId();
    }
    public WhitePerrottaOverProductCQ xdfgetConditionQueryWhitePerrottaOverProductByPreviousProductId() {
        String prop = "whitePerrottaOverProductByPreviousProductId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePerrottaOverProductByPreviousProductId()); xsetupOuterJoinWhitePerrottaOverProductByPreviousProductId(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePerrottaOverProductCQ xcreateQueryWhitePerrottaOverProductByPreviousProductId() {
        String nrp = xresolveNRP("white_perrotta_over_trace", "whitePerrottaOverProductByPreviousProductId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePerrottaOverProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePerrottaOverProductByPreviousProductId", nrp);
    }
    protected void xsetupOuterJoinWhitePerrottaOverProductByPreviousProductId() { xregOutJo("whitePerrottaOverProductByPreviousProductId"); }
    public boolean hasConditionQueryWhitePerrottaOverProductByPreviousProductId() { return xhasQueRlMap("whitePerrottaOverProductByPreviousProductId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhitePerrottaOverTraceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePerrottaOverTraceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePerrottaOverTraceCQ> _myselfExistsMap;
    public Map<String, WhitePerrottaOverTraceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePerrottaOverTraceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePerrottaOverTraceCB.class.getName(); }
    protected String xCQ() { return WhitePerrottaOverTraceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
