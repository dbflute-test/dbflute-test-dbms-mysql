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
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The DB meta of white_myself_check. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteMyselfCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteMyselfCheckDbm _instance = new WhiteMyselfCheckDbm();
    private WhiteMyselfCheckDbm() {}
    public static WhiteMyselfCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteMyselfCheck)et).getMyselfCheckId(), (et, vl) -> ((WhiteMyselfCheck)et).setMyselfCheckId(cti(vl)), "myselfCheckId");
        setupEpg(_epgMap, et -> ((WhiteMyselfCheck)et).getMyselfCheckName(), (et, vl) -> ((WhiteMyselfCheck)et).setMyselfCheckName((String)vl), "myselfCheckName");
        setupEpg(_epgMap, et -> ((WhiteMyselfCheck)et).getMyselfId(), (et, vl) -> ((WhiteMyselfCheck)et).setMyselfId(cti(vl)), "myselfId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WhiteMyselfCheck)et).getWhiteMyself(), (et, vl) -> ((WhiteMyselfCheck)et).setWhiteMyself((OptionalEntity<WhiteMyself>)vl), "whiteMyself");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_myself_check";
    protected final String _tableDispName = "WHITE_MYSELF_CHECK";
    protected final String _tablePropertyName = "whiteMyselfCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_MYSELF_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMyselfCheckId = cci("MYSELF_CHECK_ID", "MYSELF_CHECK_ID", null, null, Integer.class, "myselfCheckId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMyselfCheckName = cci("MYSELF_CHECK_NAME", "MYSELF_CHECK_NAME", null, null, String.class, "myselfCheckName", null, false, false, true, "VARCHAR", 80, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, Integer.class, "myselfId", null, false, false, false, "INT", 10, 0, null, null, false, null, null, "whiteMyself", null, null, false);

    /**
     * MYSELF_CHECK_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfCheckId() { return _columnMyselfCheckId; }
    /**
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfCheckName() { return _columnMyselfCheckName; }
    /**
     * MYSELF_ID: {IX, INT(10), FK to white_myself}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfId() { return _columnMyselfId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMyselfCheckId());
        ls.add(columnMyselfCheckName());
        ls.add(columnMyselfId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMyselfCheckId()); }
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
     * WHITE_MYSELF by my MYSELF_ID, named 'whiteMyself'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteMyself() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyselfId(), WhiteMyselfDbm.getInstance().columnMyselfId());
        return cfi("FK_WHITE_MYSELF_CHECK_SELF", "whiteMyself", this, WhiteMyselfDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteMyselfCheckList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteMyselfCheck"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteMyselfCheckCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteMyselfCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteMyselfCheck> getEntityType() { return WhiteMyselfCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteMyselfCheck newEntity() { return new WhiteMyselfCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteMyselfCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteMyselfCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
