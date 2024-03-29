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
 * The abstract condition-query of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleFirstId_Equal(Integer multipleFirstId) {
        doSetMultipleFirstId_Equal(multipleFirstId);
    }

    protected void doSetMultipleFirstId_Equal(Integer multipleFirstId) {
        regMultipleFirstId(CK_EQ, multipleFirstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleFirstId_NotEqual(Integer multipleFirstId) {
        doSetMultipleFirstId_NotEqual(multipleFirstId);
    }

    protected void doSetMultipleFirstId_NotEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_NES, multipleFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleFirstId_GreaterThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_GT, multipleFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleFirstId_LessThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_LT, multipleFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleFirstId_GreaterEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_GE, multipleFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleFirstId_LessEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_LE, multipleFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of multipleFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMultipleFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of multipleFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMultipleFirstId(), "MULTIPLE_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_InScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_INS, cTL(multipleFirstIdList), xgetCValueMultipleFirstId(), "MULTIPLE_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_NotInScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_NINS, cTL(multipleFirstIdList), xgetCValueMultipleFirstId(), "MULTIPLE_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleFirstId_IsNull() { regMultipleFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleFirstId_IsNotNull() { regMultipleFirstId(CK_ISNN, DOBJ); }

    protected void regMultipleFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultipleFirstId(), "MULTIPLE_FIRST_ID"); }
    protected abstract ConditionValue xgetCValueMultipleFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleSecondId_Equal(Integer multipleSecondId) {
        doSetMultipleSecondId_Equal(multipleSecondId);
    }

    protected void doSetMultipleSecondId_Equal(Integer multipleSecondId) {
        regMultipleSecondId(CK_EQ, multipleSecondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleSecondId_NotEqual(Integer multipleSecondId) {
        doSetMultipleSecondId_NotEqual(multipleSecondId);
    }

    protected void doSetMultipleSecondId_NotEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_NES, multipleSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleSecondId_GreaterThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_GT, multipleSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleSecondId_LessThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_LT, multipleSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleSecondId_GreaterEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_GE, multipleSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMultipleSecondId_LessEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_LE, multipleSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of multipleSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMultipleSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of multipleSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMultipleSecondId(), "MULTIPLE_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_InScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_INS, cTL(multipleSecondIdList), xgetCValueMultipleSecondId(), "MULTIPLE_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_NotInScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_NINS, cTL(multipleSecondIdList), xgetCValueMultipleSecondId(), "MULTIPLE_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleSecondId_IsNull() { regMultipleSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleSecondId_IsNotNull() { regMultipleSecondId(CK_ISNN, DOBJ); }

    protected void regMultipleSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultipleSecondId(), "MULTIPLE_SECOND_ID"); }
    protected abstract ConditionValue xgetCValueMultipleSecondId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_Equal(Integer refFirstId) {
        doSetRefFirstId_Equal(refFirstId);
    }

    protected void doSetRefFirstId_Equal(Integer refFirstId) {
        regRefFirstId(CK_EQ, refFirstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_NotEqual(Integer refFirstId) {
        doSetRefFirstId_NotEqual(refFirstId);
    }

    protected void doSetRefFirstId_NotEqual(Integer refFirstId) {
        regRefFirstId(CK_NES, refFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_GreaterThan(Integer refFirstId) {
        regRefFirstId(CK_GT, refFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_LessThan(Integer refFirstId) {
        regRefFirstId(CK_LT, refFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_GreaterEqual(Integer refFirstId) {
        regRefFirstId(CK_GE, refFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_LessEqual(Integer refFirstId) {
        regRefFirstId(CK_LE, refFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param minNumber The min number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param minNumber The min number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefFirstId(), "REF_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_InScope(refFirstIdList);
    }

    protected void doSetRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        regINS(CK_INS, cTL(refFirstIdList), xgetCValueRefFirstId(), "REF_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_NotInScope(refFirstIdList);
    }

    protected void doSetRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        regINS(CK_NINS, cTL(refFirstIdList), xgetCValueRefFirstId(), "REF_FIRST_ID");
    }

    protected void regRefFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefFirstId(), "REF_FIRST_ID"); }
    protected abstract ConditionValue xgetCValueRefFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_Equal(Integer refSecondId) {
        doSetRefSecondId_Equal(refSecondId);
    }

    protected void doSetRefSecondId_Equal(Integer refSecondId) {
        regRefSecondId(CK_EQ, refSecondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_NotEqual(Integer refSecondId) {
        doSetRefSecondId_NotEqual(refSecondId);
    }

    protected void doSetRefSecondId_NotEqual(Integer refSecondId) {
        regRefSecondId(CK_NES, refSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_GreaterThan(Integer refSecondId) {
        regRefSecondId(CK_GT, refSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_LessThan(Integer refSecondId) {
        regRefSecondId(CK_LT, refSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_GreaterEqual(Integer refSecondId) {
        regRefSecondId(CK_GE, refSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_LessEqual(Integer refSecondId) {
        regRefSecondId(CK_LE, refSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param minNumber The min number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefSecondId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param minNumber The min number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefSecondId(), "REF_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_InScope(refSecondIdList);
    }

    protected void doSetRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        regINS(CK_INS, cTL(refSecondIdList), xgetCValueRefSecondId(), "REF_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_NotInScope(refSecondIdList);
    }

    protected void doSetRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        regINS(CK_NINS, cTL(refSecondIdList), xgetCValueRefSecondId(), "REF_SECOND_ID");
    }

    protected void regRefSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefSecondId(), "REF_SECOND_ID"); }
    protected abstract ConditionValue xgetCValueRefSecondId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @param refName The value of refName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_Equal(String refName) {
        doSetRefName_Equal(fRES(refName));
    }

    protected void doSetRefName_Equal(String refName) {
        regRefName(CK_EQ, refName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @param refName The value of refName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_NotEqual(String refName) {
        doSetRefName_NotEqual(fRES(refName));
    }

    protected void doSetRefName_NotEqual(String refName) {
        regRefName(CK_NES, refName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @param refNameList The collection of refName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_InScope(Collection<String> refNameList) {
        doSetRefName_InScope(refNameList);
    }

    protected void doSetRefName_InScope(Collection<String> refNameList) {
        regINS(CK_INS, cTL(refNameList), xgetCValueRefName(), "REF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @param refNameList The collection of refName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_NotInScope(Collection<String> refNameList) {
        doSetRefName_NotInScope(refNameList);
    }

    protected void doSetRefName_NotInScope(Collection<String> refNameList) {
        regINS(CK_NINS, cTL(refNameList), xgetCValueRefName(), "REF_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setRefName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param refName The value of refName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRefName_LikeSearch(String refName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRefName_LikeSearch(refName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setRefName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refName The value of refName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefName_LikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refName), xgetCValueRefName(), "REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @param refName The value of refName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRefName_NotLikeSearch(String refName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRefName_NotLikeSearch(refName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(50)}
     * @param refName The value of refName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefName_NotLikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refName), xgetCValueRefName(), "REF_NAME", likeSearchOption);
    }

    protected void regRefName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefName(), "REF_NAME"); }
    protected abstract ConditionValue xgetCValueRefName();

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
    public HpSLCFunction<WhiteCompoundPkRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteCompoundPkRefCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteCompoundPkRefCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteCompoundPkRefCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteCompoundPkRefCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefCQ sq);

    protected WhiteCompoundPkRefCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteCompoundPkRefCB newMyCB() {
        return new WhiteCompoundPkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
