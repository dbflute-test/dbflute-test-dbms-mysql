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
 * The abstract condition-query of white_implicit_reverse_fk_suppress.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitReverseFkSuppressCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitReverseFkSuppressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_reverse_fk_suppress";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_Equal(Integer whiteImplicitReverseFkSuppressId) {
        doSetWhiteImplicitReverseFkSuppressId_Equal(whiteImplicitReverseFkSuppressId);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_Equal(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_EQ, whiteImplicitReverseFkSuppressId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_NotEqual(Integer whiteImplicitReverseFkSuppressId) {
        doSetWhiteImplicitReverseFkSuppressId_NotEqual(whiteImplicitReverseFkSuppressId);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_NotEqual(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_NES, whiteImplicitReverseFkSuppressId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_GreaterThan(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_GT, whiteImplicitReverseFkSuppressId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_LessThan(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_LT, whiteImplicitReverseFkSuppressId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_GreaterEqual(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_GE, whiteImplicitReverseFkSuppressId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressId The value of whiteImplicitReverseFkSuppressId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_LessEqual(Integer whiteImplicitReverseFkSuppressId) {
        regWhiteImplicitReverseFkSuppressId(CK_LE, whiteImplicitReverseFkSuppressId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkSuppressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of whiteImplicitReverseFkSuppressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkSuppressId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWhiteImplicitReverseFkSuppressId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkSuppressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of whiteImplicitReverseFkSuppressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkSuppressId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressIdList The collection of whiteImplicitReverseFkSuppressId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_InScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        doSetWhiteImplicitReverseFkSuppressId_InScope(whiteImplicitReverseFkSuppressIdList);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_InScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkSuppressIdList), xgetCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param whiteImplicitReverseFkSuppressIdList The collection of whiteImplicitReverseFkSuppressId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkSuppressId_NotInScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        doSetWhiteImplicitReverseFkSuppressId_NotInScope(whiteImplicitReverseFkSuppressIdList);
    }

    protected void doSetWhiteImplicitReverseFkSuppressId_NotInScope(Collection<Integer> whiteImplicitReverseFkSuppressIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkSuppressIdList), xgetCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setWhiteImplicitReverseFkSuppressId_IsNull() { regWhiteImplicitReverseFkSuppressId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setWhiteImplicitReverseFkSuppressId_IsNotNull() { regWhiteImplicitReverseFkSuppressId(CK_ISNN, DOBJ); }

    protected void regWhiteImplicitReverseFkSuppressId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWhiteImplicitReverseFkSuppressId(), "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID"); }
    protected abstract ConditionValue xgetCValueWhiteImplicitReverseFkSuppressId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_Equal(Integer whiteImplicitReverseFkId) {
        doSetWhiteImplicitReverseFkId_Equal(whiteImplicitReverseFkId);
    }

    protected void doSetWhiteImplicitReverseFkId_Equal(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_EQ, whiteImplicitReverseFkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_NotEqual(Integer whiteImplicitReverseFkId) {
        doSetWhiteImplicitReverseFkId_NotEqual(whiteImplicitReverseFkId);
    }

    protected void doSetWhiteImplicitReverseFkId_NotEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_NES, whiteImplicitReverseFkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_GreaterThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GT, whiteImplicitReverseFkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_LessThan(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LT, whiteImplicitReverseFkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_GreaterEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_GE, whiteImplicitReverseFkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkId The value of whiteImplicitReverseFkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_LessEqual(Integer whiteImplicitReverseFkId) {
        regWhiteImplicitReverseFkId(CK_LE, whiteImplicitReverseFkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of whiteImplicitReverseFkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWhiteImplicitReverseFkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param minNumber The min number of whiteImplicitReverseFkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of whiteImplicitReverseFkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWhiteImplicitReverseFkId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_InScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_InScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_InScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_INS, cTL(whiteImplicitReverseFkIdList), xgetCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @param whiteImplicitReverseFkIdList The collection of whiteImplicitReverseFkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        doSetWhiteImplicitReverseFkId_NotInScope(whiteImplicitReverseFkIdList);
    }

    protected void doSetWhiteImplicitReverseFkId_NotInScope(Collection<Integer> whiteImplicitReverseFkIdList) {
        regINS(CK_NINS, cTL(whiteImplicitReverseFkIdList), xgetCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID");
    }

    protected void regWhiteImplicitReverseFkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWhiteImplicitReverseFkId(), "WHITE_IMPLICIT_REVERSE_FK_ID"); }
    protected abstract ConditionValue xgetCValueWhiteImplicitReverseFkId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_Equal(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_EQ,  validBeginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_GreaterThan(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_GT,  validBeginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_LessThan(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_LT,  validBeginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_GreaterEqual(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_GE,  validBeginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_LessEqual(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_LE, validBeginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * <pre>e.g. setValidBeginDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setValidBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setValidBeginDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * <pre>e.g. setValidBeginDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setValidBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "VALID_BEGIN_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueValidBeginDate(), nm, op);
    }

    protected void regValidBeginDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidBeginDate(), "VALID_BEGIN_DATE"); }
    protected abstract ConditionValue xgetCValueValidBeginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_Equal(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_EQ,  validEndDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_GreaterThan(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_GT,  validEndDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_LessThan(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_LT,  validEndDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_GreaterEqual(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_GE,  validEndDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_LessEqual(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_LE, validEndDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setValidEndDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setValidEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setValidEndDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VALID_END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setValidEndDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setValidEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "VALID_END_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueValidEndDate(), nm, op);
    }

    protected void regValidEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidEndDate(), "VALID_END_DATE"); }
    protected abstract ConditionValue xgetCValueValidEndDate();

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
    public HpSLCFunction<WhiteImplicitReverseFkSuppressCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteImplicitReverseFkSuppressCB.class);
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
    public HpSLCFunction<WhiteImplicitReverseFkSuppressCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteImplicitReverseFkSuppressCB.class);
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
    public HpSLCFunction<WhiteImplicitReverseFkSuppressCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteImplicitReverseFkSuppressCB.class);
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
    public HpSLCFunction<WhiteImplicitReverseFkSuppressCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteImplicitReverseFkSuppressCB.class);
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
    public HpSLCFunction<WhiteImplicitReverseFkSuppressCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteImplicitReverseFkSuppressCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void query(WhiteImplicitReverseFkSuppressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteImplicitReverseFkSuppressCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteImplicitReverseFkSuppressCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkSuppressCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitReverseFkSuppressCQ sq);

    protected WhiteImplicitReverseFkSuppressCB xcreateScalarConditionCB() {
        WhiteImplicitReverseFkSuppressCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitReverseFkSuppressCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitReverseFkSuppressCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitReverseFkSuppressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitReverseFkSuppressCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitReverseFkSuppressCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitReverseFkSuppressCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitReverseFkSuppressCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitReverseFkSuppressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitReverseFkSuppressCQ sq);

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
    protected WhiteImplicitReverseFkSuppressCB newMyCB() {
        return new WhiteImplicitReverseFkSuppressCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteImplicitReverseFkSuppressCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
