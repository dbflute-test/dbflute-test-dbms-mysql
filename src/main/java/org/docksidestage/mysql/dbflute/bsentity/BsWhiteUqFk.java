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
 * The entity of WHITE_UQ_FK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** UQ_FK_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqFkId;

    /** UQ_FK_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _uqFkCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_uq_fk";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_uqFkId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uqFkCode : UQ, NotNull, CHAR(3). (NotNull)
     */
    public void uniqueBy(String uqFkCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uqFkCode");
        setUqFkCode(uqFkCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'. */
    protected List<WhiteUqFkRef> _whiteUqFkRefByFkToPkIdList;

    /**
     * [get] WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @return The entity list of referrer property 'whiteUqFkRefByFkToPkIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRef> getWhiteUqFkRefByFkToPkIdList() {
        if (_whiteUqFkRefByFkToPkIdList == null) { _whiteUqFkRefByFkToPkIdList = newReferrerList(); }
        return _whiteUqFkRefByFkToPkIdList;
    }

    /**
     * [set] WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @param whiteUqFkRefByFkToPkIdList The entity list of referrer property 'whiteUqFkRefByFkToPkIdList'. (NullAllowed)
     */
    public void setWhiteUqFkRefByFkToPkIdList(List<WhiteUqFkRef> whiteUqFkRefByFkToPkIdList) {
        _whiteUqFkRefByFkToPkIdList = whiteUqFkRefByFkToPkIdList;
    }

    /** WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'. */
    protected List<WhiteUqFkRef> _whiteUqFkRefByFkToUqCodeList;

    /**
     * [get] WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @return The entity list of referrer property 'whiteUqFkRefByFkToUqCodeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRef> getWhiteUqFkRefByFkToUqCodeList() {
        if (_whiteUqFkRefByFkToUqCodeList == null) { _whiteUqFkRefByFkToUqCodeList = newReferrerList(); }
        return _whiteUqFkRefByFkToUqCodeList;
    }

    /**
     * [set] WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @param whiteUqFkRefByFkToUqCodeList The entity list of referrer property 'whiteUqFkRefByFkToUqCodeList'. (NullAllowed)
     */
    public void setWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFkRef> whiteUqFkRefByFkToUqCodeList) {
        _whiteUqFkRefByFkToUqCodeList = whiteUqFkRefByFkToUqCodeList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteUqFk) {
            BsWhiteUqFk other = (BsWhiteUqFk)obj;
            if (!xSV(_uqFkId, other._uqFkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _uqFkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkRefByFkToPkIdList != null) { for (WhiteUqFkRef et : _whiteUqFkRefByFkToPkIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkRefByFkToPkIdList")); } } }
        if (_whiteUqFkRefByFkToUqCodeList != null) { for (WhiteUqFkRef et : _whiteUqFkRefByFkToUqCodeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkRefByFkToUqCodeList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkId));
        sb.append(dm).append(xfND(_uqFkCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkRefByFkToPkIdList != null && !_whiteUqFkRefByFkToPkIdList.isEmpty())
        { sb.append(dm).append("whiteUqFkRefByFkToPkIdList"); }
        if (_whiteUqFkRefByFkToUqCodeList != null && !_whiteUqFkRefByFkToUqCodeList.isEmpty())
        { sb.append(dm).append("whiteUqFkRefByFkToUqCodeList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFk clone() {
        return (WhiteUqFk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'UQ_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkId() {
        checkSpecifiedProperty("uqFkId");
        return _uqFkId;
    }

    /**
     * [set] UQ_FK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param uqFkId The value of the column 'UQ_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkId(Long uqFkId) {
        registerModifiedProperty("uqFkId");
        _uqFkId = uqFkId;
    }

    /**
     * [get] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br>
     * @return The value of the column 'UQ_FK_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqFkCode() {
        checkSpecifiedProperty("uqFkCode");
        return _uqFkCode;
    }

    /**
     * [set] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br>
     * @param uqFkCode The value of the column 'UQ_FK_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkCode(String uqFkCode) {
        registerModifiedProperty("uqFkCode");
        _uqFkCode = uqFkCode;
    }
}
