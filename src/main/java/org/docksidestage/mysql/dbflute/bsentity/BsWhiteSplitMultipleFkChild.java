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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_CHILD as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkChild extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CHILD_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _childId;

    /** BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} */
    protected Long _baseId;

    /** CHILD_NAME: {NotNull, VARCHAR(200)} */
    protected String _childName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_split_multiple_fk_child";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_childId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_SPLIT_MULTIPLE_FK_BASE by my BASE_ID, named 'whiteSplitMultipleFkBase'. */
    protected OptionalEntity<WhiteSplitMultipleFkBase> _whiteSplitMultipleFkBase;

    /**
     * [get] WHITE_SPLIT_MULTIPLE_FK_BASE by my BASE_ID, named 'whiteSplitMultipleFkBase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSplitMultipleFkBase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSplitMultipleFkBase> getWhiteSplitMultipleFkBase() {
        if (_whiteSplitMultipleFkBase == null) { _whiteSplitMultipleFkBase = OptionalEntity.relationEmpty(this, "whiteSplitMultipleFkBase"); }
        return _whiteSplitMultipleFkBase;
    }

    /**
     * [set] WHITE_SPLIT_MULTIPLE_FK_BASE by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @param whiteSplitMultipleFkBase The entity of foreign property 'whiteSplitMultipleFkBase'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkBase(OptionalEntity<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBase) {
        _whiteSplitMultipleFkBase = whiteSplitMultipleFkBase;
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
        if (obj instanceof BsWhiteSplitMultipleFkChild) {
            BsWhiteSplitMultipleFkChild other = (BsWhiteSplitMultipleFkChild)obj;
            if (!xSV(_childId, other._childId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _childId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBase != null && _whiteSplitMultipleFkBase.isPresent())
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkBase, "whiteSplitMultipleFkBase")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_childId));
        sb.append(dm).append(xfND(_baseId));
        sb.append(dm).append(xfND(_childName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBase != null && _whiteSplitMultipleFkBase.isPresent())
        { sb.append(dm).append("whiteSplitMultipleFkBase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSplitMultipleFkChild clone() {
        return (WhiteSplitMultipleFkChild)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CHILD_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'CHILD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getChildId() {
        checkSpecifiedProperty("childId");
        return _childId;
    }

    /**
     * [set] CHILD_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param childId The value of the column 'CHILD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setChildId(Long childId) {
        registerModifiedProperty("childId");
        _childId = childId;
    }

    /**
     * [get] BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} <br>
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBaseId() {
        checkSpecifiedProperty("baseId");
        return _baseId;
    }

    /**
     * [set] BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} <br>
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Long baseId) {
        registerModifiedProperty("baseId");
        _baseId = baseId;
    }

    /**
     * [get] CHILD_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'CHILD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getChildName() {
        checkSpecifiedProperty("childName");
        return _childName;
    }

    /**
     * [set] CHILD_NAME: {NotNull, VARCHAR(200)} <br>
     * @param childName The value of the column 'CHILD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setChildName(String childName) {
        registerModifiedProperty("childName");
        _childName = childName;
    }
}
