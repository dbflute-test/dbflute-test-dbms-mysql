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
 * The behavior of WHITE_VARIANT_RELATION_MASTER_FOO as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_FOO_ID
 *
 * [column]
 *     MASTER_FOO_ID, MASTER_FOO_NAME
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
 *     WHITE_VARIANT_RELATION_REFERRER(AsBizOneToOneForBizManyToOne), white_variant_relation_local_pk_referrer(AsOne)
 *
 * [referrer table]
 *     white_variant_relation_referrer, white_variant_relation_local_pk_referrer
 *
 * [foreign property]
 *     whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne, whiteVariantRelationLocalPkReferrerAsOne
 *
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterFooBhv extends AbstractBehaviorWritable<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteVariantRelationMasterFooDbm getDBMeta() { return WhiteVariantRelationMasterFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationMasterFooCB newConditionBean() { return new WhiteVariantRelationMasterFooCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterFooCB cb) {
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
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteVariantRelationMasterFoo&gt; entity = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteVariantRelationMasterFoo -&gt; {
     *     ...
     * });
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteVariantRelationMasterFoo -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationMasterFoo> selectEntity(CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteVariantRelationMasterFoo&gt; entity = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteVariantRelationMasterFoo -&gt; {
     *     ...
     * });
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteVariantRelationMasterFoo -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationMasterFoo> selectEntity(WhiteVariantRelationMasterFooCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteVariantRelationMasterFoo> facadeSelectEntity(WhiteVariantRelationMasterFooCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationMasterFooCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterFoo selectEntityWithDeletedCheck(CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterFoo selectEntityWithDeletedCheck(WhiteVariantRelationMasterFooCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param masterFooId : PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteVariantRelationMasterFoo> selectByPK(Long masterFooId) {
        return facadeSelectByPK(masterFooId);
    }

    protected OptionalEntity<WhiteVariantRelationMasterFoo> facadeSelectByPK(Long masterFooId) {
        return doSelectOptionalByPK(masterFooId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> ENTITY doSelectByPK(Long masterFooId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(masterFooId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long masterFooId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(masterFooId, tp), masterFooId);
    }

    protected WhiteVariantRelationMasterFooCB xprepareCBAsPK(Long masterFooId) {
        assertObjectNotNull("masterFooId", masterFooId);
        return newConditionBean().acceptPK(masterFooId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterFoo&gt; whiteVariantRelationMasterFooList = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : whiteVariantRelationMasterFooList) {
     *     ... = whiteVariantRelationMasterFoo.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterFoo> selectList(CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterFoo&gt; whiteVariantRelationMasterFooList = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : whiteVariantRelationMasterFooList) {
     *     ... = whiteVariantRelationMasterFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterFoo> selectList(WhiteVariantRelationMasterFooCB cb) {
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
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterFoo&gt; page = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : page) {
     *     ... = whiteVariantRelationMasterFoo.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterFoo> selectPage(CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterFoo&gt; page = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : page) {
     *     ... = whiteVariantRelationMasterFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterFoo> selectPage(WhiteVariantRelationMasterFooCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterFoo&gt;() {
     *     public void handle(WhiteVariantRelationMasterFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param entityLambda The handler of entity row of WhiteVariantRelationMasterFoo. (NotNull)
     */
    public void selectCursor(CBCall<WhiteVariantRelationMasterFooCB> cbLambda, EntityRowHandler<WhiteVariantRelationMasterFoo> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterFoo&gt;() {
     *     public void handle(WhiteVariantRelationMasterFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterFoo. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterFooCB cb, EntityRowHandler<WhiteVariantRelationMasterFoo> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationMasterFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteVariantRelationMasterFooList The entity list of whiteVariantRelationMasterFoo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationMasterFoo> loaderLambda) {
        xassLRArg(whiteVariantRelationMasterFooList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationMasterFoo().ready(whiteVariantRelationMasterFooList, _behaviorSelector));
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
     * @param whiteVariantRelationMasterFoo The entity of whiteVariantRelationMasterFoo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationMasterFoo> loaderLambda) {
        xassLRArg(whiteVariantRelationMasterFoo, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteVariantRelationMasterFoo().ready(xnewLRAryLs(whiteVariantRelationMasterFoo), _behaviorSelector));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerAsVariantList by the set-upper of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterFooList, referrerCB -&gt; {
     *     referrerCB.setupSelect...();
     *     referrerCB.query().setFoo...(value);
     *     referrerCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : whiteVariantRelationMasterFooList) {
     *     ... = whiteVariantRelationMasterFoo.<span style="color: #DD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterFooList The entity list of whiteVariantRelationMasterFoo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> refCBLambda) {
        xassLRArg(whiteVariantRelationMasterFooList, refCBLambda);
        return doLoadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterFooList, new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerAsVariantList by the set-upper of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterFooList, referrerCB -&gt; {
     *     referrerCB.setupSelect...();
     *     referrerCB.query().setFoo...(value);
     *     referrerCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteVariantRelationMasterFoo.<span style="color: #DD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of whiteVariantRelationMasterFoo. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> refCBLambda) {
        xassLRArg(whiteVariantRelationMasterFoo, refCBLambda);
        return doLoadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterFoo), new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteVariantRelationMasterFoo The entity of whiteVariantRelationMasterFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterFoo, loadReferrerOption);
        return loadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterFoo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteVariantRelationMasterFooList The entity list of whiteVariantRelationMasterFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterFooList, loadReferrerOption);
        if (whiteVariantRelationMasterFooList.isEmpty()) { return (NestedReferrerListGateway<WhiteVariantRelationReferrer>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterFooList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteVariantRelationReferrer> doLoadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> option) {
        return helpLoadReferrerInternally(whiteVariantRelationMasterFooList, option, "whiteVariantRelationReferrerAsVariantList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationReferrer'.
     * @param whiteVariantRelationMasterFooList The list of whiteVariantRelationMasterFoo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationReferrer> pulloutWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList)
    { return helpPulloutInternally(whiteVariantRelationMasterFooList, "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); }

    /**
     * Pull out the list of referrer-as-one table 'WhiteVariantRelationLocalPkReferrer'.
     * @param whiteVariantRelationMasterFooList The list of whiteVariantRelationMasterFoo. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationLocalPkReferrer> pulloutWhiteVariantRelationLocalPkReferrerAsOne(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList)
    { return helpPulloutInternally(whiteVariantRelationMasterFooList, "whiteVariantRelationLocalPkReferrerAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key masterFooId.
     * @param whiteVariantRelationMasterFooList The list of whiteVariantRelationMasterFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterFooIdList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList)
    { return helpExtractListInternally(whiteVariantRelationMasterFooList, "masterFooId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterFoo.setFoo...(value);
     * whiteVariantRelationMasterFoo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationMasterFoo);
     * ... = whiteVariantRelationMasterFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterFoo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doInsert(whiteVariantRelationMasterFoo, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * whiteVariantRelationMasterFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationMasterFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doUpdate(whiteVariantRelationMasterFoo, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationMasterFoo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doInsertOrUpdate(whiteVariantRelationMasterFoo, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * whiteVariantRelationMasterFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationMasterFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doDelete(whiteVariantRelationMasterFoo, null);
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
     *     WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     *     whiteVariantRelationMasterFoo.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterFoo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterFooList.add(whiteVariantRelationMasterFoo);
     * }
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationMasterFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        return doBatchInsert(whiteVariantRelationMasterFooList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     *     whiteVariantRelationMasterFoo.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterFoo.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterFoo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterFooList.add(whiteVariantRelationMasterFoo);
     * }
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterFooList);
     * </pre>
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        return doBatchUpdate(whiteVariantRelationMasterFooList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        return doBatchDelete(whiteVariantRelationMasterFooList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB&gt;() {
     *     public ConditionBean setup(WhiteVariantRelationMasterFoo entity, WhiteVariantRelationMasterFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setPK...(value);</span>
     * whiteVariantRelationMasterFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setVersionNo(value);</span>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationMasterFoo, cb);
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return doQueryUpdate(whiteVariantRelationMasterFoo, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setPK...(value);</span>
     * whiteVariantRelationMasterFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setVersionNo(value);</span>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationMasterFoo, cb);
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterFoo, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationMasterFoo, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteVariantRelationMasterFooCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationMasterFoo, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterFooCB cb) {
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
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterFoo.setFoo...(value);
     * whiteVariantRelationMasterFoo.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterFooCB> option = new InsertOption<WhiteVariantRelationMasterFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationMasterFoo, option);
     * ... = whiteVariantRelationMasterFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WOptionCall<WhiteVariantRelationMasterFooCB, InsertOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        doInsert(whiteVariantRelationMasterFoo, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * whiteVariantRelationMasterFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterFooCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationMasterFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WOptionCall<WhiteVariantRelationMasterFooCB, UpdateOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        doUpdate(whiteVariantRelationMasterFoo, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterFoo The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WOptionCall<WhiteVariantRelationMasterFooCB, InsertOption<WhiteVariantRelationMasterFooCB>> insertOpLambda, WOptionCall<WhiteVariantRelationMasterFooCB, UpdateOption<WhiteVariantRelationMasterFooCB>> updateOpLambda) {
        doInsertOrUpdate(whiteVariantRelationMasterFoo, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterFoo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WOptionCall<WhiteVariantRelationMasterFooCB, DeleteOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        doDelete(whiteVariantRelationMasterFoo, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, WOptionCall<WhiteVariantRelationMasterFooCB, InsertOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doBatchInsert(whiteVariantRelationMasterFooList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, WOptionCall<WhiteVariantRelationMasterFooCB, UpdateOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doBatchUpdate(whiteVariantRelationMasterFooList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, WOptionCall<WhiteVariantRelationMasterFooCB, DeleteOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doBatchDelete(whiteVariantRelationMasterFooList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> manyArgLambda, WOptionCall<WhiteVariantRelationMasterFooCB, InsertOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setPK...(value);</span>
     * whiteVariantRelationMasterFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setVersionNo(value);</span>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterFoo, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, CBCall<WhiteVariantRelationMasterFooCB> cbLambda, WOptionCall<WhiteVariantRelationMasterFooCB, UpdateOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationMasterFoo, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setPK...(value);</span>
     * whiteVariantRelationMasterFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setVersionNo(value);</span>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterFoo, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB cb, WOptionCall<WhiteVariantRelationMasterFooCB, UpdateOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doQueryUpdate(whiteVariantRelationMasterFoo, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteVariantRelationMasterFooCB> cbLambda, WOptionCall<WhiteVariantRelationMasterFooCB, DeleteOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterFooCB cb, WOptionCall<WhiteVariantRelationMasterFooCB, DeleteOption<WhiteVariantRelationMasterFooCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteVariantRelationMasterFooBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteVariantRelationMasterFooBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteVariantRelationMasterFooBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteVariantRelationMasterFooBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteVariantRelationMasterFooBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteVariantRelationMasterFooBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteVariantRelationMasterFooBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteVariantRelationMasterFooBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteVariantRelationMasterFooBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteVariantRelationMasterFooBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteVariantRelationMasterFooBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteVariantRelationMasterFooBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteVariantRelationMasterFooBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteVariantRelationMasterFooBhv.outideSql().removeBlockComment().selectList()
     * whiteVariantRelationMasterFooBhv.outideSql().removeLineComment().selectList()
     * whiteVariantRelationMasterFooBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterFooBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteVariantRelationMasterFooBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationMasterFoo> typeOfSelectedEntity() { return WhiteVariantRelationMasterFoo.class; }
    protected Class<WhiteVariantRelationMasterFoo> typeOfHandlingEntity() { return WhiteVariantRelationMasterFoo.class; }
    protected Class<WhiteVariantRelationMasterFooCB> typeOfHandlingConditionBean() { return WhiteVariantRelationMasterFooCB.class; }
}
