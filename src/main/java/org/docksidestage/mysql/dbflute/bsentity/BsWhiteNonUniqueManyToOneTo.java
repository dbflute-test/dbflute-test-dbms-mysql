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
 * The entity of WHITE_NON_UNIQUE_MANY_TO_ONE_TO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TO_ID
 *
 * [column]
 *     TO_ID, TO_NAME, NON_UNIQUE_CODE, BEGIN_DATE, END_DATE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TO_ID
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
 * Long toId = entity.getToId();
 * String toName = entity.getToName();
 * String nonUniqueCode = entity.getNonUniqueCode();
 * java.time.LocalDate beginDate = entity.getBeginDate();
 * java.time.LocalDate endDate = entity.getEndDate();
 * entity.setToId(toId);
 * entity.setToName(toName);
 * entity.setNonUniqueCode(nonUniqueCode);
 * entity.setBeginDate(beginDate);
 * entity.setEndDate(endDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNonUniqueManyToOneTo extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TO_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _toId;

    /** TO_NAME: {NotNull, VARCHAR(200)} */
    protected String _toName;

    /** NON_UNIQUE_CODE: {NotNull, CHAR(3)} */
    protected String _nonUniqueCode;

    /** BEGIN_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _beginDate;

    /** END_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _endDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_non_unique_many_to_one_to";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_toId == null) { return false; }
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
        if (obj instanceof BsWhiteNonUniqueManyToOneTo) {
            BsWhiteNonUniqueManyToOneTo other = (BsWhiteNonUniqueManyToOneTo)obj;
            if (!xSV(_toId, other._toId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _toId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_toId));
        sb.append(dm).append(xfND(_toName));
        sb.append(dm).append(xfND(_nonUniqueCode));
        sb.append(dm).append(xfND(_beginDate));
        sb.append(dm).append(xfND(_endDate));
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
    public WhiteNonUniqueManyToOneTo clone() {
        return (WhiteNonUniqueManyToOneTo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TO_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getToId() {
        checkSpecifiedProperty("toId");
        return _toId;
    }

    /**
     * [set] TO_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param toId The value of the column 'TO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setToId(Long toId) {
        registerModifiedProperty("toId");
        _toId = toId;
    }

    /**
     * [get] TO_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'TO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getToName() {
        checkSpecifiedProperty("toName");
        return _toName;
    }

    /**
     * [set] TO_NAME: {NotNull, VARCHAR(200)} <br>
     * @param toName The value of the column 'TO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setToName(String toName) {
        registerModifiedProperty("toName");
        _toName = toName;
    }

    /**
     * [get] NON_UNIQUE_CODE: {NotNull, CHAR(3)} <br>
     * @return The value of the column 'NON_UNIQUE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNonUniqueCode() {
        checkSpecifiedProperty("nonUniqueCode");
        return _nonUniqueCode;
    }

    /**
     * [set] NON_UNIQUE_CODE: {NotNull, CHAR(3)} <br>
     * @param nonUniqueCode The value of the column 'NON_UNIQUE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setNonUniqueCode(String nonUniqueCode) {
        registerModifiedProperty("nonUniqueCode");
        _nonUniqueCode = nonUniqueCode;
    }

    /**
     * [get] BEGIN_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getBeginDate() {
        checkSpecifiedProperty("beginDate");
        return _beginDate;
    }

    /**
     * [set] BEGIN_DATE: {NotNull, DATE(10)} <br>
     * @param beginDate The value of the column 'BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setBeginDate(java.time.LocalDate beginDate) {
        registerModifiedProperty("beginDate");
        _beginDate = beginDate;
    }

    /**
     * [get] END_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getEndDate() {
        checkSpecifiedProperty("endDate");
        return _endDate;
    }

    /**
     * [set] END_DATE: {NotNull, DATE(10)} <br>
     * @param endDate The value of the column 'END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setEndDate(java.time.LocalDate endDate) {
        registerModifiedProperty("endDate");
        _endDate = endDate;
    }
}
