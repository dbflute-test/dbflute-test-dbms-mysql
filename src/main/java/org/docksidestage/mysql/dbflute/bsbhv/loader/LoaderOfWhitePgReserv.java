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
 * The referrer loader of WHITE_PG_RESERV as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS
 *
 * [column]
 *     CLASS, CASE, PACKAGE, DEFAULT, NEW, NATIVE, VOID, PUBLIC, PROTECTED, PRIVATE, INTERFACE, ABSTRACT, FINAL, FINALLY, RETURN, DOUBLE, FLOAT, SHORT, TYPE, RESERV_NAME
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
 *     
 *
 * [referrer table]
 *     white_pg_reserv_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePgReservRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePgReserv {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePgReserv> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePgReservBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePgReserv ready(List<WhitePgReserv> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePgReservBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePgReservBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePgReservRef> _referrerWhitePgReservRef;

    /**
     * Load referrer of whitePgReservRefList by the set-upper of referrer. <br>
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * <pre>
     * <span style="color: #0000C0">whitePgReservBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whitePgReservList</span>, <span style="color: #553000">reservLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reservLoader</span>.<span style="color: #CC4747">loadWhitePgReservRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhitePgReserv whitePgReserv : <span style="color: #553000">whitePgReservList</span>) {
     *     ... = whitePgReserv.<span style="color: #CC4747">getWhitePgReservRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassSynonym_InScope(pkList);
     * cb.query().addOrderBy_ClassSynonym_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhitePgReservRef> loadWhitePgReservRef(ConditionBeanSetupper<WhitePgReservRefCB> refCBLambda) {
        myBhv().loadWhitePgReservRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhitePgReservRef = refLs);
        return hd -> hd.handle(new LoaderOfWhitePgReservRef().ready(_referrerWhitePgReservRef, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePgReserv> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
