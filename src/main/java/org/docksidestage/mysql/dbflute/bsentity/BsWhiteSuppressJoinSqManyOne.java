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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOne extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MANY_ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyOneId;

    /** MANY_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyOneName;

    /** MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} */
    protected Integer _manyOneOneId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_join_sq_many_one";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_manyOneId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'. */
    protected OptionalEntity<WhiteSuppressJoinSqManyOneOne> _whiteSuppressJoinSqManyOneOne;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSuppressJoinSqManyOneOne'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSuppressJoinSqManyOneOne> getWhiteSuppressJoinSqManyOneOne() {
        if (_whiteSuppressJoinSqManyOneOne == null) { _whiteSuppressJoinSqManyOneOne = OptionalEntity.relationEmpty(this, "whiteSuppressJoinSqManyOneOne"); }
        return _whiteSuppressJoinSqManyOneOne;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @param whiteSuppressJoinSqManyOneOne The entity of foreign property 'whiteSuppressJoinSqManyOneOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOneOne(OptionalEntity<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOne) {
        _whiteSuppressJoinSqManyOneOne = whiteSuppressJoinSqManyOneOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_SUPPRESS_JOIN_SQ_MANY by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'. */
    protected List<WhiteSuppressJoinSqMany> _whiteSuppressJoinSqManyList;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_MANY by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqMany> getWhiteSuppressJoinSqManyList() {
        if (_whiteSuppressJoinSqManyList == null) { _whiteSuppressJoinSqManyList = newReferrerList(); }
        return _whiteSuppressJoinSqManyList;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_MANY by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @param whiteSuppressJoinSqManyList The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        _whiteSuppressJoinSqManyList = whiteSuppressJoinSqManyList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSuppressJoinSqManyOne) {
            BsWhiteSuppressJoinSqManyOne other = (BsWhiteSuppressJoinSqManyOne)obj;
            if (!xSV(_manyOneId, other._manyOneId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _manyOneId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneOne != null && _whiteSuppressJoinSqManyOneOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqManyOneOne, "whiteSuppressJoinSqManyOneOne")); }
        if (_whiteSuppressJoinSqManyList != null) { for (WhiteSuppressJoinSqMany et : _whiteSuppressJoinSqManyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSuppressJoinSqManyList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_manyOneId));
        sb.append(dm).append(xfND(_manyOneName));
        sb.append(dm).append(xfND(_manyOneOneId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneOne != null && _whiteSuppressJoinSqManyOneOne.isPresent())
        { sb.append(dm).append("whiteSuppressJoinSqManyOneOne"); }
        if (_whiteSuppressJoinSqManyList != null && !_whiteSuppressJoinSqManyList.isEmpty())
        { sb.append(dm).append("whiteSuppressJoinSqManyList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqManyOne clone() {
        return (WhiteSuppressJoinSqManyOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ONE_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'MANY_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneId() {
        checkSpecifiedProperty("manyOneId");
        return _manyOneId;
    }

    /**
     * [set] MANY_ONE_ID: {PK, NotNull, INT(10)} <br>
     * @param manyOneId The value of the column 'MANY_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneId(Integer manyOneId) {
        registerModifiedProperty("manyOneId");
        _manyOneId = manyOneId;
    }

    /**
     * [get] MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MANY_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyOneName() {
        checkSpecifiedProperty("manyOneName");
        return _manyOneName;
    }

    /**
     * [set] MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param manyOneName The value of the column 'MANY_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneName(String manyOneName) {
        registerModifiedProperty("manyOneName");
        _manyOneName = manyOneName;
    }

    /**
     * [get] MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} <br>
     * @return The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneOneId() {
        checkSpecifiedProperty("manyOneOneId");
        return _manyOneOneId;
    }

    /**
     * [set] MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} <br>
     * @param manyOneOneId The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneId(Integer manyOneOneId) {
        registerModifiedProperty("manyOneOneId");
        _manyOneOneId = manyOneOneId;
    }
}
