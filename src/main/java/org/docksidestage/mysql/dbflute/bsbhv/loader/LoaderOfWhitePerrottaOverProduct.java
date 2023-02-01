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
 * The referrer loader of WHITE_PERROTTA_OVER_PRODUCT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverProduct ready(List<WhitePerrottaOverProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePerrottaOverMember> _referrerWhitePerrottaOverMember;

    /**
     * Load referrer of whitePerrottaOverMemberList by the set-upper of referrer. <br>
     * WHITE_PERROTTA_OVER_MEMBER by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whitePerrottaOverProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWhitePerrottaOverMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : <span style="color: #553000">whitePerrottaOverProductList</span>) {
     *     ... = whitePerrottaOverProduct.<span style="color: #CC4747">getWhitePerrottaOverMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverMember> loadWhitePerrottaOverMember(ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhitePerrottaOverMember = refLs);
        return hd -> hd.handle(new LoaderOfWhitePerrottaOverMember().ready(_referrerWhitePerrottaOverMember, _selector));
    }

    protected List<WhitePerrottaOverTrace> _referrerWhitePerrottaOverTraceByNextProductId;

    /**
     * Load referrer of whitePerrottaOverTraceByNextProductIdList by the set-upper of referrer. <br>
     * WHITE_PERROTTA_OVER_TRACE by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whitePerrottaOverProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWhitePerrottaOverTraceByNextProductId</span>(<span style="color: #553000">traceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">traceCB</span>.setupSelect...
     *         <span style="color: #553000">traceCB</span>.query().set...
     *         <span style="color: #553000">traceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">traceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    traceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : <span style="color: #553000">whitePerrottaOverProductList</span>) {
     *     ... = whitePerrottaOverProduct.<span style="color: #CC4747">getWhitePerrottaOverTraceByNextProductIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextProductId_InScope(pkList);
     * cb.query().addOrderBy_NextProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverTrace> loadWhitePerrottaOverTraceByNextProductId(ConditionBeanSetupper<WhitePerrottaOverTraceCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverTraceByNextProductId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhitePerrottaOverTraceByNextProductId = refLs);
        return hd -> hd.handle(new LoaderOfWhitePerrottaOverTrace().ready(_referrerWhitePerrottaOverTraceByNextProductId, _selector));
    }

    protected List<WhitePerrottaOverTrace> _referrerWhitePerrottaOverTraceByPreviousProductId;

    /**
     * Load referrer of whitePerrottaOverTraceByPreviousProductIdList by the set-upper of referrer. <br>
     * WHITE_PERROTTA_OVER_TRACE by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whitePerrottaOverProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWhitePerrottaOverTraceByPreviousProductId</span>(<span style="color: #553000">traceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">traceCB</span>.setupSelect...
     *         <span style="color: #553000">traceCB</span>.query().set...
     *         <span style="color: #553000">traceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">traceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    traceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : <span style="color: #553000">whitePerrottaOverProductList</span>) {
     *     ... = whitePerrottaOverProduct.<span style="color: #CC4747">getWhitePerrottaOverTraceByPreviousProductIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPreviousProductId_InScope(pkList);
     * cb.query().addOrderBy_PreviousProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverTrace> loadWhitePerrottaOverTraceByPreviousProductId(ConditionBeanSetupper<WhitePerrottaOverTraceCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverTraceByPreviousProductId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhitePerrottaOverTraceByPreviousProductId = refLs);
        return hd -> hd.handle(new LoaderOfWhitePerrottaOverTrace().ready(_referrerWhitePerrottaOverTraceByPreviousProductId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhitePerrottaOverProductNested _foreignWhitePerrottaOverProductNestedLoader;
    public LoaderOfWhitePerrottaOverProductNested pulloutWhitePerrottaOverProductNested() {
        if (_foreignWhitePerrottaOverProductNestedLoader == null)
        { _foreignWhitePerrottaOverProductNestedLoader = new LoaderOfWhitePerrottaOverProductNested().ready(myBhv().pulloutWhitePerrottaOverProductNested(_selectedList), _selector); }
        return _foreignWhitePerrottaOverProductNestedLoader;
    }

    protected LoaderOfWhitePerrottaOverTrace _foreignWhitePerrottaOverTraceAsPerrottaLoader;
    public LoaderOfWhitePerrottaOverTrace pulloutWhitePerrottaOverTraceAsPerrotta() {
        if (_foreignWhitePerrottaOverTraceAsPerrottaLoader == null)
        { _foreignWhitePerrottaOverTraceAsPerrottaLoader = new LoaderOfWhitePerrottaOverTrace().ready(myBhv().pulloutWhitePerrottaOverTraceAsPerrotta(_selectedList), _selector); }
        return _foreignWhitePerrottaOverTraceAsPerrottaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
