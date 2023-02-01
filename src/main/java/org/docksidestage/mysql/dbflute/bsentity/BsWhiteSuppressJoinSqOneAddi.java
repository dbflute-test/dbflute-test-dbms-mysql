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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqOneAddi extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ONE_ADDI_ID: {PK, NotNull, INT(10)} */
    protected Integer _oneAddiId;

    /** ONE_ADDI_NAME: {NotNull, VARCHAR(200)} */
    protected String _oneAddiName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_join_sq_one_addi";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_oneAddiId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_SUPPRESS_JOIN_SQ_ONE by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'. */
    protected List<WhiteSuppressJoinSqOne> _whiteSuppressJoinSqOneList;

    /**
     * [get] WHITE_SUPPRESS_JOIN_SQ_ONE by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqOneList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqOne> getWhiteSuppressJoinSqOneList() {
        if (_whiteSuppressJoinSqOneList == null) { _whiteSuppressJoinSqOneList = newReferrerList(); }
        return _whiteSuppressJoinSqOneList;
    }

    /**
     * [set] WHITE_SUPPRESS_JOIN_SQ_ONE by ONE_ADDI_ID, named 'whiteSuppressJoinSqOneList'.
     * @param whiteSuppressJoinSqOneList The entity list of referrer property 'whiteSuppressJoinSqOneList'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqOneList(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        _whiteSuppressJoinSqOneList = whiteSuppressJoinSqOneList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSuppressJoinSqOneAddi) {
            BsWhiteSuppressJoinSqOneAddi other = (BsWhiteSuppressJoinSqOneAddi)obj;
            if (!xSV(_oneAddiId, other._oneAddiId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _oneAddiId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqOneList != null) { for (WhiteSuppressJoinSqOne et : _whiteSuppressJoinSqOneList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSuppressJoinSqOneList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_oneAddiId));
        sb.append(dm).append(xfND(_oneAddiName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqOneList != null && !_whiteSuppressJoinSqOneList.isEmpty())
        { sb.append(dm).append("whiteSuppressJoinSqOneList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqOneAddi clone() {
        return (WhiteSuppressJoinSqOneAddi)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ONE_ADDI_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'ONE_ADDI_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOneAddiId() {
        checkSpecifiedProperty("oneAddiId");
        return _oneAddiId;
    }

    /**
     * [set] ONE_ADDI_ID: {PK, NotNull, INT(10)} <br>
     * @param oneAddiId The value of the column 'ONE_ADDI_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOneAddiId(Integer oneAddiId) {
        registerModifiedProperty("oneAddiId");
        _oneAddiId = oneAddiId;
    }

    /**
     * [get] ONE_ADDI_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'ONE_ADDI_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getOneAddiName() {
        checkSpecifiedProperty("oneAddiName");
        return _oneAddiName;
    }

    /**
     * [set] ONE_ADDI_NAME: {NotNull, VARCHAR(200)} <br>
     * @param oneAddiName The value of the column 'ONE_ADDI_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setOneAddiName(String oneAddiName) {
        registerModifiedProperty("oneAddiName");
        _oneAddiName = oneAddiName;
    }
}
