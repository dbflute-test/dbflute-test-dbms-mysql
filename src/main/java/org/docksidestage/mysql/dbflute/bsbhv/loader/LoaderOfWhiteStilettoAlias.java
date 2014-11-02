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
 * The referrer loader of WHITE_STILETTO_ALIAS as TABLE. <br>
 * <pre>
 * [primary key]
 *     STILETTO_ALIAS_ID
 *
 * [column]
 *     STILETTO_ALIAS_ID, FOO, FOO_0, FOO_1, FOO2, FOO_3, FOO4, BAR, QUX
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
 *     white_stiletto_alias_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteStilettoAliasRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteStilettoAlias {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteStilettoAlias> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteStilettoAliasBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteStilettoAlias ready(List<WhiteStilettoAlias> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteStilettoAliasBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteStilettoAliasBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteStilettoAliasRef> _referrerWhiteStilettoAliasRef;

    /**
     * Load referrer of whiteStilettoAliasRefList by the set-upper of referrer. <br>
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteStilettoAliasBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteStilettoAliasList</span>, <span style="color: #553000">aliasLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">aliasLoader</span>.<span style="color: #CC4747">loadWhiteStilettoAliasRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteStilettoAlias whiteStilettoAlias : <span style="color: #553000">whiteStilettoAliasList</span>) {
     *     ... = whiteStilettoAlias.<span style="color: #CC4747">getWhiteStilettoAliasRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStilettoAliasId_InScope(pkList);
     * cb.query().addOrderBy_StilettoAliasId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteStilettoAliasRef> loadWhiteStilettoAliasRef(ConditionBeanSetupper<WhiteStilettoAliasRefCB> refCBLambda) {
        myBhv().loadWhiteStilettoAliasRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteStilettoAliasRef = refLs);
        return hd -> hd.handle(new LoaderOfWhiteStilettoAliasRef().ready(_referrerWhiteStilettoAliasRef, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteStilettoAlias> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
