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
 * The entity of VENDOR_CONSTRAINT_NAME_AUTO_QUX as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorConstraintNameAutoQux extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _constraintNameAutoQuxId;

    /** CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)} */
    protected String _constraintNameAutoQuxName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_constraint_name_auto_qux";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_constraintNameAutoQuxId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param constraintNameAutoQuxName : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String constraintNameAutoQuxName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("constraintNameAutoQuxName");
        setConstraintNameAutoQuxName(constraintNameAutoQuxName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefList'. */
    protected List<VendorConstraintNameAutoRef> _vendorConstraintNameAutoRefList;

    /**
     * [get] VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefList'.
     * @return The entity list of referrer property 'vendorConstraintNameAutoRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorConstraintNameAutoRef> getVendorConstraintNameAutoRefList() {
        if (_vendorConstraintNameAutoRefList == null) { _vendorConstraintNameAutoRefList = newReferrerList(); }
        return _vendorConstraintNameAutoRefList;
    }

    /**
     * [set] VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefList'.
     * @param vendorConstraintNameAutoRefList The entity list of referrer property 'vendorConstraintNameAutoRefList'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        _vendorConstraintNameAutoRefList = vendorConstraintNameAutoRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorConstraintNameAutoQux) {
            BsVendorConstraintNameAutoQux other = (BsVendorConstraintNameAutoQux)obj;
            if (!xSV(_constraintNameAutoQuxId, other._constraintNameAutoQuxId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _constraintNameAutoQuxId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorConstraintNameAutoRefList != null) { for (VendorConstraintNameAutoRef et : _vendorConstraintNameAutoRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorConstraintNameAutoRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_constraintNameAutoQuxId));
        sb.append(dm).append(xfND(_constraintNameAutoQuxName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorConstraintNameAutoRefList != null && !_vendorConstraintNameAutoRefList.isEmpty())
        { sb.append(dm).append("vendorConstraintNameAutoRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorConstraintNameAutoQux clone() {
        return (VendorConstraintNameAutoQux)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoQuxId() {
        checkSpecifiedProperty("constraintNameAutoQuxId");
        return _constraintNameAutoQuxId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param constraintNameAutoQuxId The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoQuxId(Long constraintNameAutoQuxId) {
        registerModifiedProperty("constraintNameAutoQuxId");
        _constraintNameAutoQuxId = constraintNameAutoQuxId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_QUX_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getConstraintNameAutoQuxName() {
        checkSpecifiedProperty("constraintNameAutoQuxName");
        return _constraintNameAutoQuxName;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)} <br>
     * @param constraintNameAutoQuxName The value of the column 'CONSTRAINT_NAME_AUTO_QUX_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoQuxName(String constraintNameAutoQuxName) {
        registerModifiedProperty("constraintNameAutoQuxName");
        _constraintNameAutoQuxName = constraintNameAutoQuxName;
    }
}
