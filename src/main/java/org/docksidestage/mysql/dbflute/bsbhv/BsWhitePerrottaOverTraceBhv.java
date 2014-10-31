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
 * The behavior of WHITE_PERROTTA_OVER_TRACE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRACE_ID
 *
 * [column]
 *     TRACE_ID, PREVIOUS_PRODUCT_ID, NEXT_PRODUCT_ID, TRACE_TYPE_CODE
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
 *     white_perrotta_over_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whitePerrottaOverProductByNextProductId, whitePerrottaOverProductByPreviousProductId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverTraceBhv extends AbstractBehaviorWritable<WhitePerrottaOverTrace, WhitePerrottaOverTraceCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePerrottaOverTraceDbm getDBMeta() { return WhitePerrottaOverTraceDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePerrottaOverTraceCB newConditionBean() { return new WhitePerrottaOverTraceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePerrottaOverTraceCB cb) {
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
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whitePerrottaOverTrace</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whitePerrottaOverTrace</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whitePerrottaOverTrace</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whitePerrottaOverTrace</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverTrace> selectEntity(CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whitePerrottaOverTrace <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whitePerrottaOverTrace.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whitePerrottaOverTrace <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whitePerrottaOverTrace.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverTrace> selectEntity(WhitePerrottaOverTraceCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhitePerrottaOverTrace> facadeSelectEntity(WhitePerrottaOverTraceCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverTrace> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePerrottaOverTraceCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverTrace <span style="color: #553000">whitePerrottaOverTrace</span> = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whitePerrottaOverTrace</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverTrace selectEntityWithDeletedCheck(CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().set...;
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverTrace.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverTrace selectEntityWithDeletedCheck(WhitePerrottaOverTraceCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param traceId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverTrace> selectByPK(Long traceId) {
        return facadeSelectByPK(traceId);
    }

    protected OptionalEntity<WhitePerrottaOverTrace> facadeSelectByPK(Long traceId) {
        return doSelectOptionalByPK(traceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverTrace> ENTITY doSelectByPK(Long traceId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(traceId), tp);
    }

    protected <ENTITY extends WhitePerrottaOverTrace> OptionalEntity<ENTITY> doSelectOptionalByPK(Long traceId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(traceId, tp), traceId);
    }

    protected WhitePerrottaOverTraceCB xprepareCBAsPK(Long traceId) {
        assertObjectNotNull("traceId", traceId);
        return newConditionBean().acceptPK(traceId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param previousProductId : UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @param nextProductId : +UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverTrace> selectByUniqueOf(Long previousProductId, Long nextProductId) {
        return facadeSelectByUniqueOf(previousProductId, nextProductId);
    }

    protected OptionalEntity<WhitePerrottaOverTrace> facadeSelectByUniqueOf(Long previousProductId, Long nextProductId) {
        return doSelectByUniqueOf(previousProductId, nextProductId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverTrace> OptionalEntity<ENTITY> doSelectByUniqueOf(Long previousProductId, Long nextProductId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(previousProductId, nextProductId), tp), previousProductId, nextProductId);
    }

    protected WhitePerrottaOverTraceCB xprepareCBAsUniqueOf(Long previousProductId, Long nextProductId) {
        assertObjectNotNull("previousProductId", previousProductId);assertObjectNotNull("nextProductId", nextProductId);
        return newConditionBean().acceptUniqueOf(previousProductId, nextProductId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhitePerrottaOverTrace&gt; <span style="color: #553000">whitePerrottaOverTraceList</span> = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhitePerrottaOverTrace <span style="color: #553000">whitePerrottaOverTrace</span> : <span style="color: #553000">whitePerrottaOverTraceList</span>) {
     *     ... = <span style="color: #553000">whitePerrottaOverTrace</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverTrace> selectList(CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhitePerrottaOverTrace&gt; <span style="color: #553000">whitePerrottaOverTraceList</span> = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhitePerrottaOverTrace whitePerrottaOverTrace : <span style="color: #553000">whitePerrottaOverTraceList</span>) {
     *     ... = whitePerrottaOverTrace.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverTrace> selectList(WhitePerrottaOverTraceCB cb) {
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
     * PagingResultBean&lt;WhitePerrottaOverTrace&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhitePerrottaOverTrace whitePerrottaOverTrace : <span style="color: #553000">page</span>) {
     *     ... = whitePerrottaOverTrace.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverTrace> selectPage(CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverTrace&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhitePerrottaOverTrace whitePerrottaOverTrace : <span style="color: #553000">page</span>) {
     *     ... = whitePerrottaOverTrace.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverTrace> selectPage(WhitePerrottaOverTraceCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @param entityLambda The handler of entity row of WhitePerrottaOverTrace. (NotNull)
     */
    public void selectCursor(CBCall<WhitePerrottaOverTraceCB> cbLambda, EntityRowHandler<WhitePerrottaOverTrace> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().set...
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePerrottaOverTrace. (NotNull)
     */
    public void selectCursor(WhitePerrottaOverTraceCB cb, EntityRowHandler<WhitePerrottaOverTrace> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePerrottaOverTraceCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whitePerrottaOverTraceList The entity list of whitePerrottaOverTrace. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverTrace> loaderLambda) {
        xassLRArg(whitePerrottaOverTraceList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverTrace().ready(whitePerrottaOverTraceList, _behaviorSelector));
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
     * @param whitePerrottaOverTrace The entity of whitePerrottaOverTrace. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePerrottaOverTrace whitePerrottaOverTrace, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverTrace> loaderLambda) {
        xassLRArg(whitePerrottaOverTrace, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverTrace().ready(xnewLRAryLs(whitePerrottaOverTrace), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhitePerrottaOverProduct'.
     * @param whitePerrottaOverTraceList The list of whitePerrottaOverTrace. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePerrottaOverProduct> pulloutWhitePerrottaOverProductByNextProductId(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList)
    { return helpPulloutInternally(whitePerrottaOverTraceList, "whitePerrottaOverProductByNextProductId"); }

    /**
     * Pull out the list of foreign table 'WhitePerrottaOverProduct'.
     * @param whitePerrottaOverTraceList The list of whitePerrottaOverTrace. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePerrottaOverProduct> pulloutWhitePerrottaOverProductByPreviousProductId(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList)
    { return helpPulloutInternally(whitePerrottaOverTraceList, "whitePerrottaOverProductByPreviousProductId"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key traceId.
     * @param whitePerrottaOverTraceList The list of whitePerrottaOverTrace. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTraceIdList(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList)
    { return helpExtractListInternally(whitePerrottaOverTraceList, "traceId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverTrace.setFoo...(value);
     * whitePerrottaOverTrace.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.set...;</span>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">insert</span>(whitePerrottaOverTrace);
     * ... = whitePerrottaOverTrace.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePerrottaOverTrace The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePerrottaOverTrace whitePerrottaOverTrace) {
        doInsert(whitePerrottaOverTrace, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * whitePerrottaOverTrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverTrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverTrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">update</span>(whitePerrottaOverTrace);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverTrace The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePerrottaOverTrace whitePerrottaOverTrace) {
        doUpdate(whitePerrottaOverTrace, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePerrottaOverTrace The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace) {
        doInsertOrUpdate(whitePerrottaOverTrace, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * whitePerrottaOverTrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverTrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">delete</span>(whitePerrottaOverTrace);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverTrace The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePerrottaOverTrace whitePerrottaOverTrace) {
        doDelete(whitePerrottaOverTrace, null);
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
     *     WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     *     whitePerrottaOverTrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whitePerrottaOverTrace.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePerrottaOverTraceList.add(whitePerrottaOverTrace);
     * }
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">batchInsert</span>(whitePerrottaOverTraceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePerrottaOverTraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList) {
        return doBatchInsert(whitePerrottaOverTraceList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     *     whitePerrottaOverTrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whitePerrottaOverTrace.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whitePerrottaOverTrace.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePerrottaOverTrace.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePerrottaOverTraceList.add(whitePerrottaOverTrace);
     * }
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whitePerrottaOverTraceList);
     * </pre>
     * @param whitePerrottaOverTraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList) {
        return doBatchUpdate(whitePerrottaOverTraceList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePerrottaOverTraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList) {
        return doBatchDelete(whitePerrottaOverTraceList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePerrottaOverTrace, WhitePerrottaOverTraceCB&gt;() {
     *     public ConditionBean setup(WhitePerrottaOverTrace entity, WhitePerrottaOverTraceCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePerrottaOverTrace, WhitePerrottaOverTraceCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setPK...(value);</span>
     * whitePerrottaOverTrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setVersionNo(value);</span>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whitePerrottaOverTrace, cb);
     * </pre>
     * @param whitePerrottaOverTrace The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace, CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return doQueryUpdate(whitePerrottaOverTrace, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setPK...(value);</span>
     * whitePerrottaOverTrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setVersionNo(value);</span>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whitePerrottaOverTrace, cb);
     * </pre>
     * @param whitePerrottaOverTrace The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace, WhitePerrottaOverTraceCB cb) {
        return doQueryUpdate(whitePerrottaOverTrace, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">queryDelete</span>(whitePerrottaOverTrace, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhitePerrottaOverTraceCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">queryDelete</span>(whitePerrottaOverTrace, cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePerrottaOverTraceCB cb) {
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
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverTrace.setFoo...(value);
     * whitePerrottaOverTrace.setBar...(value);
     * InsertOption&lt;WhitePerrottaOverTraceCB&gt; option = new InsertOption&lt;WhitePerrottaOverTraceCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whitePerrottaOverTrace, option);
     * ... = whitePerrottaOverTrace.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePerrottaOverTrace The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePerrottaOverTrace whitePerrottaOverTrace, WritableOptionCall<WhitePerrottaOverTraceCB, InsertOption<WhitePerrottaOverTraceCB>> opLambda) {
        doInsert(whitePerrottaOverTrace, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * whitePerrottaOverTrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverTrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverTrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePerrottaOverTraceCB&gt; option = new UpdateOption&lt;WhitePerrottaOverTraceCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *         public void specify(WhitePerrottaOverTraceCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whitePerrottaOverTrace, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverTrace The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace, WritableOptionCall<WhitePerrottaOverTraceCB, UpdateOption<WhitePerrottaOverTraceCB>> opLambda) {
        doUpdate(whitePerrottaOverTrace, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePerrottaOverTrace The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace, WritableOptionCall<WhitePerrottaOverTraceCB, InsertOption<WhitePerrottaOverTraceCB>> insertOpLambda, WritableOptionCall<WhitePerrottaOverTraceCB, UpdateOption<WhitePerrottaOverTraceCB>> updateOpLambda) {
        doInsertOrUpdate(whitePerrottaOverTrace, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whitePerrottaOverTrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePerrottaOverTrace whitePerrottaOverTrace, WritableOptionCall<WhitePerrottaOverTraceCB, DeleteOption<WhitePerrottaOverTraceCB>> opLambda) {
        doDelete(whitePerrottaOverTrace, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whitePerrottaOverTraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList, WritableOptionCall<WhitePerrottaOverTraceCB, InsertOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doBatchInsert(whitePerrottaOverTraceList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePerrottaOverTraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList, WritableOptionCall<WhitePerrottaOverTraceCB, UpdateOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doBatchUpdate(whitePerrottaOverTraceList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whitePerrottaOverTraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePerrottaOverTrace> whitePerrottaOverTraceList, WritableOptionCall<WhitePerrottaOverTraceCB, DeleteOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doBatchDelete(whitePerrottaOverTraceList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePerrottaOverTrace, WhitePerrottaOverTraceCB> manyArgLambda, WritableOptionCall<WhitePerrottaOverTraceCB, InsertOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setPK...(value);</span>
     * whitePerrottaOverTrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setVersionNo(value);</span>
     * WhitePerrottaOverTraceCB cb = new WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverTraceCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhitePerrottaOverTraceCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void specify(WhitePerrottaOverTraceCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whitePerrottaOverTrace, cb, option);
     * </pre>
     * @param whitePerrottaOverTrace The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace, CBCall<WhitePerrottaOverTraceCB> cbLambda, WritableOptionCall<WhitePerrottaOverTraceCB, UpdateOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverTrace, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverTrace whitePerrottaOverTrace = <span style="color: #70226C">new</span> WhitePerrottaOverTrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setPK...(value);</span>
     * whitePerrottaOverTrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverTrace.setVersionNo(value);</span>
     * WhitePerrottaOverTraceCB cb = <span style="color: #70226C">new</span> WhitePerrottaOverTraceCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverTraceCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhitePerrottaOverTraceCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverTraceCB&gt;() {
     *     public void specify(WhitePerrottaOverTraceCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whitePerrottaOverTraceBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whitePerrottaOverTrace, cb, option);
     * </pre>
     * @param whitePerrottaOverTrace The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverTrace whitePerrottaOverTrace, WhitePerrottaOverTraceCB cb, WritableOptionCall<WhitePerrottaOverTraceCB, UpdateOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverTrace, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhitePerrottaOverTraceCB> cbLambda, WritableOptionCall<WhitePerrottaOverTraceCB, DeleteOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePerrottaOverTrace. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePerrottaOverTraceCB cb, WritableOptionCall<WhitePerrottaOverTraceCB, DeleteOption<WhitePerrottaOverTraceCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whitePerrottaOverTraceBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whitePerrottaOverTraceBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverTraceBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whitePerrottaOverTraceBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverTraceBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whitePerrottaOverTraceBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whitePerrottaOverTraceBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whitePerrottaOverTraceBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whitePerrottaOverTraceBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whitePerrottaOverTraceBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whitePerrottaOverTraceBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whitePerrottaOverTraceBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whitePerrottaOverTraceBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whitePerrottaOverTraceBhv.outideSql().removeBlockComment().selectList()
     * whitePerrottaOverTraceBhv.outideSql().removeLineComment().selectList()
     * whitePerrottaOverTraceBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePerrottaOverTraceBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePerrottaOverTraceBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePerrottaOverTrace> typeOfSelectedEntity() { return WhitePerrottaOverTrace.class; }
    protected Class<WhitePerrottaOverTrace> typeOfHandlingEntity() { return WhitePerrottaOverTrace.class; }
    protected Class<WhitePerrottaOverTraceCB> typeOfHandlingConditionBean() { return WhitePerrottaOverTraceCB.class; }
}
