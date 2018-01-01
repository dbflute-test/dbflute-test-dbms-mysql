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
 * The abstract condition-query of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstId The value of pkFirstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_Equal(Integer pkFirstId) {
        doSetPkFirstId_Equal(pkFirstId);
    }

    protected void doSetPkFirstId_Equal(Integer pkFirstId) {
        regPkFirstId(CK_EQ, pkFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstId The value of pkFirstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_GreaterThan(Integer pkFirstId) {
        regPkFirstId(CK_GT, pkFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstId The value of pkFirstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_LessThan(Integer pkFirstId) {
        regPkFirstId(CK_LT, pkFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstId The value of pkFirstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_GreaterEqual(Integer pkFirstId) {
        regPkFirstId(CK_GE, pkFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstId The value of pkFirstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_LessEqual(Integer pkFirstId) {
        regPkFirstId(CK_LE, pkFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param minNumber The min number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPkFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPkFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param minNumber The min number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePkFirstId(), "PK_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstIdList The collection of pkFirstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkFirstId_InScope(Collection<Integer> pkFirstIdList) {
        doSetPkFirstId_InScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_InScope(Collection<Integer> pkFirstIdList) {
        regINS(CK_INS, cTL(pkFirstIdList), xgetCValuePkFirstId(), "PK_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @param pkFirstIdList The collection of pkFirstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkFirstId_NotInScope(Collection<Integer> pkFirstIdList) {
        doSetPkFirstId_NotInScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_NotInScope(Collection<Integer> pkFirstIdList) {
        regINS(CK_NINS, cTL(pkFirstIdList), xgetCValuePkFirstId(), "PK_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     */
    public void setPkFirstId_IsNull() { regPkFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     */
    public void setPkFirstId_IsNotNull() { regPkFirstId(CK_ISNN, DOBJ); }

    protected void regPkFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkFirstId(), "PK_FIRST_ID"); }
    protected abstract ConditionValue xgetCValuePkFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondId The value of pkSecondId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_Equal(Integer pkSecondId) {
        doSetPkSecondId_Equal(pkSecondId);
    }

    protected void doSetPkSecondId_Equal(Integer pkSecondId) {
        regPkSecondId(CK_EQ, pkSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondId The value of pkSecondId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_GreaterThan(Integer pkSecondId) {
        regPkSecondId(CK_GT, pkSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondId The value of pkSecondId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_LessThan(Integer pkSecondId) {
        regPkSecondId(CK_LT, pkSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondId The value of pkSecondId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_GreaterEqual(Integer pkSecondId) {
        regPkSecondId(CK_GE, pkSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondId The value of pkSecondId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_LessEqual(Integer pkSecondId) {
        regPkSecondId(CK_LE, pkSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param minNumber The min number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPkSecondId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPkSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param minNumber The min number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePkSecondId(), "PK_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondIdList The collection of pkSecondId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkSecondId_InScope(Collection<Integer> pkSecondIdList) {
        doSetPkSecondId_InScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_InScope(Collection<Integer> pkSecondIdList) {
        regINS(CK_INS, cTL(pkSecondIdList), xgetCValuePkSecondId(), "PK_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @param pkSecondIdList The collection of pkSecondId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkSecondId_NotInScope(Collection<Integer> pkSecondIdList) {
        doSetPkSecondId_NotInScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_NotInScope(Collection<Integer> pkSecondIdList) {
        regINS(CK_NINS, cTL(pkSecondIdList), xgetCValuePkSecondId(), "PK_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     */
    public void setPkSecondId_IsNull() { regPkSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     */
    public void setPkSecondId_IsNotNull() { regPkSecondId(CK_ISNN, DOBJ); }

    protected void regPkSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkSecondId(), "PK_SECOND_ID"); }
    protected abstract ConditionValue xgetCValuePkSecondId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkName_Equal(String pkName) {
        doSetPkName_Equal(fRES(pkName));
    }

    protected void doSetPkName_Equal(String pkName) {
        regPkName(CK_EQ, pkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkName_NotEqual(String pkName) {
        doSetPkName_NotEqual(fRES(pkName));
    }

    protected void doSetPkName_NotEqual(String pkName) {
        regPkName(CK_NES, pkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkNameList The collection of pkName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkName_InScope(Collection<String> pkNameList) {
        doSetPkName_InScope(pkNameList);
    }

    protected void doSetPkName_InScope(Collection<String> pkNameList) {
        regINS(CK_INS, cTL(pkNameList), xgetCValuePkName(), "PK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkNameList The collection of pkName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkName_NotInScope(Collection<String> pkNameList) {
        doSetPkName_NotInScope(pkNameList);
    }

    protected void doSetPkName_NotInScope(Collection<String> pkNameList) {
        regINS(CK_NINS, cTL(pkNameList), xgetCValuePkName(), "PK_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPkName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param pkName The value of pkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPkName_LikeSearch(String pkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPkName_LikeSearch(pkName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPkName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pkName The value of pkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPkName_LikeSearch(String pkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pkName), xgetCValuePkName(), "PK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPkName_NotLikeSearch(String pkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPkName_NotLikeSearch(pkName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @param pkName The value of pkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPkName_NotLikeSearch(String pkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pkName), xgetCValuePkName(), "PK_NAME", likeSearchOption);
    }

    protected void regPkName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkName(), "PK_NAME"); }
    protected abstract ConditionValue xgetCValuePkName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredId The value of referredId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_Equal(Integer referredId) {
        doSetReferredId_Equal(referredId);
    }

    protected void doSetReferredId_Equal(Integer referredId) {
        regReferredId(CK_EQ, referredId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredId The value of referredId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_GreaterThan(Integer referredId) {
        regReferredId(CK_GT, referredId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredId The value of referredId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_LessThan(Integer referredId) {
        regReferredId(CK_LT, referredId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredId The value of referredId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_GreaterEqual(Integer referredId) {
        regReferredId(CK_GE, referredId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredId The value of referredId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_LessEqual(Integer referredId) {
        regReferredId(CK_LE, referredId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param minNumber The min number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReferredId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param minNumber The min number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReferredId(), "REFERRED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredIdList The collection of referredId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferredId_InScope(Collection<Integer> referredIdList) {
        doSetReferredId_InScope(referredIdList);
    }

    protected void doSetReferredId_InScope(Collection<Integer> referredIdList) {
        regINS(CK_INS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @param referredIdList The collection of referredId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferredId_NotInScope(Collection<Integer> referredIdList) {
        doSetReferredId_NotInScope(referredIdList);
    }

    protected void doSetReferredId_NotInScope(Collection<Integer> referredIdList) {
        regINS(CK_NINS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    protected void regReferredId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferredId(), "REFERRED_ID"); }
    protected abstract ConditionValue xgetCValueReferredId();

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
    public HpSLCFunction<WhiteCompoundPkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteCompoundPkCB.class);
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
    public HpSLCFunction<WhiteCompoundPkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteCompoundPkCB.class);
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
    public HpSLCFunction<WhiteCompoundPkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteCompoundPkCB.class);
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
    public HpSLCFunction<WhiteCompoundPkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteCompoundPkCB.class);
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
    public HpSLCFunction<WhiteCompoundPkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteCompoundPkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteCompoundPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkCQ sq);

    protected WhiteCompoundPkCB xcreateScalarConditionCB() {
        WhiteCompoundPkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteCompoundPkCB newMyCB() {
        return new WhiteCompoundPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
