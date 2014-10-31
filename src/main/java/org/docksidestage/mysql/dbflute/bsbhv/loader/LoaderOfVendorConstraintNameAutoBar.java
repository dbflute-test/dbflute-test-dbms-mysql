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
 * The referrer loader of VENDOR_CONSTRAINT_NAME_AUTO_BAR as TABLE. <br>
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_BAR_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_BAR_NAME
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
 *     vendor_constraint_name_auto_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorConstraintNameAutoBar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorConstraintNameAutoBar> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorConstraintNameAutoBarBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorConstraintNameAutoBar ready(List<VendorConstraintNameAutoBar> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorConstraintNameAutoBarBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorConstraintNameAutoBarBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorConstraintNameAutoRef> _referrerVendorConstraintNameAutoRefList;

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br>
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * <span style="color: #0000C0">vendorConstraintNameAutoBarBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendorConstraintNameAutoBarList</span>, <span style="color: #553000">barLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">barLoader</span>.<span style="color: #CC4747">loadVendorConstraintNameAutoRefList</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (VendorConstraintNameAutoBar vendorConstraintNameAutoBar : <span style="color: #553000">vendorConstraintNameAutoBarList</span>) {
     *     ... = vendorConstraintNameAutoBar.<span style="color: #CC4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoBarId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoBarId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(ConditionBeanSetupper<VendorConstraintNameAutoRefCB> refCBLambda) {
        myBhv().loadVendorConstraintNameAutoRefList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorConstraintNameAutoRefList = refLs);
        return hd -> hd.handle(new LoaderOfVendorConstraintNameAutoRef().ready(_referrerVendorConstraintNameAutoRefList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorConstraintNameAutoBar> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
