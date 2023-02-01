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
 * The referrer loader of WHITE_PERROTTA_OVER_MEMBER_MACHO as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverMemberMacho {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverMemberMacho> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverMemberMachoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverMemberMacho ready(List<WhitePerrottaOverMemberMacho> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverMemberMachoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverMemberMachoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePerrottaOverMember> _referrerWhitePerrottaOverMember;

    /**
     * Load referrer of whitePerrottaOverMemberList by the set-upper of referrer. <br>
     * WHITE_PERROTTA_OVER_MEMBER by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whitePerrottaOverMemberMachoList</span>, <span style="color: #553000">machoLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">machoLoader</span>.<span style="color: #CC4747">loadWhitePerrottaOverMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho : <span style="color: #553000">whitePerrottaOverMemberMachoList</span>) {
     *     ... = whitePerrottaOverMemberMacho.<span style="color: #CC4747">getWhitePerrottaOverMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMachoCode_InScope(pkList);
     * cb.query().addOrderBy_MachoCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverMember> loadWhitePerrottaOverMember(ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhitePerrottaOverMember = refLs);
        return hd -> hd.handle(new LoaderOfWhitePerrottaOverMember().ready(_referrerWhitePerrottaOverMember, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverMemberMacho> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
