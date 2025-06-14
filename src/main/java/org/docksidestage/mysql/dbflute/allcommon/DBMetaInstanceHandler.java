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
package org.docksidestage.mysql.dbflute.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.exception.DBMetaNotFoundException;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull, LazyLoaded) */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected static final Map<Class<?>, DBMeta> _entityTypeInstanceMap = newHashMap();

    /** The map of table DB name and DB meta class name. (NotNull) */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("member", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberDbm");
        tmpMap.put("member_address", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberAddressDbm");
        tmpMap.put("member_following", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberFollowingDbm");
        tmpMap.put("member_login", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberLoginDbm");
        tmpMap.put("member_security", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberSecurityDbm");
        tmpMap.put("member_service", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberServiceDbm");
        tmpMap.put("member_status", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberStatusDbm");
        tmpMap.put("member_withdrawal", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberWithdrawalDbm");
        tmpMap.put("product", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.ProductDbm");
        tmpMap.put("product_category", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.ProductCategoryDbm");
        tmpMap.put("product_status", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.ProductStatusDbm");
        tmpMap.put("purchase", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.PurchaseDbm");
        tmpMap.put("purchase_payment", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.PurchasePaymentDbm");
        tmpMap.put("region", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.RegionDbm");
        tmpMap.put("service_rank", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.ServiceRankDbm");
        tmpMap.put("summary_product", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.SummaryProductDbm");
        tmpMap.put("summary_withdrawal", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.SummaryWithdrawalDbm");
        tmpMap.put("vendor_$_dollar", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.Vendor$DollarDbm");
        tmpMap.put("vendor_check", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorCheckDbm");
        tmpMap.put("vendor_constraint_name_auto_bar", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorConstraintNameAutoBarDbm");
        tmpMap.put("vendor_constraint_name_auto_foo", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorConstraintNameAutoFooDbm");
        tmpMap.put("vendor_constraint_name_auto_qux", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorConstraintNameAutoQuxDbm");
        tmpMap.put("vendor_constraint_name_auto_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorConstraintNameAutoRefDbm");
        tmpMap.put("vendor_large_data", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorLargeDataDbm");
        tmpMap.put("vendor_large_data_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorLargeDataRefDbm");
        tmpMap.put("vendor_the_long_and_winding_table_and_column", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorTheLongAndWindingTableAndColumnDbm");
        tmpMap.put("vendor_the_long_and_winding_table_and_column_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorTheLongAndWindingTableAndColumnRefDbm");
        tmpMap.put("white_all_in_one_cls_category", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteAllInOneClsCategoryDbm");
        tmpMap.put("white_all_in_one_cls_compound_pk_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteAllInOneClsCompoundPkRefDbm");
        tmpMap.put("white_all_in_one_cls_element", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteAllInOneClsElementDbm");
        tmpMap.put("white_all_in_one_cls_normal_col_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteAllInOneClsNormalColRefDbm");
        tmpMap.put("white_binary", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteBinaryDbm");
        tmpMap.put("white_cls_no_camelizing", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteClsNoCamelizingDbm");
        tmpMap.put("white_column_except", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteColumnExceptDbm");
        tmpMap.put("white_column_except_gen_only", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteColumnExceptGenOnlyDbm");
        tmpMap.put("white_compound_pk", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundPkDbm");
        tmpMap.put("white_compound_pk_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundPkRefDbm");
        tmpMap.put("white_compound_pk_ref_many", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundPkRefManyDbm");
        tmpMap.put("white_compound_pk_ref_nest", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundPkRefNestDbm");
        tmpMap.put("white_compound_pk_wrong_order", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundPkWrongOrderDbm");
        tmpMap.put("white_compound_referred_normally", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundReferredNormallyDbm");
        tmpMap.put("white_compound_referred_primary", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteCompoundReferredPrimaryDbm");
        tmpMap.put("white_date_adjustment", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteDateAdjustmentDbm");
        tmpMap.put("white_db_comment", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteDbCommentDbm");
        tmpMap.put("white_delimiter", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteDelimiterDbm");
        tmpMap.put("white_deprecated_cls_element", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteDeprecatedClsElementDbm");
        tmpMap.put("white_escaped_dfprop", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteEscapedDfpropDbm");
        tmpMap.put("white_escaped_java_doc", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteEscapedJavaDocDbm");
        tmpMap.put("white_escaped_number_initial", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteEscapedNumberInitialDbm");
        tmpMap.put("white_function_index_base", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteFunctionIndexBaseDbm");
        tmpMap.put("white_geared_cipher", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteGearedCipherDbm");
        tmpMap.put("white_generated_column_base", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteGeneratedColumnBaseDbm");
        tmpMap.put("white_grouping_reference", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteGroupingReferenceDbm");
        tmpMap.put("white_implicit_conv_integer", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitConvIntegerDbm");
        tmpMap.put("white_implicit_conv_numeric", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitConvNumericDbm");
        tmpMap.put("white_implicit_conv_string", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitConvStringDbm");
        tmpMap.put("white_implicit_reverse_fk", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkDbm");
        tmpMap.put("white_implicit_reverse_fk_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkRefDbm");
        tmpMap.put("white_implicit_reverse_fk_suppress", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkSuppressDbm");
        tmpMap.put("white_include_query", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteIncludeQueryDbm");
        tmpMap.put("white_large_text_file", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteLargeTextFileDbm");
        tmpMap.put("white_line_sep_comment", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteLineSepCommentDbm");
        tmpMap.put("white_load_data", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteLoadDataDbm");
        tmpMap.put("white_myself", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteMyselfDbm");
        tmpMap.put("white_myself_check", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteMyselfCheckDbm");
        tmpMap.put("white_no_pk", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteNoPkDbm");
        tmpMap.put("white_no_pk_common_column", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteNoPkCommonColumnDbm");
        tmpMap.put("white_no_pk_relation", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteNoPkRelationDbm");
        tmpMap.put("white_non_unique_many_to_one_from", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteNonUniqueManyToOneFromDbm");
        tmpMap.put("white_non_unique_many_to_one_to", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteNonUniqueManyToOneToDbm");
        tmpMap.put("white_only_one_to_one_from", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteOnlyOneToOneFromDbm");
        tmpMap.put("white_only_one_to_one_to", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteOnlyOneToOneToDbm");
        tmpMap.put("white_perrotta_over_member", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePerrottaOverMemberDbm");
        tmpMap.put("white_perrotta_over_member_macho", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePerrottaOverMemberMachoDbm");
        tmpMap.put("white_perrotta_over_product", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePerrottaOverProductDbm");
        tmpMap.put("white_perrotta_over_product_nested", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePerrottaOverProductNestedDbm");
        tmpMap.put("white_perrotta_over_trace", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePerrottaOverTraceDbm");
        tmpMap.put("white_pg_reserv", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePgReservDbm");
        tmpMap.put("white_pg_reserv_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePgReservRefDbm");
        tmpMap.put("white_point_type_mapping", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePointTypeMappingDbm");
        tmpMap.put("white_purchase_referrer", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhitePurchaseReferrerDbm");
        tmpMap.put("white_quoted", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteQuotedDbm");
        tmpMap.put("white_quoted_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteQuotedRefDbm");
        tmpMap.put("white_self_reference", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSelfReferenceDbm");
        tmpMap.put("white_self_reference_ref_one", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSelfReferenceRefOneDbm");
        tmpMap.put("white_split_multiple_fk_base", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSplitMultipleFkBaseDbm");
        tmpMap.put("white_split_multiple_fk_child", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSplitMultipleFkChildDbm");
        tmpMap.put("white_split_multiple_fk_next", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSplitMultipleFkNextDbm");
        tmpMap.put("white_split_multiple_fk_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSplitMultipleFkRefDbm");
        tmpMap.put("white_stiletto_alias", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteStilettoAliasDbm");
        tmpMap.put("white_stiletto_alias_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteStilettoAliasRefDbm");
        tmpMap.put("white_summary_basic_product", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSummaryBasicProductDbm");
        tmpMap.put("white_summary_complex_product", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSummaryComplexProductDbm");
        tmpMap.put("white_suppress_def_check", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressDefCheckDbm");
        tmpMap.put("white_suppress_join_sq", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqDbm");
        tmpMap.put("white_suppress_join_sq_many", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyDbm");
        tmpMap.put("white_suppress_join_sq_many_one", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyOneDbm");
        tmpMap.put("white_suppress_join_sq_many_one_one", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyOneOneDbm");
        tmpMap.put("white_suppress_join_sq_one", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqOneDbm");
        tmpMap.put("white_suppress_join_sq_one_addi", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqOneAddiDbm");
        tmpMap.put("white_table_except_gen_head", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteTableExceptGenHeadDbm");
        tmpMap.put("white_table_except_gen_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteTableExceptGenRefDbm");
        tmpMap.put("white_uq_classification", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqClassificationDbm");
        tmpMap.put("white_uq_classification_flg", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqClassificationFlgDbm");
        tmpMap.put("white_uq_classification_flg_bit", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqClassificationFlgBitDbm");
        tmpMap.put("white_uq_classification_flg_part", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqClassificationFlgPartDbm");
        tmpMap.put("white_uq_fk", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqFkDbm");
        tmpMap.put("white_uq_fk_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqFkRefDbm");
        tmpMap.put("white_uq_fk_ref_nest", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqFkRefNestDbm");
        tmpMap.put("white_uq_fk_without_pk", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqFkWithoutPkDbm");
        tmpMap.put("white_uq_fk_without_pk_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteUqFkWithoutPkRefDbm");
        tmpMap.put("white_variant_relation_local_pk_referrer", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationLocalPkReferrerDbm");
        tmpMap.put("white_variant_relation_master_bar", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationMasterBarDbm");
        tmpMap.put("white_variant_relation_master_corge", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationMasterCorgeDbm");
        tmpMap.put("white_variant_relation_master_foo", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationMasterFooDbm");
        tmpMap.put("white_variant_relation_master_qux", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationMasterQuxDbm");
        tmpMap.put("white_variant_relation_referrer", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationReferrerDbm");
        tmpMap.put("white_variant_relation_referrer_ref", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteVariantRelationReferrerRefDbm");
        tmpMap.put("white_xls_man", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteXlsManDbm");
        tmpMap.put("withdrawal_reason", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WithdrawalReasonDbm");
        tmpMap.put("next_schema_product", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.NextSchemaProductDbm");
        tmpMap.put("white_additional", "org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteAdditionalDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta. map:{tableDbName = DBMeta}
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
                findDBMeta(tableDbName); // initialize
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new DBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    public DBMeta provideDBMeta(Class<?> entityType) {
        return byEntityType(entityType);
    }

    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    public DBMeta provideDBMetaChecked(Class<?> entityType) {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(Class<?> entityType) {
        DBMeta dbmeta = byEntityType(entityType);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return tableDbName != null ? byTableDbName(tableDbName) : null;
    }

    protected static String retryByNormalizedName(String tableFlexibleName) {
        String tableDbName = null;
        String pureName = normalizeTableFlexibleName(tableFlexibleName);
        String schema = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected static String normalizeTableFlexibleName(String tableFlexibleName) {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected static String removeSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(dotLastIndex + ".".length()) : name;
    }

    protected static String extractSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(0, dotLastIndex) : null;
    }

    protected static String strip(String name) {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byEntityType(Class<?> entityType) {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String dbmetaName = _tableDbNameClassNameMap.get(tableDbName);
            if (dbmetaName == null) {
                return null;
            }
            _tableDbNameInstanceMap.put(tableDbName, toDBMetaInstance(dbmetaName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta toDBMetaInstance(String dbmetaName) {
        try {
            Class<?> dbmetaType = Class.forName(dbmetaName);
            Method method = dbmetaType.getMethod("getInstance", (Class[])null);
            Object result = method.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            String msg = "Failed to get the instance: " + dbmetaName;
            throw new IllegalStateException(msg, e);
        }
    }

    protected static DBMeta getCachedDBMeta(Class<?> entityType) { // lazy-load same as by-name
        DBMeta dbmeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_entityTypeInstanceMap) {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (Entity.class.isAssignableFrom(entityType)) { // required
                Entity entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.asTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected static Entity newEntity(Class<?> entityType) {
        try {
            return (Entity)entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            String msg = "Failed to new the instance: " + entityType;
            throw new IllegalStateException(msg, e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
