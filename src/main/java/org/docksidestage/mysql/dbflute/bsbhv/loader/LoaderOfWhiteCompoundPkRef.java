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
 * The referrer loader of WHITE_COMPOUND_PK_REF as TABLE. <br />
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
 *     white_compound_pk
 *
 * [referrer table]
 *     white_compound_pk_ref_nest
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
    protected List<WhiteCompoundPkRefNest> _referrerWhiteCompoundPkRefNestByQuxMultipleIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByQuxMultipleIdList(ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefNestByQuxMultipleIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefNestByQuxMultipleIdList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefNest().ready(_referrerWhiteCompoundPkRefNestByQuxMultipleIdList, _selector));
    }

    protected List<WhiteCompoundPkRefNest> _referrerWhiteCompoundPkRefNestByFooMultipleIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByFooMultipleIdList(ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefNestByFooMultipleIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefNestByFooMultipleIdList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefNest().ready(_referrerWhiteCompoundPkRefNestByFooMultipleIdList, _selector));
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
