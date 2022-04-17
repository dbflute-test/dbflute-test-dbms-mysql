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
package org.docksidestage.mysql.dbflute.immuhama.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;

/**
 * The referrer loader of (商品詳細)PRODUCT_DETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_DETAIL_ID
 *
 * [column]
 *     PRODUCT_DETAIL_ID, PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_DETAIL_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CDEF_PRODUCT_CATEGORY, PRODUCT, CDEF_PRODUCT_STATUS
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     cdefProductCategory, product, cdefProductStatus
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfProductDetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuProductDetail> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuProductDetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfProductDetail ready(List<ImmuProductDetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuProductDetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuProductDetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuPurchase> _referrerPurchase;

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * (購入)PURCHASE by PRODUCT_DETAIL_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">productDetailBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productDetailList</span>, <span style="color: #553000">detailLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">detailLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">purchaseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuProductDetail productDetail : <span style="color: #553000">productDetailList</span>) {
     *     ... = productDetail.<span style="color: #CC4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductDetailId_InScope(pkList);
     * cb.query().addOrderBy_ProductDetailId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfPurchase> loadPurchase(ReferrerConditionSetupper<ImmuPurchaseCB> refCBLambda) {
        myBhv().loadPurchase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchase = refLs);
        return hd -> hd.handle(new ImmuLoaderOfPurchase().ready(_referrerPurchase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfCdefProductCategory _foreignCdefProductCategoryLoader;
    public ImmuLoaderOfCdefProductCategory pulloutCdefProductCategory() {
        if (_foreignCdefProductCategoryLoader == null)
        { _foreignCdefProductCategoryLoader = new ImmuLoaderOfCdefProductCategory().ready(myBhv().pulloutCdefProductCategory(_selectedList), _selector); }
        return _foreignCdefProductCategoryLoader;
    }

    protected ImmuLoaderOfProduct _foreignProductLoader;
    public ImmuLoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader == null)
        { _foreignProductLoader = new ImmuLoaderOfProduct().ready(myBhv().pulloutProduct(_selectedList), _selector); }
        return _foreignProductLoader;
    }

    protected ImmuLoaderOfCdefProductStatus _foreignCdefProductStatusLoader;
    public ImmuLoaderOfCdefProductStatus pulloutCdefProductStatus() {
        if (_foreignCdefProductStatusLoader == null)
        { _foreignCdefProductStatusLoader = new ImmuLoaderOfCdefProductStatus().ready(myBhv().pulloutCdefProductStatus(_selectedList), _selector); }
        return _foreignCdefProductStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuProductDetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
