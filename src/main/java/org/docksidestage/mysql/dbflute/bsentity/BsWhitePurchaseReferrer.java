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
 * The entity of WHITE_PURCHASE_REFERRER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePurchaseReferrer extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} */
    protected Long _purchaseReferrerId;

    /** PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} */
    protected String _purchaseReferrerName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_purchase_referrer";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchaseReferrerId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (購入)PURCHASE by my PURCHASE_REFERRER_ID, named 'purchase'. */
    protected OptionalEntity<Purchase> _purchase;

    /**
     * [get] (購入)PURCHASE by my PURCHASE_REFERRER_ID, named 'purchase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'purchase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Purchase> getPurchase() {
        if (_purchase == null) { _purchase = OptionalEntity.relationEmpty(this, "purchase"); }
        return _purchase;
    }

    /**
     * [set] (購入)PURCHASE by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (NullAllowed)
     */
    public void setPurchase(OptionalEntity<Purchase> purchase) {
        _purchase = purchase;
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
        if (obj instanceof BsWhitePurchaseReferrer) {
            BsWhitePurchaseReferrer other = (BsWhitePurchaseReferrer)obj;
            if (!xSV(_purchaseReferrerId, other._purchaseReferrerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _purchaseReferrerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null && _purchase.isPresent())
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseReferrerId));
        sb.append(dm).append(xfND(_purchaseReferrerName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null && _purchase.isPresent())
        { sb.append(dm).append("purchase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePurchaseReferrer clone() {
        return (WhitePurchaseReferrer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} <br>
     * @return The value of the column 'PURCHASE_REFERRER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseReferrerId() {
        checkSpecifiedProperty("purchaseReferrerId");
        return _purchaseReferrerId;
    }

    /**
     * [set] PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} <br>
     * @param purchaseReferrerId The value of the column 'PURCHASE_REFERRER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseReferrerId(Long purchaseReferrerId) {
        registerModifiedProperty("purchaseReferrerId");
        _purchaseReferrerId = purchaseReferrerId;
    }

    /**
     * [get] PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PURCHASE_REFERRER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseReferrerName() {
        checkSpecifiedProperty("purchaseReferrerName");
        return _purchaseReferrerName;
    }

    /**
     * [set] PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br>
     * @param purchaseReferrerName The value of the column 'PURCHASE_REFERRER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseReferrerName(String purchaseReferrerName) {
        registerModifiedProperty("purchaseReferrerName");
        _purchaseReferrerName = purchaseReferrerName;
    }
}
