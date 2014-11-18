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
 * The DB meta of purchase. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseDbm _instance = new PurchaseDbm();
    private PurchaseDbm() {}
    public static PurchaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchaseId(), (et, vl) -> ((Purchase)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((Purchase)et).getMemberId(), (et, vl) -> ((Purchase)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Purchase)et).getProductId(), (et, vl) -> ((Purchase)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchaseDatetime(), (et, vl) -> ((Purchase)et).setPurchaseDatetime((java.time.LocalDateTime)vl), "purchaseDatetime");
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchaseCount(), (et, vl) -> ((Purchase)et).setPurchaseCount(cti(vl)), "purchaseCount");
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchasePrice(), (et, vl) -> ((Purchase)et).setPurchasePrice(cti(vl)), "purchasePrice");
        setupEpg(_epgMap, et -> ((Purchase)et).getPaymentCompleteFlg(), (et, vl) -> {
            ColumnInfo col = columnPaymentCompleteFlg();
            ccls(col, vl);
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((Purchase)et).setPaymentCompleteFlgAsFlg(cls);
            } else {
                ((Purchase)et).mynativeMappingPaymentCompleteFlg(ctn(vl, Integer.class));
            }
        }, "paymentCompleteFlg");
        setupEpg(_epgMap, et -> ((Purchase)et).getRegisterDatetime(), (et, vl) -> ((Purchase)et).setRegisterDatetime((java.time.LocalDateTime)vl), "registerDatetime");
        setupEpg(_epgMap, et -> ((Purchase)et).getRegisterUser(), (et, vl) -> ((Purchase)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Purchase)et).getUpdateDatetime(), (et, vl) -> ((Purchase)et).setUpdateDatetime((java.time.LocalDateTime)vl), "updateDatetime");
        setupEpg(_epgMap, et -> ((Purchase)et).getUpdateUser(), (et, vl) -> ((Purchase)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Purchase)et).getVersionNo(), (et, vl) -> ((Purchase)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Purchase)et).getMember(), (et, vl) -> ((Purchase)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getProduct(), (et, vl) -> ((Purchase)et).setProduct((OptionalEntity<Product>)vl), "product");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getSummaryProduct(), (et, vl) -> ((Purchase)et).setSummaryProduct((OptionalEntity<SummaryProduct>)vl), "summaryProduct");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getSummaryWithdrawal(), (et, vl) -> ((Purchase)et).setSummaryWithdrawal((OptionalEntity<SummaryWithdrawal>)vl), "summaryWithdrawal");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getWhiteNoPkRelation(), (et, vl) -> ((Purchase)et).setWhiteNoPkRelation((OptionalEntity<WhiteNoPkRelation>)vl), "whiteNoPkRelation");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getPurchaseSelf(), (et, vl) -> ((Purchase)et).setPurchaseSelf((OptionalEntity<Purchase>)vl), "purchaseSelf");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getMemberAddressAsSkipRelation(), (et, vl) -> ((Purchase)et).setMemberAddressAsSkipRelation((OptionalEntity<MemberAddress>)vl), "memberAddressAsSkipRelation");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getWhitePurchaseReferrerAsOne(), (et, vl) -> ((Purchase)et).setWhitePurchaseReferrerAsOne((OptionalEntity<WhitePurchaseReferrer>)vl), "whitePurchaseReferrerAsOne");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getPurchaseSelfAsOne(), (et, vl) -> ((Purchase)et).setPurchaseSelfAsOne((OptionalEntity<Purchase>)vl), "purchaseSelfAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "purchase";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "一つの商品に対する一回の購入を表現する。\n一回の購入で一つの商品を複数個買うこともある。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, "購入ID", Long.class, "purchaseId", null, true, true, true, "BIGINT", 19, 0, null, false, null, "連番", "purchaseSelf,whitePurchaseReferrerAsOne,purchaseSelfAsOne", "purchasePaymentList", null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, false, false, true, "INT", 10, 0, null, false, null, "会員を参照するID。\n購入を識別する自然キー（複合ユニーク制約）の筆頭要素。", "member,summaryWithdrawal,memberAddressAsSkipRelation", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, "商品ID", Integer.class, "productId", null, false, false, true, "INT", 10, 0, null, false, null, "商品を参照するID。", "product,summaryProduct,whiteNoPkRelation", null, null, false);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, "購入日時", java.time.LocalDateTime.class, "purchaseDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, "購入した瞬間の日時。", null, null, null, false);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, "購入数量", Integer.class, "purchaseCount", null, false, false, true, "INT", 10, 0, null, false, null, "購入した商品の（一回の購入における）数量。", null, null, null, false);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, "購入価格", Integer.class, "purchasePrice", null, false, false, true, "INT", 10, 0, null, false, null, "購入によって実際に会員が支払った（支払う予定の）価格。\n基本は商品の定価に購入数量を掛けたものになるが、\nポイント利用や割引があったりと必ずしもそうはならない。", null, null, null, false);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, "支払完了フラグ", Integer.class, "paymentCompleteFlg", null, false, false, true, "INT", 10, 0, null, false, null, "この購入に関しての支払いが完了しているか否か。", null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INT(10), FK to product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
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
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
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
     * (会員)member by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * (商品)product by my PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT", "product", this, ProductDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * (VIEW)summary_product by my PRODUCT_ID, named 'summaryProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSummaryProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), SummaryProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_SUMMARY_PRODUCT", "summaryProduct", this, SummaryProductDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "purchaseList", false);
    }
    /**
     * (VIEW)summary_withdrawal by my MEMBER_ID, named 'summaryWithdrawal'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSummaryWithdrawal() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), SummaryWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_SUMMARY_WITHDRAWAL", "summaryWithdrawal", this, SummaryWithdrawalDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, null, false);
    }
    /**
     * (VIEW)white_no_pk_relation by my PRODUCT_ID, named 'whiteNoPkRelation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteNoPkRelation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhiteNoPkRelationDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_NO_PK_RELATION", "whiteNoPkRelation", this, WhiteNoPkRelationDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, null, false);
    }
    /**
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchaseSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_PURCHASE_PURCHASE_SELF", "purchaseSelf", this, PurchaseDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, true, false, false, true, null, null, false, "purchaseSelfAsOne", false);
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsSkipRelation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsSkipRelation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER_ADDRESS_VALID", "memberAddressAsSkipRelation", this, MemberAddressDbm.getInstance(), mp, 6, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsSkipRelation.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsSkipRelation.targetDate*/null", newArrayList("targetDate"), false, null, false);
    }
    /**
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhitePurchaseReferrerAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), WhitePurchaseReferrerDbm.getInstance().columnPurchaseReferrerId());
        return cfi("FK_WHITE_PURCHASE_REFERRER", "whitePurchaseReferrerAsOne", this, WhitePurchaseReferrerDbm.getInstance(), mp, 7, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "purchase", false);
    }
    /**
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignPurchaseSelfAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_PURCHASE_PURCHASE_SELF", "purchaseSelfAsOne", this, PurchaseDbm.getInstance(), mp, 8, org.dbflute.optional.OptionalEntity.class, true, false, true, true, null, null, false, "purchaseSelf", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (購入支払)purchase_payment by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchasePaymentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchasePaymentDbm.getInstance().columnPurchaseId());
        return cri("FK_PURCHASE_PAYMENT_PURCHASE", "purchasePaymentList", this, PurchasePaymentDbm.getInstance(), mp, false, "purchase");
    }

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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.Purchase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.PurchaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Purchase> getEntityType() { return Purchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Purchase newEntity() { return new Purchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Purchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Purchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
