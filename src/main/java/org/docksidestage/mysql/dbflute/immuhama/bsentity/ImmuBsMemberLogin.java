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
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuDBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.immuhama.allcommon.ImmuCDef;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The entity of (会員ログイン)MEMBER_LOGIN as TABLE. <br>
 * ログインするたびに登録されるログイン履歴。<br>
 * 登録されたら更新されるも削除されることもない。さらには、登録する人もプログラムもはっきりしているので、(紙面の都合上もあって)ここでは共通カラムは省略している。
 * <pre>
 * [primary-key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_LOGIN_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CDEF_MEMBER_STATUS, MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     cdefMemberStatus, member
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberLoginId = entity.getMemberLoginId();
 * Integer memberId = entity.getMemberId();
 * java.time.LocalDateTime loginDatetime = entity.getLoginDatetime();
 * Integer mobileLoginFlg = entity.getMobileLoginFlg();
 * String loginMemberStatusCode = entity.getLoginMemberStatusCode();
 * entity.setMemberLoginId(memberLoginId);
 * entity.setMemberId(memberId);
 * entity.setLoginDatetime(loginDatetime);
 * entity.setMobileLoginFlg(mobileLoginFlg);
 * entity.setLoginMemberStatusCode(loginMemberStatusCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ImmuBsMemberLogin extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberLoginId;

    /** (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _loginDatetime;

    /** (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} */
    protected Integer _mobileLoginFlg;

    /** (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} */
    protected String _loginMemberStatusCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ImmuDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member_login";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberLoginId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, NotNull, INT(10), FK to member. (NotNull)
     * @param loginDatetime (ログイン日時): +UQ, IX, NotNull, DATETIME(19). (NotNull)
     */
    public void uniqueBy(Integer memberId, java.time.LocalDateTime loginDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("loginDatetime");
        setMemberId(memberId);setLoginDatetime(loginDatetime);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public ImmuCDef.Flg getMobileLoginFlgAsFlg() {
        return ImmuCDef.Flg.of(getMobileLoginFlg()).orElse(null);
    }

    /**
     * Set the value of mobileLoginFlg as the classification of Flg. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMobileLoginFlgAsFlg(ImmuCDef.Flg cdef) {
        setMobileLoginFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public ImmuCDef.MemberStatus getLoginMemberStatusCodeAsMemberStatus() {
        return ImmuCDef.MemberStatus.of(getLoginMemberStatusCode()).orElse(null);
    }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLoginMemberStatusCodeAsMemberStatus(ImmuCDef.MemberStatus cdef) {
        setLoginMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mobileLoginFlg as True (1). <br>
     * Yes: means valid
     */
    public void setMobileLoginFlg_True() {
        setMobileLoginFlgAsFlg(ImmuCDef.Flg.True);
    }

    /**
     * Set the value of mobileLoginFlg as False (0). <br>
     * No: means invalid
     */
    public void setMobileLoginFlg_False() {
        setMobileLoginFlgAsFlg(ImmuCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgTrue() {
        ImmuCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(ImmuCDef.Flg.True) : false;
    }

    /**
     * Is the value of mobileLoginFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgFalse() {
        ImmuCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(ImmuCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'mobileLoginFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMobileLoginFlgName() {
        ImmuCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mobileLoginFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getMobileLoginFlgAlias() {
        ImmuCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ([区分値]会員ステータス)CDEF_MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'cdefMemberStatus'. */
    protected OptionalEntity<ImmuCdefMemberStatus> _cdefMemberStatus;

    /**
     * [get] ([区分値]会員ステータス)CDEF_MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'cdefMemberStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'cdefMemberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ImmuCdefMemberStatus> getCdefMemberStatus() {
        if (_cdefMemberStatus == null) { _cdefMemberStatus = OptionalEntity.relationEmpty(this, "cdefMemberStatus"); }
        return _cdefMemberStatus;
    }

    /**
     * [set] ([区分値]会員ステータス)CDEF_MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'cdefMemberStatus'.
     * @param cdefMemberStatus The entity of foreign property 'cdefMemberStatus'. (NullAllowed)
     */
    public void setCdefMemberStatus(OptionalEntity<ImmuCdefMemberStatus> cdefMemberStatus) {
        _cdefMemberStatus = cdefMemberStatus;
    }

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
        if (obj instanceof ImmuBsMemberLogin) {
            ImmuBsMemberLogin other = (ImmuBsMemberLogin)obj;
            if (!xSV(_memberLoginId, other._memberLoginId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberLoginId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_cdefMemberStatus != null && _cdefMemberStatus.isPresent())
        { sb.append(li).append(xbRDS(_cdefMemberStatus, "cdefMemberStatus")); }
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberLoginId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_loginDatetime));
        sb.append(dm).append(xfND(_mobileLoginFlg));
        sb.append(dm).append(xfND(_loginMemberStatusCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_cdefMemberStatus != null && _cdefMemberStatus.isPresent())
        { sb.append(dm).append("cdefMemberStatus"); }
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ImmuMemberLogin clone() {
        return (ImmuMemberLogin)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberLoginId() {
        checkSpecifiedProperty("memberLoginId");
        return _memberLoginId;
    }

    /**
     * [set] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberLoginId(Long memberLoginId) {
        registerModifiedProperty("memberLoginId");
        _memberLoginId = memberLoginId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)} <br>
     * ログインした瞬間の日時。<br>
     * 同じ会員が同じ日時にログインはできない。(ユニーク制約で重複ログインできないようにしてある)
     * @return The value of the column 'LOGIN_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getLoginDatetime() {
        checkSpecifiedProperty("loginDatetime");
        return _loginDatetime;
    }

    /**
     * [set] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)} <br>
     * ログインした瞬間の日時。<br>
     * 同じ会員が同じ日時にログインはできない。(ユニーク制約で重複ログインできないようにしてある)
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setLoginDatetime(java.time.LocalDateTime loginDatetime) {
        registerModifiedProperty("loginDatetime");
        _loginDatetime = loginDatetime;
    }

    /**
     * [get] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * モバイル機器からのログインか否か。
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMobileLoginFlg() {
        checkSpecifiedProperty("mobileLoginFlg");
        return _mobileLoginFlg;
    }

    /**
     * [set] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * モバイル機器からのログインか否か。
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setMobileLoginFlg(Integer mobileLoginFlg) {
        checkClassificationCode("MOBILE_LOGIN_FLG", ImmuCDef.DefMeta.Flg, mobileLoginFlg);
        registerModifiedProperty("mobileLoginFlg");
        _mobileLoginFlg = mobileLoginFlg;
    }

    /**
     * [get] (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * ログイン時の会員ステータス
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginMemberStatusCode() {
        checkSpecifiedProperty("loginMemberStatusCode");
        return _loginMemberStatusCode;
    }

    /**
     * [set] (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to cdef_member_status, classification=MemberStatus} <br>
     * ログイン時の会員ステータス
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setLoginMemberStatusCode(String loginMemberStatusCode) {
        checkClassificationCode("LOGIN_MEMBER_STATUS_CODE", ImmuCDef.DefMeta.MemberStatus, loginMemberStatusCode);
        registerModifiedProperty("loginMemberStatusCode");
        _loginMemberStatusCode = loginMemberStatusCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMobileLoginFlg(Integer mobileLoginFlg) {
        setMobileLoginFlg(mobileLoginFlg);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingLoginMemberStatusCode(String loginMemberStatusCode) {
        setLoginMemberStatusCode(loginMemberStatusCode);
    }
}
