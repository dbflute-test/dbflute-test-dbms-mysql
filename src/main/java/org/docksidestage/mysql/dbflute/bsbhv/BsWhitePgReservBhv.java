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
 * The behavior of WHITE_PG_RESERV as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLASS
 *
 * [column]
 *     CLASS, CASE, PACKAGE, DEFAULT, NEW, NATIVE, VOID, PUBLIC, PROTECTED, PRIVATE, INTERFACE, ABSTRACT, FINAL, FINALLY, RETURN, DOUBLE, FLOAT, SHORT, TYPE, RESERV_NAME
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
 *     white_pg_reserv_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePgReservRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservBhv extends AbstractBehaviorWritable<WhitePgReserv, WhitePgReservCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePgReservDbm getDBMeta() { return WhitePgReservDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePgReservCB newConditionBean() { return new WhitePgReservCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * int count = whitePgReservBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhitePgReservCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * int count = whitePgReservBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePgReservCB cb) {
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhitePgReserv&gt; entity = whitePgReservBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whitePgReserv -&gt; {
     *     ...
     * });
     * WhitePgReserv whitePgReserv = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whitePgReserv -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhitePgReserv whitePgReserv = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePgReserv> selectEntity(CBCall<WhitePgReservCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhitePgReserv&gt; entity = whitePgReservBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whitePgReserv -&gt; {
     *     ...
     * });
     * WhitePgReserv whitePgReserv = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whitePgReserv -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhitePgReserv whitePgReserv = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePgReserv> selectEntity(WhitePgReservCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhitePgReserv> facadeSelectEntity(WhitePgReservCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePgReservCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * WhitePgReserv whitePgReserv = whitePgReservBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePgReserv.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectEntityWithDeletedCheck(CBCall<WhitePgReservCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * WhitePgReserv whitePgReserv = whitePgReservBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePgReserv.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectEntityWithDeletedCheck(WhitePgReservCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param classSynonym ((using DBFlute synonym)): PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhitePgReserv> selectByPK(Integer classSynonym) {
        return facadeSelectByPK(classSynonym);
    }

    protected OptionalEntity<WhitePgReserv> facadeSelectByPK(Integer classSynonym) {
        return doSelectOptionalByPK(classSynonym, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectByPK(Integer classSynonym, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(classSynonym), tp);
    }

    protected <ENTITY extends WhitePgReserv> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer classSynonym, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(classSynonym, tp), classSynonym);
    }

    protected WhitePgReservCB xprepareCBAsPK(Integer classSynonym) {
        assertObjectNotNull("classSynonym", classSynonym);
        return newConditionBean().acceptPK(classSynonym);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePgReserv&gt; whitePgReservList = whitePgReservBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePgReserv> selectList(CBCall<WhitePgReservCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePgReserv&gt; whitePgReservList = whitePgReservBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePgReserv> selectList(WhitePgReservCB cb) {
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePgReserv&gt; page = whitePgReservBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePgReserv whitePgReserv : page) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePgReserv> selectPage(CBCall<WhitePgReservCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePgReserv&gt; page = whitePgReservBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePgReserv whitePgReserv : page) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePgReserv> selectPage(WhitePgReservCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePgReserv&gt;() {
     *     public void handle(WhitePgReserv entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @param entityLambda The handler of entity row of WhitePgReserv. (NotNull)
     */
    public void selectCursor(CBCall<WhitePgReservCB> cbLambda, EntityRowHandler<WhitePgReserv> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePgReserv&gt;() {
     *     public void handle(WhitePgReserv entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePgReserv. (NotNull)
     */
    public void selectCursor(WhitePgReservCB cb, EntityRowHandler<WhitePgReserv> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePgReservCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePgReserv> whitePgReservList, ReferrerLoaderHandler<LoaderOfWhitePgReserv> loaderLambda) {
        xassLRArg(whitePgReservList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePgReserv().ready(whitePgReservList, _behaviorSelector));
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
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePgReserv whitePgReserv, ReferrerLoaderHandler<LoaderOfWhitePgReserv> loaderLambda) {
        xassLRArg(whitePgReserv, loaderLambda);
        loaderLambda.handle(new LoaderOfWhitePgReserv().ready(xnewLRAryLs(whitePgReserv), _behaviorSelector));
    }

    /**
     * Load referrer of whitePgReservRefList by the set-upper of referrer. <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">loadWhitePgReservRefList</span>(whitePgReservList, refCB -&gt; {
     *     refCB.setupSelect...();
     *     refCB.query().setFoo...(value);
     *     refCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.<span style="color: #DD4747">getWhitePgReservRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassSynonym_InScope(pkList);
     * cb.query().addOrderBy_ClassSynonym_Asc();
     * </pre>
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, ConditionBeanSetupper<WhitePgReservRefCB> refCBLambda) {
        xassLRArg(whitePgReservList, refCBLambda);
        return doLoadWhitePgReservRefList(whitePgReservList, new LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whitePgReservRefList by the set-upper of referrer. <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">loadWhitePgReservRefList</span>(whitePgReservList, refCB -&gt; {
     *     refCB.setupSelect...();
     *     refCB.query().setFoo...(value);
     *     refCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whitePgReserv.<span style="color: #DD4747">getWhitePgReservRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassSynonym_InScope(pkList);
     * cb.query().addOrderBy_ClassSynonym_Asc();
     * </pre>
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(WhitePgReserv whitePgReserv, ConditionBeanSetupper<WhitePgReservRefCB> refCBLambda) {
        xassLRArg(whitePgReserv, refCBLambda);
        return doLoadWhitePgReservRefList(xnewLRLs(whitePgReserv), new LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(WhitePgReserv whitePgReserv, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> loadReferrerOption) {
        xassLRArg(whitePgReserv, loadReferrerOption);
        return loadWhitePgReservRefList(xnewLRLs(whitePgReserv), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> loadReferrerOption) {
        xassLRArg(whitePgReservList, loadReferrerOption);
        if (whitePgReservList.isEmpty()) { return (NestedReferrerListGateway<WhitePgReservRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePgReservRefList(whitePgReservList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePgReservRef> doLoadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> option) {
        return helpLoadReferrerInternally(whitePgReservList, option, "whitePgReservRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key classSynonym.
     * @param whitePgReservList The list of whitePgReserv. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractClassSynonymList(List<WhitePgReserv> whitePgReservList)
    { return helpExtractListInternally(whitePgReservList, "classSynonym"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReserv.setFoo...(value);
     * whitePgReserv.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * whitePgReservBhv.<span style="color: #DD4747">insert</span>(whitePgReserv);
     * ... = whitePgReserv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePgReserv The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePgReserv whitePgReserv) {
        doInsert(whitePgReserv, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReserv.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservBhv.<span style="color: #DD4747">update</span>(whitePgReserv);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePgReserv whitePgReserv) {
        doUpdate(whitePgReserv, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePgReserv The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePgReserv whitePgReserv) {
        doInsertOrUpdate(whitePgReserv, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReserv.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservBhv.<span style="color: #DD4747">delete</span>(whitePgReserv);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePgReserv whitePgReserv) {
        doDelete(whitePgReserv, null);
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
     *     WhitePgReserv whitePgReserv = new WhitePgReserv();
     *     whitePgReserv.setFooName("foo");
     *     if (...) {
     *         whitePgReserv.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePgReservList.add(whitePgReserv);
     * }
     * whitePgReservBhv.<span style="color: #DD4747">batchInsert</span>(whitePgReservList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePgReserv> whitePgReservList) {
        return doBatchInsert(whitePgReservList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePgReserv whitePgReserv = new WhitePgReserv();
     *     whitePgReserv.setFooName("foo");
     *     if (...) {
     *         whitePgReserv.setFooPrice(123);
     *     } else {
     *         whitePgReserv.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePgReserv.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePgReservList.add(whitePgReserv);
     * }
     * whitePgReservBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservList);
     * </pre>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReserv> whitePgReservList) {
        return doBatchUpdate(whitePgReservList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePgReserv> whitePgReservList) {
        return doBatchDelete(whitePgReservList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePgReserv, WhitePgReservCB&gt;() {
     *     public ConditionBean setup(WhitePgReserv entity, WhitePgReservCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">queryUpdate</span>(whitePgReserv, cb);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePgReserv whitePgReserv, CBCall<WhitePgReservCB> cbLambda) {
        return doQueryUpdate(whitePgReserv, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">queryUpdate</span>(whitePgReserv, cb);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb) {
        return doQueryUpdate(whitePgReserv, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">queryDelete</span>(whitePgReserv, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhitePgReservCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">queryDelete</span>(whitePgReserv, cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePgReservCB cb) {
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReserv.setFoo...(value);
     * whitePgReserv.setBar...(value);
     * InsertOption<WhitePgReservCB> option = new InsertOption<WhitePgReservCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePgReservBhv.<span style="color: #DD4747">varyingInsert</span>(whitePgReserv, option);
     * ... = whitePgReserv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePgReserv The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePgReserv whitePgReserv, WOptionCall<WhitePgReservCB, InsertOption<WhitePgReservCB>> opLambda) {
        doInsert(whitePgReserv, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReserv.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *         public void specify(WhitePgReservCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePgReservBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePgReserv, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePgReserv whitePgReserv, WOptionCall<WhitePgReservCB, UpdateOption<WhitePgReservCB>> opLambda) {
        doUpdate(whitePgReserv, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePgReserv The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePgReserv whitePgReserv, WOptionCall<WhitePgReservCB, InsertOption<WhitePgReservCB>> insertOpLambda, WOptionCall<WhitePgReservCB, UpdateOption<WhitePgReservCB>> updateOpLambda) {
        doInsertOrUpdate(whitePgReserv, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePgReserv The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePgReserv whitePgReserv, WOptionCall<WhitePgReservCB, DeleteOption<WhitePgReservCB>> opLambda) {
        doDelete(whitePgReserv, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePgReserv> whitePgReservList, WOptionCall<WhitePgReservCB, InsertOption<WhitePgReservCB>> opLambda) {
        return doBatchInsert(whitePgReservList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePgReserv> whitePgReservList, WOptionCall<WhitePgReservCB, UpdateOption<WhitePgReservCB>> opLambda) {
        return doBatchUpdate(whitePgReservList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePgReserv> whitePgReservList, WOptionCall<WhitePgReservCB, DeleteOption<WhitePgReservCB>> opLambda) {
        return doBatchDelete(whitePgReservList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> manyArgLambda, WOptionCall<WhitePgReservCB, InsertOption<WhitePgReservCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *     public void specify(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePgReservBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePgReserv, cb, option);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePgReserv whitePgReserv, CBCall<WhitePgReservCB> cbLambda, WOptionCall<WhitePgReservCB, UpdateOption<WhitePgReservCB>> opLambda) {
        return doQueryUpdate(whitePgReserv, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *     public void specify(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePgReservBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePgReserv, cb, option);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb, WOptionCall<WhitePgReservCB, UpdateOption<WhitePgReservCB>> opLambda) {
        return doQueryUpdate(whitePgReserv, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhitePgReserv. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhitePgReservCB> cbLambda, WOptionCall<WhitePgReservCB, DeleteOption<WhitePgReservCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePgReservCB cb, WOptionCall<WhitePgReservCB, DeleteOption<WhitePgReservCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whitePgReservBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whitePgReservBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePgReservBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whitePgReservBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whitePgReservBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whitePgReservBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whitePgReservBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whitePgReservBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whitePgReservBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whitePgReservBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whitePgReservBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whitePgReservBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whitePgReservBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whitePgReservBhv.outideSql().removeBlockComment().selectList()
     * whitePgReservBhv.outideSql().removeLineComment().selectList()
     * whitePgReservBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePgReservBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePgReservBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePgReserv> typeOfSelectedEntity() { return WhitePgReserv.class; }
    protected Class<WhitePgReserv> typeOfHandlingEntity() { return WhitePgReserv.class; }
    protected Class<WhitePgReservCB> typeOfHandlingConditionBean() { return WhitePgReservCB.class; }
}
