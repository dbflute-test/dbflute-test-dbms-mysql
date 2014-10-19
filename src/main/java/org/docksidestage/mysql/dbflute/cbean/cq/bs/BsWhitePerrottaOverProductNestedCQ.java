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
 * The base condition-query of white_perrotta_over_product_nested.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverProductNestedCQ extends AbstractBsWhitePerrottaOverProductNestedCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverProductNestedCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverProductNestedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_perrotta_over_product_nested) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePerrottaOverProductNestedCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePerrottaOverProductNestedCIQ xcreateCIQ() {
        WhitePerrottaOverProductNestedCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePerrottaOverProductNestedCIQ xnewCIQ() {
        return new WhitePerrottaOverProductNestedCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_perrotta_over_product_nested on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePerrottaOverProductNestedCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePerrottaOverProductNestedCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productNestedCode;
    public ConditionValue xdfgetProductNestedCode()
    { if (_productNestedCode == null) { _productNestedCode = nCV(); }
      return _productNestedCode; }
    protected ConditionValue xgetCValueProductNestedCode() { return xdfgetProductNestedCode(); }

    public Map<String, WhitePerrottaOverProductCQ> xdfgetProductNestedCode_ExistsReferrer_WhitePerrottaOverProductList() { return xgetSQueMap("productNestedCode_ExistsReferrer_WhitePerrottaOverProductList"); }
    public String keepProductNestedCode_ExistsReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq) { return xkeepSQue("productNestedCode_ExistsReferrer_WhitePerrottaOverProductList", sq); }

    public Map<String, WhitePerrottaOverProductCQ> xdfgetProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList() { return xgetSQueMap("productNestedCode_NotExistsReferrer_WhitePerrottaOverProductList"); }
    public String keepProductNestedCode_NotExistsReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq) { return xkeepSQue("productNestedCode_NotExistsReferrer_WhitePerrottaOverProductList", sq); }

    public Map<String, WhitePerrottaOverProductCQ> xdfgetProductNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList() { return xgetSQueMap("productNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList"); }
    public String keepProductNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq) { return xkeepSQue("productNestedCode_SpecifyDerivedReferrer_WhitePerrottaOverProductList", sq); }

    public Map<String, WhitePerrottaOverProductCQ> xdfgetProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList() { return xgetSQueMap("productNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList"); }
    public String keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList(WhitePerrottaOverProductCQ sq) { return xkeepSQue("productNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList", sq); }
    public Map<String, Object> xdfgetProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductListParameter() { return xgetSQuePmMap("productNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList"); }
    public String keepProductNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductListParameter(Object pm) { return xkeepSQuePm("productNestedCode_QueryDerivedReferrer_WhitePerrottaOverProductList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductNestedCQ addOrderBy_ProductNestedCode_Asc() { regOBA("PRODUCT_NESTED_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductNestedCQ addOrderBy_ProductNestedCode_Desc() { regOBD("PRODUCT_NESTED_CODE"); return this; }

    protected ConditionValue _productNestedName;
    public ConditionValue xdfgetProductNestedName()
    { if (_productNestedName == null) { _productNestedName = nCV(); }
      return _productNestedName; }
    protected ConditionValue xgetCValueProductNestedName() { return xdfgetProductNestedName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductNestedCQ addOrderBy_ProductNestedName_Asc() { regOBA("PRODUCT_NESTED_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductNestedCQ addOrderBy_ProductNestedName_Desc() { regOBD("PRODUCT_NESTED_NAME"); return this; }

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
    public BsWhitePerrottaOverProductNestedCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePerrottaOverProductNestedCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhitePerrottaOverProductNestedCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePerrottaOverProductNestedCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePerrottaOverProductNestedCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverProductNestedCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePerrottaOverProductNestedCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePerrottaOverProductNestedCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePerrottaOverProductNestedCQ> _myselfExistsMap;
    public Map<String, WhitePerrottaOverProductNestedCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePerrottaOverProductNestedCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePerrottaOverProductNestedCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePerrottaOverProductNestedCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePerrottaOverProductNestedCB.class.getName(); }
    protected String xCQ() { return WhitePerrottaOverProductNestedCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
