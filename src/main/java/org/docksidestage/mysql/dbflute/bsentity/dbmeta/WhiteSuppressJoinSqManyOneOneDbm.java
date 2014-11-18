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
 * The DB meta of white_suppress_join_sq_many_one_one. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSuppressJoinSqManyOneOneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSuppressJoinSqManyOneOneDbm _instance = new WhiteSuppressJoinSqManyOneOneDbm();
    private WhiteSuppressJoinSqManyOneOneDbm() {}
    public static WhiteSuppressJoinSqManyOneOneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqManyOneOne)et).getManyOneOneId(), (et, vl) -> ((WhiteSuppressJoinSqManyOneOne)et).setManyOneOneId(cti(vl)), "manyOneOneId");
        setupEpg(_epgMap, et -> ((WhiteSuppressJoinSqManyOneOne)et).getManyOneOneName(), (et, vl) -> ((WhiteSuppressJoinSqManyOneOne)et).setManyOneOneName((String)vl), "manyOneOneName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_suppress_join_sq_many_one_one";
    protected final String _tablePropertyName = "whiteSuppressJoinSqManyOneOne";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnManyOneOneId = cci("MANY_ONE_ONE_ID", "MANY_ONE_ONE_ID", null, null, Integer.class, "manyOneOneId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteSuppressJoinSqManyOneList", null, false);
    protected final ColumnInfo _columnManyOneOneName = cci("MANY_ONE_ONE_NAME", "MANY_ONE_ONE_NAME", null, null, String.class, "manyOneOneName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);

    /**
     * MANY_ONE_ONE_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneOneId() { return _columnManyOneOneId; }
    /**
     * MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyOneOneName() { return _columnManyOneOneName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnManyOneOneId());
        ls.add(columnManyOneOneName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnManyOneOneId()); }
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
    /**
     * white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSuppressJoinSqManyOneList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnManyOneOneId(), WhiteSuppressJoinSqManyOneDbm.getInstance().columnManyOneOneId());
        return cri("FK_WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE", "whiteSuppressJoinSqManyOneList", this, WhiteSuppressJoinSqManyOneDbm.getInstance(), mp, false, "whiteSuppressJoinSqManyOneOne");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSqManyOneOne"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneOneCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyOneOneBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSuppressJoinSqManyOneOne> getEntityType() { return WhiteSuppressJoinSqManyOneOne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSuppressJoinSqManyOneOne newEntity() { return new WhiteSuppressJoinSqManyOneOne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSuppressJoinSqManyOneOne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSuppressJoinSqManyOneOne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
