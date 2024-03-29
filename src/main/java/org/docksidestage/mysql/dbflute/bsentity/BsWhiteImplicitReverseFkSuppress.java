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
 * The entity of WHITE_IMPLICIT_REVERSE_FK_SUPPRESS as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkSuppress extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _whiteImplicitReverseFkSuppressId;

    /** WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)} */
    protected Integer _whiteImplicitReverseFkId;

    /** VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} */
    protected java.time.LocalDate _validBeginDate;

    /** VALID_END_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _validEndDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_implicit_reverse_fk_suppress";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_whiteImplicitReverseFkSuppressId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param whiteImplicitReverseFkId : UQ+, NotNull, INT(10). (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(10). (NotNull)
     */
    public void uniqueBy(Integer whiteImplicitReverseFkId, java.time.LocalDate validBeginDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("whiteImplicitReverseFkId");
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        setWhiteImplicitReverseFkId(whiteImplicitReverseFkId);setValidBeginDate(validBeginDate);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteImplicitReverseFkSuppress) {
            BsWhiteImplicitReverseFkSuppress other = (BsWhiteImplicitReverseFkSuppress)obj;
            if (!xSV(_whiteImplicitReverseFkSuppressId, other._whiteImplicitReverseFkSuppressId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _whiteImplicitReverseFkSuppressId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_whiteImplicitReverseFkSuppressId));
        sb.append(dm).append(xfND(_whiteImplicitReverseFkId));
        sb.append(dm).append(xfND(_validBeginDate));
        sb.append(dm).append(xfND(_validEndDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteImplicitReverseFkSuppress clone() {
        return (WhiteImplicitReverseFkSuppress)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkSuppressId() {
        checkSpecifiedProperty("whiteImplicitReverseFkSuppressId");
        return _whiteImplicitReverseFkSuppressId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param whiteImplicitReverseFkSuppressId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkSuppressId(Integer whiteImplicitReverseFkSuppressId) {
        registerModifiedProperty("whiteImplicitReverseFkSuppressId");
        _whiteImplicitReverseFkSuppressId = whiteImplicitReverseFkSuppressId;
    }

    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)} <br>
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkId() {
        checkSpecifiedProperty("whiteImplicitReverseFkId");
        return _whiteImplicitReverseFkId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)} <br>
     * @param whiteImplicitReverseFkId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkId(Integer whiteImplicitReverseFkId) {
        registerModifiedProperty("whiteImplicitReverseFkId");
        _whiteImplicitReverseFkId = whiteImplicitReverseFkId;
    }

    /**
     * [get] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br>
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getValidBeginDate() {
        checkSpecifiedProperty("validBeginDate");
        return _validBeginDate;
    }

    /**
     * [set] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br>
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidBeginDate(java.time.LocalDate validBeginDate) {
        registerModifiedProperty("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] VALID_END_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getValidEndDate() {
        checkSpecifiedProperty("validEndDate");
        return _validEndDate;
    }

    /**
     * [set] VALID_END_DATE: {NotNull, DATE(10)} <br>
     * @param validEndDate The value of the column 'VALID_END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidEndDate(java.time.LocalDate validEndDate) {
        registerModifiedProperty("validEndDate");
        _validEndDate = validEndDate;
    }
}
