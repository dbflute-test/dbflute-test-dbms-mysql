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
 * The referrer loader of WHITE_NON_UNIQUE_MANY_TO_ONE_FROM as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteNonUniqueManyToOneFrom {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteNonUniqueManyToOneFrom> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteNonUniqueManyToOneFromBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteNonUniqueManyToOneFrom ready(List<WhiteNonUniqueManyToOneFrom> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteNonUniqueManyToOneFromBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteNonUniqueManyToOneFromBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteNonUniqueManyToOneTo _foreignWhiteNonUniqueManyToOneToAsNonUniqueManyToOneLoader;
    public LoaderOfWhiteNonUniqueManyToOneTo pulloutWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() {
        if (_foreignWhiteNonUniqueManyToOneToAsNonUniqueManyToOneLoader == null)
        { _foreignWhiteNonUniqueManyToOneToAsNonUniqueManyToOneLoader = new LoaderOfWhiteNonUniqueManyToOneTo().ready(myBhv().pulloutWhiteNonUniqueManyToOneToAsNonUniqueManyToOne(_selectedList), _selector); }
        return _foreignWhiteNonUniqueManyToOneToAsNonUniqueManyToOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteNonUniqueManyToOneFrom> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
