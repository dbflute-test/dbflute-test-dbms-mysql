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
 * The referrer loader of WHITE_IMPLICIT_CONV_STRING as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_STRING_ID
 *
 * [column]
 *     IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_NUMERIC
 *
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_numeric
 *
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvNumeric
 *
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvNumericList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteImplicitConvString {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteImplicitConvString> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteImplicitConvStringBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteImplicitConvString ready(List<WhiteImplicitConvString> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteImplicitConvStringBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteImplicitConvStringBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteImplicitConvInteger> _referrerWhiteImplicitConvIntegerList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(ConditionBeanSetupper<WhiteImplicitConvIntegerCB> refCBLambda) {
        myBhv().loadWhiteImplicitConvIntegerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteImplicitConvIntegerList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteImplicitConvInteger().ready(_referrerWhiteImplicitConvIntegerList, _selector));
    }

    protected List<WhiteImplicitConvNumeric> _referrerWhiteImplicitConvNumericList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvNumeric> loadWhiteImplicitConvNumericList(ConditionBeanSetupper<WhiteImplicitConvNumericCB> refCBLambda) {
        myBhv().loadWhiteImplicitConvNumericList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteImplicitConvNumericList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteImplicitConvNumeric().ready(_referrerWhiteImplicitConvNumericList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteImplicitConvInteger _foreignWhiteImplicitConvIntegerLoader;
    public LoaderOfWhiteImplicitConvInteger pulloutWhiteImplicitConvInteger() {
        if (_foreignWhiteImplicitConvIntegerLoader == null)
        { _foreignWhiteImplicitConvIntegerLoader = new LoaderOfWhiteImplicitConvInteger().ready(myBhv().pulloutWhiteImplicitConvInteger(_selectedList), _selector); }
        return _foreignWhiteImplicitConvIntegerLoader;
    }

    protected LoaderOfWhiteImplicitConvNumeric _foreignWhiteImplicitConvNumericLoader;
    public LoaderOfWhiteImplicitConvNumeric pulloutWhiteImplicitConvNumeric() {
        if (_foreignWhiteImplicitConvNumericLoader == null)
        { _foreignWhiteImplicitConvNumericLoader = new LoaderOfWhiteImplicitConvNumeric().ready(myBhv().pulloutWhiteImplicitConvNumeric(_selectedList), _selector); }
        return _foreignWhiteImplicitConvNumericLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteImplicitConvString> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
