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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ as TABLE. <br />
 * <pre>
 * [primary key]
 *     SUPPRESS_JOIN_SQ_ID
 *
 * [column]
 *     SUPPRESS_JOIN_SQ_ID, SUPPRESS_JOIN_SQ_NAME
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
 *     white_suppress_join_sq_one(AsOne)
 *
 * [referrer table]
 *     white_suppress_join_sq_many, white_suppress_join_sq_one
 *
 * [foreign property]
 *     whiteSuppressJoinSqOneAsOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqBhv extends AbstractBehaviorWritable<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqDbm getDBMeta() { return WhiteSuppressJoinSqDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqCB newConditionBean() { return new WhiteSuppressJoinSqCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqCB cb) {
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
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteSuppressJoinSq&gt; entity = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteSuppressJoinSq -&gt; {
     *     ...
     * });
     * WhiteSuppressJoinSq whiteSuppressJoinSq = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteSuppressJoinSq -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteSuppressJoinSq whiteSuppressJoinSq = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSq> selectEntity(CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteSuppressJoinSq&gt; entity = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteSuppressJoinSq -&gt; {
     *     ...
     * });
     * WhiteSuppressJoinSq whiteSuppressJoinSq = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteSuppressJoinSq -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteSuppressJoinSq whiteSuppressJoinSq = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSq> selectEntity(WhiteSuppressJoinSqCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSuppressJoinSq> facadeSelectEntity(WhiteSuppressJoinSqCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSq whiteSuppressJoinSq = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSq.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSq selectEntityWithDeletedCheck(CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSq whiteSuppressJoinSq = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSq.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSq selectEntityWithDeletedCheck(WhiteSuppressJoinSqCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param suppressJoinSqId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSq> selectByPK(Integer suppressJoinSqId) {
        return facadeSelectByPK(suppressJoinSqId);
    }

    protected OptionalEntity<WhiteSuppressJoinSq> facadeSelectByPK(Integer suppressJoinSqId) {
        return doSelectOptionalByPK(suppressJoinSqId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> ENTITY doSelectByPK(Integer suppressJoinSqId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(suppressJoinSqId), tp);
    }

    protected <ENTITY extends WhiteSuppressJoinSq> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer suppressJoinSqId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(suppressJoinSqId, tp), suppressJoinSqId);
    }

    protected WhiteSuppressJoinSqCB xprepareCBAsPK(Integer suppressJoinSqId) {
        assertObjectNotNull("suppressJoinSqId", suppressJoinSqId);
        return newConditionBean().acceptPK(suppressJoinSqId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSq&gt; whiteSuppressJoinSqList = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : whiteSuppressJoinSqList) {
     *     ... = whiteSuppressJoinSq.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSq> selectList(CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSq&gt; whiteSuppressJoinSqList = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : whiteSuppressJoinSqList) {
     *     ... = whiteSuppressJoinSq.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSq> selectList(WhiteSuppressJoinSqCB cb) {
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
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSq&gt; page = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : page) {
     *     ... = whiteSuppressJoinSq.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSq> selectPage(CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSq&gt; page = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : page) {
     *     ... = whiteSuppressJoinSq.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSq> selectPage(WhiteSuppressJoinSqCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSq&gt;() {
     *     public void handle(WhiteSuppressJoinSq entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSuppressJoinSq. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSuppressJoinSqCB> cbLambda, EntityRowHandler<WhiteSuppressJoinSq> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSq&gt;() {
     *     public void handle(WhiteSuppressJoinSq entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSq. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqCB cb, EntityRowHandler<WhiteSuppressJoinSq> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSuppressJoinSqCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteSuppressJoinSqList The entity list of whiteSuppressJoinSq. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSq> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSq().ready(whiteSuppressJoinSqList, _behaviorSelector));
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
     * @param whiteSuppressJoinSq The entity of whiteSuppressJoinSq. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSuppressJoinSq whiteSuppressJoinSq, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSq> loaderLambda) {
        xassLRArg(whiteSuppressJoinSq, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSq().ready(xnewLRAryLs(whiteSuppressJoinSq), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyList</span>(whiteSuppressJoinSqList, manyCB -&gt; {
     *     manyCB.setupSelect...();
     *     manyCB.query().setFoo...(value);
     *     manyCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : whiteSuppressJoinSqList) {
     *     ... = whiteSuppressJoinSq.<span style="color: #DD4747">getWhiteSuppressJoinSqManyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSuppressJoinSqId_InScope(pkList);
     * cb.query().addOrderBy_SuppressJoinSqId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqList The entity list of whiteSuppressJoinSq. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqList, refCBLambda);
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqList, new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyList</span>(whiteSuppressJoinSqList, manyCB -&gt; {
     *     manyCB.setupSelect...();
     *     manyCB.query().setFoo...(value);
     *     manyCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSuppressJoinSq.<span style="color: #DD4747">getWhiteSuppressJoinSqManyList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSuppressJoinSqId_InScope(pkList);
     * cb.query().addOrderBy_SuppressJoinSqId_Asc();
     * </pre>
     * @param whiteSuppressJoinSq The entity of whiteSuppressJoinSq. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSq whiteSuppressJoinSq, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSq, refCBLambda);
        return doLoadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSq), new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSq The entity of whiteSuppressJoinSq. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSq whiteSuppressJoinSq, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSq, loadReferrerOption);
        return loadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSq), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSuppressJoinSqList The entity list of whiteSuppressJoinSq. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqList, loadReferrerOption);
        if (whiteSuppressJoinSqList.isEmpty()) { return (NestedReferrerListGateway<WhiteSuppressJoinSqMany>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSuppressJoinSqMany> doLoadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> option) {
        return helpLoadReferrerInternally(whiteSuppressJoinSqList, option, "whiteSuppressJoinSqManyList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of referrer-as-one table 'WhiteSuppressJoinSqOne'.
     * @param whiteSuppressJoinSqList The list of whiteSuppressJoinSq. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSqOne> pulloutWhiteSuppressJoinSqOneAsOne(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList)
    { return helpPulloutInternally(whiteSuppressJoinSqList, "whiteSuppressJoinSqOneAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key suppressJoinSqId.
     * @param whiteSuppressJoinSqList The list of whiteSuppressJoinSq. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSuppressJoinSqIdList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList)
    { return helpExtractListInternally(whiteSuppressJoinSqList, "suppressJoinSqId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSq.setFoo...(value);
     * whiteSuppressJoinSq.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSq);
     * ... = whiteSuppressJoinSq.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSq The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doInsert(whiteSuppressJoinSq, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * whiteSuppressJoinSq.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSq.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSq.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSq);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSq The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doUpdate(whiteSuppressJoinSq, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSuppressJoinSq The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doInsertOrUpdate(whiteSuppressJoinSq, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * whiteSuppressJoinSq.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSq.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSq);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSq The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doDelete(whiteSuppressJoinSq, null);
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
     *     WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     *     whiteSuppressJoinSq.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSq.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqList.add(whiteSuppressJoinSq);
     * }
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList) {
        return doBatchInsert(whiteSuppressJoinSqList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     *     whiteSuppressJoinSq.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSq.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSq.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSq.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqList.add(whiteSuppressJoinSq);
     * }
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqList);
     * </pre>
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList) {
        return doBatchUpdate(whiteSuppressJoinSqList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList) {
        return doBatchDelete(whiteSuppressJoinSqList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSq, WhiteSuppressJoinSqCB&gt;() {
     *     public ConditionBean setup(WhiteSuppressJoinSq entity, WhiteSuppressJoinSqCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setPK...(value);</span>
     * whiteSuppressJoinSq.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setVersionNo(value);</span>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSq, cb);
     * </pre>
     * @param whiteSuppressJoinSq The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return doQueryUpdate(whiteSuppressJoinSq, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setPK...(value);</span>
     * whiteSuppressJoinSq.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setVersionNo(value);</span>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSq, cb);
     * </pre>
     * @param whiteSuppressJoinSq The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, WhiteSuppressJoinSqCB cb) {
        return doQueryUpdate(whiteSuppressJoinSq, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSq, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSuppressJoinSqCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSq, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqCB cb) {
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
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSq.setFoo...(value);
     * whiteSuppressJoinSq.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqCB> option = new InsertOption<WhiteSuppressJoinSqCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSq, option);
     * ... = whiteSuppressJoinSq.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSq The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSq whiteSuppressJoinSq, WOptionCall<WhiteSuppressJoinSqCB, InsertOption<WhiteSuppressJoinSqCB>> opLambda) {
        doInsert(whiteSuppressJoinSq, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * whiteSuppressJoinSq.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSq.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSq.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSq, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSq The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, WOptionCall<WhiteSuppressJoinSqCB, UpdateOption<WhiteSuppressJoinSqCB>> opLambda) {
        doUpdate(whiteSuppressJoinSq, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSq The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, WOptionCall<WhiteSuppressJoinSqCB, InsertOption<WhiteSuppressJoinSqCB>> insertOpLambda, WOptionCall<WhiteSuppressJoinSqCB, UpdateOption<WhiteSuppressJoinSqCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSuppressJoinSq, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSq The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSq whiteSuppressJoinSq, WOptionCall<WhiteSuppressJoinSqCB, DeleteOption<WhiteSuppressJoinSqCB>> opLambda) {
        doDelete(whiteSuppressJoinSq, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, WOptionCall<WhiteSuppressJoinSqCB, InsertOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doBatchInsert(whiteSuppressJoinSqList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, WOptionCall<WhiteSuppressJoinSqCB, UpdateOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doBatchUpdate(whiteSuppressJoinSqList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, WOptionCall<WhiteSuppressJoinSqCB, DeleteOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doBatchDelete(whiteSuppressJoinSqList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> manyArgLambda, WOptionCall<WhiteSuppressJoinSqCB, InsertOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setPK...(value);</span>
     * whiteSuppressJoinSq.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setVersionNo(value);</span>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSq, cb, option);
     * </pre>
     * @param whiteSuppressJoinSq The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, CBCall<WhiteSuppressJoinSqCB> cbLambda, WOptionCall<WhiteSuppressJoinSqCB, UpdateOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSq, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setPK...(value);</span>
     * whiteSuppressJoinSq.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setVersionNo(value);</span>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSq, cb, option);
     * </pre>
     * @param whiteSuppressJoinSq The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, WhiteSuppressJoinSqCB cb, WOptionCall<WhiteSuppressJoinSqCB, UpdateOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSq, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSuppressJoinSqCB> cbLambda, WOptionCall<WhiteSuppressJoinSqCB, DeleteOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqCB cb, WOptionCall<WhiteSuppressJoinSqCB, DeleteOption<WhiteSuppressJoinSqCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSuppressJoinSqBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSuppressJoinSqBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSuppressJoinSqBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSuppressJoinSqBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSuppressJoinSqBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSuppressJoinSqBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSuppressJoinSqBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSuppressJoinSqBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSuppressJoinSqBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSuppressJoinSqBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSuppressJoinSqBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSuppressJoinSqBhv.outideSql().removeBlockComment().selectList()
     * whiteSuppressJoinSqBhv.outideSql().removeLineComment().selectList()
     * whiteSuppressJoinSqBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSuppressJoinSqBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSuppressJoinSq> typeOfSelectedEntity() { return WhiteSuppressJoinSq.class; }
    protected Class<WhiteSuppressJoinSq> typeOfHandlingEntity() { return WhiteSuppressJoinSq.class; }
    protected Class<WhiteSuppressJoinSqCB> typeOfHandlingConditionBean() { return WhiteSuppressJoinSqCB.class; }
}
