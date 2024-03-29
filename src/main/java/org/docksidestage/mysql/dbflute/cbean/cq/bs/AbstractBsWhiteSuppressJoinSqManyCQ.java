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
 * The abstract condition-query of white_suppress_join_sq_many.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqManyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqManyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_many";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_Equal(Integer manyId) {
        doSetManyId_Equal(manyId);
    }

    protected void doSetManyId_Equal(Integer manyId) {
        regManyId(CK_EQ, manyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_NotEqual(Integer manyId) {
        doSetManyId_NotEqual(manyId);
    }

    protected void doSetManyId_NotEqual(Integer manyId) {
        regManyId(CK_NES, manyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_GreaterThan(Integer manyId) {
        regManyId(CK_GT, manyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_LessThan(Integer manyId) {
        regManyId(CK_LT, manyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_GreaterEqual(Integer manyId) {
        regManyId(CK_GE, manyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyId The value of manyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_LessEqual(Integer manyId) {
        regManyId(CK_LE, manyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setManyId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setManyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueManyId(), "MANY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyIdList The collection of manyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyId_InScope(Collection<Integer> manyIdList) {
        doSetManyId_InScope(manyIdList);
    }

    protected void doSetManyId_InScope(Collection<Integer> manyIdList) {
        regINS(CK_INS, cTL(manyIdList), xgetCValueManyId(), "MANY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     * @param manyIdList The collection of manyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyId_NotInScope(Collection<Integer> manyIdList) {
        doSetManyId_NotInScope(manyIdList);
    }

    protected void doSetManyId_NotInScope(Collection<Integer> manyIdList) {
        regINS(CK_NINS, cTL(manyIdList), xgetCValueManyId(), "MANY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     */
    public void setManyId_IsNull() { regManyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, INT(10)}
     */
    public void setManyId_IsNotNull() { regManyId(CK_ISNN, DOBJ); }

    protected void regManyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyId(), "MANY_ID"); }
    protected abstract ConditionValue xgetCValueManyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyName_Equal(String manyName) {
        doSetManyName_Equal(fRES(manyName));
    }

    protected void doSetManyName_Equal(String manyName) {
        regManyName(CK_EQ, manyName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyName_NotEqual(String manyName) {
        doSetManyName_NotEqual(fRES(manyName));
    }

    protected void doSetManyName_NotEqual(String manyName) {
        regManyName(CK_NES, manyName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyNameList The collection of manyName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyName_InScope(Collection<String> manyNameList) {
        doSetManyName_InScope(manyNameList);
    }

    protected void doSetManyName_InScope(Collection<String> manyNameList) {
        regINS(CK_INS, cTL(manyNameList), xgetCValueManyName(), "MANY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyNameList The collection of manyName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyName_NotInScope(Collection<String> manyNameList) {
        doSetManyName_NotInScope(manyNameList);
    }

    protected void doSetManyName_NotInScope(Collection<String> manyNameList) {
        regINS(CK_NINS, cTL(manyNameList), xgetCValueManyName(), "MANY_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setManyName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param manyName The value of manyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setManyName_LikeSearch(String manyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setManyName_LikeSearch(manyName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setManyName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manyName The value of manyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManyName_LikeSearch(String manyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manyName), xgetCValueManyName(), "MANY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setManyName_NotLikeSearch(String manyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setManyName_NotLikeSearch(manyName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @param manyName The value of manyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManyName_NotLikeSearch(String manyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manyName), xgetCValueManyName(), "MANY_NAME", likeSearchOption);
    }

    protected void regManyName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyName(), "MANY_NAME"); }
    protected abstract ConditionValue xgetCValueManyName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_Equal(Integer suppressJoinSqId) {
        doSetSuppressJoinSqId_Equal(suppressJoinSqId);
    }

    protected void doSetSuppressJoinSqId_Equal(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_EQ, suppressJoinSqId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_NotEqual(Integer suppressJoinSqId) {
        doSetSuppressJoinSqId_NotEqual(suppressJoinSqId);
    }

    protected void doSetSuppressJoinSqId_NotEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_NES, suppressJoinSqId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_GreaterThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GT, suppressJoinSqId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_LessThan(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LT, suppressJoinSqId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_GreaterEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_GE, suppressJoinSqId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqId The value of suppressJoinSqId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_LessEqual(Integer suppressJoinSqId) {
        regSuppressJoinSqId(CK_LE, suppressJoinSqId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param minNumber The min number of suppressJoinSqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of suppressJoinSqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSuppressJoinSqId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSuppressJoinSqId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param minNumber The min number of suppressJoinSqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of suppressJoinSqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSuppressJoinSqId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_InScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_InScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_InScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_INS, cTL(suppressJoinSqIdList), xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @param suppressJoinSqIdList The collection of suppressJoinSqId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        doSetSuppressJoinSqId_NotInScope(suppressJoinSqIdList);
    }

    protected void doSetSuppressJoinSqId_NotInScope(Collection<Integer> suppressJoinSqIdList) {
        regINS(CK_NINS, cTL(suppressJoinSqIdList), xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID");
    }

    protected void regSuppressJoinSqId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppressJoinSqId(), "SUPPRESS_JOIN_SQ_ID"); }
    protected abstract ConditionValue xgetCValueSuppressJoinSqId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneId_Equal(Integer manyOneId) {
        doSetManyOneId_Equal(manyOneId);
    }

    protected void doSetManyOneId_Equal(Integer manyOneId) {
        regManyOneId(CK_EQ, manyOneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneId_NotEqual(Integer manyOneId) {
        doSetManyOneId_NotEqual(manyOneId);
    }

    protected void doSetManyOneId_NotEqual(Integer manyOneId) {
        regManyOneId(CK_NES, manyOneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneId_GreaterThan(Integer manyOneId) {
        regManyOneId(CK_GT, manyOneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneId_LessThan(Integer manyOneId) {
        regManyOneId(CK_LT, manyOneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneId_GreaterEqual(Integer manyOneId) {
        regManyOneId(CK_GE, manyOneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneId The value of manyOneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneId_LessEqual(Integer manyOneId) {
        regManyOneId(CK_LE, manyOneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param minNumber The min number of manyOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setManyOneId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setManyOneId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param minNumber The min number of manyOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueManyOneId(), "MANY_ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneIdList The collection of manyOneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneId_InScope(Collection<Integer> manyOneIdList) {
        doSetManyOneId_InScope(manyOneIdList);
    }

    protected void doSetManyOneId_InScope(Collection<Integer> manyOneIdList) {
        regINS(CK_INS, cTL(manyOneIdList), xgetCValueManyOneId(), "MANY_ONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @param manyOneIdList The collection of manyOneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneId_NotInScope(Collection<Integer> manyOneIdList) {
        doSetManyOneId_NotInScope(manyOneIdList);
    }

    protected void doSetManyOneId_NotInScope(Collection<Integer> manyOneIdList) {
        regINS(CK_NINS, cTL(manyOneIdList), xgetCValueManyOneId(), "MANY_ONE_ID");
    }

    protected void regManyOneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyOneId(), "MANY_ONE_ID"); }
    protected abstract ConditionValue xgetCValueManyOneId();

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
    public HpSLCFunction<WhiteSuppressJoinSqManyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSuppressJoinSqManyCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSuppressJoinSqManyCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSuppressJoinSqManyCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSuppressJoinSqManyCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSuppressJoinSqManyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSuppressJoinSqManyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSuppressJoinSqManyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqManyCQ sq);

    protected WhiteSuppressJoinSqManyCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqManyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqManyCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqManyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqManyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MANY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqManyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqManyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MANY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqManyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqManyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqManyCQ sq);

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
    protected WhiteSuppressJoinSqManyCB newMyCB() {
        return new WhiteSuppressJoinSqManyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSuppressJoinSqManyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
