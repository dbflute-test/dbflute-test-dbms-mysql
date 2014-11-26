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
 * The referrer loader of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br>
 * <pre>
 * [primary key]
 *     REFERRER_ID
 *
 * [column]
 *     REFERRER_ID, VARIANT_MASTER_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsVariant), WHITE_VARIANT_RELATION_MASTER_BAR(AsVariant), WHITE_VARIANT_RELATION_MASTER_QUX(AsVariantByQue), WHITE_VARIANT_RELATION_MASTER_CORGE(AsVariantByQuxType)
 *
 * [referrer table]
 *     white_variant_relation_referrer_ref
 *
 * [foreign property]
 *     whiteVariantRelationMasterFooAsVariant, whiteVariantRelationMasterBarAsVariant, whiteVariantRelationMasterQuxAsVariantByQue, whiteVariantRelationMasterCorgeAsVariantByQuxType
 *
 * [referrer property]
 *     whiteVariantRelationReferrerRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationReferrer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationReferrer> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationReferrerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationReferrer ready(List<WhiteVariantRelationReferrer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationReferrerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationReferrerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteVariantRelationReferrerRef> _referrerWhiteVariantRelationReferrerRef;

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br>
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteVariantRelationReferrerList</span>, <span style="color: #553000">referrerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">referrerLoader</span>.<span style="color: #CC4747">loadWhiteVariantRelationReferrerRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : <span style="color: #553000">whiteVariantRelationReferrerList</span>) {
     *     ... = whiteVariantRelationReferrer.<span style="color: #CC4747">getWhiteVariantRelationReferrerRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRef(ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> refCBLambda) {
        myBhv().loadWhiteVariantRelationReferrerRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteVariantRelationReferrerRef = refLs);
        return hd -> hd.handle(new LoaderOfWhiteVariantRelationReferrerRef().ready(_referrerWhiteVariantRelationReferrerRef, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteVariantRelationMasterFoo _foreignWhiteVariantRelationMasterFooAsVariantLoader;
    public LoaderOfWhiteVariantRelationMasterFoo pulloutWhiteVariantRelationMasterFooAsVariant() {
        if (_foreignWhiteVariantRelationMasterFooAsVariantLoader == null)
        { _foreignWhiteVariantRelationMasterFooAsVariantLoader = new LoaderOfWhiteVariantRelationMasterFoo().ready(myBhv().pulloutWhiteVariantRelationMasterFooAsVariant(_selectedList), _selector); }
        return _foreignWhiteVariantRelationMasterFooAsVariantLoader;
    }

    protected LoaderOfWhiteVariantRelationMasterBar _foreignWhiteVariantRelationMasterBarAsVariantLoader;
    public LoaderOfWhiteVariantRelationMasterBar pulloutWhiteVariantRelationMasterBarAsVariant() {
        if (_foreignWhiteVariantRelationMasterBarAsVariantLoader == null)
        { _foreignWhiteVariantRelationMasterBarAsVariantLoader = new LoaderOfWhiteVariantRelationMasterBar().ready(myBhv().pulloutWhiteVariantRelationMasterBarAsVariant(_selectedList), _selector); }
        return _foreignWhiteVariantRelationMasterBarAsVariantLoader;
    }

    protected LoaderOfWhiteVariantRelationMasterQux _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader;
    public LoaderOfWhiteVariantRelationMasterQux pulloutWhiteVariantRelationMasterQuxAsVariantByQue() {
        if (_foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader == null)
        { _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader = new LoaderOfWhiteVariantRelationMasterQux().ready(myBhv().pulloutWhiteVariantRelationMasterQuxAsVariantByQue(_selectedList), _selector); }
        return _foreignWhiteVariantRelationMasterQuxAsVariantByQueLoader;
    }

    protected LoaderOfWhiteVariantRelationMasterCorge _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader;
    public LoaderOfWhiteVariantRelationMasterCorge pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        if (_foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader == null)
        { _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader = new LoaderOfWhiteVariantRelationMasterCorge().ready(myBhv().pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType(_selectedList), _selector); }
        return _foreignWhiteVariantRelationMasterCorgeAsVariantByQuxTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationReferrer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
