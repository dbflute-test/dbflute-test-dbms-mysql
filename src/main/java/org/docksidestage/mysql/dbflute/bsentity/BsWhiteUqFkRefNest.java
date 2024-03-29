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
 * The entity of WHITE_UQ_FK_REF_NEST as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkRefNest extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqFkRefNestId;

    /** COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} */
    protected String _compoundUqSecondCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_uq_fk_ref_nest";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_uqFkRefNestId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'. */
    protected OptionalEntity<WhiteUqFkRef> _whiteUqFkRef;

    /**
     * [get] WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteUqFkRef'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteUqFkRef> getWhiteUqFkRef() {
        if (_whiteUqFkRef == null) { _whiteUqFkRef = OptionalEntity.relationEmpty(this, "whiteUqFkRef"); }
        return _whiteUqFkRef;
    }

    /**
     * [set] WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @param whiteUqFkRef The entity of foreign property 'whiteUqFkRef'. (NullAllowed)
     */
    public void setWhiteUqFkRef(OptionalEntity<WhiteUqFkRef> whiteUqFkRef) {
        _whiteUqFkRef = whiteUqFkRef;
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
        if (obj instanceof BsWhiteUqFkRefNest) {
            BsWhiteUqFkRefNest other = (BsWhiteUqFkRefNest)obj;
            if (!xSV(_uqFkRefNestId, other._uqFkRefNestId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _uqFkRefNestId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkRef != null && _whiteUqFkRef.isPresent())
        { sb.append(li).append(xbRDS(_whiteUqFkRef, "whiteUqFkRef")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkRefNestId));
        sb.append(dm).append(xfND(_compoundUqFirstCode));
        sb.append(dm).append(xfND(_compoundUqSecondCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkRef != null && _whiteUqFkRef.isPresent())
        { sb.append(dm).append("whiteUqFkRef"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFkRefNest clone() {
        return (WhiteUqFkRefNest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'UQ_FK_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefNestId() {
        checkSpecifiedProperty("uqFkRefNestId");
        return _uqFkRefNestId;
    }

    /**
     * [set] UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param uqFkRefNestId The value of the column 'UQ_FK_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefNestId(Long uqFkRefNestId) {
        registerModifiedProperty("uqFkRefNestId");
        _uqFkRefNestId = uqFkRefNestId;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} <br>
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        checkSpecifiedProperty("compoundUqFirstCode");
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} <br>
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        registerModifiedProperty("compoundUqFirstCode");
        _compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} <br>
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        checkSpecifiedProperty("compoundUqSecondCode");
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} <br>
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        registerModifiedProperty("compoundUqSecondCode");
        _compoundUqSecondCode = compoundUqSecondCode;
    }
}
