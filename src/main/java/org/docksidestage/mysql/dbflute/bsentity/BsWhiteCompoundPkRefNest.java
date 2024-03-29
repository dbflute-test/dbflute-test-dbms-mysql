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
 * The entity of WHITE_COMPOUND_PK_REF_NEST as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefNest extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} */
    protected Integer _compoundPkRefNestId;

    /** FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _fooMultipleId;

    /** BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _barMultipleId;

    /** QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _quxMultipleId;

    /** NEST_NAME: {NotNull, VARCHAR(50)} */
    protected String _nestName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_compound_pk_ref_nest";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_compoundPkRefNestId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_COMPOUND_PK_REF by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'. */
    protected OptionalEntity<WhiteCompoundPkRef> _whiteCompoundPkRefByQuxMultipleId;

    /**
     * [get] WHITE_COMPOUND_PK_REF by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundPkRefByQuxMultipleId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundPkRef> getWhiteCompoundPkRefByQuxMultipleId() {
        if (_whiteCompoundPkRefByQuxMultipleId == null) { _whiteCompoundPkRefByQuxMultipleId = OptionalEntity.relationEmpty(this, "whiteCompoundPkRefByQuxMultipleId"); }
        return _whiteCompoundPkRefByQuxMultipleId;
    }

    /**
     * [set] WHITE_COMPOUND_PK_REF by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @param whiteCompoundPkRefByQuxMultipleId The entity of foreign property 'whiteCompoundPkRefByQuxMultipleId'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefByQuxMultipleId(OptionalEntity<WhiteCompoundPkRef> whiteCompoundPkRefByQuxMultipleId) {
        _whiteCompoundPkRefByQuxMultipleId = whiteCompoundPkRefByQuxMultipleId;
    }

    /** WHITE_COMPOUND_PK_REF by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'. */
    protected OptionalEntity<WhiteCompoundPkRef> _whiteCompoundPkRefByFooMultipleId;

    /**
     * [get] WHITE_COMPOUND_PK_REF by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundPkRefByFooMultipleId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundPkRef> getWhiteCompoundPkRefByFooMultipleId() {
        if (_whiteCompoundPkRefByFooMultipleId == null) { _whiteCompoundPkRefByFooMultipleId = OptionalEntity.relationEmpty(this, "whiteCompoundPkRefByFooMultipleId"); }
        return _whiteCompoundPkRefByFooMultipleId;
    }

    /**
     * [set] WHITE_COMPOUND_PK_REF by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @param whiteCompoundPkRefByFooMultipleId The entity of foreign property 'whiteCompoundPkRefByFooMultipleId'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefByFooMultipleId(OptionalEntity<WhiteCompoundPkRef> whiteCompoundPkRefByFooMultipleId) {
        _whiteCompoundPkRefByFooMultipleId = whiteCompoundPkRefByFooMultipleId;
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
        if (obj instanceof BsWhiteCompoundPkRefNest) {
            BsWhiteCompoundPkRefNest other = (BsWhiteCompoundPkRefNest)obj;
            if (!xSV(_compoundPkRefNestId, other._compoundPkRefNestId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _compoundPkRefNestId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkRefByQuxMultipleId != null && _whiteCompoundPkRefByQuxMultipleId.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefByQuxMultipleId, "whiteCompoundPkRefByQuxMultipleId")); }
        if (_whiteCompoundPkRefByFooMultipleId != null && _whiteCompoundPkRefByFooMultipleId.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefByFooMultipleId, "whiteCompoundPkRefByFooMultipleId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_compoundPkRefNestId));
        sb.append(dm).append(xfND(_fooMultipleId));
        sb.append(dm).append(xfND(_barMultipleId));
        sb.append(dm).append(xfND(_quxMultipleId));
        sb.append(dm).append(xfND(_nestName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkRefByQuxMultipleId != null && _whiteCompoundPkRefByQuxMultipleId.isPresent())
        { sb.append(dm).append("whiteCompoundPkRefByQuxMultipleId"); }
        if (_whiteCompoundPkRefByFooMultipleId != null && _whiteCompoundPkRefByFooMultipleId.isPresent())
        { sb.append(dm).append("whiteCompoundPkRefByFooMultipleId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPkRefNest clone() {
        return (WhiteCompoundPkRefNest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'COMPOUND_PK_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCompoundPkRefNestId() {
        checkSpecifiedProperty("compoundPkRefNestId");
        return _compoundPkRefNestId;
    }

    /**
     * [set] COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} <br>
     * @param compoundPkRefNestId The value of the column 'COMPOUND_PK_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundPkRefNestId(Integer compoundPkRefNestId) {
        registerModifiedProperty("compoundPkRefNestId");
        _compoundPkRefNestId = compoundPkRefNestId;
    }

    /**
     * [get] FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br>
     * @return The value of the column 'FOO_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFooMultipleId() {
        checkSpecifiedProperty("fooMultipleId");
        return _fooMultipleId;
    }

    /**
     * [set] FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br>
     * @param fooMultipleId The value of the column 'FOO_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFooMultipleId(Integer fooMultipleId) {
        registerModifiedProperty("fooMultipleId");
        _fooMultipleId = fooMultipleId;
    }

    /**
     * [get] BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br>
     * @return The value of the column 'BAR_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBarMultipleId() {
        checkSpecifiedProperty("barMultipleId");
        return _barMultipleId;
    }

    /**
     * [set] BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br>
     * @param barMultipleId The value of the column 'BAR_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBarMultipleId(Integer barMultipleId) {
        registerModifiedProperty("barMultipleId");
        _barMultipleId = barMultipleId;
    }

    /**
     * [get] QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref} <br>
     * @return The value of the column 'QUX_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuxMultipleId() {
        checkSpecifiedProperty("quxMultipleId");
        return _quxMultipleId;
    }

    /**
     * [set] QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref} <br>
     * @param quxMultipleId The value of the column 'QUX_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setQuxMultipleId(Integer quxMultipleId) {
        registerModifiedProperty("quxMultipleId");
        _quxMultipleId = quxMultipleId;
    }

    /**
     * [get] NEST_NAME: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'NEST_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getNestName() {
        checkSpecifiedProperty("nestName");
        return _nestName;
    }

    /**
     * [set] NEST_NAME: {NotNull, VARCHAR(50)} <br>
     * @param nestName The value of the column 'NEST_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setNestName(String nestName) {
        registerModifiedProperty("nestName");
        _nestName = nestName;
    }
}
