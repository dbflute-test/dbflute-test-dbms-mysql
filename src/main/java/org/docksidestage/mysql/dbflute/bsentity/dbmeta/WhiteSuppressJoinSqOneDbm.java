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
 * The DB meta of white_suppress_join_sq_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqOneDbm _instance = new WhiteSuppressJoinSqOneDbm();
    private WhiteSuppressJoinSqOneDbm() {}
    public static WhiteSuppressJoinSqOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqOne)et).getOneId(), (et, vl) -> ((WhiteSuppressJoinSqOne)et).setOneId(cti(vl)), "oneId");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqOne)et).getOneName(), (et, vl) -> ((WhiteSuppressJoinSqOne)et).setOneName((String)vl), "oneName");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqOne)et).getSuppressJoinSqId(), (et, vl) -> ((WhiteSuppressJoinSqOne)et).setSuppressJoinSqId(cti(vl)), "suppressJoinSqId");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqOne)et).getOneAddiId(), (et, vl) -> ((WhiteSuppressJoinSqOne)et).setOneAddiId(cti(vl)), "oneAddiId");
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
        setupEfpg(_efpgMap, et -> ((WhiteSuppressJoinSqOne)et).getWhiteSuppressJoinSq(), (et, vl) -> ((WhiteSuppressJoinSqOne)et).setWhiteSuppressJoinSq((OptionalEntity<WhiteSuppressJoinSq>)vl), "whiteSuppressJoinSq");
        setupEfpg(_efpgMap, et -> ((WhiteSuppressJoinSqOne)et).getWhiteSuppressJoinSqOneAddi(), (et, vl) -> ((WhiteSuppressJoinSqOne)et).setWhiteSuppressJoinSqOneAddi((OptionalEntity<WhiteSuppressJoinSqOneAddi>)vl), "whiteSuppressJoinSqOneAddi");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_one";
    protected final String _tableDispName = "WHITE_SUPPRESS_JOIN_SQ_ONE";
    protected final String _tablePropertyName = "whiteSuppressJoinSqOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOneId = cci("ONE_ID", "ONE_ID", null, null, Integer.class, "oneId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOneName = cci("ONE_NAME", "ONE_NAME", null, null, String.class, "oneName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppressJoinSqId = cci("SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", null, null, Integer.class, "suppressJoinSqId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSq", null, null, false);
    protected final ColumnInfo _columnOneAddiId = cci("ONE_ADDI_ID", "ONE_ADDI_ID", null, null, Integer.class, "oneAddiId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteSuppressJoinSqOneAddi", null, null, false);

    /**
     * ONE_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneId() { return _columnOneId; }
    /**
     * ONE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneName() { return _columnOneName; }
    /**
     * SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqId() { return _columnSuppressJoinSqId; }
    /**
     * ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneAddiId() { return _columnOneAddiId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnOneId());
        ls.add(columnOneName());
        ls.add(columnSuppressJoinSqId());
        ls.add(columnOneAddiId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnOneId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnSuppressJoinSqId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSq() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqDbm.getInstance().columnSuppressJoinSqId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_ONE", "whiteSuppressJoinSq", this, WhiteSuppressJoinSqDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "whiteSuppressJoinSqOneAsOne", false);
    }
    /**
     * white_suppress_join_sq_one_addi by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqOneAddi() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOneAddiId(), WhiteSuppressJoinSqOneAddiDbm.getInstance().columnOneAddiId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI_TEST", "whiteSuppressJoinSqOneAddi", this, WhiteSuppressJoinSqOneAddiDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "whiteSuppressJoinSqOneList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSqOne"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqOneCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqOne> getEntityType() { return WhiteSuppressJoinSqOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqOne newEntity() { return new WhiteSuppressJoinSqOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqOne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqOne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
