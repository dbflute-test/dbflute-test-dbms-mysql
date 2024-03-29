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
 * The entity of WHITE_MYSELF_CHECK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyselfCheck extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MYSELF_CHECK_ID: {PK, NotNull, INT(10)} */
    protected Integer _myselfCheckId;

    /** MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfCheckName;

    /** MYSELF_ID: {IX, INT(10), FK to white_myself} */
    protected Integer _myselfId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_myself_check";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_myselfCheckId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_MYSELF by my MYSELF_ID, named 'whiteMyself'. */
    protected OptionalEntity<WhiteMyself> _whiteMyself;

    /**
     * [get] WHITE_MYSELF by my MYSELF_ID, named 'whiteMyself'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteMyself'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteMyself> getWhiteMyself() {
        if (_whiteMyself == null) { _whiteMyself = OptionalEntity.relationEmpty(this, "whiteMyself"); }
        return _whiteMyself;
    }

    /**
     * [set] WHITE_MYSELF by my MYSELF_ID, named 'whiteMyself'.
     * @param whiteMyself The entity of foreign property 'whiteMyself'. (NullAllowed)
     */
    public void setWhiteMyself(OptionalEntity<WhiteMyself> whiteMyself) {
        _whiteMyself = whiteMyself;
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
        if (obj instanceof BsWhiteMyselfCheck) {
            BsWhiteMyselfCheck other = (BsWhiteMyselfCheck)obj;
            if (!xSV(_myselfCheckId, other._myselfCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _myselfCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteMyself != null && _whiteMyself.isPresent())
        { sb.append(li).append(xbRDS(_whiteMyself, "whiteMyself")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_myselfCheckId));
        sb.append(dm).append(xfND(_myselfCheckName));
        sb.append(dm).append(xfND(_myselfId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteMyself != null && _whiteMyself.isPresent())
        { sb.append(dm).append("whiteMyself"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteMyselfCheck clone() {
        return (WhiteMyselfCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_CHECK_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfCheckId() {
        checkSpecifiedProperty("myselfCheckId");
        return _myselfCheckId;
    }

    /**
     * [set] MYSELF_CHECK_ID: {PK, NotNull, INT(10)} <br>
     * @param myselfCheckId The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckId(Integer myselfCheckId) {
        registerModifiedProperty("myselfCheckId");
        _myselfCheckId = myselfCheckId;
    }

    /**
     * [get] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br>
     * @return The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfCheckName() {
        checkSpecifiedProperty("myselfCheckName");
        return _myselfCheckName;
    }

    /**
     * [set] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br>
     * @param myselfCheckName The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckName(String myselfCheckName) {
        registerModifiedProperty("myselfCheckName");
        _myselfCheckName = myselfCheckName;
    }

    /**
     * [get] MYSELF_ID: {IX, INT(10), FK to white_myself} <br>
     * @return The value of the column 'MYSELF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMyselfId() {
        checkSpecifiedProperty("myselfId");
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {IX, INT(10), FK to white_myself} <br>
     * @param myselfId The value of the column 'MYSELF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMyselfId(Integer myselfId) {
        registerModifiedProperty("myselfId");
        _myselfId = myselfId;
    }
}
