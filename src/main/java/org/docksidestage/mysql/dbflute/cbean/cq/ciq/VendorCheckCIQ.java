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
 * The condition-query for in-line of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
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
    protected ConditionValue xgetCValueVendorCheckId() { return _myCQ.xdfgetVendorCheckId(); }
    protected ConditionValue xgetCValueTypeOfChar() { return _myCQ.xdfgetTypeOfChar(); }
    protected ConditionValue xgetCValueTypeOfVarchar() { return _myCQ.xdfgetTypeOfVarchar(); }
    protected ConditionValue xgetCValueTypeOfText() { return _myCQ.xdfgetTypeOfText(); }
    protected ConditionValue xgetCValueTypeOfTinytext() { return _myCQ.xdfgetTypeOfTinytext(); }
    protected ConditionValue xgetCValueTypeOfMediumtext() { return _myCQ.xdfgetTypeOfMediumtext(); }
    protected ConditionValue xgetCValueTypeOfLongtext() { return _myCQ.xdfgetTypeOfLongtext(); }
    protected ConditionValue xgetCValueTypeOfNumericDecimal() { return _myCQ.xdfgetTypeOfNumericDecimal(); }
    protected ConditionValue xgetCValueTypeOfNumericInteger() { return _myCQ.xdfgetTypeOfNumericInteger(); }
    protected ConditionValue xgetCValueTypeOfNumericBigint() { return _myCQ.xdfgetTypeOfNumericBigint(); }
    protected ConditionValue xgetCValueTypeOfDecimalDecimal() { return _myCQ.xdfgetTypeOfDecimalDecimal(); }
    protected ConditionValue xgetCValueTypeOfDecimalInteger() { return _myCQ.xdfgetTypeOfDecimalInteger(); }
    protected ConditionValue xgetCValueTypeOfDecimalBigint() { return _myCQ.xdfgetTypeOfDecimalBigint(); }
    protected ConditionValue xgetCValueTypeOfInteger() { return _myCQ.xdfgetTypeOfInteger(); }
    protected ConditionValue xgetCValueTypeOfBigint() { return _myCQ.xdfgetTypeOfBigint(); }
    protected ConditionValue xgetCValueTypeOfFloat() { return _myCQ.xdfgetTypeOfFloat(); }
    protected ConditionValue xgetCValueTypeOfDouble() { return _myCQ.xdfgetTypeOfDouble(); }
    protected ConditionValue xgetCValueTypeOfDate() { return _myCQ.xdfgetTypeOfDate(); }
    protected ConditionValue xgetCValueTypeOfDatetime() { return _myCQ.xdfgetTypeOfDatetime(); }
    protected ConditionValue xgetCValueTypeOfDatetime3Millis() { return _myCQ.xdfgetTypeOfDatetime3Millis(); }
    protected ConditionValue xgetCValueTypeOfDatetime6Micros() { return _myCQ.xdfgetTypeOfDatetime6Micros(); }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return _myCQ.xdfgetTypeOfTimestamp(); }
    protected ConditionValue xgetCValueTypeOfTime() { return _myCQ.xdfgetTypeOfTime(); }
    protected ConditionValue xgetCValueTypeOfYear() { return _myCQ.xdfgetTypeOfYear(); }
    protected ConditionValue xgetCValueTypeOfBoolean() { return _myCQ.xdfgetTypeOfBoolean(); }
    protected ConditionValue xgetCValueTypeOfBlob() { return _myCQ.xdfgetTypeOfBlob(); }
    protected ConditionValue xgetCValueTypeOfTinyblob() { return _myCQ.xdfgetTypeOfTinyblob(); }
    protected ConditionValue xgetCValueTypeOfMediumblob() { return _myCQ.xdfgetTypeOfMediumblob(); }
    protected ConditionValue xgetCValueTypeOfLongblob() { return _myCQ.xdfgetTypeOfLongblob(); }
    protected ConditionValue xgetCValueTypeOfBinary() { return _myCQ.xdfgetTypeOfBinary(); }
    protected ConditionValue xgetCValueTypeOfVarbinary() { return _myCQ.xdfgetTypeOfVarbinary(); }
    protected ConditionValue xgetCValueTypeOfEnum() { return _myCQ.xdfgetTypeOfEnum(); }
    protected ConditionValue xgetCValueTypeOfSet() { return _myCQ.xdfgetTypeOfSet(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorCheckCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
