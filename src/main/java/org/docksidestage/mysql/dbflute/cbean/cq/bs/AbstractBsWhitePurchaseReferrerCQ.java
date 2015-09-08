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
 * The abstract condition-query of white_purchase_referrer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePurchaseReferrerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePurchaseReferrerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_purchase_referrer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseReferrerId_Equal(Long purchaseReferrerId) {
        doSetPurchaseReferrerId_Equal(purchaseReferrerId);
    }

    protected void doSetPurchaseReferrerId_Equal(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_EQ, purchaseReferrerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseReferrerId_GreaterThan(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_GT, purchaseReferrerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseReferrerId_LessThan(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_LT, purchaseReferrerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseReferrerId_GreaterEqual(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_GE, purchaseReferrerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerId The value of purchaseReferrerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseReferrerId_LessEqual(Long purchaseReferrerId) {
        regPurchaseReferrerId(CK_LE, purchaseReferrerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param minNumber The min number of purchaseReferrerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseReferrerId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseReferrerId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseReferrerId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param minNumber The min number of purchaseReferrerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseReferrerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseReferrerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerIdList The collection of purchaseReferrerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerId_InScope(Collection<Long> purchaseReferrerIdList) {
        doSetPurchaseReferrerId_InScope(purchaseReferrerIdList);
    }

    protected void doSetPurchaseReferrerId_InScope(Collection<Long> purchaseReferrerIdList) {
        regINS(CK_INS, cTL(purchaseReferrerIdList), xgetCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     * @param purchaseReferrerIdList The collection of purchaseReferrerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerId_NotInScope(Collection<Long> purchaseReferrerIdList) {
        doSetPurchaseReferrerId_NotInScope(purchaseReferrerIdList);
    }

    protected void doSetPurchaseReferrerId_NotInScope(Collection<Long> purchaseReferrerIdList) {
        regINS(CK_NINS, cTL(purchaseReferrerIdList), xgetCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     */
    public void setPurchaseReferrerId_IsNull() { regPurchaseReferrerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase}
     */
    public void setPurchaseReferrerId_IsNotNull() { regPurchaseReferrerId(CK_ISNN, DOBJ); }

    protected void regPurchaseReferrerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseReferrerId(), "PURCHASE_REFERRER_ID"); }
    protected abstract ConditionValue xgetCValuePurchaseReferrerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_Equal(String purchaseReferrerName) {
        doSetPurchaseReferrerName_Equal(fRES(purchaseReferrerName));
    }

    protected void doSetPurchaseReferrerName_Equal(String purchaseReferrerName) {
        regPurchaseReferrerName(CK_EQ, purchaseReferrerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_NotEqual(String purchaseReferrerName) {
        doSetPurchaseReferrerName_NotEqual(fRES(purchaseReferrerName));
    }

    protected void doSetPurchaseReferrerName_NotEqual(String purchaseReferrerName) {
        regPurchaseReferrerName(CK_NES, purchaseReferrerName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerNameList The collection of purchaseReferrerName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_InScope(Collection<String> purchaseReferrerNameList) {
        doSetPurchaseReferrerName_InScope(purchaseReferrerNameList);
    }

    protected void doSetPurchaseReferrerName_InScope(Collection<String> purchaseReferrerNameList) {
        regINS(CK_INS, cTL(purchaseReferrerNameList), xgetCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerNameList The collection of purchaseReferrerName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseReferrerName_NotInScope(Collection<String> purchaseReferrerNameList) {
        doSetPurchaseReferrerName_NotInScope(purchaseReferrerNameList);
    }

    protected void doSetPurchaseReferrerName_NotInScope(Collection<String> purchaseReferrerNameList) {
        regINS(CK_NINS, cTL(purchaseReferrerNameList), xgetCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPurchaseReferrerName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param purchaseReferrerName The value of purchaseReferrerName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseReferrerName_LikeSearch(String purchaseReferrerName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseReferrerName_LikeSearch(purchaseReferrerName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPurchaseReferrerName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseReferrerName The value of purchaseReferrerName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseReferrerName_LikeSearch(String purchaseReferrerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseReferrerName), xgetCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPurchaseReferrerName_NotLikeSearch(String purchaseReferrerName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPurchaseReferrerName_NotLikeSearch(purchaseReferrerName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)}
     * @param purchaseReferrerName The value of purchaseReferrerName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseReferrerName_NotLikeSearch(String purchaseReferrerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseReferrerName), xgetCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME", likeSearchOption);
    }

    protected void regPurchaseReferrerName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseReferrerName(), "PURCHASE_REFERRER_NAME"); }
    protected abstract ConditionValue xgetCValuePurchaseReferrerName();

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
    public HpSLCFunction<WhitePurchaseReferrerCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhitePurchaseReferrerCB.class);
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
    public HpSLCFunction<WhitePurchaseReferrerCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhitePurchaseReferrerCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePurchaseReferrerCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhitePurchaseReferrerCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePurchaseReferrerCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhitePurchaseReferrerCB.class);
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
    public HpSLCFunction<WhitePurchaseReferrerCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhitePurchaseReferrerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePurchaseReferrerCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhitePurchaseReferrerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePurchaseReferrerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhitePurchaseReferrerCQ sq);

    protected WhitePurchaseReferrerCB xcreateScalarConditionCB() {
        WhitePurchaseReferrerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePurchaseReferrerCB xcreateScalarConditionPartitionByCB() {
        WhitePurchaseReferrerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePurchaseReferrerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PURCHASE_REFERRER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePurchaseReferrerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePurchaseReferrerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePurchaseReferrerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PURCHASE_REFERRER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePurchaseReferrerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePurchaseReferrerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePurchaseReferrerCQ sq);

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
    protected WhitePurchaseReferrerCB newMyCB() {
        return new WhitePurchaseReferrerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePurchaseReferrerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
