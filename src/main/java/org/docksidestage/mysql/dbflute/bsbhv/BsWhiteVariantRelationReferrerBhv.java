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
 * The behavior of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br>
 * <pre>
 * [primary key]
 *     REFERRER_ID
 *
 * [column]
 *     REFERRER_ID, VARIANT_MASTER_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsVariant), WHITE_VARIANT_RELATION_MASTER_BAR(AsVariant), WHITE_VARIANT_RELATION_MASTER_QUX(AsVariantByQue), WHITE_VARIANT_RELATION_MASTER_CORGE(AsVariantByQuxType)
 *
 * [referrer table]
 *     white_variant_relation_referrer_ref
 *
 * [foreign property]
 *     whiteVariantRelationMasterFooAsVariant, whiteVariantRelationMasterBarAsVariant, whiteVariantRelationMasterQuxAsVariantByQue, whiteVariantRelationMasterCorgeAsVariantByQuxType
 *
 * [referrer property]
 *     whiteVariantRelationReferrerRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrerBhv extends AbstractBehaviorWritable<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteVariantRelationReferrerDbm getDBMeta() { return WhiteVariantRelationReferrerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationReferrerCB newConditionBean() { return new WhiteVariantRelationReferrerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationReferrerCB cb) {
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
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteVariantRelationReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteVariantRelationReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationReferrer> selectEntity(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteVariantRelationReferrer <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteVariantRelationReferrer.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteVariantRelationReferrer <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteVariantRelationReferrer.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationReferrer> selectEntity(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteVariantRelationReferrer> facadeSelectEntity(WhiteVariantRelationReferrerCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationReferrerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationReferrer <span style="color: #553000">whiteVariantRelationReferrer</span> = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntityWithDeletedCheck(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().set...;
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntityWithDeletedCheck(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param referrerId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationReferrer> selectByPK(Long referrerId) {
        return facadeSelectByPK(referrerId);
    }

    protected OptionalEntity<WhiteVariantRelationReferrer> facadeSelectByPK(Long referrerId) {
        return doSelectOptionalByPK(referrerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectByPK(Long referrerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(referrerId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> OptionalEntity<ENTITY> doSelectOptionalByPK(Long referrerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(referrerId, tp), referrerId);
    }

    protected WhiteVariantRelationReferrerCB xprepareCBAsPK(Long referrerId) {
        assertObjectNotNull("referrerId", referrerId);
        return newConditionBean().acceptPK(referrerId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteVariantRelationReferrer&gt; <span style="color: #553000">whiteVariantRelationReferrerList</span> = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteVariantRelationReferrer <span style="color: #553000">whiteVariantRelationReferrer</span> : <span style="color: #553000">whiteVariantRelationReferrerList</span>) {
     *     ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationReferrer> selectList(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteVariantRelationReferrer&gt; <span style="color: #553000">whiteVariantRelationReferrerList</span> = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteVariantRelationReferrer whiteVariantRelationReferrer : <span style="color: #553000">whiteVariantRelationReferrerList</span>) {
     *     ... = whiteVariantRelationReferrer.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationReferrer> selectList(WhiteVariantRelationReferrerCB cb) {
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
     * PagingResultBean&lt;WhiteVariantRelationReferrer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteVariantRelationReferrer whiteVariantRelationReferrer : <span style="color: #553000">page</span>) {
     *     ... = whiteVariantRelationReferrer.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationReferrer> selectPage(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationReferrer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteVariantRelationReferrer whiteVariantRelationReferrer : <span style="color: #553000">page</span>) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationReferrer> selectPage(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param entityLambda The handler of entity row of WhiteVariantRelationReferrer. (NotNull)
     */
    public void selectCursor(CBCall<WhiteVariantRelationReferrerCB> cbLambda, EntityRowHandler<WhiteVariantRelationReferrer> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationReferrer. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationReferrerCB cb, EntityRowHandler<WhiteVariantRelationReferrer> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationReferrerCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> loaderLambda) {
        xassLRArg(whiteVariantRelationReferrerList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationReferrer().ready(whiteVariantRelationReferrerList, _behaviorSelector));
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
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationReferrer whiteVariantRelationReferrer, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> loaderLambda) {
        xassLRArg(whiteVariantRelationReferrer, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationReferrer().ready(xnewLRAryLs(whiteVariantRelationReferrer), _behaviorSelector));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br>
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">loadWhiteVariantRelationReferrerRef</span>(<span style="color: #553000">whiteVariantRelationReferrerList</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteVariantRelationReferrer whiteVariantRelationReferrer : <span style="color: #553000">whiteVariantRelationReferrerList</span>) {
     *     ... = whiteVariantRelationReferrer.<span style="color: #CC4747">getWhiteVariantRelationReferrerRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRef(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> refCBLambda) {
        xassLRArg(whiteVariantRelationReferrerList, refCBLambda);
        return doLoadWhiteVariantRelationReferrerRef(whiteVariantRelationReferrerList, new LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br>
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">loadWhiteVariantRelationReferrerRef</span>(<span style="color: #553000">whiteVariantRelationReferrer</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteVariantRelationReferrer</span>.<span style="color: #CC4747">getWhiteVariantRelationReferrerRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRef(WhiteVariantRelationReferrer whiteVariantRelationReferrer, ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> refCBLambda) {
        xassLRArg(whiteVariantRelationReferrer, refCBLambda);
        return doLoadWhiteVariantRelationReferrerRef(xnewLRLs(whiteVariantRelationReferrer), new LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRef(WhiteVariantRelationReferrer whiteVariantRelationReferrer, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> loadReferrerOption) {
        xassLRArg(whiteVariantRelationReferrer, loadReferrerOption);
        return loadWhiteVariantRelationReferrerRef(xnewLRLs(whiteVariantRelationReferrer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRef(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> loadReferrerOption) {
        xassLRArg(whiteVariantRelationReferrerList, loadReferrerOption);
        if (whiteVariantRelationReferrerList.isEmpty()) { return (NestedReferrerListGateway<WhiteVariantRelationReferrerRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteVariantRelationReferrerRef(whiteVariantRelationReferrerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteVariantRelationReferrerRef> doLoadWhiteVariantRelationReferrerRef(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> option) {
        return helpLoadReferrerInternally(whiteVariantRelationReferrerList, option, "whiteVariantRelationReferrerRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterFoo'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterFoo> pulloutWhiteVariantRelationMasterFooAsVariant(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterFooAsVariant"); }

    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterBar'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterBar> pulloutWhiteVariantRelationMasterBarAsVariant(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterBarAsVariant"); }

    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterQux'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterQux> pulloutWhiteVariantRelationMasterQuxAsVariantByQue(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterQuxAsVariantByQue"); }

    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterCorge'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterCorge> pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterCorgeAsVariantByQuxType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key referrerId.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReferrerIdList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpExtractListInternally(whiteVariantRelationReferrerList, "referrerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">insert</span>(whiteVariantRelationReferrer);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsert(whiteVariantRelationReferrer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">update</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doUpdate(whiteVariantRelationReferrer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationReferrer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsertOrUpdate(whiteVariantRelationReferrer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">delete</span>(whiteVariantRelationReferrer);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doDelete(whiteVariantRelationReferrer, null);
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
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteVariantRelationReferrerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchInsert(whiteVariantRelationReferrerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteVariantRelationReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteVariantRelationReferrerList);
     * </pre>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchUpdate(whiteVariantRelationReferrerList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchDelete(whiteVariantRelationReferrerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB&gt;() {
     *     public ConditionBean setup(WhiteVariantRelationReferrer entity, WhiteVariantRelationReferrerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return doQueryUpdate(whiteVariantRelationReferrer, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb) {
        return doQueryUpdate(whiteVariantRelationReferrer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationReferrerCB cb) {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * InsertOption&lt;WhiteVariantRelationReferrerCB&gt; option = new InsertOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteVariantRelationReferrer, option);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WritableOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> opLambda) {
        doInsert(whiteVariantRelationReferrer, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *         public void specify(WhiteVariantRelationReferrerCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteVariantRelationReferrer, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WritableOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        doUpdate(whiteVariantRelationReferrer, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationReferrer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WritableOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> insertOpLambda, WritableOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> updateOpLambda) {
        doInsertOrUpdate(whiteVariantRelationReferrer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationReferrer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WritableOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        doDelete(whiteVariantRelationReferrer, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, WritableOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doBatchInsert(whiteVariantRelationReferrerList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, WritableOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doBatchUpdate(whiteVariantRelationReferrerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, WritableOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doBatchDelete(whiteVariantRelationReferrerList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> manyArgLambda, WritableOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteVariantRelationReferrer, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, CBCall<WhiteVariantRelationReferrerCB> cbLambda, WritableOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationReferrer, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteVariantRelationReferrerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteVariantRelationReferrer, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb, WritableOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationReferrer, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteVariantRelationReferrerCB> cbLambda, WritableOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationReferrerCB cb, WritableOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteVariantRelationReferrerBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteVariantRelationReferrerBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteVariantRelationReferrerBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteVariantRelationReferrerBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteVariantRelationReferrerBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteVariantRelationReferrerBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteVariantRelationReferrerBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteVariantRelationReferrerBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteVariantRelationReferrerBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteVariantRelationReferrerBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteVariantRelationReferrerBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteVariantRelationReferrerBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteVariantRelationReferrerBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteVariantRelationReferrerBhv.outideSql().removeBlockComment().selectList()
     * whiteVariantRelationReferrerBhv.outideSql().removeLineComment().selectList()
     * whiteVariantRelationReferrerBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteVariantRelationReferrerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationReferrer> typeOfSelectedEntity() { return WhiteVariantRelationReferrer.class; }
    protected Class<WhiteVariantRelationReferrer> typeOfHandlingEntity() { return WhiteVariantRelationReferrer.class; }
    protected Class<WhiteVariantRelationReferrerCB> typeOfHandlingConditionBean() { return WhiteVariantRelationReferrerCB.class; }
}
