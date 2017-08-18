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
 * The abstract condition-query of white_pg_reserv.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhitePgReservCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhitePgReservCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_pg_reserv";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassSynonym_Equal(Integer classSynonym) {
        doSetClassSynonym_Equal(classSynonym);
    }

    protected void doSetClassSynonym_Equal(Integer classSynonym) {
        regClassSynonym(CK_EQ, classSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassSynonym_GreaterThan(Integer classSynonym) {
        regClassSynonym(CK_GT, classSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassSynonym_LessThan(Integer classSynonym) {
        regClassSynonym(CK_LT, classSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassSynonym_GreaterEqual(Integer classSynonym) {
        regClassSynonym(CK_GE, classSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonym The value of classSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassSynonym_LessEqual(Integer classSynonym) {
        regClassSynonym(CK_LE, classSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param minNumber The min number of classSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setClassSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setClassSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param minNumber The min number of classSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClassSynonym(), "CLASS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonymList The collection of classSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassSynonym_InScope(Collection<Integer> classSynonymList) {
        doSetClassSynonym_InScope(classSynonymList);
    }

    protected void doSetClassSynonym_InScope(Collection<Integer> classSynonymList) {
        regINS(CK_INS, cTL(classSynonymList), xgetCValueClassSynonym(), "CLASS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @param classSynonymList The collection of classSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassSynonym_NotInScope(Collection<Integer> classSynonymList) {
        doSetClassSynonym_NotInScope(classSynonymList);
    }

    protected void doSetClassSynonym_NotInScope(Collection<Integer> classSynonymList) {
        regINS(CK_NINS, cTL(classSynonymList), xgetCValueClassSynonym(), "CLASS");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLASS from white_pg_reserv_ref where ...)} <br>
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhitePgReservRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhitePgReservRefList for 'exists'. (NotNull)
     */
    public void existsWhitePgReservRef(SubQuery<WhitePgReservRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassSynonym_ExistsReferrer_WhitePgReservRefList(cb.query());
        registerExistsReferrer(cb.query(), "CLASS", "CLASS", pp, "whitePgReservRefList");
    }
    public abstract String keepClassSynonym_ExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLASS from white_pg_reserv_ref where ...)} <br>
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhitePgReservRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClassSynonym_NotExistsReferrer_WhitePgReservRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhitePgReservRef(SubQuery<WhitePgReservRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLASS", "CLASS", pp, "whitePgReservRefList");
    }
    public abstract String keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq);

    public void xsderiveWhitePgReservRefList(String fn, SubQuery<WhitePgReservRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLASS", "CLASS", pp, "whitePgReservRefList", al, op);
    }
    public abstract String keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_pg_reserv_ref where ...)} <br>
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhitePgReservRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhitePgReservRefCB> derivedWhitePgReservRef() {
        return xcreateQDRFunctionWhitePgReservRefList();
    }
    protected HpQDRFunction<WhitePgReservRefCB> xcreateQDRFunctionWhitePgReservRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhitePgReservRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhitePgReservRefList(String fn, SubQuery<WhitePgReservRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservRefCB cb = new WhitePgReservRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(cb.query()); String prpp = keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLASS", "CLASS", sqpp, "whitePgReservRefList", rd, vl, prpp, op);
    }
    public abstract String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq);
    public abstract String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     */
    public void setClassSynonym_IsNull() { regClassSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     */
    public void setClassSynonym_IsNotNull() { regClassSynonym(CK_ISNN, DOBJ); }

    protected void regClassSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassSynonym(), "CLASS"); }
    protected abstract ConditionValue xgetCValueClassSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseSynonym_Equal(Integer caseSynonym) {
        doSetCaseSynonym_Equal(caseSynonym);
    }

    protected void doSetCaseSynonym_Equal(Integer caseSynonym) {
        regCaseSynonym(CK_EQ, caseSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseSynonym_GreaterThan(Integer caseSynonym) {
        regCaseSynonym(CK_GT, caseSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseSynonym_LessThan(Integer caseSynonym) {
        regCaseSynonym(CK_LT, caseSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseSynonym_GreaterEqual(Integer caseSynonym) {
        regCaseSynonym(CK_GE, caseSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonym The value of caseSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseSynonym_LessEqual(Integer caseSynonym) {
        regCaseSynonym(CK_LE, caseSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param minNumber The min number of caseSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCaseSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCaseSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param minNumber The min number of caseSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseSynonym(), "CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonymList The collection of caseSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseSynonym_InScope(Collection<Integer> caseSynonymList) {
        doSetCaseSynonym_InScope(caseSynonymList);
    }

    protected void doSetCaseSynonym_InScope(Collection<Integer> caseSynonymList) {
        regINS(CK_INS, cTL(caseSynonymList), xgetCValueCaseSynonym(), "CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @param caseSynonymList The collection of caseSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseSynonym_NotInScope(Collection<Integer> caseSynonymList) {
        doSetCaseSynonym_NotInScope(caseSynonymList);
    }

    protected void doSetCaseSynonym_NotInScope(Collection<Integer> caseSynonymList) {
        regINS(CK_NINS, cTL(caseSynonymList), xgetCValueCaseSynonym(), "CASE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     */
    public void setCaseSynonym_IsNull() { regCaseSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))CASE: {INT(10)}
     */
    public void setCaseSynonym_IsNotNull() { regCaseSynonym(CK_ISNN, DOBJ); }

    protected void regCaseSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseSynonym(), "CASE"); }
    protected abstract ConditionValue xgetCValueCaseSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackageSynonym_Equal(Integer packageSynonym) {
        doSetPackageSynonym_Equal(packageSynonym);
    }

    protected void doSetPackageSynonym_Equal(Integer packageSynonym) {
        regPackageSynonym(CK_EQ, packageSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackageSynonym_GreaterThan(Integer packageSynonym) {
        regPackageSynonym(CK_GT, packageSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackageSynonym_LessThan(Integer packageSynonym) {
        regPackageSynonym(CK_LT, packageSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackageSynonym_GreaterEqual(Integer packageSynonym) {
        regPackageSynonym(CK_GE, packageSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonym The value of packageSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackageSynonym_LessEqual(Integer packageSynonym) {
        regPackageSynonym(CK_LE, packageSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param minNumber The min number of packageSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packageSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPackageSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPackageSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param minNumber The min number of packageSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packageSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackageSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackageSynonym(), "PACKAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonymList The collection of packageSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackageSynonym_InScope(Collection<Integer> packageSynonymList) {
        doSetPackageSynonym_InScope(packageSynonymList);
    }

    protected void doSetPackageSynonym_InScope(Collection<Integer> packageSynonymList) {
        regINS(CK_INS, cTL(packageSynonymList), xgetCValuePackageSynonym(), "PACKAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @param packageSynonymList The collection of packageSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackageSynonym_NotInScope(Collection<Integer> packageSynonymList) {
        doSetPackageSynonym_NotInScope(packageSynonymList);
    }

    protected void doSetPackageSynonym_NotInScope(Collection<Integer> packageSynonymList) {
        regINS(CK_NINS, cTL(packageSynonymList), xgetCValuePackageSynonym(), "PACKAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     */
    public void setPackageSynonym_IsNull() { regPackageSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     */
    public void setPackageSynonym_IsNotNull() { regPackageSynonym(CK_ISNN, DOBJ); }

    protected void regPackageSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackageSynonym(), "PACKAGE"); }
    protected abstract ConditionValue xgetCValuePackageSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultSynonym_Equal(Integer defaultSynonym) {
        doSetDefaultSynonym_Equal(defaultSynonym);
    }

    protected void doSetDefaultSynonym_Equal(Integer defaultSynonym) {
        regDefaultSynonym(CK_EQ, defaultSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultSynonym_GreaterThan(Integer defaultSynonym) {
        regDefaultSynonym(CK_GT, defaultSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultSynonym_LessThan(Integer defaultSynonym) {
        regDefaultSynonym(CK_LT, defaultSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultSynonym_GreaterEqual(Integer defaultSynonym) {
        regDefaultSynonym(CK_GE, defaultSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonym The value of defaultSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultSynonym_LessEqual(Integer defaultSynonym) {
        regDefaultSynonym(CK_LE, defaultSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param minNumber The min number of defaultSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDefaultSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDefaultSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param minNumber The min number of defaultSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefaultSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefaultSynonym(), "DEFAULT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonymList The collection of defaultSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultSynonym_InScope(Collection<Integer> defaultSynonymList) {
        doSetDefaultSynonym_InScope(defaultSynonymList);
    }

    protected void doSetDefaultSynonym_InScope(Collection<Integer> defaultSynonymList) {
        regINS(CK_INS, cTL(defaultSynonymList), xgetCValueDefaultSynonym(), "DEFAULT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @param defaultSynonymList The collection of defaultSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultSynonym_NotInScope(Collection<Integer> defaultSynonymList) {
        doSetDefaultSynonym_NotInScope(defaultSynonymList);
    }

    protected void doSetDefaultSynonym_NotInScope(Collection<Integer> defaultSynonymList) {
        regINS(CK_NINS, cTL(defaultSynonymList), xgetCValueDefaultSynonym(), "DEFAULT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     */
    public void setDefaultSynonym_IsNull() { regDefaultSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     */
    public void setDefaultSynonym_IsNotNull() { regDefaultSynonym(CK_ISNN, DOBJ); }

    protected void regDefaultSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultSynonym(), "DEFAULT"); }
    protected abstract ConditionValue xgetCValueDefaultSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNewSynonym_Equal(Integer newSynonym) {
        doSetNewSynonym_Equal(newSynonym);
    }

    protected void doSetNewSynonym_Equal(Integer newSynonym) {
        regNewSynonym(CK_EQ, newSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNewSynonym_GreaterThan(Integer newSynonym) {
        regNewSynonym(CK_GT, newSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNewSynonym_LessThan(Integer newSynonym) {
        regNewSynonym(CK_LT, newSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNewSynonym_GreaterEqual(Integer newSynonym) {
        regNewSynonym(CK_GE, newSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonym The value of newSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNewSynonym_LessEqual(Integer newSynonym) {
        regNewSynonym(CK_LE, newSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param minNumber The min number of newSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of newSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNewSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNewSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param minNumber The min number of newSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of newSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNewSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNewSynonym(), "NEW", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonymList The collection of newSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewSynonym_InScope(Collection<Integer> newSynonymList) {
        doSetNewSynonym_InScope(newSynonymList);
    }

    protected void doSetNewSynonym_InScope(Collection<Integer> newSynonymList) {
        regINS(CK_INS, cTL(newSynonymList), xgetCValueNewSynonym(), "NEW");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @param newSynonymList The collection of newSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNewSynonym_NotInScope(Collection<Integer> newSynonymList) {
        doSetNewSynonym_NotInScope(newSynonymList);
    }

    protected void doSetNewSynonym_NotInScope(Collection<Integer> newSynonymList) {
        regINS(CK_NINS, cTL(newSynonymList), xgetCValueNewSynonym(), "NEW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     */
    public void setNewSynonym_IsNull() { regNewSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NEW: {INT(10)}
     */
    public void setNewSynonym_IsNotNull() { regNewSynonym(CK_ISNN, DOBJ); }

    protected void regNewSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNewSynonym(), "NEW"); }
    protected abstract ConditionValue xgetCValueNewSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNativeSynonym_Equal(Integer nativeSynonym) {
        doSetNativeSynonym_Equal(nativeSynonym);
    }

    protected void doSetNativeSynonym_Equal(Integer nativeSynonym) {
        regNativeSynonym(CK_EQ, nativeSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNativeSynonym_GreaterThan(Integer nativeSynonym) {
        regNativeSynonym(CK_GT, nativeSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNativeSynonym_LessThan(Integer nativeSynonym) {
        regNativeSynonym(CK_LT, nativeSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNativeSynonym_GreaterEqual(Integer nativeSynonym) {
        regNativeSynonym(CK_GE, nativeSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonym The value of nativeSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNativeSynonym_LessEqual(Integer nativeSynonym) {
        regNativeSynonym(CK_LE, nativeSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param minNumber The min number of nativeSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nativeSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNativeSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNativeSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param minNumber The min number of nativeSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nativeSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNativeSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNativeSynonym(), "NATIVE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonymList The collection of nativeSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNativeSynonym_InScope(Collection<Integer> nativeSynonymList) {
        doSetNativeSynonym_InScope(nativeSynonymList);
    }

    protected void doSetNativeSynonym_InScope(Collection<Integer> nativeSynonymList) {
        regINS(CK_INS, cTL(nativeSynonymList), xgetCValueNativeSynonym(), "NATIVE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @param nativeSynonymList The collection of nativeSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNativeSynonym_NotInScope(Collection<Integer> nativeSynonymList) {
        doSetNativeSynonym_NotInScope(nativeSynonymList);
    }

    protected void doSetNativeSynonym_NotInScope(Collection<Integer> nativeSynonymList) {
        regINS(CK_NINS, cTL(nativeSynonymList), xgetCValueNativeSynonym(), "NATIVE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     */
    public void setNativeSynonym_IsNull() { regNativeSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     */
    public void setNativeSynonym_IsNotNull() { regNativeSynonym(CK_ISNN, DOBJ); }

    protected void regNativeSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNativeSynonym(), "NATIVE"); }
    protected abstract ConditionValue xgetCValueNativeSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVoidSynonym_Equal(Integer voidSynonym) {
        doSetVoidSynonym_Equal(voidSynonym);
    }

    protected void doSetVoidSynonym_Equal(Integer voidSynonym) {
        regVoidSynonym(CK_EQ, voidSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVoidSynonym_GreaterThan(Integer voidSynonym) {
        regVoidSynonym(CK_GT, voidSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVoidSynonym_LessThan(Integer voidSynonym) {
        regVoidSynonym(CK_LT, voidSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVoidSynonym_GreaterEqual(Integer voidSynonym) {
        regVoidSynonym(CK_GE, voidSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonym The value of voidSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVoidSynonym_LessEqual(Integer voidSynonym) {
        regVoidSynonym(CK_LE, voidSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param minNumber The min number of voidSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of voidSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVoidSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVoidSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param minNumber The min number of voidSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of voidSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVoidSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVoidSynonym(), "VOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonymList The collection of voidSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVoidSynonym_InScope(Collection<Integer> voidSynonymList) {
        doSetVoidSynonym_InScope(voidSynonymList);
    }

    protected void doSetVoidSynonym_InScope(Collection<Integer> voidSynonymList) {
        regINS(CK_INS, cTL(voidSynonymList), xgetCValueVoidSynonym(), "VOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @param voidSynonymList The collection of voidSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVoidSynonym_NotInScope(Collection<Integer> voidSynonymList) {
        doSetVoidSynonym_NotInScope(voidSynonymList);
    }

    protected void doSetVoidSynonym_NotInScope(Collection<Integer> voidSynonymList) {
        regINS(CK_NINS, cTL(voidSynonymList), xgetCValueVoidSynonym(), "VOID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     */
    public void setVoidSynonym_IsNull() { regVoidSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))VOID: {INT(10)}
     */
    public void setVoidSynonym_IsNotNull() { regVoidSynonym(CK_ISNN, DOBJ); }

    protected void regVoidSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVoidSynonym(), "VOID"); }
    protected abstract ConditionValue xgetCValueVoidSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublicSynonym_Equal(Integer publicSynonym) {
        doSetPublicSynonym_Equal(publicSynonym);
    }

    protected void doSetPublicSynonym_Equal(Integer publicSynonym) {
        regPublicSynonym(CK_EQ, publicSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublicSynonym_GreaterThan(Integer publicSynonym) {
        regPublicSynonym(CK_GT, publicSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublicSynonym_LessThan(Integer publicSynonym) {
        regPublicSynonym(CK_LT, publicSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublicSynonym_GreaterEqual(Integer publicSynonym) {
        regPublicSynonym(CK_GE, publicSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonym The value of publicSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPublicSynonym_LessEqual(Integer publicSynonym) {
        regPublicSynonym(CK_LE, publicSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param minNumber The min number of publicSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of publicSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPublicSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPublicSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param minNumber The min number of publicSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of publicSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPublicSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePublicSynonym(), "PUBLIC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonymList The collection of publicSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicSynonym_InScope(Collection<Integer> publicSynonymList) {
        doSetPublicSynonym_InScope(publicSynonymList);
    }

    protected void doSetPublicSynonym_InScope(Collection<Integer> publicSynonymList) {
        regINS(CK_INS, cTL(publicSynonymList), xgetCValuePublicSynonym(), "PUBLIC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @param publicSynonymList The collection of publicSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublicSynonym_NotInScope(Collection<Integer> publicSynonymList) {
        doSetPublicSynonym_NotInScope(publicSynonymList);
    }

    protected void doSetPublicSynonym_NotInScope(Collection<Integer> publicSynonymList) {
        regINS(CK_NINS, cTL(publicSynonymList), xgetCValuePublicSynonym(), "PUBLIC");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     */
    public void setPublicSynonym_IsNull() { regPublicSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     */
    public void setPublicSynonym_IsNotNull() { regPublicSynonym(CK_ISNN, DOBJ); }

    protected void regPublicSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePublicSynonym(), "PUBLIC"); }
    protected abstract ConditionValue xgetCValuePublicSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProtectedSynonym_Equal(Integer protectedSynonym) {
        doSetProtectedSynonym_Equal(protectedSynonym);
    }

    protected void doSetProtectedSynonym_Equal(Integer protectedSynonym) {
        regProtectedSynonym(CK_EQ, protectedSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProtectedSynonym_GreaterThan(Integer protectedSynonym) {
        regProtectedSynonym(CK_GT, protectedSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProtectedSynonym_LessThan(Integer protectedSynonym) {
        regProtectedSynonym(CK_LT, protectedSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProtectedSynonym_GreaterEqual(Integer protectedSynonym) {
        regProtectedSynonym(CK_GE, protectedSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonym The value of protectedSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProtectedSynonym_LessEqual(Integer protectedSynonym) {
        regProtectedSynonym(CK_LE, protectedSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param minNumber The min number of protectedSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of protectedSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setProtectedSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setProtectedSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param minNumber The min number of protectedSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of protectedSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProtectedSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProtectedSynonym(), "PROTECTED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonymList The collection of protectedSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProtectedSynonym_InScope(Collection<Integer> protectedSynonymList) {
        doSetProtectedSynonym_InScope(protectedSynonymList);
    }

    protected void doSetProtectedSynonym_InScope(Collection<Integer> protectedSynonymList) {
        regINS(CK_INS, cTL(protectedSynonymList), xgetCValueProtectedSynonym(), "PROTECTED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @param protectedSynonymList The collection of protectedSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProtectedSynonym_NotInScope(Collection<Integer> protectedSynonymList) {
        doSetProtectedSynonym_NotInScope(protectedSynonymList);
    }

    protected void doSetProtectedSynonym_NotInScope(Collection<Integer> protectedSynonymList) {
        regINS(CK_NINS, cTL(protectedSynonymList), xgetCValueProtectedSynonym(), "PROTECTED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     */
    public void setProtectedSynonym_IsNull() { regProtectedSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     */
    public void setProtectedSynonym_IsNotNull() { regProtectedSynonym(CK_ISNN, DOBJ); }

    protected void regProtectedSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProtectedSynonym(), "PROTECTED"); }
    protected abstract ConditionValue xgetCValueProtectedSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrivateSynonym_Equal(Integer privateSynonym) {
        doSetPrivateSynonym_Equal(privateSynonym);
    }

    protected void doSetPrivateSynonym_Equal(Integer privateSynonym) {
        regPrivateSynonym(CK_EQ, privateSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrivateSynonym_GreaterThan(Integer privateSynonym) {
        regPrivateSynonym(CK_GT, privateSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrivateSynonym_LessThan(Integer privateSynonym) {
        regPrivateSynonym(CK_LT, privateSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrivateSynonym_GreaterEqual(Integer privateSynonym) {
        regPrivateSynonym(CK_GE, privateSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonym The value of privateSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrivateSynonym_LessEqual(Integer privateSynonym) {
        regPrivateSynonym(CK_LE, privateSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param minNumber The min number of privateSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of privateSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrivateSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrivateSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param minNumber The min number of privateSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of privateSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrivateSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrivateSynonym(), "PRIVATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonymList The collection of privateSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrivateSynonym_InScope(Collection<Integer> privateSynonymList) {
        doSetPrivateSynonym_InScope(privateSynonymList);
    }

    protected void doSetPrivateSynonym_InScope(Collection<Integer> privateSynonymList) {
        regINS(CK_INS, cTL(privateSynonymList), xgetCValuePrivateSynonym(), "PRIVATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @param privateSynonymList The collection of privateSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrivateSynonym_NotInScope(Collection<Integer> privateSynonymList) {
        doSetPrivateSynonym_NotInScope(privateSynonymList);
    }

    protected void doSetPrivateSynonym_NotInScope(Collection<Integer> privateSynonymList) {
        regINS(CK_NINS, cTL(privateSynonymList), xgetCValuePrivateSynonym(), "PRIVATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     */
    public void setPrivateSynonym_IsNull() { regPrivateSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     */
    public void setPrivateSynonym_IsNotNull() { regPrivateSynonym(CK_ISNN, DOBJ); }

    protected void regPrivateSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrivateSynonym(), "PRIVATE"); }
    protected abstract ConditionValue xgetCValuePrivateSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_Equal(Integer interfaceSynonym) {
        doSetInterfaceSynonym_Equal(interfaceSynonym);
    }

    protected void doSetInterfaceSynonym_Equal(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_EQ, interfaceSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_GreaterThan(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_GT, interfaceSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_LessThan(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_LT, interfaceSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_GreaterEqual(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_GE, interfaceSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonym The value of interfaceSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_LessEqual(Integer interfaceSynonym) {
        regInterfaceSynonym(CK_LE, interfaceSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param minNumber The min number of interfaceSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of interfaceSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setInterfaceSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setInterfaceSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param minNumber The min number of interfaceSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of interfaceSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInterfaceSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInterfaceSynonym(), "INTERFACE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonymList The collection of interfaceSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_InScope(Collection<Integer> interfaceSynonymList) {
        doSetInterfaceSynonym_InScope(interfaceSynonymList);
    }

    protected void doSetInterfaceSynonym_InScope(Collection<Integer> interfaceSynonymList) {
        regINS(CK_INS, cTL(interfaceSynonymList), xgetCValueInterfaceSynonym(), "INTERFACE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @param interfaceSynonymList The collection of interfaceSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInterfaceSynonym_NotInScope(Collection<Integer> interfaceSynonymList) {
        doSetInterfaceSynonym_NotInScope(interfaceSynonymList);
    }

    protected void doSetInterfaceSynonym_NotInScope(Collection<Integer> interfaceSynonymList) {
        regINS(CK_NINS, cTL(interfaceSynonymList), xgetCValueInterfaceSynonym(), "INTERFACE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     */
    public void setInterfaceSynonym_IsNull() { regInterfaceSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     */
    public void setInterfaceSynonym_IsNotNull() { regInterfaceSynonym(CK_ISNN, DOBJ); }

    protected void regInterfaceSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInterfaceSynonym(), "INTERFACE"); }
    protected abstract ConditionValue xgetCValueInterfaceSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstractSynonym_Equal(Integer abstractSynonym) {
        doSetAbstractSynonym_Equal(abstractSynonym);
    }

    protected void doSetAbstractSynonym_Equal(Integer abstractSynonym) {
        regAbstractSynonym(CK_EQ, abstractSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstractSynonym_GreaterThan(Integer abstractSynonym) {
        regAbstractSynonym(CK_GT, abstractSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstractSynonym_LessThan(Integer abstractSynonym) {
        regAbstractSynonym(CK_LT, abstractSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstractSynonym_GreaterEqual(Integer abstractSynonym) {
        regAbstractSynonym(CK_GE, abstractSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonym The value of abstractSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAbstractSynonym_LessEqual(Integer abstractSynonym) {
        regAbstractSynonym(CK_LE, abstractSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param minNumber The min number of abstractSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of abstractSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAbstractSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAbstractSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param minNumber The min number of abstractSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of abstractSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAbstractSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAbstractSynonym(), "ABSTRACT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonymList The collection of abstractSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbstractSynonym_InScope(Collection<Integer> abstractSynonymList) {
        doSetAbstractSynonym_InScope(abstractSynonymList);
    }

    protected void doSetAbstractSynonym_InScope(Collection<Integer> abstractSynonymList) {
        regINS(CK_INS, cTL(abstractSynonymList), xgetCValueAbstractSynonym(), "ABSTRACT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @param abstractSynonymList The collection of abstractSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbstractSynonym_NotInScope(Collection<Integer> abstractSynonymList) {
        doSetAbstractSynonym_NotInScope(abstractSynonymList);
    }

    protected void doSetAbstractSynonym_NotInScope(Collection<Integer> abstractSynonymList) {
        regINS(CK_NINS, cTL(abstractSynonymList), xgetCValueAbstractSynonym(), "ABSTRACT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     */
    public void setAbstractSynonym_IsNull() { regAbstractSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     */
    public void setAbstractSynonym_IsNotNull() { regAbstractSynonym(CK_ISNN, DOBJ); }

    protected void regAbstractSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbstractSynonym(), "ABSTRACT"); }
    protected abstract ConditionValue xgetCValueAbstractSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinalSynonym_Equal(Integer finalSynonym) {
        doSetFinalSynonym_Equal(finalSynonym);
    }

    protected void doSetFinalSynonym_Equal(Integer finalSynonym) {
        regFinalSynonym(CK_EQ, finalSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinalSynonym_GreaterThan(Integer finalSynonym) {
        regFinalSynonym(CK_GT, finalSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinalSynonym_LessThan(Integer finalSynonym) {
        regFinalSynonym(CK_LT, finalSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinalSynonym_GreaterEqual(Integer finalSynonym) {
        regFinalSynonym(CK_GE, finalSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonym The value of finalSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinalSynonym_LessEqual(Integer finalSynonym) {
        regFinalSynonym(CK_LE, finalSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param minNumber The min number of finalSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of finalSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFinalSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFinalSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param minNumber The min number of finalSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of finalSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFinalSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFinalSynonym(), "FINAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonymList The collection of finalSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFinalSynonym_InScope(Collection<Integer> finalSynonymList) {
        doSetFinalSynonym_InScope(finalSynonymList);
    }

    protected void doSetFinalSynonym_InScope(Collection<Integer> finalSynonymList) {
        regINS(CK_INS, cTL(finalSynonymList), xgetCValueFinalSynonym(), "FINAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @param finalSynonymList The collection of finalSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFinalSynonym_NotInScope(Collection<Integer> finalSynonymList) {
        doSetFinalSynonym_NotInScope(finalSynonymList);
    }

    protected void doSetFinalSynonym_NotInScope(Collection<Integer> finalSynonymList) {
        regINS(CK_NINS, cTL(finalSynonymList), xgetCValueFinalSynonym(), "FINAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     */
    public void setFinalSynonym_IsNull() { regFinalSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINAL: {INT(10)}
     */
    public void setFinalSynonym_IsNotNull() { regFinalSynonym(CK_ISNN, DOBJ); }

    protected void regFinalSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFinalSynonym(), "FINAL"); }
    protected abstract ConditionValue xgetCValueFinalSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinallySynonym_Equal(Integer finallySynonym) {
        doSetFinallySynonym_Equal(finallySynonym);
    }

    protected void doSetFinallySynonym_Equal(Integer finallySynonym) {
        regFinallySynonym(CK_EQ, finallySynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinallySynonym_GreaterThan(Integer finallySynonym) {
        regFinallySynonym(CK_GT, finallySynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinallySynonym_LessThan(Integer finallySynonym) {
        regFinallySynonym(CK_LT, finallySynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinallySynonym_GreaterEqual(Integer finallySynonym) {
        regFinallySynonym(CK_GE, finallySynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonym The value of finallySynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFinallySynonym_LessEqual(Integer finallySynonym) {
        regFinallySynonym(CK_LE, finallySynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param minNumber The min number of finallySynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of finallySynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFinallySynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFinallySynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param minNumber The min number of finallySynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of finallySynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFinallySynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFinallySynonym(), "FINALLY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonymList The collection of finallySynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFinallySynonym_InScope(Collection<Integer> finallySynonymList) {
        doSetFinallySynonym_InScope(finallySynonymList);
    }

    protected void doSetFinallySynonym_InScope(Collection<Integer> finallySynonymList) {
        regINS(CK_INS, cTL(finallySynonymList), xgetCValueFinallySynonym(), "FINALLY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @param finallySynonymList The collection of finallySynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFinallySynonym_NotInScope(Collection<Integer> finallySynonymList) {
        doSetFinallySynonym_NotInScope(finallySynonymList);
    }

    protected void doSetFinallySynonym_NotInScope(Collection<Integer> finallySynonymList) {
        regINS(CK_NINS, cTL(finallySynonymList), xgetCValueFinallySynonym(), "FINALLY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     */
    public void setFinallySynonym_IsNull() { regFinallySynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     */
    public void setFinallySynonym_IsNotNull() { regFinallySynonym(CK_ISNN, DOBJ); }

    protected void regFinallySynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFinallySynonym(), "FINALLY"); }
    protected abstract ConditionValue xgetCValueFinallySynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnSynonym_Equal(Integer returnSynonym) {
        doSetReturnSynonym_Equal(returnSynonym);
    }

    protected void doSetReturnSynonym_Equal(Integer returnSynonym) {
        regReturnSynonym(CK_EQ, returnSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnSynonym_GreaterThan(Integer returnSynonym) {
        regReturnSynonym(CK_GT, returnSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnSynonym_LessThan(Integer returnSynonym) {
        regReturnSynonym(CK_LT, returnSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnSynonym_GreaterEqual(Integer returnSynonym) {
        regReturnSynonym(CK_GE, returnSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonym The value of returnSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnSynonym_LessEqual(Integer returnSynonym) {
        regReturnSynonym(CK_LE, returnSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param minNumber The min number of returnSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of returnSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReturnSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReturnSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param minNumber The min number of returnSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of returnSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReturnSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReturnSynonym(), "RETURN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonymList The collection of returnSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnSynonym_InScope(Collection<Integer> returnSynonymList) {
        doSetReturnSynonym_InScope(returnSynonymList);
    }

    protected void doSetReturnSynonym_InScope(Collection<Integer> returnSynonymList) {
        regINS(CK_INS, cTL(returnSynonymList), xgetCValueReturnSynonym(), "RETURN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @param returnSynonymList The collection of returnSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnSynonym_NotInScope(Collection<Integer> returnSynonymList) {
        doSetReturnSynonym_NotInScope(returnSynonymList);
    }

    protected void doSetReturnSynonym_NotInScope(Collection<Integer> returnSynonymList) {
        regINS(CK_NINS, cTL(returnSynonymList), xgetCValueReturnSynonym(), "RETURN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     */
    public void setReturnSynonym_IsNull() { regReturnSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))RETURN: {INT(10)}
     */
    public void setReturnSynonym_IsNotNull() { regReturnSynonym(CK_ISNN, DOBJ); }

    protected void regReturnSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReturnSynonym(), "RETURN"); }
    protected abstract ConditionValue xgetCValueReturnSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoubleSynonym_Equal(Integer doubleSynonym) {
        doSetDoubleSynonym_Equal(doubleSynonym);
    }

    protected void doSetDoubleSynonym_Equal(Integer doubleSynonym) {
        regDoubleSynonym(CK_EQ, doubleSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoubleSynonym_GreaterThan(Integer doubleSynonym) {
        regDoubleSynonym(CK_GT, doubleSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoubleSynonym_LessThan(Integer doubleSynonym) {
        regDoubleSynonym(CK_LT, doubleSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoubleSynonym_GreaterEqual(Integer doubleSynonym) {
        regDoubleSynonym(CK_GE, doubleSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonym The value of doubleSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoubleSynonym_LessEqual(Integer doubleSynonym) {
        regDoubleSynonym(CK_LE, doubleSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param minNumber The min number of doubleSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of doubleSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDoubleSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDoubleSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param minNumber The min number of doubleSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of doubleSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDoubleSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDoubleSynonym(), "DOUBLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonymList The collection of doubleSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoubleSynonym_InScope(Collection<Integer> doubleSynonymList) {
        doSetDoubleSynonym_InScope(doubleSynonymList);
    }

    protected void doSetDoubleSynonym_InScope(Collection<Integer> doubleSynonymList) {
        regINS(CK_INS, cTL(doubleSynonymList), xgetCValueDoubleSynonym(), "DOUBLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @param doubleSynonymList The collection of doubleSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoubleSynonym_NotInScope(Collection<Integer> doubleSynonymList) {
        doSetDoubleSynonym_NotInScope(doubleSynonymList);
    }

    protected void doSetDoubleSynonym_NotInScope(Collection<Integer> doubleSynonymList) {
        regINS(CK_NINS, cTL(doubleSynonymList), xgetCValueDoubleSynonym(), "DOUBLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     */
    public void setDoubleSynonym_IsNull() { regDoubleSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     */
    public void setDoubleSynonym_IsNotNull() { regDoubleSynonym(CK_ISNN, DOBJ); }

    protected void regDoubleSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoubleSynonym(), "DOUBLE"); }
    protected abstract ConditionValue xgetCValueDoubleSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloatSynonym_Equal(Integer floatSynonym) {
        doSetFloatSynonym_Equal(floatSynonym);
    }

    protected void doSetFloatSynonym_Equal(Integer floatSynonym) {
        regFloatSynonym(CK_EQ, floatSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloatSynonym_GreaterThan(Integer floatSynonym) {
        regFloatSynonym(CK_GT, floatSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloatSynonym_LessThan(Integer floatSynonym) {
        regFloatSynonym(CK_LT, floatSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloatSynonym_GreaterEqual(Integer floatSynonym) {
        regFloatSynonym(CK_GE, floatSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonym The value of floatSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloatSynonym_LessEqual(Integer floatSynonym) {
        regFloatSynonym(CK_LE, floatSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param minNumber The min number of floatSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of floatSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFloatSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFloatSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param minNumber The min number of floatSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of floatSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFloatSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFloatSynonym(), "FLOAT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonymList The collection of floatSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloatSynonym_InScope(Collection<Integer> floatSynonymList) {
        doSetFloatSynonym_InScope(floatSynonymList);
    }

    protected void doSetFloatSynonym_InScope(Collection<Integer> floatSynonymList) {
        regINS(CK_INS, cTL(floatSynonymList), xgetCValueFloatSynonym(), "FLOAT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @param floatSynonymList The collection of floatSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloatSynonym_NotInScope(Collection<Integer> floatSynonymList) {
        doSetFloatSynonym_NotInScope(floatSynonymList);
    }

    protected void doSetFloatSynonym_NotInScope(Collection<Integer> floatSynonymList) {
        regINS(CK_NINS, cTL(floatSynonymList), xgetCValueFloatSynonym(), "FLOAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     */
    public void setFloatSynonym_IsNull() { regFloatSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     */
    public void setFloatSynonym_IsNotNull() { regFloatSynonym(CK_ISNN, DOBJ); }

    protected void regFloatSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloatSynonym(), "FLOAT"); }
    protected abstract ConditionValue xgetCValueFloatSynonym();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSynonym_Equal(Integer shortSynonym) {
        doSetShortSynonym_Equal(shortSynonym);
    }

    protected void doSetShortSynonym_Equal(Integer shortSynonym) {
        regShortSynonym(CK_EQ, shortSynonym);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSynonym_GreaterThan(Integer shortSynonym) {
        regShortSynonym(CK_GT, shortSynonym);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSynonym_LessThan(Integer shortSynonym) {
        regShortSynonym(CK_LT, shortSynonym);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSynonym_GreaterEqual(Integer shortSynonym) {
        regShortSynonym(CK_GE, shortSynonym);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonym The value of shortSynonym as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSynonym_LessEqual(Integer shortSynonym) {
        regShortSynonym(CK_LE, shortSynonym);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param minNumber The min number of shortSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shortSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setShortSynonym_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setShortSynonym_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param minNumber The min number of shortSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shortSynonym. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShortSynonym_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShortSynonym(), "SHORT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonymList The collection of shortSynonym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortSynonym_InScope(Collection<Integer> shortSynonymList) {
        doSetShortSynonym_InScope(shortSynonymList);
    }

    protected void doSetShortSynonym_InScope(Collection<Integer> shortSynonymList) {
        regINS(CK_INS, cTL(shortSynonymList), xgetCValueShortSynonym(), "SHORT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @param shortSynonymList The collection of shortSynonym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortSynonym_NotInScope(Collection<Integer> shortSynonymList) {
        doSetShortSynonym_NotInScope(shortSynonymList);
    }

    protected void doSetShortSynonym_NotInScope(Collection<Integer> shortSynonymList) {
        regINS(CK_NINS, cTL(shortSynonymList), xgetCValueShortSynonym(), "SHORT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     */
    public void setShortSynonym_IsNull() { regShortSynonym(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ((using DBFlute synonym))SHORT: {INT(10)}
     */
    public void setShortSynonym_IsNotNull() { regShortSynonym(CK_ISNN, DOBJ); }

    protected void regShortSynonym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShortSynonym(), "SHORT"); }
    protected abstract ConditionValue xgetCValueShortSynonym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE: {CHAR(3)}
     * @param type The value of type as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_Equal(String type) {
        doSetType_Equal(fRES(type));
    }

    protected void doSetType_Equal(String type) {
        regType(CK_EQ, type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE: {CHAR(3)}
     * @param type The value of type as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_NotEqual(String type) {
        doSetType_NotEqual(fRES(type));
    }

    protected void doSetType_NotEqual(String type) {
        regType(CK_NES, type);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE: {CHAR(3)}
     * @param typeList The collection of type as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_InScope(Collection<String> typeList) {
        doSetType_InScope(typeList);
    }

    protected void doSetType_InScope(Collection<String> typeList) {
        regINS(CK_INS, cTL(typeList), xgetCValueType(), "TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE: {CHAR(3)}
     * @param typeList The collection of type as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_NotInScope(Collection<String> typeList) {
        doSetType_NotInScope(typeList);
    }

    protected void doSetType_NotInScope(Collection<String> typeList) {
        regINS(CK_NINS, cTL(typeList), xgetCValueType(), "TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE: {CHAR(3)} <br>
     * <pre>e.g. setType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param type The value of type as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, ConditionOptionCall<LikeSearchOption> opLambda) {
        setType_LikeSearch(type, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE: {CHAR(3)} <br>
     * <pre>e.g. setType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param type The value of type as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), xgetCValueType(), "TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE: {CHAR(3)}
     * @param type The value of type as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, ConditionOptionCall<LikeSearchOption> opLambda) {
        setType_NotLikeSearch(type, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE: {CHAR(3)}
     * @param type The value of type as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), xgetCValueType(), "TYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE: {CHAR(3)}
     */
    public void setType_IsNull() { regType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE: {CHAR(3)}
     */
    public void setType_IsNullOrEmpty() { regType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE: {CHAR(3)}
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DOBJ); }

    protected void regType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueType(), "TYPE"); }
    protected abstract ConditionValue xgetCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservName_Equal(String reservName) {
        doSetReservName_Equal(fRES(reservName));
    }

    protected void doSetReservName_Equal(String reservName) {
        regReservName(CK_EQ, reservName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservName_NotEqual(String reservName) {
        doSetReservName_NotEqual(fRES(reservName));
    }

    protected void doSetReservName_NotEqual(String reservName) {
        regReservName(CK_NES, reservName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservNameList The collection of reservName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservName_InScope(Collection<String> reservNameList) {
        doSetReservName_InScope(reservNameList);
    }

    protected void doSetReservName_InScope(Collection<String> reservNameList) {
        regINS(CK_INS, cTL(reservNameList), xgetCValueReservName(), "RESERV_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservNameList The collection of reservName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservName_NotInScope(Collection<String> reservNameList) {
        doSetReservName_NotInScope(reservNameList);
    }

    protected void doSetReservName_NotInScope(Collection<String> reservNameList) {
        regINS(CK_NINS, cTL(reservNameList), xgetCValueReservName(), "RESERV_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)} <br>
     * <pre>e.g. setReservName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param reservName The value of reservName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReservName_LikeSearch(String reservName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReservName_LikeSearch(reservName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)} <br>
     * <pre>e.g. setReservName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reservName The value of reservName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReservName_LikeSearch(String reservName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reservName), xgetCValueReservName(), "RESERV_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReservName_NotLikeSearch(String reservName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReservName_NotLikeSearch(reservName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @param reservName The value of reservName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReservName_NotLikeSearch(String reservName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reservName), xgetCValueReservName(), "RESERV_NAME", likeSearchOption);
    }

    protected void regReservName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservName(), "RESERV_NAME"); }
    protected abstract ConditionValue xgetCValueReservName();

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
    public HpSLCFunction<WhitePgReservCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhitePgReservCB.class);
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
    public HpSLCFunction<WhitePgReservCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhitePgReservCB.class);
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
    public HpSLCFunction<WhitePgReservCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhitePgReservCB.class);
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
    public HpSLCFunction<WhitePgReservCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhitePgReservCB.class);
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
    public HpSLCFunction<WhitePgReservCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhitePgReservCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhitePgReservCB&gt;() {
     *     public void query(WhitePgReservCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhitePgReservCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhitePgReservCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhitePgReservCQ sq);

    protected WhitePgReservCB xcreateScalarConditionCB() {
        WhitePgReservCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhitePgReservCB xcreateScalarConditionPartitionByCB() {
        WhitePgReservCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhitePgReservCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLASS";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhitePgReservCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhitePgReservCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhitePgReservCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLASS";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhitePgReservCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhitePgReservCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhitePgReservCB cb = new WhitePgReservCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhitePgReservCQ sq);

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
    protected WhitePgReservCB newMyCB() {
        return new WhitePgReservCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhitePgReservCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
