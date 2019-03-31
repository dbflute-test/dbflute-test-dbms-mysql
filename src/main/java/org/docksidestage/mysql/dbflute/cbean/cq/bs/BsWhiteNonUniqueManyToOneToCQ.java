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
 * The base condition-query of white_non_unique_many_to_one_to.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteNonUniqueManyToOneToCQ extends AbstractBsWhiteNonUniqueManyToOneToCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteNonUniqueManyToOneToCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteNonUniqueManyToOneToCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_non_unique_many_to_one_to) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteNonUniqueManyToOneToCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteNonUniqueManyToOneToCIQ xcreateCIQ() {
        WhiteNonUniqueManyToOneToCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteNonUniqueManyToOneToCIQ xnewCIQ() {
        return new WhiteNonUniqueManyToOneToCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_non_unique_many_to_one_to on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteNonUniqueManyToOneToCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteNonUniqueManyToOneToCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _toId;
    public ConditionValue xdfgetToId()
    { if (_toId == null) { _toId = nCV(); }
      return _toId; }
    protected ConditionValue xgetCValueToId() { return xdfgetToId(); }

    /**
     * Add order-by as ascend. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_ToId_Asc() { regOBA("TO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_ToId_Desc() { regOBD("TO_ID"); return this; }

    protected ConditionValue _toName;
    public ConditionValue xdfgetToName()
    { if (_toName == null) { _toName = nCV(); }
      return _toName; }
    protected ConditionValue xgetCValueToName() { return xdfgetToName(); }

    /**
     * Add order-by as ascend. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_ToName_Asc() { regOBA("TO_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_ToName_Desc() { regOBD("TO_NAME"); return this; }

    protected ConditionValue _nonUniqueCode;
    public ConditionValue xdfgetNonUniqueCode()
    { if (_nonUniqueCode == null) { _nonUniqueCode = nCV(); }
      return _nonUniqueCode; }
    protected ConditionValue xgetCValueNonUniqueCode() { return xdfgetNonUniqueCode(); }

    /**
     * Add order-by as ascend. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_NonUniqueCode_Asc() { regOBA("NON_UNIQUE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_NonUniqueCode_Desc() { regOBD("NON_UNIQUE_CODE"); return this; }

    protected ConditionValue _beginDate;
    public ConditionValue xdfgetBeginDate()
    { if (_beginDate == null) { _beginDate = nCV(); }
      return _beginDate; }
    protected ConditionValue xgetCValueBeginDate() { return xdfgetBeginDate(); }

    /**
     * Add order-by as ascend. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_BeginDate_Asc() { regOBA("BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_BeginDate_Desc() { regOBD("BEGIN_DATE"); return this; }

    protected ConditionValue _endDate;
    public ConditionValue xdfgetEndDate()
    { if (_endDate == null) { _endDate = nCV(); }
      return _endDate; }
    protected ConditionValue xgetCValueEndDate() { return xdfgetEndDate(); }

    /**
     * Add order-by as ascend. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_EndDate_Asc() { regOBA("END_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneToCQ addOrderBy_EndDate_Desc() { regOBD("END_DATE"); return this; }

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
    public BsWhiteNonUniqueManyToOneToCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteNonUniqueManyToOneToCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteNonUniqueManyToOneToCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteNonUniqueManyToOneToCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteNonUniqueManyToOneToCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteNonUniqueManyToOneToCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteNonUniqueManyToOneToCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteNonUniqueManyToOneToCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteNonUniqueManyToOneToCQ> _myselfExistsMap;
    public Map<String, WhiteNonUniqueManyToOneToCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteNonUniqueManyToOneToCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteNonUniqueManyToOneToCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteNonUniqueManyToOneToCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteNonUniqueManyToOneToCB.class.getName(); }
    protected String xCQ() { return WhiteNonUniqueManyToOneToCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
