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
 * The entity of WHITE_VARIANT_RELATION_MASTER_FOO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MASTER_FOO_ID
 * 
 * [column]
 *     MASTER_FOO_ID, MASTER_FOO_NAME
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
 *     WHITE_VARIANT_RELATION_REFERRER(AsBizOneToOneForBizManyToOne), WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER(AsOne)
 * 
 * [referrer table]
 *     WHITE_VARIANT_RELATION_REFERRER, WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER
 * 
 * [foreign property]
 *     whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne, whiteVariantRelationLocalPkReferrerAsOne
 * 
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long masterFooId = entity.getMasterFooId();
 * String masterFooName = entity.getMasterFooName();
 * entity.setMasterFooId(masterFooId);
 * entity.setMasterFooName(masterFooName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterFoo extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER} */
    protected Long _masterFooId;

    /** MASTER_FOO_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterFooName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_variant_relation_master_foo";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_masterFooId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_VARIANT_RELATION_REFERRER by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. */
    protected OptionalEntity<WhiteVariantRelationReferrer> _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne;

    /**
     * [get] WHITE_VARIANT_RELATION_REFERRER by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationReferrer> getWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        if (_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne == null) { _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne = OptionalEntity.relationEmpty(this, "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); }
        return _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_REFERRER by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'.
     * @param whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne The entity of foreign property 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(OptionalEntity<WhiteVariantRelationReferrer> whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne) {
        _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne = whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne;
    }

    /** white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'. */
    protected OptionalEntity<WhiteVariantRelationLocalPkReferrer> _whiteVariantRelationLocalPkReferrerAsOne;

    /**
     * [get] white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteVariantRelationLocalPkReferrerAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationLocalPkReferrer> getWhiteVariantRelationLocalPkReferrerAsOne() {
        if (_whiteVariantRelationLocalPkReferrerAsOne == null) { _whiteVariantRelationLocalPkReferrerAsOne = OptionalEntity.relationEmpty(this, "whiteVariantRelationLocalPkReferrerAsOne"); }
        return _whiteVariantRelationLocalPkReferrerAsOne;
    }

    /**
     * [set] white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * @param whiteVariantRelationLocalPkReferrerAsOne The entity of foreign property(referrer-as-one) 'whiteVariantRelationLocalPkReferrerAsOne'. (NullAllowed)
     */
    public void setWhiteVariantRelationLocalPkReferrerAsOne(OptionalEntity<WhiteVariantRelationLocalPkReferrer> whiteVariantRelationLocalPkReferrerAsOne) {
        _whiteVariantRelationLocalPkReferrerAsOne = whiteVariantRelationLocalPkReferrerAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_VARIANT_RELATION_REFERRER by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'. */
    protected List<WhiteVariantRelationReferrer> _whiteVariantRelationReferrerAsVariantList;

    /**
     * [get] WHITE_VARIANT_RELATION_REFERRER by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @return The entity list of referrer property 'whiteVariantRelationReferrerAsVariantList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteVariantRelationReferrer> getWhiteVariantRelationReferrerAsVariantList() {
        if (_whiteVariantRelationReferrerAsVariantList == null) { _whiteVariantRelationReferrerAsVariantList = newReferrerList(); }
        return _whiteVariantRelationReferrerAsVariantList;
    }

    /**
     * [set] WHITE_VARIANT_RELATION_REFERRER by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @param whiteVariantRelationReferrerAsVariantList The entity list of referrer property 'whiteVariantRelationReferrerAsVariantList'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerAsVariantList) {
        _whiteVariantRelationReferrerAsVariantList = whiteVariantRelationReferrerAsVariantList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteVariantRelationMasterFoo) {
            BsWhiteVariantRelationMasterFoo other = (BsWhiteVariantRelationMasterFoo)obj;
            if (!xSV(_masterFooId, other._masterFooId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _masterFooId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne != null && _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne, "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne")); }
        if (_whiteVariantRelationLocalPkReferrerAsOne != null && _whiteVariantRelationLocalPkReferrerAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationLocalPkReferrerAsOne, "whiteVariantRelationLocalPkReferrerAsOne")); }
        if (_whiteVariantRelationReferrerAsVariantList != null) { for (WhiteVariantRelationReferrer et : _whiteVariantRelationReferrerAsVariantList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteVariantRelationReferrerAsVariantList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_masterFooId));
        sb.append(dm).append(xfND(_masterFooName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne != null && _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne.isPresent())
        { sb.append(dm).append("whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); }
        if (_whiteVariantRelationLocalPkReferrerAsOne != null && _whiteVariantRelationLocalPkReferrerAsOne.isPresent())
        { sb.append(dm).append("whiteVariantRelationLocalPkReferrerAsOne"); }
        if (_whiteVariantRelationReferrerAsVariantList != null && !_whiteVariantRelationReferrerAsVariantList.isEmpty())
        { sb.append(dm).append("whiteVariantRelationReferrerAsVariantList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationMasterFoo clone() {
        return (WhiteVariantRelationMasterFoo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER} <br>
     * @return The value of the column 'MASTER_FOO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterFooId() {
        checkSpecifiedProperty("masterFooId");
        return _masterFooId;
    }

    /**
     * [set] MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER} <br>
     * @param masterFooId The value of the column 'MASTER_FOO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterFooId(Long masterFooId) {
        registerModifiedProperty("masterFooId");
        _masterFooId = masterFooId;
    }

    /**
     * [get] MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MASTER_FOO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterFooName() {
        checkSpecifiedProperty("masterFooName");
        return _masterFooName;
    }

    /**
     * [set] MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br>
     * @param masterFooName The value of the column 'MASTER_FOO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterFooName(String masterFooName) {
        registerModifiedProperty("masterFooName");
        _masterFooName = masterFooName;
    }
}
