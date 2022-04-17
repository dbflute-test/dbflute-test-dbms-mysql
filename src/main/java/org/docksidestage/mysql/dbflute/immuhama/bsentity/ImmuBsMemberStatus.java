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
package org.docksidestage.mysql.dbflute.immuhama.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuEntityDefinedCommonColumn;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuDBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuCDef;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The entity of (会員ステータス)MEMBER_STATUS as TABLE. <br>
 * 会員のプロフィールやアカウントなどの基本情報を保持する。<br>
 * 基本的に物理削除はなく、退会したらステータスが退会会員になる。<br>
 * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_ID
 *
 * [column]
 *     MEMBER_STATUS_ID, MEMBER_ID, MEMBER_STATUS_CODE, MEMBER_STATUS_UPDATE_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_STATUS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER, CDEF_MEMBER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, cdefMemberStatus
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberStatusId = entity.getMemberStatusId();
 * Integer memberId = entity.getMemberId();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.time.LocalDateTime memberStatusUpdateDatetime = entity.getMemberStatusUpdateDatetime();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setMemberStatusId(memberStatusId);
 * entity.setMemberId(memberId);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusUpdateDatetime(memberStatusUpdateDatetime);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsMemberStatus extends AbstractEntity implements DomainEntity, ImmuEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ステータスID)MEMBER_STATUS_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberStatusId;

    /** (会員ID)MEMBER_ID: {IX, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (会員ステータス更新日時)MEMBER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _memberStatusUpdateDatetime;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ImmuDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member_status";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberStatusId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public ImmuCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return ImmuCDef.MemberStatus.of(getMemberStatusCode()).orElse(null);
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(ImmuCDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<ImmuMember> _member;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuMember> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<ImmuMember> member) {
        _member = member;
    }

    /** ([区分値]会員ステータス)CDEF_MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'cdefMemberStatus'. */
    protected OptionalEntity<ImmuCdefMemberStatus> _cdefMemberStatus;

    /**
     * [get] ([区分値]会員ステータス)CDEF_MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'cdefMemberStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cdefMemberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuCdefMemberStatus> getCdefMemberStatus() {
        if (_cdefMemberStatus == null) { _cdefMemberStatus = OptionalEntity.relationEmpty(this, "cdefMemberStatus"); }
        return _cdefMemberStatus;
    }

    /**
     * [set] ([区分値]会員ステータス)CDEF_MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'cdefMemberStatus'.
     * @param cdefMemberStatus The entity of foreign property 'cdefMemberStatus'. (NullAllowed)
     */
    public void setCdefMemberStatus(OptionalEntity<ImmuCdefMemberStatus> cdefMemberStatus) {
        _cdefMemberStatus = cdefMemberStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof ImmuBsMemberStatus) {
            ImmuBsMemberStatus other = (ImmuBsMemberStatus)obj;
            if (!xSV(_memberStatusId, other._memberStatusId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberStatusId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_cdefMemberStatus != null && _cdefMemberStatus.isPresent())
        { sb.append(li).append(xbRDS(_cdefMemberStatus, "cdefMemberStatus")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberStatusId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_memberStatusUpdateDatetime));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_cdefMemberStatus != null && _cdefMemberStatus.isPresent())
        { sb.append(dm).append("cdefMemberStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ImmuMemberStatus clone() {
        return (ImmuMemberStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ステータスID)MEMBER_STATUS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'MEMBER_STATUS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberStatusId() {
        checkSpecifiedProperty("memberStatusId");
        return _memberStatusId;
    }

    /**
     * [set] (会員ステータスID)MEMBER_STATUS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param memberStatusId The value of the column 'MEMBER_STATUS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusId(Long memberStatusId) {
        registerModifiedProperty("memberStatusId");
        _memberStatusId = memberStatusId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * 会員ステータスを識別するコード。<br>
     * 固定的なデータなので連番とか番号にはせず、データを直接見たときも人が直感的にわかるように、例えば "FML" とかの３桁のコード形式にしている。(3って何会員だっけ？とかの問答をやりたくないので)
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * 会員ステータスを識別するコード。<br>
     * 固定的なデータなので連番とか番号にはせず、データを直接見たときも人が直感的にわかるように、例えば "FML" とかの３桁のコード形式にしている。(3って何会員だっけ？とかの問答をやりたくないので)
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        checkClassificationCode("MEMBER_STATUS_CODE", ImmuCDef.DefMeta.MemberStatus, memberStatusCode);
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス更新日時)MEMBER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'MEMBER_STATUS_UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getMemberStatusUpdateDatetime() {
        checkSpecifiedProperty("memberStatusUpdateDatetime");
        return _memberStatusUpdateDatetime;
    }

    /**
     * [set] (会員ステータス更新日時)MEMBER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param memberStatusUpdateDatetime The value of the column 'MEMBER_STATUS_UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusUpdateDatetime(java.time.LocalDateTime memberStatusUpdateDatetime) {
        registerModifiedProperty("memberStatusUpdateDatetime");
        _memberStatusUpdateDatetime = memberStatusUpdateDatetime;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMemberStatusCode(String memberStatusCode) {
        setMemberStatusCode(memberStatusCode);
    }
}
