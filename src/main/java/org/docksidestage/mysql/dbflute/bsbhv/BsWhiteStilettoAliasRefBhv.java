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
 * The behavior of WHITE_STILETTO_ALIAS_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, FOO0, FOO_1, FOO2, FOO3, FOO_4, BAR_0, QUX_0, c21, c22, c23, STILETTO_ALIAS_ID
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
 *     white_stiletto_alias
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteStilettoAlias
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAliasRefBhv extends AbstractBehaviorWritable<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteStilettoAliasRefDbm getDBMeta() { return WhiteStilettoAliasRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteStilettoAliasRefCB newConditionBean() { return new WhiteStilettoAliasRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteStilettoAliasRefCB cb) {
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
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteStilettoAliasRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteStilettoAliasRef</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteStilettoAliasRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteStilettoAliasRef</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteStilettoAliasRef> selectEntity(CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteStilettoAliasRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteStilettoAliasRef.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteStilettoAliasRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteStilettoAliasRef.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteStilettoAliasRef> selectEntity(WhiteStilettoAliasRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteStilettoAliasRef> facadeSelectEntity(WhiteStilettoAliasRefCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteStilettoAliasRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteStilettoAliasRef <span style="color: #553000">whiteStilettoAliasRef</span> = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteStilettoAliasRef</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAliasRef selectEntityWithDeletedCheck(CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().set...;
     * WhiteStilettoAliasRef whiteStilettoAliasRef = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteStilettoAliasRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAliasRef selectEntityWithDeletedCheck(WhiteStilettoAliasRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param refId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteStilettoAliasRef> selectByPK(Integer refId) {
        return facadeSelectByPK(refId);
    }

    protected OptionalEntity<WhiteStilettoAliasRef> facadeSelectByPK(Integer refId) {
        return doSelectOptionalByPK(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> ENTITY doSelectByPK(Integer refId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refId), tp);
    }

    protected <ENTITY extends WhiteStilettoAliasRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer refId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refId, tp), refId);
    }

    protected WhiteStilettoAliasRefCB xprepareCBAsPK(Integer refId) {
        assertObjectNotNull("refId", refId);
        return newConditionBean().acceptPK(refId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteStilettoAliasRef&gt; <span style="color: #553000">whiteStilettoAliasRefList</span> = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (WhiteStilettoAliasRef <span style="color: #553000">whiteStilettoAliasRef</span> : <span style="color: #553000">whiteStilettoAliasRefList</span>) {
     *     ... = <span style="color: #553000">whiteStilettoAliasRef</span>.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteStilettoAliasRef> selectList(CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;WhiteStilettoAliasRef&gt; <span style="color: #553000">whiteStilettoAliasRefList</span> = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhiteStilettoAliasRef whiteStilettoAliasRef : <span style="color: #553000">whiteStilettoAliasRefList</span>) {
     *     ... = whiteStilettoAliasRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteStilettoAliasRef> selectList(WhiteStilettoAliasRefCB cb) {
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
     * PagingResultBean&lt;WhiteStilettoAliasRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhiteStilettoAliasRef whiteStilettoAliasRef : <span style="color: #553000">page</span>) {
     *     ... = whiteStilettoAliasRef.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteStilettoAliasRef> selectPage(CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteStilettoAliasRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhiteStilettoAliasRef whiteStilettoAliasRef : <span style="color: #553000">page</span>) {
     *     ... = whiteStilettoAliasRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteStilettoAliasRef> selectPage(WhiteStilettoAliasRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param entityLambda The handler of entity row of WhiteStilettoAliasRef. (NotNull)
     */
    public void selectCursor(CBCall<WhiteStilettoAliasRefCB> cbLambda, EntityRowHandler<WhiteStilettoAliasRef> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteStilettoAliasRef&gt;() {
     *     public void handle(WhiteStilettoAliasRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteStilettoAliasRef. (NotNull)
     */
    public void selectCursor(WhiteStilettoAliasRefCB cb, EntityRowHandler<WhiteStilettoAliasRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteStilettoAliasRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteStilettoAliasRefList The entity list of whiteStilettoAliasRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, ReferrerLoaderHandler<LoaderOfWhiteStilettoAliasRef> loaderLambda) {
        xassLRArg(whiteStilettoAliasRefList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteStilettoAliasRef().ready(whiteStilettoAliasRefList, _behaviorSelector));
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
     * for (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteStilettoAliasRef The entity of whiteStilettoAliasRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteStilettoAliasRef whiteStilettoAliasRef, ReferrerLoaderHandler<LoaderOfWhiteStilettoAliasRef> loaderLambda) {
        xassLRArg(whiteStilettoAliasRef, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteStilettoAliasRef().ready(xnewLRAryLs(whiteStilettoAliasRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteStilettoAlias'.
     * @param whiteStilettoAliasRefList The list of whiteStilettoAliasRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteStilettoAlias> pulloutWhiteStilettoAlias(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList)
    { return helpPulloutInternally(whiteStilettoAliasRefList, "whiteStilettoAlias"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refId.
     * @param whiteStilettoAliasRefList The list of whiteStilettoAliasRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractRefIdList(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList)
    { return helpExtractListInternally(whiteStilettoAliasRefList, "refId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteStilettoAliasRef.setFoo...(value);
     * whiteStilettoAliasRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">insert</span>(whiteStilettoAliasRef);
     * ... = whiteStilettoAliasRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteStilettoAliasRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doInsert(whiteStilettoAliasRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * whiteStilettoAliasRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteStilettoAliasRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAliasRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">update</span>(whiteStilettoAliasRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAliasRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doUpdate(whiteStilettoAliasRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteStilettoAliasRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doInsertOrUpdate(whiteStilettoAliasRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * whiteStilettoAliasRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAliasRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">delete</span>(whiteStilettoAliasRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAliasRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doDelete(whiteStilettoAliasRef, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     *     whiteStilettoAliasRef.setFooName("foo");
     *     if (...) {
     *         whiteStilettoAliasRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteStilettoAliasRefList.add(whiteStilettoAliasRef);
     * }
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteStilettoAliasRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        return doBatchInsert(whiteStilettoAliasRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     *     whiteStilettoAliasRef.setFooName("foo");
     *     if (...) {
     *         whiteStilettoAliasRef.setFooPrice(123);
     *     } else {
     *         whiteStilettoAliasRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteStilettoAliasRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteStilettoAliasRefList.add(whiteStilettoAliasRef);
     * }
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteStilettoAliasRefList);
     * </pre>
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        return doBatchUpdate(whiteStilettoAliasRefList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        return doBatchDelete(whiteStilettoAliasRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteStilettoAliasRef, WhiteStilettoAliasRefCB&gt;() {
     *     public ConditionBean setup(WhiteStilettoAliasRef entity, WhiteStilettoAliasRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setPK...(value);</span>
     * whiteStilettoAliasRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setVersionNo(value);</span>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteStilettoAliasRef, cb);
     * </pre>
     * @param whiteStilettoAliasRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return doQueryUpdate(whiteStilettoAliasRef, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setPK...(value);</span>
     * whiteStilettoAliasRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setVersionNo(value);</span>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteStilettoAliasRef, cb);
     * </pre>
     * @param whiteStilettoAliasRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, WhiteStilettoAliasRefCB cb) {
        return doQueryUpdate(whiteStilettoAliasRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteStilettoAliasRef, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteStilettoAliasRefCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteStilettoAliasRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteStilettoAliasRefCB cb) {
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
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteStilettoAliasRef.setFoo...(value);
     * whiteStilettoAliasRef.setBar...(value);
     * InsertOption&lt;WhiteStilettoAliasRefCB&gt; option = new InsertOption&lt;WhiteStilettoAliasRefCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteStilettoAliasRef, option);
     * ... = whiteStilettoAliasRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteStilettoAliasRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteStilettoAliasRef whiteStilettoAliasRef, WritableOptionCall<WhiteStilettoAliasRefCB, InsertOption<WhiteStilettoAliasRefCB>> opLambda) {
        doInsert(whiteStilettoAliasRef, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * whiteStilettoAliasRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteStilettoAliasRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAliasRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteStilettoAliasRefCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *         public void specify(WhiteStilettoAliasRefCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteStilettoAliasRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAliasRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, WritableOptionCall<WhiteStilettoAliasRefCB, UpdateOption<WhiteStilettoAliasRefCB>> opLambda) {
        doUpdate(whiteStilettoAliasRef, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteStilettoAliasRef The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, WritableOptionCall<WhiteStilettoAliasRefCB, InsertOption<WhiteStilettoAliasRefCB>> insertOpLambda, WritableOptionCall<WhiteStilettoAliasRefCB, UpdateOption<WhiteStilettoAliasRefCB>> updateOpLambda) {
        doInsertOrUpdate(whiteStilettoAliasRef, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteStilettoAliasRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteStilettoAliasRef whiteStilettoAliasRef, WritableOptionCall<WhiteStilettoAliasRefCB, DeleteOption<WhiteStilettoAliasRefCB>> opLambda) {
        doDelete(whiteStilettoAliasRef, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, WritableOptionCall<WhiteStilettoAliasRefCB, InsertOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doBatchInsert(whiteStilettoAliasRefList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, WritableOptionCall<WhiteStilettoAliasRefCB, UpdateOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doBatchUpdate(whiteStilettoAliasRefList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, WritableOptionCall<WhiteStilettoAliasRefCB, DeleteOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doBatchDelete(whiteStilettoAliasRefList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> manyArgLambda, WritableOptionCall<WhiteStilettoAliasRefCB, InsertOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setPK...(value);</span>
     * whiteStilettoAliasRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setVersionNo(value);</span>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteStilettoAliasRefCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void specify(WhiteStilettoAliasRefCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteStilettoAliasRef, cb, option);
     * </pre>
     * @param whiteStilettoAliasRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, CBCall<WhiteStilettoAliasRefCB> cbLambda, WritableOptionCall<WhiteStilettoAliasRefCB, UpdateOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doQueryUpdate(whiteStilettoAliasRef, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setPK...(value);</span>
     * whiteStilettoAliasRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setVersionNo(value);</span>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteStilettoAliasRefCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void specify(WhiteStilettoAliasRefCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteStilettoAliasRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteStilettoAliasRef, cb, option);
     * </pre>
     * @param whiteStilettoAliasRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, WhiteStilettoAliasRefCB cb, WritableOptionCall<WhiteStilettoAliasRefCB, UpdateOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doQueryUpdate(whiteStilettoAliasRef, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteStilettoAliasRefCB> cbLambda, WritableOptionCall<WhiteStilettoAliasRefCB, DeleteOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteStilettoAliasRefCB cb, WritableOptionCall<WhiteStilettoAliasRefCB, DeleteOption<WhiteStilettoAliasRefCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteStilettoAliasRefBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteStilettoAliasRefBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteStilettoAliasRefBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteStilettoAliasRefBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteStilettoAliasRefBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteStilettoAliasRefBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteStilettoAliasRefBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteStilettoAliasRefBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteStilettoAliasRefBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteStilettoAliasRefBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteStilettoAliasRefBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteStilettoAliasRefBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteStilettoAliasRefBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteStilettoAliasRefBhv.outideSql().removeBlockComment().selectList()
     * whiteStilettoAliasRefBhv.outideSql().removeLineComment().selectList()
     * whiteStilettoAliasRefBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteStilettoAliasRefBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteStilettoAliasRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteStilettoAliasRef> typeOfSelectedEntity() { return WhiteStilettoAliasRef.class; }
    protected Class<WhiteStilettoAliasRef> typeOfHandlingEntity() { return WhiteStilettoAliasRef.class; }
    protected Class<WhiteStilettoAliasRefCB> typeOfHandlingConditionBean() { return WhiteStilettoAliasRefCB.class; }
}
