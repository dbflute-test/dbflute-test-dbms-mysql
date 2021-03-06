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
 * The abstract condition-query of white_all_in_one_cls_category.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_category";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryCode_Equal(String clsCategoryCode) {
        doSetClsCategoryCode_Equal(fRES(clsCategoryCode));
    }

    protected void doSetClsCategoryCode_Equal(String clsCategoryCode) {
        regClsCategoryCode(CK_EQ, clsCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryCode_NotEqual(String clsCategoryCode) {
        doSetClsCategoryCode_NotEqual(fRES(clsCategoryCode));
    }

    protected void doSetClsCategoryCode_NotEqual(String clsCategoryCode) {
        regClsCategoryCode(CK_NES, clsCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCodeList The collection of clsCategoryCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryCode_InScope(Collection<String> clsCategoryCodeList) {
        doSetClsCategoryCode_InScope(clsCategoryCodeList);
    }

    protected void doSetClsCategoryCode_InScope(Collection<String> clsCategoryCodeList) {
        regINS(CK_INS, cTL(clsCategoryCodeList), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCodeList The collection of clsCategoryCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryCode_NotInScope(Collection<String> clsCategoryCodeList) {
        doSetClsCategoryCode_NotInScope(clsCategoryCodeList);
    }

    protected void doSetClsCategoryCode_NotInScope(Collection<String> clsCategoryCodeList) {
        regINS(CK_NINS, cTL(clsCategoryCodeList), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setClsCategoryCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clsCategoryCode The value of clsCategoryCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsCategoryCode_LikeSearch(String clsCategoryCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsCategoryCode_LikeSearch(clsCategoryCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setClsCategoryCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsCategoryCode The value of clsCategoryCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsCategoryCode_LikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsCategoryCode), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsCategoryCode_NotLikeSearch(String clsCategoryCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsCategoryCode_NotLikeSearch(clsCategoryCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param clsCategoryCode The value of clsCategoryCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsCategoryCode_NotLikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsCategoryCode), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLS_CATEGORY_CODE from white_all_in_one_cls_element where ...)} <br>
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteAllInOneClsElement</span>(elementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     elementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteAllInOneClsElementList for 'exists'. (NotNull)
     */
    public void existsWhiteAllInOneClsElement(SubQuery<WhiteAllInOneClsElementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList(cb.query());
        registerExistsReferrer(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList");
    }
    public abstract String keepClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLS_CATEGORY_CODE from white_all_in_one_cls_element where ...)} <br>
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteAllInOneClsElement</span>(elementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     elementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteAllInOneClsElement(SubQuery<WhiteAllInOneClsElementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList");
    }
    public abstract String keepClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    public void xsderiveWhiteAllInOneClsElementList(String fn, SubQuery<WhiteAllInOneClsElementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", pp, "whiteAllInOneClsElementList", al, op);
    }
    public abstract String keepClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_all_in_one_cls_element where ...)} <br>
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteAllInOneClsElement()</span>.<span style="color: #CC4747">max</span>(elementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     elementCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     elementCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteAllInOneClsElementCB> derivedWhiteAllInOneClsElement() {
        return xcreateQDRFunctionWhiteAllInOneClsElementList();
    }
    protected HpQDRFunction<WhiteAllInOneClsElementCB> xcreateQDRFunctionWhiteAllInOneClsElementList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteAllInOneClsElementList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteAllInOneClsElementList(String fn, SubQuery<WhiteAllInOneClsElementCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList(cb.query()); String prpp = keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", sqpp, "whiteAllInOneClsElementList", rd, vl, prpp, op);
    }
    public abstract String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq);
    public abstract String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsCategoryCode_IsNull() { regClsCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsCategoryCode_IsNotNull() { regClsCategoryCode(CK_ISNN, DOBJ); }

    protected void regClsCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE"); }
    protected abstract ConditionValue xgetCValueClsCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryName_Equal(String clsCategoryName) {
        doSetClsCategoryName_Equal(fRES(clsCategoryName));
    }

    protected void doSetClsCategoryName_Equal(String clsCategoryName) {
        regClsCategoryName(CK_EQ, clsCategoryName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryName_NotEqual(String clsCategoryName) {
        doSetClsCategoryName_NotEqual(fRES(clsCategoryName));
    }

    protected void doSetClsCategoryName_NotEqual(String clsCategoryName) {
        regClsCategoryName(CK_NES, clsCategoryName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryNameList The collection of clsCategoryName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryName_InScope(Collection<String> clsCategoryNameList) {
        doSetClsCategoryName_InScope(clsCategoryNameList);
    }

    protected void doSetClsCategoryName_InScope(Collection<String> clsCategoryNameList) {
        regINS(CK_INS, cTL(clsCategoryNameList), xgetCValueClsCategoryName(), "CLS_CATEGORY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryNameList The collection of clsCategoryName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClsCategoryName_NotInScope(Collection<String> clsCategoryNameList) {
        doSetClsCategoryName_NotInScope(clsCategoryNameList);
    }

    protected void doSetClsCategoryName_NotInScope(Collection<String> clsCategoryNameList) {
        regINS(CK_NINS, cTL(clsCategoryNameList), xgetCValueClsCategoryName(), "CLS_CATEGORY_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setClsCategoryName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clsCategoryName The value of clsCategoryName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsCategoryName_LikeSearch(String clsCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsCategoryName_LikeSearch(clsCategoryName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setClsCategoryName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsCategoryName The value of clsCategoryName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsCategoryName_LikeSearch(String clsCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsCategoryName), xgetCValueClsCategoryName(), "CLS_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsCategoryName_NotLikeSearch(String clsCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsCategoryName_NotLikeSearch(clsCategoryName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @param clsCategoryName The value of clsCategoryName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsCategoryName_NotLikeSearch(String clsCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsCategoryName), xgetCValueClsCategoryName(), "CLS_CATEGORY_NAME", likeSearchOption);
    }

    protected void regClsCategoryName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClsCategoryName(), "CLS_CATEGORY_NAME"); }
    protected abstract ConditionValue xgetCValueClsCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param descriptionList The collection of description as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param descriptionList The collection of description as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

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
    public HpSLCFunction<WhiteAllInOneClsCategoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteAllInOneClsCategoryCB.class);
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
    public HpSLCFunction<WhiteAllInOneClsCategoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteAllInOneClsCategoryCB.class);
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
    public HpSLCFunction<WhiteAllInOneClsCategoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteAllInOneClsCategoryCB.class);
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
    public HpSLCFunction<WhiteAllInOneClsCategoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteAllInOneClsCategoryCB.class);
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
    public HpSLCFunction<WhiteAllInOneClsCategoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteAllInOneClsCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void query(WhiteAllInOneClsCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteAllInOneClsCategoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteAllInOneClsCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCategoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteAllInOneClsCategoryCQ sq);

    protected WhiteAllInOneClsCategoryCB xcreateScalarConditionCB() {
        WhiteAllInOneClsCategoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteAllInOneClsCategoryCB xcreateScalarConditionPartitionByCB() {
        WhiteAllInOneClsCategoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteAllInOneClsCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLS_CATEGORY_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteAllInOneClsCategoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteAllInOneClsCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteAllInOneClsCategoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLS_CATEGORY_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteAllInOneClsCategoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteAllInOneClsCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteAllInOneClsCategoryCQ sq);

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
    protected WhiteAllInOneClsCategoryCB newMyCB() {
        return new WhiteAllInOneClsCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteAllInOneClsCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
