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

import org.docksidestage.mysql.dbflute.cbean.cq.WhiteImplicitReverseFkCQ;

/**
 * The nest select set-upper of white_implicit_reverse_fk.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitReverseFkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteImplicitReverseFkCQ _query;
    public WhiteImplicitReverseFkNss(WhiteImplicitReverseFkCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_IMPLICIT_REVERSE_FK_REF by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     */
    public void withWhiteImplicitReverseFkRefWithImplicitReverseFK(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryWhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     */
    public void withWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate));
    }
}
