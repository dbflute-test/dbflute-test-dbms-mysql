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
 * The entity of WHITE_QUOTED as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteQuoted extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SELECT: {PK, NotNull, INT(10)} */
    protected Integer _select;

    /** FROM: {VARCHAR(200)} */
    protected String _from;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_quoted";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_select == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_QUOTED_REF by ORDER, named 'whiteQuotedRefList'. */
    protected List<WhiteQuotedRef> _whiteQuotedRefList;

    /**
     * [get] WHITE_QUOTED_REF by ORDER, named 'whiteQuotedRefList'.
     * @return The entity list of referrer property 'whiteQuotedRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteQuotedRef> getWhiteQuotedRefList() {
        if (_whiteQuotedRefList == null) { _whiteQuotedRefList = newReferrerList(); }
        return _whiteQuotedRefList;
    }

    /**
     * [set] WHITE_QUOTED_REF by ORDER, named 'whiteQuotedRefList'.
     * @param whiteQuotedRefList The entity list of referrer property 'whiteQuotedRefList'. (NullAllowed)
     */
    public void setWhiteQuotedRefList(List<WhiteQuotedRef> whiteQuotedRefList) {
        _whiteQuotedRefList = whiteQuotedRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteQuoted) {
            BsWhiteQuoted other = (BsWhiteQuoted)obj;
            if (!xSV(_select, other._select)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _select);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteQuotedRefList != null) { for (WhiteQuotedRef et : _whiteQuotedRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteQuotedRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_select));
        sb.append(dm).append(xfND(_from));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteQuotedRefList != null && !_whiteQuotedRefList.isEmpty())
        { sb.append(dm).append("whiteQuotedRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteQuoted clone() {
        return (WhiteQuoted)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELECT: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'SELECT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSelect() {
        checkSpecifiedProperty("select");
        return _select;
    }

    /**
     * [set] SELECT: {PK, NotNull, INT(10)} <br>
     * @param select The value of the column 'SELECT'. (basically NotNull if update: for the constraint)
     */
    public void setSelect(Integer select) {
        registerModifiedProperty("select");
        _select = select;
    }

    /**
     * [get] FROM: {VARCHAR(200)} <br>
     * @return The value of the column 'FROM'. (NullAllowed even if selected: for no constraint)
     */
    public String getFrom() {
        checkSpecifiedProperty("from");
        return _from;
    }

    /**
     * [set] FROM: {VARCHAR(200)} <br>
     * @param from The value of the column 'FROM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFrom(String from) {
        registerModifiedProperty("from");
        _from = from;
    }
}
