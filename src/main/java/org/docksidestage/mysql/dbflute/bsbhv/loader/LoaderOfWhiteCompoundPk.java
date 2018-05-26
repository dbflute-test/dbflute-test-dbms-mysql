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
 * The referrer loader of WHITE_COMPOUND_PK as TABLE. <br>
 * <pre>
 * [primary key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, COMPOUND_PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_REFERRED_NORMALLY, WHITE_COMPOUND_REFERRED_PRIMARY, WHITE_COMPOUND_PK_REF_MANY(AsMax)
 *
 * [referrer table]
 *     WHITE_COMPOUND_PK_REF, WHITE_COMPOUND_PK_REF_MANY
 *
 * [foreign property]
 *     whiteCompoundReferredNormally, whiteCompoundReferredPrimary, whiteCompoundPkRefManyAsMax, whiteCompoundPkRefManyAsMin
 *
 * [referrer property]
 *     whiteCompoundPkRefList, whiteCompoundPkRefManyToPKList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPk ready(List<WhiteCompoundPk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPkRef> _referrerWhiteCompoundPkRef;

    /**
     * Load referrer of whiteCompoundPkRefList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundPkList</span>, <span style="color: #553000">pkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pkLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundPk whiteCompoundPk : <span style="color: #553000">whiteCompoundPkList</span>) {
     *     ... = whiteCompoundPk.<span style="color: #CC4747">getWhiteCompoundPkRefList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRef> loadWhiteCompoundPkRef(ConditionBeanSetupper<WhiteCompoundPkRefCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRef = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRef().ready(_referrerWhiteCompoundPkRef, _selector));
    }

    protected List<WhiteCompoundPkRefMany> _referrerWhiteCompoundPkRefManyToPK;

    /**
     * Load referrer of whiteCompoundPkRefManyToPKList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_MANY by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundPkList</span>, <span style="color: #553000">pkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pkLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefManyToPK</span>(<span style="color: #553000">manyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">manyCB</span>.setupSelect...
     *         <span style="color: #553000">manyCB</span>.query().set...
     *         <span style="color: #553000">manyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">manyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    manyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundPk whiteCompoundPk : <span style="color: #553000">whiteCompoundPkList</span>) {
     *     ... = whiteCompoundPk.<span style="color: #CC4747">getWhiteCompoundPkRefManyToPKList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefMany> loadWhiteCompoundPkRefManyToPK(ConditionBeanSetupper<WhiteCompoundPkRefManyCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefManyToPK(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefManyToPK = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefMany().ready(_referrerWhiteCompoundPkRefManyToPK, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundReferredNormally _foreignWhiteCompoundReferredNormallyLoader;
    public LoaderOfWhiteCompoundReferredNormally pulloutWhiteCompoundReferredNormally() {
        if (_foreignWhiteCompoundReferredNormallyLoader == null)
        { _foreignWhiteCompoundReferredNormallyLoader = new LoaderOfWhiteCompoundReferredNormally().ready(myBhv().pulloutWhiteCompoundReferredNormally(_selectedList), _selector); }
        return _foreignWhiteCompoundReferredNormallyLoader;
    }

    protected LoaderOfWhiteCompoundReferredPrimary _foreignWhiteCompoundReferredPrimaryLoader;
    public LoaderOfWhiteCompoundReferredPrimary pulloutWhiteCompoundReferredPrimary() {
        if (_foreignWhiteCompoundReferredPrimaryLoader == null)
        { _foreignWhiteCompoundReferredPrimaryLoader = new LoaderOfWhiteCompoundReferredPrimary().ready(myBhv().pulloutWhiteCompoundReferredPrimary(_selectedList), _selector); }
        return _foreignWhiteCompoundReferredPrimaryLoader;
    }

    protected LoaderOfWhiteCompoundPkRefMany _foreignWhiteCompoundPkRefManyAsMaxLoader;
    public LoaderOfWhiteCompoundPkRefMany pulloutWhiteCompoundPkRefManyAsMax() {
        if (_foreignWhiteCompoundPkRefManyAsMaxLoader == null)
        { _foreignWhiteCompoundPkRefManyAsMaxLoader = new LoaderOfWhiteCompoundPkRefMany().ready(myBhv().pulloutWhiteCompoundPkRefManyAsMax(_selectedList), _selector); }
        return _foreignWhiteCompoundPkRefManyAsMaxLoader;
    }

    protected LoaderOfWhiteCompoundPkRefMany _foreignWhiteCompoundPkRefManyAsMinLoader;
    public LoaderOfWhiteCompoundPkRefMany pulloutWhiteCompoundPkRefManyAsMin() {
        if (_foreignWhiteCompoundPkRefManyAsMinLoader == null)
        { _foreignWhiteCompoundPkRefManyAsMinLoader = new LoaderOfWhiteCompoundPkRefMany().ready(myBhv().pulloutWhiteCompoundPkRefManyAsMin(_selectedList), _selector); }
        return _foreignWhiteCompoundPkRefManyAsMinLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
