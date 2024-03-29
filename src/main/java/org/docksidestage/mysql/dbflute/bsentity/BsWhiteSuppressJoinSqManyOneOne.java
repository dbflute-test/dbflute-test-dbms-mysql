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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOneOne extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MANY_ONE_ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyOneOneId;

    /** MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyOneOneName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_join_sq_many_one_one";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_manyOneOneId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'. */
    protected List<WhiteSuppressJoinSqManyOne> _whiteSuppressJoinSqManyOneList;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqManyOneList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqManyOne> getWhiteSuppressJoinSqManyOneList() {
        if (_whiteSuppressJoinSqManyOneList == null) { _whiteSuppressJoinSqManyOneList = newReferrerList(); }
        return _whiteSuppressJoinSqManyOneList;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_MANY_ONE by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * @param whiteSuppressJoinSqManyOneList The entity list of referrer property 'whiteSuppressJoinSqManyOneList'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOneList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        _whiteSuppressJoinSqManyOneList = whiteSuppressJoinSqManyOneList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSuppressJoinSqManyOneOne) {
            BsWhiteSuppressJoinSqManyOneOne other = (BsWhiteSuppressJoinSqManyOneOne)obj;
            if (!xSV(_manyOneOneId, other._manyOneOneId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _manyOneOneId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneList != null) { for (WhiteSuppressJoinSqManyOne et : _whiteSuppressJoinSqManyOneList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSuppressJoinSqManyOneList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_manyOneOneId));
        sb.append(dm).append(xfND(_manyOneOneName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneList != null && !_whiteSuppressJoinSqManyOneList.isEmpty())
        { sb.append(dm).append("whiteSuppressJoinSqManyOneList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqManyOneOne clone() {
        return (WhiteSuppressJoinSqManyOneOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ONE_ONE_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneOneId() {
        checkSpecifiedProperty("manyOneOneId");
        return _manyOneOneId;
    }

    /**
     * [set] MANY_ONE_ONE_ID: {PK, NotNull, INT(10)} <br>
     * @param manyOneOneId The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneId(Integer manyOneOneId) {
        registerModifiedProperty("manyOneOneId");
        _manyOneOneId = manyOneOneId;
    }

    /**
     * [get] MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MANY_ONE_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyOneOneName() {
        checkSpecifiedProperty("manyOneOneName");
        return _manyOneOneName;
    }

    /**
     * [set] MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param manyOneOneName The value of the column 'MANY_ONE_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneName(String manyOneOneName) {
        registerModifiedProperty("manyOneOneName");
        _manyOneOneName = manyOneOneName;
    }
}
