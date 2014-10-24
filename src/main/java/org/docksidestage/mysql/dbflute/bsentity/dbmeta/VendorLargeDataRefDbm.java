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
package org.docksidestage.mysql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The DB meta of vendor_large_data_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorLargeDataRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeDataRefDbm _instance = new VendorLargeDataRefDbm();
    private VendorLargeDataRefDbm() {}
    public static VendorLargeDataRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getLargeDataRefId(), (et, vl) -> ((VendorLargeDataRef)et).setLargeDataRefId(ctl(vl)), "largeDataRefId");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getLargeDataId(), (et, vl) -> ((VendorLargeDataRef)et).setLargeDataId(ctl(vl)), "largeDataId");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getDateIndex(), (et, vl) -> ((VendorLargeDataRef)et).setDateIndex((java.util.Date)vl), "dateIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getDateNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setDateNoIndex((java.util.Date)vl), "dateNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getTimestampIndex(), (et, vl) -> ((VendorLargeDataRef)et).setTimestampIndex((java.sql.Timestamp)vl), "timestampIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getTimestampNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setTimestampNoIndex((java.sql.Timestamp)vl), "timestampNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getNullableDecimalIndex(), (et, vl) -> ((VendorLargeDataRef)et).setNullableDecimalIndex(ctb(vl)), "nullableDecimalIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getNullableDecimalNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setNullableDecimalNoIndex(ctb(vl)), "nullableDecimalNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getSelfParentId(), (et, vl) -> ((VendorLargeDataRef)et).setSelfParentId(ctl(vl)), "selfParentId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((VendorLargeDataRef)et).getVendorLargeData(), (et, vl) -> ((VendorLargeDataRef)et).setVendorLargeData((VendorLargeData)vl), "vendorLargeData");
        setupEfpg(_efpgMap, et -> ((VendorLargeDataRef)et).getVendorLargeDataRefSelf(), (et, vl) -> ((VendorLargeDataRef)et).setVendorLargeDataRefSelf((VendorLargeDataRef)vl), "vendorLargeDataRefSelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_large_data_ref";
    protected final String _tablePropertyName = "vendorLargeDataRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_DATA_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", null, null, Long.class, "largeDataRefId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, "vendorLargeDataRefSelfList", null);
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, Long.class, "largeDataId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "vendorLargeData", null, null);
    protected final ColumnInfo _columnDateIndex = cci("DATE_INDEX", "DATE_INDEX", null, null, java.util.Date.class, "dateIndex", null, false, false, true, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDateNoIndex = cci("DATE_NO_INDEX", "DATE_NO_INDEX", null, null, java.util.Date.class, "dateNoIndex", null, false, false, true, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampIndex = cci("TIMESTAMP_INDEX", "TIMESTAMP_INDEX", null, null, java.sql.Timestamp.class, "timestampIndex", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTimestampNoIndex = cci("TIMESTAMP_NO_INDEX", "TIMESTAMP_NO_INDEX", null, null, java.sql.Timestamp.class, "timestampNoIndex", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("NULLABLE_DECIMAL_INDEX", "NULLABLE_DECIMAL_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "DECIMAL", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("NULLABLE_DECIMAL_NO_INDEX", "NULLABLE_DECIMAL_NO_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "DECIMAL", 12, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, null, Long.class, "selfParentId", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, "vendorLargeDataRefSelf", null, null);

    /**
     * LARGE_DATA_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * LARGE_DATA_ID: {IX, NotNull, BIGINT(19), FK to vendor_large_data}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * DATE_INDEX: {IX, NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * DATE_NO_INDEX: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * TIMESTAMP_INDEX: {IX, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * TIMESTAMP_NO_INDEX: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * NULLABLE_DECIMAL_INDEX: {IX, DECIMAL(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * SELF_PARENT_ID: {IX, BIGINT(19), FK to vendor_large_data_ref}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfParentId() { return _columnSelfParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLargeDataRefId());
        ls.add(columnLargeDataId());
        ls.add(columnDateIndex());
        ls.add(columnDateNoIndex());
        ls.add(columnTimestampIndex());
        ls.add(columnTimestampNoIndex());
        ls.add(columnNullableDecimalIndex());
        ls.add(columnNullableDecimalNoIndex());
        ls.add(columnSelfParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLargeDataRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * vendor_large_data by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeData() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "vendorLargeDataRefList");
    }
    /**
     * vendor_large_data_ref by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataRefId(), VendorLargeDataRefDbm.getInstance().columnSelfParentId());
        return cri("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelfList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeDataRefSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.VendorLargeDataRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.VendorLargeDataRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.VendorLargeDataRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeDataRef> getEntityType() { return VendorLargeDataRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeDataRef newEntity() { return new VendorLargeDataRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeDataRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeDataRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
