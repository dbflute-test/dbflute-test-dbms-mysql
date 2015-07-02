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
 * The entity of WHITE_PG_RESERV_REF as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, CLASS
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
 *     WHITE_PG_RESERV
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whitePgReserv
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer refId = entity.getRefId();
 * Integer classSynonym = entity.getClassSynonym();
 * entity.setRefId(refId);
 * entity.setClassSynonym(classSynonym);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_ID: {PK, NotNull, INT(10)} */
    protected Integer _refId;

    /** ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} */
    protected Integer _classSynonym;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_pg_reserv_ref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_PG_RESERV by my CLASS, named 'whitePgReserv'. */
    protected OptionalEntity<WhitePgReserv> _whitePgReserv;

    /**
     * [get] WHITE_PG_RESERV by my CLASS, named 'whitePgReserv'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whitePgReserv'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhitePgReserv> getWhitePgReserv() {
        if (_whitePgReserv == null) { _whitePgReserv = OptionalEntity.relationEmpty(this, "whitePgReserv"); }
        return _whitePgReserv;
    }

    /**
     * [set] WHITE_PG_RESERV by my CLASS, named 'whitePgReserv'.
     * @param whitePgReserv The entity of foreign property 'whitePgReserv'. (NullAllowed)
     */
    public void setWhitePgReserv(OptionalEntity<WhitePgReserv> whitePgReserv) {
        _whitePgReserv = whitePgReserv;
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
        if (obj instanceof BsWhitePgReservRef) {
            BsWhitePgReservRef other = (BsWhitePgReservRef)obj;
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
        if (_whitePgReserv != null && _whitePgReserv.isPresent())
        { sb.append(li).append(xbRDS(_whitePgReserv, "whitePgReserv")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refId));
        sb.append(dm).append(xfND(_classSynonym));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePgReserv != null && _whitePgReserv.isPresent())
        { sb.append(dm).append("whitePgReserv"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePgReservRef clone() {
        return (WhitePgReservRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefId() {
        checkSpecifiedProperty("refId");
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, INT(10)} <br>
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Integer refId) {
        registerModifiedProperty("refId");
        _refId = refId;
    }

    /**
     * [get] ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} <br>
     * @return The value of the column 'CLASS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getClassSynonym() {
        checkSpecifiedProperty("classSynonym");
        return _classSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} <br>
     * @param classSynonym The value of the column 'CLASS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClassSynonym(Integer classSynonym) {
        registerModifiedProperty("classSynonym");
        _classSynonym = classSynonym;
    }
}
