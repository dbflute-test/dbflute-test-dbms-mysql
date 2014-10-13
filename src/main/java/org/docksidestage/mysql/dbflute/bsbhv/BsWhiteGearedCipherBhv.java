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
 * The behavior of WHITE_GEARED_CIPHER as TABLE. <br />
 * <pre>
 * [primary key]
 *     CIPHER_ID
 *
 * [column]
 *     CIPHER_ID, CIPHER_INTEGER, CIPHER_VARCHAR, CIPHER_DATE, CIPHER_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CIPHER_ID
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
public abstract class BsWhiteGearedCipherBhv extends AbstractBehaviorWritable<WhiteGearedCipher, WhiteGearedCipherCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteGearedCipherDbm getDBMeta() { return WhiteGearedCipherDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteGearedCipherCB newConditionBean() { return new WhiteGearedCipherCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * int count = whiteGearedCipherBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteGearedCipherCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * int count = whiteGearedCipherBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteGearedCipherCB cb) {
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
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteGearedCipher&gt; entity = whiteGearedCipherBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteGearedCipher -&gt; {
     *     ...
     * });
     * WhiteGearedCipher whiteGearedCipher = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteGearedCipher -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteGearedCipher whiteGearedCipher = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteGearedCipher> selectEntity(CBCall<WhiteGearedCipherCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;WhiteGearedCipher&gt; entity = whiteGearedCipherBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(whiteGearedCipher -&gt; {
     *     ...
     * });
     * WhiteGearedCipher whiteGearedCipher = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(whiteGearedCipher -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     WhiteGearedCipher whiteGearedCipher = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteGearedCipher> selectEntity(WhiteGearedCipherCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteGearedCipher> facadeSelectEntity(WhiteGearedCipherCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteGearedCipher> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteGearedCipherCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElseNull(); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * WhiteGearedCipher whiteGearedCipher = whiteGearedCipherBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteGearedCipher.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteGearedCipher selectEntityWithDeletedCheck(CBCall<WhiteGearedCipherCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * WhiteGearedCipher whiteGearedCipher = whiteGearedCipherBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteGearedCipher.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteGearedCipher selectEntityWithDeletedCheck(WhiteGearedCipherCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param cipherId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteGearedCipher> selectByPK(Long cipherId) {
        return facadeSelectByPK(cipherId);
    }

    protected OptionalEntity<WhiteGearedCipher> facadeSelectByPK(Long cipherId) {
        return doSelectOptionalByPK(cipherId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteGearedCipher> ENTITY doSelectByPK(Long cipherId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(cipherId), tp);
    }

    protected <ENTITY extends WhiteGearedCipher> OptionalEntity<ENTITY> doSelectOptionalByPK(Long cipherId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(cipherId, tp), cipherId);
    }

    protected WhiteGearedCipherCB xprepareCBAsPK(Long cipherId) {
        assertObjectNotNull("cipherId", cipherId);
        return newConditionBean().acceptPK(cipherId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteGearedCipher&gt; whiteGearedCipherList = whiteGearedCipherBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteGearedCipher whiteGearedCipher : whiteGearedCipherList) {
     *     ... = whiteGearedCipher.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteGearedCipher> selectList(CBCall<WhiteGearedCipherCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteGearedCipher&gt; whiteGearedCipherList = whiteGearedCipherBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteGearedCipher whiteGearedCipher : whiteGearedCipherList) {
     *     ... = whiteGearedCipher.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteGearedCipher> selectList(WhiteGearedCipherCB cb) {
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
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteGearedCipher&gt; page = whiteGearedCipherBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteGearedCipher whiteGearedCipher : page) {
     *     ... = whiteGearedCipher.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteGearedCipher> selectPage(CBCall<WhiteGearedCipherCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteGearedCipher&gt; page = whiteGearedCipherBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteGearedCipher whiteGearedCipher : page) {
     *     ... = whiteGearedCipher.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteGearedCipher> selectPage(WhiteGearedCipherCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * whiteGearedCipherBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteGearedCipher&gt;() {
     *     public void handle(WhiteGearedCipher entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @param entityLambda The handler of entity row of WhiteGearedCipher. (NotNull)
     */
    public void selectCursor(CBCall<WhiteGearedCipherCB> cbLambda, EntityRowHandler<WhiteGearedCipher> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * whiteGearedCipherBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteGearedCipher&gt;() {
     *     public void handle(WhiteGearedCipher entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteGearedCipher. (NotNull)
     */
    public void selectCursor(WhiteGearedCipherCB cb, EntityRowHandler<WhiteGearedCipher> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteGearedCipherBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteGearedCipherCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteGearedCipherCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteGearedCipherList The entity list of whiteGearedCipher. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteGearedCipher> whiteGearedCipherList, ReferrerLoaderHandler<LoaderOfWhiteGearedCipher> loaderLambda) {
        xassLRArg(whiteGearedCipherList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteGearedCipher().ready(whiteGearedCipherList, _behaviorSelector));
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
     * @param whiteGearedCipher The entity of whiteGearedCipher. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteGearedCipher whiteGearedCipher, ReferrerLoaderHandler<LoaderOfWhiteGearedCipher> loaderLambda) {
        xassLRArg(whiteGearedCipher, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteGearedCipher().ready(xnewLRAryLs(whiteGearedCipher), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key cipherId.
     * @param whiteGearedCipherList The list of whiteGearedCipher. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCipherIdList(List<WhiteGearedCipher> whiteGearedCipherList)
    { return helpExtractListInternally(whiteGearedCipherList, "cipherId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteGearedCipher.setFoo...(value);
     * whiteGearedCipher.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.set...;</span>
     * whiteGearedCipherBhv.<span style="color: #DD4747">insert</span>(whiteGearedCipher);
     * ... = whiteGearedCipher.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteGearedCipher The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteGearedCipher whiteGearedCipher) {
        doInsert(whiteGearedCipher, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * whiteGearedCipher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteGearedCipher.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteGearedCipher.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteGearedCipherBhv.<span style="color: #DD4747">update</span>(whiteGearedCipher);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteGearedCipher The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteGearedCipher whiteGearedCipher) {
        doUpdate(whiteGearedCipher, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteGearedCipher The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteGearedCipher whiteGearedCipher) {
        doInsertOrUpdate(whiteGearedCipher, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * whiteGearedCipher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteGearedCipher.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteGearedCipherBhv.<span style="color: #DD4747">delete</span>(whiteGearedCipher);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteGearedCipher The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteGearedCipher whiteGearedCipher) {
        doDelete(whiteGearedCipher, null);
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
     *     WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     *     whiteGearedCipher.setFooName("foo");
     *     if (...) {
     *         whiteGearedCipher.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteGearedCipherList.add(whiteGearedCipher);
     * }
     * whiteGearedCipherBhv.<span style="color: #DD4747">batchInsert</span>(whiteGearedCipherList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteGearedCipherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteGearedCipher> whiteGearedCipherList) {
        return doBatchInsert(whiteGearedCipherList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     *     whiteGearedCipher.setFooName("foo");
     *     if (...) {
     *         whiteGearedCipher.setFooPrice(123);
     *     } else {
     *         whiteGearedCipher.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteGearedCipher.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteGearedCipherList.add(whiteGearedCipher);
     * }
     * whiteGearedCipherBhv.<span style="color: #DD4747">batchUpdate</span>(whiteGearedCipherList);
     * </pre>
     * @param whiteGearedCipherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteGearedCipher> whiteGearedCipherList) {
        return doBatchUpdate(whiteGearedCipherList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteGearedCipherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteGearedCipher> whiteGearedCipherList) {
        return doBatchDelete(whiteGearedCipherList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteGearedCipherBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteGearedCipher, WhiteGearedCipherCB&gt;() {
     *     public ConditionBean setup(WhiteGearedCipher entity, WhiteGearedCipherCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteGearedCipher, WhiteGearedCipherCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setPK...(value);</span>
     * whiteGearedCipher.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setVersionNo(value);</span>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * whiteGearedCipherBhv.<span style="color: #DD4747">queryUpdate</span>(whiteGearedCipher, cb);
     * </pre>
     * @param whiteGearedCipher The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteGearedCipher whiteGearedCipher, CBCall<WhiteGearedCipherCB> cbLambda) {
        return doQueryUpdate(whiteGearedCipher, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setPK...(value);</span>
     * whiteGearedCipher.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setVersionNo(value);</span>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * whiteGearedCipherBhv.<span style="color: #DD4747">queryUpdate</span>(whiteGearedCipher, cb);
     * </pre>
     * @param whiteGearedCipher The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteGearedCipher whiteGearedCipher, WhiteGearedCipherCB cb) {
        return doQueryUpdate(whiteGearedCipher, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * whiteGearedCipherBhv.<span style="color: #DD4747">queryDelete</span>(whiteGearedCipher, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteGearedCipherCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * whiteGearedCipherBhv.<span style="color: #DD4747">queryDelete</span>(whiteGearedCipher, cb);
     * </pre>
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteGearedCipherCB cb) {
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
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteGearedCipher.setFoo...(value);
     * whiteGearedCipher.setBar...(value);
     * InsertOption<WhiteGearedCipherCB> option = new InsertOption<WhiteGearedCipherCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteGearedCipherBhv.<span style="color: #DD4747">varyingInsert</span>(whiteGearedCipher, option);
     * ... = whiteGearedCipher.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteGearedCipher The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteGearedCipher whiteGearedCipher, WOptionCall<WhiteGearedCipherCB, InsertOption<WhiteGearedCipherCB>> opLambda) {
        doInsert(whiteGearedCipher, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * whiteGearedCipher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteGearedCipher.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteGearedCipher.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteGearedCipherCB&gt; option = new UpdateOption&lt;WhiteGearedCipherCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteGearedCipherCB&gt;() {
     *         public void specify(WhiteGearedCipherCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteGearedCipherBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteGearedCipher, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteGearedCipher The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteGearedCipher whiteGearedCipher, WOptionCall<WhiteGearedCipherCB, UpdateOption<WhiteGearedCipherCB>> opLambda) {
        doUpdate(whiteGearedCipher, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteGearedCipher The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteGearedCipher whiteGearedCipher, WOptionCall<WhiteGearedCipherCB, InsertOption<WhiteGearedCipherCB>> insertOpLambda, WOptionCall<WhiteGearedCipherCB, UpdateOption<WhiteGearedCipherCB>> updateOpLambda) {
        doInsertOrUpdate(whiteGearedCipher, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteGearedCipher The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteGearedCipher whiteGearedCipher, WOptionCall<WhiteGearedCipherCB, DeleteOption<WhiteGearedCipherCB>> opLambda) {
        doDelete(whiteGearedCipher, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteGearedCipherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteGearedCipher> whiteGearedCipherList, WOptionCall<WhiteGearedCipherCB, InsertOption<WhiteGearedCipherCB>> opLambda) {
        return doBatchInsert(whiteGearedCipherList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteGearedCipherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteGearedCipher> whiteGearedCipherList, WOptionCall<WhiteGearedCipherCB, UpdateOption<WhiteGearedCipherCB>> opLambda) {
        return doBatchUpdate(whiteGearedCipherList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteGearedCipherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteGearedCipher> whiteGearedCipherList, WOptionCall<WhiteGearedCipherCB, DeleteOption<WhiteGearedCipherCB>> opLambda) {
        return doBatchDelete(whiteGearedCipherList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteGearedCipher, WhiteGearedCipherCB> manyArgLambda, WOptionCall<WhiteGearedCipherCB, InsertOption<WhiteGearedCipherCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setPK...(value);</span>
     * whiteGearedCipher.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setVersionNo(value);</span>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteGearedCipherCB&gt; option = new UpdateOption&lt;WhiteGearedCipherCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void specify(WhiteGearedCipherCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteGearedCipherBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteGearedCipher, cb, option);
     * </pre>
     * @param whiteGearedCipher The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteGearedCipher whiteGearedCipher, CBCall<WhiteGearedCipherCB> cbLambda, WOptionCall<WhiteGearedCipherCB, UpdateOption<WhiteGearedCipherCB>> opLambda) {
        return doQueryUpdate(whiteGearedCipher, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteGearedCipher whiteGearedCipher = new WhiteGearedCipher();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setPK...(value);</span>
     * whiteGearedCipher.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteGearedCipher.setVersionNo(value);</span>
     * WhiteGearedCipherCB cb = new WhiteGearedCipherCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteGearedCipherCB&gt; option = new UpdateOption&lt;WhiteGearedCipherCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void specify(WhiteGearedCipherCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteGearedCipherBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteGearedCipher, cb, option);
     * </pre>
     * @param whiteGearedCipher The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteGearedCipher whiteGearedCipher, WhiteGearedCipherCB cb, WOptionCall<WhiteGearedCipherCB, UpdateOption<WhiteGearedCipherCB>> opLambda) {
        return doQueryUpdate(whiteGearedCipher, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteGearedCipher. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteGearedCipherCB> cbLambda, WOptionCall<WhiteGearedCipherCB, DeleteOption<WhiteGearedCipherCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteGearedCipher. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteGearedCipherCB cb, WOptionCall<WhiteGearedCipherCB, DeleteOption<WhiteGearedCipherCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteGearedCipherBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteGearedCipherBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteGearedCipherBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteGearedCipherBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteGearedCipherBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteGearedCipherBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteGearedCipherBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteGearedCipherBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteGearedCipherBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteGearedCipherBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteGearedCipherBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteGearedCipherBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteGearedCipherBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteGearedCipherBhv.outideSql().removeBlockComment().selectList()
     * whiteGearedCipherBhv.outideSql().removeLineComment().selectList()
     * whiteGearedCipherBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteGearedCipherBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteGearedCipherBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteGearedCipher> typeOfSelectedEntity() { return WhiteGearedCipher.class; }
    protected Class<WhiteGearedCipher> typeOfHandlingEntity() { return WhiteGearedCipher.class; }
    protected Class<WhiteGearedCipherCB> typeOfHandlingConditionBean() { return WhiteGearedCipherCB.class; }
}
