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

import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.ImmuProductCategoryCQ;

/**
 * The nest select set-upper of product_category.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuProductCategoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ImmuProductCategoryCQ _query;
    public ImmuProductCategoryNss(ImmuProductCategoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ImmuProductCategoryNss withProductCategorySelf() {
        _query.xdoNss(() -> _query.queryProductCategorySelf());
        return new ImmuProductCategoryNss(_query.queryProductCategorySelf());
    }
}