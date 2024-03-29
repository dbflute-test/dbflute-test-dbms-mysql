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
 * The abstract condition-query of white_suppress_join_sq_one_addi.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqOneAddiCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqOneAddiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_one_addi";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOneAddiId_Equal(Integer oneAddiId) {
        doSetOneAddiId_Equal(oneAddiId);
    }

    protected void doSetOneAddiId_Equal(Integer oneAddiId) {
        regOneAddiId(CK_EQ, oneAddiId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOneAddiId_NotEqual(Integer oneAddiId) {
        doSetOneAddiId_NotEqual(oneAddiId);
    }

    protected void doSetOneAddiId_NotEqual(Integer oneAddiId) {
        regOneAddiId(CK_NES, oneAddiId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOneAddiId_GreaterThan(Integer oneAddiId) {
        regOneAddiId(CK_GT, oneAddiId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOneAddiId_LessThan(Integer oneAddiId) {
        regOneAddiId(CK_LT, oneAddiId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOneAddiId_GreaterEqual(Integer oneAddiId) {
        regOneAddiId(CK_GE, oneAddiId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOneAddiId_LessEqual(Integer oneAddiId) {
        regOneAddiId(CK_LE, oneAddiId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of oneAddiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oneAddiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOneAddiId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOneAddiId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of oneAddiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oneAddiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOneAddiId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOneAddiId(), "ONE_ADDI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiIdList The collection of oneAddiId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOneAddiId_InScope(Collection<Integer> oneAddiIdList) {
        doSetOneAddiId_InScope(oneAddiIdList);
    }

    protected void doSetOneAddiId_InScope(Collection<Integer> oneAddiIdList) {
        regINS(CK_INS, cTL(oneAddiIdList), xgetCValueOneAddiId(), "ONE_ADDI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiIdList The collection of oneAddiId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOneAddiId_NotInScope(Collection<Integer> oneAddiIdList) {
        doSetOneAddiId_NotInScope(oneAddiIdList);
    }

    protected void doSetOneAddiId_NotInScope(Collection<Integer> oneAddiIdList) {
        regINS(CK_NINS, cTL(oneAddiIdList), xgetCValueOneAddiId(), "ONE_ADDI_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     */
    public void setOneAddiId_IsNull() { regOneAddiId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     */
    public void setOneAddiId_IsNotNull() { regOneAddiId(CK_ISNN, DOBJ); }

    protected void regOneAddiId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOneAddiId(), "ONE_ADDI_ID"); }
    protected abstract ConditionValue xgetCValueOneAddiId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOneAddiName_Equal(String oneAddiName) {
        doSetOneAddiName_Equal(fRES(oneAddiName));
    }

    protected void doSetOneAddiName_Equal(String oneAddiName) {
        regOneAddiName(CK_EQ, oneAddiName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOneAddiName_NotEqual(String oneAddiName) {
        doSetOneAddiName_NotEqual(fRES(oneAddiName));
    }

    protected void doSetOneAddiName_NotEqual(String oneAddiName) {
        regOneAddiName(CK_NES, oneAddiName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiNameList The collection of oneAddiName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOneAddiName_InScope(Collection<String> oneAddiNameList) {
        doSetOneAddiName_InScope(oneAddiNameList);
    }

    protected void doSetOneAddiName_InScope(Collection<String> oneAddiNameList) {
        regINS(CK_INS, cTL(oneAddiNameList), xgetCValueOneAddiName(), "ONE_ADDI_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiNameList The collection of oneAddiName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOneAddiName_NotInScope(Collection<String> oneAddiNameList) {
        doSetOneAddiName_NotInScope(oneAddiNameList);
    }

    protected void doSetOneAddiName_NotInScope(Collection<String> oneAddiNameList) {
        regINS(CK_NINS, cTL(oneAddiNameList), xgetCValueOneAddiName(), "ONE_ADDI_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setOneAddiName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param oneAddiName The value of oneAddiName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOneAddiName_LikeSearch(String oneAddiName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOneAddiName_LikeSearch(oneAddiName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setOneAddiName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oneAddiName The value of oneAddiName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOneAddiName_LikeSearch(String oneAddiName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oneAddiName), xgetCValueOneAddiName(), "ONE_ADDI_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOneAddiName_NotLikeSearch(String oneAddiName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOneAddiName_NotLikeSearch(oneAddiName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOneAddiName_NotLikeSearch(String oneAddiName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oneAddiName), xgetCValueOneAddiName(), "ONE_ADDI_NAME", likeSearchOption);
    }

    protected void regOneAddiName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOneAddiName(), "ONE_ADDI_NAME"); }
    protected abstract ConditionValue xgetCValueOneAddiName();

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
    public HpSLCFunction<WhiteSuppressJoinSqOneAddiCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSuppressJoinSqOneAddiCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqOneAddiCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSuppressJoinSqOneAddiCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqOneAddiCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSuppressJoinSqOneAddiCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqOneAddiCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSuppressJoinSqOneAddiCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqOneAddiCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSuppressJoinSqOneAddiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSuppressJoinSqOneAddiCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSuppressJoinSqOneAddiCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneAddiCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqOneAddiCQ sq);

    protected WhiteSuppressJoinSqOneAddiCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqOneAddiCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqOneAddiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ONE_ADDI_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqOneAddiCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqOneAddiCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqOneAddiCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ONE_ADDI_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqOneAddiCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqOneAddiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqOneAddiCQ sq);

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
    protected WhiteSuppressJoinSqOneAddiCB newMyCB() {
        return new WhiteSuppressJoinSqOneAddiCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSuppressJoinSqOneAddiCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
