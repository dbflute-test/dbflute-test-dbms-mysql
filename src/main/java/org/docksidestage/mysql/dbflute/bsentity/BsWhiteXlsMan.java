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
 * The entity of WHITE_XLS_MAN as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteXlsMan extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _xlsManId;

    /** STRING_CONVERTED: {VARCHAR(200)} */
    protected String _stringConverted;

    /** TIMESTAMP_CONVERTED: {DATETIME(19)} */
    protected java.time.LocalDateTime _timestampConverted;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_xls_man";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_xlsManId == null) { return false; }
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
        if (obj instanceof BsWhiteXlsMan) {
            BsWhiteXlsMan other = (BsWhiteXlsMan)obj;
            if (!xSV(_xlsManId, other._xlsManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _xlsManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_xlsManId));
        sb.append(dm).append(xfND(_stringConverted));
        sb.append(dm).append(xfND(_timestampConverted));
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
    public WhiteXlsMan clone() {
        return (WhiteXlsMan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'XLS_MAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getXlsManId() {
        checkSpecifiedProperty("xlsManId");
        return _xlsManId;
    }

    /**
     * [set] XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param xlsManId The value of the column 'XLS_MAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setXlsManId(Long xlsManId) {
        registerModifiedProperty("xlsManId");
        _xlsManId = xlsManId;
    }

    /**
     * [get] STRING_CONVERTED: {VARCHAR(200)} <br>
     * @return The value of the column 'STRING_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        checkSpecifiedProperty("stringConverted");
        return _stringConverted;
    }

    /**
     * [set] STRING_CONVERTED: {VARCHAR(200)} <br>
     * @param stringConverted The value of the column 'STRING_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        registerModifiedProperty("stringConverted");
        _stringConverted = stringConverted;
    }

    /**
     * [get] TIMESTAMP_CONVERTED: {DATETIME(19)} <br>
     * @return The value of the column 'TIMESTAMP_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTimestampConverted() {
        checkSpecifiedProperty("timestampConverted");
        return _timestampConverted;
    }

    /**
     * [set] TIMESTAMP_CONVERTED: {DATETIME(19)} <br>
     * @param timestampConverted The value of the column 'TIMESTAMP_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampConverted(java.time.LocalDateTime timestampConverted) {
        registerModifiedProperty("timestampConverted");
        _timestampConverted = timestampConverted;
    }
}
