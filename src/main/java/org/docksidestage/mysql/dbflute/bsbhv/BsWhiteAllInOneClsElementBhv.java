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
 * The behavior of WHITE_ALL_IN_ONE_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE, CLS_ELEMENT_NAME, ATTRIBUTE_EXP
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
 *     white_all_in_one_cls_category
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteAllInOneClsCategory
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsElementBhv extends AbstractBehaviorWritable<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteAllInOneClsElementDbm getDBMeta() { return WhiteAllInOneClsElementDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteAllInOneClsElementCB newConditionBean() { return new WhiteAllInOneClsElementCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsElementCB cb) {
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(whiteAllInOneClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteAllInOneClsElement.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(whiteAllInOneClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteAllInOneClsElement.get...
     * }).<span style="color: #994747">orElse</span>(() -&gt; {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteAllInOneClsElement> selectEntity(CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteAllInOneClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteAllInOneClsElement.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteAllInOneClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteAllInOneClsElement.get...
     * }).<span style="color: #994747">orElse</span>(() -&gt; {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteAllInOneClsElement> selectEntity(WhiteAllInOneClsElementCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteAllInOneClsElement> facadeSelectEntity(WhiteAllInOneClsElementCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsElement> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteAllInOneClsElementCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectEntityWithDeletedCheck(CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectEntityWithDeletedCheck(WhiteAllInOneClsElementCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param clsCategoryCode : PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category. (NotNull)
     * @param clsElementCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteAllInOneClsElement> selectByPK(String clsCategoryCode, String clsElementCode) {
        return facadeSelectByPK(clsCategoryCode, clsElementCode);
    }

    protected OptionalEntity<WhiteAllInOneClsElement> facadeSelectByPK(String clsCategoryCode, String clsElementCode) {
        return doSelectOptionalByPK(clsCategoryCode, clsElementCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectByPK(String clsCategoryCode, String clsElementCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(clsCategoryCode, clsElementCode), tp);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> OptionalEntity<ENTITY> doSelectOptionalByPK(String clsCategoryCode, String clsElementCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(clsCategoryCode, clsElementCode, tp), clsCategoryCode, clsElementCode);
    }

    protected WhiteAllInOneClsElementCB xprepareCBAsPK(String clsCategoryCode, String clsElementCode) {
        assertObjectNotNull("clsCategoryCode", clsCategoryCode);assertObjectNotNull("clsElementCode", clsElementCode);
        return newConditionBean().acceptPK(clsCategoryCode, clsElementCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteAllInOneClsElement&gt; whiteAllInOneClsElementList = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectList</span>(cb -&gt; {
     *     cb.query().set...;
     *     cb.query().addOrderBy...;
     * });
     * whiteAllInOneClsElementList.forEach(whiteAllInOneClsElement -&gt; {
     *     ... = whiteAllInOneClsElement.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsElement> selectList(CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsElement&gt; whiteAllInOneClsElementList = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : whiteAllInOneClsElementList) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsElement> selectList(WhiteAllInOneClsElementCB cb) {
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
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsElement&gt; page = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : page) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsElement> selectPage(CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsElement&gt; page = whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : page) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsElement> selectPage(WhiteAllInOneClsElementCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsElement&gt;() {
     *     public void handle(WhiteAllInOneClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param entityLambda The handler of entity row of WhiteAllInOneClsElement. (NotNull)
     */
    public void selectCursor(CBCall<WhiteAllInOneClsElementCB> cbLambda, EntityRowHandler<WhiteAllInOneClsElement> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsElement&gt;() {
     *     public void handle(WhiteAllInOneClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsElement. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsElementCB cb, EntityRowHandler<WhiteAllInOneClsElement> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteAllInOneClsElementCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteAllInOneClsElementList The entity list of whiteAllInOneClsElement. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, ReferrerLoaderHandler<LoaderOfWhiteAllInOneClsElement> loaderLambda) {
        xassLRArg(whiteAllInOneClsElementList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteAllInOneClsElement().ready(whiteAllInOneClsElementList, _behaviorSelector));
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
     * @param whiteAllInOneClsElement The entity of whiteAllInOneClsElement. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteAllInOneClsElement whiteAllInOneClsElement, ReferrerLoaderHandler<LoaderOfWhiteAllInOneClsElement> loaderLambda) {
        xassLRArg(whiteAllInOneClsElement, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteAllInOneClsElement().ready(xnewLRAryLs(whiteAllInOneClsElement), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteAllInOneClsCategory'.
     * @param whiteAllInOneClsElementList The list of whiteAllInOneClsElement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsCategory> pulloutWhiteAllInOneClsCategory(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList)
    { return helpPulloutInternally(whiteAllInOneClsElementList, "whiteAllInOneClsCategory"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsElement.setFoo...(value);
     * whiteAllInOneClsElement.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">insert</span>(whiteAllInOneClsElement);
     * ... = whiteAllInOneClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsElement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doInsert(whiteAllInOneClsElement, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsElement.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsElementBhv.<span style="color: #CC4747">update</span>(whiteAllInOneClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doUpdate(whiteAllInOneClsElement, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteAllInOneClsElement The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doInsertOrUpdate(whiteAllInOneClsElement, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsElement.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsElementBhv.<span style="color: #CC4747">delete</span>(whiteAllInOneClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doDelete(whiteAllInOneClsElement, null);
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
     *     WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     *     whiteAllInOneClsElement.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsElement.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsElementList.add(whiteAllInOneClsElement);
     * }
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">batchInsert</span>(whiteAllInOneClsElementList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchInsert(whiteAllInOneClsElementList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     *     whiteAllInOneClsElement.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsElement.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsElement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsElement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsElementList.add(whiteAllInOneClsElement);
     * }
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">batchUpdate</span>(whiteAllInOneClsElementList);
     * </pre>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchUpdate(whiteAllInOneClsElementList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchDelete(whiteAllInOneClsElementList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsElement, WhiteAllInOneClsElementCB&gt;() {
     *     public ConditionBean setup(WhiteAllInOneClsElement entity, WhiteAllInOneClsElementCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">queryUpdate</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return doQueryUpdate(whiteAllInOneClsElement, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">queryUpdate</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb) {
        return doQueryUpdate(whiteAllInOneClsElement, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">queryDelete</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteAllInOneClsElementCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">queryDelete</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsElementCB cb) {
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsElement.setFoo...(value);
     * whiteAllInOneClsElement.setBar...(value);
     * InsertOption<WhiteAllInOneClsElementCB> option = new InsertOption<WhiteAllInOneClsElementCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">varyingInsert</span>(whiteAllInOneClsElement, option);
     * ... = whiteAllInOneClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsElement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsElement whiteAllInOneClsElement, WritableOptionCall<WhiteAllInOneClsElementCB, InsertOption<WhiteAllInOneClsElementCB>> opLambda) {
        doInsert(whiteAllInOneClsElement, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsElement.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *         public void specify(WhiteAllInOneClsElementCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsElementBhv.<span style="color: #CC4747">varyingUpdate</span>(whiteAllInOneClsElement, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WritableOptionCall<WhiteAllInOneClsElementCB, UpdateOption<WhiteAllInOneClsElementCB>> opLambda) {
        doUpdate(whiteAllInOneClsElement, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsElement The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WritableOptionCall<WhiteAllInOneClsElementCB, InsertOption<WhiteAllInOneClsElementCB>> insertOpLambda, WritableOptionCall<WhiteAllInOneClsElementCB, UpdateOption<WhiteAllInOneClsElementCB>> updateOpLambda) {
        doInsertOrUpdate(whiteAllInOneClsElement, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsElement The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsElement whiteAllInOneClsElement, WritableOptionCall<WhiteAllInOneClsElementCB, DeleteOption<WhiteAllInOneClsElementCB>> opLambda) {
        doDelete(whiteAllInOneClsElement, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, WritableOptionCall<WhiteAllInOneClsElementCB, InsertOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doBatchInsert(whiteAllInOneClsElementList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, WritableOptionCall<WhiteAllInOneClsElementCB, UpdateOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doBatchUpdate(whiteAllInOneClsElementList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, WritableOptionCall<WhiteAllInOneClsElementCB, DeleteOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doBatchDelete(whiteAllInOneClsElementList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> manyArgLambda, WritableOptionCall<WhiteAllInOneClsElementCB, InsertOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void specify(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteAllInOneClsElement, cb, option);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, CBCall<WhiteAllInOneClsElementCB> cbLambda, WritableOptionCall<WhiteAllInOneClsElementCB, UpdateOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doQueryUpdate(whiteAllInOneClsElement, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void specify(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsElementBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteAllInOneClsElement, cb, option);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb, WritableOptionCall<WhiteAllInOneClsElementCB, UpdateOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doQueryUpdate(whiteAllInOneClsElement, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteAllInOneClsElementCB> cbLambda, WritableOptionCall<WhiteAllInOneClsElementCB, DeleteOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsElementCB cb, WritableOptionCall<WhiteAllInOneClsElementCB, DeleteOption<WhiteAllInOneClsElementCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteAllInOneClsElementBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteAllInOneClsElementBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteAllInOneClsElementBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteAllInOneClsElementBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteAllInOneClsElementBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteAllInOneClsElementBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteAllInOneClsElementBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteAllInOneClsElementBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteAllInOneClsElementBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteAllInOneClsElementBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteAllInOneClsElementBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteAllInOneClsElementBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteAllInOneClsElementBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteAllInOneClsElementBhv.outideSql().removeBlockComment().selectList()
     * whiteAllInOneClsElementBhv.outideSql().removeLineComment().selectList()
     * whiteAllInOneClsElementBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteAllInOneClsElementBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteAllInOneClsElementBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteAllInOneClsElement> typeOfSelectedEntity() { return WhiteAllInOneClsElement.class; }
    protected Class<WhiteAllInOneClsElement> typeOfHandlingEntity() { return WhiteAllInOneClsElement.class; }
    protected Class<WhiteAllInOneClsElementCB> typeOfHandlingConditionBean() { return WhiteAllInOneClsElementCB.class; }
}
