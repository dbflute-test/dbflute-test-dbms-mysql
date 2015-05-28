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
 * The referrer loader of WHITE_COMPOUND_PK_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 *
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_FIRST_ID, REF_SECOND_ID, REF_NAME
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
 *     WHITE_COMPOUND_PK
 *
 * [referrer table]
 *     WHITE_COMPOUND_PK_REF_NEST
 *
 * [foreign property]
 *     whiteCompoundPk
 *
 * [referrer property]
 *     whiteCompoundPkRefNestByQuxMultipleIdList, whiteCompoundPkRefNestByFooMultipleIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkRef ready(List<WhiteCompoundPkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPkRefNest> _referrerWhiteCompoundPkRefNestByQuxMultipleId;

    /**
     * Load referrer of whiteCompoundPkRefNestByQuxMultipleIdList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_NEST by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundPkRefList</span>, <span style="color: #553000">refLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefNestByQuxMultipleId</span>(<span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">nestCB</span>.setupSelect...
     *         <span style="color: #553000">nestCB</span>.query().set...
     *         <span style="color: #553000">nestCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">nestLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    nestLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">whiteCompoundPkRefList</span>) {
     *     ... = whiteCompoundPkRef.<span style="color: #CC4747">getWhiteCompoundPkRefNestByQuxMultipleIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByQuxMultipleId(ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefNestByQuxMultipleId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefNestByQuxMultipleId = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefNest().ready(_referrerWhiteCompoundPkRefNestByQuxMultipleId, _selector));
    }

    protected List<WhiteCompoundPkRefNest> _referrerWhiteCompoundPkRefNestByFooMultipleId;

    /**
     * Load referrer of whiteCompoundPkRefNestByFooMultipleIdList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_NEST by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundPkRefList</span>, <span style="color: #553000">refLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefNestByFooMultipleId</span>(<span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">nestCB</span>.setupSelect...
     *         <span style="color: #553000">nestCB</span>.query().set...
     *         <span style="color: #553000">nestCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">nestLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    nestLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">whiteCompoundPkRefList</span>) {
     *     ... = whiteCompoundPkRef.<span style="color: #CC4747">getWhiteCompoundPkRefNestByFooMultipleIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByFooMultipleId(ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefNestByFooMultipleId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefNestByFooMultipleId = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefNest().ready(_referrerWhiteCompoundPkRefNestByFooMultipleId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundPk _foreignWhiteCompoundPkLoader;
    public LoaderOfWhiteCompoundPk pulloutWhiteCompoundPk() {
        if (_foreignWhiteCompoundPkLoader == null)
        { _foreignWhiteCompoundPkLoader = new LoaderOfWhiteCompoundPk().ready(myBhv().pulloutWhiteCompoundPk(_selectedList), _selector); }
        return _foreignWhiteCompoundPkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
