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

import org.docksidestage.mysql.dbflute.cbean.cq.VendorLargeDataRefCQ;

/**
 * The nest select set-upper of vendor_large_data_ref.
 * @author DBFlute(AutoGenerator)
 */
public class VendorLargeDataRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final VendorLargeDataRefCQ _query;
    public VendorLargeDataRefNss(VendorLargeDataRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     */
    public void withVendorLargeData() {
        _query.xdoNss(() -> _query.queryVendorLargeData());
    }
    /**
     * With nested relation columns to select clause. <br>
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorLargeDataRefNss withVendorLargeDataRefSelf() {
        _query.xdoNss(() -> _query.queryVendorLargeDataRefSelf());
        return new VendorLargeDataRefNss(_query.queryVendorLargeDataRefSelf());
    }
}
