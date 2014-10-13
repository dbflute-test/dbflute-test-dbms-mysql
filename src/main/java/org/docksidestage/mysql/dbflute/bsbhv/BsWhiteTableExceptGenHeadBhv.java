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
 * The behavior of WHITE_TABLE_EXCEPT_GEN_HEAD as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_HEAD_ID
 *
 * [column]
 *     GEN_HEAD_ID, GEN_HEAD_NAME, NOMETA_ID
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
public abstract class BsWhiteTableExceptGenHeadBhv extends AbstractBehaviorWritable<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteTableExceptGenHeadDbm getDBMeta() { return WhiteTableExceptGenHeadDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteTableExceptGenHeadCB newConditionBean() { return new WhiteTableExceptGenHeadCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * int count = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * int count = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteTableExceptGenHeadCB cb) {
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteTableExceptGenHead&gt; entity = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteTableExceptGenHead -&gt; {
     *     ...
     * });
     * WhiteTableExceptGenHead whiteTableExceptGenHead = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteTableExceptGenHead -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteTableExceptGenHead> selectEntity(CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteTableExceptGenHead&gt; entity = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteTableExceptGenHead -&gt; {
     *     ...
     * });
     * WhiteTableExceptGenHead whiteTableExceptGenHead = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteTableExceptGenHead -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteTableExceptGenHead> selectEntity(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteTableExceptGenHead> facadeSelectEntity(WhiteTableExceptGenHeadCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteTableExceptGenHead> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteTableExceptGenHeadCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenHead whiteTableExceptGenHead = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteTableExceptGenHead.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectEntityWithDeletedCheck(CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenHead whiteTableExceptGenHead = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteTableExceptGenHead.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectEntityWithDeletedCheck(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param genHeadId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteTableExceptGenHead> selectByPK(Long genHeadId) {
        return facadeSelectByPK(genHeadId);
    }

    protected OptionalEntity<WhiteTableExceptGenHead> facadeSelectByPK(Long genHeadId) {
        return doSelectOptionalByPK(genHeadId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectByPK(Long genHeadId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(genHeadId), tp);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> OptionalEntity<ENTITY> doSelectOptionalByPK(Long genHeadId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(genHeadId, tp), genHeadId);
    }

    protected WhiteTableExceptGenHeadCB xprepareCBAsPK(Long genHeadId) {
        assertObjectNotNull("genHeadId", genHeadId);
        return newConditionBean().acceptPK(genHeadId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteTableExceptGenHead&gt; whiteTableExceptGenHeadList = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : whiteTableExceptGenHeadList) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteTableExceptGenHead> selectList(CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteTableExceptGenHead&gt; whiteTableExceptGenHeadList = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : whiteTableExceptGenHeadList) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteTableExceptGenHead> selectList(WhiteTableExceptGenHeadCB cb) {
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteTableExceptGenHead&gt; page = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : page) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteTableExceptGenHead> selectPage(CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteTableExceptGenHead&gt; page = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : page) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteTableExceptGenHead> selectPage(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteTableExceptGenHead&gt;() {
     *     public void handle(WhiteTableExceptGenHead entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param entityLambda The handler of entity row of WhiteTableExceptGenHead. (NotNull)
     */
    public void selectCursor(CBCall<WhiteTableExceptGenHeadCB> cbLambda, EntityRowHandler<WhiteTableExceptGenHead> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteTableExceptGenHead&gt;() {
     *     public void handle(WhiteTableExceptGenHead entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteTableExceptGenHead. (NotNull)
     */
    public void selectCursor(WhiteTableExceptGenHeadCB cb, EntityRowHandler<WhiteTableExceptGenHead> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteTableExceptGenHeadCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteTableExceptGenHeadList The entity list of whiteTableExceptGenHead. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, ReferrerLoaderHandler<LoaderOfWhiteTableExceptGenHead> loaderLambda) {
        xassLRArg(whiteTableExceptGenHeadList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteTableExceptGenHead().ready(whiteTableExceptGenHeadList, _behaviorSelector));
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
     * @param whiteTableExceptGenHead The entity of whiteTableExceptGenHead. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteTableExceptGenHead whiteTableExceptGenHead, ReferrerLoaderHandler<LoaderOfWhiteTableExceptGenHead> loaderLambda) {
        xassLRArg(whiteTableExceptGenHead, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteTableExceptGenHead().ready(xnewLRAryLs(whiteTableExceptGenHead), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key genHeadId.
     * @param whiteTableExceptGenHeadList The list of whiteTableExceptGenHead. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenHeadIdList(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList)
    { return helpExtractListInternally(whiteTableExceptGenHeadList, "genHeadId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenHead.setFoo...(value);
     * whiteTableExceptGenHead.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">insert</span>(whiteTableExceptGenHead);
     * ... = whiteTableExceptGenHead.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteTableExceptGenHead The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doInsert(whiteTableExceptGenHead, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">update</span>(whiteTableExceptGenHead);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doUpdate(whiteTableExceptGenHead, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteTableExceptGenHead The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doInsertOrUpdate(whiteTableExceptGenHead, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">delete</span>(whiteTableExceptGenHead);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doDelete(whiteTableExceptGenHead, null);
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
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     *     whiteTableExceptGenHead.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenHead.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteTableExceptGenHeadList.add(whiteTableExceptGenHead);
     * }
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchInsert</span>(whiteTableExceptGenHeadList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchInsert(whiteTableExceptGenHeadList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     *     whiteTableExceptGenHead.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenHead.setFooPrice(123);
     *     } else {
     *         whiteTableExceptGenHead.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteTableExceptGenHead.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteTableExceptGenHeadList.add(whiteTableExceptGenHead);
     * }
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList);
     * </pre>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchUpdate(whiteTableExceptGenHeadList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchDelete(whiteTableExceptGenHeadList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB&gt;() {
     *     public ConditionBean setup(WhiteTableExceptGenHead entity, WhiteTableExceptGenHeadCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryUpdate</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return doQueryUpdate(whiteTableExceptGenHead, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryUpdate</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb) {
        return doQueryUpdate(whiteTableExceptGenHead, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryDelete</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteTableExceptGenHeadCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryDelete</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteTableExceptGenHeadCB cb) {
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenHead.setFoo...(value);
     * whiteTableExceptGenHead.setBar...(value);
     * InsertOption<WhiteTableExceptGenHeadCB> option = new InsertOption<WhiteTableExceptGenHeadCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingInsert</span>(whiteTableExceptGenHead, option);
     * ... = whiteTableExceptGenHead.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteTableExceptGenHead The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteTableExceptGenHead whiteTableExceptGenHead, WOptionCall<WhiteTableExceptGenHeadCB, InsertOption<WhiteTableExceptGenHeadCB>> opLambda) {
        doInsert(whiteTableExceptGenHead, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *         public void specify(WhiteTableExceptGenHeadCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteTableExceptGenHead, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WOptionCall<WhiteTableExceptGenHeadCB, UpdateOption<WhiteTableExceptGenHeadCB>> opLambda) {
        doUpdate(whiteTableExceptGenHead, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteTableExceptGenHead The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WOptionCall<WhiteTableExceptGenHeadCB, InsertOption<WhiteTableExceptGenHeadCB>> insertOpLambda, WOptionCall<WhiteTableExceptGenHeadCB, UpdateOption<WhiteTableExceptGenHeadCB>> updateOpLambda) {
        doInsertOrUpdate(whiteTableExceptGenHead, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteTableExceptGenHead The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteTableExceptGenHead whiteTableExceptGenHead, WOptionCall<WhiteTableExceptGenHeadCB, DeleteOption<WhiteTableExceptGenHeadCB>> opLambda) {
        doDelete(whiteTableExceptGenHead, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, WOptionCall<WhiteTableExceptGenHeadCB, InsertOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doBatchInsert(whiteTableExceptGenHeadList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, WOptionCall<WhiteTableExceptGenHeadCB, UpdateOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doBatchUpdate(whiteTableExceptGenHeadList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, WOptionCall<WhiteTableExceptGenHeadCB, DeleteOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doBatchDelete(whiteTableExceptGenHeadList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> manyArgLambda, WOptionCall<WhiteTableExceptGenHeadCB, InsertOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteTableExceptGenHead, cb, option);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, CBCall<WhiteTableExceptGenHeadCB> cbLambda, WOptionCall<WhiteTableExceptGenHeadCB, UpdateOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doQueryUpdate(whiteTableExceptGenHead, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteTableExceptGenHead, cb, option);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb, WOptionCall<WhiteTableExceptGenHeadCB, UpdateOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doQueryUpdate(whiteTableExceptGenHead, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteTableExceptGenHeadCB> cbLambda, WOptionCall<WhiteTableExceptGenHeadCB, DeleteOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteTableExceptGenHeadCB cb, WOptionCall<WhiteTableExceptGenHeadCB, DeleteOption<WhiteTableExceptGenHeadCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteTableExceptGenHeadBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteTableExceptGenHeadBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteTableExceptGenHeadBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteTableExceptGenHeadBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteTableExceptGenHeadBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteTableExceptGenHeadBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteTableExceptGenHeadBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteTableExceptGenHeadBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteTableExceptGenHeadBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteTableExceptGenHeadBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteTableExceptGenHeadBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteTableExceptGenHeadBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteTableExceptGenHeadBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteTableExceptGenHeadBhv.outideSql().removeBlockComment().selectList()
     * whiteTableExceptGenHeadBhv.outideSql().removeLineComment().selectList()
     * whiteTableExceptGenHeadBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteTableExceptGenHeadBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteTableExceptGenHeadBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteTableExceptGenHead> typeOfSelectedEntity() { return WhiteTableExceptGenHead.class; }
    protected Class<WhiteTableExceptGenHead> typeOfHandlingEntity() { return WhiteTableExceptGenHead.class; }
    protected Class<WhiteTableExceptGenHeadCB> typeOfHandlingConditionBean() { return WhiteTableExceptGenHeadCB.class; }
}
