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
 * The abstract condition-query of white_split_multiple_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_split_multiple_fk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstId_Equal(Integer firstId) {
        doSetFirstId_Equal(firstId);
    }

    protected void doSetFirstId_Equal(Integer firstId) {
        regFirstId(CK_EQ, firstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstId_NotEqual(Integer firstId) {
        doSetFirstId_NotEqual(firstId);
    }

    protected void doSetFirstId_NotEqual(Integer firstId) {
        regFirstId(CK_NES, firstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstId_GreaterThan(Integer firstId) {
        regFirstId(CK_GT, firstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstId_LessThan(Integer firstId) {
        regFirstId(CK_LT, firstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstId_GreaterEqual(Integer firstId) {
        regFirstId(CK_GE, firstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstId The value of firstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstId_LessEqual(Integer firstId) {
        regFirstId(CK_LE, firstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of firstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of firstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of firstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of firstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFirstId(), "FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstIdList The collection of firstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstId_InScope(Collection<Integer> firstIdList) {
        doSetFirstId_InScope(firstIdList);
    }

    protected void doSetFirstId_InScope(Collection<Integer> firstIdList) {
        regINS(CK_INS, cTL(firstIdList), xgetCValueFirstId(), "FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     * @param firstIdList The collection of firstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstId_NotInScope(Collection<Integer> firstIdList) {
        doSetFirstId_NotInScope(firstIdList);
    }

    protected void doSetFirstId_NotInScope(Collection<Integer> firstIdList) {
        regINS(CK_NINS, cTL(firstIdList), xgetCValueFirstId(), "FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setFirstId_IsNull() { regFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setFirstId_IsNotNull() { regFirstId(CK_ISNN, DOBJ); }

    protected void regFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstId(), "FIRST_ID"); }
    protected abstract ConditionValue xgetCValueFirstId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_Equal(String secondCode) {
        doSetSecondCode_Equal(fRES(secondCode));
    }

    protected void doSetSecondCode_Equal(String secondCode) {
        regSecondCode(CK_EQ, secondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_NotEqual(String secondCode) {
        doSetSecondCode_NotEqual(fRES(secondCode));
    }

    protected void doSetSecondCode_NotEqual(String secondCode) {
        regSecondCode(CK_NES, secondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_InScope(Collection<String> secondCodeList) {
        doSetSecondCode_InScope(secondCodeList);
    }

    protected void doSetSecondCode_InScope(Collection<String> secondCodeList) {
        regINS(CK_INS, cTL(secondCodeList), xgetCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCodeList The collection of secondCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecondCode_NotInScope(Collection<String> secondCodeList) {
        doSetSecondCode_NotInScope(secondCodeList);
    }

    protected void doSetSecondCode_NotInScope(Collection<String> secondCodeList) {
        regINS(CK_NINS, cTL(secondCodeList), xgetCValueSecondCode(), "SECOND_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setSecondCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param secondCode The value of secondCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecondCode_LikeSearch(String secondCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecondCode_LikeSearch(secondCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setSecondCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secondCode The value of secondCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecondCode_LikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secondCode), xgetCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecondCode_NotLikeSearch(String secondCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecondCode_NotLikeSearch(secondCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     * @param secondCode The value of secondCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecondCode_NotLikeSearch(String secondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secondCode), xgetCValueSecondCode(), "SECOND_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecondCode_IsNull() { regSecondCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SECOND_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecondCode_IsNotNull() { regSecondCode(CK_ISNN, DOBJ); }

    protected void regSecondCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecondCode(), "SECOND_CODE"); }
    protected abstract ConditionValue xgetCValueSecondCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_Equal(String refName) {
        doSetRefName_Equal(fRES(refName));
    }

    protected void doSetRefName_Equal(String refName) {
        regRefName(CK_EQ, refName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_NotEqual(String refName) {
        doSetRefName_NotEqual(fRES(refName));
    }

    protected void doSetRefName_NotEqual(String refName) {
        regRefName(CK_NES, refName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refNameList The collection of refName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_InScope(Collection<String> refNameList) {
        doSetRefName_InScope(refNameList);
    }

    protected void doSetRefName_InScope(Collection<String> refNameList) {
        regINS(CK_INS, cTL(refNameList), xgetCValueRefName(), "REF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refNameList The collection of refName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_NotInScope(Collection<String> refNameList) {
        doSetRefName_NotInScope(refNameList);
    }

    protected void doSetRefName_NotInScope(Collection<String> refNameList) {
        regINS(CK_NINS, cTL(refNameList), xgetCValueRefName(), "REF_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setRefName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param refName The value of refName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRefName_LikeSearch(String refName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRefName_LikeSearch(refName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setRefName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refName The value of refName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefName_LikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refName), xgetCValueRefName(), "REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRefName_NotLikeSearch(String refName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRefName_NotLikeSearch(refName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(200)}
     * @param refName The value of refName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefName_NotLikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refName), xgetCValueRefName(), "REF_NAME", likeSearchOption);
    }

    protected void regRefName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefName(), "REF_NAME"); }
    protected abstract ConditionValue xgetCValueRefName();

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
    public HpSLCFunction<WhiteSplitMultipleFkRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSplitMultipleFkRefCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSplitMultipleFkRefCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSplitMultipleFkRefCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSplitMultipleFkRefCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSplitMultipleFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void query(WhiteSplitMultipleFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSplitMultipleFkRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSplitMultipleFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkRefCQ sq);

    protected WhiteSplitMultipleFkRefCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSplitMultipleFkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteSplitMultipleFkRefCB newMyCB() {
        return new WhiteSplitMultipleFkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSplitMultipleFkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
