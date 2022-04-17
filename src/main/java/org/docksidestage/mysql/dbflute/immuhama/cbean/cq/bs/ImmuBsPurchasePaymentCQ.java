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
 * The base condition-query of purchase_payment.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuBsPurchasePaymentCQ extends ImmuAbstractBsPurchasePaymentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuPurchasePaymentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuBsPurchasePaymentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from purchase_payment) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImmuPurchasePaymentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ImmuPurchasePaymentCIQ xcreateCIQ() {
        ImmuPurchasePaymentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImmuPurchasePaymentCIQ xnewCIQ() {
        return new ImmuPurchasePaymentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join purchase_payment on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImmuPurchasePaymentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ImmuPurchasePaymentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchasePaymentId;
    public ConditionValue xdfgetPurchasePaymentId()
    { if (_purchasePaymentId == null) { _purchasePaymentId = nCV(); }
      return _purchasePaymentId; }
    protected ConditionValue xgetCValuePurchasePaymentId() { return xdfgetPurchasePaymentId(); }

    /**
     * Add order-by as ascend. <br>
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PurchasePaymentId_Asc() { regOBA("PURCHASE_PAYMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PurchasePaymentId_Desc() { regOBD("PURCHASE_PAYMENT_ID"); return this; }

    protected ConditionValue _purchaseId;
    public ConditionValue xdfgetPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue xgetCValuePurchaseId() { return xdfgetPurchaseId(); }

    /**
     * Add order-by as ascend. <br>
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _paymentAmount;
    public ConditionValue xdfgetPaymentAmount()
    { if (_paymentAmount == null) { _paymentAmount = nCV(); }
      return _paymentAmount; }
    protected ConditionValue xgetCValuePaymentAmount() { return xdfgetPaymentAmount(); }

    /**
     * Add order-by as ascend. <br>
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PaymentAmount_Asc() { regOBA("PAYMENT_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PaymentAmount_Desc() { regOBD("PAYMENT_AMOUNT"); return this; }

    protected ConditionValue _paymentDatetime;
    public ConditionValue xdfgetPaymentDatetime()
    { if (_paymentDatetime == null) { _paymentDatetime = nCV(); }
      return _paymentDatetime; }
    protected ConditionValue xgetCValuePaymentDatetime() { return xdfgetPaymentDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PaymentDatetime_Asc() { regOBA("PAYMENT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PaymentDatetime_Desc() { regOBD("PAYMENT_DATETIME"); return this; }

    protected ConditionValue _paymentMethodCode;
    public ConditionValue xdfgetPaymentMethodCode()
    { if (_paymentMethodCode == null) { _paymentMethodCode = nCV(); }
      return _paymentMethodCode; }
    protected ConditionValue xgetCValuePaymentMethodCode() { return xdfgetPaymentMethodCode(); }

    /**
     * Add order-by as ascend. <br>
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PaymentMethodCode_Asc() { regOBA("PAYMENT_METHOD_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @return this. (NotNull)
     */
    public ImmuBsPurchasePaymentCQ addOrderBy_PaymentMethodCode_Desc() { regOBD("PAYMENT_METHOD_CODE"); return this; }

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
    public ImmuBsPurchasePaymentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public ImmuBsPurchasePaymentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ImmuPurchasePaymentCQ bq = (ImmuPurchasePaymentCQ)bqs;
        ImmuPurchasePaymentCQ uq = (ImmuPurchasePaymentCQ)uqs;
        if (bq.hasConditionQueryPurchase()) {
            uq.queryPurchase().reflectRelationOnUnionQuery(bq.queryPurchase(), uq.queryPurchase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The instance of condition-query. (NotNull)
     */
    public ImmuPurchaseCQ queryPurchase() {
        return xdfgetConditionQueryPurchase();
    }
    public ImmuPurchaseCQ xdfgetConditionQueryPurchase() {
        String prop = "purchase";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchase()); xsetupOuterJoinPurchase(); }
        return xgetQueRlMap(prop);
    }
    protected ImmuPurchaseCQ xcreateQueryPurchase() {
        String nrp = xresolveNRP("purchase_payment", "purchase"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ImmuPurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchase", nrp);
    }
    protected void xsetupOuterJoinPurchase() { xregOutJo("purchase"); }
    public boolean hasConditionQueryPurchase() { return xhasQueRlMap("purchase"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ImmuPurchasePaymentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ImmuPurchasePaymentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ImmuPurchasePaymentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ImmuPurchasePaymentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ImmuPurchasePaymentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ImmuPurchasePaymentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImmuPurchasePaymentCQ> _myselfExistsMap;
    public Map<String, ImmuPurchasePaymentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ImmuPurchasePaymentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ImmuPurchasePaymentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ImmuPurchasePaymentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ImmuPurchasePaymentCB.class.getName(); }
    protected String xCQ() { return ImmuPurchasePaymentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
