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
 * The base condition-query of white_uq_classification_flg_part.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqClassificationFlgPartCQ extends AbstractBsWhiteUqClassificationFlgPartCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqClassificationFlgPartCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqClassificationFlgPartCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_uq_classification_flg_part) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqClassificationFlgPartCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqClassificationFlgPartCIQ xcreateCIQ() {
        WhiteUqClassificationFlgPartCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqClassificationFlgPartCIQ xnewCIQ() {
        return new WhiteUqClassificationFlgPartCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_uq_classification_flg_part on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqClassificationFlgPartCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqClassificationFlgPartCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _uqClsId;
    public ConditionValue xdfgetUqClsId()
    { if (_uqClsId == null) { _uqClsId = nCV(); }
      return _uqClsId; }
    protected ConditionValue xgetCValueUqClsId() { return xdfgetUqClsId(); }

    /** 
     * Add order-by as ascend. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgPartCQ addOrderBy_UqClsId_Asc() { regOBA("UQ_CLS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgPartCQ addOrderBy_UqClsId_Desc() { regOBD("UQ_CLS_ID"); return this; }

    protected ConditionValue _uqClsName;
    public ConditionValue xdfgetUqClsName()
    { if (_uqClsName == null) { _uqClsName = nCV(); }
      return _uqClsName; }
    protected ConditionValue xgetCValueUqClsName() { return xdfgetUqClsName(); }

    /** 
     * Add order-by as ascend. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgPartCQ addOrderBy_UqClsName_Asc() { regOBA("UQ_CLS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgPartCQ addOrderBy_UqClsName_Desc() { regOBD("UQ_CLS_NAME"); return this; }

    protected ConditionValue _uqClsFlg;
    public ConditionValue xdfgetUqClsFlg()
    { if (_uqClsFlg == null) { _uqClsFlg = nCV(); }
      return _uqClsFlg; }
    protected ConditionValue xgetCValueUqClsFlg() { return xdfgetUqClsFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgPartCQ addOrderBy_UqClsFlg_Asc() { regOBA("UQ_CLS_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * UQ_CLS_FLG: {+UQ, NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgPartCQ addOrderBy_UqClsFlg_Desc() { regOBD("UQ_CLS_FLG"); return this; }

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
    public BsWhiteUqClassificationFlgPartCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqClassificationFlgPartCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteUqClassificationFlgPartCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqClassificationFlgPartCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteUqClassificationFlgPartCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteUqClassificationFlgPartCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteUqClassificationFlgPartCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteUqClassificationFlgPartCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteUqClassificationFlgPartCQ> _myselfExistsMap;
    public Map<String, WhiteUqClassificationFlgPartCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteUqClassificationFlgPartCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteUqClassificationFlgPartCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteUqClassificationFlgPartCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqClassificationFlgPartCB.class.getName(); }
    protected String xCQ() { return WhiteUqClassificationFlgPartCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
