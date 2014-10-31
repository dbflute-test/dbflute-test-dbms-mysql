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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ as TABLE. <br>
 * <pre>
 * [primary key]
 *     SUPPRESS_JOIN_SQ_ID
 *
 * [column]
 *     SUPPRESS_JOIN_SQ_ID, SUPPRESS_JOIN_SQ_NAME
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
 *     white_suppress_join_sq_one(AsOne)
 *
 * [referrer table]
 *     white_suppress_join_sq_many, white_suppress_join_sq_one
 *
 * [foreign property]
 *     whiteSuppressJoinSqOneAsOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSq {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSq> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSq ready(List<WhiteSuppressJoinSq> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqMany> _referrerWhiteSuppressJoinSqManyList;

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br>
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSuppressJoinSqList</span>, <span style="color: #553000">sqLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sqLoader</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqManyList</span>(<span style="color: #553000">manyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">manyCB</span>.setupSelect...
     *         <span style="color: #553000">manyCB</span>.query().set...
     *         <span style="color: #553000">manyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">manyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    manyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : <span style="color: #553000">whiteSuppressJoinSqList</span>) {
     *     ... = whiteSuppressJoinSq.<span style="color: #CC4747">getWhiteSuppressJoinSqManyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSuppressJoinSqId_InScope(pkList);
     * cb.query().addOrderBy_SuppressJoinSqId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> refCBLambda) {
        myBhv().loadWhiteSuppressJoinSqManyList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSuppressJoinSqManyList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSuppressJoinSqMany().ready(_referrerWhiteSuppressJoinSqManyList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSqOne _foreignWhiteSuppressJoinSqOneAsOneLoader;
    public LoaderOfWhiteSuppressJoinSqOne pulloutWhiteSuppressJoinSqOneAsOne() {
        if (_foreignWhiteSuppressJoinSqOneAsOneLoader == null)
        { _foreignWhiteSuppressJoinSqOneAsOneLoader = new LoaderOfWhiteSuppressJoinSqOne().ready(myBhv().pulloutWhiteSuppressJoinSqOneAsOne(_selectedList), _selector); }
        return _foreignWhiteSuppressJoinSqOneAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSq> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
