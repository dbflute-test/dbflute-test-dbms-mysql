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
 * The abstract condition-query of white_only_one_to_one_to.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOnlyOneToOneToCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOnlyOneToOneToCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_only_one_to_one_to";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setToId_Equal(Long toId) {
        doSetToId_Equal(toId);
    }

    protected void doSetToId_Equal(Long toId) {
        regToId(CK_EQ, toId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToId_NotEqual(Long toId) {
        doSetToId_NotEqual(toId);
    }

    protected void doSetToId_NotEqual(Long toId) {
        regToId(CK_NES, toId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setToId_GreaterThan(Long toId) {
        regToId(CK_GT, toId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setToId_LessThan(Long toId) {
        regToId(CK_LT, toId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToId_GreaterEqual(Long toId) {
        regToId(CK_GE, toId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toId The value of toId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setToId_LessEqual(Long toId) {
        regToId(CK_LE, toId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of toId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of toId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setToId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setToId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of toId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of toId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setToId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueToId(), "TO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toIdList The collection of toId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToId_InScope(Collection<Long> toIdList) {
        doSetToId_InScope(toIdList);
    }

    protected void doSetToId_InScope(Collection<Long> toIdList) {
        regINS(CK_INS, cTL(toIdList), xgetCValueToId(), "TO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param toIdList The collection of toId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToId_NotInScope(Collection<Long> toIdList) {
        doSetToId_NotInScope(toIdList);
    }

    protected void doSetToId_NotInScope(Collection<Long> toIdList) {
        regINS(CK_NINS, cTL(toIdList), xgetCValueToId(), "TO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setToId_IsNull() { regToId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setToId_IsNotNull() { regToId(CK_ISNN, DOBJ); }

    protected void regToId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToId(), "TO_ID"); }
    protected abstract ConditionValue xgetCValueToId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToName_Equal(String toName) {
        doSetToName_Equal(fRES(toName));
    }

    protected void doSetToName_Equal(String toName) {
        regToName(CK_EQ, toName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToName_NotEqual(String toName) {
        doSetToName_NotEqual(fRES(toName));
    }

    protected void doSetToName_NotEqual(String toName) {
        regToName(CK_NES, toName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toNameList The collection of toName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToName_InScope(Collection<String> toNameList) {
        doSetToName_InScope(toNameList);
    }

    protected void doSetToName_InScope(Collection<String> toNameList) {
        regINS(CK_INS, cTL(toNameList), xgetCValueToName(), "TO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toNameList The collection of toName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setToName_NotInScope(Collection<String> toNameList) {
        doSetToName_NotInScope(toNameList);
    }

    protected void doSetToName_NotInScope(Collection<String> toNameList) {
        regINS(CK_NINS, cTL(toNameList), xgetCValueToName(), "TO_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setToName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param toName The value of toName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setToName_LikeSearch(String toName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setToName_LikeSearch(toName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setToName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param toName The value of toName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToName_LikeSearch(String toName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(toName), xgetCValueToName(), "TO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setToName_NotLikeSearch(String toName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setToName_NotLikeSearch(toName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @param toName The value of toName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setToName_NotLikeSearch(String toName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(toName), xgetCValueToName(), "TO_NAME", likeSearchOption);
    }

    protected void regToName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueToName(), "TO_NAME"); }
    protected abstract ConditionValue xgetCValueToName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_Equal(Long fromId) {
        doSetFromId_Equal(fromId);
    }

    protected void doSetFromId_Equal(Long fromId) {
        regFromId(CK_EQ, fromId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_NotEqual(Long fromId) {
        doSetFromId_NotEqual(fromId);
    }

    protected void doSetFromId_NotEqual(Long fromId) {
        regFromId(CK_NES, fromId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_GreaterThan(Long fromId) {
        regFromId(CK_GT, fromId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_LessThan(Long fromId) {
        regFromId(CK_LT, fromId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_GreaterEqual(Long fromId) {
        regFromId(CK_GE, fromId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromId The value of fromId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_LessEqual(Long fromId) {
        regFromId(CK_LE, fromId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param minNumber The min number of fromId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFromId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFromId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param minNumber The min number of fromId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFromId(), "FROM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromIdList The collection of fromId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromId_InScope(Collection<Long> fromIdList) {
        doSetFromId_InScope(fromIdList);
    }

    protected void doSetFromId_InScope(Collection<Long> fromIdList) {
        regINS(CK_INS, cTL(fromIdList), xgetCValueFromId(), "FROM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from}
     * @param fromIdList The collection of fromId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromId_NotInScope(Collection<Long> fromIdList) {
        doSetFromId_NotInScope(fromIdList);
    }

    protected void doSetFromId_NotInScope(Collection<Long> fromIdList) {
        regINS(CK_NINS, cTL(fromIdList), xgetCValueFromId(), "FROM_ID");
    }

    protected void regFromId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromId(), "FROM_ID"); }
    protected abstract ConditionValue xgetCValueFromId();

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
    public HpSLCFunction<WhiteOnlyOneToOneToCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteOnlyOneToOneToCB.class);
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
    public HpSLCFunction<WhiteOnlyOneToOneToCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteOnlyOneToOneToCB.class);
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
    public HpSLCFunction<WhiteOnlyOneToOneToCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteOnlyOneToOneToCB.class);
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
    public HpSLCFunction<WhiteOnlyOneToOneToCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteOnlyOneToOneToCB.class);
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
    public HpSLCFunction<WhiteOnlyOneToOneToCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteOnlyOneToOneToCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void query(WhiteOnlyOneToOneToCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnlyOneToOneToCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteOnlyOneToOneToCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneToCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteOnlyOneToOneToCQ sq);

    protected WhiteOnlyOneToOneToCB xcreateScalarConditionCB() {
        WhiteOnlyOneToOneToCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOnlyOneToOneToCB xcreateScalarConditionPartitionByCB() {
        WhiteOnlyOneToOneToCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOnlyOneToOneToCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOnlyOneToOneToCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOnlyOneToOneToCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOnlyOneToOneToCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOnlyOneToOneToCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOnlyOneToOneToCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOnlyOneToOneToCQ sq);

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
    protected WhiteOnlyOneToOneToCB newMyCB() {
        return new WhiteOnlyOneToOneToCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOnlyOneToOneToCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
