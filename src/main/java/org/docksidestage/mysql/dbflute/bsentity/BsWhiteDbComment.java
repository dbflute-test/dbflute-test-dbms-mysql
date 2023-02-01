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
 * The entity of WHITE_DB_COMMENT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDbComment extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)} */
    protected String _dbCommentCode;

    /** (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)} */
    protected String _dbCommentName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_db_comment";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dbCommentCode == null) { return false; }
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
        if (obj instanceof BsWhiteDbComment) {
            BsWhiteDbComment other = (BsWhiteDbComment)obj;
            if (!xSV(_dbCommentCode, other._dbCommentCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dbCommentCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dbCommentCode));
        sb.append(dm).append(xfND(_dbCommentName));
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
    public WhiteDbComment clone() {
        return (WhiteDbComment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)} <br>
     * this is normal comment.
     * @return The value of the column 'DB_COMMENT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDbCommentCode() {
        checkSpecifiedProperty("dbCommentCode");
        return _dbCommentCode;
    }

    /**
     * [set] (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)} <br>
     * this is normal comment.
     * @param dbCommentCode The value of the column 'DB_COMMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setDbCommentCode(String dbCommentCode) {
        registerModifiedProperty("dbCommentCode");
        _dbCommentCode = dbCommentCode;
    }

    /**
     * [get] (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)} <br>
     * e.g. /*BEGIN&#42;/, @ @foo &lt;br&gt;
     * @return The value of the column 'DB_COMMENT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDbCommentName() {
        checkSpecifiedProperty("dbCommentName");
        return _dbCommentName;
    }

    /**
     * [set] (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)} <br>
     * e.g. /*BEGIN&#42;/, @ @foo &lt;br&gt;
     * @param dbCommentName The value of the column 'DB_COMMENT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDbCommentName(String dbCommentName) {
        registerModifiedProperty("dbCommentName");
        _dbCommentName = dbCommentName;
    }
}
