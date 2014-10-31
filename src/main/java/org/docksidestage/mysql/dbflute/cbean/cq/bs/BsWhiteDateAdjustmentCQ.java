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
 * The base condition-query of white_date_adjustment.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDateAdjustmentCQ extends AbstractBsWhiteDateAdjustmentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDateAdjustmentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDateAdjustmentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_date_adjustment) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDateAdjustmentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDateAdjustmentCIQ xcreateCIQ() {
        WhiteDateAdjustmentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDateAdjustmentCIQ xnewCIQ() {
        return new WhiteDateAdjustmentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_date_adjustment on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDateAdjustmentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDateAdjustmentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dateAdjustmentId;
    public ConditionValue xdfgetDateAdjustmentId()
    { if (_dateAdjustmentId == null) { _dateAdjustmentId = nCV(); }
      return _dateAdjustmentId; }
    protected ConditionValue xgetCValueDateAdjustmentId() { return xdfgetDateAdjustmentId(); }

    /** 
     * Add order-by as ascend. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_DateAdjustmentId_Asc() { regOBA("DATE_ADJUSTMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_DateAdjustmentId_Desc() { regOBD("DATE_ADJUSTMENT_ID"); return this; }

    protected ConditionValue _adjustedDate;
    public ConditionValue xdfgetAdjustedDate()
    { if (_adjustedDate == null) { _adjustedDate = nCV(); }
      return _adjustedDate; }
    protected ConditionValue xgetCValueAdjustedDate() { return xdfgetAdjustedDate(); }

    /** 
     * Add order-by as ascend. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDate_Asc() { regOBA("ADJUSTED_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDate_Desc() { regOBD("ADJUSTED_DATE"); return this; }

    protected ConditionValue _adjustedDatetime;
    public ConditionValue xdfgetAdjustedDatetime()
    { if (_adjustedDatetime == null) { _adjustedDatetime = nCV(); }
      return _adjustedDatetime; }
    protected ConditionValue xgetCValueAdjustedDatetime() { return xdfgetAdjustedDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDatetime_Asc() { regOBA("ADJUSTED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedDatetime_Desc() { regOBD("ADJUSTED_DATETIME"); return this; }

    protected ConditionValue _adjustedTime;
    public ConditionValue xdfgetAdjustedTime()
    { if (_adjustedTime == null) { _adjustedTime = nCV(); }
      return _adjustedTime; }
    protected ConditionValue xgetCValueAdjustedTime() { return xdfgetAdjustedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedTime_Asc() { regOBA("ADJUSTED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedTime_Desc() { regOBD("ADJUSTED_TIME"); return this; }

    protected ConditionValue _adjustedInteger;
    public ConditionValue xdfgetAdjustedInteger()
    { if (_adjustedInteger == null) { _adjustedInteger = nCV(); }
      return _adjustedInteger; }
    protected ConditionValue xgetCValueAdjustedInteger() { return xdfgetAdjustedInteger(); }

    /** 
     * Add order-by as ascend. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedInteger_Asc() { regOBA("ADJUSTED_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedInteger_Desc() { regOBD("ADJUSTED_INTEGER"); return this; }

    protected ConditionValue _adjustedNamedStringLong;
    public ConditionValue xdfgetAdjustedNamedStringLong()
    { if (_adjustedNamedStringLong == null) { _adjustedNamedStringLong = nCV(); }
      return _adjustedNamedStringLong; }
    protected ConditionValue xgetCValueAdjustedNamedStringLong() { return xdfgetAdjustedNamedStringLong(); }

    /** 
     * Add order-by as ascend. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedStringLong_Asc() { regOBA("ADJUSTED_NAMED_STRING_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedStringLong_Desc() { regOBD("ADJUSTED_NAMED_STRING_LONG"); return this; }

    protected ConditionValue _adjustedNamedTypedLong;
    public ConditionValue xdfgetAdjustedNamedTypedLong()
    { if (_adjustedNamedTypedLong == null) { _adjustedNamedTypedLong = nCV(); }
      return _adjustedNamedTypedLong; }
    protected ConditionValue xgetCValueAdjustedNamedTypedLong() { return xdfgetAdjustedNamedTypedLong(); }

    /** 
     * Add order-by as ascend. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedTypedLong_Asc() { regOBA("ADJUSTED_NAMED_TYPED_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedNamedTypedLong_Desc() { regOBD("ADJUSTED_NAMED_TYPED_LONG"); return this; }

    protected ConditionValue _adjustedPinpointStringLong;
    public ConditionValue xdfgetAdjustedPinpointStringLong()
    { if (_adjustedPinpointStringLong == null) { _adjustedPinpointStringLong = nCV(); }
      return _adjustedPinpointStringLong; }
    protected ConditionValue xgetCValueAdjustedPinpointStringLong() { return xdfgetAdjustedPinpointStringLong(); }

    /** 
     * Add order-by as ascend. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointStringLong_Asc() { regOBA("ADJUSTED_PINPOINT_STRING_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointStringLong_Desc() { regOBD("ADJUSTED_PINPOINT_STRING_LONG"); return this; }

    protected ConditionValue _adjustedPinpointTypedLong;
    public ConditionValue xdfgetAdjustedPinpointTypedLong()
    { if (_adjustedPinpointTypedLong == null) { _adjustedPinpointTypedLong = nCV(); }
      return _adjustedPinpointTypedLong; }
    protected ConditionValue xgetCValueAdjustedPinpointTypedLong() { return xdfgetAdjustedPinpointTypedLong(); }

    /** 
     * Add order-by as ascend. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointTypedLong_Asc() { regOBA("ADJUSTED_PINPOINT_TYPED_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPinpointTypedLong_Desc() { regOBD("ADJUSTED_PINPOINT_TYPED_LONG"); return this; }

    protected ConditionValue _adjustedPlainLong;
    public ConditionValue xdfgetAdjustedPlainLong()
    { if (_adjustedPlainLong == null) { _adjustedPlainLong = nCV(); }
      return _adjustedPlainLong; }
    protected ConditionValue xgetCValueAdjustedPlainLong() { return xdfgetAdjustedPlainLong(); }

    /** 
     * Add order-by as ascend. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPlainLong_Asc() { regOBA("ADJUSTED_PLAIN_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedPlainLong_Desc() { regOBD("ADJUSTED_PLAIN_LONG"); return this; }

    protected ConditionValue _adjustedString;
    public ConditionValue xdfgetAdjustedString()
    { if (_adjustedString == null) { _adjustedString = nCV(); }
      return _adjustedString; }
    protected ConditionValue xgetCValueAdjustedString() { return xdfgetAdjustedString(); }

    /** 
     * Add order-by as ascend. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedString_Asc() { regOBA("ADJUSTED_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteDateAdjustmentCQ addOrderBy_AdjustedString_Desc() { regOBD("ADJUSTED_STRING"); return this; }

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
    public BsWhiteDateAdjustmentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDateAdjustmentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDateAdjustmentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDateAdjustmentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDateAdjustmentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDateAdjustmentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDateAdjustmentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDateAdjustmentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDateAdjustmentCQ> _myselfExistsMap;
    public Map<String, WhiteDateAdjustmentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDateAdjustmentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDateAdjustmentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDateAdjustmentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDateAdjustmentCB.class.getName(); }
    protected String xCQ() { return WhiteDateAdjustmentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
