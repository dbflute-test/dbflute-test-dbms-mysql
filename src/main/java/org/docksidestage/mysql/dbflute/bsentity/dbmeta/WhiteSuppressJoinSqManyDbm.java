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
 * The DB meta of white_suppress_join_sq_many. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqManyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqManyDbm _instance = new WhiteSuppressJoinSqManyDbm();
    private WhiteSuppressJoinSqManyDbm() {}
    public static WhiteSuppressJoinSqManyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqMany)et).getManyId(), (et, vl) -> ((WhiteSuppressJoinSqMany)et).setManyId(cti(vl)), "manyId");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqMany)et).getManyName(), (et, vl) -> ((WhiteSuppressJoinSqMany)et).setManyName((String)vl), "manyName");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqMany)et).getSuppressJoinSqId(), (et, vl) -> ((WhiteSuppressJoinSqMany)et).setSuppressJoinSqId(cti(vl)), "suppressJoinSqId");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqMany)et).getManyOneId(), (et, vl) -> ((WhiteSuppressJoinSqMany)et).setManyOneId(cti(vl)), "manyOneId");
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
        setupEfpg(_efpgMap, et -> ((WhiteSuppressJoinSqMany)et).getWhiteSuppressJoinSqManyOne(), (et, vl) -> ((WhiteSuppressJoinSqMany)et).setWhiteSuppressJoinSqManyOne((OptionalEntity<WhiteSuppressJoinSqManyOne>)vl), "whiteSuppressJoinSqManyOne");
        setupEfpg(_efpgMap, et -> ((WhiteSuppressJoinSqMany)et).getWhiteSuppressJoinSq(), (et, vl) -> ((WhiteSuppressJoinSqMany)et).setWhiteSuppressJoinSq((OptionalEntity<WhiteSuppressJoinSq>)vl), "whiteSuppressJoinSq");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_many";
    protected final String _tableDispName = "WHITE_SUPPRESS_JOIN_SQ_MANY";
    protected final String _tablePropertyName = "whiteSuppressJoinSqMany";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_MANY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnManyId = cci("MANY_ID", "MANY_ID", null, null, Integer.class, "manyId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManyName = cci("MANY_NAME", "MANY_NAME", null, null, String.class, "manyName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppressJoinSqId = cci("SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", null, null, Integer.class, "suppressJoinSqId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "whiteSuppressJoinSq", null, null, false);
    protected final ColumnInfo _columnManyOneId = cci("MANY_ONE_ID", "MANY_ONE_ID", null, null, Integer.class, "manyOneId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "whiteSuppressJoinSqManyOne", null, null, false);

    /**
     * MANY_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyId() { return _columnManyId; }
    /**
     * MANY_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyName() { return _columnManyName; }
    /**
     * SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqId() { return _columnSuppressJoinSqId; }
    /**
     * MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneId() { return _columnManyOneId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnManyId());
        ls.add(columnManyName());
        ls.add(columnSuppressJoinSqId());
        ls.add(columnManyOneId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnManyId()); }
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
     * WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqManyOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnManyOneId(), WhiteSuppressJoinSqManyOneDbm.getInstance().columnManyOneId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE", "whiteSuppressJoinSqManyOne", this, WhiteSuppressJoinSqManyOneDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteSuppressJoinSqManyList", false);
    }
    /**
     * WHITE_SUPPRESS_JOIN_SQ by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSq() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqDbm.getInstance().columnSuppressJoinSqId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_MANY", "whiteSuppressJoinSq", this, WhiteSuppressJoinSqDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteSuppressJoinSqManyList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSqMany"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqManyCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqMany> getEntityType() { return WhiteSuppressJoinSqMany.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqMany newEntity() { return new WhiteSuppressJoinSqMany(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqMany)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqMany)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
