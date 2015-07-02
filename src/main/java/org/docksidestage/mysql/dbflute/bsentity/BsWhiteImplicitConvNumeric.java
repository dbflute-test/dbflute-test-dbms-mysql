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
package org.docksidestage.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_IMPLICIT_CONV_NUMERIC as TABLE. <br>
 * <pre>
 * [primary-key]
 *     IMPLICIT_CONV_NUMERIC_ID
 * 
 * [column]
 *     IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_STRING
 * 
 * [referrer table]
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_STRING
 * 
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvString
 * 
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvStringList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal implicitConvNumericId = entity.getImplicitConvNumericId();
 * java.math.BigDecimal implicitConvIntegerId = entity.getImplicitConvIntegerId();
 * java.math.BigDecimal implicitConvStringId = entity.getImplicitConvStringId();
 * String implicitConvName = entity.getImplicitConvName();
 * entity.setImplicitConvNumericId(implicitConvNumericId);
 * entity.setImplicitConvIntegerId(implicitConvIntegerId);
 * entity.setImplicitConvStringId(implicitConvStringId);
 * entity.setImplicitConvName(implicitConvName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvNumeric extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)} */
    protected java.math.BigDecimal _implicitConvNumericId;

    /** IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER} */
    protected java.math.BigDecimal _implicitConvIntegerId;

    /** IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING} */
    protected java.math.BigDecimal _implicitConvStringId;

    /** IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} */
    protected String _implicitConvName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_implicit_conv_numeric";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_implicitConvNumericId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_IMPLICIT_CONV_INTEGER by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'. */
    protected OptionalEntity<WhiteImplicitConvInteger> _whiteImplicitConvInteger;

    /**
     * [get] WHITE_IMPLICIT_CONV_INTEGER by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteImplicitConvInteger'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteImplicitConvInteger> getWhiteImplicitConvInteger() {
        if (_whiteImplicitConvInteger == null) { _whiteImplicitConvInteger = OptionalEntity.relationEmpty(this, "whiteImplicitConvInteger"); }
        return _whiteImplicitConvInteger;
    }

    /**
     * [set] WHITE_IMPLICIT_CONV_INTEGER by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param whiteImplicitConvInteger The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed)
     */
    public void setWhiteImplicitConvInteger(OptionalEntity<WhiteImplicitConvInteger> whiteImplicitConvInteger) {
        _whiteImplicitConvInteger = whiteImplicitConvInteger;
    }

    /** WHITE_IMPLICIT_CONV_STRING by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'. */
    protected OptionalEntity<WhiteImplicitConvString> _whiteImplicitConvString;

    /**
     * [get] WHITE_IMPLICIT_CONV_STRING by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteImplicitConvString'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteImplicitConvString> getWhiteImplicitConvString() {
        if (_whiteImplicitConvString == null) { _whiteImplicitConvString = OptionalEntity.relationEmpty(this, "whiteImplicitConvString"); }
        return _whiteImplicitConvString;
    }

    /**
     * [set] WHITE_IMPLICIT_CONV_STRING by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @param whiteImplicitConvString The entity of foreign property 'whiteImplicitConvString'. (NullAllowed)
     */
    public void setWhiteImplicitConvString(OptionalEntity<WhiteImplicitConvString> whiteImplicitConvString) {
        _whiteImplicitConvString = whiteImplicitConvString;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_IMPLICIT_CONV_INTEGER by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'. */
    protected List<WhiteImplicitConvInteger> _whiteImplicitConvIntegerList;

    /**
     * [get] WHITE_IMPLICIT_CONV_INTEGER by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * @return The entity list of referrer property 'whiteImplicitConvIntegerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvInteger> getWhiteImplicitConvIntegerList() {
        if (_whiteImplicitConvIntegerList == null) { _whiteImplicitConvIntegerList = newReferrerList(); }
        return _whiteImplicitConvIntegerList;
    }

    /**
     * [set] WHITE_IMPLICIT_CONV_INTEGER by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * @param whiteImplicitConvIntegerList The entity list of referrer property 'whiteImplicitConvIntegerList'. (NullAllowed)
     */
    public void setWhiteImplicitConvIntegerList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        _whiteImplicitConvIntegerList = whiteImplicitConvIntegerList;
    }

    /** WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'. */
    protected List<WhiteImplicitConvString> _whiteImplicitConvStringList;

    /**
     * [get] WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * @return The entity list of referrer property 'whiteImplicitConvStringList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvString> getWhiteImplicitConvStringList() {
        if (_whiteImplicitConvStringList == null) { _whiteImplicitConvStringList = newReferrerList(); }
        return _whiteImplicitConvStringList;
    }

    /**
     * [set] WHITE_IMPLICIT_CONV_STRING by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * @param whiteImplicitConvStringList The entity list of referrer property 'whiteImplicitConvStringList'. (NullAllowed)
     */
    public void setWhiteImplicitConvStringList(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        _whiteImplicitConvStringList = whiteImplicitConvStringList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteImplicitConvNumeric) {
            BsWhiteImplicitConvNumeric other = (BsWhiteImplicitConvNumeric)obj;
            if (!xSV(_implicitConvNumericId, other._implicitConvNumericId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _implicitConvNumericId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitConvInteger != null && _whiteImplicitConvInteger.isPresent())
        { sb.append(li).append(xbRDS(_whiteImplicitConvInteger, "whiteImplicitConvInteger")); }
        if (_whiteImplicitConvString != null && _whiteImplicitConvString.isPresent())
        { sb.append(li).append(xbRDS(_whiteImplicitConvString, "whiteImplicitConvString")); }
        if (_whiteImplicitConvIntegerList != null) { for (WhiteImplicitConvInteger et : _whiteImplicitConvIntegerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvIntegerList")); } } }
        if (_whiteImplicitConvStringList != null) { for (WhiteImplicitConvString et : _whiteImplicitConvStringList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvStringList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_implicitConvNumericId));
        sb.append(dm).append(xfND(_implicitConvIntegerId));
        sb.append(dm).append(xfND(_implicitConvStringId));
        sb.append(dm).append(xfND(_implicitConvName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitConvInteger != null && _whiteImplicitConvInteger.isPresent())
        { sb.append(dm).append("whiteImplicitConvInteger"); }
        if (_whiteImplicitConvString != null && _whiteImplicitConvString.isPresent())
        { sb.append(dm).append("whiteImplicitConvString"); }
        if (_whiteImplicitConvIntegerList != null && !_whiteImplicitConvIntegerList.isEmpty())
        { sb.append(dm).append("whiteImplicitConvIntegerList"); }
        if (_whiteImplicitConvStringList != null && !_whiteImplicitConvStringList.isEmpty())
        { sb.append(dm).append("whiteImplicitConvStringList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteImplicitConvNumeric clone() {
        return (WhiteImplicitConvNumeric)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)} <br>
     * @return The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImplicitConvNumericId() {
        checkSpecifiedProperty("implicitConvNumericId");
        return _implicitConvNumericId;
    }

    /**
     * [set] IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)} <br>
     * @param implicitConvNumericId The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvNumericId(java.math.BigDecimal implicitConvNumericId) {
        registerModifiedProperty("implicitConvNumericId");
        _implicitConvNumericId = implicitConvNumericId;
    }

    /**
     * [get] IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER} <br>
     * @return The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImplicitConvIntegerId() {
        checkSpecifiedProperty("implicitConvIntegerId");
        return _implicitConvIntegerId;
    }

    /**
     * [set] IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER} <br>
     * @param implicitConvIntegerId The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvIntegerId(java.math.BigDecimal implicitConvIntegerId) {
        registerModifiedProperty("implicitConvIntegerId");
        _implicitConvIntegerId = implicitConvIntegerId;
    }

    /**
     * [get] IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING} <br>
     * @return The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImplicitConvStringId() {
        checkSpecifiedProperty("implicitConvStringId");
        return _implicitConvStringId;
    }

    /**
     * [set] IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING} <br>
     * @param implicitConvStringId The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvStringId(java.math.BigDecimal implicitConvStringId) {
        registerModifiedProperty("implicitConvStringId");
        _implicitConvStringId = implicitConvStringId;
    }

    /**
     * [get] IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'IMPLICIT_CONV_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvName() {
        checkSpecifiedProperty("implicitConvName");
        return _implicitConvName;
    }

    /**
     * [set] IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br>
     * @param implicitConvName The value of the column 'IMPLICIT_CONV_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvName(String implicitConvName) {
        registerModifiedProperty("implicitConvName");
        _implicitConvName = implicitConvName;
    }
}
