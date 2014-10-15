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
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.bsbhv.loader.*;
import org.docksidestage.mysql.dbflute.exentity.*;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.*;
import org.docksidestage.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_DEPRECATED_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     DEPRECATED_CLS_ELEMENT_CODE
 *
 * [column]
 *     DEPRECATED_CLS_ELEMENT_CODE, DEPRECATED_CLS_ELEMENT_NAME
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
public abstract class BsWhiteDeprecatedClsElementBhv extends AbstractBehaviorWritable<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteDeprecatedClsElementDbm getDBMeta() { return WhiteDeprecatedClsElementDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteDeprecatedClsElementCB newConditionBean() { return new WhiteDeprecatedClsElementCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDeprecatedClsElementCB cb) {
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(whiteDeprecatedClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteDeprecatedClsElement.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(whiteDeprecatedClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteDeprecatedClsElement.get...
     * }).<span style="color: #994747">orElse</span>(() -&gt; {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDeprecatedClsElement> selectEntity(CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteDeprecatedClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteDeprecatedClsElement.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteDeprecatedClsElement -&gt; {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteDeprecatedClsElement.get...
     * }).<span style="color: #994747">orElse</span>(() -&gt; {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDeprecatedClsElement> selectEntity(WhiteDeprecatedClsElementCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteDeprecatedClsElement> facadeSelectEntity(WhiteDeprecatedClsElementCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteDeprecatedClsElementCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDeprecatedClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDeprecatedClsElement selectEntityWithDeletedCheck(CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDeprecatedClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDeprecatedClsElement selectEntityWithDeletedCheck(WhiteDeprecatedClsElementCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param deprecatedClsElementCode : PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteDeprecatedClsElement> selectByPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode) {
        return facadeSelectByPK(deprecatedClsElementCode);
    }

    protected OptionalEntity<WhiteDeprecatedClsElement> facadeSelectByPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode) {
        return doSelectOptionalByPK(deprecatedClsElementCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> ENTITY doSelectByPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(deprecatedClsElementCode), tp);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(deprecatedClsElementCode, tp), deprecatedClsElementCode);
    }

    protected WhiteDeprecatedClsElementCB xprepareCBAsPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode) {
        assertObjectNotNull("deprecatedClsElementCode", deprecatedClsElementCode);
        return newConditionBean().acceptPK(deprecatedClsElementCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteDeprecatedClsElement&gt; whiteDeprecatedClsElementList = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectList</span>(cb -&gt; {
     *     cb.query().set...;
     *     cb.query().addOrderBy...;
     * });
     * whiteDeprecatedClsElementList.forEach(whiteDeprecatedClsElement -&gt; {
     *     ... = whiteDeprecatedClsElement.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDeprecatedClsElement> selectList(CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDeprecatedClsElement&gt; whiteDeprecatedClsElementList = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectList</span>(cb);
     * for (WhiteDeprecatedClsElement whiteDeprecatedClsElement : whiteDeprecatedClsElementList) {
     *     ... = whiteDeprecatedClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDeprecatedClsElement> selectList(WhiteDeprecatedClsElementCB cb) {
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
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDeprecatedClsElement&gt; page = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDeprecatedClsElement whiteDeprecatedClsElement : page) {
     *     ... = whiteDeprecatedClsElement.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDeprecatedClsElement> selectPage(CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDeprecatedClsElement&gt; page = whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDeprecatedClsElement whiteDeprecatedClsElement : page) {
     *     ... = whiteDeprecatedClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDeprecatedClsElement> selectPage(WhiteDeprecatedClsElementCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDeprecatedClsElement&gt;() {
     *     public void handle(WhiteDeprecatedClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param entityLambda The handler of entity row of WhiteDeprecatedClsElement. (NotNull)
     */
    public void selectCursor(CBCall<WhiteDeprecatedClsElementCB> cbLambda, EntityRowHandler<WhiteDeprecatedClsElement> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDeprecatedClsElement&gt;() {
     *     public void handle(WhiteDeprecatedClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDeprecatedClsElement. (NotNull)
     */
    public void selectCursor(WhiteDeprecatedClsElementCB cb, EntityRowHandler<WhiteDeprecatedClsElement> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDeprecatedClsElementCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteDeprecatedClsElementCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteDeprecatedClsElementList The entity list of whiteDeprecatedClsElement. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, ReferrerLoaderHandler<LoaderOfWhiteDeprecatedClsElement> loaderLambda) {
        xassLRArg(whiteDeprecatedClsElementList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteDeprecatedClsElement().ready(whiteDeprecatedClsElementList, _behaviorSelector));
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
     * @param whiteDeprecatedClsElement The entity of whiteDeprecatedClsElement. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteDeprecatedClsElement whiteDeprecatedClsElement, ReferrerLoaderHandler<LoaderOfWhiteDeprecatedClsElement> loaderLambda) {
        xassLRArg(whiteDeprecatedClsElement, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteDeprecatedClsElement().ready(xnewLRAryLs(whiteDeprecatedClsElement), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key deprecatedClsElementCode.
     * @param whiteDeprecatedClsElementList The list of whiteDeprecatedClsElement. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractDeprecatedClsElementCodeList(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList)
    { return helpExtractListInternally(whiteDeprecatedClsElementList, "deprecatedClsElementCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDeprecatedClsElement.setFoo...(value);
     * whiteDeprecatedClsElement.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">insert</span>(whiteDeprecatedClsElement);
     * ... = whiteDeprecatedClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDeprecatedClsElement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doInsert(whiteDeprecatedClsElement, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * whiteDeprecatedClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDeprecatedClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDeprecatedClsElement.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     whiteDeprecatedClsElementBhv.<span style="color: #CC4747">update</span>(whiteDeprecatedClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDeprecatedClsElement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doUpdate(whiteDeprecatedClsElement, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteDeprecatedClsElement The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doInsertOrUpdate(whiteDeprecatedClsElement, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * whiteDeprecatedClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDeprecatedClsElement.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     whiteDeprecatedClsElementBhv.<span style="color: #CC4747">delete</span>(whiteDeprecatedClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDeprecatedClsElement The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doDelete(whiteDeprecatedClsElement, null);
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
     *     WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     *     whiteDeprecatedClsElement.setFooName("foo");
     *     if (...) {
     *         whiteDeprecatedClsElement.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDeprecatedClsElementList.add(whiteDeprecatedClsElement);
     * }
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">batchInsert</span>(whiteDeprecatedClsElementList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        return doBatchInsert(whiteDeprecatedClsElementList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     *     whiteDeprecatedClsElement.setFooName("foo");
     *     if (...) {
     *         whiteDeprecatedClsElement.setFooPrice(123);
     *     } else {
     *         whiteDeprecatedClsElement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDeprecatedClsElementList.add(whiteDeprecatedClsElement);
     * }
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">batchUpdate</span>(whiteDeprecatedClsElementList);
     * </pre>
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        return doBatchUpdate(whiteDeprecatedClsElementList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        return doBatchDelete(whiteDeprecatedClsElementList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB&gt;() {
     *     public ConditionBean setup(WhiteDeprecatedClsElement entity, WhiteDeprecatedClsElementCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setPK...(value);</span>
     * whiteDeprecatedClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setVersionNo(value);</span>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">queryUpdate</span>(whiteDeprecatedClsElement, cb);
     * </pre>
     * @param whiteDeprecatedClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return doQueryUpdate(whiteDeprecatedClsElement, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setPK...(value);</span>
     * whiteDeprecatedClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setVersionNo(value);</span>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">queryUpdate</span>(whiteDeprecatedClsElement, cb);
     * </pre>
     * @param whiteDeprecatedClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WhiteDeprecatedClsElementCB cb) {
        return doQueryUpdate(whiteDeprecatedClsElement, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">queryDelete</span>(whiteDeprecatedClsElement, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteDeprecatedClsElementCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">queryDelete</span>(whiteDeprecatedClsElement, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDeprecatedClsElementCB cb) {
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDeprecatedClsElement.setFoo...(value);
     * whiteDeprecatedClsElement.setBar...(value);
     * InsertOption<WhiteDeprecatedClsElementCB> option = new InsertOption<WhiteDeprecatedClsElementCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">varyingInsert</span>(whiteDeprecatedClsElement, option);
     * ... = whiteDeprecatedClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDeprecatedClsElement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WritableOptionCall<WhiteDeprecatedClsElementCB, InsertOption<WhiteDeprecatedClsElementCB>> opLambda) {
        doInsert(whiteDeprecatedClsElement, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * whiteDeprecatedClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDeprecatedClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteDeprecatedClsElement.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDeprecatedClsElementCB&gt; option = new UpdateOption&lt;WhiteDeprecatedClsElementCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *         public void specify(WhiteDeprecatedClsElementCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDeprecatedClsElementBhv.<span style="color: #CC4747">varyingUpdate</span>(whiteDeprecatedClsElement, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDeprecatedClsElement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WritableOptionCall<WhiteDeprecatedClsElementCB, UpdateOption<WhiteDeprecatedClsElementCB>> opLambda) {
        doUpdate(whiteDeprecatedClsElement, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDeprecatedClsElement The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WritableOptionCall<WhiteDeprecatedClsElementCB, InsertOption<WhiteDeprecatedClsElementCB>> insertOpLambda, WritableOptionCall<WhiteDeprecatedClsElementCB, UpdateOption<WhiteDeprecatedClsElementCB>> updateOpLambda) {
        doInsertOrUpdate(whiteDeprecatedClsElement, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDeprecatedClsElement The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WritableOptionCall<WhiteDeprecatedClsElementCB, DeleteOption<WhiteDeprecatedClsElementCB>> opLambda) {
        doDelete(whiteDeprecatedClsElement, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, WritableOptionCall<WhiteDeprecatedClsElementCB, InsertOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doBatchInsert(whiteDeprecatedClsElementList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, WritableOptionCall<WhiteDeprecatedClsElementCB, UpdateOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doBatchUpdate(whiteDeprecatedClsElementList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, WritableOptionCall<WhiteDeprecatedClsElementCB, DeleteOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doBatchDelete(whiteDeprecatedClsElementList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> manyArgLambda, WritableOptionCall<WhiteDeprecatedClsElementCB, InsertOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setPK...(value);</span>
     * whiteDeprecatedClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setVersionNo(value);</span>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDeprecatedClsElementCB&gt; option = new UpdateOption&lt;WhiteDeprecatedClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void specify(WhiteDeprecatedClsElementCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteDeprecatedClsElement, cb, option);
     * </pre>
     * @param whiteDeprecatedClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, CBCall<WhiteDeprecatedClsElementCB> cbLambda, WritableOptionCall<WhiteDeprecatedClsElementCB, UpdateOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doQueryUpdate(whiteDeprecatedClsElement, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setPK...(value);</span>
     * whiteDeprecatedClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setVersionNo(value);</span>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDeprecatedClsElementCB&gt; option = new UpdateOption&lt;WhiteDeprecatedClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void specify(WhiteDeprecatedClsElementCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteDeprecatedClsElement, cb, option);
     * </pre>
     * @param whiteDeprecatedClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WhiteDeprecatedClsElementCB cb, WritableOptionCall<WhiteDeprecatedClsElementCB, UpdateOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doQueryUpdate(whiteDeprecatedClsElement, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteDeprecatedClsElementCB> cbLambda, WritableOptionCall<WhiteDeprecatedClsElementCB, DeleteOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDeprecatedClsElementCB cb, WritableOptionCall<WhiteDeprecatedClsElementCB, DeleteOption<WhiteDeprecatedClsElementCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteDeprecatedClsElementBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteDeprecatedClsElementBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteDeprecatedClsElementBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteDeprecatedClsElementBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteDeprecatedClsElementBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteDeprecatedClsElementBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteDeprecatedClsElementBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteDeprecatedClsElementBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteDeprecatedClsElementBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteDeprecatedClsElementBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteDeprecatedClsElementBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteDeprecatedClsElementBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteDeprecatedClsElementBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteDeprecatedClsElementBhv.outideSql().removeBlockComment().selectList()
     * whiteDeprecatedClsElementBhv.outideSql().removeLineComment().selectList()
     * whiteDeprecatedClsElementBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteDeprecatedClsElementBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteDeprecatedClsElementBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteDeprecatedClsElement> typeOfSelectedEntity() { return WhiteDeprecatedClsElement.class; }
    protected Class<WhiteDeprecatedClsElement> typeOfHandlingEntity() { return WhiteDeprecatedClsElement.class; }
    protected Class<WhiteDeprecatedClsElementCB> typeOfHandlingConditionBean() { return WhiteDeprecatedClsElementCB.class; }
}
