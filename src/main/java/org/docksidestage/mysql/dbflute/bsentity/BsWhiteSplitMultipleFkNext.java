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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_NEXT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkNext extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NEXT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _nextId;

    /** SECOND_CODE: {NotNull, CHAR(3)} */
    protected String _secondCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_split_multiple_fk_next";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_nextId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_SPLIT_MULTIPLE_FK_BASE by NEXT_ID, named 'whiteSplitMultipleFkBaseList'. */
    protected List<WhiteSplitMultipleFkBase> _whiteSplitMultipleFkBaseList;

    /**
     * [get] WHITE_SPLIT_MULTIPLE_FK_BASE by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * @return The entity list of referrer property 'whiteSplitMultipleFkBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSplitMultipleFkBase> getWhiteSplitMultipleFkBaseList() {
        if (_whiteSplitMultipleFkBaseList == null) { _whiteSplitMultipleFkBaseList = newReferrerList(); }
        return _whiteSplitMultipleFkBaseList;
    }

    /**
     * [set] WHITE_SPLIT_MULTIPLE_FK_BASE by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * @param whiteSplitMultipleFkBaseList The entity list of referrer property 'whiteSplitMultipleFkBaseList'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        _whiteSplitMultipleFkBaseList = whiteSplitMultipleFkBaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSplitMultipleFkNext) {
            BsWhiteSplitMultipleFkNext other = (BsWhiteSplitMultipleFkNext)obj;
            if (!xSV(_nextId, other._nextId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _nextId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBaseList != null) { for (WhiteSplitMultipleFkBase et : _whiteSplitMultipleFkBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSplitMultipleFkBaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_nextId));
        sb.append(dm).append(xfND(_secondCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBaseList != null && !_whiteSplitMultipleFkBaseList.isEmpty())
        { sb.append(dm).append("whiteSplitMultipleFkBaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSplitMultipleFkNext clone() {
        return (WhiteSplitMultipleFkNext)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NEXT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'NEXT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextId() {
        checkSpecifiedProperty("nextId");
        return _nextId;
    }

    /**
     * [set] NEXT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param nextId The value of the column 'NEXT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextId(Long nextId) {
        registerModifiedProperty("nextId");
        _nextId = nextId;
    }

    /**
     * [get] SECOND_CODE: {NotNull, CHAR(3)} <br>
     * @return The value of the column 'SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecondCode() {
        checkSpecifiedProperty("secondCode");
        return _secondCode;
    }

    /**
     * [set] SECOND_CODE: {NotNull, CHAR(3)} <br>
     * @param secondCode The value of the column 'SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecondCode(String secondCode) {
        registerModifiedProperty("secondCode");
        _secondCode = secondCode;
    }
}
