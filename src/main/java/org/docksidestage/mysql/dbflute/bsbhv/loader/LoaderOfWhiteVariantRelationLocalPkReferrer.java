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
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteVariantRelationLocalPkReferrer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteVariantRelationLocalPkReferrer> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteVariantRelationLocalPkReferrerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteVariantRelationLocalPkReferrer ready(List<WhiteVariantRelationLocalPkReferrer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteVariantRelationLocalPkReferrerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteVariantRelationLocalPkReferrerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteVariantRelationMasterFoo _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader;
    public LoaderOfWhiteVariantRelationMasterFoo pulloutWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        if (_foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader == null)
        { _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader = new LoaderOfWhiteVariantRelationMasterFoo().ready(myBhv().pulloutWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(_selectedList), _selector); }
        return _foreignWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteVariantRelationLocalPkReferrer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
