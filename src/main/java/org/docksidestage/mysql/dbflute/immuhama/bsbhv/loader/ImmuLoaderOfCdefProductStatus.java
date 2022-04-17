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
 * The referrer loader of ([区分値]商品ステータス)CDEF_PRODUCT_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     
 *
 * [referrer table]
 *     PRODUCT_DETAIL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productDetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfCdefProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuCdefProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuCdefProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfCdefProductStatus ready(List<ImmuCdefProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuCdefProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuCdefProductStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuProductDetail> _referrerProductDetail;

    /**
     * Load referrer of productDetailList by the set-upper of referrer. <br>
     * (商品詳細)PRODUCT_DETAIL by PRODUCT_STATUS_CODE, named 'productDetailList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cdefProductStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadProductDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuCdefProductStatus cdefProductStatus : <span style="color: #553000">cdefProductStatusList</span>) {
     *     ... = cdefProductStatus.<span style="color: #CC4747">getProductDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuCdefProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
