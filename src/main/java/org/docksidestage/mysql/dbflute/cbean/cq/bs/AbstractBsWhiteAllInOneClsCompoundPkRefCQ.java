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
 * The abstract condition-query of white_all_in_one_cls_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAllInOneClsCompoundPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAllInOneClsCompoundPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_all_in_one_cls_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_Equal(String fooCode) {
        doSetFooCode_Equal(fRES(fooCode));
    }

    protected void doSetFooCode_Equal(String fooCode) {
        regFooCode(CK_EQ, fooCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_NotEqual(String fooCode) {
        doSetFooCode_NotEqual(fRES(fooCode));
    }

    protected void doSetFooCode_NotEqual(String fooCode) {
        regFooCode(CK_NES, fooCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCodeList The collection of fooCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_InScope(Collection<String> fooCodeList) {
        doSetFooCode_InScope(fooCodeList);
    }

    protected void doSetFooCode_InScope(Collection<String> fooCodeList) {
        regINS(CK_INS, cTL(fooCodeList), xgetCValueFooCode(), "FOO_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCodeList The collection of fooCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooCode_NotInScope(Collection<String> fooCodeList) {
        doSetFooCode_NotInScope(fooCodeList);
    }

    protected void doSetFooCode_NotInScope(Collection<String> fooCodeList) {
        regINS(CK_NINS, cTL(fooCodeList), xgetCValueFooCode(), "FOO_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * <pre>e.g. setFooCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fooCode The value of fooCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFooCode_LikeSearch(String fooCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFooCode_LikeSearch(fooCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * <pre>e.g. setFooCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fooCode The value of fooCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFooCode_LikeSearch(String fooCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fooCode), xgetCValueFooCode(), "FOO_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFooCode_NotLikeSearch(String fooCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFooCode_NotLikeSearch(fooCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param fooCode The value of fooCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFooCode_NotLikeSearch(String fooCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fooCode), xgetCValueFooCode(), "FOO_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setFooCode_IsNull() { regFooCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setFooCode_IsNotNull() { regFooCode(CK_ISNN, DOBJ); }

    protected void regFooCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFooCode(), "FOO_CODE"); }
    protected abstract ConditionValue xgetCValueFooCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_Equal(String barCode) {
        doSetBarCode_Equal(fRES(barCode));
    }

    protected void doSetBarCode_Equal(String barCode) {
        regBarCode(CK_EQ, barCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_NotEqual(String barCode) {
        doSetBarCode_NotEqual(fRES(barCode));
    }

    protected void doSetBarCode_NotEqual(String barCode) {
        regBarCode(CK_NES, barCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCodeList The collection of barCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_InScope(Collection<String> barCodeList) {
        doSetBarCode_InScope(barCodeList);
    }

    protected void doSetBarCode_InScope(Collection<String> barCodeList) {
        regINS(CK_INS, cTL(barCodeList), xgetCValueBarCode(), "BAR_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCodeList The collection of barCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarCode_NotInScope(Collection<String> barCodeList) {
        doSetBarCode_NotInScope(barCodeList);
    }

    protected void doSetBarCode_NotInScope(Collection<String> barCodeList) {
        regINS(CK_NINS, cTL(barCodeList), xgetCValueBarCode(), "BAR_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * <pre>e.g. setBarCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param barCode The value of barCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBarCode_LikeSearch(String barCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBarCode_LikeSearch(barCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * <pre>e.g. setBarCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param barCode The value of barCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBarCode_LikeSearch(String barCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(barCode), xgetCValueBarCode(), "BAR_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBarCode_NotLikeSearch(String barCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBarCode_NotLikeSearch(barCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @param barCode The value of barCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBarCode_NotLikeSearch(String barCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(barCode), xgetCValueBarCode(), "BAR_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setBarCode_IsNull() { regBarCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     */
    public void setBarCode_IsNotNull() { regBarCode(CK_ISNN, DOBJ); }

    protected void regBarCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBarCode(), "BAR_CODE"); }
    protected abstract ConditionValue xgetCValueBarCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_Equal(String quxCode) {
        doSetQuxCode_Equal(fRES(quxCode));
    }

    protected void doSetQuxCode_Equal(String quxCode) {
        regQuxCode(CK_EQ, quxCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_NotEqual(String quxCode) {
        doSetQuxCode_NotEqual(fRES(quxCode));
    }

    protected void doSetQuxCode_NotEqual(String quxCode) {
        regQuxCode(CK_NES, quxCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCodeList The collection of quxCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_InScope(Collection<String> quxCodeList) {
        doSetQuxCode_InScope(quxCodeList);
    }

    protected void doSetQuxCode_InScope(Collection<String> quxCodeList) {
        regINS(CK_INS, cTL(quxCodeList), xgetCValueQuxCode(), "QUX_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCodeList The collection of quxCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQuxCode_NotInScope(Collection<String> quxCodeList) {
        doSetQuxCode_NotInScope(quxCodeList);
    }

    protected void doSetQuxCode_NotInScope(Collection<String> quxCodeList) {
        regINS(CK_NINS, cTL(quxCodeList), xgetCValueQuxCode(), "QUX_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setQuxCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param quxCode The value of quxCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setQuxCode_LikeSearch(String quxCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setQuxCode_LikeSearch(quxCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setQuxCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param quxCode The value of quxCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQuxCode_LikeSearch(String quxCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(quxCode), xgetCValueQuxCode(), "QUX_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setQuxCode_NotLikeSearch(String quxCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setQuxCode_NotLikeSearch(quxCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @param quxCode The value of quxCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQuxCode_NotLikeSearch(String quxCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(quxCode), xgetCValueQuxCode(), "QUX_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setQuxCode_IsNull() { regQuxCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setQuxCode_IsNotNull() { regQuxCode(CK_ISNN, DOBJ); }

    protected void regQuxCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuxCode(), "QUX_CODE"); }
    protected abstract ConditionValue xgetCValueQuxCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCompoundPkRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCompoundPkRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCompoundPkRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCompoundPkRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCompoundPkRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAllInOneClsCompoundPkRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAllInOneClsCompoundPkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteAllInOneClsCompoundPkRefCQ sq);

    protected WhiteAllInOneClsCompoundPkRefCB xcreateScalarConditionCB() {
        WhiteAllInOneClsCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteAllInOneClsCompoundPkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteAllInOneClsCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteAllInOneClsCompoundPkRefCB newMyCB() {
        return new WhiteAllInOneClsCompoundPkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteAllInOneClsCompoundPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
