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

import org.docksidestage.mysql.dbflute.cbean.cq.PurchaseCQ;

/**
 * The nest select set-upper of purchase.
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PurchaseCQ _query;
    public PurchaseNss(PurchaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductNss withProduct() {
        _query.xdoNss(() -> _query.queryProduct());
        return new ProductNss(_query.queryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (VIEW)SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SummaryProductNss withSummaryProduct() {
        _query.xdoNss(() -> _query.querySummaryProduct());
        return new SummaryProductNss(_query.querySummaryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (VIEW)SUMMARY_WITHDRAWAL by my MEMBER_ID, named 'summaryWithdrawal'.
     */
    public void withSummaryWithdrawal() {
        _query.xdoNss(() -> _query.querySummaryWithdrawal());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (VIEW)WHITE_NO_PK_RELATION by my PRODUCT_ID, named 'whiteNoPkRelation'.
     */
    public void withWhiteNoPkRelation() {
        _query.xdoNss(() -> _query.queryWhiteNoPkRelation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchaseSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchaseSelf() {
        _query.xdoNss(() -> _query.queryPurchaseSelf());
        return new PurchaseNss(_query.queryPurchaseSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsSkipRelation(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsSkipRelation(targetDate));
        return new MemberAddressNss(_query.queryMemberAddressAsSkipRelation(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhitePurchaseReferrerNss withWhitePurchaseReferrerAsOne() {
        _query.xdoNss(() -> _query.queryWhitePurchaseReferrerAsOne());
        return new WhitePurchaseReferrerNss(_query.queryWhitePurchaseReferrerAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchaseSelfAsOne() {
        _query.xdoNss(() -> _query.queryPurchaseSelfAsOne());
        return new PurchaseNss(_query.queryPurchaseSelfAsOne());
    }
}
