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
 * The DB meta of white_escaped_number_initial. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteEscapedNumberInitialDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteEscapedNumberInitialDbm _instance = new WhiteEscapedNumberInitialDbm();
    private WhiteEscapedNumberInitialDbm() {}
    public static WhiteEscapedNumberInitialDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteEscapedNumberInitial)et).getNumberInitialCode(), (et, vl) -> {
            ccls(et, columnNumberInitialCode(), vl);
            CDef.EscapedNumberInitialCls cls = (CDef.EscapedNumberInitialCls)gcls(et, columnNumberInitialCode(), vl);
            if (cls != null) {
                ((WhiteEscapedNumberInitial)et).setNumberInitialCodeAsEscapedNumberInitialCls(cls);
            } else {
                ((WhiteEscapedNumberInitial)et).mynativeMappingNumberInitialCode((String)vl);
            }
        }, "numberInitialCode");
        setupEpg(_epgMap, et -> ((WhiteEscapedNumberInitial)et).getNumberInitialName(), (et, vl) -> ((WhiteEscapedNumberInitial)et).setNumberInitialName((String)vl), "numberInitialName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_escaped_number_initial";
    protected final String _tableDispName = "WHITE_ESCAPED_NUMBER_INITIAL";
    protected final String _tablePropertyName = "whiteEscapedNumberInitial";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ESCAPED_NUMBER_INITIAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNumberInitialCode = cci("NUMBER_INITIAL_CODE", "NUMBER_INITIAL_CODE", null, null, String.class, "numberInitialCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, CDef.DefMeta.EscapedNumberInitialCls, false);
    protected final ColumnInfo _columnNumberInitialName = cci("NUMBER_INITIAL_NAME", "NUMBER_INITIAL_NAME", null, null, String.class, "numberInitialName", null, false, false, false, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);

    /**
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberInitialCode() { return _columnNumberInitialCode; }
    /**
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberInitialName() { return _columnNumberInitialName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNumberInitialCode());
        ls.add(columnNumberInitialName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNumberInitialCode()); }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteEscapedNumberInitial"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteEscapedNumberInitialCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteEscapedNumberInitialBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteEscapedNumberInitial> getEntityType() { return WhiteEscapedNumberInitial.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteEscapedNumberInitial newEntity() { return new WhiteEscapedNumberInitial(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteEscapedNumberInitial)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteEscapedNumberInitial)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
