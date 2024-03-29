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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_MANY as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqMany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqMany> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqManyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqMany ready(List<WhiteSuppressJoinSqMany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqManyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqManyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSqManyOne _foreignWhiteSuppressJoinSqManyOneLoader;
    public LoaderOfWhiteSuppressJoinSqManyOne pulloutWhiteSuppressJoinSqManyOne() {
        if (_foreignWhiteSuppressJoinSqManyOneLoader == null)
        { _foreignWhiteSuppressJoinSqManyOneLoader = new LoaderOfWhiteSuppressJoinSqManyOne().ready(myBhv().pulloutWhiteSuppressJoinSqManyOne(_selectedList), _selector); }
        return _foreignWhiteSuppressJoinSqManyOneLoader;
    }

    protected LoaderOfWhiteSuppressJoinSq _foreignWhiteSuppressJoinSqLoader;
    public LoaderOfWhiteSuppressJoinSq pulloutWhiteSuppressJoinSq() {
        if (_foreignWhiteSuppressJoinSqLoader == null)
        { _foreignWhiteSuppressJoinSqLoader = new LoaderOfWhiteSuppressJoinSq().ready(myBhv().pulloutWhiteSuppressJoinSq(_selectedList), _selector); }
        return _foreignWhiteSuppressJoinSqLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqMany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
