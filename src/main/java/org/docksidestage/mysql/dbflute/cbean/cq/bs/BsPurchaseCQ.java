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
 * The base condition-query of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseCQ extends AbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from purchase) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PurchaseCIQ xcreateCIQ() {
        PurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PurchaseCIQ xnewCIQ() {
        return new PurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join purchase on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseId;
    public ConditionValue getPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_ExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_ExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_ExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_ExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_NotExistsReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_NotExistsReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_NotExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_NotExistsReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList", sq); }

    public Map<String, PurchasePaymentCQ> getPurchaseId_QueryDerivedReferrer_PurchasePaymentList() { return xgetSQueMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq) { return xkeepSQue("purchaseId_QueryDerivedReferrer_PurchasePaymentList", sq); }
    public Map<String, Object> getPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter() { return xgetSQuePmMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList"); }
    public String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(Object pm) { return xkeepSQuePm("purchaseId_QueryDerivedReferrer_PurchasePaymentList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue getPurchaseDatetime()
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected ConditionValue getCValuePurchaseDatetime() { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("PURCHASE_DATETIME"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue getPurchaseCount()
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected ConditionValue getCValuePurchaseCount() { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("PURCHASE_COUNT"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue getPurchasePrice()
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected ConditionValue getCValuePurchasePrice() { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("PURCHASE_PRICE"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue getPaymentCompleteFlg()
    { if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
      return _paymentCompleteFlg; }
    protected ConditionValue getCValuePaymentCompleteFlg() { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("PAYMENT_COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("PAYMENT_COMPLETE_FLG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PurchaseCQ bq = (PurchaseCQ)bqs;
        PurchaseCQ uq = (PurchaseCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
        if (bq.hasConditionQuerySummaryProduct()) {
            uq.querySummaryProduct().reflectRelationOnUnionQuery(bq.querySummaryProduct(), uq.querySummaryProduct());
        }
        if (bq.hasConditionQuerySummaryWithdrawal()) {
            uq.querySummaryWithdrawal().reflectRelationOnUnionQuery(bq.querySummaryWithdrawal(), uq.querySummaryWithdrawal());
        }
        if (bq.hasConditionQueryWhiteNoPkRelation()) {
            uq.queryWhiteNoPkRelation().reflectRelationOnUnionQuery(bq.queryWhiteNoPkRelation(), uq.queryWhiteNoPkRelation());
        }
        if (bq.hasConditionQueryPurchaseSelf()) {
            uq.queryPurchaseSelf().reflectRelationOnUnionQuery(bq.queryPurchaseSelf(), uq.queryPurchaseSelf());
        }
        if (bq.hasConditionQueryMemberAddressAsSkipRelation()) {
            uq.xsetParameterMapMemberAddressAsSkipRelation(bq.getParameterMapMemberAddressAsSkipRelation());
            uq.getConditionQueryMemberAddressAsSkipRelation().reflectRelationOnUnionQuery(bq.getConditionQueryMemberAddressAsSkipRelation(), uq.getConditionQueryMemberAddressAsSkipRelation());
        }
        if (bq.hasConditionQueryWhitePurchaseReferrerAsOne()) {
            uq.queryWhitePurchaseReferrerAsOne().reflectRelationOnUnionQuery(bq.queryWhitePurchaseReferrerAsOne(), uq.queryWhitePurchaseReferrerAsOne());
        }
        if (bq.hasConditionQueryPurchaseSelfAsOne()) {
            uq.queryPurchaseSelfAsOne().reflectRelationOnUnionQuery(bq.queryPurchaseSelfAsOne(), uq.queryPurchaseSelfAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)member by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    public MemberCQ getConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("purchase", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br />
     * (商品)product by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return getConditionQueryProduct();
    }
    public ProductCQ getConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("purchase", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    /**
     * Get the condition-query for relation table. <br />
     * (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public SummaryProductCQ querySummaryProduct() {
        return getConditionQuerySummaryProduct();
    }
    public SummaryProductCQ getConditionQuerySummaryProduct() {
        String prop = "summaryProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySummaryProduct()); xsetupOuterJoinSummaryProduct(); }
        return xgetQueRlMap(prop);
    }
    protected SummaryProductCQ xcreateQuerySummaryProduct() {
        String nrp = xresolveNRP("purchase", "summaryProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SummaryProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "summaryProduct", nrp);
    }
    protected void xsetupOuterJoinSummaryProduct() { xregOutJo("summaryProduct"); }
    public boolean hasConditionQuerySummaryProduct() { return xhasQueRlMap("summaryProduct"); }

    /**
     * Get the condition-query for relation table. <br />
     * (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
     * @return The instance of condition-query. (NotNull)
     */
    public SummaryWithdrawalCQ querySummaryWithdrawal() {
        return getConditionQuerySummaryWithdrawal();
    }
    public SummaryWithdrawalCQ getConditionQuerySummaryWithdrawal() {
        String prop = "summaryWithdrawal";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySummaryWithdrawal()); xsetupOuterJoinSummaryWithdrawal(); }
        return xgetQueRlMap(prop);
    }
    protected SummaryWithdrawalCQ xcreateQuerySummaryWithdrawal() {
        String nrp = xresolveNRP("purchase", "summaryWithdrawal"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SummaryWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "summaryWithdrawal", nrp);
    }
    protected void xsetupOuterJoinSummaryWithdrawal() { xregOutJo("summaryWithdrawal"); }
    public boolean hasConditionQuerySummaryWithdrawal() { return xhasQueRlMap("summaryWithdrawal"); }

    /**
     * Get the condition-query for relation table. <br />
     * (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteNoPkRelationCQ queryWhiteNoPkRelation() {
        return getConditionQueryWhiteNoPkRelation();
    }
    public WhiteNoPkRelationCQ getConditionQueryWhiteNoPkRelation() {
        String prop = "whiteNoPkRelation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteNoPkRelation()); xsetupOuterJoinWhiteNoPkRelation(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteNoPkRelationCQ xcreateQueryWhiteNoPkRelation() {
        String nrp = xresolveNRP("purchase", "whiteNoPkRelation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteNoPkRelationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteNoPkRelation", nrp);
    }
    protected void xsetupOuterJoinWhiteNoPkRelation() { xregOutJo("whiteNoPkRelation"); }
    public boolean hasConditionQueryWhiteNoPkRelation() { return xhasQueRlMap("whiteNoPkRelation"); }

    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchaseSelf() {
        return getConditionQueryPurchaseSelf();
    }
    public PurchaseCQ getConditionQueryPurchaseSelf() {
        String prop = "purchaseSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchaseSelf()); xsetupOuterJoinPurchaseSelf(); }
        return xgetQueRlMap(prop);
    }
    protected PurchaseCQ xcreateQueryPurchaseSelf() {
        String nrp = xresolveNRP("purchase", "purchaseSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchaseSelf", nrp);
    }
    protected void xsetupOuterJoinPurchaseSelf() { xregOutJo("purchaseSelf"); }
    public boolean hasConditionQueryPurchaseSelf() { return xhasQueRlMap("purchaseSelf"); }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsSkipRelation(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsSkipRelation();
        parameterMap.put("targetDate", fCTPD(targetDate));
        xassertFCDP("memberAddressAsSkipRelation", parameterMap);
        return getConditionQueryMemberAddressAsSkipRelation();
    }
    public MemberAddressCQ getConditionQueryMemberAddressAsSkipRelation() {
        String prop = "memberAddressAsSkipRelation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAddressAsSkipRelation()); xsetupOuterJoinMemberAddressAsSkipRelation(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMemberAddressAsSkipRelation;
    public Map<String, Object> getParameterMapMemberAddressAsSkipRelation()
    { if (_parameterMapMemberAddressAsSkipRelation == null) { _parameterMapMemberAddressAsSkipRelation = newLinkedHashMapSized(4); }
      return _parameterMapMemberAddressAsSkipRelation; }
    public void xsetParameterMapMemberAddressAsSkipRelation(Map<String, Object> parameterMap)
    { _parameterMapMemberAddressAsSkipRelation = parameterMap; } // for UnionQuery
    protected MemberAddressCQ xcreateQueryMemberAddressAsSkipRelation() {
        String nrp = xresolveNRP("purchase", "memberAddressAsSkipRelation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAddressAsSkipRelation", nrp);
    }
    protected void xsetupOuterJoinMemberAddressAsSkipRelation() { xregOutJo("memberAddressAsSkipRelation"); }
    public boolean hasConditionQueryMemberAddressAsSkipRelation() { return xhasQueRlMap("memberAddressAsSkipRelation"); }

    /**
     * Get the condition-query for relation table. <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePurchaseReferrerCQ queryWhitePurchaseReferrerAsOne() { return getConditionQueryWhitePurchaseReferrerAsOne(); }
    public WhitePurchaseReferrerCQ getConditionQueryWhitePurchaseReferrerAsOne() {
        String prop = "whitePurchaseReferrerAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePurchaseReferrerAsOne()); xsetupOuterJoinWhitePurchaseReferrerAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePurchaseReferrerCQ xcreateQueryWhitePurchaseReferrerAsOne() {
        String nrp = xresolveNRP("purchase", "whitePurchaseReferrerAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePurchaseReferrerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePurchaseReferrerAsOne", nrp);
    }
    protected void xsetupOuterJoinWhitePurchaseReferrerAsOne() { xregOutJo("whitePurchaseReferrerAsOne"); }
    public boolean hasConditionQueryWhitePurchaseReferrerAsOne() { return xhasQueRlMap("whitePurchaseReferrerAsOne"); }

    /**
     * Get the condition-query for relation table. <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public PurchaseCQ queryPurchaseSelfAsOne() { return getConditionQueryPurchaseSelfAsOne(); }
    public PurchaseCQ getConditionQueryPurchaseSelfAsOne() {
        String prop = "purchaseSelfAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchaseSelfAsOne()); xsetupOuterJoinPurchaseSelfAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected PurchaseCQ xcreateQueryPurchaseSelfAsOne() {
        String nrp = xresolveNRP("purchase", "purchaseSelfAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchaseSelfAsOne", nrp);
    }
    protected void xsetupOuterJoinPurchaseSelfAsOne() { xregOutJo("purchaseSelfAsOne"); }
    public boolean hasConditionQueryPurchaseSelfAsOne() { return xhasQueRlMap("purchaseSelfAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("memberAddressAsSkipRelation".equalsIgnoreCase(property)) { return _parameterMapMemberAddressAsSkipRelation; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PurchaseCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PurchaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PurchaseCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PurchaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PurchaseCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PurchaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PurchaseCQ> _myselfExistsMap;
    public Map<String, PurchaseCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PurchaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PurchaseCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PurchaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PurchaseCB.class.getName(); }
    protected String xCQ() { return PurchaseCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
