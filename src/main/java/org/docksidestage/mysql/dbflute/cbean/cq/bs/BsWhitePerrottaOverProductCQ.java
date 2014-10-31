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
 * The base condition-query of white_perrotta_over_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverProductCQ extends AbstractBsWhitePerrottaOverProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_perrotta_over_product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePerrottaOverProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePerrottaOverProductCIQ xcreateCIQ() {
        WhitePerrottaOverProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePerrottaOverProductCIQ xnewCIQ() {
        return new WhitePerrottaOverProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_perrotta_over_product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePerrottaOverProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePerrottaOverProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, WhitePerrottaOverMemberCQ> xdfgetProductId_ExistsReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("productId_ExistsReferrer_WhitePerrottaOverMemberList"); }
    public String keepProductId_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("productId_ExistsReferrer_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList() { return xgetSQueMap("productId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList"); }
    public String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_ExistsReferrer_WhitePerrottaOverTraceByNextProductIdList", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList() { return xgetSQueMap("productId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList"); }
    public String keepProductId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_ExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> xdfgetProductId_NotExistsReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("productId_NotExistsReferrer_WhitePerrottaOverMemberList"); }
    public String keepProductId_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList() { return xgetSQueMap("productId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList"); }
    public String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WhitePerrottaOverTraceByNextProductIdList", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList() { return xgetSQueMap("productId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList"); }
    public String keepProductId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WhitePerrottaOverTraceByPreviousProductIdList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> xdfgetProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList"); }
    public String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WhitePerrottaOverMemberList", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList"); }
    public String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList", sq); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList"); }
    public String keepProductId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> xdfgetProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList() { return xgetSQueMap("productId_QueryDerivedReferrer_WhitePerrottaOverMemberList"); }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WhitePerrottaOverMemberList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WhitePerrottaOverMemberList"); }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WhitePerrottaOverMemberList", pm); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList() { return xgetSQueMap("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList"); }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList"); }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByNextProductIdList", pm); }

    public Map<String, WhitePerrottaOverTraceCQ> xdfgetProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList() { return xgetSQueMap("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList"); }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverTraceCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList"); }
    public String keepProductId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WhitePerrottaOverTraceByPreviousProductIdList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue xdfgetProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue xgetCValueProductName() { return xdfgetProductName(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productNestedCode;
    public ConditionValue xdfgetProductNestedCode()
    { if (_productNestedCode == null) { _productNestedCode = nCV(); }
      return _productNestedCode; }
    protected ConditionValue xgetCValueProductNestedCode() { return xdfgetProductNestedCode(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductCQ addOrderBy_ProductNestedCode_Asc() { regOBA("PRODUCT_NESTED_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverProductCQ addOrderBy_ProductNestedCode_Desc() { regOBD("PRODUCT_NESTED_CODE"); return this; }

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
    public BsWhitePerrottaOverProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePerrottaOverProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhitePerrottaOverProductCQ bq = (WhitePerrottaOverProductCQ)bqs;
        WhitePerrottaOverProductCQ uq = (WhitePerrottaOverProductCQ)uqs;
        if (bq.hasConditionQueryWhitePerrottaOverProductNested()) {
            uq.queryWhitePerrottaOverProductNested().reflectRelationOnUnionQuery(bq.queryWhitePerrottaOverProductNested(), uq.queryWhitePerrottaOverProductNested());
        }
        if (bq.hasConditionQueryWhitePerrottaOverTraceAsPerrotta()) {
            uq.queryWhitePerrottaOverTraceAsPerrotta().reflectRelationOnUnionQuery(bq.queryWhitePerrottaOverTraceAsPerrotta(), uq.queryWhitePerrottaOverTraceAsPerrotta());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePerrottaOverProductNestedCQ queryWhitePerrottaOverProductNested() {
        return xdfgetConditionQueryWhitePerrottaOverProductNested();
    }
    public WhitePerrottaOverProductNestedCQ xdfgetConditionQueryWhitePerrottaOverProductNested() {
        String prop = "whitePerrottaOverProductNested";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePerrottaOverProductNested()); xsetupOuterJoinWhitePerrottaOverProductNested(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePerrottaOverProductNestedCQ xcreateQueryWhitePerrottaOverProductNested() {
        String nrp = xresolveNRP("white_perrotta_over_product", "whitePerrottaOverProductNested"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePerrottaOverProductNestedCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePerrottaOverProductNested", nrp);
    }
    protected void xsetupOuterJoinWhitePerrottaOverProductNested() { xregOutJo("whitePerrottaOverProductNested"); }
    public boolean hasConditionQueryWhitePerrottaOverProductNested() { return xhasQueRlMap("whitePerrottaOverProductNested"); }

    /**
     * Get the condition-query for relation table. <br>
     * white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePerrottaOverTraceCQ queryWhitePerrottaOverTraceAsPerrotta() {
        return xdfgetConditionQueryWhitePerrottaOverTraceAsPerrotta();
    }
    public WhitePerrottaOverTraceCQ xdfgetConditionQueryWhitePerrottaOverTraceAsPerrotta() {
        String prop = "whitePerrottaOverTraceAsPerrotta";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePerrottaOverTraceAsPerrotta()); xsetupOuterJoinWhitePerrottaOverTraceAsPerrotta(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePerrottaOverTraceCQ xcreateQueryWhitePerrottaOverTraceAsPerrotta() {
        String nrp = xresolveNRP("white_perrotta_over_product", "whitePerrottaOverTraceAsPerrotta"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePerrottaOverTraceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePerrottaOverTraceAsPerrotta", nrp);
    }
    protected void xsetupOuterJoinWhitePerrottaOverTraceAsPerrotta() { xregOutJo("whitePerrottaOverTraceAsPerrotta"); }
    public boolean hasConditionQueryWhitePerrottaOverTraceAsPerrotta() { return xhasQueRlMap("whitePerrottaOverTraceAsPerrotta"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhitePerrottaOverProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePerrottaOverProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePerrottaOverProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePerrottaOverProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePerrottaOverProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePerrottaOverProductCQ> _myselfExistsMap;
    public Map<String, WhitePerrottaOverProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePerrottaOverProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePerrottaOverProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePerrottaOverProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePerrottaOverProductCB.class.getName(); }
    protected String xCQ() { return WhitePerrottaOverProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
