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
 * The DB meta of white_uq_classification_flg. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqClassificationFlgDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqClassificationFlgDbm _instance = new WhiteUqClassificationFlgDbm();
    private WhiteUqClassificationFlgDbm() {}
    public static WhiteUqClassificationFlgDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteUqClassificationFlg)et).getUqClsId(), (et, vl) -> ((WhiteUqClassificationFlg)et).setUqClsId(ctl(vl)), "uqClsId");
        setupEpg(_epgMap, et -> ((WhiteUqClassificationFlg)et).getUqClsFlg(), (et, vl) -> {
            ccls(et, columnUqClsFlg(), vl);
            CDef.Flg cls = (CDef.Flg)gcls(et, columnUqClsFlg(), vl);
            if (cls != null) {
                ((WhiteUqClassificationFlg)et).setUqClsFlgAsFlg(cls);
            } else {
                ((WhiteUqClassificationFlg)et).mynativeMappingUqClsFlg(ctn(vl, Integer.class));
            }
        }, "uqClsFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_classification_flg";
    protected final String _tableDispName = "WHITE_UQ_CLASSIFICATION_FLG";
    protected final String _tablePropertyName = "whiteUqClassificationFlg";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_CLASSIFICATION_FLG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqClsId = cci("UQ_CLS_ID", "UQ_CLS_ID", null, null, Long.class, "uqClsId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUqClsFlg = cci("UQ_CLS_FLG", "UQ_CLS_FLG", null, null, Integer.class, "uqClsFlg", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);

    /**
     * UQ_CLS_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqClsId() { return _columnUqClsId; }
    /**
     * UQ_CLS_FLG: {UQ, NotNull, INT(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqClsFlg() { return _columnUqClsFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqClsId());
        ls.add(columnUqClsFlg());
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
    public UniqueInfo uniqueOf() { return hpcui(columnUqClsFlg()); }

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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteUqClassificationFlg"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteUqClassificationFlgCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteUqClassificationFlgBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqClassificationFlg> getEntityType() { return WhiteUqClassificationFlg.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteUqClassificationFlg newEntity() { return new WhiteUqClassificationFlg(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqClassificationFlg)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqClassificationFlg)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
