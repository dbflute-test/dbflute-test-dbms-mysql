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
 * The referrer loader of WHITE_SUPPRESS_JOIN_SQ_ONE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSuppressJoinSqOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSuppressJoinSqOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSuppressJoinSqOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSuppressJoinSqOne ready(List<WhiteSuppressJoinSqOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSuppressJoinSqOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSuppressJoinSqOneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSuppressJoinSq _foreignWhiteSuppressJoinSqLoader;
    public LoaderOfWhiteSuppressJoinSq pulloutWhiteSuppressJoinSq() {
        if (_foreignWhiteSuppressJoinSqLoader == null)
        { _foreignWhiteSuppressJoinSqLoader = new LoaderOfWhiteSuppressJoinSq().ready(myBhv().pulloutWhiteSuppressJoinSq(_selectedList), _selector); }
        return _foreignWhiteSuppressJoinSqLoader;
    }

    protected LoaderOfWhiteSuppressJoinSqOneAddi _foreignWhiteSuppressJoinSqOneAddiLoader;
    public LoaderOfWhiteSuppressJoinSqOneAddi pulloutWhiteSuppressJoinSqOneAddi() {
        if (_foreignWhiteSuppressJoinSqOneAddiLoader == null)
        { _foreignWhiteSuppressJoinSqOneAddiLoader = new LoaderOfWhiteSuppressJoinSqOneAddi().ready(myBhv().pulloutWhiteSuppressJoinSqOneAddi(_selectedList), _selector); }
        return _foreignWhiteSuppressJoinSqOneAddiLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSuppressJoinSqOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
