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
 * The base condition-query of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from vendor_check) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join vendor_check on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorCheckId;
    public ConditionValue xdfgetVendorCheckId()
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected ConditionValue xgetCValueVendorCheckId() { return xdfgetVendorCheckId(); }

    /**
     * Add order-by as ascend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue xdfgetTypeOfChar()
    { if (_typeOfChar == null) { _typeOfChar = nCV(); }
      return _typeOfChar; }
    protected ConditionValue xgetCValueTypeOfChar() { return xdfgetTypeOfChar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("TYPE_OF_CHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("TYPE_OF_CHAR"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue xdfgetTypeOfVarchar()
    { if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
      return _typeOfVarchar; }
    protected ConditionValue xgetCValueTypeOfVarchar() { return xdfgetTypeOfVarchar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected ConditionValue _typeOfText;
    public ConditionValue xdfgetTypeOfText()
    { if (_typeOfText == null) { _typeOfText = nCV(); }
      return _typeOfText; }
    protected ConditionValue xgetCValueTypeOfText() { return xdfgetTypeOfText(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Asc() { regOBA("TYPE_OF_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Desc() { regOBD("TYPE_OF_TEXT"); return this; }

    protected ConditionValue _typeOfTinytext;
    public ConditionValue xdfgetTypeOfTinytext()
    { if (_typeOfTinytext == null) { _typeOfTinytext = nCV(); }
      return _typeOfTinytext; }
    protected ConditionValue xgetCValueTypeOfTinytext() { return xdfgetTypeOfTinytext(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinytext_Asc() { regOBA("TYPE_OF_TINYTEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinytext_Desc() { regOBD("TYPE_OF_TINYTEXT"); return this; }

    protected ConditionValue _typeOfMediumtext;
    public ConditionValue xdfgetTypeOfMediumtext()
    { if (_typeOfMediumtext == null) { _typeOfMediumtext = nCV(); }
      return _typeOfMediumtext; }
    protected ConditionValue xgetCValueTypeOfMediumtext() { return xdfgetTypeOfMediumtext(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumtext_Asc() { regOBA("TYPE_OF_MEDIUMTEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumtext_Desc() { regOBD("TYPE_OF_MEDIUMTEXT"); return this; }

    protected ConditionValue _typeOfLongtext;
    public ConditionValue xdfgetTypeOfLongtext()
    { if (_typeOfLongtext == null) { _typeOfLongtext = nCV(); }
      return _typeOfLongtext; }
    protected ConditionValue xgetCValueTypeOfLongtext() { return xdfgetTypeOfLongtext(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongtext_Asc() { regOBA("TYPE_OF_LONGTEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongtext_Desc() { regOBD("TYPE_OF_LONGTEXT"); return this; }

    protected ConditionValue _typeOfNumericDecimal;
    public ConditionValue xdfgetTypeOfNumericDecimal()
    { if (_typeOfNumericDecimal == null) { _typeOfNumericDecimal = nCV(); }
      return _typeOfNumericDecimal; }
    protected ConditionValue xgetCValueTypeOfNumericDecimal() { return xdfgetTypeOfNumericDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Asc() { regOBA("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Desc() { regOBD("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    protected ConditionValue _typeOfNumericInteger;
    public ConditionValue xdfgetTypeOfNumericInteger()
    { if (_typeOfNumericInteger == null) { _typeOfNumericInteger = nCV(); }
      return _typeOfNumericInteger; }
    protected ConditionValue xgetCValueTypeOfNumericInteger() { return xdfgetTypeOfNumericInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Asc() { regOBA("TYPE_OF_NUMERIC_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Desc() { regOBD("TYPE_OF_NUMERIC_INTEGER"); return this; }

    protected ConditionValue _typeOfNumericBigint;
    public ConditionValue xdfgetTypeOfNumericBigint()
    { if (_typeOfNumericBigint == null) { _typeOfNumericBigint = nCV(); }
      return _typeOfNumericBigint; }
    protected ConditionValue xgetCValueTypeOfNumericBigint() { return xdfgetTypeOfNumericBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Asc() { regOBA("TYPE_OF_NUMERIC_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Desc() { regOBD("TYPE_OF_NUMERIC_BIGINT"); return this; }

    protected ConditionValue _typeOfDecimalDecimal;
    public ConditionValue xdfgetTypeOfDecimalDecimal()
    { if (_typeOfDecimalDecimal == null) { _typeOfDecimalDecimal = nCV(); }
      return _typeOfDecimalDecimal; }
    protected ConditionValue xgetCValueTypeOfDecimalDecimal() { return xdfgetTypeOfDecimalDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Asc() { regOBA("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Desc() { regOBD("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    protected ConditionValue _typeOfDecimalInteger;
    public ConditionValue xdfgetTypeOfDecimalInteger()
    { if (_typeOfDecimalInteger == null) { _typeOfDecimalInteger = nCV(); }
      return _typeOfDecimalInteger; }
    protected ConditionValue xgetCValueTypeOfDecimalInteger() { return xdfgetTypeOfDecimalInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Asc() { regOBA("TYPE_OF_DECIMAL_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Desc() { regOBD("TYPE_OF_DECIMAL_INTEGER"); return this; }

    protected ConditionValue _typeOfDecimalBigint;
    public ConditionValue xdfgetTypeOfDecimalBigint()
    { if (_typeOfDecimalBigint == null) { _typeOfDecimalBigint = nCV(); }
      return _typeOfDecimalBigint; }
    protected ConditionValue xgetCValueTypeOfDecimalBigint() { return xdfgetTypeOfDecimalBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Asc() { regOBA("TYPE_OF_DECIMAL_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Desc() { regOBD("TYPE_OF_DECIMAL_BIGINT"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue xdfgetTypeOfInteger()
    { if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
      return _typeOfInteger; }
    protected ConditionValue xgetCValueTypeOfInteger() { return xdfgetTypeOfInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue xdfgetTypeOfBigint()
    { if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
      return _typeOfBigint; }
    protected ConditionValue xgetCValueTypeOfBigint() { return xdfgetTypeOfBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("TYPE_OF_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("TYPE_OF_BIGINT"); return this; }

    protected ConditionValue _typeOfFloat;
    public ConditionValue xdfgetTypeOfFloat()
    { if (_typeOfFloat == null) { _typeOfFloat = nCV(); }
      return _typeOfFloat; }
    protected ConditionValue xgetCValueTypeOfFloat() { return xdfgetTypeOfFloat(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Asc() { regOBA("TYPE_OF_FLOAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Desc() { regOBD("TYPE_OF_FLOAT"); return this; }

    protected ConditionValue _typeOfDouble;
    public ConditionValue xdfgetTypeOfDouble()
    { if (_typeOfDouble == null) { _typeOfDouble = nCV(); }
      return _typeOfDouble; }
    protected ConditionValue xgetCValueTypeOfDouble() { return xdfgetTypeOfDouble(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Asc() { regOBA("TYPE_OF_DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Desc() { regOBD("TYPE_OF_DOUBLE"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue xdfgetTypeOfDate()
    { if (_typeOfDate == null) { _typeOfDate = nCV(); }
      return _typeOfDate; }
    protected ConditionValue xgetCValueTypeOfDate() { return xdfgetTypeOfDate(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("TYPE_OF_DATE"); return this; }

    protected ConditionValue _typeOfDatetime;
    public ConditionValue xdfgetTypeOfDatetime()
    { if (_typeOfDatetime == null) { _typeOfDatetime = nCV(); }
      return _typeOfDatetime; }
    protected ConditionValue xgetCValueTypeOfDatetime() { return xdfgetTypeOfDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime_Asc() { regOBA("TYPE_OF_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime_Desc() { regOBD("TYPE_OF_DATETIME"); return this; }

    protected ConditionValue _typeOfDatetime3Millis;
    public ConditionValue xdfgetTypeOfDatetime3Millis()
    { if (_typeOfDatetime3Millis == null) { _typeOfDatetime3Millis = nCV(); }
      return _typeOfDatetime3Millis; }
    protected ConditionValue xgetCValueTypeOfDatetime3Millis() { return xdfgetTypeOfDatetime3Millis(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATETIME_3_MILLIS: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime3Millis_Asc() { regOBA("TYPE_OF_DATETIME_3_MILLIS"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATETIME_3_MILLIS: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime3Millis_Desc() { regOBD("TYPE_OF_DATETIME_3_MILLIS"); return this; }

    protected ConditionValue _typeOfDatetime6Micros;
    public ConditionValue xdfgetTypeOfDatetime6Micros()
    { if (_typeOfDatetime6Micros == null) { _typeOfDatetime6Micros = nCV(); }
      return _typeOfDatetime6Micros; }
    protected ConditionValue xgetCValueTypeOfDatetime6Micros() { return xdfgetTypeOfDatetime6Micros(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATETIME_6_MICROS: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime6Micros_Asc() { regOBA("TYPE_OF_DATETIME_6_MICROS"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATETIME_6_MICROS: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime6Micros_Desc() { regOBD("TYPE_OF_DATETIME_6_MICROS"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue xdfgetTypeOfTimestamp()
    { if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
      return _typeOfTimestamp; }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return xdfgetTypeOfTimestamp(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfTime;
    public ConditionValue xdfgetTypeOfTime()
    { if (_typeOfTime == null) { _typeOfTime = nCV(); }
      return _typeOfTime; }
    protected ConditionValue xgetCValueTypeOfTime() { return xdfgetTypeOfTime(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Asc() { regOBA("TYPE_OF_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Desc() { regOBD("TYPE_OF_TIME"); return this; }

    protected ConditionValue _typeOfYear;
    public ConditionValue xdfgetTypeOfYear()
    { if (_typeOfYear == null) { _typeOfYear = nCV(); }
      return _typeOfYear; }
    protected ConditionValue xgetCValueTypeOfYear() { return xdfgetTypeOfYear(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfYear_Asc() { regOBA("TYPE_OF_YEAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_YEAR: {YEAR}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfYear_Desc() { regOBD("TYPE_OF_YEAR"); return this; }

    protected ConditionValue _typeOfBoolean;
    public ConditionValue xdfgetTypeOfBoolean()
    { if (_typeOfBoolean == null) { _typeOfBoolean = nCV(); }
      return _typeOfBoolean; }
    protected ConditionValue xgetCValueTypeOfBoolean() { return xdfgetTypeOfBoolean(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBoolean_Asc() { regOBA("TYPE_OF_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBoolean_Desc() { regOBD("TYPE_OF_BOOLEAN"); return this; }

    protected ConditionValue _typeOfBlob;
    public ConditionValue xdfgetTypeOfBlob()
    { if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
      return _typeOfBlob; }
    protected ConditionValue xgetCValueTypeOfBlob() { return xdfgetTypeOfBlob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BLOB: {BLOB(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Asc() { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BLOB: {BLOB(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Desc() { regOBD("TYPE_OF_BLOB"); return this; }

    protected ConditionValue _typeOfTinyblob;
    public ConditionValue xdfgetTypeOfTinyblob()
    { if (_typeOfTinyblob == null) { _typeOfTinyblob = nCV(); }
      return _typeOfTinyblob; }
    protected ConditionValue xgetCValueTypeOfTinyblob() { return xdfgetTypeOfTinyblob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinyblob_Asc() { regOBA("TYPE_OF_TINYBLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinyblob_Desc() { regOBD("TYPE_OF_TINYBLOB"); return this; }

    protected ConditionValue _typeOfMediumblob;
    public ConditionValue xdfgetTypeOfMediumblob()
    { if (_typeOfMediumblob == null) { _typeOfMediumblob = nCV(); }
      return _typeOfMediumblob; }
    protected ConditionValue xgetCValueTypeOfMediumblob() { return xdfgetTypeOfMediumblob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumblob_Asc() { regOBA("TYPE_OF_MEDIUMBLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumblob_Desc() { regOBD("TYPE_OF_MEDIUMBLOB"); return this; }

    protected ConditionValue _typeOfLongblob;
    public ConditionValue xdfgetTypeOfLongblob()
    { if (_typeOfLongblob == null) { _typeOfLongblob = nCV(); }
      return _typeOfLongblob; }
    protected ConditionValue xgetCValueTypeOfLongblob() { return xdfgetTypeOfLongblob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongblob_Asc() { regOBA("TYPE_OF_LONGBLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongblob_Desc() { regOBD("TYPE_OF_LONGBLOB"); return this; }

    protected ConditionValue _typeOfBinary;
    public ConditionValue xdfgetTypeOfBinary()
    { if (_typeOfBinary == null) { _typeOfBinary = nCV(); }
      return _typeOfBinary; }
    protected ConditionValue xgetCValueTypeOfBinary() { return xdfgetTypeOfBinary(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BINARY: {BINARY(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinary_Asc() { regOBA("TYPE_OF_BINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BINARY: {BINARY(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinary_Desc() { regOBD("TYPE_OF_BINARY"); return this; }

    protected ConditionValue _typeOfVarbinary;
    public ConditionValue xdfgetTypeOfVarbinary()
    { if (_typeOfVarbinary == null) { _typeOfVarbinary = nCV(); }
      return _typeOfVarbinary; }
    protected ConditionValue xgetCValueTypeOfVarbinary() { return xdfgetTypeOfVarbinary(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarbinary_Asc() { regOBA("TYPE_OF_VARBINARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarbinary_Desc() { regOBD("TYPE_OF_VARBINARY"); return this; }

    protected ConditionValue _typeOfEnum;
    public ConditionValue xdfgetTypeOfEnum()
    { if (_typeOfEnum == null) { _typeOfEnum = nCV(); }
      return _typeOfEnum; }
    protected ConditionValue xgetCValueTypeOfEnum() { return xdfgetTypeOfEnum(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfEnum_Asc() { regOBA("TYPE_OF_ENUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_ENUM: {ENUM(6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfEnum_Desc() { regOBD("TYPE_OF_ENUM"); return this; }

    protected ConditionValue _typeOfSet;
    public ConditionValue xdfgetTypeOfSet()
    { if (_typeOfSet == null) { _typeOfSet = nCV(); }
      return _typeOfSet; }
    protected ConditionValue xgetCValueTypeOfSet() { return xdfgetTypeOfSet(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_SET: {SET(15)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSet_Asc() { regOBA("TYPE_OF_SET"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_SET: {SET(15)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSet_Desc() { regOBD("TYPE_OF_SET"); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorCheckCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorCheckCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorCheckCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorCheckCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
