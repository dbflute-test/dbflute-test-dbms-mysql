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
 * The abstract condition-query of white_compound_referred_normally.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundReferredNormallyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundReferredNormallyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_compound_referred_normally";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredId The value of referredId as equal. (NullAllowed: if null, no condition)
     */
    public void setReferredId_Equal(Integer referredId) {
        doSetReferredId_Equal(referredId);
    }

    protected void doSetReferredId_Equal(Integer referredId) {
        regReferredId(CK_EQ, referredId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredId The value of referredId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReferredId_GreaterThan(Integer referredId) {
        regReferredId(CK_GT, referredId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredId The value of referredId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReferredId_LessThan(Integer referredId) {
        regReferredId(CK_LT, referredId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredId The value of referredId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReferredId_GreaterEqual(Integer referredId) {
        regReferredId(CK_GE, referredId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredId The value of referredId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReferredId_LessEqual(Integer referredId) {
        regReferredId(CK_LE, referredId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of referredId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of referredId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReferredId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of referredId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of referredId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReferredId(), "REFERRED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredIdList The collection of referredId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredId_InScope(Collection<Integer> referredIdList) {
        doSetReferredId_InScope(referredIdList);
    }

    protected void doSetReferredId_InScope(Collection<Integer> referredIdList) {
        regINS(CK_INS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @param referredIdList The collection of referredId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredId_NotInScope(Collection<Integer> referredIdList) {
        doSetReferredId_NotInScope(referredIdList);
    }

    protected void doSetReferredId_NotInScope(Collection<Integer> referredIdList) {
        regINS(CK_NINS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select REFERRED_ID from white_compound_pk where ...)} <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteCompoundPkList</span>(pkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteCompoundPkList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkList(SubQuery<WhiteCompoundPkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReferredId_ExistsReferrer_WhiteCompoundPkList(cb.query());
        registerExistsReferrer(cb.query(), "REFERRED_ID", "REFERRED_ID", pp, "whiteCompoundPkList");
    }
    public abstract String keepReferredId_ExistsReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select REFERRED_ID from white_compound_pk where ...)} <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteCompoundPkList</span>(pkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pkCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReferredId_NotExistsReferrer_WhiteCompoundPkList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkList(SubQuery<WhiteCompoundPkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReferredId_NotExistsReferrer_WhiteCompoundPkList(cb.query());
        registerNotExistsReferrer(cb.query(), "REFERRED_ID", "REFERRED_ID", pp, "whiteCompoundPkList");
    }
    public abstract String keepReferredId_NotExistsReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq);

    public void xsderiveWhiteCompoundPkList(String fn, SubQuery<WhiteCompoundPkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReferredId_SpecifyDerivedReferrer_WhiteCompoundPkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REFERRED_ID", "REFERRED_ID", pp, "whiteCompoundPkList", al, op);
    }
    public abstract String keepReferredId_SpecifyDerivedReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_compound_pk where ...)} <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteCompoundPkList()</span>.<span style="color: #CC4747">max</span>(pkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pkCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pkCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkCB> derivedWhiteCompoundPkList() {
        return xcreateQDRFunctionWhiteCompoundPkList();
    }
    protected HpQDRFunction<WhiteCompoundPkCB> xcreateQDRFunctionWhiteCompoundPkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteCompoundPkList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteCompoundPkList(String fn, SubQuery<WhiteCompoundPkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReferredId_QueryDerivedReferrer_WhiteCompoundPkList(cb.query()); String prpp = keepReferredId_QueryDerivedReferrer_WhiteCompoundPkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REFERRED_ID", "REFERRED_ID", sqpp, "whiteCompoundPkList", rd, vl, prpp, op);
    }
    public abstract String keepReferredId_QueryDerivedReferrer_WhiteCompoundPkList(WhiteCompoundPkCQ sq);
    public abstract String keepReferredId_QueryDerivedReferrer_WhiteCompoundPkListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     */
    public void setReferredId_IsNull() { regReferredId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REFERRED_ID: {PK, NotNull, INT(10)}
     */
    public void setReferredId_IsNotNull() { regReferredId(CK_ISNN, DOBJ); }

    protected void regReferredId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferredId(), "REFERRED_ID"); }
    protected abstract ConditionValue xgetCValueReferredId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredName The value of referredName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredName_Equal(String referredName) {
        doSetReferredName_Equal(fRES(referredName));
    }

    protected void doSetReferredName_Equal(String referredName) {
        regReferredName(CK_EQ, referredName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredName The value of referredName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredName_NotEqual(String referredName) {
        doSetReferredName_NotEqual(fRES(referredName));
    }

    protected void doSetReferredName_NotEqual(String referredName) {
        regReferredName(CK_NES, referredName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredNameList The collection of referredName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredName_InScope(Collection<String> referredNameList) {
        doSetReferredName_InScope(referredNameList);
    }

    protected void doSetReferredName_InScope(Collection<String> referredNameList) {
        regINS(CK_INS, cTL(referredNameList), xgetCValueReferredName(), "REFERRED_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredNameList The collection of referredName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredName_NotInScope(Collection<String> referredNameList) {
        doSetReferredName_NotInScope(referredNameList);
    }

    protected void doSetReferredName_NotInScope(Collection<String> referredNameList) {
        regINS(CK_NINS, cTL(referredNameList), xgetCValueReferredName(), "REFERRED_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setReferredName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param referredName The value of referredName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReferredName_LikeSearch(String referredName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReferredName_LikeSearch(referredName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setReferredName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param referredName The value of referredName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReferredName_LikeSearch(String referredName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(referredName), xgetCValueReferredName(), "REFERRED_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredName The value of referredName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReferredName_NotLikeSearch(String referredName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReferredName_NotLikeSearch(referredName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredName The value of referredName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReferredName_NotLikeSearch(String referredName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(referredName), xgetCValueReferredName(), "REFERRED_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @param referredName The value of referredName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferredName_PrefixSearch(String referredName) {
        setReferredName_LikeSearch(referredName, xcLSOPPre());
    }

    protected void regReferredName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferredName(), "REFERRED_NAME"); }
    protected abstract ConditionValue xgetCValueReferredName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void query(WhiteCompoundReferredNormallyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundReferredNormallyCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteCompoundReferredNormallyCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void query(WhiteCompoundReferredNormallyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundReferredNormallyCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteCompoundReferredNormallyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void query(WhiteCompoundReferredNormallyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundReferredNormallyCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteCompoundReferredNormallyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void query(WhiteCompoundReferredNormallyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundReferredNormallyCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteCompoundReferredNormallyCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void query(WhiteCompoundReferredNormallyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundReferredNormallyCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteCompoundReferredNormallyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void query(WhiteCompoundReferredNormallyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundReferredNormallyCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteCompoundReferredNormallyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundReferredNormallyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundReferredNormallyCQ sq);

    protected WhiteCompoundReferredNormallyCB xcreateScalarConditionCB() {
        WhiteCompoundReferredNormallyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundReferredNormallyCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundReferredNormallyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteCompoundReferredNormallyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REFERRED_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteCompoundReferredNormallyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundReferredNormallyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteCompoundReferredNormallyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REFERRED_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteCompoundReferredNormallyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteCompoundReferredNormallyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteCompoundReferredNormallyCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
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
     * Match for full-text search. <br />
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
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
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

    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
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
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteCompoundReferredNormallyCB newMyCB() {
        return new WhiteCompoundReferredNormallyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundReferredNormallyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
