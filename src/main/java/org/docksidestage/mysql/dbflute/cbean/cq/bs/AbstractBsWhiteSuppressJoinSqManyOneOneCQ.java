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
 * The abstract condition-query of white_suppress_join_sq_many_one_one.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqManyOneOneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqManyOneOneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_many_one_one";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneOneId_Equal(Integer manyOneOneId) {
        doSetManyOneOneId_Equal(manyOneOneId);
    }

    protected void doSetManyOneOneId_Equal(Integer manyOneOneId) {
        regManyOneOneId(CK_EQ, manyOneOneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneOneId_NotEqual(Integer manyOneOneId) {
        doSetManyOneOneId_NotEqual(manyOneOneId);
    }

    protected void doSetManyOneOneId_NotEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_NES, manyOneOneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneOneId_GreaterThan(Integer manyOneOneId) {
        regManyOneOneId(CK_GT, manyOneOneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneOneId_LessThan(Integer manyOneOneId) {
        regManyOneOneId(CK_LT, manyOneOneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneOneId_GreaterEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_GE, manyOneOneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneId The value of manyOneOneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyOneOneId_LessEqual(Integer manyOneOneId) {
        regManyOneOneId(CK_LE, manyOneOneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyOneOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyOneOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setManyOneOneId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setManyOneOneId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of manyOneOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyOneOneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setManyOneOneId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueManyOneOneId(), "MANY_ONE_ONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneIdList The collection of manyOneOneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneOneId_InScope(Collection<Integer> manyOneOneIdList) {
        doSetManyOneOneId_InScope(manyOneOneIdList);
    }

    protected void doSetManyOneOneId_InScope(Collection<Integer> manyOneOneIdList) {
        regINS(CK_INS, cTL(manyOneOneIdList), xgetCValueManyOneOneId(), "MANY_ONE_ONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @param manyOneOneIdList The collection of manyOneOneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneOneId_NotInScope(Collection<Integer> manyOneOneIdList) {
        doSetManyOneOneId_NotInScope(manyOneOneIdList);
    }

    protected void doSetManyOneOneId_NotInScope(Collection<Integer> manyOneOneIdList) {
        regINS(CK_NINS, cTL(manyOneOneIdList), xgetCValueManyOneOneId(), "MANY_ONE_ONE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setManyOneOneId_IsNull() { regManyOneOneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     */
    public void setManyOneOneId_IsNotNull() { regManyOneOneId(CK_ISNN, DOBJ); }

    protected void regManyOneOneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyOneOneId(), "MANY_ONE_ONE_ID"); }
    protected abstract ConditionValue xgetCValueManyOneOneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneOneName_Equal(String manyOneOneName) {
        doSetManyOneOneName_Equal(fRES(manyOneOneName));
    }

    protected void doSetManyOneOneName_Equal(String manyOneOneName) {
        regManyOneOneName(CK_EQ, manyOneOneName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneOneName_NotEqual(String manyOneOneName) {
        doSetManyOneOneName_NotEqual(fRES(manyOneOneName));
    }

    protected void doSetManyOneOneName_NotEqual(String manyOneOneName) {
        regManyOneOneName(CK_NES, manyOneOneName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneNameList The collection of manyOneOneName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneOneName_InScope(Collection<String> manyOneOneNameList) {
        doSetManyOneOneName_InScope(manyOneOneNameList);
    }

    protected void doSetManyOneOneName_InScope(Collection<String> manyOneOneNameList) {
        regINS(CK_INS, cTL(manyOneOneNameList), xgetCValueManyOneOneName(), "MANY_ONE_ONE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneNameList The collection of manyOneOneName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyOneOneName_NotInScope(Collection<String> manyOneOneNameList) {
        doSetManyOneOneName_NotInScope(manyOneOneNameList);
    }

    protected void doSetManyOneOneName_NotInScope(Collection<String> manyOneOneNameList) {
        regINS(CK_NINS, cTL(manyOneOneNameList), xgetCValueManyOneOneName(), "MANY_ONE_ONE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setManyOneOneName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param manyOneOneName The value of manyOneOneName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setManyOneOneName_LikeSearch(String manyOneOneName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setManyOneOneName_LikeSearch(manyOneOneName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setManyOneOneName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manyOneOneName The value of manyOneOneName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManyOneOneName_LikeSearch(String manyOneOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manyOneOneName), xgetCValueManyOneOneName(), "MANY_ONE_ONE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setManyOneOneName_NotLikeSearch(String manyOneOneName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setManyOneOneName_NotLikeSearch(manyOneOneName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @param manyOneOneName The value of manyOneOneName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManyOneOneName_NotLikeSearch(String manyOneOneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manyOneOneName), xgetCValueManyOneOneName(), "MANY_ONE_ONE_NAME", likeSearchOption);
    }

    protected void regManyOneOneName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyOneOneName(), "MANY_ONE_ONE_NAME"); }
    protected abstract ConditionValue xgetCValueManyOneOneName();

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
    public HpSLCFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSuppressJoinSqManyOneOneCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSuppressJoinSqManyOneOneCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSuppressJoinSqManyOneOneCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSuppressJoinSqManyOneOneCB.class);
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
    public HpSLCFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSuppressJoinSqManyOneOneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSuppressJoinSqManyOneOneCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSuppressJoinSqManyOneOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneOneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqManyOneOneCQ sq);

    protected WhiteSuppressJoinSqManyOneOneCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqManyOneOneCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqManyOneOneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MANY_ONE_ONE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqManyOneOneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqManyOneOneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqManyOneOneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MANY_ONE_ONE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqManyOneOneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqManyOneOneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqManyOneOneCQ sq);

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
    protected WhiteSuppressJoinSqManyOneOneCB newMyCB() {
        return new WhiteSuppressJoinSqManyOneOneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSuppressJoinSqManyOneOneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
