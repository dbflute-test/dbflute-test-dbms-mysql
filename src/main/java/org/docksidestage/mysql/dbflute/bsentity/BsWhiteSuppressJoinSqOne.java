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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_ONE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ONE_ID
 * 
 * [column]
 *     ONE_ID, ONE_NAME, SUPPRESS_JOIN_SQ_ID, ONE_ADDI_ID
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
 *     WHITE_SUPPRESS_JOIN_SQ, WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSuppressJoinSq, whiteSuppressJoinSqOneAddi
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer oneId = entity.getOneId();
 * String oneName = entity.getOneName();
 * Integer suppressJoinSqId = entity.getSuppressJoinSqId();
 * Integer oneAddiId = entity.getOneAddiId();
 * entity.setOneId(oneId);
 * entity.setOneName(oneName);
 * entity.setSuppressJoinSqId(suppressJoinSqId);
 * entity.setOneAddiId(oneAddiId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqOne extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _oneId;

    /** ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _oneName;

    /** SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq} */
    protected Integer _suppressJoinSqId;

    /** ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI} */
    protected Integer _oneAddiId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_join_sq_one";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_oneId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param suppressJoinSqId : UQ, NotNull, INT(10), FK to white_suppress_join_sq. (NotNull)
     */
    public void uniqueBy(Integer suppressJoinSqId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("suppressJoinSqId");
        setSuppressJoinSqId(suppressJoinSqId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_SUPPRESS_JOIN_SQ by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'. */
    protected OptionalEntity<WhiteSuppressJoinSq> _whiteSuppressJoinSq;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSuppressJoinSq'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSuppressJoinSq> getWhiteSuppressJoinSq() {
        if (_whiteSuppressJoinSq == null) { _whiteSuppressJoinSq = OptionalEntity.relationEmpty(this, "whiteSuppressJoinSq"); }
        return _whiteSuppressJoinSq;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @param whiteSuppressJoinSq The entity of foreign property 'whiteSuppressJoinSq'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSq(OptionalEntity<WhiteSuppressJoinSq> whiteSuppressJoinSq) {
        _whiteSuppressJoinSq = whiteSuppressJoinSq;
    }

    /** WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'. */
    protected OptionalEntity<WhiteSuppressJoinSqOneAddi> _whiteSuppressJoinSqOneAddi;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSuppressJoinSqOneAddi'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSuppressJoinSqOneAddi> getWhiteSuppressJoinSqOneAddi() {
        if (_whiteSuppressJoinSqOneAddi == null) { _whiteSuppressJoinSqOneAddi = OptionalEntity.relationEmpty(this, "whiteSuppressJoinSqOneAddi"); }
        return _whiteSuppressJoinSqOneAddi;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'.
     * @param whiteSuppressJoinSqOneAddi The entity of foreign property 'whiteSuppressJoinSqOneAddi'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqOneAddi(OptionalEntity<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddi) {
        _whiteSuppressJoinSqOneAddi = whiteSuppressJoinSqOneAddi;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSuppressJoinSqOne) {
            BsWhiteSuppressJoinSqOne other = (BsWhiteSuppressJoinSqOne)obj;
            if (!xSV(_oneId, other._oneId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _oneId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSq != null && _whiteSuppressJoinSq.isPresent())
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSq, "whiteSuppressJoinSq")); }
        if (_whiteSuppressJoinSqOneAddi != null && _whiteSuppressJoinSqOneAddi.isPresent())
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqOneAddi, "whiteSuppressJoinSqOneAddi")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_oneId));
        sb.append(dm).append(xfND(_oneName));
        sb.append(dm).append(xfND(_suppressJoinSqId));
        sb.append(dm).append(xfND(_oneAddiId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSq != null && _whiteSuppressJoinSq.isPresent())
        { sb.append(dm).append("whiteSuppressJoinSq"); }
        if (_whiteSuppressJoinSqOneAddi != null && _whiteSuppressJoinSqOneAddi.isPresent())
        { sb.append(dm).append("whiteSuppressJoinSqOneAddi"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqOne clone() {
        return (WhiteSuppressJoinSqOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ONE_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOneId() {
        checkSpecifiedProperty("oneId");
        return _oneId;
    }

    /**
     * [set] ONE_ID: {PK, NotNull, INT(10)} <br>
     * @param oneId The value of the column 'ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOneId(Integer oneId) {
        registerModifiedProperty("oneId");
        _oneId = oneId;
    }

    /**
     * [get] ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getOneName() {
        checkSpecifiedProperty("oneName");
        return _oneName;
    }

    /**
     * [set] ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param oneName The value of the column 'ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setOneName(String oneName) {
        registerModifiedProperty("oneName");
        _oneName = oneName;
    }

    /**
     * [get] SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq} <br>
     * @return The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSuppressJoinSqId() {
        checkSpecifiedProperty("suppressJoinSqId");
        return _suppressJoinSqId;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq} <br>
     * @param suppressJoinSqId The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqId(Integer suppressJoinSqId) {
        registerModifiedProperty("suppressJoinSqId");
        _suppressJoinSqId = suppressJoinSqId;
    }

    /**
     * [get] ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI} <br>
     * @return The value of the column 'ONE_ADDI_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOneAddiId() {
        checkSpecifiedProperty("oneAddiId");
        return _oneAddiId;
    }

    /**
     * [set] ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI} <br>
     * @param oneAddiId The value of the column 'ONE_ADDI_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOneAddiId(Integer oneAddiId) {
        registerModifiedProperty("oneAddiId");
        _oneAddiId = oneAddiId;
    }
}
