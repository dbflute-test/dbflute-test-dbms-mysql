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
package org.docksidestage.mysql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.mysql.dbflute.exentity.customize.*;

/**
 * The entity of VendorCheckIntegerSum.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheckIntegerSum extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INTEGER_NON_DIGIT_SUM: {DECIMAL(27)} */
    protected java.math.BigDecimal _integerNonDigitSum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.mysql.dbflute.bsentity.customize.dbmeta.VendorCheckIntegerSumDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "VendorCheckIntegerSum";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsVendorCheckIntegerSum) {
            BsVendorCheckIntegerSum other = (BsVendorCheckIntegerSum)obj;
            if (!xSV(_integerNonDigitSum, other._integerNonDigitSum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _integerNonDigitSum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_integerNonDigitSum));
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
    public VendorCheckIntegerSum clone() {
        return (VendorCheckIntegerSum)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INTEGER_NON_DIGIT_SUM: {DECIMAL(27)} <br>
     * @return The value of the column 'INTEGER_NON_DIGIT_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getIntegerNonDigitSum() {
        checkSpecifiedProperty("integerNonDigitSum");
        return _integerNonDigitSum;
    }

    /**
     * [set] INTEGER_NON_DIGIT_SUM: {DECIMAL(27)} <br>
     * @param integerNonDigitSum The value of the column 'INTEGER_NON_DIGIT_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIntegerNonDigitSum(java.math.BigDecimal integerNonDigitSum) {
        registerModifiedProperty("integerNonDigitSum");
        _integerNonDigitSum = integerNonDigitSum;
    }
}
