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
 * The referrer loader of WHITE_MYSELF as TABLE. <br>
 * <pre>
 * [primary key]
 *     MYSELF_ID
 *
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     WHITE_MYSELF_CHECK
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteMyselfCheckList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteMyself {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteMyself> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteMyselfBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteMyself ready(List<WhiteMyself> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteMyselfBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteMyselfBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteMyselfCheck> _referrerWhiteMyselfCheck;

    /**
     * Load referrer of whiteMyselfCheckList by the set-upper of referrer. <br>
     * WHITE_MYSELF_CHECK by MYSELF_ID, named 'whiteMyselfCheckList'.
     * <pre>
     * <span style="color: #0000C0">whiteMyselfBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteMyselfList</span>, <span style="color: #553000">myselfLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">myselfLoader</span>.<span style="color: #CC4747">loadWhiteMyselfCheck</span>(<span style="color: #553000">checkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">checkCB</span>.setupSelect...
     *         <span style="color: #553000">checkCB</span>.query().set...
     *         <span style="color: #553000">checkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">checkLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    checkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteMyself whiteMyself : <span style="color: #553000">whiteMyselfList</span>) {
     *     ... = whiteMyself.<span style="color: #CC4747">getWhiteMyselfCheckList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyselfId_InScope(pkList);
     * cb.query().addOrderBy_MyselfId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteMyselfCheck> loadWhiteMyselfCheck(ConditionBeanSetupper<WhiteMyselfCheckCB> refCBLambda) {
        myBhv().loadWhiteMyselfCheck(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteMyselfCheck = refLs);
        return hd -> hd.handle(new LoaderOfWhiteMyselfCheck().ready(_referrerWhiteMyselfCheck, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteMyself> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
