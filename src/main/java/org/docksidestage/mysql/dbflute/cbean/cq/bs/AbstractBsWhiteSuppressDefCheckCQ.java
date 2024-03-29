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
 * The abstract condition-query of white_suppress_def_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressDefCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressDefCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_def_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefCheckId_Equal(Long defCheckId) {
        doSetDefCheckId_Equal(defCheckId);
    }

    protected void doSetDefCheckId_Equal(Long defCheckId) {
        regDefCheckId(CK_EQ, defCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefCheckId_NotEqual(Long defCheckId) {
        doSetDefCheckId_NotEqual(defCheckId);
    }

    protected void doSetDefCheckId_NotEqual(Long defCheckId) {
        regDefCheckId(CK_NES, defCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefCheckId_GreaterThan(Long defCheckId) {
        regDefCheckId(CK_GT, defCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefCheckId_LessThan(Long defCheckId) {
        regDefCheckId(CK_LT, defCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefCheckId_GreaterEqual(Long defCheckId) {
        regDefCheckId(CK_GE, defCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefCheckId_LessEqual(Long defCheckId) {
        regDefCheckId(CK_LE, defCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of defCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDefCheckId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDefCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of defCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefCheckId(), "DEF_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckIdList The collection of defCheckId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefCheckId_InScope(Collection<Long> defCheckIdList) {
        doSetDefCheckId_InScope(defCheckIdList);
    }

    protected void doSetDefCheckId_InScope(Collection<Long> defCheckIdList) {
        regINS(CK_INS, cTL(defCheckIdList), xgetCValueDefCheckId(), "DEF_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckIdList The collection of defCheckId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefCheckId_NotInScope(Collection<Long> defCheckIdList) {
        doSetDefCheckId_NotInScope(defCheckIdList);
    }

    protected void doSetDefCheckId_NotInScope(Collection<Long> defCheckIdList) {
        regINS(CK_NINS, cTL(defCheckIdList), xgetCValueDefCheckId(), "DEF_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDefCheckId_IsNull() { regDefCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDefCheckId_IsNotNull() { regDefCheckId(CK_ISNN, DOBJ); }

    protected void regDefCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefCheckId(), "DEF_CHECK_ID"); }
    protected abstract ConditionValue xgetCValueDefCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefCheckName_Equal(String defCheckName) {
        doSetDefCheckName_Equal(fRES(defCheckName));
    }

    protected void doSetDefCheckName_Equal(String defCheckName) {
        regDefCheckName(CK_EQ, defCheckName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefCheckName_NotEqual(String defCheckName) {
        doSetDefCheckName_NotEqual(fRES(defCheckName));
    }

    protected void doSetDefCheckName_NotEqual(String defCheckName) {
        regDefCheckName(CK_NES, defCheckName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckNameList The collection of defCheckName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefCheckName_InScope(Collection<String> defCheckNameList) {
        doSetDefCheckName_InScope(defCheckNameList);
    }

    protected void doSetDefCheckName_InScope(Collection<String> defCheckNameList) {
        regINS(CK_INS, cTL(defCheckNameList), xgetCValueDefCheckName(), "DEF_CHECK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckNameList The collection of defCheckName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefCheckName_NotInScope(Collection<String> defCheckNameList) {
        doSetDefCheckName_NotInScope(defCheckNameList);
    }

    protected void doSetDefCheckName_NotInScope(Collection<String> defCheckNameList) {
        regINS(CK_NINS, cTL(defCheckNameList), xgetCValueDefCheckName(), "DEF_CHECK_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDefCheckName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param defCheckName The value of defCheckName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDefCheckName_LikeSearch(String defCheckName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDefCheckName_LikeSearch(defCheckName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDefCheckName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defCheckName The value of defCheckName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefCheckName_LikeSearch(String defCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defCheckName), xgetCValueDefCheckName(), "DEF_CHECK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDefCheckName_NotLikeSearch(String defCheckName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDefCheckName_NotLikeSearch(defCheckName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefCheckName_NotLikeSearch(String defCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defCheckName), xgetCValueDefCheckName(), "DEF_CHECK_NAME", likeSearchOption);
    }

    protected void regDefCheckName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefCheckName(), "DEF_CHECK_NAME"); }
    protected abstract ConditionValue xgetCValueDefCheckName();

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
    public HpSLCFunction<WhiteSuppressDefCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSuppressDefCheckCB.class);
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
    public HpSLCFunction<WhiteSuppressDefCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSuppressDefCheckCB.class);
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
    public HpSLCFunction<WhiteSuppressDefCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSuppressDefCheckCB.class);
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
    public HpSLCFunction<WhiteSuppressDefCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSuppressDefCheckCB.class);
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
    public HpSLCFunction<WhiteSuppressDefCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSuppressDefCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSuppressDefCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSuppressDefCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressDefCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressDefCheckCQ sq);

    protected WhiteSuppressDefCheckCB xcreateScalarConditionCB() {
        WhiteSuppressDefCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressDefCheckCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressDefCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressDefCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DEF_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressDefCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressDefCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressDefCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEF_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressDefCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressDefCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressDefCheckCQ sq);

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
    protected WhiteSuppressDefCheckCB newMyCB() {
        return new WhiteSuppressDefCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSuppressDefCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
