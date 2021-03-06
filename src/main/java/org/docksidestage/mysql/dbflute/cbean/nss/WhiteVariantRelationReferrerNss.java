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

import org.docksidestage.mysql.dbflute.cbean.cq.WhiteVariantRelationReferrerCQ;

/**
 * The nest select set-upper of white_variant_relation_referrer.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationReferrerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteVariantRelationReferrerCQ _query;
    public WhiteVariantRelationReferrerNss(WhiteVariantRelationReferrerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_VARIANT_RELATION_MASTER_FOO by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteVariantRelationMasterFooNss withWhiteVariantRelationMasterFooAsVariant() {
        _query.xdoNss(() -> _query.queryWhiteVariantRelationMasterFooAsVariant());
        return new WhiteVariantRelationMasterFooNss(_query.queryWhiteVariantRelationMasterFooAsVariant());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_VARIANT_RELATION_MASTER_BAR by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     */
    public void withWhiteVariantRelationMasterBarAsVariant() {
        _query.xdoNss(() -> _query.queryWhiteVariantRelationMasterBarAsVariant());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_VARIANT_RELATION_MASTER_QUX by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     */
    public void withWhiteVariantRelationMasterQuxAsVariantByQue() {
        _query.xdoNss(() -> _query.queryWhiteVariantRelationMasterQuxAsVariantByQue());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_VARIANT_RELATION_MASTER_CORGE by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @param quxType The bind parameter of fixed condition for quxType. (NotNull)
     */
    public void withWhiteVariantRelationMasterCorgeAsVariantByQuxType(final org.docksidestage.mysql.dbflute.allcommon.CDef.VariantRelationQuxType quxType) {
        _query.xdoNss(() -> _query.queryWhiteVariantRelationMasterCorgeAsVariantByQuxType(quxType));
    }
}
