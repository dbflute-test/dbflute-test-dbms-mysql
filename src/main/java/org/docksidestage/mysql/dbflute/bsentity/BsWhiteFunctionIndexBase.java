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
 * The entity of WHITE_FUNCTION_INDEX_BASE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteFunctionIndexBase extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _indexBaseId;

    /** INDEX_BASE_NAME: {NotNull, VARCHAR(200)} */
    protected String _indexBaseName;

    /** INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)} */
    protected Integer _indexBaseNumberFirst;

    /** INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)} */
    protected Integer _indexBaseNumberSecond;

    /** INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _indexBaseDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_function_index_base";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_indexBaseId == null) { return false; }
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
        if (obj instanceof BsWhiteFunctionIndexBase) {
            BsWhiteFunctionIndexBase other = (BsWhiteFunctionIndexBase)obj;
            if (!xSV(_indexBaseId, other._indexBaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _indexBaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_indexBaseId));
        sb.append(dm).append(xfND(_indexBaseName));
        sb.append(dm).append(xfND(_indexBaseNumberFirst));
        sb.append(dm).append(xfND(_indexBaseNumberSecond));
        sb.append(dm).append(xfND(_indexBaseDatetime));
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
    public WhiteFunctionIndexBase clone() {
        return (WhiteFunctionIndexBase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'INDEX_BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getIndexBaseId() {
        checkSpecifiedProperty("indexBaseId");
        return _indexBaseId;
    }

    /**
     * [set] INDEX_BASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param indexBaseId The value of the column 'INDEX_BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setIndexBaseId(Long indexBaseId) {
        registerModifiedProperty("indexBaseId");
        _indexBaseId = indexBaseId;
    }

    /**
     * [get] INDEX_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'INDEX_BASE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getIndexBaseName() {
        checkSpecifiedProperty("indexBaseName");
        return _indexBaseName;
    }

    /**
     * [set] INDEX_BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param indexBaseName The value of the column 'INDEX_BASE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setIndexBaseName(String indexBaseName) {
        registerModifiedProperty("indexBaseName");
        _indexBaseName = indexBaseName;
    }

    /**
     * [get] INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)} <br>
     * @return The value of the column 'INDEX_BASE_NUMBER_FIRST'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIndexBaseNumberFirst() {
        checkSpecifiedProperty("indexBaseNumberFirst");
        return _indexBaseNumberFirst;
    }

    /**
     * [set] INDEX_BASE_NUMBER_FIRST: {NotNull, INT(10)} <br>
     * @param indexBaseNumberFirst The value of the column 'INDEX_BASE_NUMBER_FIRST'. (basically NotNull if update: for the constraint)
     */
    public void setIndexBaseNumberFirst(Integer indexBaseNumberFirst) {
        registerModifiedProperty("indexBaseNumberFirst");
        _indexBaseNumberFirst = indexBaseNumberFirst;
    }

    /**
     * [get] INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)} <br>
     * @return The value of the column 'INDEX_BASE_NUMBER_SECOND'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIndexBaseNumberSecond() {
        checkSpecifiedProperty("indexBaseNumberSecond");
        return _indexBaseNumberSecond;
    }

    /**
     * [set] INDEX_BASE_NUMBER_SECOND: {NotNull, INT(10)} <br>
     * @param indexBaseNumberSecond The value of the column 'INDEX_BASE_NUMBER_SECOND'. (basically NotNull if update: for the constraint)
     */
    public void setIndexBaseNumberSecond(Integer indexBaseNumberSecond) {
        registerModifiedProperty("indexBaseNumberSecond");
        _indexBaseNumberSecond = indexBaseNumberSecond;
    }

    /**
     * [get] INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * @return The value of the column 'INDEX_BASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getIndexBaseDatetime() {
        checkSpecifiedProperty("indexBaseDatetime");
        return _indexBaseDatetime;
    }

    /**
     * [set] INDEX_BASE_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * @param indexBaseDatetime The value of the column 'INDEX_BASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setIndexBaseDatetime(java.time.LocalDateTime indexBaseDatetime) {
        registerModifiedProperty("indexBaseDatetime");
        _indexBaseDatetime = indexBaseDatetime;
    }
}
