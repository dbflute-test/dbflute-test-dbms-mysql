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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_TABLE_EXCEPT_GEN_HEAD as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTableExceptGenHead extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _genHeadId;

    /** GEN_HEAD_NAME: {NotNull, VARCHAR(200)} */
    protected String _genHeadName;

    /** NOMETA_ID: {IX, DECIMAL(16)} */
    protected Long _nometaId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_table_except_gen_head";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_genHeadId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsWhiteTableExceptGenHead) {
            BsWhiteTableExceptGenHead other = (BsWhiteTableExceptGenHead)obj;
            if (!xSV(_genHeadId, other._genHeadId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _genHeadId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genHeadId));
        sb.append(dm).append(xfND(_genHeadName));
        sb.append(dm).append(xfND(_nometaId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteTableExceptGenHead clone() {
        return (WhiteTableExceptGenHead)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'GEN_HEAD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGenHeadId() {
        checkSpecifiedProperty("genHeadId");
        return _genHeadId;
    }

    /**
     * [set] GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param genHeadId The value of the column 'GEN_HEAD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGenHeadId(Long genHeadId) {
        registerModifiedProperty("genHeadId");
        _genHeadId = genHeadId;
    }

    /**
     * [get] GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'GEN_HEAD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenHeadName() {
        checkSpecifiedProperty("genHeadName");
        return _genHeadName;
    }

    /**
     * [set] GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br>
     * @param genHeadName The value of the column 'GEN_HEAD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenHeadName(String genHeadName) {
        registerModifiedProperty("genHeadName");
        _genHeadName = genHeadName;
    }

    /**
     * [get] NOMETA_ID: {IX, DECIMAL(16)} <br>
     * @return The value of the column 'NOMETA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNometaId() {
        checkSpecifiedProperty("nometaId");
        return _nometaId;
    }

    /**
     * [set] NOMETA_ID: {IX, DECIMAL(16)} <br>
     * @param nometaId The value of the column 'NOMETA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNometaId(Long nometaId) {
        registerModifiedProperty("nometaId");
        _nometaId = nometaId;
    }
}
