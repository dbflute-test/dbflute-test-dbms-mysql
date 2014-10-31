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
 * The behavior of WHITE_IMPLICIT_REVERSE_FK_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
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
public abstract class BsWhiteImplicitReverseFkRefBhv extends AbstractBehaviorWritable<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteImplicitReverseFkRefDbm getDBMeta() { return WhiteImplicitReverseFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteImplicitReverseFkRefCB newConditionBean() { return new WhiteImplicitReverseFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitReverseFkRefCB cb) {
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
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteImplicitReverseFkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteImplicitReverseFkRef</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteImplicitReverseFkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteImplicitReverseFkRef</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitReverseFkRef> selectEntity(CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteImplicitReverseFkRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteImplicitReverseFkRef.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteImplicitReverseFkRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteImplicitReverseFkRef.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitReverseFkRef> selectEntity(WhiteImplicitReverseFkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteImplicitReverseFkRef> facadeSelectEntity(WhiteImplicitReverseFkRefCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitReverseFkRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitReverseFkRef <span style="color: #553000">whiteImplicitReverseFkRef</span> = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteImplicitReverseFkRef</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectEntityWithDeletedCheck(CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().set...;
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitReverseFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectEntityWithDeletedCheck(WhiteImplicitReverseFkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param whiteImplicitReverseFkRefId : PK, ID, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitReverseFkRef> selectByPK(Integer whiteImplicitReverseFkRefId) {
        return facadeSelectByPK(whiteImplicitReverseFkRefId);
    }

    protected OptionalEntity<WhiteImplicitReverseFkRef> facadeSelectByPK(Integer whiteImplicitReverseFkRefId) {
        return doSelectOptionalByPK(whiteImplicitReverseFkRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectByPK(Integer whiteImplicitReverseFkRefId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(whiteImplicitReverseFkRefId), tp);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer whiteImplicitReverseFkRefId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(whiteImplicitReverseFkRefId, tp), whiteImplicitReverseFkRefId);
    }

    protected WhiteImplicitReverseFkRefCB xprepareCBAsPK(Integer whiteImplicitReverseFkRefId) {
        assertObjectNotNull("whiteImplicitReverseFkRefId", whiteImplicitReverseFkRefId);
        return newConditionBean().acceptPK(whiteImplicitReverseFkRefId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param whiteImplicitReverseFkId : UQ+, NotNull, INT(10). (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitReverseFkRef> selectByUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        return facadeSelectByUniqueOf(whiteImplicitReverseFkId, validBeginDate);
    }

    protected OptionalEntity<WhiteImplicitReverseFkRef> facadeSelectByUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        return doSelectByUniqueOf(whiteImplicitReverseFkId, validBeginDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(whiteImplicitReverseFkId, validBeginDate), tp), whiteImplicitReverseFkId, validBeginDate);
    }

    protected WhiteImplicitReverseFkRefCB xprepareCBAsUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        assertObjectNotNull("whiteImplicitReverseFkId", whiteImplicitReverseFkId);assertObjectNotNull("validBeginDate", validBeginDate);
        return newConditionBean().acceptUniqueOf(whiteImplicitReverseFkId, validBeginDate);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteImplicitReverseFkRef&gt; <span style="color: #553000">whiteImplicitReverseFkRefList</span> = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (WhiteImplicitReverseFkRef <span style="color: #553000">whiteImplicitReverseFkRef</span> : <span style="color: #553000">whiteImplicitReverseFkRefList</span>) {
     *     ... = <span style="color: #553000">whiteImplicitReverseFkRef</span>.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFkRef> selectList(CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;WhiteImplicitReverseFkRef&gt; <span style="color: #553000">whiteImplicitReverseFkRefList</span> = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : <span style="color: #553000">whiteImplicitReverseFkRefList</span>) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFkRef> selectList(WhiteImplicitReverseFkRefCB cb) {
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
     * PagingResultBean&lt;WhiteImplicitReverseFkRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : <span style="color: #553000">page</span>) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFkRef> selectPage(CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitReverseFkRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : <span style="color: #553000">page</span>) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFkRef> selectPage(WhiteImplicitReverseFkRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param entityLambda The handler of entity row of WhiteImplicitReverseFkRef. (NotNull)
     */
    public void selectCursor(CBCall<WhiteImplicitReverseFkRefCB> cbLambda, EntityRowHandler<WhiteImplicitReverseFkRef> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitReverseFkRef&gt;() {
     *     public void handle(WhiteImplicitReverseFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitReverseFkRef. (NotNull)
     */
    public void selectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<WhiteImplicitReverseFkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteImplicitReverseFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteImplicitReverseFkRefList The entity list of whiteImplicitReverseFkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, ReferrerLoaderHandler<LoaderOfWhiteImplicitReverseFkRef> loaderLambda) {
        xassLRArg(whiteImplicitReverseFkRefList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteImplicitReverseFkRef().ready(whiteImplicitReverseFkRefList, _behaviorSelector));
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
     * @param whiteImplicitReverseFkRef The entity of whiteImplicitReverseFkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, ReferrerLoaderHandler<LoaderOfWhiteImplicitReverseFkRef> loaderLambda) {
        xassLRArg(whiteImplicitReverseFkRef, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteImplicitReverseFkRef().ready(xnewLRAryLs(whiteImplicitReverseFkRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key whiteImplicitReverseFkRefId.
     * @param whiteImplicitReverseFkRefList The list of whiteImplicitReverseFkRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhiteImplicitReverseFkRefIdList(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList)
    { return helpExtractListInternally(whiteImplicitReverseFkRefList, "whiteImplicitReverseFkRefId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkRef.setFoo...(value);
     * whiteImplicitReverseFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">insert</span>(whiteImplicitReverseFkRef);
     * ... = whiteImplicitReverseFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitReverseFkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doInsert(whiteImplicitReverseFkRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">update</span>(whiteImplicitReverseFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doUpdate(whiteImplicitReverseFkRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitReverseFkRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doInsertOrUpdate(whiteImplicitReverseFkRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">delete</span>(whiteImplicitReverseFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doDelete(whiteImplicitReverseFkRef, null);
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
     *     WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     *     whiteImplicitReverseFkRef.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitReverseFkRefList.add(whiteImplicitReverseFkRef);
     * }
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteImplicitReverseFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return doBatchInsert(whiteImplicitReverseFkRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     *     whiteImplicitReverseFkRef.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkRef.setFooPrice(123);
     *     } else {
     *         whiteImplicitReverseFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitReverseFkRefList.add(whiteImplicitReverseFkRef);
     * }
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteImplicitReverseFkRefList);
     * </pre>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return doBatchUpdate(whiteImplicitReverseFkRefList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return doBatchDelete(whiteImplicitReverseFkRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB&gt;() {
     *     public ConditionBean setup(WhiteImplicitReverseFkRef entity, WhiteImplicitReverseFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return doQueryUpdate(whiteImplicitReverseFkRef, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb) {
        return doQueryUpdate(whiteImplicitReverseFkRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteImplicitReverseFkRefCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitReverseFkRefCB cb) {
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkRef.setFoo...(value);
     * whiteImplicitReverseFkRef.setBar...(value);
     * InsertOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new InsertOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteImplicitReverseFkRef, option);
     * ... = whiteImplicitReverseFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WritableOptionCall<WhiteImplicitReverseFkRefCB, InsertOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        doInsert(whiteImplicitReverseFkRef, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *         public void specify(WhiteImplicitReverseFkRefCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteImplicitReverseFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WritableOptionCall<WhiteImplicitReverseFkRefCB, UpdateOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        doUpdate(whiteImplicitReverseFkRef, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitReverseFkRef The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WritableOptionCall<WhiteImplicitReverseFkRefCB, InsertOption<WhiteImplicitReverseFkRefCB>> insertOpLambda, WritableOptionCall<WhiteImplicitReverseFkRefCB, UpdateOption<WhiteImplicitReverseFkRefCB>> updateOpLambda) {
        doInsertOrUpdate(whiteImplicitReverseFkRef, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteImplicitReverseFkRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WritableOptionCall<WhiteImplicitReverseFkRefCB, DeleteOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        doDelete(whiteImplicitReverseFkRef, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, WritableOptionCall<WhiteImplicitReverseFkRefCB, InsertOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doBatchInsert(whiteImplicitReverseFkRefList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, WritableOptionCall<WhiteImplicitReverseFkRefCB, UpdateOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doBatchUpdate(whiteImplicitReverseFkRefList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, WritableOptionCall<WhiteImplicitReverseFkRefCB, DeleteOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doBatchDelete(whiteImplicitReverseFkRefList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> manyArgLambda, WritableOptionCall<WhiteImplicitReverseFkRefCB, InsertOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteImplicitReverseFkRef, cb, option);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, CBCall<WhiteImplicitReverseFkRefCB> cbLambda, WritableOptionCall<WhiteImplicitReverseFkRefCB, UpdateOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doQueryUpdate(whiteImplicitReverseFkRef, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteImplicitReverseFkRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteImplicitReverseFkRef, cb, option);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb, WritableOptionCall<WhiteImplicitReverseFkRefCB, UpdateOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doQueryUpdate(whiteImplicitReverseFkRef, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteImplicitReverseFkRefCB> cbLambda, WritableOptionCall<WhiteImplicitReverseFkRefCB, DeleteOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitReverseFkRefCB cb, WritableOptionCall<WhiteImplicitReverseFkRefCB, DeleteOption<WhiteImplicitReverseFkRefCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteImplicitReverseFkRefBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteImplicitReverseFkRefBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteImplicitReverseFkRefBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteImplicitReverseFkRefBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteImplicitReverseFkRefBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteImplicitReverseFkRefBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteImplicitReverseFkRefBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteImplicitReverseFkRefBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteImplicitReverseFkRefBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteImplicitReverseFkRefBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteImplicitReverseFkRefBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteImplicitReverseFkRefBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteImplicitReverseFkRefBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteImplicitReverseFkRefBhv.outideSql().removeBlockComment().selectList()
     * whiteImplicitReverseFkRefBhv.outideSql().removeLineComment().selectList()
     * whiteImplicitReverseFkRefBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteImplicitReverseFkRefBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteImplicitReverseFkRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteImplicitReverseFkRef> typeOfSelectedEntity() { return WhiteImplicitReverseFkRef.class; }
    protected Class<WhiteImplicitReverseFkRef> typeOfHandlingEntity() { return WhiteImplicitReverseFkRef.class; }
    protected Class<WhiteImplicitReverseFkRefCB> typeOfHandlingConditionBean() { return WhiteImplicitReverseFkRefCB.class; }
}
