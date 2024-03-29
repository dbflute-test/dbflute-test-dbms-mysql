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
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_NO_PK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNoPk extends AbstractEntity implements DomainEntity {

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

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_no_pk";
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
        if (obj instanceof BsWhiteNoPk) {
            BsWhiteNoPk other = (BsWhiteNoPk)obj;
            if (!xSV(_noPkId, other._noPkId)) { return false; }
            if (!xSV(_noPkName, other._noPkName)) { return false; }
            if (!xSV(_noPkInteger, other._noPkInteger)) { return false; }
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
    public WhiteNoPk clone() {
        return (WhiteNoPk)super.clone();
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
}
