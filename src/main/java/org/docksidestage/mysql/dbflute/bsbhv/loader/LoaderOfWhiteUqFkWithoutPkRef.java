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
 * The referrer loader of WHITE_UQ_FK_WITHOUT_PK_REF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteUqFkWithoutPkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkWithoutPkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkWithoutPkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkWithoutPkRef ready(List<WhiteUqFkWithoutPkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkWithoutPkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkWithoutPkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFkWithoutPk _foreignWhiteUqFkWithoutPkLoader;
    public LoaderOfWhiteUqFkWithoutPk pulloutWhiteUqFkWithoutPk() {
        if (_foreignWhiteUqFkWithoutPkLoader == null)
        { _foreignWhiteUqFkWithoutPkLoader = new LoaderOfWhiteUqFkWithoutPk().ready(myBhv().pulloutWhiteUqFkWithoutPk(_selectedList), _selector); }
        return _foreignWhiteUqFkWithoutPkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkWithoutPkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
