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
 * The abstract condition-query of white_non_unique_many_to_one_from.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteNonUniqueManyToOneFromCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteNonUniqueManyToOneFromCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_non_unique_many_to_one_from";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_Equal(Long fromId) {
        doSetFromId_Equal(fromId);
    }

    protected void doSetFromId_Equal(Long fromId) {
        regFromId(CK_EQ, fromId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_GreaterThan(Long fromId) {
        regFromId(CK_GT, fromId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_LessThan(Long fromId) {
        regFromId(CK_LT, fromId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_GreaterEqual(Long fromId) {
        regFromId(CK_GE, fromId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromId The value of fromId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromId_LessEqual(Long fromId) {
        regFromId(CK_LE, fromId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of fromId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFromId(), "FROM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param fromIdList The collection of fromId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromId_NotInScope(Collection<Long> fromIdList) {
        doSetFromId_NotInScope(fromIdList);
    }

    protected void doSetFromId_NotInScope(Collection<Long> fromIdList) {
        regINS(CK_NINS, cTL(fromIdList), xgetCValueFromId(), "FROM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setFromId_IsNull() { regFromId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setFromId_IsNotNull() { regFromId(CK_ISNN, DOBJ); }

    protected void regFromId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromId(), "FROM_ID"); }
    protected abstract ConditionValue xgetCValueFromId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromName_Equal(String fromName) {
        doSetFromName_Equal(fRES(fromName));
    }

    protected void doSetFromName_Equal(String fromName) {
        regFromName(CK_EQ, fromName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromName_NotEqual(String fromName) {
        doSetFromName_NotEqual(fRES(fromName));
    }

    protected void doSetFromName_NotEqual(String fromName) {
        regFromName(CK_NES, fromName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromNameList The collection of fromName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromName_InScope(Collection<String> fromNameList) {
        doSetFromName_InScope(fromNameList);
    }

    protected void doSetFromName_InScope(Collection<String> fromNameList) {
        regINS(CK_INS, cTL(fromNameList), xgetCValueFromName(), "FROM_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromNameList The collection of fromName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromName_NotInScope(Collection<String> fromNameList) {
        doSetFromName_NotInScope(fromNameList);
    }

    protected void doSetFromName_NotInScope(Collection<String> fromNameList) {
        regINS(CK_NINS, cTL(fromNameList), xgetCValueFromName(), "FROM_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFromName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fromName The value of fromName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFromName_LikeSearch(String fromName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFromName_LikeSearch(fromName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFromName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromName The value of fromName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromName_LikeSearch(String fromName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromName), xgetCValueFromName(), "FROM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFromName_NotLikeSearch(String fromName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFromName_NotLikeSearch(fromName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @param fromName The value of fromName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromName_NotLikeSearch(String fromName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromName), xgetCValueFromName(), "FROM_NAME", likeSearchOption);
    }

    protected void regFromName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromName(), "FROM_NAME"); }
    protected abstract ConditionValue xgetCValueFromName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @param nonUniqueCode The value of nonUniqueCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonUniqueCode_Equal(String nonUniqueCode) {
        doSetNonUniqueCode_Equal(fRES(nonUniqueCode));
    }

    protected void doSetNonUniqueCode_Equal(String nonUniqueCode) {
        regNonUniqueCode(CK_EQ, nonUniqueCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @param nonUniqueCode The value of nonUniqueCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonUniqueCode_NotEqual(String nonUniqueCode) {
        doSetNonUniqueCode_NotEqual(fRES(nonUniqueCode));
    }

    protected void doSetNonUniqueCode_NotEqual(String nonUniqueCode) {
        regNonUniqueCode(CK_NES, nonUniqueCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @param nonUniqueCodeList The collection of nonUniqueCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonUniqueCode_InScope(Collection<String> nonUniqueCodeList) {
        doSetNonUniqueCode_InScope(nonUniqueCodeList);
    }

    protected void doSetNonUniqueCode_InScope(Collection<String> nonUniqueCodeList) {
        regINS(CK_INS, cTL(nonUniqueCodeList), xgetCValueNonUniqueCode(), "NON_UNIQUE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @param nonUniqueCodeList The collection of nonUniqueCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonUniqueCode_NotInScope(Collection<String> nonUniqueCodeList) {
        doSetNonUniqueCode_NotInScope(nonUniqueCodeList);
    }

    protected void doSetNonUniqueCode_NotInScope(Collection<String> nonUniqueCodeList) {
        regINS(CK_NINS, cTL(nonUniqueCodeList), xgetCValueNonUniqueCode(), "NON_UNIQUE_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO} <br>
     * <pre>e.g. setNonUniqueCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nonUniqueCode The value of nonUniqueCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNonUniqueCode_LikeSearch(String nonUniqueCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNonUniqueCode_LikeSearch(nonUniqueCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO} <br>
     * <pre>e.g. setNonUniqueCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nonUniqueCode The value of nonUniqueCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNonUniqueCode_LikeSearch(String nonUniqueCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nonUniqueCode), xgetCValueNonUniqueCode(), "NON_UNIQUE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @param nonUniqueCode The value of nonUniqueCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNonUniqueCode_NotLikeSearch(String nonUniqueCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNonUniqueCode_NotLikeSearch(nonUniqueCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @param nonUniqueCode The value of nonUniqueCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNonUniqueCode_NotLikeSearch(String nonUniqueCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nonUniqueCode), xgetCValueNonUniqueCode(), "NON_UNIQUE_CODE", likeSearchOption);
    }

    protected void regNonUniqueCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonUniqueCode(), "NON_UNIQUE_CODE"); }
    protected abstract ConditionValue xgetCValueNonUniqueCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @param beginDate The value of beginDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDate_Equal(java.time.LocalDate beginDate) {
        regBeginDate(CK_EQ,  beginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @param beginDate The value of beginDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDate_GreaterThan(java.time.LocalDate beginDate) {
        regBeginDate(CK_GT,  beginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @param beginDate The value of beginDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDate_LessThan(java.time.LocalDate beginDate) {
        regBeginDate(CK_LT,  beginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @param beginDate The value of beginDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDate_GreaterEqual(java.time.LocalDate beginDate) {
        regBeginDate(CK_GE,  beginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @param beginDate The value of beginDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDate_LessEqual(java.time.LocalDate beginDate) {
        regBeginDate(CK_LE, beginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setBeginDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBeginDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setBeginDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "BEGIN_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBeginDate(), nm, op);
    }

    protected void regBeginDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeginDate(), "BEGIN_DATE"); }
    protected abstract ConditionValue xgetCValueBeginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @param endDate The value of endDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDate_Equal(java.time.LocalDate endDate) {
        regEndDate(CK_EQ,  endDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @param endDate The value of endDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDate_GreaterThan(java.time.LocalDate endDate) {
        regEndDate(CK_GT,  endDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @param endDate The value of endDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDate_LessThan(java.time.LocalDate endDate) {
        regEndDate(CK_LT,  endDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @param endDate The value of endDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDate_GreaterEqual(java.time.LocalDate endDate) {
        regEndDate(CK_GE,  endDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * @param endDate The value of endDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDate_LessEqual(java.time.LocalDate endDate) {
        regEndDate(CK_LE, endDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setEndDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEndDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setEndDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "END_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEndDate(), nm, op);
    }

    protected void regEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndDate(), "END_DATE"); }
    protected abstract ConditionValue xgetCValueEndDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPoint The value of manyPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyPoint_Equal(Integer manyPoint) {
        doSetManyPoint_Equal(manyPoint);
    }

    protected void doSetManyPoint_Equal(Integer manyPoint) {
        regManyPoint(CK_EQ, manyPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPoint The value of manyPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyPoint_GreaterThan(Integer manyPoint) {
        regManyPoint(CK_GT, manyPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPoint The value of manyPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyPoint_LessThan(Integer manyPoint) {
        regManyPoint(CK_LT, manyPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPoint The value of manyPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyPoint_GreaterEqual(Integer manyPoint) {
        regManyPoint(CK_GE, manyPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPoint The value of manyPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyPoint_LessEqual(Integer manyPoint) {
        regManyPoint(CK_LE, manyPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param minNumber The min number of manyPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setManyPoint_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setManyPoint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param minNumber The min number of manyPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyPoint_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueManyPoint(), "MANY_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPointList The collection of manyPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyPoint_InScope(Collection<Integer> manyPointList) {
        doSetManyPoint_InScope(manyPointList);
    }

    protected void doSetManyPoint_InScope(Collection<Integer> manyPointList) {
        regINS(CK_INS, cTL(manyPointList), xgetCValueManyPoint(), "MANY_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_POINT: {NotNull, INT(10)}
     * @param manyPointList The collection of manyPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyPoint_NotInScope(Collection<Integer> manyPointList) {
        doSetManyPoint_NotInScope(manyPointList);
    }

    protected void doSetManyPoint_NotInScope(Collection<Integer> manyPointList) {
        regINS(CK_NINS, cTL(manyPointList), xgetCValueManyPoint(), "MANY_POINT");
    }

    protected void regManyPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyPoint(), "MANY_POINT"); }
    protected abstract ConditionValue xgetCValueManyPoint();

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
    public HpSLCFunction<WhiteNonUniqueManyToOneFromCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteNonUniqueManyToOneFromCB.class);
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
    public HpSLCFunction<WhiteNonUniqueManyToOneFromCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteNonUniqueManyToOneFromCB.class);
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
    public HpSLCFunction<WhiteNonUniqueManyToOneFromCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteNonUniqueManyToOneFromCB.class);
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
    public HpSLCFunction<WhiteNonUniqueManyToOneFromCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteNonUniqueManyToOneFromCB.class);
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
    public HpSLCFunction<WhiteNonUniqueManyToOneFromCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteNonUniqueManyToOneFromCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteNonUniqueManyToOneFromCB&gt;() {
     *     public void query(WhiteNonUniqueManyToOneFromCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteNonUniqueManyToOneFromCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteNonUniqueManyToOneFromCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNonUniqueManyToOneFromCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteNonUniqueManyToOneFromCQ sq);

    protected WhiteNonUniqueManyToOneFromCB xcreateScalarConditionCB() {
        WhiteNonUniqueManyToOneFromCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteNonUniqueManyToOneFromCB xcreateScalarConditionPartitionByCB() {
        WhiteNonUniqueManyToOneFromCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteNonUniqueManyToOneFromCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNonUniqueManyToOneFromCB cb = new WhiteNonUniqueManyToOneFromCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FROM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteNonUniqueManyToOneFromCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteNonUniqueManyToOneFromCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteNonUniqueManyToOneFromCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNonUniqueManyToOneFromCB cb = new WhiteNonUniqueManyToOneFromCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FROM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteNonUniqueManyToOneFromCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteNonUniqueManyToOneFromCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteNonUniqueManyToOneFromCB cb = new WhiteNonUniqueManyToOneFromCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteNonUniqueManyToOneFromCQ sq);

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
    protected WhiteNonUniqueManyToOneFromCB newMyCB() {
        return new WhiteNonUniqueManyToOneFromCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteNonUniqueManyToOneFromCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
