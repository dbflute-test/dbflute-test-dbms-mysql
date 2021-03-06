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
 * The base condition-query of white_perrotta_over_member.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePerrottaOverMemberCQ extends AbstractBsWhitePerrottaOverMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePerrottaOverMemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePerrottaOverMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_perrotta_over_member) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePerrottaOverMemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePerrottaOverMemberCIQ xcreateCIQ() {
        WhitePerrottaOverMemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePerrottaOverMemberCIQ xnewCIQ() {
        return new WhitePerrottaOverMemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_perrotta_over_member on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePerrottaOverMemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePerrottaOverMemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue xdfgetMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue xgetCValueMemberName() { return xdfgetMemberName(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_NAME: {NotNull, VARCHAR(180)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_NAME: {NotNull, VARCHAR(180)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _traceTypeCode;
    public ConditionValue xdfgetTraceTypeCode()
    { if (_traceTypeCode == null) { _traceTypeCode = nCV(); }
      return _traceTypeCode; }
    protected ConditionValue xgetCValueTraceTypeCode() { return xdfgetTraceTypeCode(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_TraceTypeCode_Asc() { regOBA("TRACE_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_TraceTypeCode_Desc() { regOBD("TRACE_TYPE_CODE"); return this; }

    protected ConditionValue _machoCode;
    public ConditionValue xdfgetMachoCode()
    { if (_machoCode == null) { _machoCode = nCV(); }
      return _machoCode; }
    protected ConditionValue xgetCValueMachoCode() { return xdfgetMachoCode(); }

    /**
     * Add order-by as ascend. <br>
     * MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_MachoCode_Asc() { regOBA("MACHO_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho}
     * @return this. (NotNull)
     */
    public BsWhitePerrottaOverMemberCQ addOrderBy_MachoCode_Desc() { regOBD("MACHO_CODE"); return this; }

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
    public BsWhitePerrottaOverMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhitePerrottaOverMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhitePerrottaOverMemberCQ bq = (WhitePerrottaOverMemberCQ)bqs;
        WhitePerrottaOverMemberCQ uq = (WhitePerrottaOverMemberCQ)uqs;
        if (bq.hasConditionQueryWhitePerrottaOverMemberMacho()) {
            uq.queryWhitePerrottaOverMemberMacho().reflectRelationOnUnionQuery(bq.queryWhitePerrottaOverMemberMacho(), uq.queryWhitePerrottaOverMemberMacho());
        }
        if (bq.hasConditionQueryWhitePerrottaOverProduct()) {
            uq.queryWhitePerrottaOverProduct().reflectRelationOnUnionQuery(bq.queryWhitePerrottaOverProduct(), uq.queryWhitePerrottaOverProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_PERROTTA_OVER_MEMBER_MACHO by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePerrottaOverMemberMachoCQ queryWhitePerrottaOverMemberMacho() {
        return xdfgetConditionQueryWhitePerrottaOverMemberMacho();
    }
    public WhitePerrottaOverMemberMachoCQ xdfgetConditionQueryWhitePerrottaOverMemberMacho() {
        String prop = "whitePerrottaOverMemberMacho";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePerrottaOverMemberMacho()); xsetupOuterJoinWhitePerrottaOverMemberMacho(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePerrottaOverMemberMachoCQ xcreateQueryWhitePerrottaOverMemberMacho() {
        String nrp = xresolveNRP("white_perrotta_over_member", "whitePerrottaOverMemberMacho"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePerrottaOverMemberMachoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePerrottaOverMemberMacho", nrp);
    }
    protected void xsetupOuterJoinWhitePerrottaOverMemberMacho() { xregOutJo("whitePerrottaOverMemberMacho"); }
    public boolean hasConditionQueryWhitePerrottaOverMemberMacho() { return xhasQueRlMap("whitePerrottaOverMemberMacho"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_PERROTTA_OVER_PRODUCT by my PRODUCT_ID, named 'whitePerrottaOverProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhitePerrottaOverProductCQ queryWhitePerrottaOverProduct() {
        return xdfgetConditionQueryWhitePerrottaOverProduct();
    }
    public WhitePerrottaOverProductCQ xdfgetConditionQueryWhitePerrottaOverProduct() {
        String prop = "whitePerrottaOverProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhitePerrottaOverProduct()); xsetupOuterJoinWhitePerrottaOverProduct(); }
        return xgetQueRlMap(prop);
    }
    protected WhitePerrottaOverProductCQ xcreateQueryWhitePerrottaOverProduct() {
        String nrp = xresolveNRP("white_perrotta_over_member", "whitePerrottaOverProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhitePerrottaOverProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whitePerrottaOverProduct", nrp);
    }
    protected void xsetupOuterJoinWhitePerrottaOverProduct() { xregOutJo("whitePerrottaOverProduct"); }
    public boolean hasConditionQueryWhitePerrottaOverProduct() { return xhasQueRlMap("whitePerrottaOverProduct"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhitePerrottaOverMemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhitePerrottaOverMemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhitePerrottaOverMemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhitePerrottaOverMemberCQ> _myselfExistsMap;
    public Map<String, WhitePerrottaOverMemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhitePerrottaOverMemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhitePerrottaOverMemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePerrottaOverMemberCB.class.getName(); }
    protected String xCQ() { return WhitePerrottaOverMemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
