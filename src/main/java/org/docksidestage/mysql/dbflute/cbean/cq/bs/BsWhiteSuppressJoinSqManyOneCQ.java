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
 * The base condition-query of white_suppress_join_sq_many_one.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSuppressJoinSqManyOneCQ extends AbstractBsWhiteSuppressJoinSqManyOneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSuppressJoinSqManyOneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSuppressJoinSqManyOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_suppress_join_sq_many_one) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSuppressJoinSqManyOneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSuppressJoinSqManyOneCIQ xcreateCIQ() {
        WhiteSuppressJoinSqManyOneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSuppressJoinSqManyOneCIQ xnewCIQ() {
        return new WhiteSuppressJoinSqManyOneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_suppress_join_sq_many_one on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSuppressJoinSqManyOneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSuppressJoinSqManyOneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _manyOneId;
    public ConditionValue xdfgetManyOneId()
    { if (_manyOneId == null) { _manyOneId = nCV(); }
      return _manyOneId; }
    protected ConditionValue xgetCValueManyOneId() { return xdfgetManyOneId(); }

    public Map<String, WhiteSuppressJoinSqManyCQ> xdfgetManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList() { return xgetSQueMap("manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList"); }
    public String keepManyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("manyOneId_ExistsReferrer_WhiteSuppressJoinSqManyList", sq); }

    public Map<String, WhiteSuppressJoinSqManyCQ> xdfgetManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList() { return xgetSQueMap("manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList"); }
    public String keepManyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("manyOneId_NotExistsReferrer_WhiteSuppressJoinSqManyList", sq); }

    public Map<String, WhiteSuppressJoinSqManyCQ> xdfgetManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList() { return xgetSQueMap("manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList"); }
    public String keepManyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("manyOneId_SpecifyDerivedReferrer_WhiteSuppressJoinSqManyList", sq); }

    public Map<String, WhiteSuppressJoinSqManyCQ> xdfgetManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList() { return xgetSQueMap("manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList"); }
    public String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyCQ sq) { return xkeepSQue("manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList", sq); }
    public Map<String, Object> xdfgetManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter() { return xgetSQuePmMap("manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList"); }
    public String keepManyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyListParameter(Object pm) { return xkeepSQuePm("manyOneId_QueryDerivedReferrer_WhiteSuppressJoinSqManyList", pm); }

    /**
     * Add order-by as ascend. <br>
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneId_Asc() { regOBA("MANY_ONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANY_ONE_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneId_Desc() { regOBD("MANY_ONE_ID"); return this; }

    protected ConditionValue _manyOneName;
    public ConditionValue xdfgetManyOneName()
    { if (_manyOneName == null) { _manyOneName = nCV(); }
      return _manyOneName; }
    protected ConditionValue xgetCValueManyOneName() { return xdfgetManyOneName(); }

    /**
     * Add order-by as ascend. <br>
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneName_Asc() { regOBA("MANY_ONE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANY_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneName_Desc() { regOBD("MANY_ONE_NAME"); return this; }

    protected ConditionValue _manyOneOneId;
    public ConditionValue xdfgetManyOneOneId()
    { if (_manyOneOneId == null) { _manyOneOneId = nCV(); }
      return _manyOneOneId; }
    protected ConditionValue xgetCValueManyOneOneId() { return xdfgetManyOneOneId(); }

    /**
     * Add order-by as ascend. <br>
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneOneId_Asc() { regOBA("MANY_ONE_ONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one}
     * @return this. (NotNull)
     */
    public BsWhiteSuppressJoinSqManyOneCQ addOrderBy_ManyOneOneId_Desc() { regOBD("MANY_ONE_ONE_ID"); return this; }

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
    public BsWhiteSuppressJoinSqManyOneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSuppressJoinSqManyOneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSuppressJoinSqManyOneCQ bq = (WhiteSuppressJoinSqManyOneCQ)bqs;
        WhiteSuppressJoinSqManyOneCQ uq = (WhiteSuppressJoinSqManyOneCQ)uqs;
        if (bq.hasConditionQueryWhiteSuppressJoinSqManyOneOne()) {
            uq.queryWhiteSuppressJoinSqManyOneOne().reflectRelationOnUnionQuery(bq.queryWhiteSuppressJoinSqManyOneOne(), uq.queryWhiteSuppressJoinSqManyOneOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSuppressJoinSqManyOneOneCQ queryWhiteSuppressJoinSqManyOneOne() {
        return xdfgetConditionQueryWhiteSuppressJoinSqManyOneOne();
    }
    public WhiteSuppressJoinSqManyOneOneCQ xdfgetConditionQueryWhiteSuppressJoinSqManyOneOne() {
        String prop = "whiteSuppressJoinSqManyOneOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSuppressJoinSqManyOneOne()); xsetupOuterJoinWhiteSuppressJoinSqManyOneOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSuppressJoinSqManyOneOneCQ xcreateQueryWhiteSuppressJoinSqManyOneOne() {
        String nrp = xresolveNRP("white_suppress_join_sq_many_one", "whiteSuppressJoinSqManyOneOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSuppressJoinSqManyOneOneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSuppressJoinSqManyOneOne", nrp);
    }
    protected void xsetupOuterJoinWhiteSuppressJoinSqManyOneOne() { xregOutJo("whiteSuppressJoinSqManyOneOne"); }
    public boolean hasConditionQueryWhiteSuppressJoinSqManyOneOne() { return xhasQueRlMap("whiteSuppressJoinSqManyOneOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteSuppressJoinSqManyOneCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqManyOneCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSuppressJoinSqManyOneCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSuppressJoinSqManyOneCQ> _myselfExistsMap;
    public Map<String, WhiteSuppressJoinSqManyOneCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSuppressJoinSqManyOneCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSuppressJoinSqManyOneCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSuppressJoinSqManyOneCB.class.getName(); }
    protected String xCQ() { return WhiteSuppressJoinSqManyOneCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
