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
 * The base condition-query of white_stiletto_alias.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteStilettoAliasCQ extends AbstractBsWhiteStilettoAliasCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteStilettoAliasCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteStilettoAliasCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_stiletto_alias) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteStilettoAliasCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteStilettoAliasCIQ xcreateCIQ() {
        WhiteStilettoAliasCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteStilettoAliasCIQ xnewCIQ() {
        return new WhiteStilettoAliasCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_stiletto_alias on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteStilettoAliasCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteStilettoAliasCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stilettoAliasId;
    public ConditionValue xdfgetStilettoAliasId()
    { if (_stilettoAliasId == null) { _stilettoAliasId = nCV(); }
      return _stilettoAliasId; }
    protected ConditionValue xgetCValueStilettoAliasId() { return xdfgetStilettoAliasId(); }

    public Map<String, WhiteStilettoAliasRefCQ> xdfgetStilettoAliasId_ExistsReferrer_WhiteStilettoAliasRefList() { return xgetSQueMap("stilettoAliasId_ExistsReferrer_WhiteStilettoAliasRefList"); }
    public String keepStilettoAliasId_ExistsReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("stilettoAliasId_ExistsReferrer_WhiteStilettoAliasRefList", sq); }

    public Map<String, WhiteStilettoAliasRefCQ> xdfgetStilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList() { return xgetSQueMap("stilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList"); }
    public String keepStilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("stilettoAliasId_NotExistsReferrer_WhiteStilettoAliasRefList", sq); }

    public Map<String, WhiteStilettoAliasRefCQ> xdfgetStilettoAliasId_SpecifyDerivedReferrer_WhiteStilettoAliasRefList() { return xgetSQueMap("stilettoAliasId_SpecifyDerivedReferrer_WhiteStilettoAliasRefList"); }
    public String keepStilettoAliasId_SpecifyDerivedReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("stilettoAliasId_SpecifyDerivedReferrer_WhiteStilettoAliasRefList", sq); }

    public Map<String, WhiteStilettoAliasRefCQ> xdfgetStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList() { return xgetSQueMap("stilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList"); }
    public String keepStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList(WhiteStilettoAliasRefCQ sq) { return xkeepSQue("stilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList", sq); }
    public Map<String, Object> xdfgetStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefListParameter() { return xgetSQuePmMap("stilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList"); }
    public String keepStilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefListParameter(Object pm) { return xkeepSQuePm("stilettoAliasId_QueryDerivedReferrer_WhiteStilettoAliasRefList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_StilettoAliasId_Asc() { regOBA("STILETTO_ALIAS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STILETTO_ALIAS_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_StilettoAliasId_Desc() { regOBD("STILETTO_ALIAS_ID"); return this; }

    protected ConditionValue _foo;
    public ConditionValue xdfgetFoo()
    { if (_foo == null) { _foo = nCV(); }
      return _foo; }
    protected ConditionValue xgetCValueFoo() { return xdfgetFoo(); }

    /**
     * Add order-by as ascend. <br>
     * FOO: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo_Asc() { regOBA("FOO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOO: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo_Desc() { regOBD("FOO"); return this; }

    protected ConditionValue _foo0;
    public ConditionValue xdfgetFoo0()
    { if (_foo0 == null) { _foo0 = nCV(); }
      return _foo0; }
    protected ConditionValue xgetCValueFoo0() { return xdfgetFoo0(); }

    /**
     * Add order-by as ascend. <br>
     * FOO_0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo0_Asc() { regOBA("FOO_0"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOO_0: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo0_Desc() { regOBD("FOO_0"); return this; }

    protected ConditionValue _foo1;
    public ConditionValue xdfgetFoo1()
    { if (_foo1 == null) { _foo1 = nCV(); }
      return _foo1; }
    protected ConditionValue xgetCValueFoo1() { return xdfgetFoo1(); }

    /**
     * Add order-by as ascend. <br>
     * FOO_1: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo1_Asc() { regOBA("FOO_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOO_1: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo1_Desc() { regOBD("FOO_1"); return this; }

    protected ConditionValue _foo2;
    public ConditionValue xdfgetFoo2()
    { if (_foo2 == null) { _foo2 = nCV(); }
      return _foo2; }
    protected ConditionValue xgetCValueFoo2() { return xdfgetFoo2(); }

    /**
     * Add order-by as ascend. <br>
     * FOO2: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo2_Asc() { regOBA("FOO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOO2: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo2_Desc() { regOBD("FOO2"); return this; }

    protected ConditionValue _foo3;
    public ConditionValue xdfgetFoo3()
    { if (_foo3 == null) { _foo3 = nCV(); }
      return _foo3; }
    protected ConditionValue xgetCValueFoo3() { return xdfgetFoo3(); }

    /**
     * Add order-by as ascend. <br>
     * FOO_3: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo3_Asc() { regOBA("FOO_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOO_3: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo3_Desc() { regOBD("FOO_3"); return this; }

    protected ConditionValue _foo4;
    public ConditionValue xdfgetFoo4()
    { if (_foo4 == null) { _foo4 = nCV(); }
      return _foo4; }
    protected ConditionValue xgetCValueFoo4() { return xdfgetFoo4(); }

    /**
     * Add order-by as ascend. <br>
     * FOO4: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo4_Asc() { regOBA("FOO4"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOO4: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Foo4_Desc() { regOBD("FOO4"); return this; }

    protected ConditionValue _bar;
    public ConditionValue xdfgetBar()
    { if (_bar == null) { _bar = nCV(); }
      return _bar; }
    protected ConditionValue xgetCValueBar() { return xdfgetBar(); }

    /**
     * Add order-by as ascend. <br>
     * BAR: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Bar_Asc() { regOBA("BAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * BAR: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Bar_Desc() { regOBD("BAR"); return this; }

    protected ConditionValue _qux;
    public ConditionValue xdfgetQux()
    { if (_qux == null) { _qux = nCV(); }
      return _qux; }
    protected ConditionValue xgetCValueQux() { return xdfgetQux(); }

    /**
     * Add order-by as ascend. <br>
     * QUX: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Qux_Asc() { regOBA("QUX"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUX: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteStilettoAliasCQ addOrderBy_Qux_Desc() { regOBD("QUX"); return this; }

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
    public BsWhiteStilettoAliasCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteStilettoAliasCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteStilettoAliasCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteStilettoAliasCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteStilettoAliasCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteStilettoAliasCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteStilettoAliasCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteStilettoAliasCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteStilettoAliasCQ> _myselfExistsMap;
    public Map<String, WhiteStilettoAliasCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteStilettoAliasCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteStilettoAliasCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteStilettoAliasCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteStilettoAliasCB.class.getName(); }
    protected String xCQ() { return WhiteStilettoAliasCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
