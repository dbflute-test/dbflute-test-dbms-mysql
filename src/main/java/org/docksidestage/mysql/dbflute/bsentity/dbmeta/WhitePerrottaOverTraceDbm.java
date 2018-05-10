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
 * The DB meta of white_perrotta_over_trace. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverTraceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePerrottaOverTraceDbm _instance = new WhitePerrottaOverTraceDbm();
    private WhitePerrottaOverTraceDbm() {}
    public static WhitePerrottaOverTraceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhitePerrottaOverTrace)et).getTraceId(), (et, vl) -> ((WhitePerrottaOverTrace)et).setTraceId(ctl(vl)), "traceId");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverTrace)et).getPreviousProductId(), (et, vl) -> ((WhitePerrottaOverTrace)et).setPreviousProductId(cti(vl)), "previousProductId");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverTrace)et).getNextProductId(), (et, vl) -> ((WhitePerrottaOverTrace)et).setNextProductId(cti(vl)), "nextProductId");
        setupEpg(_epgMap, et -> ((WhitePerrottaOverTrace)et).getTraceTypeCode(), (et, vl) -> ((WhitePerrottaOverTrace)et).setTraceTypeCode((String)vl), "traceTypeCode");
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
        setupEfpg(_efpgMap, et -> ((WhitePerrottaOverTrace)et).getWhitePerrottaOverProductByNextProductId(), (et, vl) -> ((WhitePerrottaOverTrace)et).setWhitePerrottaOverProductByNextProductId((OptionalEntity<WhitePerrottaOverProduct>)vl), "whitePerrottaOverProductByNextProductId");
        setupEfpg(_efpgMap, et -> ((WhitePerrottaOverTrace)et).getWhitePerrottaOverProductByPreviousProductId(), (et, vl) -> ((WhitePerrottaOverTrace)et).setWhitePerrottaOverProductByPreviousProductId((OptionalEntity<WhitePerrottaOverProduct>)vl), "whitePerrottaOverProductByPreviousProductId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_perrotta_over_trace";
    protected final String _tableDispName = "WHITE_PERROTTA_OVER_TRACE";
    protected final String _tablePropertyName = "whitePerrottaOverTrace";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PERROTTA_OVER_TRACE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTraceId = cci("TRACE_ID", "TRACE_ID", null, null, Long.class, "traceId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPreviousProductId = cci("PREVIOUS_PRODUCT_ID", "PREVIOUS_PRODUCT_ID", null, null, Integer.class, "previousProductId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "whitePerrottaOverProductByPreviousProductId", null, null, false);
    protected final ColumnInfo _columnNextProductId = cci("NEXT_PRODUCT_ID", "NEXT_PRODUCT_ID", null, null, Integer.class, "nextProductId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "whitePerrottaOverProductByNextProductId", null, null, false);
    protected final ColumnInfo _columnTraceTypeCode = cci("TRACE_TYPE_CODE", "TRACE_TYPE_CODE", null, null, String.class, "traceTypeCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TRACE_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceId() { return _columnTraceId; }
    /**
     * PREVIOUS_PRODUCT_ID: {UQ+, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPreviousProductId() { return _columnPreviousProductId; }
    /**
     * NEXT_PRODUCT_ID: {+UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextProductId() { return _columnNextProductId; }
    /**
     * TRACE_TYPE_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceTypeCode() { return _columnTraceTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTraceId());
        ls.add(columnPreviousProductId());
        ls.add(columnNextProductId());
        ls.add(columnTraceTypeCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTraceId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPreviousProductId());
        ls.add(columnNextProductId());
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
     * WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePerrottaOverProductByNextProductId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextProductId(), WhitePerrottaOverProductDbm.getInstance().columnProductId());
        return cfi("FK_WHITE_PERROTTA_OVER_TRACE_NEXT", "whitePerrottaOverProductByNextProductId", this, WhitePerrottaOverProductDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whitePerrottaOverTraceByNextProductIdList", false);
    }
    /**
     * WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePerrottaOverProductByPreviousProductId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPreviousProductId(), WhitePerrottaOverProductDbm.getInstance().columnProductId());
        return cfi("FK_WHITE_PERROTTA_OVER_TRACE_PREVIOUS", "whitePerrottaOverProductByPreviousProductId", this, WhitePerrottaOverProductDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whitePerrottaOverTraceByPreviousProductIdList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverTrace"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhitePerrottaOverTraceCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverTraceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePerrottaOverTrace> getEntityType() { return WhitePerrottaOverTrace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePerrottaOverTrace newEntity() { return new WhitePerrottaOverTrace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePerrottaOverTrace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePerrottaOverTrace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
