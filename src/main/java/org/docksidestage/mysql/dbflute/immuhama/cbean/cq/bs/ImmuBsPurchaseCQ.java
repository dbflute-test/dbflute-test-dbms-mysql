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
 * The base condition-query of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsPurchaseCQ extends ImmuAbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuPurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from purchase) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuPurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuPurchaseCIQ xcreateCIQ() {
        ImmuPurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuPurchaseCIQ xnewCIQ() {
        return new ImmuPurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join purchase on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuPurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuPurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseId;
    public ConditionValue xdfgetPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue xgetCValuePurchaseId() { return xdfgetPurchaseId(); }

    public Map<String, ImmuPurchasePaymentCQ> xdfgetPurchaseId_ExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_ExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_ExistsReferrer_PurchasePaymentList(ImmuPurchasePaymentCQ sq) { return xkeepSQue("purchaseId_ExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, ImmuPurchasePaymentCQ> xdfgetPurchaseId_NotExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_NotExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_NotExistsReferrer_PurchasePaymentList(ImmuPurchasePaymentCQ sq) { return xkeepSQue("purchaseId_NotExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, ImmuPurchasePaymentCQ> xdfgetPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(ImmuPurchasePaymentCQ sq) { return xkeepSQue("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList", sq); }

    public Map<String, ImmuPurchasePaymentCQ> xdfgetPurchaseId_QueryDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(ImmuPurchasePaymentCQ sq) { return xkeepSQue("purchaseId_QueryDerivedReferrer_PurchasePaymentList", sq); }
    public Map<String, Object> xdfgetPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter() { return xgetSQuePmMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(Object pm) { return xkeepSQuePm("purchaseId_QueryDerivedReferrer_PurchasePaymentList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _productDetailId;
    public ConditionValue xdfgetProductDetailId()
    { if (_productDetailId == null) { _productDetailId = nCV(); }
      return _productDetailId; }
    protected ConditionValue xgetCValueProductDetailId() { return xdfgetProductDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * (商品詳細ID)PRODUCT_DETAIL_ID: {IX, NotNull, BIGINT(19), FK to product_detail}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_ProductDetailId_Asc() { regOBA("PRODUCT_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品詳細ID)PRODUCT_DETAIL_ID: {IX, NotNull, BIGINT(19), FK to product_detail}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_ProductDetailId_Desc() { regOBD("PRODUCT_DETAIL_ID"); return this; }

    protected ConditionValue _productPriceId;
    public ConditionValue xdfgetProductPriceId()
    { if (_productPriceId == null) { _productPriceId = nCV(); }
      return _productPriceId; }
    protected ConditionValue xgetCValueProductPriceId() { return xdfgetProductPriceId(); }

    /**
     * Add order-by as ascend. <br>
     * (商品価格ID)PRODUCT_PRICE_ID: {IX, NotNull, BIGINT(19), FK to product_price}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_ProductPriceId_Asc() { regOBA("PRODUCT_PRICE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品価格ID)PRODUCT_PRICE_ID: {IX, NotNull, BIGINT(19), FK to product_price}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_ProductPriceId_Desc() { regOBD("PRODUCT_PRICE_ID"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue xdfgetPurchaseDatetime()
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected ConditionValue xgetCValuePurchaseDatetime() { return xdfgetPurchaseDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("PURCHASE_DATETIME"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue xdfgetPurchaseCount()
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected ConditionValue xgetCValuePurchaseCount() { return xdfgetPurchaseCount(); }

    /**
     * Add order-by as ascend. <br>
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("PURCHASE_COUNT"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue xdfgetPurchasePrice()
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected ConditionValue xgetCValuePurchasePrice() { return xdfgetPurchasePrice(); }

    /**
     * Add order-by as ascend. <br>
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("PURCHASE_PRICE"); return this; }

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
    public ImmuBsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public ImmuBsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public ImmuBsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public ImmuBsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public ImmuBsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuPurchaseCQ bq = (ImmuPurchaseCQ)bqs;
        ImmuPurchaseCQ uq = (ImmuPurchaseCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProductDetail()) {
            uq.queryProductDetail().reflectRelationOnUnionQuery(bq.queryProductDetail(), uq.queryProductDetail());
        }
        if (bq.hasConditionQueryProductPrice()) {
            uq.queryProductPrice().reflectRelationOnUnionQuery(bq.queryProductPrice(), uq.queryProductPrice());
        }
        if (bq.hasConditionQueryPurchaseStatusAsOne()) {
            uq.queryPurchaseStatusAsOne().reflectRelationOnUnionQuery(bq.queryPurchaseStatusAsOne(), uq.queryPurchaseStatusAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuMemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public ImmuMemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuMemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("purchase", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * (商品詳細)PRODUCT_DETAIL by my PRODUCT_DETAIL_ID, named 'productDetail'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuProductDetailCQ queryProductDetail() {
        return xdfgetConditionQueryProductDetail();
    }
    public ImmuProductDetailCQ xdfgetConditionQueryProductDetail() {
        String prop = "productDetail";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductDetail()); xsetupOuterJoinProductDetail(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuProductDetailCQ xcreateQueryProductDetail() {
        String nrp = xresolveNRP("purchase", "productDetail"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuProductDetailCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productDetail", nrp);
    }
    protected void xsetupOuterJoinProductDetail() { xregOutJo("productDetail"); }
    public boolean hasConditionQueryProductDetail() { return xhasQueRlMap("productDetail"); }

    /**
     * Get the condition-query for relation table. <br>
     * (商品価格)PRODUCT_PRICE by my PRODUCT_PRICE_ID, named 'productPrice'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuProductPriceCQ queryProductPrice() {
        return xdfgetConditionQueryProductPrice();
    }
    public ImmuProductPriceCQ xdfgetConditionQueryProductPrice() {
        String prop = "productPrice";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductPrice()); xsetupOuterJoinProductPrice(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuProductPriceCQ xcreateQueryProductPrice() {
        String nrp = xresolveNRP("purchase", "productPrice"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuProductPriceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productPrice", nrp);
    }
    protected void xsetupOuterJoinProductPrice() { xregOutJo("productPrice"); }
    public boolean hasConditionQueryProductPrice() { return xhasQueRlMap("productPrice"); }

    /**
     * Get the condition-query for relation table. <br>
     * (購入ステータス)purchase_status by PURCHASE_ID, named 'purchaseStatusAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuPurchaseStatusCQ queryPurchaseStatusAsOne() { return xdfgetConditionQueryPurchaseStatusAsOne(); }
    public ImmuPurchaseStatusCQ xdfgetConditionQueryPurchaseStatusAsOne() {
        String prop = "purchaseStatusAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchaseStatusAsOne()); xsetupOuterJoinPurchaseStatusAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuPurchaseStatusCQ xcreateQueryPurchaseStatusAsOne() {
        String nrp = xresolveNRP("purchase", "purchaseStatusAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuPurchaseStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchaseStatusAsOne", nrp);
    }
    protected void xsetupOuterJoinPurchaseStatusAsOne() { xregOutJo("purchaseStatusAsOne"); }
    public boolean hasConditionQueryPurchaseStatusAsOne() { return xhasQueRlMap("purchaseStatusAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuPurchaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuPurchaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuPurchaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuPurchaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuPurchaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuPurchaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuPurchaseCQ> _myselfExistsMap;
    public Map<String, ImmuPurchaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuPurchaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuPurchaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuPurchaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuPurchaseCB.class.getName(); }
    protected String xCQ() { return ImmuPurchaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
