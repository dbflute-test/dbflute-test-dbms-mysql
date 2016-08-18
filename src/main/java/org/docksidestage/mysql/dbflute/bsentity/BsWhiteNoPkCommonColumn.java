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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.mysql.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_NO_PK_COMMON_COLUMN as TABLE. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     NO_PK_ID, NO_PK_NAME, NO_PK_INTEGER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long noPkId = entity.getNoPkId();
 * String noPkName = entity.getNoPkName();
 * Integer noPkInteger = entity.getNoPkInteger();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setNoPkId(noPkId);
 * entity.setNoPkName(noPkName);
 * entity.setNoPkInteger(noPkInteger);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNoPkCommonColumn extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NO_PK_ID: {NotNull, DECIMAL(16)} */
    protected Long _noPkId;

    /** NO_PK_NAME: {VARCHAR(32)} */
    protected String _noPkName;

    /** NO_PK_INTEGER: {INT(10)} */
    protected Integer _noPkInteger;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} */
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
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_no_pk_common_column";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsWhiteNoPkCommonColumn) {
            BsWhiteNoPkCommonColumn other = (BsWhiteNoPkCommonColumn)obj;
            if (!xSV(_noPkId, other._noPkId)) { return false; }
            if (!xSV(_noPkName, other._noPkName)) { return false; }
            if (!xSV(_noPkInteger, other._noPkInteger)) { return false; }
            if (!xSV(_registerDatetime, other._registerDatetime)) { return false; }
            if (!xSV(_registerUser, other._registerUser)) { return false; }
            if (!xSV(_updateDatetime, other._updateDatetime)) { return false; }
            if (!xSV(_updateUser, other._updateUser)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _noPkId);
        hs = xCH(hs, _noPkName);
        hs = xCH(hs, _noPkInteger);
        hs = xCH(hs, _registerDatetime);
        hs = xCH(hs, _registerUser);
        hs = xCH(hs, _updateDatetime);
        hs = xCH(hs, _updateUser);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_noPkId));
        sb.append(dm).append(xfND(_noPkName));
        sb.append(dm).append(xfND(_noPkInteger));
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
        return "";
    }

    @Override
    public WhiteNoPkCommonColumn clone() {
        return (WhiteNoPkCommonColumn)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NO_PK_ID: {NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'NO_PK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNoPkId() {
        checkSpecifiedProperty("noPkId");
        return _noPkId;
    }

    /**
     * [set] NO_PK_ID: {NotNull, DECIMAL(16)} <br>
     * @param noPkId The value of the column 'NO_PK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNoPkId(Long noPkId) {
        registerModifiedProperty("noPkId");
        _noPkId = noPkId;
    }

    /**
     * [get] NO_PK_NAME: {VARCHAR(32)} <br>
     * @return The value of the column 'NO_PK_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoPkName() {
        checkSpecifiedProperty("noPkName");
        return _noPkName;
    }

    /**
     * [set] NO_PK_NAME: {VARCHAR(32)} <br>
     * @param noPkName The value of the column 'NO_PK_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoPkName(String noPkName) {
        registerModifiedProperty("noPkName");
        _noPkName = noPkName;
    }

    /**
     * [get] NO_PK_INTEGER: {INT(10)} <br>
     * @return The value of the column 'NO_PK_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNoPkInteger() {
        checkSpecifiedProperty("noPkInteger");
        return _noPkInteger;
    }

    /**
     * [set] NO_PK_INTEGER: {INT(10)} <br>
     * @param noPkInteger The value of the column 'NO_PK_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoPkInteger(Integer noPkInteger) {
        registerModifiedProperty("noPkInteger");
        _noPkInteger = noPkInteger;
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
}
