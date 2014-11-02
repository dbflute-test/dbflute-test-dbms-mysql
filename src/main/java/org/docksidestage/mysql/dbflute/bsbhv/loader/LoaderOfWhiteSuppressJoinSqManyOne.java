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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     MANY_ONE_ID
 *
 * [column]
 *     MANY_ONE_ID, MANY_ONE_NAME, MANY_ONE_ONE_ID
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
 *     white_suppress_join_sq_many_one_one
 *
 * [referrer table]
 *     white_suppress_join_sq_many
 *
 * [foreign property]
 *     whiteSuppressJoinSqManyOneOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqManyOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqManyOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqManyOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqManyOne ready(List<WhiteSuppressJoinSqManyOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqManyOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqManyOneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqMany> _referrerWhiteSuppressJoinSqMany;

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br>
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneList</span>, <span style="color: #553000">oneLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">oneLoader</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqMany</span>(<span style="color: #553000">manyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">manyCB</span>.setupSelect...
     *         <span style="color: #553000">manyCB</span>.query().set...
     *         <span style="color: #553000">manyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">manyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    manyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : <span style="color: #553000">whiteSuppressJoinSqManyOneList</span>) {
     *     ... = whiteSuppressJoinSqManyOne.<span style="color: #CC4747">getWhiteSuppressJoinSqManyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqMany(ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> refCBLambda) {
        myBhv().loadWhiteSuppressJoinSqMany(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSuppressJoinSqMany = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSuppressJoinSqMany().ready(_referrerWhiteSuppressJoinSqMany, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSqManyOneOne _foreignWhiteSuppressJoinSqManyOneOneLoader;
    public LoaderOfWhiteSuppressJoinSqManyOneOne pulloutWhiteSuppressJoinSqManyOneOne() {
        if (_foreignWhiteSuppressJoinSqManyOneOneLoader == null)
        { _foreignWhiteSuppressJoinSqManyOneOneLoader = new LoaderOfWhiteSuppressJoinSqManyOneOne().ready(myBhv().pulloutWhiteSuppressJoinSqManyOneOne(_selectedList), _selector); }
        return _foreignWhiteSuppressJoinSqManyOneOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqManyOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
