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
package org.docksidestage.mysql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.exentity.customize.*;

/**
 * The DB meta of LargeManualPaging. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LargeManualPagingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LargeManualPagingDbm _instance = new LargeManualPagingDbm();
    private LargeManualPagingDbm() {}
    public static LargeManualPagingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getLargeDataRefId(), (et, vl) -> ((LargeManualPaging)et).setLargeDataRefId(ctl(vl)), "largeDataRefId");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getLargeDataId(), (et, vl) -> ((LargeManualPaging)et).setLargeDataId(ctl(vl)), "largeDataId");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getDateIndex(), (et, vl) -> ((LargeManualPaging)et).setDateIndex(ctld(vl)), "dateIndex");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getDateNoIndex(), (et, vl) -> ((LargeManualPaging)et).setDateNoIndex(ctld(vl)), "dateNoIndex");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getTimestampIndex(), (et, vl) -> ((LargeManualPaging)et).setTimestampIndex(ctldt(vl)), "timestampIndex");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getTimestampNoIndex(), (et, vl) -> ((LargeManualPaging)et).setTimestampNoIndex(ctldt(vl)), "timestampNoIndex");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getNullableDecimalIndex(), (et, vl) -> ((LargeManualPaging)et).setNullableDecimalIndex(ctb(vl)), "nullableDecimalIndex");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getNullableDecimalNoIndex(), (et, vl) -> ((LargeManualPaging)et).setNullableDecimalNoIndex(ctb(vl)), "nullableDecimalNoIndex");
        setupEpg(_epgMap, et -> ((LargeManualPaging)et).getSelfParentId(), (et, vl) -> ((LargeManualPaging)et).setSelfParentId(ctl(vl)), "selfParentId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LargeManualPaging";
    protected final String _tableDispName = "LargeManualPaging";
    protected final String _tablePropertyName = "largeManualPaging";
    protected final TableSqlName _tableSqlName = new TableSqlName("LargeManualPaging", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", null, null, Long.class, "largeDataRefId", null, false, false, false, "BIGINT", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, Long.class, "largeDataId", null, false, false, false, "BIGINT", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateIndex = cci("DATE_INDEX", "DATE_INDEX", null, null, java.time.LocalDate.class, "dateIndex", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateNoIndex = cci("DATE_NO_INDEX", "DATE_NO_INDEX", null, null, java.time.LocalDate.class, "dateNoIndex", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampIndex = cci("TIMESTAMP_INDEX", "TIMESTAMP_INDEX", null, null, java.time.LocalDateTime.class, "timestampIndex", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampNoIndex = cci("TIMESTAMP_NO_INDEX", "TIMESTAMP_NO_INDEX", null, null, java.time.LocalDateTime.class, "timestampNoIndex", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("NULLABLE_DECIMAL_INDEX", "NULLABLE_DECIMAL_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "DECIMAL", 12, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("NULLABLE_DECIMAL_NO_INDEX", "NULLABLE_DECIMAL_NO_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "DECIMAL", 12, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, null, Long.class, "selfParentId", null, false, false, false, "BIGINT", 20, 0, null, false, null, null, null, null, null, false);

    /**
     * LARGE_DATA_REF_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_REF_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * LARGE_DATA_ID: {BIGINT(20), refers to vendor_large_data_ref.LARGE_DATA_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * DATE_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_INDEX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * DATE_NO_INDEX: {DATE(10), refers to vendor_large_data_ref.DATE_NO_INDEX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * TIMESTAMP_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_INDEX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * TIMESTAMP_NO_INDEX: {DATETIME(19), refers to vendor_large_data_ref.TIMESTAMP_NO_INDEX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * NULLABLE_DECIMAL_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_INDEX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * NULLABLE_DECIMAL_NO_INDEX: {DECIMAL(12, 3), refers to vendor_large_data_ref.NULLABLE_DECIMAL_NO_INDEX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * SELF_PARENT_ID: {BIGINT(20), refers to vendor_large_data_ref.SELF_PARENT_ID}
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
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.customize.LargeManualPaging"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LargeManualPaging> getEntityType() { return LargeManualPaging.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LargeManualPaging newEntity() { return new LargeManualPaging(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LargeManualPaging)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LargeManualPaging)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
