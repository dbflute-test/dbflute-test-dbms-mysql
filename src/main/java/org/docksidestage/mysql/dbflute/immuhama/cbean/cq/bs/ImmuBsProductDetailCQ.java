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
 * The base condition-query of product_detail.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsProductDetailCQ extends ImmuAbstractBsProductDetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuProductDetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsProductDetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from product_detail) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuProductDetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuProductDetailCIQ xcreateCIQ() {
        ImmuProductDetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuProductDetailCIQ xnewCIQ() {
        return new ImmuProductDetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join product_detail on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuProductDetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuProductDetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productDetailId;
    public ConditionValue xdfgetProductDetailId()
    { if (_productDetailId == null) { _productDetailId = nCV(); }
      return _productDetailId; }
    protected ConditionValue xgetCValueProductDetailId() { return xdfgetProductDetailId(); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductDetailId_ExistsReferrer_PurchaseList() { return xgetSQueMap("productDetailId_ExistsReferrer_PurchaseList"); }
    public String keepProductDetailId_ExistsReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productDetailId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductDetailId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("productDetailId_NotExistsReferrer_PurchaseList"); }
    public String keepProductDetailId_NotExistsReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productDetailId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductDetailId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("productDetailId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepProductDetailId_SpecifyDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productDetailId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductDetailId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("productDetailId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductDetailId_QueryDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productDetailId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetProductDetailId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("productDetailId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductDetailId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("productDetailId_QueryDerivedReferrer_PurchaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (商品詳細ID)PRODUCT_DETAIL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductDetailId_Asc() { regOBA("PRODUCT_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品詳細ID)PRODUCT_DETAIL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductDetailId_Desc() { regOBD("PRODUCT_DETAIL_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue xdfgetProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue xgetCValueProductName() { return xdfgetProductName(); }

    /**
     * Add order-by as ascend. <br>
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue xdfgetProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue xgetCValueProductHandleCode() { return xdfgetProductHandleCode(); }

    /**
     * Add order-by as ascend. <br>
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productCategoryCode;
    public ConditionValue xdfgetProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue xgetCValueProductCategoryCode() { return xdfgetProductCategoryCode(); }

    /**
     * Add order-by as ascend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_category}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_category}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue xdfgetProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue xgetCValueProductStatusCode() { return xdfgetProductStatusCode(); }

    /**
     * Add order-by as ascend. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_status}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_status}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsProductDetailCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public ImmuBsProductDetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsProductDetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuProductDetailCQ bq = (ImmuProductDetailCQ)bqs;
        ImmuProductDetailCQ uq = (ImmuProductDetailCQ)uqs;
        if (bq.hasConditionQueryCdefProductCategory()) {
            uq.queryCdefProductCategory().reflectRelationOnUnionQuery(bq.queryCdefProductCategory(), uq.queryCdefProductCategory());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
        if (bq.hasConditionQueryCdefProductStatus()) {
            uq.queryCdefProductStatus().reflectRelationOnUnionQuery(bq.queryCdefProductStatus(), uq.queryCdefProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'cdefProductCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuCdefProductCategoryCQ queryCdefProductCategory() {
        return xdfgetConditionQueryCdefProductCategory();
    }
    public ImmuCdefProductCategoryCQ xdfgetConditionQueryCdefProductCategory() {
        String prop = "cdefProductCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCdefProductCategory()); xsetupOuterJoinCdefProductCategory(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuCdefProductCategoryCQ xcreateQueryCdefProductCategory() {
        String nrp = xresolveNRP("product_detail", "cdefProductCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuCdefProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cdefProductCategory", nrp);
    }
    protected void xsetupOuterJoinCdefProductCategory() { xregOutJo("cdefProductCategory"); }
    public boolean hasConditionQueryCdefProductCategory() { return xhasQueRlMap("cdefProductCategory"); }

    /**
     * Get the condition-query for relation table. <br>
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuProductCQ queryProduct() {
        return xdfgetConditionQueryProduct();
    }
    public ImmuProductCQ xdfgetConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("product_detail", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]商品ステータス)CDEF_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'cdefProductStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuCdefProductStatusCQ queryCdefProductStatus() {
        return xdfgetConditionQueryCdefProductStatus();
    }
    public ImmuCdefProductStatusCQ xdfgetConditionQueryCdefProductStatus() {
        String prop = "cdefProductStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCdefProductStatus()); xsetupOuterJoinCdefProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuCdefProductStatusCQ xcreateQueryCdefProductStatus() {
        String nrp = xresolveNRP("product_detail", "cdefProductStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuCdefProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "cdefProductStatus", nrp);
    }
    protected void xsetupOuterJoinCdefProductStatus() { xregOutJo("cdefProductStatus"); }
    public boolean hasConditionQueryCdefProductStatus() { return xhasQueRlMap("cdefProductStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuProductDetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuProductDetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuProductDetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuProductDetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuProductDetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuProductDetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuProductDetailCQ> _myselfExistsMap;
    public Map<String, ImmuProductDetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuProductDetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuProductDetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuProductDetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuProductDetailCB.class.getName(); }
    protected String xCQ() { return ImmuProductDetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
