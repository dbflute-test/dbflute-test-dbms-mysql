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
 * The referrer loader of WHITE_COMPOUND_PK as TABLE. <br />
 * <pre>
 * [primary key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, PK_NAME, REFERRED_ID
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
 *     white_compound_pk_ref, white_compound_pk_ref_many
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
    protected List<WhiteCompoundPkRef> _referrerWhiteCompoundPkRefList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRef> loadWhiteCompoundPkRefList(ConditionBeanSetupper<WhiteCompoundPkRefCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRef().ready(_referrerWhiteCompoundPkRefList, _selector));
    }

    protected List<WhiteCompoundPkRefMany> _referrerWhiteCompoundPkRefManyToPKList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefMany> loadWhiteCompoundPkRefManyToPKList(ConditionBeanSetupper<WhiteCompoundPkRefManyCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefManyToPKList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefManyToPKList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefMany().ready(_referrerWhiteCompoundPkRefManyToPKList, _selector));
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
