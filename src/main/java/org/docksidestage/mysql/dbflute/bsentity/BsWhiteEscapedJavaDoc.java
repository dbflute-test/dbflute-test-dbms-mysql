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
 * The entity of WHITE_ESCAPED_JAVA_DOC as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ESCAPED_JAVA_DOC_CODE
 * 
 * [column]
 *     ESCAPED_JAVA_DOC_CODE, ESCAPED_JAVA_DOC_NAME
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
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String escapedJavaDocCode = entity.getEscapedJavaDocCode();
 * String escapedJavaDocName = entity.getEscapedJavaDocName();
 * entity.setEscapedJavaDocCode(escapedJavaDocCode);
 * entity.setEscapedJavaDocName(escapedJavaDocName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteEscapedJavaDoc extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} */
    protected String _escapedJavaDocCode;

    /** ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} */
    protected String _escapedJavaDocName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_escaped_java_doc";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_escapedJavaDocCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of escapedJavaDocCode as the classification of EscapedJavaDocCls. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EscapedJavaDocCls getEscapedJavaDocCodeAsEscapedJavaDocCls() {
        return CDef.EscapedJavaDocCls.codeOf(getEscapedJavaDocCode());
    }

    /**
     * Set the value of escapedJavaDocCode as the classification of EscapedJavaDocCls. <br>
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEscapedJavaDocCodeAsEscapedJavaDocCls(CDef.EscapedJavaDocCls cdef) {
        setEscapedJavaDocCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of escapedJavaDocCode as First (FOO). <br>
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&amp;
     */
    public void setEscapedJavaDocCode_First() {
        setEscapedJavaDocCodeAsEscapedJavaDocCls(CDef.EscapedJavaDocCls.First);
    }

    /**
     * Set the value of escapedJavaDocCode as Second (BAR). <br>
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&amp;
     */
    public void setEscapedJavaDocCode_Second() {
        setEscapedJavaDocCodeAsEscapedJavaDocCls(CDef.EscapedJavaDocCls.Second);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of escapedJavaDocCode First? <br>
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&amp;
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedJavaDocCodeFirst() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null ? cdef.equals(CDef.EscapedJavaDocCls.First) : false;
    }

    /**
     * Is the value of escapedJavaDocCode Second? <br>
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&amp;
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedJavaDocCodeSecond() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null ? cdef.equals(CDef.EscapedJavaDocCls.Second) : false;
    }

    /**
     * /*IF pmb.yourGroup&#42;/&gt;&lt;&amp; <br>
     * The group elements:[First, Second]
     * @return The determination, true or false.
     */
    public boolean isEscapedJavaDocCode_LineGroup() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null && cdef.isLineGroup();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'escapedJavaDocCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEscapedJavaDocCodeName() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsWhiteEscapedJavaDoc) {
            BsWhiteEscapedJavaDoc other = (BsWhiteEscapedJavaDoc)obj;
            if (!xSV(_escapedJavaDocCode, other._escapedJavaDocCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _escapedJavaDocCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_escapedJavaDocCode));
        sb.append(dm).append(xfND(_escapedJavaDocName));
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
    public WhiteEscapedJavaDoc clone() {
        return (WhiteEscapedJavaDoc)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * @return The value of the column 'ESCAPED_JAVA_DOC_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getEscapedJavaDocCode() {
        checkSpecifiedProperty("escapedJavaDocCode");
        return _escapedJavaDocCode;
    }

    /**
     * [set] ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br>
     * @param escapedJavaDocCode The value of the column 'ESCAPED_JAVA_DOC_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setEscapedJavaDocCode(String escapedJavaDocCode) {
        checkClassificationCode("ESCAPED_JAVA_DOC_CODE", CDef.DefMeta.EscapedJavaDocCls, escapedJavaDocCode);
        registerModifiedProperty("escapedJavaDocCode");
        _escapedJavaDocCode = escapedJavaDocCode;
    }

    /**
     * [get] ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br>
     * @return The value of the column 'ESCAPED_JAVA_DOC_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getEscapedJavaDocName() {
        checkSpecifiedProperty("escapedJavaDocName");
        return _escapedJavaDocName;
    }

    /**
     * [set] ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br>
     * @param escapedJavaDocName The value of the column 'ESCAPED_JAVA_DOC_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEscapedJavaDocName(String escapedJavaDocName) {
        registerModifiedProperty("escapedJavaDocName");
        _escapedJavaDocName = escapedJavaDocName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param escapedJavaDocCode The value of the column 'ESCAPED_JAVA_DOC_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingEscapedJavaDocCode(String escapedJavaDocCode) {
        setEscapedJavaDocCode(escapedJavaDocCode);
    }
}
