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
 * The entity of WHITE_POINT_TYPE_MAPPING as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePointTypeMapping extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _pointTypeMappingId;

    /** POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)} */
    protected org.docksidestage.mysql.mytype.MyMemberName _pointTypeMappingMemberName;

    /** POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)} */
    protected org.docksidestage.mysql.mytype.MyPriceCount _pointTypeMappingPriceCount;

    /** POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)} */
    protected org.docksidestage.mysql.mytype.MySaleDate _pointTypeMappingSaleDate;

    /** POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDate _pointTypeMappingWantedDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_point_type_mapping";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_pointTypeMappingId == null) { return false; }
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
        if (obj instanceof BsWhitePointTypeMapping) {
            BsWhitePointTypeMapping other = (BsWhitePointTypeMapping)obj;
            if (!xSV(_pointTypeMappingId, other._pointTypeMappingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pointTypeMappingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pointTypeMappingId));
        sb.append(dm).append(xfND(_pointTypeMappingMemberName));
        sb.append(dm).append(xfND(_pointTypeMappingPriceCount));
        sb.append(dm).append(xfND(_pointTypeMappingSaleDate));
        sb.append(dm).append(xfND(_pointTypeMappingWantedDatetime));
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
    public WhitePointTypeMapping clone() {
        return (WhitePointTypeMapping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'POINT_TYPE_MAPPING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPointTypeMappingId() {
        checkSpecifiedProperty("pointTypeMappingId");
        return _pointTypeMappingId;
    }

    /**
     * [set] POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param pointTypeMappingId The value of the column 'POINT_TYPE_MAPPING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPointTypeMappingId(Long pointTypeMappingId) {
        registerModifiedProperty("pointTypeMappingId");
        _pointTypeMappingId = pointTypeMappingId;
    }

    /**
     * [get] POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)} <br>
     * @return The value of the column 'POINT_TYPE_MAPPING_MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.mysql.mytype.MyMemberName getPointTypeMappingMemberName() {
        checkSpecifiedProperty("pointTypeMappingMemberName");
        return _pointTypeMappingMemberName;
    }

    /**
     * [set] POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)} <br>
     * @param pointTypeMappingMemberName The value of the column 'POINT_TYPE_MAPPING_MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingMemberName(org.docksidestage.mysql.mytype.MyMemberName pointTypeMappingMemberName) {
        registerModifiedProperty("pointTypeMappingMemberName");
        _pointTypeMappingMemberName = pointTypeMappingMemberName;
    }

    /**
     * [get] POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)} <br>
     * @return The value of the column 'POINT_TYPE_MAPPING_PRICE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.mysql.mytype.MyPriceCount getPointTypeMappingPriceCount() {
        checkSpecifiedProperty("pointTypeMappingPriceCount");
        return _pointTypeMappingPriceCount;
    }

    /**
     * [set] POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)} <br>
     * @param pointTypeMappingPriceCount The value of the column 'POINT_TYPE_MAPPING_PRICE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingPriceCount(org.docksidestage.mysql.mytype.MyPriceCount pointTypeMappingPriceCount) {
        registerModifiedProperty("pointTypeMappingPriceCount");
        _pointTypeMappingPriceCount = pointTypeMappingPriceCount;
    }

    /**
     * [get] POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)} <br>
     * @return The value of the column 'POINT_TYPE_MAPPING_SALE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.mysql.mytype.MySaleDate getPointTypeMappingSaleDate() {
        checkSpecifiedProperty("pointTypeMappingSaleDate");
        return _pointTypeMappingSaleDate;
    }

    /**
     * [set] POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)} <br>
     * @param pointTypeMappingSaleDate The value of the column 'POINT_TYPE_MAPPING_SALE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingSaleDate(org.docksidestage.mysql.mytype.MySaleDate pointTypeMappingSaleDate) {
        registerModifiedProperty("pointTypeMappingSaleDate");
        _pointTypeMappingSaleDate = pointTypeMappingSaleDate;
    }

    /**
     * [get] POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)} <br>
     * @return The value of the column 'POINT_TYPE_MAPPING_WANTED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getPointTypeMappingWantedDatetime() {
        checkSpecifiedProperty("pointTypeMappingWantedDatetime");
        return _pointTypeMappingWantedDatetime;
    }

    /**
     * [set] POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)} <br>
     * @param pointTypeMappingWantedDatetime The value of the column 'POINT_TYPE_MAPPING_WANTED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointTypeMappingWantedDatetime(java.time.LocalDate pointTypeMappingWantedDatetime) {
        registerModifiedProperty("pointTypeMappingWantedDatetime");
        _pointTypeMappingWantedDatetime = pointTypeMappingWantedDatetime;
    }
}
