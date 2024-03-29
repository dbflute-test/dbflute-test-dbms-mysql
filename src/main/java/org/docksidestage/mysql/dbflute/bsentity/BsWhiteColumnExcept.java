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
 * The entity of WHITE_COLUMN_EXCEPT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteColumnExcept extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _exceptColumnId;

    /** COLUMN_EXCEPT_TEST: {INT(10)} */
    protected Integer _columnExceptTest;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_column_except";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_exceptColumnId == null) { return false; }
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
        if (obj instanceof BsWhiteColumnExcept) {
            BsWhiteColumnExcept other = (BsWhiteColumnExcept)obj;
            if (!xSV(_exceptColumnId, other._exceptColumnId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _exceptColumnId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_exceptColumnId));
        sb.append(dm).append(xfND(_columnExceptTest));
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
    public WhiteColumnExcept clone() {
        return (WhiteColumnExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'EXCEPT_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptColumnId() {
        checkSpecifiedProperty("exceptColumnId");
        return _exceptColumnId;
    }

    /**
     * [set] EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param exceptColumnId The value of the column 'EXCEPT_COLUMN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptColumnId(Long exceptColumnId) {
        registerModifiedProperty("exceptColumnId");
        _exceptColumnId = exceptColumnId;
    }

    /**
     * [get] COLUMN_EXCEPT_TEST: {INT(10)} <br>
     * @return The value of the column 'COLUMN_EXCEPT_TEST'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getColumnExceptTest() {
        checkSpecifiedProperty("columnExceptTest");
        return _columnExceptTest;
    }

    /**
     * [set] COLUMN_EXCEPT_TEST: {INT(10)} <br>
     * @param columnExceptTest The value of the column 'COLUMN_EXCEPT_TEST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColumnExceptTest(Integer columnExceptTest) {
        registerModifiedProperty("columnExceptTest");
        _columnExceptTest = columnExceptTest;
    }
}
