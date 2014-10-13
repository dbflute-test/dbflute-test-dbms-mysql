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
package org.docksidestage.mysql.dbflute.bsbhv;

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
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.bsbhv.loader.*;
import org.docksidestage.mysql.dbflute.exentity.*;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.*;
import org.docksidestage.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_PERROTTA_OVER_MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PRODUCT_ID, TRACE_TYPE_CODE, MACHO_CODE
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
 *     white_perrotta_over_member_macho, white_perrotta_over_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whitePerrottaOverMemberMacho, whitePerrottaOverProduct
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverMemberBhv extends AbstractBehaviorWritable<WhitePerrottaOverMember, WhitePerrottaOverMemberCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePerrottaOverMemberDbm getDBMeta() { return WhitePerrottaOverMemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePerrottaOverMemberCB newConditionBean() { return new WhitePerrottaOverMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * int count = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * int count = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePerrottaOverMemberCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhitePerrottaOverMember&gt; entity = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whitePerrottaOverMember -&gt; {
     *     ...
     * });
     * WhitePerrottaOverMember whitePerrottaOverMember = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whitePerrottaOverMember -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhitePerrottaOverMember whitePerrottaOverMember = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverMember> selectEntity(CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhitePerrottaOverMember&gt; entity = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whitePerrottaOverMember -&gt; {
     *     ...
     * });
     * WhitePerrottaOverMember whitePerrottaOverMember = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whitePerrottaOverMember -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhitePerrottaOverMember whitePerrottaOverMember = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverMember> selectEntity(WhitePerrottaOverMemberCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhitePerrottaOverMember> facadeSelectEntity(WhitePerrottaOverMemberCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverMember> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePerrottaOverMemberCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * WhitePerrottaOverMember whitePerrottaOverMember = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverMember selectEntityWithDeletedCheck(CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * WhitePerrottaOverMember whitePerrottaOverMember = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverMember selectEntityWithDeletedCheck(WhitePerrottaOverMemberCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverMember> selectByPK(Long memberId) {
        return facadeSelectByPK(memberId);
    }

    protected OptionalEntity<WhitePerrottaOverMember> facadeSelectByPK(Long memberId) {
        return doSelectOptionalByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverMember> ENTITY doSelectByPK(Long memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends WhitePerrottaOverMember> OptionalEntity<ENTITY> doSelectOptionalByPK(Long memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    protected WhitePerrottaOverMemberCB xprepareCBAsPK(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePerrottaOverMember&gt; whitePerrottaOverMemberList = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePerrottaOverMember whitePerrottaOverMember : whitePerrottaOverMemberList) {
     *     ... = whitePerrottaOverMember.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverMember> selectList(CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePerrottaOverMember&gt; whitePerrottaOverMemberList = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePerrottaOverMember whitePerrottaOverMember : whitePerrottaOverMemberList) {
     *     ... = whitePerrottaOverMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverMember> selectList(WhitePerrottaOverMemberCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverMember&gt; page = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePerrottaOverMember whitePerrottaOverMember : page) {
     *     ... = whitePerrottaOverMember.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverMember> selectPage(CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverMember&gt; page = whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePerrottaOverMember whitePerrottaOverMember : page) {
     *     ... = whitePerrottaOverMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverMember> selectPage(WhitePerrottaOverMemberCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePerrottaOverMember&gt;() {
     *     public void handle(WhitePerrottaOverMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @param entityLambda The handler of entity row of WhitePerrottaOverMember. (NotNull)
     */
    public void selectCursor(CBCall<WhitePerrottaOverMemberCB> cbLambda, EntityRowHandler<WhitePerrottaOverMember> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePerrottaOverMember&gt;() {
     *     public void handle(WhitePerrottaOverMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePerrottaOverMember. (NotNull)
     */
    public void selectCursor(WhitePerrottaOverMemberCB cb, EntityRowHandler<WhitePerrottaOverMember> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePerrottaOverMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePerrottaOverMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whitePerrottaOverMemberList The entity list of whitePerrottaOverMember. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePerrottaOverMember> whitePerrottaOverMemberList, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverMember> loaderLambda) {
        xassLRArg(whitePerrottaOverMemberList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverMember().ready(whitePerrottaOverMemberList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whitePerrottaOverMember The entity of whitePerrottaOverMember. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePerrottaOverMember whitePerrottaOverMember, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverMember> loaderLambda) {
        xassLRArg(whitePerrottaOverMember, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverMember().ready(xnewLRAryLs(whitePerrottaOverMember), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhitePerrottaOverMemberMacho'.
     * @param whitePerrottaOverMemberList The list of whitePerrottaOverMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePerrottaOverMemberMacho> pulloutWhitePerrottaOverMemberMacho(List<WhitePerrottaOverMember> whitePerrottaOverMemberList)
    { return helpPulloutInternally(whitePerrottaOverMemberList, "whitePerrottaOverMemberMacho"); }

    /**
     * Pull out the list of foreign table 'WhitePerrottaOverProduct'.
     * @param whitePerrottaOverMemberList The list of whitePerrottaOverMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePerrottaOverProduct> pulloutWhitePerrottaOverProduct(List<WhitePerrottaOverMember> whitePerrottaOverMemberList)
    { return helpPulloutInternally(whitePerrottaOverMemberList, "whitePerrottaOverProduct"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param whitePerrottaOverMemberList The list of whitePerrottaOverMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberIdList(List<WhitePerrottaOverMember> whitePerrottaOverMemberList)
    { return helpExtractListInternally(whitePerrottaOverMemberList, "memberId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverMember.setFoo...(value);
     * whitePerrottaOverMember.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.set...;</span>
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">insert</span>(whitePerrottaOverMember);
     * ... = whitePerrottaOverMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePerrottaOverMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePerrottaOverMember whitePerrottaOverMember) {
        doInsert(whitePerrottaOverMember, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * whitePerrottaOverMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePerrottaOverMemberBhv.<span style="color: #DD4747">update</span>(whitePerrottaOverMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePerrottaOverMember whitePerrottaOverMember) {
        doUpdate(whitePerrottaOverMember, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePerrottaOverMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePerrottaOverMember whitePerrottaOverMember) {
        doInsertOrUpdate(whitePerrottaOverMember, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * whitePerrottaOverMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePerrottaOverMemberBhv.<span style="color: #DD4747">delete</span>(whitePerrottaOverMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverMember The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePerrottaOverMember whitePerrottaOverMember) {
        doDelete(whitePerrottaOverMember, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     *     whitePerrottaOverMember.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverMember.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePerrottaOverMemberList.add(whitePerrottaOverMember);
     * }
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">batchInsert</span>(whitePerrottaOverMemberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePerrottaOverMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        return doBatchInsert(whitePerrottaOverMemberList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     *     whitePerrottaOverMember.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverMember.setFooPrice(123);
     *     } else {
     *         whitePerrottaOverMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePerrottaOverMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePerrottaOverMemberList.add(whitePerrottaOverMember);
     * }
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">batchUpdate</span>(whitePerrottaOverMemberList);
     * </pre>
     * @param whitePerrottaOverMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        return doBatchUpdate(whitePerrottaOverMemberList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePerrottaOverMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        return doBatchDelete(whitePerrottaOverMemberList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePerrottaOverMember, WhitePerrottaOverMemberCB&gt;() {
     *     public ConditionBean setup(WhitePerrottaOverMember entity, WhitePerrottaOverMemberCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePerrottaOverMember, WhitePerrottaOverMemberCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setPK...(value);</span>
     * whitePerrottaOverMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setVersionNo(value);</span>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">queryUpdate</span>(whitePerrottaOverMember, cb);
     * </pre>
     * @param whitePerrottaOverMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverMember whitePerrottaOverMember, CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return doQueryUpdate(whitePerrottaOverMember, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setPK...(value);</span>
     * whitePerrottaOverMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setVersionNo(value);</span>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">queryUpdate</span>(whitePerrottaOverMember, cb);
     * </pre>
     * @param whitePerrottaOverMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverMember whitePerrottaOverMember, WhitePerrottaOverMemberCB cb) {
        return doQueryUpdate(whitePerrottaOverMember, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">queryDelete</span>(whitePerrottaOverMember, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhitePerrottaOverMemberCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">queryDelete</span>(whitePerrottaOverMember, cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePerrottaOverMemberCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverMember.setFoo...(value);
     * whitePerrottaOverMember.setBar...(value);
     * InsertOption<WhitePerrottaOverMemberCB> option = new InsertOption<WhitePerrottaOverMemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">varyingInsert</span>(whitePerrottaOverMember, option);
     * ... = whitePerrottaOverMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePerrottaOverMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePerrottaOverMember whitePerrottaOverMember, WOptionCall<WhitePerrottaOverMemberCB, InsertOption<WhitePerrottaOverMemberCB>> opLambda) {
        doInsert(whitePerrottaOverMember, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * whitePerrottaOverMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePerrottaOverMemberCB&gt; option = new UpdateOption&lt;WhitePerrottaOverMemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *         public void specify(WhitePerrottaOverMemberCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePerrottaOverMemberBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePerrottaOverMember, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePerrottaOverMember whitePerrottaOverMember, WOptionCall<WhitePerrottaOverMemberCB, UpdateOption<WhitePerrottaOverMemberCB>> opLambda) {
        doUpdate(whitePerrottaOverMember, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePerrottaOverMember The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePerrottaOverMember whitePerrottaOverMember, WOptionCall<WhitePerrottaOverMemberCB, InsertOption<WhitePerrottaOverMemberCB>> insertOpLambda, WOptionCall<WhitePerrottaOverMemberCB, UpdateOption<WhitePerrottaOverMemberCB>> updateOpLambda) {
        doInsertOrUpdate(whitePerrottaOverMember, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePerrottaOverMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePerrottaOverMember whitePerrottaOverMember, WOptionCall<WhitePerrottaOverMemberCB, DeleteOption<WhitePerrottaOverMemberCB>> opLambda) {
        doDelete(whitePerrottaOverMember, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePerrottaOverMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePerrottaOverMember> whitePerrottaOverMemberList, WOptionCall<WhitePerrottaOverMemberCB, InsertOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doBatchInsert(whitePerrottaOverMemberList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePerrottaOverMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePerrottaOverMember> whitePerrottaOverMemberList, WOptionCall<WhitePerrottaOverMemberCB, UpdateOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doBatchUpdate(whitePerrottaOverMemberList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePerrottaOverMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePerrottaOverMember> whitePerrottaOverMemberList, WOptionCall<WhitePerrottaOverMemberCB, DeleteOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doBatchDelete(whitePerrottaOverMemberList, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhitePerrottaOverMember, WhitePerrottaOverMemberCB> manyArgLambda, WOptionCall<WhitePerrottaOverMemberCB, InsertOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setPK...(value);</span>
     * whitePerrottaOverMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setVersionNo(value);</span>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverMemberCB&gt; option = new UpdateOption&lt;WhitePerrottaOverMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void specify(WhitePerrottaOverMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePerrottaOverMember, cb, option);
     * </pre>
     * @param whitePerrottaOverMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverMember whitePerrottaOverMember, CBCall<WhitePerrottaOverMemberCB> cbLambda, WOptionCall<WhitePerrottaOverMemberCB, UpdateOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverMember, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverMember whitePerrottaOverMember = new WhitePerrottaOverMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setPK...(value);</span>
     * whitePerrottaOverMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMember.setVersionNo(value);</span>
     * WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverMemberCB&gt; option = new UpdateOption&lt;WhitePerrottaOverMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverMemberCB&gt;() {
     *     public void specify(WhitePerrottaOverMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePerrottaOverMemberBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePerrottaOverMember, cb, option);
     * </pre>
     * @param whitePerrottaOverMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverMember whitePerrottaOverMember, WhitePerrottaOverMemberCB cb, WOptionCall<WhitePerrottaOverMemberCB, UpdateOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverMember, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMember. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhitePerrottaOverMemberCB> cbLambda, WOptionCall<WhitePerrottaOverMemberCB, DeleteOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePerrottaOverMember. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePerrottaOverMemberCB cb, WOptionCall<WhitePerrottaOverMemberCB, DeleteOption<WhitePerrottaOverMemberCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whitePerrottaOverMemberBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whitePerrottaOverMemberBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverMemberBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whitePerrottaOverMemberBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverMemberBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whitePerrottaOverMemberBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whitePerrottaOverMemberBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whitePerrottaOverMemberBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whitePerrottaOverMemberBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whitePerrottaOverMemberBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whitePerrottaOverMemberBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whitePerrottaOverMemberBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whitePerrottaOverMemberBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whitePerrottaOverMemberBhv.outideSql().removeBlockComment().selectList()
     * whitePerrottaOverMemberBhv.outideSql().removeLineComment().selectList()
     * whitePerrottaOverMemberBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePerrottaOverMemberBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePerrottaOverMemberBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePerrottaOverMember> typeOfSelectedEntity() { return WhitePerrottaOverMember.class; }
    protected Class<WhitePerrottaOverMember> typeOfHandlingEntity() { return WhitePerrottaOverMember.class; }
    protected Class<WhitePerrottaOverMemberCB> typeOfHandlingConditionBean() { return WhitePerrottaOverMemberCB.class; }
}
