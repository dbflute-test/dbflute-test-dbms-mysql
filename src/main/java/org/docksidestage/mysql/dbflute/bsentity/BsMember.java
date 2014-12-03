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
package org.docksidestage.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.*;
import org.docksidestage.mysql.dbflute.nogen.cache.*;

/**
 * The entity of (会員)MEMBER as TABLE. <br>
 * 会員のプロフィールやアカウントなどの基本情報を保持する。<br>
 * 基本的に物理削除はなく、退会したらステータスが退会会員になる。<br>
 * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     member_status, MEMBER_ADDRESS(AsValid), MEMBER_LOGIN(AsLoginStatus), member_security(AsOne), member_service(AsOne), member_withdrawal(AsOne)
 * 
 * [referrer table]
 *     member_address, member_following, member_login, purchase, member_security, member_service, member_withdrawal
 * 
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberAddressAsValidBefore, memberLoginAsLoginStatus, memberAddressAsIfComment, memberAddressAsOnlyOneDate, memberLoginAsLocalBindOverTest, memberLoginAsLocalForeignOverTest, memberLoginAsForeignForeignBindOverTest, memberLoginAsForeignForeignEachOverTest, memberLoginAsForeignForeignOptimizedBasicOverTest, memberLoginAsForeignForeignOptimizedMarkOverTest, memberLoginAsForeignForeignOptimizedPartOverTest, memberLoginAsForeignForeignOptimizedWholeOverTest, memberLoginAsForeignForeignParameterOverTest, memberLoginAsForeignForeignVariousOverTest, memberLoginAsReferrerOverTest, memberLoginAsReferrerForeignOverTest, memberLoginAsLatest, memberLoginAsOldest, memberAddressAsFormattedBasic, memberAddressAsFormattedLong, memberLoginAsFormattedMany, memberLoginAsEmbeddedCommentClassificationTest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, memberLoginList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.time.LocalDateTime formalizedDatetime = entity.getFormalizedDatetime();
 * java.time.LocalDate birthdate = entity.getBirthdate();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setBirthdate(birthdate);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS} */
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)} */
    protected String _memberName;

    /** (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} */
    protected String _memberAccount;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)} */
    protected java.time.LocalDateTime _formalizedDatetime;

    /** (生年月日)BIRTHDATE: {DATE(10)} */
    protected java.time.LocalDate _birthdate;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String memberAccount) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAccount");
        setMemberAccount(memberAccount);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * 会員ステータス: 会員の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * 会員ステータス: 会員の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized (FML). <br>
     * 正式会員: 正式な会員を示す
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br>
     * 仮会員: 仮の会員を示す
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br>
     * 退会会員: 退会した会員を示す
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br>
     * 正式会員: 正式な会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode Provisional? <br>
     * 仮会員: 仮の会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br>
     * 退会会員: 退会した会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'memberStatusCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMemberStatusCodeName() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'memberStatusCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getMemberStatusCodeAlias() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected OptionalEntity<MemberStatus> _memberStatus;

    /**
     * [get] (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberStatus> getMemberStatus() {
        if (_memberStatus == null) { _memberStatus = OptionalEntity.relationEmpty(this, "memberStatus"); }
        if (_memberStatus.orElse(null) == null) { _memberStatus = CachedMemberStatus.get(this, "memberStatus", getMemberStatusCode()); }
        return _memberStatus;
    }

    /**
     * [set] (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(OptionalEntity<MemberStatus> memberStatus) {
        _memberStatus = memberStatus;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'. */
    protected OptionalEntity<MemberAddress> _memberAddressAsValid;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsValid'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberAddress> getMemberAddressAsValid() {
        if (_memberAddressAsValid == null) { _memberAddressAsValid = OptionalEntity.relationEmpty(this, "memberAddressAsValid"); }
        return _memberAddressAsValid;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param memberAddressAsValid The entity of foreign property 'memberAddressAsValid'. (NullAllowed)
     */
    public void setMemberAddressAsValid(OptionalEntity<MemberAddress> memberAddressAsValid) {
        _memberAddressAsValid = memberAddressAsValid;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'. */
    protected OptionalEntity<MemberAddress> _memberAddressAsValidBefore;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsValidBefore'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberAddress> getMemberAddressAsValidBefore() {
        if (_memberAddressAsValidBefore == null) { _memberAddressAsValidBefore = OptionalEntity.relationEmpty(this, "memberAddressAsValidBefore"); }
        return _memberAddressAsValidBefore;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @param memberAddressAsValidBefore The entity of foreign property 'memberAddressAsValidBefore'. (NullAllowed)
     */
    public void setMemberAddressAsValidBefore(OptionalEntity<MemberAddress> memberAddressAsValidBefore) {
        _memberAddressAsValidBefore = memberAddressAsValidBefore;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsLoginStatus;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsLoginStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsLoginStatus() {
        if (_memberLoginAsLoginStatus == null) { _memberLoginAsLoginStatus = OptionalEntity.relationEmpty(this, "memberLoginAsLoginStatus"); }
        return _memberLoginAsLoginStatus;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @param memberLoginAsLoginStatus The entity of foreign property 'memberLoginAsLoginStatus'. (NullAllowed)
     */
    public void setMemberLoginAsLoginStatus(OptionalEntity<MemberLogin> memberLoginAsLoginStatus) {
        _memberLoginAsLoginStatus = memberLoginAsLoginStatus;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'. */
    protected OptionalEntity<MemberAddress> _memberAddressAsIfComment;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsIfComment'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberAddress> getMemberAddressAsIfComment() {
        if (_memberAddressAsIfComment == null) { _memberAddressAsIfComment = OptionalEntity.relationEmpty(this, "memberAddressAsIfComment"); }
        return _memberAddressAsIfComment;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @param memberAddressAsIfComment The entity of foreign property 'memberAddressAsIfComment'. (NullAllowed)
     */
    public void setMemberAddressAsIfComment(OptionalEntity<MemberAddress> memberAddressAsIfComment) {
        _memberAddressAsIfComment = memberAddressAsIfComment;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'. */
    protected OptionalEntity<MemberAddress> _memberAddressAsOnlyOneDate;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsOnlyOneDate'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberAddress> getMemberAddressAsOnlyOneDate() {
        if (_memberAddressAsOnlyOneDate == null) { _memberAddressAsOnlyOneDate = OptionalEntity.relationEmpty(this, "memberAddressAsOnlyOneDate"); }
        return _memberAddressAsOnlyOneDate;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @param memberAddressAsOnlyOneDate The entity of foreign property 'memberAddressAsOnlyOneDate'. (NullAllowed)
     */
    public void setMemberAddressAsOnlyOneDate(OptionalEntity<MemberAddress> memberAddressAsOnlyOneDate) {
        _memberAddressAsOnlyOneDate = memberAddressAsOnlyOneDate;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsLocalBindOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsLocalBindOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsLocalBindOverTest() {
        if (_memberLoginAsLocalBindOverTest == null) { _memberLoginAsLocalBindOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsLocalBindOverTest"); }
        return _memberLoginAsLocalBindOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * @param memberLoginAsLocalBindOverTest The entity of foreign property 'memberLoginAsLocalBindOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsLocalBindOverTest(OptionalEntity<MemberLogin> memberLoginAsLocalBindOverTest) {
        _memberLoginAsLocalBindOverTest = memberLoginAsLocalBindOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsLocalForeignOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsLocalForeignOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsLocalForeignOverTest() {
        if (_memberLoginAsLocalForeignOverTest == null) { _memberLoginAsLocalForeignOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsLocalForeignOverTest"); }
        return _memberLoginAsLocalForeignOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @param memberLoginAsLocalForeignOverTest The entity of foreign property 'memberLoginAsLocalForeignOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsLocalForeignOverTest(OptionalEntity<MemberLogin> memberLoginAsLocalForeignOverTest) {
        _memberLoginAsLocalForeignOverTest = memberLoginAsLocalForeignOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignBindOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignBindOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignBindOverTest() {
        if (_memberLoginAsForeignForeignBindOverTest == null) { _memberLoginAsForeignForeignBindOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignBindOverTest"); }
        return _memberLoginAsForeignForeignBindOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * @param memberLoginAsForeignForeignBindOverTest The entity of foreign property 'memberLoginAsForeignForeignBindOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignBindOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignBindOverTest) {
        _memberLoginAsForeignForeignBindOverTest = memberLoginAsForeignForeignBindOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignEachOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignEachOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignEachOverTest() {
        if (_memberLoginAsForeignForeignEachOverTest == null) { _memberLoginAsForeignForeignEachOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignEachOverTest"); }
        return _memberLoginAsForeignForeignEachOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @param memberLoginAsForeignForeignEachOverTest The entity of foreign property 'memberLoginAsForeignForeignEachOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignEachOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignEachOverTest) {
        _memberLoginAsForeignForeignEachOverTest = memberLoginAsForeignForeignEachOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignOptimizedBasicOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedBasicOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        if (_memberLoginAsForeignForeignOptimizedBasicOverTest == null) { _memberLoginAsForeignForeignOptimizedBasicOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignOptimizedBasicOverTest"); }
        return _memberLoginAsForeignForeignOptimizedBasicOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @param memberLoginAsForeignForeignOptimizedBasicOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedBasicOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedBasicOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignOptimizedBasicOverTest) {
        _memberLoginAsForeignForeignOptimizedBasicOverTest = memberLoginAsForeignForeignOptimizedBasicOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignOptimizedMarkOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedMarkOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        if (_memberLoginAsForeignForeignOptimizedMarkOverTest == null) { _memberLoginAsForeignForeignOptimizedMarkOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignOptimizedMarkOverTest"); }
        return _memberLoginAsForeignForeignOptimizedMarkOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @param memberLoginAsForeignForeignOptimizedMarkOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedMarkOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedMarkOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignOptimizedMarkOverTest) {
        _memberLoginAsForeignForeignOptimizedMarkOverTest = memberLoginAsForeignForeignOptimizedMarkOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignOptimizedPartOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedPartOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_memberLoginAsForeignForeignOptimizedPartOverTest == null) { _memberLoginAsForeignForeignOptimizedPartOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignOptimizedPartOverTest"); }
        return _memberLoginAsForeignForeignOptimizedPartOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @param memberLoginAsForeignForeignOptimizedPartOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedPartOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedPartOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignOptimizedPartOverTest) {
        _memberLoginAsForeignForeignOptimizedPartOverTest = memberLoginAsForeignForeignOptimizedPartOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignOptimizedWholeOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedWholeOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        if (_memberLoginAsForeignForeignOptimizedWholeOverTest == null) { _memberLoginAsForeignForeignOptimizedWholeOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignOptimizedWholeOverTest"); }
        return _memberLoginAsForeignForeignOptimizedWholeOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @param memberLoginAsForeignForeignOptimizedWholeOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedWholeOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedWholeOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignOptimizedWholeOverTest) {
        _memberLoginAsForeignForeignOptimizedWholeOverTest = memberLoginAsForeignForeignOptimizedWholeOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignParameterOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignParameterOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignParameterOverTest() {
        if (_memberLoginAsForeignForeignParameterOverTest == null) { _memberLoginAsForeignForeignParameterOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignParameterOverTest"); }
        return _memberLoginAsForeignForeignParameterOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @param memberLoginAsForeignForeignParameterOverTest The entity of foreign property 'memberLoginAsForeignForeignParameterOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignParameterOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignParameterOverTest) {
        _memberLoginAsForeignForeignParameterOverTest = memberLoginAsForeignForeignParameterOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsForeignForeignVariousOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsForeignForeignVariousOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsForeignForeignVariousOverTest() {
        if (_memberLoginAsForeignForeignVariousOverTest == null) { _memberLoginAsForeignForeignVariousOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsForeignForeignVariousOverTest"); }
        return _memberLoginAsForeignForeignVariousOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @param memberLoginAsForeignForeignVariousOverTest The entity of foreign property 'memberLoginAsForeignForeignVariousOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignVariousOverTest(OptionalEntity<MemberLogin> memberLoginAsForeignForeignVariousOverTest) {
        _memberLoginAsForeignForeignVariousOverTest = memberLoginAsForeignForeignVariousOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsReferrerOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsReferrerOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsReferrerOverTest() {
        if (_memberLoginAsReferrerOverTest == null) { _memberLoginAsReferrerOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsReferrerOverTest"); }
        return _memberLoginAsReferrerOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @param memberLoginAsReferrerOverTest The entity of foreign property 'memberLoginAsReferrerOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsReferrerOverTest(OptionalEntity<MemberLogin> memberLoginAsReferrerOverTest) {
        _memberLoginAsReferrerOverTest = memberLoginAsReferrerOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsReferrerForeignOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsReferrerForeignOverTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsReferrerForeignOverTest() {
        if (_memberLoginAsReferrerForeignOverTest == null) { _memberLoginAsReferrerForeignOverTest = OptionalEntity.relationEmpty(this, "memberLoginAsReferrerForeignOverTest"); }
        return _memberLoginAsReferrerForeignOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @param memberLoginAsReferrerForeignOverTest The entity of foreign property 'memberLoginAsReferrerForeignOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsReferrerForeignOverTest(OptionalEntity<MemberLogin> memberLoginAsReferrerForeignOverTest) {
        _memberLoginAsReferrerForeignOverTest = memberLoginAsReferrerForeignOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsLatest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsLatest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsLatest() {
        if (_memberLoginAsLatest == null) { _memberLoginAsLatest = OptionalEntity.relationEmpty(this, "memberLoginAsLatest"); }
        return _memberLoginAsLatest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @param memberLoginAsLatest The entity of foreign property 'memberLoginAsLatest'. (NullAllowed)
     */
    public void setMemberLoginAsLatest(OptionalEntity<MemberLogin> memberLoginAsLatest) {
        _memberLoginAsLatest = memberLoginAsLatest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsOldest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsOldest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsOldest() {
        if (_memberLoginAsOldest == null) { _memberLoginAsOldest = OptionalEntity.relationEmpty(this, "memberLoginAsOldest"); }
        return _memberLoginAsOldest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * @param memberLoginAsOldest The entity of foreign property 'memberLoginAsOldest'. (NullAllowed)
     */
    public void setMemberLoginAsOldest(OptionalEntity<MemberLogin> memberLoginAsOldest) {
        _memberLoginAsOldest = memberLoginAsOldest;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'. */
    protected OptionalEntity<MemberAddress> _memberAddressAsFormattedBasic;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsFormattedBasic'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberAddress> getMemberAddressAsFormattedBasic() {
        if (_memberAddressAsFormattedBasic == null) { _memberAddressAsFormattedBasic = OptionalEntity.relationEmpty(this, "memberAddressAsFormattedBasic"); }
        return _memberAddressAsFormattedBasic;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @param memberAddressAsFormattedBasic The entity of foreign property 'memberAddressAsFormattedBasic'. (NullAllowed)
     */
    public void setMemberAddressAsFormattedBasic(OptionalEntity<MemberAddress> memberAddressAsFormattedBasic) {
        _memberAddressAsFormattedBasic = memberAddressAsFormattedBasic;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'. */
    protected OptionalEntity<MemberAddress> _memberAddressAsFormattedLong;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberAddressAsFormattedLong'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberAddress> getMemberAddressAsFormattedLong() {
        if (_memberAddressAsFormattedLong == null) { _memberAddressAsFormattedLong = OptionalEntity.relationEmpty(this, "memberAddressAsFormattedLong"); }
        return _memberAddressAsFormattedLong;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @param memberAddressAsFormattedLong The entity of foreign property 'memberAddressAsFormattedLong'. (NullAllowed)
     */
    public void setMemberAddressAsFormattedLong(OptionalEntity<MemberAddress> memberAddressAsFormattedLong) {
        _memberAddressAsFormattedLong = memberAddressAsFormattedLong;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsFormattedMany;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsFormattedMany'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsFormattedMany() {
        if (_memberLoginAsFormattedMany == null) { _memberLoginAsFormattedMany = OptionalEntity.relationEmpty(this, "memberLoginAsFormattedMany"); }
        return _memberLoginAsFormattedMany;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @param memberLoginAsFormattedMany The entity of foreign property 'memberLoginAsFormattedMany'. (NullAllowed)
     */
    public void setMemberLoginAsFormattedMany(OptionalEntity<MemberLogin> memberLoginAsFormattedMany) {
        _memberLoginAsFormattedMany = memberLoginAsFormattedMany;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'. */
    protected OptionalEntity<MemberLogin> _memberLoginAsEmbeddedCommentClassificationTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberLoginAsEmbeddedCommentClassificationTest'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberLogin> getMemberLoginAsEmbeddedCommentClassificationTest() {
        if (_memberLoginAsEmbeddedCommentClassificationTest == null) { _memberLoginAsEmbeddedCommentClassificationTest = OptionalEntity.relationEmpty(this, "memberLoginAsEmbeddedCommentClassificationTest"); }
        return _memberLoginAsEmbeddedCommentClassificationTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * @param memberLoginAsEmbeddedCommentClassificationTest The entity of foreign property 'memberLoginAsEmbeddedCommentClassificationTest'. (NullAllowed)
     */
    public void setMemberLoginAsEmbeddedCommentClassificationTest(OptionalEntity<MemberLogin> memberLoginAsEmbeddedCommentClassificationTest) {
        _memberLoginAsEmbeddedCommentClassificationTest = memberLoginAsEmbeddedCommentClassificationTest;
    }

    /** (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'. */
    protected OptionalEntity<MemberSecurity> _memberSecurityAsOne;

    /**
     * [get] (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<MemberSecurity> getMemberSecurityAsOne() {
        if (_memberSecurityAsOne == null) { _memberSecurityAsOne = OptionalEntity.relationEmpty(this, "memberSecurityAsOne"); }
        if (_memberSecurityAsOne.orElse(null) == null) { _memberSecurityAsOne = CachedMemberSecurity.get(getMemberId()); }
        return _memberSecurityAsOne;
    }

    /**
     * [set] (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed)
     */
    public void setMemberSecurityAsOne(OptionalEntity<MemberSecurity> memberSecurityAsOne) {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    /** (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'. */
    protected OptionalEntity<MemberService> _memberServiceAsOne;

    /**
     * [get] (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<MemberService> getMemberServiceAsOne() {
        if (_memberServiceAsOne == null) { _memberServiceAsOne = OptionalEntity.relationEmpty(this, "memberServiceAsOne"); }
        return _memberServiceAsOne;
    }

    /**
     * [set] (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @param memberServiceAsOne The entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed)
     */
    public void setMemberServiceAsOne(OptionalEntity<MemberService> memberServiceAsOne) {
        _memberServiceAsOne = memberServiceAsOne;
    }

    /** (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'. */
    protected OptionalEntity<MemberWithdrawal> _memberWithdrawalAsOne;

    /**
     * [get] (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<MemberWithdrawal> getMemberWithdrawalAsOne() {
        if (_memberWithdrawalAsOne == null) { _memberWithdrawalAsOne = OptionalEntity.relationEmpty(this, "memberWithdrawalAsOne"); }
        return _memberWithdrawalAsOne;
    }

    /**
     * [set] (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed)
     */
    public void setMemberWithdrawalAsOne(OptionalEntity<MemberWithdrawal> memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'. */
    protected List<MemberAddress> _memberAddressList;

    /**
     * [get] (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * [set] (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<MemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    /** (会員フォローイング)member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'. */
    protected List<MemberFollowing> _memberFollowingByMyMemberIdList;

    /**
     * [get] (会員フォローイング)member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberFollowing> getMemberFollowingByMyMemberIdList() {
        if (_memberFollowingByMyMemberIdList == null) { _memberFollowingByMyMemberIdList = newReferrerList(); }
        return _memberFollowingByMyMemberIdList;
    }

    /**
     * [set] (会員フォローイング)member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @param memberFollowingByMyMemberIdList The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NullAllowed)
     */
    public void setMemberFollowingByMyMemberIdList(List<MemberFollowing> memberFollowingByMyMemberIdList) {
        _memberFollowingByMyMemberIdList = memberFollowingByMyMemberIdList;
    }

    /** (会員フォローイング)member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'. */
    protected List<MemberFollowing> _memberFollowingByYourMemberIdList;

    /**
     * [get] (会員フォローイング)member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberFollowing> getMemberFollowingByYourMemberIdList() {
        if (_memberFollowingByYourMemberIdList == null) { _memberFollowingByYourMemberIdList = newReferrerList(); }
        return _memberFollowingByYourMemberIdList;
    }

    /**
     * [set] (会員フォローイング)member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @param memberFollowingByYourMemberIdList The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NullAllowed)
     */
    public void setMemberFollowingByYourMemberIdList(List<MemberFollowing> memberFollowingByYourMemberIdList) {
        _memberFollowingByYourMemberIdList = memberFollowingByYourMemberIdList;
    }

    /** (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * [get] (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** (購入)purchase by MEMBER_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] (購入)purchase by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)purchase by MEMBER_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMember) {
            BsMember other = (BsMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberAddressAsValid != null && _memberAddressAsValid.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsValid, "memberAddressAsValid")); }
        if (_memberAddressAsValidBefore != null && _memberAddressAsValidBefore.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsValidBefore, "memberAddressAsValidBefore")); }
        if (_memberLoginAsLoginStatus != null && _memberLoginAsLoginStatus.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsLoginStatus, "memberLoginAsLoginStatus")); }
        if (_memberAddressAsIfComment != null && _memberAddressAsIfComment.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsIfComment, "memberAddressAsIfComment")); }
        if (_memberAddressAsOnlyOneDate != null && _memberAddressAsOnlyOneDate.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsOnlyOneDate, "memberAddressAsOnlyOneDate")); }
        if (_memberLoginAsLocalBindOverTest != null && _memberLoginAsLocalBindOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsLocalBindOverTest, "memberLoginAsLocalBindOverTest")); }
        if (_memberLoginAsLocalForeignOverTest != null && _memberLoginAsLocalForeignOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsLocalForeignOverTest, "memberLoginAsLocalForeignOverTest")); }
        if (_memberLoginAsForeignForeignBindOverTest != null && _memberLoginAsForeignForeignBindOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignBindOverTest, "memberLoginAsForeignForeignBindOverTest")); }
        if (_memberLoginAsForeignForeignEachOverTest != null && _memberLoginAsForeignForeignEachOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignEachOverTest, "memberLoginAsForeignForeignEachOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedBasicOverTest != null && _memberLoginAsForeignForeignOptimizedBasicOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedBasicOverTest, "memberLoginAsForeignForeignOptimizedBasicOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedMarkOverTest != null && _memberLoginAsForeignForeignOptimizedMarkOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedMarkOverTest, "memberLoginAsForeignForeignOptimizedMarkOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedPartOverTest != null && _memberLoginAsForeignForeignOptimizedPartOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedPartOverTest, "memberLoginAsForeignForeignOptimizedPartOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedWholeOverTest != null && _memberLoginAsForeignForeignOptimizedWholeOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedWholeOverTest, "memberLoginAsForeignForeignOptimizedWholeOverTest")); }
        if (_memberLoginAsForeignForeignParameterOverTest != null && _memberLoginAsForeignForeignParameterOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignParameterOverTest, "memberLoginAsForeignForeignParameterOverTest")); }
        if (_memberLoginAsForeignForeignVariousOverTest != null && _memberLoginAsForeignForeignVariousOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignVariousOverTest, "memberLoginAsForeignForeignVariousOverTest")); }
        if (_memberLoginAsReferrerOverTest != null && _memberLoginAsReferrerOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsReferrerOverTest, "memberLoginAsReferrerOverTest")); }
        if (_memberLoginAsReferrerForeignOverTest != null && _memberLoginAsReferrerForeignOverTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsReferrerForeignOverTest, "memberLoginAsReferrerForeignOverTest")); }
        if (_memberLoginAsLatest != null && _memberLoginAsLatest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsLatest, "memberLoginAsLatest")); }
        if (_memberLoginAsOldest != null && _memberLoginAsOldest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsOldest, "memberLoginAsOldest")); }
        if (_memberAddressAsFormattedBasic != null && _memberAddressAsFormattedBasic.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsFormattedBasic, "memberAddressAsFormattedBasic")); }
        if (_memberAddressAsFormattedLong != null && _memberAddressAsFormattedLong.isPresent())
        { sb.append(li).append(xbRDS(_memberAddressAsFormattedLong, "memberAddressAsFormattedLong")); }
        if (_memberLoginAsFormattedMany != null && _memberLoginAsFormattedMany.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsFormattedMany, "memberLoginAsFormattedMany")); }
        if (_memberLoginAsEmbeddedCommentClassificationTest != null && _memberLoginAsEmbeddedCommentClassificationTest.isPresent())
        { sb.append(li).append(xbRDS(_memberLoginAsEmbeddedCommentClassificationTest, "memberLoginAsEmbeddedCommentClassificationTest")); }
        if (_memberSecurityAsOne != null && _memberSecurityAsOne.isPresent())
        { sb.append(li).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberServiceAsOne != null && _memberServiceAsOne.isPresent())
        { sb.append(li).append(xbRDS(_memberServiceAsOne, "memberServiceAsOne")); }
        if (_memberWithdrawalAsOne != null && _memberWithdrawalAsOne.isPresent())
        { sb.append(li).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        if (_memberAddressList != null) { for (MemberAddress et : _memberAddressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")); } } }
        if (_memberFollowingByMyMemberIdList != null) { for (MemberFollowing et : _memberFollowingByMyMemberIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberFollowingByMyMemberIdList")); } } }
        if (_memberFollowingByYourMemberIdList != null) { for (MemberFollowing et : _memberFollowingByYourMemberIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberFollowingByYourMemberIdList")); } } }
        if (_memberLoginList != null) { for (MemberLogin et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        if (_purchaseList != null) { for (Purchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_memberAccount));
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfND(_birthdate));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(dm).append("memberStatus"); }
        if (_memberAddressAsValid != null && _memberAddressAsValid.isPresent())
        { sb.append(dm).append("memberAddressAsValid"); }
        if (_memberAddressAsValidBefore != null && _memberAddressAsValidBefore.isPresent())
        { sb.append(dm).append("memberAddressAsValidBefore"); }
        if (_memberLoginAsLoginStatus != null && _memberLoginAsLoginStatus.isPresent())
        { sb.append(dm).append("memberLoginAsLoginStatus"); }
        if (_memberAddressAsIfComment != null && _memberAddressAsIfComment.isPresent())
        { sb.append(dm).append("memberAddressAsIfComment"); }
        if (_memberAddressAsOnlyOneDate != null && _memberAddressAsOnlyOneDate.isPresent())
        { sb.append(dm).append("memberAddressAsOnlyOneDate"); }
        if (_memberLoginAsLocalBindOverTest != null && _memberLoginAsLocalBindOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsLocalBindOverTest"); }
        if (_memberLoginAsLocalForeignOverTest != null && _memberLoginAsLocalForeignOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsLocalForeignOverTest"); }
        if (_memberLoginAsForeignForeignBindOverTest != null && _memberLoginAsForeignForeignBindOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignBindOverTest"); }
        if (_memberLoginAsForeignForeignEachOverTest != null && _memberLoginAsForeignForeignEachOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignEachOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedBasicOverTest != null && _memberLoginAsForeignForeignOptimizedBasicOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignOptimizedBasicOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedMarkOverTest != null && _memberLoginAsForeignForeignOptimizedMarkOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignOptimizedMarkOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedPartOverTest != null && _memberLoginAsForeignForeignOptimizedPartOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignOptimizedPartOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedWholeOverTest != null && _memberLoginAsForeignForeignOptimizedWholeOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignOptimizedWholeOverTest"); }
        if (_memberLoginAsForeignForeignParameterOverTest != null && _memberLoginAsForeignForeignParameterOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignParameterOverTest"); }
        if (_memberLoginAsForeignForeignVariousOverTest != null && _memberLoginAsForeignForeignVariousOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsForeignForeignVariousOverTest"); }
        if (_memberLoginAsReferrerOverTest != null && _memberLoginAsReferrerOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsReferrerOverTest"); }
        if (_memberLoginAsReferrerForeignOverTest != null && _memberLoginAsReferrerForeignOverTest.isPresent())
        { sb.append(dm).append("memberLoginAsReferrerForeignOverTest"); }
        if (_memberLoginAsLatest != null && _memberLoginAsLatest.isPresent())
        { sb.append(dm).append("memberLoginAsLatest"); }
        if (_memberLoginAsOldest != null && _memberLoginAsOldest.isPresent())
        { sb.append(dm).append("memberLoginAsOldest"); }
        if (_memberAddressAsFormattedBasic != null && _memberAddressAsFormattedBasic.isPresent())
        { sb.append(dm).append("memberAddressAsFormattedBasic"); }
        if (_memberAddressAsFormattedLong != null && _memberAddressAsFormattedLong.isPresent())
        { sb.append(dm).append("memberAddressAsFormattedLong"); }
        if (_memberLoginAsFormattedMany != null && _memberLoginAsFormattedMany.isPresent())
        { sb.append(dm).append("memberLoginAsFormattedMany"); }
        if (_memberLoginAsEmbeddedCommentClassificationTest != null && _memberLoginAsEmbeddedCommentClassificationTest.isPresent())
        { sb.append(dm).append("memberLoginAsEmbeddedCommentClassificationTest"); }
        if (_memberSecurityAsOne != null && _memberSecurityAsOne.isPresent())
        { sb.append(dm).append("memberSecurityAsOne"); }
        if (_memberServiceAsOne != null && _memberServiceAsOne.isPresent())
        { sb.append(dm).append("memberServiceAsOne"); }
        if (_memberWithdrawalAsOne != null && _memberWithdrawalAsOne.isPresent())
        { sb.append(dm).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(dm).append("memberAddressList"); }
        if (_memberFollowingByMyMemberIdList != null && !_memberFollowingByMyMemberIdList.isEmpty())
        { sb.append(dm).append("memberFollowingByMyMemberIdList"); }
        if (_memberFollowingByYourMemberIdList != null && !_memberFollowingByYourMemberIdList.isEmpty())
        { sb.append(dm).append("memberFollowingByYourMemberIdList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(dm).append("memberLoginList"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Member clone() {
        return (Member)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS} <br>
     * 会員を識別するID。連番として基本的に自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS} <br>
     * 会員を識別するID。連番として基本的に自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)} <br>
     * 会員のフルネームの名称。
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)} <br>
     * 会員のフルネームの名称。
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br>
     * 会員がログイン時に利用するアカウントNO。
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        checkSpecifiedProperty("memberAccount");
        return _memberAccount;
    }

    /**
     * [set] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br>
     * 会員がログイン時に利用するアカウントNO。
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        registerModifiedProperty("memberAccount");
        _memberAccount = memberAccount;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        checkClassificationCode("MEMBER_STATUS_CODE", CDef.DefMeta.MemberStatus, memberStatusCode);
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)} <br>
     * 会員が正式に確定した日時。一度確定したら更新されない。<br>
     * 仮会員のときはnull。
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)} <br>
     * 会員が正式に確定した日時。一度確定したら更新されない。<br>
     * 仮会員のときはnull。
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(10)} <br>
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(10)} <br>
     * 必須項目ではないので、このデータがない会員もいる。
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.time.LocalDate birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時。共通カラムの一つ。
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時。共通カラムの一つ。
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザ。共通カラムの一つ。
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザ。共通カラムの一つ。
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが（最後に）更新された日時。共通カラムの一つ。
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが（最後に）更新された日時。共通カラムの一つ。
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを更新したユーザ。
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを更新したユーザ。
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * レコードのバージョンを示すNO。<br>
     * 更新回数と等しく、主に排他制御のために利用される。
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * レコードのバージョンを示すNO。<br>
     * 更新回数と等しく、主に排他制御のために利用される。
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMemberStatusCode(String memberStatusCode) {
        setMemberStatusCode(memberStatusCode);
    }
}
