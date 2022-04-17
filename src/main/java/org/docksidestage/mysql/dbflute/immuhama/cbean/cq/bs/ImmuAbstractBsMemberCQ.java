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
package org.docksidestage.mysql.dbflute.immuhama.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.*;

/**
 * The abstract condition-query of member.
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuAbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuAbstractBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return ImmuDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "member";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberId The value of memberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberIdList The collection of memberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from member_address where ...)} <br>
     * (会員住所)member_address by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberAddress</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddress(SubQuery<ImmuMemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MY_MEMBER_ID from member_following where ...)} <br>
     * (会員フォローイング)member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberFollowingByMyMemberId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberFollowingByMyMemberIdList for 'exists'. (NotNull)
     */
    public void existsMemberFollowingByMyMemberId(SubQuery<ImmuMemberFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select YOUR_MEMBER_ID from member_following where ...)} <br>
     * (会員フォローイング)member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberFollowingByYourMemberId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberFollowingByYourMemberIdList for 'exists'. (NotNull)
     */
    public void existsMemberFollowingByYourMemberId(SubQuery<ImmuMemberFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from member_login where ...)} <br>
     * (会員ログイン)member_login by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberLoginList for 'exists'. (NotNull)
     */
    public void existsMemberLogin(SubQuery<ImmuMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberLoginCB cb = new ImmuMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberLoginList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberLoginList(ImmuMemberLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from member_login_password where ...)} <br>
     * (会員ログインパスワード)member_login_password by MEMBER_ID, named 'memberLoginPasswordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberLoginPassword</span>(passwordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     passwordCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberLoginPasswordList for 'exists'. (NotNull)
     */
    public void existsMemberLoginPassword(SubQuery<ImmuMemberLoginPasswordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberLoginPasswordCB cb = new ImmuMemberLoginPasswordCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberLoginPasswordList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginPasswordList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberLoginPasswordList(ImmuMemberLoginPasswordCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from member_password_reminder where ...)} <br>
     * (会員パスワードリマインダ)member_password_reminder by MEMBER_ID, named 'memberPasswordReminderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberPasswordReminder</span>(reminderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reminderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberPasswordReminderList for 'exists'. (NotNull)
     */
    public void existsMemberPasswordReminder(SubQuery<ImmuMemberPasswordReminderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberPasswordReminderCB cb = new ImmuMemberPasswordReminderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberPasswordReminderList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberPasswordReminderList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberPasswordReminderList(ImmuMemberPasswordReminderCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from member_profile where ...)} <br>
     * (会員プロフィール)member_profile by MEMBER_ID, named 'memberProfileAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberProfile</span>(profileCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     profileCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberProfileList for 'exists'. (NotNull)
     */
    public void existsMemberProfile(SubQuery<ImmuMemberProfileCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberProfileCB cb = new ImmuMemberProfileCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberProfileList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberProfileList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberProfileList(ImmuMemberProfileCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from member_status where ...)} <br>
     * (会員ステータス)member_status by MEMBER_ID, named 'memberStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberStatus</span>(statusCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statusCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusList for 'exists'. (NotNull)
     */
    public void existsMemberStatus(SubQuery<ImmuMemberStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberStatusCB cb = new ImmuMemberStatusCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_MemberStatusList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberStatusList");
    }
    public abstract String keepMemberId_ExistsReferrer_MemberStatusList(ImmuMemberStatusCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from purchase where ...)} <br>
     * (購入)purchase by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPurchase</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PurchaseList for 'exists'. (NotNull)
     */
    public void existsPurchase(SubQuery<ImmuPurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuPurchaseCB cb = new ImmuPurchaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_PurchaseList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    public abstract String keepMemberId_ExistsReferrer_PurchaseList(ImmuPurchaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from member_address where ...)} <br>
     * (会員住所)member_address by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberAddress</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddress(SubQuery<ImmuMemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MY_MEMBER_ID from member_following where ...)} <br>
     * (会員フォローイング)member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberFollowingByMyMemberId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsMemberFollowingByMyMemberId(SubQuery<ImmuMemberFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select YOUR_MEMBER_ID from member_following where ...)} <br>
     * (会員フォローイング)member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberFollowingByYourMemberId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsMemberFollowingByYourMemberId(SubQuery<ImmuMemberFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from member_login where ...)} <br>
     * (会員ログイン)member_login by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMemberLogin(SubQuery<ImmuMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberLoginCB cb = new ImmuMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberLoginList(ImmuMemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from member_login_password where ...)} <br>
     * (会員ログインパスワード)member_login_password by MEMBER_ID, named 'memberLoginPasswordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberLoginPassword</span>(passwordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     passwordCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberLoginPasswordList for 'not exists'. (NotNull)
     */
    public void notExistsMemberLoginPassword(SubQuery<ImmuMemberLoginPasswordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberLoginPasswordCB cb = new ImmuMemberLoginPasswordCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberLoginPasswordList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginPasswordList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberLoginPasswordList(ImmuMemberLoginPasswordCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from member_password_reminder where ...)} <br>
     * (会員パスワードリマインダ)member_password_reminder by MEMBER_ID, named 'memberPasswordReminderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberPasswordReminder</span>(reminderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reminderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberPasswordReminderList for 'not exists'. (NotNull)
     */
    public void notExistsMemberPasswordReminder(SubQuery<ImmuMemberPasswordReminderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberPasswordReminderCB cb = new ImmuMemberPasswordReminderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberPasswordReminderList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberPasswordReminderList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberPasswordReminderList(ImmuMemberPasswordReminderCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from member_profile where ...)} <br>
     * (会員プロフィール)member_profile by MEMBER_ID, named 'memberProfileAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberProfile</span>(profileCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     profileCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberProfileList for 'not exists'. (NotNull)
     */
    public void notExistsMemberProfile(SubQuery<ImmuMemberProfileCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberProfileCB cb = new ImmuMemberProfileCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberProfileList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberProfileList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberProfileList(ImmuMemberProfileCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from member_status where ...)} <br>
     * (会員ステータス)member_status by MEMBER_ID, named 'memberStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberStatus</span>(statusCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statusCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_MemberStatusList for 'not exists'. (NotNull)
     */
    public void notExistsMemberStatus(SubQuery<ImmuMemberStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberStatusCB cb = new ImmuMemberStatusCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_MemberStatusList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberStatusList");
    }
    public abstract String keepMemberId_NotExistsReferrer_MemberStatusList(ImmuMemberStatusCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from purchase where ...)} <br>
     * (購入)purchase by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPurchase</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_PurchaseList for 'not exists'. (NotNull)
     */
    public void notExistsPurchase(SubQuery<ImmuPurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuPurchaseCB cb = new ImmuPurchaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_PurchaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    public abstract String keepMemberId_NotExistsReferrer_PurchaseList(ImmuPurchaseCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<ImmuMemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq);

    public void xsderiveMemberFollowingByMyMemberIdList(String fn, SubQuery<ImmuMemberFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq);

    public void xsderiveMemberFollowingByYourMemberIdList(String fn, SubQuery<ImmuMemberFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq);

    public void xsderiveMemberLoginList(String fn, SubQuery<ImmuMemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberLoginCB cb = new ImmuMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(ImmuMemberLoginCQ sq);

    public void xsderiveMemberLoginPasswordList(String fn, SubQuery<ImmuMemberLoginPasswordCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberLoginPasswordCB cb = new ImmuMemberLoginPasswordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberLoginPasswordList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginPasswordList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberLoginPasswordList(ImmuMemberLoginPasswordCQ sq);

    public void xsderiveMemberPasswordReminderList(String fn, SubQuery<ImmuMemberPasswordReminderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberPasswordReminderCB cb = new ImmuMemberPasswordReminderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberPasswordReminderList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberPasswordReminderList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberPasswordReminderList(ImmuMemberPasswordReminderCQ sq);

    public void xsderiveMemberProfileList(String fn, SubQuery<ImmuMemberProfileCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberProfileCB cb = new ImmuMemberProfileCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberProfileList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberProfileList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberProfileList(ImmuMemberProfileCQ sq);

    public void xsderiveMemberStatusList(String fn, SubQuery<ImmuMemberStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberStatusCB cb = new ImmuMemberStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_MemberStatusList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberStatusList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_MemberStatusList(ImmuMemberStatusCQ sq);

    public void xsderivePurchaseList(String fn, SubQuery<ImmuPurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuPurchaseCB cb = new ImmuPurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_PurchaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_address where ...)} <br>
     * (会員住所)member_address by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberAddress()</span>.<span style="color: #CC4747">max</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     addressCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberAddressCB> derivedMemberAddress() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<ImmuMemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberAddressList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<ImmuMemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberAddressList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_following where ...)} <br>
     * (会員フォローイング)member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberFollowingByMyMemberId()</span>.<span style="color: #CC4747">max</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberFollowingCB> derivedMemberFollowingByMyMemberId() {
        return xcreateQDRFunctionMemberFollowingByMyMemberIdList();
    }
    protected HpQDRFunction<ImmuMemberFollowingCB> xcreateQDRFunctionMemberFollowingByMyMemberIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberFollowingByMyMemberIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberFollowingByMyMemberIdList(String fn, SubQuery<ImmuMemberFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MY_MEMBER_ID", sqpp, "memberFollowingByMyMemberIdList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(ImmuMemberFollowingCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_following where ...)} <br>
     * (会員フォローイング)member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberFollowingByYourMemberId()</span>.<span style="color: #CC4747">max</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberFollowingCB> derivedMemberFollowingByYourMemberId() {
        return xcreateQDRFunctionMemberFollowingByYourMemberIdList();
    }
    protected HpQDRFunction<ImmuMemberFollowingCB> xcreateQDRFunctionMemberFollowingByYourMemberIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberFollowingByYourMemberIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberFollowingByYourMemberIdList(String fn, SubQuery<ImmuMemberFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberFollowingCB cb = new ImmuMemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", sqpp, "memberFollowingByYourMemberIdList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(ImmuMemberFollowingCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_login where ...)} <br>
     * (会員ログイン)member_login by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberLogin()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loginCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberLoginCB> derivedMemberLogin() {
        return xcreateQDRFunctionMemberLoginList();
    }
    protected HpQDRFunction<ImmuMemberLoginCB> xcreateQDRFunctionMemberLoginList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberLoginList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberLoginList(String fn, SubQuery<ImmuMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberLoginCB cb = new ImmuMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberLoginList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginList(ImmuMemberLoginCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_login_password where ...)} <br>
     * (会員ログインパスワード)member_login_password by MEMBER_ID, named 'memberLoginPasswordAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberLoginPassword()</span>.<span style="color: #CC4747">max</span>(passwordCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     passwordCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     passwordCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberLoginPasswordCB> derivedMemberLoginPassword() {
        return xcreateQDRFunctionMemberLoginPasswordList();
    }
    protected HpQDRFunction<ImmuMemberLoginPasswordCB> xcreateQDRFunctionMemberLoginPasswordList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberLoginPasswordList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberLoginPasswordList(String fn, SubQuery<ImmuMemberLoginPasswordCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberLoginPasswordCB cb = new ImmuMemberLoginPasswordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberLoginPasswordList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberLoginPasswordListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberLoginPasswordList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginPasswordList(ImmuMemberLoginPasswordCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberLoginPasswordListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_password_reminder where ...)} <br>
     * (会員パスワードリマインダ)member_password_reminder by MEMBER_ID, named 'memberPasswordReminderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberPasswordReminder()</span>.<span style="color: #CC4747">max</span>(reminderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     reminderCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     reminderCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberPasswordReminderCB> derivedMemberPasswordReminder() {
        return xcreateQDRFunctionMemberPasswordReminderList();
    }
    protected HpQDRFunction<ImmuMemberPasswordReminderCB> xcreateQDRFunctionMemberPasswordReminderList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberPasswordReminderList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberPasswordReminderList(String fn, SubQuery<ImmuMemberPasswordReminderCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberPasswordReminderCB cb = new ImmuMemberPasswordReminderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberPasswordReminderList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberPasswordReminderListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberPasswordReminderList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberPasswordReminderList(ImmuMemberPasswordReminderCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberPasswordReminderListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_profile where ...)} <br>
     * (会員プロフィール)member_profile by MEMBER_ID, named 'memberProfileAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberProfile()</span>.<span style="color: #CC4747">max</span>(profileCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     profileCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     profileCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberProfileCB> derivedMemberProfile() {
        return xcreateQDRFunctionMemberProfileList();
    }
    protected HpQDRFunction<ImmuMemberProfileCB> xcreateQDRFunctionMemberProfileList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberProfileList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberProfileList(String fn, SubQuery<ImmuMemberProfileCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberProfileCB cb = new ImmuMemberProfileCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberProfileList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberProfileListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberProfileList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberProfileList(ImmuMemberProfileCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberProfileListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_status where ...)} <br>
     * (会員ステータス)member_status by MEMBER_ID, named 'memberStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberStatus()</span>.<span style="color: #CC4747">max</span>(statusCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statusCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     statusCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberStatusCB> derivedMemberStatus() {
        return xcreateQDRFunctionMemberStatusList();
    }
    protected HpQDRFunction<ImmuMemberStatusCB> xcreateQDRFunctionMemberStatusList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberStatusList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberStatusList(String fn, SubQuery<ImmuMemberStatusCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberStatusCB cb = new ImmuMemberStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_MemberStatusList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_MemberStatusListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberStatusList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_MemberStatusList(ImmuMemberStatusCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_MemberStatusListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from purchase where ...)} <br>
     * (購入)purchase by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPurchase()</span>.<span style="color: #CC4747">max</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     purchaseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuPurchaseCB> derivedPurchase() {
        return xcreateQDRFunctionPurchaseList();
    }
    protected HpQDRFunction<ImmuPurchaseCB> xcreateQDRFunctionPurchaseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePurchaseList(fn, sq, rd, vl, op));
    }
    public void xqderivePurchaseList(String fn, SubQuery<ImmuPurchaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuPurchaseCB cb = new ImmuPurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_PurchaseList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_PurchaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "purchaseList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseList(ImmuPurchaseCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_Equal(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_EQ,  memberRegisterDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_GreaterThan(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_GT,  memberRegisterDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_LessThan(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_LT,  memberRegisterDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_GreaterEqual(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_GE,  memberRegisterDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param memberRegisterDatetime The value of memberRegisterDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberRegisterDatetime_LessEqual(java.time.LocalDateTime memberRegisterDatetime) {
        regMemberRegisterDatetime(CK_LE, memberRegisterDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setMemberRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setMemberRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setMemberRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員登録日時)MEMBER_REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setMemberRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of memberRegisterDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setMemberRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "MEMBER_REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueMemberRegisterDatetime(), nm, op);
    }

    protected void regMemberRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberRegisterDatetime(), "MEMBER_REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueMemberRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUserList The collection of registerUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUserList The collection of registerUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUserList The collection of updateUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUserList The collection of updateUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuMemberCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ImmuMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuMemberCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ImmuMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuMemberCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ImmuMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuMemberCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ImmuMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuMemberCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ImmuMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImmuMemberCB&gt;() {
     *     public void query(ImmuMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuMemberCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ImmuMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ImmuMemberCQ sq);

    protected ImmuMemberCB xcreateScalarConditionCB() {
        ImmuMemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ImmuMemberCB xcreateScalarConditionPartitionByCB() {
        ImmuMemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ImmuMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberCB cb = new ImmuMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ImmuMemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ImmuMemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberCB cb = new ImmuMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ImmuMemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ImmuMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberCB cb = new ImmuMemberCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ImmuMemberCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ImmuMemberCB newMyCB() {
        return new ImmuMemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ImmuMemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
