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
 * The abstract condition-query of white_self_reference.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSelfReferenceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSelfReferenceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_self_reference";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceId The value of selfReferenceId as equal. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_Equal(Long selfReferenceId) {
        doSetSelfReferenceId_Equal(selfReferenceId);
    }

    protected void doSetSelfReferenceId_Equal(Long selfReferenceId) {
        regSelfReferenceId(CK_EQ, selfReferenceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceId The value of selfReferenceId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_GreaterThan(Long selfReferenceId) {
        regSelfReferenceId(CK_GT, selfReferenceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceId The value of selfReferenceId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_LessThan(Long selfReferenceId) {
        regSelfReferenceId(CK_LT, selfReferenceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceId The value of selfReferenceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_GreaterEqual(Long selfReferenceId) {
        regSelfReferenceId(CK_GE, selfReferenceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceId The value of selfReferenceId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSelfReferenceId_LessEqual(Long selfReferenceId) {
        regSelfReferenceId(CK_LE, selfReferenceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of selfReferenceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of selfReferenceId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSelfReferenceId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSelfReferenceId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of selfReferenceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of selfReferenceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSelfReferenceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceIdList The collection of selfReferenceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceId_InScope(Collection<Long> selfReferenceIdList) {
        doSetSelfReferenceId_InScope(selfReferenceIdList);
    }

    protected void doSetSelfReferenceId_InScope(Collection<Long> selfReferenceIdList) {
        regINS(CK_INS, cTL(selfReferenceIdList), xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @param selfReferenceIdList The collection of selfReferenceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceId_NotInScope(Collection<Long> selfReferenceIdList) {
        doSetSelfReferenceId_NotInScope(selfReferenceIdList);
    }

    protected void doSetSelfReferenceId_NotInScope(Collection<Long> selfReferenceIdList) {
        regINS(CK_NINS, cTL(selfReferenceIdList), xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PARENT_ID from white_self_reference where ...)} <br>
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteSelfReferenceSelfList</span>(referenceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referenceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteSelfReferenceSelfList for 'exists'. (NotNull)
     */
    public void existsWhiteSelfReferenceSelfList(SubQuery<WhiteSelfReferenceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(cb.query());
        registerExistsReferrer(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceSelfList");
    }
    public abstract String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PARENT_ID from white_self_reference where ...)} <br>
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteSelfReferenceSelfList</span>(referenceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referenceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSelfReferenceSelfList(SubQuery<WhiteSelfReferenceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceSelfList");
    }
    public abstract String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);

    public void xsderiveWhiteSelfReferenceSelfList(String fn, SubQuery<WhiteSelfReferenceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceSelfList", al, op);
    }
    public abstract String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_self_reference where ...)} <br>
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteSelfReferenceSelfList()</span>.<span style="color: #CC4747">max</span>(referenceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referenceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     referenceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSelfReferenceCB> derivedWhiteSelfReferenceSelfList() {
        return xcreateQDRFunctionWhiteSelfReferenceSelfList();
    }
    protected HpQDRFunction<WhiteSelfReferenceCB> xcreateQDRFunctionWhiteSelfReferenceSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteSelfReferenceSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteSelfReferenceSelfList(String fn, SubQuery<WhiteSelfReferenceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(cb.query()); String prpp = keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", sqpp, "whiteSelfReferenceSelfList", rd, vl, prpp, op);
    }
    public abstract String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);
    public abstract String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSelfReferenceId_IsNull() { regSelfReferenceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSelfReferenceId_IsNotNull() { regSelfReferenceId(CK_ISNN, DOBJ); }

    protected void regSelfReferenceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID"); }
    protected abstract ConditionValue xgetCValueSelfReferenceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceName_Equal(String selfReferenceName) {
        doSetSelfReferenceName_Equal(fRES(selfReferenceName));
    }

    protected void doSetSelfReferenceName_Equal(String selfReferenceName) {
        regSelfReferenceName(CK_EQ, selfReferenceName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceName_NotEqual(String selfReferenceName) {
        doSetSelfReferenceName_NotEqual(fRES(selfReferenceName));
    }

    protected void doSetSelfReferenceName_NotEqual(String selfReferenceName) {
        regSelfReferenceName(CK_NES, selfReferenceName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceNameList The collection of selfReferenceName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceName_InScope(Collection<String> selfReferenceNameList) {
        doSetSelfReferenceName_InScope(selfReferenceNameList);
    }

    protected void doSetSelfReferenceName_InScope(Collection<String> selfReferenceNameList) {
        regINS(CK_INS, cTL(selfReferenceNameList), xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceNameList The collection of selfReferenceName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceName_NotInScope(Collection<String> selfReferenceNameList) {
        doSetSelfReferenceName_NotInScope(selfReferenceNameList);
    }

    protected void doSetSelfReferenceName_NotInScope(Collection<String> selfReferenceNameList) {
        regINS(CK_NINS, cTL(selfReferenceNameList), xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSelfReferenceName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param selfReferenceName The value of selfReferenceName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelfReferenceName_LikeSearch(String selfReferenceName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelfReferenceName_LikeSearch(selfReferenceName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSelfReferenceName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selfReferenceName The value of selfReferenceName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSelfReferenceName_LikeSearch(String selfReferenceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selfReferenceName), xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelfReferenceName_NotLikeSearch(String selfReferenceName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelfReferenceName_NotLikeSearch(selfReferenceName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSelfReferenceName_NotLikeSearch(String selfReferenceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selfReferenceName), xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSelfReferenceName_PrefixSearch(String selfReferenceName) {
        setSelfReferenceName_LikeSearch(selfReferenceName, xcLSOPPre());
    }

    protected void regSelfReferenceName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME"); }
    protected abstract ConditionValue xgetCValueSelfReferenceName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentId The value of parentId as equal. (NullAllowed: if null, no condition)
     */
    public void setParentId_Equal(Long parentId) {
        doSetParentId_Equal(parentId);
    }

    protected void doSetParentId_Equal(Long parentId) {
        regParentId(CK_EQ, parentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentId The value of parentId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setParentId_GreaterThan(Long parentId) {
        regParentId(CK_GT, parentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentId The value of parentId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setParentId_LessThan(Long parentId) {
        regParentId(CK_LT, parentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentId The value of parentId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setParentId_GreaterEqual(Long parentId) {
        regParentId(CK_GE, parentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentId The value of parentId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setParentId_LessEqual(Long parentId) {
        regParentId(CK_LE, parentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param minNumber The min number of parentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of parentId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param minNumber The min number of parentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of parentId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentId(), "PARENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentIdList The collection of parentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentId_InScope(Collection<Long> parentIdList) {
        doSetParentId_InScope(parentIdList);
    }

    protected void doSetParentId_InScope(Collection<Long> parentIdList) {
        regINS(CK_INS, cTL(parentIdList), xgetCValueParentId(), "PARENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @param parentIdList The collection of parentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentId_NotInScope(Collection<Long> parentIdList) {
        doSetParentId_NotInScope(parentIdList);
    }

    protected void doSetParentId_NotInScope(Collection<Long> parentIdList) {
        regINS(CK_NINS, cTL(parentIdList), xgetCValueParentId(), "PARENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     */
    public void setParentId_IsNull() { regParentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     */
    public void setParentId_IsNotNull() { regParentId(CK_ISNN, DOBJ); }

    protected void regParentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentId(), "PARENT_ID"); }
    protected abstract ConditionValue xgetCValueParentId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSelfReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSelfReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSelfReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSelfReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSelfReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSelfReferenceCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSelfReferenceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSelfReferenceCQ sq);

    protected WhiteSelfReferenceCB xcreateScalarConditionCB() {
        WhiteSelfReferenceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSelfReferenceCB xcreateScalarConditionPartitionByCB() {
        WhiteSelfReferenceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSelfReferenceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SELF_REFERENCE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSelfReferenceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSelfReferenceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSelfReferenceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SELF_REFERENCE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSelfReferenceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSelfReferenceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSelfReferenceCQ sq);

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
    protected WhiteSelfReferenceCB newMyCB() {
        return new WhiteSelfReferenceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSelfReferenceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
