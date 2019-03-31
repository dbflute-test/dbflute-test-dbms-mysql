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

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_NON_UNIQUE_MANY_TO_ONE_FROM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     FROM_ID
 *
 * [column]
 *     FROM_ID, FROM_NAME, NON_UNIQUE_CODE, BEGIN_DATE, END_DATE, MANY_POINT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FROM_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     WHITE_NON_UNIQUE_MANY_TO_ONE_TO(AsNonUniqueManyToOne)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteNonUniqueManyToOneToAsNonUniqueManyToOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long fromId = entity.getFromId();
 * String fromName = entity.getFromName();
 * String nonUniqueCode = entity.getNonUniqueCode();
 * java.time.LocalDate beginDate = entity.getBeginDate();
 * java.time.LocalDate endDate = entity.getEndDate();
 * Integer manyPoint = entity.getManyPoint();
 * entity.setFromId(fromId);
 * entity.setFromName(fromName);
 * entity.setNonUniqueCode(nonUniqueCode);
 * entity.setBeginDate(beginDate);
 * entity.setEndDate(endDate);
 * entity.setManyPoint(manyPoint);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNonUniqueManyToOneFrom extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FROM_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _fromId;

    /** FROM_NAME: {NotNull, VARCHAR(200)} */
    protected String _fromName;

    /** NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO} */
    protected String _nonUniqueCode;

    /** BEGIN_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _beginDate;

    /** END_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _endDate;

    /** MANY_POINT: {NotNull, INT(10)} */
    protected Integer _manyPoint;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_non_unique_many_to_one_from";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fromId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_NON_UNIQUE_MANY_TO_ONE_TO by my NON_UNIQUE_CODE, named 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'. */
    protected OptionalEntity<WhiteNonUniqueManyToOneTo> _whiteNonUniqueManyToOneToAsNonUniqueManyToOne;

    /**
     * [get] WHITE_NON_UNIQUE_MANY_TO_ONE_TO by my NON_UNIQUE_CODE, named 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteNonUniqueManyToOneTo> getWhiteNonUniqueManyToOneToAsNonUniqueManyToOne() {
        if (_whiteNonUniqueManyToOneToAsNonUniqueManyToOne == null) { _whiteNonUniqueManyToOneToAsNonUniqueManyToOne = OptionalEntity.relationEmpty(this, "whiteNonUniqueManyToOneToAsNonUniqueManyToOne"); }
        return _whiteNonUniqueManyToOneToAsNonUniqueManyToOne;
    }

    /**
     * [set] WHITE_NON_UNIQUE_MANY_TO_ONE_TO by my NON_UNIQUE_CODE, named 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'.
     * @param whiteNonUniqueManyToOneToAsNonUniqueManyToOne The entity of foreign property 'whiteNonUniqueManyToOneToAsNonUniqueManyToOne'. (NullAllowed)
     */
    public void setWhiteNonUniqueManyToOneToAsNonUniqueManyToOne(OptionalEntity<WhiteNonUniqueManyToOneTo> whiteNonUniqueManyToOneToAsNonUniqueManyToOne) {
        _whiteNonUniqueManyToOneToAsNonUniqueManyToOne = whiteNonUniqueManyToOneToAsNonUniqueManyToOne;
    }

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
        if (obj instanceof BsWhiteNonUniqueManyToOneFrom) {
            BsWhiteNonUniqueManyToOneFrom other = (BsWhiteNonUniqueManyToOneFrom)obj;
            if (!xSV(_fromId, other._fromId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fromId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteNonUniqueManyToOneToAsNonUniqueManyToOne != null && _whiteNonUniqueManyToOneToAsNonUniqueManyToOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteNonUniqueManyToOneToAsNonUniqueManyToOne, "whiteNonUniqueManyToOneToAsNonUniqueManyToOne")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fromId));
        sb.append(dm).append(xfND(_fromName));
        sb.append(dm).append(xfND(_nonUniqueCode));
        sb.append(dm).append(xfND(_beginDate));
        sb.append(dm).append(xfND(_endDate));
        sb.append(dm).append(xfND(_manyPoint));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteNonUniqueManyToOneToAsNonUniqueManyToOne != null && _whiteNonUniqueManyToOneToAsNonUniqueManyToOne.isPresent())
        { sb.append(dm).append("whiteNonUniqueManyToOneToAsNonUniqueManyToOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteNonUniqueManyToOneFrom clone() {
        return (WhiteNonUniqueManyToOneFrom)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FROM_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'FROM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFromId() {
        checkSpecifiedProperty("fromId");
        return _fromId;
    }

    /**
     * [set] FROM_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param fromId The value of the column 'FROM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFromId(Long fromId) {
        registerModifiedProperty("fromId");
        _fromId = fromId;
    }

    /**
     * [get] FROM_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'FROM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFromName() {
        checkSpecifiedProperty("fromName");
        return _fromName;
    }

    /**
     * [set] FROM_NAME: {NotNull, VARCHAR(200)} <br>
     * @param fromName The value of the column 'FROM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setFromName(String fromName) {
        registerModifiedProperty("fromName");
        _fromName = fromName;
    }

    /**
     * [get] NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO} <br>
     * @return The value of the column 'NON_UNIQUE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNonUniqueCode() {
        checkSpecifiedProperty("nonUniqueCode");
        return _nonUniqueCode;
    }

    /**
     * [set] NON_UNIQUE_CODE: {NotNull, CHAR(3), FK to WHITE_NON_UNIQUE_MANY_TO_ONE_TO} <br>
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

    /**
     * [get] MANY_POINT: {NotNull, INT(10)} <br>
     * @return The value of the column 'MANY_POINT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyPoint() {
        checkSpecifiedProperty("manyPoint");
        return _manyPoint;
    }

    /**
     * [set] MANY_POINT: {NotNull, INT(10)} <br>
     * @param manyPoint The value of the column 'MANY_POINT'. (basically NotNull if update: for the constraint)
     */
    public void setManyPoint(Integer manyPoint) {
        registerModifiedProperty("manyPoint");
        _manyPoint = manyPoint;
    }
}
