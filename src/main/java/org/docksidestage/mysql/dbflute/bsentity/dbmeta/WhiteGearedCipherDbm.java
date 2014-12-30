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
 * The DB meta of white_geared_cipher. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteGearedCipherDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteGearedCipherDbm _instance = new WhiteGearedCipherDbm();
    private WhiteGearedCipherDbm() {}
    public static WhiteGearedCipherDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteGearedCipher)et).getCipherId(), (et, vl) -> ((WhiteGearedCipher)et).setCipherId(ctl(vl)), "cipherId");
        setupEpg(_epgMap, et -> ((WhiteGearedCipher)et).getCipherInteger(), (et, vl) -> ((WhiteGearedCipher)et).setCipherInteger(cti(vl)), "cipherInteger");
        setupEpg(_epgMap, et -> ((WhiteGearedCipher)et).getCipherVarchar(), (et, vl) -> ((WhiteGearedCipher)et).setCipherVarchar((String)vl), "cipherVarchar");
        setupEpg(_epgMap, et -> ((WhiteGearedCipher)et).getCipherDate(), (et, vl) -> ((WhiteGearedCipher)et).setCipherDate(ctld(vl)), "cipherDate");
        setupEpg(_epgMap, et -> ((WhiteGearedCipher)et).getCipherDatetime(), (et, vl) -> ((WhiteGearedCipher)et).setCipherDatetime(ctldt(vl)), "cipherDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_geared_cipher";
    protected final String _tablePropertyName = "whiteGearedCipher";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_GEARED_CIPHER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCipherId = cci("CIPHER_ID", "CIPHER_ID", null, null, Long.class, "cipherId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCipherInteger = cci("CIPHER_INTEGER", "CIPHER_INTEGER", null, null, Integer.class, "cipherInteger", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCipherVarchar = cci("CIPHER_VARCHAR", "CIPHER_VARCHAR", null, null, String.class, "cipherVarchar", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCipherDate = cci("CIPHER_DATE", "CIPHER_DATE", null, null, java.time.LocalDate.class, "cipherDate", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCipherDatetime = cci("CIPHER_DATETIME", "CIPHER_DATETIME", null, null, java.time.LocalDateTime.class, "cipherDatetime", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);

    /**
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherId() { return _columnCipherId; }
    /**
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherInteger() { return _columnCipherInteger; }
    /**
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherVarchar() { return _columnCipherVarchar; }
    /**
     * CIPHER_DATE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherDate() { return _columnCipherDate; }
    /**
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherDatetime() { return _columnCipherDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCipherId());
        ls.add(columnCipherInteger());
        ls.add(columnCipherVarchar());
        ls.add(columnCipherDate());
        ls.add(columnCipherDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCipherId()); }
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
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteGearedCipher"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteGearedCipherCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteGearedCipherBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteGearedCipher> getEntityType() { return WhiteGearedCipher.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteGearedCipher newEntity() { return new WhiteGearedCipher(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteGearedCipher)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteGearedCipher)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
