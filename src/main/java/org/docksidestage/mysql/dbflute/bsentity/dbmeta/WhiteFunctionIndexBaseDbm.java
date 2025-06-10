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
 * The DB meta of white_function_index_base. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteFunctionIndexBaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteFunctionIndexBaseDbm _instance = new WhiteFunctionIndexBaseDbm();
    private WhiteFunctionIndexBaseDbm() {}
    public static WhiteFunctionIndexBaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteFunctionIndexBase)et).getIndexBaseId(), (et, vl) -> ((WhiteFunctionIndexBase)et).setIndexBaseId(ctl(vl)), "indexBaseId");
        setupEpg(_epgMap, et -> ((WhiteFunctionIndexBase)et).getIndexBaseName(), (et, vl) -> ((WhiteFunctionIndexBase)et).setIndexBaseName((String)vl), "indexBaseName");
        setupEpg(_epgMap, et -> ((WhiteFunctionIndexBase)et).getIndexBaseNumberFirst(), (et, vl) -> ((WhiteFunctionIndexBase)et).setIndexBaseNumberFirst(cti(vl)), "indexBaseNumberFirst");
        setupEpg(_epgMap, et -> ((WhiteFunctionIndexBase)et).getIndexBaseNumberSecond(), (et, vl) -> ((WhiteFunctionIndexBase)et).setIndexBaseNumberSecond(cti(vl)), "indexBaseNumberSecond");
        setupEpg(_epgMap, et -> ((WhiteFunctionIndexBase)et).getIndexBaseDatetime(), (et, vl) -> ((WhiteFunctionIndexBase)et).setIndexBaseDatetime(ctldt(vl)), "indexBaseDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_function_index_base";
    protected final String _tableDispName = "WHITE_FUNCTION_INDEX_BASE";
    protected final String _tablePropertyName = "whiteFunctionIndexBase";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_FUNCTION_INDEX_BASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnIndexBaseId = cci("INDEX_BASE_ID", "INDEX_BASE_ID", null, null, Long.class, "indexBaseId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexBaseName = cci("INDEX_BASE_NAME", "INDEX_BASE_NAME", null, null, String.class, "indexBaseName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexBaseNumberFirst = cci("INDEX_BASE_NUMBER_FIRST", "INDEX_BASE_NUMBER_FIRST", null, null, Integer.class, "indexBaseNumberFirst", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexBaseNumberSecond = cci("INDEX_BASE_NUMBER_SECOND", "INDEX_BASE_NUMBER_SECOND", null, null, Integer.class, "indexBaseNumberSecond", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndexBaseDatetime = cci("INDEX_BASE_DATETIME", "INDEX_BASE_DATETIME", null, null, java.time.LocalDateTime.class, "indexBaseDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexBaseId() { return _columnIndexBaseId; }
    /**
     * INDEX_BASE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexBaseName() { return _columnIndexBaseName; }
    /**
     * INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexBaseNumberFirst() { return _columnIndexBaseNumberFirst; }
    /**
     * INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexBaseNumberSecond() { return _columnIndexBaseNumberSecond; }
    /**
     * INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndexBaseDatetime() { return _columnIndexBaseDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnIndexBaseId());
        ls.add(columnIndexBaseName());
        ls.add(columnIndexBaseNumberFirst());
        ls.add(columnIndexBaseNumberSecond());
        ls.add(columnIndexBaseDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnIndexBaseId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteFunctionIndexBase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteFunctionIndexBaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteFunctionIndexBaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteFunctionIndexBase> getEntityType() { return WhiteFunctionIndexBase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteFunctionIndexBase newEntity() { return new WhiteFunctionIndexBase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteFunctionIndexBase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteFunctionIndexBase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
