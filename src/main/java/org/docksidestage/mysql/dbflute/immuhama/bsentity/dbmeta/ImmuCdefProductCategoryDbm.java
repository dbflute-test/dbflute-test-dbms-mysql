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
 * The DB meta of cdef_product_category. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuCdefProductCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuCdefProductCategoryDbm _instance = new ImmuCdefProductCategoryDbm();
    private ImmuCdefProductCategoryDbm() {}
    public static ImmuCdefProductCategoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuCdefProductCategory)et).getProductCategoryCode(), (et, vl) -> ((ImmuCdefProductCategory)et).setProductCategoryCode((String)vl), "productCategoryCode");
        setupEpg(_epgMap, et -> ((ImmuCdefProductCategory)et).getProductCategoryName(), (et, vl) -> ((ImmuCdefProductCategory)et).setProductCategoryName((String)vl), "productCategoryName");
        setupEpg(_epgMap, et -> ((ImmuCdefProductCategory)et).getParentCategoryCode(), (et, vl) -> ((ImmuCdefProductCategory)et).setParentCategoryCode((String)vl), "parentCategoryCode");
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
        setupEfpg(_efpgMap, et -> ((ImmuCdefProductCategory)et).getCdefProductCategorySelf(), (et, vl) -> ((ImmuCdefProductCategory)et).setCdefProductCategorySelf((OptionalEntity<ImmuCdefProductCategory>)vl), "cdefProductCategorySelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "cdef_product_category";
    protected final String _tableDispName = "CDEF_PRODUCT_CATEGORY";
    protected final String _tablePropertyName = "cdefProductCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("CDEF_PRODUCT_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "[区分値]商品カテゴリ";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "商品のカテゴリを表現するマスタ。自己参照FKの階層になっている。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCategoryCode = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, "商品カテゴリコード", String.class, "productCategoryCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, "自分のテーブルの別のレコードからも参照される。", null, "cdefProductCategorySelfList,productDetailList", null, false);
    protected final ColumnInfo _columnProductCategoryName = cci("PRODUCT_CATEGORY_NAME", "PRODUCT_CATEGORY_NAME", null, "商品カテゴリ名称", String.class, "productCategoryName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParentCategoryCode = cci("PARENT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", null, "親カテゴリコード", String.class, "parentCategoryCode", null, false, false, false, "CHAR", 3, 0, null, null, false, null, "最上位の場合はデータなし。まさひく自己参照FKカラム！", "cdefProductCategorySelf", null, null, false);

    /**
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    /**
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryName() { return _columnProductCategoryName; }
    /**
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to cdef_product_category}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentCategoryCode() { return _columnParentCategoryCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCategoryCode());
        ls.add(columnProductCategoryName());
        ls.add(columnParentCategoryCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductCategoryCode()); }
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
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'cdefProductCategorySelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCdefProductCategorySelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentCategoryCode(), ImmuCdefProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("FK_PRODUCT_CATEGORY_PARENT", "cdefProductCategorySelf", this, ImmuCdefProductCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "cdefProductCategorySelfList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * ([区分値]商品カテゴリ)CDEF_PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'cdefProductCategorySelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCdefProductCategorySelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ImmuCdefProductCategoryDbm.getInstance().columnParentCategoryCode());
        return cri("FK_PRODUCT_CATEGORY_PARENT", "cdefProductCategorySelfList", this, ImmuCdefProductCategoryDbm.getInstance(), mp, false, "cdefProductCategorySelf");
    }
    /**
     * (商品詳細)PRODUCT_DETAIL by PRODUCT_CATEGORY_CODE, named 'productDetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductDetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ImmuProductDetailDbm.getInstance().columnProductCategoryCode());
        return cri("FK_EVENT_PRODUCT_PRODUCT_CATEGORY", "productDetailList", this, ImmuProductDetailDbm.getInstance(), mp, false, "cdefProductCategory");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuCdefProductCategory"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuCdefProductCategoryCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuCdefProductCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuCdefProductCategory> getEntityType() { return ImmuCdefProductCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuCdefProductCategory newEntity() { return new ImmuCdefProductCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuCdefProductCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuCdefProductCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
