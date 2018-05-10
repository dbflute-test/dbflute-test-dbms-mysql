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
 * The DB meta of white_perrotta_over_member. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePerrottaOverMemberDbm _instance = new WhitePerrottaOverMemberDbm();
    private WhitePerrottaOverMemberDbm() {}
    public static WhitePerrottaOverMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMember)et).getMemberId(), (et, vl) -> ((WhitePerrottaOverMember)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMember)et).getMemberName(), (et, vl) -> ((WhitePerrottaOverMember)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMember)et).getProductId(), (et, vl) -> ((WhitePerrottaOverMember)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMember)et).getTraceTypeCode(), (et, vl) -> ((WhitePerrottaOverMember)et).setTraceTypeCode((String)vl), "traceTypeCode");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverMember)et).getMachoCode(), (et, vl) -> ((WhitePerrottaOverMember)et).setMachoCode((String)vl), "machoCode");
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
        setupEfpg(_efpgMap, et -> ((WhitePerrottaOverMember)et).getWhitePerrottaOverMemberMacho(), (et, vl) -> ((WhitePerrottaOverMember)et).setWhitePerrottaOverMemberMacho((OptionalEntity<WhitePerrottaOverMemberMacho>)vl), "whitePerrottaOverMemberMacho");
        setupEfpg(_efpgMap, et -> ((WhitePerrottaOverMember)et).getWhitePerrottaOverProduct(), (et, vl) -> ((WhitePerrottaOverMember)et).setWhitePerrottaOverProduct((OptionalEntity<WhitePerrottaOverProduct>)vl), "whitePerrottaOverProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_perrotta_over_member";
    protected final String _tableDispName = "WHITE_PERROTTA_OVER_MEMBER";
    protected final String _tablePropertyName = "whitePerrottaOverMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PERROTTA_OVER_MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, true, "VARCHAR", 180, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Integer.class, "productId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "whitePerrottaOverProduct", null, null, false);
    protected final ColumnInfo _columnTraceTypeCode = cci("TRACE_TYPE_CODE", "TRACE_TYPE_CODE", null, null, String.class, "traceTypeCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachoCode = cci("MACHO_CODE", "MACHO_CODE", null, null, String.class, "machoCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, "whitePerrottaOverMemberMacho", null, null, false);

    /**
     * MEMBER_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {NotNull, VARCHAR(180)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * PRODUCT_ID: {IX, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceTypeCode() { return _columnTraceTypeCode; }
    /**
     * MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachoCode() { return _columnMachoCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnProductId());
        ls.add(columnTraceTypeCode());
        ls.add(columnMachoCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
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
     * WHITE_PERROTTA_OVER_MEMBER_MACHO by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePerrottaOverMemberMacho() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMachoCode(), WhitePerrottaOverMemberMachoDbm.getInstance().columnMachoCode());
        return cfi("FK_WHITE_PERROTTA_OVER_MEMBER_MACHO", "whitePerrottaOverMemberMacho", this, WhitePerrottaOverMemberMachoDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whitePerrottaOverMemberList", false);
    }
    /**
     * WHITE_PERROTTA_OVER_PRODUCT by my PRODUCT_ID, named 'whitePerrottaOverProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePerrottaOverProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhitePerrottaOverProductDbm.getInstance().columnProductId());
        return cfi("FK_WHITE_PERROTTA_OVER_MEMBER_PRODUCT", "whitePerrottaOverProduct", this, WhitePerrottaOverProductDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whitePerrottaOverMemberList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverMember"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhitePerrottaOverMemberCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverMemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePerrottaOverMember> getEntityType() { return WhitePerrottaOverMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePerrottaOverMember newEntity() { return new WhitePerrottaOverMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePerrottaOverMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePerrottaOverMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
