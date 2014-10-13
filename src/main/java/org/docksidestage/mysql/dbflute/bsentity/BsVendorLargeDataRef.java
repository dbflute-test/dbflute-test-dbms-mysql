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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;
import java.util.TimeZone;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.derived.DerivedMappable;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of VENDOR_LARGE_DATA_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LARGE_DATA_REF_ID
 * 
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
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
 *     vendor_large_data, vendor_large_data_ref
 * 
 * [referrer table]
 *     vendor_large_data_ref
 * 
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 * 
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long largeDataRefId = entity.getLargeDataRefId();
 * Long largeDataId = entity.getLargeDataId();
 * java.util.Date dateIndex = entity.getDateIndex();
 * java.util.Date dateNoIndex = entity.getDateNoIndex();
 * java.sql.Timestamp timestampIndex = entity.getTimestampIndex();
 * java.sql.Timestamp timestampNoIndex = entity.getTimestampNoIndex();
 * java.math.BigDecimal nullableDecimalIndex = entity.getNullableDecimalIndex();
 * java.math.BigDecimal nullableDecimalNoIndex = entity.getNullableDecimalNoIndex();
 * Long selfParentId = entity.getSelfParentId();
 * entity.setLargeDataRefId(largeDataRefId);
 * entity.setLargeDataId(largeDataId);
 * entity.setDateIndex(dateIndex);
 * entity.setDateNoIndex(dateNoIndex);
 * entity.setTimestampIndex(timestampIndex);
 * entity.setTimestampNoIndex(timestampNoIndex);
 * entity.setNullableDecimalIndex(nullableDecimalIndex);
 * entity.setNullableDecimalNoIndex(nullableDecimalNoIndex);
 * entity.setSelfParentId(selfParentId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeDataRef implements Entity, Serializable, Cloneable, DerivedMappable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _largeDataRefId;

    /** LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} */
    protected Long _largeDataId;

    /** DATE_INDEX: {IX, NotNull, DATE(10)} */
    protected java.util.Date _dateIndex;

    /** DATE_NO_INDEX: {NotNull, DATE(10)} */
    protected java.util.Date _dateNoIndex;

    /** TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _timestampIndex;

    /** TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _timestampNoIndex;

    /** NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} */
    protected Long _selfParentId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** The map of derived value, key is alias name. (NullAllowed: lazy-loaded) */
    protected EntityDerivedMap __derivedMap;

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "vendor_large_data_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeDataRef";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getLargeDataRefId() == null) { return false; }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'. */
    protected VendorLargeData _vendorLargeData;

    /**
     * [get] vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The entity of foreign property 'vendorLargeData'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeData getVendorLargeData() {
        return _vendorLargeData;
    }

    /**
     * [set] vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(VendorLargeData vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'. */
    protected VendorLargeDataRef _vendorLargeDataRefSelf;

    /**
     * [get] vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorLargeDataRef getVendorLargeDataRefSelf() {
        return _vendorLargeDataRefSelf;
    }

    /**
     * [set] vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @param vendorLargeDataRefSelf The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelf(VendorLargeDataRef vendorLargeDataRefSelf) {
        _vendorLargeDataRefSelf = vendorLargeDataRefSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefSelfList;

    /**
     * [get] vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * [set] vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @param vendorLargeDataRefSelfList The entity list of referrer property 'vendorLargeDataRefSelfList'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefSelfList) {
        _vendorLargeDataRefSelfList = vendorLargeDataRefSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                    Derived Mappable
    //                                                                    ================
    /**
     * {@inheritDoc}
     */
    public void registerDerivedValue(String aliasName, Object selectedValue) {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        __derivedMap.registerDerivedValue(aliasName, selectedValue);
    }

    /**
     * Find the derived value from derived map.
     * <pre>
     * mapping type:
     *  count()      : Integer
     *  max(), min() : (same as property type of the column)
     *  sum(), avg() : BigDecimal
     *
     * e.g. use count()
     *  Integer loginCount = member.derived("$LOGIN_COUNT");
     * </pre>
     * @param <VALUE> The type of the value.
     * @param aliasName The alias name of derived-referrer. (NotNull)
     * @return The derived value found in the map. (NullAllowed: when null selected)
     */
    public <VALUE> VALUE derived(String aliasName) {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        return __derivedMap.findDerivedValue(aliasName);
    }

    protected EntityDerivedMap newDerivedMap() {
        return new EntityDerivedMap();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsVendorLargeDataRef)) { return false; }
        BsVendorLargeDataRef other = (BsVendorLargeDataRef)obj;
        if (!xSV(getLargeDataRefId(), other.getLargeDataRefId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getLargeDataRefId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String li = "\n  ";
        if (_vendorLargeData != null)
        { sb.append(li).append(xbRDS(_vendorLargeData, "vendorLargeData")); }
        if (_vendorLargeDataRefSelf != null)
        { sb.append(li).append(xbRDS(_vendorLargeDataRefSelf, "vendorLargeDataRefSelf")); }
        if (_vendorLargeDataRefSelfList != null) { for (Entity et : _vendorLargeDataRefSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefSelfList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getLargeDataRefId());
        sb.append(dm).append(getLargeDataId());
        sb.append(dm).append(xfUD(getDateIndex()));
        sb.append(dm).append(xfUD(getDateNoIndex()));
        sb.append(dm).append(getTimestampIndex());
        sb.append(dm).append(getTimestampNoIndex());
        sb.append(dm).append(getNullableDecimalIndex());
        sb.append(dm).append(getNullableDecimalNoIndex());
        sb.append(dm).append(getSelfParentId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toStringDate(date, xgDP(), mytimeZone());
    }
    protected String xgDP() { // getDatePattern()
        return "yyyy-MM-dd";
    }
    protected TimeZone mytimeZone() {
        return null; // as default
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorLargeData != null) { sb.append(cm).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null) { sb.append(cm).append("vendorLargeDataRefSelf"); }
        if (_vendorLargeDataRefSelfList != null && !_vendorLargeDataRefSelfList.isEmpty())
        { sb.append(cm).append("vendorLargeDataRefSelfList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorLargeDataRef clone() {
        try {
            return (VendorLargeDataRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        return _largeDataRefId;
    }

    /**
     * [set] LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param largeDataRefId The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        __modifiedProperties.addPropertyName("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} <br />
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data} <br />
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] DATE_INDEX: {IX, NotNull, DATE(10)} <br />
     * @return The value of the column 'DATE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateIndex() {
        return _dateIndex;
    }

    /**
     * [set] DATE_INDEX: {IX, NotNull, DATE(10)} <br />
     * @param dateIndex The value of the column 'DATE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.util.Date dateIndex) {
        __modifiedProperties.addPropertyName("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] DATE_NO_INDEX: {NotNull, DATE(10)} <br />
     * @return The value of the column 'DATE_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateNoIndex() {
        return _dateNoIndex;
    }

    /**
     * [set] DATE_NO_INDEX: {NotNull, DATE(10)} <br />
     * @param dateNoIndex The value of the column 'DATE_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.util.Date dateNoIndex) {
        __modifiedProperties.addPropertyName("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} <br />
     * @return The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampIndex() {
        return _timestampIndex;
    }

    /**
     * [set] TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)} <br />
     * @param timestampIndex The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.sql.Timestamp timestampIndex) {
        __modifiedProperties.addPropertyName("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTimestampNoIndex() {
        return _timestampNoIndex;
    }

    /**
     * [set] TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)} <br />
     * @param timestampNoIndex The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.sql.Timestamp timestampNoIndex) {
        __modifiedProperties.addPropertyName("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} <br />
     * @return The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        return _nullableDecimalIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)} <br />
     * @param nullableDecimalIndex The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        __modifiedProperties.addPropertyName("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} <br />
     * @return The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)} <br />
     * @param nullableDecimalNoIndex The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        __modifiedProperties.addPropertyName("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} <br />
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        return _selfParentId;
    }

    /**
     * [set] SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref} <br />
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        __modifiedProperties.addPropertyName("selfParentId");
        _selfParentId = selfParentId;
    }
}
