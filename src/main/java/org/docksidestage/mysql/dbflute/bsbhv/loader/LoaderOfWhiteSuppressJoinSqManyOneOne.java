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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     MANY_ONE_ONE_ID
 *
 * [column]
 *     MANY_ONE_ONE_ID, MANY_ONE_ONE_NAME
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
 *     white_suppress_join_sq_many_one
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyOneList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqManyOneOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqManyOneOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqManyOneOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqManyOneOne ready(List<WhiteSuppressJoinSqManyOneOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqManyOneOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqManyOneOneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqManyOne> _referrerWhiteSuppressJoinSqManyOne;

    /**
     * Load referrer of whiteSuppressJoinSqManyOneList by the set-upper of referrer. <br>
     * white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span>, <span style="color: #553000">oneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">oneLoader</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqManyOne</span>(<span style="color: #553000">oneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">oneCB</span>.setupSelect...
     *         <span style="color: #553000">oneCB</span>.query().set...
     *         <span style="color: #553000">oneCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">oneLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    oneLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : <span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span>) {
     *     ... = whiteSuppressJoinSqManyOneOne.<span style="color: #CC4747">getWhiteSuppressJoinSqManyOneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneOneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOne(ConditionBeanSetupper<WhiteSuppressJoinSqManyOneCB> refCBLambda) {
        myBhv().loadWhiteSuppressJoinSqManyOne(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSuppressJoinSqManyOne = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSuppressJoinSqManyOne().ready(_referrerWhiteSuppressJoinSqManyOne, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqManyOneOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
