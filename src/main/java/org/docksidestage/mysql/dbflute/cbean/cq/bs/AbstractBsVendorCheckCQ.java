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
 * The abstract condition-query of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVendorCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected abstract ConditionValue xgetCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, typeOfChar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, typeOfChar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), xgetCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_NotLikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), xgetCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_NotLikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarchar(), "TYPE_OF_VARCHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfVarchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @param typeOfText The value of typeOfText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_Equal(String typeOfText) {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected void doSetTypeOfText_Equal(String typeOfText) {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @param typeOfText The value of typeOfText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_NotEqual(String typeOfText) {
        doSetTypeOfText_NotEqual(fRES(typeOfText));
    }

    protected void doSetTypeOfText_NotEqual(String typeOfText) {
        regTypeOfText(CK_NES, typeOfText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @param typeOfTextList The collection of typeOfText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_InScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_InScope(typeOfTextList);
    }

    protected void doSetTypeOfText_InScope(Collection<String> typeOfTextList) {
        regINS(CK_INS, cTL(typeOfTextList), xgetCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @param typeOfTextList The collection of typeOfText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_NotInScope(typeOfTextList);
    }

    protected void doSetTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        regINS(CK_NINS, cTL(typeOfTextList), xgetCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)} <br>
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfText_LikeSearch(typeOfText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)} <br>
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfText), xgetCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfText_NotLikeSearch(typeOfText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfText), xgetCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     */
    public void setTypeOfText_IsNull() { regTypeOfText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     */
    public void setTypeOfText_IsNullOrEmpty() { regTypeOfText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     */
    public void setTypeOfText_IsNotNull() { regTypeOfText(CK_ISNN, DOBJ); }

    protected void regTypeOfText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfText(), "TYPE_OF_TEXT"); }
    protected abstract ConditionValue xgetCValueTypeOfText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @param typeOfTinytext The value of typeOfTinytext as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTinytext_Equal(String typeOfTinytext) {
        doSetTypeOfTinytext_Equal(fRES(typeOfTinytext));
    }

    protected void doSetTypeOfTinytext_Equal(String typeOfTinytext) {
        regTypeOfTinytext(CK_EQ, typeOfTinytext);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @param typeOfTinytext The value of typeOfTinytext as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTinytext_NotEqual(String typeOfTinytext) {
        doSetTypeOfTinytext_NotEqual(fRES(typeOfTinytext));
    }

    protected void doSetTypeOfTinytext_NotEqual(String typeOfTinytext) {
        regTypeOfTinytext(CK_NES, typeOfTinytext);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @param typeOfTinytextList The collection of typeOfTinytext as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTinytext_InScope(Collection<String> typeOfTinytextList) {
        doSetTypeOfTinytext_InScope(typeOfTinytextList);
    }

    protected void doSetTypeOfTinytext_InScope(Collection<String> typeOfTinytextList) {
        regINS(CK_INS, cTL(typeOfTinytextList), xgetCValueTypeOfTinytext(), "TYPE_OF_TINYTEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @param typeOfTinytextList The collection of typeOfTinytext as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfTinytext_NotInScope(Collection<String> typeOfTinytextList) {
        doSetTypeOfTinytext_NotInScope(typeOfTinytextList);
    }

    protected void doSetTypeOfTinytext_NotInScope(Collection<String> typeOfTinytextList) {
        regINS(CK_NINS, cTL(typeOfTinytextList), xgetCValueTypeOfTinytext(), "TYPE_OF_TINYTEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br>
     * <pre>e.g. setTypeOfTinytext_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfTinytext The value of typeOfTinytext as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfTinytext_LikeSearch(String typeOfTinytext, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfTinytext_LikeSearch(typeOfTinytext, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)} <br>
     * <pre>e.g. setTypeOfTinytext_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfTinytext The value of typeOfTinytext as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfTinytext_LikeSearch(String typeOfTinytext, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfTinytext), xgetCValueTypeOfTinytext(), "TYPE_OF_TINYTEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @param typeOfTinytext The value of typeOfTinytext as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfTinytext_NotLikeSearch(String typeOfTinytext, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfTinytext_NotLikeSearch(typeOfTinytext, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @param typeOfTinytext The value of typeOfTinytext as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfTinytext_NotLikeSearch(String typeOfTinytext, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfTinytext), xgetCValueTypeOfTinytext(), "TYPE_OF_TINYTEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     */
    public void setTypeOfTinytext_IsNull() { regTypeOfTinytext(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     */
    public void setTypeOfTinytext_IsNullOrEmpty() { regTypeOfTinytext(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     */
    public void setTypeOfTinytext_IsNotNull() { regTypeOfTinytext(CK_ISNN, DOBJ); }

    protected void regTypeOfTinytext(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTinytext(), "TYPE_OF_TINYTEXT"); }
    protected abstract ConditionValue xgetCValueTypeOfTinytext();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @param typeOfMediumtext The value of typeOfMediumtext as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfMediumtext_Equal(String typeOfMediumtext) {
        doSetTypeOfMediumtext_Equal(fRES(typeOfMediumtext));
    }

    protected void doSetTypeOfMediumtext_Equal(String typeOfMediumtext) {
        regTypeOfMediumtext(CK_EQ, typeOfMediumtext);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @param typeOfMediumtext The value of typeOfMediumtext as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfMediumtext_NotEqual(String typeOfMediumtext) {
        doSetTypeOfMediumtext_NotEqual(fRES(typeOfMediumtext));
    }

    protected void doSetTypeOfMediumtext_NotEqual(String typeOfMediumtext) {
        regTypeOfMediumtext(CK_NES, typeOfMediumtext);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @param typeOfMediumtextList The collection of typeOfMediumtext as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfMediumtext_InScope(Collection<String> typeOfMediumtextList) {
        doSetTypeOfMediumtext_InScope(typeOfMediumtextList);
    }

    protected void doSetTypeOfMediumtext_InScope(Collection<String> typeOfMediumtextList) {
        regINS(CK_INS, cTL(typeOfMediumtextList), xgetCValueTypeOfMediumtext(), "TYPE_OF_MEDIUMTEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @param typeOfMediumtextList The collection of typeOfMediumtext as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfMediumtext_NotInScope(Collection<String> typeOfMediumtextList) {
        doSetTypeOfMediumtext_NotInScope(typeOfMediumtextList);
    }

    protected void doSetTypeOfMediumtext_NotInScope(Collection<String> typeOfMediumtextList) {
        regINS(CK_NINS, cTL(typeOfMediumtextList), xgetCValueTypeOfMediumtext(), "TYPE_OF_MEDIUMTEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br>
     * <pre>e.g. setTypeOfMediumtext_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfMediumtext The value of typeOfMediumtext as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfMediumtext_LikeSearch(String typeOfMediumtext, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfMediumtext_LikeSearch(typeOfMediumtext, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)} <br>
     * <pre>e.g. setTypeOfMediumtext_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfMediumtext The value of typeOfMediumtext as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfMediumtext_LikeSearch(String typeOfMediumtext, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfMediumtext), xgetCValueTypeOfMediumtext(), "TYPE_OF_MEDIUMTEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @param typeOfMediumtext The value of typeOfMediumtext as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfMediumtext_NotLikeSearch(String typeOfMediumtext, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfMediumtext_NotLikeSearch(typeOfMediumtext, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @param typeOfMediumtext The value of typeOfMediumtext as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfMediumtext_NotLikeSearch(String typeOfMediumtext, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfMediumtext), xgetCValueTypeOfMediumtext(), "TYPE_OF_MEDIUMTEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     */
    public void setTypeOfMediumtext_IsNull() { regTypeOfMediumtext(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     */
    public void setTypeOfMediumtext_IsNullOrEmpty() { regTypeOfMediumtext(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     */
    public void setTypeOfMediumtext_IsNotNull() { regTypeOfMediumtext(CK_ISNN, DOBJ); }

    protected void regTypeOfMediumtext(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfMediumtext(), "TYPE_OF_MEDIUMTEXT"); }
    protected abstract ConditionValue xgetCValueTypeOfMediumtext();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @param typeOfLongtext The value of typeOfLongtext as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongtext_Equal(String typeOfLongtext) {
        doSetTypeOfLongtext_Equal(fRES(typeOfLongtext));
    }

    protected void doSetTypeOfLongtext_Equal(String typeOfLongtext) {
        regTypeOfLongtext(CK_EQ, typeOfLongtext);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @param typeOfLongtext The value of typeOfLongtext as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongtext_NotEqual(String typeOfLongtext) {
        doSetTypeOfLongtext_NotEqual(fRES(typeOfLongtext));
    }

    protected void doSetTypeOfLongtext_NotEqual(String typeOfLongtext) {
        regTypeOfLongtext(CK_NES, typeOfLongtext);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @param typeOfLongtextList The collection of typeOfLongtext as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongtext_InScope(Collection<String> typeOfLongtextList) {
        doSetTypeOfLongtext_InScope(typeOfLongtextList);
    }

    protected void doSetTypeOfLongtext_InScope(Collection<String> typeOfLongtextList) {
        regINS(CK_INS, cTL(typeOfLongtextList), xgetCValueTypeOfLongtext(), "TYPE_OF_LONGTEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @param typeOfLongtextList The collection of typeOfLongtext as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLongtext_NotInScope(Collection<String> typeOfLongtextList) {
        doSetTypeOfLongtext_NotInScope(typeOfLongtextList);
    }

    protected void doSetTypeOfLongtext_NotInScope(Collection<String> typeOfLongtextList) {
        regINS(CK_NINS, cTL(typeOfLongtextList), xgetCValueTypeOfLongtext(), "TYPE_OF_LONGTEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br>
     * <pre>e.g. setTypeOfLongtext_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfLongtext The value of typeOfLongtext as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfLongtext_LikeSearch(String typeOfLongtext, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfLongtext_LikeSearch(typeOfLongtext, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)} <br>
     * <pre>e.g. setTypeOfLongtext_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfLongtext The value of typeOfLongtext as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfLongtext_LikeSearch(String typeOfLongtext, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfLongtext), xgetCValueTypeOfLongtext(), "TYPE_OF_LONGTEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @param typeOfLongtext The value of typeOfLongtext as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfLongtext_NotLikeSearch(String typeOfLongtext, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfLongtext_NotLikeSearch(typeOfLongtext, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @param typeOfLongtext The value of typeOfLongtext as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfLongtext_NotLikeSearch(String typeOfLongtext, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfLongtext), xgetCValueTypeOfLongtext(), "TYPE_OF_LONGTEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     */
    public void setTypeOfLongtext_IsNull() { regTypeOfLongtext(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     */
    public void setTypeOfLongtext_IsNullOrEmpty() { regTypeOfLongtext(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     */
    public void setTypeOfLongtext_IsNotNull() { regTypeOfLongtext(CK_ISNN, DOBJ); }

    protected void regTypeOfLongtext(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfLongtext(), "TYPE_OF_LONGTEXT"); }
    protected abstract ConditionValue xgetCValueTypeOfLongtext();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_EQ, typeOfNumericDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_GreaterThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GT, typeOfNumericDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_LessThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LT, typeOfNumericDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_GreaterEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GE, typeOfNumericDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_LessEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LE, typeOfNumericDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericDecimal. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_InScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_INS, cTL(typeOfNumericDecimalList), xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumericDecimalList), xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNull() { regTypeOfNumericDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNotNull() { regTypeOfNumericDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_Equal(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_EQ, typeOfNumericInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_GreaterThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GT, typeOfNumericInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_LessThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LT, typeOfNumericInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_GreaterEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GE, typeOfNumericInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_LessEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LE, typeOfNumericInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfNumericInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericInteger. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfNumericInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_InScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerList), xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerList), xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfNumericInteger_IsNull() { regTypeOfNumericInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfNumericInteger_IsNotNull() { regTypeOfNumericInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_Equal(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_EQ, typeOfNumericBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_GreaterThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GT, typeOfNumericBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_LessThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LT, typeOfNumericBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_GreaterEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GE, typeOfNumericBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_LessEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LE, typeOfNumericBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfNumericBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericBigint. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfNumericBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_InScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_INS, cTL(typeOfNumericBigintList), xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_NotInScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintList), xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfNumericBigint_IsNull() { regTypeOfNumericBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfNumericBigint_IsNotNull() { regTypeOfNumericBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_Equal(java.math.BigDecimal typeOfDecimalDecimal) {
        doSetTypeOfDecimalDecimal_Equal(typeOfDecimalDecimal);
    }

    protected void doSetTypeOfDecimalDecimal_Equal(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_EQ, typeOfDecimalDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_GreaterThan(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_GT, typeOfDecimalDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_LessThan(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_LT, typeOfDecimalDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_GreaterEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_GE, typeOfDecimalDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimal The value of typeOfDecimalDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalDecimal_LessEqual(java.math.BigDecimal typeOfDecimalDecimal) {
        regTypeOfDecimalDecimal(CK_LE, typeOfDecimalDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfDecimalDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalDecimal. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimalDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimalDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfDecimalDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimalList The collection of typeOfDecimalDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        doSetTypeOfDecimalDecimal_InScope(typeOfDecimalDecimalList);
    }

    protected void doSetTypeOfDecimalDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        regINS(CK_INS, cTL(typeOfDecimalDecimalList), xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfDecimalDecimalList The collection of typeOfDecimalDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        doSetTypeOfDecimalDecimal_NotInScope(typeOfDecimalDecimalList);
    }

    protected void doSetTypeOfDecimalDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalDecimalList) {
        regINS(CK_NINS, cTL(typeOfDecimalDecimalList), xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfDecimalDecimal_IsNull() { regTypeOfDecimalDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     */
    public void setTypeOfDecimalDecimal_IsNotNull() { regTypeOfDecimalDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimalDecimal(), "TYPE_OF_DECIMAL_DECIMAL"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimalDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_Equal(Integer typeOfDecimalInteger) {
        doSetTypeOfDecimalInteger_Equal(typeOfDecimalInteger);
    }

    protected void doSetTypeOfDecimalInteger_Equal(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_EQ, typeOfDecimalInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_GreaterThan(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_GT, typeOfDecimalInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_LessThan(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_LT, typeOfDecimalInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_GreaterEqual(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_GE, typeOfDecimalInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalInteger The value of typeOfDecimalInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalInteger_LessEqual(Integer typeOfDecimalInteger) {
        regTypeOfDecimalInteger(CK_LE, typeOfDecimalInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfDecimalInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalInteger. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimalInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimalInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfDecimalInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalIntegerList The collection of typeOfDecimalInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalInteger_InScope(Collection<Integer> typeOfDecimalIntegerList) {
        doSetTypeOfDecimalInteger_InScope(typeOfDecimalIntegerList);
    }

    protected void doSetTypeOfDecimalInteger_InScope(Collection<Integer> typeOfDecimalIntegerList) {
        regINS(CK_INS, cTL(typeOfDecimalIntegerList), xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @param typeOfDecimalIntegerList The collection of typeOfDecimalInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalInteger_NotInScope(Collection<Integer> typeOfDecimalIntegerList) {
        doSetTypeOfDecimalInteger_NotInScope(typeOfDecimalIntegerList);
    }

    protected void doSetTypeOfDecimalInteger_NotInScope(Collection<Integer> typeOfDecimalIntegerList) {
        regINS(CK_NINS, cTL(typeOfDecimalIntegerList), xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfDecimalInteger_IsNull() { regTypeOfDecimalInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     */
    public void setTypeOfDecimalInteger_IsNotNull() { regTypeOfDecimalInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimalInteger(), "TYPE_OF_DECIMAL_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimalInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_Equal(Long typeOfDecimalBigint) {
        doSetTypeOfDecimalBigint_Equal(typeOfDecimalBigint);
    }

    protected void doSetTypeOfDecimalBigint_Equal(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_EQ, typeOfDecimalBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_GreaterThan(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_GT, typeOfDecimalBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_LessThan(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_LT, typeOfDecimalBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_GreaterEqual(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_GE, typeOfDecimalBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigint The value of typeOfDecimalBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimalBigint_LessEqual(Long typeOfDecimalBigint) {
        regTypeOfDecimalBigint(CK_LE, typeOfDecimalBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfDecimalBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalBigint. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimalBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimalBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfDecimalBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimalBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimalBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigintList The collection of typeOfDecimalBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalBigint_InScope(Collection<Long> typeOfDecimalBigintList) {
        doSetTypeOfDecimalBigint_InScope(typeOfDecimalBigintList);
    }

    protected void doSetTypeOfDecimalBigint_InScope(Collection<Long> typeOfDecimalBigintList) {
        regINS(CK_INS, cTL(typeOfDecimalBigintList), xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @param typeOfDecimalBigintList The collection of typeOfDecimalBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimalBigint_NotInScope(Collection<Long> typeOfDecimalBigintList) {
        doSetTypeOfDecimalBigint_NotInScope(typeOfDecimalBigintList);
    }

    protected void doSetTypeOfDecimalBigint_NotInScope(Collection<Long> typeOfDecimalBigintList) {
        regINS(CK_NINS, cTL(typeOfDecimalBigintList), xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfDecimalBigint_IsNull() { regTypeOfDecimalBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     */
    public void setTypeOfDecimalBigint_IsNotNull() { regTypeOfDecimalBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimalBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimalBigint(), "TYPE_OF_DECIMAL_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimalBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfInteger The value of typeOfInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_Equal(Integer typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(Integer typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param minNumber The min number of typeOfBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfBigint. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param minNumber The min number of typeOfBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBigint(), "TYPE_OF_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloat The value of typeOfFloat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        doSetTypeOfFloat_Equal(typeOfFloat);
    }

    protected void doSetTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_EQ, typeOfFloat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloat The value of typeOfFloat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_GreaterThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GT, typeOfFloat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloat The value of typeOfFloat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_LessThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LT, typeOfFloat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloat The value of typeOfFloat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_GreaterEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GE, typeOfFloat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloat The value of typeOfFloat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_LessEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LE, typeOfFloat);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param minNumber The min number of typeOfFloat. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfFloat. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfFloat_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param minNumber The min number of typeOfFloat. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfFloat. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloatList The collection of typeOfFloat as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_InScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_INS, cTL(typeOfFloatList), xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @param typeOfFloatList The collection of typeOfFloat as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_NotInScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_NINS, cTL(typeOfFloatList), xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     */
    public void setTypeOfFloat_IsNull() { regTypeOfFloat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     */
    public void setTypeOfFloat_IsNotNull() { regTypeOfFloat(CK_ISNN, DOBJ); }

    protected void regTypeOfFloat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfFloat(), "TYPE_OF_FLOAT"); }
    protected abstract ConditionValue xgetCValueTypeOfFloat();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDouble The value of typeOfDouble as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_Equal(java.math.BigDecimal typeOfDouble) {
        doSetTypeOfDouble_Equal(typeOfDouble);
    }

    protected void doSetTypeOfDouble_Equal(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_EQ, typeOfDouble);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDouble The value of typeOfDouble as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_GreaterThan(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_GT, typeOfDouble);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDouble The value of typeOfDouble as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_LessThan(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_LT, typeOfDouble);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDouble The value of typeOfDouble as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_GreaterEqual(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_GE, typeOfDouble);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDouble The value of typeOfDouble as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDouble_LessEqual(java.math.BigDecimal typeOfDouble) {
        regTypeOfDouble(CK_LE, typeOfDouble);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param minNumber The min number of typeOfDouble. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDouble. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDouble_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDouble_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param minNumber The min number of typeOfDouble. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDouble. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDouble_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDoubleList The collection of typeOfDouble as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDouble_InScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        doSetTypeOfDouble_InScope(typeOfDoubleList);
    }

    protected void doSetTypeOfDouble_InScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        regINS(CK_INS, cTL(typeOfDoubleList), xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @param typeOfDoubleList The collection of typeOfDouble as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDouble_NotInScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        doSetTypeOfDouble_NotInScope(typeOfDoubleList);
    }

    protected void doSetTypeOfDouble_NotInScope(Collection<java.math.BigDecimal> typeOfDoubleList) {
        regINS(CK_NINS, cTL(typeOfDoubleList), xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     */
    public void setTypeOfDouble_IsNull() { regTypeOfDouble(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     */
    public void setTypeOfDouble_IsNotNull() { regTypeOfDouble(CK_ISNN, DOBJ); }

    protected void regTypeOfDouble(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDouble(), "TYPE_OF_DOUBLE"); }
    protected abstract ConditionValue xgetCValueTypeOfDouble();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_Equal(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_EQ,  typeOfDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterThan(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_GT,  typeOfDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessThan(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_LT,  typeOfDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterEqual(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_GE,  typeOfDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessEqual(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_LE, typeOfDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_OF_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(10)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDate(), "TYPE_OF_DATE"); }
    protected abstract ConditionValue xgetCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @param typeOfDatetime The value of typeOfDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_Equal(java.time.LocalDateTime typeOfDatetime) {
        regTypeOfDatetime(CK_EQ,  typeOfDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @param typeOfDatetime The value of typeOfDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_GreaterThan(java.time.LocalDateTime typeOfDatetime) {
        regTypeOfDatetime(CK_GT,  typeOfDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @param typeOfDatetime The value of typeOfDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_LessThan(java.time.LocalDateTime typeOfDatetime) {
        regTypeOfDatetime(CK_LT,  typeOfDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @param typeOfDatetime The value of typeOfDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_GreaterEqual(java.time.LocalDateTime typeOfDatetime) {
        regTypeOfDatetime(CK_GE,  typeOfDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @param typeOfDatetime The value of typeOfDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDatetime_LessEqual(java.time.LocalDateTime typeOfDatetime) {
        regTypeOfDatetime(CK_LE, typeOfDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * <pre>e.g. setTypeOfDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * <pre>e.g. setTypeOfDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_OF_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     */
    public void setTypeOfDatetime_IsNull() { regTypeOfDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     */
    public void setTypeOfDatetime_IsNotNull() { regTypeOfDatetime(CK_ISNN, DOBJ); }

    protected void regTypeOfDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDatetime(), "TYPE_OF_DATETIME"); }
    protected abstract ConditionValue xgetCValueTypeOfDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_Equal(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterThan(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessThan(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessEqual(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfTimestamp_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_OF_TIMESTAMP"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfTimestamp(), nm, op);
    }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    protected abstract ConditionValue xgetCValueTypeOfTimestamp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_Equal(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_GreaterThan(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_LessThan(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_GreaterEqual(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @param typeOfTime The value of typeOfTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_LessEqual(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     */
    public void setTypeOfTime_IsNull() { regTypeOfTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIME: {TIME(8)}
     */
    public void setTypeOfTime_IsNotNull() { regTypeOfTime(CK_ISNN, DOBJ); }

    protected void regTypeOfTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTime(), "TYPE_OF_TIME"); }
    protected abstract ConditionValue xgetCValueTypeOfTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @param typeOfYear The value of typeOfYear as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfYear_Equal(java.time.LocalDate typeOfYear) {
        regTypeOfYear(CK_EQ,  typeOfYear);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @param typeOfYear The value of typeOfYear as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfYear_GreaterThan(java.time.LocalDate typeOfYear) {
        regTypeOfYear(CK_GT,  typeOfYear);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @param typeOfYear The value of typeOfYear as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfYear_LessThan(java.time.LocalDate typeOfYear) {
        regTypeOfYear(CK_LT,  typeOfYear);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @param typeOfYear The value of typeOfYear as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfYear_GreaterEqual(java.time.LocalDate typeOfYear) {
        regTypeOfYear(CK_GE,  typeOfYear);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @param typeOfYear The value of typeOfYear as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfYear_LessEqual(java.time.LocalDate typeOfYear) {
        regTypeOfYear(CK_LE, typeOfYear);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * <pre>e.g. setTypeOfYear_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfYear. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfYear. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfYear_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfYear_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     * <pre>e.g. setTypeOfYear_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfYear. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfYear. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfYear_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_OF_YEAR"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfYear(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     */
    public void setTypeOfYear_IsNull() { regTypeOfYear(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_YEAR: {YEAR}
     */
    public void setTypeOfYear_IsNotNull() { regTypeOfYear(CK_ISNN, DOBJ); }

    protected void regTypeOfYear(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfYear(), "TYPE_OF_YEAR"); }
    protected abstract ConditionValue xgetCValueTypeOfYear();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     * @param typeOfBoolean The value of typeOfBoolean as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBoolean_Equal(Boolean typeOfBoolean) {
        regTypeOfBoolean(CK_EQ, typeOfBoolean);
    }

    /**
     * Equal(=). As BooleanFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg} <br>
     * boolean classification for boolean column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBoolean_Equal_AsBooleanFlg(CDef.BooleanFlg cdef) {
        doSetTypeOfBoolean_Equal(cdef != null ? Boolean.valueOf(cdef.code()) : null);
    }

    /**
     * Equal(=). As True. And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setTypeOfBoolean_Equal_True() {
        doSetTypeOfBoolean_Equal(Boolean.valueOf(CDef.BooleanFlg.True.code()));
    }

    /**
     * Equal(=). As False. And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setTypeOfBoolean_Equal_False() {
        doSetTypeOfBoolean_Equal(Boolean.valueOf(CDef.BooleanFlg.False.code()));
    }

    protected void doSetTypeOfBoolean_Equal(Boolean typeOfBoolean) {
        regTypeOfBoolean(CK_EQ, typeOfBoolean);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     */
    public void setTypeOfBoolean_IsNull() { regTypeOfBoolean(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     */
    public void setTypeOfBoolean_IsNotNull() { regTypeOfBoolean(CK_ISNN, DOBJ); }

    protected void regTypeOfBoolean(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBoolean(), "TYPE_OF_BOOLEAN"); }
    protected abstract ConditionValue xgetCValueTypeOfBoolean();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BLOB: {BLOB(65535)}
     */
    public void setTypeOfBlob_IsNull() { regTypeOfBlob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BLOB: {BLOB(65535)}
     */
    public void setTypeOfBlob_IsNotNull() { regTypeOfBlob(CK_ISNN, DOBJ); }

    protected void regTypeOfBlob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBlob(), "TYPE_OF_BLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfBlob();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     */
    public void setTypeOfTinyblob_IsNull() { regTypeOfTinyblob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     */
    public void setTypeOfTinyblob_IsNotNull() { regTypeOfTinyblob(CK_ISNN, DOBJ); }

    protected void regTypeOfTinyblob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTinyblob(), "TYPE_OF_TINYBLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfTinyblob();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     */
    public void setTypeOfMediumblob_IsNull() { regTypeOfMediumblob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     */
    public void setTypeOfMediumblob_IsNotNull() { regTypeOfMediumblob(CK_ISNN, DOBJ); }

    protected void regTypeOfMediumblob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfMediumblob(), "TYPE_OF_MEDIUMBLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfMediumblob();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     */
    public void setTypeOfLongblob_IsNull() { regTypeOfLongblob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     */
    public void setTypeOfLongblob_IsNotNull() { regTypeOfLongblob(CK_ISNN, DOBJ); }

    protected void regTypeOfLongblob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfLongblob(), "TYPE_OF_LONGBLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfLongblob();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY: {BINARY(1)}
     */
    public void setTypeOfBinary_IsNull() { regTypeOfBinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY: {BINARY(1)}
     */
    public void setTypeOfBinary_IsNotNull() { regTypeOfBinary(CK_ISNN, DOBJ); }

    protected void regTypeOfBinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBinary(), "TYPE_OF_BINARY"); }
    protected abstract ConditionValue xgetCValueTypeOfBinary();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     */
    public void setTypeOfVarbinary_IsNull() { regTypeOfVarbinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     */
    public void setTypeOfVarbinary_IsNotNull() { regTypeOfVarbinary(CK_ISNN, DOBJ); }

    protected void regTypeOfVarbinary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarbinary(), "TYPE_OF_VARBINARY"); }
    protected abstract ConditionValue xgetCValueTypeOfVarbinary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @param typeOfEnum The value of typeOfEnum as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfEnum_Equal(String typeOfEnum) {
        doSetTypeOfEnum_Equal(fRES(typeOfEnum));
    }

    protected void doSetTypeOfEnum_Equal(String typeOfEnum) {
        regTypeOfEnum(CK_EQ, typeOfEnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @param typeOfEnum The value of typeOfEnum as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfEnum_NotEqual(String typeOfEnum) {
        doSetTypeOfEnum_NotEqual(fRES(typeOfEnum));
    }

    protected void doSetTypeOfEnum_NotEqual(String typeOfEnum) {
        regTypeOfEnum(CK_NES, typeOfEnum);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @param typeOfEnumList The collection of typeOfEnum as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfEnum_InScope(Collection<String> typeOfEnumList) {
        doSetTypeOfEnum_InScope(typeOfEnumList);
    }

    protected void doSetTypeOfEnum_InScope(Collection<String> typeOfEnumList) {
        regINS(CK_INS, cTL(typeOfEnumList), xgetCValueTypeOfEnum(), "TYPE_OF_ENUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @param typeOfEnumList The collection of typeOfEnum as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfEnum_NotInScope(Collection<String> typeOfEnumList) {
        doSetTypeOfEnum_NotInScope(typeOfEnumList);
    }

    protected void doSetTypeOfEnum_NotInScope(Collection<String> typeOfEnumList) {
        regINS(CK_NINS, cTL(typeOfEnumList), xgetCValueTypeOfEnum(), "TYPE_OF_ENUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)} <br>
     * <pre>e.g. setTypeOfEnum_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfEnum The value of typeOfEnum as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfEnum_LikeSearch(String typeOfEnum, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfEnum_LikeSearch(typeOfEnum, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)} <br>
     * <pre>e.g. setTypeOfEnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfEnum The value of typeOfEnum as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfEnum_LikeSearch(String typeOfEnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfEnum), xgetCValueTypeOfEnum(), "TYPE_OF_ENUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @param typeOfEnum The value of typeOfEnum as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfEnum_NotLikeSearch(String typeOfEnum, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfEnum_NotLikeSearch(typeOfEnum, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @param typeOfEnum The value of typeOfEnum as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfEnum_NotLikeSearch(String typeOfEnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfEnum), xgetCValueTypeOfEnum(), "TYPE_OF_ENUM", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     */
    public void setTypeOfEnum_IsNull() { regTypeOfEnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     */
    public void setTypeOfEnum_IsNullOrEmpty() { regTypeOfEnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     */
    public void setTypeOfEnum_IsNotNull() { regTypeOfEnum(CK_ISNN, DOBJ); }

    protected void regTypeOfEnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfEnum(), "TYPE_OF_ENUM"); }
    protected abstract ConditionValue xgetCValueTypeOfEnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     * @param typeOfSet The value of typeOfSet as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfSet_Equal(String typeOfSet) {
        doSetTypeOfSet_Equal(fRES(typeOfSet));
    }

    protected void doSetTypeOfSet_Equal(String typeOfSet) {
        regTypeOfSet(CK_EQ, typeOfSet);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     * @param typeOfSet The value of typeOfSet as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfSet_NotEqual(String typeOfSet) {
        doSetTypeOfSet_NotEqual(fRES(typeOfSet));
    }

    protected void doSetTypeOfSet_NotEqual(String typeOfSet) {
        regTypeOfSet(CK_NES, typeOfSet);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     * @param typeOfSetList The collection of typeOfSet as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfSet_InScope(Collection<String> typeOfSetList) {
        doSetTypeOfSet_InScope(typeOfSetList);
    }

    protected void doSetTypeOfSet_InScope(Collection<String> typeOfSetList) {
        regINS(CK_INS, cTL(typeOfSetList), xgetCValueTypeOfSet(), "TYPE_OF_SET");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     * @param typeOfSetList The collection of typeOfSet as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfSet_NotInScope(Collection<String> typeOfSetList) {
        doSetTypeOfSet_NotInScope(typeOfSetList);
    }

    protected void doSetTypeOfSet_NotInScope(Collection<String> typeOfSetList) {
        regINS(CK_NINS, cTL(typeOfSetList), xgetCValueTypeOfSet(), "TYPE_OF_SET");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_SET: {SET(15)} <br>
     * <pre>e.g. setTypeOfSet_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfSet The value of typeOfSet as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfSet_LikeSearch(String typeOfSet, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfSet_LikeSearch(typeOfSet, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_SET: {SET(15)} <br>
     * <pre>e.g. setTypeOfSet_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfSet The value of typeOfSet as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfSet_LikeSearch(String typeOfSet, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfSet), xgetCValueTypeOfSet(), "TYPE_OF_SET", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     * @param typeOfSet The value of typeOfSet as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfSet_NotLikeSearch(String typeOfSet, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfSet_NotLikeSearch(typeOfSet, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     * @param typeOfSet The value of typeOfSet as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfSet_NotLikeSearch(String typeOfSet, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfSet), xgetCValueTypeOfSet(), "TYPE_OF_SET", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     */
    public void setTypeOfSet_IsNull() { regTypeOfSet(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     */
    public void setTypeOfSet_IsNullOrEmpty() { regTypeOfSet(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_SET: {SET(15)}
     */
    public void setTypeOfSet_IsNotNull() { regTypeOfSet(CK_ISNN, DOBJ); }

    protected void regTypeOfSet(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfSet(), "TYPE_OF_SET"); }
    protected abstract ConditionValue xgetCValueTypeOfSet();

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
    public HpSLCFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorCheckCB.class);
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
    public HpSLCFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorCheckCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorCheckCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorCheckCB.class);
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
    public HpSLCFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VENDOR_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected VendorCheckCB newMyCB() {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
