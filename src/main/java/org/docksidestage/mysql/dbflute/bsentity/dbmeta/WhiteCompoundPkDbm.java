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
 * The DB meta of white_compound_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkDbm _instance = new WhiteCompoundPkDbm();
    private WhiteCompoundPkDbm() {}
    public static WhiteCompoundPkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkFirstId(), (et, vl) -> ((WhiteCompoundPk)et).setPkFirstId(cti(vl)), "pkFirstId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkSecondId(), (et, vl) -> ((WhiteCompoundPk)et).setPkSecondId(cti(vl)), "pkSecondId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkName(), (et, vl) -> ((WhiteCompoundPk)et).setPkName((String)vl), "pkName");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getReferredId(), (et, vl) -> ((WhiteCompoundPk)et).setReferredId(cti(vl)), "referredId");
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
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPk)et).getWhiteCompoundReferredNormally(), (et, vl) -> ((WhiteCompoundPk)et).setWhiteCompoundReferredNormally((OptionalEntity<WhiteCompoundReferredNormally>)vl), "whiteCompoundReferredNormally");
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPk)et).getWhiteCompoundReferredPrimary(), (et, vl) -> ((WhiteCompoundPk)et).setWhiteCompoundReferredPrimary((OptionalEntity<WhiteCompoundReferredPrimary>)vl), "whiteCompoundReferredPrimary");
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPk)et).getWhiteCompoundPkRefManyAsMax(), (et, vl) -> ((WhiteCompoundPk)et).setWhiteCompoundPkRefManyAsMax((OptionalEntity<WhiteCompoundPkRefMany>)vl), "whiteCompoundPkRefManyAsMax");
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPk)et).getWhiteCompoundPkRefManyAsMin(), (et, vl) -> ((WhiteCompoundPk)et).setWhiteCompoundPkRefManyAsMin((OptionalEntity<WhiteCompoundPkRefMany>)vl), "whiteCompoundPkRefManyAsMin");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk";
    protected final String _tableDispName = "WHITE_COMPOUND_PK";
    protected final String _tablePropertyName = "whiteCompoundPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPkFirstId = cci("PK_FIRST_ID", "PK_FIRST_ID", null, null, Integer.class, "pkFirstId", null, true, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefManyAsMax,whiteCompoundPkRefManyAsMin", "whiteCompoundPkRefList,whiteCompoundPkRefManyToPKList", null, false);
    protected final ColumnInfo _columnPkSecondId = cci("PK_SECOND_ID", "PK_SECOND_ID", null, null, Integer.class, "pkSecondId", null, true, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundReferredPrimary,whiteCompoundPkRefManyAsMax,whiteCompoundPkRefManyAsMin", "whiteCompoundPkRefList,whiteCompoundPkRefManyToPKList", null, false);
    protected final ColumnInfo _columnPkName = cci("PK_NAME", "PK_NAME", null, null, String.class, "pkName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferredId = cci("REFERRED_ID", "REFERRED_ID", null, null, Integer.class, "referredId", null, false, false, true, "INT", 10, 0, null, false, null, null, "whiteCompoundReferredNormally", null, null, false);

    /**
     * PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkFirstId() { return _columnPkFirstId; }
    /**
     * PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkSecondId() { return _columnPkSecondId; }
    /**
     * PK_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkName() { return _columnPkName; }
    /**
     * REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferredId() { return _columnReferredId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        ls.add(columnPkName());
        ls.add(columnReferredId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfPkSecondIdReferredId() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPkSecondId());
        ls.add(columnReferredId());
        return hpcui(ls);
    }
    public UniqueInfo uniqueOfPkSecondIdPkFirstId() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPkSecondId());
        ls.add(columnPkFirstId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundReferredNormally() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReferredId(), WhiteCompoundReferredNormallyDbm.getInstance().columnReferredId());
        return cfi("FK_WHITE_COMPOUND_PK_REFERRED_NORMALLY_TEST", "whiteCompoundReferredNormally", this, WhiteCompoundReferredNormallyDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "whiteCompoundPkList", false);
    }
    /**
     * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundReferredPrimary() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPkSecondId(), WhiteCompoundReferredPrimaryDbm.getInstance().columnReferredId());
        return cfi("FK_WHITE_COMPOUND_PK_REFERRED_PRIMARY_TEST", "whiteCompoundReferredPrimary", this, WhiteCompoundReferredPrimaryDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "whiteCompoundPkList", false);
    }
    /**
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPkRefManyAsMax() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManyFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManySecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_MANY_DERIVED_ONE_MAX_TEST", "whiteCompoundPkRefManyAsMax", this, WhiteCompoundPkRefManyDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.REF_MANY_DATETIME = ($$sqbegin$$\nselect max(many.REF_MANY_DATETIME)\n  from WHITE_COMPOUND_PK_REF_MANY many\n where many.REF_MANY_FIRST_ID = $$foreignAlias$$.REF_MANY_FIRST_ID\n   and many.REF_MANY_SECOND_ID = $$foreignAlias$$.REF_MANY_SECOND_ID\n   and many.REF_MANY_CODE = 'TPK'\n)$$sqend$$", null, false, null, false);
    }
    /**
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPkRefManyAsMin() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManyFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManySecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_MANY_DERIVED_ONE_MIN_TEST", "whiteCompoundPkRefManyAsMin", this, WhiteCompoundPkRefManyDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.REF_MANY_DATETIME = ($$sqbegin$$\nselect min(many.REF_MANY_DATETIME)\n  from WHITE_COMPOUND_PK_REF_MANY many\n where many.REF_MANY_FIRST_ID = $$foreignAlias$$.REF_MANY_FIRST_ID\n   and many.REF_MANY_SECOND_ID = $$foreignAlias$$.REF_MANY_SECOND_ID\n   and many.REF_MANY_CODE = 'TPK'\n)$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefDbm.getInstance().columnRefFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefDbm.getInstance().columnRefSecondId());
        return cri("FK_WHITE_COMPOUND_PK_REF", "whiteCompoundPkRefList", this, WhiteCompoundPkRefDbm.getInstance(), mp, false, "whiteCompoundPk");
    }
    /**
     * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefManyToPKList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManyFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManySecondId());
        return cri("FK_WHITE_COMPOUND_PK_REF_MANY_TO_ONE_TEST", "whiteCompoundPkRefManyToPKList", this, WhiteCompoundPkRefManyDbm.getInstance(), mp, false, "whiteCompoundPkToPK");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPk"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPk> getEntityType() { return WhiteCompoundPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPk newEntity() { return new WhiteCompoundPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
