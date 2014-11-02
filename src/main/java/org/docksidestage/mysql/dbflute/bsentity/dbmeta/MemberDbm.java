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
 * The DB meta of member. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Member)et).getMemberId(), (et, vl) -> ((Member)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Member)et).getMemberName(), (et, vl) -> ((Member)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((Member)et).getMemberAccount(), (et, vl) -> ((Member)et).setMemberAccount((String)vl), "memberAccount");
        setupEpg(_epgMap, et -> ((Member)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            ccls(col, vl);
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((Member)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((Member)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((Member)et).getFormalizedDatetime(), (et, vl) -> ((Member)et).setFormalizedDatetime((java.time.LocalDateTime)vl), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getBirthdate(), (et, vl) -> ((Member)et).setBirthdate((java.time.LocalDate)vl), "birthdate");
        setupEpg(_epgMap, et -> ((Member)et).getRegisterDatetime(), (et, vl) -> ((Member)et).setRegisterDatetime((java.time.LocalDateTime)vl), "registerDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getRegisterUser(), (et, vl) -> ((Member)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Member)et).getUpdateDatetime(), (et, vl) -> ((Member)et).setUpdateDatetime((java.time.LocalDateTime)vl), "updateDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getUpdateUser(), (et, vl) -> ((Member)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Member)et).getVersionNo(), (et, vl) -> ((Member)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberStatus(), (et, vl) -> ((Member)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsValid(), (et, vl) -> ((Member)et).setMemberAddressAsValid((OptionalEntity<MemberAddress>)vl), "memberAddressAsValid");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsValidBefore(), (et, vl) -> ((Member)et).setMemberAddressAsValidBefore((OptionalEntity<MemberAddress>)vl), "memberAddressAsValidBefore");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsLoginStatus(), (et, vl) -> ((Member)et).setMemberLoginAsLoginStatus((OptionalEntity<MemberLogin>)vl), "memberLoginAsLoginStatus");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsIfComment(), (et, vl) -> ((Member)et).setMemberAddressAsIfComment((OptionalEntity<MemberAddress>)vl), "memberAddressAsIfComment");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsOnlyOneDate(), (et, vl) -> ((Member)et).setMemberAddressAsOnlyOneDate((OptionalEntity<MemberAddress>)vl), "memberAddressAsOnlyOneDate");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsLocalBindOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsLocalBindOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsLocalBindOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsLocalForeignOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsLocalForeignOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsLocalForeignOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignBindOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignBindOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignBindOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignEachOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignEachOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignEachOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignOptimizedBasicOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignOptimizedBasicOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignOptimizedBasicOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignOptimizedMarkOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignOptimizedMarkOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignOptimizedMarkOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignOptimizedPartOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignOptimizedPartOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignOptimizedPartOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignOptimizedWholeOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignOptimizedWholeOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignOptimizedWholeOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignParameterOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignParameterOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignParameterOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsForeignForeignVariousOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsForeignForeignVariousOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsForeignForeignVariousOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsReferrerOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsReferrerOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsReferrerOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsReferrerForeignOverTest(), (et, vl) -> ((Member)et).setMemberLoginAsReferrerForeignOverTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsReferrerForeignOverTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsLatest(), (et, vl) -> ((Member)et).setMemberLoginAsLatest((OptionalEntity<MemberLogin>)vl), "memberLoginAsLatest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsOldest(), (et, vl) -> ((Member)et).setMemberLoginAsOldest((OptionalEntity<MemberLogin>)vl), "memberLoginAsOldest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsFormattedBasic(), (et, vl) -> ((Member)et).setMemberAddressAsFormattedBasic((OptionalEntity<MemberAddress>)vl), "memberAddressAsFormattedBasic");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsFormattedLong(), (et, vl) -> ((Member)et).setMemberAddressAsFormattedLong((OptionalEntity<MemberAddress>)vl), "memberAddressAsFormattedLong");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsFormattedMany(), (et, vl) -> ((Member)et).setMemberLoginAsFormattedMany((OptionalEntity<MemberLogin>)vl), "memberLoginAsFormattedMany");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsEmbeddedCommentClassificationTest(), (et, vl) -> ((Member)et).setMemberLoginAsEmbeddedCommentClassificationTest((OptionalEntity<MemberLogin>)vl), "memberLoginAsEmbeddedCommentClassificationTest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberSecurityAsOne(), (et, vl) -> ((Member)et).setMemberSecurityAsOne((OptionalEntity<MemberSecurity>)vl), "memberSecurityAsOne");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberServiceAsOne(), (et, vl) -> ((Member)et).setMemberServiceAsOne((OptionalEntity<MemberService>)vl), "memberServiceAsOne");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberWithdrawalAsOne(), (et, vl) -> ((Member)et).setMemberWithdrawalAsOne((OptionalEntity<MemberWithdrawal>)vl), "memberWithdrawalAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のプロフィールやアカウントなどの基本情報を保持する。\n基本的に物理削除はなく、退会したらステータスが退会会員になる。\nライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, true, true, true, "INT", 10, 0, null, false, null, "会員を識別するID。連番として基本的に自動採番される。\n（会員IDだけに限らず）採番方法はDBMSによって変わる。", "memberAddressAsValid,memberAddressAsValidBefore,memberLoginAsLoginStatus,memberAddressAsIfComment,memberAddressAsOnlyOneDate,memberLoginAsLocalBindOverTest,memberLoginAsLocalForeignOverTest,memberLoginAsForeignForeignBindOverTest,memberLoginAsForeignForeignEachOverTest,memberLoginAsForeignForeignOptimizedBasicOverTest,memberLoginAsForeignForeignOptimizedMarkOverTest,memberLoginAsForeignForeignOptimizedPartOverTest,memberLoginAsForeignForeignOptimizedWholeOverTest,memberLoginAsForeignForeignParameterOverTest,memberLoginAsForeignForeignVariousOverTest,memberLoginAsReferrerOverTest,memberLoginAsReferrerForeignOverTest,memberLoginAsLatest,memberLoginAsOldest,memberAddressAsFormattedBasic,memberAddressAsFormattedLong,memberLoginAsFormattedMany,memberLoginAsEmbeddedCommentClassificationTest,memberSecurityAsOne,memberServiceAsOne,memberWithdrawalAsOne", "memberAddressList,memberLoginList,purchaseList", null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", String.class, "memberName", null, false, false, true, "VARCHAR", 180, 0, null, false, null, "会員のフルネームの名称。", null, null, null);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, "会員アカウント", String.class, "memberAccount", null, false, false, true, "VARCHAR", 50, 0, null, false, null, "会員がログイン時に利用するアカウントNO。", null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", String.class, "memberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, "会員が正式に確定した日時。一度確定したら更新されない。\n仮会員のときはnull。", null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 10, 0, null, false, null, "必須項目ではないので、このデータがない会員もいる。", null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, "レコードが登録された日時。共通カラムの一つ。", null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザ", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, "レコードを登録したユーザ。共通カラムの一つ。", null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, "レコードが（最後に）更新された日時。共通カラムの一つ。", null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, "レコードを更新したユーザ。", null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョンNO", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, "レコードのバージョンを示すNO。\n更新回数と等しく、主に排他制御のために利用される。", null, null, null);

    /**
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    /**
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
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
    /**
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
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
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberList");
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsValidBefore() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID_BEFORE", "memberAddressAsValidBefore", this, MemberAddressDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValidBefore.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValidBefore.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsLoginStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_STATUS", "memberLoginAsLoginStatus", this, MemberLoginDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE = /*$$locationBase$$.parameterMapMemberLoginAsLoginStatus.statusCode*/null", newArrayList("statusCode"), false, null);
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsIfComment() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_IF_COMMENT", "memberAddressAsIfComment", this, MemberAddressDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsIfComment.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsIfComment.targetDate*/null\n     /*IF $$locationBase$$.parameterMapMemberAddressAsIfComment.region != null*/and $$foreignAlias$$.REGION_ID = /*$$locationBase$$.parameterMapMemberAddressAsIfComment.region*/null/*END*/", newArrayList("targetDate, region"), false, null);
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsOnlyOneDate() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_ONLY_ONE_DATE", "memberAddressAsOnlyOneDate", this, MemberAddressDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE = ($$sqbegin$$\nselect max(address.VALID_BEGIN_DATE)\n  from MEMBER_ADDRESS address\n where address.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n   and address.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsOnlyOneDate.targetDate*/null\n)$$sqend$$", newArrayList("targetDate"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsLocalBindOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_LOCAL_BIND_OVER_TEST", "memberLoginAsLocalBindOverTest", this, MemberLoginDbm.getInstance(), mp, 6, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = /*$$locationBase$$.parameterMapMemberLoginAsLocalBindOverTest.displayOrder*/", newArrayList("displayOrder"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsLocalForeignOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_LOCAL_FOREIGN_OVER_TEST", "memberLoginAsLocalForeignOverTest", this, MemberLoginDbm.getInstance(), mp, 7, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE = $$over($localTable.memberStatus)$$.MEMBER_STATUS_NAME", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignBindOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_BIND_OVER_TEST", "memberLoginAsForeignForeignBindOverTest", this, MemberLoginDbm.getInstance(), mp, 8, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignBindOverTest.displayOrder*/", newArrayList("displayOrder"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignEachOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_EACH_OVER_TEST", "memberLoginAsForeignForeignEachOverTest", this, MemberLoginDbm.getInstance(), mp, 9, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_BASIC_OVER_TEST", "memberLoginAsForeignForeignOptimizedBasicOverTest", this, MemberLoginDbm.getInstance(), mp, 10, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = 3", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_MARK_OVER_TEST", "memberLoginAsForeignForeignOptimizedMarkOverTest", this, MemberLoginDbm.getInstance(), mp, 11, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER\n     and $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = 3\n$$inline$$\n     and $$over($foreignTable.memberStatus, DESCRIPTION)$$.STATUS_DESC is not null\n     and $$foreignAlias$$.MOBILE_LOGIN_FLG = 1\n     and $$foreignAlias$$.MEMBER_ID >= $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedPartOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_PART_OVER_TEST", "memberLoginAsForeignForeignOptimizedPartOverTest", this, MemberLoginDbm.getInstance(), mp, 12, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest.displayOrder*/\n     and $$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER\n     and $$over($foreignTable.memberStatus, DESCRIPTION)$$.STATUS_DESC is not null\n     and $$localAlias$$.BIRTHDATE is not null\n     and $$foreignAlias$$.MOBILE_LOGIN_FLG = 1\n     and $$localAlias$$.MEMBER_NAME like /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest.memberName*/null\n     and $$foreignAlias$$.MOBILE_LOGIN_FLG = (\n             select 'Y'\n         )\n     and $$foreignAlias$$.LOGIN_DATETIME >= now()\n       or $$foreignAlias$$.LOGIN_DATETIME <= now()\n     and $$foreignAlias$$.MEMBER_ID >= $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER", newArrayList("displayOrder, memberName"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_WHOLE_OVER_TEST", "memberLoginAsForeignForeignOptimizedWholeOverTest", this, MemberLoginDbm.getInstance(), mp, 13, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignOptimizedWholeOverTest.displayOrder*/\nand $$over($foreignTable.memberStatus, DESCRIPTION)$$.STATUS_DESC is not null\nand $$foreignAlias$$.MOBILE_LOGIN_FLG = 1\nand $$foreignAlias$$.MEMBER_ID >= $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER\nand $$foreignAlias$$.LOGIN_DATETIME < ($$sqbegin$$\nselect max(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$\nand $$foreignAlias$$.LOGIN_DATETIME > ($$sqbegin$$\nselect min(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$", newArrayList("displayOrder"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignParameterOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_PARAMETER_OVER_TEST", "memberLoginAsForeignForeignParameterOverTest", this, MemberLoginDbm.getInstance(), mp, 14, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER\n     and $$over($foreignTable.memberStatus, MEMBER_STATUS_CODE)$$.MEMBER_STATUS_CODE is not null\n     and $$over($foreignTable.memberStatus, MEMBER_STATUS_NAME)$$.MEMBER_STATUS_NAME is not null\n     and $$localAlias$$.BIRTHDATE > /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignParameterOverTest.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsForeignForeignVariousOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_VARIOUS_OVER_TEST", "memberLoginAsForeignForeignVariousOverTest", this, MemberLoginDbm.getInstance(), mp, 15, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($foreignTable.member.memberStatus)$$.DISPLAY_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne)$$.WITHDRAWAL_DATETIME is not null\n     and $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne.withdrawalReason, DISPLAY_ORDER)$$.REASON_ORDER is not null\n     and $$over($foreignTable.memberStatus)$$.MEMBER_STATUS_NAME is not null\n     and $$over(PURCHASE.product.productStatus)$$.PRODUCT_STATUS_NAME is not null\n     $$inline$$", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsReferrerOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_REFERRER_OVER_TEST", "memberLoginAsReferrerOverTest", this, MemberLoginDbm.getInstance(), mp, 16, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_DATETIME > $$over(PURCHASE)$$.PURCHASE_DATETIME", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsReferrerForeignOverTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_REFERRER_FOREIGN_OVER_TEST", "memberLoginAsReferrerForeignOverTest", this, MemberLoginDbm.getInstance(), mp, 17, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE = $$over(PURCHASE.product.productStatus)$$.PRODUCT_STATUS_NAME", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsLatest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_LATEST", "memberLoginAsLatest", this, MemberLoginDbm.getInstance(), mp, 18, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_DATETIME = ($$sqbegin$$\nselect max(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsOldest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_OLDEST", "memberLoginAsOldest", this, MemberLoginDbm.getInstance(), mp, 19, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_DATETIME = ($$sqbegin$$\nselect min(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$", null, false, null);
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsFormattedBasic() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_FORMATTED_BASIC", "memberAddressAsFormattedBasic", this, MemberAddressDbm.getInstance(), mp, 20, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsFormattedBasic.targetDate*/\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsFormattedBasic.targetDate*/", newArrayList("targetDate"), false, null);
    }
    /**
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsFormattedLong() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_FORMATTED_LONG", "memberAddressAsFormattedLong", this, MemberAddressDbm.getInstance(), mp, 21, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsFormattedLong.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE\n >= /*$$locationBase$$.parameterMapMemberAddressAsFormattedLong.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsFormattedMany() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FORMATTED_MANY", "memberLoginAsFormattedMany", this, MemberLoginDbm.getInstance(), mp, 22, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$over($foreignTable.member.memberStatus)$$.DISPLAY_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne)$$.WITHDRAWAL_DATETIME is not null\n     and $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne.withdrawalReason, DISPLAY_ORDER)$$.REASON_ORDER is not null\n     and $$over($foreignTable.memberStatus)$$.MEMBER_STATUS_NAME is not null\n     and $$over($localTable.memberSecurityAsOne)$$.REMINDER_QUESTION is not null\n     and $$over($localTable.memberServiceAsOne)$$.SERVICE_POINT_COUNT is not null", null, false, null);
    }
    /**
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsEmbeddedCommentClassificationTest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_EMBEDDED_COMMENT_CLASSIFICATION", "memberLoginAsEmbeddedCommentClassificationTest", this, MemberLoginDbm.getInstance(), mp, 23, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.MOBILE_LOGIN_FLG = 1\n      or $$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE in ('FML', 'PRV')\n      or $$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE in ('WDL')", null, false, null);
    }
    /**
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), mp, 24, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member");
    }
    /**
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberServiceAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberServiceDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SERVICE_MEMBER", "memberServiceAsOne", this, MemberServiceDbm.getInstance(), mp, 25, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member");
    }
    /**
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), mp, 26, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), mp, false, "member");
    }
    /**
     * (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "member");
    }
    /**
     * (購入)purchase by MEMBER_ID, named 'purchaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "member");
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
    public String getEntityTypeName() { return "org.docksidestage.mysql.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.mysql.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.mysql.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Member newEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Member)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Member)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
