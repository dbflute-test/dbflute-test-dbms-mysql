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
 * The referrer loader of WHITE_SELF_REFERENCE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     white_self_reference, white_self_reference_ref_one(AsOne)
 *
 * [referrer table]
 *     white_self_reference, white_self_reference_ref_one
 *
 * [foreign property]
 *     whiteSelfReferenceSelf, whiteSelfReferenceRefOneAsOne
 *
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSelfReference {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSelfReference> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSelfReferenceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSelfReference ready(List<WhiteSelfReference> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSelfReferenceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSelfReferenceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSelfReference> _referrerWhiteSelfReferenceSelfList;

    /**
     * Load referrer of whiteSelfReferenceSelfList by the set-upper of referrer. <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * <pre>
     * <span style="color: #0000C0">whiteSelfReferenceBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSelfReferenceList</span>, <span style="color: #553000">referenceLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">referenceLoader</span>.<span style="color: #CC4747">loadWhiteSelfReferenceSelfList</span>(<span style="color: #553000">referenceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">referenceCB</span>.setupSelect...
     *         <span style="color: #553000">referenceCB</span>.query().set...
     *         <span style="color: #553000">referenceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">referenceLoader</span> -&gt {</span>
     *     <span style="color: #3F7E5E">//    referenceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSelfReference whiteSelfReference : <span style="color: #553000">whiteSelfReferenceList</span>) {
     *     ... = whiteSelfReference.<span style="color: #CC4747">getWhiteSelfReferenceSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentId_InScope(pkList);
     * cb.query().addOrderBy_ParentId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSelfReference> loadWhiteSelfReferenceSelfList(ConditionBeanSetupper<WhiteSelfReferenceCB> refCBLambda) {
        myBhv().loadWhiteSelfReferenceSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSelfReferenceSelfList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSelfReference().ready(_referrerWhiteSelfReferenceSelfList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSelfReference _foreignWhiteSelfReferenceSelfLoader;
    public LoaderOfWhiteSelfReference pulloutWhiteSelfReferenceSelf() {
        if (_foreignWhiteSelfReferenceSelfLoader == null)
        { _foreignWhiteSelfReferenceSelfLoader = new LoaderOfWhiteSelfReference().ready(myBhv().pulloutWhiteSelfReferenceSelf(_selectedList), _selector); }
        return _foreignWhiteSelfReferenceSelfLoader;
    }

    protected LoaderOfWhiteSelfReferenceRefOne _foreignWhiteSelfReferenceRefOneAsOneLoader;
    public LoaderOfWhiteSelfReferenceRefOne pulloutWhiteSelfReferenceRefOneAsOne() {
        if (_foreignWhiteSelfReferenceRefOneAsOneLoader == null)
        { _foreignWhiteSelfReferenceRefOneAsOneLoader = new LoaderOfWhiteSelfReferenceRefOne().ready(myBhv().pulloutWhiteSelfReferenceRefOneAsOne(_selectedList), _selector); }
        return _foreignWhiteSelfReferenceRefOneAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSelfReference> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
