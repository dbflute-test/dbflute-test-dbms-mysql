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
 * The abstract condition-query of white_cls_no_camelizing.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteClsNoCamelizingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteClsNoCamelizingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_cls_no_camelizing";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     * @param noCamelizingCode The value of noCamelizingCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setNoCamelizingCode_Equal(String noCamelizingCode) {
        doSetNoCamelizingCode_Equal(fRES(noCamelizingCode));
    }

    /**
     * Equal(=). As NamingDefaultCamelizingType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * no camelizing classification
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoCamelizingCode_Equal_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType cdef) {
        doSetNoCamelizingCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Bonvo (BONVO). And OnlyOnceRegistered. <br>
     * Bonvo
     */
    public void setNoCamelizingCode_Equal_Bonvo() {
        setNoCamelizingCode_Equal_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Bonvo);
    }

    /**
     * Equal(=). As Dstore (DSTORE). And OnlyOnceRegistered. <br>
     * dstore
     */
    public void setNoCamelizingCode_Equal_Dstore() {
        setNoCamelizingCode_Equal_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Dstore);
    }

    /**
     * Equal(=). As LAND陸oneman (LAND). And OnlyOnceRegistered. <br>
     * LAND陸oneman
     */
    public void setNoCamelizingCode_Equal_LAND陸oneman() {
        setNoCamelizingCode_Equal_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.LAND陸oneman);
    }

    /**
     * Equal(=). As PiArI (PIARI). And OnlyOnceRegistered. <br>
     * PI AR-I
     */
    public void setNoCamelizingCode_Equal_PiArI() {
        setNoCamelizingCode_Equal_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.PiArI);
    }

    /**
     * Equal(=). As Sea海mystic (SEA). And OnlyOnceRegistered. <br>
     * SEA海MYSTIC
     */
    public void setNoCamelizingCode_Equal_Sea海mystic() {
        setNoCamelizingCode_Equal_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Sea海mystic);
    }

    protected void doSetNoCamelizingCode_Equal(String noCamelizingCode) {
        regNoCamelizingCode(CK_EQ, noCamelizingCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     * @param noCamelizingCode The value of noCamelizingCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setNoCamelizingCode_NotEqual(String noCamelizingCode) {
        doSetNoCamelizingCode_NotEqual(fRES(noCamelizingCode));
    }

    /**
     * NotEqual(&lt;&gt;). As NamingDefaultCamelizingType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * no camelizing classification
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoCamelizingCode_NotEqual_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType cdef) {
        doSetNoCamelizingCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Bonvo (BONVO). And OnlyOnceRegistered. <br>
     * Bonvo
     */
    public void setNoCamelizingCode_NotEqual_Bonvo() {
        setNoCamelizingCode_NotEqual_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Bonvo);
    }

    /**
     * NotEqual(&lt;&gt;). As Dstore (DSTORE). And OnlyOnceRegistered. <br>
     * dstore
     */
    public void setNoCamelizingCode_NotEqual_Dstore() {
        setNoCamelizingCode_NotEqual_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Dstore);
    }

    /**
     * NotEqual(&lt;&gt;). As LAND陸oneman (LAND). And OnlyOnceRegistered. <br>
     * LAND陸oneman
     */
    public void setNoCamelizingCode_NotEqual_LAND陸oneman() {
        setNoCamelizingCode_NotEqual_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.LAND陸oneman);
    }

    /**
     * NotEqual(&lt;&gt;). As PiArI (PIARI). And OnlyOnceRegistered. <br>
     * PI AR-I
     */
    public void setNoCamelizingCode_NotEqual_PiArI() {
        setNoCamelizingCode_NotEqual_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.PiArI);
    }

    /**
     * NotEqual(&lt;&gt;). As Sea海mystic (SEA). And OnlyOnceRegistered. <br>
     * SEA海MYSTIC
     */
    public void setNoCamelizingCode_NotEqual_Sea海mystic() {
        setNoCamelizingCode_NotEqual_AsNamingDefaultCamelizingType(CDef.NamingDefaultCamelizingType.Sea海mystic);
    }

    protected void doSetNoCamelizingCode_NotEqual(String noCamelizingCode) {
        regNoCamelizingCode(CK_NES, noCamelizingCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     * @param noCamelizingCodeList The collection of noCamelizingCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setNoCamelizingCode_InScope(Collection<String> noCamelizingCodeList) {
        doSetNoCamelizingCode_InScope(noCamelizingCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As NamingDefaultCamelizingType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * no camelizing classification
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNoCamelizingCode_InScope_AsNamingDefaultCamelizingType(Collection<CDef.NamingDefaultCamelizingType> cdefList) {
        doSetNoCamelizingCode_InScope(cTStrL(cdefList));
    }

    protected void doSetNoCamelizingCode_InScope(Collection<String> noCamelizingCodeList) {
        regINS(CK_INS, cTL(noCamelizingCodeList), xgetCValueNoCamelizingCode(), "NO_CAMELIZING_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     * @param noCamelizingCodeList The collection of noCamelizingCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setNoCamelizingCode_NotInScope(Collection<String> noCamelizingCodeList) {
        doSetNoCamelizingCode_NotInScope(noCamelizingCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As NamingDefaultCamelizingType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType} <br>
     * no camelizing classification
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNoCamelizingCode_NotInScope_AsNamingDefaultCamelizingType(Collection<CDef.NamingDefaultCamelizingType> cdefList) {
        doSetNoCamelizingCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetNoCamelizingCode_NotInScope(Collection<String> noCamelizingCodeList) {
        regINS(CK_NINS, cTL(noCamelizingCodeList), xgetCValueNoCamelizingCode(), "NO_CAMELIZING_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     */
    public void setNoCamelizingCode_IsNull() { regNoCamelizingCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     */
    public void setNoCamelizingCode_IsNotNull() { regNoCamelizingCode(CK_ISNN, DOBJ); }

    protected void regNoCamelizingCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoCamelizingCode(), "NO_CAMELIZING_CODE"); }
    protected abstract ConditionValue xgetCValueNoCamelizingCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @param noCamelizingName The value of noCamelizingName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoCamelizingName_Equal(String noCamelizingName) {
        doSetNoCamelizingName_Equal(fRES(noCamelizingName));
    }

    protected void doSetNoCamelizingName_Equal(String noCamelizingName) {
        regNoCamelizingName(CK_EQ, noCamelizingName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @param noCamelizingName The value of noCamelizingName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoCamelizingName_NotEqual(String noCamelizingName) {
        doSetNoCamelizingName_NotEqual(fRES(noCamelizingName));
    }

    protected void doSetNoCamelizingName_NotEqual(String noCamelizingName) {
        regNoCamelizingName(CK_NES, noCamelizingName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @param noCamelizingNameList The collection of noCamelizingName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoCamelizingName_InScope(Collection<String> noCamelizingNameList) {
        doSetNoCamelizingName_InScope(noCamelizingNameList);
    }

    protected void doSetNoCamelizingName_InScope(Collection<String> noCamelizingNameList) {
        regINS(CK_INS, cTL(noCamelizingNameList), xgetCValueNoCamelizingName(), "NO_CAMELIZING_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @param noCamelizingNameList The collection of noCamelizingName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNoCamelizingName_NotInScope(Collection<String> noCamelizingNameList) {
        doSetNoCamelizingName_NotInScope(noCamelizingNameList);
    }

    protected void doSetNoCamelizingName_NotInScope(Collection<String> noCamelizingNameList) {
        regINS(CK_NINS, cTL(noCamelizingNameList), xgetCValueNoCamelizingName(), "NO_CAMELIZING_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)} <br>
     * <pre>e.g. setNoCamelizingName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param noCamelizingName The value of noCamelizingName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNoCamelizingName_LikeSearch(String noCamelizingName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNoCamelizingName_LikeSearch(noCamelizingName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)} <br>
     * <pre>e.g. setNoCamelizingName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noCamelizingName The value of noCamelizingName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoCamelizingName_LikeSearch(String noCamelizingName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noCamelizingName), xgetCValueNoCamelizingName(), "NO_CAMELIZING_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @param noCamelizingName The value of noCamelizingName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNoCamelizingName_NotLikeSearch(String noCamelizingName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNoCamelizingName_NotLikeSearch(noCamelizingName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @param noCamelizingName The value of noCamelizingName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoCamelizingName_NotLikeSearch(String noCamelizingName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noCamelizingName), xgetCValueNoCamelizingName(), "NO_CAMELIZING_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     */
    public void setNoCamelizingName_IsNull() { regNoCamelizingName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     */
    public void setNoCamelizingName_IsNullOrEmpty() { regNoCamelizingName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     */
    public void setNoCamelizingName_IsNotNull() { regNoCamelizingName(CK_ISNN, DOBJ); }

    protected void regNoCamelizingName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoCamelizingName(), "NO_CAMELIZING_NAME"); }
    protected abstract ConditionValue xgetCValueNoCamelizingName();

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
    public HpSLCFunction<WhiteClsNoCamelizingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteClsNoCamelizingCB.class);
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
    public HpSLCFunction<WhiteClsNoCamelizingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteClsNoCamelizingCB.class);
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
    public HpSLCFunction<WhiteClsNoCamelizingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteClsNoCamelizingCB.class);
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
    public HpSLCFunction<WhiteClsNoCamelizingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteClsNoCamelizingCB.class);
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
    public HpSLCFunction<WhiteClsNoCamelizingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteClsNoCamelizingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteClsNoCamelizingCB&gt;() {
     *     public void query(WhiteClsNoCamelizingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteClsNoCamelizingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteClsNoCamelizingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteClsNoCamelizingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteClsNoCamelizingCQ sq);

    protected WhiteClsNoCamelizingCB xcreateScalarConditionCB() {
        WhiteClsNoCamelizingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteClsNoCamelizingCB xcreateScalarConditionPartitionByCB() {
        WhiteClsNoCamelizingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteClsNoCamelizingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteClsNoCamelizingCB cb = new WhiteClsNoCamelizingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NO_CAMELIZING_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteClsNoCamelizingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteClsNoCamelizingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteClsNoCamelizingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteClsNoCamelizingCB cb = new WhiteClsNoCamelizingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NO_CAMELIZING_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteClsNoCamelizingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteClsNoCamelizingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteClsNoCamelizingCB cb = new WhiteClsNoCamelizingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteClsNoCamelizingCQ sq);

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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected WhiteClsNoCamelizingCB newMyCB() {
        return new WhiteClsNoCamelizingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteClsNoCamelizingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
