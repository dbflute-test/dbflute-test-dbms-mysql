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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqMany extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MANY_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyId;

    /** MANY_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyName;

    /** SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} */
    protected Integer _suppressJoinSqId;

    /** MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} */
    protected Integer _manyOneId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_join_sq_many";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_manyId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'. */
    protected OptionalEntity<WhiteSuppressJoinSqManyOne> _whiteSuppressJoinSqManyOne;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSuppressJoinSqManyOne'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOne> getWhiteSuppressJoinSqManyOne() {
        if (_whiteSuppressJoinSqManyOne == null) { _whiteSuppressJoinSqManyOne = OptionalEntity.relationEmpty(this, "whiteSuppressJoinSqManyOne"); }
        return _whiteSuppressJoinSqManyOne;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @param whiteSuppressJoinSqManyOne The entity of foreign property 'whiteSuppressJoinSqManyOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOne(OptionalEntity<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOne) {
        _whiteSuppressJoinSqManyOne = whiteSuppressJoinSqManyOne;
    }

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
        if (obj instanceof BsWhiteSuppressJoinSqMany) {
            BsWhiteSuppressJoinSqMany other = (BsWhiteSuppressJoinSqMany)obj;
            if (!xSV(_manyId, other._manyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _manyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOne != null && _whiteSuppressJoinSqManyOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqManyOne, "whiteSuppressJoinSqManyOne")); }
        if (_whiteSuppressJoinSq != null && _whiteSuppressJoinSq.isPresent())
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSq, "whiteSuppressJoinSq")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_manyId));
        sb.append(dm).append(xfND(_manyName));
        sb.append(dm).append(xfND(_suppressJoinSqId));
        sb.append(dm).append(xfND(_manyOneId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOne != null && _whiteSuppressJoinSqManyOne.isPresent())
        { sb.append(dm).append("whiteSuppressJoinSqManyOne"); }
        if (_whiteSuppressJoinSq != null && _whiteSuppressJoinSq.isPresent())
        { sb.append(dm).append("whiteSuppressJoinSq"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqMany clone() {
        return (WhiteSuppressJoinSqMany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'MANY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyId() {
        checkSpecifiedProperty("manyId");
        return _manyId;
    }

    /**
     * [set] MANY_ID: {PK, NotNull, INT(10)} <br>
     * @param manyId The value of the column 'MANY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyId(Integer manyId) {
        registerModifiedProperty("manyId");
        _manyId = manyId;
    }

    /**
     * [get] MANY_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MANY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyName() {
        checkSpecifiedProperty("manyName");
        return _manyName;
    }

    /**
     * [set] MANY_NAME: {NotNull, VARCHAR(200)} <br>
     * @param manyName The value of the column 'MANY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyName(String manyName) {
        registerModifiedProperty("manyName");
        _manyName = manyName;
    }

    /**
     * [get] SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} <br>
     * @return The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSuppressJoinSqId() {
        checkSpecifiedProperty("suppressJoinSqId");
        return _suppressJoinSqId;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} <br>
     * @param suppressJoinSqId The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqId(Integer suppressJoinSqId) {
        registerModifiedProperty("suppressJoinSqId");
        _suppressJoinSqId = suppressJoinSqId;
    }

    /**
     * [get] MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} <br>
     * @return The value of the column 'MANY_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneId() {
        checkSpecifiedProperty("manyOneId");
        return _manyOneId;
    }

    /**
     * [set] MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} <br>
     * @param manyOneId The value of the column 'MANY_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneId(Integer manyOneId) {
        registerModifiedProperty("manyOneId");
        _manyOneId = manyOneId;
    }
}
