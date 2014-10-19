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
 * The referrer loader of WHITE_VARIANT_RELATION_MASTER_FOO as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_FOO_ID
 *
 * [column]
 *     MASTER_FOO_ID, MASTER_FOO_NAME
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
 *     WHITE_VARIANT_RELATION_REFERRER(AsBizOneToOneForBizManyToOne), white_variant_relation_local_pk_referrer(AsOne)
 *
 * [referrer table]
 *     white_variant_relation_referrer, white_variant_relation_local_pk_referrer
 *
 * [foreign property]
 *     whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne, whiteVariantRelationLocalPkReferrerAsOne
 *
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationMasterFoo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationMasterFoo> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationMasterFooBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationMasterFoo ready(List<WhiteVariantRelationMasterFoo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationMasterFooBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationMasterFooBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteVariantRelationReferrer> _referrerWhiteVariantRelationReferrerAsVariantList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(ConditionBeanSetupper<WhiteVariantRelationReferrerCB> refCBLambda) {
        myBhv().loadWhiteVariantRelationReferrerAsVariantList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteVariantRelationReferrerAsVariantList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteVariantRelationReferrer().ready(_referrerWhiteVariantRelationReferrerAsVariantList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteVariantRelationReferrer _foreignWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOneLoader;
    public LoaderOfWhiteVariantRelationReferrer pulloutWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        if (_foreignWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOneLoader == null)
        { _foreignWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOneLoader = new LoaderOfWhiteVariantRelationReferrer().ready(myBhv().pulloutWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(_selectedList), _selector); }
        return _foreignWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOneLoader;
    }

    protected LoaderOfWhiteVariantRelationLocalPkReferrer _foreignWhiteVariantRelationLocalPkReferrerAsOneLoader;
    public LoaderOfWhiteVariantRelationLocalPkReferrer pulloutWhiteVariantRelationLocalPkReferrerAsOne() {
        if (_foreignWhiteVariantRelationLocalPkReferrerAsOneLoader == null)
        { _foreignWhiteVariantRelationLocalPkReferrerAsOneLoader = new LoaderOfWhiteVariantRelationLocalPkReferrer().ready(myBhv().pulloutWhiteVariantRelationLocalPkReferrerAsOne(_selectedList), _selector); }
        return _foreignWhiteVariantRelationLocalPkReferrerAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationMasterFoo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
