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
 * The abstract condition-query of white_uq_classification.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqClassificationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqClassificationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_classification";
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
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqClsId The value of uqClsId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsId_NotEqual(Long uqClsId) {
        doSetUqClsId_NotEqual(uqClsId);
    }

    protected void doSetUqClsId_NotEqual(Long uqClsId) {
        regUqClsId(CK_NES, uqClsId);
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
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType}
     * @param uqClsCode The value of uqClsCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setUqClsCode_Equal(String uqClsCode) {
        doSetUqClsCode_Equal(fRES(uqClsCode));
    }

    /**
     * Equal(=). As UQClassificationType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br>
     * unique key as classification
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsCode_Equal_AsUQClassificationType(CDef.UQClassificationType cdef) {
        doSetUqClsCode_Equal(cdef != null ? cdef.code() : null);
    }

    protected void doSetUqClsCode_Equal(String uqClsCode) {
        regUqClsCode(CK_EQ, uqClsCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType}
     * @param uqClsCode The value of uqClsCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setUqClsCode_NotEqual(String uqClsCode) {
        doSetUqClsCode_NotEqual(fRES(uqClsCode));
    }

    /**
     * NotEqual(&lt;&gt;). As UQClassificationType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br>
     * unique key as classification
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUqClsCode_NotEqual_AsUQClassificationType(CDef.UQClassificationType cdef) {
        doSetUqClsCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    protected void doSetUqClsCode_NotEqual(String uqClsCode) {
        regUqClsCode(CK_NES, uqClsCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType}
     * @param uqClsCodeList The collection of uqClsCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setUqClsCode_InScope(Collection<String> uqClsCodeList) {
        doSetUqClsCode_InScope(uqClsCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As UQClassificationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br>
     * unique key as classification
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsCode_InScope_AsUQClassificationType(Collection<CDef.UQClassificationType> cdefList) {
        doSetUqClsCode_InScope(cTStrL(cdefList));
    }

    protected void doSetUqClsCode_InScope(Collection<String> uqClsCodeList) {
        regINS(CK_INS, cTL(uqClsCodeList), xgetCValueUqClsCode(), "UQ_CLS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType}
     * @param uqClsCodeList The collection of uqClsCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setUqClsCode_NotInScope(Collection<String> uqClsCodeList) {
        doSetUqClsCode_NotInScope(uqClsCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UQClassificationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br>
     * unique key as classification
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUqClsCode_NotInScope_AsUQClassificationType(Collection<CDef.UQClassificationType> cdefList) {
        doSetUqClsCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUqClsCode_NotInScope(Collection<String> uqClsCodeList) {
        regINS(CK_NINS, cTL(uqClsCodeList), xgetCValueUqClsCode(), "UQ_CLS_CODE");
    }

    protected void regUqClsCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqClsCode(), "UQ_CLS_CODE"); }
    protected abstract ConditionValue xgetCValueUqClsCode();

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
    public HpSLCFunction<WhiteUqClassificationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteUqClassificationCB.class);
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
    public HpSLCFunction<WhiteUqClassificationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteUqClassificationCB.class);
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
    public HpSLCFunction<WhiteUqClassificationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteUqClassificationCB.class);
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
    public HpSLCFunction<WhiteUqClassificationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteUqClassificationCB.class);
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
    public HpSLCFunction<WhiteUqClassificationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteUqClassificationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqClassificationCB&gt;() {
     *     public void query(WhiteUqClassificationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteUqClassificationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteUqClassificationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqClassificationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteUqClassificationCQ sq);

    protected WhiteUqClassificationCB xcreateScalarConditionCB() {
        WhiteUqClassificationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteUqClassificationCB xcreateScalarConditionPartitionByCB() {
        WhiteUqClassificationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteUqClassificationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqClassificationCB cb = new WhiteUqClassificationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "UQ_CLS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqClassificationCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqClassificationCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteUqClassificationCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqClassificationCB cb = new WhiteUqClassificationCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "UQ_CLS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqClassificationCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqClassificationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqClassificationCB cb = new WhiteUqClassificationCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteUqClassificationCQ sq);

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
    protected WhiteUqClassificationCB newMyCB() {
        return new WhiteUqClassificationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteUqClassificationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
