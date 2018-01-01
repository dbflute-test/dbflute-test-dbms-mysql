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
 * The abstract condition-query of white_variant_relation_master_qux.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterQuxCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterQuxCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_qux";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterQuxId_Equal(Long masterQuxId) {
        doSetMasterQuxId_Equal(masterQuxId);
    }

    protected void doSetMasterQuxId_Equal(Long masterQuxId) {
        regMasterQuxId(CK_EQ, masterQuxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterQuxId_GreaterThan(Long masterQuxId) {
        regMasterQuxId(CK_GT, masterQuxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterQuxId_LessThan(Long masterQuxId) {
        regMasterQuxId(CK_LT, masterQuxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterQuxId_GreaterEqual(Long masterQuxId) {
        regMasterQuxId(CK_GE, masterQuxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxId The value of masterQuxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterQuxId_LessEqual(Long masterQuxId) {
        regMasterQuxId(CK_LE, masterQuxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of masterQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMasterQuxId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMasterQuxId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of masterQuxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterQuxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMasterQuxId(), "MASTER_QUX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxIdList The collection of masterQuxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterQuxId_InScope(Collection<Long> masterQuxIdList) {
        doSetMasterQuxId_InScope(masterQuxIdList);
    }

    protected void doSetMasterQuxId_InScope(Collection<Long> masterQuxIdList) {
        regINS(CK_INS, cTL(masterQuxIdList), xgetCValueMasterQuxId(), "MASTER_QUX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     * @param masterQuxIdList The collection of masterQuxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterQuxId_NotInScope(Collection<Long> masterQuxIdList) {
        doSetMasterQuxId_NotInScope(masterQuxIdList);
    }

    protected void doSetMasterQuxId_NotInScope(Collection<Long> masterQuxIdList) {
        regINS(CK_NINS, cTL(masterQuxIdList), xgetCValueMasterQuxId(), "MASTER_QUX_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterQuxId_IsNull() { regMasterQuxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MASTER_QUX_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterQuxId_IsNotNull() { regMasterQuxId(CK_ISNN, DOBJ); }

    protected void regMasterQuxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterQuxId(), "MASTER_QUX_ID"); }
    protected abstract ConditionValue xgetCValueMasterQuxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterQuxName_Equal(String masterQuxName) {
        doSetMasterQuxName_Equal(fRES(masterQuxName));
    }

    protected void doSetMasterQuxName_Equal(String masterQuxName) {
        regMasterQuxName(CK_EQ, masterQuxName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterQuxName_NotEqual(String masterQuxName) {
        doSetMasterQuxName_NotEqual(fRES(masterQuxName));
    }

    protected void doSetMasterQuxName_NotEqual(String masterQuxName) {
        regMasterQuxName(CK_NES, masterQuxName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxNameList The collection of masterQuxName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterQuxName_InScope(Collection<String> masterQuxNameList) {
        doSetMasterQuxName_InScope(masterQuxNameList);
    }

    protected void doSetMasterQuxName_InScope(Collection<String> masterQuxNameList) {
        regINS(CK_INS, cTL(masterQuxNameList), xgetCValueMasterQuxName(), "MASTER_QUX_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxNameList The collection of masterQuxName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterQuxName_NotInScope(Collection<String> masterQuxNameList) {
        doSetMasterQuxName_NotInScope(masterQuxNameList);
    }

    protected void doSetMasterQuxName_NotInScope(Collection<String> masterQuxNameList) {
        regINS(CK_NINS, cTL(masterQuxNameList), xgetCValueMasterQuxName(), "MASTER_QUX_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterQuxName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param masterQuxName The value of masterQuxName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterQuxName_LikeSearch(String masterQuxName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterQuxName_LikeSearch(masterQuxName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterQuxName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterQuxName The value of masterQuxName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterQuxName_LikeSearch(String masterQuxName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterQuxName), xgetCValueMasterQuxName(), "MASTER_QUX_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterQuxName_NotLikeSearch(String masterQuxName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterQuxName_NotLikeSearch(masterQuxName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_QUX_NAME: {NotNull, VARCHAR(200)}
     * @param masterQuxName The value of masterQuxName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterQuxName_NotLikeSearch(String masterQuxName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterQuxName), xgetCValueMasterQuxName(), "MASTER_QUX_NAME", likeSearchOption);
    }

    protected void regMasterQuxName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterQuxName(), "MASTER_QUX_NAME"); }
    protected abstract ConditionValue xgetCValueMasterQuxName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCode The value of quxTypeCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setQuxTypeCode_Equal(String quxTypeCode) {
        doSetQuxTypeCode_Equal(fRES(quxTypeCode));
    }

    /**
     * Equal(=). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetQuxTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Qua (Qua). And OnlyOnceRegistered. <br>
     * Qua
     */
    public void setQuxTypeCode_Equal_Qua() {
        setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Equal(=). As Que (Que). And OnlyOnceRegistered. <br>
     * Que
     */
    public void setQuxTypeCode_Equal_Que() {
        setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Equal(=). As Quo (Quo). And OnlyOnceRegistered. <br>
     * Quo
     */
    public void setQuxTypeCode_Equal_Quo() {
        setQuxTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetQuxTypeCode_Equal(String quxTypeCode) {
        regQuxTypeCode(CK_EQ, quxTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCode The value of quxTypeCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setQuxTypeCode_NotEqual(String quxTypeCode) {
        doSetQuxTypeCode_NotEqual(fRES(quxTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetQuxTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Qua (Qua). And OnlyOnceRegistered. <br>
     * Qua
     */
    public void setQuxTypeCode_NotEqual_Qua() {
        setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * NotEqual(&lt;&gt;). As Que (Que). And OnlyOnceRegistered. <br>
     * Que
     */
    public void setQuxTypeCode_NotEqual_Que() {
        setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * NotEqual(&lt;&gt;). As Quo (Quo). And OnlyOnceRegistered. <br>
     * Quo
     */
    public void setQuxTypeCode_NotEqual_Quo() {
        setQuxTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetQuxTypeCode_NotEqual(String quxTypeCode) {
        regQuxTypeCode(CK_NES, quxTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCodeList The collection of quxTypeCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setQuxTypeCode_InScope(Collection<String> quxTypeCodeList) {
        doSetQuxTypeCode_InScope(quxTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuxTypeCode_InScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetQuxTypeCode_InScope(cTStrL(cdefList));
    }

    protected void doSetQuxTypeCode_InScope(Collection<String> quxTypeCodeList) {
        regINS(CK_INS, cTL(quxTypeCodeList), xgetCValueQuxTypeCode(), "QUX_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param quxTypeCodeList The collection of quxTypeCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setQuxTypeCode_NotInScope(Collection<String> quxTypeCodeList) {
        doSetQuxTypeCode_NotInScope(quxTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuxTypeCode_NotInScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetQuxTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetQuxTypeCode_NotInScope(Collection<String> quxTypeCodeList) {
        regINS(CK_NINS, cTL(quxTypeCodeList), xgetCValueQuxTypeCode(), "QUX_TYPE_CODE");
    }

    protected void regQuxTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuxTypeCode(), "QUX_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueQuxTypeCode();

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
    public HpSLCFunction<WhiteVariantRelationMasterQuxCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteVariantRelationMasterQuxCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterQuxCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteVariantRelationMasterQuxCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterQuxCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteVariantRelationMasterQuxCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterQuxCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteVariantRelationMasterQuxCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterQuxCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteVariantRelationMasterQuxCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void query(WhiteVariantRelationMasterQuxCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteVariantRelationMasterQuxCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteVariantRelationMasterQuxCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterQuxCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterQuxCQ sq);

    protected WhiteVariantRelationMasterQuxCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterQuxCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationMasterQuxCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterQuxCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterQuxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MASTER_QUX_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterQuxCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterQuxCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationMasterQuxCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MASTER_QUX_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterQuxCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterQuxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterQuxCQ sq);

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
    protected WhiteVariantRelationMasterQuxCB newMyCB() {
        return new WhiteVariantRelationMasterQuxCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationMasterQuxCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
