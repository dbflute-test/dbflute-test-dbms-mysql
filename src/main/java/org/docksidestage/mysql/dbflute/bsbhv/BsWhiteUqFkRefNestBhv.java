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
 * The behavior of WHITE_UQ_FK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_NEST_ID
 *
 * [column]
 *     UQ_FK_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk_ref
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteUqFkRef
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkRefNestBhv extends AbstractBehaviorWritable<WhiteUqFkRefNest, WhiteUqFkRefNestCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteUqFkRefNestDbm getDBMeta() { return WhiteUqFkRefNestDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUqFkRefNestCB newConditionBean() { return new WhiteUqFkRefNestCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkRefNestCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteUqFkRefNest&gt; entity = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteUqFkRefNest -&gt; {
     *     ...
     * });
     * WhiteUqFkRefNest whiteUqFkRefNest = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteUqFkRefNest -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteUqFkRefNest whiteUqFkRefNest = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFkRefNest> selectEntity(CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteUqFkRefNest&gt; entity = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteUqFkRefNest -&gt; {
     *     ...
     * });
     * WhiteUqFkRefNest whiteUqFkRefNest = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteUqFkRefNest -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteUqFkRefNest whiteUqFkRefNest = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFkRefNest> selectEntity(WhiteUqFkRefNestCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteUqFkRefNest> facadeSelectEntity(WhiteUqFkRefNestCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRefNest> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkRefNestCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkRefNest whiteUqFkRefNest = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkRefNest.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRefNest selectEntityWithDeletedCheck(CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkRefNest whiteUqFkRefNest = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkRefNest.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRefNest selectEntityWithDeletedCheck(WhiteUqFkRefNestCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqFkRefNestId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFkRefNest> selectByPK(Long uqFkRefNestId) {
        return facadeSelectByPK(uqFkRefNestId);
    }

    protected OptionalEntity<WhiteUqFkRefNest> facadeSelectByPK(Long uqFkRefNestId) {
        return doSelectOptionalByPK(uqFkRefNestId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRefNest> ENTITY doSelectByPK(Long uqFkRefNestId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(uqFkRefNestId), tp);
    }

    protected <ENTITY extends WhiteUqFkRefNest> OptionalEntity<ENTITY> doSelectOptionalByPK(Long uqFkRefNestId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(uqFkRefNestId, tp), uqFkRefNestId);
    }

    protected WhiteUqFkRefNestCB xprepareCBAsPK(Long uqFkRefNestId) {
        assertObjectNotNull("uqFkRefNestId", uqFkRefNestId);
        return newConditionBean().acceptPK(uqFkRefNestId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFkRefNest&gt; whiteUqFkRefNestList = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteUqFkRefNest whiteUqFkRefNest : whiteUqFkRefNestList) {
     *     ... = whiteUqFkRefNest.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkRefNest> selectList(CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFkRefNest&gt; whiteUqFkRefNestList = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteUqFkRefNest whiteUqFkRefNest : whiteUqFkRefNestList) {
     *     ... = whiteUqFkRefNest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkRefNest> selectList(WhiteUqFkRefNestCB cb) {
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
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkRefNest&gt; page = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFkRefNest whiteUqFkRefNest : page) {
     *     ... = whiteUqFkRefNest.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkRefNest> selectPage(CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkRefNest&gt; page = whiteUqFkRefNestBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFkRefNest whiteUqFkRefNest : page) {
     *     ... = whiteUqFkRefNest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkRefNest> selectPage(WhiteUqFkRefNestCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFkRefNest&gt;() {
     *     public void handle(WhiteUqFkRefNest entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @param entityLambda The handler of entity row of WhiteUqFkRefNest. (NotNull)
     */
    public void selectCursor(CBCall<WhiteUqFkRefNestCB> cbLambda, EntityRowHandler<WhiteUqFkRefNest> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFkRefNest&gt;() {
     *     public void handle(WhiteUqFkRefNest entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFkRefNest. (NotNull)
     */
    public void selectCursor(WhiteUqFkRefNestCB cb, EntityRowHandler<WhiteUqFkRefNest> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkRefNestCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUqFkRefNestCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteUqFkRefNestList The entity list of whiteUqFkRefNest. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUqFkRefNest> whiteUqFkRefNestList, ReferrerLoaderHandler<LoaderOfWhiteUqFkRefNest> loaderLambda) {
        xassLRArg(whiteUqFkRefNestList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUqFkRefNest().ready(whiteUqFkRefNestList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteUqFkRefNest The entity of whiteUqFkRefNest. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUqFkRefNest whiteUqFkRefNest, ReferrerLoaderHandler<LoaderOfWhiteUqFkRefNest> loaderLambda) {
        xassLRArg(whiteUqFkRefNest, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUqFkRefNest().ready(xnewLRAryLs(whiteUqFkRefNest), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteUqFkRef'.
     * @param whiteUqFkRefNestList The list of whiteUqFkRefNest. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFkRef> pulloutWhiteUqFkRef(List<WhiteUqFkRefNest> whiteUqFkRefNestList)
    { return helpPulloutInternally(whiteUqFkRefNestList, "whiteUqFkRef"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqFkRefNestId.
     * @param whiteUqFkRefNestList The list of whiteUqFkRefNest. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqFkRefNestIdList(List<WhiteUqFkRefNest> whiteUqFkRefNestList)
    { return helpExtractListInternally(whiteUqFkRefNestList, "uqFkRefNestId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFkRefNest.setFoo...(value);
     * whiteUqFkRefNest.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.set...;</span>
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">insert</span>(whiteUqFkRefNest);
     * ... = whiteUqFkRefNest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqFkRefNest The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqFkRefNest whiteUqFkRefNest) {
        doInsert(whiteUqFkRefNest, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * whiteUqFkRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFkRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFkRefNest.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkRefNestBhv.<span style="color: #DD4747">update</span>(whiteUqFkRefNest);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRefNest The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteUqFkRefNest whiteUqFkRefNest) {
        doUpdate(whiteUqFkRefNest, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteUqFkRefNest The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqFkRefNest whiteUqFkRefNest) {
        doInsertOrUpdate(whiteUqFkRefNest, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * whiteUqFkRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFkRefNest.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkRefNestBhv.<span style="color: #DD4747">delete</span>(whiteUqFkRefNest);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRefNest The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqFkRefNest whiteUqFkRefNest) {
        doDelete(whiteUqFkRefNest, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     *     whiteUqFkRefNest.setFooName("foo");
     *     if (...) {
     *         whiteUqFkRefNest.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqFkRefNestList.add(whiteUqFkRefNest);
     * }
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">batchInsert</span>(whiteUqFkRefNestList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqFkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqFkRefNest> whiteUqFkRefNestList) {
        return doBatchInsert(whiteUqFkRefNestList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     *     whiteUqFkRefNest.setFooName("foo");
     *     if (...) {
     *         whiteUqFkRefNest.setFooPrice(123);
     *     } else {
     *         whiteUqFkRefNest.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqFkRefNest.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqFkRefNestList.add(whiteUqFkRefNest);
     * }
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkRefNestList);
     * </pre>
     * @param whiteUqFkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFkRefNest> whiteUqFkRefNestList) {
        return doBatchUpdate(whiteUqFkRefNestList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqFkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqFkRefNest> whiteUqFkRefNestList) {
        return doBatchDelete(whiteUqFkRefNestList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqFkRefNest, WhiteUqFkRefNestCB&gt;() {
     *     public ConditionBean setup(WhiteUqFkRefNest entity, WhiteUqFkRefNestCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqFkRefNest, WhiteUqFkRefNestCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setPK...(value);</span>
     * whiteUqFkRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setVersionNo(value);</span>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">queryUpdate</span>(whiteUqFkRefNest, cb);
     * </pre>
     * @param whiteUqFkRefNest The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFkRefNest whiteUqFkRefNest, CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return doQueryUpdate(whiteUqFkRefNest, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setPK...(value);</span>
     * whiteUqFkRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setVersionNo(value);</span>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">queryUpdate</span>(whiteUqFkRefNest, cb);
     * </pre>
     * @param whiteUqFkRefNest The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFkRefNest whiteUqFkRefNest, WhiteUqFkRefNestCB cb) {
        return doQueryUpdate(whiteUqFkRefNest, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">queryDelete</span>(whiteUqFkRefNest, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteUqFkRefNestCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">queryDelete</span>(whiteUqFkRefNest, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqFkRefNestCB cb) {
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
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFkRefNest.setFoo...(value);
     * whiteUqFkRefNest.setBar...(value);
     * InsertOption<WhiteUqFkRefNestCB> option = new InsertOption<WhiteUqFkRefNestCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">varyingInsert</span>(whiteUqFkRefNest, option);
     * ... = whiteUqFkRefNest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqFkRefNest The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqFkRefNest whiteUqFkRefNest, WOptionCall<WhiteUqFkRefNestCB, InsertOption<WhiteUqFkRefNestCB>> opLambda) {
        doInsert(whiteUqFkRefNest, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * whiteUqFkRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFkRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFkRefNest.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqFkRefNestCB&gt; option = new UpdateOption&lt;WhiteUqFkRefNestCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *         public void specify(WhiteUqFkRefNestCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqFkRefNestBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteUqFkRefNest, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRefNest The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqFkRefNest whiteUqFkRefNest, WOptionCall<WhiteUqFkRefNestCB, UpdateOption<WhiteUqFkRefNestCB>> opLambda) {
        doUpdate(whiteUqFkRefNest, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqFkRefNest The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqFkRefNest whiteUqFkRefNest, WOptionCall<WhiteUqFkRefNestCB, InsertOption<WhiteUqFkRefNestCB>> insertOpLambda, WOptionCall<WhiteUqFkRefNestCB, UpdateOption<WhiteUqFkRefNestCB>> updateOpLambda) {
        doInsertOrUpdate(whiteUqFkRefNest, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqFkRefNest The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqFkRefNest whiteUqFkRefNest, WOptionCall<WhiteUqFkRefNestCB, DeleteOption<WhiteUqFkRefNestCB>> opLambda) {
        doDelete(whiteUqFkRefNest, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqFkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqFkRefNest> whiteUqFkRefNestList, WOptionCall<WhiteUqFkRefNestCB, InsertOption<WhiteUqFkRefNestCB>> opLambda) {
        return doBatchInsert(whiteUqFkRefNestList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqFkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqFkRefNest> whiteUqFkRefNestList, WOptionCall<WhiteUqFkRefNestCB, UpdateOption<WhiteUqFkRefNestCB>> opLambda) {
        return doBatchUpdate(whiteUqFkRefNestList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqFkRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqFkRefNest> whiteUqFkRefNestList, WOptionCall<WhiteUqFkRefNestCB, DeleteOption<WhiteUqFkRefNestCB>> opLambda) {
        return doBatchDelete(whiteUqFkRefNestList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqFkRefNest, WhiteUqFkRefNestCB> manyArgLambda, WOptionCall<WhiteUqFkRefNestCB, InsertOption<WhiteUqFkRefNestCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setPK...(value);</span>
     * whiteUqFkRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setVersionNo(value);</span>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkRefNestCB&gt; option = new UpdateOption&lt;WhiteUqFkRefNestCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void specify(WhiteUqFkRefNestCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteUqFkRefNest, cb, option);
     * </pre>
     * @param whiteUqFkRefNest The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFkRefNest whiteUqFkRefNest, CBCall<WhiteUqFkRefNestCB> cbLambda, WOptionCall<WhiteUqFkRefNestCB, UpdateOption<WhiteUqFkRefNestCB>> opLambda) {
        return doQueryUpdate(whiteUqFkRefNest, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteUqFkRefNest whiteUqFkRefNest = new WhiteUqFkRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setPK...(value);</span>
     * whiteUqFkRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRefNest.setVersionNo(value);</span>
     * WhiteUqFkRefNestCB cb = new WhiteUqFkRefNestCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkRefNestCB&gt; option = new UpdateOption&lt;WhiteUqFkRefNestCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void specify(WhiteUqFkRefNestCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqFkRefNestBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteUqFkRefNest, cb, option);
     * </pre>
     * @param whiteUqFkRefNest The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFkRefNest whiteUqFkRefNest, WhiteUqFkRefNestCB cb, WOptionCall<WhiteUqFkRefNestCB, UpdateOption<WhiteUqFkRefNestCB>> opLambda) {
        return doQueryUpdate(whiteUqFkRefNest, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteUqFkRefNest. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteUqFkRefNestCB> cbLambda, WOptionCall<WhiteUqFkRefNestCB, DeleteOption<WhiteUqFkRefNestCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqFkRefNest. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqFkRefNestCB cb, WOptionCall<WhiteUqFkRefNestCB, DeleteOption<WhiteUqFkRefNestCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteUqFkRefNestBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteUqFkRefNestBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUqFkRefNestBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteUqFkRefNestBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUqFkRefNestBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteUqFkRefNestBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteUqFkRefNestBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteUqFkRefNestBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteUqFkRefNestBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteUqFkRefNestBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteUqFkRefNestBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteUqFkRefNestBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteUqFkRefNestBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteUqFkRefNestBhv.outideSql().removeBlockComment().selectList()
     * whiteUqFkRefNestBhv.outideSql().removeLineComment().selectList()
     * whiteUqFkRefNestBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteUqFkRefNestBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteUqFkRefNestBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteUqFkRefNest> typeOfSelectedEntity() { return WhiteUqFkRefNest.class; }
    protected Class<WhiteUqFkRefNest> typeOfHandlingEntity() { return WhiteUqFkRefNest.class; }
    protected Class<WhiteUqFkRefNestCB> typeOfHandlingConditionBean() { return WhiteUqFkRefNestCB.class; }
}
