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
 * The behavior of WHITE_COMPOUND_PK_REF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefBhv extends AbstractBehaviorWritable<WhiteCompoundPkRef, WhiteCompoundPkRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteCompoundPkRefDbm asDBMeta() { return WhiteCompoundPkRefDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_compound_pk_ref"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteCompoundPkRefCB newConditionBean() { return new WhiteCompoundPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkRefCB cb) {
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
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteCompoundPkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteCompoundPkRef</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteCompoundPkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteCompoundPkRef</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundPkRef> selectEntity(CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteCompoundPkRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteCompoundPkRef.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteCompoundPkRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteCompoundPkRef.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundPkRef> selectEntity(WhiteCompoundPkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteCompoundPkRef> facadeSelectEntity(WhiteCompoundPkRefCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteCompoundPkRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundPkRef <span style="color: #553000">whiteCompoundPkRef</span> = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteCompoundPkRef</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectEntityWithDeletedCheck(CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().set...;
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectEntityWithDeletedCheck(WhiteCompoundPkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param multipleFirstId : PK, NotNull, INT(10). (NotNull)
     * @param multipleSecondId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundPkRef> selectByPK(Integer multipleFirstId, Integer multipleSecondId) {
        return facadeSelectByPK(multipleFirstId, multipleSecondId);
    }

    protected OptionalEntity<WhiteCompoundPkRef> facadeSelectByPK(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectOptionalByPK(multipleFirstId, multipleSecondId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectByPK(Integer multipleFirstId, Integer multipleSecondId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(multipleFirstId, multipleSecondId), tp);
    }

    protected <ENTITY extends WhiteCompoundPkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer multipleFirstId, Integer multipleSecondId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(multipleFirstId, multipleSecondId, tp), multipleFirstId, multipleSecondId);
    }

    protected WhiteCompoundPkRefCB xprepareCBAsPK(Integer multipleFirstId, Integer multipleSecondId) {
        assertObjectNotNull("multipleFirstId", multipleFirstId);assertObjectNotNull("multipleSecondId", multipleSecondId);
        return newConditionBean().acceptPK(multipleFirstId, multipleSecondId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteCompoundPkRef&gt; <span style="color: #553000">whiteCompoundPkRefList</span> = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteCompoundPkRef <span style="color: #553000">whiteCompoundPkRef</span> : <span style="color: #553000">whiteCompoundPkRefList</span>) {
     *     ... = <span style="color: #553000">whiteCompoundPkRef</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRef> selectList(CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteCompoundPkRef&gt; <span style="color: #553000">whiteCompoundPkRefList</span> = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">whiteCompoundPkRefList</span>) {
     *     ... = whiteCompoundPkRef.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRef> selectList(WhiteCompoundPkRefCB cb) {
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
     * PagingResultBean&lt;WhiteCompoundPkRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">page</span>) {
     *     ... = whiteCompoundPkRef.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRef> selectPage(CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">page</span>) {
     *     ... = whiteCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRef> selectPage(WhiteCompoundPkRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param entityLambda The handler of entity row of WhiteCompoundPkRef. (NotNull)
     */
    public void selectCursor(CBCall<WhiteCompoundPkRefCB> cbLambda, EntityRowHandler<WhiteCompoundPkRef> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPkRef. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<WhiteCompoundPkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteCompoundPkRefCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteCompoundPkRef> whiteCompoundPkRefList, ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRef> loaderLambda) {
        xassLRArg(whiteCompoundPkRefList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteCompoundPkRef().ready(whiteCompoundPkRefList, _behaviorSelector));
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
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteCompoundPkRef whiteCompoundPkRef, ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRef> loaderLambda) {
        xassLRArg(whiteCompoundPkRef, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteCompoundPkRef().ready(xnewLRAryLs(whiteCompoundPkRef), _behaviorSelector));
    }

    /**
     * Load referrer of whiteCompoundPkRefNestByQuxMultipleIdList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_NEST by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefNestByQuxMultipleId</span>(<span style="color: #553000">whiteCompoundPkRefList</span>, <span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nestCB</span>.setupSelect...
     *     <span style="color: #553000">nestCB</span>.query().set...
     *     <span style="color: #553000">nestCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">whiteCompoundPkRefList</span>) {
     *     ... = whiteCompoundPkRef.<span style="color: #CC4747">getWhiteCompoundPkRefNestByQuxMultipleIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByQuxMultipleId(List<WhiteCompoundPkRef> whiteCompoundPkRefList, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        xassLRArg(whiteCompoundPkRefList, refCBLambda);
        return doLoadWhiteCompoundPkRefNestByQuxMultipleId(whiteCompoundPkRefList, new LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteCompoundPkRefNestByQuxMultipleIdList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_NEST by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefNestByQuxMultipleId</span>(<span style="color: #553000">whiteCompoundPkRef</span>, <span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nestCB</span>.setupSelect...
     *     <span style="color: #553000">nestCB</span>.query().set...
     *     <span style="color: #553000">nestCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteCompoundPkRef</span>.<span style="color: #CC4747">getWhiteCompoundPkRefNestByQuxMultipleIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByQuxMultipleId(WhiteCompoundPkRef whiteCompoundPkRef, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        xassLRArg(whiteCompoundPkRef, refCBLambda);
        return doLoadWhiteCompoundPkRefNestByQuxMultipleId(xnewLRLs(whiteCompoundPkRef), new LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByQuxMultipleId(WhiteCompoundPkRef whiteCompoundPkRef, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRef, loadReferrerOption);
        return loadWhiteCompoundPkRefNestByQuxMultipleId(xnewLRLs(whiteCompoundPkRef), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByQuxMultipleId(List<WhiteCompoundPkRef> whiteCompoundPkRefList, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRefList, loadReferrerOption);
        if (whiteCompoundPkRefList.isEmpty()) { return (NestedReferrerListGateway<WhiteCompoundPkRefNest>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteCompoundPkRefNestByQuxMultipleId(whiteCompoundPkRefList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteCompoundPkRefNest> doLoadWhiteCompoundPkRefNestByQuxMultipleId(List<WhiteCompoundPkRef> whiteCompoundPkRefList, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> option) {
        return helpLoadReferrerInternally(whiteCompoundPkRefList, option, "whiteCompoundPkRefNestByQuxMultipleIdList");
    }

    /**
     * Load referrer of whiteCompoundPkRefNestByFooMultipleIdList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_NEST by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefNestByFooMultipleId</span>(<span style="color: #553000">whiteCompoundPkRefList</span>, <span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nestCB</span>.setupSelect...
     *     <span style="color: #553000">nestCB</span>.query().set...
     *     <span style="color: #553000">nestCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteCompoundPkRef whiteCompoundPkRef : <span style="color: #553000">whiteCompoundPkRefList</span>) {
     *     ... = whiteCompoundPkRef.<span style="color: #CC4747">getWhiteCompoundPkRefNestByFooMultipleIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByFooMultipleId(List<WhiteCompoundPkRef> whiteCompoundPkRefList, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        xassLRArg(whiteCompoundPkRefList, refCBLambda);
        return doLoadWhiteCompoundPkRefNestByFooMultipleId(whiteCompoundPkRefList, new LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteCompoundPkRefNestByFooMultipleIdList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_NEST by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefNestByFooMultipleId</span>(<span style="color: #553000">whiteCompoundPkRef</span>, <span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nestCB</span>.setupSelect...
     *     <span style="color: #553000">nestCB</span>.query().set...
     *     <span style="color: #553000">nestCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteCompoundPkRef</span>.<span style="color: #CC4747">getWhiteCompoundPkRefNestByFooMultipleIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByFooMultipleId(WhiteCompoundPkRef whiteCompoundPkRef, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> refCBLambda) {
        xassLRArg(whiteCompoundPkRef, refCBLambda);
        return doLoadWhiteCompoundPkRefNestByFooMultipleId(xnewLRLs(whiteCompoundPkRef), new LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByFooMultipleId(WhiteCompoundPkRef whiteCompoundPkRef, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRef, loadReferrerOption);
        return loadWhiteCompoundPkRefNestByFooMultipleId(xnewLRLs(whiteCompoundPkRef), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteCompoundPkRefNest> loadWhiteCompoundPkRefNestByFooMultipleId(List<WhiteCompoundPkRef> whiteCompoundPkRefList, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRefList, loadReferrerOption);
        if (whiteCompoundPkRefList.isEmpty()) { return (NestedReferrerListGateway<WhiteCompoundPkRefNest>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteCompoundPkRefNestByFooMultipleId(whiteCompoundPkRefList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteCompoundPkRefNest> doLoadWhiteCompoundPkRefNestByFooMultipleId(List<WhiteCompoundPkRef> whiteCompoundPkRefList, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> option) {
        return helpLoadReferrerInternally(whiteCompoundPkRefList, option, "whiteCompoundPkRefNestByFooMultipleIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteCompoundPk'.
     * @param whiteCompoundPkRefList The list of whiteCompoundPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPk> pulloutWhiteCompoundPk(List<WhiteCompoundPkRef> whiteCompoundPkRefList)
    { return helpPulloutInternally(whiteCompoundPkRefList, "whiteCompoundPk"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRef.setFoo...(value);
     * whiteCompoundPkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">insert</span>(whiteCompoundPkRef);
     * ... = whiteCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPkRef whiteCompoundPkRef) {
        doInsert(whiteCompoundPkRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">update</span>(whiteCompoundPkRef);
     * </pre>
     * @param whiteCompoundPkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteCompoundPkRef whiteCompoundPkRef) {
        doUpdate(whiteCompoundPkRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteCompoundPkRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef) {
        doInsertOrUpdate(whiteCompoundPkRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">delete</span>(whiteCompoundPkRef);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPkRef whiteCompoundPkRef) {
        doDelete(whiteCompoundPkRef, null);
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
     *     WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     *     whiteCompoundPkRef.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteCompoundPkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkRefList.add(whiteCompoundPkRef);
     * }
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteCompoundPkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchInsert(whiteCompoundPkRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     *     whiteCompoundPkRef.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteCompoundPkRef.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteCompoundPkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkRefList.add(whiteCompoundPkRef);
     * }
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteCompoundPkRefList);
     * </pre>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchUpdate(whiteCompoundPkRefList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchDelete(whiteCompoundPkRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPkRef, WhiteCompoundPkRefCB&gt;() {
     *     public ConditionBean setup(WhiteCompoundPkRef entity, WhiteCompoundPkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteCompoundPkRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return doQueryUpdate(whiteCompoundPkRef, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteCompoundPkRef, cb);
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb) {
        return doQueryUpdate(whiteCompoundPkRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteCompoundPkRefCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteCompoundPkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkRefCB cb) {
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
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRef.setFoo...(value);
     * whiteCompoundPkRef.setBar...(value);
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteCompoundPkRef, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPkRef whiteCompoundPkRef, WritableOptionCall<WhiteCompoundPkRefCB, InsertOption<WhiteCompoundPkRefCB>> opLambda) {
        doInsert(whiteCompoundPkRef, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteCompoundPkRef, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteCompoundPkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WritableOptionCall<WhiteCompoundPkRefCB, UpdateOption<WhiteCompoundPkRefCB>> opLambda) {
        doUpdate(whiteCompoundPkRef, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPkRef The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WritableOptionCall<WhiteCompoundPkRefCB, InsertOption<WhiteCompoundPkRefCB>> insertOpLambda, WritableOptionCall<WhiteCompoundPkRefCB, UpdateOption<WhiteCompoundPkRefCB>> updateOpLambda) {
        doInsertOrUpdate(whiteCompoundPkRef, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPkRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPkRef whiteCompoundPkRef, WritableOptionCall<WhiteCompoundPkRefCB, DeleteOption<WhiteCompoundPkRefCB>> opLambda) {
        doDelete(whiteCompoundPkRef, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList, WritableOptionCall<WhiteCompoundPkRefCB, InsertOption<WhiteCompoundPkRefCB>> opLambda) {
        return doBatchInsert(whiteCompoundPkRefList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList, WritableOptionCall<WhiteCompoundPkRefCB, UpdateOption<WhiteCompoundPkRefCB>> opLambda) {
        return doBatchUpdate(whiteCompoundPkRefList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList, WritableOptionCall<WhiteCompoundPkRefCB, DeleteOption<WhiteCompoundPkRefCB>> opLambda) {
        return doBatchDelete(whiteCompoundPkRefList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> manyArgLambda, WritableOptionCall<WhiteCompoundPkRefCB, InsertOption<WhiteCompoundPkRefCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteCompoundPkRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, CBCall<WhiteCompoundPkRefCB> cbLambda, WritableOptionCall<WhiteCompoundPkRefCB, UpdateOption<WhiteCompoundPkRefCB>> opLambda) {
        return doQueryUpdate(whiteCompoundPkRef, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteCompoundPkRef whiteCompoundPkRef = <span style="color: #70226C">new</span> WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * WhiteCompoundPkRefCB cb = <span style="color: #70226C">new</span> WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteCompoundPkRef, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb, WritableOptionCall<WhiteCompoundPkRefCB, UpdateOption<WhiteCompoundPkRefCB>> opLambda) {
        return doQueryUpdate(whiteCompoundPkRef, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteCompoundPkRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteCompoundPkRefCB> cbLambda, WritableOptionCall<WhiteCompoundPkRefCB, DeleteOption<WhiteCompoundPkRefCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkRefCB cb, WritableOptionCall<WhiteCompoundPkRefCB, DeleteOption<WhiteCompoundPkRefCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteCompoundPkRefBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteCompoundPkRefBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteCompoundPkRefBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteCompoundPkRefBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteCompoundPkRefBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteCompoundPkRefBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteCompoundPkRefBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteCompoundPkRefBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteCompoundPkRefBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteCompoundPkRefBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteCompoundPkRefBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteCompoundPkRefBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteCompoundPkRefBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteCompoundPkRefBhv.outideSql().removeBlockComment().selectList()
     * whiteCompoundPkRefBhv.outideSql().removeLineComment().selectList()
     * whiteCompoundPkRefBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteCompoundPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteCompoundPkRef> typeOfSelectedEntity() { return WhiteCompoundPkRef.class; }
    protected Class<WhiteCompoundPkRef> typeOfHandlingEntity() { return WhiteCompoundPkRef.class; }
    protected Class<WhiteCompoundPkRefCB> typeOfHandlingConditionBean() { return WhiteCompoundPkRefCB.class; }
}
