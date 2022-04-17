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
 * The base condition-query of product_price.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsProductPriceCQ extends ImmuAbstractBsProductPriceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuProductPriceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsProductPriceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from product_price) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuProductPriceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuProductPriceCIQ xcreateCIQ() {
        ImmuProductPriceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuProductPriceCIQ xnewCIQ() {
        return new ImmuProductPriceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join product_price on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuProductPriceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuProductPriceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productPriceId;
    public ConditionValue xdfgetProductPriceId()
    { if (_productPriceId == null) { _productPriceId = nCV(); }
      return _productPriceId; }
    protected ConditionValue xgetCValueProductPriceId() { return xdfgetProductPriceId(); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductPriceId_ExistsReferrer_PurchaseList() { return xgetSQueMap("productPriceId_ExistsReferrer_PurchaseList"); }
    public String keepProductPriceId_ExistsReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productPriceId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductPriceId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("productPriceId_NotExistsReferrer_PurchaseList"); }
    public String keepProductPriceId_NotExistsReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productPriceId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductPriceId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("productPriceId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepProductPriceId_SpecifyDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productPriceId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetProductPriceId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("productPriceId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductPriceId_QueryDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq) { return xkeepSQue("productPriceId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetProductPriceId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("productPriceId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductPriceId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("productPriceId_QueryDerivedReferrer_PurchaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (商品価格ID)PRODUCT_PRICE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_ProductPriceId_Asc() { regOBA("PRODUCT_PRICE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品価格ID)PRODUCT_PRICE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_ProductPriceId_Desc() { regOBD("PRODUCT_PRICE_ID"); return this; }

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
    public ImmuBsProductPriceCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _regularPrice;
    public ConditionValue xdfgetRegularPrice()
    { if (_regularPrice == null) { _regularPrice = nCV(); }
      return _regularPrice; }
    protected ConditionValue xgetCValueRegularPrice() { return xdfgetRegularPrice(); }

    /**
     * Add order-by as ascend. <br>
     * (定価)REGULAR_PRICE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_RegularPrice_Asc() { regOBA("REGULAR_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (定価)REGULAR_PRICE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_RegularPrice_Desc() { regOBD("REGULAR_PRICE"); return this; }

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
    public ImmuBsProductPriceCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public ImmuBsProductPriceCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public ImmuBsProductPriceCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public ImmuBsProductPriceCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsProductPriceCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public ImmuBsProductPriceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsProductPriceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuProductPriceCQ bq = (ImmuProductPriceCQ)bqs;
        ImmuProductPriceCQ uq = (ImmuProductPriceCQ)uqs;
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("product_price", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuProductPriceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuProductPriceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuProductPriceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuProductPriceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuProductPriceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuProductPriceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuProductPriceCQ> _myselfExistsMap;
    public Map<String, ImmuProductPriceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuProductPriceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuProductPriceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuProductPriceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuProductPriceCB.class.getName(); }
    protected String xCQ() { return ImmuProductPriceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
