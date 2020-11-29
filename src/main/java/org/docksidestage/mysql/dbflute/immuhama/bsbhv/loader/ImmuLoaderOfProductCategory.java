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
 * The referrer loader of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PRODUCT_CATEGORY
 *
 * [referrer table]
 *     PRODUCT, PRODUCT_CATEGORY
 *
 * [foreign property]
 *     productCategorySelf
 *
 * [referrer property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuProductCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuProductCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfProductCategory ready(List<ImmuProductCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuProductCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuProductCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuProduct> _referrerProduct;

    /**
     * Load referrer of productList by the set-upper of referrer. <br>
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * <pre>
     * <span style="color: #0000C0">productCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadProduct</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuProductCategory productCategory : <span style="color: #553000">productCategoryList</span>) {
     *     ... = productCategory.<span style="color: #CC4747">getProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfProduct> loadProduct(ReferrerConditionSetupper<ImmuProductCB> refCBLambda) {
        myBhv().loadProduct(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProduct = refLs);
        return hd -> hd.handle(new ImmuLoaderOfProduct().ready(_referrerProduct, _selector));
    }

    protected List<ImmuProductCategory> _referrerProductCategorySelf;

    /**
     * Load referrer of productCategorySelfList by the set-upper of referrer. <br>
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * <pre>
     * <span style="color: #0000C0">productCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadProductCategorySelf</span>(<span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">categoryCB</span>.setupSelect...
     *         <span style="color: #553000">categoryCB</span>.query().set...
     *         <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">categoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    categoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuProductCategory productCategory : <span style="color: #553000">productCategoryList</span>) {
     *     ... = productCategory.<span style="color: #CC4747">getProductCategorySelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfProductCategory> loadProductCategorySelf(ReferrerConditionSetupper<ImmuProductCategoryCB> refCBLambda) {
        myBhv().loadProductCategorySelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductCategorySelf = refLs);
        return hd -> hd.handle(new ImmuLoaderOfProductCategory().ready(_referrerProductCategorySelf, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfProductCategory _foreignProductCategorySelfLoader;
    public ImmuLoaderOfProductCategory pulloutProductCategorySelf() {
        if (_foreignProductCategorySelfLoader == null)
        { _foreignProductCategorySelfLoader = new ImmuLoaderOfProductCategory().ready(myBhv().pulloutProductCategorySelf(_selectedList), _selector); }
        return _foreignProductCategorySelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuProductCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
