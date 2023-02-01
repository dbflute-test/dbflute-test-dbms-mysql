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
 * The referrer loader of WHITE_COMPOUND_REFERRED_PRIMARY as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundReferredPrimary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundReferredPrimary> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundReferredPrimaryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundReferredPrimary ready(List<WhiteCompoundReferredPrimary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundReferredPrimaryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundReferredPrimaryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPk> _referrerWhiteCompoundPk;

    /**
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK by PK_SECOND_ID, named 'whiteCompoundPkList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundReferredPrimaryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundReferredPrimaryList</span>, <span style="color: #553000">primaryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">primaryLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPk</span>(<span style="color: #553000">pkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pkCB</span>.setupSelect...
     *         <span style="color: #553000">pkCB</span>.query().set...
     *         <span style="color: #553000">pkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pkLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundReferredPrimary whiteCompoundReferredPrimary : <span style="color: #553000">whiteCompoundReferredPrimaryList</span>) {
     *     ... = whiteCompoundReferredPrimary.<span style="color: #CC4747">getWhiteCompoundPkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPkSecondId_InScope(pkList);
     * cb.query().addOrderBy_PkSecondId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPk> loadWhiteCompoundPk(ConditionBeanSetupper<WhiteCompoundPkCB> refCBLambda) {
        myBhv().loadWhiteCompoundPk(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPk = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPk().ready(_referrerWhiteCompoundPk, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundReferredPrimary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
