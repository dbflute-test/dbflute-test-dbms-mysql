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
 * The DB meta of cdef_withdrawal_reason. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImmuCdefWithdrawalReasonDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImmuCdefWithdrawalReasonDbm _instance = new ImmuCdefWithdrawalReasonDbm();
    private ImmuCdefWithdrawalReasonDbm() {}
    public static ImmuCdefWithdrawalReasonDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ImmuCdefWithdrawalReason)et).getWithdrawalReasonCode(), (et, vl) -> {
            ImmuCDef.WithdrawalReason cls = (ImmuCDef.WithdrawalReason)gcls(et, columnWithdrawalReasonCode(), vl);
            if (cls != null) {
                ((ImmuCdefWithdrawalReason)et).setWithdrawalReasonCodeAsWithdrawalReason(cls);
            } else {
                ((ImmuCdefWithdrawalReason)et).mynativeMappingWithdrawalReasonCode((String)vl);
            }
        }, "withdrawalReasonCode");
        setupEpg(_epgMap, et -> ((ImmuCdefWithdrawalReason)et).getWithdrawalReasonText(), (et, vl) -> ((ImmuCdefWithdrawalReason)et).setWithdrawalReasonText((String)vl), "withdrawalReasonText");
        setupEpg(_epgMap, et -> ((ImmuCdefWithdrawalReason)et).getDisplayOrder(), (et, vl) -> ((ImmuCdefWithdrawalReason)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "cdef_withdrawal_reason";
    protected final String _tableDispName = "CDEF_WITHDRAWAL_REASON";
    protected final String _tablePropertyName = "cdefWithdrawalReason";
    protected final TableSqlName _tableSqlName = new TableSqlName("CDEF_WITHDRAWAL_REASON", _tableDbName);
    { _tableSqlName.xacceptFilter(ImmuDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "[区分値]退会理由";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員に選ばせる定型的な退会理由のマスタ。そういえば、これ表示順カラムがないですねぇ...";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, "退会理由コード", String.class, "withdrawalReasonCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "memberWithdrawalList", ImmuCDef.DefMeta.WithdrawalReason, false);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, "退会理由テキスト", String.class, "withdrawalReasonText", null, false, false, true, "TEXT", 65535, 0, null, null, false, null, "退会理由の内容。\nテキスト形式なので目いっぱい書けるが、そうするとUI側できれいに見せるのが大変でしょうね。", null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", Integer.class, "displayOrder", null, false, false, true, "INT", 10, 0, null, null, false, null, "もう、ご想像の通りです。", null, null, null, false);

    /**
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    /**
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
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
    protected UniqueInfo cpui() { return hpcpui(columnWithdrawalReasonCode()); }
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
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberWithdrawalList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), ImmuMemberWithdrawalDbm.getInstance().columnWithdrawalReasonCode());
        return cri("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON", "memberWithdrawalList", this, ImmuMemberWithdrawalDbm.getInstance(), mp, false, "cdefWithdrawalReason");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exentity.ImmuCdefWithdrawalReason"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.cbean.ImmuCdefWithdrawalReasonCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.immuhama.exbhv.ImmuCdefWithdrawalReasonBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ImmuCdefWithdrawalReason> getEntityType() { return ImmuCdefWithdrawalReason.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ImmuCdefWithdrawalReason newEntity() { return new ImmuCdefWithdrawalReason(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ImmuCdefWithdrawalReason)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ImmuCdefWithdrawalReason)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
