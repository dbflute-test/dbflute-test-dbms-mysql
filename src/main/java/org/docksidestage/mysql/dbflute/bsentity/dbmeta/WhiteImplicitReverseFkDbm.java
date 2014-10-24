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
 * The DB meta of white_implicit_reverse_fk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitReverseFkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteImplicitReverseFkDbm _instance = new WhiteImplicitReverseFkDbm();
    private WhiteImplicitReverseFkDbm() {}
    public static WhiteImplicitReverseFkDbm getInstance() { return _instance; }

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
    {
        setupEpg(_epgMap, et -> ((WhiteImplicitReverseFk)et).getWhiteImplicitReverseFkId(), (et, vl) -> ((WhiteImplicitReverseFk)et).setWhiteImplicitReverseFkId(cti(vl)), "whiteImplicitReverseFkId");
        setupEpg(_epgMap, et -> ((WhiteImplicitReverseFk)et).getWhiteImplicitReverseFkName(), (et, vl) -> ((WhiteImplicitReverseFk)et).setWhiteImplicitReverseFkName((String)vl), "whiteImplicitReverseFkName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WhiteImplicitReverseFk)et).getWhiteImplicitReverseFkRefWithImplicitReverseFK(), (et, vl) -> ((WhiteImplicitReverseFk)et).setWhiteImplicitReverseFkRefWithImplicitReverseFK((WhiteImplicitReverseFkRef)vl), "whiteImplicitReverseFkRefWithImplicitReverseFK");
        setupEfpg(_efpgMap, et -> ((WhiteImplicitReverseFk)et).getWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(), (et, vl) -> ((WhiteImplicitReverseFk)et).setWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK((WhiteImplicitReverseFkSuppress)vl), "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_implicit_reverse_fk";
    protected final String _tablePropertyName = "whiteImplicitReverseFk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_IMPLICIT_REVERSE_FK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWhiteImplicitReverseFkId = cci("WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", null, null, Integer.class, "whiteImplicitReverseFkId", null, true, true, true, "INT", 10, 0, null, false, null, null, "whiteImplicitReverseFkRefWithImplicitReverseFK,whiteImplicitReverseFkSuppressSuppressImplicitReverseFK", null, null);
    protected final ColumnInfo _columnWhiteImplicitReverseFkName = cci("WHITE_IMPLICIT_REVERSE_FK_NAME", "WHITE_IMPLICIT_REVERSE_FK_NAME", null, null, String.class, "whiteImplicitReverseFkName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * WHITE_IMPLICIT_REVERSE_FK_ID: {PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhiteImplicitReverseFkId() { return _columnWhiteImplicitReverseFkId; }
    /**
     * WHITE_IMPLICIT_REVERSE_FK_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhiteImplicitReverseFkName() { return _columnWhiteImplicitReverseFkName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWhiteImplicitReverseFkId());
        ls.add(columnWhiteImplicitReverseFkName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWhiteImplicitReverseFkId()); }
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
     * white_implicit_reverse_fk_ref by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefWithImplicitReverseFK'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteImplicitReverseFkRefWithImplicitReverseFK() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWhiteImplicitReverseFkId(), WhiteImplicitReverseFkRefDbm.getInstance().columnWhiteImplicitReverseFkId());
        return cfi("FK_WHITE_IMPLICIT_REVERSE_FK_REF_WITH", "whiteImplicitReverseFkRefWithImplicitReverseFK", this, WhiteImplicitReverseFkRefDbm.getInstance(), mp, 0, null, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapWhiteImplicitReverseFkRefWithImplicitReverseFK.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    /**
     * white_implicit_reverse_fk_suppress by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkSuppressSuppressImplicitReverseFK'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWhiteImplicitReverseFkId(), WhiteImplicitReverseFkSuppressDbm.getInstance().columnWhiteImplicitReverseFkId());
        return cfi("FK_WHITE_IMPLICIT_REVERSE_FK_REF_SUPPRESS", "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK", this, WhiteImplicitReverseFkSuppressDbm.getInstance(), mp, 1, null, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK.targetDate*/null", newArrayList("targetDate"), false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteImplicitReverseFk"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteImplicitReverseFkCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteImplicitReverseFkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteImplicitReverseFk> getEntityType() { return WhiteImplicitReverseFk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteImplicitReverseFk newEntity() { return new WhiteImplicitReverseFk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteImplicitReverseFk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteImplicitReverseFk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
