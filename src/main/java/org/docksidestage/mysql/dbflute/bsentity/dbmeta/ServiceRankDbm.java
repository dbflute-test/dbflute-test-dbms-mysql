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
import org.dbflute.dbmeta.PropertyGateway;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The DB meta of service_rank. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ServiceRankDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ServiceRankDbm _instance = new ServiceRankDbm();
    private ServiceRankDbm() {}
    public static ServiceRankDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgServiceRankName(), "serviceRankName");
        setupEpg(_epgMap, new EpgServicePointIncidence(), "servicePointIncidence");
        setupEpg(_epgMap, new EpgNewAcceptableFlg(), "newAcceptableFlg");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public class EpgServiceRankCode implements PropertyGateway {
        public Object read(Entity et) { return ((ServiceRank)et).getServiceRankCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnServiceRankCode();
            ccls(col, vl);
            CDef.ServiceRank cls = (CDef.ServiceRank)gcls(col, vl);
            if (cls != null) {
                ((ServiceRank)et).setServiceRankCodeAsServiceRank(cls);
            } else {
                ((ServiceRank)et).mynativeMappingServiceRankCode((String)vl);
            }
        }
    }
    public static class EpgServiceRankName implements PropertyGateway {
        public Object read(Entity et) { return ((ServiceRank)et).getServiceRankName(); }
        public void write(Entity et, Object vl) { ((ServiceRank)et).setServiceRankName((String)vl); }
    }
    public static class EpgServicePointIncidence implements PropertyGateway {
        public Object read(Entity et) { return ((ServiceRank)et).getServicePointIncidence(); }
        public void write(Entity et, Object vl) { ((ServiceRank)et).setServicePointIncidence(ctb(vl)); }
    }
    public class EpgNewAcceptableFlg implements PropertyGateway {
        public Object read(Entity et) { return ((ServiceRank)et).getNewAcceptableFlg(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnNewAcceptableFlg();
            ccls(col, vl);
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((ServiceRank)et).setNewAcceptableFlgAsFlg(cls);
            } else {
                ((ServiceRank)et).mynativeMappingNewAcceptableFlg(ctn(vl, Integer.class));
            }
        }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity et) { return ((ServiceRank)et).getDescription(); }
        public void write(Entity et, Object vl) { ((ServiceRank)et).setDescription((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((ServiceRank)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((ServiceRank)et).setDisplayOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "service_rank";
    protected final String _tablePropertyName = "serviceRank";
    protected final TableSqlName _tableSqlName = new TableSqlName("SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "サービスランク";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のサービスレベルを表現するランク。\n（ゴールドとかプラチナとか）";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, "サービスランクコード", String.class, "serviceRankCode", null, true, false, true, "CHAR", 3, 0, null, false, null, "サービスランクを識別するコード。", null, "memberServiceList", CDef.DefMeta.ServiceRank);
    protected final ColumnInfo _columnServiceRankName = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, "サービスランク名称", String.class, "serviceRankName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, "サービスランクの名称。\n（ゴールドとかプラチナとか基本的には威厳のある名前）", null, null, null);
    protected final ColumnInfo _columnServicePointIncidence = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, "サービスポイント発生率", java.math.BigDecimal.class, "servicePointIncidence", null, false, false, true, "DECIMAL", 5, 3, null, false, null, "購入ごとのサービスポイントの発生率。\n購入価格にこの値をかけた数が発生ポイント。", null, null, null);
    protected final ColumnInfo _columnNewAcceptableFlg = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, "新規受け入れ可能フラグ", Integer.class, "newAcceptableFlg", null, false, false, true, "INT", 10, 0, null, false, null, "このランクへの新規受け入れができるかどうか。", null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null);

    /**
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    /**
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankName() { return _columnServiceRankName; }
    /**
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServicePointIncidence() { return _columnServicePointIncidence; }
    /**
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INT(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewAcceptableFlg() { return _columnNewAcceptableFlg; }
    /**
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnServiceRankCode());
        ls.add(columnServiceRankName());
        ls.add(columnServicePointIncidence());
        ls.add(columnNewAcceptableFlg());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnServiceRankCode()); }
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
     * (会員サービス)member_service by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), MemberServiceDbm.getInstance().columnServiceRankCode());
        return cri("FK_MEMBER_SERVICE_SERVICE_RANK_CODE", "memberServiceList", this, MemberServiceDbm.getInstance(), mp, false, "serviceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.ServiceRank"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.ServiceRankCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.ServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ServiceRank> getEntityType() { return ServiceRank.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ServiceRank newEntity() { return new ServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ServiceRank)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ServiceRank)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
