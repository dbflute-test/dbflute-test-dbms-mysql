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
package org.docksidestage.mysql.dbflute.immuhama.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.*;

/**
 * The abstract condition-query of region.
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuAbstractBsRegionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuAbstractBsRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return ImmuDBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "region";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @param regionId The value of regionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    protected void setRegionId_Equal(Integer regionId) {
        doSetRegionId_Equal(regionId);
    }

    /**
     * Equal(=). As Region. And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region} <br>
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRegionId_Equal_AsRegion(ImmuCDef.Region cdef) {
        doSetRegionId_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    protected void doSetRegionId_Equal(Integer regionId) {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @param regionId The value of regionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    protected void setRegionId_NotEqual(Integer regionId) {
        doSetRegionId_NotEqual(regionId);
    }

    /**
     * NotEqual(&lt;&gt;). As Region. And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region} <br>
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRegionId_NotEqual_AsRegion(ImmuCDef.Region cdef) {
        doSetRegionId_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    protected void doSetRegionId_NotEqual(Integer regionId) {
        regRegionId(CK_NES, regionId);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @param regionIdList The collection of regionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setRegionId_InScope(Collection<Integer> regionIdList) {
        doSetRegionId_InScope(regionIdList);
    }

    /**
     * InScope {in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region} <br>
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionId_InScope_AsRegion(Collection<ImmuCDef.Region> cdefList) {
        doSetRegionId_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetRegionId_InScope(Collection<Integer> regionIdList) {
        regINS(CK_INS, cTL(regionIdList), xgetCValueRegionId(), "REGION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @param regionIdList The collection of regionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setRegionId_NotInScope(Collection<Integer> regionIdList) {
        doSetRegionId_NotInScope(regionIdList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region} <br>
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionId_NotInScope_AsRegion(Collection<ImmuCDef.Region> cdefList) {
        doSetRegionId_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetRegionId_NotInScope(Collection<Integer> regionIdList) {
        regINS(CK_NINS, cTL(regionIdList), xgetCValueRegionId(), "REGION_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REGION_ID from member_address where ...)} <br>
     * (会員住所情報)member_address by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberAddress</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddress(SubQuery<ImmuMemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRegionId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_ExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REGION_ID from member_address where ...)} <br>
     * (会員住所情報)member_address by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberAddress</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RegionId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddress(SubQuery<ImmuMemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRegionId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotExistsReferrer_MemberAddressList(ImmuMemberAddressCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<ImmuMemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRegionId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList", al, op);
    }
    public abstract String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_address where ...)} <br>
     * (会員住所情報)member_address by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberAddress()</span>.<span style="color: #CC4747">max</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     addressCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     addressCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ImmuMemberAddressCB> derivedMemberAddress() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<ImmuMemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberAddressList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<ImmuMemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuMemberAddressCB cb = new ImmuMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRegionId_QueryDerivedReferrer_MemberAddressList(cb.query()); String prpp = keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressList(ImmuMemberAddressCQ sq);
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     */
    public void setRegionId_IsNull() { regRegionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     */
    public void setRegionId_IsNotNull() { regRegionId(CK_ISNN, DOBJ); }

    protected void regRegionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegionId(), "REGION_ID"); }
    protected abstract ConditionValue xgetCValueRegionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_Equal(String regionName) {
        doSetRegionName_Equal(fRES(regionName));
    }

    protected void doSetRegionName_Equal(String regionName) {
        regRegionName(CK_EQ, regionName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_NotEqual(String regionName) {
        doSetRegionName_NotEqual(fRES(regionName));
    }

    protected void doSetRegionName_NotEqual(String regionName) {
        regRegionName(CK_NES, regionName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_GreaterThan(String regionName) {
        regRegionName(CK_GT, fRES(regionName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_LessThan(String regionName) {
        regRegionName(CK_LT, fRES(regionName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_GreaterEqual(String regionName) {
        regRegionName(CK_GE, fRES(regionName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_LessEqual(String regionName) {
        regRegionName(CK_LE, fRES(regionName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionNameList The collection of regionName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_InScope(Collection<String> regionNameList) {
        doSetRegionName_InScope(regionNameList);
    }

    protected void doSetRegionName_InScope(Collection<String> regionNameList) {
        regINS(CK_INS, cTL(regionNameList), xgetCValueRegionName(), "REGION_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionNameList The collection of regionName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionName_NotInScope(Collection<String> regionNameList) {
        doSetRegionName_NotInScope(regionNameList);
    }

    protected void doSetRegionName_NotInScope(Collection<String> regionNameList) {
        regINS(CK_NINS, cTL(regionNameList), xgetCValueRegionName(), "REGION_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setRegionName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regionName The value of regionName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegionName_LikeSearch(String regionName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegionName_LikeSearch(regionName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setRegionName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regionName The value of regionName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegionName_LikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regionName), xgetCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegionName_NotLikeSearch(String regionName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegionName_NotLikeSearch(regionName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegionName_NotLikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regionName), xgetCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    protected void regRegionName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegionName(), "REGION_NAME"); }
    protected abstract ConditionValue xgetCValueRegionName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuRegionCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ImmuRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuRegionCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ImmuRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuRegionCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ImmuRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuRegionCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ImmuRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuRegionCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ImmuRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImmuRegionCB&gt;() {
     *     public void query(ImmuRegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ImmuRegionCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ImmuRegionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuRegionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ImmuRegionCQ sq);

    protected ImmuRegionCB xcreateScalarConditionCB() {
        ImmuRegionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ImmuRegionCB xcreateScalarConditionPartitionByCB() {
        ImmuRegionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ImmuRegionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuRegionCB cb = new ImmuRegionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REGION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ImmuRegionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImmuRegionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ImmuRegionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ImmuRegionCB cb = new ImmuRegionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REGION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ImmuRegionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ImmuRegionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ImmuRegionCB cb = new ImmuRegionCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ImmuRegionCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ImmuRegionCB newMyCB() {
        return new ImmuRegionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ImmuRegionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
