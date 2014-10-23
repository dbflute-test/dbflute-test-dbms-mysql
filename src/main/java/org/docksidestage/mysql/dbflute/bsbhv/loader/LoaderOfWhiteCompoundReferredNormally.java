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
 * The referrer loader of WHITE_COMPOUND_REFERRED_NORMALLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRED_ID
 *
 * [column]
 *     REFERRED_ID, REFERRED_NAME
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
 *     white_compound_pk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteCompoundPkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundReferredNormally {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundReferredNormally> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundReferredNormallyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundReferredNormally ready(List<WhiteCompoundReferredNormally> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundReferredNormallyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundReferredNormallyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPk> _referrerWhiteCompoundPkList;

    /**
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundReferredNormallyBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundReferredNormallyList</span>, <span style="color: #553000">normallyLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">normallyLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkList</span>(<span style="color: #553000">pkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pkCB</span>.setupSelect...
     *         <span style="color: #553000">pkCB</span>.query().set...
     *         <span style="color: #553000">pkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pkLoader</span> -&gt {</span>
     *     <span style="color: #3F7E5E">//    pkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : <span style="color: #553000">whiteCompoundReferredNormallyList</span>) {
     *     ... = whiteCompoundReferredNormally.<span style="color: #CC4747">getWhiteCompoundPkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferredId_InScope(pkList);
     * cb.query().addOrderBy_ReferredId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPk> loadWhiteCompoundPkList(ConditionBeanSetupper<WhiteCompoundPkCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPk().ready(_referrerWhiteCompoundPkList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundReferredNormally> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
