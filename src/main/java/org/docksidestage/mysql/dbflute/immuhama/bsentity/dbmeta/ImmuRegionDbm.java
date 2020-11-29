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
package org.docksidestage.mysql.dbflute.immuhama.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The DB meta of region. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuRegionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuRegionDbm _instance = new ImmuRegionDbm();
    private ImmuRegionDbm() {}
    public static ImmuRegionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return ImmuDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return ImmuDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return ImmuDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return ImmuDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((ImmuRegion)et).getRegionId(), (et, vl) -> {
            ImmuCDef.Region cls = (ImmuCDef.Region)gcls(et, columnRegionId(), vl);
            if (cls != null) {
                ((ImmuRegion)et).setRegionIdAsRegion(cls);
            } else {
                ((ImmuRegion)et).mynativeMappingRegionId(ctn(vl, Integer.class));
            }
        }, "regionId");
        setupEpg(_epgMap, et -> ((ImmuRegion)et).getRegionName(), (et, vl) -> ((ImmuRegion)et).setRegionName((String)vl), "regionName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "region";
    protected final String _tableDispName = "REGION";
    protected final String _tablePropertyName = "region";
    protected final TableSqlName _tableSqlName = new TableSqlName("REGION", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "地域";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "主に会員の住所に対応する地域。\nかなりざっくりした感じではある。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRegionId = cci("REGION_ID", "REGION_ID", null, "地域ID", Integer.class, "regionId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, null, "memberAddressList", ImmuCDef.DefMeta.Region, false);
    protected final ColumnInfo _columnRegionName = cci("REGION_NAME", "REGION_NAME", null, "地域名称", String.class, "regionName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);

    /**
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionName() { return _columnRegionName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRegionId());
        ls.add(columnRegionName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRegionId()); }
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
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), ImmuMemberAddressDbm.getInstance().columnRegionId());
        return cri("FK_MEMBER_ADDRESS_REGION", "memberAddressList", this, ImmuMemberAddressDbm.getInstance(), mp, false, "region");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuRegion"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuRegionCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuRegionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuRegion> getEntityType() { return ImmuRegion.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuRegion newEntity() { return new ImmuRegion(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuRegion)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuRegion)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
