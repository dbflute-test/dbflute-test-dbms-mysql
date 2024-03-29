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
 * The entity of VENDOR_LARGE_DATA_REF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeDataRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _largeDataRefId;

    /** LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} */
    protected Long _largeDataId;

    /** DATE_INDEX: {IX, NotNull, DATE(10)} */
    protected java.time.LocalDate _dateIndex;

    /** DATE_NO_INDEX: {NotNull, DATE(10)} */
    protected java.time.LocalDate _dateNoIndex;

    /** TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _timestampIndex;

    /** TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _timestampNoIndex;

    /** NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} */
    protected Long _selfParentId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_large_data_ref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_largeDataRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'. */
    protected OptionalEntity<VendorLargeData> _vendorLargeData;

    /**
     * [get] VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorLargeData'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorLargeData> getVendorLargeData() {
        if (_vendorLargeData == null) { _vendorLargeData = OptionalEntity.relationEmpty(this, "vendorLargeData"); }
        return _vendorLargeData;
    }

    /**
     * [set] VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(OptionalEntity<VendorLargeData> vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'. */
    protected OptionalEntity<VendorLargeDataRef> _vendorLargeDataRefSelf;

    /**
     * [get] VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorLargeDataRef> getVendorLargeDataRefSelf() {
        if (_vendorLargeDataRefSelf == null) { _vendorLargeDataRefSelf = OptionalEntity.relationEmpty(this, "vendorLargeDataRefSelf"); }
        return _vendorLargeDataRefSelf;
    }

    /**
     * [set] VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @param vendorLargeDataRefSelf The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelf(OptionalEntity<VendorLargeDataRef> vendorLargeDataRefSelf) {
        _vendorLargeDataRefSelf = vendorLargeDataRefSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefSelfList;

    /**
     * [get] VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * [set] VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @param vendorLargeDataRefSelfList The entity list of referrer property 'vendorLargeDataRefSelfList'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefSelfList) {
        _vendorLargeDataRefSelfList = vendorLargeDataRefSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorLargeDataRef) {
            BsVendorLargeDataRef other = (BsVendorLargeDataRef)obj;
            if (!xSV(_largeDataRefId, other._largeDataRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _largeDataRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null && _vendorLargeData.isPresent())
        { sb.append(li).append(xbRDS(_vendorLargeData, "vendorLargeData")); }
        if (_vendorLargeDataRefSelf != null && _vendorLargeDataRefSelf.isPresent())
        { sb.append(li).append(xbRDS(_vendorLargeDataRefSelf, "vendorLargeDataRefSelf")); }
        if (_vendorLargeDataRefSelfList != null) { for (VendorLargeDataRef et : _vendorLargeDataRefSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefSelfList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_largeDataRefId));
        sb.append(dm).append(xfND(_largeDataId));
        sb.append(dm).append(xfND(_dateIndex));
        sb.append(dm).append(xfND(_dateNoIndex));
        sb.append(dm).append(xfND(_timestampIndex));
        sb.append(dm).append(xfND(_timestampNoIndex));
        sb.append(dm).append(xfND(_nullableDecimalIndex));
        sb.append(dm).append(xfND(_nullableDecimalNoIndex));
        sb.append(dm).append(xfND(_selfParentId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null && _vendorLargeData.isPresent())
        { sb.append(dm).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null && _vendorLargeDataRefSelf.isPresent())
        { sb.append(dm).append("vendorLargeDataRefSelf"); }
        if (_vendorLargeDataRefSelfList != null && !_vendorLargeDataRefSelfList.isEmpty())
        { sb.append(dm).append("vendorLargeDataRefSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeDataRef clone() {
        return (VendorLargeDataRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param largeDataRefId The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        registerModifiedProperty("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} <br>
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} <br>
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] DATE_INDEX: {IX, NotNull, DATE(10)} <br>
     * @return The value of the column 'DATE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] DATE_INDEX: {IX, NotNull, DATE(10)} <br>
     * @param dateIndex The value of the column 'DATE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.time.LocalDate dateIndex) {
        registerModifiedProperty("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] DATE_NO_INDEX: {NotNull, DATE(10)} <br>
     * @return The value of the column 'DATE_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] DATE_NO_INDEX: {NotNull, DATE(10)} <br>
     * @param dateNoIndex The value of the column 'DATE_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.time.LocalDate dateNoIndex) {
        registerModifiedProperty("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} <br>
     * @return The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} <br>
     * @param timestampIndex The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.time.LocalDateTime timestampIndex) {
        registerModifiedProperty("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} <br>
     * @param timestampNoIndex The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.time.LocalDateTime timestampNoIndex) {
        registerModifiedProperty("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} <br>
     * @return The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} <br>
     * @param nullableDecimalIndex The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        registerModifiedProperty("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} <br>
     * @return The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} <br>
     * @param nullableDecimalNoIndex The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        registerModifiedProperty("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} <br>
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} <br>
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }
}
