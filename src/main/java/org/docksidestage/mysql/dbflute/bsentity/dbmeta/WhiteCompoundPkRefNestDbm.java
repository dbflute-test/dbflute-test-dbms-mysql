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
 * The DB meta of white_compound_pk_ref_nest. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefNestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefNestDbm _instance = new WhiteCompoundPkRefNestDbm();
    private WhiteCompoundPkRefNestDbm() {}
    public static WhiteCompoundPkRefNestDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefNest)et).getCompoundPkRefNestId(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setCompoundPkRefNestId(cti(vl)), "compoundPkRefNestId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefNest)et).getFooMultipleId(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setFooMultipleId(cti(vl)), "fooMultipleId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefNest)et).getBarMultipleId(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setBarMultipleId(cti(vl)), "barMultipleId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefNest)et).getQuxMultipleId(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setQuxMultipleId(cti(vl)), "quxMultipleId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefNest)et).getNestName(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setNestName((String)vl), "nestName");
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
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPkRefNest)et).getWhiteCompoundPkRefByQuxMultipleId(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setWhiteCompoundPkRefByQuxMultipleId((OptionalEntity<WhiteCompoundPkRef>)vl), "whiteCompoundPkRefByQuxMultipleId");
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPkRefNest)et).getWhiteCompoundPkRefByFooMultipleId(), (et, vl) -> ((WhiteCompoundPkRefNest)et).setWhiteCompoundPkRefByFooMultipleId((OptionalEntity<WhiteCompoundPkRef>)vl), "whiteCompoundPkRefByFooMultipleId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_ref_nest";
    protected final String _tableDispName = "WHITE_COMPOUND_PK_REF_NEST";
    protected final String _tablePropertyName = "whiteCompoundPkRefNest";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK_REF_NEST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCompoundPkRefNestId = cci("COMPOUND_PK_REF_NEST_ID", "COMPOUND_PK_REF_NEST_ID", null, null, Integer.class, "compoundPkRefNestId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooMultipleId = cci("FOO_MULTIPLE_ID", "FOO_MULTIPLE_ID", null, null, Integer.class, "fooMultipleId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefByFooMultipleId", null, null, false);
    protected final ColumnInfo _columnBarMultipleId = cci("BAR_MULTIPLE_ID", "BAR_MULTIPLE_ID", null, null, Integer.class, "barMultipleId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefByQuxMultipleId,whiteCompoundPkRefByFooMultipleId", null, null, false);
    protected final ColumnInfo _columnQuxMultipleId = cci("QUX_MULTIPLE_ID", "QUX_MULTIPLE_ID", null, null, Integer.class, "quxMultipleId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefByQuxMultipleId", null, null, false);
    protected final ColumnInfo _columnNestName = cci("NEST_NAME", "NEST_NAME", null, null, String.class, "nestName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);

    /**
     * COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundPkRefNestId() { return _columnCompoundPkRefNestId; }
    /**
     * FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooMultipleId() { return _columnFooMultipleId; }
    /**
     * BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarMultipleId() { return _columnBarMultipleId; }
    /**
     * QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuxMultipleId() { return _columnQuxMultipleId; }
    /**
     * NEST_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNestName() { return _columnNestName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCompoundPkRefNestId());
        ls.add(columnFooMultipleId());
        ls.add(columnBarMultipleId());
        ls.add(columnQuxMultipleId());
        ls.add(columnNestName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCompoundPkRefNestId()); }
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
     * white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPkRefByQuxMultipleId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnBarMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleFirstId());
        mp.put(columnQuxMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_NEST_BAR_QUX", "whiteCompoundPkRefByQuxMultipleId", this, WhiteCompoundPkRefDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteCompoundPkRefNestByQuxMultipleIdList", false);
    }
    /**
     * white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPkRefByFooMultipleId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnFooMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleFirstId());
        mp.put(columnBarMultipleId(), WhiteCompoundPkRefDbm.getInstance().columnMultipleSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_NEST_FOO_BAR", "whiteCompoundPkRefByFooMultipleId", this, WhiteCompoundPkRefDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteCompoundPkRefNestByFooMultipleIdList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRefNest"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkRefNestCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefNestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRefNest> getEntityType() { return WhiteCompoundPkRefNest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPkRefNest newEntity() { return new WhiteCompoundPkRefNest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRefNest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkRefNest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
