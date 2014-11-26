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
 * The entity of WHITE_VARIANT_RELATION_REFERRER_REF as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, REFERRER_ID
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_variant_relation_referrer
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteVariantRelationReferrer
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refId = entity.getRefId();
 * Long referrerId = entity.getReferrerId();
 * entity.setRefId(refId);
 * entity.setReferrerId(referrerId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrerRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _refId;

    /** REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer} */
    protected Long _referrerId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_variant_relation_referrer_ref";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'. */
    protected OptionalEntity<WhiteVariantRelationReferrer> _whiteVariantRelationReferrer;

    /**
     * [get] white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationReferrer'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationReferrer> getWhiteVariantRelationReferrer() {
        if (_whiteVariantRelationReferrer == null) { _whiteVariantRelationReferrer = OptionalEntity.relationEmpty(this, "whiteVariantRelationReferrer"); }
        return _whiteVariantRelationReferrer;
    }

    /**
     * [set] white_variant_relation_referrer by my REFERRER_ID, named 'whiteVariantRelationReferrer'.
     * @param whiteVariantRelationReferrer The entity of foreign property 'whiteVariantRelationReferrer'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrer(OptionalEntity<WhiteVariantRelationReferrer> whiteVariantRelationReferrer) {
        _whiteVariantRelationReferrer = whiteVariantRelationReferrer;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteVariantRelationReferrerRef) {
            BsWhiteVariantRelationReferrerRef other = (BsWhiteVariantRelationReferrerRef)obj;
            if (!xSV(_refId, other._refId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _refId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrer != null && _whiteVariantRelationReferrer.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationReferrer, "whiteVariantRelationReferrer")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refId));
        sb.append(dm).append(xfND(_referrerId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrer != null && _whiteVariantRelationReferrer.isPresent())
        { sb.append(dm).append("whiteVariantRelationReferrer"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationReferrerRef clone() {
        return (WhiteVariantRelationReferrerRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefId() {
        checkSpecifiedProperty("refId");
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Long refId) {
        registerModifiedProperty("refId");
        _refId = refId;
    }

    /**
     * [get] REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer} <br>
     * @return The value of the column 'REFERRER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReferrerId() {
        checkSpecifiedProperty("referrerId");
        return _referrerId;
    }

    /**
     * [set] REFERRER_ID: {IX, NotNull, BIGINT(19), FK to white_variant_relation_referrer} <br>
     * @param referrerId The value of the column 'REFERRER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferrerId(Long referrerId) {
        registerModifiedProperty("referrerId");
        _referrerId = referrerId;
    }
}
