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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI as TABLE. <br>
 * <pre>
 * [primary key]
 *     ONE_ADDI_ID
 *
 * [column]
 *     ONE_ADDI_ID, ONE_ADDI_NAME
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
 *     white_suppress_join_sq_one
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSuppressJoinSqOneList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqOneAddi {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqOneAddi> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqOneAddiBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqOneAddi ready(List<WhiteSuppressJoinSqOneAddi> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqOneAddiBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqOneAddiBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSuppressJoinSqOne> _referrerWhiteSuppressJoinSqOneList;

    /**
     * Load referrer of whiteSuppressJoinSqOneList by the set-upper of referrer. <br>
     * white_suppress_join_sq_one by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSuppressJoinSqOneAddiList</span>, <span style="color: #553000">addiLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">addiLoader</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqOneList</span>(<span style="color: #553000">oneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">oneCB</span>.setupSelect...
     *         <span style="color: #553000">oneCB</span>.query().set...
     *         <span style="color: #553000">oneCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">oneLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    oneLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : <span style="color: #553000">whiteSuppressJoinSqOneAddiList</span>) {
     *     ... = whiteSuppressJoinSqOneAddi.<span style="color: #CC4747">getWhiteSuppressJoinSqOneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOneAddiId_InScope(pkList);
     * cb.query().addOrderBy_OneAddiId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSuppressJoinSqOne> loadWhiteSuppressJoinSqOneList(ConditionBeanSetupper<WhiteSuppressJoinSqOneCB> refCBLambda) {
        myBhv().loadWhiteSuppressJoinSqOneList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSuppressJoinSqOneList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSuppressJoinSqOne().ready(_referrerWhiteSuppressJoinSqOneList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqOneAddi> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
