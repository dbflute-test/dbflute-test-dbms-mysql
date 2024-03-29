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
 * The DB meta of purchase_payment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuPurchasePaymentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuPurchasePaymentDbm _instance = new ImmuPurchasePaymentDbm();
    private ImmuPurchasePaymentDbm() {}
    public static ImmuPurchasePaymentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuPurchasePayment)et).getPurchasePaymentId(), (et, vl) -> ((ImmuPurchasePayment)et).setPurchasePaymentId(ctl(vl)), "purchasePaymentId");
        setupEpg(_epgMap, et -> ((ImmuPurchasePayment)et).getPurchaseId(), (et, vl) -> ((ImmuPurchasePayment)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((ImmuPurchasePayment)et).getPaymentAmount(), (et, vl) -> ((ImmuPurchasePayment)et).setPaymentAmount(ctb(vl)), "paymentAmount");
        setupEpg(_epgMap, et -> ((ImmuPurchasePayment)et).getPaymentDatetime(), (et, vl) -> ((ImmuPurchasePayment)et).setPaymentDatetime(ctldt(vl)), "paymentDatetime");
        setupEpg(_epgMap, et -> ((ImmuPurchasePayment)et).getPaymentMethodCode(), (et, vl) -> {
            ImmuCDef.PaymentMethod cls = (ImmuCDef.PaymentMethod)gcls(et, columnPaymentMethodCode(), vl);
            if (cls != null) {
                ((ImmuPurchasePayment)et).setPaymentMethodCodeAsPaymentMethod(cls);
            } else {
                ((ImmuPurchasePayment)et).mynativeMappingPaymentMethodCode((String)vl);
            }
        }, "paymentMethodCode");
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
        setupEfpg(_efpgMap, et -> ((ImmuPurchasePayment)et).getPurchase(), (et, vl) -> ((ImmuPurchasePayment)et).setPurchase((OptionalEntity<ImmuPurchase>)vl), "purchase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "purchase_payment";
    protected final String _tableDispName = "PURCHASE_PAYMENT";
    protected final String _tablePropertyName = "purchasePayment";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE_PAYMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入支払";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "購入に対する支払。\n分割払いもできるのでmanyとなり、会員からの孫テーブルのテストができてうれしい。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchasePaymentId = cci("PURCHASE_PAYMENT_ID", "PURCHASE_PAYMENT_ID", null, "購入支払ID", Long.class, "purchasePaymentId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, "連番", null, null, null, false);
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, "購入ID", Long.class, "purchaseId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, "支払い対象の購入へのID", "purchase", null, null, false);
    protected final ColumnInfo _columnPaymentAmount = cci("PAYMENT_AMOUNT", "PAYMENT_AMOUNT", null, "支払金額", java.math.BigDecimal.class, "paymentAmount", null, false, false, true, "DECIMAL", 10, 2, null, null, false, null, "支払った金額。さて、小数点なのはなぜでしょう？", null, null, null, false);
    protected final ColumnInfo _columnPaymentDatetime = cci("PAYMENT_DATETIME", "PAYMENT_DATETIME", null, "支払日時", java.time.LocalDateTime.class, "paymentDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, "支払ったときの日時", null, null, null, false);
    protected final ColumnInfo _columnPaymentMethodCode = cci("PAYMENT_METHOD_CODE", "PAYMENT_METHOD_CODE", null, "支払方法コード", String.class, "paymentMethodCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, "手渡しや銀行振込など", null, null, ImmuCDef.DefMeta.PaymentMethod, false);

    /**
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePaymentId() { return _columnPurchasePaymentId; }
    /**
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentAmount() { return _columnPaymentAmount; }
    /**
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentDatetime() { return _columnPaymentDatetime; }
    /**
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethodCode() { return _columnPaymentMethodCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchasePaymentId());
        ls.add(columnPurchaseId());
        ls.add(columnPaymentAmount());
        ls.add(columnPaymentDatetime());
        ls.add(columnPaymentMethodCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchasePaymentId()); }
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
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), ImmuPurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_PURCHASE_PAYMENT_PURCHASE", "purchase", this, ImmuPurchaseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchasePaymentList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuPurchasePayment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuPurchasePaymentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuPurchasePaymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuPurchasePayment> getEntityType() { return ImmuPurchasePayment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuPurchasePayment newEntity() { return new ImmuPurchasePayment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuPurchasePayment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuPurchasePayment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
