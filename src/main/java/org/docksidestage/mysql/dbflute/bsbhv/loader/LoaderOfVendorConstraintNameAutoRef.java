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
 * The referrer loader of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_CORGE_ID, CONSTRAINT_NAME_AUTO_UNIQUE
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
 *     vendor_constraint_name_auto_bar, vendor_constraint_name_auto_foo, vendor_constraint_name_auto_qux
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorConstraintNameAutoBar, vendorConstraintNameAutoFoo, vendorConstraintNameAutoQux
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorConstraintNameAutoRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorConstraintNameAutoRef> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorConstraintNameAutoRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorConstraintNameAutoRef ready(List<VendorConstraintNameAutoRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorConstraintNameAutoRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorConstraintNameAutoRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorConstraintNameAutoBar _foreignVendorConstraintNameAutoBarLoader;
    public LoaderOfVendorConstraintNameAutoBar pulloutVendorConstraintNameAutoBar() {
        if (_foreignVendorConstraintNameAutoBarLoader == null)
        { _foreignVendorConstraintNameAutoBarLoader = new LoaderOfVendorConstraintNameAutoBar().ready(myBhv().pulloutVendorConstraintNameAutoBar(_selectedList), _selector); }
        return _foreignVendorConstraintNameAutoBarLoader;
    }

    protected LoaderOfVendorConstraintNameAutoFoo _foreignVendorConstraintNameAutoFooLoader;
    public LoaderOfVendorConstraintNameAutoFoo pulloutVendorConstraintNameAutoFoo() {
        if (_foreignVendorConstraintNameAutoFooLoader == null)
        { _foreignVendorConstraintNameAutoFooLoader = new LoaderOfVendorConstraintNameAutoFoo().ready(myBhv().pulloutVendorConstraintNameAutoFoo(_selectedList), _selector); }
        return _foreignVendorConstraintNameAutoFooLoader;
    }

    protected LoaderOfVendorConstraintNameAutoQux _foreignVendorConstraintNameAutoQuxLoader;
    public LoaderOfVendorConstraintNameAutoQux pulloutVendorConstraintNameAutoQux() {
        if (_foreignVendorConstraintNameAutoQuxLoader == null)
        { _foreignVendorConstraintNameAutoQuxLoader = new LoaderOfVendorConstraintNameAutoQux().ready(myBhv().pulloutVendorConstraintNameAutoQux(_selectedList), _selector); }
        return _foreignVendorConstraintNameAutoQuxLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorConstraintNameAutoRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
