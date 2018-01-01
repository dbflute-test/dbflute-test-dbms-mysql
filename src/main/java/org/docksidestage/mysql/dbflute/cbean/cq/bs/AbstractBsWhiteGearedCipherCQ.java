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
 * The abstract condition-query of white_geared_cipher.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteGearedCipherCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteGearedCipherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_geared_cipher";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherId_Equal(Long cipherId) {
        doSetCipherId_Equal(cipherId);
    }

    protected void doSetCipherId_Equal(Long cipherId) {
        regCipherId(CK_EQ, cipherId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherId_GreaterThan(Long cipherId) {
        regCipherId(CK_GT, cipherId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherId_LessThan(Long cipherId) {
        regCipherId(CK_LT, cipherId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherId_GreaterEqual(Long cipherId) {
        regCipherId(CK_GE, cipherId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherId_LessEqual(Long cipherId) {
        regCipherId(CK_LE, cipherId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cipherId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cipherId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCipherId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCipherId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cipherId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cipherId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCipherId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCipherId(), "CIPHER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherIdList The collection of cipherId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherId_InScope(Collection<Long> cipherIdList) {
        doSetCipherId_InScope(cipherIdList);
    }

    protected void doSetCipherId_InScope(Collection<Long> cipherIdList) {
        regINS(CK_INS, cTL(cipherIdList), xgetCValueCipherId(), "CIPHER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherIdList The collection of cipherId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherId_NotInScope(Collection<Long> cipherIdList) {
        doSetCipherId_NotInScope(cipherIdList);
    }

    protected void doSetCipherId_NotInScope(Collection<Long> cipherIdList) {
        regINS(CK_NINS, cTL(cipherIdList), xgetCValueCipherId(), "CIPHER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCipherId_IsNull() { regCipherId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCipherId_IsNotNull() { regCipherId(CK_ISNN, DOBJ); }

    protected void regCipherId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCipherId(), "CIPHER_ID"); }
    protected abstract ConditionValue xgetCValueCipherId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherInteger_Equal(Integer cipherInteger) {
        doSetCipherInteger_Equal(cipherInteger);
    }

    protected void doSetCipherInteger_Equal(Integer cipherInteger) {
        regCipherInteger(CK_EQ, cipherInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherInteger_GreaterThan(Integer cipherInteger) {
        regCipherInteger(CK_GT, cipherInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherInteger_LessThan(Integer cipherInteger) {
        regCipherInteger(CK_LT, cipherInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherInteger_GreaterEqual(Integer cipherInteger) {
        regCipherInteger(CK_GE, cipherInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherInteger_LessEqual(Integer cipherInteger) {
        regCipherInteger(CK_LE, cipherInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param minNumber The min number of cipherInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cipherInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCipherInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCipherInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param minNumber The min number of cipherInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cipherInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCipherInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCipherInteger(), "CIPHER_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherIntegerList The collection of cipherInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherInteger_InScope(Collection<Integer> cipherIntegerList) {
        doSetCipherInteger_InScope(cipherIntegerList);
    }

    protected void doSetCipherInteger_InScope(Collection<Integer> cipherIntegerList) {
        regINS(CK_INS, cTL(cipherIntegerList), xgetCValueCipherInteger(), "CIPHER_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherIntegerList The collection of cipherInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherInteger_NotInScope(Collection<Integer> cipherIntegerList) {
        doSetCipherInteger_NotInScope(cipherIntegerList);
    }

    protected void doSetCipherInteger_NotInScope(Collection<Integer> cipherIntegerList) {
        regINS(CK_NINS, cTL(cipherIntegerList), xgetCValueCipherInteger(), "CIPHER_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     */
    public void setCipherInteger_IsNull() { regCipherInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CIPHER_INTEGER: {VARCHAR(100)}
     */
    public void setCipherInteger_IsNotNull() { regCipherInteger(CK_ISNN, DOBJ); }

    protected void regCipherInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCipherInteger(), "CIPHER_INTEGER"); }
    protected abstract ConditionValue xgetCValueCipherInteger();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherVarchar_Equal(String cipherVarchar) {
        doSetCipherVarchar_Equal(fRES(cipherVarchar));
    }

    protected void doSetCipherVarchar_Equal(String cipherVarchar) {
        regCipherVarchar(CK_EQ, cipherVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherVarchar_NotEqual(String cipherVarchar) {
        doSetCipherVarchar_NotEqual(fRES(cipherVarchar));
    }

    protected void doSetCipherVarchar_NotEqual(String cipherVarchar) {
        regCipherVarchar(CK_NES, cipherVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarcharList The collection of cipherVarchar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherVarchar_InScope(Collection<String> cipherVarcharList) {
        doSetCipherVarchar_InScope(cipherVarcharList);
    }

    protected void doSetCipherVarchar_InScope(Collection<String> cipherVarcharList) {
        regINS(CK_INS, cTL(cipherVarcharList), xgetCValueCipherVarchar(), "CIPHER_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarcharList The collection of cipherVarchar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCipherVarchar_NotInScope(Collection<String> cipherVarcharList) {
        doSetCipherVarchar_NotInScope(cipherVarcharList);
    }

    protected void doSetCipherVarchar_NotInScope(Collection<String> cipherVarcharList) {
        regINS(CK_NINS, cTL(cipherVarcharList), xgetCValueCipherVarchar(), "CIPHER_VARCHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)} <br>
     * <pre>e.g. setCipherVarchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cipherVarchar The value of cipherVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCipherVarchar_LikeSearch(String cipherVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCipherVarchar_LikeSearch(cipherVarchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)} <br>
     * <pre>e.g. setCipherVarchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cipherVarchar The value of cipherVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCipherVarchar_LikeSearch(String cipherVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cipherVarchar), xgetCValueCipherVarchar(), "CIPHER_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCipherVarchar_NotLikeSearch(String cipherVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCipherVarchar_NotLikeSearch(cipherVarchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCipherVarchar_NotLikeSearch(String cipherVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cipherVarchar), xgetCValueCipherVarchar(), "CIPHER_VARCHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     */
    public void setCipherVarchar_IsNull() { regCipherVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     */
    public void setCipherVarchar_IsNullOrEmpty() { regCipherVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CIPHER_VARCHAR: {VARCHAR(100)}
     */
    public void setCipherVarchar_IsNotNull() { regCipherVarchar(CK_ISNN, DOBJ); }

    protected void regCipherVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCipherVarchar(), "CIPHER_VARCHAR"); }
    protected abstract ConditionValue xgetCValueCipherVarchar();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDate_Equal(java.time.LocalDate cipherDate) {
        regCipherDate(CK_EQ,  cipherDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDate_GreaterThan(java.time.LocalDate cipherDate) {
        regCipherDate(CK_GT,  cipherDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDate_LessThan(java.time.LocalDate cipherDate) {
        regCipherDate(CK_LT,  cipherDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDate_GreaterEqual(java.time.LocalDate cipherDate) {
        regCipherDate(CK_GE,  cipherDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDate_LessEqual(java.time.LocalDate cipherDate) {
        regCipherDate(CK_LE, cipherDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * <pre>e.g. setCipherDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCipherDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCipherDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     * <pre>e.g. setCipherDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCipherDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "CIPHER_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCipherDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     */
    public void setCipherDate_IsNull() { regCipherDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CIPHER_DATE: {VARCHAR(100)}
     */
    public void setCipherDate_IsNotNull() { regCipherDate(CK_ISNN, DOBJ); }

    protected void regCipherDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCipherDate(), "CIPHER_DATE"); }
    protected abstract ConditionValue xgetCValueCipherDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDatetime_Equal(java.time.LocalDateTime cipherDatetime) {
        regCipherDatetime(CK_EQ,  cipherDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDatetime_GreaterThan(java.time.LocalDateTime cipherDatetime) {
        regCipherDatetime(CK_GT,  cipherDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDatetime_LessThan(java.time.LocalDateTime cipherDatetime) {
        regCipherDatetime(CK_LT,  cipherDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDatetime_GreaterEqual(java.time.LocalDateTime cipherDatetime) {
        regCipherDatetime(CK_GE,  cipherDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCipherDatetime_LessEqual(java.time.LocalDateTime cipherDatetime) {
        regCipherDatetime(CK_LE, cipherDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * <pre>e.g. setCipherDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCipherDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCipherDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     * <pre>e.g. setCipherDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCipherDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "CIPHER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCipherDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     */
    public void setCipherDatetime_IsNull() { regCipherDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CIPHER_DATETIME: {VARCHAR(100)}
     */
    public void setCipherDatetime_IsNotNull() { regCipherDatetime(CK_ISNN, DOBJ); }

    protected void regCipherDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCipherDatetime(), "CIPHER_DATETIME"); }
    protected abstract ConditionValue xgetCValueCipherDatetime();

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
    public HpSLCFunction<WhiteGearedCipherCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteGearedCipherCB.class);
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
    public HpSLCFunction<WhiteGearedCipherCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteGearedCipherCB.class);
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
    public HpSLCFunction<WhiteGearedCipherCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteGearedCipherCB.class);
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
    public HpSLCFunction<WhiteGearedCipherCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteGearedCipherCB.class);
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
    public HpSLCFunction<WhiteGearedCipherCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteGearedCipherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteGearedCipherCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteGearedCipherCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGearedCipherCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteGearedCipherCQ sq);

    protected WhiteGearedCipherCB xcreateScalarConditionCB() {
        WhiteGearedCipherCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteGearedCipherCB xcreateScalarConditionPartitionByCB() {
        WhiteGearedCipherCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteGearedCipherCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CIPHER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteGearedCipherCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteGearedCipherCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteGearedCipherCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CIPHER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteGearedCipherCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteGearedCipherCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteGearedCipherCQ sq);

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
    protected WhiteGearedCipherCB newMyCB() {
        return new WhiteGearedCipherCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteGearedCipherCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
