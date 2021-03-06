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
 * The DB meta of white_stiletto_alias_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteStilettoAliasRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteStilettoAliasRefDbm _instance = new WhiteStilettoAliasRefDbm();
    private WhiteStilettoAliasRefDbm() {}
    public static WhiteStilettoAliasRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getRefId(), (et, vl) -> ((WhiteStilettoAliasRef)et).setRefId(cti(vl)), "refId");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getFoo0(), (et, vl) -> ((WhiteStilettoAliasRef)et).setFoo0((String)vl), "foo0");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getFoo1(), (et, vl) -> ((WhiteStilettoAliasRef)et).setFoo1((String)vl), "foo1");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getFoo2(), (et, vl) -> ((WhiteStilettoAliasRef)et).setFoo2((String)vl), "foo2");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getFoo3(), (et, vl) -> ((WhiteStilettoAliasRef)et).setFoo3((String)vl), "foo3");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getFoo4(), (et, vl) -> ((WhiteStilettoAliasRef)et).setFoo4((String)vl), "foo4");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getBar0(), (et, vl) -> ((WhiteStilettoAliasRef)et).setBar0((String)vl), "bar0");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getQux0(), (et, vl) -> ((WhiteStilettoAliasRef)et).setQux0((String)vl), "qux0");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getC21(), (et, vl) -> ((WhiteStilettoAliasRef)et).setC21((String)vl), "c21");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getC22(), (et, vl) -> ((WhiteStilettoAliasRef)et).setC22((String)vl), "c22");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getC23(), (et, vl) -> ((WhiteStilettoAliasRef)et).setC23((String)vl), "c23");
        setupEpg(_epgMap, et -> ((WhiteStilettoAliasRef)et).getStilettoAliasId(), (et, vl) -> ((WhiteStilettoAliasRef)et).setStilettoAliasId(cti(vl)), "stilettoAliasId");
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
        setupEfpg(_efpgMap, et -> ((WhiteStilettoAliasRef)et).getWhiteStilettoAlias(), (et, vl) -> ((WhiteStilettoAliasRef)et).setWhiteStilettoAlias((OptionalEntity<WhiteStilettoAlias>)vl), "whiteStilettoAlias");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_stiletto_alias_ref";
    protected final String _tableDispName = "WHITE_STILETTO_ALIAS_REF";
    protected final String _tablePropertyName = "whiteStilettoAliasRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_STILETTO_ALIAS_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefId = cci("REF_ID", "REF_ID", null, null, Integer.class, "refId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFoo0 = cci("FOO0", "FOO0", null, null, String.class, "foo0", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFoo1 = cci("FOO_1", "FOO_1", null, null, String.class, "foo1", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFoo2 = cci("FOO2", "FOO2", null, null, String.class, "foo2", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFoo3 = cci("FOO3", "FOO3", null, null, String.class, "foo3", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFoo4 = cci("FOO_4", "FOO_4", null, null, String.class, "foo4", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBar0 = cci("BAR_0", "BAR_0", null, null, String.class, "bar0", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQux0 = cci("QUX_0", "QUX_0", null, null, String.class, "qux0", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnC21 = cci("c21", "c21", null, null, String.class, "c21", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnC22 = cci("c22", "c22", null, null, String.class, "c22", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnC23 = cci("c23", "c23", null, null, String.class, "c23", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStilettoAliasId = cci("STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", null, null, Integer.class, "stilettoAliasId", null, false, false, false, "INT", 10, 0, null, null, false, null, null, "whiteStilettoAlias", null, null, false);

    /**
     * REF_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefId() { return _columnRefId; }
    /**
     * FOO0: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo0() { return _columnFoo0; }
    /**
     * FOO_1: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo1() { return _columnFoo1; }
    /**
     * FOO2: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo2() { return _columnFoo2; }
    /**
     * FOO3: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo3() { return _columnFoo3; }
    /**
     * FOO_4: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo4() { return _columnFoo4; }
    /**
     * BAR_0: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBar0() { return _columnBar0; }
    /**
     * QUX_0: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQux0() { return _columnQux0; }
    /**
     * c21: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnC21() { return _columnC21; }
    /**
     * c22: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnC22() { return _columnC22; }
    /**
     * c23: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnC23() { return _columnC23; }
    /**
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStilettoAliasId() { return _columnStilettoAliasId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefId());
        ls.add(columnFoo0());
        ls.add(columnFoo1());
        ls.add(columnFoo2());
        ls.add(columnFoo3());
        ls.add(columnFoo4());
        ls.add(columnBar0());
        ls.add(columnQux0());
        ls.add(columnC21());
        ls.add(columnC22());
        ls.add(columnC23());
        ls.add(columnStilettoAliasId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefId()); }
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
     * WHITE_STILETTO_ALIAS by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteStilettoAlias() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStilettoAliasId(), WhiteStilettoAliasDbm.getInstance().columnStilettoAliasId());
        return cfi("FK_WHITE_STILETTO_ALIAS_REF", "whiteStilettoAlias", this, WhiteStilettoAliasDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteStilettoAliasRefList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteStilettoAliasRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteStilettoAliasRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteStilettoAliasRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteStilettoAliasRef> getEntityType() { return WhiteStilettoAliasRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteStilettoAliasRef newEntity() { return new WhiteStilettoAliasRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteStilettoAliasRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteStilettoAliasRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
