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
 * The base condition-query of white_implicit_conv_integer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvIntegerCQ extends AbstractBsWhiteImplicitConvIntegerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvIntegerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvIntegerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_implicit_conv_integer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitConvIntegerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitConvIntegerCIQ xcreateCIQ() {
        WhiteImplicitConvIntegerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitConvIntegerCIQ xnewCIQ() {
        return new WhiteImplicitConvIntegerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_implicit_conv_integer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitConvIntegerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitConvIntegerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _implicitConvIntegerId;
    public ConditionValue xdfgetImplicitConvIntegerId()
    { if (_implicitConvIntegerId == null) { _implicitConvIntegerId = nCV(); }
      return _implicitConvIntegerId; }
    protected ConditionValue xgetCValueImplicitConvIntegerId() { return xdfgetImplicitConvIntegerId(); }

    public Map<String, WhiteImplicitConvNumericCQ> xdfgetImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> xdfgetImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> xdfgetImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> xdfgetImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> xdfgetImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList", sq); }

    public Map<String, WhiteImplicitConvStringCQ> xdfgetImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList", sq); }

    public Map<String, WhiteImplicitConvNumericCQ> xdfgetImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList() { return xgetSQueMap("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) { return xkeepSQue("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList", sq); }
    public Map<String, Object> xdfgetImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter() { return xgetSQuePmMap("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList"); }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object pm) { return xkeepSQuePm("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList", pm); }

    public Map<String, WhiteImplicitConvStringCQ> xdfgetImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList() { return xgetSQueMap("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) { return xkeepSQue("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList", sq); }
    public Map<String, Object> xdfgetImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter() { return xgetSQuePmMap("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList"); }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object pm) { return xkeepSQuePm("implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvIntegerId_Asc() { regOBA("IMPLICIT_CONV_INTEGER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvIntegerId_Desc() { regOBD("IMPLICIT_CONV_INTEGER_ID"); return this; }

    protected ConditionValue _implicitConvNumericId;
    public ConditionValue xdfgetImplicitConvNumericId()
    { if (_implicitConvNumericId == null) { _implicitConvNumericId = nCV(); }
      return _implicitConvNumericId; }
    protected ConditionValue xgetCValueImplicitConvNumericId() { return xdfgetImplicitConvNumericId(); }

    /** 
     * Add order-by as ascend. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvNumericId_Asc() { regOBA("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvNumericId_Desc() { regOBD("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    protected ConditionValue _implicitConvStringId;
    public ConditionValue xdfgetImplicitConvStringId()
    { if (_implicitConvStringId == null) { _implicitConvStringId = nCV(); }
      return _implicitConvStringId; }
    protected ConditionValue xgetCValueImplicitConvStringId() { return xdfgetImplicitConvStringId(); }

    /** 
     * Add order-by as ascend. <br>
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvStringId_Asc() { regOBA("IMPLICIT_CONV_STRING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvStringId_Desc() { regOBD("IMPLICIT_CONV_STRING_ID"); return this; }

    protected ConditionValue _implicitConvName;
    public ConditionValue xdfgetImplicitConvName()
    { if (_implicitConvName == null) { _implicitConvName = nCV(); }
      return _implicitConvName; }
    protected ConditionValue xgetCValueImplicitConvName() { return xdfgetImplicitConvName(); }

    /** 
     * Add order-by as ascend. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvName_Asc() { regOBA("IMPLICIT_CONV_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvName_Desc() { regOBD("IMPLICIT_CONV_NAME"); return this; }

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
    public BsWhiteImplicitConvIntegerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteImplicitConvIntegerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitConvIntegerCQ bq = (WhiteImplicitConvIntegerCQ)bqs;
        WhiteImplicitConvIntegerCQ uq = (WhiteImplicitConvIntegerCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitConvNumeric()) {
            uq.queryWhiteImplicitConvNumeric().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvNumeric(), uq.queryWhiteImplicitConvNumeric());
        }
        if (bq.hasConditionQueryWhiteImplicitConvString()) {
            uq.queryWhiteImplicitConvString().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvString(), uq.queryWhiteImplicitConvString());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvNumericCQ queryWhiteImplicitConvNumeric() {
        return xdfgetConditionQueryWhiteImplicitConvNumeric();
    }
    public WhiteImplicitConvNumericCQ xdfgetConditionQueryWhiteImplicitConvNumeric() {
        String prop = "whiteImplicitConvNumeric";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitConvNumeric()); xsetupOuterJoinWhiteImplicitConvNumeric(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteImplicitConvNumericCQ xcreateQueryWhiteImplicitConvNumeric() {
        String nrp = xresolveNRP("white_implicit_conv_integer", "whiteImplicitConvNumeric"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitConvNumericCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitConvNumeric", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitConvNumeric() { xregOutJo("whiteImplicitConvNumeric"); }
    public boolean hasConditionQueryWhiteImplicitConvNumeric() { return xhasQueRlMap("whiteImplicitConvNumeric"); }

    /**
     * Get the condition-query for relation table. <br>
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvStringCQ queryWhiteImplicitConvString() {
        return xdfgetConditionQueryWhiteImplicitConvString();
    }
    public WhiteImplicitConvStringCQ xdfgetConditionQueryWhiteImplicitConvString() {
        String prop = "whiteImplicitConvString";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteImplicitConvString()); xsetupOuterJoinWhiteImplicitConvString(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteImplicitConvStringCQ xcreateQueryWhiteImplicitConvString() {
        String nrp = xresolveNRP("white_implicit_conv_integer", "whiteImplicitConvString"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteImplicitConvStringCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteImplicitConvString", nrp);
    }
    protected void xsetupOuterJoinWhiteImplicitConvString() { xregOutJo("whiteImplicitConvString"); }
    public boolean hasConditionQueryWhiteImplicitConvString() { return xhasQueRlMap("whiteImplicitConvString"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteImplicitConvIntegerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteImplicitConvIntegerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteImplicitConvIntegerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteImplicitConvIntegerCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitConvIntegerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteImplicitConvIntegerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteImplicitConvIntegerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitConvIntegerCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitConvIntegerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
