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
 * The abstract condition-query of white_db_comment.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDbCommentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDbCommentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_db_comment";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentCode_Equal(String dbCommentCode) {
        doSetDbCommentCode_Equal(fRES(dbCommentCode));
    }

    protected void doSetDbCommentCode_Equal(String dbCommentCode) {
        regDbCommentCode(CK_EQ, dbCommentCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentCode_NotEqual(String dbCommentCode) {
        doSetDbCommentCode_NotEqual(fRES(dbCommentCode));
    }

    protected void doSetDbCommentCode_NotEqual(String dbCommentCode) {
        regDbCommentCode(CK_NES, dbCommentCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCodeList The collection of dbCommentCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentCode_InScope(Collection<String> dbCommentCodeList) {
        doSetDbCommentCode_InScope(dbCommentCodeList);
    }

    protected void doSetDbCommentCode_InScope(Collection<String> dbCommentCodeList) {
        regINS(CK_INS, cTL(dbCommentCodeList), xgetCValueDbCommentCode(), "DB_COMMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCodeList The collection of dbCommentCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentCode_NotInScope(Collection<String> dbCommentCodeList) {
        doSetDbCommentCode_NotInScope(dbCommentCodeList);
    }

    protected void doSetDbCommentCode_NotInScope(Collection<String> dbCommentCodeList) {
        regINS(CK_NINS, cTL(dbCommentCodeList), xgetCValueDbCommentCode(), "DB_COMMENT_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setDbCommentCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param dbCommentCode The value of dbCommentCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDbCommentCode_LikeSearch(String dbCommentCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDbCommentCode_LikeSearch(dbCommentCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setDbCommentCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dbCommentCode The value of dbCommentCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDbCommentCode_LikeSearch(String dbCommentCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dbCommentCode), xgetCValueDbCommentCode(), "DB_COMMENT_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDbCommentCode_NotLikeSearch(String dbCommentCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDbCommentCode_NotLikeSearch(dbCommentCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDbCommentCode_NotLikeSearch(String dbCommentCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dbCommentCode), xgetCValueDbCommentCode(), "DB_COMMENT_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setDbCommentCode_IsNull() { regDbCommentCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setDbCommentCode_IsNotNull() { regDbCommentCode(CK_ISNN, DOBJ); }

    protected void regDbCommentCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentCode(), "DB_COMMENT_CODE"); }
    protected abstract ConditionValue xgetCValueDbCommentCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentName_Equal(String dbCommentName) {
        doSetDbCommentName_Equal(fRES(dbCommentName));
    }

    protected void doSetDbCommentName_Equal(String dbCommentName) {
        regDbCommentName(CK_EQ, dbCommentName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentName_NotEqual(String dbCommentName) {
        doSetDbCommentName_NotEqual(fRES(dbCommentName));
    }

    protected void doSetDbCommentName_NotEqual(String dbCommentName) {
        regDbCommentName(CK_NES, dbCommentName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentNameList The collection of dbCommentName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentName_InScope(Collection<String> dbCommentNameList) {
        doSetDbCommentName_InScope(dbCommentNameList);
    }

    protected void doSetDbCommentName_InScope(Collection<String> dbCommentNameList) {
        regINS(CK_INS, cTL(dbCommentNameList), xgetCValueDbCommentName(), "DB_COMMENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentNameList The collection of dbCommentName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentName_NotInScope(Collection<String> dbCommentNameList) {
        doSetDbCommentName_NotInScope(dbCommentNameList);
    }

    protected void doSetDbCommentName_NotInScope(Collection<String> dbCommentNameList) {
        regINS(CK_NINS, cTL(dbCommentNameList), xgetCValueDbCommentName(), "DB_COMMENT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)} <br>
     * <pre>e.g. setDbCommentName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param dbCommentName The value of dbCommentName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDbCommentName_LikeSearch(String dbCommentName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDbCommentName_LikeSearch(dbCommentName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)} <br>
     * <pre>e.g. setDbCommentName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dbCommentName The value of dbCommentName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDbCommentName_LikeSearch(String dbCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dbCommentName), xgetCValueDbCommentName(), "DB_COMMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDbCommentName_NotLikeSearch(String dbCommentName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDbCommentName_NotLikeSearch(dbCommentName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDbCommentName_NotLikeSearch(String dbCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dbCommentName), xgetCValueDbCommentName(), "DB_COMMENT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setDbCommentName_IsNull() { regDbCommentName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setDbCommentName_IsNullOrEmpty() { regDbCommentName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setDbCommentName_IsNotNull() { regDbCommentName(CK_ISNN, DOBJ); }

    protected void regDbCommentName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentName(), "DB_COMMENT_NAME"); }
    protected abstract ConditionValue xgetCValueDbCommentName();

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
    public HpSLCFunction<WhiteDbCommentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDbCommentCB.class);
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
    public HpSLCFunction<WhiteDbCommentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDbCommentCB.class);
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
    public HpSLCFunction<WhiteDbCommentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDbCommentCB.class);
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
    public HpSLCFunction<WhiteDbCommentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDbCommentCB.class);
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
    public HpSLCFunction<WhiteDbCommentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDbCommentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDbCommentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDbCommentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDbCommentCQ sq);

    protected WhiteDbCommentCB xcreateScalarConditionCB() {
        WhiteDbCommentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDbCommentCB xcreateScalarConditionPartitionByCB() {
        WhiteDbCommentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDbCommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DB_COMMENT_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDbCommentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDbCommentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDbCommentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DB_COMMENT_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDbCommentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDbCommentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDbCommentCQ sq);

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
    protected WhiteDbCommentCB newMyCB() {
        return new WhiteDbCommentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDbCommentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
