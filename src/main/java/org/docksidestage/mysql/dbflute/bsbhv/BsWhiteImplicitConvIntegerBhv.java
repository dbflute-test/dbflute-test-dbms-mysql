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
 * The behavior of WHITE_IMPLICIT_CONV_INTEGER as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_INTEGER_ID
 *
 * [column]
 *     IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_NUMERIC, WHITE_IMPLICIT_CONV_STRING
 *
 * [referrer table]
 *     WHITE_IMPLICIT_CONV_NUMERIC, WHITE_IMPLICIT_CONV_STRING
 *
 * [foreign property]
 *     whiteImplicitConvNumeric, whiteImplicitConvString
 *
 * [referrer property]
 *     whiteImplicitConvNumericList, whiteImplicitConvStringList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvIntegerBhv extends AbstractBehaviorWritable<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteImplicitConvIntegerDbm asDBMeta() { return WhiteImplicitConvIntegerDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_implicit_conv_integer"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteImplicitConvIntegerCB newConditionBean() { return new WhiteImplicitConvIntegerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvIntegerCB cb) {
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
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteImplicitConvInteger</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteImplicitConvInteger</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteImplicitConvInteger</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteImplicitConvInteger</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitConvInteger> selectEntity(CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteImplicitConvInteger <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteImplicitConvInteger.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteImplicitConvInteger <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteImplicitConvInteger.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitConvInteger> selectEntity(WhiteImplicitConvIntegerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteImplicitConvInteger> facadeSelectEntity(WhiteImplicitConvIntegerCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvInteger> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitConvIntegerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitConvInteger <span style="color: #553000">whiteImplicitConvInteger</span> = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteImplicitConvInteger</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvInteger selectEntityWithDeletedCheck(CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().set...;
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvInteger.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvInteger selectEntityWithDeletedCheck(WhiteImplicitConvIntegerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvIntegerId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitConvInteger> selectByPK(Integer implicitConvIntegerId) {
        return facadeSelectByPK(implicitConvIntegerId);
    }

    protected OptionalEntity<WhiteImplicitConvInteger> facadeSelectByPK(Integer implicitConvIntegerId) {
        return doSelectOptionalByPK(implicitConvIntegerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvInteger> ENTITY doSelectByPK(Integer implicitConvIntegerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(implicitConvIntegerId), tp);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer implicitConvIntegerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(implicitConvIntegerId, tp), implicitConvIntegerId);
    }

    protected WhiteImplicitConvIntegerCB xprepareCBAsPK(Integer implicitConvIntegerId) {
        assertObjectNotNull("implicitConvIntegerId", implicitConvIntegerId);
        return newConditionBean().acceptPK(implicitConvIntegerId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteImplicitConvInteger&gt; <span style="color: #553000">whiteImplicitConvIntegerList</span> = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteImplicitConvInteger <span style="color: #553000">whiteImplicitConvInteger</span> : <span style="color: #553000">whiteImplicitConvIntegerList</span>) {
     *     ... = <span style="color: #553000">whiteImplicitConvInteger</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvInteger> selectList(CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteImplicitConvInteger&gt; <span style="color: #553000">whiteImplicitConvIntegerList</span> = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">whiteImplicitConvIntegerList</span>) {
     *     ... = whiteImplicitConvInteger.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvInteger> selectList(WhiteImplicitConvIntegerCB cb) {
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
     * PagingResultBean&lt;WhiteImplicitConvInteger&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">page</span>) {
     *     ... = whiteImplicitConvInteger.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvInteger> selectPage(CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvInteger&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">page</span>) {
     *     ... = whiteImplicitConvInteger.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvInteger> selectPage(WhiteImplicitConvIntegerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param entityLambda The handler of entity row of WhiteImplicitConvInteger. (NotNull)
     */
    public void selectCursor(CBCall<WhiteImplicitConvIntegerCB> cbLambda, EntityRowHandler<WhiteImplicitConvInteger> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvInteger. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvIntegerCB cb, EntityRowHandler<WhiteImplicitConvInteger> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteImplicitConvIntegerCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvInteger> loaderLambda) {
        xassLRArg(whiteImplicitConvIntegerList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteImplicitConvInteger().ready(whiteImplicitConvIntegerList, _behaviorSelector));
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
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteImplicitConvInteger whiteImplicitConvInteger, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvInteger> loaderLambda) {
        xassLRArg(whiteImplicitConvInteger, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteImplicitConvInteger().ready(xnewLRAryLs(whiteImplicitConvInteger), _behaviorSelector));
    }

    /**
     * Load referrer of whiteImplicitConvNumericList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_NUMERIC by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvNumeric</span>(<span style="color: #553000">whiteImplicitConvIntegerList</span>, <span style="color: #553000">numericCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">numericCB</span>.setupSelect...
     *     <span style="color: #553000">numericCB</span>.query().set...
     *     <span style="color: #553000">numericCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">whiteImplicitConvIntegerList</span>) {
     *     ... = whiteImplicitConvInteger.<span style="color: #CC4747">getWhiteImplicitConvNumericList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumeric(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, ConditionBeanSetupper<WhiteImplicitConvNumericCB> refCBLambda) {
        xassLRArg(whiteImplicitConvIntegerList, refCBLambda);
        return doLoadWhiteImplicitConvNumeric(whiteImplicitConvIntegerList, new LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteImplicitConvNumericList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_NUMERIC by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvNumeric</span>(<span style="color: #553000">whiteImplicitConvInteger</span>, <span style="color: #553000">numericCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">numericCB</span>.setupSelect...
     *     <span style="color: #553000">numericCB</span>.query().set...
     *     <span style="color: #553000">numericCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteImplicitConvInteger</span>.<span style="color: #CC4747">getWhiteImplicitConvNumericList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumeric(WhiteImplicitConvInteger whiteImplicitConvInteger, ConditionBeanSetupper<WhiteImplicitConvNumericCB> refCBLambda) {
        xassLRArg(whiteImplicitConvInteger, refCBLambda);
        return doLoadWhiteImplicitConvNumeric(xnewLRLs(whiteImplicitConvInteger), new LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumeric(WhiteImplicitConvInteger whiteImplicitConvInteger, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvInteger, loadReferrerOption);
        return loadWhiteImplicitConvNumeric(xnewLRLs(whiteImplicitConvInteger), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumeric(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvIntegerList, loadReferrerOption);
        if (whiteImplicitConvIntegerList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvNumeric>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvNumeric(whiteImplicitConvIntegerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvNumeric> doLoadWhiteImplicitConvNumeric(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> option) {
        return helpLoadReferrerInternally(whiteImplicitConvIntegerList, option, "whiteImplicitConvNumericList");
    }

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvString</span>(<span style="color: #553000">whiteImplicitConvIntegerList</span>, <span style="color: #553000">stringCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stringCB</span>.setupSelect...
     *     <span style="color: #553000">stringCB</span>.query().set...
     *     <span style="color: #553000">stringCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteImplicitConvInteger whiteImplicitConvInteger : <span style="color: #553000">whiteImplicitConvIntegerList</span>) {
     *     ... = whiteImplicitConvInteger.<span style="color: #CC4747">getWhiteImplicitConvStringList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, ConditionBeanSetupper<WhiteImplicitConvStringCB> refCBLambda) {
        xassLRArg(whiteImplicitConvIntegerList, refCBLambda);
        return doLoadWhiteImplicitConvString(whiteImplicitConvIntegerList, new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvString</span>(<span style="color: #553000">whiteImplicitConvInteger</span>, <span style="color: #553000">stringCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stringCB</span>.setupSelect...
     *     <span style="color: #553000">stringCB</span>.query().set...
     *     <span style="color: #553000">stringCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteImplicitConvInteger</span>.<span style="color: #CC4747">getWhiteImplicitConvStringList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(WhiteImplicitConvInteger whiteImplicitConvInteger, ConditionBeanSetupper<WhiteImplicitConvStringCB> refCBLambda) {
        xassLRArg(whiteImplicitConvInteger, refCBLambda);
        return doLoadWhiteImplicitConvString(xnewLRLs(whiteImplicitConvInteger), new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(WhiteImplicitConvInteger whiteImplicitConvInteger, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvInteger, loadReferrerOption);
        return loadWhiteImplicitConvString(xnewLRLs(whiteImplicitConvInteger), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvIntegerList, loadReferrerOption);
        if (whiteImplicitConvIntegerList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvString>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvString(whiteImplicitConvIntegerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvString> doLoadWhiteImplicitConvString(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> option) {
        return helpLoadReferrerInternally(whiteImplicitConvIntegerList, option, "whiteImplicitConvStringList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvNumeric'.
     * @param whiteImplicitConvIntegerList The list of whiteImplicitConvInteger. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvNumeric> pulloutWhiteImplicitConvNumeric(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList)
    { return helpPulloutInternally(whiteImplicitConvIntegerList, "whiteImplicitConvNumeric"); }

    /**
     * Pull out the list of foreign table 'WhiteImplicitConvString'.
     * @param whiteImplicitConvIntegerList The list of whiteImplicitConvInteger. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvString> pulloutWhiteImplicitConvString(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList)
    { return helpPulloutInternally(whiteImplicitConvIntegerList, "whiteImplicitConvString"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvIntegerId.
     * @param whiteImplicitConvIntegerList The list of whiteImplicitConvInteger. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractImplicitConvIntegerIdList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList)
    { return helpExtractListInternally(whiteImplicitConvIntegerList, "implicitConvIntegerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvInteger.setFoo...(value);
     * whiteImplicitConvInteger.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">insert</span>(whiteImplicitConvInteger);
     * ... = whiteImplicitConvInteger.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvInteger The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doInsert(whiteImplicitConvInteger, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * whiteImplicitConvInteger.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvInteger.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvInteger.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">update</span>(whiteImplicitConvInteger);
     * </pre>
     * @param whiteImplicitConvInteger The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doUpdate(whiteImplicitConvInteger, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteImplicitConvInteger The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doInsertOrUpdate(whiteImplicitConvInteger, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * whiteImplicitConvInteger.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvInteger.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">delete</span>(whiteImplicitConvInteger);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvInteger The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doDelete(whiteImplicitConvInteger, null);
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
     *     WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     *     whiteImplicitConvInteger.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteImplicitConvInteger.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitConvIntegerList.add(whiteImplicitConvInteger);
     * }
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteImplicitConvIntegerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return doBatchInsert(whiteImplicitConvIntegerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     *     whiteImplicitConvInteger.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteImplicitConvInteger.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteImplicitConvInteger.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitConvInteger.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitConvIntegerList.add(whiteImplicitConvInteger);
     * }
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteImplicitConvIntegerList);
     * </pre>
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return doBatchUpdate(whiteImplicitConvIntegerList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return doBatchDelete(whiteImplicitConvIntegerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB&gt;() {
     *     public ConditionBean setup(WhiteImplicitConvInteger entity, WhiteImplicitConvIntegerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setPK...(value);</span>
     * whiteImplicitConvInteger.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteImplicitConvInteger, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteImplicitConvInteger The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return doQueryUpdate(whiteImplicitConvInteger, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setPK...(value);</span>
     * whiteImplicitConvInteger.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setVersionNo(value);</span>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteImplicitConvInteger, cb);
     * </pre>
     * @param whiteImplicitConvInteger The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WhiteImplicitConvIntegerCB cb) {
        return doQueryUpdate(whiteImplicitConvInteger, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitConvInteger, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteImplicitConvIntegerCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitConvInteger, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvIntegerCB cb) {
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
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvInteger.setFoo...(value);
     * whiteImplicitConvInteger.setBar...(value);
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteImplicitConvInteger, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteImplicitConvInteger.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvInteger The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitConvInteger whiteImplicitConvInteger, WritableOptionCall<WhiteImplicitConvIntegerCB, InsertOption<WhiteImplicitConvIntegerCB>> opLambda) {
        doInsert(whiteImplicitConvInteger, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * whiteImplicitConvInteger.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvInteger.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvInteger.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteImplicitConvInteger, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteImplicitConvInteger The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WritableOptionCall<WhiteImplicitConvIntegerCB, UpdateOption<WhiteImplicitConvIntegerCB>> opLambda) {
        doUpdate(whiteImplicitConvInteger, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvInteger The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WritableOptionCall<WhiteImplicitConvIntegerCB, InsertOption<WhiteImplicitConvIntegerCB>> insertOpLambda, WritableOptionCall<WhiteImplicitConvIntegerCB, UpdateOption<WhiteImplicitConvIntegerCB>> updateOpLambda) {
        doInsertOrUpdate(whiteImplicitConvInteger, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvInteger The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitConvInteger whiteImplicitConvInteger, WritableOptionCall<WhiteImplicitConvIntegerCB, DeleteOption<WhiteImplicitConvIntegerCB>> opLambda) {
        doDelete(whiteImplicitConvInteger, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, WritableOptionCall<WhiteImplicitConvIntegerCB, InsertOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doBatchInsert(whiteImplicitConvIntegerList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, WritableOptionCall<WhiteImplicitConvIntegerCB, UpdateOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doBatchUpdate(whiteImplicitConvIntegerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, WritableOptionCall<WhiteImplicitConvIntegerCB, DeleteOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doBatchDelete(whiteImplicitConvIntegerList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> manyArgLambda, WritableOptionCall<WhiteImplicitConvIntegerCB, InsertOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setPK...(value);</span>
     * whiteImplicitConvInteger.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteImplicitConvInteger, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteImplicitConvInteger The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, CBCall<WhiteImplicitConvIntegerCB> cbLambda, WritableOptionCall<WhiteImplicitConvIntegerCB, UpdateOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doQueryUpdate(whiteImplicitConvInteger, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = <span style="color: #70226C">new</span> WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setPK...(value);</span>
     * whiteImplicitConvInteger.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setVersionNo(value);</span>
     * WhiteImplicitConvIntegerCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteImplicitConvInteger, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteImplicitConvInteger The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WhiteImplicitConvIntegerCB cb, WritableOptionCall<WhiteImplicitConvIntegerCB, UpdateOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doQueryUpdate(whiteImplicitConvInteger, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvIntegerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitConvInteger, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteImplicitConvIntegerCB> cbLambda, WritableOptionCall<WhiteImplicitConvIntegerCB, DeleteOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitConvIntegerCB cb, WritableOptionCall<WhiteImplicitConvIntegerCB, DeleteOption<WhiteImplicitConvIntegerCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteImplicitConvIntegerBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteImplicitConvIntegerBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteImplicitConvIntegerBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteImplicitConvIntegerBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteImplicitConvIntegerBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteImplicitConvIntegerBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteImplicitConvIntegerBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteImplicitConvIntegerBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteImplicitConvIntegerBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteImplicitConvIntegerBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteImplicitConvIntegerBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteImplicitConvIntegerBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteImplicitConvIntegerBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteImplicitConvIntegerBhv.outideSql().removeBlockComment().selectList()
     * whiteImplicitConvIntegerBhv.outideSql().removeLineComment().selectList()
     * whiteImplicitConvIntegerBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteImplicitConvIntegerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteImplicitConvInteger> typeOfSelectedEntity() { return WhiteImplicitConvInteger.class; }
    protected Class<WhiteImplicitConvInteger> typeOfHandlingEntity() { return WhiteImplicitConvInteger.class; }
    protected Class<WhiteImplicitConvIntegerCB> typeOfHandlingConditionBean() { return WhiteImplicitConvIntegerCB.class; }
}
