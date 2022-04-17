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
package org.docksidestage.mysql.dbflute.immuhama.bsbhv;

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
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.bsbhv.loader.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;
import org.docksidestage.mysql.dbflute.immuhama.bsentity.dbmeta.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;

/**
 * The behavior of ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     CDEF_PRODUCT_CATEGORY
 *
 * [referrer table]
 *     CDEF_PRODUCT_CATEGORY, PRODUCT_DETAIL
 *
 * [foreign property]
 *     cdefProductCategorySelf
 *
 * [referrer property]
 *     cdefProductCategorySelfList, productDetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsCdefProductCategoryBhv extends AbstractBehaviorWritable<ImmuCdefProductCategory, ImmuCdefProductCategoryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public ImmuCdefProductCategoryDbm asDBMeta() { return ImmuCdefProductCategoryDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "cdef_product_category"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public ImmuCdefProductCategoryCB newConditionBean() { return new ImmuCdefProductCategoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">cdefProductCategory</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">cdefProductCategory</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">cdefProductCategory</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">cdefProductCategory</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuCdefProductCategory> selectEntity(CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<ImmuCdefProductCategory> facadeSelectEntity(ImmuCdefProductCategoryCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuCdefProductCategory> OptionalEntity<ENTITY> doSelectOptionalEntity(ImmuCdefProductCategoryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * ImmuCdefProductCategory <span style="color: #553000">cdefProductCategory</span> = <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">cdefProductCategory</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImmuCdefProductCategory selectEntityWithDeletedCheck(CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productCategoryCode (商品カテゴリコード): PK, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<ImmuCdefProductCategory> selectByPK(String productCategoryCode) {
        return facadeSelectByPK(productCategoryCode);
    }

    protected OptionalEntity<ImmuCdefProductCategory> facadeSelectByPK(String productCategoryCode) {
        return doSelectOptionalByPK(productCategoryCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends ImmuCdefProductCategory> ENTITY doSelectByPK(String productCategoryCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productCategoryCode), tp);
    }

    protected <ENTITY extends ImmuCdefProductCategory> OptionalEntity<ENTITY> doSelectOptionalByPK(String productCategoryCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productCategoryCode, tp), productCategoryCode);
    }

    protected ImmuCdefProductCategoryCB xprepareCBAsPK(String productCategoryCode) {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        return newConditionBean().acceptPK(productCategoryCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;ImmuCdefProductCategory&gt; <span style="color: #553000">cdefProductCategoryList</span> = <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (ImmuCdefProductCategory <span style="color: #553000">cdefProductCategory</span> : <span style="color: #553000">cdefProductCategoryList</span>) {
     *     ... = <span style="color: #553000">cdefProductCategory</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImmuCdefProductCategory> selectList(CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;ImmuCdefProductCategory&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (ImmuCdefProductCategory cdefProductCategory : <span style="color: #553000">page</span>) {
     *     ... = cdefProductCategory.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImmuCdefProductCategory> selectPage(CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @param entityLambda The handler of entity row of ImmuCdefProductCategory. (NotNull)
     */
    public void selectCursor(CBCall<ImmuCdefProductCategoryCB> cbLambda, EntityRowHandler<ImmuCdefProductCategory> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<ImmuCdefProductCategoryCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param cdefProductCategoryList The entity list of cdefProductCategory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<ImmuCdefProductCategory> cdefProductCategoryList, ReferrerLoaderHandler<ImmuLoaderOfCdefProductCategory> loaderLambda) {
        xassLRArg(cdefProductCategoryList, loaderLambda);
        loaderLambda.handle(new ImmuLoaderOfCdefProductCategory().ready(cdefProductCategoryList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param cdefProductCategory The entity of cdefProductCategory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(ImmuCdefProductCategory cdefProductCategory, ReferrerLoaderHandler<ImmuLoaderOfCdefProductCategory> loaderLambda) {
        xassLRArg(cdefProductCategory, loaderLambda);
        loaderLambda.handle(new ImmuLoaderOfCdefProductCategory().ready(xnewLRAryLs(cdefProductCategory), _behaviorSelector));
    }

    /**
     * Load referrer of cdefProductCategorySelfList by the set-upper of referrer. <br>
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">loadCdefProductCategorySelf</span>(<span style="color: #553000">cdefProductCategoryList</span>, <span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryCB</span>.setupSelect...
     *     <span style="color: #553000">categoryCB</span>.query().set...
     *     <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuCdefProductCategory cdefProductCategory : <span style="color: #553000">cdefProductCategoryList</span>) {
     *     ... = cdefProductCategory.<span style="color: #CC4747">getCdefProductCategorySelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param cdefProductCategoryList The entity list of cdefProductCategory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuCdefProductCategory> loadCdefProductCategorySelf(List<ImmuCdefProductCategory> cdefProductCategoryList, ReferrerConditionSetupper<ImmuCdefProductCategoryCB> refCBLambda) {
        xassLRArg(cdefProductCategoryList, refCBLambda);
        return doLoadCdefProductCategorySelf(cdefProductCategoryList, new LoadReferrerOption<ImmuCdefProductCategoryCB, ImmuCdefProductCategory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of cdefProductCategorySelfList by the set-upper of referrer. <br>
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">loadCdefProductCategorySelf</span>(<span style="color: #553000">cdefProductCategory</span>, <span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryCB</span>.setupSelect...
     *     <span style="color: #553000">categoryCB</span>.query().set...
     *     <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">cdefProductCategory</span>.<span style="color: #CC4747">getCdefProductCategorySelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param cdefProductCategory The entity of cdefProductCategory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuCdefProductCategory> loadCdefProductCategorySelf(ImmuCdefProductCategory cdefProductCategory, ReferrerConditionSetupper<ImmuCdefProductCategoryCB> refCBLambda) {
        xassLRArg(cdefProductCategory, refCBLambda);
        return doLoadCdefProductCategorySelf(xnewLRLs(cdefProductCategory), new LoadReferrerOption<ImmuCdefProductCategoryCB, ImmuCdefProductCategory>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuCdefProductCategory> doLoadCdefProductCategorySelf(List<ImmuCdefProductCategory> cdefProductCategoryList, LoadReferrerOption<ImmuCdefProductCategoryCB, ImmuCdefProductCategory> option) {
        return helpLoadReferrerInternally(cdefProductCategoryList, option, "cdefProductCategorySelfList");
    }

    /**
     * Load referrer of productDetailList by the set-upper of referrer. <br>
     * (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">loadProductDetail</span>(<span style="color: #553000">cdefProductCategoryList</span>, <span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">detailCB</span>.setupSelect...
     *     <span style="color: #553000">detailCB</span>.query().set...
     *     <span style="color: #553000">detailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (ImmuCdefProductCategory cdefProductCategory : <span style="color: #553000">cdefProductCategoryList</span>) {
     *     ... = cdefProductCategory.<span style="color: #CC4747">getProductDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param cdefProductCategoryList The entity list of cdefProductCategory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuProductDetail> loadProductDetail(List<ImmuCdefProductCategory> cdefProductCategoryList, ReferrerConditionSetupper<ImmuProductDetailCB> refCBLambda) {
        xassLRArg(cdefProductCategoryList, refCBLambda);
        return doLoadProductDetail(cdefProductCategoryList, new LoadReferrerOption<ImmuProductDetailCB, ImmuProductDetail>().xinit(refCBLambda));
    }

    /**
     * Load referrer of productDetailList by the set-upper of referrer. <br>
     * (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'.
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">loadProductDetail</span>(<span style="color: #553000">cdefProductCategory</span>, <span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">detailCB</span>.setupSelect...
     *     <span style="color: #553000">detailCB</span>.query().set...
     *     <span style="color: #553000">detailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">cdefProductCategory</span>.<span style="color: #CC4747">getProductDetailList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param cdefProductCategory The entity of cdefProductCategory. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<ImmuProductDetail> loadProductDetail(ImmuCdefProductCategory cdefProductCategory, ReferrerConditionSetupper<ImmuProductDetailCB> refCBLambda) {
        xassLRArg(cdefProductCategory, refCBLambda);
        return doLoadProductDetail(xnewLRLs(cdefProductCategory), new LoadReferrerOption<ImmuProductDetailCB, ImmuProductDetail>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<ImmuProductDetail> doLoadProductDetail(List<ImmuCdefProductCategory> cdefProductCategoryList, LoadReferrerOption<ImmuProductDetailCB, ImmuProductDetail> option) {
        return helpLoadReferrerInternally(cdefProductCategoryList, option, "productDetailList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'ImmuCdefProductCategory'.
     * @param cdefProductCategoryList The list of cdefProductCategory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ImmuCdefProductCategory> pulloutCdefProductCategorySelf(List<ImmuCdefProductCategory> cdefProductCategoryList)
    { return helpPulloutInternally(cdefProductCategoryList, "cdefProductCategorySelf"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productCategoryCode.
     * @param cdefProductCategoryList The list of cdefProductCategory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductCategoryCodeList(List<ImmuCdefProductCategory> cdefProductCategoryList)
    { return helpExtractListInternally(cdefProductCategoryList, "productCategoryCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cdefProductCategory.setFoo...(value);
     * cdefProductCategory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.set...;</span>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">insert</span>(cdefProductCategory);
     * ... = cdefProductCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param cdefProductCategory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(ImmuCdefProductCategory cdefProductCategory) {
        doInsert(cdefProductCategory, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * cdefProductCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cdefProductCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cdefProductCategory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">update</span>(cdefProductCategory);
     * </pre>
     * @param cdefProductCategory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(ImmuCdefProductCategory cdefProductCategory) {
        doUpdate(cdefProductCategory, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param cdefProductCategory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(ImmuCdefProductCategory cdefProductCategory) {
        doInsertOrUpdate(cdefProductCategory, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * cdefProductCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cdefProductCategory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">delete</span>(cdefProductCategory);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param cdefProductCategory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(ImmuCdefProductCategory cdefProductCategory) {
        doDelete(cdefProductCategory, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     *     cdefProductCategory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cdefProductCategory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     cdefProductCategoryList.add(cdefProductCategory);
     * }
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">batchInsert</span>(cdefProductCategoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param cdefProductCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<ImmuCdefProductCategory> cdefProductCategoryList) {
        return doBatchInsert(cdefProductCategoryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     *     cdefProductCategory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         cdefProductCategory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         cdefProductCategory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//cdefProductCategory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     cdefProductCategoryList.add(cdefProductCategory);
     * }
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(cdefProductCategoryList);
     * </pre>
     * @param cdefProductCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<ImmuCdefProductCategory> cdefProductCategoryList) {
        return doBatchUpdate(cdefProductCategoryList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param cdefProductCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<ImmuCdefProductCategory> cdefProductCategoryList) {
        return doBatchDelete(cdefProductCategoryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;ImmuCdefProductCategory, ImmuCdefProductCategoryCB&gt;() {
     *     public ConditionBean setup(ImmuCdefProductCategory entity, ImmuCdefProductCategoryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<ImmuCdefProductCategory, ImmuCdefProductCategoryCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setPK...(value);</span>
     * cdefProductCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setVersionNo(value);</span>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">queryUpdate</span>(cdefProductCategory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cdefProductCategory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(ImmuCdefProductCategory cdefProductCategory, CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return doQueryUpdate(cdefProductCategory, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">queryDelete</span>(cdefProductCategory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<ImmuCdefProductCategoryCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * cdefProductCategory.setFoo...(value);
     * cdefProductCategory.setBar...(value);
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">varyingInsert</span>(cdefProductCategory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = cdefProductCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param cdefProductCategory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(ImmuCdefProductCategory cdefProductCategory, WritableOptionCall<ImmuCdefProductCategoryCB, InsertOption<ImmuCdefProductCategoryCB>> opLambda) {
        doInsert(cdefProductCategory, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * cdefProductCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * cdefProductCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * cdefProductCategory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(cdefProductCategory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param cdefProductCategory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(ImmuCdefProductCategory cdefProductCategory, WritableOptionCall<ImmuCdefProductCategoryCB, UpdateOption<ImmuCdefProductCategoryCB>> opLambda) {
        doUpdate(cdefProductCategory, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param cdefProductCategory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(ImmuCdefProductCategory cdefProductCategory, WritableOptionCall<ImmuCdefProductCategoryCB, InsertOption<ImmuCdefProductCategoryCB>> insertOpLambda, WritableOptionCall<ImmuCdefProductCategoryCB, UpdateOption<ImmuCdefProductCategoryCB>> updateOpLambda) {
        doInsertOrUpdate(cdefProductCategory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param cdefProductCategory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(ImmuCdefProductCategory cdefProductCategory, WritableOptionCall<ImmuCdefProductCategoryCB, DeleteOption<ImmuCdefProductCategoryCB>> opLambda) {
        doDelete(cdefProductCategory, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param cdefProductCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<ImmuCdefProductCategory> cdefProductCategoryList, WritableOptionCall<ImmuCdefProductCategoryCB, InsertOption<ImmuCdefProductCategoryCB>> opLambda) {
        return doBatchInsert(cdefProductCategoryList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param cdefProductCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<ImmuCdefProductCategory> cdefProductCategoryList, WritableOptionCall<ImmuCdefProductCategoryCB, UpdateOption<ImmuCdefProductCategoryCB>> opLambda) {
        return doBatchUpdate(cdefProductCategoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param cdefProductCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<ImmuCdefProductCategory> cdefProductCategoryList, WritableOptionCall<ImmuCdefProductCategoryCB, DeleteOption<ImmuCdefProductCategoryCB>> opLambda) {
        return doBatchDelete(cdefProductCategoryList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<ImmuCdefProductCategory, ImmuCdefProductCategoryCB> manyArgLambda, WritableOptionCall<ImmuCdefProductCategoryCB, InsertOption<ImmuCdefProductCategoryCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ImmuCdefProductCategory cdefProductCategory = <span style="color: #70226C">new</span> ImmuCdefProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setPK...(value);</span>
     * cdefProductCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//cdefProductCategory.setVersionNo(value);</span>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(cdefProductCategory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param cdefProductCategory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(ImmuCdefProductCategory cdefProductCategory, CBCall<ImmuCdefProductCategoryCB> cbLambda, WritableOptionCall<ImmuCdefProductCategoryCB, UpdateOption<ImmuCdefProductCategoryCB>> opLambda) {
        return doQueryUpdate(cdefProductCategory, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">cdefProductCategoryBhv</span>.<span style="color: #CC4747">queryDelete</span>(cdefProductCategory, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of ImmuCdefProductCategory. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<ImmuCdefProductCategoryCB> cbLambda, WritableOptionCall<ImmuCdefProductCategoryCB, DeleteOption<ImmuCdefProductCategoryCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * cdefProductCategoryBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * cdefProductCategoryBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cdefProductCategoryBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * cdefProductCategoryBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * cdefProductCategoryBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * cdefProductCategoryBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * cdefProductCategoryBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * cdefProductCategoryBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * cdefProductCategoryBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * cdefProductCategoryBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * cdefProductCategoryBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * cdefProductCategoryBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * cdefProductCategoryBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * cdefProductCategoryBhv.outideSql().removeBlockComment().selectList()
     * cdefProductCategoryBhv.outideSql().removeLineComment().selectList()
     * cdefProductCategoryBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<ImmuCdefProductCategoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends ImmuCdefProductCategory> typeOfSelectedEntity() { return ImmuCdefProductCategory.class; }
    protected Class<ImmuCdefProductCategory> typeOfHandlingEntity() { return ImmuCdefProductCategory.class; }
    protected Class<ImmuCdefProductCategoryCB> typeOfHandlingConditionBean() { return ImmuCdefProductCategoryCB.class; }
}
