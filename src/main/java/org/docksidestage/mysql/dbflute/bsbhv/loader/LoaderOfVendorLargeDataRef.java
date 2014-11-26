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
 * The referrer loader of VENDOR_LARGE_DATA_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     LARGE_DATA_REF_ID
 *
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
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
 *     vendor_large_data, vendor_large_data_ref
 *
 * [referrer table]
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 *
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorLargeDataRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeDataRef> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeDataRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeDataRef ready(List<VendorLargeDataRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeDataRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeDataRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeDataRef> _referrerVendorLargeDataRefSelf;

    /**
     * Load referrer of vendorLargeDataRefSelfList by the set-upper of referrer. <br>
     * vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataRefBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendorLargeDataRefList</span>, <span style="color: #553000">refLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refLoader</span>.<span style="color: #CC4747">loadVendorLargeDataRefSelf</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (VendorLargeDataRef vendorLargeDataRef : <span style="color: #553000">vendorLargeDataRefList</span>) {
     *     ... = vendorLargeDataRef.<span style="color: #CC4747">getVendorLargeDataRefSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef> loadVendorLargeDataRefSelf(ConditionBeanSetupper<VendorLargeDataRefCB> refCBLambda) {
        myBhv().loadVendorLargeDataRefSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorLargeDataRefSelf = refLs);
        return hd -> hd.handle(new LoaderOfVendorLargeDataRef().ready(_referrerVendorLargeDataRefSelf, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorLargeData _foreignVendorLargeDataLoader;
    public LoaderOfVendorLargeData pulloutVendorLargeData() {
        if (_foreignVendorLargeDataLoader == null)
        { _foreignVendorLargeDataLoader = new LoaderOfVendorLargeData().ready(myBhv().pulloutVendorLargeData(_selectedList), _selector); }
        return _foreignVendorLargeDataLoader;
    }

    protected LoaderOfVendorLargeDataRef _foreignVendorLargeDataRefSelfLoader;
    public LoaderOfVendorLargeDataRef pulloutVendorLargeDataRefSelf() {
        if (_foreignVendorLargeDataRefSelfLoader == null)
        { _foreignVendorLargeDataRefSelfLoader = new LoaderOfVendorLargeDataRef().ready(myBhv().pulloutVendorLargeDataRefSelf(_selectedList), _selector); }
        return _foreignVendorLargeDataRefSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeDataRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
