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
 * The DB meta of white_grouping_reference. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteGroupingReferenceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteGroupingReferenceDbm _instance = new WhiteGroupingReferenceDbm();
    private WhiteGroupingReferenceDbm() {}
    public static WhiteGroupingReferenceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteGroupingReference)et).getGroupingReferenceId(), (et, vl) -> ((WhiteGroupingReference)et).setGroupingReferenceId(ctl(vl)), "groupingReferenceId");
        setupEpg(_epgMap, et -> ((WhiteGroupingReference)et).getGroupingReferenceCode(), (et, vl) -> {
            ccls(et, columnGroupingReferenceCode(), vl);
            CDef.GroupingReference cls = (CDef.GroupingReference)gcls(et, columnGroupingReferenceCode(), vl);
            if (cls != null) {
                ((WhiteGroupingReference)et).setGroupingReferenceCodeAsGroupingReference(cls);
            } else {
                ((WhiteGroupingReference)et).mynativeMappingGroupingReferenceCode((String)vl);
            }
        }, "groupingReferenceCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_grouping_reference";
    protected final String _tableDispName = "WHITE_GROUPING_REFERENCE";
    protected final String _tablePropertyName = "whiteGroupingReference";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_GROUPING_REFERENCE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGroupingReferenceId = cci("GROUPING_REFERENCE_ID", "GROUPING_REFERENCE_ID", null, null, Long.class, "groupingReferenceId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGroupingReferenceCode = cci("GROUPING_REFERENCE_CODE", "GROUPING_REFERENCE_CODE", null, null, String.class, "groupingReferenceCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.GroupingReference, false);

    /**
     * GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGroupingReferenceId() { return _columnGroupingReferenceId; }
    /**
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGroupingReferenceCode() { return _columnGroupingReferenceCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGroupingReferenceId());
        ls.add(columnGroupingReferenceCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGroupingReferenceId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteGroupingReference"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteGroupingReferenceCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteGroupingReferenceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteGroupingReference> getEntityType() { return WhiteGroupingReference.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteGroupingReference newEntity() { return new WhiteGroupingReference(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteGroupingReference)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteGroupingReference)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
