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
 * The abstract condition-query of white_uq_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqFkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_fk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkRefId_Equal(Long uqFkRefId) {
        doSetUqFkRefId_Equal(uqFkRefId);
    }

    protected void doSetUqFkRefId_Equal(Long uqFkRefId) {
        regUqFkRefId(CK_EQ, uqFkRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkRefId_NotEqual(Long uqFkRefId) {
        doSetUqFkRefId_NotEqual(uqFkRefId);
    }

    protected void doSetUqFkRefId_NotEqual(Long uqFkRefId) {
        regUqFkRefId(CK_NES, uqFkRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkRefId_GreaterThan(Long uqFkRefId) {
        regUqFkRefId(CK_GT, uqFkRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkRefId_LessThan(Long uqFkRefId) {
        regUqFkRefId(CK_LT, uqFkRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkRefId_GreaterEqual(Long uqFkRefId) {
        regUqFkRefId(CK_GE, uqFkRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkRefId_LessEqual(Long uqFkRefId) {
        regUqFkRefId(CK_LE, uqFkRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqFkRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of uqFkRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUqFkRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUqFkRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqFkRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of uqFkRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqFkRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUqFkRefId(), "UQ_FK_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefIdList The collection of uqFkRefId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqFkRefId_InScope(Collection<Long> uqFkRefIdList) {
        doSetUqFkRefId_InScope(uqFkRefIdList);
    }

    protected void doSetUqFkRefId_InScope(Collection<Long> uqFkRefIdList) {
        regINS(CK_INS, cTL(uqFkRefIdList), xgetCValueUqFkRefId(), "UQ_FK_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefIdList The collection of uqFkRefId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqFkRefId_NotInScope(Collection<Long> uqFkRefIdList) {
        doSetUqFkRefId_NotInScope(uqFkRefIdList);
    }

    protected void doSetUqFkRefId_NotInScope(Collection<Long> uqFkRefIdList) {
        regINS(CK_NINS, cTL(uqFkRefIdList), xgetCValueUqFkRefId(), "UQ_FK_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqFkRefId_IsNull() { regUqFkRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqFkRefId_IsNotNull() { regUqFkRefId(CK_ISNN, DOBJ); }

    protected void regUqFkRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqFkRefId(), "UQ_FK_REF_ID"); }
    protected abstract ConditionValue xgetCValueUqFkRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFkToPkId_Equal(Long fkToPkId) {
        doSetFkToPkId_Equal(fkToPkId);
    }

    protected void doSetFkToPkId_Equal(Long fkToPkId) {
        regFkToPkId(CK_EQ, fkToPkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFkToPkId_NotEqual(Long fkToPkId) {
        doSetFkToPkId_NotEqual(fkToPkId);
    }

    protected void doSetFkToPkId_NotEqual(Long fkToPkId) {
        regFkToPkId(CK_NES, fkToPkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFkToPkId_GreaterThan(Long fkToPkId) {
        regFkToPkId(CK_GT, fkToPkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFkToPkId_LessThan(Long fkToPkId) {
        regFkToPkId(CK_LT, fkToPkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFkToPkId_GreaterEqual(Long fkToPkId) {
        regFkToPkId(CK_GE, fkToPkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFkToPkId_LessEqual(Long fkToPkId) {
        regFkToPkId(CK_LE, fkToPkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param minNumber The min number of fkToPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fkToPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFkToPkId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFkToPkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param minNumber The min number of fkToPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fkToPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFkToPkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFkToPkId(), "FK_TO_PK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkIdList The collection of fkToPkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFkToPkId_InScope(Collection<Long> fkToPkIdList) {
        doSetFkToPkId_InScope(fkToPkIdList);
    }

    protected void doSetFkToPkId_InScope(Collection<Long> fkToPkIdList) {
        regINS(CK_INS, cTL(fkToPkIdList), xgetCValueFkToPkId(), "FK_TO_PK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkIdList The collection of fkToPkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFkToPkId_NotInScope(Collection<Long> fkToPkIdList) {
        doSetFkToPkId_NotInScope(fkToPkIdList);
    }

    protected void doSetFkToPkId_NotInScope(Collection<Long> fkToPkIdList) {
        regINS(CK_NINS, cTL(fkToPkIdList), xgetCValueFkToPkId(), "FK_TO_PK_ID");
    }

    protected void regFkToPkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFkToPkId(), "FK_TO_PK_ID"); }
    protected abstract ConditionValue xgetCValueFkToPkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFkToUqCode_Equal(String fkToUqCode) {
        doSetFkToUqCode_Equal(fRES(fkToUqCode));
    }

    protected void doSetFkToUqCode_Equal(String fkToUqCode) {
        regFkToUqCode(CK_EQ, fkToUqCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFkToUqCode_NotEqual(String fkToUqCode) {
        doSetFkToUqCode_NotEqual(fRES(fkToUqCode));
    }

    protected void doSetFkToUqCode_NotEqual(String fkToUqCode) {
        regFkToUqCode(CK_NES, fkToUqCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCodeList The collection of fkToUqCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFkToUqCode_InScope(Collection<String> fkToUqCodeList) {
        doSetFkToUqCode_InScope(fkToUqCodeList);
    }

    protected void doSetFkToUqCode_InScope(Collection<String> fkToUqCodeList) {
        regINS(CK_INS, cTL(fkToUqCodeList), xgetCValueFkToUqCode(), "FK_TO_UQ_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCodeList The collection of fkToUqCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFkToUqCode_NotInScope(Collection<String> fkToUqCodeList) {
        doSetFkToUqCode_NotInScope(fkToUqCodeList);
    }

    protected void doSetFkToUqCode_NotInScope(Collection<String> fkToUqCodeList) {
        regINS(CK_NINS, cTL(fkToUqCodeList), xgetCValueFkToUqCode(), "FK_TO_UQ_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk} <br>
     * <pre>e.g. setFkToUqCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fkToUqCode The value of fkToUqCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFkToUqCode_LikeSearch(String fkToUqCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFkToUqCode_LikeSearch(fkToUqCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk} <br>
     * <pre>e.g. setFkToUqCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fkToUqCode The value of fkToUqCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFkToUqCode_LikeSearch(String fkToUqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fkToUqCode), xgetCValueFkToUqCode(), "FK_TO_UQ_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFkToUqCode_NotLikeSearch(String fkToUqCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFkToUqCode_NotLikeSearch(fkToUqCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFkToUqCode_NotLikeSearch(String fkToUqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fkToUqCode), xgetCValueFkToUqCode(), "FK_TO_UQ_CODE", likeSearchOption);
    }

    protected void regFkToUqCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFkToUqCode(), "FK_TO_UQ_CODE"); }
    protected abstract ConditionValue xgetCValueFkToUqCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_Equal(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_EQ, compoundUqFirstCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_NotEqual(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_NES, compoundUqFirstCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_InScope(compoundUqFirstCodeList);
    }

    protected void doSetCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_INS, cTL(compoundUqFirstCodeList), xgetCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_NotInScope(compoundUqFirstCodeList);
    }

    protected void doSetCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_NINS, cTL(compoundUqFirstCodeList), xgetCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)} <br>
     * <pre>e.g. setCompoundUqFirstCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param compoundUqFirstCode The value of compoundUqFirstCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_LikeSearch(String compoundUqFirstCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundUqFirstCode_LikeSearch(compoundUqFirstCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)} <br>
     * <pre>e.g. setCompoundUqFirstCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqFirstCode The value of compoundUqFirstCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_LikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqFirstCode), xgetCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_NotLikeSearch(String compoundUqFirstCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundUqFirstCode_NotLikeSearch(compoundUqFirstCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_NotLikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqFirstCode), xgetCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    protected void regCompoundUqFirstCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE"); }
    protected abstract ConditionValue xgetCValueCompoundUqFirstCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_Equal(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_EQ, compoundUqSecondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_NotEqual(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_NES, compoundUqSecondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_InScope(compoundUqSecondCodeList);
    }

    protected void doSetCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_INS, cTL(compoundUqSecondCodeList), xgetCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_NotInScope(compoundUqSecondCodeList);
    }

    protected void doSetCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_NINS, cTL(compoundUqSecondCodeList), xgetCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)} <br>
     * <pre>e.g. setCompoundUqSecondCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param compoundUqSecondCode The value of compoundUqSecondCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_LikeSearch(String compoundUqSecondCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundUqSecondCode_LikeSearch(compoundUqSecondCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)} <br>
     * <pre>e.g. setCompoundUqSecondCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqSecondCode The value of compoundUqSecondCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_LikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqSecondCode), xgetCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_NotLikeSearch(String compoundUqSecondCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundUqSecondCode_NotLikeSearch(compoundUqSecondCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_NotLikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqSecondCode), xgetCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    protected void regCompoundUqSecondCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE"); }
    protected abstract ConditionValue xgetCValueCompoundUqSecondCode();

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
    public HpSLCFunction<WhiteUqFkRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteUqFkRefCB.class);
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
    public HpSLCFunction<WhiteUqFkRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteUqFkRefCB.class);
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
    public HpSLCFunction<WhiteUqFkRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteUqFkRefCB.class);
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
    public HpSLCFunction<WhiteUqFkRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteUqFkRefCB.class);
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
    public HpSLCFunction<WhiteUqFkRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteUqFkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteUqFkRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteUqFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteUqFkRefCQ sq);

    protected WhiteUqFkRefCB xcreateScalarConditionCB() {
        WhiteUqFkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteUqFkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteUqFkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteUqFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "UQ_FK_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqFkRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteUqFkRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "UQ_FK_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqFkRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqFkRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteUqFkRefCQ sq);

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
    protected WhiteUqFkRefCB newMyCB() {
        return new WhiteUqFkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
