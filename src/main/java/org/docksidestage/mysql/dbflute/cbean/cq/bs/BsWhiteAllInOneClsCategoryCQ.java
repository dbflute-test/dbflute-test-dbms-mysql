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
 * The base condition-query of white_all_in_one_cls_category.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteAllInOneClsCategoryCQ extends AbstractBsWhiteAllInOneClsCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteAllInOneClsCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteAllInOneClsCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_all_in_one_cls_category) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteAllInOneClsCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteAllInOneClsCategoryCIQ xcreateCIQ() {
        WhiteAllInOneClsCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteAllInOneClsCategoryCIQ xnewCIQ() {
        return new WhiteAllInOneClsCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_all_in_one_cls_category on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteAllInOneClsCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteAllInOneClsCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clsCategoryCode;
    public ConditionValue xdfgetClsCategoryCode()
    { if (_clsCategoryCode == null) { _clsCategoryCode = nCV(); }
      return _clsCategoryCode; }
    protected ConditionValue xgetCValueClsCategoryCode() { return xdfgetClsCategoryCode(); }

    public Map<String, WhiteAllInOneClsElementCQ> xdfgetClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList() { return xgetSQueMap("clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList"); }
    public String keepClsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) { return xkeepSQue("clsCategoryCode_ExistsReferrer_WhiteAllInOneClsElementList", sq); }

    public Map<String, WhiteAllInOneClsElementCQ> xdfgetClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList() { return xgetSQueMap("clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList"); }
    public String keepClsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) { return xkeepSQue("clsCategoryCode_NotExistsReferrer_WhiteAllInOneClsElementList", sq); }

    public Map<String, WhiteAllInOneClsElementCQ> xdfgetClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList() { return xgetSQueMap("clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList"); }
    public String keepClsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) { return xkeepSQue("clsCategoryCode_SpecifyDerivedReferrer_WhiteAllInOneClsElementList", sq); }

    public Map<String, WhiteAllInOneClsElementCQ> xdfgetClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList() { return xgetSQueMap("clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList"); }
    public String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList(WhiteAllInOneClsElementCQ sq) { return xkeepSQue("clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList", sq); }
    public Map<String, Object> xdfgetClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter() { return xgetSQuePmMap("clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList"); }
    public String keepClsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementListParameter(Object pm) { return xkeepSQuePm("clsCategoryCode_QueryDerivedReferrer_WhiteAllInOneClsElementList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryCode_Asc() { regOBA("CLS_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryCode_Desc() { regOBD("CLS_CATEGORY_CODE"); return this; }

    protected ConditionValue _clsCategoryName;
    public ConditionValue xdfgetClsCategoryName()
    { if (_clsCategoryName == null) { _clsCategoryName = nCV(); }
      return _clsCategoryName; }
    protected ConditionValue xgetCValueClsCategoryName() { return xdfgetClsCategoryName(); }

    /** 
     * Add order-by as ascend. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryName_Asc() { regOBA("CLS_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_ClsCategoryName_Desc() { regOBD("CLS_CATEGORY_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /** 
     * Add order-by as ascend. <br>
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESCRIPTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsWhiteAllInOneClsCategoryCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

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
    public BsWhiteAllInOneClsCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteAllInOneClsCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteAllInOneClsCategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteAllInOneClsCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteAllInOneClsCategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteAllInOneClsCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteAllInOneClsCategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteAllInOneClsCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteAllInOneClsCategoryCQ> _myselfExistsMap;
    public Map<String, WhiteAllInOneClsCategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteAllInOneClsCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteAllInOneClsCategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteAllInOneClsCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteAllInOneClsCategoryCB.class.getName(); }
    protected String xCQ() { return WhiteAllInOneClsCategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
