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
 * The abstract condition-query of white_no_pk_common_column.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteNoPkCommonColumnCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteNoPkCommonColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_no_pk_common_column";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkId_Equal(Long noPkId) {
        doSetNoPkId_Equal(noPkId);
    }

    protected void doSetNoPkId_Equal(Long noPkId) {
        regNoPkId(CK_EQ, noPkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkId_NotEqual(Long noPkId) {
        doSetNoPkId_NotEqual(noPkId);
    }

    protected void doSetNoPkId_NotEqual(Long noPkId) {
        regNoPkId(CK_NES, noPkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkId_GreaterThan(Long noPkId) {
        regNoPkId(CK_GT, noPkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkId_LessThan(Long noPkId) {
        regNoPkId(CK_LT, noPkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkId_GreaterEqual(Long noPkId) {
        regNoPkId(CK_GE, noPkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkId The value of noPkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkId_LessEqual(Long noPkId) {
        regNoPkId(CK_LE, noPkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of noPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNoPkId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNoPkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of noPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoPkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoPkId(), "NO_PK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkIdList The collection of noPkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkId_InScope(Collection<Long> noPkIdList) {
        doSetNoPkId_InScope(noPkIdList);
    }

    protected void doSetNoPkId_InScope(Collection<Long> noPkIdList) {
        regINS(CK_INS, cTL(noPkIdList), xgetCValueNoPkId(), "NO_PK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NO_PK_ID: {NotNull, DECIMAL(16)}
     * @param noPkIdList The collection of noPkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkId_NotInScope(Collection<Long> noPkIdList) {
        doSetNoPkId_NotInScope(noPkIdList);
    }

    protected void doSetNoPkId_NotInScope(Collection<Long> noPkIdList) {
        regINS(CK_NINS, cTL(noPkIdList), xgetCValueNoPkId(), "NO_PK_ID");
    }

    protected void regNoPkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoPkId(), "NO_PK_ID"); }
    protected abstract ConditionValue xgetCValueNoPkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkName_Equal(String noPkName) {
        doSetNoPkName_Equal(fRES(noPkName));
    }

    protected void doSetNoPkName_Equal(String noPkName) {
        regNoPkName(CK_EQ, noPkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkName_NotEqual(String noPkName) {
        doSetNoPkName_NotEqual(fRES(noPkName));
    }

    protected void doSetNoPkName_NotEqual(String noPkName) {
        regNoPkName(CK_NES, noPkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkNameList The collection of noPkName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkName_InScope(Collection<String> noPkNameList) {
        doSetNoPkName_InScope(noPkNameList);
    }

    protected void doSetNoPkName_InScope(Collection<String> noPkNameList) {
        regINS(CK_INS, cTL(noPkNameList), xgetCValueNoPkName(), "NO_PK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkNameList The collection of noPkName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkName_NotInScope(Collection<String> noPkNameList) {
        doSetNoPkName_NotInScope(noPkNameList);
    }

    protected void doSetNoPkName_NotInScope(Collection<String> noPkNameList) {
        regINS(CK_NINS, cTL(noPkNameList), xgetCValueNoPkName(), "NO_PK_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)} <br>
     * <pre>e.g. setNoPkName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param noPkName The value of noPkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNoPkName_LikeSearch(String noPkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNoPkName_LikeSearch(noPkName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)} <br>
     * <pre>e.g. setNoPkName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noPkName The value of noPkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoPkName_LikeSearch(String noPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noPkName), xgetCValueNoPkName(), "NO_PK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNoPkName_NotLikeSearch(String noPkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNoPkName_NotLikeSearch(noPkName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     * @param noPkName The value of noPkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoPkName_NotLikeSearch(String noPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noPkName), xgetCValueNoPkName(), "NO_PK_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     */
    public void setNoPkName_IsNull() { regNoPkName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     */
    public void setNoPkName_IsNullOrEmpty() { regNoPkName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_PK_NAME: {VARCHAR(32)}
     */
    public void setNoPkName_IsNotNull() { regNoPkName(CK_ISNN, DOBJ); }

    protected void regNoPkName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoPkName(), "NO_PK_NAME"); }
    protected abstract ConditionValue xgetCValueNoPkName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkInteger_Equal(Integer noPkInteger) {
        doSetNoPkInteger_Equal(noPkInteger);
    }

    protected void doSetNoPkInteger_Equal(Integer noPkInteger) {
        regNoPkInteger(CK_EQ, noPkInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkInteger_NotEqual(Integer noPkInteger) {
        doSetNoPkInteger_NotEqual(noPkInteger);
    }

    protected void doSetNoPkInteger_NotEqual(Integer noPkInteger) {
        regNoPkInteger(CK_NES, noPkInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkInteger_GreaterThan(Integer noPkInteger) {
        regNoPkInteger(CK_GT, noPkInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkInteger_LessThan(Integer noPkInteger) {
        regNoPkInteger(CK_LT, noPkInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkInteger_GreaterEqual(Integer noPkInteger) {
        regNoPkInteger(CK_GE, noPkInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkInteger The value of noPkInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoPkInteger_LessEqual(Integer noPkInteger) {
        regNoPkInteger(CK_LE, noPkInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param minNumber The min number of noPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNoPkInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNoPkInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param minNumber The min number of noPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoPkInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoPkInteger(), "NO_PK_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkIntegerList The collection of noPkInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkInteger_InScope(Collection<Integer> noPkIntegerList) {
        doSetNoPkInteger_InScope(noPkIntegerList);
    }

    protected void doSetNoPkInteger_InScope(Collection<Integer> noPkIntegerList) {
        regINS(CK_INS, cTL(noPkIntegerList), xgetCValueNoPkInteger(), "NO_PK_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     * @param noPkIntegerList The collection of noPkInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoPkInteger_NotInScope(Collection<Integer> noPkIntegerList) {
        doSetNoPkInteger_NotInScope(noPkIntegerList);
    }

    protected void doSetNoPkInteger_NotInScope(Collection<Integer> noPkIntegerList) {
        regINS(CK_NINS, cTL(noPkIntegerList), xgetCValueNoPkInteger(), "NO_PK_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     */
    public void setNoPkInteger_IsNull() { regNoPkInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_PK_INTEGER: {INT(10)}
     */
    public void setNoPkInteger_IsNotNull() { regNoPkInteger(CK_ISNN, DOBJ); }

    protected void regNoPkInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoPkInteger(), "NO_PK_INTEGER"); }
    protected abstract ConditionValue xgetCValueNoPkInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

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
    public HpSLCFunction<WhiteNoPkCommonColumnCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteNoPkCommonColumnCB.class);
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
    public HpSLCFunction<WhiteNoPkCommonColumnCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteNoPkCommonColumnCB.class);
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
    public HpSLCFunction<WhiteNoPkCommonColumnCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteNoPkCommonColumnCB.class);
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
    public HpSLCFunction<WhiteNoPkCommonColumnCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteNoPkCommonColumnCB.class);
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
    public HpSLCFunction<WhiteNoPkCommonColumnCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteNoPkCommonColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteNoPkCommonColumnCB&gt;() {
     *     public void query(WhiteNoPkCommonColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteNoPkCommonColumnCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteNoPkCommonColumnCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNoPkCommonColumnCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteNoPkCommonColumnCQ sq);

    protected WhiteNoPkCommonColumnCB xcreateScalarConditionCB() {
        WhiteNoPkCommonColumnCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteNoPkCommonColumnCB xcreateScalarConditionPartitionByCB() {
        WhiteNoPkCommonColumnCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteNoPkCommonColumnCB newMyCB() {
        return new WhiteNoPkCommonColumnCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteNoPkCommonColumnCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
