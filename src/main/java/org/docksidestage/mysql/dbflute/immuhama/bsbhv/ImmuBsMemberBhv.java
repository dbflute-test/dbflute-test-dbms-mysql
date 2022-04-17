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
package org.docksidestage.mysql.dbflute.immuhama.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.bsbhv.loader.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;
import org.docksidestage.mysql.dbflute.immuhama.bsentity.dbmeta.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;

/**
 * The behavior of (会員)MEMBER as TABLE. <br>
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
public abstract class ImmuBsMemberBhv extends AbstractBehaviorWritable<ImmuMember, ImmuMemberCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public ImmuMemberDbm asDBMeta() { return ImmuMemberDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "member"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public ImmuMemberCB newConditionBean() { return new ImmuMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<ImmuMemberCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">member</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">member</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuMember> selectEntity(CBCall<ImmuMemberCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<ImmuMember> facadeSelectEntity(ImmuMemberCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuMember> OptionalEntity<ENTITY> doSelectOptionalEntity(ImmuMemberCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * ImmuMember <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">member</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImmuMember selectEntityWithDeletedCheck(CBCall<ImmuMemberCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, ID, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuMember> selectByPK(Integer memberId) {
        return facadeSelectByPK(memberId);
    }

    protected OptionalEntity<ImmuMember> facadeSelectByPK(Integer memberId) {
        return doSelectOptionalByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuMember> ENTITY doSelectByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends ImmuMember> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    protected ImmuMemberCB xprepareCBAsPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;ImmuMember&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (ImmuMember <span style="color: #553000">member</span> : <span style="color: #553000">memberList</span>) {
     *     ... = <span style="color: #553000">member</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImmuMember> selectList(CBCall<ImmuMemberCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;ImmuMember&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">page</span>) {
     *     ... = member.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImmuMember> selectPage(CBCall<ImmuMemberCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @param entityLambda The handler of entity row of ImmuMember. (NotNull)
     */
    public void selectCursor(CBCall<ImmuMemberCB> cbLambda, EntityRowHandler<ImmuMember> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<ImmuMemberCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param memberList The entity list of member. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<ImmuMember> memberList, ReferrerLoaderHandler<ImmuLoaderOfMember> loaderLambda) {
        xassLRArg(memberList, loaderLambda);
        loaderLambda.handle(new ImmuLoaderOfMember().ready(memberList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param member The entity of member. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(ImmuMember member, ReferrerLoaderHandler<ImmuLoaderOfMember> loaderLambda) {
        xassLRArg(member, loaderLambda);
        loaderLambda.handle(new ImmuLoaderOfMember().ready(xnewLRAryLs(member), _behaviorSelector));
    }

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * (会員住所)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberAddress</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">addressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">addressCB</span>.setupSelect...
     *     <span style="color: #553000">addressCB</span>.query().set...
     *     <span style="color: #553000">addressCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberAddress> loadMemberAddress(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberAddressCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberAddress(memberList, new LoadReferrerOption<ImmuMemberAddressCB, ImmuMemberAddress>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br>
     * (会員住所)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberAddress</span>(<span style="color: #553000">member</span>, <span style="color: #553000">addressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">addressCB</span>.setupSelect...
     *     <span style="color: #553000">addressCB</span>.query().set...
     *     <span style="color: #553000">addressCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberAddress> loadMemberAddress(ImmuMember member, ReferrerConditionSetupper<ImmuMemberAddressCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberAddress(xnewLRLs(member), new LoadReferrerOption<ImmuMemberAddressCB, ImmuMemberAddress>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberAddress> doLoadMemberAddress(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberAddressCB, ImmuMemberAddress> option) {
        return helpLoadReferrerInternally(memberList, option, "memberAddressList");
    }

    /**
     * Load referrer of memberFollowingByMyMemberIdList by the set-upper of referrer. <br>
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberFollowingByMyMemberId</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">followingCB</span>.setupSelect...
     *     <span style="color: #553000">followingCB</span>.query().set...
     *     <span style="color: #553000">followingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberFollowingByMyMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyMemberId_InScope(pkList);
     * cb.query().addOrderBy_MyMemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberFollowing> loadMemberFollowingByMyMemberId(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberFollowingCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberFollowingByMyMemberId(memberList, new LoadReferrerOption<ImmuMemberFollowingCB, ImmuMemberFollowing>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberFollowingByMyMemberIdList by the set-upper of referrer. <br>
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberFollowingByMyMemberId</span>(<span style="color: #553000">member</span>, <span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">followingCB</span>.setupSelect...
     *     <span style="color: #553000">followingCB</span>.query().set...
     *     <span style="color: #553000">followingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberFollowingByMyMemberIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyMemberId_InScope(pkList);
     * cb.query().addOrderBy_MyMemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberFollowing> loadMemberFollowingByMyMemberId(ImmuMember member, ReferrerConditionSetupper<ImmuMemberFollowingCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberFollowingByMyMemberId(xnewLRLs(member), new LoadReferrerOption<ImmuMemberFollowingCB, ImmuMemberFollowing>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberFollowing> doLoadMemberFollowingByMyMemberId(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberFollowingCB, ImmuMemberFollowing> option) {
        return helpLoadReferrerInternally(memberList, option, "memberFollowingByMyMemberIdList");
    }

    /**
     * Load referrer of memberFollowingByYourMemberIdList by the set-upper of referrer. <br>
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberFollowingByYourMemberId</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">followingCB</span>.setupSelect...
     *     <span style="color: #553000">followingCB</span>.query().set...
     *     <span style="color: #553000">followingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberFollowingByYourMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setYourMemberId_InScope(pkList);
     * cb.query().addOrderBy_YourMemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberFollowing> loadMemberFollowingByYourMemberId(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberFollowingCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberFollowingByYourMemberId(memberList, new LoadReferrerOption<ImmuMemberFollowingCB, ImmuMemberFollowing>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberFollowingByYourMemberIdList by the set-upper of referrer. <br>
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberFollowingByYourMemberId</span>(<span style="color: #553000">member</span>, <span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">followingCB</span>.setupSelect...
     *     <span style="color: #553000">followingCB</span>.query().set...
     *     <span style="color: #553000">followingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberFollowingByYourMemberIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setYourMemberId_InScope(pkList);
     * cb.query().addOrderBy_YourMemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberFollowing> loadMemberFollowingByYourMemberId(ImmuMember member, ReferrerConditionSetupper<ImmuMemberFollowingCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberFollowingByYourMemberId(xnewLRLs(member), new LoadReferrerOption<ImmuMemberFollowingCB, ImmuMemberFollowing>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberFollowing> doLoadMemberFollowingByYourMemberId(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberFollowingCB, ImmuMemberFollowing> option) {
        return helpLoadReferrerInternally(memberList, option, "memberFollowingByYourMemberIdList");
    }

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberLogin> loadMemberLogin(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberLoginCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberLogin(memberList, new LoadReferrerOption<ImmuMemberLoginCB, ImmuMemberLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">member</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberLogin> loadMemberLogin(ImmuMember member, ReferrerConditionSetupper<ImmuMemberLoginCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberLogin(xnewLRLs(member), new LoadReferrerOption<ImmuMemberLoginCB, ImmuMemberLogin>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberLogin> doLoadMemberLogin(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberLoginCB, ImmuMemberLogin> option) {
        return helpLoadReferrerInternally(memberList, option, "memberLoginList");
    }

    /**
     * Load referrer of memberLoginPasswordList by the set-upper of referrer. <br>
     * (会員ログインパスワード)MEMBER_LOGIN_PASSWORD by MEMBER_ID, named 'memberLoginPasswordList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberLoginPassword</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">passwordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">passwordCB</span>.setupSelect...
     *     <span style="color: #553000">passwordCB</span>.query().set...
     *     <span style="color: #553000">passwordCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberLoginPasswordList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberLoginPassword> loadMemberLoginPassword(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberLoginPasswordCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberLoginPassword(memberList, new LoadReferrerOption<ImmuMemberLoginPasswordCB, ImmuMemberLoginPassword>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberLoginPasswordList by the set-upper of referrer. <br>
     * (会員ログインパスワード)MEMBER_LOGIN_PASSWORD by MEMBER_ID, named 'memberLoginPasswordList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberLoginPassword</span>(<span style="color: #553000">member</span>, <span style="color: #553000">passwordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">passwordCB</span>.setupSelect...
     *     <span style="color: #553000">passwordCB</span>.query().set...
     *     <span style="color: #553000">passwordCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginPasswordList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberLoginPassword> loadMemberLoginPassword(ImmuMember member, ReferrerConditionSetupper<ImmuMemberLoginPasswordCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberLoginPassword(xnewLRLs(member), new LoadReferrerOption<ImmuMemberLoginPasswordCB, ImmuMemberLoginPassword>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberLoginPassword> doLoadMemberLoginPassword(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberLoginPasswordCB, ImmuMemberLoginPassword> option) {
        return helpLoadReferrerInternally(memberList, option, "memberLoginPasswordList");
    }

    /**
     * Load referrer of memberPasswordReminderList by the set-upper of referrer. <br>
     * (会員パスワードリマインダ)MEMBER_PASSWORD_REMINDER by MEMBER_ID, named 'memberPasswordReminderList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberPasswordReminder</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">reminderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reminderCB</span>.setupSelect...
     *     <span style="color: #553000">reminderCB</span>.query().set...
     *     <span style="color: #553000">reminderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberPasswordReminderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberPasswordReminder> loadMemberPasswordReminder(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberPasswordReminderCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberPasswordReminder(memberList, new LoadReferrerOption<ImmuMemberPasswordReminderCB, ImmuMemberPasswordReminder>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberPasswordReminderList by the set-upper of referrer. <br>
     * (会員パスワードリマインダ)MEMBER_PASSWORD_REMINDER by MEMBER_ID, named 'memberPasswordReminderList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberPasswordReminder</span>(<span style="color: #553000">member</span>, <span style="color: #553000">reminderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reminderCB</span>.setupSelect...
     *     <span style="color: #553000">reminderCB</span>.query().set...
     *     <span style="color: #553000">reminderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberPasswordReminderList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberPasswordReminder> loadMemberPasswordReminder(ImmuMember member, ReferrerConditionSetupper<ImmuMemberPasswordReminderCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberPasswordReminder(xnewLRLs(member), new LoadReferrerOption<ImmuMemberPasswordReminderCB, ImmuMemberPasswordReminder>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberPasswordReminder> doLoadMemberPasswordReminder(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberPasswordReminderCB, ImmuMemberPasswordReminder> option) {
        return helpLoadReferrerInternally(memberList, option, "memberPasswordReminderList");
    }

    /**
     * Load referrer of memberProfileList by the set-upper of referrer. <br>
     * (会員プロフィール)MEMBER_PROFILE by MEMBER_ID, named 'memberProfileList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberProfile</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">profileCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">profileCB</span>.setupSelect...
     *     <span style="color: #553000">profileCB</span>.query().set...
     *     <span style="color: #553000">profileCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberProfileList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberProfile> loadMemberProfile(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberProfileCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberProfile(memberList, new LoadReferrerOption<ImmuMemberProfileCB, ImmuMemberProfile>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberProfileList by the set-upper of referrer. <br>
     * (会員プロフィール)MEMBER_PROFILE by MEMBER_ID, named 'memberProfileList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberProfile</span>(<span style="color: #553000">member</span>, <span style="color: #553000">profileCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">profileCB</span>.setupSelect...
     *     <span style="color: #553000">profileCB</span>.query().set...
     *     <span style="color: #553000">profileCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberProfileList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberProfile> loadMemberProfile(ImmuMember member, ReferrerConditionSetupper<ImmuMemberProfileCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberProfile(xnewLRLs(member), new LoadReferrerOption<ImmuMemberProfileCB, ImmuMemberProfile>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberProfile> doLoadMemberProfile(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberProfileCB, ImmuMemberProfile> option) {
        return helpLoadReferrerInternally(memberList, option, "memberProfileList");
    }

    /**
     * Load referrer of memberStatusList by the set-upper of referrer. <br>
     * (会員ステータス)MEMBER_STATUS by MEMBER_ID, named 'memberStatusList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberStatus</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">statusCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusCB</span>.setupSelect...
     *     <span style="color: #553000">statusCB</span>.query().set...
     *     <span style="color: #553000">statusCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getMemberStatusList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberStatus> loadMemberStatus(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuMemberStatusCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadMemberStatus(memberList, new LoadReferrerOption<ImmuMemberStatusCB, ImmuMemberStatus>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberStatusList by the set-upper of referrer. <br>
     * (会員ステータス)MEMBER_STATUS by MEMBER_ID, named 'memberStatusList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadMemberStatus</span>(<span style="color: #553000">member</span>, <span style="color: #553000">statusCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusCB</span>.setupSelect...
     *     <span style="color: #553000">statusCB</span>.query().set...
     *     <span style="color: #553000">statusCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberStatusList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberStatus> loadMemberStatus(ImmuMember member, ReferrerConditionSetupper<ImmuMemberStatusCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadMemberStatus(xnewLRLs(member), new LoadReferrerOption<ImmuMemberStatusCB, ImmuMemberStatus>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberStatus> doLoadMemberStatus(List<ImmuMember> memberList, LoadReferrerOption<ImmuMemberStatusCB, ImmuMemberStatus> option) {
        return helpLoadReferrerInternally(memberList, option, "memberStatusList");
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.setupSelect...
     *     <span style="color: #553000">purchaseCB</span>.query().set...
     *     <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuPurchase> loadPurchase(List<ImmuMember> memberList, ReferrerConditionSetupper<ImmuPurchaseCB> refCBLambda) {
        xassLRArg(memberList, refCBLambda);
        return doLoadPurchase(memberList, new LoadReferrerOption<ImmuPurchaseCB, ImmuPurchase>().xinit(refCBLambda));
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">member</span>, <span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.setupSelect...
     *     <span style="color: #553000">purchaseCB</span>.query().set...
     *     <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuPurchase> loadPurchase(ImmuMember member, ReferrerConditionSetupper<ImmuPurchaseCB> refCBLambda) {
        xassLRArg(member, refCBLambda);
        return doLoadPurchase(xnewLRLs(member), new LoadReferrerOption<ImmuPurchaseCB, ImmuPurchase>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuPurchase> doLoadPurchase(List<ImmuMember> memberList, LoadReferrerOption<ImmuPurchaseCB, ImmuPurchase> option) {
        return helpLoadReferrerInternally(memberList, option, "purchaseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of referrer-as-one table 'ImmuMemberService'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ImmuMemberService> pulloutMemberServiceAsOne(List<ImmuMember> memberList)
    { return helpPulloutInternally(memberList, "memberServiceAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'ImmuMemberWithdrawal'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ImmuMemberWithdrawal> pulloutMemberWithdrawalAsOne(List<ImmuMember> memberList)
    { return helpPulloutInternally(memberList, "memberWithdrawalAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<ImmuMember> memberList)
    { return helpExtractListInternally(memberList, "memberId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">insert</span>(member);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param member The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(ImmuMember member) {
        doInsert(member, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * member.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">update</span>(member);
     * </pre>
     * @param member The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(ImmuMember member) {
        doUpdate(member, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param member The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(ImmuMember member) {
        doInsertOrUpdate(member, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * member.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">delete</span>(member);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ImmuMember member) {
        doDelete(member, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     *     member.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         member.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberList.add(member);
     * }
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">batchInsert</span>(memberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<ImmuMember> memberList) {
        return doBatchInsert(memberList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     *     member.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         member.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         member.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//member.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberList.add(member);
     * }
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">batchUpdate</span>(memberList);
     * </pre>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<ImmuMember> memberList) {
        return doBatchUpdate(memberList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<ImmuMember> memberList) {
        return doBatchDelete(memberList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;ImmuMember, ImmuMemberCB&gt;() {
     *     public ConditionBean setup(ImmuMember entity, ImmuMemberCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<ImmuMember, ImmuMemberCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">queryUpdate</span>(member, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param member The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ImmuMember member, CBCall<ImmuMemberCB> cbLambda) {
        return doQueryUpdate(member, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">queryDelete</span>(member, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<ImmuMemberCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">varyingInsert</span>(member, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param member The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(ImmuMember member, WritableOptionCall<ImmuMemberCB, InsertOption<ImmuMemberCB>> opLambda) {
        doInsert(member, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * member.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(member, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param member The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(ImmuMember member, WritableOptionCall<ImmuMemberCB, UpdateOption<ImmuMemberCB>> opLambda) {
        doUpdate(member, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param member The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(ImmuMember member, WritableOptionCall<ImmuMemberCB, InsertOption<ImmuMemberCB>> insertOpLambda, WritableOptionCall<ImmuMemberCB, UpdateOption<ImmuMemberCB>> updateOpLambda) {
        doInsertOrUpdate(member, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param member The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ImmuMember member, WritableOptionCall<ImmuMemberCB, DeleteOption<ImmuMemberCB>> opLambda) {
        doDelete(member, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<ImmuMember> memberList, WritableOptionCall<ImmuMemberCB, InsertOption<ImmuMemberCB>> opLambda) {
        return doBatchInsert(memberList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<ImmuMember> memberList, WritableOptionCall<ImmuMemberCB, UpdateOption<ImmuMemberCB>> opLambda) {
        return doBatchUpdate(memberList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<ImmuMember> memberList, WritableOptionCall<ImmuMemberCB, DeleteOption<ImmuMemberCB>> opLambda) {
        return doBatchDelete(memberList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<ImmuMember, ImmuMemberCB> manyArgLambda, WritableOptionCall<ImmuMemberCB, InsertOption<ImmuMemberCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ImmuMember member = <span style="color: #70226C">new</span> ImmuMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(member, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param member The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ImmuMember member, CBCall<ImmuMemberCB> cbLambda, WritableOptionCall<ImmuMemberCB, UpdateOption<ImmuMemberCB>> opLambda) {
        return doQueryUpdate(member, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">queryDelete</span>(member, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuMember. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<ImmuMemberCB> cbLambda, WritableOptionCall<ImmuMemberCB, DeleteOption<ImmuMemberCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * memberBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * memberBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * memberBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * memberBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * memberBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * memberBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * memberBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * memberBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * memberBhv.outideSql().removeBlockComment().selectList()
     * memberBhv.outideSql().removeLineComment().selectList()
     * memberBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<ImmuMemberBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends ImmuMember> typeOfSelectedEntity() { return ImmuMember.class; }
    protected Class<ImmuMember> typeOfHandlingEntity() { return ImmuMember.class; }
    protected Class<ImmuMemberCB> typeOfHandlingConditionBean() { return ImmuMemberCB.class; }
}
