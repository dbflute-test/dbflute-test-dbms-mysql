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
package org.docksidestage.mysql.dbflute.immuhama.cbean.nss;

import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.ImmuProductDetailCQ;

/**
 * The nest select set-upper of product_detail.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuProductDetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ImmuProductDetailCQ _query;
    public ImmuProductDetailNss(ImmuProductDetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'cdefProductCategory'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ImmuCdefProductCategoryNss withCdefProductCategory() {
        _query.xdoNss(() -> _query.queryCdefProductCategory());
        return new ImmuCdefProductCategoryNss(_query.queryCdefProductCategory());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     */
    public void withProduct() {
        _query.xdoNss(() -> _query.queryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]商品ステータス)CDEF_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'cdefProductStatus'.
     */
    public void withCdefProductStatus() {
        _query.xdoNss(() -> _query.queryCdefProductStatus());
    }
}
