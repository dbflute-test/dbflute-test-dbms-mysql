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
 * The base condition-query of white_generated_column_base.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteGeneratedColumnBaseCQ extends AbstractBsWhiteGeneratedColumnBaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteGeneratedColumnBaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteGeneratedColumnBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_generated_column_base) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteGeneratedColumnBaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteGeneratedColumnBaseCIQ xcreateCIQ() {
        WhiteGeneratedColumnBaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteGeneratedColumnBaseCIQ xnewCIQ() {
        return new WhiteGeneratedColumnBaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_generated_column_base on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteGeneratedColumnBaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteGeneratedColumnBaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _columnBaseId;
    public ConditionValue xdfgetColumnBaseId()
    { if (_columnBaseId == null) { _columnBaseId = nCV(); }
      return _columnBaseId; }
    protected ConditionValue xgetCValueColumnBaseId() { return xdfgetColumnBaseId(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseId_Asc() { regOBA("COLUMN_BASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseId_Desc() { regOBD("COLUMN_BASE_ID"); return this; }

    protected ConditionValue _columnBaseName;
    public ConditionValue xdfgetColumnBaseName()
    { if (_columnBaseName == null) { _columnBaseName = nCV(); }
      return _columnBaseName; }
    protected ConditionValue xgetCValueColumnBaseName() { return xdfgetColumnBaseName(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseName_Asc() { regOBA("COLUMN_BASE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseName_Desc() { regOBD("COLUMN_BASE_NAME"); return this; }

    protected ConditionValue _columnBaseNumberFirst;
    public ConditionValue xdfgetColumnBaseNumberFirst()
    { if (_columnBaseNumberFirst == null) { _columnBaseNumberFirst = nCV(); }
      return _columnBaseNumberFirst; }
    protected ConditionValue xgetCValueColumnBaseNumberFirst() { return xdfgetColumnBaseNumberFirst(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseNumberFirst_Asc() { regOBA("COLUMN_BASE_NUMBER_FIRST"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseNumberFirst_Desc() { regOBD("COLUMN_BASE_NUMBER_FIRST"); return this; }

    protected ConditionValue _columnBaseNumberSecond;
    public ConditionValue xdfgetColumnBaseNumberSecond()
    { if (_columnBaseNumberSecond == null) { _columnBaseNumberSecond = nCV(); }
      return _columnBaseNumberSecond; }
    protected ConditionValue xgetCValueColumnBaseNumberSecond() { return xdfgetColumnBaseNumberSecond(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseNumberSecond_Asc() { regOBA("COLUMN_BASE_NUMBER_SECOND"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseNumberSecond_Desc() { regOBD("COLUMN_BASE_NUMBER_SECOND"); return this; }

    protected ConditionValue _columnBaseDatetime;
    public ConditionValue xdfgetColumnBaseDatetime()
    { if (_columnBaseDatetime == null) { _columnBaseDatetime = nCV(); }
      return _columnBaseDatetime; }
    protected ConditionValue xgetCValueColumnBaseDatetime() { return xdfgetColumnBaseDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_BASE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseDatetime_Asc() { regOBA("COLUMN_BASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_BASE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseDatetime_Desc() { regOBD("COLUMN_BASE_DATETIME"); return this; }

    protected ConditionValue _columnBaseVirtualDateCast;
    public ConditionValue xdfgetColumnBaseVirtualDateCast()
    { if (_columnBaseVirtualDateCast == null) { _columnBaseVirtualDateCast = nCV(); }
      return _columnBaseVirtualDateCast; }
    protected ConditionValue xgetCValueColumnBaseVirtualDateCast() { return xdfgetColumnBaseVirtualDateCast(); }

    /**
     * Add order-by as ascend. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseVirtualDateCast_Asc() { regOBA("COLUMN_BASE_VIRTUAL_DATE_CAST"); return this; }

    /**
     * Add order-by as descend. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGeneratedColumnBaseCQ addOrderBy_ColumnBaseVirtualDateCast_Desc() { regOBD("COLUMN_BASE_VIRTUAL_DATE_CAST"); return this; }

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
    public BsWhiteGeneratedColumnBaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteGeneratedColumnBaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteGeneratedColumnBaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteGeneratedColumnBaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteGeneratedColumnBaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteGeneratedColumnBaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteGeneratedColumnBaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteGeneratedColumnBaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteGeneratedColumnBaseCQ> _myselfExistsMap;
    public Map<String, WhiteGeneratedColumnBaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteGeneratedColumnBaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteGeneratedColumnBaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteGeneratedColumnBaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteGeneratedColumnBaseCB.class.getName(); }
    protected String xCQ() { return WhiteGeneratedColumnBaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
