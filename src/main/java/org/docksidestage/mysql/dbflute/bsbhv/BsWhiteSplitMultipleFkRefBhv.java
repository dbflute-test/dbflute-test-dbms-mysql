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
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     FIRST_ID, SECOND_CODE
 *
 * [column]
 *     FIRST_ID, SECOND_CODE, REF_NAME
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
public abstract class BsWhiteSplitMultipleFkRefBhv extends AbstractBehaviorWritable<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSplitMultipleFkRefDbm getDBMeta() { return WhiteSplitMultipleFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSplitMultipleFkRefCB newConditionBean() { return new WhiteSplitMultipleFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkRefCB cb) {
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
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteSplitMultipleFkRef&gt; entity = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteSplitMultipleFkRef -&gt; {
     *     ...
     * });
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteSplitMultipleFkRef -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSplitMultipleFkRef> selectEntity(CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteSplitMultipleFkRef&gt; entity = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteSplitMultipleFkRef -&gt; {
     *     ...
     * });
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteSplitMultipleFkRef -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSplitMultipleFkRef> selectEntity(WhiteSplitMultipleFkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteSplitMultipleFkRef> facadeSelectEntity(WhiteSplitMultipleFkRefCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSplitMultipleFkRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkRef selectEntityWithDeletedCheck(CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkRef selectEntityWithDeletedCheck(WhiteSplitMultipleFkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param firstId : PK, NotNull, INT(10). (NotNull)
     * @param secondCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSplitMultipleFkRef> selectByPK(Integer firstId, String secondCode) {
        return facadeSelectByPK(firstId, secondCode);
    }

    protected OptionalEntity<WhiteSplitMultipleFkRef> facadeSelectByPK(Integer firstId, String secondCode) {
        return doSelectOptionalByPK(firstId, secondCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> ENTITY doSelectByPK(Integer firstId, String secondCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(firstId, secondCode), tp);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer firstId, String secondCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(firstId, secondCode, tp), firstId, secondCode);
    }

    protected WhiteSplitMultipleFkRefCB xprepareCBAsPK(Integer firstId, String secondCode) {
        assertObjectNotNull("firstId", firstId);assertObjectNotNull("secondCode", secondCode);
        return newConditionBean().acceptPK(firstId, secondCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkRef&gt; whiteSplitMultipleFkRefList = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkRef whiteSplitMultipleFkRef : whiteSplitMultipleFkRefList) {
     *     ... = whiteSplitMultipleFkRef.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkRef> selectList(CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkRef&gt; whiteSplitMultipleFkRefList = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkRef whiteSplitMultipleFkRef : whiteSplitMultipleFkRefList) {
     *     ... = whiteSplitMultipleFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkRef> selectList(WhiteSplitMultipleFkRefCB cb) {
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
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkRef&gt; page = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkRef whiteSplitMultipleFkRef : page) {
     *     ... = whiteSplitMultipleFkRef.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkRef> selectPage(CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkRef&gt; page = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkRef whiteSplitMultipleFkRef : page) {
     *     ... = whiteSplitMultipleFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkRef> selectPage(WhiteSplitMultipleFkRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkRef&gt;() {
     *     public void handle(WhiteSplitMultipleFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param entityLambda The handler of entity row of WhiteSplitMultipleFkRef. (NotNull)
     */
    public void selectCursor(CBCall<WhiteSplitMultipleFkRefCB> cbLambda, EntityRowHandler<WhiteSplitMultipleFkRef> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkRef&gt;() {
     *     public void handle(WhiteSplitMultipleFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkRef. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkRefCB cb, EntityRowHandler<WhiteSplitMultipleFkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSplitMultipleFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSplitMultipleFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteSplitMultipleFkRefList The entity list of whiteSplitMultipleFkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkRef> loaderLambda) {
        xassLRArg(whiteSplitMultipleFkRefList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSplitMultipleFkRef().ready(whiteSplitMultipleFkRefList, _behaviorSelector));
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
     * @param whiteSplitMultipleFkRef The entity of whiteSplitMultipleFkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkRef> loaderLambda) {
        xassLRArg(whiteSplitMultipleFkRef, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteSplitMultipleFkRef().ready(xnewLRAryLs(whiteSplitMultipleFkRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkRef.setFoo...(value);
     * whiteSplitMultipleFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">insert</span>(whiteSplitMultipleFkRef);
     * ... = whiteSplitMultipleFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doInsert(whiteSplitMultipleFkRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * whiteSplitMultipleFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">update</span>(whiteSplitMultipleFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doUpdate(whiteSplitMultipleFkRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSplitMultipleFkRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doInsertOrUpdate(whiteSplitMultipleFkRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * whiteSplitMultipleFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">delete</span>(whiteSplitMultipleFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doDelete(whiteSplitMultipleFkRef, null);
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
     *     WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     *     whiteSplitMultipleFkRef.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkRefList.add(whiteSplitMultipleFkRef);
     * }
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteSplitMultipleFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList) {
        return doBatchInsert(whiteSplitMultipleFkRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     *     whiteSplitMultipleFkRef.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkRef.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkRefList.add(whiteSplitMultipleFkRef);
     * }
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkRefList);
     * </pre>
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList) {
        return doBatchUpdate(whiteSplitMultipleFkRefList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList) {
        return doBatchDelete(whiteSplitMultipleFkRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB&gt;() {
     *     public ConditionBean setup(WhiteSplitMultipleFkRef entity, WhiteSplitMultipleFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setPK...(value);</span>
     * whiteSplitMultipleFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setVersionNo(value);</span>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkRef, cb);
     * </pre>
     * @param whiteSplitMultipleFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return doQueryUpdate(whiteSplitMultipleFkRef, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setPK...(value);</span>
     * whiteSplitMultipleFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setVersionNo(value);</span>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkRef, cb);
     * </pre>
     * @param whiteSplitMultipleFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkRef, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteSplitMultipleFkRefCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkRefCB cb) {
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
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkRef.setFoo...(value);
     * whiteSplitMultipleFkRef.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkRefCB> option = new InsertOption<WhiteSplitMultipleFkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSplitMultipleFkRef, option);
     * ... = whiteSplitMultipleFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WOptionCall<WhiteSplitMultipleFkRefCB, InsertOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        doInsert(whiteSplitMultipleFkRef, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * whiteSplitMultipleFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSplitMultipleFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WOptionCall<WhiteSplitMultipleFkRefCB, UpdateOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        doUpdate(whiteSplitMultipleFkRef, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkRef The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WOptionCall<WhiteSplitMultipleFkRefCB, InsertOption<WhiteSplitMultipleFkRefCB>> insertOpLambda, WOptionCall<WhiteSplitMultipleFkRefCB, UpdateOption<WhiteSplitMultipleFkRefCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSplitMultipleFkRef, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WOptionCall<WhiteSplitMultipleFkRefCB, DeleteOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        doDelete(whiteSplitMultipleFkRef, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, WOptionCall<WhiteSplitMultipleFkRefCB, InsertOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doBatchInsert(whiteSplitMultipleFkRefList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, WOptionCall<WhiteSplitMultipleFkRefCB, UpdateOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doBatchUpdate(whiteSplitMultipleFkRefList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, WOptionCall<WhiteSplitMultipleFkRefCB, DeleteOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doBatchDelete(whiteSplitMultipleFkRefList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> manyArgLambda, WOptionCall<WhiteSplitMultipleFkRefCB, InsertOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setPK...(value);</span>
     * whiteSplitMultipleFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setVersionNo(value);</span>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkRef, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, CBCall<WhiteSplitMultipleFkRefCB> cbLambda, WOptionCall<WhiteSplitMultipleFkRefCB, UpdateOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doQueryUpdate(whiteSplitMultipleFkRef, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setPK...(value);</span>
     * whiteSplitMultipleFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setVersionNo(value);</span>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkRef, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB cb, WOptionCall<WhiteSplitMultipleFkRefCB, UpdateOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doQueryUpdate(whiteSplitMultipleFkRef, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteSplitMultipleFkRefCB> cbLambda, WOptionCall<WhiteSplitMultipleFkRefCB, DeleteOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkRefCB cb, WOptionCall<WhiteSplitMultipleFkRefCB, DeleteOption<WhiteSplitMultipleFkRefCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSplitMultipleFkRefBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSplitMultipleFkRefBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSplitMultipleFkRefBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSplitMultipleFkRefBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSplitMultipleFkRefBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSplitMultipleFkRefBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSplitMultipleFkRefBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSplitMultipleFkRefBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSplitMultipleFkRefBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSplitMultipleFkRefBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSplitMultipleFkRefBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSplitMultipleFkRefBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSplitMultipleFkRefBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSplitMultipleFkRefBhv.outideSql().removeBlockComment().selectList()
     * whiteSplitMultipleFkRefBhv.outideSql().removeLineComment().selectList()
     * whiteSplitMultipleFkRefBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkRefBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSplitMultipleFkRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSplitMultipleFkRef> typeOfSelectedEntity() { return WhiteSplitMultipleFkRef.class; }
    protected Class<WhiteSplitMultipleFkRef> typeOfHandlingEntity() { return WhiteSplitMultipleFkRef.class; }
    protected Class<WhiteSplitMultipleFkRefCB> typeOfHandlingConditionBean() { return WhiteSplitMultipleFkRefCB.class; }
}
