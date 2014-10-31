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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_IMPLICIT_REVERSE_FK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 * 
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_ID, WHITE_IMPLICIT_REVERSE_FK_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     WHITE_IMPLICIT_REVERSE_FK_REF(WithImplicitReverseFK), WHITE_IMPLICIT_REVERSE_FK_SUPPRESS(SuppressImplicitReverseFK)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteImplicitReverseFkRefWithImplicitReverseFK, whiteImplicitReverseFkSuppressSuppressImplicitReverseFK
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer whiteImplicitReverseFkId = entity.getWhiteImplicitReverseFkId();
 * String whiteImplicitReverseFkName = entity.getWhiteImplicitReverseFkName();
 * entity.setWhiteImplicitReverseFkId(whiteImplicitReverseFkId);
 * entity.setWhiteImplicitReverseFkName(whiteImplicitReverseFkName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF} */
    protected Integer _whiteImplicitReverseFkId;

    /** WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} */
    protected String _whiteImplicitReverseFkName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "white_implicit_reverse_fk";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "whiteImplicitReverseFk";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_whiteImplicitReverseFkId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'. */
    protected WhiteImplicitReverseFkRef _whiteImplicitReverseFkRefWithImplicitReverseFK;

    /**
     * [get] white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'. <br>
     * @return The entity of foreign property 'whiteImplicitReverseFkRefWithImplicitReverseFK'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitReverseFkRef getWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        return _whiteImplicitReverseFkRefWithImplicitReverseFK;
    }

    /**
     * [set] white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @param whiteImplicitReverseFkRefWithImplicitReverseFK The entity of foreign property 'whiteImplicitReverseFkRefWithImplicitReverseFK'. (NullAllowed)
     */
    public void setWhiteImplicitReverseFkRefWithImplicitReverseFK(WhiteImplicitReverseFkRef whiteImplicitReverseFkRefWithImplicitReverseFK) {
        _whiteImplicitReverseFkRefWithImplicitReverseFK = whiteImplicitReverseFkRefWithImplicitReverseFK;
    }

    /** white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. */
    protected WhiteImplicitReverseFkSuppress _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;

    /**
     * [get] white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. <br>
     * @return The entity of foreign property 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitReverseFkSuppress getWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        return _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }

    /**
     * [set] white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @param whiteImplicitReverseFkSuppressSuppressImplicitReverseFK The entity of foreign property 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'. (NullAllowed)
     */
    public void setWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppressSuppressImplicitReverseFK) {
        _whiteImplicitReverseFkSuppressSuppressImplicitReverseFK = whiteImplicitReverseFkSuppressSuppressImplicitReverseFK;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteImplicitReverseFk) {
            BsWhiteImplicitReverseFk other = (BsWhiteImplicitReverseFk)obj;
            if (!xSV(_whiteImplicitReverseFkId, other._whiteImplicitReverseFkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _whiteImplicitReverseFkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitReverseFkRefWithImplicitReverseFK != null)
        { sb.append(li).append(xbRDS(_whiteImplicitReverseFkRefWithImplicitReverseFK, "whiteImplicitReverseFkRefWithImplicitReverseFK")); }
        if (_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK != null)
        { sb.append(li).append(xbRDS(_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK, "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_whiteImplicitReverseFkId));
        sb.append(dm).append(xfND(_whiteImplicitReverseFkName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitReverseFkRefWithImplicitReverseFK != null)
        { sb.append(dm).append("whiteImplicitReverseFkRefWithImplicitReverseFK"); }
        if (_whiteImplicitReverseFkSuppressSuppressImplicitReverseFK != null)
        { sb.append(dm).append("whiteImplicitReverseFkSuppressSuppressImplicitReverseFK"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteImplicitReverseFk clone() {
        return (WhiteImplicitReverseFk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF} <br>
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkId() {
        checkSpecifiedProperty("whiteImplicitReverseFkId");
        return _whiteImplicitReverseFkId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF} <br>
     * @param whiteImplicitReverseFkId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkId(Integer whiteImplicitReverseFkId) {
        registerModifiedProperty("whiteImplicitReverseFkId");
        _whiteImplicitReverseFkId = whiteImplicitReverseFkId;
    }

    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWhiteImplicitReverseFkName() {
        checkSpecifiedProperty("whiteImplicitReverseFkName");
        return _whiteImplicitReverseFkName;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param whiteImplicitReverseFkName The value of the column 'WHITE_IMPLICIT_REVERSE_FK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkName(String whiteImplicitReverseFkName) {
        registerModifiedProperty("whiteImplicitReverseFkName");
        _whiteImplicitReverseFkName = whiteImplicitReverseFkName;
    }
}
