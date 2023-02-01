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
 * The entity of WHITE_SELF_REFERENCE_REF_ONE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceRefOne extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} */
    protected Long _selfReferenceId;

    /** SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _selfReferenceRefOneName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_self_reference_ref_one";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_selfReferenceId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReference'. */
    protected OptionalEntity<WhiteSelfReference> _whiteSelfReference;

    /**
     * [get] WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReference'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSelfReference'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSelfReference> getWhiteSelfReference() {
        if (_whiteSelfReference == null) { _whiteSelfReference = OptionalEntity.relationEmpty(this, "whiteSelfReference"); }
        return _whiteSelfReference;
    }

    /**
     * [set] WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @param whiteSelfReference The entity of foreign property 'whiteSelfReference'. (NullAllowed)
     */
    public void setWhiteSelfReference(OptionalEntity<WhiteSelfReference> whiteSelfReference) {
        _whiteSelfReference = whiteSelfReference;
    }

    /** WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'. */
    protected OptionalEntity<WhiteSelfReference> _whiteSelfReferenceAsDirectParent;

    /**
     * [get] WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSelfReferenceAsDirectParent'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSelfReference> getWhiteSelfReferenceAsDirectParent() {
        if (_whiteSelfReferenceAsDirectParent == null) { _whiteSelfReferenceAsDirectParent = OptionalEntity.relationEmpty(this, "whiteSelfReferenceAsDirectParent"); }
        return _whiteSelfReferenceAsDirectParent;
    }

    /**
     * [set] WHITE_SELF_REFERENCE by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @param whiteSelfReferenceAsDirectParent The entity of foreign property 'whiteSelfReferenceAsDirectParent'. (NullAllowed)
     */
    public void setWhiteSelfReferenceAsDirectParent(OptionalEntity<WhiteSelfReference> whiteSelfReferenceAsDirectParent) {
        _whiteSelfReferenceAsDirectParent = whiteSelfReferenceAsDirectParent;
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
        if (obj instanceof BsWhiteSelfReferenceRefOne) {
            BsWhiteSelfReferenceRefOne other = (BsWhiteSelfReferenceRefOne)obj;
            if (!xSV(_selfReferenceId, other._selfReferenceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _selfReferenceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReference != null && _whiteSelfReference.isPresent())
        { sb.append(li).append(xbRDS(_whiteSelfReference, "whiteSelfReference")); }
        if (_whiteSelfReferenceAsDirectParent != null && _whiteSelfReferenceAsDirectParent.isPresent())
        { sb.append(li).append(xbRDS(_whiteSelfReferenceAsDirectParent, "whiteSelfReferenceAsDirectParent")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_selfReferenceId));
        sb.append(dm).append(xfND(_selfReferenceRefOneName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReference != null && _whiteSelfReference.isPresent())
        { sb.append(dm).append("whiteSelfReference"); }
        if (_whiteSelfReferenceAsDirectParent != null && _whiteSelfReferenceAsDirectParent.isPresent())
        { sb.append(dm).append("whiteSelfReferenceAsDirectParent"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSelfReferenceRefOne clone() {
        return (WhiteSelfReferenceRefOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} <br>
     * @return The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSelfReferenceId() {
        checkSpecifiedProperty("selfReferenceId");
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} <br>
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceId(Long selfReferenceId) {
        registerModifiedProperty("selfReferenceId");
        _selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SELF_REFERENCE_REF_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelfReferenceRefOneName() {
        checkSpecifiedProperty("selfReferenceRefOneName");
        return _selfReferenceRefOneName;
    }

    /**
     * [set] SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param selfReferenceRefOneName The value of the column 'SELF_REFERENCE_REF_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceRefOneName(String selfReferenceRefOneName) {
        registerModifiedProperty("selfReferenceRefOneName");
        _selfReferenceRefOneName = selfReferenceRefOneName;
    }
}
