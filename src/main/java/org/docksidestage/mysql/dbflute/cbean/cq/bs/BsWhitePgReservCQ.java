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

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.mysql.dbflute.cbean.cq.ciq.*;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_pg_reserv.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePgReservCQ extends AbstractBsWhitePgReservCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePgReservCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePgReservCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_pg_reserv) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePgReservCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePgReservCIQ xcreateCIQ() {
        WhitePgReservCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePgReservCIQ xnewCIQ() {
        return new WhitePgReservCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_pg_reserv on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePgReservCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePgReservCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _classSynonym;
    public ConditionValue xdfgetClassSynonym()
    { if (_classSynonym == null) { _classSynonym = nCV(); }
      return _classSynonym; }
    protected ConditionValue xgetCValueClassSynonym() { return xdfgetClassSynonym(); }

    public Map<String, WhitePgReservRefCQ> xdfgetClassSynonym_ExistsReferrer_WhitePgReservRefList() { return xgetSQueMap("classSynonym_ExistsReferrer_WhitePgReservRefList"); }
    public String keepClassSynonym_ExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) { return xkeepSQue("classSynonym_ExistsReferrer_WhitePgReservRefList", sq); }

    public Map<String, WhitePgReservRefCQ> xdfgetClassSynonym_NotExistsReferrer_WhitePgReservRefList() { return xgetSQueMap("classSynonym_NotExistsReferrer_WhitePgReservRefList"); }
    public String keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) { return xkeepSQue("classSynonym_NotExistsReferrer_WhitePgReservRefList", sq); }

    public Map<String, WhitePgReservRefCQ> xdfgetClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList() { return xgetSQueMap("classSynonym_SpecifyDerivedReferrer_WhitePgReservRefList"); }
    public String keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) { return xkeepSQue("classSynonym_SpecifyDerivedReferrer_WhitePgReservRefList", sq); }

    public Map<String, WhitePgReservRefCQ> xdfgetClassSynonym_QueryDerivedReferrer_WhitePgReservRefList() { return xgetSQueMap("classSynonym_QueryDerivedReferrer_WhitePgReservRefList"); }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) { return xkeepSQue("classSynonym_QueryDerivedReferrer_WhitePgReservRefList", sq); }
    public Map<String, Object> xdfgetClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter() { return xgetSQuePmMap("classSynonym_QueryDerivedReferrer_WhitePgReservRefList"); }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(Object pm) { return xkeepSQuePm("classSynonym_QueryDerivedReferrer_WhitePgReservRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ClassSynonym_Asc() { regOBA("CLASS"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ClassSynonym_Desc() { regOBD("CLASS"); return this; }

    protected ConditionValue _caseSynonym;
    public ConditionValue xdfgetCaseSynonym()
    { if (_caseSynonym == null) { _caseSynonym = nCV(); }
      return _caseSynonym; }
    protected ConditionValue xgetCValueCaseSynonym() { return xdfgetCaseSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_CaseSynonym_Asc() { regOBA("CASE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_CaseSynonym_Desc() { regOBD("CASE"); return this; }

    protected ConditionValue _packageSynonym;
    public ConditionValue xdfgetPackageSynonym()
    { if (_packageSynonym == null) { _packageSynonym = nCV(); }
      return _packageSynonym; }
    protected ConditionValue xgetCValuePackageSynonym() { return xdfgetPackageSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PackageSynonym_Asc() { regOBA("PACKAGE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PackageSynonym_Desc() { regOBD("PACKAGE"); return this; }

    protected ConditionValue _defaultSynonym;
    public ConditionValue xdfgetDefaultSynonym()
    { if (_defaultSynonym == null) { _defaultSynonym = nCV(); }
      return _defaultSynonym; }
    protected ConditionValue xgetCValueDefaultSynonym() { return xdfgetDefaultSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DefaultSynonym_Asc() { regOBA("DEFAULT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DefaultSynonym_Desc() { regOBD("DEFAULT"); return this; }

    protected ConditionValue _newSynonym;
    public ConditionValue xdfgetNewSynonym()
    { if (_newSynonym == null) { _newSynonym = nCV(); }
      return _newSynonym; }
    protected ConditionValue xgetCValueNewSynonym() { return xdfgetNewSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NewSynonym_Asc() { regOBA("NEW"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NewSynonym_Desc() { regOBD("NEW"); return this; }

    protected ConditionValue _nativeSynonym;
    public ConditionValue xdfgetNativeSynonym()
    { if (_nativeSynonym == null) { _nativeSynonym = nCV(); }
      return _nativeSynonym; }
    protected ConditionValue xgetCValueNativeSynonym() { return xdfgetNativeSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NativeSynonym_Asc() { regOBA("NATIVE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NativeSynonym_Desc() { regOBD("NATIVE"); return this; }

    protected ConditionValue _voidSynonym;
    public ConditionValue xdfgetVoidSynonym()
    { if (_voidSynonym == null) { _voidSynonym = nCV(); }
      return _voidSynonym; }
    protected ConditionValue xgetCValueVoidSynonym() { return xdfgetVoidSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_VoidSynonym_Asc() { regOBA("VOID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_VoidSynonym_Desc() { regOBD("VOID"); return this; }

    protected ConditionValue _publicSynonym;
    public ConditionValue xdfgetPublicSynonym()
    { if (_publicSynonym == null) { _publicSynonym = nCV(); }
      return _publicSynonym; }
    protected ConditionValue xgetCValuePublicSynonym() { return xdfgetPublicSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PublicSynonym_Asc() { regOBA("PUBLIC"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PublicSynonym_Desc() { regOBD("PUBLIC"); return this; }

    protected ConditionValue _protectedSynonym;
    public ConditionValue xdfgetProtectedSynonym()
    { if (_protectedSynonym == null) { _protectedSynonym = nCV(); }
      return _protectedSynonym; }
    protected ConditionValue xgetCValueProtectedSynonym() { return xdfgetProtectedSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ProtectedSynonym_Asc() { regOBA("PROTECTED"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ProtectedSynonym_Desc() { regOBD("PROTECTED"); return this; }

    protected ConditionValue _privateSynonym;
    public ConditionValue xdfgetPrivateSynonym()
    { if (_privateSynonym == null) { _privateSynonym = nCV(); }
      return _privateSynonym; }
    protected ConditionValue xgetCValuePrivateSynonym() { return xdfgetPrivateSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PrivateSynonym_Asc() { regOBA("PRIVATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PrivateSynonym_Desc() { regOBD("PRIVATE"); return this; }

    protected ConditionValue _interfaceSynonym;
    public ConditionValue xdfgetInterfaceSynonym()
    { if (_interfaceSynonym == null) { _interfaceSynonym = nCV(); }
      return _interfaceSynonym; }
    protected ConditionValue xgetCValueInterfaceSynonym() { return xdfgetInterfaceSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_InterfaceSynonym_Asc() { regOBA("INTERFACE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_InterfaceSynonym_Desc() { regOBD("INTERFACE"); return this; }

    protected ConditionValue _abstractSynonym;
    public ConditionValue xdfgetAbstractSynonym()
    { if (_abstractSynonym == null) { _abstractSynonym = nCV(); }
      return _abstractSynonym; }
    protected ConditionValue xgetCValueAbstractSynonym() { return xdfgetAbstractSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_AbstractSynonym_Asc() { regOBA("ABSTRACT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_AbstractSynonym_Desc() { regOBD("ABSTRACT"); return this; }

    protected ConditionValue _finalSynonym;
    public ConditionValue xdfgetFinalSynonym()
    { if (_finalSynonym == null) { _finalSynonym = nCV(); }
      return _finalSynonym; }
    protected ConditionValue xgetCValueFinalSynonym() { return xdfgetFinalSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinalSynonym_Asc() { regOBA("FINAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinalSynonym_Desc() { regOBD("FINAL"); return this; }

    protected ConditionValue _finallySynonym;
    public ConditionValue xdfgetFinallySynonym()
    { if (_finallySynonym == null) { _finallySynonym = nCV(); }
      return _finallySynonym; }
    protected ConditionValue xgetCValueFinallySynonym() { return xdfgetFinallySynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinallySynonym_Asc() { regOBA("FINALLY"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinallySynonym_Desc() { regOBD("FINALLY"); return this; }

    protected ConditionValue _returnSynonym;
    public ConditionValue xdfgetReturnSynonym()
    { if (_returnSynonym == null) { _returnSynonym = nCV(); }
      return _returnSynonym; }
    protected ConditionValue xgetCValueReturnSynonym() { return xdfgetReturnSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReturnSynonym_Asc() { regOBA("RETURN"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReturnSynonym_Desc() { regOBD("RETURN"); return this; }

    protected ConditionValue _doubleSynonym;
    public ConditionValue xdfgetDoubleSynonym()
    { if (_doubleSynonym == null) { _doubleSynonym = nCV(); }
      return _doubleSynonym; }
    protected ConditionValue xgetCValueDoubleSynonym() { return xdfgetDoubleSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DoubleSynonym_Asc() { regOBA("DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DoubleSynonym_Desc() { regOBD("DOUBLE"); return this; }

    protected ConditionValue _floatSynonym;
    public ConditionValue xdfgetFloatSynonym()
    { if (_floatSynonym == null) { _floatSynonym = nCV(); }
      return _floatSynonym; }
    protected ConditionValue xgetCValueFloatSynonym() { return xdfgetFloatSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FloatSynonym_Asc() { regOBA("FLOAT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FloatSynonym_Desc() { regOBD("FLOAT"); return this; }

    protected ConditionValue _shortSynonym;
    public ConditionValue xdfgetShortSynonym()
    { if (_shortSynonym == null) { _shortSynonym = nCV(); }
      return _shortSynonym; }
    protected ConditionValue xgetCValueShortSynonym() { return xdfgetShortSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ShortSynonym_Asc() { regOBA("SHORT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ShortSynonym_Desc() { regOBD("SHORT"); return this; }

    protected ConditionValue _type;
    public ConditionValue xdfgetType()
    { if (_type == null) { _type = nCV(); }
      return _type; }
    protected ConditionValue xgetCValueType() { return xdfgetType(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_Type_Asc() { regOBA("TYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_Type_Desc() { regOBD("TYPE"); return this; }

    protected ConditionValue _reservName;
    public ConditionValue xdfgetReservName()
    { if (_reservName == null) { _reservName = nCV(); }
      return _reservName; }
    protected ConditionValue xgetCValueReservName() { return xdfgetReservName(); }

    /** 
     * Add order-by as ascend. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReservName_Asc() { regOBA("RESERV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReservName_Desc() { regOBD("RESERV_NAME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhitePgReservCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePgReservCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePgReservCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePgReservCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePgReservCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePgReservCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePgReservCQ> _myselfExistsMap;
    public Map<String, WhitePgReservCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePgReservCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePgReservCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePgReservCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePgReservCB.class.getName(); }
    protected String xCQ() { return WhitePgReservCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
