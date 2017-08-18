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
 * The abstract condition-query of white_uq_classification_flg_part.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqClassificationFlgPartCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqClassificationFlgPartCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_classification_flg_part";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsId The value of uqClsId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsId_Equal(Long uqClsId) {
        doSetUqClsId_Equal(uqClsId);
    }

    protected void doSetUqClsId_Equal(Long uqClsId) {
        regUqClsId(CK_EQ, uqClsId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsId The value of uqClsId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsId_GreaterThan(Long uqClsId) {
        regUqClsId(CK_GT, uqClsId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsId The value of uqClsId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsId_LessThan(Long uqClsId) {
        regUqClsId(CK_LT, uqClsId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsId The value of uqClsId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsId_GreaterEqual(Long uqClsId) {
        regUqClsId(CK_GE, uqClsId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsId The value of uqClsId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsId_LessEqual(Long uqClsId) {
        regUqClsId(CK_LE, uqClsId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqClsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of uqClsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUqClsId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUqClsId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqClsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of uqClsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqClsId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUqClsId(), "UQ_CLS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsIdList The collection of uqClsId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsId_InScope(Collection<Long> uqClsIdList) {
        doSetUqClsId_InScope(uqClsIdList);
    }

    protected void doSetUqClsId_InScope(Collection<Long> uqClsIdList) {
        regINS(CK_INS, cTL(uqClsIdList), xgetCValueUqClsId(), "UQ_CLS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsIdList The collection of uqClsId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsId_NotInScope(Collection<Long> uqClsIdList) {
        doSetUqClsId_NotInScope(uqClsIdList);
    }

    protected void doSetUqClsId_NotInScope(Collection<Long> uqClsIdList) {
        regINS(CK_NINS, cTL(uqClsIdList), xgetCValueUqClsId(), "UQ_CLS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqClsId_IsNull() { regUqClsId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqClsId_IsNotNull() { regUqClsId(CK_ISNN, DOBJ); }

    protected void regUqClsId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqClsId(), "UQ_CLS_ID"); }
    protected abstract ConditionValue xgetCValueUqClsId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @param uqClsName The value of uqClsName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsName_Equal(String uqClsName) {
        doSetUqClsName_Equal(fRES(uqClsName));
    }

    protected void doSetUqClsName_Equal(String uqClsName) {
        regUqClsName(CK_EQ, uqClsName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @param uqClsName The value of uqClsName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsName_NotEqual(String uqClsName) {
        doSetUqClsName_NotEqual(fRES(uqClsName));
    }

    protected void doSetUqClsName_NotEqual(String uqClsName) {
        regUqClsName(CK_NES, uqClsName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @param uqClsNameList The collection of uqClsName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsName_InScope(Collection<String> uqClsNameList) {
        doSetUqClsName_InScope(uqClsNameList);
    }

    protected void doSetUqClsName_InScope(Collection<String> uqClsNameList) {
        regINS(CK_INS, cTL(uqClsNameList), xgetCValueUqClsName(), "UQ_CLS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @param uqClsNameList The collection of uqClsName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsName_NotInScope(Collection<String> uqClsNameList) {
        doSetUqClsName_NotInScope(uqClsNameList);
    }

    protected void doSetUqClsName_NotInScope(Collection<String> uqClsNameList) {
        regINS(CK_NINS, cTL(uqClsNameList), xgetCValueUqClsName(), "UQ_CLS_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setUqClsName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param uqClsName The value of uqClsName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUqClsName_LikeSearch(String uqClsName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUqClsName_LikeSearch(uqClsName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setUqClsName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqClsName The value of uqClsName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqClsName_LikeSearch(String uqClsName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqClsName), xgetCValueUqClsName(), "UQ_CLS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @param uqClsName The value of uqClsName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUqClsName_NotLikeSearch(String uqClsName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUqClsName_NotLikeSearch(uqClsName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @param uqClsName The value of uqClsName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqClsName_NotLikeSearch(String uqClsName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqClsName), xgetCValueUqClsName(), "UQ_CLS_NAME", likeSearchOption);
    }

    protected void regUqClsName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqClsName(), "UQ_CLS_NAME"); }
    protected abstract ConditionValue xgetCValueUqClsName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg}
     * @param uqClsFlg The value of uqClsFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    protected void setUqClsFlg_Equal(Integer uqClsFlg) {
        doSetUqClsFlg_Equal(uqClsFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg} <br>
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetUqClsFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * はい: 有効を示す
     */
    public void setUqClsFlg_Equal_True() {
        setUqClsFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * いいえ: 無効を示す
     */
    public void setUqClsFlg_Equal_False() {
        setUqClsFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetUqClsFlg_Equal(Integer uqClsFlg) {
        regUqClsFlg(CK_EQ, uqClsFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg}
     * @param uqClsFlgList The collection of uqClsFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setUqClsFlg_InScope(Collection<Integer> uqClsFlgList) {
        doSetUqClsFlg_InScope(uqClsFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg} <br>
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetUqClsFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetUqClsFlg_InScope(Collection<Integer> uqClsFlgList) {
        regINS(CK_INS, cTL(uqClsFlgList), xgetCValueUqClsFlg(), "UQ_CLS_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg}
     * @param uqClsFlgList The collection of uqClsFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setUqClsFlg_NotInScope(Collection<Integer> uqClsFlgList) {
        doSetUqClsFlg_NotInScope(uqClsFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg} <br>
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetUqClsFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetUqClsFlg_NotInScope(Collection<Integer> uqClsFlgList) {
        regINS(CK_NINS, cTL(uqClsFlgList), xgetCValueUqClsFlg(), "UQ_CLS_FLG");
    }

    protected void regUqClsFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqClsFlg(), "UQ_CLS_FLG"); }
    protected abstract ConditionValue xgetCValueUqClsFlg();

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
    public HpSLCFunction<WhiteUqClassificationFlgPartCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteUqClassificationFlgPartCB.class);
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
    public HpSLCFunction<WhiteUqClassificationFlgPartCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteUqClassificationFlgPartCB.class);
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
    public HpSLCFunction<WhiteUqClassificationFlgPartCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteUqClassificationFlgPartCB.class);
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
    public HpSLCFunction<WhiteUqClassificationFlgPartCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteUqClassificationFlgPartCB.class);
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
    public HpSLCFunction<WhiteUqClassificationFlgPartCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteUqClassificationFlgPartCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqClassificationFlgPartCB&gt;() {
     *     public void query(WhiteUqClassificationFlgPartCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteUqClassificationFlgPartCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteUqClassificationFlgPartCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqClassificationFlgPartCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteUqClassificationFlgPartCQ sq);

    protected WhiteUqClassificationFlgPartCB xcreateScalarConditionCB() {
        WhiteUqClassificationFlgPartCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteUqClassificationFlgPartCB xcreateScalarConditionPartitionByCB() {
        WhiteUqClassificationFlgPartCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteUqClassificationFlgPartCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqClassificationFlgPartCB cb = new WhiteUqClassificationFlgPartCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "UQ_CLS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqClassificationFlgPartCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqClassificationFlgPartCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteUqClassificationFlgPartCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqClassificationFlgPartCB cb = new WhiteUqClassificationFlgPartCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "UQ_CLS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqClassificationFlgPartCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqClassificationFlgPartCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqClassificationFlgPartCB cb = new WhiteUqClassificationFlgPartCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteUqClassificationFlgPartCQ sq);

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
    protected WhiteUqClassificationFlgPartCB newMyCB() {
        return new WhiteUqClassificationFlgPartCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteUqClassificationFlgPartCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
