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
 * The behavior of WHITE_POINT_TYPE_MAPPING as TABLE. <br />
 * <pre>
 * [primary key]
 *     POINT_TYPE_MAPPING_ID
 *
 * [column]
 *     POINT_TYPE_MAPPING_ID, POINT_TYPE_MAPPING_MEMBER_NAME, POINT_TYPE_MAPPING_PRICE_COUNT, POINT_TYPE_MAPPING_SALE_DATE, POINT_TYPE_MAPPING_WANTED_DATETIME
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
public abstract class BsWhitePointTypeMappingBhv extends AbstractBehaviorWritable<WhitePointTypeMapping, WhitePointTypeMappingCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePointTypeMappingDbm getDBMeta() { return WhitePointTypeMappingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePointTypeMappingCB newConditionBean() { return new WhitePointTypeMappingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhitePointTypeMappingCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePointTypeMappingCB cb) {
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
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whitePointTypeMapping</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whitePointTypeMapping</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whitePointTypeMapping</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whitePointTypeMapping</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePointTypeMapping> selectEntity(CBCall<WhitePointTypeMappingCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whitePointTypeMapping <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whitePointTypeMapping.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whitePointTypeMapping <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whitePointTypeMapping.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePointTypeMapping> selectEntity(WhitePointTypeMappingCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhitePointTypeMapping> facadeSelectEntity(WhitePointTypeMappingCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePointTypeMappingCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhitePointTypeMapping <span style="color: #553000">whitePointTypeMapping</span> = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whitePointTypeMapping</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePointTypeMapping selectEntityWithDeletedCheck(CBCall<WhitePointTypeMappingCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().set...;
     * WhitePointTypeMapping whitePointTypeMapping = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePointTypeMapping.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePointTypeMapping selectEntityWithDeletedCheck(WhitePointTypeMappingCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param pointTypeMappingId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePointTypeMapping> selectByPK(Long pointTypeMappingId) {
        return facadeSelectByPK(pointTypeMappingId);
    }

    protected OptionalEntity<WhitePointTypeMapping> facadeSelectByPK(Long pointTypeMappingId) {
        return doSelectOptionalByPK(pointTypeMappingId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> ENTITY doSelectByPK(Long pointTypeMappingId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(pointTypeMappingId), tp);
    }

    protected <ENTITY extends WhitePointTypeMapping> OptionalEntity<ENTITY> doSelectOptionalByPK(Long pointTypeMappingId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(pointTypeMappingId, tp), pointTypeMappingId);
    }

    protected WhitePointTypeMappingCB xprepareCBAsPK(Long pointTypeMappingId) {
        assertObjectNotNull("pointTypeMappingId", pointTypeMappingId);
        return newConditionBean().acceptPK(pointTypeMappingId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhitePointTypeMapping&gt; <span style="color: #553000">whitePointTypeMappingList</span> = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (WhitePointTypeMapping <span style="color: #553000">whitePointTypeMapping</span> : <span style="color: #553000">whitePointTypeMappingList</span>) {
     *     ... = <span style="color: #553000">whitePointTypeMapping</span>.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePointTypeMapping> selectList(CBCall<WhitePointTypeMappingCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;WhitePointTypeMapping&gt; <span style="color: #553000">whitePointTypeMappingList</span> = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhitePointTypeMapping whitePointTypeMapping : <span style="color: #553000">whitePointTypeMappingList</span>) {
     *     ... = whitePointTypeMapping.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePointTypeMapping> selectList(WhitePointTypeMappingCB cb) {
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
     * PagingResultBean&lt;WhitePointTypeMapping&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhitePointTypeMapping whitePointTypeMapping : <span style="color: #553000">page</span>) {
     *     ... = whitePointTypeMapping.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePointTypeMapping> selectPage(CBCall<WhitePointTypeMappingCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePointTypeMapping&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhitePointTypeMapping whitePointTypeMapping : <span style="color: #553000">page</span>) {
     *     ... = whitePointTypeMapping.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePointTypeMapping> selectPage(WhitePointTypeMappingCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @param entityLambda The handler of entity row of WhitePointTypeMapping. (NotNull)
     */
    public void selectCursor(CBCall<WhitePointTypeMappingCB> cbLambda, EntityRowHandler<WhitePointTypeMapping> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().set...
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePointTypeMapping&gt;() {
     *     public void handle(WhitePointTypeMapping entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePointTypeMapping. (NotNull)
     */
    public void selectCursor(WhitePointTypeMappingCB cb, EntityRowHandler<WhitePointTypeMapping> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePointTypeMappingCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whitePointTypeMappingList The entity list of whitePointTypeMapping. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePointTypeMapping> whitePointTypeMappingList, ReferrerLoaderHandler<LoaderOfWhitePointTypeMapping> loaderLambda) {
        xassLRArg(whitePointTypeMappingList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePointTypeMapping().ready(whitePointTypeMappingList, _behaviorSelector));
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
     * @param whitePointTypeMapping The entity of whitePointTypeMapping. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePointTypeMapping whitePointTypeMapping, ReferrerLoaderHandler<LoaderOfWhitePointTypeMapping> loaderLambda) {
        xassLRArg(whitePointTypeMapping, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePointTypeMapping().ready(xnewLRAryLs(whitePointTypeMapping), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key pointTypeMappingId.
     * @param whitePointTypeMappingList The list of whitePointTypeMapping. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPointTypeMappingIdList(List<WhitePointTypeMapping> whitePointTypeMappingList)
    { return helpExtractListInternally(whitePointTypeMappingList, "pointTypeMappingId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePointTypeMapping.setFoo...(value);
     * whitePointTypeMapping.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">insert</span>(whitePointTypeMapping);
     * ... = whitePointTypeMapping.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePointTypeMapping The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePointTypeMapping whitePointTypeMapping) {
        doInsert(whitePointTypeMapping, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * whitePointTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePointTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePointTypeMapping.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">update</span>(whitePointTypeMapping);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePointTypeMapping The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePointTypeMapping whitePointTypeMapping) {
        doUpdate(whitePointTypeMapping, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePointTypeMapping The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePointTypeMapping whitePointTypeMapping) {
        doInsertOrUpdate(whitePointTypeMapping, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * whitePointTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePointTypeMapping.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">delete</span>(whitePointTypeMapping);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePointTypeMapping The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePointTypeMapping whitePointTypeMapping) {
        doDelete(whitePointTypeMapping, null);
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
     *     WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     *     whitePointTypeMapping.setFooName("foo");
     *     if (...) {
     *         whitePointTypeMapping.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePointTypeMappingList.add(whitePointTypeMapping);
     * }
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">batchInsert</span>(whitePointTypeMappingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return doBatchInsert(whitePointTypeMappingList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     *     whitePointTypeMapping.setFooName("foo");
     *     if (...) {
     *         whitePointTypeMapping.setFooPrice(123);
     *     } else {
     *         whitePointTypeMapping.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePointTypeMapping.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePointTypeMappingList.add(whitePointTypeMapping);
     * }
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whitePointTypeMappingList);
     * </pre>
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return doBatchUpdate(whitePointTypeMappingList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return doBatchDelete(whitePointTypeMappingList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePointTypeMapping, WhitePointTypeMappingCB&gt;() {
     *     public ConditionBean setup(WhitePointTypeMapping entity, WhitePointTypeMappingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setPK...(value);</span>
     * whitePointTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setVersionNo(value);</span>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whitePointTypeMapping, cb);
     * </pre>
     * @param whitePointTypeMapping The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePointTypeMapping whitePointTypeMapping, CBCall<WhitePointTypeMappingCB> cbLambda) {
        return doQueryUpdate(whitePointTypeMapping, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setPK...(value);</span>
     * whitePointTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setVersionNo(value);</span>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whitePointTypeMapping, cb);
     * </pre>
     * @param whitePointTypeMapping The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePointTypeMapping whitePointTypeMapping, WhitePointTypeMappingCB cb) {
        return doQueryUpdate(whitePointTypeMapping, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">queryDelete</span>(whitePointTypeMapping, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhitePointTypeMappingCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">queryDelete</span>(whitePointTypeMapping, cb);
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePointTypeMappingCB cb) {
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
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePointTypeMapping.setFoo...(value);
     * whitePointTypeMapping.setBar...(value);
     * InsertOption<WhitePointTypeMappingCB> option = new InsertOption<WhitePointTypeMappingCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whitePointTypeMapping, option);
     * ... = whitePointTypeMapping.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePointTypeMapping The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePointTypeMapping whitePointTypeMapping, WritableOptionCall<WhitePointTypeMappingCB, InsertOption<WhitePointTypeMappingCB>> opLambda) {
        doInsert(whitePointTypeMapping, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * whitePointTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePointTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePointTypeMapping.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePointTypeMappingCB&gt; option = new UpdateOption&lt;WhitePointTypeMappingCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePointTypeMappingCB&gt;() {
     *         public void specify(WhitePointTypeMappingCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whitePointTypeMapping, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePointTypeMapping The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePointTypeMapping whitePointTypeMapping, WritableOptionCall<WhitePointTypeMappingCB, UpdateOption<WhitePointTypeMappingCB>> opLambda) {
        doUpdate(whitePointTypeMapping, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePointTypeMapping The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePointTypeMapping whitePointTypeMapping, WritableOptionCall<WhitePointTypeMappingCB, InsertOption<WhitePointTypeMappingCB>> insertOpLambda, WritableOptionCall<WhitePointTypeMappingCB, UpdateOption<WhitePointTypeMappingCB>> updateOpLambda) {
        doInsertOrUpdate(whitePointTypeMapping, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePointTypeMapping The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePointTypeMapping whitePointTypeMapping, WritableOptionCall<WhitePointTypeMappingCB, DeleteOption<WhitePointTypeMappingCB>> opLambda) {
        doDelete(whitePointTypeMapping, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePointTypeMapping> whitePointTypeMappingList, WritableOptionCall<WhitePointTypeMappingCB, InsertOption<WhitePointTypeMappingCB>> opLambda) {
        return doBatchInsert(whitePointTypeMappingList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePointTypeMapping> whitePointTypeMappingList, WritableOptionCall<WhitePointTypeMappingCB, UpdateOption<WhitePointTypeMappingCB>> opLambda) {
        return doBatchUpdate(whitePointTypeMappingList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePointTypeMapping> whitePointTypeMappingList, WritableOptionCall<WhitePointTypeMappingCB, DeleteOption<WhitePointTypeMappingCB>> opLambda) {
        return doBatchDelete(whitePointTypeMappingList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB> manyArgLambda, WritableOptionCall<WhitePointTypeMappingCB, InsertOption<WhitePointTypeMappingCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setPK...(value);</span>
     * whitePointTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setVersionNo(value);</span>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePointTypeMappingCB&gt; option = new UpdateOption&lt;WhitePointTypeMappingCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void specify(WhitePointTypeMappingCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whitePointTypeMapping, cb, option);
     * </pre>
     * @param whitePointTypeMapping The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePointTypeMapping whitePointTypeMapping, CBCall<WhitePointTypeMappingCB> cbLambda, WritableOptionCall<WhitePointTypeMappingCB, UpdateOption<WhitePointTypeMappingCB>> opLambda) {
        return doQueryUpdate(whitePointTypeMapping, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setPK...(value);</span>
     * whitePointTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setVersionNo(value);</span>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePointTypeMappingCB&gt; option = new UpdateOption&lt;WhitePointTypeMappingCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void specify(WhitePointTypeMappingCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whitePointTypeMappingBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whitePointTypeMapping, cb, option);
     * </pre>
     * @param whitePointTypeMapping The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePointTypeMapping whitePointTypeMapping, WhitePointTypeMappingCB cb, WritableOptionCall<WhitePointTypeMappingCB, UpdateOption<WhitePointTypeMappingCB>> opLambda) {
        return doQueryUpdate(whitePointTypeMapping, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhitePointTypeMapping. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhitePointTypeMappingCB> cbLambda, WritableOptionCall<WhitePointTypeMappingCB, DeleteOption<WhitePointTypeMappingCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePointTypeMappingCB cb, WritableOptionCall<WhitePointTypeMappingCB, DeleteOption<WhitePointTypeMappingCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whitePointTypeMappingBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whitePointTypeMappingBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePointTypeMappingBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whitePointTypeMappingBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePointTypeMappingBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whitePointTypeMappingBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whitePointTypeMappingBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whitePointTypeMappingBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whitePointTypeMappingBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whitePointTypeMappingBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whitePointTypeMappingBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whitePointTypeMappingBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whitePointTypeMappingBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whitePointTypeMappingBhv.outideSql().removeBlockComment().selectList()
     * whitePointTypeMappingBhv.outideSql().removeLineComment().selectList()
     * whitePointTypeMappingBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePointTypeMappingBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePointTypeMappingBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePointTypeMapping> typeOfSelectedEntity() { return WhitePointTypeMapping.class; }
    protected Class<WhitePointTypeMapping> typeOfHandlingEntity() { return WhitePointTypeMapping.class; }
    protected Class<WhitePointTypeMappingCB> typeOfHandlingConditionBean() { return WhitePointTypeMappingCB.class; }
}
