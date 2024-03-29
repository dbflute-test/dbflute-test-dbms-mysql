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
package org.docksidestage.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.exentity.*;
import org.docksidestage.mysql.dbflute.cbean.*;

/**
 * The referrer loader of (会員)MEMBER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Member> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMember ready(List<Member> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberAddress> _referrerMemberAddress;

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
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
     * for (Member member : <span style="color: #553000">memberList</span>) {
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
    public NestedReferrerLoaderGateway<LoaderOfMemberAddress> loadMemberAddress(ConditionBeanSetupper<MemberAddressCB> refCBLambda) {
        myBhv().loadMemberAddress(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberAddress = refLs);
        return hd -> hd.handle(new LoaderOfMemberAddress().ready(_referrerMemberAddress, _selector));
    }

    protected List<MemberFollowing> _referrerMemberFollowingByMyMemberId;

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
     * for (Member member : <span style="color: #553000">memberList</span>) {
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
    public NestedReferrerLoaderGateway<LoaderOfMemberFollowing> loadMemberFollowingByMyMemberId(ConditionBeanSetupper<MemberFollowingCB> refCBLambda) {
        myBhv().loadMemberFollowingByMyMemberId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberFollowingByMyMemberId = refLs);
        return hd -> hd.handle(new LoaderOfMemberFollowing().ready(_referrerMemberFollowingByMyMemberId, _selector));
    }

    protected List<MemberFollowing> _referrerMemberFollowingByYourMemberId;

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
     * for (Member member : <span style="color: #553000">memberList</span>) {
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
    public NestedReferrerLoaderGateway<LoaderOfMemberFollowing> loadMemberFollowingByYourMemberId(ConditionBeanSetupper<MemberFollowingCB> refCBLambda) {
        myBhv().loadMemberFollowingByYourMemberId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberFollowingByYourMemberId = refLs);
        return hd -> hd.handle(new LoaderOfMemberFollowing().ready(_referrerMemberFollowingByYourMemberId, _selector));
    }

    protected List<MemberLogin> _referrerMemberLogin;

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン情報)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
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
     * for (Member member : <span style="color: #553000">memberList</span>) {
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
    public NestedReferrerLoaderGateway<LoaderOfMemberLogin> loadMemberLogin(ConditionBeanSetupper<MemberLoginCB> refCBLambda) {
        myBhv().loadMemberLogin(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberLogin = refLs);
        return hd -> hd.handle(new LoaderOfMemberLogin().ready(_referrerMemberLogin, _selector));
    }

    protected List<Purchase> _referrerPurchase;

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
     * for (Member member : <span style="color: #553000">memberList</span>) {
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
    public NestedReferrerLoaderGateway<LoaderOfPurchase> loadPurchase(ConditionBeanSetupper<PurchaseCB> refCBLambda) {
        myBhv().loadPurchase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchase = refLs);
        return hd -> hd.handle(new LoaderOfPurchase().ready(_referrerPurchase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader == null)
        { _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(myBhv().pulloutMemberStatus(_selectedList), _selector); }
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsValidLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsValid() {
        if (_foreignMemberAddressAsValidLoader == null)
        { _foreignMemberAddressAsValidLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsValid(_selectedList), _selector); }
        return _foreignMemberAddressAsValidLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsValidBeforeLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsValidBefore() {
        if (_foreignMemberAddressAsValidBeforeLoader == null)
        { _foreignMemberAddressAsValidBeforeLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsValidBefore(_selectedList), _selector); }
        return _foreignMemberAddressAsValidBeforeLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLoginStatusLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLoginStatus() {
        if (_foreignMemberLoginAsLoginStatusLoader == null)
        { _foreignMemberLoginAsLoginStatusLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLoginStatus(_selectedList), _selector); }
        return _foreignMemberLoginAsLoginStatusLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLoginStatusFixedClsLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLoginStatusFixedCls() {
        if (_foreignMemberLoginAsLoginStatusFixedClsLoader == null)
        { _foreignMemberLoginAsLoginStatusFixedClsLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLoginStatusFixedCls(_selectedList), _selector); }
        return _foreignMemberLoginAsLoginStatusFixedClsLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLoginStatusFixedClsGroupingLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLoginStatusFixedClsGrouping() {
        if (_foreignMemberLoginAsLoginStatusFixedClsGroupingLoader == null)
        { _foreignMemberLoginAsLoginStatusFixedClsGroupingLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLoginStatusFixedClsGrouping(_selectedList), _selector); }
        return _foreignMemberLoginAsLoginStatusFixedClsGroupingLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsIfCommentLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsIfComment() {
        if (_foreignMemberAddressAsIfCommentLoader == null)
        { _foreignMemberAddressAsIfCommentLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsIfComment(_selectedList), _selector); }
        return _foreignMemberAddressAsIfCommentLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsOnlyOneDateLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsOnlyOneDate() {
        if (_foreignMemberAddressAsOnlyOneDateLoader == null)
        { _foreignMemberAddressAsOnlyOneDateLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsOnlyOneDate(_selectedList), _selector); }
        return _foreignMemberAddressAsOnlyOneDateLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLocalBindOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLocalBindOverTest() {
        if (_foreignMemberLoginAsLocalBindOverTestLoader == null)
        { _foreignMemberLoginAsLocalBindOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLocalBindOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsLocalBindOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLocalForeignOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLocalForeignOverTest() {
        if (_foreignMemberLoginAsLocalForeignOverTestLoader == null)
        { _foreignMemberLoginAsLocalForeignOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLocalForeignOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsLocalForeignOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignBindOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignBindOverTest() {
        if (_foreignMemberLoginAsForeignForeignBindOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignBindOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignBindOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignBindOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignEachOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignEachOverTest() {
        if (_foreignMemberLoginAsForeignForeignEachOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignEachOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignEachOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignEachOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignOptimizedBasicOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignOptimizedBasicOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignOptimizedMarkOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignOptimizedMarkOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignOptimizedPartOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignOptimizedPartOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        if (_foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignOptimizedWholeOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignOptimizedWholeOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignParameterOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignParameterOverTest() {
        if (_foreignMemberLoginAsForeignForeignParameterOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignParameterOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignParameterOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignParameterOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsForeignForeignVariousOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsForeignForeignVariousOverTest() {
        if (_foreignMemberLoginAsForeignForeignVariousOverTestLoader == null)
        { _foreignMemberLoginAsForeignForeignVariousOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsForeignForeignVariousOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsForeignForeignVariousOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsReferrerOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsReferrerOverTest() {
        if (_foreignMemberLoginAsReferrerOverTestLoader == null)
        { _foreignMemberLoginAsReferrerOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsReferrerOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsReferrerOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsReferrerForeignOverTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsReferrerForeignOverTest() {
        if (_foreignMemberLoginAsReferrerForeignOverTestLoader == null)
        { _foreignMemberLoginAsReferrerForeignOverTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsReferrerForeignOverTest(_selectedList), _selector); }
        return _foreignMemberLoginAsReferrerForeignOverTestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLatestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLatest() {
        if (_foreignMemberLoginAsLatestLoader == null)
        { _foreignMemberLoginAsLatestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLatest(_selectedList), _selector); }
        return _foreignMemberLoginAsLatestLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsOldestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsOldest() {
        if (_foreignMemberLoginAsOldestLoader == null)
        { _foreignMemberLoginAsOldestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsOldest(_selectedList), _selector); }
        return _foreignMemberLoginAsOldestLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsFormattedBasicLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsFormattedBasic() {
        if (_foreignMemberAddressAsFormattedBasicLoader == null)
        { _foreignMemberAddressAsFormattedBasicLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsFormattedBasic(_selectedList), _selector); }
        return _foreignMemberAddressAsFormattedBasicLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsFormattedLongLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsFormattedLong() {
        if (_foreignMemberAddressAsFormattedLongLoader == null)
        { _foreignMemberAddressAsFormattedLongLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsFormattedLong(_selectedList), _selector); }
        return _foreignMemberAddressAsFormattedLongLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsFormattedManyLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsFormattedMany() {
        if (_foreignMemberLoginAsFormattedManyLoader == null)
        { _foreignMemberLoginAsFormattedManyLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsFormattedMany(_selectedList), _selector); }
        return _foreignMemberLoginAsFormattedManyLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsEmbeddedCommentClassificationTestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsEmbeddedCommentClassificationTest() {
        if (_foreignMemberLoginAsEmbeddedCommentClassificationTestLoader == null)
        { _foreignMemberLoginAsEmbeddedCommentClassificationTestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsEmbeddedCommentClassificationTest(_selectedList), _selector); }
        return _foreignMemberLoginAsEmbeddedCommentClassificationTestLoader;
    }

    protected LoaderOfMemberSecurity _foreignMemberSecurityAsOneLoader;
    public LoaderOfMemberSecurity pulloutMemberSecurityAsOne() {
        if (_foreignMemberSecurityAsOneLoader == null)
        { _foreignMemberSecurityAsOneLoader = new LoaderOfMemberSecurity().ready(myBhv().pulloutMemberSecurityAsOne(_selectedList), _selector); }
        return _foreignMemberSecurityAsOneLoader;
    }

    protected LoaderOfMemberService _foreignMemberServiceAsOneLoader;
    public LoaderOfMemberService pulloutMemberServiceAsOne() {
        if (_foreignMemberServiceAsOneLoader == null)
        { _foreignMemberServiceAsOneLoader = new LoaderOfMemberService().ready(myBhv().pulloutMemberServiceAsOne(_selectedList), _selector); }
        return _foreignMemberServiceAsOneLoader;
    }

    protected LoaderOfMemberWithdrawal _foreignMemberWithdrawalAsOneLoader;
    public LoaderOfMemberWithdrawal pulloutMemberWithdrawalAsOne() {
        if (_foreignMemberWithdrawalAsOneLoader == null)
        { _foreignMemberWithdrawalAsOneLoader = new LoaderOfMemberWithdrawal().ready(myBhv().pulloutMemberWithdrawalAsOne(_selectedList), _selector); }
        return _foreignMemberWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Member> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
