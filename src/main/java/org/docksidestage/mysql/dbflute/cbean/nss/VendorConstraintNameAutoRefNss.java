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
package org.docksidestage.mysql.dbflute.cbean.nss;

import org.dbflute.cbean.ConditionQuery;
import org.docksidestage.mysql.dbflute.cbean.cq.VendorConstraintNameAutoRefCQ;

/**
 * The nest select set-upper of vendor_constraint_name_auto_ref.
 * @author DBFlute(AutoGenerator)
 */
public class VendorConstraintNameAutoRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorConstraintNameAutoRefCQ _query;
    public VendorConstraintNameAutoRefNss(VendorConstraintNameAutoRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     */
    public void withVendorConstraintNameAutoBar() {
        _query.xdoNss(new VendorConstraintNameAutoRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorConstraintNameAutoBar(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     */
    public void withVendorConstraintNameAutoFoo() {
        _query.xdoNss(new VendorConstraintNameAutoRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorConstraintNameAutoFoo(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     */
    public void withVendorConstraintNameAutoQux() {
        _query.xdoNss(new VendorConstraintNameAutoRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorConstraintNameAutoQux(); }});
    }
}
