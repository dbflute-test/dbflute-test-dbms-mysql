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
 * The DB meta of white_generated_column_base. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteGeneratedColumnBaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteGeneratedColumnBaseDbm _instance = new WhiteGeneratedColumnBaseDbm();
    private WhiteGeneratedColumnBaseDbm() {}
    public static WhiteGeneratedColumnBaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseId(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseId(ctl(vl)), "columnBaseId");
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseName(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseName((String)vl), "columnBaseName");
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseNumberFirst(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseNumberFirst(cti(vl)), "columnBaseNumberFirst");
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseNumberSecond(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseNumberSecond(cti(vl)), "columnBaseNumberSecond");
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseDatetime(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseDatetime(ctldt(vl)), "columnBaseDatetime");
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseVirtualDateCast(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseVirtualDateCast(ctld(vl)), "columnBaseVirtualDateCast");
        setupEpg(_epgMap, et -> ((WhiteGeneratedColumnBase)et).getColumnBaseVirtualDateFormat(), (et, vl) -> ((WhiteGeneratedColumnBase)et).setColumnBaseVirtualDateFormat(ctld(vl)), "columnBaseVirtualDateFormat");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_generated_column_base";
    protected final String _tableDispName = "WHITE_GENERATED_COLUMN_BASE";
    protected final String _tablePropertyName = "whiteGeneratedColumnBase";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_GENERATED_COLUMN_BASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnColumnBaseId = cci("COLUMN_BASE_ID", "COLUMN_BASE_ID", null, null, Long.class, "columnBaseId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColumnBaseName = cci("COLUMN_BASE_NAME", "COLUMN_BASE_NAME", null, null, String.class, "columnBaseName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColumnBaseNumberFirst = cci("COLUMN_BASE_NUMBER_FIRST", "COLUMN_BASE_NUMBER_FIRST", null, null, Integer.class, "columnBaseNumberFirst", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColumnBaseNumberSecond = cci("COLUMN_BASE_NUMBER_SECOND", "COLUMN_BASE_NUMBER_SECOND", null, null, Integer.class, "columnBaseNumberSecond", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColumnBaseDatetime = cci("COLUMN_BASE_DATETIME", "COLUMN_BASE_DATETIME", null, null, java.time.LocalDateTime.class, "columnBaseDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColumnBaseVirtualDateCast = cci("COLUMN_BASE_VIRTUAL_DATE_CAST", "COLUMN_BASE_VIRTUAL_DATE_CAST", null, null, java.time.LocalDate.class, "columnBaseVirtualDateCast", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColumnBaseVirtualDateFormat = cci("COLUMN_BASE_VIRTUAL_DATE_FORMAT", "COLUMN_BASE_VIRTUAL_DATE_FORMAT", null, null, java.time.LocalDate.class, "columnBaseVirtualDateFormat", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * COLUMN_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseId() { return _columnColumnBaseId; }
    /**
     * COLUMN_BASE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseName() { return _columnColumnBaseName; }
    /**
     * COLUMN_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseNumberFirst() { return _columnColumnBaseNumberFirst; }
    /**
     * COLUMN_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseNumberSecond() { return _columnColumnBaseNumberSecond; }
    /**
     * COLUMN_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseDatetime() { return _columnColumnBaseDatetime; }
    /**
     * COLUMN_BASE_VIRTUAL_DATE_CAST: {IX, NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseVirtualDateCast() { return _columnColumnBaseVirtualDateCast; }
    /**
     * COLUMN_BASE_VIRTUAL_DATE_FORMAT: {IX, NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColumnBaseVirtualDateFormat() { return _columnColumnBaseVirtualDateFormat; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnColumnBaseId());
        ls.add(columnColumnBaseName());
        ls.add(columnColumnBaseNumberFirst());
        ls.add(columnColumnBaseNumberSecond());
        ls.add(columnColumnBaseDatetime());
        ls.add(columnColumnBaseVirtualDateCast());
        ls.add(columnColumnBaseVirtualDateFormat());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnColumnBaseId()); }
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
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteGeneratedColumnBase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteGeneratedColumnBaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteGeneratedColumnBaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteGeneratedColumnBase> getEntityType() { return WhiteGeneratedColumnBase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteGeneratedColumnBase newEntity() { return new WhiteGeneratedColumnBase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteGeneratedColumnBase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteGeneratedColumnBase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
