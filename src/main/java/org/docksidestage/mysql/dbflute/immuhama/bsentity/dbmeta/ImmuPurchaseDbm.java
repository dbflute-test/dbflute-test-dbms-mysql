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
 * The DB meta of purchase. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuPurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuPurchaseDbm _instance = new ImmuPurchaseDbm();
    private ImmuPurchaseDbm() {}
    public static ImmuPurchaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getPurchaseId(), (et, vl) -> ((ImmuPurchase)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getMemberId(), (et, vl) -> ((ImmuPurchase)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getProductDetailId(), (et, vl) -> ((ImmuPurchase)et).setProductDetailId(ctl(vl)), "productDetailId");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getProductPriceId(), (et, vl) -> ((ImmuPurchase)et).setProductPriceId(ctl(vl)), "productPriceId");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getPurchaseDatetime(), (et, vl) -> ((ImmuPurchase)et).setPurchaseDatetime(ctldt(vl)), "purchaseDatetime");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getPurchaseCount(), (et, vl) -> ((ImmuPurchase)et).setPurchaseCount(cti(vl)), "purchaseCount");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getPurchasePrice(), (et, vl) -> ((ImmuPurchase)et).setPurchasePrice(cti(vl)), "purchasePrice");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getRegisterDatetime(), (et, vl) -> ((ImmuPurchase)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getRegisterUser(), (et, vl) -> ((ImmuPurchase)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getUpdateDatetime(), (et, vl) -> ((ImmuPurchase)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ImmuPurchase)et).getUpdateUser(), (et, vl) -> ((ImmuPurchase)et).setUpdateUser((String)vl), "updateUser");
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
        setupEfpg(_efpgMap, et -> ((ImmuPurchase)et).getMember(), (et, vl) -> ((ImmuPurchase)et).setMember((OptionalEntity<ImmuMember>)vl), "member");
        setupEfpg(_efpgMap, et -> ((ImmuPurchase)et).getProductDetail(), (et, vl) -> ((ImmuPurchase)et).setProductDetail((OptionalEntity<ImmuProductDetail>)vl), "productDetail");
        setupEfpg(_efpgMap, et -> ((ImmuPurchase)et).getProductPrice(), (et, vl) -> ((ImmuPurchase)et).setProductPrice((OptionalEntity<ImmuProductPrice>)vl), "productPrice");
        setupEfpg(_efpgMap, et -> ((ImmuPurchase)et).getPurchaseStatusAsOne(), (et, vl) -> ((ImmuPurchase)et).setPurchaseStatusAsOne((OptionalEntity<ImmuPurchaseStatus>)vl), "purchaseStatusAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "purchase";
    protected final String _tableDispName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "一つの商品に対する購入を表現する(購入履歴とも言える)。\n実業務であれば購入詳細というテーブルを作り、「購入という行為」と「その中身（詳細）」を違う粒度のデータとしてそれぞれ管理するのが一般的と言えるでしょう。というか、注文とか請求とかそういうことを考え始めたらもっと複雑になるはずですが、ExampleDBということで割り切っています。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, "購入ID", Long.class, "purchaseId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, "連番", null, "purchasePaymentList", null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, false, false, true, "INT", 10, 0, null, null, false, null, "会員を参照するID。\n購入を識別する自然キー(複合ユニーク制約)の筆頭要素。", "member", null, null, false);
    protected final ColumnInfo _columnProductDetailId = cci("PRODUCT_DETAIL_ID", "PRODUCT_DETAIL_ID", null, "商品詳細ID", Long.class, "productDetailId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "productDetail", null, null, false);
    protected final ColumnInfo _columnProductPriceId = cci("PRODUCT_PRICE_ID", "PRODUCT_PRICE_ID", null, "商品価格ID", Long.class, "productPriceId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "productPrice", null, null, false);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, "購入日時", java.time.LocalDateTime.class, "purchaseDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, "購入した瞬間の日時。", null, null, null, false);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, "購入数量", Integer.class, "purchaseCount", null, false, false, true, "INT", 10, 0, null, null, false, null, "購入した商品の一回の購入における数量。", null, null, null, false);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, "購入価格", Integer.class, "purchasePrice", null, false, false, true, "INT", 10, 0, null, null, false, null, "購入によって実際に会員が支払った（支払う予定の）価格。\n基本は商品の定価に購入数量を掛けたものになるが、ポイント利用や割引があったりと必ずしもそうはならない。", null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, "レコードが登録された日時", null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, "レコードを登録したユーザー", null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);

    /**
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (商品詳細ID)PRODUCT_DETAIL_ID: {IX, NotNull, BIGINT(19), FK to product_detail}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductDetailId() { return _columnProductDetailId; }
    /**
     * (商品価格ID)PRODUCT_PRICE_ID: {IX, NotNull, BIGINT(19), FK to product_price}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductPriceId() { return _columnProductPriceId; }
    /**
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductDetailId());
        ls.add(columnProductPriceId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnPurchaseDatetime());
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
        return cfi("FK_PURCHASE_MEMBER", "member", this, ImmuMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * (商品詳細)PRODUCT_DETAIL by my PRODUCT_DETAIL_ID, named 'productDetail'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductDetail() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductDetailId(), ImmuProductDetailDbm.getInstance().columnProductDetailId());
        return cfi("FK_PURCHASE_PRODUCT_DETAIL", "productDetail", this, ImmuProductDetailDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * (商品価格)PRODUCT_PRICE by my PRODUCT_PRICE_ID, named 'productPrice'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductPrice() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductPriceId(), ImmuProductPriceDbm.getInstance().columnProductPriceId());
        return cfi("FK_PURCHASE_PRODUCT_PRICE", "productPrice", this, ImmuProductPriceDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * (購入ステータス)purchase_status by PURCHASE_ID, named 'purchaseStatusAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignPurchaseStatusAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), ImmuPurchaseStatusDbm.getInstance().columnPurchaseId());
        return cfi("FK_PURCHASE_STATUS_PURCHASE", "purchaseStatusAsOne", this, ImmuPurchaseStatusDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "purchase", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchasePaymentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), ImmuPurchasePaymentDbm.getInstance().columnPurchaseId());
        return cri("FK_PURCHASE_PAYMENT_PURCHASE", "purchasePaymentList", this, ImmuPurchasePaymentDbm.getInstance(), mp, false, "purchase");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuPurchase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuPurchaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuPurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuPurchase> getEntityType() { return ImmuPurchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuPurchase newEntity() { return new ImmuPurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuPurchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuPurchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
