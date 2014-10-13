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
 * The referrer loader of WHITE_PERROTTA_OVER_PRODUCT_NESTED as TABLE. <br />
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
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverProduct> loadWhitePerrottaOverProductList(ConditionBeanSetupper<WhitePerrottaOverProductCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverProductList(_selectedList, refCBLambda).withNestedReferrer(new ReferrerListHandler<WhitePerrottaOverProduct>() {
            public void handle(List<WhitePerrottaOverProduct> referrerList) { _referrerWhitePerrottaOverProductList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverProduct>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhitePerrottaOverProduct> handler) {
                handler.handle(new LoaderOfWhitePerrottaOverProduct().ready(_referrerWhitePerrottaOverProductList, _selector));
            }
        };
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
