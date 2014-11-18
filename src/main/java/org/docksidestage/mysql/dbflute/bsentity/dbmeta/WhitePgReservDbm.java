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
 * The DB meta of white_pg_reserv. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePgReservDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePgReservDbm _instance = new WhitePgReservDbm();
    private WhitePgReservDbm() {}
    public static WhitePgReservDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getClassSynonym(), (et, vl) -> ((WhitePgReserv)et).setClassSynonym(cti(vl)), "classSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getCaseSynonym(), (et, vl) -> ((WhitePgReserv)et).setCaseSynonym(cti(vl)), "caseSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getPackageSynonym(), (et, vl) -> ((WhitePgReserv)et).setPackageSynonym(cti(vl)), "packageSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getDefaultSynonym(), (et, vl) -> ((WhitePgReserv)et).setDefaultSynonym(cti(vl)), "defaultSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getNewSynonym(), (et, vl) -> ((WhitePgReserv)et).setNewSynonym(cti(vl)), "newSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getNativeSynonym(), (et, vl) -> ((WhitePgReserv)et).setNativeSynonym(cti(vl)), "nativeSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getVoidSynonym(), (et, vl) -> ((WhitePgReserv)et).setVoidSynonym(cti(vl)), "voidSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getPublicSynonym(), (et, vl) -> ((WhitePgReserv)et).setPublicSynonym(cti(vl)), "publicSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getProtectedSynonym(), (et, vl) -> ((WhitePgReserv)et).setProtectedSynonym(cti(vl)), "protectedSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getPrivateSynonym(), (et, vl) -> ((WhitePgReserv)et).setPrivateSynonym(cti(vl)), "privateSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getInterfaceSynonym(), (et, vl) -> ((WhitePgReserv)et).setInterfaceSynonym(cti(vl)), "interfaceSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getAbstractSynonym(), (et, vl) -> ((WhitePgReserv)et).setAbstractSynonym(cti(vl)), "abstractSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getFinalSynonym(), (et, vl) -> ((WhitePgReserv)et).setFinalSynonym(cti(vl)), "finalSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getFinallySynonym(), (et, vl) -> ((WhitePgReserv)et).setFinallySynonym(cti(vl)), "finallySynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getReturnSynonym(), (et, vl) -> ((WhitePgReserv)et).setReturnSynonym(cti(vl)), "returnSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getDoubleSynonym(), (et, vl) -> ((WhitePgReserv)et).setDoubleSynonym(cti(vl)), "doubleSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getFloatSynonym(), (et, vl) -> ((WhitePgReserv)et).setFloatSynonym(cti(vl)), "floatSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getShortSynonym(), (et, vl) -> ((WhitePgReserv)et).setShortSynonym(cti(vl)), "shortSynonym");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getType(), (et, vl) -> ((WhitePgReserv)et).setType((String)vl), "type");
        setupEpg(_epgMap, et -> ((WhitePgReserv)et).getReservName(), (et, vl) -> ((WhitePgReserv)et).setReservName((String)vl), "reservName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_pg_reserv";
    protected final String _tablePropertyName = "whitePgReserv";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PG_RESERV", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClassSynonym = cci("CLASS", "CLASS", "CLASS_SYNONYM", "(using DBFlute synonym)", Integer.class, "classSynonym", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whitePgReservRefList", null, false);
    protected final ColumnInfo _columnCaseSynonym = cci("CASE", "`CASE`", "CASE_SYNONYM", "(using DBFlute synonym)", Integer.class, "caseSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackageSynonym = cci("PACKAGE", "PACKAGE", "PACKAGE_SYNONYM", "(using DBFlute synonym)", Integer.class, "packageSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultSynonym = cci("DEFAULT", "`DEFAULT`", "DEFAULT_SYNONYM", "(using DBFlute synonym)", Integer.class, "defaultSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNewSynonym = cci("NEW", "NEW", "NEW_SYNONYM", "(using DBFlute synonym)", Integer.class, "newSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNativeSynonym = cci("NATIVE", "NATIVE", "NATIVE_SYNONYM", "(using DBFlute synonym)", Integer.class, "nativeSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVoidSynonym = cci("VOID", "VOID", "VOID_SYNONYM", "(using DBFlute synonym)", Integer.class, "voidSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublicSynonym = cci("PUBLIC", "PUBLIC", "PUBLIC_SYNONYM", "(using DBFlute synonym)", Integer.class, "publicSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProtectedSynonym = cci("PROTECTED", "PROTECTED", "PROTECTED_SYNONYM", "(using DBFlute synonym)", Integer.class, "protectedSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrivateSynonym = cci("PRIVATE", "PRIVATE", "PRIVATE_SYNONYM", "(using DBFlute synonym)", Integer.class, "privateSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInterfaceSynonym = cci("INTERFACE", "INTERFACE", "INTERFACE_SYNONYM", "(using DBFlute synonym)", Integer.class, "interfaceSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbstractSynonym = cci("ABSTRACT", "ABSTRACT", "ABSTRACT_SYNONYM", "(using DBFlute synonym)", Integer.class, "abstractSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFinalSynonym = cci("FINAL", "FINAL", "FINAL_SYNONYM", "(using DBFlute synonym)", Integer.class, "finalSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFinallySynonym = cci("FINALLY", "FINALLY", "FINALLY_SYNONYM", "(using DBFlute synonym)", Integer.class, "finallySynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReturnSynonym = cci("RETURN", "`RETURN`", "RETURN_SYNONYM", "(using DBFlute synonym)", Integer.class, "returnSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDoubleSynonym = cci("DOUBLE", "`DOUBLE`", "DOUBLE_SYNONYM", "(using DBFlute synonym)", Integer.class, "doubleSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloatSynonym = cci("FLOAT", "`FLOAT`", "FLOAT_SYNONYM", "(using DBFlute synonym)", Integer.class, "floatSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShortSynonym = cci("SHORT", "SHORT", "SHORT_SYNONYM", "(using DBFlute synonym)", Integer.class, "shortSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnType = cci("TYPE", "TYPE", null, null, String.class, "type", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservName = cci("RESERV_NAME", "RESERV_NAME", null, null, String.class, "reservName", null, false, false, true, "VARCHAR", 32, 0, null, false, null, null, null, null, null, false);

    /**
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassSynonym() { return _columnClassSynonym; }
    /**
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseSynonym() { return _columnCaseSynonym; }
    /**
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackageSynonym() { return _columnPackageSynonym; }
    /**
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultSynonym() { return _columnDefaultSynonym; }
    /**
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewSynonym() { return _columnNewSynonym; }
    /**
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNativeSynonym() { return _columnNativeSynonym; }
    /**
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVoidSynonym() { return _columnVoidSynonym; }
    /**
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicSynonym() { return _columnPublicSynonym; }
    /**
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProtectedSynonym() { return _columnProtectedSynonym; }
    /**
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrivateSynonym() { return _columnPrivateSynonym; }
    /**
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInterfaceSynonym() { return _columnInterfaceSynonym; }
    /**
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbstractSynonym() { return _columnAbstractSynonym; }
    /**
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFinalSynonym() { return _columnFinalSynonym; }
    /**
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFinallySynonym() { return _columnFinallySynonym; }
    /**
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReturnSynonym() { return _columnReturnSynonym; }
    /**
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoubleSynonym() { return _columnDoubleSynonym; }
    /**
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloatSynonym() { return _columnFloatSynonym; }
    /**
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShortSynonym() { return _columnShortSynonym; }
    /**
     * TYPE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnType() { return _columnType; }
    /**
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservName() { return _columnReservName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClassSynonym());
        ls.add(columnCaseSynonym());
        ls.add(columnPackageSynonym());
        ls.add(columnDefaultSynonym());
        ls.add(columnNewSynonym());
        ls.add(columnNativeSynonym());
        ls.add(columnVoidSynonym());
        ls.add(columnPublicSynonym());
        ls.add(columnProtectedSynonym());
        ls.add(columnPrivateSynonym());
        ls.add(columnInterfaceSynonym());
        ls.add(columnAbstractSynonym());
        ls.add(columnFinalSynonym());
        ls.add(columnFinallySynonym());
        ls.add(columnReturnSynonym());
        ls.add(columnDoubleSynonym());
        ls.add(columnFloatSynonym());
        ls.add(columnShortSynonym());
        ls.add(columnType());
        ls.add(columnReservName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnClassSynonym()); }
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
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePgReservRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassSynonym(), WhitePgReservRefDbm.getInstance().columnClassSynonym());
        return cri("FK_WHITE_PG_RESERV_REF_CLASS", "whitePgReservRefList", this, WhitePgReservRefDbm.getInstance(), mp, false, "whitePgReserv");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhitePgReserv"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhitePgReservCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhitePgReservBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePgReserv> getEntityType() { return WhitePgReserv.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePgReserv newEntity() { return new WhitePgReserv(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePgReserv)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePgReserv)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
