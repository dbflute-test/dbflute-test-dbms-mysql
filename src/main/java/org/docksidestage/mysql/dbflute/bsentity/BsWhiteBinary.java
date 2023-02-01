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
 * The entity of WHITE_BINARY as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBinary extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BINARY_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _binaryId;

    /** BINARY_DATA: {BINARY(1)} */
    protected byte[] _binaryData;

    /** BLOB_DATA: {BLOB(65535)} */
    protected byte[] _blobData;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_binary";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_binaryId == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteBinary) {
            BsWhiteBinary other = (BsWhiteBinary)obj;
            if (!xSV(_binaryId, other._binaryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _binaryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_binaryId));
        sb.append(dm).append(xfBA(_binaryData));
        sb.append(dm).append(xfBA(_blobData));
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
    public WhiteBinary clone() {
        return (WhiteBinary)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BINARY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'BINARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBinaryId() {
        checkSpecifiedProperty("binaryId");
        return _binaryId;
    }

    /**
     * [set] BINARY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param binaryId The value of the column 'BINARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBinaryId(Long binaryId) {
        registerModifiedProperty("binaryId");
        _binaryId = binaryId;
    }

    /**
     * [get] BINARY_DATA: {BINARY(1)} <br>
     * @return The value of the column 'BINARY_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getBinaryData() {
        checkSpecifiedProperty("binaryData");
        return _binaryData;
    }

    /**
     * [set] BINARY_DATA: {BINARY(1)} <br>
     * @param binaryData The value of the column 'BINARY_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBinaryData(byte[] binaryData) {
        registerModifiedProperty("binaryData");
        _binaryData = binaryData;
    }

    /**
     * [get] BLOB_DATA: {BLOB(65535)} <br>
     * @return The value of the column 'BLOB_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getBlobData() {
        checkSpecifiedProperty("blobData");
        return _blobData;
    }

    /**
     * [set] BLOB_DATA: {BLOB(65535)} <br>
     * @param blobData The value of the column 'BLOB_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlobData(byte[] blobData) {
        registerModifiedProperty("blobData");
        _blobData = blobData;
    }
}
