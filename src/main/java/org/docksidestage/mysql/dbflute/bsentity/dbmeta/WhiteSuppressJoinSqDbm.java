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
 * The DB meta of white_suppress_join_sq. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqDbm _instance = new WhiteSuppressJoinSqDbm();
    private WhiteSuppressJoinSqDbm() {}
    public static WhiteSuppressJoinSqDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
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
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSq)et).getSuppressJoinSqId(), (et, vl) -> ((WhiteSuppressJoinSq)et).setSuppressJoinSqId(cti(vl)), "suppressJoinSqId");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSq)et).getSuppressJoinSqName(), (et, vl) -> ((WhiteSuppressJoinSq)et).setSuppressJoinSqName((String)vl), "suppressJoinSqName");
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
        setupEfpg(_efpgMap, et -> ((WhiteSuppressJoinSq)et).getWhiteSuppressJoinSqOneAsOne(), (et, vl) -> ((WhiteSuppressJoinSq)et).setWhiteSuppressJoinSqOneAsOne((OptionalEntity<WhiteSuppressJoinSqOne>)vl), "whiteSuppressJoinSqOneAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq";
    protected final String _tablePropertyName = "whiteSuppressJoinSq";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSuppressJoinSqId = cci("SUPPRESS_JOIN_SQ_ID", "SUPPRESS_JOIN_SQ_ID", null, null, Integer.class, "suppressJoinSqId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteSuppressJoinSqManyList", null);
    protected final ColumnInfo _columnSuppressJoinSqName = cci("SUPPRESS_JOIN_SQ_NAME", "SUPPRESS_JOIN_SQ_NAME", null, null, String.class, "suppressJoinSqName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqId() { return _columnSuppressJoinSqId; }
    /**
     * SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppressJoinSqName() { return _columnSuppressJoinSqName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSuppressJoinSqId());
        ls.add(columnSuppressJoinSqName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSuppressJoinSqId()); }
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
     * white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteSuppressJoinSqOneAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqOneDbm.getInstance().columnSuppressJoinSqId());
        return cfi("FK_WHITE_SUPPRESS_JOIN_SQ_ONE", "whiteSuppressJoinSqOneAsOne", this, WhiteSuppressJoinSqOneDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "whiteSuppressJoinSq");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSuppressJoinSqManyList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSuppressJoinSqId(), WhiteSuppressJoinSqManyDbm.getInstance().columnSuppressJoinSqId());
        return cri("FK_WHITE_SUPPRESS_JOIN_SQ_MANY", "whiteSuppressJoinSqManyList", this, WhiteSuppressJoinSqManyDbm.getInstance(), mp, false, "whiteSuppressJoinSq");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSq"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSq> getEntityType() { return WhiteSuppressJoinSq.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSq newEntity() { return new WhiteSuppressJoinSq(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSq)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSq)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
