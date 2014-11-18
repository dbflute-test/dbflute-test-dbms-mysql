package org.docksidestage.mysql.dbflute.resola.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.resola.allcommon.*;
import org.docksidestage.mysql.dbflute.resola.exentity.*;

/**
 * The DB meta of station. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ResolaStationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ResolaStationDbm _instance = new ResolaStationDbm();
    private ResolaStationDbm() {}
    public static ResolaStationDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return ResolaDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((ResolaStation)et).getStationId(), (et, vl) -> ((ResolaStation)et).setStationId(cti(vl)), "stationId");
        setupEpg(_epgMap, et -> ((ResolaStation)et).getStationName(), (et, vl) -> ((ResolaStation)et).setStationName((String)vl), "stationName");
        setupEpg(_epgMap, et -> ((ResolaStation)et).getBirthdate(), (et, vl) -> ((ResolaStation)et).setBirthdate((java.time.LocalDate)vl), "birthdate");
        setupEpg(_epgMap, et -> ((ResolaStation)et).getFormalizedDatetime(), (et, vl) -> ((ResolaStation)et).setFormalizedDatetime((java.time.LocalDateTime)vl), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((ResolaStation)et).getHomeCount(), (et, vl) -> ((ResolaStation)et).setHomeCount(cti(vl)), "homeCount");
        setupEpg(_epgMap, et -> ((ResolaStation)et).getWorkingKilometer(), (et, vl) -> ((ResolaStation)et).setWorkingKilometer(ctb(vl)), "workingKilometer");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "station";
    protected final String _tablePropertyName = "station";
    protected final TableSqlName _tableSqlName = new TableSqlName("station", _tableDbName);
    { _tableSqlName.xacceptFilter(ResolaDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStationId = cci("STATION_ID", "STATION_ID", null, null, Integer.class, "stationId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStationName = cci("STATION_NAME", "STATION_NAME", null, null, String.class, "stationName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHomeCount = cci("HOME_COUNT", "HOME_COUNT", null, null, Integer.class, "homeCount", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkingKilometer = cci("WORKING_KILOMETER", "WORKING_KILOMETER", null, null, java.math.BigDecimal.class, "workingKilometer", null, false, false, false, "DECIMAL", 4, 2, null, false, null, null, null, null, null, false);

    /**
     * STATION_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationId() { return _columnStationId; }
    /**
     * STATION_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationName() { return _columnStationName; }
    /**
     * BIRTHDATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * FORMALIZED_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * HOME_COUNT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHomeCount() { return _columnHomeCount; }
    /**
     * WORKING_KILOMETER: {DECIMAL(4, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingKilometer() { return _columnWorkingKilometer; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnStationId());
        ls.add(columnStationName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnHomeCount());
        ls.add(columnWorkingKilometer());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnStationId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.resola.exentity.ResolaStation"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.resola.cbean.ResolaStationCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.resola.exbhv.ResolaStationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ResolaStation> getEntityType() { return ResolaStation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ResolaStation newEntity() { return new ResolaStation(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ResolaStation)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ResolaStation)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
