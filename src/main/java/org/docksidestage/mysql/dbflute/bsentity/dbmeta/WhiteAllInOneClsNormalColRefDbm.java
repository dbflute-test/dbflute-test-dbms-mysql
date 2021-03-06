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
 * The DB meta of white_all_in_one_cls_normal_col_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteAllInOneClsNormalColRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteAllInOneClsNormalColRefDbm _instance = new WhiteAllInOneClsNormalColRefDbm();
    private WhiteAllInOneClsNormalColRefDbm() {}
    public static WhiteAllInOneClsNormalColRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteAllInOneClsNormalColRef)et).getClsRefId(), (et, vl) -> ((WhiteAllInOneClsNormalColRef)et).setClsRefId(cti(vl)), "clsRefId");
        setupEpg(_epgMap, et -> ((WhiteAllInOneClsNormalColRef)et).getFooCode(), (et, vl) -> ((WhiteAllInOneClsNormalColRef)et).setFooCode((String)vl), "fooCode");
        setupEpg(_epgMap, et -> ((WhiteAllInOneClsNormalColRef)et).getBarCode(), (et, vl) -> ((WhiteAllInOneClsNormalColRef)et).setBarCode((String)vl), "barCode");
        setupEpg(_epgMap, et -> ((WhiteAllInOneClsNormalColRef)et).getQuxCode(), (et, vl) -> ((WhiteAllInOneClsNormalColRef)et).setQuxCode((String)vl), "quxCode");
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
        setupEfpg(_efpgMap, et -> ((WhiteAllInOneClsNormalColRef)et).getWhiteAllInOneClsElementAsFoo(), (et, vl) -> ((WhiteAllInOneClsNormalColRef)et).setWhiteAllInOneClsElementAsFoo((OptionalEntity<WhiteAllInOneClsElement>)vl), "whiteAllInOneClsElementAsFoo");
        setupEfpg(_efpgMap, et -> ((WhiteAllInOneClsNormalColRef)et).getWhiteAllInOneClsElementAsBar(), (et, vl) -> ((WhiteAllInOneClsNormalColRef)et).setWhiteAllInOneClsElementAsBar((OptionalEntity<WhiteAllInOneClsElement>)vl), "whiteAllInOneClsElementAsBar");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_all_in_one_cls_normal_col_ref";
    protected final String _tableDispName = "WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF";
    protected final String _tablePropertyName = "whiteAllInOneClsNormalColRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClsRefId = cci("CLS_REF_ID", "CLS_REF_ID", null, null, Integer.class, "clsRefId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooCode = cci("FOO_CODE", "FOO_CODE", null, null, String.class, "fooCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, "whiteAllInOneClsElementAsFoo", null, null, false);
    protected final ColumnInfo _columnBarCode = cci("BAR_CODE", "BAR_CODE", null, null, String.class, "barCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, "whiteAllInOneClsElementAsBar", null, null, false);
    protected final ColumnInfo _columnQuxCode = cci("QUX_CODE", "QUX_CODE", null, null, String.class, "quxCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CLS_REF_ID: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClsRefId() { return _columnClsRefId; }
    /**
     * FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooCode() { return _columnFooCode; }
    /**
     * BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarCode() { return _columnBarCode; }
    /**
     * QUX_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuxCode() { return _columnQuxCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClsRefId());
        ls.add(columnFooCode());
        ls.add(columnBarCode());
        ls.add(columnQuxCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFooCode());
        ls.add(columnBarCode());
        ls.add(columnQuxCode());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * WHITE_ALL_IN_ONE_CLS_ELEMENT by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteAllInOneClsElementAsFoo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFooCode(), WhiteAllInOneClsElementDbm.getInstance().columnClsElementCode());
        return cfi("FK_WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF_FOO_TEST", "whiteAllInOneClsElementAsFoo", this, WhiteAllInOneClsElementDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$foreignAlias$$.CLS_CATEGORY_CODE = 'FOO'", null, false, null, false);
    }
    /**
     * WHITE_ALL_IN_ONE_CLS_ELEMENT by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteAllInOneClsElementAsBar() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBarCode(), WhiteAllInOneClsElementDbm.getInstance().columnClsElementCode());
        return cfi("FK_WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF_BAR_TEST", "whiteAllInOneClsElementAsBar", this, WhiteAllInOneClsElementDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$foreignAlias$$.CLS_CATEGORY_CODE = 'BAR'", null, false, null, false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteAllInOneClsNormalColRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteAllInOneClsNormalColRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteAllInOneClsNormalColRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteAllInOneClsNormalColRef> getEntityType() { return WhiteAllInOneClsNormalColRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteAllInOneClsNormalColRef newEntity() { return new WhiteAllInOneClsNormalColRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteAllInOneClsNormalColRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteAllInOneClsNormalColRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
