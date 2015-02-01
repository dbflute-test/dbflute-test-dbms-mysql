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
 * The DB meta of white_escaped_java_doc. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteEscapedJavaDocDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteEscapedJavaDocDbm _instance = new WhiteEscapedJavaDocDbm();
    private WhiteEscapedJavaDocDbm() {}
    public static WhiteEscapedJavaDocDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteEscapedJavaDoc)et).getEscapedJavaDocCode(), (et, vl) -> {
            ColumnInfo col = columnEscapedJavaDocCode();
            ccls(col, vl);
            CDef.EscapedJavaDocCls cls = (CDef.EscapedJavaDocCls)gcls(col, vl);
            if (cls != null) {
                ((WhiteEscapedJavaDoc)et).setEscapedJavaDocCodeAsEscapedJavaDocCls(cls);
            } else {
                ((WhiteEscapedJavaDoc)et).mynativeMappingEscapedJavaDocCode((String)vl);
            }
        }, "escapedJavaDocCode");
        setupEpg(_epgMap, et -> ((WhiteEscapedJavaDoc)et).getEscapedJavaDocName(), (et, vl) -> ((WhiteEscapedJavaDoc)et).setEscapedJavaDocName((String)vl), "escapedJavaDocName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_escaped_java_doc";
    protected final String _tableDispName = "WHITE_ESCAPED_JAVA_DOC";
    protected final String _tablePropertyName = "whiteEscapedJavaDoc";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ESCAPED_JAVA_DOC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEscapedJavaDocCode = cci("ESCAPED_JAVA_DOC_CODE", "ESCAPED_JAVA_DOC_CODE", null, null, String.class, "escapedJavaDocCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.EscapedJavaDocCls, false);
    protected final ColumnInfo _columnEscapedJavaDocName = cci("ESCAPED_JAVA_DOC_NAME", "ESCAPED_JAVA_DOC_NAME", null, null, String.class, "escapedJavaDocName", null, false, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);

    /**
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEscapedJavaDocCode() { return _columnEscapedJavaDocCode; }
    /**
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEscapedJavaDocName() { return _columnEscapedJavaDocName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEscapedJavaDocCode());
        ls.add(columnEscapedJavaDocName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEscapedJavaDocCode()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteEscapedJavaDoc"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteEscapedJavaDocCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteEscapedJavaDocBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteEscapedJavaDoc> getEntityType() { return WhiteEscapedJavaDoc.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteEscapedJavaDoc newEntity() { return new WhiteEscapedJavaDoc(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteEscapedJavaDoc)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteEscapedJavaDoc)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
