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
 * The entity of WHITE_SUPPRESS_JOIN_SQ as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSq extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)} */
    protected Integer _suppressJoinSqId;

    /** SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)} */
    protected String _suppressJoinSqName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_join_sq";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_suppressJoinSqId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'. */
    protected OptionalEntity<WhiteSuppressJoinSqOne> _whiteSuppressJoinSqOneAsOne;

    /**
     * [get] white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteSuppressJoinSqOneAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteSuppressJoinSqOne> getWhiteSuppressJoinSqOneAsOne() {
        if (_whiteSuppressJoinSqOneAsOne == null) { _whiteSuppressJoinSqOneAsOne = OptionalEntity.relationEmpty(this, "whiteSuppressJoinSqOneAsOne"); }
        return _whiteSuppressJoinSqOneAsOne;
    }

    /**
     * [set] white_suppress_join_sq_one by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqOneAsOne'.
     * @param whiteSuppressJoinSqOneAsOne The entity of foreign property(referrer-as-one) 'whiteSuppressJoinSqOneAsOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqOneAsOne(OptionalEntity<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneAsOne) {
        _whiteSuppressJoinSqOneAsOne = whiteSuppressJoinSqOneAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_SUPPRESS_JOIN_SQ_MANY by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'. */
    protected List<WhiteSuppressJoinSqMany> _whiteSuppressJoinSqManyList;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_MANY by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqMany> getWhiteSuppressJoinSqManyList() {
        if (_whiteSuppressJoinSqManyList == null) { _whiteSuppressJoinSqManyList = newReferrerList(); }
        return _whiteSuppressJoinSqManyList;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_MANY by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
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
        if (obj instanceof BsWhiteSuppressJoinSq) {
            BsWhiteSuppressJoinSq other = (BsWhiteSuppressJoinSq)obj;
            if (!xSV(_suppressJoinSqId, other._suppressJoinSqId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _suppressJoinSqId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqOneAsOne != null && _whiteSuppressJoinSqOneAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqOneAsOne, "whiteSuppressJoinSqOneAsOne")); }
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
        sb.append(dm).append(xfND(_suppressJoinSqId));
        sb.append(dm).append(xfND(_suppressJoinSqName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqOneAsOne != null && _whiteSuppressJoinSqOneAsOne.isPresent())
        { sb.append(dm).append("whiteSuppressJoinSqOneAsOne"); }
        if (_whiteSuppressJoinSqManyList != null && !_whiteSuppressJoinSqManyList.isEmpty())
        { sb.append(dm).append("whiteSuppressJoinSqManyList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSq clone() {
        return (WhiteSuppressJoinSq)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSuppressJoinSqId() {
        checkSpecifiedProperty("suppressJoinSqId");
        return _suppressJoinSqId;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_ID: {PK, NotNull, INT(10)} <br>
     * @param suppressJoinSqId The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqId(Integer suppressJoinSqId) {
        registerModifiedProperty("suppressJoinSqId");
        _suppressJoinSqId = suppressJoinSqId;
    }

    /**
     * [get] SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SUPPRESS_JOIN_SQ_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSuppressJoinSqName() {
        checkSpecifiedProperty("suppressJoinSqName");
        return _suppressJoinSqName;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_NAME: {NotNull, VARCHAR(200)} <br>
     * @param suppressJoinSqName The value of the column 'SUPPRESS_JOIN_SQ_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqName(String suppressJoinSqName) {
        registerModifiedProperty("suppressJoinSqName");
        _suppressJoinSqName = suppressJoinSqName;
    }
}
