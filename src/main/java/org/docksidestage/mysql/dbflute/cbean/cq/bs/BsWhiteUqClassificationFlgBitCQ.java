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
 * The base condition-query of white_uq_classification_flg_bit.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteUqClassificationFlgBitCQ extends AbstractBsWhiteUqClassificationFlgBitCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqClassificationFlgBitCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqClassificationFlgBitCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_uq_classification_flg_bit) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqClassificationFlgBitCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqClassificationFlgBitCIQ xcreateCIQ() {
        WhiteUqClassificationFlgBitCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqClassificationFlgBitCIQ xnewCIQ() {
        return new WhiteUqClassificationFlgBitCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_uq_classification_flg_bit on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqClassificationFlgBitCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqClassificationFlgBitCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsWhiteUqClassificationFlgBitCQ addOrderBy_UqClsId_Asc() { regOBA("UQ_CLS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgBitCQ addOrderBy_UqClsId_Desc() { regOBD("UQ_CLS_ID"); return this; }

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
    public BsWhiteUqClassificationFlgBitCQ addOrderBy_UqClsName_Asc() { regOBA("UQ_CLS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgBitCQ addOrderBy_UqClsName_Desc() { regOBD("UQ_CLS_NAME"); return this; }

    protected ConditionValue _uqClsBitFlg;
    public ConditionValue xdfgetUqClsBitFlg()
    { if (_uqClsBitFlg == null) { _uqClsBitFlg = nCV(); }
      return _uqClsBitFlg; }
    protected ConditionValue xgetCValueUqClsBitFlg() { return xdfgetUqClsBitFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgBitCQ addOrderBy_UqClsBitFlg_Asc() { regOBA("UQ_CLS_BIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg}
     * @return this. (NotNull)
     */
    public BsWhiteUqClassificationFlgBitCQ addOrderBy_UqClsBitFlg_Desc() { regOBD("UQ_CLS_BIT_FLG"); return this; }

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
    public BsWhiteUqClassificationFlgBitCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqClassificationFlgBitCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteUqClassificationFlgBitCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqClassificationFlgBitCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteUqClassificationFlgBitCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteUqClassificationFlgBitCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteUqClassificationFlgBitCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteUqClassificationFlgBitCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteUqClassificationFlgBitCQ> _myselfExistsMap;
    public Map<String, WhiteUqClassificationFlgBitCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteUqClassificationFlgBitCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteUqClassificationFlgBitCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteUqClassificationFlgBitCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqClassificationFlgBitCB.class.getName(); }
    protected String xCQ() { return WhiteUqClassificationFlgBitCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
