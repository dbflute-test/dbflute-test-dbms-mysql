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
 * The entity of WHITE_PERROTTA_OVER_TRACE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverTrace extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRACE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _traceId;

    /** PREVIOUS_PRODUCT_ID: {UQ+, NotNull, INT(10), FK to white_perrotta_over_product} */
    protected Integer _previousProductId;

    /** NEXT_PRODUCT_ID: {+UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product} */
    protected Integer _nextProductId;

    /** TRACE_TYPE_CODE: {NotNull, CHAR(3)} */
    protected String _traceTypeCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_perrotta_over_trace";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_traceId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param previousProductId : UQ+, NotNull, INT(10), FK to white_perrotta_over_product. (NotNull)
     * @param nextProductId : +UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product. (NotNull)
     */
    public void uniqueBy(Integer previousProductId, Integer nextProductId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("previousProductId");
        __uniqueDrivenProperties.addPropertyName("nextProductId");
        setPreviousProductId(previousProductId);setNextProductId(nextProductId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'. */
    protected OptionalEntity<WhitePerrottaOverProduct> _whitePerrottaOverProductByNextProductId;

    /**
     * [get] WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePerrottaOverProductByNextProductId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePerrottaOverProduct> getWhitePerrottaOverProductByNextProductId() {
        if (_whitePerrottaOverProductByNextProductId == null) { _whitePerrottaOverProductByNextProductId = OptionalEntity.relationEmpty(this, "whitePerrottaOverProductByNextProductId"); }
        return _whitePerrottaOverProductByNextProductId;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_PRODUCT by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * @param whitePerrottaOverProductByNextProductId The entity of foreign property 'whitePerrottaOverProductByNextProductId'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductByNextProductId(OptionalEntity<WhitePerrottaOverProduct> whitePerrottaOverProductByNextProductId) {
        _whitePerrottaOverProductByNextProductId = whitePerrottaOverProductByNextProductId;
    }

    /** WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'. */
    protected OptionalEntity<WhitePerrottaOverProduct> _whitePerrottaOverProductByPreviousProductId;

    /**
     * [get] WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePerrottaOverProductByPreviousProductId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePerrottaOverProduct> getWhitePerrottaOverProductByPreviousProductId() {
        if (_whitePerrottaOverProductByPreviousProductId == null) { _whitePerrottaOverProductByPreviousProductId = OptionalEntity.relationEmpty(this, "whitePerrottaOverProductByPreviousProductId"); }
        return _whitePerrottaOverProductByPreviousProductId;
    }

    /**
     * [set] WHITE_PERROTTA_OVER_PRODUCT by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * @param whitePerrottaOverProductByPreviousProductId The entity of foreign property 'whitePerrottaOverProductByPreviousProductId'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductByPreviousProductId(OptionalEntity<WhitePerrottaOverProduct> whitePerrottaOverProductByPreviousProductId) {
        _whitePerrottaOverProductByPreviousProductId = whitePerrottaOverProductByPreviousProductId;
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
        if (obj instanceof BsWhitePerrottaOverTrace) {
            BsWhitePerrottaOverTrace other = (BsWhitePerrottaOverTrace)obj;
            if (!xSV(_traceId, other._traceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _traceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductByNextProductId != null && _whitePerrottaOverProductByNextProductId.isPresent())
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductByNextProductId, "whitePerrottaOverProductByNextProductId")); }
        if (_whitePerrottaOverProductByPreviousProductId != null && _whitePerrottaOverProductByPreviousProductId.isPresent())
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductByPreviousProductId, "whitePerrottaOverProductByPreviousProductId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_traceId));
        sb.append(dm).append(xfND(_previousProductId));
        sb.append(dm).append(xfND(_nextProductId));
        sb.append(dm).append(xfND(_traceTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductByNextProductId != null && _whitePerrottaOverProductByNextProductId.isPresent())
        { sb.append(dm).append("whitePerrottaOverProductByNextProductId"); }
        if (_whitePerrottaOverProductByPreviousProductId != null && _whitePerrottaOverProductByPreviousProductId.isPresent())
        { sb.append(dm).append("whitePerrottaOverProductByPreviousProductId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverTrace clone() {
        return (WhitePerrottaOverTrace)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRACE_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TRACE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTraceId() {
        checkSpecifiedProperty("traceId");
        return _traceId;
    }

    /**
     * [set] TRACE_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param traceId The value of the column 'TRACE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTraceId(Long traceId) {
        registerModifiedProperty("traceId");
        _traceId = traceId;
    }

    /**
     * [get] PREVIOUS_PRODUCT_ID: {UQ+, NotNull, INT(10), FK to white_perrotta_over_product} <br>
     * @return The value of the column 'PREVIOUS_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPreviousProductId() {
        checkSpecifiedProperty("previousProductId");
        return _previousProductId;
    }

    /**
     * [set] PREVIOUS_PRODUCT_ID: {UQ+, NotNull, INT(10), FK to white_perrotta_over_product} <br>
     * @param previousProductId The value of the column 'PREVIOUS_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPreviousProductId(Integer previousProductId) {
        registerModifiedProperty("previousProductId");
        _previousProductId = previousProductId;
    }

    /**
     * [get] NEXT_PRODUCT_ID: {+UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product} <br>
     * @return The value of the column 'NEXT_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNextProductId() {
        checkSpecifiedProperty("nextProductId");
        return _nextProductId;
    }

    /**
     * [set] NEXT_PRODUCT_ID: {+UQ, IX, NotNull, INT(10), FK to white_perrotta_over_product} <br>
     * @param nextProductId The value of the column 'NEXT_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextProductId(Integer nextProductId) {
        registerModifiedProperty("nextProductId");
        _nextProductId = nextProductId;
    }

    /**
     * [get] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * @return The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getTraceTypeCode() {
        checkSpecifiedProperty("traceTypeCode");
        return _traceTypeCode;
    }

    /**
     * [set] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br>
     * @param traceTypeCode The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setTraceTypeCode(String traceTypeCode) {
        registerModifiedProperty("traceTypeCode");
        _traceTypeCode = traceTypeCode;
    }
}
