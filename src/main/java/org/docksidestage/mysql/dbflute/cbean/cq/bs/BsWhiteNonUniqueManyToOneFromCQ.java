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
 * The base condition-query of white_non_unique_many_to_one_from.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteNonUniqueManyToOneFromCQ extends AbstractBsWhiteNonUniqueManyToOneFromCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteNonUniqueManyToOneFromCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteNonUniqueManyToOneFromCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_non_unique_many_to_one_from) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteNonUniqueManyToOneFromCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteNonUniqueManyToOneFromCIQ xcreateCIQ() {
        WhiteNonUniqueManyToOneFromCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteNonUniqueManyToOneFromCIQ xnewCIQ() {
        return new WhiteNonUniqueManyToOneFromCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_non_unique_many_to_one_from on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteNonUniqueManyToOneFromCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteNonUniqueManyToOneFromCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fromId;
    public ConditionValue xdfgetFromId()
    { if (_fromId == null) { _fromId = nCV(); }
      return _fromId; }
    protected ConditionValue xgetCValueFromId() { return xdfgetFromId(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_FromId_Asc() { regOBA("FROM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_FromId_Desc() { regOBD("FROM_ID"); return this; }

    protected ConditionValue _fromName;
    public ConditionValue xdfgetFromName()
    { if (_fromName == null) { _fromName = nCV(); }
      return _fromName; }
    protected ConditionValue xgetCValueFromName() { return xdfgetFromName(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_FromName_Asc() { regOBA("FROM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_FromName_Desc() { regOBD("FROM_NAME"); return this; }

    protected ConditionValue _nonUniqueCode;
    public ConditionValue xdfgetNonUniqueCode()
    { if (_nonUniqueCode == null) { _nonUniqueCode = nCV(); }
      return _nonUniqueCode; }
    protected ConditionValue xgetCValueNonUniqueCode() { return xdfgetNonUniqueCode(); }

    /**
     * Add order-by as ascend. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_NonUniqueCode_Asc() { regOBA("NON_UNIQUE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_NonUniqueCode_Desc() { regOBD("NON_UNIQUE_CODE"); return this; }

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
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_BeginDate_Asc() { regOBA("BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_BeginDate_Desc() { regOBD("BEGIN_DATE"); return this; }

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
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_EndDate_Asc() { regOBA("END_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_EndDate_Desc() { regOBD("END_DATE"); return this; }

    protected ConditionValue _manyPoint;
    public ConditionValue xdfgetManyPoint()
    { if (_manyPoint == null) { _manyPoint = nCV(); }
      return _manyPoint; }
    protected ConditionValue xgetCValueManyPoint() { return xdfgetManyPoint(); }

    /**
     * Add order-by as ascend. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_ManyPoint_Asc() { regOBA("MANY_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNonUniqueManyToOneFromCQ addOrderBy_ManyPoint_Desc() { regOBD("MANY_POINT"); return this; }

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
    public BsWhiteNonUniqueManyToOneFromCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteNonUniqueManyToOneFromCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteNonUniqueManyToOneFromCQ bq = (WhiteNonUniqueManyToOneFromCQ)bqs;
        WhiteNonUniqueManyToOneFromCQ uq = (WhiteNonUniqueManyToOneFromCQ)uqs;
        if (bq.hasConditionQueryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne()) {
            uq.queryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne().reflectRelationOnUnionQuery(bq.queryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne(), uq.queryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_NON_UNIQUE_MANY_TO_ONE_TO by my NON_UNIQUE_CODE, named 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteNonUniqueManyToOneToCQ queryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() {
        return xdfgetConditionQueryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne();
    }
    public WhiteNonUniqueManyToOneToCQ xdfgetConditionQueryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() {
        String prop = "whiteNonUniqueManyToOneToAsNonUniqueManyToOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne()); xsetupOuterJoinWhiteNonUniqueManyToOneToAsNonUniqueManyToOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteNonUniqueManyToOneToCQ xcreateQueryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() {
        String nrp = xresolveNRP("white_non_unique_many_to_one_from", "whiteNonUniqueManyToOneToAsNonUniqueManyToOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteNonUniqueManyToOneToCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteNonUniqueManyToOneToAsNonUniqueManyToOne", nrp);
    }
    protected void xsetupOuterJoinWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() { xregOutJo("whiteNonUniqueManyToOneToAsNonUniqueManyToOne"); }
    public boolean hasConditionQueryWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() { return xhasQueRlMap("whiteNonUniqueManyToOneToAsNonUniqueManyToOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteNonUniqueManyToOneFromCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteNonUniqueManyToOneFromCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteNonUniqueManyToOneFromCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteNonUniqueManyToOneFromCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteNonUniqueManyToOneFromCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteNonUniqueManyToOneFromCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteNonUniqueManyToOneFromCQ> _myselfExistsMap;
    public Map<String, WhiteNonUniqueManyToOneFromCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteNonUniqueManyToOneFromCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteNonUniqueManyToOneFromCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteNonUniqueManyToOneFromCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteNonUniqueManyToOneFromCB.class.getName(); }
    protected String xCQ() { return WhiteNonUniqueManyToOneFromCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
