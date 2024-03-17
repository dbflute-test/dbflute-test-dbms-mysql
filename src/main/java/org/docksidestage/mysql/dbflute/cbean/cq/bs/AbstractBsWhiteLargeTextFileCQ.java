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
 * The abstract condition-query of white_large_text_file.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteLargeTextFileCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteLargeTextFileCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_large_text_file";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileId The value of largeTextFileId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeTextFileId_Equal(Long largeTextFileId) {
        doSetLargeTextFileId_Equal(largeTextFileId);
    }

    protected void doSetLargeTextFileId_Equal(Long largeTextFileId) {
        regLargeTextFileId(CK_EQ, largeTextFileId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileId The value of largeTextFileId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeTextFileId_GreaterThan(Long largeTextFileId) {
        regLargeTextFileId(CK_GT, largeTextFileId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileId The value of largeTextFileId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeTextFileId_LessThan(Long largeTextFileId) {
        regLargeTextFileId(CK_LT, largeTextFileId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileId The value of largeTextFileId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeTextFileId_GreaterEqual(Long largeTextFileId) {
        regLargeTextFileId(CK_GE, largeTextFileId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileId The value of largeTextFileId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeTextFileId_LessEqual(Long largeTextFileId) {
        regLargeTextFileId(CK_LE, largeTextFileId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of largeTextFileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of largeTextFileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLargeTextFileId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLargeTextFileId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of largeTextFileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of largeTextFileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeTextFileId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLargeTextFileId(), "LARGE_TEXT_FILE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileIdList The collection of largeTextFileId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeTextFileId_InScope(Collection<Long> largeTextFileIdList) {
        doSetLargeTextFileId_InScope(largeTextFileIdList);
    }

    protected void doSetLargeTextFileId_InScope(Collection<Long> largeTextFileIdList) {
        regINS(CK_INS, cTL(largeTextFileIdList), xgetCValueLargeTextFileId(), "LARGE_TEXT_FILE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     * @param largeTextFileIdList The collection of largeTextFileId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeTextFileId_NotInScope(Collection<Long> largeTextFileIdList) {
        doSetLargeTextFileId_NotInScope(largeTextFileIdList);
    }

    protected void doSetLargeTextFileId_NotInScope(Collection<Long> largeTextFileIdList) {
        regINS(CK_NINS, cTL(largeTextFileIdList), xgetCValueLargeTextFileId(), "LARGE_TEXT_FILE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLargeTextFileId_IsNull() { regLargeTextFileId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLargeTextFileId_IsNotNull() { regLargeTextFileId(CK_ISNN, DOBJ); }

    protected void regLargeTextFileId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLargeTextFileId(), "LARGE_TEXT_FILE_ID"); }
    protected abstract ConditionValue xgetCValueLargeTextFileId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     * @param largeTextFileText The value of largeTextFileText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeTextFileText_Equal(String largeTextFileText) {
        doSetLargeTextFileText_Equal(fRES(largeTextFileText));
    }

    protected void doSetLargeTextFileText_Equal(String largeTextFileText) {
        regLargeTextFileText(CK_EQ, largeTextFileText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     * @param largeTextFileText The value of largeTextFileText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeTextFileText_NotEqual(String largeTextFileText) {
        doSetLargeTextFileText_NotEqual(fRES(largeTextFileText));
    }

    protected void doSetLargeTextFileText_NotEqual(String largeTextFileText) {
        regLargeTextFileText(CK_NES, largeTextFileText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     * @param largeTextFileTextList The collection of largeTextFileText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeTextFileText_InScope(Collection<String> largeTextFileTextList) {
        doSetLargeTextFileText_InScope(largeTextFileTextList);
    }

    protected void doSetLargeTextFileText_InScope(Collection<String> largeTextFileTextList) {
        regINS(CK_INS, cTL(largeTextFileTextList), xgetCValueLargeTextFileText(), "LARGE_TEXT_FILE_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     * @param largeTextFileTextList The collection of largeTextFileText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeTextFileText_NotInScope(Collection<String> largeTextFileTextList) {
        doSetLargeTextFileText_NotInScope(largeTextFileTextList);
    }

    protected void doSetLargeTextFileText_NotInScope(Collection<String> largeTextFileTextList) {
        regINS(CK_NINS, cTL(largeTextFileTextList), xgetCValueLargeTextFileText(), "LARGE_TEXT_FILE_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)} <br>
     * <pre>e.g. setLargeTextFileText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param largeTextFileText The value of largeTextFileText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLargeTextFileText_LikeSearch(String largeTextFileText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLargeTextFileText_LikeSearch(largeTextFileText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)} <br>
     * <pre>e.g. setLargeTextFileText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param largeTextFileText The value of largeTextFileText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLargeTextFileText_LikeSearch(String largeTextFileText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(largeTextFileText), xgetCValueLargeTextFileText(), "LARGE_TEXT_FILE_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     * @param largeTextFileText The value of largeTextFileText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLargeTextFileText_NotLikeSearch(String largeTextFileText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLargeTextFileText_NotLikeSearch(largeTextFileText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     * @param largeTextFileText The value of largeTextFileText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLargeTextFileText_NotLikeSearch(String largeTextFileText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(largeTextFileText), xgetCValueLargeTextFileText(), "LARGE_TEXT_FILE_TEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     */
    public void setLargeTextFileText_IsNull() { regLargeTextFileText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     */
    public void setLargeTextFileText_IsNullOrEmpty() { regLargeTextFileText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LARGE_TEXT_FILE_TEXT: {TEXT(65535)}
     */
    public void setLargeTextFileText_IsNotNull() { regLargeTextFileText(CK_ISNN, DOBJ); }

    protected void regLargeTextFileText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLargeTextFileText(), "LARGE_TEXT_FILE_TEXT"); }
    protected abstract ConditionValue xgetCValueLargeTextFileText();

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
    public HpSLCFunction<WhiteLargeTextFileCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteLargeTextFileCB.class);
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
    public HpSLCFunction<WhiteLargeTextFileCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteLargeTextFileCB.class);
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
    public HpSLCFunction<WhiteLargeTextFileCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteLargeTextFileCB.class);
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
    public HpSLCFunction<WhiteLargeTextFileCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteLargeTextFileCB.class);
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
    public HpSLCFunction<WhiteLargeTextFileCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteLargeTextFileCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteLargeTextFileCB&gt;() {
     *     public void query(WhiteLargeTextFileCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteLargeTextFileCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteLargeTextFileCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLargeTextFileCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteLargeTextFileCQ sq);

    protected WhiteLargeTextFileCB xcreateScalarConditionCB() {
        WhiteLargeTextFileCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteLargeTextFileCB xcreateScalarConditionPartitionByCB() {
        WhiteLargeTextFileCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteLargeTextFileCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLargeTextFileCB cb = new WhiteLargeTextFileCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LARGE_TEXT_FILE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteLargeTextFileCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteLargeTextFileCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteLargeTextFileCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLargeTextFileCB cb = new WhiteLargeTextFileCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LARGE_TEXT_FILE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteLargeTextFileCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteLargeTextFileCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteLargeTextFileCB cb = new WhiteLargeTextFileCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteLargeTextFileCQ sq);

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
    protected WhiteLargeTextFileCB newMyCB() {
        return new WhiteLargeTextFileCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteLargeTextFileCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
