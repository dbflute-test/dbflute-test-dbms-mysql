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
 * The abstract condition-query of white_delimiter.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDelimiterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDelimiterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_delimiter";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelimiterId_Equal(Long delimiterId) {
        doSetDelimiterId_Equal(delimiterId);
    }

    protected void doSetDelimiterId_Equal(Long delimiterId) {
        regDelimiterId(CK_EQ, delimiterId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelimiterId_NotEqual(Long delimiterId) {
        doSetDelimiterId_NotEqual(delimiterId);
    }

    protected void doSetDelimiterId_NotEqual(Long delimiterId) {
        regDelimiterId(CK_NES, delimiterId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelimiterId_GreaterThan(Long delimiterId) {
        regDelimiterId(CK_GT, delimiterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelimiterId_LessThan(Long delimiterId) {
        regDelimiterId(CK_LT, delimiterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelimiterId_GreaterEqual(Long delimiterId) {
        regDelimiterId(CK_GE, delimiterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterId The value of delimiterId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelimiterId_LessEqual(Long delimiterId) {
        regDelimiterId(CK_LE, delimiterId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of delimiterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delimiterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDelimiterId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDelimiterId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of delimiterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delimiterId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelimiterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelimiterId(), "DELIMITER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterIdList The collection of delimiterId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiterId_InScope(Collection<Long> delimiterIdList) {
        doSetDelimiterId_InScope(delimiterIdList);
    }

    protected void doSetDelimiterId_InScope(Collection<Long> delimiterIdList) {
        regINS(CK_INS, cTL(delimiterIdList), xgetCValueDelimiterId(), "DELIMITER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param delimiterIdList The collection of delimiterId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiterId_NotInScope(Collection<Long> delimiterIdList) {
        doSetDelimiterId_NotInScope(delimiterIdList);
    }

    protected void doSetDelimiterId_NotInScope(Collection<Long> delimiterIdList) {
        regINS(CK_NINS, cTL(delimiterIdList), xgetCValueDelimiterId(), "DELIMITER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setDelimiterId_IsNull() { regDelimiterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setDelimiterId_IsNotNull() { regDelimiterId(CK_ISNN, DOBJ); }

    protected void regDelimiterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelimiterId(), "DELIMITER_ID"); }
    protected abstract ConditionValue xgetCValueDelimiterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberNullable_Equal(Integer numberNullable) {
        doSetNumberNullable_Equal(numberNullable);
    }

    protected void doSetNumberNullable_Equal(Integer numberNullable) {
        regNumberNullable(CK_EQ, numberNullable);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberNullable_NotEqual(Integer numberNullable) {
        doSetNumberNullable_NotEqual(numberNullable);
    }

    protected void doSetNumberNullable_NotEqual(Integer numberNullable) {
        regNumberNullable(CK_NES, numberNullable);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberNullable_GreaterThan(Integer numberNullable) {
        regNumberNullable(CK_GT, numberNullable);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberNullable_LessThan(Integer numberNullable) {
        regNumberNullable(CK_LT, numberNullable);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberNullable_GreaterEqual(Integer numberNullable) {
        regNumberNullable(CK_GE, numberNullable);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullable The value of numberNullable as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumberNullable_LessEqual(Integer numberNullable) {
        regNumberNullable(CK_LE, numberNullable);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param minNumber The min number of numberNullable. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numberNullable. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNumberNullable_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNumberNullable_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param minNumber The min number of numberNullable. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numberNullable. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumberNullable_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumberNullable(), "NUMBER_NULLABLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullableList The collection of numberNullable as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberNullable_InScope(Collection<Integer> numberNullableList) {
        doSetNumberNullable_InScope(numberNullableList);
    }

    protected void doSetNumberNullable_InScope(Collection<Integer> numberNullableList) {
        regINS(CK_INS, cTL(numberNullableList), xgetCValueNumberNullable(), "NUMBER_NULLABLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     * @param numberNullableList The collection of numberNullable as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberNullable_NotInScope(Collection<Integer> numberNullableList) {
        doSetNumberNullable_NotInScope(numberNullableList);
    }

    protected void doSetNumberNullable_NotInScope(Collection<Integer> numberNullableList) {
        regINS(CK_NINS, cTL(numberNullableList), xgetCValueNumberNullable(), "NUMBER_NULLABLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     */
    public void setNumberNullable_IsNull() { regNumberNullable(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_NULLABLE: {INT(10)}
     */
    public void setNumberNullable_IsNotNull() { regNumberNullable(CK_ISNN, DOBJ); }

    protected void regNumberNullable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberNullable(), "NUMBER_NULLABLE"); }
    protected abstract ConditionValue xgetCValueNumberNullable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_Equal(String stringConverted) {
        doSetStringConverted_Equal(fRES(stringConverted));
    }

    protected void doSetStringConverted_Equal(String stringConverted) {
        regStringConverted(CK_EQ, stringConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_NotEqual(String stringConverted) {
        doSetStringConverted_NotEqual(fRES(stringConverted));
    }

    protected void doSetStringConverted_NotEqual(String stringConverted) {
        regStringConverted(CK_NES, stringConverted);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_InScope(Collection<String> stringConvertedList) {
        doSetStringConverted_InScope(stringConvertedList);
    }

    protected void doSetStringConverted_InScope(Collection<String> stringConvertedList) {
        regINS(CK_INS, cTL(stringConvertedList), xgetCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConvertedList The collection of stringConverted as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringConverted_NotInScope(Collection<String> stringConvertedList) {
        doSetStringConverted_NotInScope(stringConvertedList);
    }

    protected void doSetStringConverted_NotInScope(Collection<String> stringConvertedList) {
        regINS(CK_NINS, cTL(stringConvertedList), xgetCValueStringConverted(), "STRING_CONVERTED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)} <br>
     * <pre>e.g. setStringConverted_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringConverted_LikeSearch(stringConverted, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)} <br>
     * <pre>e.g. setStringConverted_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringConverted), xgetCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringConverted_NotLikeSearch(stringConverted, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringConverted), xgetCValueStringConverted(), "STRING_CONVERTED", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNull() { regStringConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNullOrEmpty() { regStringConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STRING_CONVERTED: {VARCHAR(200)}
     */
    public void setStringConverted_IsNotNull() { regStringConverted(CK_ISNN, DOBJ); }

    protected void regStringConverted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringConverted(), "STRING_CONVERTED"); }
    protected abstract ConditionValue xgetCValueStringConverted();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNonConverted_Equal(String stringNonConverted) {
        doSetStringNonConverted_Equal(fRES(stringNonConverted));
    }

    protected void doSetStringNonConverted_Equal(String stringNonConverted) {
        regStringNonConverted(CK_EQ, stringNonConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNonConverted_NotEqual(String stringNonConverted) {
        doSetStringNonConverted_NotEqual(fRES(stringNonConverted));
    }

    protected void doSetStringNonConverted_NotEqual(String stringNonConverted) {
        regStringNonConverted(CK_NES, stringNonConverted);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConvertedList The collection of stringNonConverted as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNonConverted_InScope(Collection<String> stringNonConvertedList) {
        doSetStringNonConverted_InScope(stringNonConvertedList);
    }

    protected void doSetStringNonConverted_InScope(Collection<String> stringNonConvertedList) {
        regINS(CK_INS, cTL(stringNonConvertedList), xgetCValueStringNonConverted(), "STRING_NON_CONVERTED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConvertedList The collection of stringNonConverted as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNonConverted_NotInScope(Collection<String> stringNonConvertedList) {
        doSetStringNonConverted_NotInScope(stringNonConvertedList);
    }

    protected void doSetStringNonConverted_NotInScope(Collection<String> stringNonConvertedList) {
        regINS(CK_NINS, cTL(stringNonConvertedList), xgetCValueStringNonConverted(), "STRING_NON_CONVERTED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)} <br>
     * <pre>e.g. setStringNonConverted_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringNonConverted The value of stringNonConverted as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringNonConverted_LikeSearch(String stringNonConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringNonConverted_LikeSearch(stringNonConverted, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)} <br>
     * <pre>e.g. setStringNonConverted_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringNonConverted The value of stringNonConverted as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringNonConverted_LikeSearch(String stringNonConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringNonConverted), xgetCValueStringNonConverted(), "STRING_NON_CONVERTED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringNonConverted_NotLikeSearch(String stringNonConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringNonConverted_NotLikeSearch(stringNonConverted, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @param stringNonConverted The value of stringNonConverted as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringNonConverted_NotLikeSearch(String stringNonConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringNonConverted), xgetCValueStringNonConverted(), "STRING_NON_CONVERTED", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     */
    public void setStringNonConverted_IsNull() { regStringNonConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     */
    public void setStringNonConverted_IsNullOrEmpty() { regStringNonConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     */
    public void setStringNonConverted_IsNotNull() { regStringNonConverted(CK_ISNN, DOBJ); }

    protected void regStringNonConverted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringNonConverted(), "STRING_NON_CONVERTED"); }
    protected abstract ConditionValue xgetCValueStringNonConverted();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateDefault_Equal(java.time.LocalDate dateDefault) {
        regDateDefault(CK_EQ,  dateDefault);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateDefault_GreaterThan(java.time.LocalDate dateDefault) {
        regDateDefault(CK_GT,  dateDefault);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateDefault_LessThan(java.time.LocalDate dateDefault) {
        regDateDefault(CK_LT,  dateDefault);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateDefault_GreaterEqual(java.time.LocalDate dateDefault) {
        regDateDefault(CK_GE,  dateDefault);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @param dateDefault The value of dateDefault as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateDefault_LessEqual(java.time.LocalDate dateDefault) {
        regDateDefault(CK_LE, dateDefault);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * <pre>e.g. setDateDefault_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateDefault. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateDefault. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDateDefault_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDateDefault_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * <pre>e.g. setDateDefault_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateDefault. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dateDefault. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateDefault_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "DATE_DEFAULT"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDateDefault(), nm, op);
    }

    protected void regDateDefault(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateDefault(), "DATE_DEFAULT"); }
    protected abstract ConditionValue xgetCValueDateDefault();

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
    public HpSLCFunction<WhiteDelimiterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDelimiterCB.class);
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
    public HpSLCFunction<WhiteDelimiterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDelimiterCB.class);
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
    public HpSLCFunction<WhiteDelimiterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDelimiterCB.class);
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
    public HpSLCFunction<WhiteDelimiterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDelimiterCB.class);
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
    public HpSLCFunction<WhiteDelimiterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDelimiterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void query(WhiteDelimiterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDelimiterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDelimiterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDelimiterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDelimiterCQ sq);

    protected WhiteDelimiterCB xcreateScalarConditionCB() {
        WhiteDelimiterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDelimiterCB xcreateScalarConditionPartitionByCB() {
        WhiteDelimiterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDelimiterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DELIMITER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDelimiterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDelimiterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDelimiterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DELIMITER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDelimiterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDelimiterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDelimiterCB cb = new WhiteDelimiterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDelimiterCQ sq);

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
    protected WhiteDelimiterCB newMyCB() {
        return new WhiteDelimiterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDelimiterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
