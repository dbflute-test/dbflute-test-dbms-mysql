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
 * The behavior of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br />
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
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteVariantRelationReferrer&gt; entity = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteVariantRelationReferrer -&gt; {
     *     ...
     * });
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteVariantRelationReferrer -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationReferrer> selectEntity(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteVariantRelationReferrer&gt; entity = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteVariantRelationReferrer -&gt; {
     *     ...
     * });
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteVariantRelationReferrer -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntityWithDeletedCheck(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntityWithDeletedCheck(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param referrerId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationReferrer&gt; whiteVariantRelationReferrerList = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : whiteVariantRelationReferrerList) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationReferrer> selectList(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationReferrer&gt; whiteVariantRelationReferrerList = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : whiteVariantRelationReferrerList) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
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
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationReferrer&gt; page = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : page) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationReferrer> selectPage(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationReferrer&gt; page = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : page) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
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
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationReferrer&gt;() {
     *     public void handle(WhiteVariantRelationReferrer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param entityLambda The handler of entity row of WhiteVariantRelationReferrer. (NotNull)
     */
    public void selectCursor(CBCall<WhiteVariantRelationReferrerCB> cbLambda, EntityRowHandler<WhiteVariantRelationReferrer> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationReferrer&gt;() {
     *     public void handle(WhiteVariantRelationReferrer entity) {
     *         ... = entity.getFoo...();
     *     }
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
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationReferrerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> loaderLambda) {
        xassLRArg(whiteVariantRelationReferrerList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationReferrer().ready(whiteVariantRelationReferrerList, _behaviorSelector));
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
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationReferrer whiteVariantRelationReferrer, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> loaderLambda) {
        xassLRArg(whiteVariantRelationReferrer, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationReferrer().ready(xnewLRAryLs(whiteVariantRelationReferrer), _behaviorSelector));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br />
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerRefList</span>(whiteVariantRelationReferrerList, refCB -&gt; {
     *     refCB.setupSelect...();
     *     refCB.query().setFoo...(value);
     *     refCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : whiteVariantRelationReferrerList) {
     *     ... = whiteVariantRelationReferrer.<span style="color: #DD4747">getWhiteVariantRelationReferrerRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> refCBLambda) {
        xassLRArg(whiteVariantRelationReferrerList, refCBLambda);
        return doLoadWhiteVariantRelationReferrerRefList(whiteVariantRelationReferrerList, new LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br />
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerRefList</span>(whiteVariantRelationReferrerList, refCB -&gt; {
     *     refCB.setupSelect...();
     *     refCB.query().setFoo...(value);
     *     refCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteVariantRelationReferrer.<span style="color: #DD4747">getWhiteVariantRelationReferrerRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrer whiteVariantRelationReferrer, ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> refCBLambda) {
        xassLRArg(whiteVariantRelationReferrer, refCBLambda);
        return doLoadWhiteVariantRelationReferrerRefList(xnewLRLs(whiteVariantRelationReferrer), new LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrer whiteVariantRelationReferrer, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> loadReferrerOption) {
        xassLRArg(whiteVariantRelationReferrer, loadReferrerOption);
        return loadWhiteVariantRelationReferrerRefList(xnewLRLs(whiteVariantRelationReferrer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> loadReferrerOption) {
        xassLRArg(whiteVariantRelationReferrerList, loadReferrerOption);
        if (whiteVariantRelationReferrerList.isEmpty()) { return (NestedReferrerListGateway<WhiteVariantRelationReferrerRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteVariantRelationReferrerRefList(whiteVariantRelationReferrerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteVariantRelationReferrerRef> doLoadWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> option) {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationReferrer);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsert(whiteVariantRelationReferrer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doUpdate(whiteVariantRelationReferrer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationReferrer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsertOrUpdate(whiteVariantRelationReferrer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doDelete(whiteVariantRelationReferrer, null);
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
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationReferrerList);
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
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerList);
     * </pre>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchUpdate(whiteVariantRelationReferrerList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
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
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB&gt;() {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return doQueryUpdate(whiteVariantRelationReferrer, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb) {
        return doQueryUpdate(whiteVariantRelationReferrer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteVariantRelationReferrerCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
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
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * InsertOption<WhiteVariantRelationReferrerCB> option = new InsertOption<WhiteVariantRelationReferrerCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationReferrer, option);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> opLambda) {
        doInsert(whiteVariantRelationReferrer, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *         public void specify(WhiteVariantRelationReferrerCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationReferrer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        doUpdate(whiteVariantRelationReferrer, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationReferrer The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> insertOpLambda, WOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> updateOpLambda) {
        doInsertOrUpdate(whiteVariantRelationReferrer, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationReferrer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        doDelete(whiteVariantRelationReferrer, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, WOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doBatchInsert(whiteVariantRelationReferrerList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, WOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doBatchUpdate(whiteVariantRelationReferrerList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, WOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doBatchDelete(whiteVariantRelationReferrerList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> manyArgLambda, WOptionCall<WhiteVariantRelationReferrerCB, InsertOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationReferrer, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, CBCall<WhiteVariantRelationReferrerCB> cbLambda, WOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationReferrer, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationReferrer, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb, WOptionCall<WhiteVariantRelationReferrerCB, UpdateOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationReferrer, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteVariantRelationReferrerCB> cbLambda, WOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationReferrerCB cb, WOptionCall<WhiteVariantRelationReferrerCB, DeleteOption<WhiteVariantRelationReferrerCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationReferrerBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteVariantRelationReferrerBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationReferrer> typeOfSelectedEntity() { return WhiteVariantRelationReferrer.class; }
    protected Class<WhiteVariantRelationReferrer> typeOfHandlingEntity() { return WhiteVariantRelationReferrer.class; }
    protected Class<WhiteVariantRelationReferrerCB> typeOfHandlingConditionBean() { return WhiteVariantRelationReferrerCB.class; }
}
