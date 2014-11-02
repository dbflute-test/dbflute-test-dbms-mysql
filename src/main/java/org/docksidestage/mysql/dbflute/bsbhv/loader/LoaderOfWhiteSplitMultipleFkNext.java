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
 * The referrer loader of WHITE_SPLIT_MULTIPLE_FK_NEXT as TABLE. <br>
 * <pre>
 * [primary key]
 *     NEXT_ID
 *
 * [column]
 *     NEXT_ID, SECOND_CODE
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
 *     white_split_multiple_fk_base
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSplitMultipleFkBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSplitMultipleFkNext {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSplitMultipleFkNext> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSplitMultipleFkNextBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSplitMultipleFkNext ready(List<WhiteSplitMultipleFkNext> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSplitMultipleFkNextBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSplitMultipleFkNextBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSplitMultipleFkBase> _referrerWhiteSplitMultipleFkBase;

    /**
     * Load referrer of whiteSplitMultipleFkBaseList by the set-upper of referrer. <br>
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSplitMultipleFkNextList</span>, <span style="color: #553000">nextLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nextLoader</span>.<span style="color: #CC4747">loadWhiteSplitMultipleFkBase</span>(<span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">baseCB</span>.setupSelect...
     *         <span style="color: #553000">baseCB</span>.query().set...
     *         <span style="color: #553000">baseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">baseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    baseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : <span style="color: #553000">whiteSplitMultipleFkNextList</span>) {
     *     ... = whiteSplitMultipleFkNext.<span style="color: #CC4747">getWhiteSplitMultipleFkBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextId_InScope(pkList);
     * cb.query().addOrderBy_NextId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBase(ConditionBeanSetupper<WhiteSplitMultipleFkBaseCB> refCBLambda) {
        myBhv().loadWhiteSplitMultipleFkBase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSplitMultipleFkBase = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSplitMultipleFkBase().ready(_referrerWhiteSplitMultipleFkBase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSplitMultipleFkNext> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
