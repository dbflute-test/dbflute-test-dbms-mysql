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
 * The behavior of WHITE_PERROTTA_OVER_PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_NESTED_CODE
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
 *     white_perrotta_over_product_nested, WHITE_PERROTTA_OVER_TRACE(AsPerrotta)
 *
 * [referrer table]
 *     white_perrotta_over_member, white_perrotta_over_trace
 *
 * [foreign property]
 *     whitePerrottaOverProductNested, whitePerrottaOverTraceAsPerrotta
 *
 * [referrer property]
 *     whitePerrottaOverMemberList, whitePerrottaOverTraceByNextProductIdList, whitePerrottaOverTraceByPreviousProductIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverProductBhv extends AbstractBehaviorWritable<WhitePerrottaOverProduct, WhitePerrottaOverProductCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePerrottaOverProductDbm getDBMeta() { return WhitePerrottaOverProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePerrottaOverProductCB newConditionBean() { return new WhitePerrottaOverProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * int count = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * int count = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePerrottaOverProductCB cb) {
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
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhitePerrottaOverProduct&gt; entity = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whitePerrottaOverProduct -&gt; {
     *     ...
     * });
     * WhitePerrottaOverProduct whitePerrottaOverProduct = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whitePerrottaOverProduct -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhitePerrottaOverProduct whitePerrottaOverProduct = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverProduct> selectEntity(CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhitePerrottaOverProduct&gt; entity = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whitePerrottaOverProduct -&gt; {
     *     ...
     * });
     * WhitePerrottaOverProduct whitePerrottaOverProduct = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whitePerrottaOverProduct -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhitePerrottaOverProduct whitePerrottaOverProduct = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverProduct> selectEntity(WhitePerrottaOverProductCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhitePerrottaOverProduct> facadeSelectEntity(WhitePerrottaOverProductCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverProduct> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePerrottaOverProductCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * WhitePerrottaOverProduct whitePerrottaOverProduct = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverProduct selectEntityWithDeletedCheck(CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * WhitePerrottaOverProduct whitePerrottaOverProduct = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverProduct selectEntityWithDeletedCheck(WhitePerrottaOverProductCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePerrottaOverProduct> selectByPK(Long productId) {
        return facadeSelectByPK(productId);
    }

    protected OptionalEntity<WhitePerrottaOverProduct> facadeSelectByPK(Long productId) {
        return doSelectOptionalByPK(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverProduct> ENTITY doSelectByPK(Long productId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productId), tp);
    }

    protected <ENTITY extends WhitePerrottaOverProduct> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productId, tp), productId);
    }

    protected WhitePerrottaOverProductCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        return newConditionBean().acceptPK(productId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePerrottaOverProduct&gt; whitePerrottaOverProductList = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : whitePerrottaOverProductList) {
     *     ... = whitePerrottaOverProduct.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverProduct> selectList(CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePerrottaOverProduct&gt; whitePerrottaOverProductList = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : whitePerrottaOverProductList) {
     *     ... = whitePerrottaOverProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverProduct> selectList(WhitePerrottaOverProductCB cb) {
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
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverProduct&gt; page = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : page) {
     *     ... = whitePerrottaOverProduct.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverProduct> selectPage(CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverProduct&gt; page = whitePerrottaOverProductBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : page) {
     *     ... = whitePerrottaOverProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverProduct> selectPage(WhitePerrottaOverProductCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePerrottaOverProduct&gt;() {
     *     public void handle(WhitePerrottaOverProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @param entityLambda The handler of entity row of WhitePerrottaOverProduct. (NotNull)
     */
    public void selectCursor(CBCall<WhitePerrottaOverProductCB> cbLambda, EntityRowHandler<WhitePerrottaOverProduct> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePerrottaOverProduct&gt;() {
     *     public void handle(WhitePerrottaOverProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePerrottaOverProduct. (NotNull)
     */
    public void selectCursor(WhitePerrottaOverProductCB cb, EntityRowHandler<WhitePerrottaOverProduct> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePerrottaOverProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePerrottaOverProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverProduct> loaderLambda) {
        xassLRArg(whitePerrottaOverProductList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverProduct().ready(whitePerrottaOverProductList, _behaviorSelector));
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
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePerrottaOverProduct whitePerrottaOverProduct, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverProduct> loaderLambda) {
        xassLRArg(whitePerrottaOverProduct, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePerrottaOverProduct().ready(xnewLRAryLs(whitePerrottaOverProduct), _behaviorSelector));
    }

    /**
     * Load referrer of whitePerrottaOverMemberList by the set-upper of referrer. <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">loadWhitePerrottaOverMemberList</span>(whitePerrottaOverProductList, memberCB -&gt; {
     *     memberCB.setupSelect...();
     *     memberCB.query().setFoo...(value);
     *     memberCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : whitePerrottaOverProductList) {
     *     ... = whitePerrottaOverProduct.<span style="color: #DD4747">getWhitePerrottaOverMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        xassLRArg(whitePerrottaOverProductList, refCBLambda);
        return doLoadWhitePerrottaOverMemberList(whitePerrottaOverProductList, new LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whitePerrottaOverMemberList by the set-upper of referrer. <br />
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">loadWhitePerrottaOverMemberList</span>(whitePerrottaOverProductList, memberCB -&gt; {
     *     memberCB.setupSelect...();
     *     memberCB.query().setFoo...(value);
     *     memberCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whitePerrottaOverProduct.<span style="color: #DD4747">getWhitePerrottaOverMemberList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(WhitePerrottaOverProduct whitePerrottaOverProduct, ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        xassLRArg(whitePerrottaOverProduct, refCBLambda);
        return doLoadWhitePerrottaOverMemberList(xnewLRLs(whitePerrottaOverProduct), new LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(WhitePerrottaOverProduct whitePerrottaOverProduct, LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProduct, loadReferrerOption);
        return loadWhitePerrottaOverMemberList(xnewLRLs(whitePerrottaOverProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePerrottaOverMember> loadWhitePerrottaOverMemberList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProductList, loadReferrerOption);
        if (whitePerrottaOverProductList.isEmpty()) { return (NestedReferrerListGateway<WhitePerrottaOverMember>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePerrottaOverMemberList(whitePerrottaOverProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePerrottaOverMember> doLoadWhitePerrottaOverMemberList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, LoadReferrerOption<WhitePerrottaOverMemberCB, WhitePerrottaOverMember> option) {
        return helpLoadReferrerInternally(whitePerrottaOverProductList, option, "whitePerrottaOverMemberList");
    }

    /**
     * Load referrer of whitePerrottaOverTraceByNextProductIdList by the set-upper of referrer. <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">loadWhitePerrottaOverTraceByNextProductIdList</span>(whitePerrottaOverProductList, traceCB -&gt; {
     *     traceCB.setupSelect...();
     *     traceCB.query().setFoo...(value);
     *     traceCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : whitePerrottaOverProductList) {
     *     ... = whitePerrottaOverProduct.<span style="color: #DD4747">getWhitePerrottaOverTraceByNextProductIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextProductId_InScope(pkList);
     * cb.query().addOrderBy_NextProductId_Asc();
     * </pre>
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByNextProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, ConditionBeanSetupper<WhitePerrottaOverTraceCB> refCBLambda) {
        xassLRArg(whitePerrottaOverProductList, refCBLambda);
        return doLoadWhitePerrottaOverTraceByNextProductIdList(whitePerrottaOverProductList, new LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whitePerrottaOverTraceByNextProductIdList by the set-upper of referrer. <br />
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">loadWhitePerrottaOverTraceByNextProductIdList</span>(whitePerrottaOverProductList, traceCB -&gt; {
     *     traceCB.setupSelect...();
     *     traceCB.query().setFoo...(value);
     *     traceCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whitePerrottaOverProduct.<span style="color: #DD4747">getWhitePerrottaOverTraceByNextProductIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextProductId_InScope(pkList);
     * cb.query().addOrderBy_NextProductId_Asc();
     * </pre>
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverProduct whitePerrottaOverProduct, ConditionBeanSetupper<WhitePerrottaOverTraceCB> refCBLambda) {
        xassLRArg(whitePerrottaOverProduct, refCBLambda);
        return doLoadWhitePerrottaOverTraceByNextProductIdList(xnewLRLs(whitePerrottaOverProduct), new LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByNextProductIdList(WhitePerrottaOverProduct whitePerrottaOverProduct, LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProduct, loadReferrerOption);
        return loadWhitePerrottaOverTraceByNextProductIdList(xnewLRLs(whitePerrottaOverProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByNextProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProductList, loadReferrerOption);
        if (whitePerrottaOverProductList.isEmpty()) { return (NestedReferrerListGateway<WhitePerrottaOverTrace>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePerrottaOverTraceByNextProductIdList(whitePerrottaOverProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePerrottaOverTrace> doLoadWhitePerrottaOverTraceByNextProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace> option) {
        return helpLoadReferrerInternally(whitePerrottaOverProductList, option, "whitePerrottaOverTraceByNextProductIdList");
    }

    /**
     * Load referrer of whitePerrottaOverTraceByPreviousProductIdList by the set-upper of referrer. <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">loadWhitePerrottaOverTraceByPreviousProductIdList</span>(whitePerrottaOverProductList, traceCB -&gt; {
     *     traceCB.setupSelect...();
     *     traceCB.query().setFoo...(value);
     *     traceCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePerrottaOverProduct whitePerrottaOverProduct : whitePerrottaOverProductList) {
     *     ... = whitePerrottaOverProduct.<span style="color: #DD4747">getWhitePerrottaOverTraceByPreviousProductIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPreviousProductId_InScope(pkList);
     * cb.query().addOrderBy_PreviousProductId_Asc();
     * </pre>
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByPreviousProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, ConditionBeanSetupper<WhitePerrottaOverTraceCB> refCBLambda) {
        xassLRArg(whitePerrottaOverProductList, refCBLambda);
        return doLoadWhitePerrottaOverTraceByPreviousProductIdList(whitePerrottaOverProductList, new LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whitePerrottaOverTraceByPreviousProductIdList by the set-upper of referrer. <br />
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">loadWhitePerrottaOverTraceByPreviousProductIdList</span>(whitePerrottaOverProductList, traceCB -&gt; {
     *     traceCB.setupSelect...();
     *     traceCB.query().setFoo...(value);
     *     traceCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whitePerrottaOverProduct.<span style="color: #DD4747">getWhitePerrottaOverTraceByPreviousProductIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPreviousProductId_InScope(pkList);
     * cb.query().addOrderBy_PreviousProductId_Asc();
     * </pre>
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverProduct whitePerrottaOverProduct, ConditionBeanSetupper<WhitePerrottaOverTraceCB> refCBLambda) {
        xassLRArg(whitePerrottaOverProduct, refCBLambda);
        return doLoadWhitePerrottaOverTraceByPreviousProductIdList(xnewLRLs(whitePerrottaOverProduct), new LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePerrottaOverProduct The entity of whitePerrottaOverProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByPreviousProductIdList(WhitePerrottaOverProduct whitePerrottaOverProduct, LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProduct, loadReferrerOption);
        return loadWhitePerrottaOverTraceByPreviousProductIdList(xnewLRLs(whitePerrottaOverProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whitePerrottaOverProductList The entity list of whitePerrottaOverProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePerrottaOverTrace> loadWhitePerrottaOverTraceByPreviousProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProductList, loadReferrerOption);
        if (whitePerrottaOverProductList.isEmpty()) { return (NestedReferrerListGateway<WhitePerrottaOverTrace>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePerrottaOverTraceByPreviousProductIdList(whitePerrottaOverProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePerrottaOverTrace> doLoadWhitePerrottaOverTraceByPreviousProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, LoadReferrerOption<WhitePerrottaOverTraceCB, WhitePerrottaOverTrace> option) {
        return helpLoadReferrerInternally(whitePerrottaOverProductList, option, "whitePerrottaOverTraceByPreviousProductIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhitePerrottaOverProductNested'.
     * @param whitePerrottaOverProductList The list of whitePerrottaOverProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePerrottaOverProductNested> pulloutWhitePerrottaOverProductNested(List<WhitePerrottaOverProduct> whitePerrottaOverProductList)
    { return helpPulloutInternally(whitePerrottaOverProductList, "whitePerrottaOverProductNested"); }

    /**
     * Pull out the list of foreign table 'WhitePerrottaOverTrace'.
     * @param whitePerrottaOverProductList The list of whitePerrottaOverProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePerrottaOverTrace> pulloutWhitePerrottaOverTraceAsPerrotta(List<WhitePerrottaOverProduct> whitePerrottaOverProductList)
    { return helpPulloutInternally(whitePerrottaOverProductList, "whitePerrottaOverTraceAsPerrotta"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param whitePerrottaOverProductList The list of whitePerrottaOverProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList)
    { return helpExtractListInternally(whitePerrottaOverProductList, "productId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverProduct.setFoo...(value);
     * whitePerrottaOverProduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.set...;</span>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">insert</span>(whitePerrottaOverProduct);
     * ... = whitePerrottaOverProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePerrottaOverProduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePerrottaOverProduct whitePerrottaOverProduct) {
        doInsert(whitePerrottaOverProduct, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * whitePerrottaOverProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePerrottaOverProductBhv.<span style="color: #DD4747">update</span>(whitePerrottaOverProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverProduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePerrottaOverProduct whitePerrottaOverProduct) {
        doUpdate(whitePerrottaOverProduct, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePerrottaOverProduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct) {
        doInsertOrUpdate(whitePerrottaOverProduct, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * whitePerrottaOverProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePerrottaOverProductBhv.<span style="color: #DD4747">delete</span>(whitePerrottaOverProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverProduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePerrottaOverProduct whitePerrottaOverProduct) {
        doDelete(whitePerrottaOverProduct, null);
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
     *     WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     *     whitePerrottaOverProduct.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverProduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePerrottaOverProductList.add(whitePerrottaOverProduct);
     * }
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">batchInsert</span>(whitePerrottaOverProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePerrottaOverProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePerrottaOverProduct> whitePerrottaOverProductList) {
        return doBatchInsert(whitePerrottaOverProductList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     *     whitePerrottaOverProduct.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverProduct.setFooPrice(123);
     *     } else {
     *         whitePerrottaOverProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePerrottaOverProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePerrottaOverProductList.add(whitePerrottaOverProduct);
     * }
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">batchUpdate</span>(whitePerrottaOverProductList);
     * </pre>
     * @param whitePerrottaOverProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePerrottaOverProduct> whitePerrottaOverProductList) {
        return doBatchUpdate(whitePerrottaOverProductList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePerrottaOverProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePerrottaOverProduct> whitePerrottaOverProductList) {
        return doBatchDelete(whitePerrottaOverProductList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePerrottaOverProduct, WhitePerrottaOverProductCB&gt;() {
     *     public ConditionBean setup(WhitePerrottaOverProduct entity, WhitePerrottaOverProductCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePerrottaOverProduct, WhitePerrottaOverProductCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setPK...(value);</span>
     * whitePerrottaOverProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setVersionNo(value);</span>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">queryUpdate</span>(whitePerrottaOverProduct, cb);
     * </pre>
     * @param whitePerrottaOverProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct, CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return doQueryUpdate(whitePerrottaOverProduct, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setPK...(value);</span>
     * whitePerrottaOverProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setVersionNo(value);</span>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">queryUpdate</span>(whitePerrottaOverProduct, cb);
     * </pre>
     * @param whitePerrottaOverProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct, WhitePerrottaOverProductCB cb) {
        return doQueryUpdate(whitePerrottaOverProduct, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">queryDelete</span>(whitePerrottaOverProduct, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhitePerrottaOverProductCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">queryDelete</span>(whitePerrottaOverProduct, cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePerrottaOverProductCB cb) {
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
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverProduct.setFoo...(value);
     * whitePerrottaOverProduct.setBar...(value);
     * InsertOption<WhitePerrottaOverProductCB> option = new InsertOption<WhitePerrottaOverProductCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">varyingInsert</span>(whitePerrottaOverProduct, option);
     * ... = whitePerrottaOverProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePerrottaOverProduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePerrottaOverProduct whitePerrottaOverProduct, WOptionCall<WhitePerrottaOverProductCB, InsertOption<WhitePerrottaOverProductCB>> opLambda) {
        doInsert(whitePerrottaOverProduct, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * whitePerrottaOverProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePerrottaOverProductCB&gt; option = new UpdateOption&lt;WhitePerrottaOverProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *         public void specify(WhitePerrottaOverProductCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePerrottaOverProductBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePerrottaOverProduct, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverProduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct, WOptionCall<WhitePerrottaOverProductCB, UpdateOption<WhitePerrottaOverProductCB>> opLambda) {
        doUpdate(whitePerrottaOverProduct, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePerrottaOverProduct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct, WOptionCall<WhitePerrottaOverProductCB, InsertOption<WhitePerrottaOverProductCB>> insertOpLambda, WOptionCall<WhitePerrottaOverProductCB, UpdateOption<WhitePerrottaOverProductCB>> updateOpLambda) {
        doInsertOrUpdate(whitePerrottaOverProduct, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePerrottaOverProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePerrottaOverProduct whitePerrottaOverProduct, WOptionCall<WhitePerrottaOverProductCB, DeleteOption<WhitePerrottaOverProductCB>> opLambda) {
        doDelete(whitePerrottaOverProduct, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePerrottaOverProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, WOptionCall<WhitePerrottaOverProductCB, InsertOption<WhitePerrottaOverProductCB>> opLambda) {
        return doBatchInsert(whitePerrottaOverProductList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePerrottaOverProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, WOptionCall<WhitePerrottaOverProductCB, UpdateOption<WhitePerrottaOverProductCB>> opLambda) {
        return doBatchUpdate(whitePerrottaOverProductList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePerrottaOverProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePerrottaOverProduct> whitePerrottaOverProductList, WOptionCall<WhitePerrottaOverProductCB, DeleteOption<WhitePerrottaOverProductCB>> opLambda) {
        return doBatchDelete(whitePerrottaOverProductList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePerrottaOverProduct, WhitePerrottaOverProductCB> manyArgLambda, WOptionCall<WhitePerrottaOverProductCB, InsertOption<WhitePerrottaOverProductCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setPK...(value);</span>
     * whitePerrottaOverProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setVersionNo(value);</span>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverProductCB&gt; option = new UpdateOption&lt;WhitePerrottaOverProductCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void specify(WhitePerrottaOverProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePerrottaOverProduct, cb, option);
     * </pre>
     * @param whitePerrottaOverProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct, CBCall<WhitePerrottaOverProductCB> cbLambda, WOptionCall<WhitePerrottaOverProductCB, UpdateOption<WhitePerrottaOverProductCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverProduct, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverProduct whitePerrottaOverProduct = new WhitePerrottaOverProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setPK...(value);</span>
     * whitePerrottaOverProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProduct.setVersionNo(value);</span>
     * WhitePerrottaOverProductCB cb = new WhitePerrottaOverProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverProductCB&gt; option = new UpdateOption&lt;WhitePerrottaOverProductCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void specify(WhitePerrottaOverProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePerrottaOverProductBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePerrottaOverProduct, cb, option);
     * </pre>
     * @param whitePerrottaOverProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverProduct whitePerrottaOverProduct, WhitePerrottaOverProductCB cb, WOptionCall<WhitePerrottaOverProductCB, UpdateOption<WhitePerrottaOverProductCB>> opLambda) {
        return doQueryUpdate(whitePerrottaOverProduct, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhitePerrottaOverProductCB> cbLambda, WOptionCall<WhitePerrottaOverProductCB, DeleteOption<WhitePerrottaOverProductCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePerrottaOverProduct. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePerrottaOverProductCB cb, WOptionCall<WhitePerrottaOverProductCB, DeleteOption<WhitePerrottaOverProductCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whitePerrottaOverProductBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whitePerrottaOverProductBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverProductBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whitePerrottaOverProductBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePerrottaOverProductBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whitePerrottaOverProductBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whitePerrottaOverProductBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whitePerrottaOverProductBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whitePerrottaOverProductBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whitePerrottaOverProductBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whitePerrottaOverProductBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whitePerrottaOverProductBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whitePerrottaOverProductBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whitePerrottaOverProductBhv.outideSql().removeBlockComment().selectList()
     * whitePerrottaOverProductBhv.outideSql().removeLineComment().selectList()
     * whitePerrottaOverProductBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePerrottaOverProductBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePerrottaOverProductBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePerrottaOverProduct> typeOfSelectedEntity() { return WhitePerrottaOverProduct.class; }
    protected Class<WhitePerrottaOverProduct> typeOfHandlingEntity() { return WhitePerrottaOverProduct.class; }
    protected Class<WhitePerrottaOverProductCB> typeOfHandlingConditionBean() { return WhitePerrottaOverProductCB.class; }
}
