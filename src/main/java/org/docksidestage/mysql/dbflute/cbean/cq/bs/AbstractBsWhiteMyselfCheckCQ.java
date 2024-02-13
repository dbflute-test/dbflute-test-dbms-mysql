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
 * The abstract condition-query of white_myself_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteMyselfCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteMyselfCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_myself_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfCheckId_Equal(Integer myselfCheckId) {
        doSetMyselfCheckId_Equal(myselfCheckId);
    }

    protected void doSetMyselfCheckId_Equal(Integer myselfCheckId) {
        regMyselfCheckId(CK_EQ, myselfCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfCheckId_NotEqual(Integer myselfCheckId) {
        doSetMyselfCheckId_NotEqual(myselfCheckId);
    }

    protected void doSetMyselfCheckId_NotEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_NES, myselfCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfCheckId_GreaterThan(Integer myselfCheckId) {
        regMyselfCheckId(CK_GT, myselfCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfCheckId_LessThan(Integer myselfCheckId) {
        regMyselfCheckId(CK_LT, myselfCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfCheckId_GreaterEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_GE, myselfCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckId The value of myselfCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfCheckId_LessEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_LE, myselfCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of myselfCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of myselfCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMyselfCheckId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMyselfCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of myselfCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of myselfCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfCheckId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMyselfCheckId(), "MYSELF_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckIdList The collection of myselfCheckId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfCheckId_InScope(Collection<Integer> myselfCheckIdList) {
        doSetMyselfCheckId_InScope(myselfCheckIdList);
    }

    protected void doSetMyselfCheckId_InScope(Collection<Integer> myselfCheckIdList) {
        regINS(CK_INS, cTL(myselfCheckIdList), xgetCValueMyselfCheckId(), "MYSELF_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @param myselfCheckIdList The collection of myselfCheckId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfCheckId_NotInScope(Collection<Integer> myselfCheckIdList) {
        doSetMyselfCheckId_NotInScope(myselfCheckIdList);
    }

    protected void doSetMyselfCheckId_NotInScope(Collection<Integer> myselfCheckIdList) {
        regINS(CK_NINS, cTL(myselfCheckIdList), xgetCValueMyselfCheckId(), "MYSELF_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     */
    public void setMyselfCheckId_IsNull() { regMyselfCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     */
    public void setMyselfCheckId_IsNotNull() { regMyselfCheckId(CK_ISNN, DOBJ); }

    protected void regMyselfCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMyselfCheckId(), "MYSELF_CHECK_ID"); }
    protected abstract ConditionValue xgetCValueMyselfCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfCheckName_Equal(String myselfCheckName) {
        doSetMyselfCheckName_Equal(fRES(myselfCheckName));
    }

    protected void doSetMyselfCheckName_Equal(String myselfCheckName) {
        regMyselfCheckName(CK_EQ, myselfCheckName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfCheckName_NotEqual(String myselfCheckName) {
        doSetMyselfCheckName_NotEqual(fRES(myselfCheckName));
    }

    protected void doSetMyselfCheckName_NotEqual(String myselfCheckName) {
        regMyselfCheckName(CK_NES, myselfCheckName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckNameList The collection of myselfCheckName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfCheckName_InScope(Collection<String> myselfCheckNameList) {
        doSetMyselfCheckName_InScope(myselfCheckNameList);
    }

    protected void doSetMyselfCheckName_InScope(Collection<String> myselfCheckNameList) {
        regINS(CK_INS, cTL(myselfCheckNameList), xgetCValueMyselfCheckName(), "MYSELF_CHECK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckNameList The collection of myselfCheckName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfCheckName_NotInScope(Collection<String> myselfCheckNameList) {
        doSetMyselfCheckName_NotInScope(myselfCheckNameList);
    }

    protected void doSetMyselfCheckName_NotInScope(Collection<String> myselfCheckNameList) {
        regINS(CK_NINS, cTL(myselfCheckNameList), xgetCValueMyselfCheckName(), "MYSELF_CHECK_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br>
     * <pre>e.g. setMyselfCheckName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param myselfCheckName The value of myselfCheckName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMyselfCheckName_LikeSearch(String myselfCheckName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMyselfCheckName_LikeSearch(myselfCheckName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br>
     * <pre>e.g. setMyselfCheckName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param myselfCheckName The value of myselfCheckName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMyselfCheckName_LikeSearch(String myselfCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(myselfCheckName), xgetCValueMyselfCheckName(), "MYSELF_CHECK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMyselfCheckName_NotLikeSearch(String myselfCheckName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMyselfCheckName_NotLikeSearch(myselfCheckName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMyselfCheckName_NotLikeSearch(String myselfCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(myselfCheckName), xgetCValueMyselfCheckName(), "MYSELF_CHECK_NAME", likeSearchOption);
    }

    protected void regMyselfCheckName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMyselfCheckName(), "MYSELF_CHECK_NAME"); }
    protected abstract ConditionValue xgetCValueMyselfCheckName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfId_Equal(Integer myselfId) {
        doSetMyselfId_Equal(myselfId);
    }

    protected void doSetMyselfId_Equal(Integer myselfId) {
        regMyselfId(CK_EQ, myselfId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfId_NotEqual(Integer myselfId) {
        doSetMyselfId_NotEqual(myselfId);
    }

    protected void doSetMyselfId_NotEqual(Integer myselfId) {
        regMyselfId(CK_NES, myselfId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfId_GreaterThan(Integer myselfId) {
        regMyselfId(CK_GT, myselfId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfId_LessThan(Integer myselfId) {
        regMyselfId(CK_LT, myselfId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfId_GreaterEqual(Integer myselfId) {
        regMyselfId(CK_GE, myselfId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfId The value of myselfId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyselfId_LessEqual(Integer myselfId) {
        regMyselfId(CK_LE, myselfId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param minNumber The min number of myselfId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of myselfId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMyselfId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMyselfId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param minNumber The min number of myselfId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of myselfId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMyselfId(), "MYSELF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfIdList The collection of myselfId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfId_InScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_InScope(myselfIdList);
    }

    protected void doSetMyselfId_InScope(Collection<Integer> myselfIdList) {
        regINS(CK_INS, cTL(myselfIdList), xgetCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @param myselfIdList The collection of myselfId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_NotInScope(myselfIdList);
    }

    protected void doSetMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        regINS(CK_NINS, cTL(myselfIdList), xgetCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     */
    public void setMyselfId_IsNull() { regMyselfId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     */
    public void setMyselfId_IsNotNull() { regMyselfId(CK_ISNN, DOBJ); }

    protected void regMyselfId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMyselfId(), "MYSELF_ID"); }
    protected abstract ConditionValue xgetCValueMyselfId();

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
    public HpSLCFunction<WhiteMyselfCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteMyselfCheckCB.class);
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
    public HpSLCFunction<WhiteMyselfCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteMyselfCheckCB.class);
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
    public HpSLCFunction<WhiteMyselfCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteMyselfCheckCB.class);
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
    public HpSLCFunction<WhiteMyselfCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteMyselfCheckCB.class);
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
    public HpSLCFunction<WhiteMyselfCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteMyselfCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteMyselfCheckCB&gt;() {
     *     public void query(WhiteMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteMyselfCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteMyselfCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteMyselfCheckCQ sq);

    protected WhiteMyselfCheckCB xcreateScalarConditionCB() {
        WhiteMyselfCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteMyselfCheckCB xcreateScalarConditionPartitionByCB() {
        WhiteMyselfCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteMyselfCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MYSELF_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteMyselfCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteMyselfCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteMyselfCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MYSELF_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteMyselfCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteMyselfCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteMyselfCheckCB cb = new WhiteMyselfCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteMyselfCheckCQ sq);

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
    protected WhiteMyselfCheckCB newMyCB() {
        return new WhiteMyselfCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteMyselfCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
