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
 * The DB meta of white_self_reference_ref_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceRefOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSelfReferenceRefOneDbm _instance = new WhiteSelfReferenceRefOneDbm();
    private WhiteSelfReferenceRefOneDbm() {}
    public static WhiteSelfReferenceRefOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSelfReferenceRefOne)et).getSelfReferenceId(), (et, vl) -> ((WhiteSelfReferenceRefOne)et).setSelfReferenceId(ctl(vl)), "selfReferenceId");
        setupEpg(_epgMap, et -> ((WhiteSelfReferenceRefOne)et).getSelfReferenceRefOneName(), (et, vl) -> ((WhiteSelfReferenceRefOne)et).setSelfReferenceRefOneName((String)vl), "selfReferenceRefOneName");
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
        setupEfpg(_efpgMap, et -> ((WhiteSelfReferenceRefOne)et).getWhiteSelfReference(), (et, vl) -> ((WhiteSelfReferenceRefOne)et).setWhiteSelfReference((OptionalEntity<WhiteSelfReference>)vl), "whiteSelfReference");
        setupEfpg(_efpgMap, et -> ((WhiteSelfReferenceRefOne)et).getWhiteSelfReferenceAsDirectParent(), (et, vl) -> ((WhiteSelfReferenceRefOne)et).setWhiteSelfReferenceAsDirectParent((OptionalEntity<WhiteSelfReference>)vl), "whiteSelfReferenceAsDirectParent");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_self_reference_ref_one";
    protected final String _tableDispName = "WHITE_SELF_REFERENCE_REF_ONE";
    protected final String _tablePropertyName = "whiteSelfReferenceRefOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SELF_REFERENCE_REF_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSelfReferenceId = cci("SELF_REFERENCE_ID", "SELF_REFERENCE_ID", null, null, Long.class, "selfReferenceId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, "whiteSelfReference,whiteSelfReferenceAsDirectParent", null, null, false);
    protected final ColumnInfo _columnSelfReferenceRefOneName = cci("SELF_REFERENCE_REF_ONE_NAME", "SELF_REFERENCE_REF_ONE_NAME", null, null, String.class, "selfReferenceRefOneName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfReferenceId() { return _columnSelfReferenceId; }
    /**
     * SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfReferenceRefOneName() { return _columnSelfReferenceRefOneName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSelfReferenceId());
        ls.add(columnSelfReferenceRefOneName());
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
     * WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReference() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE", "whiteSelfReference", this, WhiteSelfReferenceDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "whiteSelfReferenceRefOneAsOne", false);
    }
    /**
     * WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReferenceAsDirectParent() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnParentId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT", "whiteSelfReferenceAsDirectParent", this, WhiteSelfReferenceDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "1=1", null, false, null, false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSelfReferenceRefOne"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSelfReferenceRefOneCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSelfReferenceRefOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSelfReferenceRefOne> getEntityType() { return WhiteSelfReferenceRefOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSelfReferenceRefOne newEntity() { return new WhiteSelfReferenceRefOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSelfReferenceRefOne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSelfReferenceRefOne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
