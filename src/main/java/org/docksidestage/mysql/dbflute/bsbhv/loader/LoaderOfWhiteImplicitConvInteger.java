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
 * The referrer loader of WHITE_IMPLICIT_CONV_INTEGER as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_INTEGER_ID
 *
 * [column]
 *     IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_NUMERIC, WHITE_IMPLICIT_CONV_STRING
 *
 * [referrer table]
 *     white_implicit_conv_numeric, white_implicit_conv_string
 *
 * [foreign property]
 *     whiteImplicitConvNumeric, whiteImplicitConvString
 *
 * [referrer property]
 *     whiteImplicitConvNumericList, whiteImplicitConvStringList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteImplicitConvInteger {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteImplicitConvInteger> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteImplicitConvIntegerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteImplicitConvInteger ready(List<WhiteImplicitConvInteger> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteImplicitConvIntegerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteImplicitConvIntegerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteImplicitConvNumeric> _referrerWhiteImplicitConvNumeric;

    /**
     * Load referrer of whiteImplicitConvNumericList by the set-upper of referrer. <br>
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteImplicitConvIntegerList</span>, <span style="color: #553000">integerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">integerLoader</span>.<span style="color: #CC4747">loadWhiteImplicitConvNumeric</span>(<span style="color: #553000">numericCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">numericCB</span>.setupSelect...
     *         <span style="color: #553000">numericCB</span>.query().set...
     *         <span style="color: #553000">numericCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">numericLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    numericLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">whiteImplicitConvIntegerList</span>) {
     *     ... = whiteImplicitConvInteger.<span style="color: #CC4747">getWhiteImplicitConvNumericList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvNumeric> loadWhiteImplicitConvNumeric(ConditionBeanSetupper<WhiteImplicitConvNumericCB> refCBLambda) {
        myBhv().loadWhiteImplicitConvNumeric(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteImplicitConvNumeric = refLs);
        return hd -> hd.handle(new LoaderOfWhiteImplicitConvNumeric().ready(_referrerWhiteImplicitConvNumeric, _selector));
    }

    protected List<WhiteImplicitConvString> _referrerWhiteImplicitConvString;

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br>
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteImplicitConvIntegerList</span>, <span style="color: #553000">integerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">integerLoader</span>.<span style="color: #CC4747">loadWhiteImplicitConvString</span>(<span style="color: #553000">stringCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stringCB</span>.setupSelect...
     *         <span style="color: #553000">stringCB</span>.query().set...
     *         <span style="color: #553000">stringCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stringLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stringLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">whiteImplicitConvIntegerList</span>) {
     *     ... = whiteImplicitConvInteger.<span style="color: #CC4747">getWhiteImplicitConvStringList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteImplicitConvString> loadWhiteImplicitConvString(ConditionBeanSetupper<WhiteImplicitConvStringCB> refCBLambda) {
        myBhv().loadWhiteImplicitConvString(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteImplicitConvString = refLs);
        return hd -> hd.handle(new LoaderOfWhiteImplicitConvString().ready(_referrerWhiteImplicitConvString, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteImplicitConvNumeric _foreignWhiteImplicitConvNumericLoader;
    public LoaderOfWhiteImplicitConvNumeric pulloutWhiteImplicitConvNumeric() {
        if (_foreignWhiteImplicitConvNumericLoader == null)
        { _foreignWhiteImplicitConvNumericLoader = new LoaderOfWhiteImplicitConvNumeric().ready(myBhv().pulloutWhiteImplicitConvNumeric(_selectedList), _selector); }
        return _foreignWhiteImplicitConvNumericLoader;
    }

    protected LoaderOfWhiteImplicitConvString _foreignWhiteImplicitConvStringLoader;
    public LoaderOfWhiteImplicitConvString pulloutWhiteImplicitConvString() {
        if (_foreignWhiteImplicitConvStringLoader == null)
        { _foreignWhiteImplicitConvStringLoader = new LoaderOfWhiteImplicitConvString().ready(myBhv().pulloutWhiteImplicitConvString(_selectedList), _selector); }
        return _foreignWhiteImplicitConvStringLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteImplicitConvInteger> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
