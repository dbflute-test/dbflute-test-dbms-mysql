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
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The DB meta of member_address. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuMemberAddressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuMemberAddressDbm _instance = new ImmuMemberAddressDbm();
    private ImmuMemberAddressDbm() {}
    public static ImmuMemberAddressDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getMemberAddressId(), (et, vl) -> ((ImmuMemberAddress)et).setMemberAddressId(cti(vl)), "memberAddressId");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getMemberId(), (et, vl) -> ((ImmuMemberAddress)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getValidBeginDate(), (et, vl) -> ((ImmuMemberAddress)et).setValidBeginDate(ctld(vl)), "validBeginDate");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getValidEndDate(), (et, vl) -> ((ImmuMemberAddress)et).setValidEndDate(ctld(vl)), "validEndDate");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getAddress(), (et, vl) -> ((ImmuMemberAddress)et).setAddress((String)vl), "address");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getRegionId(), (et, vl) -> {
            ImmuCDef.Region cls = (ImmuCDef.Region)gcls(et, columnRegionId(), vl);
            if (cls != null) {
                ((ImmuMemberAddress)et).setRegionIdAsRegion(cls);
            } else {
                ((ImmuMemberAddress)et).mynativeMappingRegionId(ctn(vl, Integer.class));
            }
        }, "regionId");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getRegisterDatetime(), (et, vl) -> ((ImmuMemberAddress)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getRegisterUser(), (et, vl) -> ((ImmuMemberAddress)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getUpdateDatetime(), (et, vl) -> ((ImmuMemberAddress)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getUpdateUser(), (et, vl) -> ((ImmuMemberAddress)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((ImmuMemberAddress)et).getVersionNo(), (et, vl) -> ((ImmuMemberAddress)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((ImmuMemberAddress)et).getMember(), (et, vl) -> ((ImmuMemberAddress)et).setMember((OptionalEntity<ImmuMember>)vl), "member");
        setupEfpg(_efpgMap, et -> ((ImmuMemberAddress)et).getRegion(), (et, vl) -> ((ImmuMemberAddress)et).setRegion((OptionalEntity<ImmuRegion>)vl), "region");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_address";
    protected final String _tableDispName = "MEMBER_ADDRESS";
    protected final String _tablePropertyName = "memberAddress";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_ADDRESS", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員住所情報";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員の住所に関する情報。\n同時に有効期間ごとに履歴管理されている。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberAddressId = cci("MEMBER_ADDRESS_ID", "MEMBER_ADDRESS_ID", null, "会員住所ID", Integer.class, "memberAddressId", null, true, true, true, "INT", 10, 0, null, null, false, null, "会員住所を識別するID。\n履歴分も含むテーブルなので、これ自体はFKではない。", null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, false, false, true, "INT", 10, 0, null, null, false, null, "会員を参照するID。\n履歴分を含むため、これだけではユニークにはならない。", "member", null, null, false);
    protected final ColumnInfo _columnValidBeginDate = cci("VALID_BEGIN_DATE", "VALID_BEGIN_DATE", null, "有効開始日", java.time.LocalDate.class, "validBeginDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, "一つの有効期間の開始を示す日付。\n前の有効終了日の次の日の値が格納される。", null, null, null, false);
    protected final ColumnInfo _columnValidEndDate = cci("VALID_END_DATE", "VALID_END_DATE", null, "有効終了日", java.time.LocalDate.class, "validEndDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, "有効期間の終了日。\n次の有効開始日の一日前の値が格納される。\nただし、次の有効期間がない場合は 9999/12/31 となる。", null, null, null, false);
    protected final ColumnInfo _columnAddress = cci("ADDRESS", "ADDRESS", null, "住所", String.class, "address", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, "まるごと住所", null, null, null, false);
    protected final ColumnInfo _columnRegionId = cci("REGION_ID", "REGION_ID", null, "地域ID", Integer.class, "regionId", null, false, false, true, "INT", 10, 0, null, null, false, null, "地域を参照するID。\nここでは特に住所の内容と連動しているわけではない。", "region", null, ImmuCDef.DefMeta.Region, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAddressId() { return _columnMemberAddressId; }
    /**
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidBeginDate() { return _columnValidBeginDate; }
    /**
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidEndDate() { return _columnValidEndDate; }
    /**
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
    /**
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberAddressId());
        ls.add(columnMemberId());
        ls.add(columnValidBeginDate());
        ls.add(columnValidEndDate());
        ls.add(columnAddress());
        ls.add(columnRegionId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberAddressId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnValidBeginDate());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), ImmuMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_ADDRESS_MEMBER", "member", this, ImmuMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberAddressList", false);
    }
    /**
     * (地域)REGION by my REGION_ID, named 'region'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRegion() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), ImmuRegionDbm.getInstance().columnRegionId());
        return cfi("FK_MEMBER_ADDRESS_REGION", "region", this, ImmuRegionDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberAddressList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuMemberAddress"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuMemberAddressCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuMemberAddressBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuMemberAddress> getEntityType() { return ImmuMemberAddress.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuMemberAddress newEntity() { return new ImmuMemberAddress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuMemberAddress)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuMemberAddress)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
