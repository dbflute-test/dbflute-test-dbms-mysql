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
 * The entity of WHITE_COMPOUND_REFERRED_PRIMARY as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundReferredPrimary extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REFERRED_ID: {PK, NotNull, INT(10)} */
    protected Integer _referredId;

    /** REFERRED_NAME: {NotNull, VARCHAR(200)} */
    protected String _referredName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_compound_referred_primary";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_referredId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_COMPOUND_PK by PK_SECOND_ID, named 'whiteCompoundPkList'. */
    protected List<WhiteCompoundPk> _whiteCompoundPkList;

    /**
     * [get] WHITE_COMPOUND_PK by PK_SECOND_ID, named 'whiteCompoundPkList'.
     * @return The entity list of referrer property 'whiteCompoundPkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPk> getWhiteCompoundPkList() {
        if (_whiteCompoundPkList == null) { _whiteCompoundPkList = newReferrerList(); }
        return _whiteCompoundPkList;
    }

    /**
     * [set] WHITE_COMPOUND_PK by PK_SECOND_ID, named 'whiteCompoundPkList'.
     * @param whiteCompoundPkList The entity list of referrer property 'whiteCompoundPkList'. (NullAllowed)
     */
    public void setWhiteCompoundPkList(List<WhiteCompoundPk> whiteCompoundPkList) {
        _whiteCompoundPkList = whiteCompoundPkList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteCompoundReferredPrimary) {
            BsWhiteCompoundReferredPrimary other = (BsWhiteCompoundReferredPrimary)obj;
            if (!xSV(_referredId, other._referredId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _referredId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkList != null) { for (WhiteCompoundPk et : _whiteCompoundPkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_referredId));
        sb.append(dm).append(xfND(_referredName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkList != null && !_whiteCompoundPkList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundReferredPrimary clone() {
        return (WhiteCompoundReferredPrimary)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REFERRED_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'REFERRED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReferredId() {
        checkSpecifiedProperty("referredId");
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {PK, NotNull, INT(10)} <br>
     * @param referredId The value of the column 'REFERRED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferredId(Integer referredId) {
        registerModifiedProperty("referredId");
        _referredId = referredId;
    }

    /**
     * [get] REFERRED_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REFERRED_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReferredName() {
        checkSpecifiedProperty("referredName");
        return _referredName;
    }

    /**
     * [set] REFERRED_NAME: {NotNull, VARCHAR(200)} <br>
     * @param referredName The value of the column 'REFERRED_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReferredName(String referredName) {
        registerModifiedProperty("referredName");
        _referredName = referredName;
    }
}
