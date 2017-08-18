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
 * The DB meta of white_cls_no_camelizing. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteClsNoCamelizingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteClsNoCamelizingDbm _instance = new WhiteClsNoCamelizingDbm();
    private WhiteClsNoCamelizingDbm() {}
    public static WhiteClsNoCamelizingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteClsNoCamelizing)et).getNoCamelizingCode(), (et, vl) -> {
            ccls(et, columnNoCamelizingCode(), vl);
            CDef.NamingDefaultCamelizingType cls = (CDef.NamingDefaultCamelizingType)gcls(et, columnNoCamelizingCode(), vl);
            if (cls != null) {
                ((WhiteClsNoCamelizing)et).setNoCamelizingCodeAsNamingDefaultCamelizingType(cls);
            } else {
                ((WhiteClsNoCamelizing)et).mynativeMappingNoCamelizingCode((String)vl);
            }
        }, "noCamelizingCode");
        setupEpg(_epgMap, et -> ((WhiteClsNoCamelizing)et).getNoCamelizingName(), (et, vl) -> ((WhiteClsNoCamelizing)et).setNoCamelizingName((String)vl), "noCamelizingName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_cls_no_camelizing";
    protected final String _tableDispName = "WHITE_CLS_NO_CAMELIZING";
    protected final String _tablePropertyName = "whiteClsNoCamelizing";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_CLS_NO_CAMELIZING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNoCamelizingCode = cci("NO_CAMELIZING_CODE", "NO_CAMELIZING_CODE", null, null, String.class, "noCamelizingCode", null, true, false, true, "VARCHAR", 10, 0, null, null, false, null, null, null, null, CDef.DefMeta.NamingDefaultCamelizingType, false);
    protected final ColumnInfo _columnNoCamelizingName = cci("NO_CAMELIZING_NAME", "NO_CAMELIZING_NAME", null, null, String.class, "noCamelizingName", null, false, false, false, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);

    /**
     * NO_CAMELIZING_CODE: {PK, NotNull, VARCHAR(10), classification=NamingDefaultCamelizingType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoCamelizingCode() { return _columnNoCamelizingCode; }
    /**
     * NO_CAMELIZING_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoCamelizingName() { return _columnNoCamelizingName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNoCamelizingCode());
        ls.add(columnNoCamelizingName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNoCamelizingCode()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteClsNoCamelizing"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteClsNoCamelizingCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteClsNoCamelizingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteClsNoCamelizing> getEntityType() { return WhiteClsNoCamelizing.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteClsNoCamelizing newEntity() { return new WhiteClsNoCamelizing(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteClsNoCamelizing)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteClsNoCamelizing)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
