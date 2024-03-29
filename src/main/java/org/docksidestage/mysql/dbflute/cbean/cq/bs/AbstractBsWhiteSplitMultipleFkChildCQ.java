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
 * The abstract condition-query of white_split_multiple_fk_child.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSplitMultipleFkChildCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSplitMultipleFkChildCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_split_multiple_fk_child";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_Equal(Long childId) {
        doSetChildId_Equal(childId);
    }

    protected void doSetChildId_Equal(Long childId) {
        regChildId(CK_EQ, childId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_NotEqual(Long childId) {
        doSetChildId_NotEqual(childId);
    }

    protected void doSetChildId_NotEqual(Long childId) {
        regChildId(CK_NES, childId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_GreaterThan(Long childId) {
        regChildId(CK_GT, childId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_LessThan(Long childId) {
        regChildId(CK_LT, childId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_GreaterEqual(Long childId) {
        regChildId(CK_GE, childId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childId The value of childId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_LessEqual(Long childId) {
        regChildId(CK_LE, childId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setChildId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setChildId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setChildId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChildId(), "CHILD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childIdList The collection of childId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildId_InScope(Collection<Long> childIdList) {
        doSetChildId_InScope(childIdList);
    }

    protected void doSetChildId_InScope(Collection<Long> childIdList) {
        regINS(CK_INS, cTL(childIdList), xgetCValueChildId(), "CHILD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     * @param childIdList The collection of childId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildId_NotInScope(Collection<Long> childIdList) {
        doSetChildId_NotInScope(childIdList);
    }

    protected void doSetChildId_NotInScope(Collection<Long> childIdList) {
        regINS(CK_NINS, cTL(childIdList), xgetCValueChildId(), "CHILD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setChildId_IsNull() { regChildId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHILD_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setChildId_IsNotNull() { regChildId(CK_ISNN, DOBJ); }

    protected void regChildId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChildId(), "CHILD_ID"); }
    protected abstract ConditionValue xgetCValueChildId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_Equal(Long baseId) {
        doSetBaseId_Equal(baseId);
    }

    protected void doSetBaseId_Equal(Long baseId) {
        regBaseId(CK_EQ, baseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_NotEqual(Long baseId) {
        doSetBaseId_NotEqual(baseId);
    }

    protected void doSetBaseId_NotEqual(Long baseId) {
        regBaseId(CK_NES, baseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterThan(Long baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessThan(Long baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterEqual(Long baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseId The value of baseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessEqual(Long baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseIdList The collection of baseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_InScope(Collection<Long> baseIdList) {
        doSetBaseId_InScope(baseIdList);
    }

    protected void doSetBaseId_InScope(Collection<Long> baseIdList) {
        regINS(CK_INS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base}
     * @param baseIdList The collection of baseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_NotInScope(Collection<Long> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Long> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    protected void regBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseId(), "BASE_ID"); }
    protected abstract ConditionValue xgetCValueBaseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildName_Equal(String childName) {
        doSetChildName_Equal(fRES(childName));
    }

    protected void doSetChildName_Equal(String childName) {
        regChildName(CK_EQ, childName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildName_NotEqual(String childName) {
        doSetChildName_NotEqual(fRES(childName));
    }

    protected void doSetChildName_NotEqual(String childName) {
        regChildName(CK_NES, childName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childNameList The collection of childName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildName_InScope(Collection<String> childNameList) {
        doSetChildName_InScope(childNameList);
    }

    protected void doSetChildName_InScope(Collection<String> childNameList) {
        regINS(CK_INS, cTL(childNameList), xgetCValueChildName(), "CHILD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childNameList The collection of childName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildName_NotInScope(Collection<String> childNameList) {
        doSetChildName_NotInScope(childNameList);
    }

    protected void doSetChildName_NotInScope(Collection<String> childNameList) {
        regINS(CK_NINS, cTL(childNameList), xgetCValueChildName(), "CHILD_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setChildName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param childName The value of childName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setChildName_LikeSearch(String childName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setChildName_LikeSearch(childName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setChildName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param childName The value of childName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setChildName_LikeSearch(String childName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(childName), xgetCValueChildName(), "CHILD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setChildName_NotLikeSearch(String childName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setChildName_NotLikeSearch(childName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHILD_NAME: {NotNull, VARCHAR(200)}
     * @param childName The value of childName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setChildName_NotLikeSearch(String childName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(childName), xgetCValueChildName(), "CHILD_NAME", likeSearchOption);
    }

    protected void regChildName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChildName(), "CHILD_NAME"); }
    protected abstract ConditionValue xgetCValueChildName();

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
    public HpSLCFunction<WhiteSplitMultipleFkChildCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSplitMultipleFkChildCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkChildCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSplitMultipleFkChildCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkChildCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSplitMultipleFkChildCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkChildCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSplitMultipleFkChildCB.class);
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
    public HpSLCFunction<WhiteSplitMultipleFkChildCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSplitMultipleFkChildCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void query(WhiteSplitMultipleFkChildCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSplitMultipleFkChildCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSplitMultipleFkChildCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkChildCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSplitMultipleFkChildCQ sq);

    protected WhiteSplitMultipleFkChildCB xcreateScalarConditionCB() {
        WhiteSplitMultipleFkChildCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSplitMultipleFkChildCB xcreateScalarConditionPartitionByCB() {
        WhiteSplitMultipleFkChildCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSplitMultipleFkChildCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CHILD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSplitMultipleFkChildCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSplitMultipleFkChildCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSplitMultipleFkChildCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CHILD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSplitMultipleFkChildCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSplitMultipleFkChildCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSplitMultipleFkChildCQ sq);

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
    protected WhiteSplitMultipleFkChildCB newMyCB() {
        return new WhiteSplitMultipleFkChildCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSplitMultipleFkChildCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
