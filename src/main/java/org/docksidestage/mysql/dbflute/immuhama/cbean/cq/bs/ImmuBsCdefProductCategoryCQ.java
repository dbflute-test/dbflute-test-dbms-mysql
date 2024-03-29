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
package org.docksidestage.mysql.dbflute.immuhama.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.ciq.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.*;

/**
 * The base condition-query of cdef_product_category.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsCdefProductCategoryCQ extends ImmuAbstractBsCdefProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuCdefProductCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsCdefProductCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from cdef_product_category) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuCdefProductCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuCdefProductCategoryCIQ xcreateCIQ() {
        ImmuCdefProductCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuCdefProductCategoryCIQ xnewCIQ() {
        return new ImmuCdefProductCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join cdef_product_category on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuCdefProductCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuCdefProductCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productCategoryCode;
    public ConditionValue xdfgetProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue xgetCValueProductCategoryCode() { return xdfgetProductCategoryCode(); }

    public Map<String, ImmuCdefProductCategoryCQ> xdfgetProductCategoryCode_ExistsReferrer_CdefProductCategorySelfList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_CdefProductCategorySelfList"); }
    public String keepProductCategoryCode_ExistsReferrer_CdefProductCategorySelfList(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_CdefProductCategorySelfList", sq); }

    public Map<String, ImmuProductDetailCQ> xdfgetProductCategoryCode_ExistsReferrer_ProductDetailList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductDetailList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductDetailList(ImmuProductDetailCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductDetailList", sq); }

    public Map<String, ImmuCdefProductCategoryCQ> xdfgetProductCategoryCode_NotExistsReferrer_CdefProductCategorySelfList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_CdefProductCategorySelfList"); }
    public String keepProductCategoryCode_NotExistsReferrer_CdefProductCategorySelfList(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_CdefProductCategorySelfList", sq); }

    public Map<String, ImmuProductDetailCQ> xdfgetProductCategoryCode_NotExistsReferrer_ProductDetailList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductDetailList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductDetailList(ImmuProductDetailCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductDetailList", sq); }

    public Map<String, ImmuCdefProductCategoryCQ> xdfgetProductCategoryCode_SpecifyDerivedReferrer_CdefProductCategorySelfList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_CdefProductCategorySelfList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_CdefProductCategorySelfList(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_CdefProductCategorySelfList", sq); }

    public Map<String, ImmuProductDetailCQ> xdfgetProductCategoryCode_SpecifyDerivedReferrer_ProductDetailList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductDetailList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductDetailList(ImmuProductDetailCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductDetailList", sq); }

    public Map<String, ImmuCdefProductCategoryCQ> xdfgetProductCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfList(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfList", sq); }
    public Map<String, Object> xdfgetProductCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_CdefProductCategorySelfList", pm); }

    public Map<String, ImmuProductDetailCQ> xdfgetProductCategoryCode_QueryDerivedReferrer_ProductDetailList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductDetailList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductDetailList(ImmuProductDetailCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductDetailList", sq); }
    public Map<String, Object> xdfgetProductCategoryCode_QueryDerivedReferrer_ProductDetailListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductDetailList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductDetailListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductDetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefProductCategoryCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefProductCategoryCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productCategoryName;
    public ConditionValue xdfgetProductCategoryName()
    { if (_productCategoryName == null) { _productCategoryName = nCV(); }
      return _productCategoryName; }
    protected ConditionValue xgetCValueProductCategoryName() { return xdfgetProductCategoryName(); }

    /**
     * Add order-by as ascend. <br>
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefProductCategoryCQ addOrderBy_ProductCategoryName_Asc() { regOBA("PRODUCT_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsCdefProductCategoryCQ addOrderBy_ProductCategoryName_Desc() { regOBD("PRODUCT_CATEGORY_NAME"); return this; }

    protected ConditionValue _parentCategoryCode;
    public ConditionValue xdfgetParentCategoryCode()
    { if (_parentCategoryCode == null) { _parentCategoryCode = nCV(); }
      return _parentCategoryCode; }
    protected ConditionValue xgetCValueParentCategoryCode() { return xdfgetParentCategoryCode(); }

    /**
     * Add order-by as ascend. <br>
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to cdef_product_category}
     * @return this. (NotNull)
     */
    public ImmuBsCdefProductCategoryCQ addOrderBy_ParentCategoryCode_Asc() { regOBA("PARENT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to cdef_product_category}
     * @return this. (NotNull)
     */
    public ImmuBsCdefProductCategoryCQ addOrderBy_ParentCategoryCode_Desc() { regOBD("PARENT_CATEGORY_CODE"); return this; }

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
    public ImmuBsCdefProductCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsCdefProductCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuCdefProductCategoryCQ bq = (ImmuCdefProductCategoryCQ)bqs;
        ImmuCdefProductCategoryCQ uq = (ImmuCdefProductCategoryCQ)uqs;
        if (bq.hasConditionQueryCdefProductCategorySelf()) {
            uq.queryCdefProductCategorySelf().reflectRelationOnUnionQuery(bq.queryCdefProductCategorySelf(), uq.queryCdefProductCategorySelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'cdefProductCategorySelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuCdefProductCategoryCQ queryCdefProductCategorySelf() {
        return xdfgetConditionQueryCdefProductCategorySelf();
    }
    public ImmuCdefProductCategoryCQ xdfgetConditionQueryCdefProductCategorySelf() {
        String prop = "cdefProductCategorySelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCdefProductCategorySelf()); xsetupOuterJoinCdefProductCategorySelf(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuCdefProductCategoryCQ xcreateQueryCdefProductCategorySelf() {
        String nrp = xresolveNRP("cdef_product_category", "cdefProductCategorySelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuCdefProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cdefProductCategorySelf", nrp);
    }
    protected void xsetupOuterJoinCdefProductCategorySelf() { xregOutJo("cdefProductCategorySelf"); }
    public boolean hasConditionQueryCdefProductCategorySelf() { return xhasQueRlMap("cdefProductCategorySelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuCdefProductCategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuCdefProductCategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuCdefProductCategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuCdefProductCategoryCQ> _myselfExistsMap;
    public Map<String, ImmuCdefProductCategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuCdefProductCategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuCdefProductCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuCdefProductCategoryCB.class.getName(); }
    protected String xCQ() { return ImmuCdefProductCategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
