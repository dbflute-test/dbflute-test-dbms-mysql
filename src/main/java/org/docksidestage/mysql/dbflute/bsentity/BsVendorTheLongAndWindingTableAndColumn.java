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
 * The entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorTheLongAndWindingTableAndColumn extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _theLongAndWindingTableAndColumnId;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)} */
    protected String _theLongAndWindingTableAndColumnName;

    /** SHORT_NAME: {NotNull, VARCHAR(200)} */
    protected String _shortName;

    /** SHORT_SIZE: {NotNull, INT(10)} */
    protected Integer _shortSize;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_the_long_and_winding_table_and_column";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_theLongAndWindingTableAndColumnId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param theLongAndWindingTableAndColumnName : UQ, NotNull, VARCHAR(180). (NotNull)
     */
    public void uniqueBy(String theLongAndWindingTableAndColumnName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("theLongAndWindingTableAndColumnName");
        setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'. */
    protected List<VendorTheLongAndWindingTableAndColumnRef> _vendorTheLongAndWindingTableAndColumnRefList;

    /**
     * [get] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * @return The entity list of referrer property 'vendorTheLongAndWindingTableAndColumnRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorTheLongAndWindingTableAndColumnRef> getVendorTheLongAndWindingTableAndColumnRefList() {
        if (_vendorTheLongAndWindingTableAndColumnRefList == null) { _vendorTheLongAndWindingTableAndColumnRefList = newReferrerList(); }
        return _vendorTheLongAndWindingTableAndColumnRefList;
    }

    /**
     * [set] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * @param vendorTheLongAndWindingTableAndColumnRefList The entity list of referrer property 'vendorTheLongAndWindingTableAndColumnRefList'. (NullAllowed)
     */
    public void setVendorTheLongAndWindingTableAndColumnRefList(List<VendorTheLongAndWindingTableAndColumnRef> vendorTheLongAndWindingTableAndColumnRefList) {
        _vendorTheLongAndWindingTableAndColumnRefList = vendorTheLongAndWindingTableAndColumnRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorTheLongAndWindingTableAndColumn) {
            BsVendorTheLongAndWindingTableAndColumn other = (BsVendorTheLongAndWindingTableAndColumn)obj;
            if (!xSV(_theLongAndWindingTableAndColumnId, other._theLongAndWindingTableAndColumnId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _theLongAndWindingTableAndColumnId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorTheLongAndWindingTableAndColumnRefList != null) { for (VendorTheLongAndWindingTableAndColumnRef et : _vendorTheLongAndWindingTableAndColumnRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorTheLongAndWindingTableAndColumnRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_theLongAndWindingTableAndColumnId));
        sb.append(dm).append(xfND(_theLongAndWindingTableAndColumnName));
        sb.append(dm).append(xfND(_shortName));
        sb.append(dm).append(xfND(_shortSize));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorTheLongAndWindingTableAndColumnRefList != null && !_vendorTheLongAndWindingTableAndColumnRefList.isEmpty())
        { sb.append(dm).append("vendorTheLongAndWindingTableAndColumnRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorTheLongAndWindingTableAndColumn clone() {
        return (VendorTheLongAndWindingTableAndColumn)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTheLongAndWindingTableAndColumnId() {
        checkSpecifiedProperty("theLongAndWindingTableAndColumnId");
        return _theLongAndWindingTableAndColumnId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTheLongAndWindingTableAndColumnId(Long theLongAndWindingTableAndColumnId) {
        registerModifiedProperty("theLongAndWindingTableAndColumnId");
        _theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)} <br>
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getTheLongAndWindingTableAndColumnName() {
        checkSpecifiedProperty("theLongAndWindingTableAndColumnName");
        return _theLongAndWindingTableAndColumnName;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)} <br>
     * @param theLongAndWindingTableAndColumnName The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setTheLongAndWindingTableAndColumnName(String theLongAndWindingTableAndColumnName) {
        registerModifiedProperty("theLongAndWindingTableAndColumnName");
        _theLongAndWindingTableAndColumnName = theLongAndWindingTableAndColumnName;
    }

    /**
     * [get] SHORT_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SHORT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getShortName() {
        checkSpecifiedProperty("shortName");
        return _shortName;
    }

    /**
     * [set] SHORT_NAME: {NotNull, VARCHAR(200)} <br>
     * @param shortName The value of the column 'SHORT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setShortName(String shortName) {
        registerModifiedProperty("shortName");
        _shortName = shortName;
    }

    /**
     * [get] SHORT_SIZE: {NotNull, INT(10)} <br>
     * @return The value of the column 'SHORT_SIZE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getShortSize() {
        checkSpecifiedProperty("shortSize");
        return _shortSize;
    }

    /**
     * [set] SHORT_SIZE: {NotNull, INT(10)} <br>
     * @param shortSize The value of the column 'SHORT_SIZE'. (basically NotNull if update: for the constraint)
     */
    public void setShortSize(Integer shortSize) {
        registerModifiedProperty("shortSize");
        _shortSize = shortSize;
    }
}
