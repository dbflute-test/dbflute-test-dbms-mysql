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
 * The entity of WHITE_QUOTED_REF as TABLE. <br>
 * <pre>
 * [primary-key]
 *     WHERE
 * 
 * [column]
 *     WHERE, ORDER
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
 *     white_quoted
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteQuoted
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer where = entity.getWhere();
 * Integer order = entity.getOrder();
 * entity.setWhere(where);
 * entity.setOrder(order);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteQuotedRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WHERE: {PK, NotNull, INT(10)} */
    protected Integer _where;

    /** ORDER: {IX, INT(10), FK to white_quoted} */
    protected Integer _order;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_quoted_ref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_where == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_quoted by my ORDER, named 'whiteQuoted'. */
    protected OptionalEntity<WhiteQuoted> _whiteQuoted;

    /**
     * [get] white_quoted by my ORDER, named 'whiteQuoted'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteQuoted'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteQuoted> getWhiteQuoted() {
        if (_whiteQuoted == null) { _whiteQuoted = OptionalEntity.relationEmpty(this, "whiteQuoted"); }
        return _whiteQuoted;
    }

    /**
     * [set] white_quoted by my ORDER, named 'whiteQuoted'.
     * @param whiteQuoted The entity of foreign property 'whiteQuoted'. (NullAllowed)
     */
    public void setWhiteQuoted(OptionalEntity<WhiteQuoted> whiteQuoted) {
        _whiteQuoted = whiteQuoted;
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
        if (obj instanceof BsWhiteQuotedRef) {
            BsWhiteQuotedRef other = (BsWhiteQuotedRef)obj;
            if (!xSV(_where, other._where)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _where);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteQuoted != null && _whiteQuoted.isPresent())
        { sb.append(li).append(xbRDS(_whiteQuoted, "whiteQuoted")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_where));
        sb.append(dm).append(xfND(_order));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteQuoted != null && _whiteQuoted.isPresent())
        { sb.append(dm).append("whiteQuoted"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteQuotedRef clone() {
        return (WhiteQuotedRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WHERE: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'WHERE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhere() {
        checkSpecifiedProperty("where");
        return _where;
    }

    /**
     * [set] WHERE: {PK, NotNull, INT(10)} <br>
     * @param where The value of the column 'WHERE'. (basically NotNull if update: for the constraint)
     */
    public void setWhere(Integer where) {
        registerModifiedProperty("where");
        _where = where;
    }

    /**
     * [get] ORDER: {IX, INT(10), FK to white_quoted} <br>
     * @return The value of the column 'ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOrder() {
        checkSpecifiedProperty("order");
        return _order;
    }

    /**
     * [set] ORDER: {IX, INT(10), FK to white_quoted} <br>
     * @param order The value of the column 'ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrder(Integer order) {
        registerModifiedProperty("order");
        _order = order;
    }
}
