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
 * The referrer loader of WHITE_PERROTTA_OVER_PRODUCT_NESTED as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_NESTED_CODE
 *
 * [column]
 *     PRODUCT_NESTED_CODE, PRODUCT_NESTED_NAME
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
 *     white_perrotta_over_product
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePerrottaOverProductList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverProductNested {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverProductNested> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverProductNestedBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverProductNested ready(List<WhitePerrottaOverProductNested> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverProductNestedBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverProductNestedBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePerrottaOverProduct> _referrerWhitePerrottaOverProductList;

    /**
     * Load referrer of whitePerrottaOverProductList by the set-upper of referrer. <br>
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverProductNestedBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whitePerrottaOverProductNestedList</span>, <span style="color: #553000">nestedLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nestedLoader</span>.<span style="color: #CC4747">loadWhitePerrottaOverProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhitePerrottaOverProductNested whitePerrottaOverProductNested : <span style="color: #553000">whitePerrottaOverProductNestedList</span>) {
     *     ... = whitePerrottaOverProductNested.<span style="color: #CC4747">getWhitePerrottaOverProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductNestedCode_InScope(pkList);
     * cb.query().addOrderBy_ProductNestedCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverProduct> loadWhitePerrottaOverProductList(ConditionBeanSetupper<WhitePerrottaOverProductCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhitePerrottaOverProductList = refLs);
        return hd -> hd.handle(new LoaderOfWhitePerrottaOverProduct().ready(_referrerWhitePerrottaOverProductList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverProductNested> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
