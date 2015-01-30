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
 * The DB meta of white_variant_relation_referrer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationReferrerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteVariantRelationReferrerDbm _instance = new WhiteVariantRelationReferrerDbm();
    private WhiteVariantRelationReferrerDbm() {}
    public static WhiteVariantRelationReferrerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteVariantRelationReferrer)et).getReferrerId(), (et, vl) -> ((WhiteVariantRelationReferrer)et).setReferrerId(ctl(vl)), "referrerId");
        setupEpg(_epgMap, et -> ((WhiteVariantRelationReferrer)et).getVariantMasterId(), (et, vl) -> ((WhiteVariantRelationReferrer)et).setVariantMasterId(ctl(vl)), "variantMasterId");
        setupEpg(_epgMap, et -> ((WhiteVariantRelationReferrer)et).getMasterTypeCode(), (et, vl) -> {
            ColumnInfo col = columnMasterTypeCode();
            ccls(col, vl);
            CDef.VariantRelationMasterType cls = (CDef.VariantRelationMasterType)gcls(col, vl);
            if (cls != null) {
                ((WhiteVariantRelationReferrer)et).setMasterTypeCodeAsVariantRelationMasterType(cls);
            } else {
                ((WhiteVariantRelationReferrer)et).mynativeMappingMasterTypeCode((String)vl);
            }
        }, "masterTypeCode");
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
        setupEfpg(_efpgMap, et -> ((WhiteVariantRelationReferrer)et).getWhiteVariantRelationMasterFooAsVariant(), (et, vl) -> ((WhiteVariantRelationReferrer)et).setWhiteVariantRelationMasterFooAsVariant((OptionalEntity<WhiteVariantRelationMasterFoo>)vl), "whiteVariantRelationMasterFooAsVariant");
        setupEfpg(_efpgMap, et -> ((WhiteVariantRelationReferrer)et).getWhiteVariantRelationMasterBarAsVariant(), (et, vl) -> ((WhiteVariantRelationReferrer)et).setWhiteVariantRelationMasterBarAsVariant((OptionalEntity<WhiteVariantRelationMasterBar>)vl), "whiteVariantRelationMasterBarAsVariant");
        setupEfpg(_efpgMap, et -> ((WhiteVariantRelationReferrer)et).getWhiteVariantRelationMasterQuxAsVariantByQue(), (et, vl) -> ((WhiteVariantRelationReferrer)et).setWhiteVariantRelationMasterQuxAsVariantByQue((OptionalEntity<WhiteVariantRelationMasterQux>)vl), "whiteVariantRelationMasterQuxAsVariantByQue");
        setupEfpg(_efpgMap, et -> ((WhiteVariantRelationReferrer)et).getWhiteVariantRelationMasterCorgeAsVariantByQuxType(), (et, vl) -> ((WhiteVariantRelationReferrer)et).setWhiteVariantRelationMasterCorgeAsVariantByQuxType((OptionalEntity<WhiteVariantRelationMasterCorge>)vl), "whiteVariantRelationMasterCorgeAsVariantByQuxType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_variant_relation_referrer";
    protected final String _tableDispName = "WHITE_VARIANT_RELATION_REFERRER";
    protected final String _tablePropertyName = "whiteVariantRelationReferrer";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_VARIANT_RELATION_REFERRER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReferrerId = cci("REFERRER_ID", "REFERRER_ID", null, null, Long.class, "referrerId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, "whiteVariantRelationReferrerRefList", null, false);
    protected final ColumnInfo _columnVariantMasterId = cci("VARIANT_MASTER_ID", "VARIANT_MASTER_ID", null, null, Long.class, "variantMasterId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "whiteVariantRelationMasterFooAsVariant,whiteVariantRelationMasterBarAsVariant,whiteVariantRelationMasterQuxAsVariantByQue,whiteVariantRelationMasterCorgeAsVariantByQuxType", null, null, false);
    protected final ColumnInfo _columnMasterTypeCode = cci("MASTER_TYPE_CODE", "MASTER_TYPE_CODE", null, null, String.class, "masterTypeCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.VariantRelationMasterType, false);

    /**
     * REFERRER_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferrerId() { return _columnReferrerId; }
    /**
     * VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVariantMasterId() { return _columnVariantMasterId; }
    /**
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMasterTypeCode() { return _columnMasterTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReferrerId());
        ls.add(columnVariantMasterId());
        ls.add(columnMasterTypeCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnReferrerId()); }
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
     * white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationMasterFooAsVariant() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterFooDbm.getInstance().columnMasterFooId());
        return cfi("FK_WHITE_VARIANT_RELATION_FOO", "whiteVariantRelationMasterFooAsVariant", this, WhiteVariantRelationMasterFooDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'FOO'", null, false, "whiteVariantRelationReferrerAsVariantList", false);
    }
    /**
     * white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationMasterBarAsVariant() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterBarDbm.getInstance().columnMasterBarId());
        return cfi("FK_WHITE_VARIANT_RELATION_BAR", "whiteVariantRelationMasterBarAsVariant", this, WhiteVariantRelationMasterBarDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'BAR'", null, false, "whiteVariantRelationReferrerAsVariantList", false);
    }
    /**
     * white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationMasterQuxAsVariantByQue() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterQuxDbm.getInstance().columnMasterQuxId());
        return cfi("FK_WHITE_VARIANT_RELATION_QUX", "whiteVariantRelationMasterQuxAsVariantByQue", this, WhiteVariantRelationMasterQuxDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'QUX'\n     and $$foreignAlias$$.QUX_TYPE_CODE = 'Que'", null, false, null, false);
    }
    /**
     * white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVariantMasterId(), WhiteVariantRelationMasterCorgeDbm.getInstance().columnMasterCorgeId());
        return cfi("FK_WHITE_VARIANT_RELATION_CORGE", "whiteVariantRelationMasterCorgeAsVariantByQuxType", this, WhiteVariantRelationMasterCorgeDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, true, "$$localAlias$$.MASTER_TYPE_CODE = 'CORGE'\n     and $$foreignAlias$$.CORGE_TYPE_CODE = /*$$locationBase$$.parameterMapWhiteVariantRelationMasterCorgeAsVariantByQuxType.quxType*/null", newArrayList("quxType"), false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteVariantRelationReferrerRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReferrerId(), WhiteVariantRelationReferrerRefDbm.getInstance().columnReferrerId());
        return cri("FK_WHITE_VARIANT_RELATION_REFERRER_REF", "whiteVariantRelationReferrerRefList", this, WhiteVariantRelationReferrerRefDbm.getInstance(), mp, false, "whiteVariantRelationReferrer");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.WhiteVariantRelationReferrer"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.WhiteVariantRelationReferrerCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.WhiteVariantRelationReferrerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteVariantRelationReferrer> getEntityType() { return WhiteVariantRelationReferrer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteVariantRelationReferrer newEntity() { return new WhiteVariantRelationReferrer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteVariantRelationReferrer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteVariantRelationReferrer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
