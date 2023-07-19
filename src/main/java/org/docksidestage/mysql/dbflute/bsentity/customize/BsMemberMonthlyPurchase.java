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
 * The entity of MemberMonthlyPurchase.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberMonthlyPurchase extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ID)MEMBER_ID: {INT(11), refers to member.MEMBER_ID} */
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {VARCHAR(180), refers to member.MEMBER_NAME} */
    protected String _memberName;

    /** PURCHASE_MONTH: {DATE(10)} */
    protected java.time.LocalDate _purchaseMonth;

    /** PURCHASE_PRICE_AVG: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _purchasePriceAvg;

    /** PURCHASE_PRICE_MAX: {INT(11)} */
    protected Integer _purchasePriceMax;

    /** PURCHASE_COUNT_ANY: {INT(11)} */
    protected Integer _purchaseCountAny;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.mysql.dbflute.bsentity.customize.dbmeta.MemberMonthlyPurchaseDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MemberMonthlyPurchase";
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
        if (obj instanceof BsMemberMonthlyPurchase) {
            BsMemberMonthlyPurchase other = (BsMemberMonthlyPurchase)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_purchaseMonth, other._purchaseMonth)) { return false; }
            if (!xSV(_purchasePriceAvg, other._purchasePriceAvg)) { return false; }
            if (!xSV(_purchasePriceMax, other._purchasePriceMax)) { return false; }
            if (!xSV(_purchaseCountAny, other._purchaseCountAny)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _purchaseMonth);
        hs = xCH(hs, _purchasePriceAvg);
        hs = xCH(hs, _purchasePriceMax);
        hs = xCH(hs, _purchaseCountAny);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_purchaseMonth));
        sb.append(dm).append(xfND(_purchasePriceAvg));
        sb.append(dm).append(xfND(_purchasePriceMax));
        sb.append(dm).append(xfND(_purchaseCountAny));
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
    public MemberMonthlyPurchase clone() {
        return (MemberMonthlyPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INT(11), refers to member.MEMBER_ID} <br>
     * 会員を識別するID。連番として基本的に自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。<br>
     * // grouping item
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INT(11), refers to member.MEMBER_ID} <br>
     * 会員を識別するID。連番として基本的に自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。<br>
     * // grouping item
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(180), refers to member.MEMBER_NAME} <br>
     * 会員のフルネームの名称。<br>
     * // non grouping item is allowed on MySQL-5.7
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(180), refers to member.MEMBER_NAME} <br>
     * 会員のフルネームの名称。<br>
     * // non grouping item is allowed on MySQL-5.7
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] PURCHASE_MONTH: {DATE(10)} <br>
     * // grouping item, depends on DBMS
     * @return The value of the column 'PURCHASE_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getPurchaseMonth() {
        checkSpecifiedProperty("purchaseMonth");
        return _purchaseMonth;
    }

    /**
     * [set] PURCHASE_MONTH: {DATE(10)} <br>
     * // grouping item, depends on DBMS
     * @param purchaseMonth The value of the column 'PURCHASE_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseMonth(java.time.LocalDate purchaseMonth) {
        registerModifiedProperty("purchaseMonth");
        _purchaseMonth = purchaseMonth;
    }

    /**
     * [get] PURCHASE_PRICE_AVG: {DECIMAL(14, 4)} <br>
     * // aggregation item
     * @return The value of the column 'PURCHASE_PRICE_AVG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPurchasePriceAvg() {
        checkSpecifiedProperty("purchasePriceAvg");
        return _purchasePriceAvg;
    }

    /**
     * [set] PURCHASE_PRICE_AVG: {DECIMAL(14, 4)} <br>
     * // aggregation item
     * @param purchasePriceAvg The value of the column 'PURCHASE_PRICE_AVG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchasePriceAvg(java.math.BigDecimal purchasePriceAvg) {
        registerModifiedProperty("purchasePriceAvg");
        _purchasePriceAvg = purchasePriceAvg;
    }

    /**
     * [get] PURCHASE_PRICE_MAX: {INT(11)} <br>
     * // me too
     * @return The value of the column 'PURCHASE_PRICE_MAX'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPurchasePriceMax() {
        checkSpecifiedProperty("purchasePriceMax");
        return _purchasePriceMax;
    }

    /**
     * [set] PURCHASE_PRICE_MAX: {INT(11)} <br>
     * // me too
     * @param purchasePriceMax The value of the column 'PURCHASE_PRICE_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchasePriceMax(Integer purchasePriceMax) {
        registerModifiedProperty("purchasePriceMax");
        _purchasePriceMax = purchasePriceMax;
    }

    /**
     * [get] PURCHASE_COUNT_ANY: {INT(11)} <br>
     * @return The value of the column 'PURCHASE_COUNT_ANY'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPurchaseCountAny() {
        checkSpecifiedProperty("purchaseCountAny");
        return _purchaseCountAny;
    }

    /**
     * [set] PURCHASE_COUNT_ANY: {INT(11)} <br>
     * @param purchaseCountAny The value of the column 'PURCHASE_COUNT_ANY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseCountAny(Integer purchaseCountAny) {
        registerModifiedProperty("purchaseCountAny");
        _purchaseCountAny = purchaseCountAny;
    }
}
