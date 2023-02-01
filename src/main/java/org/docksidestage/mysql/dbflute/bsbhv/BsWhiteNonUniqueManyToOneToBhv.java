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
 * The behavior of WHITE_NON_UNIQUE_MANY_TO_ONE_TO as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNonUniqueManyToOneToBhv extends AbstractBehaviorWritable<WhiteNonUniqueManyToOneTo, WhiteNonUniqueManyToOneToCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteNonUniqueManyToOneToDbm asDBMeta() { return WhiteNonUniqueManyToOneToDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_non_unique_many_to_one_to"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteNonUniqueManyToOneToCB newConditionBean() { return new WhiteNonUniqueManyToOneToCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteNonUniqueManyToOneToCB cb) {
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
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteNonUniqueManyToOneTo</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteNonUniqueManyToOneTo</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteNonUniqueManyToOneTo</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteNonUniqueManyToOneTo</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteNonUniqueManyToOneTo> selectEntity(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteNonUniqueManyToOneTo <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteNonUniqueManyToOneTo.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteNonUniqueManyToOneTo <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteNonUniqueManyToOneTo.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteNonUniqueManyToOneTo> selectEntity(WhiteNonUniqueManyToOneToCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteNonUniqueManyToOneTo> facadeSelectEntity(WhiteNonUniqueManyToOneToCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNonUniqueManyToOneTo> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteNonUniqueManyToOneToCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteNonUniqueManyToOneTo <span style="color: #553000">whiteNonUniqueManyToOneTo</span> = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteNonUniqueManyToOneTo</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteNonUniqueManyToOneTo selectEntityWithDeletedCheck(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().set...;
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteNonUniqueManyToOneTo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteNonUniqueManyToOneTo selectEntityWithDeletedCheck(WhiteNonUniqueManyToOneToCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param toId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteNonUniqueManyToOneTo> selectByPK(Long toId) {
        return facadeSelectByPK(toId);
    }

    protected OptionalEntity<WhiteNonUniqueManyToOneTo> facadeSelectByPK(Long toId) {
        return doSelectOptionalByPK(toId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNonUniqueManyToOneTo> ENTITY doSelectByPK(Long toId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(toId), tp);
    }

    protected <ENTITY extends WhiteNonUniqueManyToOneTo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long toId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(toId, tp), toId);
    }

    protected WhiteNonUniqueManyToOneToCB xprepareCBAsPK(Long toId) {
        assertObjectNotNull("toId", toId);
        return newConditionBean().acceptPK(toId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteNonUniqueManyToOneTo&gt; <span style="color: #553000">whiteNonUniqueManyToOneToList</span> = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteNonUniqueManyToOneTo <span style="color: #553000">whiteNonUniqueManyToOneTo</span> : <span style="color: #553000">whiteNonUniqueManyToOneToList</span>) {
     *     ... = <span style="color: #553000">whiteNonUniqueManyToOneTo</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteNonUniqueManyToOneTo> selectList(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteNonUniqueManyToOneTo&gt; <span style="color: #553000">whiteNonUniqueManyToOneToList</span> = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo : <span style="color: #553000">whiteNonUniqueManyToOneToList</span>) {
     *     ... = whiteNonUniqueManyToOneTo.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteNonUniqueManyToOneTo> selectList(WhiteNonUniqueManyToOneToCB cb) {
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
     * PagingResultBean&lt;WhiteNonUniqueManyToOneTo&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo : <span style="color: #553000">page</span>) {
     *     ... = whiteNonUniqueManyToOneTo.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteNonUniqueManyToOneTo> selectPage(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteNonUniqueManyToOneTo&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo : <span style="color: #553000">page</span>) {
     *     ... = whiteNonUniqueManyToOneTo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteNonUniqueManyToOneTo> selectPage(WhiteNonUniqueManyToOneToCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @param entityLambda The handler of entity row of WhiteNonUniqueManyToOneTo. (NotNull)
     */
    public void selectCursor(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda, EntityRowHandler<WhiteNonUniqueManyToOneTo> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteNonUniqueManyToOneTo. (NotNull)
     */
    public void selectCursor(WhiteNonUniqueManyToOneToCB cb, EntityRowHandler<WhiteNonUniqueManyToOneTo> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteNonUniqueManyToOneToCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteNonUniqueManyToOneToList The entity list of whiteNonUniqueManyToOneTo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList, ReferrerLoaderHandler<LoaderOfWhiteNonUniqueManyToOneTo> loaderLambda) {
        xassLRArg(whiteNonUniqueManyToOneToList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteNonUniqueManyToOneTo().ready(whiteNonUniqueManyToOneToList, _behaviorSelector));
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
     * @param whiteNonUniqueManyToOneTo The entity of whiteNonUniqueManyToOneTo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, ReferrerLoaderHandler<LoaderOfWhiteNonUniqueManyToOneTo> loaderLambda) {
        xassLRArg(whiteNonUniqueManyToOneTo, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteNonUniqueManyToOneTo().ready(xnewLRAryLs(whiteNonUniqueManyToOneTo), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key toId.
     * @param whiteNonUniqueManyToOneToList The list of whiteNonUniqueManyToOneTo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractToIdList(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList)
    { return helpExtractListInternally(whiteNonUniqueManyToOneToList, "toId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteNonUniqueManyToOneTo.setFoo...(value);
     * whiteNonUniqueManyToOneTo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.set...;</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">insert</span>(whiteNonUniqueManyToOneTo);
     * ... = whiteNonUniqueManyToOneTo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteNonUniqueManyToOneTo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo) {
        doInsert(whiteNonUniqueManyToOneTo, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * whiteNonUniqueManyToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteNonUniqueManyToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteNonUniqueManyToOneTo.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">update</span>(whiteNonUniqueManyToOneTo);
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo) {
        doUpdate(whiteNonUniqueManyToOneTo, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteNonUniqueManyToOneTo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo) {
        doInsertOrUpdate(whiteNonUniqueManyToOneTo, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * whiteNonUniqueManyToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteNonUniqueManyToOneTo.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">delete</span>(whiteNonUniqueManyToOneTo);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo) {
        doDelete(whiteNonUniqueManyToOneTo, null);
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
     *     WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     *     whiteNonUniqueManyToOneTo.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteNonUniqueManyToOneTo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteNonUniqueManyToOneToList.add(whiteNonUniqueManyToOneTo);
     * }
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteNonUniqueManyToOneToList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteNonUniqueManyToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList) {
        return doBatchInsert(whiteNonUniqueManyToOneToList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     *     whiteNonUniqueManyToOneTo.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteNonUniqueManyToOneTo.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteNonUniqueManyToOneTo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteNonUniqueManyToOneToList.add(whiteNonUniqueManyToOneTo);
     * }
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteNonUniqueManyToOneToList);
     * </pre>
     * @param whiteNonUniqueManyToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList) {
        return doBatchUpdate(whiteNonUniqueManyToOneToList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteNonUniqueManyToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList) {
        return doBatchDelete(whiteNonUniqueManyToOneToList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteNonUniqueManyToOneTo, WhiteNonUniqueManyToOneToCB&gt;() {
     *     public ConditionBean setup(WhiteNonUniqueManyToOneTo entity, WhiteNonUniqueManyToOneToCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteNonUniqueManyToOneTo, WhiteNonUniqueManyToOneToCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setPK...(value);</span>
     * whiteNonUniqueManyToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteNonUniqueManyToOneTo, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return doQueryUpdate(whiteNonUniqueManyToOneTo, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setPK...(value);</span>
     * whiteNonUniqueManyToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setVersionNo(value);</span>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteNonUniqueManyToOneTo, cb);
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, WhiteNonUniqueManyToOneToCB cb) {
        return doQueryUpdate(whiteNonUniqueManyToOneTo, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteNonUniqueManyToOneToCB cb = new WhiteNonUniqueManyToOneToCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteNonUniqueManyToOneTo, cb);
     * </pre>
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteNonUniqueManyToOneToCB cb) {
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
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteNonUniqueManyToOneTo.setFoo...(value);
     * whiteNonUniqueManyToOneTo.setBar...(value);
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteNonUniqueManyToOneTo, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteNonUniqueManyToOneTo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, WritableOptionCall<WhiteNonUniqueManyToOneToCB, InsertOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        doInsert(whiteNonUniqueManyToOneTo, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * whiteNonUniqueManyToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteNonUniqueManyToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteNonUniqueManyToOneTo.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteNonUniqueManyToOneTo, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, WritableOptionCall<WhiteNonUniqueManyToOneToCB, UpdateOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        doUpdate(whiteNonUniqueManyToOneTo, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteNonUniqueManyToOneTo The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, WritableOptionCall<WhiteNonUniqueManyToOneToCB, InsertOption<WhiteNonUniqueManyToOneToCB>> insertOpLambda, WritableOptionCall<WhiteNonUniqueManyToOneToCB, UpdateOption<WhiteNonUniqueManyToOneToCB>> updateOpLambda) {
        doInsertOrUpdate(whiteNonUniqueManyToOneTo, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteNonUniqueManyToOneTo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, WritableOptionCall<WhiteNonUniqueManyToOneToCB, DeleteOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        doDelete(whiteNonUniqueManyToOneTo, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteNonUniqueManyToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList, WritableOptionCall<WhiteNonUniqueManyToOneToCB, InsertOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doBatchInsert(whiteNonUniqueManyToOneToList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteNonUniqueManyToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList, WritableOptionCall<WhiteNonUniqueManyToOneToCB, UpdateOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doBatchUpdate(whiteNonUniqueManyToOneToList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteNonUniqueManyToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToList, WritableOptionCall<WhiteNonUniqueManyToOneToCB, DeleteOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doBatchDelete(whiteNonUniqueManyToOneToList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteNonUniqueManyToOneTo, WhiteNonUniqueManyToOneToCB> manyArgLambda, WritableOptionCall<WhiteNonUniqueManyToOneToCB, InsertOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setPK...(value);</span>
     * whiteNonUniqueManyToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteNonUniqueManyToOneTo, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, CBCall<WhiteNonUniqueManyToOneToCB> cbLambda, WritableOptionCall<WhiteNonUniqueManyToOneToCB, UpdateOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doQueryUpdate(whiteNonUniqueManyToOneTo, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setPK...(value);</span>
     * whiteNonUniqueManyToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteNonUniqueManyToOneTo.setVersionNo(value);</span>
     * WhiteNonUniqueManyToOneToCB cb = <span style="color: #70226C">new</span> WhiteNonUniqueManyToOneToCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteNonUniqueManyToOneTo, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteNonUniqueManyToOneTo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteNonUniqueManyToOneTo whiteNonUniqueManyToOneTo, WhiteNonUniqueManyToOneToCB cb, WritableOptionCall<WhiteNonUniqueManyToOneToCB, UpdateOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doQueryUpdate(whiteNonUniqueManyToOneTo, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteNonUniqueManyToOneToBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteNonUniqueManyToOneTo, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteNonUniqueManyToOneToCB> cbLambda, WritableOptionCall<WhiteNonUniqueManyToOneToCB, DeleteOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteNonUniqueManyToOneTo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteNonUniqueManyToOneToCB cb, WritableOptionCall<WhiteNonUniqueManyToOneToCB, DeleteOption<WhiteNonUniqueManyToOneToCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteNonUniqueManyToOneToBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteNonUniqueManyToOneToBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteNonUniqueManyToOneToBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteNonUniqueManyToOneToBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteNonUniqueManyToOneToBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteNonUniqueManyToOneToBhv.outideSql().removeBlockComment().selectList()
     * whiteNonUniqueManyToOneToBhv.outideSql().removeLineComment().selectList()
     * whiteNonUniqueManyToOneToBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteNonUniqueManyToOneToBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteNonUniqueManyToOneTo> typeOfSelectedEntity() { return WhiteNonUniqueManyToOneTo.class; }
    protected Class<WhiteNonUniqueManyToOneTo> typeOfHandlingEntity() { return WhiteNonUniqueManyToOneTo.class; }
    protected Class<WhiteNonUniqueManyToOneToCB> typeOfHandlingConditionBean() { return WhiteNonUniqueManyToOneToCB.class; }
}
