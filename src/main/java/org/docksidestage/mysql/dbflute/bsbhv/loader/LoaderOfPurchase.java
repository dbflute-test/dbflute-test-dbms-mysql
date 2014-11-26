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
package org.docksidestage.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.exentity.*;
import org.docksidestage.mysql.dbflute.cbean.*;

/**
 * The referrer loader of (購入)PURCHASE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     member, product, SUMMARY_PRODUCT, SUMMARY_WITHDRAWAL, WHITE_NO_PK_RELATION, PURCHASE, MEMBER_ADDRESS(AsSkipRelation), white_purchase_referrer(AsOne), purchase(AsOne)
 *
 * [referrer table]
 *     purchase_payment, white_purchase_referrer, purchase
 *
 * [foreign property]
 *     member, product, summaryProduct, summaryWithdrawal, whiteNoPkRelation, purchaseSelf, memberAddressAsSkipRelation, whitePurchaseReferrerAsOne, purchaseSelfAsOne
 *
 * [referrer property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Purchase> _selectedList;
    protected BehaviorSelector _selector;
    protected PurchaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPurchase ready(List<Purchase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PurchaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PurchaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<PurchasePayment> _referrerPurchasePayment;

    /**
     * Load referrer of purchasePaymentList by the set-upper of referrer. <br>
     * (購入支払)purchase_payment by PURCHASE_ID, named 'purchasePaymentList'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">purchaseList</span>, <span style="color: #553000">purchaseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseLoader</span>.<span style="color: #CC4747">loadPurchasePayment</span>(<span style="color: #553000">paymentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">paymentCB</span>.setupSelect...
     *         <span style="color: #553000">paymentCB</span>.query().set...
     *         <span style="color: #553000">paymentCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">paymentLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    paymentLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Purchase purchase : <span style="color: #553000">purchaseList</span>) {
     *     ... = purchase.<span style="color: #CC4747">getPurchasePaymentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPurchaseId_InScope(pkList);
     * cb.query().addOrderBy_PurchaseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPurchasePayment> loadPurchasePayment(ConditionBeanSetupper<PurchasePaymentCB> refCBLambda) {
        myBhv().loadPurchasePayment(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchasePayment = refLs);
        return hd -> hd.handle(new LoaderOfPurchasePayment().ready(_referrerPurchasePayment, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected LoaderOfProduct _foreignProductLoader;
    public LoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader == null)
        { _foreignProductLoader = new LoaderOfProduct().ready(myBhv().pulloutProduct(_selectedList), _selector); }
        return _foreignProductLoader;
    }

    protected LoaderOfSummaryProduct _foreignSummaryProductLoader;
    public LoaderOfSummaryProduct pulloutSummaryProduct() {
        if (_foreignSummaryProductLoader == null)
        { _foreignSummaryProductLoader = new LoaderOfSummaryProduct().ready(myBhv().pulloutSummaryProduct(_selectedList), _selector); }
        return _foreignSummaryProductLoader;
    }

    protected LoaderOfSummaryWithdrawal _foreignSummaryWithdrawalLoader;
    public LoaderOfSummaryWithdrawal pulloutSummaryWithdrawal() {
        if (_foreignSummaryWithdrawalLoader == null)
        { _foreignSummaryWithdrawalLoader = new LoaderOfSummaryWithdrawal().ready(myBhv().pulloutSummaryWithdrawal(_selectedList), _selector); }
        return _foreignSummaryWithdrawalLoader;
    }

    protected LoaderOfWhiteNoPkRelation _foreignWhiteNoPkRelationLoader;
    public LoaderOfWhiteNoPkRelation pulloutWhiteNoPkRelation() {
        if (_foreignWhiteNoPkRelationLoader == null)
        { _foreignWhiteNoPkRelationLoader = new LoaderOfWhiteNoPkRelation().ready(myBhv().pulloutWhiteNoPkRelation(_selectedList), _selector); }
        return _foreignWhiteNoPkRelationLoader;
    }

    protected LoaderOfPurchase _foreignPurchaseSelfLoader;
    public LoaderOfPurchase pulloutPurchaseSelf() {
        if (_foreignPurchaseSelfLoader == null)
        { _foreignPurchaseSelfLoader = new LoaderOfPurchase().ready(myBhv().pulloutPurchaseSelf(_selectedList), _selector); }
        return _foreignPurchaseSelfLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsSkipRelationLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsSkipRelation() {
        if (_foreignMemberAddressAsSkipRelationLoader == null)
        { _foreignMemberAddressAsSkipRelationLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsSkipRelation(_selectedList), _selector); }
        return _foreignMemberAddressAsSkipRelationLoader;
    }

    protected LoaderOfWhitePurchaseReferrer _foreignWhitePurchaseReferrerAsOneLoader;
    public LoaderOfWhitePurchaseReferrer pulloutWhitePurchaseReferrerAsOne() {
        if (_foreignWhitePurchaseReferrerAsOneLoader == null)
        { _foreignWhitePurchaseReferrerAsOneLoader = new LoaderOfWhitePurchaseReferrer().ready(myBhv().pulloutWhitePurchaseReferrerAsOne(_selectedList), _selector); }
        return _foreignWhitePurchaseReferrerAsOneLoader;
    }

    protected LoaderOfPurchase _foreignPurchaseSelfAsOneLoader;
    public LoaderOfPurchase pulloutPurchaseSelfAsOne() {
        if (_foreignPurchaseSelfAsOneLoader == null)
        { _foreignPurchaseSelfAsOneLoader = new LoaderOfPurchase().ready(myBhv().pulloutPurchaseSelfAsOne(_selectedList), _selector); }
        return _foreignPurchaseSelfAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Purchase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
