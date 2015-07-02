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
 * The referrer loader of WHITE_QUOTED_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     WHERE
 *
 * [column]
 *     WHERE, ORDER
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
 *     WHITE_QUOTED
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteQuoted
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteQuotedRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteQuotedRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteQuotedRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteQuotedRef ready(List<WhiteQuotedRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteQuotedRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteQuotedRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteQuoted _foreignWhiteQuotedLoader;
    public LoaderOfWhiteQuoted pulloutWhiteQuoted() {
        if (_foreignWhiteQuotedLoader == null)
        { _foreignWhiteQuotedLoader = new LoaderOfWhiteQuoted().ready(myBhv().pulloutWhiteQuoted(_selectedList), _selector); }
        return _foreignWhiteQuotedLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteQuotedRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
