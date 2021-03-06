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
 * The DB meta of white_date_adjustment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDateAdjustmentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDateAdjustmentDbm _instance = new WhiteDateAdjustmentDbm();
    private WhiteDateAdjustmentDbm() {}
    public static WhiteDateAdjustmentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getDateAdjustmentId(), (et, vl) -> ((WhiteDateAdjustment)et).setDateAdjustmentId(ctl(vl)), "dateAdjustmentId");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedDate(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedDate(ctld(vl)), "adjustedDate");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedDatetime(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedDatetime(ctldt(vl)), "adjustedDatetime");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedTime(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedTime(ctlt(vl)), "adjustedTime");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedInteger(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedInteger(cti(vl)), "adjustedInteger");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedNamedStringLong(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedNamedStringLong(ctl(vl)), "adjustedNamedStringLong");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedNamedTypedLong(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedNamedTypedLong(ctl(vl)), "adjustedNamedTypedLong");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedPinpointStringLong(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedPinpointStringLong(ctl(vl)), "adjustedPinpointStringLong");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedPinpointTypedLong(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedPinpointTypedLong(ctl(vl)), "adjustedPinpointTypedLong");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedPlainLong(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedPlainLong(ctl(vl)), "adjustedPlainLong");
        setupEpg(_epgMap, et -> ((WhiteDateAdjustment)et).getAdjustedString(), (et, vl) -> ((WhiteDateAdjustment)et).setAdjustedString((String)vl), "adjustedString");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_date_adjustment";
    protected final String _tableDispName = "WHITE_DATE_ADJUSTMENT";
    protected final String _tablePropertyName = "whiteDateAdjustment";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DATE_ADJUSTMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDateAdjustmentId = cci("DATE_ADJUSTMENT_ID", "DATE_ADJUSTMENT_ID", null, null, Long.class, "dateAdjustmentId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedDate = cci("ADJUSTED_DATE", "ADJUSTED_DATE", null, "adjusted", java.time.LocalDate.class, "adjustedDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedDatetime = cci("ADJUSTED_DATETIME", "ADJUSTED_DATETIME", null, null, java.time.LocalDateTime.class, "adjustedDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedTime = cci("ADJUSTED_TIME", "ADJUSTED_TIME", null, null, java.time.LocalTime.class, "adjustedTime", null, false, false, false, "TIME", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedInteger = cci("ADJUSTED_INTEGER", "ADJUSTED_INTEGER", null, null, Integer.class, "adjustedInteger", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedNamedStringLong = cci("ADJUSTED_NAMED_STRING_LONG", "ADJUSTED_NAMED_STRING_LONG", null, "adjusted", Long.class, "adjustedNamedStringLong", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedNamedTypedLong = cci("ADJUSTED_NAMED_TYPED_LONG", "ADJUSTED_NAMED_TYPED_LONG", null, "adjusted", Long.class, "adjustedNamedTypedLong", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedPinpointStringLong = cci("ADJUSTED_PINPOINT_STRING_LONG", "ADJUSTED_PINPOINT_STRING_LONG", null, "adjusted", Long.class, "adjustedPinpointStringLong", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedPinpointTypedLong = cci("ADJUSTED_PINPOINT_TYPED_LONG", "ADJUSTED_PINPOINT_TYPED_LONG", null, "adjusted", Long.class, "adjustedPinpointTypedLong", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedPlainLong = cci("ADJUSTED_PLAIN_LONG", "ADJUSTED_PLAIN_LONG", null, null, Long.class, "adjustedPlainLong", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedString = cci("ADJUSTED_STRING", "ADJUSTED_STRING", null, null, String.class, "adjustedString", null, false, false, false, "VARCHAR", 32, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateAdjustmentId() { return _columnDateAdjustmentId; }
    /**
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedDate() { return _columnAdjustedDate; }
    /**
     * ADJUSTED_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedDatetime() { return _columnAdjustedDatetime; }
    /**
     * ADJUSTED_TIME: {TIME(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedTime() { return _columnAdjustedTime; }
    /**
     * ADJUSTED_INTEGER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedInteger() { return _columnAdjustedInteger; }
    /**
     * (adjusted)ADJUSTED_NAMED_STRING_LONG: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedNamedStringLong() { return _columnAdjustedNamedStringLong; }
    /**
     * (adjusted)ADJUSTED_NAMED_TYPED_LONG: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedNamedTypedLong() { return _columnAdjustedNamedTypedLong; }
    /**
     * (adjusted)ADJUSTED_PINPOINT_STRING_LONG: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedPinpointStringLong() { return _columnAdjustedPinpointStringLong; }
    /**
     * (adjusted)ADJUSTED_PINPOINT_TYPED_LONG: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedPinpointTypedLong() { return _columnAdjustedPinpointTypedLong; }
    /**
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedPlainLong() { return _columnAdjustedPlainLong; }
    /**
     * ADJUSTED_STRING: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedString() { return _columnAdjustedString; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDateAdjustmentId());
        ls.add(columnAdjustedDate());
        ls.add(columnAdjustedDatetime());
        ls.add(columnAdjustedTime());
        ls.add(columnAdjustedInteger());
        ls.add(columnAdjustedNamedStringLong());
        ls.add(columnAdjustedNamedTypedLong());
        ls.add(columnAdjustedPinpointStringLong());
        ls.add(columnAdjustedPinpointTypedLong());
        ls.add(columnAdjustedPlainLong());
        ls.add(columnAdjustedString());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDateAdjustmentId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteDateAdjustment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteDateAdjustmentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteDateAdjustmentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDateAdjustment> getEntityType() { return WhiteDateAdjustment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDateAdjustment newEntity() { return new WhiteDateAdjustment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDateAdjustment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDateAdjustment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
