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
 * The entity of WHITE_SUPPRESS_DEF_CHECK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressDefCheck extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DEF_CHECK_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _defCheckId;

    /** DEF_CHECK_NAME: {NotNull, VARCHAR(200)} */
    protected String _defCheckName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_suppress_def_check";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_defCheckId == null) { return false; }
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
        if (obj instanceof BsWhiteSuppressDefCheck) {
            BsWhiteSuppressDefCheck other = (BsWhiteSuppressDefCheck)obj;
            if (!xSV(_defCheckId, other._defCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _defCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_defCheckId));
        sb.append(dm).append(xfND(_defCheckName));
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
    public WhiteSuppressDefCheck clone() {
        return (WhiteSuppressDefCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEF_CHECK_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'DEF_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDefCheckId() {
        checkSpecifiedProperty("defCheckId");
        return _defCheckId;
    }

    /**
     * [set] DEF_CHECK_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param defCheckId The value of the column 'DEF_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDefCheckId(Long defCheckId) {
        registerModifiedProperty("defCheckId");
        _defCheckId = defCheckId;
    }

    /**
     * [get] DEF_CHECK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEF_CHECK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDefCheckName() {
        checkSpecifiedProperty("defCheckName");
        return _defCheckName;
    }

    /**
     * [set] DEF_CHECK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param defCheckName The value of the column 'DEF_CHECK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDefCheckName(String defCheckName) {
        registerModifiedProperty("defCheckName");
        _defCheckName = defCheckName;
    }
}
