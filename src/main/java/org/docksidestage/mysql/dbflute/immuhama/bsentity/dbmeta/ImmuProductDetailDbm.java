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
 * The DB meta of product_detail. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuProductDetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuProductDetailDbm _instance = new ImmuProductDetailDbm();
    private ImmuProductDetailDbm() {}
    public static ImmuProductDetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getProductDetailId(), (et, vl) -> ((ImmuProductDetail)et).setProductDetailId(ctl(vl)), "productDetailId");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getProductId(), (et, vl) -> ((ImmuProductDetail)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getProductName(), (et, vl) -> ((ImmuProductDetail)et).setProductName((String)vl), "productName");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getProductHandleCode(), (et, vl) -> ((ImmuProductDetail)et).setProductHandleCode((String)vl), "productHandleCode");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getProductCategoryCode(), (et, vl) -> ((ImmuProductDetail)et).setProductCategoryCode((String)vl), "productCategoryCode");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getProductStatusCode(), (et, vl) -> ((ImmuProductDetail)et).setProductStatusCode((String)vl), "productStatusCode");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getRegisterDatetime(), (et, vl) -> ((ImmuProductDetail)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getRegisterUser(), (et, vl) -> ((ImmuProductDetail)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getUpdateDatetime(), (et, vl) -> ((ImmuProductDetail)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ImmuProductDetail)et).getUpdateUser(), (et, vl) -> ((ImmuProductDetail)et).setUpdateUser((String)vl), "updateUser");
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
        setupEfpg(_efpgMap, et -> ((ImmuProductDetail)et).getCdefProductCategory(), (et, vl) -> ((ImmuProductDetail)et).setCdefProductCategory((OptionalEntity<ImmuCdefProductCategory>)vl), "cdefProductCategory");
        setupEfpg(_efpgMap, et -> ((ImmuProductDetail)et).getProduct(), (et, vl) -> ((ImmuProductDetail)et).setProduct((OptionalEntity<ImmuProduct>)vl), "product");
        setupEfpg(_efpgMap, et -> ((ImmuProductDetail)et).getCdefProductStatus(), (et, vl) -> ((ImmuProductDetail)et).setCdefProductStatus((OptionalEntity<ImmuCdefProductStatus>)vl), "cdefProductStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "product_detail";
    protected final String _tableDispName = "PRODUCT_DETAIL";
    protected final String _tablePropertyName = "productDetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT_DETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "商品詳細";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductDetailId = cci("PRODUCT_DETAIL_ID", "PRODUCT_DETAIL_ID", null, "商品詳細ID", Long.class, "productDetailId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "purchaseList", null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, "商品ID", Integer.class, "productId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "product", null, null, false);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, "商品名称", String.class, "productName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, "ExampleDBとして、コメントの少ないケースを表現するため、あえてコメントを控えている。\n実業務ではしっかりとコメントを入れることが強く強く推奨される。「よりによってこのテーブルでやらないでよ！」あわわ、何も聞こえません〜", null, null, null, false);
    protected final ColumnInfo _columnProductHandleCode = cci("PRODUCT_HANDLE_CODE", "PRODUCT_HANDLE_CODE", null, "商品ハンドルコード", String.class, "productHandleCode", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, "これだけは書いておこう、商品を識別する業務上のコード。よく品番とか言うかもしれませんねぇ...", null, null, null, false);
    protected final ColumnInfo _columnProductCategoryCode = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, "商品カテゴリコード", String.class, "productCategoryCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, "自分のテーブルの別のレコードからも参照される。", "cdefProductCategory", null, null, false);
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, "商品ステータスコード", String.class, "productStatusCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, "商品ステータスを識別するコード。", "cdefProductStatus", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, "レコードが登録された日時", null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, "レコードを登録したユーザー", null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);

    /**
     * (商品詳細ID)PRODUCT_DETAIL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductDetailId() { return _columnProductDetailId; }
    /**
     * (商品ID)PRODUCT_ID: {IX, NotNull, INT(10), FK to product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductHandleCode() { return _columnProductHandleCode; }
    /**
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_category}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    /**
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_product_status}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
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
        ls.add(columnProductDetailId());
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductCategoryCode());
        ls.add(columnProductStatusCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductDetailId()); }
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
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'cdefProductCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCdefProductCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ImmuCdefProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("FK_EVENT_PRODUCT_PRODUCT_CATEGORY", "cdefProductCategory", this, ImmuCdefProductCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productDetailList", false);
    }
    /**
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), ImmuProductDbm.getInstance().columnProductId());
        return cfi("FK_EVENT_PRODUCT_PRODUCT", "product", this, ImmuProductDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productDetailList", false);
    }
    /**
     * ([区分値]商品ステータス)CDEF_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'cdefProductStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCdefProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ImmuCdefProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("FK_EVENT_PRODUCT_PRODUCT_STATUS", "cdefProductStatus", this, ImmuCdefProductStatusDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productDetailList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (購入)PURCHASE by PRODUCT_DETAIL_ID, named 'purchaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductDetailId(), ImmuPurchaseDbm.getInstance().columnProductDetailId());
        return cri("FK_PURCHASE_PRODUCT_DETAIL", "purchaseList", this, ImmuPurchaseDbm.getInstance(), mp, false, "productDetail");
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuProductDetail"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuProductDetailCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuProductDetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuProductDetail> getEntityType() { return ImmuProductDetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuProductDetail newEntity() { return new ImmuProductDetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuProductDetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuProductDetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
