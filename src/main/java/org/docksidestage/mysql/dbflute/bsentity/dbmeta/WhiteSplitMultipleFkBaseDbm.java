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
 * The DB meta of white_split_multiple_fk_base. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSplitMultipleFkBaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSplitMultipleFkBaseDbm _instance = new WhiteSplitMultipleFkBaseDbm();
    private WhiteSplitMultipleFkBaseDbm() {}
    public static WhiteSplitMultipleFkBaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSplitMultipleFkBase)et).getBaseId(), (et, vl) -> ((WhiteSplitMultipleFkBase)et).setBaseId(ctl(vl)), "baseId");
        setupEpg(_epgMap, et -> ((WhiteSplitMultipleFkBase)et).getFirstId(), (et, vl) -> ((WhiteSplitMultipleFkBase)et).setFirstId(cti(vl)), "firstId");
        setupEpg(_epgMap, et -> ((WhiteSplitMultipleFkBase)et).getNextId(), (et, vl) -> ((WhiteSplitMultipleFkBase)et).setNextId(ctl(vl)), "nextId");
        setupEpg(_epgMap, et -> ((WhiteSplitMultipleFkBase)et).getSplitName(), (et, vl) -> ((WhiteSplitMultipleFkBase)et).setSplitName((String)vl), "splitName");
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
        setupEfpg(_efpgMap, et -> ((WhiteSplitMultipleFkBase)et).getWhiteSplitMultipleFkNext(), (et, vl) -> ((WhiteSplitMultipleFkBase)et).setWhiteSplitMultipleFkNext((OptionalEntity<WhiteSplitMultipleFkNext>)vl), "whiteSplitMultipleFkNext");
        setupEfpg(_efpgMap, et -> ((WhiteSplitMultipleFkBase)et).getWhiteSplitMultipleFkRefAsSplitMultipleFkTest(), (et, vl) -> ((WhiteSplitMultipleFkBase)et).setWhiteSplitMultipleFkRefAsSplitMultipleFkTest((OptionalEntity<WhiteSplitMultipleFkRef>)vl), "whiteSplitMultipleFkRefAsSplitMultipleFkTest");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_split_multiple_fk_base";
    protected final String _tableDispName = "WHITE_SPLIT_MULTIPLE_FK_BASE";
    protected final String _tablePropertyName = "whiteSplitMultipleFkBase";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SPLIT_MULTIPLE_FK_BASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Long.class, "baseId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, "whiteSplitMultipleFkChildList", null, false);
    protected final ColumnInfo _columnFirstId = cci("FIRST_ID", "FIRST_ID", null, null, Integer.class, "firstId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "whiteSplitMultipleFkRefAsSplitMultipleFkTest", null, null, false);
    protected final ColumnInfo _columnNextId = cci("NEXT_ID", "NEXT_ID", null, null, Long.class, "nextId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "whiteSplitMultipleFkNext", null, null, false);
    protected final ColumnInfo _columnSplitName = cci("SPLIT_NAME", "SPLIT_NAME", null, null, String.class, "splitName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }
    /**
     * FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstId() { return _columnFirstId; }
    /**
     * NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextId() { return _columnNextId; }
    /**
     * SPLIT_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplitName() { return _columnSplitName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBaseId());
        ls.add(columnFirstId());
        ls.add(columnNextId());
        ls.add(columnSplitName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBaseId()); }
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
     * WHITE_SPLIT_MULTIPLE_FK_NEXT by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSplitMultipleFkNext() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextId(), WhiteSplitMultipleFkNextDbm.getInstance().columnNextId());
        return cfi("FK_WHITE_SPLIT_MULTIPLE_FK_NEXT", "whiteSplitMultipleFkNext", this, WhiteSplitMultipleFkNextDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteSplitMultipleFkBaseList", false);
    }
    /**
     * WHITE_SPLIT_MULTIPLE_FK_REF by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFirstId(), WhiteSplitMultipleFkRefDbm.getInstance().columnFirstId());
        return cfi("FK_WHITE_SPLIT_MULTIPLE_FK", "whiteSplitMultipleFkRefAsSplitMultipleFkTest", this, WhiteSplitMultipleFkRefDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$over($localTable.whiteSplitMultipleFkNext)$$.SECOND_CODE = $$foreignAlias$$.SECOND_CODE", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * WHITE_SPLIT_MULTIPLE_FK_CHILD by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSplitMultipleFkChildList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteSplitMultipleFkChildDbm.getInstance().columnBaseId());
        return cri("FK_WHITE_SPLIT_MULTIPLE_FK_BASE", "whiteSplitMultipleFkChildList", this, WhiteSplitMultipleFkChildDbm.getInstance(), mp, false, "whiteSplitMultipleFkBase");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSplitMultipleFkBase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSplitMultipleFkBaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSplitMultipleFkBaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSplitMultipleFkBase> getEntityType() { return WhiteSplitMultipleFkBase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSplitMultipleFkBase newEntity() { return new WhiteSplitMultipleFkBase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSplitMultipleFkBase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSplitMultipleFkBase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
