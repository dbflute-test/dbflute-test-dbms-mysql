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
 * The behavior of WHITE_COMPOUND_PK_REF_MANY as TABLE. <br />
 * <pre>
 * [primary key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 *
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, REF_MANY_CODE, REF_MANY_NAME, REF_MANY_DATETIME
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
 *     WHITE_COMPOUND_PK(ToPK)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPkToPK
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefManyBhv extends AbstractBehaviorWritable<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteCompoundPkRefManyDbm getDBMeta() { return WhiteCompoundPkRefManyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteCompoundPkRefManyCB newConditionBean() { return new WhiteCompoundPkRefManyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkRefManyCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(whiteCompoundPkRefMany -&gt; {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteCompoundPkRefMany.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(whiteCompoundPkRefMany -&gt; {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteCompoundPkRefMany.get...
     * }).<span style="color: #994747">orElse</span>(() -&gt; {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundPkRefMany> selectEntity(CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteCompoundPkRefMany -&gt; {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteCompoundPkRefMany.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteCompoundPkRefMany -&gt; {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteCompoundPkRefMany.get...
     * }).<span style="color: #994747">orElse</span>(() -&gt; {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundPkRefMany> selectEntity(WhiteCompoundPkRefManyCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteCompoundPkRefMany> facadeSelectEntity(WhiteCompoundPkRefManyCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteCompoundPkRefManyCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRefMany.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefMany selectEntityWithDeletedCheck(CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRefMany.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefMany selectEntityWithDeletedCheck(WhiteCompoundPkRefManyCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param multipleFirstId : PK, NotNull, INT(10). (NotNull)
     * @param multipleSecondId : PK, NotNull, INT(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteCompoundPkRefMany> selectByPK(Integer multipleFirstId, Integer multipleSecondId) {
        return facadeSelectByPK(multipleFirstId, multipleSecondId);
    }

    protected OptionalEntity<WhiteCompoundPkRefMany> facadeSelectByPK(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectOptionalByPK(multipleFirstId, multipleSecondId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> ENTITY doSelectByPK(Integer multipleFirstId, Integer multipleSecondId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(multipleFirstId, multipleSecondId), tp);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer multipleFirstId, Integer multipleSecondId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(multipleFirstId, multipleSecondId, tp), multipleFirstId, multipleSecondId);
    }

    protected WhiteCompoundPkRefManyCB xprepareCBAsPK(Integer multipleFirstId, Integer multipleSecondId) {
        assertObjectNotNull("multipleFirstId", multipleFirstId);assertObjectNotNull("multipleSecondId", multipleSecondId);
        return newConditionBean().acceptPK(multipleFirstId, multipleSecondId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteCompoundPkRefMany&gt; whiteCompoundPkRefManyList = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectList</span>(cb -&gt; {
     *     cb.query().set...;
     *     cb.query().addOrderBy...;
     * });
     * whiteCompoundPkRefManyList.forEach(whiteCompoundPkRefMany -&gt; {
     *     ... = whiteCompoundPkRefMany.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRefMany> selectList(CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundPkRefMany&gt; whiteCompoundPkRefManyList = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhiteCompoundPkRefMany whiteCompoundPkRefMany : whiteCompoundPkRefManyList) {
     *     ... = whiteCompoundPkRefMany.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRefMany> selectList(WhiteCompoundPkRefManyCB cb) {
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
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRefMany&gt; page = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPkRefMany whiteCompoundPkRefMany : page) {
     *     ... = whiteCompoundPkRefMany.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRefMany> selectPage(CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRefMany&gt; page = whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPkRefMany whiteCompoundPkRefMany : page) {
     *     ... = whiteCompoundPkRefMany.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRefMany> selectPage(WhiteCompoundPkRefManyCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPkRefMany&gt;() {
     *     public void handle(WhiteCompoundPkRefMany entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param entityLambda The handler of entity row of WhiteCompoundPkRefMany. (NotNull)
     */
    public void selectCursor(CBCall<WhiteCompoundPkRefManyCB> cbLambda, EntityRowHandler<WhiteCompoundPkRefMany> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPkRefMany&gt;() {
     *     public void handle(WhiteCompoundPkRefMany entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPkRefMany. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkRefManyCB cb, EntityRowHandler<WhiteCompoundPkRefMany> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkRefManyCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteCompoundPkRefManyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * memberBhv.<span style="color: #CC4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #CC4747">loadPurchaseList</span>(purchaseCB -&gt; {
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
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteCompoundPkRefManyList The entity list of whiteCompoundPkRefMany. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRefMany> loaderLambda) {
        xassLRArg(whiteCompoundPkRefManyList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteCompoundPkRefMany().ready(whiteCompoundPkRefManyList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #CC4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #CC4747">loadPurchaseList</span>(purchaseCB -&gt; {
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
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteCompoundPkRefMany The entity of whiteCompoundPkRefMany. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteCompoundPkRefMany whiteCompoundPkRefMany, ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRefMany> loaderLambda) {
        xassLRArg(whiteCompoundPkRefMany, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteCompoundPkRefMany().ready(xnewLRAryLs(whiteCompoundPkRefMany), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteCompoundPk'.
     * @param whiteCompoundPkRefManyList The list of whiteCompoundPkRefMany. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPk> pulloutWhiteCompoundPkToPK(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList)
    { return helpPulloutInternally(whiteCompoundPkRefManyList, "whiteCompoundPkToPK"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRefMany.setFoo...(value);
     * whiteCompoundPkRefMany.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">insert</span>(whiteCompoundPkRefMany);
     * ... = whiteCompoundPkRefMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPkRefMany The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doInsert(whiteCompoundPkRefMany, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * whiteCompoundPkRefMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRefMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRefMany.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefManyBhv.<span style="color: #CC4747">update</span>(whiteCompoundPkRefMany);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefMany The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doUpdate(whiteCompoundPkRefMany, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteCompoundPkRefMany The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doInsertOrUpdate(whiteCompoundPkRefMany, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * whiteCompoundPkRefMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRefMany.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefManyBhv.<span style="color: #CC4747">delete</span>(whiteCompoundPkRefMany);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefMany The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doDelete(whiteCompoundPkRefMany, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     *     whiteCompoundPkRefMany.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRefMany.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkRefManyList.add(whiteCompoundPkRefMany);
     * }
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">batchInsert</span>(whiteCompoundPkRefManyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        return doBatchInsert(whiteCompoundPkRefManyList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     *     whiteCompoundPkRefMany.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRefMany.setFooPrice(123);
     *     } else {
     *         whiteCompoundPkRefMany.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkRefManyList.add(whiteCompoundPkRefMany);
     * }
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">batchUpdate</span>(whiteCompoundPkRefManyList);
     * </pre>
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        return doBatchUpdate(whiteCompoundPkRefManyList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        return doBatchDelete(whiteCompoundPkRefManyList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB&gt;() {
     *     public ConditionBean setup(WhiteCompoundPkRefMany entity, WhiteCompoundPkRefManyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setPK...(value);</span>
     * whiteCompoundPkRefMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setVersionNo(value);</span>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">queryUpdate</span>(whiteCompoundPkRefMany, cb);
     * </pre>
     * @param whiteCompoundPkRefMany The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return doQueryUpdate(whiteCompoundPkRefMany, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setPK...(value);</span>
     * whiteCompoundPkRefMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setVersionNo(value);</span>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">queryUpdate</span>(whiteCompoundPkRefMany, cb);
     * </pre>
     * @param whiteCompoundPkRefMany The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WhiteCompoundPkRefManyCB cb) {
        return doQueryUpdate(whiteCompoundPkRefMany, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">queryDelete</span>(whiteCompoundPkRefMany, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteCompoundPkRefManyCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">queryDelete</span>(whiteCompoundPkRefMany, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkRefManyCB cb) {
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
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRefMany.setFoo...(value);
     * whiteCompoundPkRefMany.setBar...(value);
     * InsertOption<WhiteCompoundPkRefManyCB> option = new InsertOption<WhiteCompoundPkRefManyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">varyingInsert</span>(whiteCompoundPkRefMany, option);
     * ... = whiteCompoundPkRefMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPkRefMany The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WritableOptionCall<WhiteCompoundPkRefManyCB, InsertOption<WhiteCompoundPkRefManyCB>> opLambda) {
        doInsert(whiteCompoundPkRefMany, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * whiteCompoundPkRefMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRefMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRefMany.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkRefManyCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefManyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *         public void specify(WhiteCompoundPkRefManyCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkRefManyBhv.<span style="color: #CC4747">varyingUpdate</span>(whiteCompoundPkRefMany, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefMany The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WritableOptionCall<WhiteCompoundPkRefManyCB, UpdateOption<WhiteCompoundPkRefManyCB>> opLambda) {
        doUpdate(whiteCompoundPkRefMany, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPkRefMany The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WritableOptionCall<WhiteCompoundPkRefManyCB, InsertOption<WhiteCompoundPkRefManyCB>> insertOpLambda, WritableOptionCall<WhiteCompoundPkRefManyCB, UpdateOption<WhiteCompoundPkRefManyCB>> updateOpLambda) {
        doInsertOrUpdate(whiteCompoundPkRefMany, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPkRefMany The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WritableOptionCall<WhiteCompoundPkRefManyCB, DeleteOption<WhiteCompoundPkRefManyCB>> opLambda) {
        doDelete(whiteCompoundPkRefMany, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, WritableOptionCall<WhiteCompoundPkRefManyCB, InsertOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doBatchInsert(whiteCompoundPkRefManyList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, WritableOptionCall<WhiteCompoundPkRefManyCB, UpdateOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doBatchUpdate(whiteCompoundPkRefManyList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, WritableOptionCall<WhiteCompoundPkRefManyCB, DeleteOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doBatchDelete(whiteCompoundPkRefManyList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> manyArgLambda, WritableOptionCall<WhiteCompoundPkRefManyCB, InsertOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setPK...(value);</span>
     * whiteCompoundPkRefMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setVersionNo(value);</span>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkRefManyCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefManyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void specify(WhiteCompoundPkRefManyCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteCompoundPkRefMany, cb, option);
     * </pre>
     * @param whiteCompoundPkRefMany The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, CBCall<WhiteCompoundPkRefManyCB> cbLambda, WritableOptionCall<WhiteCompoundPkRefManyCB, UpdateOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doQueryUpdate(whiteCompoundPkRefMany, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setPK...(value);</span>
     * whiteCompoundPkRefMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setVersionNo(value);</span>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkRefManyCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefManyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void specify(WhiteCompoundPkRefManyCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteCompoundPkRefMany, cb, option);
     * </pre>
     * @param whiteCompoundPkRefMany The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WhiteCompoundPkRefManyCB cb, WritableOptionCall<WhiteCompoundPkRefManyCB, UpdateOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doQueryUpdate(whiteCompoundPkRefMany, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteCompoundPkRefManyCB> cbLambda, WritableOptionCall<WhiteCompoundPkRefManyCB, DeleteOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkRefManyCB cb, WritableOptionCall<WhiteCompoundPkRefManyCB, DeleteOption<WhiteCompoundPkRefManyCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteCompoundPkRefManyBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteCompoundPkRefManyBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteCompoundPkRefManyBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteCompoundPkRefManyBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteCompoundPkRefManyBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteCompoundPkRefManyBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteCompoundPkRefManyBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteCompoundPkRefManyBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteCompoundPkRefManyBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteCompoundPkRefManyBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteCompoundPkRefManyBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteCompoundPkRefManyBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteCompoundPkRefManyBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteCompoundPkRefManyBhv.outideSql().removeBlockComment().selectList()
     * whiteCompoundPkRefManyBhv.outideSql().removeLineComment().selectList()
     * whiteCompoundPkRefManyBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteCompoundPkRefManyBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteCompoundPkRefManyBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteCompoundPkRefMany> typeOfSelectedEntity() { return WhiteCompoundPkRefMany.class; }
    protected Class<WhiteCompoundPkRefMany> typeOfHandlingEntity() { return WhiteCompoundPkRefMany.class; }
    protected Class<WhiteCompoundPkRefManyCB> typeOfHandlingConditionBean() { return WhiteCompoundPkRefManyCB.class; }
}
