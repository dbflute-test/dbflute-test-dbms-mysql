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

import org.docksidestage.mysql.dbflute.cbean.cq.MemberCQ;

/**
 * The nest select set-upper of member.
 * @author DBFlute(AutoGenerator)
 */
public class MemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MemberCQ _query;
    public MemberNss(MemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsValid(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsValid(targetDate));
        return new MemberAddressNss(_query.queryMemberAddressAsValid(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsValidBefore(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsValidBefore(targetDate));
        return new MemberAddressNss(_query.queryMemberAddressAsValidBefore(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLoginStatus(final org.docksidestage.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
        _query.xdoNss(() -> _query.queryMemberLoginAsLoginStatus(statusCode));
        return new MemberLoginNss(_query.queryMemberLoginAsLoginStatus(statusCode));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatusFixedCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLoginStatusFixedCls() {
        _query.xdoNss(() -> _query.queryMemberLoginAsLoginStatusFixedCls());
        return new MemberLoginNss(_query.queryMemberLoginAsLoginStatusFixedCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatusFixedClsGrouping'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLoginStatusFixedClsGrouping() {
        _query.xdoNss(() -> _query.queryMemberLoginAsLoginStatusFixedClsGrouping());
        return new MemberLoginNss(_query.queryMemberLoginAsLoginStatusFixedClsGrouping());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
     * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsIfComment(final java.time.LocalDate targetDate, final org.docksidestage.mysql.dbflute.allcommon.CDef.Region region) {
        _query.xdoNss(() -> _query.queryMemberAddressAsIfComment(targetDate, region));
        return new MemberAddressNss(_query.queryMemberAddressAsIfComment(targetDate, region));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsOnlyOneDate(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsOnlyOneDate(targetDate));
        return new MemberAddressNss(_query.queryMemberAddressAsOnlyOneDate(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     * @deprecated the test of dep
     */
    @SuppressWarnings("deprecation")
    public MemberLoginNss withMemberLoginAsLocalBindOverTest(final Integer displayOrder) {
        _query.xdoNss(() -> _query.queryMemberLoginAsLocalBindOverTest(displayOrder));
        return new MemberLoginNss(_query.queryMemberLoginAsLocalBindOverTest(displayOrder));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLocalForeignOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsLocalForeignOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsLocalForeignOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignBindOverTest(final Integer displayOrder) {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignBindOverTest(displayOrder));
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignBindOverTest(displayOrder));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignEachOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignEachOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignEachOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignOptimizedBasicOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedBasicOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignOptimizedMarkOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedMarkOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedPartOverTest(final Integer displayOrder, final String memberName) {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName));
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedPartOverTest(displayOrder, memberName));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @param displayOrder The bind parameter of fixed condition for displayOrder. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignOptimizedWholeOverTest(final Integer displayOrder) {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder));
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignOptimizedWholeOverTest(displayOrder));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignParameterOverTest(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignParameterOverTest(targetDate));
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignParameterOverTest(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsForeignForeignVariousOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsForeignForeignVariousOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsForeignForeignVariousOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsReferrerOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsReferrerOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsReferrerOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsReferrerForeignOverTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsReferrerForeignOverTest());
        return new MemberLoginNss(_query.queryMemberLoginAsReferrerForeignOverTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsLatest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsLatest());
        return new MemberLoginNss(_query.queryMemberLoginAsLatest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsOldest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsOldest());
        return new MemberLoginNss(_query.queryMemberLoginAsOldest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsFormattedBasic(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsFormattedBasic(targetDate));
        return new MemberAddressNss(_query.queryMemberAddressAsFormattedBasic(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberAddressNss withMemberAddressAsFormattedLong(final java.time.LocalDate targetDate) {
        _query.xdoNss(() -> _query.queryMemberAddressAsFormattedLong(targetDate));
        return new MemberAddressNss(_query.queryMemberAddressAsFormattedLong(targetDate));
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsFormattedMany() {
        _query.xdoNss(() -> _query.queryMemberLoginAsFormattedMany());
        return new MemberLoginNss(_query.queryMemberLoginAsFormattedMany());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsEmbeddedCommentClassificationTest() {
        _query.xdoNss(() -> _query.queryMemberLoginAsEmbeddedCommentClassificationTest());
        return new MemberLoginNss(_query.queryMemberLoginAsEmbeddedCommentClassificationTest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberSecurityNss withMemberSecurityAsOne() {
        _query.xdoNss(() -> _query.queryMemberSecurityAsOne());
        return new MemberSecurityNss(_query.queryMemberSecurityAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberServiceNss withMemberServiceAsOne() {
        _query.xdoNss(() -> _query.queryMemberServiceAsOne());
        return new MemberServiceNss(_query.queryMemberServiceAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberWithdrawalNss withMemberWithdrawalAsOne() {
        _query.xdoNss(() -> _query.queryMemberWithdrawalAsOne());
        return new MemberWithdrawalNss(_query.queryMemberWithdrawalAsOne());
    }
}
