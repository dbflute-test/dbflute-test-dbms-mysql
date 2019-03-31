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
 * The DB meta of white_non_unique_many_to_one_from. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteNonUniqueManyToOneFromDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteNonUniqueManyToOneFromDbm _instance = new WhiteNonUniqueManyToOneFromDbm();
    private WhiteNonUniqueManyToOneFromDbm() {}
    public static WhiteNonUniqueManyToOneFromDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getFromId(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setFromId(ctl(vl)), "fromId");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getFromName(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setFromName((String)vl), "fromName");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getNonUniqueCode(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setNonUniqueCode((String)vl), "nonUniqueCode");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getBeginDate(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setBeginDate(ctld(vl)), "beginDate");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getEndDate(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setEndDate(ctld(vl)), "endDate");
        setupEpg(_epgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getManyPoint(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setManyPoint(cti(vl)), "manyPoint");
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
        setupEfpg(_efpgMap, et -> ((WhiteNonUniqueManyToOneFrom)et).getWhiteNonUniqueManyToOneToAsNonUniqueManyToOne(), (et, vl) -> ((WhiteNonUniqueManyToOneFrom)et).setWhiteNonUniqueManyToOneToAsNonUniqueManyToOne((OptionalEntity<WhiteNonUniqueManyToOneTo>)vl), "whiteNonUniqueManyToOneToAsNonUniqueManyToOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_non_unique_many_to_one_from";
    protected final String _tableDispName = "WHITE_NON_UNIQUE_MANY_TO_ONE_FROM";
    protected final String _tablePropertyName = "whiteNonUniqueManyToOneFrom";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_NON_UNIQUE_MANY_TO_ONE_FROM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFromId = cci("FROM_ID", "FROM_ID", null, null, Long.class, "fromId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromName = cci("FROM_NAME", "FROM_NAME", null, null, String.class, "fromName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonUniqueCode = cci("NON_UNIQUE_CODE", "NON_UNIQUE_CODE", null, null, String.class, "nonUniqueCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, "whiteNonUniqueManyToOneToAsNonUniqueManyToOne", null, null, false);
    protected final ColumnInfo _columnBeginDate = cci("BEGIN_DATE", "BEGIN_DATE", null, null, java.time.LocalDate.class, "beginDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndDate = cci("END_DATE", "END_DATE", null, null, java.time.LocalDate.class, "endDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManyPoint = cci("MANY_POINT", "MANY_POINT", null, null, Integer.class, "manyPoint", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * FROM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromId() { return _columnFromId; }
    /**
     * FROM_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromName() { return _columnFromName; }
    /**
     * NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonUniqueCode() { return _columnNonUniqueCode; }
    /**
     * BEGIN_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeginDate() { return _columnBeginDate; }
    /**
     * END_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndDate() { return _columnEndDate; }
    /**
     * MANY_POINT: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManyPoint() { return _columnManyPoint; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFromId());
        ls.add(columnFromName());
        ls.add(columnNonUniqueCode());
        ls.add(columnBeginDate());
        ls.add(columnEndDate());
        ls.add(columnManyPoint());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFromId()); }
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
     * WHITE_NON_UNIQUE_MANY_TO_ONE_TO by my NON_UNIQUE_CODE, named 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNonUniqueCode(), WhiteNonUniqueManyToOneToDbm.getInstance().columnNonUniqueCode());
        return cfi("FK_WHITE_NON_UNIQUE_MANY_TO_ONE_FROM_TO", "whiteNonUniqueManyToOneToAsNonUniqueManyToOne", this, WhiteNonUniqueManyToOneToDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$foreignAlias$$.BEGIN_DATE <= $$localAlias$$.BEGIN_DATE\n     and $$foreignAlias$$.END_DATE >= $$localAlias$$.BEGIN_DATE", null, false, null, false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteNonUniqueManyToOneFrom"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteNonUniqueManyToOneFromCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteNonUniqueManyToOneFromBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteNonUniqueManyToOneFrom> getEntityType() { return WhiteNonUniqueManyToOneFrom.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteNonUniqueManyToOneFrom newEntity() { return new WhiteNonUniqueManyToOneFrom(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteNonUniqueManyToOneFrom)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteNonUniqueManyToOneFrom)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
