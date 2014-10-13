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
 * The behavior of WHITE_SELF_REFERENCE_REF_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_REF_ONE_NAME
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
 *     white_self_reference, WHITE_SELF_REFERENCE(AsDirectParent)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSelfReference, whiteSelfReferenceAsDirectParent
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceRefOneBhv extends AbstractBehaviorWritable<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSelfReferenceRefOneDbm getDBMeta() { return WhiteSelfReferenceRefOneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSelfReferenceRefOneCB newConditionBean() { return new WhiteSelfReferenceRefOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * int count = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * int count = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSelfReferenceRefOneCB cb) {
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
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteSelfReferenceRefOne&gt; entity = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteSelfReferenceRefOne -&gt; {
     *     ...
     * });
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteSelfReferenceRefOne -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSelfReferenceRefOne> selectEntity(CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteSelfReferenceRefOne&gt; entity = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteSelfReferenceRefOne -&gt; {
     *     ...
     * });
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteSelfReferenceRefOne -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSelfReferenceRefOne> selectEntity(WhiteSelfReferenceRefOneCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSelfReferenceRefOne> facadeSelectEntity(WhiteSelfReferenceRefOneCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSelfReferenceRefOneCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSelfReferenceRefOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReferenceRefOne selectEntityWithDeletedCheck(CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSelfReferenceRefOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReferenceRefOne selectEntityWithDeletedCheck(WhiteSelfReferenceRefOneCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param selfReferenceId : PK, NotNull, DECIMAL(16), FK to white_self_reference. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSelfReferenceRefOne> selectByPK(Long selfReferenceId) {
        return facadeSelectByPK(selfReferenceId);
    }

    protected OptionalEntity<WhiteSelfReferenceRefOne> facadeSelectByPK(Long selfReferenceId) {
        return doSelectOptionalByPK(selfReferenceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> ENTITY doSelectByPK(Long selfReferenceId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(selfReferenceId), tp);
    }

    protected <ENTITY extends WhiteSelfReferenceRefOne> OptionalEntity<ENTITY> doSelectOptionalByPK(Long selfReferenceId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(selfReferenceId, tp), selfReferenceId);
    }

    protected WhiteSelfReferenceRefOneCB xprepareCBAsPK(Long selfReferenceId) {
        assertObjectNotNull("selfReferenceId", selfReferenceId);
        return newConditionBean().acceptPK(selfReferenceId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSelfReferenceRefOne&gt; whiteSelfReferenceRefOneList = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : whiteSelfReferenceRefOneList) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSelfReferenceRefOne> selectList(CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSelfReferenceRefOne&gt; whiteSelfReferenceRefOneList = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : whiteSelfReferenceRefOneList) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSelfReferenceRefOne> selectList(WhiteSelfReferenceRefOneCB cb) {
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
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSelfReferenceRefOne&gt; page = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : page) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSelfReferenceRefOne> selectPage(CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSelfReferenceRefOne&gt; page = whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSelfReferenceRefOne whiteSelfReferenceRefOne : page) {
     *     ... = whiteSelfReferenceRefOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSelfReferenceRefOne> selectPage(WhiteSelfReferenceRefOneCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSelfReferenceRefOne&gt;() {
     *     public void handle(WhiteSelfReferenceRefOne entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSelfReferenceRefOne. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSelfReferenceRefOneCB> cbLambda, EntityRowHandler<WhiteSelfReferenceRefOne> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSelfReferenceRefOne&gt;() {
     *     public void handle(WhiteSelfReferenceRefOne entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSelfReferenceRefOne. (NotNull)
     */
    public void selectCursor(WhiteSelfReferenceRefOneCB cb, EntityRowHandler<WhiteSelfReferenceRefOne> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSelfReferenceRefOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSelfReferenceRefOneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteSelfReferenceRefOneList The entity list of whiteSelfReferenceRefOne. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, ReferrerLoaderHandler<LoaderOfWhiteSelfReferenceRefOne> loaderLambda) {
        xassLRArg(whiteSelfReferenceRefOneList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSelfReferenceRefOne().ready(whiteSelfReferenceRefOneList, _behaviorSelector));
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
     * @param whiteSelfReferenceRefOne The entity of whiteSelfReferenceRefOne. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, ReferrerLoaderHandler<LoaderOfWhiteSelfReferenceRefOne> loaderLambda) {
        xassLRArg(whiteSelfReferenceRefOne, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSelfReferenceRefOne().ready(xnewLRAryLs(whiteSelfReferenceRefOne), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSelfReference'.
     * @param whiteSelfReferenceRefOneList The list of whiteSelfReferenceRefOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReference> pulloutWhiteSelfReference(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList)
    { return helpPulloutInternally(whiteSelfReferenceRefOneList, "whiteSelfReference"); }

    /**
     * Pull out the list of foreign table 'WhiteSelfReference'.
     * @param whiteSelfReferenceRefOneList The list of whiteSelfReferenceRefOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReference> pulloutWhiteSelfReferenceAsDirectParent(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList)
    { return helpPulloutInternally(whiteSelfReferenceRefOneList, "whiteSelfReferenceAsDirectParent"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key selfReferenceId.
     * @param whiteSelfReferenceRefOneList The list of whiteSelfReferenceRefOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSelfReferenceIdList(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList)
    { return helpExtractListInternally(whiteSelfReferenceRefOneList, "selfReferenceId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReferenceRefOne.setFoo...(value);
     * whiteSelfReferenceRefOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">insert</span>(whiteSelfReferenceRefOne);
     * ... = whiteSelfReferenceRefOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSelfReferenceRefOne The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doInsert(whiteSelfReferenceRefOne, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * whiteSelfReferenceRefOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReferenceRefOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSelfReferenceRefOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">update</span>(whiteSelfReferenceRefOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doUpdate(whiteSelfReferenceRefOne, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSelfReferenceRefOne The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doInsertOrUpdate(whiteSelfReferenceRefOne, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * whiteSelfReferenceRefOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSelfReferenceRefOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">delete</span>(whiteSelfReferenceRefOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne) {
        doDelete(whiteSelfReferenceRefOne, null);
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
     *     WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     *     whiteSelfReferenceRefOne.setFooName("foo");
     *     if (...) {
     *         whiteSelfReferenceRefOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSelfReferenceRefOneList.add(whiteSelfReferenceRefOne);
     * }
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">batchInsert</span>(whiteSelfReferenceRefOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return doBatchInsert(whiteSelfReferenceRefOneList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     *     whiteSelfReferenceRefOne.setFooName("foo");
     *     if (...) {
     *         whiteSelfReferenceRefOne.setFooPrice(123);
     *     } else {
     *         whiteSelfReferenceRefOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSelfReferenceRefOneList.add(whiteSelfReferenceRefOne);
     * }
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSelfReferenceRefOneList);
     * </pre>
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return doBatchUpdate(whiteSelfReferenceRefOneList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList) {
        return doBatchDelete(whiteSelfReferenceRefOneList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB&gt;() {
     *     public ConditionBean setup(WhiteSelfReferenceRefOne entity, WhiteSelfReferenceRefOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setPK...(value);</span>
     * whiteSelfReferenceRefOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setVersionNo(value);</span>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSelfReferenceRefOne, cb);
     * </pre>
     * @param whiteSelfReferenceRefOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return doQueryUpdate(whiteSelfReferenceRefOne, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setPK...(value);</span>
     * whiteSelfReferenceRefOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setVersionNo(value);</span>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSelfReferenceRefOne, cb);
     * </pre>
     * @param whiteSelfReferenceRefOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB cb) {
        return doQueryUpdate(whiteSelfReferenceRefOne, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">queryDelete</span>(whiteSelfReferenceRefOne, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSelfReferenceRefOneCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">queryDelete</span>(whiteSelfReferenceRefOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSelfReferenceRefOneCB cb) {
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
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReferenceRefOne.setFoo...(value);
     * whiteSelfReferenceRefOne.setBar...(value);
     * InsertOption<WhiteSelfReferenceRefOneCB> option = new InsertOption<WhiteSelfReferenceRefOneCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSelfReferenceRefOne, option);
     * ... = whiteSelfReferenceRefOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WOptionCall<WhiteSelfReferenceRefOneCB, InsertOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        doInsert(whiteSelfReferenceRefOne, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * whiteSelfReferenceRefOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReferenceRefOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSelfReferenceRefOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *         public void specify(WhiteSelfReferenceRefOneCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSelfReferenceRefOne, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReferenceRefOne The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WOptionCall<WhiteSelfReferenceRefOneCB, UpdateOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        doUpdate(whiteSelfReferenceRefOne, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSelfReferenceRefOne The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WOptionCall<WhiteSelfReferenceRefOneCB, InsertOption<WhiteSelfReferenceRefOneCB>> insertOpLambda, WOptionCall<WhiteSelfReferenceRefOneCB, UpdateOption<WhiteSelfReferenceRefOneCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSelfReferenceRefOne, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSelfReferenceRefOne The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WOptionCall<WhiteSelfReferenceRefOneCB, DeleteOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        doDelete(whiteSelfReferenceRefOne, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, WOptionCall<WhiteSelfReferenceRefOneCB, InsertOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doBatchInsert(whiteSelfReferenceRefOneList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, WOptionCall<WhiteSelfReferenceRefOneCB, UpdateOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doBatchUpdate(whiteSelfReferenceRefOneList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSelfReferenceRefOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSelfReferenceRefOne> whiteSelfReferenceRefOneList, WOptionCall<WhiteSelfReferenceRefOneCB, DeleteOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doBatchDelete(whiteSelfReferenceRefOneList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB> manyArgLambda, WOptionCall<WhiteSelfReferenceRefOneCB, InsertOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setPK...(value);</span>
     * whiteSelfReferenceRefOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setVersionNo(value);</span>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void specify(WhiteSelfReferenceRefOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSelfReferenceRefOne, cb, option);
     * </pre>
     * @param whiteSelfReferenceRefOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, CBCall<WhiteSelfReferenceRefOneCB> cbLambda, WOptionCall<WhiteSelfReferenceRefOneCB, UpdateOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doQueryUpdate(whiteSelfReferenceRefOne, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSelfReferenceRefOne whiteSelfReferenceRefOne = new WhiteSelfReferenceRefOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setPK...(value);</span>
     * whiteSelfReferenceRefOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReferenceRefOne.setVersionNo(value);</span>
     * WhiteSelfReferenceRefOneCB cb = new WhiteSelfReferenceRefOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceRefOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSelfReferenceRefOneCB&gt;() {
     *     public void specify(WhiteSelfReferenceRefOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSelfReferenceRefOneBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSelfReferenceRefOne, cb, option);
     * </pre>
     * @param whiteSelfReferenceRefOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSelfReferenceRefOne whiteSelfReferenceRefOne, WhiteSelfReferenceRefOneCB cb, WOptionCall<WhiteSelfReferenceRefOneCB, UpdateOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doQueryUpdate(whiteSelfReferenceRefOne, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSelfReferenceRefOneCB> cbLambda, WOptionCall<WhiteSelfReferenceRefOneCB, DeleteOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSelfReferenceRefOne. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSelfReferenceRefOneCB cb, WOptionCall<WhiteSelfReferenceRefOneCB, DeleteOption<WhiteSelfReferenceRefOneCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSelfReferenceRefOneBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSelfReferenceRefOneBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSelfReferenceRefOneBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSelfReferenceRefOneBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSelfReferenceRefOneBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSelfReferenceRefOneBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSelfReferenceRefOneBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSelfReferenceRefOneBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSelfReferenceRefOneBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSelfReferenceRefOneBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSelfReferenceRefOneBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSelfReferenceRefOneBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSelfReferenceRefOneBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSelfReferenceRefOneBhv.outideSql().removeBlockComment().selectList()
     * whiteSelfReferenceRefOneBhv.outideSql().removeLineComment().selectList()
     * whiteSelfReferenceRefOneBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteSelfReferenceRefOneBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSelfReferenceRefOneBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSelfReferenceRefOne> typeOfSelectedEntity() { return WhiteSelfReferenceRefOne.class; }
    protected Class<WhiteSelfReferenceRefOne> typeOfHandlingEntity() { return WhiteSelfReferenceRefOne.class; }
    protected Class<WhiteSelfReferenceRefOneCB> typeOfHandlingConditionBean() { return WhiteSelfReferenceRefOneCB.class; }
}
