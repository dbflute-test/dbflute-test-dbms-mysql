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
 * The abstract condition-query of white_generated_column_base.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteGeneratedColumnBaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteGeneratedColumnBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_generated_column_base";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseId The value of columnBaseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseId_Equal(Long columnBaseId) {
        doSetColumnBaseId_Equal(columnBaseId);
    }

    protected void doSetColumnBaseId_Equal(Long columnBaseId) {
        regColumnBaseId(CK_EQ, columnBaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseId The value of columnBaseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseId_GreaterThan(Long columnBaseId) {
        regColumnBaseId(CK_GT, columnBaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseId The value of columnBaseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseId_LessThan(Long columnBaseId) {
        regColumnBaseId(CK_LT, columnBaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseId The value of columnBaseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseId_GreaterEqual(Long columnBaseId) {
        regColumnBaseId(CK_GE, columnBaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseId The value of columnBaseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseId_LessEqual(Long columnBaseId) {
        regColumnBaseId(CK_LE, columnBaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of columnBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setColumnBaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setColumnBaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of columnBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnBaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColumnBaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColumnBaseId(), "COLUMN_BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseIdList The collection of columnBaseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseId_InScope(Collection<Long> columnBaseIdList) {
        doSetColumnBaseId_InScope(columnBaseIdList);
    }

    protected void doSetColumnBaseId_InScope(Collection<Long> columnBaseIdList) {
        regINS(CK_INS, cTL(columnBaseIdList), xgetCValueColumnBaseId(), "COLUMN_BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param columnBaseIdList The collection of columnBaseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseId_NotInScope(Collection<Long> columnBaseIdList) {
        doSetColumnBaseId_NotInScope(columnBaseIdList);
    }

    protected void doSetColumnBaseId_NotInScope(Collection<Long> columnBaseIdList) {
        regINS(CK_NINS, cTL(columnBaseIdList), xgetCValueColumnBaseId(), "COLUMN_BASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setColumnBaseId_IsNull() { regColumnBaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setColumnBaseId_IsNotNull() { regColumnBaseId(CK_ISNN, DOBJ); }

    protected void regColumnBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseId(), "COLUMN_BASE_ID"); }
    protected abstract ConditionValue xgetCValueColumnBaseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param columnBaseName The value of columnBaseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseName_Equal(String columnBaseName) {
        doSetColumnBaseName_Equal(fRES(columnBaseName));
    }

    protected void doSetColumnBaseName_Equal(String columnBaseName) {
        regColumnBaseName(CK_EQ, columnBaseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param columnBaseName The value of columnBaseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseName_NotEqual(String columnBaseName) {
        doSetColumnBaseName_NotEqual(fRES(columnBaseName));
    }

    protected void doSetColumnBaseName_NotEqual(String columnBaseName) {
        regColumnBaseName(CK_NES, columnBaseName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param columnBaseNameList The collection of columnBaseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseName_InScope(Collection<String> columnBaseNameList) {
        doSetColumnBaseName_InScope(columnBaseNameList);
    }

    protected void doSetColumnBaseName_InScope(Collection<String> columnBaseNameList) {
        regINS(CK_INS, cTL(columnBaseNameList), xgetCValueColumnBaseName(), "COLUMN_BASE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param columnBaseNameList The collection of columnBaseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseName_NotInScope(Collection<String> columnBaseNameList) {
        doSetColumnBaseName_NotInScope(columnBaseNameList);
    }

    protected void doSetColumnBaseName_NotInScope(Collection<String> columnBaseNameList) {
        regINS(CK_NINS, cTL(columnBaseNameList), xgetCValueColumnBaseName(), "COLUMN_BASE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setColumnBaseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param columnBaseName The value of columnBaseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setColumnBaseName_LikeSearch(String columnBaseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setColumnBaseName_LikeSearch(columnBaseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setColumnBaseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param columnBaseName The value of columnBaseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setColumnBaseName_LikeSearch(String columnBaseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(columnBaseName), xgetCValueColumnBaseName(), "COLUMN_BASE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param columnBaseName The value of columnBaseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setColumnBaseName_NotLikeSearch(String columnBaseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setColumnBaseName_NotLikeSearch(columnBaseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @param columnBaseName The value of columnBaseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setColumnBaseName_NotLikeSearch(String columnBaseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(columnBaseName), xgetCValueColumnBaseName(), "COLUMN_BASE_NAME", likeSearchOption);
    }

    protected void regColumnBaseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseName(), "COLUMN_BASE_NAME"); }
    protected abstract ConditionValue xgetCValueColumnBaseName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirst The value of columnBaseNumberFirst as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_Equal(Integer columnBaseNumberFirst) {
        doSetColumnBaseNumberFirst_Equal(columnBaseNumberFirst);
    }

    protected void doSetColumnBaseNumberFirst_Equal(Integer columnBaseNumberFirst) {
        regColumnBaseNumberFirst(CK_EQ, columnBaseNumberFirst);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirst The value of columnBaseNumberFirst as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_GreaterThan(Integer columnBaseNumberFirst) {
        regColumnBaseNumberFirst(CK_GT, columnBaseNumberFirst);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirst The value of columnBaseNumberFirst as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_LessThan(Integer columnBaseNumberFirst) {
        regColumnBaseNumberFirst(CK_LT, columnBaseNumberFirst);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirst The value of columnBaseNumberFirst as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_GreaterEqual(Integer columnBaseNumberFirst) {
        regColumnBaseNumberFirst(CK_GE, columnBaseNumberFirst);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirst The value of columnBaseNumberFirst as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_LessEqual(Integer columnBaseNumberFirst) {
        regColumnBaseNumberFirst(CK_LE, columnBaseNumberFirst);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param minNumber The min number of columnBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setColumnBaseNumberFirst_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setColumnBaseNumberFirst_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param minNumber The min number of columnBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnBaseNumberFirst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColumnBaseNumberFirst_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColumnBaseNumberFirst(), "COLUMN_BASE_NUMBER_FIRST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirstList The collection of columnBaseNumberFirst as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_InScope(Collection<Integer> columnBaseNumberFirstList) {
        doSetColumnBaseNumberFirst_InScope(columnBaseNumberFirstList);
    }

    protected void doSetColumnBaseNumberFirst_InScope(Collection<Integer> columnBaseNumberFirstList) {
        regINS(CK_INS, cTL(columnBaseNumberFirstList), xgetCValueColumnBaseNumberFirst(), "COLUMN_BASE_NUMBER_FIRST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @param columnBaseNumberFirstList The collection of columnBaseNumberFirst as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseNumberFirst_NotInScope(Collection<Integer> columnBaseNumberFirstList) {
        doSetColumnBaseNumberFirst_NotInScope(columnBaseNumberFirstList);
    }

    protected void doSetColumnBaseNumberFirst_NotInScope(Collection<Integer> columnBaseNumberFirstList) {
        regINS(CK_NINS, cTL(columnBaseNumberFirstList), xgetCValueColumnBaseNumberFirst(), "COLUMN_BASE_NUMBER_FIRST");
    }

    protected void regColumnBaseNumberFirst(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseNumberFirst(), "COLUMN_BASE_NUMBER_FIRST"); }
    protected abstract ConditionValue xgetCValueColumnBaseNumberFirst();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecond The value of columnBaseNumberSecond as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_Equal(Integer columnBaseNumberSecond) {
        doSetColumnBaseNumberSecond_Equal(columnBaseNumberSecond);
    }

    protected void doSetColumnBaseNumberSecond_Equal(Integer columnBaseNumberSecond) {
        regColumnBaseNumberSecond(CK_EQ, columnBaseNumberSecond);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecond The value of columnBaseNumberSecond as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_GreaterThan(Integer columnBaseNumberSecond) {
        regColumnBaseNumberSecond(CK_GT, columnBaseNumberSecond);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecond The value of columnBaseNumberSecond as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_LessThan(Integer columnBaseNumberSecond) {
        regColumnBaseNumberSecond(CK_LT, columnBaseNumberSecond);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecond The value of columnBaseNumberSecond as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_GreaterEqual(Integer columnBaseNumberSecond) {
        regColumnBaseNumberSecond(CK_GE, columnBaseNumberSecond);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecond The value of columnBaseNumberSecond as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_LessEqual(Integer columnBaseNumberSecond) {
        regColumnBaseNumberSecond(CK_LE, columnBaseNumberSecond);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param minNumber The min number of columnBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setColumnBaseNumberSecond_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setColumnBaseNumberSecond_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param minNumber The min number of columnBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnBaseNumberSecond. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColumnBaseNumberSecond_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColumnBaseNumberSecond(), "COLUMN_BASE_NUMBER_SECOND", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecondList The collection of columnBaseNumberSecond as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_InScope(Collection<Integer> columnBaseNumberSecondList) {
        doSetColumnBaseNumberSecond_InScope(columnBaseNumberSecondList);
    }

    protected void doSetColumnBaseNumberSecond_InScope(Collection<Integer> columnBaseNumberSecondList) {
        regINS(CK_INS, cTL(columnBaseNumberSecondList), xgetCValueColumnBaseNumberSecond(), "COLUMN_BASE_NUMBER_SECOND");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @param columnBaseNumberSecondList The collection of columnBaseNumberSecond as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnBaseNumberSecond_NotInScope(Collection<Integer> columnBaseNumberSecondList) {
        doSetColumnBaseNumberSecond_NotInScope(columnBaseNumberSecondList);
    }

    protected void doSetColumnBaseNumberSecond_NotInScope(Collection<Integer> columnBaseNumberSecondList) {
        regINS(CK_NINS, cTL(columnBaseNumberSecondList), xgetCValueColumnBaseNumberSecond(), "COLUMN_BASE_NUMBER_SECOND");
    }

    protected void regColumnBaseNumberSecond(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseNumberSecond(), "COLUMN_BASE_NUMBER_SECOND"); }
    protected abstract ConditionValue xgetCValueColumnBaseNumberSecond();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param columnBaseDatetime The value of columnBaseDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseDatetime_Equal(java.time.LocalDateTime columnBaseDatetime) {
        regColumnBaseDatetime(CK_EQ,  columnBaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param columnBaseDatetime The value of columnBaseDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseDatetime_GreaterThan(java.time.LocalDateTime columnBaseDatetime) {
        regColumnBaseDatetime(CK_GT,  columnBaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param columnBaseDatetime The value of columnBaseDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseDatetime_LessThan(java.time.LocalDateTime columnBaseDatetime) {
        regColumnBaseDatetime(CK_LT,  columnBaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param columnBaseDatetime The value of columnBaseDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseDatetime_GreaterEqual(java.time.LocalDateTime columnBaseDatetime) {
        regColumnBaseDatetime(CK_GE,  columnBaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param columnBaseDatetime The value of columnBaseDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseDatetime_LessEqual(java.time.LocalDateTime columnBaseDatetime) {
        regColumnBaseDatetime(CK_LE, columnBaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setColumnBaseDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setColumnBaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setColumnBaseDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setColumnBaseDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setColumnBaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "COLUMN_BASE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueColumnBaseDatetime(), nm, op);
    }

    protected void regColumnBaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseDatetime(), "COLUMN_BASE_DATETIME"); }
    protected abstract ConditionValue xgetCValueColumnBaseDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateCast The value of columnBaseVirtualDateCast as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateCast_Equal(java.time.LocalDate columnBaseVirtualDateCast) {
        regColumnBaseVirtualDateCast(CK_EQ,  columnBaseVirtualDateCast);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateCast The value of columnBaseVirtualDateCast as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateCast_GreaterThan(java.time.LocalDate columnBaseVirtualDateCast) {
        regColumnBaseVirtualDateCast(CK_GT,  columnBaseVirtualDateCast);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateCast The value of columnBaseVirtualDateCast as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateCast_LessThan(java.time.LocalDate columnBaseVirtualDateCast) {
        regColumnBaseVirtualDateCast(CK_LT,  columnBaseVirtualDateCast);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateCast The value of columnBaseVirtualDateCast as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateCast_GreaterEqual(java.time.LocalDate columnBaseVirtualDateCast) {
        regColumnBaseVirtualDateCast(CK_GE,  columnBaseVirtualDateCast);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateCast The value of columnBaseVirtualDateCast as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateCast_LessEqual(java.time.LocalDate columnBaseVirtualDateCast) {
        regColumnBaseVirtualDateCast(CK_LE, columnBaseVirtualDateCast);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * <pre>e.g. setColumnBaseVirtualDateCast_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateCast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateCast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setColumnBaseVirtualDateCast_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setColumnBaseVirtualDateCast_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * <pre>e.g. setColumnBaseVirtualDateCast_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateCast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateCast. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setColumnBaseVirtualDateCast_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "COLUMN_BASE_VIRTUAL_DATE_CAST"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueColumnBaseVirtualDateCast(), nm, op);
    }

    protected void regColumnBaseVirtualDateCast(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseVirtualDateCast(), "COLUMN_BASE_VIRTUAL_DATE_CAST"); }
    protected abstract ConditionValue xgetCValueColumnBaseVirtualDateCast();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateFormat The value of columnBaseVirtualDateFormat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateFormat_Equal(java.time.LocalDate columnBaseVirtualDateFormat) {
        regColumnBaseVirtualDateFormat(CK_EQ,  columnBaseVirtualDateFormat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateFormat The value of columnBaseVirtualDateFormat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateFormat_GreaterThan(java.time.LocalDate columnBaseVirtualDateFormat) {
        regColumnBaseVirtualDateFormat(CK_GT,  columnBaseVirtualDateFormat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateFormat The value of columnBaseVirtualDateFormat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateFormat_LessThan(java.time.LocalDate columnBaseVirtualDateFormat) {
        regColumnBaseVirtualDateFormat(CK_LT,  columnBaseVirtualDateFormat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateFormat The value of columnBaseVirtualDateFormat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateFormat_GreaterEqual(java.time.LocalDate columnBaseVirtualDateFormat) {
        regColumnBaseVirtualDateFormat(CK_GE,  columnBaseVirtualDateFormat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * @param columnBaseVirtualDateFormat The value of columnBaseVirtualDateFormat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnBaseVirtualDateFormat_LessEqual(java.time.LocalDate columnBaseVirtualDateFormat) {
        regColumnBaseVirtualDateFormat(CK_LE, columnBaseVirtualDateFormat);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * <pre>e.g. setColumnBaseVirtualDateFormat_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateFormat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateFormat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setColumnBaseVirtualDateFormat_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setColumnBaseVirtualDateFormat_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * <pre>e.g. setColumnBaseVirtualDateFormat_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateFormat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of columnBaseVirtualDateFormat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setColumnBaseVirtualDateFormat_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "COLUMN_BASE_VIRTUAL_DATE_FORMAT"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueColumnBaseVirtualDateFormat(), nm, op);
    }

    protected void regColumnBaseVirtualDateFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnBaseVirtualDateFormat(), "COLUMN_BASE_VIRTUAL_DATE_FORMAT"); }
    protected abstract ConditionValue xgetCValueColumnBaseVirtualDateFormat();

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
    public HpSLCFunction<WhiteGeneratedColumnBaseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteGeneratedColumnBaseCB.class);
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
    public HpSLCFunction<WhiteGeneratedColumnBaseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteGeneratedColumnBaseCB.class);
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
    public HpSLCFunction<WhiteGeneratedColumnBaseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteGeneratedColumnBaseCB.class);
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
    public HpSLCFunction<WhiteGeneratedColumnBaseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteGeneratedColumnBaseCB.class);
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
    public HpSLCFunction<WhiteGeneratedColumnBaseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteGeneratedColumnBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteGeneratedColumnBaseCB&gt;() {
     *     public void query(WhiteGeneratedColumnBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteGeneratedColumnBaseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteGeneratedColumnBaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGeneratedColumnBaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteGeneratedColumnBaseCQ sq);

    protected WhiteGeneratedColumnBaseCB xcreateScalarConditionCB() {
        WhiteGeneratedColumnBaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteGeneratedColumnBaseCB xcreateScalarConditionPartitionByCB() {
        WhiteGeneratedColumnBaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteGeneratedColumnBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGeneratedColumnBaseCB cb = new WhiteGeneratedColumnBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COLUMN_BASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteGeneratedColumnBaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteGeneratedColumnBaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteGeneratedColumnBaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGeneratedColumnBaseCB cb = new WhiteGeneratedColumnBaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COLUMN_BASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteGeneratedColumnBaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteGeneratedColumnBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteGeneratedColumnBaseCB cb = new WhiteGeneratedColumnBaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteGeneratedColumnBaseCQ sq);

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
    protected WhiteGeneratedColumnBaseCB newMyCB() {
        return new WhiteGeneratedColumnBaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteGeneratedColumnBaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
