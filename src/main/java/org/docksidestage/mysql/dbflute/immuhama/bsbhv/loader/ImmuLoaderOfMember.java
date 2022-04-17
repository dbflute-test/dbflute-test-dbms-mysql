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
package org.docksidestage.mysql.dbflute.immuhama.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;

/**
 * The referrer loader of (会員)MEMBER as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_REGISTER_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_FOLLOWING, MEMBER_LOGIN, MEMBER_LOGIN_PASSWORD, MEMBER_PASSWORD_REMINDER, MEMBER_PROFILE, MEMBER_STATUS, PURCHASE, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, memberLoginList, memberLoginPasswordList, memberPasswordReminderList, memberProfileList, memberStatusList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuMember> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfMember ready(List<ImmuMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuMemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuMemberAddress> _referrerMemberAddress;

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * (会員住所)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberAddress</span>(<span style="color: #553000">addressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">addressCB</span>.setupSelect...
     *         <span style="color: #553000">addressCB</span>.query().set...
     *         <span style="color: #553000">addressCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">addressLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    addressLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberAddress> loadMemberAddress(ReferrerConditionSetupper<ImmuMemberAddressCB> refCBLambda) {
        myBhv().loadMemberAddress(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberAddress = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberAddress().ready(_referrerMemberAddress, _selector));
    }

    protected List<ImmuMemberFollowing> _referrerMemberFollowingByMyMemberId;

    /**
     * Load referrer of memberFollowingByMyMemberIdList by the set-upper of referrer. <br>
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberFollowingByMyMemberId</span>(<span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followingCB</span>.setupSelect...
     *         <span style="color: #553000">followingCB</span>.query().set...
     *         <span style="color: #553000">followingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberFollowingByMyMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyMemberId_InScope(pkList);
     * cb.query().addOrderBy_MyMemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberFollowing> loadMemberFollowingByMyMemberId(ReferrerConditionSetupper<ImmuMemberFollowingCB> refCBLambda) {
        myBhv().loadMemberFollowingByMyMemberId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberFollowingByMyMemberId = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberFollowing().ready(_referrerMemberFollowingByMyMemberId, _selector));
    }

    protected List<ImmuMemberFollowing> _referrerMemberFollowingByYourMemberId;

    /**
     * Load referrer of memberFollowingByYourMemberIdList by the set-upper of referrer. <br>
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberFollowingByYourMemberId</span>(<span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followingCB</span>.setupSelect...
     *         <span style="color: #553000">followingCB</span>.query().set...
     *         <span style="color: #553000">followingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberFollowingByYourMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setYourMemberId_InScope(pkList);
     * cb.query().addOrderBy_YourMemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberFollowing> loadMemberFollowingByYourMemberId(ReferrerConditionSetupper<ImmuMemberFollowingCB> refCBLambda) {
        myBhv().loadMemberFollowingByYourMemberId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberFollowingByYourMemberId = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberFollowing().ready(_referrerMemberFollowingByYourMemberId, _selector));
    }

    protected List<ImmuMemberLogin> _referrerMemberLogin;

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberLogin> loadMemberLogin(ReferrerConditionSetupper<ImmuMemberLoginCB> refCBLambda) {
        myBhv().loadMemberLogin(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberLogin = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberLogin().ready(_referrerMemberLogin, _selector));
    }

    protected List<ImmuMemberLoginPassword> _referrerMemberLoginPassword;

    /**
     * Load referrer of memberLoginPasswordList by the set-upper of referrer. <br>
     * (会員ログインパスワード)MEMBER_LOGIN_PASSWORD by MEMBER_ID, named 'memberLoginPasswordList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberLoginPassword</span>(<span style="color: #553000">passwordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">passwordCB</span>.setupSelect...
     *         <span style="color: #553000">passwordCB</span>.query().set...
     *         <span style="color: #553000">passwordCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">passwordLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    passwordLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberLoginPasswordList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberLoginPassword> loadMemberLoginPassword(ReferrerConditionSetupper<ImmuMemberLoginPasswordCB> refCBLambda) {
        myBhv().loadMemberLoginPassword(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberLoginPassword = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberLoginPassword().ready(_referrerMemberLoginPassword, _selector));
    }

    protected List<ImmuMemberPasswordReminder> _referrerMemberPasswordReminder;

    /**
     * Load referrer of memberPasswordReminderList by the set-upper of referrer. <br>
     * (会員パスワードリマインダ)MEMBER_PASSWORD_REMINDER by MEMBER_ID, named 'memberPasswordReminderList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberPasswordReminder</span>(<span style="color: #553000">reminderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">reminderCB</span>.setupSelect...
     *         <span style="color: #553000">reminderCB</span>.query().set...
     *         <span style="color: #553000">reminderCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">reminderLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    reminderLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberPasswordReminderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberPasswordReminder> loadMemberPasswordReminder(ReferrerConditionSetupper<ImmuMemberPasswordReminderCB> refCBLambda) {
        myBhv().loadMemberPasswordReminder(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberPasswordReminder = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberPasswordReminder().ready(_referrerMemberPasswordReminder, _selector));
    }

    protected List<ImmuMemberProfile> _referrerMemberProfile;

    /**
     * Load referrer of memberProfileList by the set-upper of referrer. <br>
     * (会員プロフィール)MEMBER_PROFILE by MEMBER_ID, named 'memberProfileList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberProfile</span>(<span style="color: #553000">profileCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">profileCB</span>.setupSelect...
     *         <span style="color: #553000">profileCB</span>.query().set...
     *         <span style="color: #553000">profileCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">profileLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    profileLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberProfileList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberProfile> loadMemberProfile(ReferrerConditionSetupper<ImmuMemberProfileCB> refCBLambda) {
        myBhv().loadMemberProfile(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberProfile = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberProfile().ready(_referrerMemberProfile, _selector));
    }

    protected List<ImmuMemberStatus> _referrerMemberStatus;

    /**
     * Load referrer of memberStatusList by the set-upper of referrer. <br>
     * (会員ステータス)MEMBER_STATUS by MEMBER_ID, named 'memberStatusList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadMemberStatus</span>(<span style="color: #553000">statusCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">statusCB</span>.setupSelect...
     *         <span style="color: #553000">statusCB</span>.query().set...
     *         <span style="color: #553000">statusCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">statusLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    statusLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberStatusList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberStatus> loadMemberStatus(ReferrerConditionSetupper<ImmuMemberStatusCB> refCBLambda) {
        myBhv().loadMemberStatus(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberStatus = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberStatus().ready(_referrerMemberStatus, _selector));
    }

    protected List<ImmuPurchase> _referrerPurchase;

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">purchaseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfPurchase> loadPurchase(ReferrerConditionSetupper<ImmuPurchaseCB> refCBLambda) {
        myBhv().loadPurchase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchase = refLs);
        return hd -> hd.handle(new ImmuLoaderOfPurchase().ready(_referrerPurchase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfMemberService _foreignMemberServiceAsOneLoader;
    public ImmuLoaderOfMemberService pulloutMemberServiceAsOne() {
        if (_foreignMemberServiceAsOneLoader == null)
        { _foreignMemberServiceAsOneLoader = new ImmuLoaderOfMemberService().ready(myBhv().pulloutMemberServiceAsOne(_selectedList), _selector); }
        return _foreignMemberServiceAsOneLoader;
    }

    protected ImmuLoaderOfMemberWithdrawal _foreignMemberWithdrawalAsOneLoader;
    public ImmuLoaderOfMemberWithdrawal pulloutMemberWithdrawalAsOne() {
        if (_foreignMemberWithdrawalAsOneLoader == null)
        { _foreignMemberWithdrawalAsOneLoader = new ImmuLoaderOfMemberWithdrawal().ready(myBhv().pulloutMemberWithdrawalAsOne(_selectedList), _selector); }
        return _foreignMemberWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
