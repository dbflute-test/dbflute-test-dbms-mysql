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
 * The referrer loader of ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY as TABLE. <br>
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
 *     CDEF_PRODUCT_CATEGORY
 *
 * [referrer table]
 *     CDEF_PRODUCT_CATEGORY, PRODUCT_DETAIL
 *
 * [foreign property]
 *     cdefProductCategorySelf
 *
 * [referrer property]
 *     cdefProductCategorySelfList, productDetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfCdefProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuCdefProductCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuCdefProductCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfCdefProductCategory ready(List<ImmuCdefProductCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuCdefProductCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuCdefProductCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuCdefProductCategory> _referrerCdefProductCategorySelf;

    /**
     * Load referrer of cdefProductCategorySelfList by the set-upper of referrer. <br>
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cdefProductCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadCdefProductCategorySelf</span>(<span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">categoryCB</span>.setupSelect...
     *         <span style="color: #553000">categoryCB</span>.query().set...
     *         <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">categoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    categoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuCdefProductCategory cdefProductCategory : <span style="color: #553000">cdefProductCategoryList</span>) {
     *     ... = cdefProductCategory.<span style="color: #CC4747">getCdefProductCategorySelfList()</span>;
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
    public NestedReferrerLoaderGateway<ImmuLoaderOfCdefProductCategory> loadCdefProductCategorySelf(ReferrerConditionSetupper<ImmuCdefProductCategoryCB> refCBLambda) {
        myBhv().loadCdefProductCategorySelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCdefProductCategorySelf = refLs);
        return hd -> hd.handle(new ImmuLoaderOfCdefProductCategory().ready(_referrerCdefProductCategorySelf, _selector));
    }

    protected List<ImmuProductDetail> _referrerProductDetail;

    /**
     * Load referrer of productDetailList by the set-upper of referrer. <br>
     * (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cdefProductCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadProductDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuCdefProductCategory cdefProductCategory : <span style="color: #553000">cdefProductCategoryList</span>) {
     *     ... = cdefProductCategory.<span style="color: #CC4747">getProductDetailList()</span>;
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
    public NestedReferrerLoaderGateway<ImmuLoaderOfProductDetail> loadProductDetail(ReferrerConditionSetupper<ImmuProductDetailCB> refCBLambda) {
        myBhv().loadProductDetail(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductDetail = refLs);
        return hd -> hd.handle(new ImmuLoaderOfProductDetail().ready(_referrerProductDetail, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfCdefProductCategory _foreignCdefProductCategorySelfLoader;
    public ImmuLoaderOfCdefProductCategory pulloutCdefProductCategorySelf() {
        if (_foreignCdefProductCategorySelfLoader == null)
        { _foreignCdefProductCategorySelfLoader = new ImmuLoaderOfCdefProductCategory().ready(myBhv().pulloutCdefProductCategorySelf(_selectedList), _selector); }
        return _foreignCdefProductCategorySelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuCdefProductCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
