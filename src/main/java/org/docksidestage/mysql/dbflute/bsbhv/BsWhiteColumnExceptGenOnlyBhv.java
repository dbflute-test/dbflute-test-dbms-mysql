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
 * The behavior of WHITE_COLUMN_EXCEPT_GEN_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_ONLY_ID
 *
 * [column]
 *     GEN_ONLY_ID, GEN_ONLY_NAME
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
public abstract class BsWhiteColumnExceptGenOnlyBhv extends AbstractBehaviorWritable<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteColumnExceptGenOnlyDbm getDBMeta() { return WhiteColumnExceptGenOnlyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteColumnExceptGenOnlyCB newConditionBean() { return new WhiteColumnExceptGenOnlyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * int count = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * int count = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteColumnExceptGenOnlyCB cb) {
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteColumnExceptGenOnly&gt; entity = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteColumnExceptGenOnly -&gt; {
     *     ...
     * });
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteColumnExceptGenOnly -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteColumnExceptGenOnly> selectEntity(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteColumnExceptGenOnly&gt; entity = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteColumnExceptGenOnly -&gt; {
     *     ...
     * });
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteColumnExceptGenOnly -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteColumnExceptGenOnly> selectEntity(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteColumnExceptGenOnly> facadeSelectEntity(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteColumnExceptGenOnlyCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteColumnExceptGenOnly.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectEntityWithDeletedCheck(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteColumnExceptGenOnly.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectEntityWithDeletedCheck(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param genOnlyId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteColumnExceptGenOnly> selectByPK(Long genOnlyId) {
        return facadeSelectByPK(genOnlyId);
    }

    protected OptionalEntity<WhiteColumnExceptGenOnly> facadeSelectByPK(Long genOnlyId) {
        return doSelectOptionalByPK(genOnlyId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectByPK(Long genOnlyId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(genOnlyId), tp);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> OptionalEntity<ENTITY> doSelectOptionalByPK(Long genOnlyId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(genOnlyId, tp), genOnlyId);
    }

    protected WhiteColumnExceptGenOnlyCB xprepareCBAsPK(Long genOnlyId) {
        assertObjectNotNull("genOnlyId", genOnlyId);
        return newConditionBean().acceptPK(genOnlyId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteColumnExceptGenOnly&gt; whiteColumnExceptGenOnlyList = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : whiteColumnExceptGenOnlyList) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteColumnExceptGenOnly> selectList(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteColumnExceptGenOnly&gt; whiteColumnExceptGenOnlyList = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : whiteColumnExceptGenOnlyList) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteColumnExceptGenOnly> selectList(WhiteColumnExceptGenOnlyCB cb) {
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteColumnExceptGenOnly&gt; page = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : page) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteColumnExceptGenOnly> selectPage(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteColumnExceptGenOnly&gt; page = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : page) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteColumnExceptGenOnly> selectPage(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteColumnExceptGenOnly&gt;() {
     *     public void handle(WhiteColumnExceptGenOnly entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param entityLambda The handler of entity row of WhiteColumnExceptGenOnly. (NotNull)
     */
    public void selectCursor(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda, EntityRowHandler<WhiteColumnExceptGenOnly> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteColumnExceptGenOnly&gt;() {
     *     public void handle(WhiteColumnExceptGenOnly entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteColumnExceptGenOnly. (NotNull)
     */
    public void selectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<WhiteColumnExceptGenOnly> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteColumnExceptGenOnlyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteColumnExceptGenOnlyList The entity list of whiteColumnExceptGenOnly. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, ReferrerLoaderHandler<LoaderOfWhiteColumnExceptGenOnly> loaderLambda) {
        xassLRArg(whiteColumnExceptGenOnlyList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteColumnExceptGenOnly().ready(whiteColumnExceptGenOnlyList, _behaviorSelector));
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
     * @param whiteColumnExceptGenOnly The entity of whiteColumnExceptGenOnly. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, ReferrerLoaderHandler<LoaderOfWhiteColumnExceptGenOnly> loaderLambda) {
        xassLRArg(whiteColumnExceptGenOnly, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteColumnExceptGenOnly().ready(xnewLRAryLs(whiteColumnExceptGenOnly), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key genOnlyId.
     * @param whiteColumnExceptGenOnlyList The list of whiteColumnExceptGenOnly. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenOnlyIdList(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList)
    { return helpExtractListInternally(whiteColumnExceptGenOnlyList, "genOnlyId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExceptGenOnly.setFoo...(value);
     * whiteColumnExceptGenOnly.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">insert</span>(whiteColumnExceptGenOnly);
     * ... = whiteColumnExceptGenOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteColumnExceptGenOnly The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doInsert(whiteColumnExceptGenOnly, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">update</span>(whiteColumnExceptGenOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doUpdate(whiteColumnExceptGenOnly, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteColumnExceptGenOnly The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doInsertOrUpdate(whiteColumnExceptGenOnly, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">delete</span>(whiteColumnExceptGenOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doDelete(whiteColumnExceptGenOnly, null);
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
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     *     whiteColumnExceptGenOnly.setFooName("foo");
     *     if (...) {
     *         whiteColumnExceptGenOnly.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteColumnExceptGenOnlyList.add(whiteColumnExceptGenOnly);
     * }
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">batchInsert</span>(whiteColumnExceptGenOnlyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchInsert(whiteColumnExceptGenOnlyList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     *     whiteColumnExceptGenOnly.setFooName("foo");
     *     if (...) {
     *         whiteColumnExceptGenOnly.setFooPrice(123);
     *     } else {
     *         whiteColumnExceptGenOnly.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteColumnExceptGenOnlyList.add(whiteColumnExceptGenOnly);
     * }
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList);
     * </pre>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchUpdate(whiteColumnExceptGenOnlyList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchDelete(whiteColumnExceptGenOnlyList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB&gt;() {
     *     public ConditionBean setup(WhiteColumnExceptGenOnly entity, WhiteColumnExceptGenOnlyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return doQueryUpdate(whiteColumnExceptGenOnly, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb) {
        return doQueryUpdate(whiteColumnExceptGenOnly, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryDelete</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryDelete</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteColumnExceptGenOnlyCB cb) {
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExceptGenOnly.setFoo...(value);
     * whiteColumnExceptGenOnly.setBar...(value);
     * InsertOption<WhiteColumnExceptGenOnlyCB> option = new InsertOption<WhiteColumnExceptGenOnlyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingInsert</span>(whiteColumnExceptGenOnly, option);
     * ... = whiteColumnExceptGenOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WOptionCall<WhiteColumnExceptGenOnlyCB, InsertOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        doInsert(whiteColumnExceptGenOnly, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *         public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteColumnExceptGenOnly, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WOptionCall<WhiteColumnExceptGenOnlyCB, UpdateOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        doUpdate(whiteColumnExceptGenOnly, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteColumnExceptGenOnly The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WOptionCall<WhiteColumnExceptGenOnlyCB, InsertOption<WhiteColumnExceptGenOnlyCB>> insertOpLambda, WOptionCall<WhiteColumnExceptGenOnlyCB, UpdateOption<WhiteColumnExceptGenOnlyCB>> updateOpLambda) {
        doInsertOrUpdate(whiteColumnExceptGenOnly, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteColumnExceptGenOnly The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WOptionCall<WhiteColumnExceptGenOnlyCB, DeleteOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        doDelete(whiteColumnExceptGenOnly, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, WOptionCall<WhiteColumnExceptGenOnlyCB, InsertOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doBatchInsert(whiteColumnExceptGenOnlyList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, WOptionCall<WhiteColumnExceptGenOnlyCB, UpdateOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doBatchUpdate(whiteColumnExceptGenOnlyList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, WOptionCall<WhiteColumnExceptGenOnlyCB, DeleteOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doBatchDelete(whiteColumnExceptGenOnlyList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> manyArgLambda, WOptionCall<WhiteColumnExceptGenOnlyCB, InsertOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteColumnExceptGenOnly, cb, option);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, CBCall<WhiteColumnExceptGenOnlyCB> cbLambda, WOptionCall<WhiteColumnExceptGenOnlyCB, UpdateOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doQueryUpdate(whiteColumnExceptGenOnly, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteColumnExceptGenOnly, cb, option);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb, WOptionCall<WhiteColumnExceptGenOnlyCB, UpdateOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doQueryUpdate(whiteColumnExceptGenOnly, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteColumnExceptGenOnlyCB> cbLambda, WOptionCall<WhiteColumnExceptGenOnlyCB, DeleteOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteColumnExceptGenOnlyCB cb, WOptionCall<WhiteColumnExceptGenOnlyCB, DeleteOption<WhiteColumnExceptGenOnlyCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteColumnExceptGenOnlyBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteColumnExceptGenOnlyBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteColumnExceptGenOnlyBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteColumnExceptGenOnlyBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteColumnExceptGenOnlyBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteColumnExceptGenOnlyBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteColumnExceptGenOnlyBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteColumnExceptGenOnlyBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteColumnExceptGenOnlyBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteColumnExceptGenOnlyBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteColumnExceptGenOnlyBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteColumnExceptGenOnlyBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteColumnExceptGenOnlyBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteColumnExceptGenOnlyBhv.outideSql().removeBlockComment().selectList()
     * whiteColumnExceptGenOnlyBhv.outideSql().removeLineComment().selectList()
     * whiteColumnExceptGenOnlyBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteColumnExceptGenOnlyBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteColumnExceptGenOnlyBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteColumnExceptGenOnly> typeOfSelectedEntity() { return WhiteColumnExceptGenOnly.class; }
    protected Class<WhiteColumnExceptGenOnly> typeOfHandlingEntity() { return WhiteColumnExceptGenOnly.class; }
    protected Class<WhiteColumnExceptGenOnlyCB> typeOfHandlingConditionBean() { return WhiteColumnExceptGenOnlyCB.class; }
}
