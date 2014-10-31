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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     MANY_ONE_ID
 *
 * [column]
 *     MANY_ONE_ID, MANY_ONE_NAME, MANY_ONE_ONE_ID
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
 *     white_suppress_join_sq_many_one_one
 *
 * [referrer table]
 *     white_suppress_join_sq_many
 *
 * [foreign property]
 *     whiteSuppressJoinSqManyOneOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOneBhv extends AbstractBehaviorWritable<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqManyOneDbm getDBMeta() { return WhiteSuppressJoinSqManyOneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqManyOneCB newConditionBean() { return new WhiteSuppressJoinSqManyOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqManyOneCB cb) {
        return facadeSelectCount(cb);
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
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteSuppressJoinSqManyOne</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteSuppressJoinSqManyOne</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteSuppressJoinSqManyOne</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteSuppressJoinSqManyOne</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOne> selectEntity(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteSuppressJoinSqManyOne <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteSuppressJoinSqManyOne.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteSuppressJoinSqManyOne <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteSuppressJoinSqManyOne.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOne> selectEntity(WhiteSuppressJoinSqManyOneCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSuppressJoinSqManyOne> facadeSelectEntity(WhiteSuppressJoinSqManyOneCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqManyOneCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqManyOne <span style="color: #553000">whiteSuppressJoinSqManyOne</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteSuppressJoinSqManyOne</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOne selectEntityWithDeletedCheck(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().set...;
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqManyOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOne selectEntityWithDeletedCheck(WhiteSuppressJoinSqManyOneCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param manyOneId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOne> selectByPK(Integer manyOneId) {
        return facadeSelectByPK(manyOneId);
    }

    protected OptionalEntity<WhiteSuppressJoinSqManyOne> facadeSelectByPK(Integer manyOneId) {
        return doSelectOptionalByPK(manyOneId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> ENTITY doSelectByPK(Integer manyOneId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(manyOneId), tp);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer manyOneId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(manyOneId, tp), manyOneId);
    }

    protected WhiteSuppressJoinSqManyOneCB xprepareCBAsPK(Integer manyOneId) {
        assertObjectNotNull("manyOneId", manyOneId);
        return newConditionBean().acceptPK(manyOneId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteSuppressJoinSqManyOne&gt; <span style="color: #553000">whiteSuppressJoinSqManyOneList</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOne <span style="color: #553000">whiteSuppressJoinSqManyOne</span> : <span style="color: #553000">whiteSuppressJoinSqManyOneList</span>) {
     *     ... = <span style="color: #553000">whiteSuppressJoinSqManyOne</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqManyOne> selectList(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteSuppressJoinSqManyOne&gt; <span style="color: #553000">whiteSuppressJoinSqManyOneList</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : <span style="color: #553000">whiteSuppressJoinSqManyOneList</span>) {
     *     ... = whiteSuppressJoinSqManyOne.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqManyOne> selectList(WhiteSuppressJoinSqManyOneCB cb) {
        return facadeSelectList(cb);
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
     * PagingResultBean&lt;WhiteSuppressJoinSqManyOne&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : <span style="color: #553000">page</span>) {
     *     ... = whiteSuppressJoinSqManyOne.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqManyOne> selectPage(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqManyOne&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : <span style="color: #553000">page</span>) {
     *     ... = whiteSuppressJoinSqManyOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqManyOne> selectPage(WhiteSuppressJoinSqManyOneCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSuppressJoinSqManyOne. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda, EntityRowHandler<WhiteSuppressJoinSqManyOne> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqManyOne. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqManyOneCB cb, EntityRowHandler<WhiteSuppressJoinSqManyOne> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSuppressJoinSqManyOneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * Load referrer for the list by the the referrer loader.
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
     * @param whiteSuppressJoinSqManyOneList The entity list of whiteSuppressJoinSqManyOne. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqManyOne> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqManyOneList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSqManyOne().ready(whiteSuppressJoinSqManyOneList, _behaviorSelector));
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
     * @param whiteSuppressJoinSqManyOne The entity of whiteSuppressJoinSqManyOne. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqManyOne> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqManyOne, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSqManyOne().ready(xnewLRAryLs(whiteSuppressJoinSqManyOne), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br>
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqManyList</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneList</span>, <span style="color: #553000">manyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">manyCB</span>.setupSelect...
     *     <span style="color: #553000">manyCB</span>.query().set...
     *     <span style="color: #553000">manyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : <span style="color: #553000">whiteSuppressJoinSqManyOneList</span>) {
     *     ... = whiteSuppressJoinSqManyOne.<span style="color: #CC4747">getWhiteSuppressJoinSqManyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOneList The entity list of whiteSuppressJoinSqManyOne. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqManyOneList, refCBLambda);
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqManyOneList, new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br>
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqManyList</span>(<span style="color: #553000">whiteSuppressJoinSqManyOne</span>, <span style="color: #553000">manyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">manyCB</span>.setupSelect...
     *     <span style="color: #553000">manyCB</span>.query().set...
     *     <span style="color: #553000">manyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteSuppressJoinSqManyOne</span>.<span style="color: #CC4747">getWhiteSuppressJoinSqManyList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of whiteSuppressJoinSqManyOne. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqManyOne, refCBLambda);
        return doLoadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSqManyOne), new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSqManyOne The entity of whiteSuppressJoinSqManyOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOne, loadReferrerOption);
        return loadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSqManyOne), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSuppressJoinSqManyOneList The entity list of whiteSuppressJoinSqManyOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOneList, loadReferrerOption);
        if (whiteSuppressJoinSqManyOneList.isEmpty()) { return (NestedReferrerListGateway<WhiteSuppressJoinSqMany>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqManyOneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSuppressJoinSqMany> doLoadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> option) {
        return helpLoadReferrerInternally(whiteSuppressJoinSqManyOneList, option, "whiteSuppressJoinSqManyList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSuppressJoinSqManyOneOne'.
     * @param whiteSuppressJoinSqManyOneList The list of whiteSuppressJoinSqManyOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSqManyOneOne> pulloutWhiteSuppressJoinSqManyOneOne(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList)
    { return helpPulloutInternally(whiteSuppressJoinSqManyOneList, "whiteSuppressJoinSqManyOneOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key manyOneId.
     * @param whiteSuppressJoinSqManyOneList The list of whiteSuppressJoinSqManyOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractManyOneIdList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList)
    { return helpExtractListInternally(whiteSuppressJoinSqManyOneList, "manyOneId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value);
     * whiteSuppressJoinSqManyOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">insert</span>(whiteSuppressJoinSqManyOne);
     * ... = whiteSuppressJoinSqManyOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqManyOne The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doInsert(whiteSuppressJoinSqManyOne, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * whiteSuppressJoinSqManyOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqManyOne.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">update</span>(whiteSuppressJoinSqManyOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doUpdate(whiteSuppressJoinSqManyOne, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSuppressJoinSqManyOne The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doInsertOrUpdate(whiteSuppressJoinSqManyOne, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * whiteSuppressJoinSqManyOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqManyOne.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">delete</span>(whiteSuppressJoinSqManyOne);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doDelete(whiteSuppressJoinSqManyOne, null);
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
     *     WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     *     whiteSuppressJoinSqManyOne.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSuppressJoinSqManyOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqManyOneList.add(whiteSuppressJoinSqManyOne);
     * }
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteSuppressJoinSqManyOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        return doBatchInsert(whiteSuppressJoinSqManyOneList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     *     whiteSuppressJoinSqManyOne.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSuppressJoinSqManyOne.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteSuppressJoinSqManyOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqManyOneList.add(whiteSuppressJoinSqManyOne);
     * }
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteSuppressJoinSqManyOneList);
     * </pre>
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        return doBatchUpdate(whiteSuppressJoinSqManyOneList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        return doBatchDelete(whiteSuppressJoinSqManyOneList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public ConditionBean setup(WhiteSuppressJoinSqManyOne entity, WhiteSuppressJoinSqManyOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSuppressJoinSqManyOne, cb);
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return doQueryUpdate(whiteSuppressJoinSqManyOne, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSuppressJoinSqManyOne, cb);
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqManyOne, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqManyOne, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqManyOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqManyOneCB cb) {
        return doQueryDelete(cb, null);
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
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value);
     * whiteSuppressJoinSqManyOne.setBar...(value);
     * InsertOption&lt;WhiteSuppressJoinSqManyOneCB&gt; option = new InsertOption&lt;WhiteSuppressJoinSqManyOneCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteSuppressJoinSqManyOne, option);
     * ... = whiteSuppressJoinSqManyOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, InsertOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        doInsert(whiteSuppressJoinSqManyOne, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * whiteSuppressJoinSqManyOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqManyOne.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqManyOneCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteSuppressJoinSqManyOne, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, UpdateOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        doUpdate(whiteSuppressJoinSqManyOne, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqManyOne The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, InsertOption<WhiteSuppressJoinSqManyOneCB>> insertOpLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, UpdateOption<WhiteSuppressJoinSqManyOneCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSuppressJoinSqManyOne, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqManyOne The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, DeleteOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        doDelete(whiteSuppressJoinSqManyOne, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, InsertOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doBatchInsert(whiteSuppressJoinSqManyOneList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, UpdateOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doBatchUpdate(whiteSuppressJoinSqManyOneList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, DeleteOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doBatchDelete(whiteSuppressJoinSqManyOneList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> manyArgLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, InsertOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqManyOneCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSuppressJoinSqManyOne, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, UpdateOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSqManyOne, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqManyOneCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSuppressJoinSqManyOne, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB cb, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, UpdateOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSqManyOne, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSuppressJoinSqManyOneCB> cbLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, DeleteOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqManyOneCB cb, WritableOptionCall<WhiteSuppressJoinSqManyOneCB, DeleteOption<WhiteSuppressJoinSqManyOneCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSuppressJoinSqManyOneBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSuppressJoinSqManyOneBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqManyOneBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSuppressJoinSqManyOneBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqManyOneBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSuppressJoinSqManyOneBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSuppressJoinSqManyOneBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSuppressJoinSqManyOneBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSuppressJoinSqManyOneBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSuppressJoinSqManyOneBhv.outideSql().removeBlockComment().selectList()
     * whiteSuppressJoinSqManyOneBhv.outideSql().removeLineComment().selectList()
     * whiteSuppressJoinSqManyOneBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqManyOneBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSuppressJoinSqManyOneBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSuppressJoinSqManyOne> typeOfSelectedEntity() { return WhiteSuppressJoinSqManyOne.class; }
    protected Class<WhiteSuppressJoinSqManyOne> typeOfHandlingEntity() { return WhiteSuppressJoinSqManyOne.class; }
    protected Class<WhiteSuppressJoinSqManyOneCB> typeOfHandlingConditionBean() { return WhiteSuppressJoinSqManyOneCB.class; }
}
