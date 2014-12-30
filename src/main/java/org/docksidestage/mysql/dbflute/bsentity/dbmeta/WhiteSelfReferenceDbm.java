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
 * The DB meta of white_self_reference. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSelfReferenceDbm _instance = new WhiteSelfReferenceDbm();
    private WhiteSelfReferenceDbm() {}
    public static WhiteSelfReferenceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSelfReference)et).getSelfReferenceId(), (et, vl) -> ((WhiteSelfReference)et).setSelfReferenceId(ctl(vl)), "selfReferenceId");
        setupEpg(_epgMap, et -> ((WhiteSelfReference)et).getSelfReferenceName(), (et, vl) -> ((WhiteSelfReference)et).setSelfReferenceName((String)vl), "selfReferenceName");
        setupEpg(_epgMap, et -> ((WhiteSelfReference)et).getParentId(), (et, vl) -> ((WhiteSelfReference)et).setParentId(ctl(vl)), "parentId");
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
        setupEfpg(_efpgMap, et -> ((WhiteSelfReference)et).getWhiteSelfReferenceSelf(), (et, vl) -> ((WhiteSelfReference)et).setWhiteSelfReferenceSelf((OptionalEntity<WhiteSelfReference>)vl), "whiteSelfReferenceSelf");
        setupEfpg(_efpgMap, et -> ((WhiteSelfReference)et).getWhiteSelfReferenceRefOneAsOne(), (et, vl) -> ((WhiteSelfReference)et).setWhiteSelfReferenceRefOneAsOne((OptionalEntity<WhiteSelfReferenceRefOne>)vl), "whiteSelfReferenceRefOneAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_self_reference";
    protected final String _tablePropertyName = "whiteSelfReference";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SELF_REFERENCE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSelfReferenceId = cci("SELF_REFERENCE_ID", "SELF_REFERENCE_ID", null, null, Long.class, "selfReferenceId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, "whiteSelfReferenceSelfList", null, false);
    protected final ColumnInfo _columnSelfReferenceName = cci("SELF_REFERENCE_NAME", "SELF_REFERENCE_NAME", null, null, String.class, "selfReferenceName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParentId = cci("PARENT_ID", "PARENT_ID", null, null, Long.class, "parentId", null, false, false, false, "DECIMAL", 16, 0, null, false, null, null, "whiteSelfReferenceSelf", null, null, false);

    /**
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfReferenceId() { return _columnSelfReferenceId; }
    /**
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfReferenceName() { return _columnSelfReferenceName; }
    /**
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentId() { return _columnParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSelfReferenceId());
        ls.add(columnSelfReferenceName());
        ls.add(columnParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSelfReferenceId()); }
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
     * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReferenceSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentId(), WhiteSelfReferenceDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_PARENT", "whiteSelfReferenceSelf", this, WhiteSelfReferenceDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteSelfReferenceSelfList", false);
    }
    /**
     * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReferenceRefOneAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceRefOneDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE", "whiteSelfReferenceRefOneAsOne", this, WhiteSelfReferenceRefOneDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "whiteSelfReference", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSelfReferenceSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnParentId());
        return cri("FK_WHITE_SELF_REFERENCE_PARENT", "whiteSelfReferenceSelfList", this, WhiteSelfReferenceDbm.getInstance(), mp, false, "whiteSelfReferenceSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSelfReference"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSelfReferenceCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSelfReferenceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSelfReference> getEntityType() { return WhiteSelfReference.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSelfReference newEntity() { return new WhiteSelfReference(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSelfReference)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSelfReference)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
