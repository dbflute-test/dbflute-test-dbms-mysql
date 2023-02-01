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
 * The entity of WHITE_LARGE_TEXT_FILE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteLargeTextFile extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _largeTextFileId;

    /** LARGE_TEXT_FILE_TEXT: {TEXT(65535)} */
    protected String _largeTextFileText;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_large_text_file";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_largeTextFileId == null) { return false; }
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
        if (obj instanceof BsWhiteLargeTextFile) {
            BsWhiteLargeTextFile other = (BsWhiteLargeTextFile)obj;
            if (!xSV(_largeTextFileId, other._largeTextFileId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _largeTextFileId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_largeTextFileId));
        sb.append(dm).append(xfND(_largeTextFileText));
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
    public WhiteLargeTextFile clone() {
        return (WhiteLargeTextFile)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'LARGE_TEXT_FILE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeTextFileId() {
        checkSpecifiedProperty("largeTextFileId");
        return _largeTextFileId;
    }

    /**
     * [set] LARGE_TEXT_FILE_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param largeTextFileId The value of the column 'LARGE_TEXT_FILE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeTextFileId(Long largeTextFileId) {
        registerModifiedProperty("largeTextFileId");
        _largeTextFileId = largeTextFileId;
    }

    /**
     * [get] LARGE_TEXT_FILE_TEXT: {TEXT(65535)} <br>
     * @return The value of the column 'LARGE_TEXT_FILE_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLargeTextFileText() {
        checkSpecifiedProperty("largeTextFileText");
        return _largeTextFileText;
    }

    /**
     * [set] LARGE_TEXT_FILE_TEXT: {TEXT(65535)} <br>
     * @param largeTextFileText The value of the column 'LARGE_TEXT_FILE_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeTextFileText(String largeTextFileText) {
        registerModifiedProperty("largeTextFileText");
        _largeTextFileText = largeTextFileText;
    }
}
