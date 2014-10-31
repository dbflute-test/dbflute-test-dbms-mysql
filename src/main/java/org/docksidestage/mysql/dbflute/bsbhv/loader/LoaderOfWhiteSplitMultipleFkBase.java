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
 * The referrer loader of WHITE_SPLIT_MULTIPLE_FK_BASE as TABLE. <br>
 * <pre>
 * [primary key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, FIRST_ID, NEXT_ID, SPLIT_NAME
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
 *     white_split_multiple_fk_next, WHITE_SPLIT_MULTIPLE_FK_REF(AsSplitMultipleFkTest)
 *
 * [referrer table]
 *     white_split_multiple_fk_child
 *
 * [foreign property]
 *     whiteSplitMultipleFkNext, whiteSplitMultipleFkRefAsSplitMultipleFkTest
 *
 * [referrer property]
 *     whiteSplitMultipleFkChildList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSplitMultipleFkBase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSplitMultipleFkBase> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSplitMultipleFkBaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSplitMultipleFkBase ready(List<WhiteSplitMultipleFkBase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSplitMultipleFkBaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSplitMultipleFkBaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSplitMultipleFkChild> _referrerWhiteSplitMultipleFkChildList;

    /**
     * Load referrer of whiteSplitMultipleFkChildList by the set-upper of referrer. <br>
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkBaseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSplitMultipleFkBaseList</span>, <span style="color: #553000">baseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseLoader</span>.<span style="color: #CC4747">loadWhiteSplitMultipleFkChildList</span>(<span style="color: #553000">childCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">childCB</span>.setupSelect...
     *         <span style="color: #553000">childCB</span>.query().set...
     *         <span style="color: #553000">childCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">childLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    childLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : <span style="color: #553000">whiteSplitMultipleFkBaseList</span>) {
     *     ... = whiteSplitMultipleFkBase.<span style="color: #CC4747">getWhiteSplitMultipleFkChildList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBaseId_InScope(pkList);
     * cb.query().addOrderBy_BaseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(ConditionBeanSetupper<WhiteSplitMultipleFkChildCB> refCBLambda) {
        myBhv().loadWhiteSplitMultipleFkChildList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSplitMultipleFkChildList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSplitMultipleFkChild().ready(_referrerWhiteSplitMultipleFkChildList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSplitMultipleFkNext _foreignWhiteSplitMultipleFkNextLoader;
    public LoaderOfWhiteSplitMultipleFkNext pulloutWhiteSplitMultipleFkNext() {
        if (_foreignWhiteSplitMultipleFkNextLoader == null)
        { _foreignWhiteSplitMultipleFkNextLoader = new LoaderOfWhiteSplitMultipleFkNext().ready(myBhv().pulloutWhiteSplitMultipleFkNext(_selectedList), _selector); }
        return _foreignWhiteSplitMultipleFkNextLoader;
    }

    protected LoaderOfWhiteSplitMultipleFkRef _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader;
    public LoaderOfWhiteSplitMultipleFkRef pulloutWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        if (_foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader == null)
        { _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader = new LoaderOfWhiteSplitMultipleFkRef().ready(myBhv().pulloutWhiteSplitMultipleFkRefAsSplitMultipleFkTest(_selectedList), _selector); }
        return _foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTestLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSplitMultipleFkBase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
