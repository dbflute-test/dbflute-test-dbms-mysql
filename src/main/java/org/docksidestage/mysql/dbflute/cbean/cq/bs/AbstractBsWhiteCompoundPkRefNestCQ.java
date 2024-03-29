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
 * The abstract condition-query of white_compound_pk_ref_nest.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefNestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefNestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref_nest";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_Equal(Integer compoundPkRefNestId) {
        doSetCompoundPkRefNestId_Equal(compoundPkRefNestId);
    }

    protected void doSetCompoundPkRefNestId_Equal(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_EQ, compoundPkRefNestId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_NotEqual(Integer compoundPkRefNestId) {
        doSetCompoundPkRefNestId_NotEqual(compoundPkRefNestId);
    }

    protected void doSetCompoundPkRefNestId_NotEqual(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_NES, compoundPkRefNestId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_GreaterThan(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_GT, compoundPkRefNestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_LessThan(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_LT, compoundPkRefNestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_GreaterEqual(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_GE, compoundPkRefNestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestId The value of compoundPkRefNestId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_LessEqual(Integer compoundPkRefNestId) {
        regCompoundPkRefNestId(CK_LE, compoundPkRefNestId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of compoundPkRefNestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of compoundPkRefNestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCompoundPkRefNestId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCompoundPkRefNestId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of compoundPkRefNestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of compoundPkRefNestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCompoundPkRefNestId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestIdList The collection of compoundPkRefNestId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_InScope(Collection<Integer> compoundPkRefNestIdList) {
        doSetCompoundPkRefNestId_InScope(compoundPkRefNestIdList);
    }

    protected void doSetCompoundPkRefNestId_InScope(Collection<Integer> compoundPkRefNestIdList) {
        regINS(CK_INS, cTL(compoundPkRefNestIdList), xgetCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @param compoundPkRefNestIdList The collection of compoundPkRefNestId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundPkRefNestId_NotInScope(Collection<Integer> compoundPkRefNestIdList) {
        doSetCompoundPkRefNestId_NotInScope(compoundPkRefNestIdList);
    }

    protected void doSetCompoundPkRefNestId_NotInScope(Collection<Integer> compoundPkRefNestIdList) {
        regINS(CK_NINS, cTL(compoundPkRefNestIdList), xgetCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     */
    public void setCompoundPkRefNestId_IsNull() { regCompoundPkRefNestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     */
    public void setCompoundPkRefNestId_IsNotNull() { regCompoundPkRefNestId(CK_ISNN, DOBJ); }

    protected void regCompoundPkRefNestId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompoundPkRefNestId(), "COMPOUND_PK_REF_NEST_ID"); }
    protected abstract ConditionValue xgetCValueCompoundPkRefNestId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFooMultipleId_Equal(Integer fooMultipleId) {
        doSetFooMultipleId_Equal(fooMultipleId);
    }

    protected void doSetFooMultipleId_Equal(Integer fooMultipleId) {
        regFooMultipleId(CK_EQ, fooMultipleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFooMultipleId_NotEqual(Integer fooMultipleId) {
        doSetFooMultipleId_NotEqual(fooMultipleId);
    }

    protected void doSetFooMultipleId_NotEqual(Integer fooMultipleId) {
        regFooMultipleId(CK_NES, fooMultipleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFooMultipleId_GreaterThan(Integer fooMultipleId) {
        regFooMultipleId(CK_GT, fooMultipleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFooMultipleId_LessThan(Integer fooMultipleId) {
        regFooMultipleId(CK_LT, fooMultipleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFooMultipleId_GreaterEqual(Integer fooMultipleId) {
        regFooMultipleId(CK_GE, fooMultipleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleId The value of fooMultipleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFooMultipleId_LessEqual(Integer fooMultipleId) {
        regFooMultipleId(CK_LE, fooMultipleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of fooMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fooMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFooMultipleId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFooMultipleId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of fooMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fooMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFooMultipleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFooMultipleId(), "FOO_MULTIPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleIdList The collection of fooMultipleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFooMultipleId_InScope(Collection<Integer> fooMultipleIdList) {
        doSetFooMultipleId_InScope(fooMultipleIdList);
    }

    protected void doSetFooMultipleId_InScope(Collection<Integer> fooMultipleIdList) {
        regINS(CK_INS, cTL(fooMultipleIdList), xgetCValueFooMultipleId(), "FOO_MULTIPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param fooMultipleIdList The collection of fooMultipleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFooMultipleId_NotInScope(Collection<Integer> fooMultipleIdList) {
        doSetFooMultipleId_NotInScope(fooMultipleIdList);
    }

    protected void doSetFooMultipleId_NotInScope(Collection<Integer> fooMultipleIdList) {
        regINS(CK_NINS, cTL(fooMultipleIdList), xgetCValueFooMultipleId(), "FOO_MULTIPLE_ID");
    }

    protected void regFooMultipleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFooMultipleId(), "FOO_MULTIPLE_ID"); }
    protected abstract ConditionValue xgetCValueFooMultipleId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBarMultipleId_Equal(Integer barMultipleId) {
        doSetBarMultipleId_Equal(barMultipleId);
    }

    protected void doSetBarMultipleId_Equal(Integer barMultipleId) {
        regBarMultipleId(CK_EQ, barMultipleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBarMultipleId_NotEqual(Integer barMultipleId) {
        doSetBarMultipleId_NotEqual(barMultipleId);
    }

    protected void doSetBarMultipleId_NotEqual(Integer barMultipleId) {
        regBarMultipleId(CK_NES, barMultipleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBarMultipleId_GreaterThan(Integer barMultipleId) {
        regBarMultipleId(CK_GT, barMultipleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBarMultipleId_LessThan(Integer barMultipleId) {
        regBarMultipleId(CK_LT, barMultipleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBarMultipleId_GreaterEqual(Integer barMultipleId) {
        regBarMultipleId(CK_GE, barMultipleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleId The value of barMultipleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBarMultipleId_LessEqual(Integer barMultipleId) {
        regBarMultipleId(CK_LE, barMultipleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of barMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of barMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBarMultipleId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBarMultipleId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of barMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of barMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBarMultipleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBarMultipleId(), "BAR_MULTIPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleIdList The collection of barMultipleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarMultipleId_InScope(Collection<Integer> barMultipleIdList) {
        doSetBarMultipleId_InScope(barMultipleIdList);
    }

    protected void doSetBarMultipleId_InScope(Collection<Integer> barMultipleIdList) {
        regINS(CK_INS, cTL(barMultipleIdList), xgetCValueBarMultipleId(), "BAR_MULTIPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @param barMultipleIdList The collection of barMultipleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBarMultipleId_NotInScope(Collection<Integer> barMultipleIdList) {
        doSetBarMultipleId_NotInScope(barMultipleIdList);
    }

    protected void doSetBarMultipleId_NotInScope(Collection<Integer> barMultipleIdList) {
        regINS(CK_NINS, cTL(barMultipleIdList), xgetCValueBarMultipleId(), "BAR_MULTIPLE_ID");
    }

    protected void regBarMultipleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBarMultipleId(), "BAR_MULTIPLE_ID"); }
    protected abstract ConditionValue xgetCValueBarMultipleId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxMultipleId_Equal(Integer quxMultipleId) {
        doSetQuxMultipleId_Equal(quxMultipleId);
    }

    protected void doSetQuxMultipleId_Equal(Integer quxMultipleId) {
        regQuxMultipleId(CK_EQ, quxMultipleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxMultipleId_NotEqual(Integer quxMultipleId) {
        doSetQuxMultipleId_NotEqual(quxMultipleId);
    }

    protected void doSetQuxMultipleId_NotEqual(Integer quxMultipleId) {
        regQuxMultipleId(CK_NES, quxMultipleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxMultipleId_GreaterThan(Integer quxMultipleId) {
        regQuxMultipleId(CK_GT, quxMultipleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxMultipleId_LessThan(Integer quxMultipleId) {
        regQuxMultipleId(CK_LT, quxMultipleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxMultipleId_GreaterEqual(Integer quxMultipleId) {
        regQuxMultipleId(CK_GE, quxMultipleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleId The value of quxMultipleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxMultipleId_LessEqual(Integer quxMultipleId) {
        regQuxMultipleId(CK_LE, quxMultipleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of quxMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of quxMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setQuxMultipleId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setQuxMultipleId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param minNumber The min number of quxMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of quxMultipleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQuxMultipleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuxMultipleId(), "QUX_MULTIPLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleIdList The collection of quxMultipleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuxMultipleId_InScope(Collection<Integer> quxMultipleIdList) {
        doSetQuxMultipleId_InScope(quxMultipleIdList);
    }

    protected void doSetQuxMultipleId_InScope(Collection<Integer> quxMultipleIdList) {
        regINS(CK_INS, cTL(quxMultipleIdList), xgetCValueQuxMultipleId(), "QUX_MULTIPLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @param quxMultipleIdList The collection of quxMultipleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuxMultipleId_NotInScope(Collection<Integer> quxMultipleIdList) {
        doSetQuxMultipleId_NotInScope(quxMultipleIdList);
    }

    protected void doSetQuxMultipleId_NotInScope(Collection<Integer> quxMultipleIdList) {
        regINS(CK_NINS, cTL(quxMultipleIdList), xgetCValueQuxMultipleId(), "QUX_MULTIPLE_ID");
    }

    protected void regQuxMultipleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuxMultipleId(), "QUX_MULTIPLE_ID"); }
    protected abstract ConditionValue xgetCValueQuxMultipleId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @param nestName The value of nestName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNestName_Equal(String nestName) {
        doSetNestName_Equal(fRES(nestName));
    }

    protected void doSetNestName_Equal(String nestName) {
        regNestName(CK_EQ, nestName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @param nestName The value of nestName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNestName_NotEqual(String nestName) {
        doSetNestName_NotEqual(fRES(nestName));
    }

    protected void doSetNestName_NotEqual(String nestName) {
        regNestName(CK_NES, nestName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @param nestNameList The collection of nestName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNestName_InScope(Collection<String> nestNameList) {
        doSetNestName_InScope(nestNameList);
    }

    protected void doSetNestName_InScope(Collection<String> nestNameList) {
        regINS(CK_INS, cTL(nestNameList), xgetCValueNestName(), "NEST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @param nestNameList The collection of nestName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNestName_NotInScope(Collection<String> nestNameList) {
        doSetNestName_NotInScope(nestNameList);
    }

    protected void doSetNestName_NotInScope(Collection<String> nestNameList) {
        regINS(CK_NINS, cTL(nestNameList), xgetCValueNestName(), "NEST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setNestName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nestName The value of nestName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNestName_LikeSearch(String nestName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNestName_LikeSearch(nestName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setNestName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nestName The value of nestName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNestName_LikeSearch(String nestName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nestName), xgetCValueNestName(), "NEST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @param nestName The value of nestName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNestName_NotLikeSearch(String nestName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNestName_NotLikeSearch(nestName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @param nestName The value of nestName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNestName_NotLikeSearch(String nestName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nestName), xgetCValueNestName(), "NEST_NAME", likeSearchOption);
    }

    protected void regNestName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNestName(), "NEST_NAME"); }
    protected abstract ConditionValue xgetCValueNestName();

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
    public HpSLCFunction<WhiteCompoundPkRefNestCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteCompoundPkRefNestCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefNestCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteCompoundPkRefNestCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefNestCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteCompoundPkRefNestCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefNestCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteCompoundPkRefNestCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefNestCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteCompoundPkRefNestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void query(WhiteCompoundPkRefNestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkRefNestCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteCompoundPkRefNestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefNestCQ sq);

    protected WhiteCompoundPkRefNestCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefNestCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefNestCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefNestCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteCompoundPkRefNestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COMPOUND_PK_REF_NEST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteCompoundPkRefNestCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefNestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteCompoundPkRefNestCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COMPOUND_PK_REF_NEST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteCompoundPkRefNestCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteCompoundPkRefNestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteCompoundPkRefNestCB cb = new WhiteCompoundPkRefNestCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteCompoundPkRefNestCQ sq);

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
    protected WhiteCompoundPkRefNestCB newMyCB() {
        return new WhiteCompoundPkRefNestCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkRefNestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
