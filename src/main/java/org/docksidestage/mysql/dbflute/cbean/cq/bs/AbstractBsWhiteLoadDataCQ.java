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
 * The abstract condition-query of white_load_data.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteLoadDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteLoadDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_load_data";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadDataId_Equal(Long loadDataId) {
        doSetLoadDataId_Equal(loadDataId);
    }

    protected void doSetLoadDataId_Equal(Long loadDataId) {
        regLoadDataId(CK_EQ, loadDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadDataId_NotEqual(Long loadDataId) {
        doSetLoadDataId_NotEqual(loadDataId);
    }

    protected void doSetLoadDataId_NotEqual(Long loadDataId) {
        regLoadDataId(CK_NES, loadDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadDataId_GreaterThan(Long loadDataId) {
        regLoadDataId(CK_GT, loadDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadDataId_LessThan(Long loadDataId) {
        regLoadDataId(CK_LT, loadDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadDataId_GreaterEqual(Long loadDataId) {
        regLoadDataId(CK_GE, loadDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataId The value of loadDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadDataId_LessEqual(Long loadDataId) {
        regLoadDataId(CK_LE, loadDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of loadDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLoadDataId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLoadDataId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of loadDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLoadDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLoadDataId(), "LOAD_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataIdList The collection of loadDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadDataId_InScope(Collection<Long> loadDataIdList) {
        doSetLoadDataId_InScope(loadDataIdList);
    }

    protected void doSetLoadDataId_InScope(Collection<Long> loadDataIdList) {
        regINS(CK_INS, cTL(loadDataIdList), xgetCValueLoadDataId(), "LOAD_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param loadDataIdList The collection of loadDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadDataId_NotInScope(Collection<Long> loadDataIdList) {
        doSetLoadDataId_NotInScope(loadDataIdList);
    }

    protected void doSetLoadDataId_NotInScope(Collection<Long> loadDataIdList) {
        regINS(CK_NINS, cTL(loadDataIdList), xgetCValueLoadDataId(), "LOAD_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLoadDataId_IsNull() { regLoadDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOAD_DATA_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLoadDataId_IsNotNull() { regLoadDataId(CK_ISNN, DOBJ); }

    protected void regLoadDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadDataId(), "LOAD_DATA_ID"); }
    protected abstract ConditionValue xgetCValueLoadDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadDataName_Equal(String loadDataName) {
        doSetLoadDataName_Equal(fRES(loadDataName));
    }

    protected void doSetLoadDataName_Equal(String loadDataName) {
        regLoadDataName(CK_EQ, loadDataName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadDataName_NotEqual(String loadDataName) {
        doSetLoadDataName_NotEqual(fRES(loadDataName));
    }

    protected void doSetLoadDataName_NotEqual(String loadDataName) {
        regLoadDataName(CK_NES, loadDataName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataNameList The collection of loadDataName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadDataName_InScope(Collection<String> loadDataNameList) {
        doSetLoadDataName_InScope(loadDataNameList);
    }

    protected void doSetLoadDataName_InScope(Collection<String> loadDataNameList) {
        regINS(CK_INS, cTL(loadDataNameList), xgetCValueLoadDataName(), "LOAD_DATA_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataNameList The collection of loadDataName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadDataName_NotInScope(Collection<String> loadDataNameList) {
        doSetLoadDataName_NotInScope(loadDataNameList);
    }

    protected void doSetLoadDataName_NotInScope(Collection<String> loadDataNameList) {
        regINS(CK_NINS, cTL(loadDataNameList), xgetCValueLoadDataName(), "LOAD_DATA_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setLoadDataName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param loadDataName The value of loadDataName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLoadDataName_LikeSearch(String loadDataName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLoadDataName_LikeSearch(loadDataName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setLoadDataName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loadDataName The value of loadDataName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoadDataName_LikeSearch(String loadDataName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loadDataName), xgetCValueLoadDataName(), "LOAD_DATA_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLoadDataName_NotLikeSearch(String loadDataName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLoadDataName_NotLikeSearch(loadDataName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOAD_DATA_NAME: {NotNull, VARCHAR(200)}
     * @param loadDataName The value of loadDataName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoadDataName_NotLikeSearch(String loadDataName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loadDataName), xgetCValueLoadDataName(), "LOAD_DATA_NAME", likeSearchOption);
    }

    protected void regLoadDataName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadDataName(), "LOAD_DATA_NAME"); }
    protected abstract ConditionValue xgetCValueLoadDataName();

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
    public HpSLCFunction<WhiteLoadDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteLoadDataCB.class);
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
    public HpSLCFunction<WhiteLoadDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteLoadDataCB.class);
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
    public HpSLCFunction<WhiteLoadDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteLoadDataCB.class);
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
    public HpSLCFunction<WhiteLoadDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteLoadDataCB.class);
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
    public HpSLCFunction<WhiteLoadDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteLoadDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void query(WhiteLoadDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteLoadDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteLoadDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteLoadDataCQ sq);

    protected WhiteLoadDataCB xcreateScalarConditionCB() {
        WhiteLoadDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteLoadDataCB xcreateScalarConditionPartitionByCB() {
        WhiteLoadDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteLoadDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOAD_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteLoadDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteLoadDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteLoadDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOAD_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteLoadDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteLoadDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteLoadDataCB cb = new WhiteLoadDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteLoadDataCQ sq);

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
    protected WhiteLoadDataCB newMyCB() {
        return new WhiteLoadDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteLoadDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
