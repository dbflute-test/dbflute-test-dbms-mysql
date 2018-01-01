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
package org.docksidestage.mysql.dbflute.cbean.cq.bs;

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
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_perrotta_over_member_macho.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePerrottaOverMemberMachoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePerrottaOverMemberMachoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "white_perrotta_over_member_macho";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoCode_Equal(String machoCode) {
        doSetMachoCode_Equal(fRES(machoCode));
    }

    protected void doSetMachoCode_Equal(String machoCode) {
        regMachoCode(CK_EQ, machoCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoCode_NotEqual(String machoCode) {
        doSetMachoCode_NotEqual(fRES(machoCode));
    }

    protected void doSetMachoCode_NotEqual(String machoCode) {
        regMachoCode(CK_NES, machoCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCodeList The collection of machoCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoCode_InScope(Collection<String> machoCodeList) {
        doSetMachoCode_InScope(machoCodeList);
    }

    protected void doSetMachoCode_InScope(Collection<String> machoCodeList) {
        regINS(CK_INS, cTL(machoCodeList), xgetCValueMachoCode(), "MACHO_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCodeList The collection of machoCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoCode_NotInScope(Collection<String> machoCodeList) {
        doSetMachoCode_NotInScope(machoCodeList);
    }

    protected void doSetMachoCode_NotInScope(Collection<String> machoCodeList) {
        regINS(CK_NINS, cTL(machoCodeList), xgetCValueMachoCode(), "MACHO_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setMachoCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param machoCode The value of machoCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMachoCode_LikeSearch(String machoCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMachoCode_LikeSearch(machoCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setMachoCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machoCode The value of machoCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachoCode_LikeSearch(String machoCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machoCode), xgetCValueMachoCode(), "MACHO_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMachoCode_NotLikeSearch(String machoCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMachoCode_NotLikeSearch(machoCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @param machoCode The value of machoCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachoCode_NotLikeSearch(String machoCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machoCode), xgetCValueMachoCode(), "MACHO_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MACHO_CODE from white_perrotta_over_member where ...)} <br>
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhitePerrottaOverMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhitePerrottaOverMemberList for 'exists'. (NotNull)
     */
    public void existsWhitePerrottaOverMember(SubQuery<WhitePerrottaOverMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMachoCode_ExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerExistsReferrer(cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepMachoCode_ExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MACHO_CODE from white_perrotta_over_member where ...)} <br>
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhitePerrottaOverMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MachoCode_NotExistsReferrer_WhitePerrottaOverMemberList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePerrottaOverMember(SubQuery<WhitePerrottaOverMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMachoCode_NotExistsReferrer_WhitePerrottaOverMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList");
    }
    public abstract String keepMachoCode_NotExistsReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    public void xsderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMachoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MACHO_CODE", "MACHO_CODE", pp, "whitePerrottaOverMemberList", al, op);
    }
    public abstract String keepMachoCode_SpecifyDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_perrotta_over_member where ...)} <br>
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhitePerrottaOverMember()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     memberCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverMemberCB> derivedWhitePerrottaOverMember() {
        return xcreateQDRFunctionWhitePerrottaOverMemberList();
    }
    protected HpQDRFunction<WhitePerrottaOverMemberCB> xcreateQDRFunctionWhitePerrottaOverMemberList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhitePerrottaOverMemberList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhitePerrottaOverMemberList(String fn, SubQuery<WhitePerrottaOverMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList(cb.query()); String prpp = keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MACHO_CODE", "MACHO_CODE", sqpp, "whitePerrottaOverMemberList", rd, vl, prpp, op);
    }
    public abstract String keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberList(WhitePerrottaOverMemberCQ sq);
    public abstract String keepMachoCode_QueryDerivedReferrer_WhitePerrottaOverMemberListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setMachoCode_IsNull() { regMachoCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setMachoCode_IsNotNull() { regMachoCode(CK_ISNN, DOBJ); }

    protected void regMachoCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachoCode(), "MACHO_CODE"); }
    protected abstract ConditionValue xgetCValueMachoCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoName_Equal(String machoName) {
        doSetMachoName_Equal(fRES(machoName));
    }

    protected void doSetMachoName_Equal(String machoName) {
        regMachoName(CK_EQ, machoName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoName_NotEqual(String machoName) {
        doSetMachoName_NotEqual(fRES(machoName));
    }

    protected void doSetMachoName_NotEqual(String machoName) {
        regMachoName(CK_NES, machoName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoNameList The collection of machoName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoName_InScope(Collection<String> machoNameList) {
        doSetMachoName_InScope(machoNameList);
    }

    protected void doSetMachoName_InScope(Collection<String> machoNameList) {
        regINS(CK_INS, cTL(machoNameList), xgetCValueMachoName(), "MACHO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoNameList The collection of machoName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachoName_NotInScope(Collection<String> machoNameList) {
        doSetMachoName_NotInScope(machoNameList);
    }

    protected void doSetMachoName_NotInScope(Collection<String> machoNameList) {
        regINS(CK_NINS, cTL(machoNameList), xgetCValueMachoName(), "MACHO_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMachoName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param machoName The value of machoName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMachoName_LikeSearch(String machoName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMachoName_LikeSearch(machoName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMachoName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machoName The value of machoName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachoName_LikeSearch(String machoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machoName), xgetCValueMachoName(), "MACHO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMachoName_NotLikeSearch(String machoName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMachoName_NotLikeSearch(machoName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @param machoName The value of machoName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachoName_NotLikeSearch(String machoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machoName), xgetCValueMachoName(), "MACHO_NAME", likeSearchOption);
    }

    protected void regMachoName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachoName(), "MACHO_NAME"); }
    protected abstract ConditionValue xgetCValueMachoName();

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
    public HpSLCFunction<WhitePerrottaOverMemberMachoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhitePerrottaOverMemberMachoCB.class);
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
    public HpSLCFunction<WhitePerrottaOverMemberMachoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhitePerrottaOverMemberMachoCB.class);
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
    public HpSLCFunction<WhitePerrottaOverMemberMachoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhitePerrottaOverMemberMachoCB.class);
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
    public HpSLCFunction<WhitePerrottaOverMemberMachoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhitePerrottaOverMemberMachoCB.class);
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
    public HpSLCFunction<WhitePerrottaOverMemberMachoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhitePerrottaOverMemberMachoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePerrottaOverMemberMachoCB&gt;() {
     *     public void query(WhitePerrottaOverMemberMachoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePerrottaOverMemberMachoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhitePerrottaOverMemberMachoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberMachoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhitePerrottaOverMemberMachoCQ sq);

    protected WhitePerrottaOverMemberMachoCB xcreateScalarConditionCB() {
        WhitePerrottaOverMemberMachoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePerrottaOverMemberMachoCB xcreateScalarConditionPartitionByCB() {
        WhitePerrottaOverMemberMachoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePerrottaOverMemberMachoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MACHO_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePerrottaOverMemberMachoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePerrottaOverMemberMachoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePerrottaOverMemberMachoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MACHO_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePerrottaOverMemberMachoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePerrottaOverMemberMachoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePerrottaOverMemberMachoCB cb = new WhitePerrottaOverMemberMachoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePerrottaOverMemberMachoCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br>
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

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
    protected WhitePerrottaOverMemberMachoCB newMyCB() {
        return new WhitePerrottaOverMemberMachoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePerrottaOverMemberMachoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
