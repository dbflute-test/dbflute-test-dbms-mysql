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
 * The behavior of WHITE_COMPOUND_REFERRED_NORMALLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRED_ID
 *
 * [column]
 *     REFERRED_ID, REFERRED_NAME
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
 *     white_compound_pk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteCompoundPkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundReferredNormallyBhv extends AbstractBehaviorWritable<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteCompoundReferredNormallyDbm getDBMeta() { return WhiteCompoundReferredNormallyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteCompoundReferredNormallyCB newConditionBean() { return new WhiteCompoundReferredNormallyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundReferredNormallyCB cb) {
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
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteCompoundReferredNormally&gt; entity = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteCompoundReferredNormally -&gt; {
     *     ...
     * });
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteCompoundReferredNormally -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteCompoundReferredNormally whiteCompoundReferredNormally = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundReferredNormally> selectEntity(CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteCompoundReferredNormally&gt; entity = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteCompoundReferredNormally -&gt; {
     *     ...
     * });
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteCompoundReferredNormally -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteCompoundReferredNormally whiteCompoundReferredNormally = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundReferredNormally> selectEntity(WhiteCompoundReferredNormallyCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteCompoundReferredNormally> facadeSelectEntity(WhiteCompoundReferredNormallyCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteCompoundReferredNormallyCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundReferredNormally.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredNormally selectEntityWithDeletedCheck(CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundReferredNormally.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredNormally selectEntityWithDeletedCheck(WhiteCompoundReferredNormallyCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param referredId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundReferredNormally> selectByPK(Integer referredId) {
        return facadeSelectByPK(referredId);
    }

    protected OptionalEntity<WhiteCompoundReferredNormally> facadeSelectByPK(Integer referredId) {
        return doSelectOptionalByPK(referredId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> ENTITY doSelectByPK(Integer referredId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(referredId), tp);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer referredId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(referredId, tp), referredId);
    }

    protected WhiteCompoundReferredNormallyCB xprepareCBAsPK(Integer referredId) {
        assertObjectNotNull("referredId", referredId);
        return newConditionBean().acceptPK(referredId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundReferredNormally&gt; whiteCompoundReferredNormallyList = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : whiteCompoundReferredNormallyList) {
     *     ... = whiteCompoundReferredNormally.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundReferredNormally> selectList(CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundReferredNormally&gt; whiteCompoundReferredNormallyList = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : whiteCompoundReferredNormallyList) {
     *     ... = whiteCompoundReferredNormally.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundReferredNormally> selectList(WhiteCompoundReferredNormallyCB cb) {
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
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundReferredNormally&gt; page = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : page) {
     *     ... = whiteCompoundReferredNormally.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundReferredNormally> selectPage(CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundReferredNormally&gt; page = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : page) {
     *     ... = whiteCompoundReferredNormally.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundReferredNormally> selectPage(WhiteCompoundReferredNormallyCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundReferredNormally&gt;() {
     *     public void handle(WhiteCompoundReferredNormally entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param entityLambda The handler of entity row of WhiteCompoundReferredNormally. (NotNull)
     */
    public void selectCursor(CBCall<WhiteCompoundReferredNormallyCB> cbLambda, EntityRowHandler<WhiteCompoundReferredNormally> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundReferredNormally&gt;() {
     *     public void handle(WhiteCompoundReferredNormally entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundReferredNormally. (NotNull)
     */
    public void selectCursor(WhiteCompoundReferredNormallyCB cb, EntityRowHandler<WhiteCompoundReferredNormally> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundReferredNormallyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteCompoundReferredNormallyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteCompoundReferredNormallyList The entity list of whiteCompoundReferredNormally. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, ReferrerLoaderHandler<LoaderOfWhiteCompoundReferredNormally> loaderLambda) {
        xassLRArg(whiteCompoundReferredNormallyList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteCompoundReferredNormally().ready(whiteCompoundReferredNormallyList, _behaviorSelector));
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
     * @param whiteCompoundReferredNormally The entity of whiteCompoundReferredNormally. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteCompoundReferredNormally whiteCompoundReferredNormally, ReferrerLoaderHandler<LoaderOfWhiteCompoundReferredNormally> loaderLambda) {
        xassLRArg(whiteCompoundReferredNormally, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteCompoundReferredNormally().ready(xnewLRAryLs(whiteCompoundReferredNormally), _behaviorSelector));
    }

    /**
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">loadWhiteCompoundPkList</span>(whiteCompoundReferredNormallyList, pkCB -&gt; {
     *     pkCB.setupSelect...();
     *     pkCB.query().setFoo...(value);
     *     pkCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : whiteCompoundReferredNormallyList) {
     *     ... = whiteCompoundReferredNormally.<span style="color: #DD4747">getWhiteCompoundPkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferredId_InScope(pkList);
     * cb.query().addOrderBy_ReferredId_Asc();
     * </pre>
     * @param whiteCompoundReferredNormallyList The entity list of whiteCompoundReferredNormally. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPk> loadWhiteCompoundPkList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, ConditionBeanSetupper<WhiteCompoundPkCB> refCBLambda) {
        xassLRArg(whiteCompoundReferredNormallyList, refCBLambda);
        return doLoadWhiteCompoundPkList(whiteCompoundReferredNormallyList, new LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">loadWhiteCompoundPkList</span>(whiteCompoundReferredNormallyList, pkCB -&gt; {
     *     pkCB.setupSelect...();
     *     pkCB.query().setFoo...(value);
     *     pkCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteCompoundReferredNormally.<span style="color: #DD4747">getWhiteCompoundPkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferredId_InScope(pkList);
     * cb.query().addOrderBy_ReferredId_Asc();
     * </pre>
     * @param whiteCompoundReferredNormally The entity of whiteCompoundReferredNormally. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPk> loadWhiteCompoundPkList(WhiteCompoundReferredNormally whiteCompoundReferredNormally, ConditionBeanSetupper<WhiteCompoundPkCB> refCBLambda) {
        xassLRArg(whiteCompoundReferredNormally, refCBLambda);
        return doLoadWhiteCompoundPkList(xnewLRLs(whiteCompoundReferredNormally), new LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteCompoundReferredNormally The entity of whiteCompoundReferredNormally. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteCompoundPk> loadWhiteCompoundPkList(WhiteCompoundReferredNormally whiteCompoundReferredNormally, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> loadReferrerOption) {
        xassLRArg(whiteCompoundReferredNormally, loadReferrerOption);
        return loadWhiteCompoundPkList(xnewLRLs(whiteCompoundReferredNormally), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteCompoundReferredNormallyList The entity list of whiteCompoundReferredNormally. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteCompoundPk> loadWhiteCompoundPkList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> loadReferrerOption) {
        xassLRArg(whiteCompoundReferredNormallyList, loadReferrerOption);
        if (whiteCompoundReferredNormallyList.isEmpty()) { return (NestedReferrerListGateway<WhiteCompoundPk>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteCompoundPkList(whiteCompoundReferredNormallyList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteCompoundPk> doLoadWhiteCompoundPkList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> option) {
        return helpLoadReferrerInternally(whiteCompoundReferredNormallyList, option, "whiteCompoundPkList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key referredId.
     * @param whiteCompoundReferredNormallyList The list of whiteCompoundReferredNormally. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractReferredIdList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList)
    { return helpExtractListInternally(whiteCompoundReferredNormallyList, "referredId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundReferredNormally.setFoo...(value);
     * whiteCompoundReferredNormally.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">insert</span>(whiteCompoundReferredNormally);
     * ... = whiteCompoundReferredNormally.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundReferredNormally The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doInsert(whiteCompoundReferredNormally, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * whiteCompoundReferredNormally.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundReferredNormally.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundReferredNormally.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">update</span>(whiteCompoundReferredNormally);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredNormally The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doUpdate(whiteCompoundReferredNormally, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteCompoundReferredNormally The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doInsertOrUpdate(whiteCompoundReferredNormally, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * whiteCompoundReferredNormally.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundReferredNormally.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">delete</span>(whiteCompoundReferredNormally);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredNormally The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doDelete(whiteCompoundReferredNormally, null);
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
     *     WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     *     whiteCompoundReferredNormally.setFooName("foo");
     *     if (...) {
     *         whiteCompoundReferredNormally.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundReferredNormallyList.add(whiteCompoundReferredNormally);
     * }
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">batchInsert</span>(whiteCompoundReferredNormallyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        return doBatchInsert(whiteCompoundReferredNormallyList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     *     whiteCompoundReferredNormally.setFooName("foo");
     *     if (...) {
     *         whiteCompoundReferredNormally.setFooPrice(123);
     *     } else {
     *         whiteCompoundReferredNormally.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundReferredNormallyList.add(whiteCompoundReferredNormally);
     * }
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredNormallyList);
     * </pre>
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        return doBatchUpdate(whiteCompoundReferredNormallyList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        return doBatchDelete(whiteCompoundReferredNormallyList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB&gt;() {
     *     public ConditionBean setup(WhiteCompoundReferredNormally entity, WhiteCompoundReferredNormallyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setPK...(value);</span>
     * whiteCompoundReferredNormally.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setVersionNo(value);</span>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteCompoundReferredNormally, cb);
     * </pre>
     * @param whiteCompoundReferredNormally The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return doQueryUpdate(whiteCompoundReferredNormally, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setPK...(value);</span>
     * whiteCompoundReferredNormally.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setVersionNo(value);</span>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteCompoundReferredNormally, cb);
     * </pre>
     * @param whiteCompoundReferredNormally The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB cb) {
        return doQueryUpdate(whiteCompoundReferredNormally, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryDelete</span>(whiteCompoundReferredNormally, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteCompoundReferredNormallyCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryDelete</span>(whiteCompoundReferredNormally, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundReferredNormallyCB cb) {
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
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundReferredNormally.setFoo...(value);
     * whiteCompoundReferredNormally.setBar...(value);
     * InsertOption<WhiteCompoundReferredNormallyCB> option = new InsertOption<WhiteCompoundReferredNormallyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingInsert</span>(whiteCompoundReferredNormally, option);
     * ... = whiteCompoundReferredNormally.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundReferredNormally The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WOptionCall<WhiteCompoundReferredNormallyCB, InsertOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        doInsert(whiteCompoundReferredNormally, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * whiteCompoundReferredNormally.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundReferredNormally.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundReferredNormally.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *         public void specify(WhiteCompoundReferredNormallyCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteCompoundReferredNormally, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredNormally The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WOptionCall<WhiteCompoundReferredNormallyCB, UpdateOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        doUpdate(whiteCompoundReferredNormally, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundReferredNormally The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WOptionCall<WhiteCompoundReferredNormallyCB, InsertOption<WhiteCompoundReferredNormallyCB>> insertOpLambda, WOptionCall<WhiteCompoundReferredNormallyCB, UpdateOption<WhiteCompoundReferredNormallyCB>> updateOpLambda) {
        doInsertOrUpdate(whiteCompoundReferredNormally, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundReferredNormally The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WOptionCall<WhiteCompoundReferredNormallyCB, DeleteOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        doDelete(whiteCompoundReferredNormally, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, WOptionCall<WhiteCompoundReferredNormallyCB, InsertOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doBatchInsert(whiteCompoundReferredNormallyList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, WOptionCall<WhiteCompoundReferredNormallyCB, UpdateOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doBatchUpdate(whiteCompoundReferredNormallyList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, WOptionCall<WhiteCompoundReferredNormallyCB, DeleteOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doBatchDelete(whiteCompoundReferredNormallyList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> manyArgLambda, WOptionCall<WhiteCompoundReferredNormallyCB, InsertOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setPK...(value);</span>
     * whiteCompoundReferredNormally.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setVersionNo(value);</span>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void specify(WhiteCompoundReferredNormallyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteCompoundReferredNormally, cb, option);
     * </pre>
     * @param whiteCompoundReferredNormally The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, CBCall<WhiteCompoundReferredNormallyCB> cbLambda, WOptionCall<WhiteCompoundReferredNormallyCB, UpdateOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doQueryUpdate(whiteCompoundReferredNormally, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setPK...(value);</span>
     * whiteCompoundReferredNormally.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setVersionNo(value);</span>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void specify(WhiteCompoundReferredNormallyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteCompoundReferredNormally, cb, option);
     * </pre>
     * @param whiteCompoundReferredNormally The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB cb, WOptionCall<WhiteCompoundReferredNormallyCB, UpdateOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doQueryUpdate(whiteCompoundReferredNormally, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteCompoundReferredNormallyCB> cbLambda, WOptionCall<WhiteCompoundReferredNormallyCB, DeleteOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundReferredNormallyCB cb, WOptionCall<WhiteCompoundReferredNormallyCB, DeleteOption<WhiteCompoundReferredNormallyCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteCompoundReferredNormallyBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteCompoundReferredNormallyBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteCompoundReferredNormallyBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteCompoundReferredNormallyBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteCompoundReferredNormallyBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteCompoundReferredNormallyBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteCompoundReferredNormallyBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteCompoundReferredNormallyBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteCompoundReferredNormallyBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteCompoundReferredNormallyBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteCompoundReferredNormallyBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteCompoundReferredNormallyBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteCompoundReferredNormallyBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteCompoundReferredNormallyBhv.outideSql().removeBlockComment().selectList()
     * whiteCompoundReferredNormallyBhv.outideSql().removeLineComment().selectList()
     * whiteCompoundReferredNormallyBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteCompoundReferredNormallyBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteCompoundReferredNormallyBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteCompoundReferredNormally> typeOfSelectedEntity() { return WhiteCompoundReferredNormally.class; }
    protected Class<WhiteCompoundReferredNormally> typeOfHandlingEntity() { return WhiteCompoundReferredNormally.class; }
    protected Class<WhiteCompoundReferredNormallyCB> typeOfHandlingConditionBean() { return WhiteCompoundReferredNormallyCB.class; }
}
