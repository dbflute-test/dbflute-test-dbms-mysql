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
 * The behavior of WHITE_ESCAPED_DFPROP as TABLE. <br />
 * <pre>
 * [primary key]
 *     ESCAPED_DFPROP_CODE
 *
 * [column]
 *     ESCAPED_DFPROP_CODE, ESCAPED_DFPROP_NAME
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
public abstract class BsWhiteEscapedDfpropBhv extends AbstractBehaviorWritable<WhiteEscapedDfprop, WhiteEscapedDfpropCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteEscapedDfpropDbm getDBMeta() { return WhiteEscapedDfpropDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteEscapedDfpropCB newConditionBean() { return new WhiteEscapedDfpropCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * int count = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * int count = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteEscapedDfpropCB cb) {
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
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteEscapedDfprop&gt; entity = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteEscapedDfprop -&gt; {
     *     ...
     * });
     * WhiteEscapedDfprop whiteEscapedDfprop = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteEscapedDfprop -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteEscapedDfprop whiteEscapedDfprop = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteEscapedDfprop> selectEntity(CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteEscapedDfprop&gt; entity = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteEscapedDfprop -&gt; {
     *     ...
     * });
     * WhiteEscapedDfprop whiteEscapedDfprop = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteEscapedDfprop -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteEscapedDfprop whiteEscapedDfprop = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteEscapedDfprop> selectEntity(WhiteEscapedDfpropCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteEscapedDfprop> facadeSelectEntity(WhiteEscapedDfpropCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteEscapedDfprop> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteEscapedDfpropCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * WhiteEscapedDfprop whiteEscapedDfprop = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteEscapedDfprop.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedDfprop selectEntityWithDeletedCheck(CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * WhiteEscapedDfprop whiteEscapedDfprop = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteEscapedDfprop.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedDfprop selectEntityWithDeletedCheck(WhiteEscapedDfpropCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param escapedDfpropCode : PK, NotNull, CHAR(3), classification=EscapedDfpropCls. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteEscapedDfprop> selectByPK(CDef.EscapedDfpropCls escapedDfpropCode) {
        return facadeSelectByPK(escapedDfpropCode);
    }

    protected OptionalEntity<WhiteEscapedDfprop> facadeSelectByPK(CDef.EscapedDfpropCls escapedDfpropCode) {
        return doSelectOptionalByPK(escapedDfpropCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteEscapedDfprop> ENTITY doSelectByPK(CDef.EscapedDfpropCls escapedDfpropCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(escapedDfpropCode), tp);
    }

    protected <ENTITY extends WhiteEscapedDfprop> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.EscapedDfpropCls escapedDfpropCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(escapedDfpropCode, tp), escapedDfpropCode);
    }

    protected WhiteEscapedDfpropCB xprepareCBAsPK(CDef.EscapedDfpropCls escapedDfpropCode) {
        assertObjectNotNull("escapedDfpropCode", escapedDfpropCode);
        return newConditionBean().acceptPK(escapedDfpropCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteEscapedDfprop&gt; whiteEscapedDfpropList = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteEscapedDfprop whiteEscapedDfprop : whiteEscapedDfpropList) {
     *     ... = whiteEscapedDfprop.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteEscapedDfprop> selectList(CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteEscapedDfprop&gt; whiteEscapedDfpropList = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteEscapedDfprop whiteEscapedDfprop : whiteEscapedDfpropList) {
     *     ... = whiteEscapedDfprop.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteEscapedDfprop> selectList(WhiteEscapedDfpropCB cb) {
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
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteEscapedDfprop&gt; page = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteEscapedDfprop whiteEscapedDfprop : page) {
     *     ... = whiteEscapedDfprop.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteEscapedDfprop> selectPage(CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteEscapedDfprop&gt; page = whiteEscapedDfpropBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteEscapedDfprop whiteEscapedDfprop : page) {
     *     ... = whiteEscapedDfprop.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteEscapedDfprop> selectPage(WhiteEscapedDfpropCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteEscapedDfprop&gt;() {
     *     public void handle(WhiteEscapedDfprop entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param entityLambda The handler of entity row of WhiteEscapedDfprop. (NotNull)
     */
    public void selectCursor(CBCall<WhiteEscapedDfpropCB> cbLambda, EntityRowHandler<WhiteEscapedDfprop> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteEscapedDfprop&gt;() {
     *     public void handle(WhiteEscapedDfprop entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteEscapedDfprop. (NotNull)
     */
    public void selectCursor(WhiteEscapedDfpropCB cb, EntityRowHandler<WhiteEscapedDfprop> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteEscapedDfpropCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteEscapedDfpropCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteEscapedDfpropList The entity list of whiteEscapedDfprop. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteEscapedDfprop> whiteEscapedDfpropList, ReferrerLoaderHandler<LoaderOfWhiteEscapedDfprop> loaderLambda) {
        xassLRArg(whiteEscapedDfpropList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteEscapedDfprop().ready(whiteEscapedDfpropList, _behaviorSelector));
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
     * @param whiteEscapedDfprop The entity of whiteEscapedDfprop. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteEscapedDfprop whiteEscapedDfprop, ReferrerLoaderHandler<LoaderOfWhiteEscapedDfprop> loaderLambda) {
        xassLRArg(whiteEscapedDfprop, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteEscapedDfprop().ready(xnewLRAryLs(whiteEscapedDfprop), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key escapedDfpropCode.
     * @param whiteEscapedDfpropList The list of whiteEscapedDfprop. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractEscapedDfpropCodeList(List<WhiteEscapedDfprop> whiteEscapedDfpropList)
    { return helpExtractListInternally(whiteEscapedDfpropList, "escapedDfpropCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteEscapedDfprop.setFoo...(value);
     * whiteEscapedDfprop.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">insert</span>(whiteEscapedDfprop);
     * ... = whiteEscapedDfprop.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteEscapedDfprop The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteEscapedDfprop whiteEscapedDfprop) {
        doInsert(whiteEscapedDfprop, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * whiteEscapedDfprop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteEscapedDfprop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteEscapedDfprop.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteEscapedDfpropBhv.<span style="color: #DD4747">update</span>(whiteEscapedDfprop);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedDfprop The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteEscapedDfprop whiteEscapedDfprop) {
        doUpdate(whiteEscapedDfprop, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteEscapedDfprop The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteEscapedDfprop whiteEscapedDfprop) {
        doInsertOrUpdate(whiteEscapedDfprop, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * whiteEscapedDfprop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteEscapedDfprop.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteEscapedDfpropBhv.<span style="color: #DD4747">delete</span>(whiteEscapedDfprop);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedDfprop The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteEscapedDfprop whiteEscapedDfprop) {
        doDelete(whiteEscapedDfprop, null);
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
     *     WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     *     whiteEscapedDfprop.setFooName("foo");
     *     if (...) {
     *         whiteEscapedDfprop.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteEscapedDfpropList.add(whiteEscapedDfprop);
     * }
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">batchInsert</span>(whiteEscapedDfpropList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        return doBatchInsert(whiteEscapedDfpropList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     *     whiteEscapedDfprop.setFooName("foo");
     *     if (...) {
     *         whiteEscapedDfprop.setFooPrice(123);
     *     } else {
     *         whiteEscapedDfprop.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteEscapedDfprop.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteEscapedDfpropList.add(whiteEscapedDfprop);
     * }
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">batchUpdate</span>(whiteEscapedDfpropList);
     * </pre>
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        return doBatchUpdate(whiteEscapedDfpropList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteEscapedDfprop> whiteEscapedDfpropList) {
        return doBatchDelete(whiteEscapedDfpropList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteEscapedDfprop, WhiteEscapedDfpropCB&gt;() {
     *     public ConditionBean setup(WhiteEscapedDfprop entity, WhiteEscapedDfpropCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setPK...(value);</span>
     * whiteEscapedDfprop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setVersionNo(value);</span>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">queryUpdate</span>(whiteEscapedDfprop, cb);
     * </pre>
     * @param whiteEscapedDfprop The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return doQueryUpdate(whiteEscapedDfprop, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setPK...(value);</span>
     * whiteEscapedDfprop.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setVersionNo(value);</span>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">queryUpdate</span>(whiteEscapedDfprop, cb);
     * </pre>
     * @param whiteEscapedDfprop The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WhiteEscapedDfpropCB cb) {
        return doQueryUpdate(whiteEscapedDfprop, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">queryDelete</span>(whiteEscapedDfprop, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteEscapedDfpropCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">queryDelete</span>(whiteEscapedDfprop, cb);
     * </pre>
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteEscapedDfpropCB cb) {
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
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteEscapedDfprop.setFoo...(value);
     * whiteEscapedDfprop.setBar...(value);
     * InsertOption<WhiteEscapedDfpropCB> option = new InsertOption<WhiteEscapedDfpropCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">varyingInsert</span>(whiteEscapedDfprop, option);
     * ... = whiteEscapedDfprop.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteEscapedDfprop The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteEscapedDfprop whiteEscapedDfprop, WOptionCall<WhiteEscapedDfpropCB, InsertOption<WhiteEscapedDfpropCB>> opLambda) {
        doInsert(whiteEscapedDfprop, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * whiteEscapedDfprop.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteEscapedDfprop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteEscapedDfprop.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteEscapedDfpropCB&gt; option = new UpdateOption&lt;WhiteEscapedDfpropCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *         public void specify(WhiteEscapedDfpropCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteEscapedDfpropBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteEscapedDfprop, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedDfprop The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WOptionCall<WhiteEscapedDfpropCB, UpdateOption<WhiteEscapedDfpropCB>> opLambda) {
        doUpdate(whiteEscapedDfprop, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteEscapedDfprop The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WOptionCall<WhiteEscapedDfpropCB, InsertOption<WhiteEscapedDfpropCB>> insertOpLambda, WOptionCall<WhiteEscapedDfpropCB, UpdateOption<WhiteEscapedDfpropCB>> updateOpLambda) {
        doInsertOrUpdate(whiteEscapedDfprop, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteEscapedDfprop The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteEscapedDfprop whiteEscapedDfprop, WOptionCall<WhiteEscapedDfpropCB, DeleteOption<WhiteEscapedDfpropCB>> opLambda) {
        doDelete(whiteEscapedDfprop, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteEscapedDfprop> whiteEscapedDfpropList, WOptionCall<WhiteEscapedDfpropCB, InsertOption<WhiteEscapedDfpropCB>> opLambda) {
        return doBatchInsert(whiteEscapedDfpropList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteEscapedDfprop> whiteEscapedDfpropList, WOptionCall<WhiteEscapedDfpropCB, UpdateOption<WhiteEscapedDfpropCB>> opLambda) {
        return doBatchUpdate(whiteEscapedDfpropList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteEscapedDfpropList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteEscapedDfprop> whiteEscapedDfpropList, WOptionCall<WhiteEscapedDfpropCB, DeleteOption<WhiteEscapedDfpropCB>> opLambda) {
        return doBatchDelete(whiteEscapedDfpropList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteEscapedDfprop, WhiteEscapedDfpropCB> manyArgLambda, WOptionCall<WhiteEscapedDfpropCB, InsertOption<WhiteEscapedDfpropCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setPK...(value);</span>
     * whiteEscapedDfprop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setVersionNo(value);</span>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteEscapedDfpropCB&gt; option = new UpdateOption&lt;WhiteEscapedDfpropCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void specify(WhiteEscapedDfpropCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteEscapedDfprop, cb, option);
     * </pre>
     * @param whiteEscapedDfprop The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, CBCall<WhiteEscapedDfpropCB> cbLambda, WOptionCall<WhiteEscapedDfpropCB, UpdateOption<WhiteEscapedDfpropCB>> opLambda) {
        return doQueryUpdate(whiteEscapedDfprop, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteEscapedDfprop whiteEscapedDfprop = new WhiteEscapedDfprop();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setPK...(value);</span>
     * whiteEscapedDfprop.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedDfprop.setVersionNo(value);</span>
     * WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteEscapedDfpropCB&gt; option = new UpdateOption&lt;WhiteEscapedDfpropCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteEscapedDfpropCB&gt;() {
     *     public void specify(WhiteEscapedDfpropCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteEscapedDfpropBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteEscapedDfprop, cb, option);
     * </pre>
     * @param whiteEscapedDfprop The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteEscapedDfprop whiteEscapedDfprop, WhiteEscapedDfpropCB cb, WOptionCall<WhiteEscapedDfpropCB, UpdateOption<WhiteEscapedDfpropCB>> opLambda) {
        return doQueryUpdate(whiteEscapedDfprop, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteEscapedDfpropCB> cbLambda, WOptionCall<WhiteEscapedDfpropCB, DeleteOption<WhiteEscapedDfpropCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteEscapedDfprop. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteEscapedDfpropCB cb, WOptionCall<WhiteEscapedDfpropCB, DeleteOption<WhiteEscapedDfpropCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteEscapedDfpropBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteEscapedDfpropBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteEscapedDfpropBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteEscapedDfpropBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteEscapedDfpropBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteEscapedDfpropBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteEscapedDfpropBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteEscapedDfpropBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteEscapedDfpropBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteEscapedDfpropBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteEscapedDfpropBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteEscapedDfpropBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteEscapedDfpropBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteEscapedDfpropBhv.outideSql().removeBlockComment().selectList()
     * whiteEscapedDfpropBhv.outideSql().removeLineComment().selectList()
     * whiteEscapedDfpropBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteEscapedDfpropBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteEscapedDfpropBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteEscapedDfprop> typeOfSelectedEntity() { return WhiteEscapedDfprop.class; }
    protected Class<WhiteEscapedDfprop> typeOfHandlingEntity() { return WhiteEscapedDfprop.class; }
    protected Class<WhiteEscapedDfpropCB> typeOfHandlingConditionBean() { return WhiteEscapedDfpropCB.class; }
}
