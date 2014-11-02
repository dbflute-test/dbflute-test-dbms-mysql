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
 * The referrer loader of WHITE_ALL_IN_ONE_CLS_CATEGORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_CATEGORY_NAME, DESCRIPTION
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
 *     white_all_in_one_cls_element
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteAllInOneClsElementList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteAllInOneClsCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteAllInOneClsCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteAllInOneClsCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteAllInOneClsCategory ready(List<WhiteAllInOneClsCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteAllInOneClsCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteAllInOneClsCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteAllInOneClsElement> _referrerWhiteAllInOneClsElement;

    /**
     * Load referrer of whiteAllInOneClsElementList by the set-upper of referrer. <br>
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'.
     * <pre>
     * <span style="color: #0000C0">whiteAllInOneClsCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteAllInOneClsCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadWhiteAllInOneClsElement</span>(<span style="color: #553000">elementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">elementCB</span>.setupSelect...
     *         <span style="color: #553000">elementCB</span>.query().set...
     *         <span style="color: #553000">elementCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">elementLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    elementLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : <span style="color: #553000">whiteAllInOneClsCategoryList</span>) {
     *     ... = whiteAllInOneClsCategory.<span style="color: #CC4747">getWhiteAllInOneClsElementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClsCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ClsCategoryCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteAllInOneClsElement> loadWhiteAllInOneClsElement(ConditionBeanSetupper<WhiteAllInOneClsElementCB> refCBLambda) {
        myBhv().loadWhiteAllInOneClsElement(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteAllInOneClsElement = refLs);
        return hd -> hd.handle(new LoaderOfWhiteAllInOneClsElement().ready(_referrerWhiteAllInOneClsElement, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteAllInOneClsCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
