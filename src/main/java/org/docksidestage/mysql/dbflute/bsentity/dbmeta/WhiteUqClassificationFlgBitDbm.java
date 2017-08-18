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
 * The DB meta of white_uq_classification_flg_bit. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqClassificationFlgBitDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqClassificationFlgBitDbm _instance = new WhiteUqClassificationFlgBitDbm();
    private WhiteUqClassificationFlgBitDbm() {}
    public static WhiteUqClassificationFlgBitDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteUqClassificationFlgBit)et).getUqClsId(), (et, vl) -> ((WhiteUqClassificationFlgBit)et).setUqClsId(ctl(vl)), "uqClsId");
        setupEpg(_epgMap, et -> ((WhiteUqClassificationFlgBit)et).getUqClsName(), (et, vl) -> ((WhiteUqClassificationFlgBit)et).setUqClsName((String)vl), "uqClsName");
        setupEpg(_epgMap, et -> ((WhiteUqClassificationFlgBit)et).getUqClsBitFlg(), (et, vl) -> {
            ccls(et, columnUqClsBitFlg(), vl);
            ((WhiteUqClassificationFlgBit)et).setUqClsBitFlg((Boolean)vl);
        }, "uqClsBitFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_classification_flg_bit";
    protected final String _tableDispName = "WHITE_UQ_CLASSIFICATION_FLG_BIT";
    protected final String _tablePropertyName = "whiteUqClassificationFlgBit";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_CLASSIFICATION_FLG_BIT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqClsId = cci("UQ_CLS_ID", "UQ_CLS_ID", null, null, Long.class, "uqClsId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUqClsName = cci("UQ_CLS_NAME", "UQ_CLS_NAME", null, null, String.class, "uqClsName", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUqClsBitFlg = cci("UQ_CLS_BIT_FLG", "UQ_CLS_BIT_FLG", null, null, Boolean.class, "uqClsBitFlg", null, false, false, true, "BIT", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.BooleanFlg, false);

    /**
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqClsId() { return _columnUqClsId; }
    /**
     * UQ_CLS_NAME: {UQ+, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqClsName() { return _columnUqClsName; }
    /**
     * UQ_CLS_BIT_FLG: {+UQ, NotNull, BIT(1), classification=BooleanFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqClsBitFlg() { return _columnUqClsBitFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqClsId());
        ls.add(columnUqClsName());
        ls.add(columnUqClsBitFlg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqClsId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnUqClsName());
        ls.add(columnUqClsBitFlg());
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteUqClassificationFlgBit"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteUqClassificationFlgBitCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteUqClassificationFlgBitBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqClassificationFlgBit> getEntityType() { return WhiteUqClassificationFlgBit.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteUqClassificationFlgBit newEntity() { return new WhiteUqClassificationFlgBit(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqClassificationFlgBit)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqClassificationFlgBit)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
