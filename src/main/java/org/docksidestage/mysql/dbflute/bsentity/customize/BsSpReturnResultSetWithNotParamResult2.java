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
package org.docksidestage.mysql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.customize.*;

/**
 * The entity of SpReturnResultSetWithNotParamResult2.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSpReturnResultSetWithNotParamResult2 extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to member_status.MEMBER_STATUS_CODE, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME} */
    protected String _memberStatusName;

    /** (説明)DESCRIPTION: {VARCHAR(200), refers to member_status.DESCRIPTION} */
    protected String _description;

    /** (表示順)DISPLAY_ORDER: {INT(11), refers to member_status.DISPLAY_ORDER} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.mysql.dbflute.bsentity.customize.dbmeta.SpReturnResultSetWithNotParamResult2Dbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SpReturnResultSetWithNotParamResult2";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to member_status.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * 会員ステータス: 会員の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.of(getMemberStatusCode()).orElse(null);
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to member_status.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
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
        if (obj instanceof BsSpReturnResultSetWithNotParamResult2) {
            BsSpReturnResultSetWithNotParamResult2 other = (BsSpReturnResultSetWithNotParamResult2)obj;
            if (!xSV(_memberStatusCode, other._memberStatusCode)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
            if (!xSV(_description, other._description)) { return false; }
            if (!xSV(_displayOrder, other._displayOrder)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberStatusCode);
        hs = xCH(hs, _memberStatusName);
        hs = xCH(hs, _description);
        hs = xCH(hs, _displayOrder);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberStatusCode));
        sb.append(dm).append(xfND(_memberStatusName));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SpReturnResultSetWithNotParamResult2 clone() {
        return (SpReturnResultSetWithNotParamResult2)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to member_status.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * 会員ステータスを識別するコード。
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to member_status.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * 会員ステータスを識別するコード。
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        checkClassificationCode("MEMBER_STATUS_CODE", CDef.DefMeta.MemberStatus, memberStatusCode);
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] (説明)DESCRIPTION: {VARCHAR(200), refers to member_status.DESCRIPTION} <br>
     * 会員ステータスそれぞれの説明。<br>
     * 気の利いた説明があるとディベロッパーがとても助かる。
     * @return The value of the column 'DESCRIPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] (説明)DESCRIPTION: {VARCHAR(200), refers to member_status.DESCRIPTION} <br>
     * 会員ステータスそれぞれの説明。<br>
     * 気の利いた説明があるとディベロッパーがとても助かる。
     * @param description The value of the column 'DESCRIPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {INT(11), refers to member_status.DISPLAY_ORDER} <br>
     * UI上のステータスの表示順を示すNO。<br>
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {INT(11), refers to member_status.DISPLAY_ORDER} <br>
     * UI上のステータスの表示順を示すNO。<br>
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingMemberStatusCode(String memberStatusCode) {
        setMemberStatusCode(memberStatusCode);
    }
}
