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
 * The DB meta of white_perrotta_over_member_macho. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverMemberMachoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePerrottaOverMemberMachoDbm _instance = new WhitePerrottaOverMemberMachoDbm();
    private WhitePerrottaOverMemberMachoDbm() {}
    public static WhitePerrottaOverMemberMachoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMemberMacho)et).getMachoCode(), (et, vl) -> ((WhitePerrottaOverMemberMacho)et).setMachoCode((String)vl), "machoCode");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMemberMacho)et).getMachoName(), (et, vl) -> ((WhitePerrottaOverMemberMacho)et).setMachoName((String)vl), "machoName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_perrotta_over_member_macho";
    protected final String _tablePropertyName = "whitePerrottaOverMemberMacho";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PERROTTA_OVER_MEMBER_MACHO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMachoCode = cci("MACHO_CODE", "MACHO_CODE", null, null, String.class, "machoCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "whitePerrottaOverMemberList", null, false);
    protected final ColumnInfo _columnMachoName = cci("MACHO_NAME", "MACHO_NAME", null, null, String.class, "machoName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);

    /**
     * MACHO_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachoCode() { return _columnMachoCode; }
    /**
     * MACHO_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachoName() { return _columnMachoName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMachoCode());
        ls.add(columnMachoName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMachoCode()); }
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
    /**
     * white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePerrottaOverMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMachoCode(), WhitePerrottaOverMemberDbm.getInstance().columnMachoCode());
        return cri("FK_WHITE_PERROTTA_OVER_MEMBER_MACHO", "whitePerrottaOverMemberList", this, WhitePerrottaOverMemberDbm.getInstance(), mp, false, "whitePerrottaOverMemberMacho");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverMemberMacho"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhitePerrottaOverMemberMachoCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverMemberMachoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePerrottaOverMemberMacho> getEntityType() { return WhitePerrottaOverMemberMacho.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePerrottaOverMemberMacho newEntity() { return new WhitePerrottaOverMemberMacho(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePerrottaOverMemberMacho)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePerrottaOverMemberMacho)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
