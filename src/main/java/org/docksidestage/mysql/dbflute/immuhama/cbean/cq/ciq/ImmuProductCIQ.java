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
package org.docksidestage.mysql.dbflute.immuhama.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.bs.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.cq.*;

/**
 * The condition-query for in-line of product.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuProductCIQ extends ImmuAbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImmuBsProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImmuProductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, ImmuBsProductCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_ExistsReferrer_ProductDetailList(ImmuProductDetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_ProductPriceList(ImmuProductPriceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_ProductDetailList(ImmuProductDetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_ProductPriceList(ImmuProductPriceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_ProductDetailList(ImmuProductDetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_ProductPriceList(ImmuProductPriceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_ProductDetailList(ImmuProductDetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_ProductDetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_ProductPriceList(ImmuProductPriceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_ProductPriceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(ImmuProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ImmuProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ImmuProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ImmuProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ImmuProductCB.class.getName(); }
    protected String xinCQ() { return ImmuProductCQ.class.getName(); }
}
