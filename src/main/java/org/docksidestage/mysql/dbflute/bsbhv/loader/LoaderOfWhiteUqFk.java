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
 * The referrer loader of WHITE_UQ_FK as TABLE. <br>
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     WHITE_UQ_FK_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteUqFk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFk ready(List<WhiteUqFk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToPkId;

    /**
     * Load referrer of whiteUqFkRefByFkToPkIdList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteUqFkList</span>, <span style="color: #553000">fkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">fkLoader</span>.<span style="color: #CC4747">loadWhiteUqFkRefByFkToPkId</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteUqFk whiteUqFk : <span style="color: #553000">whiteUqFkList</span>) {
     *     ... = whiteUqFk.<span style="color: #CC4747">getWhiteUqFkRefByFkToPkIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToPkId(ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        myBhv().loadWhiteUqFkRefByFkToPkId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteUqFkRefByFkToPkId = refLs);
        return hd -> hd.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToPkId, _selector));
    }

    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToUqCode;

    /**
     * Load referrer of whiteUqFkRefByFkToUqCodeList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteUqFkList</span>, <span style="color: #553000">fkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">fkLoader</span>.<span style="color: #CC4747">loadWhiteUqFkRefByFkToUqCode</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteUqFk whiteUqFk : <span style="color: #553000">whiteUqFkList</span>) {
     *     ... = whiteUqFk.<span style="color: #CC4747">getWhiteUqFkRefByFkToUqCodeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToUqCode(ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        myBhv().loadWhiteUqFkRefByFkToUqCode(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteUqFkRefByFkToUqCode = refLs);
        return hd -> hd.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToUqCode, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
