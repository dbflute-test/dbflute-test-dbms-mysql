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
 * The DB meta of summary_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryProductDbm _instance = new SummaryProductDbm();
    private SummaryProductDbm() {}
    public static SummaryProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SummaryProduct)et).getProductId(), (et, vl) -> ((SummaryProduct)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((SummaryProduct)et).getProductName(), (et, vl) -> ((SummaryProduct)et).setProductName((String)vl), "productName");
        setupEpg(_epgMap, et -> ((SummaryProduct)et).getProductHandleCode(), (et, vl) -> ((SummaryProduct)et).setProductHandleCode((String)vl), "productHandleCode");
        setupEpg(_epgMap, et -> ((SummaryProduct)et).getProductStatusCode(), (et, vl) -> {
            ccls(et, columnProductStatusCode(), vl);
            CDef.ProductStatus cls = (CDef.ProductStatus)gcls(et, columnProductStatusCode(), vl);
            if (cls != null) {
                ((SummaryProduct)et).setProductStatusCodeAsProductStatus(cls);
            } else {
                ((SummaryProduct)et).mynativeMappingProductStatusCode((String)vl);
            }
        }, "productStatusCode");
        setupEpg(_epgMap, et -> ((SummaryProduct)et).getLatestPurchaseDatetime(), (et, vl) -> ((SummaryProduct)et).setLatestPurchaseDatetime(ctldt(vl)), "latestPurchaseDatetime");
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
        setupEfpg(_efpgMap, et -> ((SummaryProduct)et).getProductStatus(), (et, vl) -> ((SummaryProduct)et).setProductStatus((OptionalEntity<ProductStatus>)vl), "productStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "summary_product";
    protected final String _tableDispName = "SUMMARY_PRODUCT";
    protected final String _tablePropertyName = "summaryProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUMMARY_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "VIEW";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, "商品ID", Integer.class, "productId", null, true, false, false, "INT", 10, 0, null, "0", false, null, null, null, "purchaseList", null, false);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, "商品名称", String.class, "productName", null, false, false, false, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductHandleCode = cci("PRODUCT_HANDLE_CODE", "PRODUCT_HANDLE_CODE", null, "商品ハンドルコード", String.class, "productHandleCode", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, "商品を識別する業務上のコード。", null, null, null, false);
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, false, false, false, "CHAR", 3, 0, null, null, false, null, null, "productStatus", null, CDef.DefMeta.ProductStatus, false);
    protected final ColumnInfo _columnLatestPurchaseDatetime = cci("LATEST_PURCHASE_DATETIME", "LATEST_PURCHASE_DATETIME", null, null, java.time.LocalDateTime.class, "latestPurchaseDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * (商品ID)PRODUCT_ID: {PK, INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * (商品名称)PRODUCT_NAME: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductHandleCode() { return _columnProductHandleCode; }
    /**
     * PRODUCT_STATUS_CODE: {CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * LATEST_PURCHASE_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLatestPurchaseDatetime() { return _columnLatestPurchaseDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductStatusCode());
        ls.add(columnLatestPurchaseDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnProductHandleCode()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("FK_SUMMARY_PRODUCT_PRODUCT_STATUS", "productStatus", this, ProductStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "summaryProductList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), PurchaseDbm.getInstance().columnProductId());
        return cri("FK_PURCHASE_SUMMARY_PRODUCT", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "summaryProduct");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.SummaryProduct"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.SummaryProductCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.SummaryProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryProduct> getEntityType() { return SummaryProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SummaryProduct newEntity() { return new SummaryProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SummaryProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SummaryProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
