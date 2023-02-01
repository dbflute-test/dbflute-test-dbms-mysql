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
 * The entity of WHITE_MYSELF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyself extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MYSELF_ID: {PK, NotNull, INT(10)} */
    protected Integer _myselfId;

    /** MYSELF_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_myself";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_myselfId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_MYSELF_CHECK by MYSELF_ID, named 'whiteMyselfCheckList'. */
    protected List<WhiteMyselfCheck> _whiteMyselfCheckList;

    /**
     * [get] WHITE_MYSELF_CHECK by MYSELF_ID, named 'whiteMyselfCheckList'.
     * @return The entity list of referrer property 'whiteMyselfCheckList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteMyselfCheck> getWhiteMyselfCheckList() {
        if (_whiteMyselfCheckList == null) { _whiteMyselfCheckList = newReferrerList(); }
        return _whiteMyselfCheckList;
    }

    /**
     * [set] WHITE_MYSELF_CHECK by MYSELF_ID, named 'whiteMyselfCheckList'.
     * @param whiteMyselfCheckList The entity list of referrer property 'whiteMyselfCheckList'. (NullAllowed)
     */
    public void setWhiteMyselfCheckList(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        _whiteMyselfCheckList = whiteMyselfCheckList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteMyself) {
            BsWhiteMyself other = (BsWhiteMyself)obj;
            if (!xSV(_myselfId, other._myselfId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _myselfId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteMyselfCheckList != null) { for (WhiteMyselfCheck et : _whiteMyselfCheckList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteMyselfCheckList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_myselfId));
        sb.append(dm).append(xfND(_myselfName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteMyselfCheckList != null && !_whiteMyselfCheckList.isEmpty())
        { sb.append(dm).append("whiteMyselfCheckList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteMyself clone() {
        return (WhiteMyself)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'MYSELF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfId() {
        checkSpecifiedProperty("myselfId");
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {PK, NotNull, INT(10)} <br>
     * @param myselfId The value of the column 'MYSELF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfId(Integer myselfId) {
        registerModifiedProperty("myselfId");
        _myselfId = myselfId;
    }

    /**
     * [get] MYSELF_NAME: {NotNull, VARCHAR(80)} <br>
     * @return The value of the column 'MYSELF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfName() {
        checkSpecifiedProperty("myselfName");
        return _myselfName;
    }

    /**
     * [set] MYSELF_NAME: {NotNull, VARCHAR(80)} <br>
     * @param myselfName The value of the column 'MYSELF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfName(String myselfName) {
        registerModifiedProperty("myselfName");
        _myselfName = myselfName;
    }
}
