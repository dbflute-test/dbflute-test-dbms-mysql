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
 * The behavior of WHITE_DATE_ADJUSTMENT as TABLE. <br>
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
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteDateAdjustmentDbm asDBMeta() { return WhiteDateAdjustmentDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_date_adjustment"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteDateAdjustmentCB newConditionBean() { return new WhiteDateAdjustmentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteDateAdjustment</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteDateAdjustment</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteDateAdjustment</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteDateAdjustment</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDateAdjustment> selectEntity(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteDateAdjustment <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteDateAdjustment.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteDateAdjustment <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteDateAdjustment.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteDateAdjustment <span style="color: #553000">whiteDateAdjustment</span> = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteDateAdjustment</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectEntityWithDeletedCheck(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().set...;
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDateAdjustment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectEntityWithDeletedCheck(WhiteDateAdjustmentCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param dateAdjustmentId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * ListResultBean&lt;WhiteDateAdjustment&gt; <span style="color: #553000">whiteDateAdjustmentList</span> = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteDateAdjustment <span style="color: #553000">whiteDateAdjustment</span> : <span style="color: #553000">whiteDateAdjustmentList</span>) {
     *     ... = <span style="color: #553000">whiteDateAdjustment</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDateAdjustment> selectList(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteDateAdjustment&gt; <span style="color: #553000">whiteDateAdjustmentList</span> = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteDateAdjustment whiteDateAdjustment : <span style="color: #553000">whiteDateAdjustmentList</span>) {
     *     ... = whiteDateAdjustment.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
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
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;WhiteDateAdjustment&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteDateAdjustment whiteDateAdjustment : <span style="color: #553000">page</span>) {
     *     ... = whiteDateAdjustment.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDateAdjustment> selectPage(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDateAdjustment&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteDateAdjustment whiteDateAdjustment : <span style="color: #553000">page</span>) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
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
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @param entityLambda The handler of entity row of WhiteDateAdjustment. (NotNull)
     */
    public void selectCursor(CBCall<WhiteDateAdjustmentCB> cbLambda, EntityRowHandler<WhiteDateAdjustment> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
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
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteDateAdjustmentCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteDateAdjustmentList The entity list of whiteDateAdjustment. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteDateAdjustment> whiteDateAdjustmentList, ReferrerLoaderHandler<LoaderOfWhiteDateAdjustment> loaderLambda) {
        xassLRArg(whiteDateAdjustmentList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteDateAdjustment().ready(whiteDateAdjustmentList, _behaviorSelector));
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
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDateAdjustment.setFoo...(value);
     * whiteDateAdjustment.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">insert</span>(whiteDateAdjustment);
     * ... = whiteDateAdjustment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDateAdjustment The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDateAdjustment whiteDateAdjustment) {
        doInsert(whiteDateAdjustment, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDateAdjustment.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">update</span>(whiteDateAdjustment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteDateAdjustment whiteDateAdjustment) {
        doUpdate(whiteDateAdjustment, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteDateAdjustment The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDateAdjustment whiteDateAdjustment) {
        doInsertOrUpdate(whiteDateAdjustment, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDateAdjustment.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">delete</span>(whiteDateAdjustment);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDateAdjustment whiteDateAdjustment) {
        doDelete(whiteDateAdjustment, null);
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
     *     WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     *     whiteDateAdjustment.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteDateAdjustment.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDateAdjustmentList.add(whiteDateAdjustment);
     * }
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteDateAdjustmentList);
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
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     *     whiteDateAdjustment.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteDateAdjustment.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteDateAdjustment.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDateAdjustment.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDateAdjustmentList.add(whiteDateAdjustment);
     * }
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteDateAdjustmentList);
     * </pre>
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        return doBatchUpdate(whiteDateAdjustmentList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
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
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDateAdjustment, WhiteDateAdjustmentCB&gt;() {
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
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDateAdjustment whiteDateAdjustment, CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return doQueryUpdate(whiteDateAdjustment, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb) {
        return doQueryUpdate(whiteDateAdjustment, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteDateAdjustmentCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
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
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDateAdjustment.setFoo...(value);
     * whiteDateAdjustment.setBar...(value);
     * InsertOption&lt;WhiteDateAdjustmentCB&gt; option = new InsertOption&lt;WhiteDateAdjustmentCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteDateAdjustment, option);
     * ... = whiteDateAdjustment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDateAdjustment The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDateAdjustment whiteDateAdjustment, WritableOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> opLambda) {
        doInsert(whiteDateAdjustment, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDateAdjustment.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = new UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *         public void specify(WhiteDateAdjustmentCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteDateAdjustment, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDateAdjustment whiteDateAdjustment, WritableOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        doUpdate(whiteDateAdjustment, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDateAdjustment The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDateAdjustment whiteDateAdjustment, WritableOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> insertOpLambda, WritableOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> updateOpLambda) {
        doInsertOrUpdate(whiteDateAdjustment, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteDateAdjustment The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDateAdjustment whiteDateAdjustment, WritableOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        doDelete(whiteDateAdjustment, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDateAdjustment> whiteDateAdjustmentList, WritableOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> opLambda) {
        return doBatchInsert(whiteDateAdjustmentList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList, WritableOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        return doBatchUpdate(whiteDateAdjustmentList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDateAdjustment> whiteDateAdjustmentList, WritableOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        return doBatchDelete(whiteDateAdjustmentList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> manyArgLambda, WritableOptionCall<WhiteDateAdjustmentCB, InsertOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void specify(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteDateAdjustment, cb, option);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDateAdjustment whiteDateAdjustment, CBCall<WhiteDateAdjustmentCB> cbLambda, WritableOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryUpdate(whiteDateAdjustment, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteDateAdjustment whiteDateAdjustment = <span style="color: #70226C">new</span> WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = <span style="color: #70226C">new</span> WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void specify(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteDateAdjustmentBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteDateAdjustment, cb, option);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb, WritableOptionCall<WhiteDateAdjustmentCB, UpdateOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryUpdate(whiteDateAdjustment, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteDateAdjustmentCB> cbLambda, WritableOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDateAdjustmentCB cb, WritableOptionCall<WhiteDateAdjustmentCB, DeleteOption<WhiteDateAdjustmentCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
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
    public OutsideSqlAllFacadeExecutor<WhiteDateAdjustmentBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteDateAdjustment> typeOfSelectedEntity() { return WhiteDateAdjustment.class; }
    protected Class<WhiteDateAdjustment> typeOfHandlingEntity() { return WhiteDateAdjustment.class; }
    protected Class<WhiteDateAdjustmentCB> typeOfHandlingConditionBean() { return WhiteDateAdjustmentCB.class; }
}
