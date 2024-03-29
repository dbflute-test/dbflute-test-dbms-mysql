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
 * The abstract condition-query of vendor_constraint_name_auto_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorConstraintNameAutoRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorConstraintNameAutoRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_constraint_name_auto_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_Equal(Long constraintNameAutoRefId) {
        doSetConstraintNameAutoRefId_Equal(constraintNameAutoRefId);
    }

    protected void doSetConstraintNameAutoRefId_Equal(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_EQ, constraintNameAutoRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_NotEqual(Long constraintNameAutoRefId) {
        doSetConstraintNameAutoRefId_NotEqual(constraintNameAutoRefId);
    }

    protected void doSetConstraintNameAutoRefId_NotEqual(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_NES, constraintNameAutoRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_GreaterThan(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_GT, constraintNameAutoRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_LessThan(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_LT, constraintNameAutoRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_GreaterEqual(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_GE, constraintNameAutoRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_LessEqual(Long constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_LE, constraintNameAutoRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setConstraintNameAutoRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setConstraintNameAutoRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefIdList The collection of constraintNameAutoRefId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_InScope(Collection<Long> constraintNameAutoRefIdList) {
        doSetConstraintNameAutoRefId_InScope(constraintNameAutoRefIdList);
    }

    protected void doSetConstraintNameAutoRefId_InScope(Collection<Long> constraintNameAutoRefIdList) {
        regINS(CK_INS, cTL(constraintNameAutoRefIdList), xgetCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param constraintNameAutoRefIdList The collection of constraintNameAutoRefId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoRefId_NotInScope(Collection<Long> constraintNameAutoRefIdList) {
        doSetConstraintNameAutoRefId_NotInScope(constraintNameAutoRefIdList);
    }

    protected void doSetConstraintNameAutoRefId_NotInScope(Collection<Long> constraintNameAutoRefIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoRefIdList), xgetCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setConstraintNameAutoRefId_IsNull() { regConstraintNameAutoRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setConstraintNameAutoRefId_IsNotNull() { regConstraintNameAutoRefId(CK_ISNN, DOBJ); }

    protected void regConstraintNameAutoRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID"); }
    protected abstract ConditionValue xgetCValueConstraintNameAutoRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_Equal(Long constraintNameAutoFooId) {
        doSetConstraintNameAutoFooId_Equal(constraintNameAutoFooId);
    }

    protected void doSetConstraintNameAutoFooId_Equal(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_EQ, constraintNameAutoFooId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_NotEqual(Long constraintNameAutoFooId) {
        doSetConstraintNameAutoFooId_NotEqual(constraintNameAutoFooId);
    }

    protected void doSetConstraintNameAutoFooId_NotEqual(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_NES, constraintNameAutoFooId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_GreaterThan(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GT, constraintNameAutoFooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_LessThan(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LT, constraintNameAutoFooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_GreaterEqual(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GE, constraintNameAutoFooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_LessEqual(Long constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LE, constraintNameAutoFooId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param minNumber The min number of constraintNameAutoFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setConstraintNameAutoFooId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setConstraintNameAutoFooId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param minNumber The min number of constraintNameAutoFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoFooId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoFooId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_InScope(Collection<Long> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_InScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_InScope(Collection<Long> constraintNameAutoFooIdList) {
        regINS(CK_INS, cTL(constraintNameAutoFooIdList), xgetCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoFooId_NotInScope(Collection<Long> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_NotInScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_NotInScope(Collection<Long> constraintNameAutoFooIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoFooIdList), xgetCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    protected void regConstraintNameAutoFooId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID"); }
    protected abstract ConditionValue xgetCValueConstraintNameAutoFooId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_Equal(Long constraintNameAutoBarId) {
        doSetConstraintNameAutoBarId_Equal(constraintNameAutoBarId);
    }

    protected void doSetConstraintNameAutoBarId_Equal(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_EQ, constraintNameAutoBarId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_NotEqual(Long constraintNameAutoBarId) {
        doSetConstraintNameAutoBarId_NotEqual(constraintNameAutoBarId);
    }

    protected void doSetConstraintNameAutoBarId_NotEqual(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_NES, constraintNameAutoBarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_GreaterThan(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GT, constraintNameAutoBarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_LessThan(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LT, constraintNameAutoBarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_GreaterEqual(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GE, constraintNameAutoBarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_LessEqual(Long constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LE, constraintNameAutoBarId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param minNumber The min number of constraintNameAutoBarId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoBarId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setConstraintNameAutoBarId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setConstraintNameAutoBarId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param minNumber The min number of constraintNameAutoBarId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoBarId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoBarId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_InScope(Collection<Long> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_InScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_InScope(Collection<Long> constraintNameAutoBarIdList) {
        regINS(CK_INS, cTL(constraintNameAutoBarIdList), xgetCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoBarId_NotInScope(Collection<Long> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_NotInScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_NotInScope(Collection<Long> constraintNameAutoBarIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoBarIdList), xgetCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    protected void regConstraintNameAutoBarId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID"); }
    protected abstract ConditionValue xgetCValueConstraintNameAutoBarId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_Equal(Long constraintNameAutoQuxId) {
        doSetConstraintNameAutoQuxId_Equal(constraintNameAutoQuxId);
    }

    protected void doSetConstraintNameAutoQuxId_Equal(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_EQ, constraintNameAutoQuxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_NotEqual(Long constraintNameAutoQuxId) {
        doSetConstraintNameAutoQuxId_NotEqual(constraintNameAutoQuxId);
    }

    protected void doSetConstraintNameAutoQuxId_NotEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_NES, constraintNameAutoQuxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_GreaterThan(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GT, constraintNameAutoQuxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_LessThan(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LT, constraintNameAutoQuxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_GreaterEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GE, constraintNameAutoQuxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_LessEqual(Long constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LE, constraintNameAutoQuxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param minNumber The min number of constraintNameAutoQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setConstraintNameAutoQuxId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setConstraintNameAutoQuxId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param minNumber The min number of constraintNameAutoQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoQuxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_InScope(Collection<Long> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_InScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_InScope(Collection<Long> constraintNameAutoQuxIdList) {
        regINS(CK_INS, cTL(constraintNameAutoQuxIdList), xgetCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoQuxId_NotInScope(Collection<Long> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_NotInScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_NotInScope(Collection<Long> constraintNameAutoQuxIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoQuxIdList), xgetCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    protected void regConstraintNameAutoQuxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID"); }
    protected abstract ConditionValue xgetCValueConstraintNameAutoQuxId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_Equal(Long constraintNameAutoCorgeId) {
        doSetConstraintNameAutoCorgeId_Equal(constraintNameAutoCorgeId);
    }

    protected void doSetConstraintNameAutoCorgeId_Equal(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_EQ, constraintNameAutoCorgeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_NotEqual(Long constraintNameAutoCorgeId) {
        doSetConstraintNameAutoCorgeId_NotEqual(constraintNameAutoCorgeId);
    }

    protected void doSetConstraintNameAutoCorgeId_NotEqual(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_NES, constraintNameAutoCorgeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_GreaterThan(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_GT, constraintNameAutoCorgeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_LessThan(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_LT, constraintNameAutoCorgeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_GreaterEqual(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_GE, constraintNameAutoCorgeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeId The value of constraintNameAutoCorgeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_LessEqual(Long constraintNameAutoCorgeId) {
        regConstraintNameAutoCorgeId(CK_LE, constraintNameAutoCorgeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setConstraintNameAutoCorgeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setConstraintNameAutoCorgeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of constraintNameAutoCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of constraintNameAutoCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoCorgeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeIdList The collection of constraintNameAutoCorgeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_InScope(Collection<Long> constraintNameAutoCorgeIdList) {
        doSetConstraintNameAutoCorgeId_InScope(constraintNameAutoCorgeIdList);
    }

    protected void doSetConstraintNameAutoCorgeId_InScope(Collection<Long> constraintNameAutoCorgeIdList) {
        regINS(CK_INS, cTL(constraintNameAutoCorgeIdList), xgetCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @param constraintNameAutoCorgeIdList The collection of constraintNameAutoCorgeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoCorgeId_NotInScope(Collection<Long> constraintNameAutoCorgeIdList) {
        doSetConstraintNameAutoCorgeId_NotInScope(constraintNameAutoCorgeIdList);
    }

    protected void doSetConstraintNameAutoCorgeId_NotInScope(Collection<Long> constraintNameAutoCorgeIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoCorgeIdList), xgetCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID");
    }

    protected void regConstraintNameAutoCorgeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConstraintNameAutoCorgeId(), "CONSTRAINT_NAME_AUTO_CORGE_ID"); }
    protected abstract ConditionValue xgetCValueConstraintNameAutoCorgeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoUnique_Equal(String constraintNameAutoUnique) {
        doSetConstraintNameAutoUnique_Equal(fRES(constraintNameAutoUnique));
    }

    protected void doSetConstraintNameAutoUnique_Equal(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_EQ, constraintNameAutoUnique);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoUnique_NotEqual(String constraintNameAutoUnique) {
        doSetConstraintNameAutoUnique_NotEqual(fRES(constraintNameAutoUnique));
    }

    protected void doSetConstraintNameAutoUnique_NotEqual(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_NES, constraintNameAutoUnique);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUniqueList The collection of constraintNameAutoUnique as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoUnique_InScope(Collection<String> constraintNameAutoUniqueList) {
        doSetConstraintNameAutoUnique_InScope(constraintNameAutoUniqueList);
    }

    protected void doSetConstraintNameAutoUnique_InScope(Collection<String> constraintNameAutoUniqueList) {
        regINS(CK_INS, cTL(constraintNameAutoUniqueList), xgetCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUniqueList The collection of constraintNameAutoUnique as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConstraintNameAutoUnique_NotInScope(Collection<String> constraintNameAutoUniqueList) {
        doSetConstraintNameAutoUnique_NotInScope(constraintNameAutoUniqueList);
    }

    protected void doSetConstraintNameAutoUnique_NotInScope(Collection<String> constraintNameAutoUniqueList) {
        regINS(CK_NINS, cTL(constraintNameAutoUniqueList), xgetCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setConstraintNameAutoUnique_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_LikeSearch(String constraintNameAutoUnique, ConditionOptionCall<LikeSearchOption> opLambda) {
        setConstraintNameAutoUnique_LikeSearch(constraintNameAutoUnique, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setConstraintNameAutoUnique_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_LikeSearch(String constraintNameAutoUnique, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraintNameAutoUnique), xgetCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_NotLikeSearch(String constraintNameAutoUnique, ConditionOptionCall<LikeSearchOption> opLambda) {
        setConstraintNameAutoUnique_NotLikeSearch(constraintNameAutoUnique, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_NotLikeSearch(String constraintNameAutoUnique, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraintNameAutoUnique), xgetCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE", likeSearchOption);
    }

    protected void regConstraintNameAutoUnique(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE"); }
    protected abstract ConditionValue xgetCValueConstraintNameAutoUnique();

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
    public HpSLCFunction<VendorConstraintNameAutoRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorConstraintNameAutoRefCB.class);
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
    public HpSLCFunction<VendorConstraintNameAutoRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorConstraintNameAutoRefCB.class);
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
    public HpSLCFunction<VendorConstraintNameAutoRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorConstraintNameAutoRefCB.class);
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
    public HpSLCFunction<VendorConstraintNameAutoRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorConstraintNameAutoRefCB.class);
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
    public HpSLCFunction<VendorConstraintNameAutoRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void query(VendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorConstraintNameAutoRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorConstraintNameAutoRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorConstraintNameAutoRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorConstraintNameAutoRefCQ sq);

    protected VendorConstraintNameAutoRefCB xcreateScalarConditionCB() {
        VendorConstraintNameAutoRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorConstraintNameAutoRefCB xcreateScalarConditionPartitionByCB() {
        VendorConstraintNameAutoRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorConstraintNameAutoRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CONSTRAINT_NAME_AUTO_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorConstraintNameAutoRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorConstraintNameAutoRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorConstraintNameAutoRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CONSTRAINT_NAME_AUTO_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorConstraintNameAutoRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorConstraintNameAutoRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorConstraintNameAutoRefCQ sq);

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
    protected VendorConstraintNameAutoRefCB newMyCB() {
        return new VendorConstraintNameAutoRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorConstraintNameAutoRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
