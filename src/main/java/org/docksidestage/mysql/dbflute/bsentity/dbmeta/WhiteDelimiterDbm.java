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
 * The DB meta of white_delimiter. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDelimiterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDelimiterDbm _instance = new WhiteDelimiterDbm();
    private WhiteDelimiterDbm() {}
    public static WhiteDelimiterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDelimiter)et).getDelimiterId(), (et, vl) -> ((WhiteDelimiter)et).setDelimiterId(ctl(vl)), "delimiterId");
        setupEpg(_epgMap, et -> ((WhiteDelimiter)et).getNumberNullable(), (et, vl) -> ((WhiteDelimiter)et).setNumberNullable(cti(vl)), "numberNullable");
        setupEpg(_epgMap, et -> ((WhiteDelimiter)et).getStringConverted(), (et, vl) -> ((WhiteDelimiter)et).setStringConverted((String)vl), "stringConverted");
        setupEpg(_epgMap, et -> ((WhiteDelimiter)et).getStringNonConverted(), (et, vl) -> ((WhiteDelimiter)et).setStringNonConverted((String)vl), "stringNonConverted");
        setupEpg(_epgMap, et -> ((WhiteDelimiter)et).getDateDefault(), (et, vl) -> ((WhiteDelimiter)et).setDateDefault(ctld(vl)), "dateDefault");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_delimiter";
    protected final String _tableDispName = "WHITE_DELIMITER";
    protected final String _tablePropertyName = "whiteDelimiter";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DELIMITER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDelimiterId = cci("DELIMITER_ID", "DELIMITER_ID", null, null, Long.class, "delimiterId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberNullable = cci("NUMBER_NULLABLE", "NUMBER_NULLABLE", null, null, Integer.class, "numberNullable", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStringConverted = cci("STRING_CONVERTED", "STRING_CONVERTED", null, null, String.class, "stringConverted", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStringNonConverted = cci("STRING_NON_CONVERTED", "STRING_NON_CONVERTED", null, null, String.class, "stringNonConverted", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateDefault = cci("DATE_DEFAULT", "DATE_DEFAULT", null, null, java.time.LocalDate.class, "dateDefault", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelimiterId() { return _columnDelimiterId; }
    /**
     * NUMBER_NULLABLE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberNullable() { return _columnNumberNullable; }
    /**
     * STRING_CONVERTED: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringConverted() { return _columnStringConverted; }
    /**
     * STRING_NON_CONVERTED: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringNonConverted() { return _columnStringNonConverted; }
    /**
     * DATE_DEFAULT: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateDefault() { return _columnDateDefault; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDelimiterId());
        ls.add(columnNumberNullable());
        ls.add(columnStringConverted());
        ls.add(columnStringNonConverted());
        ls.add(columnDateDefault());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDelimiterId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteDelimiter"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteDelimiterCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteDelimiterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDelimiter> getEntityType() { return WhiteDelimiter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDelimiter newEntity() { return new WhiteDelimiter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDelimiter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDelimiter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
