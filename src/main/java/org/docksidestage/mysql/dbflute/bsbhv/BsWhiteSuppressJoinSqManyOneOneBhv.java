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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOneOneBhv extends AbstractBehaviorWritable<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqManyOneOneDbm asDBMeta() { return WhiteSuppressJoinSqManyOneOneDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_suppress_join_sq_many_one_one"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqManyOneOneCB newConditionBean() { return new WhiteSuppressJoinSqManyOneOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqManyOneOneCB cb) {
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
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneOne</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneOne</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOneOne> selectEntity(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteSuppressJoinSqManyOneOne <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteSuppressJoinSqManyOneOne.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteSuppressJoinSqManyOneOne <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteSuppressJoinSqManyOneOne.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOneOne> selectEntity(WhiteSuppressJoinSqManyOneOneCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSuppressJoinSqManyOneOne> facadeSelectEntity(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqManyOneOneCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneOne <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOneOne selectEntityWithDeletedCheck(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().set...;
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqManyOneOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOneOne selectEntityWithDeletedCheck(WhiteSuppressJoinSqManyOneOneCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param manyOneOneId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOneOne> selectByPK(Integer manyOneOneId) {
        return facadeSelectByPK(manyOneOneId);
    }

    protected OptionalEntity<WhiteSuppressJoinSqManyOneOne> facadeSelectByPK(Integer manyOneOneId) {
        return doSelectOptionalByPK(manyOneOneId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> ENTITY doSelectByPK(Integer manyOneOneId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(manyOneOneId), tp);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer manyOneOneId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(manyOneOneId, tp), manyOneOneId);
    }

    protected WhiteSuppressJoinSqManyOneOneCB xprepareCBAsPK(Integer manyOneOneId) {
        assertObjectNotNull("manyOneOneId", manyOneOneId);
        return newConditionBean().acceptPK(manyOneOneId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteSuppressJoinSqManyOneOne&gt; <span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOneOne <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span> : <span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span>) {
     *     ... = <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqManyOneOne> selectList(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteSuppressJoinSqManyOneOne&gt; <span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : <span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span>) {
     *     ... = whiteSuppressJoinSqManyOneOne.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqManyOneOne> selectList(WhiteSuppressJoinSqManyOneOneCB cb) {
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
     * PagingResultBean&lt;WhiteSuppressJoinSqManyOneOne&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : <span style="color: #553000">page</span>) {
     *     ... = whiteSuppressJoinSqManyOneOne.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqManyOneOne> selectPage(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqManyOneOne&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : <span style="color: #553000">page</span>) {
     *     ... = whiteSuppressJoinSqManyOneOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqManyOneOne> selectPage(WhiteSuppressJoinSqManyOneOneCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSuppressJoinSqManyOneOne. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda, EntityRowHandler<WhiteSuppressJoinSqManyOneOne> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqManyOneOne. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqManyOneOneCB cb, EntityRowHandler<WhiteSuppressJoinSqManyOneOne> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSuppressJoinSqManyOneOneCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteSuppressJoinSqManyOneOneList The entity list of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqManyOneOne> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqManyOneOneList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSqManyOneOne().ready(whiteSuppressJoinSqManyOneOneList, _behaviorSelector));
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
     * @param whiteSuppressJoinSqManyOneOne The entity of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqManyOneOne> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqManyOneOne, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSqManyOneOne().ready(xnewLRAryLs(whiteSuppressJoinSqManyOneOne), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyOneList by the set-upper of referrer. <br>
     * WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqManyOne</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span>, <span style="color: #553000">oneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">oneCB</span>.setupSelect...
     *     <span style="color: #553000">oneCB</span>.query().set...
     *     <span style="color: #553000">oneCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : <span style="color: #553000">whiteSuppressJoinSqManyOneOneList</span>) {
     *     ... = whiteSuppressJoinSqManyOneOne.<span style="color: #CC4747">getWhiteSuppressJoinSqManyOneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOneOneList The entity list of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOne(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, ConditionBeanSetupper<WhiteSuppressJoinSqManyOneCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqManyOneOneList, refCBLambda);
        return doLoadWhiteSuppressJoinSqManyOne(whiteSuppressJoinSqManyOneOneList, new LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyOneList by the set-upper of referrer. <br>
     * WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqManyOne</span>(<span style="color: #553000">whiteSuppressJoinSqManyOneOne</span>, <span style="color: #553000">oneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">oneCB</span>.setupSelect...
     *     <span style="color: #553000">oneCB</span>.query().set...
     *     <span style="color: #553000">oneCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteSuppressJoinSqManyOneOne</span>.<span style="color: #CC4747">getWhiteSuppressJoinSqManyOneList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, ConditionBeanSetupper<WhiteSuppressJoinSqManyOneCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqManyOneOne, refCBLambda);
        return doLoadWhiteSuppressJoinSqManyOne(xnewLRLs(whiteSuppressJoinSqManyOneOne), new LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSqManyOneOne The entity of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOneOne, loadReferrerOption);
        return loadWhiteSuppressJoinSqManyOne(xnewLRLs(whiteSuppressJoinSqManyOneOne), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSuppressJoinSqManyOneOneList The entity list of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOne(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOneOneList, loadReferrerOption);
        if (whiteSuppressJoinSqManyOneOneList.isEmpty()) { return (NestedReferrerListGateway<WhiteSuppressJoinSqManyOne>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSuppressJoinSqManyOne(whiteSuppressJoinSqManyOneOneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSuppressJoinSqManyOne> doLoadWhiteSuppressJoinSqManyOne(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne> option) {
        return helpLoadReferrerInternally(whiteSuppressJoinSqManyOneOneList, option, "whiteSuppressJoinSqManyOneList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key manyOneOneId.
     * @param whiteSuppressJoinSqManyOneOneList The list of whiteSuppressJoinSqManyOneOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractManyOneOneIdList(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList)
    { return helpExtractListInternally(whiteSuppressJoinSqManyOneOneList, "manyOneOneId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value);
     * whiteSuppressJoinSqManyOneOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">insert</span>(whiteSuppressJoinSqManyOneOne);
     * ... = whiteSuppressJoinSqManyOneOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqManyOneOne The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doInsert(whiteSuppressJoinSqManyOneOne, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * whiteSuppressJoinSqManyOneOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqManyOneOne.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">update</span>(whiteSuppressJoinSqManyOneOne);
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doUpdate(whiteSuppressJoinSqManyOneOne, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteSuppressJoinSqManyOneOne The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doInsertOrUpdate(whiteSuppressJoinSqManyOneOne, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * whiteSuppressJoinSqManyOneOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqManyOneOne.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">delete</span>(whiteSuppressJoinSqManyOneOne);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doDelete(whiteSuppressJoinSqManyOneOne, null);
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
     *     WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     *     whiteSuppressJoinSqManyOneOne.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSuppressJoinSqManyOneOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqManyOneOneList.add(whiteSuppressJoinSqManyOneOne);
     * }
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteSuppressJoinSqManyOneOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        return doBatchInsert(whiteSuppressJoinSqManyOneOneList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     *     whiteSuppressJoinSqManyOneOne.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSuppressJoinSqManyOneOne.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteSuppressJoinSqManyOneOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqManyOneOneList.add(whiteSuppressJoinSqManyOneOne);
     * }
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteSuppressJoinSqManyOneOneList);
     * </pre>
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        return doBatchUpdate(whiteSuppressJoinSqManyOneOneList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        return doBatchDelete(whiteSuppressJoinSqManyOneOneList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public ConditionBean setup(WhiteSuppressJoinSqManyOneOne entity, WhiteSuppressJoinSqManyOneOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSuppressJoinSqManyOneOne, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return doQueryUpdate(whiteSuppressJoinSqManyOneOne, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSuppressJoinSqManyOneOne, cb);
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqManyOneOne, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqManyOneOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqManyOneOneCB cb) {
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
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value);
     * whiteSuppressJoinSqManyOneOne.setBar...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteSuppressJoinSqManyOneOne, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteSuppressJoinSqManyOneOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, InsertOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        doInsert(whiteSuppressJoinSqManyOneOne, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * whiteSuppressJoinSqManyOneOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOneOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqManyOneOne.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteSuppressJoinSqManyOneOne, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, UpdateOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        doUpdate(whiteSuppressJoinSqManyOneOne, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqManyOneOne The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, InsertOption<WhiteSuppressJoinSqManyOneOneCB>> insertOpLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, UpdateOption<WhiteSuppressJoinSqManyOneOneCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSuppressJoinSqManyOneOne, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqManyOneOne The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, DeleteOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        doDelete(whiteSuppressJoinSqManyOneOne, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, InsertOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doBatchInsert(whiteSuppressJoinSqManyOneOneList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, UpdateOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doBatchUpdate(whiteSuppressJoinSqManyOneOneList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, DeleteOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doBatchDelete(whiteSuppressJoinSqManyOneOneList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> manyArgLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, InsertOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOneOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSuppressJoinSqManyOneOne, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, UpdateOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSqManyOneOne, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOneOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneOneCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSuppressJoinSqManyOneOne, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB cb, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, UpdateOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSqManyOneOne, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqManyOneOneBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqManyOneOne, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSuppressJoinSqManyOneOneCB> cbLambda, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, DeleteOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqManyOneOneCB cb, WritableOptionCall<WhiteSuppressJoinSqManyOneOneCB, DeleteOption<WhiteSuppressJoinSqManyOneOneCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().removeBlockComment().selectList()
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().removeLineComment().selectList()
     * whiteSuppressJoinSqManyOneOneBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteSuppressJoinSqManyOneOneBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSuppressJoinSqManyOneOne> typeOfSelectedEntity() { return WhiteSuppressJoinSqManyOneOne.class; }
    protected Class<WhiteSuppressJoinSqManyOneOne> typeOfHandlingEntity() { return WhiteSuppressJoinSqManyOneOne.class; }
    protected Class<WhiteSuppressJoinSqManyOneOneCB> typeOfHandlingConditionBean() { return WhiteSuppressJoinSqManyOneOneCB.class; }
}
