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
import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_ESCAPED_DFPROP as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteEscapedDfprop extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} */
    protected String _escapedDfpropCode;

    /** ESCAPED_DFPROP_NAME: {VARCHAR(20)} */
    protected String _escapedDfpropName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_escaped_dfprop";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_escapedDfpropCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of escapedDfpropCode as the classification of EscapedDfpropCls. <br>
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br>
     * delimiter; &amp; endBrace} &amp; path\foo\bar
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EscapedDfpropCls getEscapedDfpropCodeAsEscapedDfpropCls() {
        return CDef.EscapedDfpropCls.of(getEscapedDfpropCode()).orElse(null);
    }

    /**
     * Set the value of escapedDfpropCode as the classification of EscapedDfpropCls. <br>
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br>
     * delimiter; &amp; endBrace} &amp; path\foo\bar
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls cdef) {
        setEscapedDfpropCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of escapedDfpropCode as First (;@\\). <br>
     * First: delimiter &amp; rear escape char
     */
    public void setEscapedDfpropCode_First() {
        setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls.First);
    }

    /**
     * Set the value of escapedDfpropCode as Second (\\};). <br>
     * Second: escape char &amp; endBrace &amp; delimiter
     */
    public void setEscapedDfpropCode_Second() {
        setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls.Second);
    }

    /**
     * Set the value of escapedDfpropCode as Third ({=}). <br>
     * Third: startBrace &amp; equal &amp; endBrace
     */
    public void setEscapedDfpropCode_Third() {
        setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls.Third);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of escapedDfpropCode First? <br>
     * First: delimiter &amp; rear escape char
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedDfpropCodeFirst() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.equals(CDef.EscapedDfpropCls.First) : false;
    }

    /**
     * Is the value of escapedDfpropCode Second? <br>
     * Second: escape char &amp; endBrace &amp; delimiter
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedDfpropCodeSecond() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.equals(CDef.EscapedDfpropCls.Second) : false;
    }

    /**
     * Is the value of escapedDfpropCode Third? <br>
     * Third: startBrace &amp; equal &amp; endBrace
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedDfpropCodeThird() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.equals(CDef.EscapedDfpropCls.Third) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'escapedDfpropCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEscapedDfpropCodeName() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsWhiteEscapedDfprop) {
            BsWhiteEscapedDfprop other = (BsWhiteEscapedDfprop)obj;
            if (!xSV(_escapedDfpropCode, other._escapedDfpropCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _escapedDfpropCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_escapedDfpropCode));
        sb.append(dm).append(xfND(_escapedDfpropName));
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
    public WhiteEscapedDfprop clone() {
        return (WhiteEscapedDfprop)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br>
     * @return The value of the column 'ESCAPED_DFPROP_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getEscapedDfpropCode() {
        checkSpecifiedProperty("escapedDfpropCode");
        return _escapedDfpropCode;
    }

    /**
     * [set] ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br>
     * @param escapedDfpropCode The value of the column 'ESCAPED_DFPROP_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setEscapedDfpropCode(String escapedDfpropCode) {
        checkClassificationCode("ESCAPED_DFPROP_CODE", CDef.DefMeta.EscapedDfpropCls, escapedDfpropCode);
        registerModifiedProperty("escapedDfpropCode");
        _escapedDfpropCode = escapedDfpropCode;
    }

    /**
     * [get] ESCAPED_DFPROP_NAME: {VARCHAR(20)} <br>
     * @return The value of the column 'ESCAPED_DFPROP_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getEscapedDfpropName() {
        checkSpecifiedProperty("escapedDfpropName");
        return _escapedDfpropName;
    }

    /**
     * [set] ESCAPED_DFPROP_NAME: {VARCHAR(20)} <br>
     * @param escapedDfpropName The value of the column 'ESCAPED_DFPROP_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEscapedDfpropName(String escapedDfpropName) {
        registerModifiedProperty("escapedDfpropName");
        _escapedDfpropName = escapedDfpropName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param escapedDfpropCode The value of the column 'ESCAPED_DFPROP_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingEscapedDfpropCode(String escapedDfpropCode) {
        setEscapedDfpropCode(escapedDfpropCode);
    }
}
