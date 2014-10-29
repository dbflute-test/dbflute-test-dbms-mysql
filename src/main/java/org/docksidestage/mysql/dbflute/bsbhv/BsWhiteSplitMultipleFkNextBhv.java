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
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_NEXT as TABLE. <br />
 * <pre>
 * [primary key]
 *     NEXT_ID
 *
 * [column]
 *     NEXT_ID, SECOND_CODE
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
 *     white_split_multiple_fk_base
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSplitMultipleFkBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkNextBhv extends AbstractBehaviorWritable<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSplitMultipleFkNextDbm getDBMeta() { return WhiteSplitMultipleFkNextDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSplitMultipleFkNextCB newConditionBean() { return new WhiteSplitMultipleFkNextCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkNextCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteSplitMultipleFkNext</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteSplitMultipleFkNext</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteSplitMultipleFkNext</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteSplitMultipleFkNext</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSplitMultipleFkNext> selectEntity(CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteSplitMultipleFkNext <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteSplitMultipleFkNext.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteSplitMultipleFkNext <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteSplitMultipleFkNext.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSplitMultipleFkNext> selectEntity(WhiteSplitMultipleFkNextCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSplitMultipleFkNext> facadeSelectEntity(WhiteSplitMultipleFkNextCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSplitMultipleFkNextCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkNext <span style="color: #553000">whiteSplitMultipleFkNext</span> = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteSplitMultipleFkNext</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkNext selectEntityWithDeletedCheck(CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().set...;
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkNext.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkNext selectEntityWithDeletedCheck(WhiteSplitMultipleFkNextCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param nextId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSplitMultipleFkNext> selectByPK(Long nextId) {
        return facadeSelectByPK(nextId);
    }

    protected OptionalEntity<WhiteSplitMultipleFkNext> facadeSelectByPK(Long nextId) {
        return doSelectOptionalByPK(nextId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> ENTITY doSelectByPK(Long nextId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(nextId), tp);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> OptionalEntity<ENTITY> doSelectOptionalByPK(Long nextId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(nextId, tp), nextId);
    }

    protected WhiteSplitMultipleFkNextCB xprepareCBAsPK(Long nextId) {
        assertObjectNotNull("nextId", nextId);
        return newConditionBean().acceptPK(nextId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteSplitMultipleFkNext&gt; <span style="color: #553000">whiteSplitMultipleFkNextList</span> = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (WhiteSplitMultipleFkNext <span style="color: #553000">whiteSplitMultipleFkNext</span> : <span style="color: #553000">whiteSplitMultipleFkNextList</span>) {
     *     ... = <span style="color: #553000">whiteSplitMultipleFkNext</span>.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkNext> selectList(CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;WhiteSplitMultipleFkNext&gt; <span style="color: #553000">whiteSplitMultipleFkNextList</span> = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : <span style="color: #553000">whiteSplitMultipleFkNextList</span>) {
     *     ... = whiteSplitMultipleFkNext.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkNext> selectList(WhiteSplitMultipleFkNextCB cb) {
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
     * PagingResultBean&lt;WhiteSplitMultipleFkNext&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : <span style="color: #553000">page</span>) {
     *     ... = whiteSplitMultipleFkNext.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkNext> selectPage(CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkNext&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : <span style="color: #553000">page</span>) {
     *     ... = whiteSplitMultipleFkNext.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkNext> selectPage(WhiteSplitMultipleFkNextCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSplitMultipleFkNext. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSplitMultipleFkNextCB> cbLambda, EntityRowHandler<WhiteSplitMultipleFkNext> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkNext&gt;() {
     *     public void handle(WhiteSplitMultipleFkNext entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkNext. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkNextCB cb, EntityRowHandler<WhiteSplitMultipleFkNext> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSplitMultipleFkNextCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteSplitMultipleFkNextList The entity list of whiteSplitMultipleFkNext. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkNext> loaderLambda) {
        xassLRArg(whiteSplitMultipleFkNextList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSplitMultipleFkNext().ready(whiteSplitMultipleFkNextList, _behaviorSelector));
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
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * for (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteSplitMultipleFkNext The entity of whiteSplitMultipleFkNext. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkNext> loaderLambda) {
        xassLRArg(whiteSplitMultipleFkNext, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSplitMultipleFkNext().ready(xnewLRAryLs(whiteSplitMultipleFkNext), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSplitMultipleFkBaseList by the set-upper of referrer. <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">loadWhiteSplitMultipleFkBaseList</span>(<span style="color: #553000">whiteSplitMultipleFkNextList</span>, <span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseCB</span>.setupSelect...
     *     <span style="color: #553000">baseCB</span>.query().set...
     *     <span style="color: #553000">baseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : <span style="color: #553000">whiteSplitMultipleFkNextList</span>) {
     *     ... = whiteSplitMultipleFkNext.<span style="color: #CC4747">getWhiteSplitMultipleFkBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextId_InScope(pkList);
     * cb.query().addOrderBy_NextId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkNextList The entity list of whiteSplitMultipleFkNext. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, ConditionBeanSetupper<WhiteSplitMultipleFkBaseCB> refCBLambda) {
        xassLRArg(whiteSplitMultipleFkNextList, refCBLambda);
        return doLoadWhiteSplitMultipleFkBaseList(whiteSplitMultipleFkNextList, new LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteSplitMultipleFkBaseList by the set-upper of referrer. <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">loadWhiteSplitMultipleFkBaseList</span>(<span style="color: #553000">whiteSplitMultipleFkNext</span>, <span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseCB</span>.setupSelect...
     *     <span style="color: #553000">baseCB</span>.query().set...
     *     <span style="color: #553000">baseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteSplitMultipleFkNext</span>.<span style="color: #CC4747">getWhiteSplitMultipleFkBaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextId_InScope(pkList);
     * cb.query().addOrderBy_NextId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of whiteSplitMultipleFkNext. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, ConditionBeanSetupper<WhiteSplitMultipleFkBaseCB> refCBLambda) {
        xassLRArg(whiteSplitMultipleFkNext, refCBLambda);
        return doLoadWhiteSplitMultipleFkBaseList(xnewLRLs(whiteSplitMultipleFkNext), new LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSplitMultipleFkNext The entity of whiteSplitMultipleFkNext. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkNext, loadReferrerOption);
        return loadWhiteSplitMultipleFkBaseList(xnewLRLs(whiteSplitMultipleFkNext), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSplitMultipleFkNextList The entity list of whiteSplitMultipleFkNext. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkNextList, loadReferrerOption);
        if (whiteSplitMultipleFkNextList.isEmpty()) { return (NestedReferrerListGateway<WhiteSplitMultipleFkBase>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSplitMultipleFkBaseList(whiteSplitMultipleFkNextList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSplitMultipleFkBase> doLoadWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase> option) {
        return helpLoadReferrerInternally(whiteSplitMultipleFkNextList, option, "whiteSplitMultipleFkBaseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key nextId.
     * @param whiteSplitMultipleFkNextList The list of whiteSplitMultipleFkNext. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractNextIdList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList)
    { return helpExtractListInternally(whiteSplitMultipleFkNextList, "nextId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkNext.setFoo...(value);
     * whiteSplitMultipleFkNext.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">insert</span>(whiteSplitMultipleFkNext);
     * ... = whiteSplitMultipleFkNext.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkNext The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doInsert(whiteSplitMultipleFkNext, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * whiteSplitMultipleFkNext.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkNext.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkNext.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">update</span>(whiteSplitMultipleFkNext);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doUpdate(whiteSplitMultipleFkNext, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSplitMultipleFkNext The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doInsertOrUpdate(whiteSplitMultipleFkNext, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * whiteSplitMultipleFkNext.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkNext.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">delete</span>(whiteSplitMultipleFkNext);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doDelete(whiteSplitMultipleFkNext, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     *     whiteSplitMultipleFkNext.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkNext.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkNextList.add(whiteSplitMultipleFkNext);
     * }
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteSplitMultipleFkNextList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        return doBatchInsert(whiteSplitMultipleFkNextList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     *     whiteSplitMultipleFkNext.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkNext.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkNext.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkNextList.add(whiteSplitMultipleFkNext);
     * }
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteSplitMultipleFkNextList);
     * </pre>
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        return doBatchUpdate(whiteSplitMultipleFkNextList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        return doBatchDelete(whiteSplitMultipleFkNextList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB&gt;() {
     *     public ConditionBean setup(WhiteSplitMultipleFkNext entity, WhiteSplitMultipleFkNextCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setPK...(value);</span>
     * whiteSplitMultipleFkNext.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setVersionNo(value);</span>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSplitMultipleFkNext, cb);
     * </pre>
     * @param whiteSplitMultipleFkNext The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return doQueryUpdate(whiteSplitMultipleFkNext, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setPK...(value);</span>
     * whiteSplitMultipleFkNext.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setVersionNo(value);</span>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSplitMultipleFkNext, cb);
     * </pre>
     * @param whiteSplitMultipleFkNext The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkNext, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSplitMultipleFkNext, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSplitMultipleFkNextCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSplitMultipleFkNext, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkNextCB cb) {
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
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkNext.setFoo...(value);
     * whiteSplitMultipleFkNext.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkNextCB> option = new InsertOption<WhiteSplitMultipleFkNextCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteSplitMultipleFkNext, option);
     * ... = whiteSplitMultipleFkNext.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WritableOptionCall<WhiteSplitMultipleFkNextCB, InsertOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        doInsert(whiteSplitMultipleFkNext, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * whiteSplitMultipleFkNext.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkNext.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkNext.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkNextCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteSplitMultipleFkNext, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WritableOptionCall<WhiteSplitMultipleFkNextCB, UpdateOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        doUpdate(whiteSplitMultipleFkNext, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkNext The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WritableOptionCall<WhiteSplitMultipleFkNextCB, InsertOption<WhiteSplitMultipleFkNextCB>> insertOpLambda, WritableOptionCall<WhiteSplitMultipleFkNextCB, UpdateOption<WhiteSplitMultipleFkNextCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSplitMultipleFkNext, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkNext The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WritableOptionCall<WhiteSplitMultipleFkNextCB, DeleteOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        doDelete(whiteSplitMultipleFkNext, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, WritableOptionCall<WhiteSplitMultipleFkNextCB, InsertOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doBatchInsert(whiteSplitMultipleFkNextList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, WritableOptionCall<WhiteSplitMultipleFkNextCB, UpdateOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doBatchUpdate(whiteSplitMultipleFkNextList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, WritableOptionCall<WhiteSplitMultipleFkNextCB, DeleteOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doBatchDelete(whiteSplitMultipleFkNextList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> manyArgLambda, WritableOptionCall<WhiteSplitMultipleFkNextCB, InsertOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setPK...(value);</span>
     * whiteSplitMultipleFkNext.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setVersionNo(value);</span>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkNextCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSplitMultipleFkNext, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkNext The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, CBCall<WhiteSplitMultipleFkNextCB> cbLambda, WritableOptionCall<WhiteSplitMultipleFkNextCB, UpdateOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doQueryUpdate(whiteSplitMultipleFkNext, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setPK...(value);</span>
     * whiteSplitMultipleFkNext.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setVersionNo(value);</span>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkNextCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteSplitMultipleFkNextBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSplitMultipleFkNext, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkNext The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB cb, WritableOptionCall<WhiteSplitMultipleFkNextCB, UpdateOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doQueryUpdate(whiteSplitMultipleFkNext, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSplitMultipleFkNextCB> cbLambda, WritableOptionCall<WhiteSplitMultipleFkNextCB, DeleteOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkNextCB cb, WritableOptionCall<WhiteSplitMultipleFkNextCB, DeleteOption<WhiteSplitMultipleFkNextCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSplitMultipleFkNextBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSplitMultipleFkNextBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSplitMultipleFkNextBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSplitMultipleFkNextBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSplitMultipleFkNextBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSplitMultipleFkNextBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSplitMultipleFkNextBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSplitMultipleFkNextBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSplitMultipleFkNextBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSplitMultipleFkNextBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSplitMultipleFkNextBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSplitMultipleFkNextBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSplitMultipleFkNextBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSplitMultipleFkNextBhv.outideSql().removeBlockComment().selectList()
     * whiteSplitMultipleFkNextBhv.outideSql().removeLineComment().selectList()
     * whiteSplitMultipleFkNextBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkNextBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSplitMultipleFkNextBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSplitMultipleFkNext> typeOfSelectedEntity() { return WhiteSplitMultipleFkNext.class; }
    protected Class<WhiteSplitMultipleFkNext> typeOfHandlingEntity() { return WhiteSplitMultipleFkNext.class; }
    protected Class<WhiteSplitMultipleFkNextCB> typeOfHandlingConditionBean() { return WhiteSplitMultipleFkNextCB.class; }
}
