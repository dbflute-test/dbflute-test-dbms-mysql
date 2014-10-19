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
package org.docksidestage.mysql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.bs.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of white_pg_reserv.
 * @author DBFlute(AutoGenerator)
 */
public class WhitePgReservCIQ extends AbstractBsWhitePgReservCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhitePgReservCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhitePgReservCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhitePgReservCQ myCQ) {
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
    protected ConditionValue xgetCValueClassSynonym() { return _myCQ.xdfgetClassSynonym(); }
    public String keepClassSynonym_ExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCaseSynonym() { return _myCQ.xdfgetCaseSynonym(); }
    protected ConditionValue xgetCValuePackageSynonym() { return _myCQ.xdfgetPackageSynonym(); }
    protected ConditionValue xgetCValueDefaultSynonym() { return _myCQ.xdfgetDefaultSynonym(); }
    protected ConditionValue xgetCValueNewSynonym() { return _myCQ.xdfgetNewSynonym(); }
    protected ConditionValue xgetCValueNativeSynonym() { return _myCQ.xdfgetNativeSynonym(); }
    protected ConditionValue xgetCValueVoidSynonym() { return _myCQ.xdfgetVoidSynonym(); }
    protected ConditionValue xgetCValuePublicSynonym() { return _myCQ.xdfgetPublicSynonym(); }
    protected ConditionValue xgetCValueProtectedSynonym() { return _myCQ.xdfgetProtectedSynonym(); }
    protected ConditionValue xgetCValuePrivateSynonym() { return _myCQ.xdfgetPrivateSynonym(); }
    protected ConditionValue xgetCValueInterfaceSynonym() { return _myCQ.xdfgetInterfaceSynonym(); }
    protected ConditionValue xgetCValueAbstractSynonym() { return _myCQ.xdfgetAbstractSynonym(); }
    protected ConditionValue xgetCValueFinalSynonym() { return _myCQ.xdfgetFinalSynonym(); }
    protected ConditionValue xgetCValueFinallySynonym() { return _myCQ.xdfgetFinallySynonym(); }
    protected ConditionValue xgetCValueReturnSynonym() { return _myCQ.xdfgetReturnSynonym(); }
    protected ConditionValue xgetCValueDoubleSynonym() { return _myCQ.xdfgetDoubleSynonym(); }
    protected ConditionValue xgetCValueFloatSynonym() { return _myCQ.xdfgetFloatSynonym(); }
    protected ConditionValue xgetCValueShortSynonym() { return _myCQ.xdfgetShortSynonym(); }
    protected ConditionValue xgetCValueType() { return _myCQ.xdfgetType(); }
    protected ConditionValue xgetCValueReservName() { return _myCQ.xdfgetReservName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhitePgReservCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhitePgReservCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhitePgReservCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhitePgReservCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhitePgReservCB.class.getName(); }
    protected String xinCQ() { return WhitePgReservCQ.class.getName(); }
}
