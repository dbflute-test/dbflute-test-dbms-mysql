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
 * The base condition-query of white_function_index_base.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteFunctionIndexBaseCQ extends AbstractBsWhiteFunctionIndexBaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteFunctionIndexBaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteFunctionIndexBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_function_index_base) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteFunctionIndexBaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteFunctionIndexBaseCIQ xcreateCIQ() {
        WhiteFunctionIndexBaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteFunctionIndexBaseCIQ xnewCIQ() {
        return new WhiteFunctionIndexBaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_function_index_base on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteFunctionIndexBaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteFunctionIndexBaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _indexBaseId;
    public ConditionValue xdfgetIndexBaseId()
    { if (_indexBaseId == null) { _indexBaseId = nCV(); }
      return _indexBaseId; }
    protected ConditionValue xgetCValueIndexBaseId() { return xdfgetIndexBaseId(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseId_Asc() { regOBA("INDEX_BASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseId_Desc() { regOBD("INDEX_BASE_ID"); return this; }

    protected ConditionValue _indexBaseName;
    public ConditionValue xdfgetIndexBaseName()
    { if (_indexBaseName == null) { _indexBaseName = nCV(); }
      return _indexBaseName; }
    protected ConditionValue xgetCValueIndexBaseName() { return xdfgetIndexBaseName(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseName_Asc() { regOBA("INDEX_BASE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseName_Desc() { regOBD("INDEX_BASE_NAME"); return this; }

    protected ConditionValue _indexBaseNumberFirst;
    public ConditionValue xdfgetIndexBaseNumberFirst()
    { if (_indexBaseNumberFirst == null) { _indexBaseNumberFirst = nCV(); }
      return _indexBaseNumberFirst; }
    protected ConditionValue xgetCValueIndexBaseNumberFirst() { return xdfgetIndexBaseNumberFirst(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseNumberFirst_Asc() { regOBA("INDEX_BASE_NUMBER_FIRST"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseNumberFirst_Desc() { regOBD("INDEX_BASE_NUMBER_FIRST"); return this; }

    protected ConditionValue _indexBaseNumberSecond;
    public ConditionValue xdfgetIndexBaseNumberSecond()
    { if (_indexBaseNumberSecond == null) { _indexBaseNumberSecond = nCV(); }
      return _indexBaseNumberSecond; }
    protected ConditionValue xgetCValueIndexBaseNumberSecond() { return xdfgetIndexBaseNumberSecond(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseNumberSecond_Asc() { regOBA("INDEX_BASE_NUMBER_SECOND"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseNumberSecond_Desc() { regOBD("INDEX_BASE_NUMBER_SECOND"); return this; }

    protected ConditionValue _indexBaseDatetime;
    public ConditionValue xdfgetIndexBaseDatetime()
    { if (_indexBaseDatetime == null) { _indexBaseDatetime = nCV(); }
      return _indexBaseDatetime; }
    protected ConditionValue xgetCValueIndexBaseDatetime() { return xdfgetIndexBaseDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseDatetime_Asc() { regOBA("INDEX_BASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteFunctionIndexBaseCQ addOrderBy_IndexBaseDatetime_Desc() { regOBD("INDEX_BASE_DATETIME"); return this; }

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
    public BsWhiteFunctionIndexBaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteFunctionIndexBaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteFunctionIndexBaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteFunctionIndexBaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteFunctionIndexBaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteFunctionIndexBaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteFunctionIndexBaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteFunctionIndexBaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteFunctionIndexBaseCQ> _myselfExistsMap;
    public Map<String, WhiteFunctionIndexBaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteFunctionIndexBaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteFunctionIndexBaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteFunctionIndexBaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteFunctionIndexBaseCB.class.getName(); }
    protected String xCQ() { return WhiteFunctionIndexBaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
