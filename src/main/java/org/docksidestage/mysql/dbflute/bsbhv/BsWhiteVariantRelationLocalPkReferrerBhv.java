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
 * The behavior of WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationLocalPkReferrerBhv extends AbstractBehaviorWritable<WhiteVariantRelationLocalPkReferrer, WhiteVariantRelationLocalPkReferrerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteVariantRelationLocalPkReferrerDbm asDBMeta() { return WhiteVariantRelationLocalPkReferrerDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "white_variant_relation_local_pk_referrer"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationLocalPkReferrerCB newConditionBean() { return new WhiteVariantRelationLocalPkReferrerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationLocalPkReferrerCB cb) {
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
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteVariantRelationLocalPkReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteVariantRelationLocalPkReferrer</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteVariantRelationLocalPkReferrer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteVariantRelationLocalPkReferrer</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationLocalPkReferrer> selectEntity(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteVariantRelationLocalPkReferrer <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteVariantRelationLocalPkReferrer.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteVariantRelationLocalPkReferrer <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteVariantRelationLocalPkReferrer.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationLocalPkReferrer> selectEntity(WhiteVariantRelationLocalPkReferrerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteVariantRelationLocalPkReferrer> facadeSelectEntity(WhiteVariantRelationLocalPkReferrerCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationLocalPkReferrer> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationLocalPkReferrerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationLocalPkReferrer <span style="color: #553000">whiteVariantRelationLocalPkReferrer</span> = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteVariantRelationLocalPkReferrer</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationLocalPkReferrer selectEntityWithDeletedCheck(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().set...;
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationLocalPkReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationLocalPkReferrer selectEntityWithDeletedCheck(WhiteVariantRelationLocalPkReferrerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param reversefkSuppressedId : PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationLocalPkReferrer> selectByPK(Long reversefkSuppressedId) {
        return facadeSelectByPK(reversefkSuppressedId);
    }

    protected OptionalEntity<WhiteVariantRelationLocalPkReferrer> facadeSelectByPK(Long reversefkSuppressedId) {
        return doSelectOptionalByPK(reversefkSuppressedId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationLocalPkReferrer> ENTITY doSelectByPK(Long reversefkSuppressedId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(reversefkSuppressedId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationLocalPkReferrer> OptionalEntity<ENTITY> doSelectOptionalByPK(Long reversefkSuppressedId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(reversefkSuppressedId, tp), reversefkSuppressedId);
    }

    protected WhiteVariantRelationLocalPkReferrerCB xprepareCBAsPK(Long reversefkSuppressedId) {
        assertObjectNotNull("reversefkSuppressedId", reversefkSuppressedId);
        return newConditionBean().acceptPK(reversefkSuppressedId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteVariantRelationLocalPkReferrer&gt; <span style="color: #553000">whiteVariantRelationLocalPkReferrerList</span> = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteVariantRelationLocalPkReferrer <span style="color: #553000">whiteVariantRelationLocalPkReferrer</span> : <span style="color: #553000">whiteVariantRelationLocalPkReferrerList</span>) {
     *     ... = <span style="color: #553000">whiteVariantRelationLocalPkReferrer</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationLocalPkReferrer> selectList(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteVariantRelationLocalPkReferrer&gt; <span style="color: #553000">whiteVariantRelationLocalPkReferrerList</span> = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer : <span style="color: #553000">whiteVariantRelationLocalPkReferrerList</span>) {
     *     ... = whiteVariantRelationLocalPkReferrer.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationLocalPkReferrer> selectList(WhiteVariantRelationLocalPkReferrerCB cb) {
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
     * PagingResultBean&lt;WhiteVariantRelationLocalPkReferrer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer : <span style="color: #553000">page</span>) {
     *     ... = whiteVariantRelationLocalPkReferrer.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationLocalPkReferrer> selectPage(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationLocalPkReferrer&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer : <span style="color: #553000">page</span>) {
     *     ... = whiteVariantRelationLocalPkReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationLocalPkReferrer> selectPage(WhiteVariantRelationLocalPkReferrerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @param entityLambda The handler of entity row of WhiteVariantRelationLocalPkReferrer. (NotNull)
     */
    public void selectCursor(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda, EntityRowHandler<WhiteVariantRelationLocalPkReferrer> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationLocalPkReferrer. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationLocalPkReferrerCB cb, EntityRowHandler<WhiteVariantRelationLocalPkReferrer> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationLocalPkReferrerCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteVariantRelationLocalPkReferrerList The entity list of whiteVariantRelationLocalPkReferrer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationLocalPkReferrer> loaderLambda) {
        xassLRArg(whiteVariantRelationLocalPkReferrerList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationLocalPkReferrer().ready(whiteVariantRelationLocalPkReferrerList, _behaviorSelector));
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
     * @param whiteVariantRelationLocalPkReferrer The entity of whiteVariantRelationLocalPkReferrer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationLocalPkReferrer> loaderLambda) {
        xassLRArg(whiteVariantRelationLocalPkReferrer, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationLocalPkReferrer().ready(xnewLRAryLs(whiteVariantRelationLocalPkReferrer), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterFoo'.
     * @param whiteVariantRelationLocalPkReferrerList The list of whiteVariantRelationLocalPkReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterFoo> pulloutWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList)
    { return helpPulloutInternally(whiteVariantRelationLocalPkReferrerList, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key reversefkSuppressedId.
     * @param whiteVariantRelationLocalPkReferrerList The list of whiteVariantRelationLocalPkReferrer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReversefkSuppressedIdList(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList)
    { return helpExtractListInternally(whiteVariantRelationLocalPkReferrerList, "reversefkSuppressedId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationLocalPkReferrer.setFoo...(value);
     * whiteVariantRelationLocalPkReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.set...;</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">insert</span>(whiteVariantRelationLocalPkReferrer);
     * ... = whiteVariantRelationLocalPkReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationLocalPkReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer) {
        doInsert(whiteVariantRelationLocalPkReferrer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * whiteVariantRelationLocalPkReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationLocalPkReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationLocalPkReferrer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">update</span>(whiteVariantRelationLocalPkReferrer);
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer) {
        doUpdate(whiteVariantRelationLocalPkReferrer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteVariantRelationLocalPkReferrer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer) {
        doInsertOrUpdate(whiteVariantRelationLocalPkReferrer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * whiteVariantRelationLocalPkReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationLocalPkReferrer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">delete</span>(whiteVariantRelationLocalPkReferrer);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer) {
        doDelete(whiteVariantRelationLocalPkReferrer, null);
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
     *     WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     *     whiteVariantRelationLocalPkReferrer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteVariantRelationLocalPkReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationLocalPkReferrerList.add(whiteVariantRelationLocalPkReferrer);
     * }
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteVariantRelationLocalPkReferrerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationLocalPkReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList) {
        return doBatchInsert(whiteVariantRelationLocalPkReferrerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     *     whiteVariantRelationLocalPkReferrer.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteVariantRelationLocalPkReferrer.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteVariantRelationLocalPkReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationLocalPkReferrerList.add(whiteVariantRelationLocalPkReferrer);
     * }
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteVariantRelationLocalPkReferrerList);
     * </pre>
     * @param whiteVariantRelationLocalPkReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList) {
        return doBatchUpdate(whiteVariantRelationLocalPkReferrerList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationLocalPkReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList) {
        return doBatchDelete(whiteVariantRelationLocalPkReferrerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationLocalPkReferrer, WhiteVariantRelationLocalPkReferrerCB&gt;() {
     *     public ConditionBean setup(WhiteVariantRelationLocalPkReferrer entity, WhiteVariantRelationLocalPkReferrerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationLocalPkReferrer, WhiteVariantRelationLocalPkReferrerCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setPK...(value);</span>
     * whiteVariantRelationLocalPkReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteVariantRelationLocalPkReferrer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return doQueryUpdate(whiteVariantRelationLocalPkReferrer, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setPK...(value);</span>
     * whiteVariantRelationLocalPkReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteVariantRelationLocalPkReferrer, cb);
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, WhiteVariantRelationLocalPkReferrerCB cb) {
        return doQueryUpdate(whiteVariantRelationLocalPkReferrer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationLocalPkReferrerCB cb = new WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteVariantRelationLocalPkReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationLocalPkReferrerCB cb) {
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
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationLocalPkReferrer.setFoo...(value);
     * whiteVariantRelationLocalPkReferrer.setBar...(value);
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteVariantRelationLocalPkReferrer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteVariantRelationLocalPkReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, InsertOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        doInsert(whiteVariantRelationLocalPkReferrer, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * whiteVariantRelationLocalPkReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationLocalPkReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationLocalPkReferrer.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteVariantRelationLocalPkReferrer, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, UpdateOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        doUpdate(whiteVariantRelationLocalPkReferrer, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationLocalPkReferrer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, InsertOption<WhiteVariantRelationLocalPkReferrerCB>> insertOpLambda, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, UpdateOption<WhiteVariantRelationLocalPkReferrerCB>> updateOpLambda) {
        doInsertOrUpdate(whiteVariantRelationLocalPkReferrer, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationLocalPkReferrer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, DeleteOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        doDelete(whiteVariantRelationLocalPkReferrer, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationLocalPkReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, InsertOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doBatchInsert(whiteVariantRelationLocalPkReferrerList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationLocalPkReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, UpdateOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doBatchUpdate(whiteVariantRelationLocalPkReferrerList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationLocalPkReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerList, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, DeleteOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doBatchDelete(whiteVariantRelationLocalPkReferrerList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationLocalPkReferrer, WhiteVariantRelationLocalPkReferrerCB> manyArgLambda, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, InsertOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setPK...(value);</span>
     * whiteVariantRelationLocalPkReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteVariantRelationLocalPkReferrer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, UpdateOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationLocalPkReferrer, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setPK...(value);</span>
     * whiteVariantRelationLocalPkReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationLocalPkReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationLocalPkReferrerCB cb = <span style="color: #70226C">new</span> WhiteVariantRelationLocalPkReferrerCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteVariantRelationLocalPkReferrer, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteVariantRelationLocalPkReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrer, WhiteVariantRelationLocalPkReferrerCB cb, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, UpdateOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationLocalPkReferrer, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteVariantRelationLocalPkReferrerBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteVariantRelationLocalPkReferrer, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteVariantRelationLocalPkReferrerCB> cbLambda, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, DeleteOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteVariantRelationLocalPkReferrer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationLocalPkReferrerCB cb, WritableOptionCall<WhiteVariantRelationLocalPkReferrerCB, DeleteOption<WhiteVariantRelationLocalPkReferrerCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().removeBlockComment().selectList()
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().removeLineComment().selectList()
     * whiteVariantRelationLocalPkReferrerBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteVariantRelationLocalPkReferrerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationLocalPkReferrer> typeOfSelectedEntity() { return WhiteVariantRelationLocalPkReferrer.class; }
    protected Class<WhiteVariantRelationLocalPkReferrer> typeOfHandlingEntity() { return WhiteVariantRelationLocalPkReferrer.class; }
    protected Class<WhiteVariantRelationLocalPkReferrerCB> typeOfHandlingConditionBean() { return WhiteVariantRelationLocalPkReferrerCB.class; }
}
