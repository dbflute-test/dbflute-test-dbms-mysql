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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_REF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _firstId;

    /** SECOND_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secondCode;

    /** REF_NAME: {NotNull, VARCHAR(200)} */
    protected String _refName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_split_multiple_fk_ref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_firstId == null) { return false; }
        if (_secondCode == null) { return false; }
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
        if (obj instanceof BsWhiteSplitMultipleFkRef) {
            BsWhiteSplitMultipleFkRef other = (BsWhiteSplitMultipleFkRef)obj;
            if (!xSV(_firstId, other._firstId)) { return false; }
            if (!xSV(_secondCode, other._secondCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _firstId);
        hs = xCH(hs, _secondCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_firstId));
        sb.append(dm).append(xfND(_secondCode));
        sb.append(dm).append(xfND(_refName));
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
    public WhiteSplitMultipleFkRef clone() {
        return (WhiteSplitMultipleFkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FIRST_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFirstId() {
        checkSpecifiedProperty("firstId");
        return _firstId;
    }

    /**
     * [set] FIRST_ID: {PK, NotNull, INT(10)} <br>
     * @param firstId The value of the column 'FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFirstId(Integer firstId) {
        registerModifiedProperty("firstId");
        _firstId = firstId;
    }

    /**
     * [get] SECOND_CODE: {PK, NotNull, CHAR(3)} <br>
     * @return The value of the column 'SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecondCode() {
        checkSpecifiedProperty("secondCode");
        return _secondCode;
    }

    /**
     * [set] SECOND_CODE: {PK, NotNull, CHAR(3)} <br>
     * @param secondCode The value of the column 'SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecondCode(String secondCode) {
        registerModifiedProperty("secondCode");
        _secondCode = secondCode;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefName() {
        checkSpecifiedProperty("refName");
        return _refName;
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param refName The value of the column 'REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefName(String refName) {
        registerModifiedProperty("refName");
        _refName = refName;
    }
}
