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
 * The entity of (WXADD)WHITE_ADDITIONAL as TABLE. <br>
 * test table for additionalTable
 * <pre>
 * [primary-key]
 *     foo_id
 *
 * [column]
 *     foo_id, foo_name, foo_date, register_datetime
 *
 * [sequence]
 *     
 *
 * [identity]
 *     foo_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.time.LocalDate fooDate = entity.getFooDate();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setFooDate(fooDate);
 * entity.setRegisterDatetime(registerDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAdditional extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** foo_id: {PK, ID, NotNull, INTEGER} */
    protected Integer _fooId;

    /** (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} */
    protected String _fooName;

    /** foo_date: {UnknownType} */
    protected java.time.LocalDate _fooDate;

    /** register_datetime: {DATETIME(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _registerDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_additional";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fooId == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteAdditional) {
            BsWhiteAdditional other = (BsWhiteAdditional)obj;
            if (!xSV(_fooId, other._fooId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fooId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fooId));
        sb.append(dm).append(xfND(_fooName));
        sb.append(dm).append(xfND(_fooDate));
        sb.append(dm).append(xfND(_registerDatetime));
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
    public WhiteAdditional clone() {
        return (WhiteAdditional)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] foo_id: {PK, ID, NotNull, INTEGER} <br>
     * @return The value of the column 'foo_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFooId() {
        checkSpecifiedProperty("fooId");
        return _fooId;
    }

    /**
     * [set] foo_id: {PK, ID, NotNull, INTEGER} <br>
     * @param fooId The value of the column 'foo_id'. (basically NotNull if update: for the constraint)
     */
    public void setFooId(Integer fooId) {
        registerModifiedProperty("fooId");
        _fooId = fooId;
    }

    /**
     * [get] (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} <br>
     * It's joke!
     * @return The value of the column 'foo_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFooName() {
        checkSpecifiedProperty("fooName");
        return _fooName;
    }

    /**
     * [set] (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} <br>
     * It's joke!
     * @param fooName The value of the column 'foo_name'. (basically NotNull if update: for the constraint)
     */
    public void setFooName(String fooName) {
        registerModifiedProperty("fooName");
        _fooName = fooName;
    }

    /**
     * [get] foo_date: {UnknownType} <br>
     * @return The value of the column 'foo_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getFooDate() {
        checkSpecifiedProperty("fooDate");
        return _fooDate;
    }

    /**
     * [set] foo_date: {UnknownType} <br>
     * @param fooDate The value of the column 'foo_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDate(java.time.LocalDate fooDate) {
        registerModifiedProperty("fooDate");
        _fooDate = fooDate;
    }

    /**
     * [get] register_datetime: {DATETIME(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'register_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {DATETIME(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }
}
