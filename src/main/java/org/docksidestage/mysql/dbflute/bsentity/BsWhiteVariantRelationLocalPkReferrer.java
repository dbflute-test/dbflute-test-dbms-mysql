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
 * The entity of WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REVERSEFK_SUPPRESSED_ID
 * 
 * [column]
 *     REVERSEFK_SUPPRESSED_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsBizManyToOneLikeBizOneToOne)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long reversefkSuppressedId = entity.getReversefkSuppressedId();
 * String masterTypeCode = entity.getMasterTypeCode();
 * entity.setReversefkSuppressedId(reversefkSuppressedId);
 * entity.setMasterTypeCode(masterTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationLocalPkReferrer extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} */
    protected Long _reversefkSuppressedId;

    /** MASTER_TYPE_CODE: {NotNull, CHAR(3)} */
    protected String _masterTypeCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_variant_relation_local_pk_referrer";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_reversefkSuppressedId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. */
    protected OptionalEntity<WhiteVariantRelationMasterFoo> _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;

    /**
     * [get] white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteVariantRelationMasterFoo> getWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        if (_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne == null) { _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne = OptionalEntity.relationEmpty(this, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); }
        return _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
    }

    /**
     * [set] white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
     * @param whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne The entity of foreign property 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(OptionalEntity<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne) {
        _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne = whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
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
        if (obj instanceof BsWhiteVariantRelationLocalPkReferrer) {
            BsWhiteVariantRelationLocalPkReferrer other = (BsWhiteVariantRelationLocalPkReferrer)obj;
            if (!xSV(_reversefkSuppressedId, other._reversefkSuppressedId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _reversefkSuppressedId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne != null && _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_reversefkSuppressedId));
        sb.append(dm).append(xfND(_masterTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne != null && _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne.isPresent())
        { sb.append(dm).append("whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationLocalPkReferrer clone() {
        return (WhiteVariantRelationLocalPkReferrer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br>
     * @return The value of the column 'REVERSEFK_SUPPRESSED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReversefkSuppressedId() {
        checkSpecifiedProperty("reversefkSuppressedId");
        return _reversefkSuppressedId;
    }

    /**
     * [set] REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br>
     * @param reversefkSuppressedId The value of the column 'REVERSEFK_SUPPRESSED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReversefkSuppressedId(Long reversefkSuppressedId) {
        registerModifiedProperty("reversefkSuppressedId");
        _reversefkSuppressedId = reversefkSuppressedId;
    }

    /**
     * [get] MASTER_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * @return The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterTypeCode() {
        checkSpecifiedProperty("masterTypeCode");
        return _masterTypeCode;
    }

    /**
     * [set] MASTER_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * @param masterTypeCode The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMasterTypeCode(String masterTypeCode) {
        registerModifiedProperty("masterTypeCode");
        _masterTypeCode = masterTypeCode;
    }
}
