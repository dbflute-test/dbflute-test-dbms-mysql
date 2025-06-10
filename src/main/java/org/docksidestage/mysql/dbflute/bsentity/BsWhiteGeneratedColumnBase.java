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
 * The entity of WHITE_GENERATED_COLUMN_BASE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteGeneratedColumnBase extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _columnBaseId;

    /** COLUMN_BASE_NAME: {NotNull, VARCHAR(200)} */
    protected String _columnBaseName;

    /** COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)} */
    protected Integer _columnBaseNumberFirst;

    /** COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)} */
    protected Integer _columnBaseNumberSecond;

    /** COLUMN_BASE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _columnBaseDatetime;

    /** COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)} */
    protected java.time.LocalDate _columnBaseVirtualDateCast;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_generated_column_base";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_columnBaseId == null) { return false; }
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
        if (obj instanceof BsWhiteGeneratedColumnBase) {
            BsWhiteGeneratedColumnBase other = (BsWhiteGeneratedColumnBase)obj;
            if (!xSV(_columnBaseId, other._columnBaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _columnBaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_columnBaseId));
        sb.append(dm).append(xfND(_columnBaseName));
        sb.append(dm).append(xfND(_columnBaseNumberFirst));
        sb.append(dm).append(xfND(_columnBaseNumberSecond));
        sb.append(dm).append(xfND(_columnBaseDatetime));
        sb.append(dm).append(xfND(_columnBaseVirtualDateCast));
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
    public WhiteGeneratedColumnBase clone() {
        return (WhiteGeneratedColumnBase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'COLUMN_BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getColumnBaseId() {
        checkSpecifiedProperty("columnBaseId");
        return _columnBaseId;
    }

    /**
     * [set] COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param columnBaseId The value of the column 'COLUMN_BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setColumnBaseId(Long columnBaseId) {
        registerModifiedProperty("columnBaseId");
        _columnBaseId = columnBaseId;
    }

    /**
     * [get] COLUMN_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'COLUMN_BASE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getColumnBaseName() {
        checkSpecifiedProperty("columnBaseName");
        return _columnBaseName;
    }

    /**
     * [set] COLUMN_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param columnBaseName The value of the column 'COLUMN_BASE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setColumnBaseName(String columnBaseName) {
        registerModifiedProperty("columnBaseName");
        _columnBaseName = columnBaseName;
    }

    /**
     * [get] COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)} <br>
     * @return The value of the column 'COLUMN_BASE_NUMBER_FIRST'. (basically NotNull if selected: for the constraint)
     */
    public Integer getColumnBaseNumberFirst() {
        checkSpecifiedProperty("columnBaseNumberFirst");
        return _columnBaseNumberFirst;
    }

    /**
     * [set] COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)} <br>
     * @param columnBaseNumberFirst The value of the column 'COLUMN_BASE_NUMBER_FIRST'. (basically NotNull if update: for the constraint)
     */
    public void setColumnBaseNumberFirst(Integer columnBaseNumberFirst) {
        registerModifiedProperty("columnBaseNumberFirst");
        _columnBaseNumberFirst = columnBaseNumberFirst;
    }

    /**
     * [get] COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)} <br>
     * @return The value of the column 'COLUMN_BASE_NUMBER_SECOND'. (basically NotNull if selected: for the constraint)
     */
    public Integer getColumnBaseNumberSecond() {
        checkSpecifiedProperty("columnBaseNumberSecond");
        return _columnBaseNumberSecond;
    }

    /**
     * [set] COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)} <br>
     * @param columnBaseNumberSecond The value of the column 'COLUMN_BASE_NUMBER_SECOND'. (basically NotNull if update: for the constraint)
     */
    public void setColumnBaseNumberSecond(Integer columnBaseNumberSecond) {
        registerModifiedProperty("columnBaseNumberSecond");
        _columnBaseNumberSecond = columnBaseNumberSecond;
    }

    /**
     * [get] COLUMN_BASE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'COLUMN_BASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getColumnBaseDatetime() {
        checkSpecifiedProperty("columnBaseDatetime");
        return _columnBaseDatetime;
    }

    /**
     * [set] COLUMN_BASE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param columnBaseDatetime The value of the column 'COLUMN_BASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setColumnBaseDatetime(java.time.LocalDateTime columnBaseDatetime) {
        registerModifiedProperty("columnBaseDatetime");
        _columnBaseDatetime = columnBaseDatetime;
    }

    /**
     * [get] COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)} <br>
     * @return The value of the column 'COLUMN_BASE_VIRTUAL_DATE_CAST'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getColumnBaseVirtualDateCast() {
        checkSpecifiedProperty("columnBaseVirtualDateCast");
        return _columnBaseVirtualDateCast;
    }

    /**
     * [set] COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)} <br>
     * @param columnBaseVirtualDateCast The value of the column 'COLUMN_BASE_VIRTUAL_DATE_CAST'. (basically NotNull if update: for the constraint)
     */
    public void setColumnBaseVirtualDateCast(java.time.LocalDate columnBaseVirtualDateCast) {
        registerModifiedProperty("columnBaseVirtualDateCast");
        _columnBaseVirtualDateCast = columnBaseVirtualDateCast;
    }
}
