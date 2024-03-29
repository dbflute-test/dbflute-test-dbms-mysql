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
 * The abstract condition-query of white_variant_relation_master_corge.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteVariantRelationMasterCorgeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteVariantRelationMasterCorgeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_variant_relation_master_corge";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterCorgeId_Equal(Long masterCorgeId) {
        doSetMasterCorgeId_Equal(masterCorgeId);
    }

    protected void doSetMasterCorgeId_Equal(Long masterCorgeId) {
        regMasterCorgeId(CK_EQ, masterCorgeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterCorgeId_NotEqual(Long masterCorgeId) {
        doSetMasterCorgeId_NotEqual(masterCorgeId);
    }

    protected void doSetMasterCorgeId_NotEqual(Long masterCorgeId) {
        regMasterCorgeId(CK_NES, masterCorgeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterCorgeId_GreaterThan(Long masterCorgeId) {
        regMasterCorgeId(CK_GT, masterCorgeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterCorgeId_LessThan(Long masterCorgeId) {
        regMasterCorgeId(CK_LT, masterCorgeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterCorgeId_GreaterEqual(Long masterCorgeId) {
        regMasterCorgeId(CK_GE, masterCorgeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeId The value of masterCorgeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMasterCorgeId_LessEqual(Long masterCorgeId) {
        regMasterCorgeId(CK_LE, masterCorgeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of masterCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMasterCorgeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMasterCorgeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of masterCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of masterCorgeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMasterCorgeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMasterCorgeId(), "MASTER_CORGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeIdList The collection of masterCorgeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterCorgeId_InScope(Collection<Long> masterCorgeIdList) {
        doSetMasterCorgeId_InScope(masterCorgeIdList);
    }

    protected void doSetMasterCorgeId_InScope(Collection<Long> masterCorgeIdList) {
        regINS(CK_INS, cTL(masterCorgeIdList), xgetCValueMasterCorgeId(), "MASTER_CORGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     * @param masterCorgeIdList The collection of masterCorgeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterCorgeId_NotInScope(Collection<Long> masterCorgeIdList) {
        doSetMasterCorgeId_NotInScope(masterCorgeIdList);
    }

    protected void doSetMasterCorgeId_NotInScope(Collection<Long> masterCorgeIdList) {
        regINS(CK_NINS, cTL(masterCorgeIdList), xgetCValueMasterCorgeId(), "MASTER_CORGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterCorgeId_IsNull() { regMasterCorgeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setMasterCorgeId_IsNotNull() { regMasterCorgeId(CK_ISNN, DOBJ); }

    protected void regMasterCorgeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterCorgeId(), "MASTER_CORGE_ID"); }
    protected abstract ConditionValue xgetCValueMasterCorgeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterCorgeName_Equal(String masterCorgeName) {
        doSetMasterCorgeName_Equal(fRES(masterCorgeName));
    }

    protected void doSetMasterCorgeName_Equal(String masterCorgeName) {
        regMasterCorgeName(CK_EQ, masterCorgeName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterCorgeName_NotEqual(String masterCorgeName) {
        doSetMasterCorgeName_NotEqual(fRES(masterCorgeName));
    }

    protected void doSetMasterCorgeName_NotEqual(String masterCorgeName) {
        regMasterCorgeName(CK_NES, masterCorgeName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeNameList The collection of masterCorgeName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterCorgeName_InScope(Collection<String> masterCorgeNameList) {
        doSetMasterCorgeName_InScope(masterCorgeNameList);
    }

    protected void doSetMasterCorgeName_InScope(Collection<String> masterCorgeNameList) {
        regINS(CK_INS, cTL(masterCorgeNameList), xgetCValueMasterCorgeName(), "MASTER_CORGE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeNameList The collection of masterCorgeName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMasterCorgeName_NotInScope(Collection<String> masterCorgeNameList) {
        doSetMasterCorgeName_NotInScope(masterCorgeNameList);
    }

    protected void doSetMasterCorgeName_NotInScope(Collection<String> masterCorgeNameList) {
        regINS(CK_NINS, cTL(masterCorgeNameList), xgetCValueMasterCorgeName(), "MASTER_CORGE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterCorgeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param masterCorgeName The value of masterCorgeName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterCorgeName_LikeSearch(String masterCorgeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterCorgeName_LikeSearch(masterCorgeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMasterCorgeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param masterCorgeName The value of masterCorgeName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMasterCorgeName_LikeSearch(String masterCorgeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(masterCorgeName), xgetCValueMasterCorgeName(), "MASTER_CORGE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMasterCorgeName_NotLikeSearch(String masterCorgeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMasterCorgeName_NotLikeSearch(masterCorgeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MASTER_CORGE_NAME: {NotNull, VARCHAR(200)}
     * @param masterCorgeName The value of masterCorgeName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMasterCorgeName_NotLikeSearch(String masterCorgeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(masterCorgeName), xgetCValueMasterCorgeName(), "MASTER_CORGE_NAME", likeSearchOption);
    }

    protected void regMasterCorgeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMasterCorgeName(), "MASTER_CORGE_NAME"); }
    protected abstract ConditionValue xgetCValueMasterCorgeName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCode The value of corgeTypeCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCorgeTypeCode_Equal(String corgeTypeCode) {
        doSetCorgeTypeCode_Equal(fRES(corgeTypeCode));
    }

    /**
     * Equal(=). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetCorgeTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Qua (Qua). And OnlyOnceRegistered. <br>
     * Qua
     */
    public void setCorgeTypeCode_Equal_Qua() {
        setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Equal(=). As Que (Que). And OnlyOnceRegistered. <br>
     * Que
     */
    public void setCorgeTypeCode_Equal_Que() {
        setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Equal(=). As Quo (Quo). And OnlyOnceRegistered. <br>
     * Quo
     */
    public void setCorgeTypeCode_Equal_Quo() {
        setCorgeTypeCode_Equal_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetCorgeTypeCode_Equal(String corgeTypeCode) {
        regCorgeTypeCode(CK_EQ, corgeTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCode The value of corgeTypeCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCorgeTypeCode_NotEqual(String corgeTypeCode) {
        doSetCorgeTypeCode_NotEqual(fRES(corgeTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As VariantRelationQuxType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        doSetCorgeTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Qua (Qua). And OnlyOnceRegistered. <br>
     * Qua
     */
    public void setCorgeTypeCode_NotEqual_Qua() {
        setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * NotEqual(&lt;&gt;). As Que (Que). And OnlyOnceRegistered. <br>
     * Que
     */
    public void setCorgeTypeCode_NotEqual_Que() {
        setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * NotEqual(&lt;&gt;). As Quo (Quo). And OnlyOnceRegistered. <br>
     * Quo
     */
    public void setCorgeTypeCode_NotEqual_Quo() {
        setCorgeTypeCode_NotEqual_AsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    protected void doSetCorgeTypeCode_NotEqual(String corgeTypeCode) {
        regCorgeTypeCode(CK_NES, corgeTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCodeList The collection of corgeTypeCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCorgeTypeCode_InScope(Collection<String> corgeTypeCodeList) {
        doSetCorgeTypeCode_InScope(corgeTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorgeTypeCode_InScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetCorgeTypeCode_InScope(cTStrL(cdefList));
    }

    protected void doSetCorgeTypeCode_InScope(Collection<String> corgeTypeCodeList) {
        regINS(CK_INS, cTL(corgeTypeCodeList), xgetCValueCorgeTypeCode(), "CORGE_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType}
     * @param corgeTypeCodeList The collection of corgeTypeCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setCorgeTypeCode_NotInScope(Collection<String> corgeTypeCodeList) {
        doSetCorgeTypeCode_NotInScope(corgeTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VariantRelationQuxType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br>
     * qux type of variant relation (biz-many-to-one)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorgeTypeCode_NotInScope_AsVariantRelationQuxType(Collection<CDef.VariantRelationQuxType> cdefList) {
        doSetCorgeTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCorgeTypeCode_NotInScope(Collection<String> corgeTypeCodeList) {
        regINS(CK_NINS, cTL(corgeTypeCodeList), xgetCValueCorgeTypeCode(), "CORGE_TYPE_CODE");
    }

    protected void regCorgeTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorgeTypeCode(), "CORGE_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueCorgeTypeCode();

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
    public HpSLCFunction<WhiteVariantRelationMasterCorgeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteVariantRelationMasterCorgeCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterCorgeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteVariantRelationMasterCorgeCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterCorgeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteVariantRelationMasterCorgeCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterCorgeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteVariantRelationMasterCorgeCB.class);
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
    public HpSLCFunction<WhiteVariantRelationMasterCorgeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteVariantRelationMasterCorgeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteVariantRelationMasterCorgeCB&gt;() {
     *     public void query(WhiteVariantRelationMasterCorgeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteVariantRelationMasterCorgeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteVariantRelationMasterCorgeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterCorgeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteVariantRelationMasterCorgeCQ sq);

    protected WhiteVariantRelationMasterCorgeCB xcreateScalarConditionCB() {
        WhiteVariantRelationMasterCorgeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteVariantRelationMasterCorgeCB xcreateScalarConditionPartitionByCB() {
        WhiteVariantRelationMasterCorgeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteVariantRelationMasterCorgeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MASTER_CORGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteVariantRelationMasterCorgeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteVariantRelationMasterCorgeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteVariantRelationMasterCorgeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MASTER_CORGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteVariantRelationMasterCorgeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteVariantRelationMasterCorgeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteVariantRelationMasterCorgeCB cb = new WhiteVariantRelationMasterCorgeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteVariantRelationMasterCorgeCQ sq);

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
    protected WhiteVariantRelationMasterCorgeCB newMyCB() {
        return new WhiteVariantRelationMasterCorgeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteVariantRelationMasterCorgeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
