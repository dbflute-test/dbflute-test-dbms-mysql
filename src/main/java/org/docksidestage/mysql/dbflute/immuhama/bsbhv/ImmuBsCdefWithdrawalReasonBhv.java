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
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuCDef;
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.bsbhv.loader.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;
import org.docksidestage.mysql.dbflute.immuhama.bsentity.dbmeta.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;

/**
 * The behavior of ([区分値]退会理由)CDEF_WITHDRAWAL_REASON as TABLE. <br>
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsCdefWithdrawalReasonBhv extends AbstractBehaviorWritable<ImmuCdefWithdrawalReason, ImmuCdefWithdrawalReasonCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public ImmuCdefWithdrawalReasonDbm asDBMeta() { return ImmuCdefWithdrawalReasonDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "cdef_withdrawal_reason"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public ImmuCdefWithdrawalReasonCB newConditionBean() { return new ImmuCdefWithdrawalReasonCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
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
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">cdefWithdrawalReason</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">cdefWithdrawalReason</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">cdefWithdrawalReason</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">cdefWithdrawalReason</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuCdefWithdrawalReason> selectEntity(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<ImmuCdefWithdrawalReason> facadeSelectEntity(ImmuCdefWithdrawalReasonCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuCdefWithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalEntity(ImmuCdefWithdrawalReasonCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * ImmuCdefWithdrawalReason <span style="color: #553000">cdefWithdrawalReason</span> = <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">cdefWithdrawalReason</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImmuCdefWithdrawalReason selectEntityWithDeletedCheck(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param withdrawalReasonCode (退会理由コード): PK, NotNull, CHAR(3), classification=WithdrawalReason. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuCdefWithdrawalReason> selectByPK(ImmuCDef.WithdrawalReason withdrawalReasonCode) {
        return facadeSelectByPK(withdrawalReasonCode);
    }

    protected OptionalEntity<ImmuCdefWithdrawalReason> facadeSelectByPK(ImmuCDef.WithdrawalReason withdrawalReasonCode) {
        return doSelectOptionalByPK(withdrawalReasonCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuCdefWithdrawalReason> ENTITY doSelectByPK(ImmuCDef.WithdrawalReason withdrawalReasonCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(withdrawalReasonCode), tp);
    }

    protected <ENTITY extends ImmuCdefWithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalByPK(ImmuCDef.WithdrawalReason withdrawalReasonCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(withdrawalReasonCode, tp), withdrawalReasonCode);
    }

    protected ImmuCdefWithdrawalReasonCB xprepareCBAsPK(ImmuCDef.WithdrawalReason withdrawalReasonCode) {
        assertObjectNotNull("withdrawalReasonCode", withdrawalReasonCode);
        return newConditionBean().acceptPK(withdrawalReasonCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder (表示順): UQ, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuCdefWithdrawalReason> selectByUniqueOf(Integer displayOrder) {
        return facadeSelectByUniqueOf(displayOrder);
    }

    protected OptionalEntity<ImmuCdefWithdrawalReason> facadeSelectByUniqueOf(Integer displayOrder) {
        return doSelectByUniqueOf(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuCdefWithdrawalReason> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer displayOrder, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), tp), displayOrder);
    }

    protected ImmuCdefWithdrawalReasonCB xprepareCBAsUniqueOf(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOf(displayOrder);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;ImmuCdefWithdrawalReason&gt; <span style="color: #553000">cdefWithdrawalReasonList</span> = <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (ImmuCdefWithdrawalReason <span style="color: #553000">cdefWithdrawalReason</span> : <span style="color: #553000">cdefWithdrawalReasonList</span>) {
     *     ... = <span style="color: #553000">cdefWithdrawalReason</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImmuCdefWithdrawalReason> selectList(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
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
     * PagingResultBean&lt;ImmuCdefWithdrawalReason&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (ImmuCdefWithdrawalReason cdefWithdrawalReason : <span style="color: #553000">page</span>) {
     *     ... = cdefWithdrawalReason.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImmuCdefWithdrawalReason> selectPage(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @param entityLambda The handler of entity row of ImmuCdefWithdrawalReason. (NotNull)
     */
    public void selectCursor(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda, EntityRowHandler<ImmuCdefWithdrawalReason> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<ImmuCdefWithdrawalReasonCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param cdefWithdrawalReasonList The entity list of cdefWithdrawalReason. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList, ReferrerLoaderHandler<ImmuLoaderOfCdefWithdrawalReason> loaderLambda) {
        xassLRArg(cdefWithdrawalReasonList, loaderLambda);
        loaderLambda.handle(new ImmuLoaderOfCdefWithdrawalReason().ready(cdefWithdrawalReasonList, _behaviorSelector));
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
     * @param cdefWithdrawalReason The entity of cdefWithdrawalReason. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(ImmuCdefWithdrawalReason cdefWithdrawalReason, ReferrerLoaderHandler<ImmuLoaderOfCdefWithdrawalReason> loaderLambda) {
        xassLRArg(cdefWithdrawalReason, loaderLambda);
        loaderLambda.handle(new ImmuLoaderOfCdefWithdrawalReason().ready(xnewLRAryLs(cdefWithdrawalReason), _behaviorSelector));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br>
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">loadMemberWithdrawal</span>(<span style="color: #553000">cdefWithdrawalReasonList</span>, <span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *     <span style="color: #553000">withdrawalCB</span>.query().set...
     *     <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuCdefWithdrawalReason cdefWithdrawalReason : <span style="color: #553000">cdefWithdrawalReasonList</span>) {
     *     ... = cdefWithdrawalReason.<span style="color: #CC4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param cdefWithdrawalReasonList The entity list of cdefWithdrawalReason. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberWithdrawal> loadMemberWithdrawal(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList, ReferrerConditionSetupper<ImmuMemberWithdrawalCB> refCBLambda) {
        xassLRArg(cdefWithdrawalReasonList, refCBLambda);
        return doLoadMemberWithdrawal(cdefWithdrawalReasonList, new LoadReferrerOption<ImmuMemberWithdrawalCB, ImmuMemberWithdrawal>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br>
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">loadMemberWithdrawal</span>(<span style="color: #553000">cdefWithdrawalReason</span>, <span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *     <span style="color: #553000">withdrawalCB</span>.query().set...
     *     <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">cdefWithdrawalReason</span>.<span style="color: #CC4747">getMemberWithdrawalList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param cdefWithdrawalReason The entity of cdefWithdrawalReason. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuMemberWithdrawal> loadMemberWithdrawal(ImmuCdefWithdrawalReason cdefWithdrawalReason, ReferrerConditionSetupper<ImmuMemberWithdrawalCB> refCBLambda) {
        xassLRArg(cdefWithdrawalReason, refCBLambda);
        return doLoadMemberWithdrawal(xnewLRLs(cdefWithdrawalReason), new LoadReferrerOption<ImmuMemberWithdrawalCB, ImmuMemberWithdrawal>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuMemberWithdrawal> doLoadMemberWithdrawal(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList, LoadReferrerOption<ImmuMemberWithdrawalCB, ImmuMemberWithdrawal> option) {
        return helpLoadReferrerInternally(cdefWithdrawalReasonList, option, "memberWithdrawalList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key withdrawalReasonCode.
     * @param cdefWithdrawalReasonList The list of cdefWithdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractWithdrawalReasonCodeList(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList)
    { return helpExtractListInternally(cdefWithdrawalReasonList, "withdrawalReasonCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param cdefWithdrawalReasonList The list of cdefWithdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList)
    { return helpExtractListInternally(cdefWithdrawalReasonList, "displayOrder"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cdefWithdrawalReason.setFoo...(value);
     * cdefWithdrawalReason.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.set...;</span>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">insert</span>(cdefWithdrawalReason);
     * ... = cdefWithdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param cdefWithdrawalReason The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(ImmuCdefWithdrawalReason cdefWithdrawalReason) {
        doInsert(cdefWithdrawalReason, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * cdefWithdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cdefWithdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cdefWithdrawalReason.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">update</span>(cdefWithdrawalReason);
     * </pre>
     * @param cdefWithdrawalReason The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(ImmuCdefWithdrawalReason cdefWithdrawalReason) {
        doUpdate(cdefWithdrawalReason, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param cdefWithdrawalReason The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(ImmuCdefWithdrawalReason cdefWithdrawalReason) {
        doInsertOrUpdate(cdefWithdrawalReason, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * cdefWithdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cdefWithdrawalReason.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">delete</span>(cdefWithdrawalReason);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param cdefWithdrawalReason The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ImmuCdefWithdrawalReason cdefWithdrawalReason) {
        doDelete(cdefWithdrawalReason, null);
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
     *     ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     *     cdefWithdrawalReason.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cdefWithdrawalReason.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     cdefWithdrawalReasonList.add(cdefWithdrawalReason);
     * }
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">batchInsert</span>(cdefWithdrawalReasonList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param cdefWithdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList) {
        return doBatchInsert(cdefWithdrawalReasonList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     *     cdefWithdrawalReason.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cdefWithdrawalReason.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         cdefWithdrawalReason.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//cdefWithdrawalReason.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     cdefWithdrawalReasonList.add(cdefWithdrawalReason);
     * }
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">batchUpdate</span>(cdefWithdrawalReasonList);
     * </pre>
     * @param cdefWithdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList) {
        return doBatchUpdate(cdefWithdrawalReasonList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param cdefWithdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList) {
        return doBatchDelete(cdefWithdrawalReasonList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;ImmuCdefWithdrawalReason, ImmuCdefWithdrawalReasonCB&gt;() {
     *     public ConditionBean setup(ImmuCdefWithdrawalReason entity, ImmuCdefWithdrawalReasonCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<ImmuCdefWithdrawalReason, ImmuCdefWithdrawalReasonCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setPK...(value);</span>
     * cdefWithdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setVersionNo(value);</span>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">queryUpdate</span>(cdefWithdrawalReason, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cdefWithdrawalReason The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ImmuCdefWithdrawalReason cdefWithdrawalReason, CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
        return doQueryUpdate(cdefWithdrawalReason, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">queryDelete</span>(cdefWithdrawalReason, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda) {
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
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cdefWithdrawalReason.setFoo...(value);
     * cdefWithdrawalReason.setBar...(value);
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">varyingInsert</span>(cdefWithdrawalReason, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = cdefWithdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param cdefWithdrawalReason The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(ImmuCdefWithdrawalReason cdefWithdrawalReason, WritableOptionCall<ImmuCdefWithdrawalReasonCB, InsertOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        doInsert(cdefWithdrawalReason, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * cdefWithdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cdefWithdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cdefWithdrawalReason.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(cdefWithdrawalReason, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param cdefWithdrawalReason The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(ImmuCdefWithdrawalReason cdefWithdrawalReason, WritableOptionCall<ImmuCdefWithdrawalReasonCB, UpdateOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        doUpdate(cdefWithdrawalReason, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param cdefWithdrawalReason The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(ImmuCdefWithdrawalReason cdefWithdrawalReason, WritableOptionCall<ImmuCdefWithdrawalReasonCB, InsertOption<ImmuCdefWithdrawalReasonCB>> insertOpLambda, WritableOptionCall<ImmuCdefWithdrawalReasonCB, UpdateOption<ImmuCdefWithdrawalReasonCB>> updateOpLambda) {
        doInsertOrUpdate(cdefWithdrawalReason, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param cdefWithdrawalReason The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ImmuCdefWithdrawalReason cdefWithdrawalReason, WritableOptionCall<ImmuCdefWithdrawalReasonCB, DeleteOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        doDelete(cdefWithdrawalReason, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param cdefWithdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList, WritableOptionCall<ImmuCdefWithdrawalReasonCB, InsertOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        return doBatchInsert(cdefWithdrawalReasonList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param cdefWithdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList, WritableOptionCall<ImmuCdefWithdrawalReasonCB, UpdateOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        return doBatchUpdate(cdefWithdrawalReasonList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param cdefWithdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<ImmuCdefWithdrawalReason> cdefWithdrawalReasonList, WritableOptionCall<ImmuCdefWithdrawalReasonCB, DeleteOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        return doBatchDelete(cdefWithdrawalReasonList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<ImmuCdefWithdrawalReason, ImmuCdefWithdrawalReasonCB> manyArgLambda, WritableOptionCall<ImmuCdefWithdrawalReasonCB, InsertOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ImmuCdefWithdrawalReason cdefWithdrawalReason = <span style="color: #70226C">new</span> ImmuCdefWithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setPK...(value);</span>
     * cdefWithdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cdefWithdrawalReason.setVersionNo(value);</span>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(cdefWithdrawalReason, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param cdefWithdrawalReason The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ImmuCdefWithdrawalReason cdefWithdrawalReason, CBCall<ImmuCdefWithdrawalReasonCB> cbLambda, WritableOptionCall<ImmuCdefWithdrawalReasonCB, UpdateOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        return doQueryUpdate(cdefWithdrawalReason, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">cdefWithdrawalReasonBhv</span>.<span style="color: #CC4747">queryDelete</span>(cdefWithdrawalReason, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefWithdrawalReason. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<ImmuCdefWithdrawalReasonCB> cbLambda, WritableOptionCall<ImmuCdefWithdrawalReasonCB, DeleteOption<ImmuCdefWithdrawalReasonCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * cdefWithdrawalReasonBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * cdefWithdrawalReasonBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cdefWithdrawalReasonBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * cdefWithdrawalReasonBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cdefWithdrawalReasonBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * cdefWithdrawalReasonBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * cdefWithdrawalReasonBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * cdefWithdrawalReasonBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * cdefWithdrawalReasonBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * cdefWithdrawalReasonBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * cdefWithdrawalReasonBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * cdefWithdrawalReasonBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * cdefWithdrawalReasonBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * cdefWithdrawalReasonBhv.outideSql().removeBlockComment().selectList()
     * cdefWithdrawalReasonBhv.outideSql().removeLineComment().selectList()
     * cdefWithdrawalReasonBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<ImmuCdefWithdrawalReasonBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends ImmuCdefWithdrawalReason> typeOfSelectedEntity() { return ImmuCdefWithdrawalReason.class; }
    protected Class<ImmuCdefWithdrawalReason> typeOfHandlingEntity() { return ImmuCdefWithdrawalReason.class; }
    protected Class<ImmuCdefWithdrawalReasonCB> typeOfHandlingConditionBean() { return ImmuCdefWithdrawalReasonCB.class; }
}
