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
 * The behavior of WHITE_IMPLICIT_CONV_NUMERIC as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvNumericBhv extends AbstractBehaviorWritable<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteImplicitConvNumericDbm asDBMeta() { return WhiteImplicitConvNumericDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_implicit_conv_numeric"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteImplicitConvNumericCB newConditionBean() { return new WhiteImplicitConvNumericCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvNumericCB cb) {
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
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteImplicitConvNumeric</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteImplicitConvNumeric</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteImplicitConvNumeric</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteImplicitConvNumeric</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitConvNumeric> selectEntity(CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteImplicitConvNumeric <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteImplicitConvNumeric.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteImplicitConvNumeric <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteImplicitConvNumeric.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitConvNumeric> selectEntity(WhiteImplicitConvNumericCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteImplicitConvNumeric> facadeSelectEntity(WhiteImplicitConvNumericCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitConvNumericCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitConvNumeric <span style="color: #553000">whiteImplicitConvNumeric</span> = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteImplicitConvNumeric</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectEntityWithDeletedCheck(CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().set...;
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvNumeric.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectEntityWithDeletedCheck(WhiteImplicitConvNumericCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvNumericId : PK, NotNull, DECIMAL(20). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitConvNumeric> selectByPK(java.math.BigDecimal implicitConvNumericId) {
        return facadeSelectByPK(implicitConvNumericId);
    }

    protected OptionalEntity<WhiteImplicitConvNumeric> facadeSelectByPK(java.math.BigDecimal implicitConvNumericId) {
        return doSelectOptionalByPK(implicitConvNumericId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectByPK(java.math.BigDecimal implicitConvNumericId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(implicitConvNumericId), tp);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> OptionalEntity<ENTITY> doSelectOptionalByPK(java.math.BigDecimal implicitConvNumericId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(implicitConvNumericId, tp), implicitConvNumericId);
    }

    protected WhiteImplicitConvNumericCB xprepareCBAsPK(java.math.BigDecimal implicitConvNumericId) {
        assertObjectNotNull("implicitConvNumericId", implicitConvNumericId);
        return newConditionBean().acceptPK(implicitConvNumericId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteImplicitConvNumeric&gt; <span style="color: #553000">whiteImplicitConvNumericList</span> = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteImplicitConvNumeric <span style="color: #553000">whiteImplicitConvNumeric</span> : <span style="color: #553000">whiteImplicitConvNumericList</span>) {
     *     ... = <span style="color: #553000">whiteImplicitConvNumeric</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvNumeric> selectList(CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteImplicitConvNumeric&gt; <span style="color: #553000">whiteImplicitConvNumericList</span> = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteImplicitConvNumeric whiteImplicitConvNumeric : <span style="color: #553000">whiteImplicitConvNumericList</span>) {
     *     ... = whiteImplicitConvNumeric.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvNumeric> selectList(WhiteImplicitConvNumericCB cb) {
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
     * PagingResultBean&lt;WhiteImplicitConvNumeric&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteImplicitConvNumeric whiteImplicitConvNumeric : <span style="color: #553000">page</span>) {
     *     ... = whiteImplicitConvNumeric.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvNumeric> selectPage(CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvNumeric&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteImplicitConvNumeric whiteImplicitConvNumeric : <span style="color: #553000">page</span>) {
     *     ... = whiteImplicitConvNumeric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvNumeric> selectPage(WhiteImplicitConvNumericCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param entityLambda The handler of entity row of WhiteImplicitConvNumeric. (NotNull)
     */
    public void selectCursor(CBCall<WhiteImplicitConvNumericCB> cbLambda, EntityRowHandler<WhiteImplicitConvNumeric> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvNumeric. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvNumericCB cb, EntityRowHandler<WhiteImplicitConvNumeric> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteImplicitConvNumericCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvNumeric> loaderLambda) {
        xassLRArg(whiteImplicitConvNumericList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteImplicitConvNumeric().ready(whiteImplicitConvNumericList, _behaviorSelector));
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
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvNumeric> loaderLambda) {
        xassLRArg(whiteImplicitConvNumeric, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteImplicitConvNumeric().ready(xnewLRAryLs(whiteImplicitConvNumeric), _behaviorSelector));
    }

    /**
     * Load referrer of whiteImplicitConvIntegerList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_INTEGER by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvInteger</span>(<span style="color: #553000">whiteImplicitConvNumericList</span>, <span style="color: #553000">integerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">integerCB</span>.setupSelect...
     *     <span style="color: #553000">integerCB</span>.query().set...
     *     <span style="color: #553000">integerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteImplicitConvNumeric whiteImplicitConvNumeric : <span style="color: #553000">whiteImplicitConvNumericList</span>) {
     *     ... = whiteImplicitConvNumeric.<span style="color: #CC4747">getWhiteImplicitConvIntegerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvInteger(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> refCBLambda) {
        xassLRArg(whiteImplicitConvNumericList, refCBLambda);
        return doLoadWhiteImplicitConvInteger(whiteImplicitConvNumericList, new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteImplicitConvIntegerList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_INTEGER by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvInteger</span>(<span style="color: #553000">whiteImplicitConvNumeric</span>, <span style="color: #553000">integerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">integerCB</span>.setupSelect...
     *     <span style="color: #553000">integerCB</span>.query().set...
     *     <span style="color: #553000">integerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteImplicitConvNumeric</span>.<span style="color: #CC4747">getWhiteImplicitConvIntegerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvInteger(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> refCBLambda) {
        xassLRArg(whiteImplicitConvNumeric, refCBLambda);
        return doLoadWhiteImplicitConvInteger(xnewLRLs(whiteImplicitConvNumeric), new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvInteger(WhiteImplicitConvNumeric whiteImplicitConvNumeric, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumeric, loadReferrerOption);
        return loadWhiteImplicitConvInteger(xnewLRLs(whiteImplicitConvNumeric), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvInteger(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumericList, loadReferrerOption);
        if (whiteImplicitConvNumericList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvInteger>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvInteger(whiteImplicitConvNumericList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvInteger> doLoadWhiteImplicitConvInteger(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> option) {
        return helpLoadReferrerInternally(whiteImplicitConvNumericList, option, "whiteImplicitConvIntegerList");
    }

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvString</span>(<span style="color: #553000">whiteImplicitConvNumericList</span>, <span style="color: #553000">stringCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stringCB</span>.setupSelect...
     *     <span style="color: #553000">stringCB</span>.query().set...
     *     <span style="color: #553000">stringCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteImplicitConvNumeric whiteImplicitConvNumeric : <span style="color: #553000">whiteImplicitConvNumericList</span>) {
     *     ... = whiteImplicitConvNumeric.<span style="color: #CC4747">getWhiteImplicitConvStringList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ConditionBeanSetupper<WhiteImplicitConvStringCB> refCBLambda) {
        xassLRArg(whiteImplicitConvNumericList, refCBLambda);
        return doLoadWhiteImplicitConvString(whiteImplicitConvNumericList, new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br>
     * WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">loadWhiteImplicitConvString</span>(<span style="color: #553000">whiteImplicitConvNumeric</span>, <span style="color: #553000">stringCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stringCB</span>.setupSelect...
     *     <span style="color: #553000">stringCB</span>.query().set...
     *     <span style="color: #553000">stringCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteImplicitConvNumeric</span>.<span style="color: #CC4747">getWhiteImplicitConvStringList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ConditionBeanSetupper<WhiteImplicitConvStringCB> refCBLambda) {
        xassLRArg(whiteImplicitConvNumeric, refCBLambda);
        return doLoadWhiteImplicitConvString(xnewLRLs(whiteImplicitConvNumeric), new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(WhiteImplicitConvNumeric whiteImplicitConvNumeric, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumeric, loadReferrerOption);
        return loadWhiteImplicitConvString(xnewLRLs(whiteImplicitConvNumeric), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvString(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumericList, loadReferrerOption);
        if (whiteImplicitConvNumericList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvString>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvString(whiteImplicitConvNumericList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvString> doLoadWhiteImplicitConvString(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> option) {
        return helpLoadReferrerInternally(whiteImplicitConvNumericList, option, "whiteImplicitConvStringList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvInteger'.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvInteger> pulloutWhiteImplicitConvInteger(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList)
    { return helpPulloutInternally(whiteImplicitConvNumericList, "whiteImplicitConvInteger"); }

    /**
     * Pull out the list of foreign table 'WhiteImplicitConvString'.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvString> pulloutWhiteImplicitConvString(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList)
    { return helpPulloutInternally(whiteImplicitConvNumericList, "whiteImplicitConvString"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvNumericId.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.math.BigDecimal> extractImplicitConvNumericIdList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList)
    { return helpExtractListInternally(whiteImplicitConvNumericList, "implicitConvNumericId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvNumeric.setFoo...(value);
     * whiteImplicitConvNumeric.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">insert</span>(whiteImplicitConvNumeric);
     * ... = whiteImplicitConvNumeric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvNumeric The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doInsert(whiteImplicitConvNumeric, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">update</span>(whiteImplicitConvNumeric);
     * </pre>
     * @param whiteImplicitConvNumeric The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doUpdate(whiteImplicitConvNumeric, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteImplicitConvNumeric The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doInsertOrUpdate(whiteImplicitConvNumeric, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">delete</span>(whiteImplicitConvNumeric);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doDelete(whiteImplicitConvNumeric, null);
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
     *     WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     *     whiteImplicitConvNumeric.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteImplicitConvNumeric.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitConvNumericList.add(whiteImplicitConvNumeric);
     * }
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteImplicitConvNumericList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchInsert(whiteImplicitConvNumericList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     *     whiteImplicitConvNumeric.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteImplicitConvNumeric.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteImplicitConvNumeric.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitConvNumericList.add(whiteImplicitConvNumeric);
     * }
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteImplicitConvNumericList);
     * </pre>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchUpdate(whiteImplicitConvNumericList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchDelete(whiteImplicitConvNumericList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB&gt;() {
     *     public ConditionBean setup(WhiteImplicitConvNumeric entity, WhiteImplicitConvNumericCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteImplicitConvNumeric, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return doQueryUpdate(whiteImplicitConvNumeric, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteImplicitConvNumeric, cb);
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WhiteImplicitConvNumericCB cb) {
        return doQueryUpdate(whiteImplicitConvNumeric, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteImplicitConvNumericCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitConvNumeric, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvNumericCB cb) {
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
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvNumeric.setFoo...(value);
     * whiteImplicitConvNumeric.setBar...(value);
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteImplicitConvNumeric, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteImplicitConvNumeric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvNumeric The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WritableOptionCall<WhiteImplicitConvNumericCB, InsertOption<WhiteImplicitConvNumericCB>> opLambda) {
        doInsert(whiteImplicitConvNumeric, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvNumeric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteImplicitConvNumeric, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteImplicitConvNumeric The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WritableOptionCall<WhiteImplicitConvNumericCB, UpdateOption<WhiteImplicitConvNumericCB>> opLambda) {
        doUpdate(whiteImplicitConvNumeric, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvNumeric The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WritableOptionCall<WhiteImplicitConvNumericCB, InsertOption<WhiteImplicitConvNumericCB>> insertOpLambda, WritableOptionCall<WhiteImplicitConvNumericCB, UpdateOption<WhiteImplicitConvNumericCB>> updateOpLambda) {
        doInsertOrUpdate(whiteImplicitConvNumeric, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvNumeric The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WritableOptionCall<WhiteImplicitConvNumericCB, DeleteOption<WhiteImplicitConvNumericCB>> opLambda) {
        doDelete(whiteImplicitConvNumeric, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, WritableOptionCall<WhiteImplicitConvNumericCB, InsertOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doBatchInsert(whiteImplicitConvNumericList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, WritableOptionCall<WhiteImplicitConvNumericCB, UpdateOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doBatchUpdate(whiteImplicitConvNumericList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, WritableOptionCall<WhiteImplicitConvNumericCB, DeleteOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doBatchDelete(whiteImplicitConvNumericList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> manyArgLambda, WritableOptionCall<WhiteImplicitConvNumericCB, InsertOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteImplicitConvNumeric, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, CBCall<WhiteImplicitConvNumericCB> cbLambda, WritableOptionCall<WhiteImplicitConvNumericCB, UpdateOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doQueryUpdate(whiteImplicitConvNumeric, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = <span style="color: #70226C">new</span> WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * WhiteImplicitConvNumericCB cb = <span style="color: #70226C">new</span> WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteImplicitConvNumeric, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WhiteImplicitConvNumericCB cb, WritableOptionCall<WhiteImplicitConvNumericCB, UpdateOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doQueryUpdate(whiteImplicitConvNumeric, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteImplicitConvNumericBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitConvNumeric, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteImplicitConvNumericCB> cbLambda, WritableOptionCall<WhiteImplicitConvNumericCB, DeleteOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitConvNumericCB cb, WritableOptionCall<WhiteImplicitConvNumericCB, DeleteOption<WhiteImplicitConvNumericCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteImplicitConvNumericBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteImplicitConvNumericBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteImplicitConvNumericBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteImplicitConvNumericBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteImplicitConvNumericBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteImplicitConvNumericBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteImplicitConvNumericBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteImplicitConvNumericBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteImplicitConvNumericBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteImplicitConvNumericBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteImplicitConvNumericBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteImplicitConvNumericBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteImplicitConvNumericBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteImplicitConvNumericBhv.outideSql().removeBlockComment().selectList()
     * whiteImplicitConvNumericBhv.outideSql().removeLineComment().selectList()
     * whiteImplicitConvNumericBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteImplicitConvNumericBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteImplicitConvNumeric> typeOfSelectedEntity() { return WhiteImplicitConvNumeric.class; }
    protected Class<WhiteImplicitConvNumeric> typeOfHandlingEntity() { return WhiteImplicitConvNumeric.class; }
    protected Class<WhiteImplicitConvNumericCB> typeOfHandlingConditionBean() { return WhiteImplicitConvNumericCB.class; }
}
