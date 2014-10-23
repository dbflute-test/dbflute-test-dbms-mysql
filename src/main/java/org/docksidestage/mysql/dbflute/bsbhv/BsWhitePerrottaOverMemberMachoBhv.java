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
 * The behavior of WHITE_PERROTTA_OVER_MEMBER_MACHO as TABLE. <br />
 * <pre>
 * [primary key]
 *     MACHO_CODE
 *
 * [column]
 *     MACHO_CODE, MACHO_NAME
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
 *     white_perrotta_over_member
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePerrottaOverMemberList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverMemberMachoBhv extends AbstractBehaviorWritable<WhitePerrottaOverMemberMacho, WhitePerrottaOverMemberMachoCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePerrottaOverMemberMachoDbm getDBMeta() { return WhitePerrottaOverMemberMachoDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePerrottaOverMemberMachoCB newConditionBean() { return new WhitePerrottaOverMemberMachoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePerrottaOverMemberMachoCB cb) {
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
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whitePerrottaOverMemberMacho</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whitePerrottaOverMemberMacho</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whitePerrottaOverMemberMacho</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whitePerrottaOverMemberMacho</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverMemberMacho> selectEntity(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whitePerrottaOverMemberMacho <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whitePerrottaOverMemberMacho.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whitePerrottaOverMemberMacho <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whitePerrottaOverMemberMacho.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverMemberMacho> selectEntity(WhitePerrottaOverMemberMachoCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhitePerrottaOverMemberMacho> facadeSelectEntity(WhitePerrottaOverMemberMachoCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverMemberMacho> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePerrottaOverMemberMachoCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverMemberMacho <span style="color: #553000">whitePerrottaOverMemberMacho</span> = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whitePerrottaOverMemberMacho</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverMemberMacho selectEntityWithDeletedCheck(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().set...;
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverMemberMacho.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverMemberMacho selectEntityWithDeletedCheck(WhitePerrottaOverMemberMachoCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param machoCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverMemberMacho> selectByPK(String machoCode) {
        return facadeSelectByPK(machoCode);
    }

    protected OptionalEntity<WhitePerrottaOverMemberMacho> facadeSelectByPK(String machoCode) {
        return doSelectOptionalByPK(machoCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverMemberMacho> ENTITY doSelectByPK(String machoCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(machoCode), tp);
    }

    protected <ENTITY extends WhitePerrottaOverMemberMacho> OptionalEntity<ENTITY> doSelectOptionalByPK(String machoCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(machoCode, tp), machoCode);
    }

    protected WhitePerrottaOverMemberMachoCB xprepareCBAsPK(String machoCode) {
        assertObjectNotNull("machoCode", machoCode);
        return newConditionBean().acceptPK(machoCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhitePerrottaOverMemberMacho&gt; <span style="color: #553000">whitePerrottaOverMemberMachoList</span> = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (WhitePerrottaOverMemberMacho <span style="color: #553000">whitePerrottaOverMemberMacho</span> : <span style="color: #553000">whitePerrottaOverMemberMachoList</span>) {
     *     ... = <span style="color: #553000">whitePerrottaOverMemberMacho</span>.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverMemberMacho> selectList(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;WhitePerrottaOverMemberMacho&gt; <span style="color: #553000">whitePerrottaOverMemberMachoList</span> = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho : <span style="color: #553000">whitePerrottaOverMemberMachoList</span>) {
     *     ... = whitePerrottaOverMemberMacho.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverMemberMacho> selectList(WhitePerrottaOverMemberMachoCB cb) {
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
     * PagingResultBean&lt;WhitePerrottaOverMemberMacho&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho : <span style="color: #553000">page</span>) {
     *     ... = whitePerrottaOverMemberMacho.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverMemberMacho> selectPage(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverMemberMacho&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho : <span style="color: #553000">page</span>) {
     *     ... = whitePerrottaOverMemberMacho.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverMemberMacho> selectPage(WhitePerrottaOverMemberMachoCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @param entityLambda The handler of entity row of WhitePerrottaOverMemberMacho. (NotNull)
     */
    public void selectCursor(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda, EntityRowHandler<WhitePerrottaOverMemberMacho> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().set...
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePerrottaOverMemberMacho&gt;() {
     *     public void handle(WhitePerrottaOverMemberMacho entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePerrottaOverMemberMacho. (NotNull)
     */
    public void selectCursor(WhitePerrottaOverMemberMachoCB cb, EntityRowHandler<WhitePerrottaOverMemberMacho> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePerrottaOverMemberMachoCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * Load referrer by the the referrer loader. <br />
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
     * @param whitePerrottaOverMemberMachoList The entity list of whitePerrottaOverMemberMacho. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverMemberMacho> loaderLambda) {
        xassLRArg(whitePerrottaOverMemberMachoList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverMemberMacho().ready(whitePerrottaOverMemberMachoList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
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
     * @param whitePerrottaOverMemberMacho The entity of whitePerrottaOverMemberMacho. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverMemberMacho> loaderLambda) {
        xassLRArg(whitePerrottaOverMemberMacho, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverMemberMacho().ready(xnewLRAryLs(whitePerrottaOverMemberMacho), _behaviorSelector));
    }

    /**
     * Load referrer of whitePerrottaOverMemberList by the set-upper of referrer. <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">loadWhitePerrottaOverMemberList</span>(<span style="color: #553000">whitePerrottaOverMemberMachoList</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho : <span style="color: #553000">whitePerrottaOverMemberMachoList</span>) {
     *     ... = whitePerrottaOverMemberMacho.<span style="color: #CC4747">getWhitePerrottaOverMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMachoCode_InScope(pkList);
     * cb.query().addOrderBy_MachoCode_Asc();
     * </pre>
     * @param whitePerrottaOverMemberMachoList The entity list of whitePerrottaOverMemberMacho. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        xassLRArg(whitePerrottaOverMemberMachoList, refCBLambda);
        return doLoadWhitePerrottaOverMemberList(whitePerrottaOverMemberMachoList, new LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whitePerrottaOverMemberList by the set-upper of referrer. <br />
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">loadWhitePerrottaOverMemberList</span>(<span style="color: #553000">whitePerrottaOverMemberMacho</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whitePerrottaOverMemberMacho</span>.<span style="color: #CC4747">getWhitePerrottaOverMemberList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMachoCode_InScope(pkList);
     * cb.query().addOrderBy_MachoCode_Asc();
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity of whitePerrottaOverMemberMacho. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        xassLRArg(whitePerrottaOverMemberMacho, refCBLambda);
        return doLoadWhitePerrottaOverMemberList(xnewLRLs(whitePerrottaOverMemberMacho), new LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePerrottaOverMemberMacho The entity of whitePerrottaOverMemberMacho. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember> loadReferrerOption) {
        xassLRArg(whitePerrottaOverMemberMacho, loadReferrerOption);
        return loadWhitePerrottaOverMemberList(xnewLRLs(whitePerrottaOverMemberMacho), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whitePerrottaOverMemberMachoList The entity list of whitePerrottaOverMemberMacho. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember> loadReferrerOption) {
        xassLRArg(whitePerrottaOverMemberMachoList, loadReferrerOption);
        if (whitePerrottaOverMemberMachoList.isEmpty()) { return (NestedReferrerListGateway<WhitePerrottaOverMember>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePerrottaOverMemberList(whitePerrottaOverMemberMachoList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePerrottaOverMember> doLoadWhitePerrottaOverMemberList(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember> option) {
        return helpLoadReferrerInternally(whitePerrottaOverMemberMachoList, option, "whitePerrottaOverMemberList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key machoCode.
     * @param whitePerrottaOverMemberMachoList The list of whitePerrottaOverMemberMacho. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMachoCodeList(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList)
    { return helpExtractListInternally(whitePerrottaOverMemberMachoList, "machoCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverMemberMacho.setFoo...(value);
     * whitePerrottaOverMemberMacho.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.set...;</span>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">insert</span>(whitePerrottaOverMemberMacho);
     * ... = whitePerrottaOverMemberMacho.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePerrottaOverMemberMacho The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho) {
        doInsert(whitePerrottaOverMemberMacho, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * whitePerrottaOverMemberMacho.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverMemberMacho.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverMemberMacho.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">update</span>(whitePerrottaOverMemberMacho);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho) {
        doUpdate(whitePerrottaOverMemberMacho, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePerrottaOverMemberMacho The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho) {
        doInsertOrUpdate(whitePerrottaOverMemberMacho, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * whitePerrottaOverMemberMacho.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverMemberMacho.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">delete</span>(whitePerrottaOverMemberMacho);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho) {
        doDelete(whitePerrottaOverMemberMacho, null);
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
     *     WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     *     whitePerrottaOverMemberMacho.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverMemberMacho.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePerrottaOverMemberMachoList.add(whitePerrottaOverMemberMacho);
     * }
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">batchInsert</span>(whitePerrottaOverMemberMachoList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePerrottaOverMemberMachoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList) {
        return doBatchInsert(whitePerrottaOverMemberMachoList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     *     whitePerrottaOverMemberMacho.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverMemberMacho.setFooPrice(123);
     *     } else {
     *         whitePerrottaOverMemberMacho.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePerrottaOverMemberMachoList.add(whitePerrottaOverMemberMacho);
     * }
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whitePerrottaOverMemberMachoList);
     * </pre>
     * @param whitePerrottaOverMemberMachoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList) {
        return doBatchUpdate(whitePerrottaOverMemberMachoList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePerrottaOverMemberMachoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList) {
        return doBatchDelete(whitePerrottaOverMemberMachoList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePerrottaOverMemberMacho, WhitePerrottaOverMemberMachoCB&gt;() {
     *     public ConditionBean setup(WhitePerrottaOverMemberMacho entity, WhitePerrottaOverMemberMachoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePerrottaOverMemberMacho, WhitePerrottaOverMemberMachoCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setPK...(value);</span>
     * whitePerrottaOverMemberMacho.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setVersionNo(value);</span>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whitePerrottaOverMemberMacho, cb);
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return doQueryUpdate(whitePerrottaOverMemberMacho, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setPK...(value);</span>
     * whitePerrottaOverMemberMacho.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setVersionNo(value);</span>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whitePerrottaOverMemberMacho, cb);
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, WhitePerrottaOverMemberMachoCB cb) {
        return doQueryUpdate(whitePerrottaOverMemberMacho, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">queryDelete</span>(whitePerrottaOverMemberMacho, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">queryDelete</span>(whitePerrottaOverMemberMacho, cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePerrottaOverMemberMachoCB cb) {
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
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverMemberMacho.setFoo...(value);
     * whitePerrottaOverMemberMacho.setBar...(value);
     * InsertOption<WhitePerrottaOverMemberMachoCB> option = new InsertOption<WhitePerrottaOverMemberMachoCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whitePerrottaOverMemberMacho, option);
     * ... = whitePerrottaOverMemberMacho.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, WritableOptionCall<WhitePerrottaOverMemberMachoCB, InsertOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        doInsert(whitePerrottaOverMemberMacho, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * whitePerrottaOverMemberMacho.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverMemberMacho.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverMemberMacho.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePerrottaOverMemberMachoCB&gt; option = new UpdateOption&lt;WhitePerrottaOverMemberMachoCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *         public void specify(WhitePerrottaOverMemberMachoCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whitePerrottaOverMemberMacho, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, WritableOptionCall<WhitePerrottaOverMemberMachoCB, UpdateOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        doUpdate(whitePerrottaOverMemberMacho, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePerrottaOverMemberMacho The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, WritableOptionCall<WhitePerrottaOverMemberMachoCB, InsertOption<WhitePerrottaOverMemberMachoCB>> insertOpLambda, WritableOptionCall<WhitePerrottaOverMemberMachoCB, UpdateOption<WhitePerrottaOverMemberMachoCB>> updateOpLambda) {
        doInsertOrUpdate(whitePerrottaOverMemberMacho, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePerrottaOverMemberMacho The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, WritableOptionCall<WhitePerrottaOverMemberMachoCB, DeleteOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        doDelete(whitePerrottaOverMemberMacho, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePerrottaOverMemberMachoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, WritableOptionCall<WhitePerrottaOverMemberMachoCB, InsertOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doBatchInsert(whitePerrottaOverMemberMachoList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePerrottaOverMemberMachoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, WritableOptionCall<WhitePerrottaOverMemberMachoCB, UpdateOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doBatchUpdate(whitePerrottaOverMemberMachoList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePerrottaOverMemberMachoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePerrottaOverMemberMacho> whitePerrottaOverMemberMachoList, WritableOptionCall<WhitePerrottaOverMemberMachoCB, DeleteOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doBatchDelete(whitePerrottaOverMemberMachoList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePerrottaOverMemberMacho, WhitePerrottaOverMemberMachoCB> manyArgLambda, WritableOptionCall<WhitePerrottaOverMemberMachoCB, InsertOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setPK...(value);</span>
     * whitePerrottaOverMemberMacho.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setVersionNo(value);</span>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverMemberMachoCB&gt; option = new UpdateOption&lt;WhitePerrottaOverMemberMachoCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void specify(WhitePerrottaOverMemberMachoCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whitePerrottaOverMemberMacho, cb, option);
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, CBCall<WhitePerrottaOverMemberMachoCB> cbLambda, WritableOptionCall<WhitePerrottaOverMemberMachoCB, UpdateOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverMemberMacho, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho = new WhitePerrottaOverMemberMacho();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setPK...(value);</span>
     * whitePerrottaOverMemberMacho.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverMemberMacho.setVersionNo(value);</span>
     * WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverMemberMachoCB&gt; option = new UpdateOption&lt;WhitePerrottaOverMemberMachoCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void specify(WhitePerrottaOverMemberMachoCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whitePerrottaOverMemberMachoBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whitePerrottaOverMemberMacho, cb, option);
     * </pre>
     * @param whitePerrottaOverMemberMacho The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho, WhitePerrottaOverMemberMachoCB cb, WritableOptionCall<WhitePerrottaOverMemberMachoCB, UpdateOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverMemberMacho, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhitePerrottaOverMemberMachoCB> cbLambda, WritableOptionCall<WhitePerrottaOverMemberMachoCB, DeleteOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePerrottaOverMemberMacho. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePerrottaOverMemberMachoCB cb, WritableOptionCall<WhitePerrottaOverMemberMachoCB, DeleteOption<WhitePerrottaOverMemberMachoCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whitePerrottaOverMemberMachoBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whitePerrottaOverMemberMachoBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverMemberMachoBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whitePerrottaOverMemberMachoBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverMemberMachoBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whitePerrottaOverMemberMachoBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whitePerrottaOverMemberMachoBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whitePerrottaOverMemberMachoBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whitePerrottaOverMemberMachoBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whitePerrottaOverMemberMachoBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whitePerrottaOverMemberMachoBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whitePerrottaOverMemberMachoBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whitePerrottaOverMemberMachoBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whitePerrottaOverMemberMachoBhv.outideSql().removeBlockComment().selectList()
     * whitePerrottaOverMemberMachoBhv.outideSql().removeLineComment().selectList()
     * whitePerrottaOverMemberMachoBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePerrottaOverMemberMachoBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePerrottaOverMemberMachoBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePerrottaOverMemberMacho> typeOfSelectedEntity() { return WhitePerrottaOverMemberMacho.class; }
    protected Class<WhitePerrottaOverMemberMacho> typeOfHandlingEntity() { return WhitePerrottaOverMemberMacho.class; }
    protected Class<WhitePerrottaOverMemberMachoCB> typeOfHandlingConditionBean() { return WhitePerrottaOverMemberMachoCB.class; }
}
