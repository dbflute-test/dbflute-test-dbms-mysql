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
 * The abstract condition-query of white_implicit_conv_string.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteImplicitConvStringCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteImplicitConvStringCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_implicit_conv_string";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvStringId_Equal(String implicitConvStringId) {
        doSetImplicitConvStringId_Equal(fRES(implicitConvStringId));
    }

    protected void doSetImplicitConvStringId_Equal(String implicitConvStringId) {
        regImplicitConvStringId(CK_EQ, implicitConvStringId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvStringId_NotEqual(String implicitConvStringId) {
        doSetImplicitConvStringId_NotEqual(fRES(implicitConvStringId));
    }

    protected void doSetImplicitConvStringId_NotEqual(String implicitConvStringId) {
        regImplicitConvStringId(CK_NES, implicitConvStringId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringIdList The collection of implicitConvStringId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvStringId_InScope(Collection<String> implicitConvStringIdList) {
        doSetImplicitConvStringId_InScope(implicitConvStringIdList);
    }

    protected void doSetImplicitConvStringId_InScope(Collection<String> implicitConvStringIdList) {
        regINS(CK_INS, cTL(implicitConvStringIdList), xgetCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringIdList The collection of implicitConvStringId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvStringId_NotInScope(Collection<String> implicitConvStringIdList) {
        doSetImplicitConvStringId_NotInScope(implicitConvStringIdList);
    }

    protected void doSetImplicitConvStringId_NotInScope(Collection<String> implicitConvStringIdList) {
        regINS(CK_NINS, cTL(implicitConvStringIdList), xgetCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setImplicitConvStringId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param implicitConvStringId The value of implicitConvStringId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvStringId_LikeSearch(String implicitConvStringId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvStringId_LikeSearch(implicitConvStringId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setImplicitConvStringId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvStringId The value of implicitConvStringId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvStringId_LikeSearch(String implicitConvStringId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvStringId), xgetCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvStringId_NotLikeSearch(String implicitConvStringId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvStringId_NotLikeSearch(implicitConvStringId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @param implicitConvStringId The value of implicitConvStringId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvStringId_NotLikeSearch(String implicitConvStringId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvStringId), xgetCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_integer where ...)} <br>
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteImplicitConvInteger</span>(integerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     integerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteImplicitConvIntegerList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitConvInteger(SubQuery<WhiteImplicitConvIntegerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList(cb.query());
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_numeric where ...)} <br>
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteImplicitConvNumeric</span>(numericCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     numericCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteImplicitConvNumericList for 'exists'. (NotNull)
     */
    public void existsWhiteImplicitConvNumeric(SubQuery<WhiteImplicitConvNumericCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList(cb.query());
        registerExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_integer where ...)} <br>
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteImplicitConvInteger</span>(integerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     integerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvInteger(SubQuery<WhiteImplicitConvIntegerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList");
    }
    public abstract String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select IMPLICIT_CONV_STRING_ID from white_implicit_conv_numeric where ...)} <br>
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteImplicitConvNumeric</span>(numericCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     numericCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteImplicitConvNumeric(SubQuery<WhiteImplicitConvNumericCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList");
    }
    public abstract String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    public void xsderiveWhiteImplicitConvIntegerList(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvIntegerList", al, op);
    }
    public abstract String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);

    public void xsderiveWhiteImplicitConvNumericList(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", pp, "whiteImplicitConvNumericList", al, op);
    }
    public abstract String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_integer where ...)} <br>
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteImplicitConvInteger()</span>.<span style="color: #CC4747">max</span>(integerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     integerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     integerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvIntegerCB> derivedWhiteImplicitConvInteger() {
        return xcreateQDRFunctionWhiteImplicitConvIntegerList();
    }
    protected HpQDRFunction<WhiteImplicitConvIntegerCB> xcreateQDRFunctionWhiteImplicitConvIntegerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteImplicitConvIntegerList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteImplicitConvIntegerList(String fn, SubQuery<WhiteImplicitConvIntegerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(cb.query()); String prpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", sqpp, "whiteImplicitConvIntegerList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq);
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_implicit_conv_numeric where ...)} <br>
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteImplicitConvNumeric()</span>.<span style="color: #CC4747">max</span>(numericCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     numericCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     numericCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvNumericCB> derivedWhiteImplicitConvNumeric() {
        return xcreateQDRFunctionWhiteImplicitConvNumericList();
    }
    protected HpQDRFunction<WhiteImplicitConvNumericCB> xcreateQDRFunctionWhiteImplicitConvNumericList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteImplicitConvNumericList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteImplicitConvNumericList(String fn, SubQuery<WhiteImplicitConvNumericCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList(cb.query()); String prpp = keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", sqpp, "whiteImplicitConvNumericList", rd, vl, prpp, op);
    }
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq);
    public abstract String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     */
    public void setImplicitConvStringId_IsNull() { regImplicitConvStringId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     */
    public void setImplicitConvStringId_IsNotNull() { regImplicitConvStringId(CK_ISNN, DOBJ); }

    protected void regImplicitConvStringId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImplicitConvStringId(), "IMPLICIT_CONV_STRING_ID"); }
    protected abstract ConditionValue xgetCValueImplicitConvStringId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvIntegerId_Equal(String implicitConvIntegerId) {
        doSetImplicitConvIntegerId_Equal(fRES(implicitConvIntegerId));
    }

    protected void doSetImplicitConvIntegerId_Equal(String implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_EQ, implicitConvIntegerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvIntegerId_NotEqual(String implicitConvIntegerId) {
        doSetImplicitConvIntegerId_NotEqual(fRES(implicitConvIntegerId));
    }

    protected void doSetImplicitConvIntegerId_NotEqual(String implicitConvIntegerId) {
        regImplicitConvIntegerId(CK_NES, implicitConvIntegerId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvIntegerId_InScope(Collection<String> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_InScope(implicitConvIntegerIdList);
    }

    protected void doSetImplicitConvIntegerId_InScope(Collection<String> implicitConvIntegerIdList) {
        regINS(CK_INS, cTL(implicitConvIntegerIdList), xgetCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerIdList The collection of implicitConvIntegerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvIntegerId_NotInScope(Collection<String> implicitConvIntegerIdList) {
        doSetImplicitConvIntegerId_NotInScope(implicitConvIntegerIdList);
    }

    protected void doSetImplicitConvIntegerId_NotInScope(Collection<String> implicitConvIntegerIdList) {
        regINS(CK_NINS, cTL(implicitConvIntegerIdList), xgetCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br>
     * <pre>e.g. setImplicitConvIntegerId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param implicitConvIntegerId The value of implicitConvIntegerId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvIntegerId_LikeSearch(String implicitConvIntegerId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvIntegerId_LikeSearch(implicitConvIntegerId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br>
     * <pre>e.g. setImplicitConvIntegerId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvIntegerId The value of implicitConvIntegerId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvIntegerId_LikeSearch(String implicitConvIntegerId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvIntegerId), xgetCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvIntegerId_NotLikeSearch(String implicitConvIntegerId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvIntegerId_NotLikeSearch(implicitConvIntegerId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @param implicitConvIntegerId The value of implicitConvIntegerId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvIntegerId_NotLikeSearch(String implicitConvIntegerId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvIntegerId), xgetCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID", likeSearchOption);
    }

    protected void regImplicitConvIntegerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImplicitConvIntegerId(), "IMPLICIT_CONV_INTEGER_ID"); }
    protected abstract ConditionValue xgetCValueImplicitConvIntegerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvNumericId_Equal(String implicitConvNumericId) {
        doSetImplicitConvNumericId_Equal(fRES(implicitConvNumericId));
    }

    protected void doSetImplicitConvNumericId_Equal(String implicitConvNumericId) {
        regImplicitConvNumericId(CK_EQ, implicitConvNumericId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvNumericId_NotEqual(String implicitConvNumericId) {
        doSetImplicitConvNumericId_NotEqual(fRES(implicitConvNumericId));
    }

    protected void doSetImplicitConvNumericId_NotEqual(String implicitConvNumericId) {
        regImplicitConvNumericId(CK_NES, implicitConvNumericId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvNumericId_InScope(Collection<String> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_InScope(implicitConvNumericIdList);
    }

    protected void doSetImplicitConvNumericId_InScope(Collection<String> implicitConvNumericIdList) {
        regINS(CK_INS, cTL(implicitConvNumericIdList), xgetCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericIdList The collection of implicitConvNumericId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvNumericId_NotInScope(Collection<String> implicitConvNumericIdList) {
        doSetImplicitConvNumericId_NotInScope(implicitConvNumericIdList);
    }

    protected void doSetImplicitConvNumericId_NotInScope(Collection<String> implicitConvNumericIdList) {
        regINS(CK_NINS, cTL(implicitConvNumericIdList), xgetCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br>
     * <pre>e.g. setImplicitConvNumericId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param implicitConvNumericId The value of implicitConvNumericId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvNumericId_LikeSearch(String implicitConvNumericId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvNumericId_LikeSearch(implicitConvNumericId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br>
     * <pre>e.g. setImplicitConvNumericId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvNumericId The value of implicitConvNumericId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvNumericId_LikeSearch(String implicitConvNumericId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvNumericId), xgetCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvNumericId_NotLikeSearch(String implicitConvNumericId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvNumericId_NotLikeSearch(implicitConvNumericId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @param implicitConvNumericId The value of implicitConvNumericId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvNumericId_NotLikeSearch(String implicitConvNumericId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvNumericId), xgetCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID", likeSearchOption);
    }

    protected void regImplicitConvNumericId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImplicitConvNumericId(), "IMPLICIT_CONV_NUMERIC_ID"); }
    protected abstract ConditionValue xgetCValueImplicitConvNumericId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvName_Equal(String implicitConvName) {
        doSetImplicitConvName_Equal(fRES(implicitConvName));
    }

    protected void doSetImplicitConvName_Equal(String implicitConvName) {
        regImplicitConvName(CK_EQ, implicitConvName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvName_NotEqual(String implicitConvName) {
        doSetImplicitConvName_NotEqual(fRES(implicitConvName));
    }

    protected void doSetImplicitConvName_NotEqual(String implicitConvName) {
        regImplicitConvName(CK_NES, implicitConvName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvNameList The collection of implicitConvName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvName_InScope(Collection<String> implicitConvNameList) {
        doSetImplicitConvName_InScope(implicitConvNameList);
    }

    protected void doSetImplicitConvName_InScope(Collection<String> implicitConvNameList) {
        regINS(CK_INS, cTL(implicitConvNameList), xgetCValueImplicitConvName(), "IMPLICIT_CONV_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvNameList The collection of implicitConvName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImplicitConvName_NotInScope(Collection<String> implicitConvNameList) {
        doSetImplicitConvName_NotInScope(implicitConvNameList);
    }

    protected void doSetImplicitConvName_NotInScope(Collection<String> implicitConvNameList) {
        regINS(CK_NINS, cTL(implicitConvNameList), xgetCValueImplicitConvName(), "IMPLICIT_CONV_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setImplicitConvName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param implicitConvName The value of implicitConvName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvName_LikeSearch(String implicitConvName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvName_LikeSearch(implicitConvName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setImplicitConvName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param implicitConvName The value of implicitConvName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImplicitConvName_LikeSearch(String implicitConvName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(implicitConvName), xgetCValueImplicitConvName(), "IMPLICIT_CONV_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImplicitConvName_NotLikeSearch(String implicitConvName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImplicitConvName_NotLikeSearch(implicitConvName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @param implicitConvName The value of implicitConvName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImplicitConvName_NotLikeSearch(String implicitConvName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(implicitConvName), xgetCValueImplicitConvName(), "IMPLICIT_CONV_NAME", likeSearchOption);
    }

    protected void regImplicitConvName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImplicitConvName(), "IMPLICIT_CONV_NAME"); }
    protected abstract ConditionValue xgetCValueImplicitConvName();

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
    public HpSLCFunction<WhiteImplicitConvStringCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteImplicitConvStringCB.class);
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
    public HpSLCFunction<WhiteImplicitConvStringCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteImplicitConvStringCB.class);
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
    public HpSLCFunction<WhiteImplicitConvStringCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteImplicitConvStringCB.class);
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
    public HpSLCFunction<WhiteImplicitConvStringCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteImplicitConvStringCB.class);
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
    public HpSLCFunction<WhiteImplicitConvStringCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteImplicitConvStringCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void query(WhiteImplicitConvStringCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteImplicitConvStringCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteImplicitConvStringCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteImplicitConvStringCQ sq);

    protected WhiteImplicitConvStringCB xcreateScalarConditionCB() {
        WhiteImplicitConvStringCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteImplicitConvStringCB xcreateScalarConditionPartitionByCB() {
        WhiteImplicitConvStringCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteImplicitConvStringCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "IMPLICIT_CONV_STRING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteImplicitConvStringCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteImplicitConvStringCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteImplicitConvStringCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPLICIT_CONV_STRING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteImplicitConvStringCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteImplicitConvStringCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteImplicitConvStringCQ sq);

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
    protected WhiteImplicitConvStringCB newMyCB() {
        return new WhiteImplicitConvStringCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteImplicitConvStringCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
