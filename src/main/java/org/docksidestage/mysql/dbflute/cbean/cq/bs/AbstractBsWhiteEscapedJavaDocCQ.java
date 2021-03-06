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
 * The abstract condition-query of white_escaped_java_doc.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteEscapedJavaDocCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteEscapedJavaDocCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_escaped_java_doc";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCode The value of escapedJavaDocCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setEscapedJavaDocCode_Equal(String escapedJavaDocCode) {
        doSetEscapedJavaDocCode_Equal(fRES(escapedJavaDocCode));
    }

    /**
     * Equal(=). As EscapedJavaDocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEscapedJavaDocCode_Equal_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls cdef) {
        doSetEscapedJavaDocCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As First (FOO). And OnlyOnceRegistered. <br>
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&amp;
     */
    public void setEscapedJavaDocCode_Equal_First() {
        setEscapedJavaDocCode_Equal_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.First);
    }

    /**
     * Equal(=). As Second (BAR). And OnlyOnceRegistered. <br>
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&amp;
     */
    public void setEscapedJavaDocCode_Equal_Second() {
        setEscapedJavaDocCode_Equal_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.Second);
    }

    protected void doSetEscapedJavaDocCode_Equal(String escapedJavaDocCode) {
        regEscapedJavaDocCode(CK_EQ, escapedJavaDocCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCode The value of escapedJavaDocCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setEscapedJavaDocCode_NotEqual(String escapedJavaDocCode) {
        doSetEscapedJavaDocCode_NotEqual(fRES(escapedJavaDocCode));
    }

    /**
     * NotEqual(&lt;&gt;). As EscapedJavaDocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEscapedJavaDocCode_NotEqual_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls cdef) {
        doSetEscapedJavaDocCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As First (FOO). And OnlyOnceRegistered. <br>
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&amp;
     */
    public void setEscapedJavaDocCode_NotEqual_First() {
        setEscapedJavaDocCode_NotEqual_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.First);
    }

    /**
     * NotEqual(&lt;&gt;). As Second (BAR). And OnlyOnceRegistered. <br>
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&amp;
     */
    public void setEscapedJavaDocCode_NotEqual_Second() {
        setEscapedJavaDocCode_NotEqual_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.Second);
    }

    protected void doSetEscapedJavaDocCode_NotEqual(String escapedJavaDocCode) {
        regEscapedJavaDocCode(CK_NES, escapedJavaDocCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCodeList The collection of escapedJavaDocCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setEscapedJavaDocCode_InScope(Collection<String> escapedJavaDocCodeList) {
        doSetEscapedJavaDocCode_InScope(escapedJavaDocCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As EscapedJavaDocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEscapedJavaDocCode_InScope_AsEscapedJavaDocCls(Collection<CDef.EscapedJavaDocCls> cdefList) {
        doSetEscapedJavaDocCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As EscapedJavaDocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp; <br>
     * /*IF pmb.yourGroup&#42;/&gt;&lt;&amp; <br>
     * The group elements:[First, Second]
     */
    public void setEscapedJavaDocCode_InScope_LineGroup() {
        setEscapedJavaDocCode_InScope_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.listOfLineGroup());
    }

    protected void doSetEscapedJavaDocCode_InScope(Collection<String> escapedJavaDocCodeList) {
        regINS(CK_INS, cTL(escapedJavaDocCodeList), xgetCValueEscapedJavaDocCode(), "ESCAPED_JAVA_DOC_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCodeList The collection of escapedJavaDocCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setEscapedJavaDocCode_NotInScope(Collection<String> escapedJavaDocCodeList) {
        doSetEscapedJavaDocCode_NotInScope(escapedJavaDocCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EscapedJavaDocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEscapedJavaDocCode_NotInScope_AsEscapedJavaDocCls(Collection<CDef.EscapedJavaDocCls> cdefList) {
        doSetEscapedJavaDocCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEscapedJavaDocCode_NotInScope(Collection<String> escapedJavaDocCodeList) {
        regINS(CK_NINS, cTL(escapedJavaDocCodeList), xgetCValueEscapedJavaDocCode(), "ESCAPED_JAVA_DOC_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     */
    public void setEscapedJavaDocCode_IsNull() { regEscapedJavaDocCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     */
    public void setEscapedJavaDocCode_IsNotNull() { regEscapedJavaDocCode(CK_ISNN, DOBJ); }

    protected void regEscapedJavaDocCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEscapedJavaDocCode(), "ESCAPED_JAVA_DOC_CODE"); }
    protected abstract ConditionValue xgetCValueEscapedJavaDocCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEscapedJavaDocName_Equal(String escapedJavaDocName) {
        doSetEscapedJavaDocName_Equal(fRES(escapedJavaDocName));
    }

    protected void doSetEscapedJavaDocName_Equal(String escapedJavaDocName) {
        regEscapedJavaDocName(CK_EQ, escapedJavaDocName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEscapedJavaDocName_NotEqual(String escapedJavaDocName) {
        doSetEscapedJavaDocName_NotEqual(fRES(escapedJavaDocName));
    }

    protected void doSetEscapedJavaDocName_NotEqual(String escapedJavaDocName) {
        regEscapedJavaDocName(CK_NES, escapedJavaDocName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocNameList The collection of escapedJavaDocName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEscapedJavaDocName_InScope(Collection<String> escapedJavaDocNameList) {
        doSetEscapedJavaDocName_InScope(escapedJavaDocNameList);
    }

    protected void doSetEscapedJavaDocName_InScope(Collection<String> escapedJavaDocNameList) {
        regINS(CK_INS, cTL(escapedJavaDocNameList), xgetCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocNameList The collection of escapedJavaDocName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEscapedJavaDocName_NotInScope(Collection<String> escapedJavaDocNameList) {
        doSetEscapedJavaDocName_NotInScope(escapedJavaDocNameList);
    }

    protected void doSetEscapedJavaDocName_NotInScope(Collection<String> escapedJavaDocNameList) {
        regINS(CK_NINS, cTL(escapedJavaDocNameList), xgetCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br>
     * <pre>e.g. setEscapedJavaDocName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param escapedJavaDocName The value of escapedJavaDocName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEscapedJavaDocName_LikeSearch(String escapedJavaDocName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEscapedJavaDocName_LikeSearch(escapedJavaDocName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br>
     * <pre>e.g. setEscapedJavaDocName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param escapedJavaDocName The value of escapedJavaDocName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEscapedJavaDocName_LikeSearch(String escapedJavaDocName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(escapedJavaDocName), xgetCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEscapedJavaDocName_NotLikeSearch(String escapedJavaDocName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEscapedJavaDocName_NotLikeSearch(escapedJavaDocName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEscapedJavaDocName_NotLikeSearch(String escapedJavaDocName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(escapedJavaDocName), xgetCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     */
    public void setEscapedJavaDocName_IsNull() { regEscapedJavaDocName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     */
    public void setEscapedJavaDocName_IsNullOrEmpty() { regEscapedJavaDocName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     */
    public void setEscapedJavaDocName_IsNotNull() { regEscapedJavaDocName(CK_ISNN, DOBJ); }

    protected void regEscapedJavaDocName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME"); }
    protected abstract ConditionValue xgetCValueEscapedJavaDocName();

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
    public HpSLCFunction<WhiteEscapedJavaDocCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteEscapedJavaDocCB.class);
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
    public HpSLCFunction<WhiteEscapedJavaDocCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteEscapedJavaDocCB.class);
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
    public HpSLCFunction<WhiteEscapedJavaDocCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteEscapedJavaDocCB.class);
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
    public HpSLCFunction<WhiteEscapedJavaDocCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteEscapedJavaDocCB.class);
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
    public HpSLCFunction<WhiteEscapedJavaDocCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteEscapedJavaDocCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteEscapedJavaDocCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteEscapedJavaDocCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedJavaDocCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteEscapedJavaDocCQ sq);

    protected WhiteEscapedJavaDocCB xcreateScalarConditionCB() {
        WhiteEscapedJavaDocCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteEscapedJavaDocCB xcreateScalarConditionPartitionByCB() {
        WhiteEscapedJavaDocCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteEscapedJavaDocCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ESCAPED_JAVA_DOC_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteEscapedJavaDocCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteEscapedJavaDocCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteEscapedJavaDocCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ESCAPED_JAVA_DOC_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteEscapedJavaDocCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteEscapedJavaDocCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteEscapedJavaDocCQ sq);

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
    protected WhiteEscapedJavaDocCB newMyCB() {
        return new WhiteEscapedJavaDocCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteEscapedJavaDocCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
