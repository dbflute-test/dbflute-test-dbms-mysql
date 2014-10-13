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
 * The behavior of WHITE_DATE_ADJUSTMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     DATE_ADJUSTMENT_ID
 *
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATETIME, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_NAMED_STRING_LONG, ADJUSTED_NAMED_TYPED_LONG, ADJUSTED_PINPOINT_STRING_LONG, ADJUSTED_PINPOINT_TYPED_LONG, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDateAdjustmentBhv extends AbstractBehaviorWritable<WhiteDateAdjustment, WhiteDateAdjustmentCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteDateAdjustmentDbm getDBMeta() { return WhiteDateAdjustmentDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteDateAdjustmentCB newConditionBean() { return new WhiteDateAdjustmentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * int count = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * int count = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDateAdjustmentCB cb) {
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
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteDateAdjustment&gt; entity = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteDateAdjustment -&gt; {
     *     ...
     * });
     * WhiteDateAdjustment whiteDateAdjustment = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteDateAdjustment -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteDateAdjustment whiteDateAdjustment = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDateAdjustment> selectEntity(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteDateAdjustment&gt; entity = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteDateAdjustment -&gt; {
     *     ...
     * });
     * WhiteDateAdjustment whiteDateAdjustment = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteDateAdjustment -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteDateAdjustment whiteDateAdjustment = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDateAdjustment> selectEntity(WhiteDateAdjustmentCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteDateAdjustment> facadeSelectEntity(WhiteDateAdjustmentCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteDateAdjustment> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteDateAdjustmentCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * WhiteDateAdjustment whiteDateAdjustment = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDateAdjustment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectEntityWithDeletedCheck(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * WhiteDateAdjustment whiteDateAdjustment = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDateAdjustment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectEntityWithDeletedCheck(WhiteDateAdjustmentCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param dateAdjustmentId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDateAdjustment> selectByPK(Long dateAdjustmentId) {
        return facadeSelectByPK(dateAdjustmentId);
    }

    protected OptionalEntity<WhiteDateAdjustment> facadeSelectByPK(Long dateAdjustmentId) {
        return doSelectOptionalByPK(dateAdjustmentId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteDateAdjustment> ENTITY doSelectByPK(Long dateAdjustmentId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(dateAdjustmentId), tp);
    }

    protected <ENTITY extends WhiteDateAdjustment> OptionalEntity<ENTITY> doSelectOptionalByPK(Long dateAdjustmentId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(dateAdjustmentId, tp), dateAdjustmentId);
    }

    protected WhiteDateAdjustmentCB xprepareCBAsPK(Long dateAdjustmentId) {
        assertObjectNotNull("dateAdjustmentId", dateAdjustmentId);
        return newConditionBean().acceptPK(dateAdjustmentId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDateAdjustment&gt; whiteDateAdjustmentList = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteDateAdjustment whiteDateAdjustment : whiteDateAdjustmentList) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDateAdjustment> selectList(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDateAdjustment&gt; whiteDateAdjustmentList = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteDateAdjustment whiteDateAdjustment : whiteDateAdjustmentList) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDateAdjustment> selectList(WhiteDateAdjustmentCB cb) {
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
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDateAdjustment&gt; page = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDateAdjustment whiteDateAdjustment : page) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDateAdjustment> selectPage(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDateAdjustment&gt; page = whiteDateAdjustmentBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDateAdjustment whiteDateAdjustment : page) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDateAdjustment> selectPage(WhiteDateAdjustmentCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDateAdjustment&gt;() {
     *     public void handle(WhiteDateAdjustment entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @param entityLambda The handler of entity row of WhiteDateAdjustment. (NotNull)
     */
    public void selectCursor(CBCall<WhiteDateAdjustmentCB> cbLambda, EntityRowHandler<WhiteDateAdjustment> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDateAdjustment&gt;() {
     *     public void handle(WhiteDateAdjustment entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDateAdjustment. (NotNull)
     */
    public void selectCursor(WhiteDateAdjustmentCB cb, EntityRowHandler<WhiteDateAdjustment> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteDateAdjustmentCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteDateAdjustmentList The entity list of whiteDateAdjustment. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteDateAdjustment> whiteDateAdjustmentList, ReferrerLoaderHandler<LoaderOfWhiteDateAdjustment> loaderLambda) {
        xassLRArg(whiteDateAdjustmentList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteDateAdjustment().ready(whiteDateAdjustmentList, _behaviorSelector));
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
     * @param whiteDateAdjustment The entity of whiteDateAdjustment. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteDateAdjustment whiteDateAdjustment, ReferrerLoaderHandler<LoaderOfWhiteDateAdjustment> loaderLambda) {
        xassLRArg(whiteDateAdjustment, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteDateAdjustment().ready(xnewLRAryLs(whiteDateAdjustment), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key dateAdjustmentId.
     * @param whiteDateAdjustmentList The list of whiteDateAdjustment. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDateAdjustmentIdList(List<WhiteDateAdjustment> whiteDateAdjustmentList)
    { return helpExtractListInternally(whiteDateAdjustmentList, "dateAdjustmentId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDateAdjustment.setFoo...(value);
     * whiteDateAdjustment.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">insert</span>(whiteDateAdjustment);
     * ... = whiteDateAdjustment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDateAdjustment The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDateAdjustment whiteDateAdjustment) {
        doInsert(whiteDateAdjustment, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDateAdjustment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteDateAdjustmentBhv.<span style="color: #DD4747">update</span>(whiteDateAdjustment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteDateAdjustment whiteDateAdjustment) {
        doUpdate(whiteDateAdjustment, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteDateAdjustment The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDateAdjustment whiteDateAdjustment) {
        doInsertOrUpdate(whiteDateAdjustment, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDateAdjustment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteDateAdjustmentBhv.<span style="color: #DD4747">delete</span>(whiteDateAdjustment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDateAdjustment whiteDateAdjustment) {
        doDelete(whiteDateAdjustment, null);
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
     *     WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     *     whiteDateAdjustment.setFooName("foo");
     *     if (...) {
     *         whiteDateAdjustment.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDateAdjustmentList.add(whiteDateAdjustment);
     * }
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">batchInsert</span>(whiteDateAdjustmentList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        return doBatchInsert(whiteDateAdjustmentList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     *     whiteDateAdjustment.setFooName("foo");
     *     if (...) {
     *         whiteDateAdjustment.setFooPrice(123);
     *     } else {
     *         whiteDateAdjustment.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDateAdjustment.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDateAdjustmentList.add(whiteDateAdjustment);
     * }
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDateAdjustmentList);
     * </pre>
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        return doBatchUpdate(whiteDateAdjustmentList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        return doBatchDelete(whiteDateAdjustmentList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDateAdjustment, WhiteDateAdjustmentCB&gt;() {
     *     public ConditionBean setup(WhiteDateAdjustment entity, WhiteDateAdjustmentCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">queryUpdate</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDateAdjustment whiteDateAdjustment, CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return doQueryUpdate(whiteDateAdjustment, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">queryUpdate</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb) {
        return doQueryUpdate(whiteDateAdjustment, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">queryDelete</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">queryDelete</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDateAdjustmentCB cb) {
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
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDateAdjustment.setFoo...(value);
     * whiteDateAdjustment.setBar...(value);
     * InsertOption<WhiteDateAdjustmentCB> option = new InsertOption<WhiteDateAdjustmentCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">varyingInsert</span>(whiteDateAdjustment, option);
     * ... = whiteDateAdjustment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDateAdjustment The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDateAdjustment whiteDateAdjustment, WOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> opLambda) {
        doInsert(whiteDateAdjustment, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDateAdjustment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = new UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *         public void specify(WhiteDateAdjustmentCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDateAdjustmentBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteDateAdjustment, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDateAdjustment whiteDateAdjustment, WOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        doUpdate(whiteDateAdjustment, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDateAdjustment The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDateAdjustment whiteDateAdjustment, WOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> insertOpLambda, WOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> updateOpLambda) {
        doInsertOrUpdate(whiteDateAdjustment, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDateAdjustment The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDateAdjustment whiteDateAdjustment, WOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        doDelete(whiteDateAdjustment, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDateAdjustment> whiteDateAdjustmentList, WOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> opLambda) {
        return doBatchInsert(whiteDateAdjustmentList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList, WOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        return doBatchUpdate(whiteDateAdjustmentList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDateAdjustment> whiteDateAdjustmentList, WOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        return doBatchDelete(whiteDateAdjustmentList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> manyArgLambda, WOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = new UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void specify(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteDateAdjustment, cb, option);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDateAdjustment whiteDateAdjustment, CBCall<WhiteDateAdjustmentCB> cbLambda, WOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryUpdate(whiteDateAdjustment, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = new UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void specify(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDateAdjustmentBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteDateAdjustment, cb, option);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb, WOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryUpdate(whiteDateAdjustment, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteDateAdjustmentCB> cbLambda, WOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDateAdjustmentCB cb, WOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteDateAdjustmentBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteDateAdjustmentBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteDateAdjustmentBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteDateAdjustmentBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteDateAdjustmentBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteDateAdjustmentBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteDateAdjustmentBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteDateAdjustmentBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteDateAdjustmentBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteDateAdjustmentBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteDateAdjustmentBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteDateAdjustmentBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteDateAdjustmentBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteDateAdjustmentBhv.outideSql().removeBlockComment().selectList()
     * whiteDateAdjustmentBhv.outideSql().removeLineComment().selectList()
     * whiteDateAdjustmentBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteDateAdjustmentBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteDateAdjustmentBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteDateAdjustment> typeOfSelectedEntity() { return WhiteDateAdjustment.class; }
    protected Class<WhiteDateAdjustment> typeOfHandlingEntity() { return WhiteDateAdjustment.class; }
    protected Class<WhiteDateAdjustmentCB> typeOfHandlingConditionBean() { return WhiteDateAdjustmentCB.class; }
}
