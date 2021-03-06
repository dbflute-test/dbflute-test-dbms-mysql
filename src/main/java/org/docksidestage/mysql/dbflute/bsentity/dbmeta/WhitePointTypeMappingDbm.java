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
 * The DB meta of white_point_type_mapping. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePointTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePointTypeMappingDbm _instance = new WhitePointTypeMappingDbm();
    private WhitePointTypeMappingDbm() {}
    public static WhitePointTypeMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhitePointTypeMapping)et).getPointTypeMappingId(), (et, vl) -> ((WhitePointTypeMapping)et).setPointTypeMappingId(ctl(vl)), "pointTypeMappingId");
        setupEpg(_epgMap, et -> ((WhitePointTypeMapping)et).getPointTypeMappingMemberName(), (et, vl) -> ((WhitePointTypeMapping)et).setPointTypeMappingMemberName((org.docksidestage.mysql.mytype.MyMemberName)vl), "pointTypeMappingMemberName");
        setupEpg(_epgMap, et -> ((WhitePointTypeMapping)et).getPointTypeMappingPriceCount(), (et, vl) -> ((WhitePointTypeMapping)et).setPointTypeMappingPriceCount((org.docksidestage.mysql.mytype.MyPriceCount)vl), "pointTypeMappingPriceCount");
        setupEpg(_epgMap, et -> ((WhitePointTypeMapping)et).getPointTypeMappingSaleDate(), (et, vl) -> ((WhitePointTypeMapping)et).setPointTypeMappingSaleDate((org.docksidestage.mysql.mytype.MySaleDate)vl), "pointTypeMappingSaleDate");
        setupEpg(_epgMap, et -> ((WhitePointTypeMapping)et).getPointTypeMappingWantedDatetime(), (et, vl) -> ((WhitePointTypeMapping)et).setPointTypeMappingWantedDatetime(ctld(vl)), "pointTypeMappingWantedDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_point_type_mapping";
    protected final String _tableDispName = "WHITE_POINT_TYPE_MAPPING";
    protected final String _tablePropertyName = "whitePointTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_POINT_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPointTypeMappingId = cci("POINT_TYPE_MAPPING_ID", "POINT_TYPE_MAPPING_ID", null, null, Long.class, "pointTypeMappingId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointTypeMappingMemberName = cci("POINT_TYPE_MAPPING_MEMBER_NAME", "POINT_TYPE_MAPPING_MEMBER_NAME", null, null, org.docksidestage.mysql.mytype.MyMemberName.class, "pointTypeMappingMemberName", null, false, false, false, "VARCHAR", 32, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointTypeMappingPriceCount = cci("POINT_TYPE_MAPPING_PRICE_COUNT", "POINT_TYPE_MAPPING_PRICE_COUNT", null, null, org.docksidestage.mysql.mytype.MyPriceCount.class, "pointTypeMappingPriceCount", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointTypeMappingSaleDate = cci("POINT_TYPE_MAPPING_SALE_DATE", "POINT_TYPE_MAPPING_SALE_DATE", null, null, org.docksidestage.mysql.mytype.MySaleDate.class, "pointTypeMappingSaleDate", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointTypeMappingWantedDatetime = cci("POINT_TYPE_MAPPING_WANTED_DATETIME", "POINT_TYPE_MAPPING_WANTED_DATETIME", null, null, java.time.LocalDate.class, "pointTypeMappingWantedDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * POINT_TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingId() { return _columnPointTypeMappingId; }
    /**
     * POINT_TYPE_MAPPING_MEMBER_NAME: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingMemberName() { return _columnPointTypeMappingMemberName; }
    /**
     * POINT_TYPE_MAPPING_PRICE_COUNT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingPriceCount() { return _columnPointTypeMappingPriceCount; }
    /**
     * POINT_TYPE_MAPPING_SALE_DATE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingSaleDate() { return _columnPointTypeMappingSaleDate; }
    /**
     * POINT_TYPE_MAPPING_WANTED_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointTypeMappingWantedDatetime() { return _columnPointTypeMappingWantedDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPointTypeMappingId());
        ls.add(columnPointTypeMappingMemberName());
        ls.add(columnPointTypeMappingPriceCount());
        ls.add(columnPointTypeMappingSaleDate());
        ls.add(columnPointTypeMappingWantedDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPointTypeMappingId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhitePointTypeMapping"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhitePointTypeMappingCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhitePointTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePointTypeMapping> getEntityType() { return WhitePointTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePointTypeMapping newEntity() { return new WhitePointTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePointTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePointTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
