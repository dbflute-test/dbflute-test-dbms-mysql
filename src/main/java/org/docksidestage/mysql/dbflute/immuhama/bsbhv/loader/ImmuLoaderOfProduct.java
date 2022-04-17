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
 * The referrer loader of (商品)PRODUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PRODUCT_DETAIL, PRODUCT_PRICE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productDetailList, productPriceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfProduct ready(List<ImmuProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuProductDetail> _referrerProductDetail;

    /**
     * Load referrer of productDetailList by the set-upper of referrer. <br>
     * (商品詳細)PRODUCT_DETAIL by PRODUCT_ID, named 'productDetailList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadProductDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuProduct product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getProductDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfProductDetail> loadProductDetail(ReferrerConditionSetupper<ImmuProductDetailCB> refCBLambda) {
        myBhv().loadProductDetail(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductDetail = refLs);
        return hd -> hd.handle(new ImmuLoaderOfProductDetail().ready(_referrerProductDetail, _selector));
    }

    protected List<ImmuProductPrice> _referrerProductPrice;

    /**
     * Load referrer of productPriceList by the set-upper of referrer. <br>
     * (商品価格)PRODUCT_PRICE by PRODUCT_ID, named 'productPriceList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadProductPrice</span>(<span style="color: #553000">priceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">priceCB</span>.setupSelect...
     *         <span style="color: #553000">priceCB</span>.query().set...
     *         <span style="color: #553000">priceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">priceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    priceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuProduct product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getProductPriceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfProductPrice> loadProductPrice(ReferrerConditionSetupper<ImmuProductPriceCB> refCBLambda) {
        myBhv().loadProductPrice(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductPrice = refLs);
        return hd -> hd.handle(new ImmuLoaderOfProductPrice().ready(_referrerProductPrice, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
