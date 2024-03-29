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
 * The entity of WHITE_COMPOUND_PK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY} */
    protected Integer _pkFirstId;

    /** PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY} */
    protected Integer _pkSecondId;

    /** COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} */
    protected String _compoundPkName;

    /** REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY} */
    protected Integer _referredId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_compound_pk";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_pkFirstId == null) { return false; }
        if (_pkSecondId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @param referredId : +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY. (NotNull)
     */
    public void uniqueByPkSecondIdReferredId(Integer pkSecondId, Integer referredId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("pkSecondId");
        __uniqueDrivenProperties.addPropertyName("referredId");
        setPkSecondId(pkSecondId);setReferredId(referredId);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @param pkFirstId : PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY. (NotNull)
     */
    public void uniqueByPkSecondIdPkFirstId(Integer pkSecondId, Integer pkFirstId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("pkSecondId");
        __uniqueDrivenProperties.addPropertyName("pkFirstId");
        setPkSecondId(pkSecondId);setPkFirstId(pkFirstId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_COMPOUND_REFERRED_NORMALLY by my REFERRED_ID, named 'whiteCompoundReferredNormally'. */
    protected OptionalEntity<WhiteCompoundReferredNormally> _whiteCompoundReferredNormally;

    /**
     * [get] WHITE_COMPOUND_REFERRED_NORMALLY by my REFERRED_ID, named 'whiteCompoundReferredNormally'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundReferredNormally'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundReferredNormally> getWhiteCompoundReferredNormally() {
        if (_whiteCompoundReferredNormally == null) { _whiteCompoundReferredNormally = OptionalEntity.relationEmpty(this, "whiteCompoundReferredNormally"); }
        return _whiteCompoundReferredNormally;
    }

    /**
     * [set] WHITE_COMPOUND_REFERRED_NORMALLY by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
     * @param whiteCompoundReferredNormally The entity of foreign property 'whiteCompoundReferredNormally'. (NullAllowed)
     */
    public void setWhiteCompoundReferredNormally(OptionalEntity<WhiteCompoundReferredNormally> whiteCompoundReferredNormally) {
        _whiteCompoundReferredNormally = whiteCompoundReferredNormally;
    }

    /** WHITE_COMPOUND_REFERRED_PRIMARY by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'. */
    protected OptionalEntity<WhiteCompoundReferredPrimary> _whiteCompoundReferredPrimary;

    /**
     * [get] WHITE_COMPOUND_REFERRED_PRIMARY by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundReferredPrimary'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundReferredPrimary> getWhiteCompoundReferredPrimary() {
        if (_whiteCompoundReferredPrimary == null) { _whiteCompoundReferredPrimary = OptionalEntity.relationEmpty(this, "whiteCompoundReferredPrimary"); }
        return _whiteCompoundReferredPrimary;
    }

    /**
     * [set] WHITE_COMPOUND_REFERRED_PRIMARY by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * @param whiteCompoundReferredPrimary The entity of foreign property 'whiteCompoundReferredPrimary'. (NullAllowed)
     */
    public void setWhiteCompoundReferredPrimary(OptionalEntity<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimary) {
        _whiteCompoundReferredPrimary = whiteCompoundReferredPrimary;
    }

    /** WHITE_COMPOUND_PK_REF_MANY by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'. */
    protected OptionalEntity<WhiteCompoundPkRefMany> _whiteCompoundPkRefManyAsMax;

    /**
     * [get] WHITE_COMPOUND_PK_REF_MANY by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundPkRefManyAsMax'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundPkRefMany> getWhiteCompoundPkRefManyAsMax() {
        if (_whiteCompoundPkRefManyAsMax == null) { _whiteCompoundPkRefManyAsMax = OptionalEntity.relationEmpty(this, "whiteCompoundPkRefManyAsMax"); }
        return _whiteCompoundPkRefManyAsMax;
    }

    /**
     * [set] WHITE_COMPOUND_PK_REF_MANY by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * @param whiteCompoundPkRefManyAsMax The entity of foreign property 'whiteCompoundPkRefManyAsMax'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefManyAsMax(OptionalEntity<WhiteCompoundPkRefMany> whiteCompoundPkRefManyAsMax) {
        _whiteCompoundPkRefManyAsMax = whiteCompoundPkRefManyAsMax;
    }

    /** WHITE_COMPOUND_PK_REF_MANY by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'. */
    protected OptionalEntity<WhiteCompoundPkRefMany> _whiteCompoundPkRefManyAsMin;

    /**
     * [get] WHITE_COMPOUND_PK_REF_MANY by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundPkRefManyAsMin'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundPkRefMany> getWhiteCompoundPkRefManyAsMin() {
        if (_whiteCompoundPkRefManyAsMin == null) { _whiteCompoundPkRefManyAsMin = OptionalEntity.relationEmpty(this, "whiteCompoundPkRefManyAsMin"); }
        return _whiteCompoundPkRefManyAsMin;
    }

    /**
     * [set] WHITE_COMPOUND_PK_REF_MANY by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * @param whiteCompoundPkRefManyAsMin The entity of foreign property 'whiteCompoundPkRefManyAsMin'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefManyAsMin(OptionalEntity<WhiteCompoundPkRefMany> whiteCompoundPkRefManyAsMin) {
        _whiteCompoundPkRefManyAsMin = whiteCompoundPkRefManyAsMin;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_COMPOUND_PK_REF by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'. */
    protected List<WhiteCompoundPkRef> _whiteCompoundPkRefList;

    /**
     * [get] WHITE_COMPOUND_PK_REF by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRef> getWhiteCompoundPkRefList() {
        if (_whiteCompoundPkRefList == null) { _whiteCompoundPkRefList = newReferrerList(); }
        return _whiteCompoundPkRefList;
    }

    /**
     * [set] WHITE_COMPOUND_PK_REF by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * @param whiteCompoundPkRefList The entity list of referrer property 'whiteCompoundPkRefList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefList(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        _whiteCompoundPkRefList = whiteCompoundPkRefList;
    }

    /** WHITE_COMPOUND_PK_REF_MANY by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'. */
    protected List<WhiteCompoundPkRefMany> _whiteCompoundPkRefManyToPKList;

    /**
     * [get] WHITE_COMPOUND_PK_REF_MANY by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefManyToPKList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRefMany> getWhiteCompoundPkRefManyToPKList() {
        if (_whiteCompoundPkRefManyToPKList == null) { _whiteCompoundPkRefManyToPKList = newReferrerList(); }
        return _whiteCompoundPkRefManyToPKList;
    }

    /**
     * [set] WHITE_COMPOUND_PK_REF_MANY by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * @param whiteCompoundPkRefManyToPKList The entity list of referrer property 'whiteCompoundPkRefManyToPKList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefManyToPKList(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyToPKList) {
        _whiteCompoundPkRefManyToPKList = whiteCompoundPkRefManyToPKList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteCompoundPk) {
            BsWhiteCompoundPk other = (BsWhiteCompoundPk)obj;
            if (!xSV(_pkFirstId, other._pkFirstId)) { return false; }
            if (!xSV(_pkSecondId, other._pkSecondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pkFirstId);
        hs = xCH(hs, _pkSecondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundReferredNormally != null && _whiteCompoundReferredNormally.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundReferredNormally, "whiteCompoundReferredNormally")); }
        if (_whiteCompoundReferredPrimary != null && _whiteCompoundReferredPrimary.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundReferredPrimary, "whiteCompoundReferredPrimary")); }
        if (_whiteCompoundPkRefManyAsMax != null && _whiteCompoundPkRefManyAsMax.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefManyAsMax, "whiteCompoundPkRefManyAsMax")); }
        if (_whiteCompoundPkRefManyAsMin != null && _whiteCompoundPkRefManyAsMin.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefManyAsMin, "whiteCompoundPkRefManyAsMin")); }
        if (_whiteCompoundPkRefList != null) { for (WhiteCompoundPkRef et : _whiteCompoundPkRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefList")); } } }
        if (_whiteCompoundPkRefManyToPKList != null) { for (WhiteCompoundPkRefMany et : _whiteCompoundPkRefManyToPKList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefManyToPKList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pkFirstId));
        sb.append(dm).append(xfND(_pkSecondId));
        sb.append(dm).append(xfND(_compoundPkName));
        sb.append(dm).append(xfND(_referredId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundReferredNormally != null && _whiteCompoundReferredNormally.isPresent())
        { sb.append(dm).append("whiteCompoundReferredNormally"); }
        if (_whiteCompoundReferredPrimary != null && _whiteCompoundReferredPrimary.isPresent())
        { sb.append(dm).append("whiteCompoundReferredPrimary"); }
        if (_whiteCompoundPkRefManyAsMax != null && _whiteCompoundPkRefManyAsMax.isPresent())
        { sb.append(dm).append("whiteCompoundPkRefManyAsMax"); }
        if (_whiteCompoundPkRefManyAsMin != null && _whiteCompoundPkRefManyAsMin.isPresent())
        { sb.append(dm).append("whiteCompoundPkRefManyAsMin"); }
        if (_whiteCompoundPkRefList != null && !_whiteCompoundPkRefList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkRefList"); }
        if (_whiteCompoundPkRefManyToPKList != null && !_whiteCompoundPkRefManyToPKList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkRefManyToPKList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPk clone() {
        return (WhiteCompoundPk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY} <br>
     * @return The value of the column 'PK_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkFirstId() {
        checkSpecifiedProperty("pkFirstId");
        return _pkFirstId;
    }

    /**
     * [set] PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY} <br>
     * @param pkFirstId The value of the column 'PK_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPkFirstId(Integer pkFirstId) {
        registerModifiedProperty("pkFirstId");
        _pkFirstId = pkFirstId;
    }

    /**
     * [get] PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY} <br>
     * @return The value of the column 'PK_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkSecondId() {
        checkSpecifiedProperty("pkSecondId");
        return _pkSecondId;
    }

    /**
     * [set] PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY} <br>
     * @param pkSecondId The value of the column 'PK_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPkSecondId(Integer pkSecondId) {
        registerModifiedProperty("pkSecondId");
        _pkSecondId = pkSecondId;
    }

    /**
     * [get] COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'COMPOUND_PK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundPkName() {
        checkSpecifiedProperty("compoundPkName");
        return _compoundPkName;
    }

    /**
     * [set] COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param compoundPkName The value of the column 'COMPOUND_PK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundPkName(String compoundPkName) {
        registerModifiedProperty("compoundPkName");
        _compoundPkName = compoundPkName;
    }

    /**
     * [get] REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY} <br>
     * @return The value of the column 'REFERRED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReferredId() {
        checkSpecifiedProperty("referredId");
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY} <br>
     * @param referredId The value of the column 'REFERRED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferredId(Integer referredId) {
        registerModifiedProperty("referredId");
        _referredId = referredId;
    }
}
