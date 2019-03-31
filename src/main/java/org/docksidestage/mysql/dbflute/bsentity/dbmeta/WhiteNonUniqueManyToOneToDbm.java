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
 * The DB meta of white_non_unique_many_to_one_to. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteNonUniqueManyToOneToDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteNonUniqueManyToOneToDbm _instance = new WhiteNonUniqueManyToOneToDbm();
    private WhiteNonUniqueManyToOneToDbm() {}
    public static WhiteNonUniqueManyToOneToDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneTo)et).getToId(), (et, vl) -> ((WhiteNonUniqueManyToOneTo)et).setToId(ctl(vl)), "toId");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneTo)et).getToName(), (et, vl) -> ((WhiteNonUniqueManyToOneTo)et).setToName((String)vl), "toName");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneTo)et).getNonUniqueCode(), (et, vl) -> ((WhiteNonUniqueManyToOneTo)et).setNonUniqueCode((String)vl), "nonUniqueCode");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneTo)et).getBeginDate(), (et, vl) -> ((WhiteNonUniqueManyToOneTo)et).setBeginDate(ctld(vl)), "beginDate");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneTo)et).getEndDate(), (et, vl) -> ((WhiteNonUniqueManyToOneTo)et).setEndDate(ctld(vl)), "endDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_non_unique_many_to_one_to";
    protected final String _tableDispName = "WHITE_NON_UNIQUE_MANY_TO_ONE_TO";
    protected final String _tablePropertyName = "whiteNonUniqueManyToOneTo";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_NON_UNIQUE_MANY_TO_ONE_TO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnToId = cci("TO_ID", "TO_ID", null, null, Long.class, "toId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToName = cci("TO_NAME", "TO_NAME", null, null, String.class, "toName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonUniqueCode = cci("NON_UNIQUE_CODE", "NON_UNIQUE_CODE", null, null, String.class, "nonUniqueCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBeginDate = cci("BEGIN_DATE", "BEGIN_DATE", null, null, java.time.LocalDate.class, "beginDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndDate = cci("END_DATE", "END_DATE", null, null, java.time.LocalDate.class, "endDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TO_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToId() { return _columnToId; }
    /**
     * TO_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToName() { return _columnToName; }
    /**
     * NON_UNIQUE_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonUniqueCode() { return _columnNonUniqueCode; }
    /**
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeginDate() { return _columnBeginDate; }
    /**
     * END_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndDate() { return _columnEndDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnToId());
        ls.add(columnToName());
        ls.add(columnNonUniqueCode());
        ls.add(columnBeginDate());
        ls.add(columnEndDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnToId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteNonUniqueManyToOneTo"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteNonUniqueManyToOneToCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteNonUniqueManyToOneToBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteNonUniqueManyToOneTo> getEntityType() { return WhiteNonUniqueManyToOneTo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteNonUniqueManyToOneTo newEntity() { return new WhiteNonUniqueManyToOneTo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteNonUniqueManyToOneTo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteNonUniqueManyToOneTo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
