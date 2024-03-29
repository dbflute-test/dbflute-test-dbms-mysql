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
 * The entity of WHITE_INCLUDE_QUERY as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteIncludeQuery extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _includeQueryId;

    /** INCLUDE_QUERY_VARCHAR: {VARCHAR(100)} */
    protected String _includeQueryVarchar;

    /** INCLUDE_QUERY_INTEGER: {INT(10)} */
    protected Integer _includeQueryInteger;

    /** INCLUDE_QUERY_DATE: {DATE(10)} */
    protected java.time.LocalDate _includeQueryDate;

    /** INCLUDE_QUERY_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _includeQueryDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_include_query";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_includeQueryId == null) { return false; }
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
        if (obj instanceof BsWhiteIncludeQuery) {
            BsWhiteIncludeQuery other = (BsWhiteIncludeQuery)obj;
            if (!xSV(_includeQueryId, other._includeQueryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _includeQueryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_includeQueryId));
        sb.append(dm).append(xfND(_includeQueryVarchar));
        sb.append(dm).append(xfND(_includeQueryInteger));
        sb.append(dm).append(xfND(_includeQueryDate));
        sb.append(dm).append(xfND(_includeQueryDatetime));
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
    public WhiteIncludeQuery clone() {
        return (WhiteIncludeQuery)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'INCLUDE_QUERY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getIncludeQueryId() {
        checkSpecifiedProperty("includeQueryId");
        return _includeQueryId;
    }

    /**
     * [set] INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param includeQueryId The value of the column 'INCLUDE_QUERY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setIncludeQueryId(Long includeQueryId) {
        registerModifiedProperty("includeQueryId");
        _includeQueryId = includeQueryId;
    }

    /**
     * [get] INCLUDE_QUERY_VARCHAR: {VARCHAR(100)} <br>
     * @return The value of the column 'INCLUDE_QUERY_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludeQueryVarchar() {
        checkSpecifiedProperty("includeQueryVarchar");
        return _includeQueryVarchar;
    }

    /**
     * [set] INCLUDE_QUERY_VARCHAR: {VARCHAR(100)} <br>
     * @param includeQueryVarchar The value of the column 'INCLUDE_QUERY_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryVarchar(String includeQueryVarchar) {
        registerModifiedProperty("includeQueryVarchar");
        _includeQueryVarchar = includeQueryVarchar;
    }

    /**
     * [get] INCLUDE_QUERY_INTEGER: {INT(10)} <br>
     * @return The value of the column 'INCLUDE_QUERY_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getIncludeQueryInteger() {
        checkSpecifiedProperty("includeQueryInteger");
        return _includeQueryInteger;
    }

    /**
     * [set] INCLUDE_QUERY_INTEGER: {INT(10)} <br>
     * @param includeQueryInteger The value of the column 'INCLUDE_QUERY_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryInteger(Integer includeQueryInteger) {
        registerModifiedProperty("includeQueryInteger");
        _includeQueryInteger = includeQueryInteger;
    }

    /**
     * [get] INCLUDE_QUERY_DATE: {DATE(10)} <br>
     * @return The value of the column 'INCLUDE_QUERY_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getIncludeQueryDate() {
        checkSpecifiedProperty("includeQueryDate");
        return _includeQueryDate;
    }

    /**
     * [set] INCLUDE_QUERY_DATE: {DATE(10)} <br>
     * @param includeQueryDate The value of the column 'INCLUDE_QUERY_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryDate(java.time.LocalDate includeQueryDate) {
        registerModifiedProperty("includeQueryDate");
        _includeQueryDate = includeQueryDate;
    }

    /**
     * [get] INCLUDE_QUERY_DATETIME: {DATETIME(19)} <br>
     * @return The value of the column 'INCLUDE_QUERY_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getIncludeQueryDatetime() {
        checkSpecifiedProperty("includeQueryDatetime");
        return _includeQueryDatetime;
    }

    /**
     * [set] INCLUDE_QUERY_DATETIME: {DATETIME(19)} <br>
     * @param includeQueryDatetime The value of the column 'INCLUDE_QUERY_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryDatetime(java.time.LocalDateTime includeQueryDatetime) {
        registerModifiedProperty("includeQueryDatetime");
        _includeQueryDatetime = includeQueryDatetime;
    }
}
