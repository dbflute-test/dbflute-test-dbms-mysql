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

import org.docksidestage.mysql.dbflute.cbean.cq.WhiteOnlyOneToOneToCQ;

/**
 * The nest select set-upper of white_only_one_to_one_to.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOnlyOneToOneToNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteOnlyOneToOneToCQ _query;
    public WhiteOnlyOneToOneToNss(WhiteOnlyOneToOneToCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_ONLY_ONE_TO_ONE_FROM by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteOnlyOneToOneFromNss withWhiteOnlyOneToOneFrom() {
        _query.xdoNss(() -> _query.queryWhiteOnlyOneToOneFrom());
        return new WhiteOnlyOneToOneFromNss(_query.queryWhiteOnlyOneToOneFrom());
    }
}
