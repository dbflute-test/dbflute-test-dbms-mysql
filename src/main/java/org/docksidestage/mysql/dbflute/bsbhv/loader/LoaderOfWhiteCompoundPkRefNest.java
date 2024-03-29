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
 * The referrer loader of WHITE_COMPOUND_PK_REF_NEST as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPkRefNest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkRefNest> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkRefNestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkRefNest ready(List<WhiteCompoundPkRefNest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkRefNestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkRefNestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundPkRef _foreignWhiteCompoundPkRefByQuxMultipleIdLoader;
    public LoaderOfWhiteCompoundPkRef pulloutWhiteCompoundPkRefByQuxMultipleId() {
        if (_foreignWhiteCompoundPkRefByQuxMultipleIdLoader == null)
        { _foreignWhiteCompoundPkRefByQuxMultipleIdLoader = new LoaderOfWhiteCompoundPkRef().ready(myBhv().pulloutWhiteCompoundPkRefByQuxMultipleId(_selectedList), _selector); }
        return _foreignWhiteCompoundPkRefByQuxMultipleIdLoader;
    }

    protected LoaderOfWhiteCompoundPkRef _foreignWhiteCompoundPkRefByFooMultipleIdLoader;
    public LoaderOfWhiteCompoundPkRef pulloutWhiteCompoundPkRefByFooMultipleId() {
        if (_foreignWhiteCompoundPkRefByFooMultipleIdLoader == null)
        { _foreignWhiteCompoundPkRefByFooMultipleIdLoader = new LoaderOfWhiteCompoundPkRef().ready(myBhv().pulloutWhiteCompoundPkRefByFooMultipleId(_selectedList), _selector); }
        return _foreignWhiteCompoundPkRefByFooMultipleIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkRefNest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
