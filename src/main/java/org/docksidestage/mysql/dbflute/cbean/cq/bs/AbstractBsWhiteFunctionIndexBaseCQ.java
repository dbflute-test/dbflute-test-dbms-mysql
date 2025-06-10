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
 * The abstract condition-query of white_function_index_base.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteFunctionIndexBaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteFunctionIndexBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_function_index_base";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseId The value of indexBaseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseId_Equal(Long indexBaseId) {
        doSetIndexBaseId_Equal(indexBaseId);
    }

    protected void doSetIndexBaseId_Equal(Long indexBaseId) {
        regIndexBaseId(CK_EQ, indexBaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseId The value of indexBaseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseId_GreaterThan(Long indexBaseId) {
        regIndexBaseId(CK_GT, indexBaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseId The value of indexBaseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseId_LessThan(Long indexBaseId) {
        regIndexBaseId(CK_LT, indexBaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseId The value of indexBaseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseId_GreaterEqual(Long indexBaseId) {
        regIndexBaseId(CK_GE, indexBaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseId The value of indexBaseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseId_LessEqual(Long indexBaseId) {
        regIndexBaseId(CK_LE, indexBaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of indexBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIndexBaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIndexBaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of indexBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIndexBaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIndexBaseId(), "INDEX_BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseIdList The collection of indexBaseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseId_InScope(Collection<Long> indexBaseIdList) {
        doSetIndexBaseId_InScope(indexBaseIdList);
    }

    protected void doSetIndexBaseId_InScope(Collection<Long> indexBaseIdList) {
        regINS(CK_INS, cTL(indexBaseIdList), xgetCValueIndexBaseId(), "INDEX_BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param indexBaseIdList The collection of indexBaseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseId_NotInScope(Collection<Long> indexBaseIdList) {
        doSetIndexBaseId_NotInScope(indexBaseIdList);
    }

    protected void doSetIndexBaseId_NotInScope(Collection<Long> indexBaseIdList) {
        regINS(CK_NINS, cTL(indexBaseIdList), xgetCValueIndexBaseId(), "INDEX_BASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIndexBaseId_IsNull() { regIndexBaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setIndexBaseId_IsNotNull() { regIndexBaseId(CK_ISNN, DOBJ); }

    protected void regIndexBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexBaseId(), "INDEX_BASE_ID"); }
    protected abstract ConditionValue xgetCValueIndexBaseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param indexBaseName The value of indexBaseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseName_Equal(String indexBaseName) {
        doSetIndexBaseName_Equal(fRES(indexBaseName));
    }

    protected void doSetIndexBaseName_Equal(String indexBaseName) {
        regIndexBaseName(CK_EQ, indexBaseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param indexBaseName The value of indexBaseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseName_NotEqual(String indexBaseName) {
        doSetIndexBaseName_NotEqual(fRES(indexBaseName));
    }

    protected void doSetIndexBaseName_NotEqual(String indexBaseName) {
        regIndexBaseName(CK_NES, indexBaseName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param indexBaseNameList The collection of indexBaseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseName_InScope(Collection<String> indexBaseNameList) {
        doSetIndexBaseName_InScope(indexBaseNameList);
    }

    protected void doSetIndexBaseName_InScope(Collection<String> indexBaseNameList) {
        regINS(CK_INS, cTL(indexBaseNameList), xgetCValueIndexBaseName(), "INDEX_BASE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param indexBaseNameList The collection of indexBaseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseName_NotInScope(Collection<String> indexBaseNameList) {
        doSetIndexBaseName_NotInScope(indexBaseNameList);
    }

    protected void doSetIndexBaseName_NotInScope(Collection<String> indexBaseNameList) {
        regINS(CK_NINS, cTL(indexBaseNameList), xgetCValueIndexBaseName(), "INDEX_BASE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setIndexBaseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param indexBaseName The value of indexBaseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIndexBaseName_LikeSearch(String indexBaseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIndexBaseName_LikeSearch(indexBaseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setIndexBaseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param indexBaseName The value of indexBaseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIndexBaseName_LikeSearch(String indexBaseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(indexBaseName), xgetCValueIndexBaseName(), "INDEX_BASE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param indexBaseName The value of indexBaseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIndexBaseName_NotLikeSearch(String indexBaseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIndexBaseName_NotLikeSearch(indexBaseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param indexBaseName The value of indexBaseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIndexBaseName_NotLikeSearch(String indexBaseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(indexBaseName), xgetCValueIndexBaseName(), "INDEX_BASE_NAME", likeSearchOption);
    }

    protected void regIndexBaseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexBaseName(), "INDEX_BASE_NAME"); }
    protected abstract ConditionValue xgetCValueIndexBaseName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirst The value of indexBaseNumberFirst as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_Equal(Integer indexBaseNumberFirst) {
        doSetIndexBaseNumberFirst_Equal(indexBaseNumberFirst);
    }

    protected void doSetIndexBaseNumberFirst_Equal(Integer indexBaseNumberFirst) {
        regIndexBaseNumberFirst(CK_EQ, indexBaseNumberFirst);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirst The value of indexBaseNumberFirst as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_GreaterThan(Integer indexBaseNumberFirst) {
        regIndexBaseNumberFirst(CK_GT, indexBaseNumberFirst);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirst The value of indexBaseNumberFirst as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_LessThan(Integer indexBaseNumberFirst) {
        regIndexBaseNumberFirst(CK_LT, indexBaseNumberFirst);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirst The value of indexBaseNumberFirst as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_GreaterEqual(Integer indexBaseNumberFirst) {
        regIndexBaseNumberFirst(CK_GE, indexBaseNumberFirst);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirst The value of indexBaseNumberFirst as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_LessEqual(Integer indexBaseNumberFirst) {
        regIndexBaseNumberFirst(CK_LE, indexBaseNumberFirst);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param minNumber The min number of indexBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIndexBaseNumberFirst_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIndexBaseNumberFirst_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param minNumber The min number of indexBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIndexBaseNumberFirst_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIndexBaseNumberFirst(), "INDEX_BASE_NUMBER_FIRST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirstList The collection of indexBaseNumberFirst as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_InScope(Collection<Integer> indexBaseNumberFirstList) {
        doSetIndexBaseNumberFirst_InScope(indexBaseNumberFirstList);
    }

    protected void doSetIndexBaseNumberFirst_InScope(Collection<Integer> indexBaseNumberFirstList) {
        regINS(CK_INS, cTL(indexBaseNumberFirstList), xgetCValueIndexBaseNumberFirst(), "INDEX_BASE_NUMBER_FIRST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param indexBaseNumberFirstList The collection of indexBaseNumberFirst as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseNumberFirst_NotInScope(Collection<Integer> indexBaseNumberFirstList) {
        doSetIndexBaseNumberFirst_NotInScope(indexBaseNumberFirstList);
    }

    protected void doSetIndexBaseNumberFirst_NotInScope(Collection<Integer> indexBaseNumberFirstList) {
        regINS(CK_NINS, cTL(indexBaseNumberFirstList), xgetCValueIndexBaseNumberFirst(), "INDEX_BASE_NUMBER_FIRST");
    }

    protected void regIndexBaseNumberFirst(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexBaseNumberFirst(), "INDEX_BASE_NUMBER_FIRST"); }
    protected abstract ConditionValue xgetCValueIndexBaseNumberFirst();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecond The value of indexBaseNumberSecond as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_Equal(Integer indexBaseNumberSecond) {
        doSetIndexBaseNumberSecond_Equal(indexBaseNumberSecond);
    }

    protected void doSetIndexBaseNumberSecond_Equal(Integer indexBaseNumberSecond) {
        regIndexBaseNumberSecond(CK_EQ, indexBaseNumberSecond);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecond The value of indexBaseNumberSecond as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_GreaterThan(Integer indexBaseNumberSecond) {
        regIndexBaseNumberSecond(CK_GT, indexBaseNumberSecond);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecond The value of indexBaseNumberSecond as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_LessThan(Integer indexBaseNumberSecond) {
        regIndexBaseNumberSecond(CK_LT, indexBaseNumberSecond);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecond The value of indexBaseNumberSecond as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_GreaterEqual(Integer indexBaseNumberSecond) {
        regIndexBaseNumberSecond(CK_GE, indexBaseNumberSecond);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecond The value of indexBaseNumberSecond as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_LessEqual(Integer indexBaseNumberSecond) {
        regIndexBaseNumberSecond(CK_LE, indexBaseNumberSecond);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param minNumber The min number of indexBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIndexBaseNumberSecond_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIndexBaseNumberSecond_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param minNumber The min number of indexBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indexBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIndexBaseNumberSecond_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIndexBaseNumberSecond(), "INDEX_BASE_NUMBER_SECOND", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecondList The collection of indexBaseNumberSecond as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_InScope(Collection<Integer> indexBaseNumberSecondList) {
        doSetIndexBaseNumberSecond_InScope(indexBaseNumberSecondList);
    }

    protected void doSetIndexBaseNumberSecond_InScope(Collection<Integer> indexBaseNumberSecondList) {
        regINS(CK_INS, cTL(indexBaseNumberSecondList), xgetCValueIndexBaseNumberSecond(), "INDEX_BASE_NUMBER_SECOND");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param indexBaseNumberSecondList The collection of indexBaseNumberSecond as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndexBaseNumberSecond_NotInScope(Collection<Integer> indexBaseNumberSecondList) {
        doSetIndexBaseNumberSecond_NotInScope(indexBaseNumberSecondList);
    }

    protected void doSetIndexBaseNumberSecond_NotInScope(Collection<Integer> indexBaseNumberSecondList) {
        regINS(CK_NINS, cTL(indexBaseNumberSecondList), xgetCValueIndexBaseNumberSecond(), "INDEX_BASE_NUMBER_SECOND");
    }

    protected void regIndexBaseNumberSecond(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexBaseNumberSecond(), "INDEX_BASE_NUMBER_SECOND"); }
    protected abstract ConditionValue xgetCValueIndexBaseNumberSecond();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexBaseDatetime The value of indexBaseDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseDatetime_Equal(java.time.LocalDateTime indexBaseDatetime) {
        regIndexBaseDatetime(CK_EQ,  indexBaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexBaseDatetime The value of indexBaseDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseDatetime_GreaterThan(java.time.LocalDateTime indexBaseDatetime) {
        regIndexBaseDatetime(CK_GT,  indexBaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexBaseDatetime The value of indexBaseDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseDatetime_LessThan(java.time.LocalDateTime indexBaseDatetime) {
        regIndexBaseDatetime(CK_LT,  indexBaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexBaseDatetime The value of indexBaseDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseDatetime_GreaterEqual(java.time.LocalDateTime indexBaseDatetime) {
        regIndexBaseDatetime(CK_GE,  indexBaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param indexBaseDatetime The value of indexBaseDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndexBaseDatetime_LessEqual(java.time.LocalDateTime indexBaseDatetime) {
        regIndexBaseDatetime(CK_LE, indexBaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setIndexBaseDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setIndexBaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setIndexBaseDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setIndexBaseDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indexBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setIndexBaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "INDEX_BASE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueIndexBaseDatetime(), nm, op);
    }

    protected void regIndexBaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndexBaseDatetime(), "INDEX_BASE_DATETIME"); }
    protected abstract ConditionValue xgetCValueIndexBaseDatetime();

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
    public HpSLCFunction<WhiteFunctionIndexBaseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteFunctionIndexBaseCB.class);
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
    public HpSLCFunction<WhiteFunctionIndexBaseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteFunctionIndexBaseCB.class);
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
    public HpSLCFunction<WhiteFunctionIndexBaseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteFunctionIndexBaseCB.class);
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
    public HpSLCFunction<WhiteFunctionIndexBaseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteFunctionIndexBaseCB.class);
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
    public HpSLCFunction<WhiteFunctionIndexBaseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteFunctionIndexBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteFunctionIndexBaseCB&gt;() {
     *     public void query(WhiteFunctionIndexBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteFunctionIndexBaseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteFunctionIndexBaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteFunctionIndexBaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteFunctionIndexBaseCQ sq);

    protected WhiteFunctionIndexBaseCB xcreateScalarConditionCB() {
        WhiteFunctionIndexBaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteFunctionIndexBaseCB xcreateScalarConditionPartitionByCB() {
        WhiteFunctionIndexBaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteFunctionIndexBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteFunctionIndexBaseCB cb = new WhiteFunctionIndexBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INDEX_BASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteFunctionIndexBaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteFunctionIndexBaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteFunctionIndexBaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteFunctionIndexBaseCB cb = new WhiteFunctionIndexBaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INDEX_BASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteFunctionIndexBaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteFunctionIndexBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteFunctionIndexBaseCB cb = new WhiteFunctionIndexBaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteFunctionIndexBaseCQ sq);

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
    protected WhiteFunctionIndexBaseCB newMyCB() {
        return new WhiteFunctionIndexBaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteFunctionIndexBaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
