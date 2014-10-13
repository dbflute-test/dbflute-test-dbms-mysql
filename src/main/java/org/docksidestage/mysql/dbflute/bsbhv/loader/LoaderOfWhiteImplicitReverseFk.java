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
 * The referrer loader of WHITE_IMPLICIT_REVERSE_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_ID, WHITE_IMPLICIT_REVERSE_FK_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     WHITE_IMPLICIT_REVERSE_FK_REF(WithImplicitReverseFK), WHITE_IMPLICIT_REVERSE_FK_SUPPRESS(SuppressImplicitReverseFK)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteImplicitReverseFkRefWithImplicitReverseFK, whiteImplicitReverseFkSuppressSuppressImplicitReverseFK
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteImplicitReverseFk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteImplicitReverseFk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteImplicitReverseFkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteImplicitReverseFk ready(List<WhiteImplicitReverseFk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteImplicitReverseFkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteImplicitReverseFkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteImplicitReverseFkRef _foreignWhiteImplicitReverseFkRefWithImplicitReverseFKLoader;
    public LoaderOfWhiteImplicitReverseFkRef pulloutWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        if (_foreignWhiteImplicitReverseFkRefWithImplicitReverseFKLoader != null) { return _foreignWhiteImplicitReverseFkRefWithImplicitReverseFKLoader; }
        List<WhiteImplicitReverseFkRef> pulledList = myBhv().pulloutWhiteImplicitReverseFkRefWithImplicitReverseFK(_selectedList);
        _foreignWhiteImplicitReverseFkRefWithImplicitReverseFKLoader = new LoaderOfWhiteImplicitReverseFkRef().ready(pulledList, _selector);
        return _foreignWhiteImplicitReverseFkRefWithImplicitReverseFKLoader;
    }

    protected LoaderOfWhiteImplicitReverseFkSuppress _foreignWhiteImplicitReverseFkSuppressSuppressImplicitReverseFKLoader;
    public LoaderOfWhiteImplicitReverseFkSuppress pulloutWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        if (_foreignWhiteImplicitReverseFkSuppressSuppressImplicitReverseFKLoader != null) { return _foreignWhiteImplicitReverseFkSuppressSuppressImplicitReverseFKLoader; }
        List<WhiteImplicitReverseFkSuppress> pulledList = myBhv().pulloutWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(_selectedList);
        _foreignWhiteImplicitReverseFkSuppressSuppressImplicitReverseFKLoader = new LoaderOfWhiteImplicitReverseFkSuppress().ready(pulledList, _selector);
        return _foreignWhiteImplicitReverseFkSuppressSuppressImplicitReverseFKLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteImplicitReverseFk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
