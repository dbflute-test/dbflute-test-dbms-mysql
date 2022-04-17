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
 * The DB meta of cdef_service_rank. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuCdefServiceRankDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuCdefServiceRankDbm _instance = new ImmuCdefServiceRankDbm();
    private ImmuCdefServiceRankDbm() {}
    public static ImmuCdefServiceRankDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuCdefServiceRank)et).getServiceRankCode(), (et, vl) -> ((ImmuCdefServiceRank)et).setServiceRankCode((String)vl), "serviceRankCode");
        setupEpg(_epgMap, et -> ((ImmuCdefServiceRank)et).getServiceRankName(), (et, vl) -> ((ImmuCdefServiceRank)et).setServiceRankName((String)vl), "serviceRankName");
        setupEpg(_epgMap, et -> ((ImmuCdefServiceRank)et).getServicePointIncidence(), (et, vl) -> ((ImmuCdefServiceRank)et).setServicePointIncidence(ctb(vl)), "servicePointIncidence");
        setupEpg(_epgMap, et -> ((ImmuCdefServiceRank)et).getNewAcceptableFlg(), (et, vl) -> {
            ImmuCDef.Flg cls = (ImmuCDef.Flg)gcls(et, columnNewAcceptableFlg(), vl);
            if (cls != null) {
                ((ImmuCdefServiceRank)et).setNewAcceptableFlgAsFlg(cls);
            } else {
                ((ImmuCdefServiceRank)et).mynativeMappingNewAcceptableFlg(ctn(vl, Integer.class));
            }
        }, "newAcceptableFlg");
        setupEpg(_epgMap, et -> ((ImmuCdefServiceRank)et).getDescription(), (et, vl) -> ((ImmuCdefServiceRank)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((ImmuCdefServiceRank)et).getDisplayOrder(), (et, vl) -> ((ImmuCdefServiceRank)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "cdef_service_rank";
    protected final String _tableDispName = "CDEF_SERVICE_RANK";
    protected final String _tablePropertyName = "cdefServiceRank";
    protected final TableSqlName _tableSqlName = new TableSqlName("CDEF_SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "[区分値]サービスランク";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のサービスレベルを表現するランク。(ゴールドとかプラチナとか)";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, "サービスランクコード", String.class, "serviceRankCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, "サービスランクを識別するコード。", null, "memberServiceList", null, false);
    protected final ColumnInfo _columnServiceRankName = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, "サービスランク名称", String.class, "serviceRankName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, "サービスランクの名称。\nゴールドとかプラチナとか基本的には威厳のある名前", null, null, null, false);
    protected final ColumnInfo _columnServicePointIncidence = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, "サービスポイント発生率", java.math.BigDecimal.class, "servicePointIncidence", null, false, false, true, "DECIMAL", 5, 3, null, null, false, null, "購入ごとのサービスポイントの発生率。\n購入価格にこの値をかけた数が発生ポイント。ExampleDBとして数少ない貴重な小数点ありのカラム。", null, null, null, false);
    protected final ColumnInfo _columnNewAcceptableFlg = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, "新規受け入れ可能フラグ", Integer.class, "newAcceptableFlg", null, false, false, true, "INT", 10, 0, null, null, false, null, "このランクへの新規受け入れができるかどうか。", null, null, ImmuCDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", String.class, "description", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, "ランクに関する業務的な説明。", null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", Integer.class, "displayOrder", null, false, false, true, "INT", 10, 0, null, null, false, null, "UI上の表示順を表現する番号。", null, null, null, false);

    /**
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3)}
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
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnDisplayOrder()); }

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
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), ImmuMemberServiceDbm.getInstance().columnServiceRankCode());
        return cri("FK_MEMBER_SERVICE_SERVICE_RANK_CODE", "memberServiceList", this, ImmuMemberServiceDbm.getInstance(), mp, false, "cdefServiceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuCdefServiceRank"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuCdefServiceRankCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuCdefServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuCdefServiceRank> getEntityType() { return ImmuCdefServiceRank.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuCdefServiceRank newEntity() { return new ImmuCdefServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuCdefServiceRank)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuCdefServiceRank)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
