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
 * The abstract condition-query of white_all_in_one_cls_element.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsElementCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsElementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_element";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCode The value of clsCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_Equal(String clsCategoryCode) {
        doSetClsCategoryCode_Equal(fRES(clsCategoryCode));
    }

    protected void doSetClsCategoryCode_Equal(String clsCategoryCode) {
        regClsCategoryCode(CK_EQ, clsCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCode The value of clsCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_NotEqual(String clsCategoryCode) {
        doSetClsCategoryCode_NotEqual(fRES(clsCategoryCode));
    }

    protected void doSetClsCategoryCode_NotEqual(String clsCategoryCode) {
        regClsCategoryCode(CK_NES, clsCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCodeList The collection of clsCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_InScope(Collection<String> clsCategoryCodeList) {
        doSetClsCategoryCode_InScope(clsCategoryCodeList);
    }

    protected void doSetClsCategoryCode_InScope(Collection<String> clsCategoryCodeList) {
        regINS(CK_INS, cTL(clsCategoryCodeList), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCodeList The collection of clsCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsCategoryCode_NotInScope(Collection<String> clsCategoryCodeList) {
        doSetClsCategoryCode_NotInScope(clsCategoryCodeList);
    }

    protected void doSetClsCategoryCode_NotInScope(Collection<String> clsCategoryCodeList) {
        regINS(CK_NINS, cTL(clsCategoryCodeList), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} <br>
     * <pre>e.g. setClsCategoryCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clsCategoryCode The value of clsCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsCategoryCode_LikeSearch(String clsCategoryCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsCategoryCode_LikeSearch(clsCategoryCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} <br>
     * <pre>e.g. setClsCategoryCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsCategoryCode The value of clsCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsCategoryCode_LikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsCategoryCode), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCode The value of clsCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsCategoryCode_NotLikeSearch(String clsCategoryCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsCategoryCode_NotLikeSearch(clsCategoryCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @param clsCategoryCode The value of clsCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsCategoryCode_NotLikeSearch(String clsCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsCategoryCode), xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     */
    public void setClsCategoryCode_IsNull() { regClsCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     */
    public void setClsCategoryCode_IsNotNull() { regClsCategoryCode(CK_ISNN, DOBJ); }

    protected void regClsCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClsCategoryCode(), "CLS_CATEGORY_CODE"); }
    protected abstract ConditionValue xgetCValueClsCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_Equal(String clsElementCode) {
        doSetClsElementCode_Equal(fRES(clsElementCode));
    }

    protected void doSetClsElementCode_Equal(String clsElementCode) {
        regClsElementCode(CK_EQ, clsElementCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_NotEqual(String clsElementCode) {
        doSetClsElementCode_NotEqual(fRES(clsElementCode));
    }

    protected void doSetClsElementCode_NotEqual(String clsElementCode) {
        regClsElementCode(CK_NES, clsElementCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCodeList The collection of clsElementCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_InScope(Collection<String> clsElementCodeList) {
        doSetClsElementCode_InScope(clsElementCodeList);
    }

    protected void doSetClsElementCode_InScope(Collection<String> clsElementCodeList) {
        regINS(CK_INS, cTL(clsElementCodeList), xgetCValueClsElementCode(), "CLS_ELEMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCodeList The collection of clsElementCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementCode_NotInScope(Collection<String> clsElementCodeList) {
        doSetClsElementCode_NotInScope(clsElementCodeList);
    }

    protected void doSetClsElementCode_NotInScope(Collection<String> clsElementCodeList) {
        regINS(CK_NINS, cTL(clsElementCodeList), xgetCValueClsElementCode(), "CLS_ELEMENT_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setClsElementCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clsElementCode The value of clsElementCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsElementCode_LikeSearch(String clsElementCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsElementCode_LikeSearch(clsElementCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setClsElementCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsElementCode The value of clsElementCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsElementCode_LikeSearch(String clsElementCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsElementCode), xgetCValueClsElementCode(), "CLS_ELEMENT_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsElementCode_NotLikeSearch(String clsElementCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsElementCode_NotLikeSearch(clsElementCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param clsElementCode The value of clsElementCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsElementCode_NotLikeSearch(String clsElementCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsElementCode), xgetCValueClsElementCode(), "CLS_ELEMENT_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsElementCode_IsNull() { regClsElementCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setClsElementCode_IsNotNull() { regClsElementCode(CK_ISNN, DOBJ); }

    protected void regClsElementCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClsElementCode(), "CLS_ELEMENT_CODE"); }
    protected abstract ConditionValue xgetCValueClsElementCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_Equal(String clsElementName) {
        doSetClsElementName_Equal(fRES(clsElementName));
    }

    protected void doSetClsElementName_Equal(String clsElementName) {
        regClsElementName(CK_EQ, clsElementName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_NotEqual(String clsElementName) {
        doSetClsElementName_NotEqual(fRES(clsElementName));
    }

    protected void doSetClsElementName_NotEqual(String clsElementName) {
        regClsElementName(CK_NES, clsElementName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementNameList The collection of clsElementName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_InScope(Collection<String> clsElementNameList) {
        doSetClsElementName_InScope(clsElementNameList);
    }

    protected void doSetClsElementName_InScope(Collection<String> clsElementNameList) {
        regINS(CK_INS, cTL(clsElementNameList), xgetCValueClsElementName(), "CLS_ELEMENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementNameList The collection of clsElementName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClsElementName_NotInScope(Collection<String> clsElementNameList) {
        doSetClsElementName_NotInScope(clsElementNameList);
    }

    protected void doSetClsElementName_NotInScope(Collection<String> clsElementNameList) {
        regINS(CK_NINS, cTL(clsElementNameList), xgetCValueClsElementName(), "CLS_ELEMENT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setClsElementName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clsElementName The value of clsElementName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsElementName_LikeSearch(String clsElementName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsElementName_LikeSearch(clsElementName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setClsElementName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clsElementName The value of clsElementName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClsElementName_LikeSearch(String clsElementName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clsElementName), xgetCValueClsElementName(), "CLS_ELEMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClsElementName_NotLikeSearch(String clsElementName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClsElementName_NotLikeSearch(clsElementName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @param clsElementName The value of clsElementName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClsElementName_NotLikeSearch(String clsElementName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clsElementName), xgetCValueClsElementName(), "CLS_ELEMENT_NAME", likeSearchOption);
    }

    protected void regClsElementName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClsElementName(), "CLS_ELEMENT_NAME"); }
    protected abstract ConditionValue xgetCValueClsElementName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_Equal(String attributeExp) {
        doSetAttributeExp_Equal(fRES(attributeExp));
    }

    protected void doSetAttributeExp_Equal(String attributeExp) {
        regAttributeExp(CK_EQ, attributeExp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_NotEqual(String attributeExp) {
        doSetAttributeExp_NotEqual(fRES(attributeExp));
    }

    protected void doSetAttributeExp_NotEqual(String attributeExp) {
        regAttributeExp(CK_NES, attributeExp);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExpList The collection of attributeExp as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_InScope(Collection<String> attributeExpList) {
        doSetAttributeExp_InScope(attributeExpList);
    }

    protected void doSetAttributeExp_InScope(Collection<String> attributeExpList) {
        regINS(CK_INS, cTL(attributeExpList), xgetCValueAttributeExp(), "ATTRIBUTE_EXP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExpList The collection of attributeExp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAttributeExp_NotInScope(Collection<String> attributeExpList) {
        doSetAttributeExp_NotInScope(attributeExpList);
    }

    protected void doSetAttributeExp_NotInScope(Collection<String> attributeExpList) {
        regINS(CK_NINS, cTL(attributeExpList), xgetCValueAttributeExp(), "ATTRIBUTE_EXP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setAttributeExp_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param attributeExp The value of attributeExp as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAttributeExp_LikeSearch(String attributeExp, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAttributeExp_LikeSearch(attributeExp, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setAttributeExp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param attributeExp The value of attributeExp as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttributeExp_LikeSearch(String attributeExp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attributeExp), xgetCValueAttributeExp(), "ATTRIBUTE_EXP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAttributeExp_NotLikeSearch(String attributeExp, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAttributeExp_NotLikeSearch(attributeExp, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @param attributeExp The value of attributeExp as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttributeExp_NotLikeSearch(String attributeExp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attributeExp), xgetCValueAttributeExp(), "ATTRIBUTE_EXP", likeSearchOption);
    }

    protected void regAttributeExp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttributeExp(), "ATTRIBUTE_EXP"); }
    protected abstract ConditionValue xgetCValueAttributeExp();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsElementCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteAllInOneClsElementCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsElementCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteAllInOneClsElementCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsElementCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteAllInOneClsElementCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsElementCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteAllInOneClsElementCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsElementCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteAllInOneClsElementCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void query(WhiteAllInOneClsElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsElementCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteAllInOneClsElementCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsElementCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteAllInOneClsElementCQ sq);

    protected WhiteAllInOneClsElementCB xcreateScalarConditionCB() {
        WhiteAllInOneClsElementCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteAllInOneClsElementCB xcreateScalarConditionPartitionByCB() {
        WhiteAllInOneClsElementCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteAllInOneClsElementCB newMyCB() {
        return new WhiteAllInOneClsElementCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteAllInOneClsElementCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
