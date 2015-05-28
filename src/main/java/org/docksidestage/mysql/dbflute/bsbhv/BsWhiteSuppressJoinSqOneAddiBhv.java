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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI as TABLE. <br>
 * <pre>
 * [primary key]
 *     ONE_ADDI_ID
 *
 * [column]
 *     ONE_ADDI_ID, ONE_ADDI_NAME
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
 *     WHITE_SUPPRESS_JOIN_SQ_ONE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSuppressJoinSqOneList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqOneAddiBhv extends AbstractBehaviorWritable<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqOneAddiDbm asDBMeta() { return WhiteSuppressJoinSqOneAddiDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_suppress_join_sq_one_addi"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSuppressJoinSqOneAddiCB newConditionBean() { return new WhiteSuppressJoinSqOneAddiCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqOneAddiCB cb) {
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
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteSuppressJoinSqOneAddi</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteSuppressJoinSqOneAddi</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteSuppressJoinSqOneAddi</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteSuppressJoinSqOneAddi</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqOneAddi> selectEntity(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteSuppressJoinSqOneAddi <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteSuppressJoinSqOneAddi.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteSuppressJoinSqOneAddi <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteSuppressJoinSqOneAddi.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqOneAddi> selectEntity(WhiteSuppressJoinSqOneAddiCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSuppressJoinSqOneAddi> facadeSelectEntity(WhiteSuppressJoinSqOneAddiCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqOneAddiCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqOneAddi <span style="color: #553000">whiteSuppressJoinSqOneAddi</span> = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteSuppressJoinSqOneAddi</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOneAddi selectEntityWithDeletedCheck(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().set...;
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqOneAddi.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOneAddi selectEntityWithDeletedCheck(WhiteSuppressJoinSqOneAddiCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param oneAddiId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqOneAddi> selectByPK(Integer oneAddiId) {
        return facadeSelectByPK(oneAddiId);
    }

    protected OptionalEntity<WhiteSuppressJoinSqOneAddi> facadeSelectByPK(Integer oneAddiId) {
        return doSelectOptionalByPK(oneAddiId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> ENTITY doSelectByPK(Integer oneAddiId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(oneAddiId), tp);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer oneAddiId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(oneAddiId, tp), oneAddiId);
    }

    protected WhiteSuppressJoinSqOneAddiCB xprepareCBAsPK(Integer oneAddiId) {
        assertObjectNotNull("oneAddiId", oneAddiId);
        return newConditionBean().acceptPK(oneAddiId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteSuppressJoinSqOneAddi&gt; <span style="color: #553000">whiteSuppressJoinSqOneAddiList</span> = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqOneAddi <span style="color: #553000">whiteSuppressJoinSqOneAddi</span> : <span style="color: #553000">whiteSuppressJoinSqOneAddiList</span>) {
     *     ... = <span style="color: #553000">whiteSuppressJoinSqOneAddi</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqOneAddi> selectList(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteSuppressJoinSqOneAddi&gt; <span style="color: #553000">whiteSuppressJoinSqOneAddiList</span> = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : <span style="color: #553000">whiteSuppressJoinSqOneAddiList</span>) {
     *     ... = whiteSuppressJoinSqOneAddi.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqOneAddi> selectList(WhiteSuppressJoinSqOneAddiCB cb) {
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
     * PagingResultBean&lt;WhiteSuppressJoinSqOneAddi&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : <span style="color: #553000">page</span>) {
     *     ... = whiteSuppressJoinSqOneAddi.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqOneAddi> selectPage(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqOneAddi&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : <span style="color: #553000">page</span>) {
     *     ... = whiteSuppressJoinSqOneAddi.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqOneAddi> selectPage(WhiteSuppressJoinSqOneAddiCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSuppressJoinSqOneAddi. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda, EntityRowHandler<WhiteSuppressJoinSqOneAddi> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqOneAddi. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqOneAddiCB cb, EntityRowHandler<WhiteSuppressJoinSqOneAddi> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSuppressJoinSqOneAddiCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteSuppressJoinSqOneAddiList The entity list of whiteSuppressJoinSqOneAddi. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqOneAddi> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqOneAddiList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSqOneAddi().ready(whiteSuppressJoinSqOneAddiList, _behaviorSelector));
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
     * @param whiteSuppressJoinSqOneAddi The entity of whiteSuppressJoinSqOneAddi. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSqOneAddi> loaderLambda) {
        xassLRArg(whiteSuppressJoinSqOneAddi, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSuppressJoinSqOneAddi().ready(xnewLRAryLs(whiteSuppressJoinSqOneAddi), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSuppressJoinSqOneList by the set-upper of referrer. <br>
     * WHITE_SUPPRESS_JOIN_SQ_ONE by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqOne</span>(<span style="color: #553000">whiteSuppressJoinSqOneAddiList</span>, <span style="color: #553000">oneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">oneCB</span>.setupSelect...
     *     <span style="color: #553000">oneCB</span>.query().set...
     *     <span style="color: #553000">oneCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : <span style="color: #553000">whiteSuppressJoinSqOneAddiList</span>) {
     *     ... = whiteSuppressJoinSqOneAddi.<span style="color: #CC4747">getWhiteSuppressJoinSqOneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOneAddiId_InScope(pkList);
     * cb.query().addOrderBy_OneAddiId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqOneAddiList The entity list of whiteSuppressJoinSqOneAddi. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqOne> loadWhiteSuppressJoinSqOne(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, ConditionBeanSetupper<WhiteSuppressJoinSqOneCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqOneAddiList, refCBLambda);
        return doLoadWhiteSuppressJoinSqOne(whiteSuppressJoinSqOneAddiList, new LoadReferrerOption<WhiteSuppressJoinSqOneCB, WhiteSuppressJoinSqOne>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteSuppressJoinSqOneList by the set-upper of referrer. <br>
     * WHITE_SUPPRESS_JOIN_SQ_ONE by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'.
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">loadWhiteSuppressJoinSqOne</span>(<span style="color: #553000">whiteSuppressJoinSqOneAddi</span>, <span style="color: #553000">oneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">oneCB</span>.setupSelect...
     *     <span style="color: #553000">oneCB</span>.query().set...
     *     <span style="color: #553000">oneCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteSuppressJoinSqOneAddi</span>.<span style="color: #CC4747">getWhiteSuppressJoinSqOneList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOneAddiId_InScope(pkList);
     * cb.query().addOrderBy_OneAddiId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of whiteSuppressJoinSqOneAddi. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqOne> loadWhiteSuppressJoinSqOne(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, ConditionBeanSetupper<WhiteSuppressJoinSqOneCB> refCBLambda) {
        xassLRArg(whiteSuppressJoinSqOneAddi, refCBLambda);
        return doLoadWhiteSuppressJoinSqOne(xnewLRLs(whiteSuppressJoinSqOneAddi), new LoadReferrerOption<WhiteSuppressJoinSqOneCB, WhiteSuppressJoinSqOne>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSqOneAddi The entity of whiteSuppressJoinSqOneAddi. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqOne> loadWhiteSuppressJoinSqOne(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, LoadReferrerOption<WhiteSuppressJoinSqOneCB, WhiteSuppressJoinSqOne> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqOneAddi, loadReferrerOption);
        return loadWhiteSuppressJoinSqOne(xnewLRLs(whiteSuppressJoinSqOneAddi), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSuppressJoinSqOneAddiList The entity list of whiteSuppressJoinSqOneAddi. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSuppressJoinSqOne> loadWhiteSuppressJoinSqOne(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, LoadReferrerOption<WhiteSuppressJoinSqOneCB, WhiteSuppressJoinSqOne> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqOneAddiList, loadReferrerOption);
        if (whiteSuppressJoinSqOneAddiList.isEmpty()) { return (NestedReferrerListGateway<WhiteSuppressJoinSqOne>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSuppressJoinSqOne(whiteSuppressJoinSqOneAddiList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSuppressJoinSqOne> doLoadWhiteSuppressJoinSqOne(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, LoadReferrerOption<WhiteSuppressJoinSqOneCB, WhiteSuppressJoinSqOne> option) {
        return helpLoadReferrerInternally(whiteSuppressJoinSqOneAddiList, option, "whiteSuppressJoinSqOneList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key oneAddiId.
     * @param whiteSuppressJoinSqOneAddiList The list of whiteSuppressJoinSqOneAddi. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractOneAddiIdList(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList)
    { return helpExtractListInternally(whiteSuppressJoinSqOneAddiList, "oneAddiId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value);
     * whiteSuppressJoinSqOneAddi.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">insert</span>(whiteSuppressJoinSqOneAddi);
     * ... = whiteSuppressJoinSqOneAddi.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqOneAddi The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doInsert(whiteSuppressJoinSqOneAddi, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * whiteSuppressJoinSqOneAddi.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqOneAddi.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">update</span>(whiteSuppressJoinSqOneAddi);
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doUpdate(whiteSuppressJoinSqOneAddi, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteSuppressJoinSqOneAddi The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doInsertOrUpdate(whiteSuppressJoinSqOneAddi, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * whiteSuppressJoinSqOneAddi.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqOneAddi.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">delete</span>(whiteSuppressJoinSqOneAddi);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doDelete(whiteSuppressJoinSqOneAddi, null);
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
     *     WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     *     whiteSuppressJoinSqOneAddi.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSuppressJoinSqOneAddi.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqOneAddiList.add(whiteSuppressJoinSqOneAddi);
     * }
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteSuppressJoinSqOneAddiList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        return doBatchInsert(whiteSuppressJoinSqOneAddiList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     *     whiteSuppressJoinSqOneAddi.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSuppressJoinSqOneAddi.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteSuppressJoinSqOneAddi.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqOneAddiList.add(whiteSuppressJoinSqOneAddi);
     * }
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteSuppressJoinSqOneAddiList);
     * </pre>
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        return doBatchUpdate(whiteSuppressJoinSqOneAddiList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        return doBatchDelete(whiteSuppressJoinSqOneAddiList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public ConditionBean setup(WhiteSuppressJoinSqOneAddi entity, WhiteSuppressJoinSqOneAddiCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setPK...(value);</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSuppressJoinSqOneAddi, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return doQueryUpdate(whiteSuppressJoinSqOneAddi, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setPK...(value);</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setVersionNo(value);</span>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSuppressJoinSqOneAddi, cb);
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqOneAddi, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqOneAddi, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqOneAddi, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqOneAddiCB cb) {
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
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value);
     * whiteSuppressJoinSqOneAddi.setBar...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteSuppressJoinSqOneAddi, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteSuppressJoinSqOneAddi.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, InsertOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        doInsert(whiteSuppressJoinSqOneAddi, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * whiteSuppressJoinSqOneAddi.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqOneAddi.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSqOneAddi.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteSuppressJoinSqOneAddi, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, UpdateOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        doUpdate(whiteSuppressJoinSqOneAddi, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqOneAddi The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, InsertOption<WhiteSuppressJoinSqOneAddiCB>> insertOpLambda, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, UpdateOption<WhiteSuppressJoinSqOneAddiCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSuppressJoinSqOneAddi, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqOneAddi The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, DeleteOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        doDelete(whiteSuppressJoinSqOneAddi, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, InsertOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doBatchInsert(whiteSuppressJoinSqOneAddiList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, UpdateOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doBatchUpdate(whiteSuppressJoinSqOneAddiList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, DeleteOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doBatchDelete(whiteSuppressJoinSqOneAddiList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> manyArgLambda, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, InsertOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setPK...(value);</span>
     * whiteSuppressJoinSqOneAddi.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSuppressJoinSqOneAddi, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, UpdateOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSqOneAddi, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setPK...(value);</span>
     * whiteSuppressJoinSqOneAddi.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setVersionNo(value);</span>
     * WhiteSuppressJoinSqOneAddiCB cb = <span style="color: #70226C">new</span> WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSuppressJoinSqOneAddi, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB cb, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, UpdateOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doQueryUpdate(whiteSuppressJoinSqOneAddi, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteSuppressJoinSqOneAddiBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSuppressJoinSqOneAddi, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSuppressJoinSqOneAddiCB> cbLambda, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, DeleteOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqOneAddiCB cb, WritableOptionCall<WhiteSuppressJoinSqOneAddiCB, DeleteOption<WhiteSuppressJoinSqOneAddiCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSuppressJoinSqOneAddiBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSuppressJoinSqOneAddiBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqOneAddiBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSuppressJoinSqOneAddiBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSuppressJoinSqOneAddiBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSuppressJoinSqOneAddiBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSuppressJoinSqOneAddiBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSuppressJoinSqOneAddiBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSuppressJoinSqOneAddiBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSuppressJoinSqOneAddiBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSuppressJoinSqOneAddiBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSuppressJoinSqOneAddiBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSuppressJoinSqOneAddiBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSuppressJoinSqOneAddiBhv.outideSql().removeBlockComment().selectList()
     * whiteSuppressJoinSqOneAddiBhv.outideSql().removeLineComment().selectList()
     * whiteSuppressJoinSqOneAddiBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteSuppressJoinSqOneAddiBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSuppressJoinSqOneAddi> typeOfSelectedEntity() { return WhiteSuppressJoinSqOneAddi.class; }
    protected Class<WhiteSuppressJoinSqOneAddi> typeOfHandlingEntity() { return WhiteSuppressJoinSqOneAddi.class; }
    protected Class<WhiteSuppressJoinSqOneAddiCB> typeOfHandlingConditionBean() { return WhiteSuppressJoinSqOneAddiCB.class; }
}
